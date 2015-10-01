<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="stc.com.echannels.util.BizRuleUtil"%>
<%@page import="com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil"%>
<%@page import="java.util.Collections"%>
<%@page import="org.apache.commons.beanutils.BeanComparator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="com.stc.echannels.epayments.model.BusinessSrv"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>


<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:actionURL name="updatedEpayAccessControl"  var="updateNonSadadUrl" >
</portlet:actionURL>
<portlet:actionURL name="viewSystemConfig"  var="viewSysConfigURL" >
</portlet:actionURL>

<portlet:actionURL name="disableService" var="disableServiceURL" />
<portlet:actionURL name="enableBusinessService" var="enableBusinessServiceURL" />
<portlet:resourceURL var="saveConfigUrl" id="saveConfig">
   <portlet:param name="configsData" value="AHMED" />
</portlet:resourceURL>
<portlet:actionURL name="jumbodisableService" var="jumbodisableServiceURL" />
<portlet:renderURL var="cancelURL"/>
<portlet:resourceURL var="saveConfigUrlx" id="saveConfigx" >
<portlet:param name="bsrid" value="temp"/>
<portlet:param name="cacheResolver" value="init"/>

</portlet:resourceURL>

<portlet:resourceURL var="saveConfigUrly" id="saveConfigy" >
<portlet:param name="bsrid" value="temp"/>
<portlet:param name="cacheResolver" value="init"/>
<portlet:param name="action" value="enable"/>
</portlet:resourceURL>