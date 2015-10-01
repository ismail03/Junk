<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="stc.com.echannels.util.PaymentTransactionUtil"%>
<%@page import="com.stc.echannels.epayments.service.BankLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.model.Bank"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>


<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request
            .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Bank bank = (Bank) row.getObject();

    String transId = bank.getTransId();
    String bankId = bank.getBankId();
  
    String name = Bank.class.getName();
   
	ThemeDisplay td1  =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
   // String redirect = PortalUtil.getCurrentURL(renderRequest);
    	String redirect = PortalUtil.getLayoutURL(td1.getLayout(), td1);
%>
<liferay-ui:icon-menu>
 <portlet:renderURL var="addBranchurl">
        <portlet:param name="mvcPath" value="/html/banks/add_branch.jsp" />
       <portlet:param name="bankId" value="<%=bankId %>"/>
      
          <portlet:param name="reqtype" value="bank"/>
           <portlet:param name="transId" value="<%=transId%>" />
    </portlet:renderURL>
    <portlet:resourceURL var="getBranchUrl" id="banks" >
<portlet:param name="bankid" value="<%=bankId %>"/>
<portlet:param name="getBranches" value="yes"/>
<portlet:param name="bsrid" value="bsempty"/>
<portlet:param name="cacheResolver" value="init"/>
</portlet:resourceURL>
    <liferay-ui:icon
				message="Add Branch"
				src="/ePayment-portlet/html/banks/images/addBranch.png"
				url="<%=  addBranchurl.toString() %>" />
				<%	String getBranches = "javascript:getBranches('"+getBranchUrl.toString()+"')";  %>
  <liferay-ui:icon message="View Branch" src="/ePayment-portlet/html/banks/images/viewBranch.png"  url="<%=getBranches%>"/>
    <portlet:renderURL var="editURL">
        <portlet:param name="mvcPath" value="/html/banks/edit_bank.jsp" />
        <portlet:param name="transId" value="<%=transId%>" />
        <portlet:param name="bankId" value="<%= bankId%>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <liferay-ui:icon message="Edit" src="/ePayment-portlet/html/banks/images/editBank.png" url="<%= editURL.toString() %>" />

    <portlet:actionURL name="deleteBank" var="deleteURL">
        <portlet:param name="transId" value="<%=transId%>" />
        <portlet:param name="redirect" value="<%=redirect%>" />
    </portlet:actionURL>

<%	String deleteConfirm = "javascript:confirmDel('"+deleteURL.toString()+"','"+bank.isPaymentTransactionRecorded() +"')";  %>
    <liferay-ui:icon message="Delete" src="/ePayment-portlet/html/banks/images/deleteBank.png" url="<%=deleteConfirm %>" />

</liferay-ui:icon-menu>

<script type="text/javascript">

function confirmDel(url,isPaymentTransactionRecorded) {
	if(isPaymentTransactionRecorded == 'false') {
		var x = confirm('<liferay-ui:message key="delete-bank-confirm-message"/>');
		if(x){
			window.location.href =url;
		}else{
			return;
		}
	} else {
		alert('<liferay-ui:message key="delete-bank-alert-message"/>');
		return;
	}
}
function getBranches(branchurl){
	
	
	branchurl =branchurl.replace('init',Math.random()*99999);
	

	 $("#include-jsp").load(branchurl);
	
}
</script>



