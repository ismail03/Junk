<%@page import="java.util.Collections"%>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="stc.com.echannels.util.PaymentTransactionUtil"%>
<%@page import="com.stc.echannels.epayments.service.BankBranchLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.BankBranch"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects/>
<portlet:renderURL var="addBranchURL">
	<portlet:param name="mvcPath" value="/html/bankbranch/add.jsp" />
</portlet:renderURL>

<liferay-portlet:renderURL varImpl="iteratorURL">
       <liferay-portlet:param name="mvcPath" value="/html/bankbranch/view.jsp" />
</liferay-portlet:renderURL>
<aui:button href="<%= addBranchURL.toString() %>"  value="add-bank-branch"></aui:button>


<%
//orderByCol is the column name passed in the request while sorting
String orderByCol = ParamUtil.getString(request, "orderByCol"); 
 
//orderByType is passed in the request while sorting. It can be either asc or desc
String orderByType = ParamUtil.getString(request, "orderByType");
String sortingOrder = orderByType;
//Logic for toggle asc and desc
if(orderByType.equals("desc")){
    orderByType = "asc";
}else{
    orderByType = "desc";
}
 
if(Validator.isNull(orderByType)){
    orderByType = "desc";
}
 
%>


<liferay-ui:search-container orderByType="<%=orderByType %>"  iteratorURL="<%= iteratorURL %>" emptyResultsMessage="empty-bank-branches" delta="5" deltaConfigurable="true"  total="<%= BankBranchLocalServiceUtil.getActiveBankBranchesCount() %>">
<liferay-ui:search-container-results  >  
<%
List<BankBranch> branches = BankBranchLocalServiceUtil.getActiveBankBranchesByStatus(searchContainer.getStart(), searchContainer.getEnd());
List<Object> transactionPmtBankIds = PaymentTransactionUtil.getTransactionsRecordedProjections("pmtBranchId");
if(transactionPmtBankIds != null){
	for(Object o : transactionPmtBankIds){
		if(o!=null){
			String transactionPmtBankId = (String)o;
			for(BankBranch bankBranch: branches){
				if(transactionPmtBankId.equals(bankBranch.getStcBranchCode())){
					bankBranch.setPaymentTransactionRecorded(true);
				}
			}
		}
	}
	
}


List<BankBranch> sortableBranches = new ArrayList<BankBranch>(branches);
if(Validator.isNotNull(orderByCol)){
    //Pass the column name to BeanComparator to get comparator object
    BeanComparator comparator = new BeanComparator(orderByCol);
    if(sortingOrder.equalsIgnoreCase("asc")){
         
        //It will sort in ascending order
        Collections.sort(sortableBranches, comparator);
    }else{
        //It will sort in descending order
        Collections.reverse(sortableBranches);
    }

}

searchContainer.setResults(sortableBranches);

%>

</liferay-ui:search-container-results>  
  <liferay-ui:search-container-row
        className="com.stc.echannels.epayments.model.BankBranch"
        keyProperty="stcBranchCode"
        modelVar="bankBranch" >   
    <liferay-ui:search-container-column-text   name="stc-branch-code" value="<%=bankBranch.getStcBranchCode() %>"  />          
	<liferay-ui:search-container-column-text   name="bank-stc-code" value="<%=bankBranch.getStcBankCode() %>"  />
	<liferay-ui:search-container-column-text   name="bank-name-english" value="<%=bankBranch.getBankNameEn() %>"  />
	<liferay-ui:search-container-column-text   name="channel-name-en" value="<%=bankBranch.getPaymentChannelNameEn() %>"  />
	
	<portlet:actionURL name="deleteBankBranch" var="deleteBankBranchURL" >
		<portlet:param name="transId" value="<%=bankBranch.getTransId() %>"/>
	</portlet:actionURL>
	<%	String deleteConfirm = "javascript:confirmDel('"+deleteBankBranchURL.toString()+"','"+bankBranch.isPaymentTransactionRecorded() +"')";  %>
	
	<liferay-ui:search-container-column-text   align="right">
		<liferay-ui:icon-menu>
	    	<liferay-ui:icon image="delete" url="<%=deleteConfirm %>" />
		</liferay-ui:icon-menu>		
	</liferay-ui:search-container-column-text>
	
</liferay-ui:search-container-row>
    <liferay-ui:search-iterator searchContainer="<%= searchContainer %>" paginate="true" />
</liferay-ui:search-container>

<script type="text/javascript">

function confirmDel(url,isPaymentTransactionRecorded) {
	if(isPaymentTransactionRecorded == 'false') {
		var x = confirm('<liferay-ui:message key="delete-branch-confirm-message"/>');
		if(x){
			window.location.href =url;
		}else{
			return;
		}
	} else {
		alert('<liferay-ui:message key="delete-branch-alert-message"/>');
		return;
	}
}

</script>

