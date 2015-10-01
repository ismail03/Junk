<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="com.stc.echannels.epayments.model.*"%>
<%@ page import="com.stc.echannels.epayments.service.CardGroupLocalServiceUtil"%>


<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
    <portlet:renderURL var="addCardGroupURL">
        <portlet:param name="mvcPath" value="/html/cardgroups/edit_cardGroup.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addCardGroupURL.toString() %>" value="add-cardGroup" />
<!-- 
    <portlet:renderURL var="addPaymentSystemURL">
   		<portlet:param name="mvcPath" value="/html/paymentsystems/edit_paymentSystem.jsp" />
   		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>
	<aui:a href="<%= addPaymentSystemURL.toString() %>">
		<liferay-ui:message key="add-payment-system"/>
	</aui:a>
	
	 <portlet:renderURL var="addServiceURL">
   		<portlet:param name="mvcPath" value="/html/businessservices/edit_businessService.jsp" />
   		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>
	<aui:a href="<%= addServiceURL.toString() %>">
		<liferay-ui:message key="add-business-service"/>
	</aui:a>
 -->
</aui:button-row>
<liferay-ui:search-container emptyResultsMessage="There are no Card Groups to display">
    <liferay-ui:search-container-results
        results="<%= CardGroupLocalServiceUtil.getCardGroups() %>"
        total="<%= CardGroupLocalServiceUtil.getCardGroups().size()%>"
    />

    <liferay-ui:search-container-row
        className="com.stc.echannels.epayments.model.CardGroup"
        keyProperty="cardGroupId"
        modelVar="cardGroup" escapedModel="<%= true %>"
    >
        <liferay-ui:search-container-column-text
            name="card-group-id"
            value='<%= cardGroup.getCardGroupId() %>'
        />

        <liferay-ui:search-container-column-text
            name="card-value"
            value="<%= String.valueOf(cardGroup.getCardValue()) %>"
        />
   		<liferay-ui:search-container-column-text
            name="promotion-value"
            value="<%= String.valueOf(cardGroup.getPromotionValue()) %>"
        />
        <liferay-ui:search-container-column-text
            name="in-payment-system"
            value="<%= String.valueOf(cardGroup.getInPaymentSystem()) %>"
        />
      
        <liferay-ui:search-container-column-text
            name="business-service"
            value='<%= BusinessServiceLocalServiceUtil.fetchBusinessService(cardGroup.getServiceId()).getName(locale)%>'
        />

      <liferay-ui:search-container-column-jsp
    align="right"
    path="/html/cardgroups/cardGroup_actions.jsp"
/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
