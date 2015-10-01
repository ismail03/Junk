<%@page import="com.stc.echannels.epayments.service.NotifParamLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.CardGroupLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.CardGroup"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="com.stc.echannels.epayments.model.*"%>
<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
    NotifConfig notifConfig = null;

	
	List<BusinessSrv> services = BusinessSrvLocalServiceUtil.getBusinessServices();

    String transId = ParamUtil.getString(request, "transId");
	long serviceId = ParamUtil.getLong(request, "serviceId");
	long notifId = ParamUtil.getLong(request, "notifId");
	
    notifConfig = NotifConfigLocalServiceUtil.getNotifConfig(notifId);
 
    List<NotifParam> notifParams = NotifParamLocalServiceUtil.getNotifParams(serviceId);

    String redirect = ParamUtil.getString(request, "redirect");
%>
 <script src="//code.jquery.com/jquery-1.10.0.min.js"></script>
<script src="//code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

<%-- <aui:model-context bean="<%= notifConfig %>" model="<%= NotifConfig.class %>" /> --%>
<portlet:renderURL var="viewNotifConfigURL" > 
	<portlet:param name="serviceId" value="<%=String.valueOf(notifConfig.getServiceId()) %>"/> 
	<portlet:param name="mvcPath" value="/html/notifparamconfigs/notifications.jsp" />
</portlet:renderURL>
<portlet:actionURL name="saveNotification"  var="editNotifConfigURL" windowState="normal" >
	<portlet:param name="mvcPath" value="/html/notifparamconfigs/view.jsp" />
</portlet:actionURL>

<liferay-ui:header
    backURL="<%= viewNotifConfigURL %>"
    title='<%=  LanguageUtil.get(portletConfig, locale, "edit-notification")%>'
/>

<liferay-ui:error key="paramterNumberDefers" message="params-total-defers" />
<liferay-ui:error key="paramterDefers" message="not-same-parameters" />

<aui:form action="<%= editNotifConfigURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />
		<aui:input name="transId" type="hidden" value='<%=notifConfig.getTransId() %>'/>
		<aui:input name="serviceId" type="hidden" value='<%=notifConfig.getServiceId() %>'/>
		<aui:input name="notifId" type="hidden" value='<%=notifConfig.getNotifId() %>'/>
		<aui:input name="notifName" type="hidden" value='<%=notifConfig.getNotifName() %>'/>
		<aui:input name="notifParam1" type="hidden"  value="<%=notifConfig.getParam1() %>"/>
		<aui:input name="notifParam2" type="hidden"  value="<%=notifConfig.getParam2() %>"/>
		<aui:input name="notifParam3" type="hidden"  value="<%=notifConfig.getParam3() %>"/>
		<aui:input name="notifParam4" type="hidden"  value="<%=notifConfig.getParam4() %>"/>
		<aui:input name="notifParam5" type="hidden"  value="<%=notifConfig.getParam5() %>"/>
		<liferay-ui:error key="tooManyParamsEn" message="too-many-params" />
		<liferay-ui:error key="invalidParamsEn" message="too-many-params" />
        <aui:input label="notif-msg-en" name="msgEn" id="msgEn" type="textarea"  value="<%=notifConfig.getEnMsgWithParams() %>" onKeyPress="showParamsDdl('_notifparamconfigs_WAR_ePaymentportlet_msgEn')"/> 
        
		<liferay-ui:error key="tooManyParamsAr" message="too-many-params" />
		<liferay-ui:error key="invalidParamsAr" message="too-many-params" />
        <aui:input label="notif-msg-ar" name="msgAr" id="msgAr" type="textarea"  value="<%=notifConfig.getArMsgWithParams() %>" onKeyPress="showParamsDdl('_notifparamconfigs_WAR_ePaymentportlet_msgAr')"/>
        
		
        
        <aui:input name="enabled" type="checkbox" value="<%= notifConfig.getEnabled()%>"/>


    </aui:fieldset>

    <aui:button-row>
    
    <aui:button onClick="<%= viewNotifConfigURL %>"  type="cancel" />
        <aui:button type="submit" />

        
    </aui:button-row>
</aui:form>





<script>
var current;
var currentIndex=0;

var element;
var topPos;

function showParamsDdl(id)
{
	
                
				if (event.which == 123 || event.charCode == 123)
				{
					
                	topPos=$('#'+id).offset().top;
                	
                                                current = $(event.target);;
                                               
                                                $(".custom-combobox-input").focus();
                                                update(id);
                }
}
  function update(id) {
	  							
                                 element= document.getElementById(id);
                                 currentIndex= element.selectionEnd;
                                
                                                var coordinates = getCaretCoordinates(element, element.selectionEnd);
                                                console.log('(top, left) = (%s, %s)', topPos, coordinates.left);
                                                $("#paramsList").css({"margin-left":coordinates.left+20+ 'px', "top":topPos-43+'px'})
                                                $("#paramsList").show().focus();
                                               
                                  }
                               

$(document).ready(function(){
		// Calling the combobox autocomplete function
		
		 $( "#_notifparamconfigs_WAR_ePaymentportlet_combobox" ).combobox();
	
$(".ui-autocomplete").on("click", function () {
	   //alert(current.val());
		//alert(current.val().substr(0,currentIndex+1) + ($(".custom-combobox-input").val().replace(/^\s\s*/, '').replace(/\s\s*$/, ''))+current.val().substr(currentIndex+2)+"} ");
	   //alert(current.val().substr(0,currentIndex+1));
		//alert(($(".custom-combobox-input").val().replace(/^\s\s*/, '').replace(/\s\s*$/, '')));
	   //alert(current.val().substr(currentIndex+2));
	   if((navigator.userAgent.indexOf("MSIE") != -1 ) || (!!document.documentMode == true )){
		  // alert(current.val().substr(0,currentIndex));
		  // alert("{"+($(".custom-combobox-input").val().replace(/^\s\s*/, '').replace(/\s\s*$/, ''))+"} ");
		   //alert(current.val().substr(currentIndex));
		   var content = current.val().substr(0,currentIndex) + "{"+($(".custom-combobox-input").val().replace(/^\s\s*/, '').replace(/\s\s*$/, ''))+"} "+current.val().substr(currentIndex);
	   }else{
		var content = current.val().substr(0,currentIndex+1) + ($(".custom-combobox-input").val().replace(/^\s\s*/, '').replace(/\s\s*$/, ''))+"} "+current.val().substr(currentIndex+2);
		//current.val()+($(".custom-combobox-input").val().replace(/^\s\s*/, '').replace(/\s\s*$/, ''))+"} ";
           }
		//alert(content);
		current.focus().val('').val(content);
			$(".custom-combobox-input").val('');
			$("#paramsList").hide();	
});
	
});



</script>

<div id="paramsList" style="display:none;">
<h3><i class="fa fa-search-plus"></i><%= LanguageUtil.get(portletConfig, locale, "select-parameter") %></h3>
                   <div class="list_cont">
           <aui:select name="notifParam" cssClass="combobox" id="combobox" label="">
        	<% for (NotifParam np: notifParams) { %>
        		<aui:option label="<%=np.getParamName() %>" value="<%=np.getParamName() %>" /> 
			<% } %>
        </aui:select>
        </div>
</div>