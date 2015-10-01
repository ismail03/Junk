<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.BusinessSrv"%>

<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
    BusinessSrv service = null;

    long serviceId = ParamUtil.getLong(request, "serviceId");

    if (serviceId > 0) {
    	service = BusinessSrvLocalServiceUtil.fetchBusinessSrv(serviceId);
    }

    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= service %>" model="<%= BusinessSrv.class %>" />
<portlet:renderURL var="viewBusinessServiceURL" />
<portlet:actionURL name="addService" var="editServiceURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewBusinessServiceURL %>"
    title='<%= (service != null) ? service.getName(locale) : LanguageUtil.get(portletConfig, locale, "new-business-service") %>'
/>

<aui:form action="<%= editServiceURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="serviceId" type="hidden" value='<%= service == null ? "" : service.getServiceId()%>'/>
		
        <aui:input name="nameAr" type="text" value='<%= service == null ? "" : service.getServiceNameAr() %>' />
        <aui:input name="nameEn" type="text" value='<%= service == null ? "" : service.getServiceNameEn() %>' />

       

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewBusinessServiceURL%>"  type="cancel" />
    </aui:button-row>
</aui:form>