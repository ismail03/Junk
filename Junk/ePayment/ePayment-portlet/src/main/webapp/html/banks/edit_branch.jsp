<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.BankBranch"%>
<%@page import="com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.PaymentSystem"%>

<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />
<%
    BankBranch branch = null;

    String bankId = ParamUtil.getString(request, "bankId");

    List<PaymentChannel> channels = PaymentChannelLocalServiceUtil.getPaymentChannels();

    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= branch %>" model="<%= BankBranch.class %>" />
<portlet:renderURL var="viewBankURL" >
 <portlet:param name="bankId" value="<%= String.valueOf(bankId) %>" />
</portlet:renderURL>
<portlet:actionURL name="addBankBranch" var="editBranchURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewBankURL %>"
    title='<%= LanguageUtil.get(portletConfig, locale, "new-branch") %>'
/>

<liferay-ui:error key="duplicate-payment-channel" message="duplicate-payment-channel" />
<liferay-ui:error key="duplicate-branch-code" message="duplicate-branch-code" />

<aui:form action="<%= editBranchURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />
        <aui:input name="error" type="hidden" value="<%= redirect %>" />

        <aui:input label="bank-sama-code" name="bankId" type="hidden" value='<%= String.valueOf(bankId) %>'/>

        <aui:input label="bank-stc-code" name="stcBranchCode" type="text">
          	<aui:validator name="required" errorMessage="field-required" />
        	<aui:validator name="digits" errorMessage="must-be-digits" />
        </aui:input>
        

            <aui:select name="channelId">
        	<% for (PaymentChannel pc: channels) { %>
        		<aui:option label="<%=pc.getName(locale) %>" value="<%=pc.getChannelId() %>" /> 
			<% } %>
        </aui:select>

    </aui:fieldset>

    <aui:button-row>
       <aui:button onClick="<%= viewBankURL%>"  type="cancel" />
        <aui:button type="submit" />

    </aui:button-row>
</aui:form>