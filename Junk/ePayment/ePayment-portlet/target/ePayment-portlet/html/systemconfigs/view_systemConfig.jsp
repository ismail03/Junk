<%@page import="com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.util.PortalUtil" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<div class="results"></div>


<aui:button-row>
    <portlet:renderURL var="saveConfigURL">
        <portlet:param name="mvcPath" value="/html/systemconfigs/save_config.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= saveConfigURL.toString() %>" value="button-save" />
</aui:button-row>


<aui:script use="aui-datatable">
	var columns = <%=renderRequest.getParameter("columns")%>;
	var data = <%=renderRequest.getParameter("data") %>;
	
	if (data) {
		new A.DataTable({
			columns: columns,
			data: data}
		).render("#results");
	}	
</aui:script>