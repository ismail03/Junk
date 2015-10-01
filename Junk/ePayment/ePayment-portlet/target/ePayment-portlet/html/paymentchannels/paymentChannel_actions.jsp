<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>


<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request
            .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    PaymentChannel channel = (PaymentChannel) row.getObject();
	
    String transId = channel.getTransId();
    String name = PaymentChannel.class.getName();
   
	ThemeDisplay td1  =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
    String redirect = PortalUtil.getLayoutURL(td1.getLayout(), td1);
	 String  pmtid =  ParamUtil.getString(request, "pmtid");
	 String bsrid= ParamUtil.getString(request, "bsrid");
%>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editURL">
        <portlet:param name="mvcPath" value="/html/paymentchannels/edit_channel.jsp" />
        <portlet:param name="transId" value="<%= transId %>" />
       
        <portlet:param name="pmtid" value='<%= (pmtid!=null && !pmtid.trim().equals("") )? pmtid:"empty"%>' />
          <portlet:param name="bsrid" value='<%= (bsrid!=null && !bsrid.trim().equals("") )? bsrid:"bsempty"%>' />
    </portlet:renderURL>

    <liferay-ui:icon  message="Edit" src="/ePayment-portlet/html/paymentchannels/images/editpmt.png" url="<%= editURL.toString() %>" />

    <portlet:actionURL name="deleteChannel" var="deleteURL">
        <portlet:param name="transId" value="<%= transId %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:actionURL>
    
    <%	String deleteConfirm = "javascript:confirmDel('"+deleteURL.toString()+"','"+channel.isPaymentTransactionRecorded() +"')";  %>
    <liferay-ui:icon message="Delete" src="/ePayment-portlet/html/paymentchannels/images/deletepmt.png" url="<%=deleteConfirm %>" />
</liferay-ui:icon-menu>


<script type="text/javascript">

function confirmDel(url,isPaymentTransactionRecorded) {
	if(isPaymentTransactionRecorded == 'false') {
		var x = confirm('<liferay-ui:message key="delete-channel-confirm-message"/>');
		if(x){
			window.location.href =url;
		}else{
			return;
		}
	} else {
		alert('<liferay-ui:message key="delete-channel-alert-message"/>');
		return;
	}
}

</script>
