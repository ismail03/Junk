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
import com.stc.echannels.epayments.model.PaymentSystem;
import com.stc.echannels.epayments.service.base.PaymentSystemLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the payment system local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.PaymentSystemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.PaymentSystemLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil
 */
public class PaymentSystemLocalServiceImpl
	extends PaymentSystemLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil} to access the payment system local service.
	 */
	
	public PaymentSystem addPaymentSystem( 
		      String systemName, String dateFormat,
		        long active, Date effectiveDate, ServiceContext serviceContext)
		    throws PortalException	, SystemException {

		   // User user = userPersistence.findByPrimaryKey(userId);

		    long paymentSystemId = counterLocalService.increment(PaymentSystem.class.getName());

		    PaymentSystem system = paymentSystemPersistence.create(paymentSystemId);
		    system.setSystemName(systemName);
		    system.setDateFormat(dateFormat);
		    system.setActive(AuditUtil.STATUS_ACTIVE);
		    system.setLastUpdateTimestamp(new Date());
		    system.setEffectiveTimestamp(effectiveDate);

		    super.addPaymentSystem(system);

		    return system;
		}
	public List<PaymentSystem> getPaymentSystems() throws SystemException {
		//return paymentChannelPersistence.findAll();
	    return paymentSystemPersistence.findByActive(AuditUtil.STATUS_ACTIVE);
	}

}