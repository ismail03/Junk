<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.stc.echannels.epayments.service.BankLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.Bank"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.BusinessSrv"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:resourceURL var="getBankBranchUrl" id="banks" >
<portlet:param name="bankid" value="empty"/>
<portlet:param name="bsrid" value="bsempty"/>
<portlet:param name="cacheResolver" value="init"/>
</portlet:resourceURL>
<portlet:defineObjects/>

<div id="msgSuccess" style="display:block">
<liferay-ui:success key="sucess-bank" message="Your request completed successfully." />
</div>
<% 
String reqtype = ParamUtil.getString(request, "reqtype");
String reqbankid =ParamUtil.getString(request, "bankid");
String bsrid =ParamUtil.getString(request, "bsrid");
List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil.getBusinessServices();
List<BusinessSrv> businessServices1= new ArrayList<BusinessSrv>();
businessServices1.addAll(businessServices);
List<Bank> banks = BankLocalServiceUtil.getBanks();
List<Bank> banks1 =new ArrayList<Bank>();
banks1.addAll(banks);
%>
<aui:layout>
<aui:column columnWidth="25" >
<aui:select name="businessservice" label="access-control-business-service"  onChange="onServiceTypeChange(this);" id="businessselect">

			<aui:option label="access-control-select-biz-service" value="0" />
						<% 
						 BeanComparator comparator = new BeanComparator("serviceNameEn");
						 Collections.sort(businessServices1,comparator);
						
					for (BusinessSrv businessService : businessServices1) {
%>
<aui:option label="<%=businessService.getServiceNameEn() %>" value="<%=businessService.getServiceId() %>"></aui:option>
<%} %>
</aui:select>
</aui:column>
<aui:column columnWidth="10">
<br>
<br>
&nbsp&nbsp<b>Or</b>
</aui:column>

<aui:column columnWidth="30" >


<aui:select name="Bank" label="Bank"  onChange="onBankTypeChange(this);" id="bankselect">
<aui:option label="Select Bank" value="0"></aui:option>

<%
BeanComparator comparator = new BeanComparator("nameEn");
Collections.sort(banks1,comparator);

for(Bank b:banks1) {%>
<aui:option label="<%=b.getNameEn() %>" value="<%=b.getBankId() %>"></aui:option>
<%} %>
</aui:select>
</aui:column>


</aui:layout>
<div id="loading-msg" style="display:block"> <b>Loading..</b></div>
<div id="include-jsp">


</div>

<script type="text/javascript">
 $(document).ready(function(){
	 $('#loading-msg').hide();
	var reqtype1 = '<%=reqtype%>';
	var bankid1 = '<%=reqbankid%>';
var bsid=	'<%=bsrid%>';
	if(reqtype1!='null' && reqtype1!='' && reqtype1=='bank'){
		 $('#<portlet:namespace />bankselect').val(bankid1);
		
		
		 var url = '<%=renderResponse.encodeURL(getBankBranchUrl.toString())%>';
			
			
			url = url.replace('empty',bankid1 );
			url =url.replace('init',Math.random()*99999);
			

			 $("#include-jsp").load(url);
	}
	
	if(reqtype1!='null' && reqtype1!='' && reqtype1=='bsvr'){
		 $('#<portlet:namespace />businessselect').val(bsid);
		
		 var url = '<%=renderResponse.encodeURL(getBankBranchUrl.toString())%>';
			
		
			url = url.replace('bsempty',bsid );
			url =url.replace('init',Math.random()*99999);
			

			 $("#include-jsp").load(url);
		
		
	}
});



function onBankTypeChange(banktype){
	$('#msgSuccess').hide();
	if(banktype.value==0){
		 $('#loading-msg').hide();
		$('#include-jsp').hide();
	}else{
		 $("[id='<portlet:namespace />businessselect'] option:selected").each(function (i,v) {
			  $(this).removeAttr('selected');
			//ur remove code here
			});
		 $('#<portlet:namespace />businessselect').find('option:first').attr('selected', 'selected');
		
		 $('#loading-msg').show();
	
		

		 var url = '<%=renderResponse.encodeURL(getBankBranchUrl.toString())%>';
			
			var bankid = banktype.value;
			url = url.replace('empty',bankid );
			url =url.replace('init',Math.random()*99999);
			

			 $("#include-jsp").load(url,function(){ $('#loading-msg').hide(); });
			 $('#include-jsp').show();
	}
	
}
function onServiceTypeChange(servicetype){
	$('#msgSuccess').hide();
	if(servicetype.value==0){
		 $('#loading-msg').hide();
		$('#include-jsp').hide();
		
	}else{
		 $("[id='<portlet:namespace />bankselect'] option:selected").each(function (i,v) {
			  $(this).removeAttr('selected');
			
			});
		 $('#<portlet:namespace />bankselect').find('option:first').attr('selected', 'selected');
		 $('#loading-msg').show();
		
		 var url = '<%=renderResponse.encodeURL(getBankBranchUrl.toString())%>';
			
			var srvid = servicetype.value;
			url = url.replace('bsempty',srvid );
			url =url.replace('init',Math.random()*99999);
			

			 $("#include-jsp").load(url,function(){ $('#loading-msg').hide(); });
			 $('#include-jsp').show();
	}
	
}

</script>