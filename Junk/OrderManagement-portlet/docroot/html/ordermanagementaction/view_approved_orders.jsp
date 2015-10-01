<%@page import="com.liferay.practical.model.Orders"%>
<%@page import="com.liferay.practical.service.OrdersLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowDefinitionManagerUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="init.jsp"%>
 <!--  approved orders shown in search container -->
<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/html/workflow/view_pending_orders.jsp" />
</liferay-portlet:renderURL>

<liferay-ui:search-container emptyResultsMessage="there-are-no-Approved-orders"
headerNames="productname productpackage,Status"
iteratorURL="<%=iteratorURL %>"
delta="10"
deltaConfigurable="true">
<liferay-ui:search-container-results>
<%
List<Orders> ordersList=OrdersLocalServiceUtil.findBypendingorders(themeDisplay.getScopeGroupId(),WorkflowConstants.STATUS_APPROVED);
results=ListUtil.subList(ordersList,searchContainer.getStart(), searchContainer.getEnd());
searchContainer.setTotal(ordersList.size());
searchContainer.setResults(results);
%>
</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="Orders"
keyProperty="orderid" modelVar="orders">
<liferay-ui:search-container-column-text 
name="Product name" property="productname" />
<liferay-ui:search-container-column-text 
name="Product package" property="productpackage" />
<liferay-ui:search-container-column-text name="status"><%=WorkflowConstants.LABEL_APPROVED %></liferay-ui:search-container-column-text>
</liferay-ui:search-container-row>
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>"/>
</liferay-ui:search-container>
