


<%@ include file="init.jsp" %>


<aui:script>
var allunchkd = false;
var inter=false;
var noBits=false;
function nonsadadSave(){
	var chckcount =0;
	var unchkcount =0;
	$('.unregistered-payment-global-check').each(function(){
		if($(this).is(':checked'))
			{
			chckcount++;
		
			
			}else{
					
				unchkcount++;
			}
		
	});

	
 if(unchkcount==3){
	 allunchkd=true;
		if(allunchkd){
			if(albitsareUnchecked()){
				
				allunchkd=true;
			}
			else{
				
				allunchkd=false;
				inter=true;
			}
		}
		
		
	}	else {
	inter=true;
	}
	var bussid = document.<portlet:namespace />fm.<portlet:namespace />businessServiceType.value; 
	 if(!bussid==0){
		
				 if(allunchkd==true){
							
										
										
											 var urlToSubmit = document.<portlet:namespace />fm.<portlet:namespace />jumbodisableService.value;
												document.<portlet:namespace />fm.action=urlToSubmit;
												document.<portlet:namespace />fm.submit();
							
		 }else if(inter==true) {
			
			 var urlToSubmit = document.<portlet:namespace />fm.<portlet:namespace />updateNonSadadUrl.value;
				document.<portlet:namespace />fm.action=urlToSubmit;
				document.<portlet:namespace />fm.submit();
		 }
		 
	 }
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


// end
function onServiceTypeChange(serviceType){
	$('#msgSuccess').hide();
	if(serviceType.value==0){
		 $("#sadad-no-results-found").hide();
		$("#enable-button-div").hide();
		
	
		document.<portlet:namespace />fm.<portlet:namespace />method.value=null; 
		
		
	}else if(serviceType.value.indexOf("SADAD") > 0){
		$("#enable-button-div").hide();
		$("#sadad-no-results-found").show();
		document.<portlet:namespace />fm.<portlet:namespace />method.value='viewsysconfig';
		submitViewSysConfig();
		
		
	}else{
		 $("#sadad-no-results-found").hide();
		if(document.getElementById('save-config-div')!=null){
			document.getElementById('save-config-div').style.display = 'none';
		}
		
		var disabledButton = $(serviceType).children(":selected").attr("id");
		var arr = disabledButton.split('--');

			var srid= serviceType.value;
		 
			 srid= srid.split(":")[0];
			 var url = '<%=renderResponse.encodeURL(saveConfigUrlx.toString())%>';
				
				
				url = url.replace('temp',srid );
			
				url =url.replace('init',Math.random()*99999);
				

				 $("#test-table").load(url, function() {
	                    
							$("#test-table").find('.table').each(function() {
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
	                    
							
							if(noBits==true)
							{
							$("#enable-button-div").hide();
							}else{
								
								$("#enable-button-div").show();
							}
							
	                }
						 
				 
				 
				 
				 );
		document.<portlet:namespace />fm.<portlet:namespace />method.value=null;
	}
	
	document.getElementById('results').innerHTML='';
}

function  changeValuesOfChids(chckboxes,prnt){

	$(chckboxes).each(function(i,v){
		
		if(prnt.is(':checked')){
			
			$(v).attr('checked', 'checked');
			Liferay.Util.updateCheckboxValue(v);
		
		}else{
			
			$(v).removeAttr('checked','checked');
			Liferay.Util.updateCheckboxValue(v);
		}
		
	});
}
function submitViewSysConfig(){
	var urlToSubmit = document.<portlet:namespace />fm.<portlet:namespace />viewSysConfigURL.value;
	document.<portlet:namespace />fm.action=urlToSubmit;
	document.<portlet:namespace />fm.submit();
}	


</aui:script>

<div id="msgSuccess" style="display:block">
<liferay-ui:success key="success-update" message='Your request completed successfully.'/>
</div>

<aui:fieldset>
<% List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil.getBusinessServices(); 

List<BusinessSrv>  sortbusinessServices =new ArrayList<BusinessSrv>();
sortbusinessServices.addAll(businessServices);

BeanComparator comparator = new BeanComparator("serviceNameEn");
Collections.sort(sortbusinessServices,comparator);
%>
<!-- first row -->

<aui:form method="POST" name="fm" >
<aui:input name="viewSysConfigURL" type="hidden" value="<%=viewSysConfigURL.toString()%>"  />
<aui:input name="updateNonSadadUrl" type="hidden" value="<%=updateNonSadadUrl.toString()%>"  />
	<aui:input name="disableServiceURL" type="hidden" value="<%=disableServiceURL%>" />
<aui:input name="enableBusinessService" type="hidden" value="<%=enableBusinessServiceURL%>" />
<aui:input name="jumbodisableService" type="hidden" value="<%=jumbodisableServiceURL%>" />
	<aui:input name="method" type="hidden" />
	<aui:layout>
<aui:column columnWidth="35">
		 <aui:select label="access-control-business-service" id="businessServiceType" name="businessServiceType" onChange="onServiceTypeChange(this);" >
				<aui:option label="access-control-select-biz-service" value="0" id="0--false--false--true"/>
					<%
					for (BusinessSrv businessService : sortbusinessServices) {
						boolean isBusinessServiceDisabled = EPayAccessControlLocalServiceUtil.isBusinessServiceDisabled(businessService.getServiceId());
						boolean isBusinessServiceDownHierarchyDisabled = EPayAccessControlLocalServiceUtil.isBusinessServiceDownHierarchyDisabled(businessService.getServiceId());
						String optionId = businessService.getServiceId()+"--"+isBusinessServiceDisabled+"--"+isBusinessServiceDownHierarchyDisabled+"--"+businessService.isEpayAccessControlPresent();
				%>
					<aui:option label="<%=businessService.getServiceNameEn()%>" id="<%= optionId%>" 
						value="<%=businessService.getServiceId()+BizRuleUtil.COLON+businessService.getServiceNameEn()%>"></aui:option>
				<%
					}
				%>
					
								</aui:select> 



</aui:column>


</aui:layout>




<div id="test-table"></div>
<div id="enable-button-div" class="hide-div"  style="display:none;">
 <aui:button-row>
        
        <aui:button type="button" onClick="<%=cancelURL%>" value="button-cancel" />
         <aui:button id ="save-btn" type="button" value="save-config" onClick="nonsadadSave()"/>
    </aui:button-row>
</div>
 </aui:form> 
 </aui:fieldset>
 <div id="results"></div>


<% if(ParamUtil.getString(renderRequest,"data","").equals("no-results-found")){%>

<div id="sadad-no-results-found" class="alert">
  <strong><liferay-ui:message key="access-control-sadad-no-sysconfig"></liferay-ui:message></strong>
</div>
<% }else if(!ParamUtil.getString(renderRequest,"data","").isEmpty()) { %>
	<div id="save-config-div">
	<aui:button-row>
		<aui:button onClick="<%=cancelURL%>" value="button-cancel" />
	    <aui:button value="save-config" id="saveConfigBtn" onClick="saveIt(this)"/>
	</aui:button-row>
	</div>
<%}
%>
<div id="message"></div>
 
 


<aui:script>
	var columns = <%=renderRequest.getParameter("columns")%>;
	var data = <%=renderRequest.getParameter("data") %>;
	
	AUI().use('aui-datatable','datatable-scroll', function(A){
		if (data) {
			table = new A.DataTable({
				columns: columns,
				data: data,
				scrollable: "x",
				width : "auto"
			}
			).render("#results");
			
			table.delegate("click", function(e){
	    		// undefined to trigger the emptyCellValue
	    		var checked = e.target.get('checked')?"checked":undefined;
	    		var target= e.target;
	      		record = this.getRecord(target);
	    		column = this.getColumn(target);     
	    		// alert ("Bank ID:" + record.get('id') + ", Channel:" +column._id)
			    // Don't pass `{silent:true}` if there are other objects in your app
			    // that need to be notified of the checkbox change.
			    record.set(column._id, checked, { silent: true }); 
			}, "input", table);		
		}	
	
	});
	

	</aui:script>

<aui:script>
	function saveIt(button) {
		if(document.getElementById('save-config-div')!=null){
			document.getElementById('save-config-div').style.display = 'block';
		}			
		$(button).attr('disabled','true');
		AUI().use('aui-io-request', function(A){
			
		var rs = table.get('data');
		
		var url = '<%=renderResponse.encodeURL(saveConfigUrl.toString())%>';
	
		
		url = url.replace('AHMED', JSON.stringify(rs));
		
			     A.io.request(url, {
			         data: JSON.stringify(rs),
			         type: "POST",
			         cache: false,
			         dataType: "json",
			         on:{ 
			         failure: function() {
			        	 alert("failure,cant make ajax call");
						},  
			         success: function(data) {  
			        	 window.location.href = "<%=cancelURL%>";
			              }
			        }
			    });
    	});
	}
	
	
	
	
		

</aui:script>
