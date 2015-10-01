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
<%@ page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>

<portlet:renderURL var="viewSericeTypesURL" />
<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	final String transId = ParamUtil.getString(request, "transId");
	final long ruleId = ParamUtil.getLong(request, "ruleId");
	final PaymentRule paymentRule = PaymentRuleLocalServiceUtil.fetchByRuleIdAndTransId(ruleId, transId);
%>

<liferay-ui:header
    backURL="<%= viewSericeTypesURL %>"
    title='<%=LanguageUtil.get(portletConfig, locale, "edit-payment-rule-config") %>'
/>

<portlet:actionURL name="updatePaymentRule" var="updatePaymentRuleURL"
	windowState="normal" />

<aui:form action="<%=updatePaymentRuleURL%>" method="POST" name="fm" >
	<aui:fieldset>
		<aui:input name="transId" type="hidden" value="<%=transId%>" />
		<aui:input name="ruleId" type="hidden"	value="<%=String.valueOf(ruleId)%>" />
		<aui:input name="paramOldValue" type="hidden"	value="<%=paymentRule.getValue()%>" />
		
		<aui:input name="ruleName" label="payment-rule-name" disabled="true" value="<%=paymentRule.getRuleName()%>"></aui:input>
		<aui:input name="ruleDescription" label="payment-rule-description" disabled="true" value="<%=paymentRule.getDescriptionEN()%>"></aui:input>
		<aui:input name="defaultValue" label="payment-rule-default-value" value="<%=paymentRule.getValue()%>">
			<aui:validator name="required" errorMessage="field-required" />
			<aui:validator name="custom" errorMessage="validation-message-old-new-value-same">
				function (val, fieldNode, ruleValue) {					
					var paramOldValue=document.getElementById("<portlet:namespace />paramOldValue").value;
					var defaultNewValue=document.getElementById("<portlet:namespace />defaultValue").value;
					return !(defaultNewValue==paramOldValue);
				}
			</aui:validator>
		</aui:input>

		<aui:button-row>
			<aui:button onClick="<%= viewSericeTypesURL%>"  type="cancel" />
			<aui:button type="submit" onClick="changeDefaultValue()"/>
		</aui:button-row>
	</aui:fieldset>
</aui:form>


<aui:script>
	function changeDefaultValue(){
		var urlToSubmit = document.<portlet:namespace />fm.<portlet:namespace />enableAccessControlURL.value;
		document.<portlet:namespace />fm.action=urlToSubmit;
		document.<portlet:namespace />fm.submit();
	}
</aui:script>
