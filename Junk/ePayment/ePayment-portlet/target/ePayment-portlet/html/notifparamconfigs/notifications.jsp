
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
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
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
long serviceId = ParamUtil.getLong(renderRequest, "serviceId",0l);
int count = NotifConfigLocalServiceUtil.findByServiceId(serviceId,-1,-1).size();
%>

<liferay-portlet:renderURL varImpl="iteratorURL">
    <liferay-portlet:param name="mvcPath" value="/html/notifparamconfigs/notifications.jsp" />
    <liferay-portlet:param name="serviceId" value="<%=String.valueOf(serviceId) %>" />
</liferay-portlet:renderURL>
<portlet:renderURL var="viewNotifURL" ></portlet:renderURL>
<liferay-ui:header
    backURL="<%= viewNotifURL %>"
    title='<%= LanguageUtil.get(portletConfig, locale, "view-notifications") %>'
/>


<liferay-ui:search-container  iteratorURL="<%= iteratorURL %>" emptyResultsMessage="no-record-to-display" delta="5" deltaConfigurable="true"  total="<%= count %>">
   
    <liferay-ui:search-container-results  results="<%=NotifConfigLocalServiceUtil.findByServiceId(serviceId,searchContainer.getStart(), searchContainer.getEnd()) %>">  
</liferay-ui:search-container-results> 

    <liferay-ui:search-container-row
        className="com.stc.echannels.epayments.model.NotifConfig"
        keyProperty="transId"
        modelVar="notifConfig" escapedModel="<%= true %>"
    >
    
    	<liferay-ui:search-container-column-text
            name="notif-name"
            value='<%= notifConfig.getNotifName() %>'
        />
           <liferay-ui:search-container-column-text
            name="notif-msg-ar"
            value='<%= notifConfig.getArMsgWithParams() %>'
        />
        <liferay-ui:search-container-column-text
            name="notif-msg-en"
            value='<%= notifConfig.getEnMsgWithParams() %>'
        />
      

        <liferay-ui:search-container-column-text
            name="notif_enable"
            value="<%= notifConfig.getEnabled() %>"
        />
         <%
           StringBuilder notifParameters = new StringBuilder();
   		   if (notifConfig.getParam1()!=null && !notifConfig.getParam1().isEmpty())
   		   {
   			   notifParameters.append(String.valueOf( notifConfig.getParam1()));
   			   
   		   }
   		   if (notifConfig.getParam2()!=null  && !notifConfig.getParam2().isEmpty())
   		  {   notifParameters.append(System.getProperty("line.separator"));
   			   notifParameters.append(String.valueOf( notifConfig.getParam2()));
   		   }
 		   if (notifConfig.getParam3()!=null  && !notifConfig.getParam3().isEmpty())
 		  {    notifParameters.append(System.getProperty("line.separator"));
   			   notifParameters.append(String.valueOf( notifConfig.getParam3()));
   		   }
   		   if (notifConfig.getParam4()!=null  && !notifConfig.getParam4().isEmpty())
   		  {notifParameters.append(System.getProperty("line.separator"));
   			   notifParameters.append(String.valueOf( notifConfig.getParam4()));
   		   }
   		   if (notifConfig.getParam5()!=null  && !notifConfig.getParam5().isEmpty())
   		  {notifParameters.append(System.getProperty("line.separator"));
   			   notifParameters.append(String.valueOf( notifConfig.getParam5()));
   			  
   		   }
           %> 

   	<%-- 	<liferay-ui:search-container-column-text
            name="notif_param"
            value='<%=notifParameters.toString()%>'
        />  --%>

             <liferay-ui:search-container-column-jsp
    align="right"
    path="/html/notifparamconfigs/notif_actions.jsp"
/>


    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>