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
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.model.NotifConfig;
import com.stc.echannels.epayments.model.NotifParam;
import com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.base.NotifConfigLocalServiceBaseImpl;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The implementation of the notif config local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.NotifConfigLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.NotifConfigLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil
 */
public class NotifConfigLocalServiceImpl extends NotifConfigLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil} to access the notif config local service.
	 */
	
	private List<NotifConfig> replicate(long notifId, String operation, ServiceContext serviceContext) throws PortalException, SystemException
	{
		
		NotifConfig oldRecord= NotifConfigLocalServiceUtil.getNotifConfig(notifId);
		//oldRecord= this.getNotifConfig((oldRecord.getNotifId()));
		
		long newNotifId= counterLocalService.increment(NotifConfig.class.getName());
	    NotifConfig obj = notifConfigPersistence.create(newNotifId);
      
		obj.setDecriptiveNameAr(oldRecord.getDecriptiveNameAr());
		obj.setDecriptiveNameEn(oldRecord.getDecriptiveNameEn());
		obj.setServiceId(oldRecord.getServiceId());
		obj.setNotifName(oldRecord.getNotifName());
		
		obj.setEnabled(oldRecord.getEnabled());
		String newTransId=(UUID.randomUUID()).toString();
		obj.setTransId(newTransId);
		
		obj.setMsgAr(oldRecord.getMsgAr());
		obj.setMsgEn(oldRecord.getMsgEn());
		
		obj.setParam1(oldRecord.getParam1());
		obj.setParam2(oldRecord.getParam2());
		obj.setParam3(oldRecord.getParam3());
		obj.setParam4(oldRecord.getParam4());
		obj.setParam5(oldRecord.getParam5());
        
		AuditUtil.delete(oldRecord); 
		AuditUtil.setAudit(obj, operation, serviceContext);
		    
		List<NotifConfig> list = new ArrayList<NotifConfig>();
		list.add(oldRecord);
		list.add(obj);
        
		return list;
	}
	
	
	
	/*
	 * SAMA_BANK_CODE, BANK_NAME_EN, BANK_NAME_AR, 
   STC_BANK_CODE, COMMENTS, BANK
	 */
	public NotifConfig addNotifConfig( long serviceId,String enabled,String notifName,String msgEn,String msgAr, String decriptiveNameEn, String decriptiveNameAr,
			String param1,String param2,String param3,String param4,String param5,
		       ServiceContext serviceContext)
		    throws PortalException	, SystemException {

		String transId=(UUID.randomUUID()).toString();

		long notifId= counterLocalService.increment(NotifConfig.class.getName());
	    NotifConfig notifConfig = notifConfigPersistence.create(notifId);
	  
	    
	    notifConfig.setTransId(transId);
	   
	    notifConfig.setServiceId(serviceId);
	    notifConfig.setEnabled(enabled);
	    notifConfig.setNotifName(notifName);
	    
	    notifConfig.setDecriptiveNameAr(decriptiveNameAr);
	    notifConfig.setDecriptiveNameEn(decriptiveNameEn);
	   
	    notifConfig.setMsgAr(msgAr);
	    notifConfig.setMsgEn(msgEn);
	    
	    notifConfig.setParam1(param1);
	    
	    notifConfig.setParam2(param2);
	   
	    notifConfig.setParam3(param3);
	    notifConfig.setParam4(param4);
	    notifConfig.setParam5(param5);
	  

	    
	    AuditUtil.setAudit(notifConfig, AuditUtil.OPERATION_ADD, serviceContext);
	    
	    super.addNotifConfig(notifConfig);

	    return notifConfig;
	}
	

	public NotifConfig updateNotifConfig( long notifId, String enabled,String msgEn,String msgAr, 
			List<String> arParams,List<String> enParams,
		       ServiceContext serviceContext)
	    throws PortalException, SystemException {

		List<NotifConfig> list = this.replicate(notifId, AuditUtil.OPERATION_UPDATE, serviceContext);
		System.out.println("***************** notif id = "+notifId);
		
	    NotifConfig notifConfig = list.get(AuditUtil.NEW_RECORD);
	    String param1= null; //arParams.get(0);
	    String param2=null; //arParams.get(1);
	    String param3=null; //arParams.get(2);
	    String param4=null; //arParams.get(3);.pr
	    String param5=null; //arParams.get(4);
	    
	    
	   for(int i=0;i<arParams.size();i++)
	    {
	    	String nameAr=arParams.get(i);
	    	//NotifParam notifParam= notifParamPersistence.findByNameAr(nameAr).get(0);
	    	switch(i)
	    	{
	    		case 0:{param1=arParams.get(0);msgAr=msgAr.replaceAll("\\{"+nameAr+"\\}", "\\{0\\}");break;}
	    		case 1:{param2=arParams.get(1);msgAr=msgAr.replaceAll("\\{"+nameAr+"\\}", "\\{1\\}");break;}
	    		case 2:{param3=arParams.get(2);msgAr=msgAr.replaceAll("\\{"+nameAr+"\\}", "\\{2\\}");break;}
	    		case 3:{param4=arParams.get(3);msgAr=msgAr.replaceAll("\\{"+nameAr+"\\}", "\\{3\\}");break;}
	    		case 4:{param5=arParams.get(4);msgAr=msgAr.replaceAll("\\{"+nameAr+"\\}", "\\{4\\}");break;}
	    	}
	    		
	    
	    }
	   
	    System.out.println("+++++msgEn+++++======="+msgEn);
	    for(int i=0;i<enParams.size();i++)
	    {
	    	String nameEn=enParams.get(i);
	    	//NotifParam notifParam= notifParamPersistence.findByNameEn(nameEn).get(0);
	    	
	    	String paramString ="{"+nameEn+"}";
	    	System.out.println("+++++nameEn+++++======="+ paramString);
	    	switch(i)
	 
	    	{
	    	case 0:{param1=enParams.get(0);msgEn=msgEn.replaceAll("\\{"+nameEn+"\\}", "\\{0\\}");break;}
    		case 1:{param2=enParams.get(1);msgEn=msgEn.replaceAll("\\{"+nameEn+"\\}", "\\{1\\}");break;}
    		case 2:{param3=enParams.get(2);msgEn=msgEn.replaceAll("\\{"+nameEn+"\\}", "\\{2\\}");break;}
    		case 3:{param4=enParams.get(3);msgEn=msgEn.replaceAll("\\{"+nameEn+"\\}", "\\{3\\}");break;}
    		case 4:{param5=enParams.get(4);msgEn=msgEn.replaceAll("\\{"+nameEn+"\\}", "\\{4\\}");break;}
	    	}
	    		
	    
	    }
	    System.out.println("+++++msgAr+++++======="+msgAr);
	    System.out.println("+++++msgEn+++++======="+msgEn);
	     
	    
	    

	    notifConfig.setEnabled(enabled);
	  
	    notifConfig.setMsgAr(msgAr);
	    notifConfig.setMsgEn(msgEn);
	    notifConfig.setParam1(param1);
	    
	    notifConfig.setParam2(param2);
	   
	    notifConfig.setParam3(param3);
	    notifConfig.setParam4(param4);
	    notifConfig.setParam5(param5);

	    AuditUtil.setAudit(notifConfig, AuditUtil.OPERATION_UPDATE, serviceContext);
	    
	    super.updateNotifConfig(list.get(AuditUtil.OLD_RECORD));
	    super.addNotifConfig(notifConfig);
	    return notifConfig;
	}
	
	
	public List<NotifConfig> getNotifConfigs() throws SystemException {
		 return notifConfigPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
	}
	
	public List<NotifConfig> findByServiceId(long serviceId,int start, int end) throws SystemException {
	    return notifConfigPersistence.findByServiceId(serviceId,AuditUtil.STATUS_ACTIVE,start,end);
	}
	
	public void deleteAll() throws SystemException {
		
		notifConfigPersistence.removeAll();
		
	
	}
	
	
	
}