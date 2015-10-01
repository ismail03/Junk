<%@page import="java.util.Locale"%>
<%@page import="com.stc.echannels.epayments.service.SrvTypesLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.RefundLogLocalServiceUtil"%>
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
	List<SrvTypes> serviceTypes = SrvTypesLocalServiceUtil.getSrvTypeses(-1, -1);
	List<CardGroup> cardGroups = CardGroupLocalServiceUtil.getCardGroups();
	List<String> refundStatuses = RefundLogLocalServiceUtil.getRefundStatuses();
	String serviceId= renderRequest.getParameter("serviceId");
	String transAmount= renderRequest.getParameter("transAmount");
	String dateFrom= renderRequest.getParameter("dateFrom");
	String dateTo= renderRequest.getParameter("dateTo");
	String paymentStatus= renderRequest.getParameter("paymentStatus");
	String refundStatus = renderRequest.getParameter("refundStatus");
	   
	String paymentChannel= renderRequest.getParameter("paymentChannel");
	   
	String paymentMethod= renderRequest.getParameter("paymentMethod");
	String pmtBankId= renderRequest.getParameter("pmtBankId");
	String beneficiaryId= renderRequest.getParameter("beneficiaryId");
	String beneficiaryServiceNo= renderRequest.getParameter("beneficiaryServiceNo");
		      

%>

<portlet:actionURL name="findTransactions" var="findTransactionsURL" windowState="normal" />


