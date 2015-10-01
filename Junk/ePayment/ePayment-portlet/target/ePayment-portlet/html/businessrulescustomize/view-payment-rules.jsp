
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.RenderResponse"%>
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

<liferay-theme:defineObjects />
<portlet:defineObjects />
<aui:script>
	function submitSearchForm1(serviceType) {
		if (serviceType.selectedIndex != 0) {
			var serviceTypeName=serviceType.options[serviceType.selectedIndex].innerHTML;			
			document.<portlet:namespace />serviceTypeForm.<%=renderResponse.getNamespace()%>serviceTypeName.value=serviceTypeName;
			document.forms[0].submit();
		}
	}
</aui:script>


<%
	final String EMPTY_STRING="";
	PortletURL selectServiceChangeFormURL = renderResponse.createRenderURL();
	List<SrvTypes> serviceTypes = SrvTypesLocalServiceUtil.getSrvTypeses(0, Integer.MAX_VALUE);
	Long selectedServiceTypeId = ParamUtil.getLong(request, "serviceTypeId", 0l);
	String serviceTypeName=ParamUtil.getString(request, "serviceTypeName");

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("serviceTypeId", "" + selectedServiceTypeId);

	PortletURL recordRowURL = renderResponse.createRenderURL();
	String redirect = PortalUtil.getCurrentURL(renderRequest);
	recordRowURL.setParameter("redirect", redirect);
	recordRowURL.setParameter("mvcPath", "/html/businessrulescustomize/add-new-value.jsp");	
	Calendar calendar=Calendar.getInstance();
	Long time = new Date().getTime();
	Date date = new Date(time - time % (24 * 60 * 60 * 1000));
	Date tonight = new Date(date.getTime() + 12 * 60 * 60 * 1000);
	calendar.setTime(tonight);
	calendar.set(Calendar.HOUR,12);
	calendar.set(Calendar.MINUTE,0);
	calendar.set(Calendar.SECOND,0);
	calendar.set(Calendar.MILLISECOND, 0);
	DateFormat dateFormat=new SimpleDateFormat("MMM d, yyyy hh:mm:ss a");
	
%>
<liferay-ui:success key="business-rule-processed" translateMessage="true" message='<%= LanguageUtil.format(portletConfig,locale,
	"businsess-rule-save-sucess", new String[]{dateFormat.format(calendar.getTime())})%>'/>
<liferay-ui:message key="bizRule-configure-service-type-question"  />
<br><br>
<aui:form action="<%=selectServiceChangeFormURL%>" method="POST"
	name="serviceTypeForm">
	<aui:select label="" name="serviceTypeId" onChange="submitSearchForm1(this);" >
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
	<aui:input name="serviceTypeName" type="hidden"></aui:input>
</aui:form>
<% if(selectedServiceTypeId>0){ %>
<liferay-ui:search-container emptyResultsMessage="no-record-to-display" 
	  iteratorURL="<%=iteratorURL%>"
	  var="searchContainer"
	  delta="20" deltaConfigurable="true"
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
			recordRowURL.setParameter("redirectStep1URL",redirect+"");
			recordRowURL.setParameter("ruleId",ruleId+"");
			recordRowURL.setParameter("ruleName",paymentRuleListModel.getRuleName());
			recordRowURL.setParameter("ruleDescription", paymentRuleListModel.getDescriptionEN());
			recordRowURL.setParameter("ruleDefaultValue", paymentRuleListModel.getDefaultValue());
			recordRowURL.setParameter("ruleCategory", paymentRuleListModel.getRuleCategory());
			recordRowURL.setParameter("serviceTypeId", selectedServiceTypeId+"");
			recordRowURL.setParameter("serviceTypeName", serviceTypeName+"");
		%>
		<liferay-ui:search-container-column-text name="payment-rule-name"
			href="<%=recordRowURL%>"
			value='<%=String.valueOf(paymentRuleListModel.getRuleName())%>' />

		<liferay-ui:search-container-column-text
			name="payment-rule-description"
			value="<%=String.valueOf(paymentRuleListModel.getDescriptionEN())%>" />

		<liferay-ui:search-container-column-text
			name="payment-rule-default-value" 
			value="<%=paymentRuleListModel.getDefaultValue()%>" />
			
		<liferay-ui:search-container-column-text
			name="payment-rule-effective-date"
			value="<%= String.valueOf((paymentRuleListModel.getEffectiveDate()!=null)?paymentRuleListModel.getEffectiveDate():EMPTY_STRING) %>" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
<% }%>