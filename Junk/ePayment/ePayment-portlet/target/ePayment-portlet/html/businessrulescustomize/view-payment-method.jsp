<%@page import="java.util.ArrayList"%>
<%@page import="com.stc.echannels.epayments.model.PaymentMethod"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page
	import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@ page
	import="com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil"%>
<%@ page import="com.stc.echannels.epayments.model.BusinessSrv"%>
<%@ page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Collections"%>
<%@ page import="com.stc.echannels.epayments.custommodel.BizRuleCustomValueConfigModel" %>
<%@ page import="stc.com.echannels.util.BizRuleUtil"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:renderURL var="viewStep1URL" />

<portlet:renderURL var="hiddenPaymentMethodURL">
	<portlet:param name="mvcPath" value="/html/businessrulescustomize/view-payment-method-grid.jsp" />
</portlet:renderURL>

<script type="text/javascript" >
		
	function submitSearchForm() {
		var serviceType = $("#<portlet:namespace />businessServiceType");
		if(serviceType.val()!=''){
			document.<portlet:namespace />fmItem.submit();
		}
	}
	function enableNextButton(){
		var paymentMethodType = $("#<portlet:namespace />paymentMethodType");
		var serviceType = $("#<portlet:namespace />businessServiceType");
		if(serviceType.val()!='' && paymentMethodType.val() != ''){
			$('#button-next').removeAttr("disabled");
			$('#button-next').removeClass("disabled");
		}else{
			$('#button-next').attr('disabled','true');
		}
	}
	$( document ).ready(function() {
		enableNextButton();
	});
	function nextButtonClick(){
		var businessServiceType = document.<portlet:namespace />fmItem.<portlet:namespace />businessServiceType;
		var paymentMethodType = document.<portlet:namespace />fmItem.<portlet:namespace />paymentMethodType;
		if(paymentMethodType.selectedIndex!=0 && businessServiceType.selectedIndex!=0){
			var urlToSubmit = '<%=hiddenPaymentMethodURL %>';
			document.<portlet:namespace />fmItem.action=urlToSubmit;
			document.<portlet:namespace />fmItem.submit();			
		}else{	
			return false;	
		}	
	}
	

</script>

<%
	final RowChecker checker = new RowChecker(renderResponse);
	final String COLON = ":";
	final Long ruleId = ParamUtil.getLong(request, "ruleId");
	final String ruleName = ParamUtil.getString(request, "ruleName");
	final String ruleCategory = ParamUtil.getString(request, "ruleCategory");
	final String ruleDescription = ParamUtil.getString(request, "ruleDescription");
	final String ruleDefaultValue = ParamUtil.getString(request, "ruleDefaultValue");
	final String newValue = ParamUtil.getString(request, "newValue");
	final String paymentMethodRadio = ParamUtil.getString(request, "paymentMethod");
	final String serviceTypeName = ParamUtil.getString(request, "serviceTypeName");
	long serviceTypeId = ParamUtil.getLong(request, "serviceTypeId");
	String businessServiceTypeIdAndDescription = ParamUtil.getString(request, "businessServiceType", "");
	String paymentMethodTypeIdAndDescription=ParamUtil.getString(request, "paymentMethodType", "");

	final List<BusinessSrv> businessServices = BizRuleUtil.getBusiniessServiceByRegisteredServiceTypeId(serviceTypeId);
	List<PaymentMethod> paymentMethods = new ArrayList<PaymentMethod>();
	/**if(businessServices != null && !businessServices.isEmpty()){
	long serviceId = businessServices.get(0).getServiceId();
		if(! businessServiceTypeIdAndDescription.isEmpty()){
			paymentMethods = BizRuleUtil.getPaymentMethodByBusiniessServiceId(serviceId);
		}
	}**/
	
	if( ( businessServiceTypeIdAndDescription != null && !businessServiceTypeIdAndDescription.isEmpty() ) && ( paymentMethodTypeIdAndDescription == null || paymentMethodTypeIdAndDescription.isEmpty() )){
		Long serviceId = Long.parseLong(businessServiceTypeIdAndDescription.split(":")[0] );
		paymentMethods= BizRuleUtil.getPaymentMethodByBusiniessServiceId(serviceId);
	}
	
%>
<liferay-ui:header
    backURL="javascript:history.go(-1);"
    title='<%= LanguageUtil.get(portletConfig, locale, "business-rule-payment-method-select-records") %>'
/>

<% String[] arguments = new String[]{serviceTypeName,ruleDescription}; %>
<liferay-ui:message key="business-rule-customize-select-config-level" arguments="<%=arguments%>" />

<br/>
<aui:form  name="fmItem">

	<aui:input name="ruleId" type="hidden" value="<%=ruleId%>" />
	<aui:input name="ruleCategory" type="hidden" value="<%=ruleCategory%>" />
	<aui:input name="ruleName" type="hidden" value="<%=ruleName%>" />
	<aui:input name="ruleDescription" type="hidden" value="<%=ruleDescription%>" />
	<aui:input name="ruleDefaultValue" type="hidden" value="<%=ruleDefaultValue%>" />
	<aui:input name="newValue" type="hidden" value="<%=newValue%>" />
	<aui:input name="serviceTypeName" type="hidden" value="<%=serviceTypeName%>" />
	<aui:input name="serviceTypeId" type="hidden" value="<%=serviceTypeId%>" />
	<aui:select label="" name="businessServiceType" onChange="submitSearchForm();">
		<aui:option label="biz-rule-select-biz-service" value="" />
		<%
			for (BusinessSrv businessService : businessServices) {
		%>
		<aui:option label="<%=businessService.getServiceNameEn()%>"
			value="<%=businessService.getServiceId()+COLON+businessService.getServiceNameEn()%>"></aui:option>
		<%
			}
		%>
	</aui:select>

	<aui:select label="" name="paymentMethodType" onChange="enableNextButton();">
		<aui:option label="select-payment-method" value="" />
		<%
			for (PaymentMethod paymentMethod : paymentMethods) {
		%>
		<aui:option label="<%=paymentMethod.getDescriptiveNameEn()%>"
			value="<%=paymentMethod.getPmtMethodId() +COLON + paymentMethod.getDescriptiveNameEn() %>"></aui:option>
		<%
			}
		%>
	</aui:select>

	<aui:button-row>
		<aui:button onClick="<%=viewStep1URL%>"  type="cancel" value="button-cancel" />
		<aui:button  onClick="nextButtonClick();" id="button-next" value="button-next" disabled="true"/>
	</aui:button-row>
</aui:form>
 