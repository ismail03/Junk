<%@page import="com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.PaymentSystem"%>

<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%
    PaymentSystem system = null;

    long systemId = ParamUtil.getLong(request, "systemId");

    if (systemId > 0) {
    	system = PaymentSystemLocalServiceUtil.getPaymentSystem(systemId);
    }

    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= system %>" model="<%= PaymentSystem.class %>" />
<portlet:renderURL var="viewPaymentSystemURL" />
<portlet:actionURL name='<%= system == null ? "addSystem" : "updateSystem" %>' var="editSystemURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewPaymentSystemURL %>"
    title='<%= (system != null) ? system.getSystemName() : LanguageUtil.get(portletConfig, locale, "new-payment-system") %>'
/>

<aui:form action="<%= editSystemURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="systemId" type="hidden" value='<%= system == null ? "" : system.getPaymentSystemId() %>'/>

        <aui:input name="systemName" type="text" value='<%= system == null ? "" : system.getSystemName() %>' />

        <aui:input name="dateFormat"  type="text" value='<%= system == null ? "" : system.getDateFormat() %>'/>

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewPaymentSystemURL%>"  type="cancel" />
    </aui:button-row>
</aui:form>