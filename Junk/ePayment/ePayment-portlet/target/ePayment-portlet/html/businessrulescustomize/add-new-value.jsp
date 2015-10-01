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
<%@ page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>

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

	final PortletURL viewBusinessTypesURL = renderResponse.createRenderURL();
	final String redirect = PortalUtil.getCurrentURL(renderRequest);
	viewBusinessTypesURL.setParameter("redirect", redirect);
	viewBusinessTypesURL.setParameter("mvcPath", "/html/businessrulescustomize/select-business-rule-config-level.jsp");
	
	String redirectStep1URL = ParamUtil.getString(request, "redirectStep1URL");
	
	
	final PortletURL headerBackURL = renderResponse.createRenderURL();
	headerBackURL.setParameter("serviceTypeId",serviceTypeId);
	
%>
<portlet:renderURL var="viewStep1URL" />

<liferay-ui:header
    backURL="<%=headerBackURL.toString()%>"
    title='<%= LanguageUtil.get(portletConfig, locale, "add-business-rule-new-value") %>'
/>

<aui:form action="<%=viewBusinessTypesURL%>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="ruleId" type="hidden" value="<%=ruleId%>" />
		<aui:input name="ruleCategory" type="hidden" value="<%=ruleCategory%>" />
		<aui:input name="ruleName" type="hidden" value="<%=ruleName%>" />
		<aui:input name="ruleDescription" type="hidden" value="<%=ruleDescription%>" />
		<aui:input name="ruleDefaultValue" type="hidden" value="<%=ruleDefaultValue%>" />
		<aui:input name="serviceTypeName" type="hidden" value="<%=serviceTypeName%>" />
		<aui:input name="serviceTypeId" type="hidden" value="<%=serviceTypeId%>" />

		<aui:input name="ruleName" label="payment-rule-name" disabled="true" value="<%=ruleName%>"></aui:input>
		<aui:input name="ruleDescription" label="payment-rule-description" disabled="true" value="<%=ruleDescription%>"></aui:input>
		<aui:input id="ruleDefaultValue" name="ruleDefaultValue" label="payment-rule-default-value" disabled="true" value="<%=ruleDefaultValue%>"></aui:input>
		
		<aui:input id="newValue" name="newValue" label="bizRuleCustomizeRule-new-rule" value="<%=newValue%>">
			<aui:validator name="required" errorMessage="field-required" />
			<aui:validator name="custom" errorMessage="validation-message-default-new-value">
				function (val, fieldNode, ruleValue) {					
					var defaultValue=document.getElementById("<portlet:namespace />ruleDefaultValue").value;
					var newValue=document.getElementById("<portlet:namespace />newValue").value;					
					return !(defaultValue==newValue);
				}
			</aui:validator>
		</aui:input>
		<aui:button-row>
			<aui:button onClick="<%=viewStep1URL%>" type="cancel" />
			<aui:button type="submit" value="Next" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>
