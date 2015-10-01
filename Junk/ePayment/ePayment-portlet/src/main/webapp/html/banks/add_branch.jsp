<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<%@page import="com.stc.echannels.epayments.service.BankBranchLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.BankLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.Bank"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.BankBranch"%>
<%@page import="com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.PaymentSystem"%>

<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />
<portlet:resourceURL var="validationUrl">
<portlet:param name="formtype" value="bankBranch"/>
<portlet:param name="fieldName" value="fempty"/>
<portlet:param name="fieldvalue" value="fvempty"/>
<portlet:param name="bnkid" value="bempty"/>
<portlet:param name="cacheresolver" value="init"/>
</portlet:resourceURL>
<%
    BankBranch branch = null;
    List<PaymentChannel> channels = PaymentChannelLocalServiceUtil.getPaymentChannels();
    List<PaymentChannel> sortchannels = new ArrayList<PaymentChannel>();
    sortchannels.addAll(channels);
    BeanComparator comparator = new BeanComparator("descriptiveNameEn");
	 Collections.sort(sortchannels,comparator);
    List<Bank> banks = BankLocalServiceUtil.getBanks();
    String redirect = ParamUtil.getString(request, "redirect");
    String bankid = ParamUtil.getString(request,"bankId");
  
    String req =  ParamUtil.getString(request,"reqtype");
   String bsrid =  ParamUtil.getString(request,"bsrid");
   String transId = ParamUtil.getString(request,"transId");
 Bank b=  BankLocalServiceUtil.getBank(transId);
%>

<aui:model-context bean="<%= branch %>" model="<%= BankBranch.class %>" />
<portlet:renderURL var="cancelURL" />
<portlet:renderURL var="viewBankURL" >
<portlet:param name="bankid" value="<%=bankid%>" />
<portlet:param name="reqtype" value="<%=req%>" />
<portlet:param name="bsrid" value="<%=bsrid%>" />
</portlet:renderURL>
<portlet:actionURL name="addBankBranch" var="addBranchURL" windowState="normal" />
<aui:layout>
<liferay-ui:header  backURL="<%= viewBankURL %>"   title='<%= LanguageUtil.get(portletConfig, locale, "add-bank-branch") %>' />

<aui:form action="<%= addBranchURL %>" method="POST" name="fm">

          <aui:input  name="bankId" type="hidden"  value="<%=bankid%>" />
          	  <aui:input  name="transId" type="hidden"  value="<%=transId%>" />
    <aui:fieldset>
   
        <%-- <aui:input name="redirect" type="hidden" value="<%= redirect %>" />
        <aui:input name="error" type="hidden" value="<%= redirect %>" /> --%>
      
          	
       
     
      
        <aui:input label="bank-name-en" name="bankName" type="text" readonly="true" value="<%=b.getNameEn()%>" />
       
        <aui:input label="stc-branch-code" name="stcBranchCode" type="text"  >
          	<aui:validator name="required" errorMessage="This field is required." />
        	 <aui:validator name="digits" errorMessage="must-be-digits" />
        
        	 <aui:validator name="custom" errorMessage="duplicate-branch-code">
			function (val, fieldNode, ruleValue) {
			var temp = false;
 			if (val == "") {
			temp = true;
			}else {
			 var url1 = '<%=validationUrl.toString()%>';
			url1 = url1.replace('fempty','stcbranchcode' );
			url1 = url1.replace('fvempty',val);
			url1 = url1.replace('init',Math.random()*99999);
			 $.ajax({
          type: 'POST',
          url: url1,
         cache: false,
        async: false,
          success: function(data) {
            var json = JSON.parse(data);
            var res = json.res;
            if(res === 'yes')
            temp = false;
            else
            temp = true;
          }
        });
					}
		
				return temp;
				}
			</aui:validator>
		
        	
        </aui:input>
                
        <liferay-ui:error key="duplicate-branch-code" message="duplicate-branch-code" />
         <aui:column columnWidth="35">
        <aui:select name="channelId" required="true" label="channel-name-en" onChange="pmtChnlChange(this);" id="pmtselect" inlineField="false" >
        	<aui:option label="select-payment-channel-type" value="" /> 
        	<% for (PaymentChannel pc: sortchannels) { %>
        		<aui:option label="<%=pc.getDescriptiveNameEn() %>" value="<%=pc.getChannelId() %>"  /> 
			<% } %>
        </aui:select>
        <div id="errmsg"  style="dispaly:block;"><span style="color:#b50303;">Branch with this Bank and Payment Channel combination already exists.</span> </div>
       
        
         <liferay-ui:error key="duplicate-payment-channel" message="duplicate-payment-channel" />
	</aui:column>
      
      </aui:fieldset>

    <aui:button-row>
       <aui:button onClick="<%= cancelURL%>"  type="cancel" />
        <aui:button type="submit" />

    </aui:button-row>
</aui:form>
</aui:layout>
<aui:script>

$( document ).ready(function() {
	$('#errmsg').hide();
	$('#<portlet:namespace />fm')
	.each(function(){
	    $(this).data('serialized', $(this).serialize())
	})
	.on('change input', function(){
	    $(this)             
	        .find('input:submit, button:submit')
	            .attr('disabled', $(this).serialize() == $(this).data('serialized'))
	    ;
	 })
	.find('input:submit, button:submit')
	    .attr('disabled', true)
	;

});
function pmtChnlChange(pmtid){
	
	if(pmtid.value!=''){
		
		 var url1 = '<%=validationUrl.toString()%>';
			url1 = url1.replace('fempty','pmtchnlid' );
			url1 = url1.replace('fvempty',pmtid.value );
			url1 = url1.replace('bempty','<%= bankid %>' );
			url1 = url1.replace('init',Math.random()*99999);
			 $.ajax({
       type: 'POST',
       url: url1,
      cache: false,
     async: false,
       success: function(data) {
         var json = JSON.parse(data);
         var res = json.res;
         if(res === 'yes'){
        		$('#errmsg').show();
        		 $("[id='<portlet:namespace />pmtselect'] option:selected").each(function (i,v) {
          			  $(this).removeAttr('selected');
          			//ur remove code here
          			});
          		 $('#<portlet:namespace />pmtselect').find('option:first').attr('selected', 'selected');
                
         }
         else{
        	 $('#errmsg').hide();
        	
         }
       }
     });
	}
	
}
</aui:script>
