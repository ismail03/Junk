<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.Collections"%>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.stc.echannels.epayments.model.BankBranch"%>
<%@page import="com.stc.echannels.epayments.model.Bank"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>

<portlet:renderURL var="addBankURL">
        <portlet:param name="mvcPath" value="/html/banks/edit_bank.jsp" />
      
    </portlet:renderURL>
<% List<Bank> bank = (List<Bank>)request.getAttribute("banklist");
if(bank!=null && bank.size()>0){

BeanComparator comparator = new BeanComparator("bankId");
Collections.sort(bank,comparator); 
}
List<BankBranch> branches =(List<BankBranch>) request.getAttribute("branches");
String bsr = (String)request.getAttribute("buisnessService");
		
%>
<aui:layout>
<aui:column>
<aui:button-row>
   

    <aui:button onClick="<%= addBankURL.toString() %>" value="add-bank" />


</aui:button-row> 
</aui:column>
</aui:layout>
<aui:layout>
<aui:column cssClass="all-table-headers-bold">
	<liferay-ui:search-container  total='<%=bank.size() %>' emptyResultsMessage="No records found" >
 				<liferay-ui:search-container-results results="<%=bank %>"  >
   
   		 </liferay-ui:search-container-results>
  		<liferay-ui:search-container-row
        className="com.stc.echannels.epayments.model.Bank"
        keyProperty="transId"
        modelVar="bank1" escapedModel="<%= true %>"
    >
  
        <liferay-ui:search-container-column-text
            
            name="bank-sama-code"
            value='<%= String.valueOf(bank1.getBankId()) %>'
        />

        <liferay-ui:search-container-column-text
            name="bank-stc-code"
            value="<%= String.valueOf(bank1.getStcCode()) %>"
        />

        <liferay-ui:search-container-column-text
            name="bank-name-arabic"
            value="<%= bank1.getNameAr() %>"
        />
        
                <liferay-ui:search-container-column-text
            name="bank-name-english"
            value="<%= bank1.getNameEn() %>"
        /> <liferay-ui:search-container-column-text
            name="Business Services"
           
        >
        <% if(bsr.equals("Not Available")){
        	
        	%> <%=bsr %> <% 
        }else{
        	
        String[] businesssrv =	bsr.split(StringPool.COLON);
        	for(String s:businesssrv){
        		%>
        		
        		<%=s %></br>
        		<%
        	}
        }%>
        
</liferay-ui:search-container-column-text>
      <liferay-ui:search-container-column-jsp
    align="right"
    path="/html/banks/bank_actions.jsp"
/>

    </liferay-ui:search-container-row>
 <liferay-ui:search-iterator  paginate="false" />
</liferay-ui:search-container>
</aui:column>
</aui:layout>

<%if(Validator.isNotNull(branches)) {%>


<aui:layout>
<aui:column cssClass="all-table-headers-bold" >
<liferay-ui:search-container    emptyResultsMessage="empty-bank-branches"   total="<%= branches.size() %>" >
<liferay-ui:search-container-results results="<%=branches %>" >  

</liferay-ui:search-container-results>  
  <liferay-ui:search-container-row
        className="com.stc.echannels.epayments.model.BankBranch"
        keyProperty="stcBranchCode"
        modelVar="bankBranch" >   
    <liferay-ui:search-container-column-text   name="stc-branch-code" value="<%=bankBranch.getStcBranchCode() %>"  />          
	<%-- <liferay-ui:search-container-column-text   name="bank-stc-code" value="<%=bankBranch.getStcBankCode() %>"  />
	<liferay-ui:search-container-column-text   name="bank-name-english" value="<%=bankBranch.getBankNameEn() %>"  /> --%>
	<liferay-ui:search-container-column-text   name="channel-name-en" value="<%=bankBranch.getPaymentChannelNameEn() %>"  />
	
	
	
	<liferay-ui:search-container-column-text   align="right">
		<liferay-ui:icon-menu>
		<portlet:actionURL name="deleteBankBranch" var="deleteBankBranchURL" >
		<portlet:param name="transId" value="<%=bankBranch.getTransId() %>"/>
	</portlet:actionURL>
	<%

	String deleteConfirm = "javascript:confirmDel('"+deleteBankBranchURL.toString()+"','"+bankBranch.isPaymentTransactionRecorded() +"')";  %>
		
	    	<liferay-ui:icon message="Delete" src="/ePayment-portlet/html/banks/images/deleteBank.png" url="<%=deleteConfirm %>" />
		</liferay-ui:icon-menu>		
	</liferay-ui:search-container-column-text>
	
</liferay-ui:search-container-row>
    <liferay-ui:search-iterator  paginate="false" />
</liferay-ui:search-container>


</aui:column>
</aui:layout>


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
<% } %>