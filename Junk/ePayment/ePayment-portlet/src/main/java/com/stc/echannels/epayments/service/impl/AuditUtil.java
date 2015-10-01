package com.stc.echannels.epayments.service.impl;


import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.stc.echannels.epayments.cp.CpConstants;
import com.stc.echannels.epayments.model.CardGroup;
import com.stc.echannels.exceptions.IntegrityViolationException;

public class AuditUtil {
	

	public static final String OPERATION_ADD="ADD";
	public static final String OPERATION_UPDATE="UPDATE";
	public static final String OPERATION_DELETE="DELETE";
	public static final String STATUS_ACTIVE="ACTIVE";
	public static final String STATUS_INACTIVE="INACTIVE";
	public static final String STATUS_PENDING="PENDING";
	
	public static final int OLD_RECORD=0;
	public static final int NEW_RECORD=1;
		
	Log log = LogFactoryUtil.getLog(AuditUtil.class);
	public static  void setAudit(Object  object,String operation,ServiceContext serviceContext)
	{
		    
	try {             
		BeanUtils.setProperty(object, "status", STATUS_ACTIVE);
		BeanUtils.setProperty(object, "lastUpdateTimestamp", new Date());
		BeanUtils.setProperty(object, "effectiveTimestamp", new Date());
		BeanUtils.setProperty(object, "operation", operation);
		
		BeanUtils.setProperty(object, "clientIp", serviceContext.getRemoteAddr());
		
		BeanUtils.setProperty(object, "serverIp",serviceContext.getRequest().getLocalAddr());
		
		BeanUtils.setProperty(object, "userAgent",serviceContext.getUserAgent());
		
		long userId=serviceContext.getUserId();
		User user =UserLocalServiceUtil.getUser(userId);
		BeanUtils.setProperty(object, "lastUpdateUserid", ""+userId);
		BeanUtils.setProperty(object, "lastUpdateUsername", user.getEmailAddress());
		
		     } catch (Exception ex) {
		         ex.printStackTrace();
		     }
	
	return ;
	}
	
	public static void delete(Object  object)
	{
		try {
		BeanUtils.setProperty(object, "status", STATUS_INACTIVE);
		 } catch (Exception ex) {
	         ex.printStackTrace();
	     }
	}

	public static void validateUnique(List list, String transId, String message) {
		
		System.out.println("TransId="+transId);
		if (list.size()>0) {
			Object o = list.get(0);
			String t="";
			try {

				t=(String)BeanUtils.getProperty(o, "transId");
				System.out.println("in bean: " + t);
			} catch (Exception e) {
				// do nothing
				e.printStackTrace();
				return;
			}
			if (!transId.equals( t)) {
				throw new IntegrityViolationException(message);
			}
		}
	}
}
