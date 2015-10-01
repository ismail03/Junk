<%@page import="com.stc.echannels.epayments.service.BankServicesLocalServiceUtil"%>
<%@page import="stc.com.echannels.util.BizRuleUtil"%>
<%@page import="com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.service.BankBranchLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page import="com.stc.echannels.epayments.service.BankLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.Bank"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="com.stc.echannels.epayments.model.*"%>
<liferay-theme:defineObjects />

<portlet:defineObjects />


<portlet:resourceURL var="validationUrl">
<portlet:param name="formtype" value="bank"/>
<portlet:param name="fieldName" value="fempty"/>
<portlet:param name="fieldvalue" value="fvempty"/>
<portlet:param name="cacheresolver" value="init"/>
</portlet:resourceURL>
 <portlet:resourceURL var="validationUrlName">
<portlet:param name="formtype" value="bank"/>
<portlet:param name="fieldName" value="fempty"/>
<portlet:param name="fieldvalue" value="fvempty"/>
<portlet:param name="cacheresolver" value="init"/>
<portlet:param name="transid" value="empty"/>
</portlet:resourceURL>
<%
    Bank bank = null;
 


    String transId = ParamUtil.getString(request,"transId");
    String bankId = ParamUtil.getString(request,"bankId");

    if (transId!=null && !transId.isEmpty()) {
    	bank = BankLocalServiceUtil.getBank(transId);
    	
    }

   String redirect = ParamUtil.getString(request, "redirect");
   
   
   final List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil.getBusinessServices();
   // 
%>

<aui:model-context bean="<%= bank %>" model="<%= Bank.class %>" />
<portlet:renderURL var="viewBankURL" />
<portlet:actionURL name='<%= bank == null ? "addBank" : "updateBank" %>' var="editBankURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewBankURL %>"
    title='<%= (bank != null) ?  LanguageUtil.get(portletConfig, locale, "edit-bank") : LanguageUtil.get(portletConfig, locale, "new-bank") %>'
/>
   <div id="bsr-table">
