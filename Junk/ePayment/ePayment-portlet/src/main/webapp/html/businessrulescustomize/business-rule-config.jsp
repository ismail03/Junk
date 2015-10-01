<%@page import="com.stc.echannels.epayments.enums.BusinessRuleConfigLevel"%>
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
<%@ page import="stc.com.echannels.util.BizRuleUtil"%>
<%@ page import="com.stc.echannels.epayments.custommodel.BizRuleCustomValueConfigModel" %>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<aui:script>
	function submitSearchForm(serviceType) {
		if (serviceType.selectedIndex != 0) {
			document.forms[0].submit();
		}
	}
</aui:script>

<%
	String ruleCategory = ParamUtil.getString(renderRequest, "ruleCategory");
	String ruleName = ParamUtil.getString(renderRequest, "ruleName");
	String ruleDefaultValue = ParamUtil.getString(renderRequest, "ruleDefaultValue");
	String newValue = ParamUtil.getString(renderRequest, "newValue");
	PortletURL selectBusinessRuleConfigLevelFormURL = renderResponse.createRenderURL();
	String businessRuleConfigLevelType = ParamUtil.getString(request, "businessRuleConfigLevel", "INVALID");

	List<BizRuleCustomValueConfigModel> configModels = new ArrayList<BizRuleCustomValueConfigModel>();
	if (!businessRuleConfigLevelType.equals("INVALID")) {
		configModels = BizRuleUtil.getBusinessRuleConfigLevelMatrix(BusinessRuleConfigLevel.valueOf(businessRuleConfigLevelType),
				ruleDefaultValue, newValue);
		System.out.println(configModels);
	}

	String redirect = PortalUtil.getCurrentURL(renderRequest);
	selectBusinessRuleConfigLevelFormURL.setParameter("redirect", redirect);
	selectBusinessRuleConfigLevelFormURL.setParameter("mvcPath", "/html/businessrulescustomize/business-rule-config.jsp");
%>


<% String[] arguments = new String[]{ruleCategory,ruleDescription}; %>
<liferay-ui:message key="business-rule-customize-rulecategory-rulename-confirm" arguments="<%=arguments%>" />

<br>
<aui:form action="<%=selectBusinessRuleConfigLevelFormURL%>" method="POST" name="BusinessRuleConfigLevelForm">
		<aui:input name="ruleName" type="hidden" value="<%=ruleName%>" />
		<aui:input name="ruleCategory" type="hidden" value="<%=ruleCategory%>" />
	<aui:select name="businessRuleConfigLevel" onChange="submitSearchForm(this);">
		<aui:option label="Select Business Type" value="0" />
		<aui:option label="Business Service" value="<%=BusinessRuleConfigLevel.BUSINESS_SERVICE%>" />
		<aui:option label="Payment Channel" value="<%=BusinessRuleConfigLevel.PAYMENT_CHANNEL%>" />
		<aui:option label="Payment Method" value="<%=BusinessRuleConfigLevel.PAYMENT_METHOD%>" />
	</aui:select>
</aui:form>

<liferay-ui:search-container emptyResultsMessage="no-record-to-display" 
	  rowChecker="<%= new RowChecker(renderResponse) %>"   
	  var="searchContainer" >

<liferay-ui:search-container-results>
    <%
		// searchContainer.setTotal(configModels.size());
		 searchContainer.setResults(configModels);
    %>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row
		className="com.stc.echannels.epayments.custommodel.BizRuleCustomValueConfigModel"
		keyProperty="id" modelVar="bizRuleCustomValueModel"
		escapedModel="<%=true%>">

	  <liferay-ui:search-container-column-text  name="Business Service"
             value="<%= String.valueOf(\"en_US\".equals(locale)?bizRuleCustomValueModel.getServiceNameEN():bizRuleCustomValueModel.getServiceNameEN()) %>"
        />

	  <liferay-ui:search-container-column-text  name="Payment Channel Name"
            value="<%= String.valueOf(\"en_US\".equals(locale)?bizRuleCustomValueModel.getPaymentChannelNameEN():bizRuleCustomValueModel.getPaymentChannelNameEN()) %>"
        />

	  <liferay-ui:search-container-column-text  name="Payment Method Name"
            value="<%= String.valueOf(\"en_US\".equals(locale)?bizRuleCustomValueModel.getPaymentMethodNameEN():bizRuleCustomValueModel.getPaymentChannelNameEN()) %>"
        />

	<liferay-ui:search-container-column-text name="Default Value"
            value="<%= String.valueOf(bizRuleCustomValueModel.getDefaultValue()) %>"
        />
        
   		<liferay-ui:search-container-column-text   name="Value"
            value="<%= String.valueOf(bizRuleCustomValueModel.getDefaultValue()) %>"
        />
        
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
