<%@page import="com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil"%>
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


<%
	final RowChecker checker = new RowChecker(renderResponse);
	final String COLON = ":";
	final Long ruleId = ParamUtil.getLong(request, "ruleId");
	final String ruleName = ParamUtil.getString(request, "ruleName");
	final String ruleCategory = ParamUtil.getString(request, "ruleCategory");
	final String ruleDescription = ParamUtil.getString(request, "ruleDescription");
	final String ruleDefaultValue = ParamUtil.getString(request, "ruleDefaultValue");
	final String newValue = ParamUtil.getString(request, "newValue");
	final String paymentMethod = ParamUtil.getString(request, "paymentMethod");
	final String serviceTypeName = ParamUtil.getString(request, "serviceTypeName");
	
	PortletURL selectServiceChangeFormURL = renderResponse.createRenderURL();
	String businessServiceTypeIdAndDescription = ParamUtil.getString(request, "businessServiceType", "");
	String paymentMethodTypeAndDescription = ParamUtil.getString(request, "paymentMethodType", "");
	List<BizRuleCustomValueConfigModel> configModels = Collections.emptyList();
	if (businessServiceTypeIdAndDescription != null && !businessServiceTypeIdAndDescription.isEmpty()
			&& paymentMethodTypeAndDescription != null && !paymentMethodTypeAndDescription.isEmpty()) {
		configModels = BizRuleUtil.getConfigForPaymentMethod(businessServiceTypeIdAndDescription,
				paymentMethodTypeAndDescription, ruleDefaultValue, newValue);
	}
	long serviceId = Long.parseLong(businessServiceTypeIdAndDescription.split(":")[0]);
	long pmtMethodId = Long.parseLong(paymentMethodTypeAndDescription.split(":")[0] );

%>

<portlet:actionURL name="saveBusinessRules" var="saveBusinessRulesURL" />
<%
	String saveFunctionName = renderResponse.getNamespace()+"saveBusinessRules()";
	String hiddenRecordIdFieldName = renderResponse.getNamespace()+"saveBusinessRulesIds";
%>

<liferay-ui:header
    backURL="javascript:history.go(-1);"
    title='<%= LanguageUtil.get(portletConfig, locale, "business-rule-payment-method-select-records") %>'
/>

<% String[] arguments = new String[]{serviceTypeName,ruleDescription}; %>
<liferay-ui:message key="business-rule-customize-select-config-level" arguments="<%=arguments%>" />
<br/><br/>

<% if(!BizRuleConfigLocalServiceUtil.isBizRuleConfigCombinationAlreadyAdded(serviceId, 0, pmtMethodId,ruleId)){   %>
<aui:form action="<%= saveBusinessRulesURL%>" method="post" name="fmItem">

	<aui:input name="ruleId" type="hidden" value="<%=ruleId%>" />
	<aui:input name="ruleCategory" type="hidden" value="<%=ruleCategory%>" />
	<aui:input name="ruleName" type="hidden" value="<%=ruleName%>" />
	<aui:input name="ruleDescription" type="hidden" value="<%=ruleDescription%>" />
	<aui:input name="ruleDefaultValue" type="hidden" value="<%=ruleDefaultValue%>" />
	<aui:input name="newValue" type="hidden" value="<%=newValue%>" />

<liferay-ui:search-container emptyResultsMessage="no-record-to-display" 
	  rowChecker="<%=checker%>"   
	  var="searchContainer" >
<liferay-ui:search-container-results>
    <%
		// searchContainer.setTotal(configModels.size());
		 searchContainer.setResults(configModels);
    %>
	</liferay-ui:search-container-results>
	<aui:input name="saveBusinessRulesIds" type="hidden" />
	<liferay-ui:search-container-row
		className="com.stc.echannels.epayments.custommodel.BizRuleCustomValueConfigModel"
		keyProperty="id" modelVar="bizRuleCustomValueModel"
		escapedModel="<%=true%>">
		

	  <liferay-ui:search-container-column-text  name="biz-rule-custom-business-service"
             value="<%= String.valueOf(\"en_US\".equals(locale)?bizRuleCustomValueModel.getServiceNameEN():bizRuleCustomValueModel.getServiceNameEN()) %>"
        />

	  <liferay-ui:search-container-column-text  name="biz-rule-custom-payment-method"
            value="<%= String.valueOf(\"en_US\".equals(locale)?bizRuleCustomValueModel.getPaymentMethodNameEN():bizRuleCustomValueModel.getPaymentMethodNameEN()) %>"
        />

	<liferay-ui:search-container-column-text name="biz-rule-custom-default-value"
            value="<%= bizRuleCustomValueModel.getDefaultValue()%>"
        />
        
   		<liferay-ui:search-container-column-text   name="biz-rule-custom-new-value"
            value="<%= bizRuleCustomValueModel.getNewValue()%>"
        />
        
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="false"/>
</liferay-ui:search-container>
</aui:form>

<aui:button-row>
	<aui:button onClick="<%=viewStep1URL%>"  type="cancel" value="button-cancel" />
    <aui:button onClick="<%=saveFunctionName%>" value="button-save" />
</aui:button-row>

<% } else {%>
<div class="alert">
  <liferay-ui:message key="business-rule-save-combination-already-exists"></liferay-ui:message></div>
<%} %>
<aui:script>
        Liferay.provide(
        window,
        '<portlet:namespace />saveBusinessRules',
        function() {
        var checkBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmItem, "<portlet:namespace />allRowIds");
        if(checkBoxValue==""){
    		return false;
    	}
        document.<portlet:namespace />fmItem.<%=hiddenRecordIdFieldName%>.value=checkBoxValue;
        document.<portlet:namespace />fmItem.submit();        
        },
        ['liferay-util-list-fields']
        );
</aui:script>