<aui:form action="<%= findTransactionsURL %>" method="POST" name="fm">
    <aui:fieldset>
 	
 		<!-- First Row -->
 		<aui:layout>
 		
 			<aui:column columnWidth="25" >
		        <aui:select name="serviceId">
		        	<aui:option label="all" value="" /> 
		        	<% for (BusinessSrv bs: services) { %>
		        		<aui:option label="<%=bs.getName(locale) %>" value="<%=bs.getServiceNameEn() %>" /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 			
 			<aui:column columnWidth="25">
		        <aui:select name="pmtBankId">
		       		<aui:option label="all" value="" /> 
		        	<% for (Bank b: banks) { %>
		        		<aui:option label="<%=b.getName(locale) %>" value="<%=b.getNameEn() %>" /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 			
 			<aui:column columnWidth="25">
 		        <aui:select name="paymentChannel">
		       		<aui:option label="all" value="" /> 
		        	<% for (PaymentChannel pc: paymentChannels) { %>
		        		<aui:option label="<%=pc.getName(locale) %>" value="<%=pc.getDescriptiveNameEn()%>" /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 					
 			<aui:column columnWidth="25" >
		        <aui:select name="paymentMethod">
		       		<aui:option label="all" value="" /> 
		        	<% for (PaymentMethod pm: paymentMethods) { %>
		        		<aui:option label="<%=pm.getDescriptiveNameEn() %>" value="<%=pm.getDescriptiveNameEn() %>" /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 			
		</aui:layout>
 		
 		
 		<!-- Second Row -->
  		<aui:layout>
  		
  			
  		
  			<aui:column columnWidth="25" >
		        <aui:select name="serviceTypes">
		       		<aui:option label="all" value="" /> 
		        	<% for (SrvTypes st: serviceTypes) { %>
		        		<aui:option label="<%= (locale==Locale.ENGLISH)?st.getServiceNameEN():st.getServiceNameEN()%>" value="<%=st.getServiceNameEN() %>" /> 
					<% } %>
		        </aui:select>	
 			</aui:column>
 			
 			<aui:column columnWidth="25">
		        <aui:select name="refundStatus">
		       		<aui:option label="all" value="" /> 
		        	<% for (String status: refundStatuses) { %>
		        		<aui:option label="<%=status %>" value="<%=status %>" />
		        		 <% 
					 	} %>
		        </aui:select>	
  			</aui:column>
 			
 			<aui:column columnWidth="25">
		        <aui:input name="beneficiaryServiceNo" type="text" value="" size="15" style="width: 205px ;">
		        </aui:input>
			</aui:column>
 			
 			<aui:column columnWidth="25">
		        <aui:input name="beneficiaryId" type="text" value="" size="15" style="width: 205px;" >
		        </aui:input>
 			</aui:column>

 		</aui:layout>
 		
 		<!-- Third row -->
 		<aui:layout>
 		
 			<aui:column columnWidth="25" >
 		         <aui:input name="transId" type="text" value="" size="15" style="width: 205px;">
		        </aui:input>	
 			</aui:column>
 			
 			<aui:column columnWidth="25" >
 		         <aui:input name="transAmount" type="text" value="" size="15" style="width: 205px;">
		        </aui:input>	
 			</aui:column>
 			
 			<aui:column columnWidth="25" >
 		         <aui:input name="accountNumber" type="text" value="" size="15" style="width: 205px;">
		        </aui:input>	
 			</aui:column>
 			
			<aui:column columnWidth="25" >
 				<aui:layout>
 					<aui:column columnWidth="50">
		 				<aui:field-wrapper>
							<div id="fromDatePicker" class="aui-datepicker-example aui-helper-clearfix">
								<aui:input type="text" style="width:80px ;" name="dateFrom" value='<%=renderRequest.getAttribute("dateFrom")%>' />
							</div>
		               	</aui:field-wrapper>
					</aui:column>
					<aui:column columnWidth="50">
		 				<aui:field-wrapper>
							<div id="toDatePicker" class="aui-datepicker-example aui-helper-clearfix">
								<aui:input type="text" style="width:80px ;" name="dateTo" value='<%=renderRequest.getAttribute("dateTo") %>' />
							</div>
		               	</aui:field-wrapper>
		        	</aui:column>
		    	</aui:layout>
 			</aui:column>
 			
 			<aui:column columnWidth="75" last="true">
 				&nbsp;
 			</aui:column>
 			
		</aui:layout>
		
 		<!-- Fourth Row -->
  		<aui:button-row>
 	        <aui:button value="view" type="submit" name="search" />
  		</aui:button-row>        

 		<!-- Forth Row -->
	 
	
	
    </aui:fieldset>

</aui:form>
<div class="data_results" id="data_results"></div>

<table cellpadding="0" cellspacing="0" border="0" class="display" id="dt_results"></table>

<liferay-ui:error key="invalid-date-period" message="invalid-date-period" />
<liferay-ui:error key="missing-to-date" message="missing-to-date" />




<aui:script use="aui-datepicker">
 new A.DatePicker(
     {
       trigger: '[name=<portlet:namespace/>dateFrom]',
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
<aui:script use="aui-datepicker">
  new A.DatePicker(
     {
       trigger: '[name=<portlet:namespace/>dateTo]',
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

<style media="all" type="text/css">
.alignRight { text-align: right; }
.alignCenter{text-align:center;}
</style>

<script type="text/javascript">
	jQuery(document).ready(function() {
		var data = <%=renderRequest.getParameter("data") %>;
		if (data !== undefined) {
			jQuery('#dt_results').dataTable( {
				"data": data,
				"columns": [
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "trans-id") %>", "data":"epayTransId","sClass":"alignCenter"},
		 					{"title":"<%=LanguageUtil.get(portletConfig, locale, "pmt-bank-id") %>", "data":"bankNameEn","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "payment-method") %>", "data":"paymentMethodNameEn","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "payment-channel") %>", "data":"paymentChannelNameEn","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "account-number") %>", "data":"accountNumber","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "beneficiary-id") %>", "data":"beneficiaryId","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "beneficiary-service-no") %>", "data":"beneficiaryServiceNumber","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "service-type") %>", "data":"serviceTypeNameEn","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "trans-amount") %>", "data":"transAmount","sClass":"alignRight"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "process-date") %>", "data":"processDate","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "payment-status") %>", "data":"paymentStatus","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "refund-status") %>", "data":"refundStatus","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "refund-id") %>", "data":"refundId","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "refund-amount") %>", "data":"refundAmount","sClass":"alignRight"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "submission-date") %>", "data":"refundSubmissionDate","sClass":"alignCenter"},
							{"title":"<%=LanguageUtil.get(portletConfig, locale, "approval-date") %>", "data":"refundApprovalDate","sClass":"alignCenter"}
							
						],
				"pageLength":25,
				"dom": "C<'clear'>Rlfrtip"
			});
		}
	});
</script>
