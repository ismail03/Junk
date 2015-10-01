/**
 * 
 */
package com.stc.echannels.epayments.cp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;
import com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URI;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class PaymentRulesConfigs extends MVCPortlet {
	Log log = LogFactoryUtil.getLog(PaymentRulesConfigs.class);


	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		super.doView(renderRequest, renderResponse);
	}
	
	public void updatePaymentRule(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException, IOException, PortalException{
		String transId = ParamUtil.getString(actionRequest, "transId");
		long ruleId=ParamUtil.getLong(actionRequest,"ruleId");
		String defaultValue =ParamUtil.getString(actionRequest,"defaultValue");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(PaymentRulesConfigs.class.getName(), actionRequest);
		PaymentRuleLocalServiceUtil.updatePaymentRuleDefaultValue(ruleId, transId, defaultValue, UserLocalServiceUtil.getUser(serviceContext.getUserId()).getEmailAddress(),serviceContext);
		// call webservice- 
		try {
			log.info(" Web Service call to payment reload");
			changeAccessControlTriggeerWebservice();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private void changeAccessControlTriggeerWebservice() throws URISyntaxException{
		String accessControlChangeWebserviceUrl = GetterUtil.getString(PortletProps.get( "biz-default-rule-change-webservice"));
		log.info(accessControlChangeWebserviceUrl);
		HttpHeaders requestHeaders=new HttpHeaders();
	    requestHeaders.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate rest = new RestTemplate();
		URI uriaccessControlChangeWebserviceUrl = new URI(accessControlChangeWebserviceUrl);
		rest.exchange(uriaccessControlChangeWebserviceUrl, HttpMethod.POST, new HttpEntity<Object>(requestHeaders), String.class);
		log.info(" Web Service call to payment reload : FINISH");
	}
}
