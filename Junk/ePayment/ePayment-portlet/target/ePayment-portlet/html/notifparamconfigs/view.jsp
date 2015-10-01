
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.stc.echannels.epayments.service.NotifParamLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.stc.echannels.epayments.model.NotifConfig"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.BusinessSrv"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<% 
List<NotifConfig> notifications=new ArrayList<NotifConfig>();

PortletPreferences prefs = renderRequest.getPreferences(); 
 
//String serviceId= renderRequest.getParameter("serviceId");
long serviceId=ParamUtil.getLong(renderRequest,"serviceId",0l);

//long serviceId = 0;//Long.parseLong(renderRequest.getParameter("serviceId"));//ParamUtil.getLong(request,"serviceId");

    List<BusinessSrv> services = BusinessSrvLocalServiceUtil.getBusinessServices();


    
%>

<portlet:renderURL  var="viewSysConfigURL" >
	<portlet:param name="mvcPath" value="/html/notifparamconfigs/notifications.jsp" />
</portlet:renderURL>

<liferay-ui:error key="paramterNumberDefers" message="params-total-defers" />
<liferay-ui:error key="paramterDefers" message="not-same-parameters" />

<aui:form action="<%= viewSysConfigURL %>" method="POST" name="fm" >
    <aui:fieldset>
     	<aui:column first="true" columnWidth="35">
            <aui:select name="serviceId" id="businessService" onChange="submitForm()">
			<aui:option label="access-control-select-biz-service" value="" />
        	<% for (BusinessSrv bs: services) { 
        	if(serviceId== bs.getServiceId()){
        	%>
        	<aui:option label="<%=bs.getName(locale)%>"  value="<%=bs.getServiceId() %>" selected="true" />
        	<%}else{ %>
        		<aui:option label="<%=bs.getName(locale)%>" value="<%=bs.getServiceId() %>" /> 
			<%} 
			} %>
        </aui:select>
	</aui:column>
    </aui:fieldset>
</aui:form>

<script type="text/javascript">


function submitForm(){
	
	var serviceType = $("#<portlet:namespace />businessService");
	if(serviceType.val()==''){
		return false;
	}else{
		document.<portlet:namespace />fm.submit();
	}
}


</script>