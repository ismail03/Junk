<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
    <script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<portlet:defineObjects />
<%  List<String> countries =(List<String>) renderRequest.getAttribute("countrieslist"); %>
This is the <b>Country code app</b> 

<portlet:actionURL var="getCountryDetails" name="getCurrencycode"></portlet:actionURL>

<form action="<%=getCountryDetails%>" method="post">

<input name='countryname' type="text" id="country"/>
<input  type="submit" value="getcurrencydetails"/>
</form>
 <script>
  $(function() {
    var availableTags = [
     <% for(String s:countries) {
    	 %> "<%=s%>",<%
    	 
     }%>
    ];
    $( "#country" ).autocomplete({
      source: availableTags
    });
  });
  </script>