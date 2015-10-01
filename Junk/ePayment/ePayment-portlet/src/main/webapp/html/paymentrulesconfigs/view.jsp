
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<%@ page import="com.liferay.portal.util.PortalUtil"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.stc.echannels.epayments.model.*"%>
<%@ page import="com.stc.echannels.epayments.custommodel.*"%>
<%@ page import="com.stc.echannels.epayments.service.SrvTypesLocalServiceUtil"%>
<%@ page import="com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker"%>

<aui:script>
	function submitSearchForm(serviceType) {
		if (serviceType.selectedIndex != 0) {
			document.forms[0].submit();
		}
	}
</aui:script>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	PortletURL selectServiceChangeFormURL = renderResponse.createRenderURL();
	List<SrvTypes> serviceTypes = SrvTypesLocalServiceUtil.getSrvTypeses(0, Integer.MAX_VALUE);
	Long selectedServiceTypeId = ParamUtil.getLong(request, "serviceTypeId", 0l);

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("serviceTypeId", "" + selectedServiceTypeId);

	PortletURL recordRowURL = renderResponse.createRenderURL();
	String redirect = PortalUtil.getCurrentURL(renderRequest);
	recordRowURL.setParameter("redirect", redirect);
	recordRowURL.setParameter("mvcPath", "/html/paymentrulesconfigs/edit_payment_rule.jsp");
%>


<aui:form action="<%=selectServiceChangeFormURL%>" method="POST"
	name="serviceTypeForm">
	<aui:select name="serviceTypeId" label="for-which-service-type-do-you-want-to-change-default-value" onChange="submitSearchForm(this);" >
		<aui:option label="select-service-type" value="0"/>
		<%
			for (SrvTypes serviceType : serviceTypes) {
		%>
		<aui:option label="<%=serviceType.getServiceNameEN()%>"
			value="<%=serviceType.getServiceTypeId()%>" selected="<%= serviceType.getServiceTypeId()==selectedServiceTypeId %>"></aui:option>
		<%
			}
		%>
	</aui:select>
</aui:form>

<% if(selectedServiceTypeId>0){ %>
<liferay-ui:search-container emptyResultsMessage="no-payment-rules-to-display" 
	     iteratorURL="<%=iteratorURL%>"  var="searchContainer"   delta="20" deltaConfigurable="true"
	 >

<liferay-ui:search-container-results>
    <%
    final List<PaymentRuleListModel> listModel = PaymentRuleLocalServiceUtil.findActivePaymentRuleByServiceType(selectedServiceTypeId, 0, 10);	
    int recordCount = PaymentRuleLocalServiceUtil.findCountActivePaymentRuleByServiceType(selectedServiceTypeId).intValue();
		
		 searchContainer.setTotal(recordCount);
		 searchContainer.setResults(listModel);
    %>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row
		className="com.stc.echannels.epayments.custommodel.PaymentRuleListModel"
		keyProperty="ruleId" modelVar="paymentRuleListModel"
		escapedModel="<%=true%>">
		<%
			Long ruleId = paymentRuleListModel.getRuleId();
			String transId = paymentRuleListModel.getTransId();
			recordRowURL.setParameter("ruleId",ruleId+"");
			recordRowURL.setParameter("transId",transId);
		%>
		<liferay-ui:search-container-column-text name="payment-rule-name"
			href="<%=recordRowURL%>"
			value='<%=String.valueOf(paymentRuleListModel.getRuleName())%>' />

		<liferay-ui:search-container-column-text
			name="payment-rule-description"
			value="<%=String.valueOf(\"en_US\".equals(locale)?paymentRuleListModel.getDescriptionEN():paymentRuleListModel.getDescriptionAR()) %>" />
		
		<liferay-ui:search-container-column-text
			name="payment-rule-default-value"
			value="<%=paymentRuleListModel.getDefaultValue()%>" />
			
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
<%}%>
