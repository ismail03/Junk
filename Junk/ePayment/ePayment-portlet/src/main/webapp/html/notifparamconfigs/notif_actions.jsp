<%@page import="com.stc.echannels.epayments.model.NotifConfig"%>
<%@page import="com.stc.echannels.epayments.model.Bank"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>


<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request
            .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    NotifConfig notifConfig = (NotifConfig) row.getObject();

    String transId = notifConfig.getTransId();
    long notifId = notifConfig.getNotifId();
    long serviceId=notifConfig.getServiceId();
    String name = NotifConfig.class.getName();
   

    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editURL">
        <portlet:param name="mvcPath" value="/html/notifparamconfigs/edit_notif.jsp" />
        <portlet:param name="transId" value="<%=transId%>" />
        <portlet:param name="notifId" value="<%=String.valueOf(notifId)%>" />
        <portlet:param name="serviceId" value="<%=String.valueOf(serviceId)%>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />

    

    
</liferay-ui:icon-menu>