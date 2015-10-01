<%@page import="com.liferay.practical.model.Orders"%>

<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>

<%@ include file="init.jsp"%>
<%
Orders orders=null;
if(request.getAttribute("ordersObject")!=null)
	orders = (Orders)request.getAttribute("ordersObject");
%>
<c:if test='<%=orders!=null%>'>
<h2><%=orders.getProductname()%></h2>
<br/>
Message:
<div>
<%=orders.getProductpackage()%>
</div>
</c:if>