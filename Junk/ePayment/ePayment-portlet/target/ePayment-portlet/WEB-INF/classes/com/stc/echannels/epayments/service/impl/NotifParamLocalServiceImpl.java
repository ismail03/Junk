/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.stc.echannels.epayments.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.model.NotifParam;
import com.stc.echannels.epayments.model.NotifParamSrv;
import com.stc.echannels.epayments.service.base.NotifParamLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.NotifParamSrvLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * The implementation of the notif param local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.NotifParamLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.NotifParamLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.NotifParamLocalServiceUtil
 */
public class NotifParamLocalServiceImpl extends NotifParamLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.NotifParamLocalServiceUtil} to access the notif param local service.
	 */

	Log log = LogFactoryUtil.getLog(NotifParamLocalServiceImpl.class);

	public NotifParam addNotifParam(  long paramId,String nameAr,String nameEn, String paramName,
		       ServiceContext serviceContext)
		    throws PortalException	, SystemException {
			
	
			
			NotifParam notifParam = notifParamPersistence.create(paramId);
			 
			 notifParam.setNameAr(nameAr);
			 notifParam.setNameEn(nameEn);
			 notifParam.setParamName(paramName);
			  		   
			   
			    super.addNotifParam(notifParam);

			    return notifParam;
		}
	
	public String getParamName(Locale locale,long notifParamId)   
	{
		NotifParam notifParam=this.getNotifParam(notifParamId);
		
		return locale.getLanguage().equals("en")?notifParam.getNameEn():notifParam.getNameAr();
	}
	

		
	public NotifParam getNotifParam(long notifParamId)   
	{
		System.out.println("notif Param Id =" +notifParamId);
		try {
			return notifParamPersistence.findByNotifParamId(notifParamId).get(0);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			
			return null;
			
		}
		
	}
	public List<NotifParam> getNotifParams(long serviceId) {
		List<NotifParam> list = new ArrayList<NotifParam>();
		List<NotifParamSrv> paramList = null;
		try {
			//paramList=notifParamSrvPersistence.findByServiceId(serviceId);
			paramList = NotifParamSrvLocalServiceUtil.findByServiceId(serviceId);
		}
		catch (SystemException e) {
			e.printStackTrace();
		}
		for (NotifParamSrv nps: paramList) {
			NotifParam np = this.getNotifParam(nps.getNotifParamId());
			list.add(np);
		}
		return list;
	}
	
	public List<String> getNotifParamNames(Locale locale,long serviceId)   
	{
		List<String> names=new ArrayList<String>();
		List<NotifParam> notifParams=this.getNotifParams(serviceId);
		for (NotifParam np: notifParams) {
			//names.add(locale.getLanguage().equals("en")?np.getNameEn():np.getNameAr());
			 names.add(np.getParamName());
			log.info("!!!!!!Erro!!!!!!!!!!!!!!"+ (locale.getLanguage().equals("en")?np.getNameEn():np.getNameAr() ));
		}
		return names;
	}
	
}