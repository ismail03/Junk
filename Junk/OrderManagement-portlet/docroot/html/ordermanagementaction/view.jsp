<%@ include file="init.jsp"%>
<%
String tabs1 = ParamUtil.getString(request, "tabs1", "Orders Approved");
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tabs1", tabs1);
%>
<portlet:renderURL var="addordersBackURL">
<portlet:param name="mvcPath" value="/html/ordermanagementaction/orders.jsp"/>
</portlet:renderURL>
<h4> workflow for Orders</h4>
<a href="<%=addordersBackURL%>" style="font-weight:bold;font-size:18px;">Place New Order</a><br/><br/>
<liferay-ui:tabs
	names="Orders Approved,Orders Pending"
	portletURL="<%= portletURL %>"
/>
<c:choose>
	<c:when test='<%= tabs1.equals("Orders Pending") %>'>
		<liferay-util:include page="/html/ordermanagementaction/view_pending_orders.jsp" servletContext="<%= application %>" />
	</c:when>
	<c:otherwise>
		
		<liferay-util:include page="/html/ordermanagementaction/view_approved_orders.jsp" servletContext="<%= application %>" />
	</c:otherwise>
</c:choose>