<%@page import="java.util.ArrayList"%>
<%@page import="com.stc.echannels.epayments.model.PaymentChannelSr"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.stc.echannels.epayments.service.PaymentChannelSrLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>

<%@page import="com.stc.echannels.epayments.model.BusinessSrv"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />
<portlet:resourceURL var="validationUrl">
<portlet:param name="formtype" value="pmtchannel"/>
<portlet:param name="fieldName" value="fempty"/>
<portlet:param name="fieldvalue" value="fvempty"/>
<portlet:param name="cacheresolver" value="init"/>
</portlet:resourceURL>
 <portlet:resourceURL var="validationUrlName">
<portlet:param name="formtype" value="pmtchannel"/>
<portlet:param name="fieldName" value="fempty"/>
<portlet:param name="fieldvalue" value="fvempty"/>
<portlet:param name="cacheresolver" value="init"/>
<portlet:param name="transid" value="empty"/>
</portlet:resourceURL>

<%

    PaymentChannel channel = null;

    String transId = ParamUtil.getString(request, "transId");

    if (transId != null && !"".equals(transId)) {
        channel = PaymentChannelLocalServiceUtil.getPaymentChannel(transId);
    }
    final List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil.getBusinessServices();
 String pmtid = ParamUtil.getString(request, "pmtid");
String bsrid = ParamUtil.getString(request, "bsrid");
%>

<aui:model-context bean="<%= channel %>" model="<%= PaymentChannel.class %>" />
<portlet:renderURL var="viewPaymentChannelURL" >
<portlet:param name="pmtid" value='<%=pmtid%>' />
<portlet:param name="bsrid" value='<%=bsrid%>' />
</portlet:renderURL>
<portlet:renderURL var="cancelUrl" />
<portlet:actionURL name='<%= channel == null ? "addChannel" : "updateChannel" %>' var="editChannelURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewPaymentChannelURL %>"
    title='<%= (channel != null) ? LanguageUtil.get(portletConfig, locale, "edit-payment-channel"): LanguageUtil.get(portletConfig, locale, "new-payment-channel") %>'
/>

  <div id="bsr-table">
