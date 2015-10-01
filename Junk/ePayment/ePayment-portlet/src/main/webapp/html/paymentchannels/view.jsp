<%@page import="java.util.Collections"%>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.stc.echannels.epayments.service.impl.AuditUtil"%>
<%@page import="com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.BusinessSrv"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:resourceURL var="getpmtchnlUrl" id="pmt" >
<portlet:param name="pmtid" value="empty" />
<portlet:param name="bsrid" value="bsempty" />
<portlet:param name="cacheResolver" value="init"/>
</portlet:resourceURL>
<portlet:defineObjects/>
<% 
String pmtid = ParamUtil.getString(request, "pmtid");
String bsid = ParamUtil.getString(request, "bsrid");
List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil.getBusinessServices();
List<BusinessSrv> sortbusinessServices = new ArrayList<BusinessSrv>();
sortbusinessServices.addAll(businessServices);
BeanComparator comparator = new BeanComparator("serviceNameEn");
Collections.sort(sortbusinessServices,comparator);
List<PaymentChannel> channels = PaymentChannelLocalServiceUtil.getPaymentChannels(AuditUtil.STATUS_ACTIVE,-1, -1);
List<PaymentChannel> sortchannels =new ArrayList<PaymentChannel>();
sortchannels.addAll(channels);
BeanComparator comparator1 = new BeanComparator("descriptiveNameEn");
Collections.sort(sortchannels,comparator1);
%>
<div id="msgSuccess" style="display:block">
<liferay-ui:success key="success-pmt" message="Your request completed successfully."  />
</div>
<aui:layout>
<aui:column columnWidth="25">
<aui:select name="businessservice" label="access-control-business-service"  onChange="onServiceTypeChange(this);" id="businessselect">

			<aui:option label="access-control-select-biz-service" value="0" />
						<% 
					for (BusinessSrv businessService : sortbusinessServices) {
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


<aui:select name="pmtchnl" label="Payment Channel"  onChange="onPmtchnlTypeChange(this);" id="pmtchselect">
<aui:option label="Select Payment Channel" value="0"></aui:option>

<%for(PaymentChannel p:sortchannels) {%>
<aui:option label="<%=p.getDescriptiveNameEn() %>" value="<%=p.getChannelId() %>"></aui:option>
<%} %>
</aui:select>
</aui:column>


</aui:layout>
<div id="include-jsp">
</div>


<script>
$(document).ready(function(){
	
	
	var pmtid ='<%=pmtid%>';
var bsid =	'<%=bsid%>';

	if(pmtid!='null' && pmtid!='' && pmtid!='empty'){
		 $('#<portlet:namespace />pmtchselect').val(pmtid);
		
		
		 var url = '<%=renderResponse.encodeURL(getpmtchnlUrl.toString())%>';
			
			
			url = url.replace('empty',pmtid );
			url =url.replace('init',Math.random()*99999);
			

			 $("#include-jsp").load(url);

	}else	if(bsid!='null' && bsid!='' && bsid!='bsempty'){
		 $('#<portlet:namespace />businessselect').val(bsid);
		
		
		 var url = '<%=renderResponse.encodeURL(getpmtchnlUrl.toString())%>';
			
			
			url = url.replace('bsempty',bsid );
			url =url.replace('init',Math.random()*99999);
			

			 $("#include-jsp").load(url);

	}

});

function onPmtchnlTypeChange(pmttype){
	$('#msgSuccess').hide();
	if(pmttype.value==0){
		$('#include-jsp').hide();
		
	}else{
		
		 $("[id='<portlet:namespace />businessselect'] option:selected").each(function (i,v) {
			  $(this).removeAttr('selected');
			//ur remove code here
			});
		 $('#<portlet:namespace />businessselect').find('option:first').attr('selected', 'selected');
	
	
		

		 var url = '<%=renderResponse.encodeURL(getpmtchnlUrl.toString())%>';
			
			var pmtid = pmttype.value;
			url = url.replace('empty',pmtid );
			url =url.replace('init',Math.random()*99999);
			

			 $("#include-jsp").load(url);
			 $('#include-jsp').show();
	}
	
}
function onServiceTypeChange(servicetype){
	$('#msgSuccess').hide();
	if(servicetype.value==0){
		
		$('#include-jsp').hide();
	}else{
		
		 $("[id='<portlet:namespace />pmtchselect'] option:selected").each(function (i,v) {
			  $(this).removeAttr('selected');
			
			});
		 $('#<portlet:namespace />pmtchselect').find('option:first').attr('selected', 'selected');
	
		
		 var url = '<%=renderResponse.encodeURL(getpmtchnlUrl.toString())%>';
			
			var srvid = servicetype.value;
			url = url.replace('bsempty',srvid );
			url =url.replace('init',Math.random()*99999);
			

			 $("#include-jsp").load(url);
			 $('#include-jsp').show();
	}
	
}


</script>