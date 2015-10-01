<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<%@page import="java.util.Collections"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.stc.echannels.epayments.model.PaymentMethod"%>
<%@page import="com.stc.echannels.epayments.model.SrvTypes"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects />

<style>
.marginleft{
margin-left: 15px;
}

</style>


<% String bid =(String) request.getAttribute("businessServiceId");

int emptyCount = 0;
List<PaymentChannel> registeredpmtchannel = (List<PaymentChannel>)request.getAttribute("pmtChannelList");

if(registeredpmtchannel!=null && registeredpmtchannel.size()>0){
	
	  BeanComparator comparator = new BeanComparator("descriptiveNameEn");
Collections.sort(registeredpmtchannel,comparator); 
emptyCount++;
}

List<SrvTypes> registeredsrvtypes = (List<SrvTypes>)request.getAttribute("serviceTypsList");
if(registeredsrvtypes!=null && registeredsrvtypes.size()>0 ){
	 BeanComparator comparator = new BeanComparator("serviceNameEN");
	 Collections.sort(registeredsrvtypes,comparator);
	 emptyCount++;
}
List<PaymentMethod> registeredpmtmthd = (List<PaymentMethod>)request.getAttribute("pmtmthdList");
if(registeredpmtmthd!=null && registeredpmtmthd.size()>0){
	 BeanComparator comparator = new BeanComparator("descriptiveNameEn");
	 Collections.sort(registeredpmtmthd,comparator);
		emptyCount++;
}

%>


<aui:layout  >

		<aui:column columnWidth="30" cssClass="diabled-div all-table-headers-bold">
		
				<liferay-ui:search-container  total='<%=registeredpmtchannel.size() %>' emptyResultsMessage="reg-payment-channel-empty" >
 <liferay-ui:search-container-results results="<%=registeredpmtchannel %>"  >
   
    </liferay-ui:search-container-results>
 <liferay-ui:search-container-row   className="com.stc.echannels.epayments.model.PaymentChannel"  keyProperty="transId"
        modelVar="pmtchannel" escapedModel="<%= true %>">
      
       
   
<liferay-ui:search-container-column-text name="payment-channel" >                   
<aui:input name='<%="pmttypes:"+pmtchannel.getChannelId()%>' type="checkbox" label="<%= pmtchannel.getDescriptiveNameEn()%>"   
						value='false' checked='false'> </aui:input>


</liferay-ui:search-container-column-text>
</liferay-ui:search-container-row>
 <liferay-ui:search-iterator  paginate="false" />
</liferay-ui:search-container>
				
					
				
</aui:column>
<aui:column columnWidth="30" cssClass="marginleft diabled-div all-table-headers-bold" >

<liferay-ui:search-container   total='<%=registeredsrvtypes.size() %>'  emptyResultsMessage="reg-service-type-empty" >
 <liferay-ui:search-container-results results="<%=registeredsrvtypes %>"  >
   
    </liferay-ui:search-container-results>
 <liferay-ui:search-container-row   className="com.stc.echannels.epayments.model.SrvTypes"  keyProperty="serviceTypeId"
        modelVar="s" escapedModel="<%= true %>">
      
       
   
<liferay-ui:search-container-column-text  name="service-type"  >                   
<aui:input name='<%="srtypes:"+s.getServiceTypeId()%>' type="checkbox" label='<%= s.getServiceNameEN()%>'   value='false' checked='false' /> 
						

</liferay-ui:search-container-column-text>
</liferay-ui:search-container-row>
 <liferay-ui:search-iterator  paginate="false" />
</liferay-ui:search-container>
					
				
					

</aui:column>
<aui:column columnWidth="30" cssClass="marginleft diabled-div all-table-headers-bold" >

				 <liferay-ui:search-container   total='<%=registeredpmtmthd.size() %>'  emptyResultsMessage="reg-payment-method-empty" >
 <liferay-ui:search-container-results results="<%=registeredpmtmthd %>"  >
   
    </liferay-ui:search-container-results>
 <liferay-ui:search-container-row   className="com.stc.echannels.epayments.model.PaymentMethod"  keyProperty="pmtMethodId"
        modelVar="pm" escapedModel="<%= true %>">
      
       
   
<liferay-ui:search-container-column-text   name="payment-method" >                   
<aui:input name='<%="pmtMtdtypes:"+pm.getPmtMethodId()%>' type="checkbox" label="<%= pm.getDescriptiveNameEn()%>"  value='false' checked='false'> </aui:input>
						


</liferay-ui:search-container-column-text>
</liferay-ui:search-container-row>
 <liferay-ui:search-iterator  paginate="false" />
</liferay-ui:search-container>
					
					
				
 			
</aui:column>
</aui:layout>

<aui:script >

$(document).ready(function(){
	 var  emptycnt = '<%=emptyCount%>';
	 if(emptycnt==0){
		 
		 noBits=true;
	 }else{
		 noBits=false;
	 }


});
function albitsareUnchecked(){
	var temp = true;
	$("input[name$='Checkbox']").each(function(){
		if($(this).is(':checked') == true){
		temp=false;
		return temp;
	}
	});

	return temp;
}

</aui:script>