<aui:form  method="POST" name="fm" action="<%=editBankURL%>" id="fm">
    <aui:fieldset >
         <aui:input name="submitUrl" type="hidden" value="<%=editBankURL%>" />
        <aui:input name="transId" type="hidden" value="<%=transId%>" />
      
        <aui:input label="bank-sama-code" name="bankId"  type='<%= bank == null ? "text" : "hidden" %>' value='<%= bank == null ? "" : bank.getBankId() %>'>
        	<aui:validator name="required" errorMessage="field-required" />
        	<aui:validator name="maxLength" errorMessage="max-length">8</aui:validator>
        	<%if(bank == null) {%>
        	 <aui:validator name="custom" errorMessage="duplicate-sama-bank-code">
			function (val, fieldNode, ruleValue) {
			var temp = false;
 			if (val == "") {
			temp = true;
			}else {
			 var url1 = '<%=validationUrl.toString()%>';
			url1 = url1.replace('fempty','samabankcode' );
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
        <liferay-ui:error  key="duplicate-sama-bank-code" message="duplicate-sama-bank-code" rowBreak="" />
        <aui:input label="bank-stc-code" name="stcCode" type='<%= bank == null ? "text" : "hidden" %>' value='<%= bank == null ? "" : bank.getStcCode() %>' >
        	<aui:validator name="required" errorMessage="field-required" />
        	<aui:validator name="digits" errorMessage="must-be-digits" />
        	<aui:validator name="maxLength" errorMessage="max-length">5</aui:validator>
        	<%if(bank==null) {%>
        	 <aui:validator name="custom" errorMessage="duplicate-stc-bank-code">
			function (val, fieldNode, ruleValue) {
			var temp = false;
 			if (val == "") {
			temp = true;
			}else {
			 var url1 = '<%=validationUrl.toString()%>';
			url1 = url1.replace('fempty','stcbankcode' );
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
        <liferay-ui:error key="duplicate-stc-bank-code" message="duplicate-stc-bank-code" />

        <aui:input label="bank-name-arabic" name="nameAr"  type="text" value='<%= bank == null ? "" : bank.getNameAr() %>'>
        	<aui:validator  name="required" errorMessage="field-required" />
        	 <aui:validator name="custom" errorMessage="duplicate-bank-ar">
			function (val, fieldNode, ruleValue) {
			var temp = false;
 
			if (val == "") {
			temp = true;
			}else {
			 var url1 = '<%=validationUrlName.toString()%>';
			url1 = url1.replace('fempty','nameAr' );
			url1 = url1.replace('fvempty',val );
			url1 = url1.replace('empty','<%= bank == null ? "empty" : transId %>');
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
           <liferay-ui:error key="duplicate-bank-ar" message="duplicate-bank-ar" />
        <aui:input label="bank-name-english" name="nameEn"  type="text" value='<%= bank == null ? "" : bank.getNameEn() %>'>
          	<aui:validator name="required" errorMessage="field-required" />
          		 <aui:validator name="custom" errorMessage="duplicate-bank-en">
			function (val, fieldNode, ruleValue) {
			var temp = false;
 
			if (val == "") {
			temp = true;
			}else {
			 var url1 = '<%=validationUrlName.toString()%>';
			url1 = url1.replace('fempty','nameEn' );
			url1 = url1.replace('fvempty',val );
			url1 = url1.replace('empty','<%= bank == null ? "empty" : transId %>');
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
        	
          	
          	 <liferay-ui:error key="duplicate-bank-en" message="duplicate-bank-en" />
        </aui:input>
  
       <aui:input label="comments" name="comments"  type="text" value='<%= bank == null ? "" : bank.getComments() %>'/>
        
 
            
                  <%List<Long> existingBrs = new ArrayList<Long>();
                      if(bank!=null){
                    	List<BankServices> bsr = BankServicesLocalServiceUtil.getBanksIDsAssociatedWithBankServices(bank.getBankId());
                    	
                    	
                    	for(BankServices s:bsr){
                    		existingBrs.add(s.getServiceid());
                    	}
                      }
                  %>
                  
                  <aui:layout>
				<aui:column cssClass="all-table-headers-bold" columnWidth="30">
              <aui:field-wrapper name="businessSrvcheck" label="" >
                 
                   </aui:field-wrapper>
  
   <div class="dontshow" style="display:none;">
                    
                  <aui:input type="checkbox" name ="businessSrvcheck"  value="true" checked="true"  id="hide" label=" " />
                  </div>
               		<liferay-ui:search-container  total='<%=businessServices.size() %>' emptyResultsMessage="channel-empty"  >
 <liferay-ui:search-container-results results="<%=businessServices %>"  >
   
    </liferay-ui:search-container-results>
 <liferay-ui:search-container-row   className="com.stc.echannels.epayments.model.BusinessSrv"  keyProperty="serviceId"
        modelVar="businessService" escapedModel="<%= true %>">
      
       
   
<liferay-ui:search-container-column-text name="available-business-services" align="center"  >                   
<aui:input name="businessSrvcheck" type="checkbox" label="<%=businessService.getServiceNameEn()%>" 
						value='<%= bank == null ? "false" : (existingBrs.contains(businessService.getServiceId()))?"true":"false" %>' checked='<%= bank == null ? false : (existingBrs.contains(businessService.getServiceId()))?true:false %>'> </aui:input>

</liferay-ui:search-container-column-text>
</liferay-ui:search-container-row>
 <liferay-ui:search-iterator  paginate="false" />
</liferay-ui:search-container>
 <div id="errmsg"  style="dispaly:block;"><span style="color:#b50303;">Atleast one is required.</span> </div>
               </aui:column>
      
        </aui:layout>
                  
                
            
            
              
              
       
    </aui:fieldset>
  
    

  
      
   

    <aui:button-row >
         <aui:button onClick="<%= viewBankURL %>"  type="cancel" />
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

$(document).ready(function() {
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


