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

import java.util.List;
import java.util.UUID;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.cp.CpConstants;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.PaymentMethod;
import com.stc.echannels.epayments.model.TransactionStatus;
import com.stc.echannels.epayments.service.base.PaymentMethodLocalServiceBaseImpl;
import com.stc.echannels.exceptions.IntegrityViolationException;

/**
 * The implementation of the payment method local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.PaymentMethodLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.PaymentMethodLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil
 */
public class PaymentMethodLocalServiceImpl
	extends PaymentMethodLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil} to access the payment method local service.
	 */
	
	public PaymentMethod addPaymentMethod ( 
		      String descriptiveNameEN,String descriptiveNameAR, String pmtMethodIdType,
		        ServiceContext serviceContext)
		    throws PortalException, SystemException {
			
			
			
	  		
			long pmtMethodId = counterLocalService.increment(PaymentMethod.class.getName());
		    //User user = userPersistence.findByPrimaryKey(userId);
			String transId=(UUID.randomUUID()).toString();
			PaymentMethod method = paymentMethodPersistence.create(pmtMethodId);
			//method.setPmtMethodId(pmtMethodId);
			method.setDescriptiveNameEn(descriptiveNameEN);
			method.setDescriptiveNameAr(descriptiveNameAR);
			
			method.setPmtMethodIdType(pmtMethodIdType);
		 
		 /*************/   
		    AuditUtil.setAudit(method, AuditUtil.OPERATION_ADD, serviceContext);
		   
		    /*************/ 
		    super.addPaymentMethod(method);

		    return method;
	}
	public List<PaymentMethod> findAll()  throws PortalException	, SystemException
	{
		//return paymentMethodPersistence.findByActive(AuditUtil.IS_ACTIVE);
		return paymentMethodPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
	}
	public PaymentMethod getPaymentMethodByType(String paymentMethodType)  throws PortalException	, SystemException
	{
		return paymentMethodPersistence.findByPmtMethodIdType(paymentMethodType,AuditUtil.STATUS_ACTIVE).get(0);
	}
	

}