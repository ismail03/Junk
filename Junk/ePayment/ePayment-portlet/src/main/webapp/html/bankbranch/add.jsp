<%@page import="com.stc.echannels.epayments.service.BankLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.Bank"%>
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
    List<PaymentChannel> channels = PaymentChannelLocalServiceUtil.getPaymentChannels();
    List<Bank> banks = BankLocalServiceUtil.getBanks();
    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= branch %>" model="<%= BankBranch.class %>" />
<portlet:renderURL var="viewBankURL" ></portlet:renderURL>
<portlet:actionURL name="addBankBranch" var="addBranchURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewBankURL %>"
    title='<%= LanguageUtil.get(portletConfig, locale, "add-bank-branch") %>'
/>


<liferay-ui:error key="duplicate-branch-code" message="duplicate-branch-code" />

<aui:form action="<%= addBranchURL %>" method="POST" name="fm">
    <aui:fieldset>
   
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />
        <aui:input name="error" type="hidden" value="<%= redirect %>" />
         <aui:column first="true" columnWidth="35">
         <aui:select name="bankId" required="true" errorMessage="field-required" label="bank-name-en">
         <aui:option label="select-bank" value="" /> 
        	<% for (Bank bn: banks) { %>
        		<aui:option label="<%=bn.getNameEn()%>" value="<%=bn.getBankId() %>" /> 
			<% } %>
        </aui:select>
       
        <aui:select name="channelId" required="true" label="channel-name-en">
        	<aui:option label="select-payment-channel-type" value="" /> 
        	<% for (PaymentChannel pc: channels) { %>
        		<aui:option label="<%=pc.getDescriptiveNameEn() %>" value="<%=pc.getChannelId() %>" /> 
			<% } %>
        </aui:select>
        <liferay-ui:error key="duplicate-payment-channel" message="duplicate-payment-channel" />

        <aui:input label="stc-branch-code" name="stcBranchCode" type="text">
          	<aui:validator name="required" errorMessage="field-required" />
        	<aui:validator name="digits" errorMessage="must-be-digits" />
        </aui:input>
         </aui:column>
        
    </aui:fieldset>

    <aui:button-row>
       <aui:button onClick="<%= viewBankURL%>"  type="cancel" />
        <aui:button type="submit" />

    </aui:button-row>
</aui:form>

<aui:script>

$( document ).ready(function() {
	$('#<portlet:namespace />fm')
	.each(function(){
	    $(this).data('serialized', $(this).serialize())
	})
	.on('change input', function(){
	    $(this)             
	        .find('input:submit, button:submit')
	            .attr('disabled', $(this).serialize() == $(this).data('serialized'))
	    ;
	 })
	.find('input:submit, button:submit')
	    .attr('disabled', true)
	;

});

</aui:script>