<aui:form action="<%= editChannelURL %>" method="POST" name="fm">
   
      <aui:fieldset>
       

        <aui:input name="transId" type="hidden" value='<%= channel == null ? "" : channel.getTransId() %>'/>

        <aui:input name="channelId" type="hidden" value='<%= channel == null ? "" : channel.getChannelId() %>'/>
        

        <aui:input label="channel-type"  name="channelType" type='<%= channel == null ? "text" : "hidden" %>' value='<%= channel == null ? "" : channel.getChannelType() %>' >
           	<aui:validator name="required" errorMessage="field-required" />
           	<aui:validator name="maxLength" errorMessage="max-length">15</aui:validator>
           		<%if(channel == null) {%>
        	 <aui:validator name="custom" errorMessage="duplicate-payment-channel">
			function (val, fieldNode, ruleValue) {
			var temp = false;
 			if (val == "") {
			temp = true;
			}else {
			 var url1 = '<%=validationUrl.toString()%>';
			url1 = url1.replace('fempty','channelType' );
			url1 = url1.replace('fvempty',val );
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
			<%} %>
        
        </aui:input>
        
        
        
        <liferay-ui:error key="duplicate-payment-channel" message="duplicate-payment-channel" />
        <aui:input label="channel-name-ar"  name="nameAr"  type="text" value='<%= channel == null ? "" : channel.getDescriptiveNameAr() %>'>
           	<aui:validator name="required" errorMessage="field-required" />
           
        	 <aui:validator name="custom" errorMessage="duplicate-payment-channel-arname">
			function (val, fieldNode, ruleValue) {
			var temp = false;
 			if (val == "") {
			temp = true;
			}else {
			 var url1 = '<%=validationUrlName.toString()%>';
			url1 = url1.replace('fempty','nameAr' );
			url1 = url1.replace('fvempty',val );
			url1 = url1.replace('empty','<%= channel == null ? "empty" : transId %>');
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
        <liferay-ui:error key="duplicate-payment-channel-arname" message="duplicate-payment-channel-arname" />
       
        <aui:input label="channel-name-en" name="nameEn"  type="text" value='<%= channel == null ? "" : channel.getDescriptiveNameEn() %>'>
        	<aui:validator name="required" errorMessage="field-required" />
        	 
        	 <aui:validator name="custom" errorMessage="duplicate-payment-channel-enname">
			function (val, fieldNode, ruleValue) {
			var temp = false;
 			if (val == "") {
			temp = true;
			}else {
			 var url1 = '<%=validationUrlName.toString()%>';
			url1 = url1.replace('fempty','nameEn' );
			url1 = url1.replace('fvempty',val );
			url1 = url1.replace('empty','<%= channel == null ? "empty" : transId %>');
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
		 <liferay-ui:error key="duplicate-payment-channel-enname" message="duplicate-payment-channel-enname" />

           
                   
                    
                   
                  <% List<Long> existingBrs = new ArrayList<Long>();
                      if(channel!=null){
                    	List<PaymentChannelSr> psr= PaymentChannelSrLocalServiceUtil.getBusinessServiceAssociatedWithPmtChannel(channel.getChannelId()+"");
                    	
                    	
                    	for(PaymentChannelSr s:psr){
                    		existingBrs.add(s.getServiceid());
                    	}
                      }
                  
					
				%>
				
				<aui:layout>
				<aui:column cssClass="all-table-headers-bold" columnWidth="30">
            
  
   <div class="dontshow" style="display:none;">
                      <aui:field-wrapper name="businessSrvcheck" label="available-business-services" helpMessage="Atleast one is required" >
                 
                   </aui:field-wrapper>
                  <aui:input type="checkbox" name ="businessSrvcheck"  value="true" checked="true"  id="hide" label=" " />
                  </div>
               		<liferay-ui:search-container  total='<%=businessServices.size() %>' emptyResultsMessage="channel-empty"  >
 <liferay-ui:search-container-results results="<%=businessServices %>"  >
   
    </liferay-ui:search-container-results>
 <liferay-ui:search-container-row   className="com.stc.echannels.epayments.model.BusinessSrv"  keyProperty="serviceId"
        modelVar="businessService" escapedModel="<%= true %>">
      
       
   
<liferay-ui:search-container-column-text name="available-business-services" align="center"  >                   
<aui:input name="businessSrvcheck" type="checkbox" label="<%=businessService.getServiceNameEn()%>"   
						value='<%= channel == null ? "false" : (existingBrs.contains(businessService.getServiceId()))?"true":"false" %>' checked='<%= channel == null ? false : (existingBrs.contains(businessService.getServiceId()))?true:false %>'> </aui:input>

</liferay-ui:search-container-column-text>
</liferay-ui:search-container-row>
 <liferay-ui:search-iterator  paginate="false" />
</liferay-ui:search-container>
	<div id="errmsg"  style="dispaly:block;"><span style="color:#b50303;">Atleast one is required.</span> </div>
               </aui:column>
      
        </aui:layout>
     
     </aui:fieldset>

            
         
    <aui:button-row>
      <aui:button onClick="<%= cancelUrl %>"  type="cancel" />
       <aui:button type="submit" value="Save" onClick="checkForbsr()" />

    </aui:button-row>
   
</aui:form>
  </div>
<aui:script>
function albsrareUnchecked(){
	var temp1 = true;
	
	$("input[name$='Checkbox']").each(function(i,v){
		
	
	if(i!=0)
		{
	if($(v).is(':checked') == true){
		temp1=false;
		return temp;
	}
		}		
	});
	

	return temp1;
}
function checkForbsr() {
	

if(albsrareUnchecked()){
	
	$('#errmsg').show();
}
else{
	$('#errmsg').hide();
}
}



function  changeValuesOfChids(chckboxes,prnt){

	$(chckboxes).each(function(i,v){
		
		if(prnt.is(':checked')){
			
			$(v).attr('checked', 'checked');
			Liferay.Util.updateCheckboxValue(v);
			$('#errmsg').hide();
		}else{
			
			$(v).removeAttr('checked','checked');
			Liferay.Util.updateCheckboxValue(v);
			$('#errmsg').show();
		}
		
	});
}
var changeParentCheckboxState = function(checkboxes, parent) {
    var checked = checkboxes.filter(':checked');

    if (checkboxes.length == checked.length) {
        //all checked. Set checked for global checkbox
        parent.prop('checked', true);
        parent.prop('indeterminate', false);
     
    } else if (checked.length == 0) {
        //there is no any checked checkboxes. Uncheck global checkbox
        parent.prop('checked', false);
        parent.prop('indeterminate', false);
       
    } else {
        //third state - some checked, some not
        parent.prop('indeterminate', true);
       
    }
};

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

	
	$("#bsr-table").find('.table').each(function() {
		var $this = $(this);
		var header = $this.find('.table-columns th');

		var newHeader = $('<span/>').append(header.html());
		header.empty();

		var checkbox = $('<input/>', {type:'checkbox', 'class': 'unregistered-payment-global-check', 'style': 'margin:0'}).appendTo($('<span/>').appendTo(header));
		header.append(newHeader);
		var childCheckboxes = $this.find('.table-data :checkbox');

		changeParentCheckboxState(childCheckboxes, checkbox);

		checkbox.on('change', function() {
			//on global checkbox change
		childCheckboxes.prop('checked', checkbox.is(':checked'));
	    changeValuesOfChids(childCheckboxes,checkbox);
		});

		childCheckboxes.on('change', function() {
			changeParentCheckboxState(childCheckboxes, checkbox);
		});
	});

	
	
});


AUI().use('aui-form-validator', 'aui-overlay-context-panel', function(A) {
	
    // Extending Alloy Default values for FormValidator RULES
    var DEFAULTS_FORM_VALIDATOR = A.config.FormValidator;
    A.mix(
          DEFAULTS_FORM_VALIDATOR.RULES,
        {
            requiredCheckbox:function (val, fieldNode, ruleValue) {
                var counter = 0;
                var nodeName = fieldNode.attr('name');
                var checkBoxes = A.all("input[name='" + nodeName + "']").val();
                for (var i = 0, len = checkBoxes.length; i < len; i++ ) {
                    if (checkBoxes[i] == 'true') {
                        counter++;
                        
                    };
                }
                
                return counter >= ruleValue;
            },
        },
        true
    );

    // Extending Alloy Default values for FormValidator STRINGS
    A.mix(
        DEFAULTS_FORM_VALIDATOR.STRINGS,
        {
            requiredCheckbox: '<liferay-ui:message key="required-at-least-one" />'
        },
        true
    );

    // Specify the form validation rules to be applied on this form
    var rules = {
       
        <portlet:namespace/>businessSrvcheck: {
            requiredCheckbox: 2
        }
    };

  // filedStrings to override the standard error msgs
    var fieldStrings = {
    };

    new A.FormValidator(
      {
        boundingBox: '#<portlet:namespace/>fm',
        fieldStrings: fieldStrings,
        rules: rules,
        showAllMessages: true
      }
    ); 
});   


</aui:script>