
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="com.stc.echannels.epayments.model.BusinessSrv"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%


    List<BusinessSrv> services = BusinessSrvLocalServiceUtil.getBusinessServices();

    
%>

<portlet:actionURL name="viewSystemConfig"  var="viewSysConfigURL" >
</portlet:actionURL>

<aui:form action="<%= viewSysConfigURL %>" method="POST" name="fm">
    <aui:fieldset>
    	<aui:column first="true" columnWidth="35">
	    <aui:select name="serviceId">
        	<% for (BusinessSrv bs: services) { %>
        		<aui:option label="<%=bs.getName(locale) %>" value="<%=bs.getServiceId() %>" /> 
			<% } %>
        </aui:select>
        </aui:column>
    	<aui:column columnWidth="20">
    		<br>
	        <aui:button value="view" type="submit" />
	    </aui:column>
    </aui:fieldset>
</aui:form>


<div id="results"></div>

<portlet:resourceURL var="saveConfigUrl" id="saveConfig">
   <portlet:param name="configsData" value="AHMED" />

</portlet:resourceURL>

<aui:button-row>
    <aui:button value="button-save" id="saveConfigBtn" onClick="saveIt()"/>
</aui:button-row>

<div id="message"></div>


<aui:script use="aui-datatable">
	var columns = <%=renderRequest.getParameter("columns")%>;
	var data = <%=renderRequest.getParameter("data") %>;
	
	
	if (data) {
		table = new A.DataTable({
			columns: columns,
			data: data}
		).render("#results");
		
		table.delegate("click", function(e){
    		// undefined to trigger the emptyCellValue
    		var checked = e.target.get('checked')?"checked":undefined;
    		var target= e.target
      		record = this.getRecord(target);
    		column = this.getColumn(target);     
    		//alert ("Bank ID:" + record.get('id') + ", Channel:" +column._id)
		    // Don't pass `{silent:true}` if there are other objects in your app
		    // that need to be notified of the checkbox change.
		    record.set(column._id, checked, { silent: true }); 
		}, "input", table);		
	}	
	

	
</aui:script>

<aui:script>

	
	function saveIt() {

		if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-save-business-config") %>'))  {
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
			          $(".alert").removeClass("alert-success").addClass("alert-danger").html("Failure!");
			          alert('FAILURE') },  
			        success: function(data) {               
			              $(".alert").removeClass("alert-danger").addClass("alert-success").html("Success!")
			              alert('success');
			              }
			        }
			    });
			    
			    	});
	
			}
	}
	

	
	

</aui:script>