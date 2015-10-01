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
	List<PaymentChannel> paymentChannels = PaymentChannelLocalServiceUtil.getPaymentChannels();
	List<PaymentMethod> paymentMethods = PaymentMethodLocalServiceUtil.findAll();
	List<CardGroup> cardGroups = CardGroupLocalServiceUtil.getCardGroups();
	List<TransactionStatus> statuses = TransactionStatusLocalServiceUtil.findAll();

	String serviceId= renderRequest.getParameter("serviceId");
	String date= renderRequest.getParameter("date");
	String paymentStatus= renderRequest.getParameter("paymentStatus");
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
		        		<aui:option label="<%=bs.getName(locale) %>" value="<%=bs.getServiceId() %>" /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 			
 			<aui:column columnWidth="25">
		        <aui:select name="pmtBankId">
		       		<aui:option label="all" value="DEFAULT" /> 
		        	<% for (Bank b: banks) { %>
		        		<aui:option label="<%=b.getName(locale) %>" value="<%=b.getStcCode() %>" /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 			
  			<aui:column columnWidth="25">
		        <aui:select name="paymentStatus">
		       		<aui:option label="all" value="DEFAULT" /> 
		        	<% for (TransactionStatus ts: statuses) { %>
		        		<aui:option label="<%=ts.getDescription() %>" value="<%=ts.getDescription() %>" /> 
					 <% } %>
		        </aui:select>	
 			</aui:column>

 			<aui:column columnWidth="25" last="true">
 				<aui:layout>
 					<aui:column columnWidth="50">
		 				<aui:field-wrapper>
							<div id="fromDatePicker" class="aui-datepicker-example aui-helper-clearfix">
								<aui:input type="text" style="width:80px;" name="date" value='<%=renderRequest.getAttribute("date")%>' />
							</div>
		               	</aui:field-wrapper>
					</aui:column>
		    	</aui:layout>
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
       trigger: '[name=<portlet:namespace/>date]',
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
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "trans-id") %>", "data":"paymentSystemTransId"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "trans-amount") %>", "data":"transAmount"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "payment-method") %>", "data":"paymentMethod"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "payment-channel") %>", "data":"paymentChannel"},
		 					{"title":"<%=LanguageUtil.get(portletConfig, locale, "pmt-bank-id") %>", "data":"pmtBankId"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "transaction-date") %>", "data":"transactionDate"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "system-trans-id") %>", "data":"paymentSystemTransId"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "beneficiary-service-no") %>", "data":"beneficiaryServiceNo"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "prepaid-trans-id") %>", "data":"transactionId"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "service-id") %>", "data":"serviceId"}
						],
				"pageLength":25,
				"dom": "C<'clear'>Rlfrtip"
			});
		}
	});
</script>
