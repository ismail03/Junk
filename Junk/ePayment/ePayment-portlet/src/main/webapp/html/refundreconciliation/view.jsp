<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.stc.echannels.epayments.service.BankServiceUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.stc.echannels.epayments.service.TransactionStatusLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.BankLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
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

	//List<PaymentSystem> systems = PaymentSystemLocalServiceUtil.getPaymentSystems(QueryUtil.ALL_POS,QueryUtil.ALL_POS);
	List<BusinessSrv> services = BusinessSrvLocalServiceUtil.getBusinessServices();
	List<Bank> banks = BankLocalServiceUtil.getBanks();

	String serviceId= renderRequest.getParameter("serviceId");
	String reconciliationDate= renderRequest.getParameter("reconciliationDate");
	String reconciliationType= renderRequest.getParameter("reconciliationType");
	String pmtBankId= renderRequest.getParameter("pmtBankId");

%>

<portlet:actionURL name="findTransactions" var="findTransactionsURL" windowState="normal" />


<aui:form action="<%= findTransactionsURL %>" method="POST" name="fm">
    <aui:fieldset>
 	
 		<!-- First Row -->
 		<aui:layout>
 		
 			<aui:column columnWidth="25" first="true">
		        <aui:select name="serviceId">
		        	<aui:option label="all" value="DEFAULT" /> 
		        	<% for (BusinessSrv bs: services) { %>
		        		<aui:option label="<%=bs.getName(locale) %>" value="<%=bs.getServiceId() %>"  /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 			
 			<aui:column columnWidth="25">
		        <aui:select name="pmtBankId">
		       		<aui:option label="all" value="DEFAULT" /> 
		        	<% for (Bank b: banks) { %>
		        		<aui:option label="<%=b.getName(locale) %>" value="<%=b.getStcCode() %>"  /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 			
 			<aui:column columnWidth="25">
 				<aui:field-wrapper>
					<div id="datePicker" class="aui-datepicker-example aui-helper-clearfix">
						<aui:input type="text" style="width:80px;" name="reconciliationDate" value='<%=renderRequest.getAttribute("reconciliationDate")%>' />
					</div>
               	</aui:field-wrapper>
 			</aui:column>


 			<aui:column columnWidth="25" last="true">
		        <aui:select name="reconciliationType">
		       		<aui:option label="all" value="DEFAULT" /> 
					<aui:option label="reconciled" value="Reconciled" />
					<aui:option label="unreconciled" value="UnReconciled" />	
		        </aui:select>	
 			</aui:column>
 
 		</aui:layout>
 		

 		<!-- 2nd Row -->
  		<aui:button-row>
 	        <aui:button value="view" type="submit" name="search" />
  		</aui:button-row>        
	
    </aui:fieldset>

</aui:form>

<div class="data_results" id="data_results"></div>

<table cellpadding="0" cellspacing="0" border="0" class="display" id="dt_results"></table>


<aui:script use="aui-datepicker">
 new A.DatePicker(
     {
       trigger: '[name=<portlet:namespace/>reconciliationDate]',
       popover: {
         zIndex: 1
       },
       on: {
         selectionChange: function(event) {
           console.log(event.newSelection)
         }
       }
     });
</aui:script>


<script type="text/javascript">
	jQuery(document).ready(function() {
		var data = <%=renderRequest.getParameter("data") %>;
		if (data !== undefined) {
			jQuery('#dt_results').dataTable( {
				"data": data,
				"columns": [
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "trans-id") %>", "data":"epayTransId"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "refund-id") %>", "data":"refundId"},
		 					{"title":"<%=LanguageUtil.get(portletConfig, locale, "pmt-bank-id") %>", "data":"pmtBankId"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "pmt-system-refund-trans-id") %>", "data":"pmtSystemRefundTransId"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "bank-refund-trans-id") %>", "data":"bankRefundTransId"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "submission-date") %>", "data":"submissionDate"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "eff-dt") %>", "data":"effDt"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "process-date") %>", "data":"processDate"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "refund-status-code") %>", "data":"refundStatusCode"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "refund-amount") %>", "data":"refundAmount"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "service-id") %>", "data":"serviceId"}
						],
				"pageLength":25,
				"dom": "C<'clear'>Rlfrtip"
			});
		}
	});
</script>
