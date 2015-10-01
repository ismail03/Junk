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

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.model.TransactionStatus;
import com.stc.echannels.epayments.service.base.TransactionStatusLocalServiceBaseImpl;

/**
 * The implementation of the transaction status local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.TransactionStatusLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.TransactionStatusLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.TransactionStatusLocalServiceUtil
 */
public class TransactionStatusLocalServiceImpl
	extends TransactionStatusLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *<column name="name" db-name="NAME" type="String"  />
		<column name="description" db-name="DESCRIPTIOM" type="String"  />
		<column name="serviceId" db-name="SERVICE_ID" type="long"/>

	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.TransactionStatusLocalServiceUtil} to access the transaction status local service.
	 */
	
	public TransactionStatus addTransactionStatus( 
			String name, String description, 
		         ServiceContext serviceContext)
		    throws PortalException	, SystemException {

		   // User user = userPersistence.findByPrimaryKey(userId);

		    long id = counterLocalService.increment(TransactionStatus.class.getName());

		    TransactionStatus status = transactionStatusPersistence.create(id);
		    status.setDescription(description);
		    

		    super.addTransactionStatus(status);

		    return status;
		}
	public List<TransactionStatus> findAll()  throws PortalException	, SystemException
	{
		return transactionStatusPersistence.findAll();
	}
	
	
	
}