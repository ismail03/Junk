<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@ page import="com.stc.echannels.epayments.custommodel.BizRuleConfigModel"%>
<%@ page import="com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil"%>
<%@ page import="com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil"%>
<%@ page import="com.stc.echannels.epayments.service.SrvTypesLocalServiceUtil"%>
<%@ page import="com.stc.echannels.epayments.model.SrvTypes" %>
<%@ page import="com.stc.echannels.epayments.model.impl.SrvTypesImpl" %>

<aui:script>
	function submitSearchForm(serviceType) {
		if(serviceType.selectedIndex!=0){
			document.forms[0].submit();
		}
	}
</aui:script>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%

final String EMPTY_STRING="";
	PortletURL selectServiceChangeFormURL = renderResponse.createRenderURL();
	
	List<SrvTypes> serviceTypes= SrvTypesLocalServiceUtil.getSrvTypeses(0, Integer.MAX_VALUE);
	
	Long selectedServiceTypeId = ParamUtil.getLong(request, "bizRuleServiceTypeId", 0l);
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("serviceTypeId", ""+selectedServiceTypeId);
	
%>


<portlet:renderURL var="viewStep1URL" />

<% if(selectedServiceTypeId==0){ %>

<liferay-ui:message key="delete-business-rules-service-type-question" />
<br><br>
<aui:form action="<%=selectServiceChangeFormURL%>" method="POST"
	name="serviceTypeForm">
		
	<aui:select label="" name="bizRuleServiceTypeId" onChange="submitSearchForm(this);" >
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
<% } %>
<portlet:actionURL name="deleteBizRules" var="editDeleteBizRuleURL" />

<%
	String deleteFunctionName = renderResponse.getNamespace()+"deleteBizRuleItems()";
	String hiddenRecordIdFieldName = renderResponse.getNamespace()+"deleteItemIds";

%>

<% if(selectedServiceTypeId>0){
	int recordCount=0;
%>

<aui:form action="<%= editDeleteBizRuleURL%>" method="post" name="fmItem">

<aui:input name="serviceTypeId" value="selectedServiceTypeId" type="hidden" />

<liferay-ui:search-container emptyResultsMessage="bizRuleSearchResultEmpty" 
	  rowChecker="<%= new RowChecker(renderResponse) %>"  iteratorURL="<%=iteratorURL%>"
	  var="searchContainer"   delta="20" deltaConfigurable="true" >
	 <aui:input name="deleteItemIds" type="hidden" />
    <liferay-ui:search-container-results>
    <%
    	    	
    	List<BizRuleConfigModel> bizRuleConfigModels  = BizRuleConfigLocalServiceUtil.findActiveBizRuleByServiceType(selectedServiceTypeId,searchContainer.getStart(),searchContainer.getEnd());
		recordCount = BizRuleConfigLocalServiceUtil.findCountBizRuleByServiceType(selectedServiceTypeId).intValue();
		
		 searchContainer.setTotal(recordCount);
		 searchContainer.setResults(bizRuleConfigModels);
    %>
	</liferay-ui:search-container-results>
	<% boolean switchLocale = "en_US".equals(themeDisplay.getLocale().toString().trim() ); %>
    <liferay-ui:search-container-row
        className="com.stc.echannels.epayments.custommodel.BizRuleConfigModel"
        keyProperty="ruleId"
        modelVar="bizRuleConfigModel" escapedModel="<%= true %>"
    >
        <liferay-ui:search-container-column-text
            name="bizRuleConfig-rule-name" 
            value='<%= String.valueOf(bizRuleConfigModel.getRuleName()) %>'
        />

        <liferay-ui:search-container-column-text
            name="bizRuleConfig-rule-business-service"
            value="<%= String.valueOf( switchLocale ?bizRuleConfigModel.getServiceNameEN():bizRuleConfigModel.getServiceNameAR() ) %>"
        />
   		
         <liferay-ui:search-container-column-text
            name="bizRuleConfig-rule-payment-channel"
            value="<%= String.valueOf(switchLocale?bizRuleConfigModel.getPaymentChannelNameEN():bizRuleConfigModel.getPaymentChannelNameAR()) %>"
        />
   		<liferay-ui:search-container-column-text
            name="bizRuleConfig-rule-payment-method"
            value="<%= String.valueOf(switchLocale?bizRuleConfigModel.getPaymentModuleNameEN():bizRuleConfigModel.getPaymentChannelNameAR()) %>"
        />
           <liferay-ui:search-container-column-text
            name="bizRuleConfig-rule-default-value"
            value="<%= String.valueOf(bizRuleConfigModel.getValue()) %>"
        />
   		<liferay-ui:search-container-column-text
            name="bizRuleCustomizeRule-new-rule"
            value="<%= String.valueOf(bizRuleConfigModel.getCustomValue()) %>"
        />
        <liferay-ui:search-container-column-text
            name="bizRuleConfig-status"
            value="<%= bizRuleConfigModel.getStatus() %>"
        />
        <liferay-ui:search-container-column-text
            name="bizRuleConfig-rule-effective-timestamp"
            value="<%= String.valueOf((bizRuleConfigModel.getEffectiveTime()!=null)?bizRuleConfigModel.getEffectiveTime():EMPTY_STRING) %>"
        />

        
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator paginate="false"/>
</liferay-ui:search-container>
</aui:form>
<aui:button-row>
	<aui:button onClick="<%=viewStep1URL%>"  value="button-cancel" />
	<% if(recordCount>0){%>
    	<aui:button onClick="<%=deleteFunctionName%>" value="delete-business-rules" />
    <% }%>
</aui:button-row>

<% } %>

        <aui:script>
        Liferay.provide(
        window,
        '<portlet:namespace />deleteBizRuleItems',
        function() {
        var checkBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmItem, "<portlet:namespace />allRowIds");
        if(checkBoxValue==""){
    		return false;
    	}
    	
    	if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "delete-business-rules-are-you-sure-you-want-to-delete") %>'))  {
	        document.<portlet:namespace />fmItem.<%=hiddenRecordIdFieldName%>.value=checkBoxValue;
	        document.<portlet:namespace />fmItem.submit();       
	    	};
        },
        ['liferay-util-list-fields']  );
</aui:script>
