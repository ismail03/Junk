<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.stc.echannels.epayments.service.BusinessServiceLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.CardGroupLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.CardGroup"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="com.stc.echannels.epayments.model.*"%>
<liferay-theme:defineObjects />

<portlet:defineObjects />
<%
    CardGroup cardGroup = null;

	//List<PaymentSystem> systems = PaymentSystemLocalServiceUtil.getPaymentSystems(QueryUtil.ALL_POS,QueryUtil.ALL_POS);
	List<BusinessService> services = BusinessServiceLocalServiceUtil.getBusinessServices();

    String transId = ParamUtil.getString(request, "transId");

    if (transId!=null && !"".equals(transId)) {
        cardGroup = CardGroupLocalServiceUtil.getCardGroup(transId);
    }

    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= cardGroup %>" model="<%= CardGroup.class %>" />
<portlet:renderURL var="viewCardGroupURL" />
<portlet:actionURL name='<%= cardGroup == null ? "addCardGroup" : "updateCardGroup" %>' var="editCardGroupURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewCardGroupURL %>"
    title='<%= (cardGroup != null) ? cardGroup.getCardGroupId() : LanguageUtil.get(portletConfig, locale, "new-card-group") %>'
/>

<liferay-ui:error key="duplicate-card-value" message="duplicate-card-value" />
<liferay-ui:error key="duplicate-card-group" message="duplicate-card-group" />

<aui:form action="<%= editCardGroupURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

		<aui:input name="transId" type="hidden" value='<%= cardGroup == null ? "" : cardGroup.getTransId() %>'/>
		
        <aui:input name="cardGroupId" type="text" value='<%= cardGroup == null ? "" : cardGroup.getCardGroupId() %>'>
        	<aui:validator name="required" errorMessage="field-required" />
        </aui:input>

        <aui:input name="cardValue" type="text" value='<%= cardGroup == null ? "" : cardGroup.getCardValue() %>'>
        	<aui:validator name="required" errorMessage="field-required" />
        	<aui:validator name="digits" errorMessage="must-be-digits" />
        </aui:input>

        <aui:input name="promotionValue"  type="text" value='<%= cardGroup == null ? "" : cardGroup.getPromotionValue() %>'>
        	<aui:validator name="required" errorMessage="field-required" />
        	<aui:validator name="digits" errorMessage="must-be-digits" />
        </aui:input>
		
		<aui:input name="inPaymentSystem"  type="text" value='<%= cardGroup == null ? "" : cardGroup.getInPaymentSystem() %>'>
	    	<aui:validator name="required" errorMessage="field-required" />
    	</aui:input>
  

        <aui:select name="serviceId">
        	<% for (BusinessService bs: services) { %>
        		<aui:option label="<%=bs.getName(locale) %>" value="<%=bs.getServiceId() %>" /> 
			<% } %>
        </aui:select>
       
        

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewCardGroupURL %>"  type="cancel" />
        
    </aui:button-row>
</aui:form>