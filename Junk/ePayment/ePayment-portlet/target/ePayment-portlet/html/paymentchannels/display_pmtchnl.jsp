<%@page import="java.util.Collections"%>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.model.PaymentChannel"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<portlet:defineObjects/>

<% 
List<PaymentChannel> channellist = (List<PaymentChannel>)request.getAttribute("pmtcnllist");
String bsr = (String)request.getAttribute("bsrvs");
String dispBrscolunm =(String)request.getAttribute("dispBrscolunm");
if(channellist!=null && channellist.size()>0){
	
	  BeanComparator comparator = new BeanComparator("channelType");
Collections.sort(channellist,comparator); 

}
%>
<aui:layout>
<aui:column>
<aui:button-row>
    <portlet:renderURL var="addChannelURL">
        <portlet:param name="mvcPath" value="/html/paymentchannels/edit_channel.jsp" />
       
    </portlet:renderURL>

    <aui:button onClick="<%= addChannelURL.toString() %>" value="add-channel" />
</aui:button-row>
</aui:column>
</aui:layout>
<aui:layout >
<aui:column cssClass="all-table-headers-bold">
<liferay-ui:search-container   emptyResultsMessage="empty-payment-channels"   total="<%=channellist.size() %>">
    <liferay-ui:search-container-results results="<%=channellist %>" >
      </liferay-ui:search-container-results>

    <liferay-ui:search-container-row
        className="com.stc.echannels.epayments.model.PaymentChannel"
        keyProperty="transId"
        modelVar="channel" escapedModel="<%= true %>"
    >
   

        <liferay-ui:search-container-column-text
            name="channel-type"
            value="<%= channel.getChannelType() %>"
        />
   		<liferay-ui:search-container-column-text
            name="channel-name-ar"
            value="<%= channel.getDescriptiveNameAr() %>"
        />
        <liferay-ui:search-container-column-text
            name="channel-name-en"
            value="<%= channel.getDescriptiveNameEn() %>"
        />
        
        <% if(Validator.isNotNull(dispBrscolunm) && dispBrscolunm.trim().equals("yes") ){%>
<liferay-ui:search-container-column-text
            name="Business Services"
           
        >
        <% if(bsr.equals("Not Available")){
        	
        	%> <%=bsr %> <% 
        }else{
        	
        String[] businesssrv =	bsr.split(StringPool.COLON);
        	for(String s:businesssrv){
        		%>
        		
        		<%=s %></br>
        		<%
        	}
        }%>
        
</liferay-ui:search-container-column-text>
<% }%>
      <liferay-ui:search-container-column-jsp
    align="right"
    path="/html/paymentchannels/paymentChannel_actions.jsp"
/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator  paginate="false" />
</liferay-ui:search-container>
</aui:column>
</aui:layout>