package com.stc.echannels.epayments.cp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang.StringUtils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.PortletPreferences;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.model.NotifParam;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.NotifParamLocalServiceUtil;
import com.stc.echannels.epayments.service.impl.AuditUtil;

/**
 * Portlet implementation class NotifConfigs
 */
public class NotifConfigs extends MVCPortlet {

	Log log = LogFactoryUtil.getLog(NotifConfigs.class);

	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					NotifConfigs.class.getName(), renderRequest);
			}
			catch(Exception e)
			{e.printStackTrace();}
		
		super.doView(renderRequest, renderResponse);
	}

	public void viewParamConfig(ActionRequest request,ActionResponse response)
		    throws Exception {
		log.info("**********************************************");
		String serviceId=ParamUtil.getString(request, "serviceId");

		log.info("*********************ServiceId*************************"+serviceId);
		
		if (!StringUtils.isEmpty(serviceId)) {
			response.setRenderParameter("serviceId",""+ serviceId);
			request.setAttribute("serviceId", ""+serviceId);
			javax.portlet.PortletPreferences prefs = request.getPreferences();
			prefs.setValue("serviceId", ""+serviceId);
			prefs.store();
		}
	}
	
	public void saveNotification(ActionRequest request, ActionResponse response) 
				throws Exception {
		log.info("!!!!!!!!!!!!!!!!!!!!!");
		String en = ParamUtil.getString(request, "msgEn");
		String ar = ParamUtil.getString(request, "msgAr");
		log.info(ar);
		String transId = ParamUtil.getString(request, "transId");
		String enabled = ParamUtil.getString(request, "enabled");
		long serviceId = ParamUtil.getLong(request, "serviceId");
		long notifId = ParamUtil.getLong(request, "notifId");
		log.info("*********************ServiceId*************************"+serviceId);
		log.info("*********************notifParamId*************************"+notifId);
		
		//response.setRenderParameter("serviceId",""+ serviceId);
		request.setAttribute("serviceId", ""+serviceId);
		javax.portlet.PortletPreferences prefs = request.getPreferences();
		prefs.setValue("serviceId", ""+serviceId);
		prefs.store();
		
		List<String> arList = new ArrayList<String>();
		Pattern pattern = Pattern.compile("\\{(.*?)\\}");
		Matcher matcher = pattern.matcher(ar);
		while (matcher.find()) {
			log.info(matcher.group(1));
			arList.add(matcher.group(1));
		}
		
		if (arList.size() > 5) {
			// set error
			SessionErrors.add(request, "tooManyParamsAr");
			return;
		}

		List<String> enList = new ArrayList<String>();
		matcher = pattern.matcher(en);
		while (matcher.find()) {
			enList.add(matcher.group(1));
		}
		
		if (enList.size() > 5) {
			// set error
			SessionErrors.add(request, "tooManyParamsEn");
			return;
		}
		
		if ( enList.size() != arList.size()) {
			SessionErrors.add(request, "paramterNumberDefers");
			log.info("Parameters size defers");
			return;
		}else {
			
			for (String str : enList){
				if (!arList.contains(str)) {
					SessionErrors.add(request, "paramterDefers");
					log.info("Parameters list defers");
					return;
				}
			}
			
		}

		List<String> validParams = NotifParamLocalServiceUtil.getNotifParamNames(request.getLocale(), serviceId) ;
		for (String el: arList) {
			if (!validParams.contains(el)) {
				SessionErrors.add(request, "invalidParamsAr");
				log.info("!!!!!!Error Ar!!!!!!!!!!!!!!");
				return;				
			}
		}
		for (String el: enList) {
			if (!validParams.contains(el)) {
				SessionErrors.add(request, "invalidParamsEn");
				log.info("!!!!!!Error En!!!!!!!!!!!!!!");
				return;				
			}
		}
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(  NotifConfigs.class.getName(), request);
			
		NotifConfigLocalServiceUtil.updateNotifConfig(notifId, enabled, en, ar, arList, enList, serviceContext);
		 //response.setRenderParameter("jspPage", "/html/notifparamconfigs/view.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
