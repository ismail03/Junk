<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ include file="init.jsp"%>
<portlet:actionURL var="submitOrderBack" windowState="<%=LiferayWindowState.NORMAL.toString()%>" name="submitorder">
</portlet:actionURL>
<a href="<portlet:renderURL />">&laquo;Home</a>
<div class="separator"></div>
<fieldset>
    <legend>Order Form</legend>
<c:if test='<%= SessionMessages.contains(renderRequest.getPortletSession(),"orders-submit-success")%>'>
<liferay-ui:success key="orders-submit-success" message="order has been submited successfully." />
</c:if>
<c:if test='<%= SessionMessages.contains(renderRequest.getPortletSession(),"workflow-not-enabled")%>'>
<liferay-ui:success key="workflow-not-enabled" message="orders not enabled with workflow please enable workflow." />
</c:if>
<c:if test='<%= SessionErrors.contains(renderRequest.getPortletSession(),"orders-submit-failed")%>'>
<liferay-ui:success key="orders-submit-failed" message="There is problem of submit orders please try again.." />
</c:if>
<aui:form action="<%=submitOrderBack%>" method="post" name="orderbackForm" enctype="multipart/form-data">
<aui:layout>
		<aui:column>
			<aui:input 	label="Product Name" name="productname" id="productname" type="text" >
			<aui:validator name="required" />
			</aui:input>
			<aui:input 	label="Product Package" name="productpackage" id="productpackage" type="text" >
			<aui:validator name="required" />
			</aui:input>
			
			
			<aui:input 	label="Subscription" name="subscription" id="subscription" type="text" >
			<aui:validator name="required" />
			
				</aui:input>
				
				   <aui:input type="file" name="file-to-upload" label="upload Document" />
		</aui:column>
</aui:layout>


<aui:layout>
		<aui:column>
			&nbsp;
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			<aui:button type="submit" value="Submit Feedback" name="submit"
				></aui:button>
		</aui:column>
</aui:layout>
</aui:form>
</fieldset>

