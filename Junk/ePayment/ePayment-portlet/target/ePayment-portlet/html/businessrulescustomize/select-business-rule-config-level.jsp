<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page
	import="com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page import="com.stc.echannels.epayments.model.PaymentRule"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ page import="com.stc.echannels.epayments.model.*"%>

<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="com.stc.echannels.epayments.enums.BusinessRuleConfigLevel" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	final Long ruleId = ParamUtil.getLong(request, "ruleId");
	final String ruleName = ParamUtil.getString(request, "ruleName");
	final String ruleCategory = ParamUtil.getString(request, "ruleCategory");
	final String ruleDescription = ParamUtil.getString(request, "ruleDescription");
	final String ruleDefaultValue = ParamUtil.getString(request, "ruleDefaultValue");
	final String newValue = ParamUtil.getString(request, "newValue");
	final String serviceTypeName = ParamUtil.getString(request, "serviceTypeName");
	final String serviceTypeId = ParamUtil.getString(request, "serviceTypeId");
	
	final PortletURL viewBusinessRuleConfigURL = renderResponse.createRenderURL();
	final String redirect = PortalUtil.getCurrentURL(renderRequest);
	
	
	final PortletURL headerBackURL = renderResponse.createRenderURL();
	headerBackURL.setParameter("ruleId",""+ruleId);
	headerBackURL.setParameter("ruleName",ruleName);
	headerBackURL.setParameter("ruleCategory",ruleCategory);
	headerBackURL.setParameter("ruleDescription",ruleDescription);
	headerBackURL.setParameter("ruleDefaultValue",ruleDefaultValue);
	headerBackURL.setParameter("newValue",newValue);
	headerBackURL.setParameter("serviceTypeName",serviceTypeName);
	headerBackURL.setParameter("serviceTypeId",serviceTypeId);
	headerBackURL.setParameter("mvcPath","/html/businessrulescustomize/add-new-value.jsp");
	
%>

<aui:script>
	function switchURLAndSubmit(){
		var urlToSubmit = "";
		var confLevels = document.<portlet:namespace />fm.<portlet:namespace />selectConfigLevel;
		var confLevelValue;
		for(var i = 0; i < confLevels.length; i++){
		    if(confLevels[i].checked){
		    	confLevelValue = confLevels[i].value;
		    }
		}
		if(confLevelValue=="PAYMENT_METHOD" ){
			urlToSubmit = document.<portlet:namespace />fm.<portlet:namespace />hiddenPaymentMethodURL.value;
		}
		if(confLevelValue=="PAYMENT_CHANNEL" ){
			urlToSubmit = document.<portlet:namespace />fm.<portlet:namespace />hiddenPaymentChannelURL.value;
		}
		if(confLevelValue=="BUSINESS_SERVICE" ){
			urlToSubmit = document.<portlet:namespace />fm.<portlet:namespace />hiddenBusinessServiceURL.value;
		}
		
		if(urlToSubmit!=""){
			document.<portlet:namespace />fm.action=urlToSubmit;
			document.<portlet:namespace />fm.submit();
		}
	}
</aui:script>

<portlet:renderURL var="hiddenPaymentMethodURL">
	<portlet:param name="mvcPath" value="/html/businessrulescustomize/view-payment-method.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="hiddenBusinessServiceURL">
	<portlet:param name="mvcPath" value="/html/businessrulescustomize/view-business-service.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="hiddenPaymentChannelURL">
	<portlet:param name="mvcPath" value="/html/businessrulescustomize/view-payment-channel.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="viewStep1URL" />
<liferay-ui:header
    backURL="<%=headerBackURL.toString()%>"
    title='<%= LanguageUtil.get(portletConfig, locale, "business-rule-select-config-level") %>'
/>


<% String[] arguments = new String[]{serviceTypeName,ruleDescription}; %>
<liferay-ui:message key="business-rule-customize-select-config-level" arguments="<%=arguments%>" />


<br><br>
<aui:form method="POST" name="fm">
	<aui:input name="hiddenPaymentMethodURL" type="hidden" value="<%=hiddenPaymentMethodURL%>" />
	<aui:input name="hiddenBusinessServiceURL" type="hidden" value="<%=hiddenBusinessServiceURL%>" />
	<aui:input name="hiddenPaymentChannelURL" type="hidden" value="<%=hiddenPaymentChannelURL%>" />

	<aui:input name="ruleId" type="hidden" value="<%=ruleId%>" />
	<aui:input name="ruleCategory" type="hidden" value="<%=ruleCategory%>" />
	<aui:input name="ruleName" type="hidden" value="<%=ruleName%>" />
	<aui:input name="ruleDescription" type="hidden" value="<%=ruleDescription%>" />
	<aui:input name="ruleDefaultValue" type="hidden" value="<%=ruleDefaultValue%>" />
	<aui:input name="newValue" type="hidden" value="<%=newValue%>" />
	
	<aui:input name="serviceTypeName" type="hidden" value="<%=serviceTypeName%>" />
	<aui:input name="serviceTypeId" type="hidden" value="<%=serviceTypeId%>" />
		
	<aui:input name="selectConfigLevel"  label="config-level-business-service" type="radio" value="<%=BusinessRuleConfigLevel.BUSINESS_SERVICE%>"></aui:input>
	<aui:input name="selectConfigLevel" label="config-level-paymentchannel"  type="radio" value="<%=BusinessRuleConfigLevel.PAYMENT_CHANNEL%>"></aui:input>
	<aui:input name="selectConfigLevel" label="config-level-paymentmethod" type="radio" value="<%=BusinessRuleConfigLevel.PAYMENT_METHOD%>"></aui:input>
		
	<aui:button-row>
		<aui:button onClick="<%=viewStep1URL%>" type="cancel" />
		<aui:button type="button" value="Next" onClick="switchURLAndSubmit()"/>
	</aui:button-row>
</aui:form>