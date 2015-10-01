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

import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.stc.echannels.epayments.cp.CpConstants;
import com.stc.echannels.epayments.model.RefundReconLog;
import com.stc.echannels.epayments.service.base.RefundReconLogLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

/**
 * The implementation of the refund recon log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.RefundReconLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.RefundReconLogLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.RefundReconLogLocalServiceUtil
 */
public class RefundReconLogLocalServiceImpl
	extends RefundReconLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.RefundReconLogLocalServiceUtil} to access the refund recon log local service.
	 */
	
	public List findTransactions( 
		      String serviceId, String reconciliationDate,
		      String pmtBankId, String reconciliationType, Locale locale)
		    throws PortalException, SystemException {
		System.out.println("bankId==============="+pmtBankId);
		System.out.println("language ====" +locale.getLanguage());
		String lang=locale.getLanguage().equals("en")?"En":"Ar";
		/*
		RefundReconLog reconLog;
		reconLog.gets
		RefundLog refundLog;
		refundLog.getRefundId_();
		*/
		//reconLog.get
		//(serviceId, transAmount, , paymentStatus, paymentChannel, paymentMethod, pmtBankId, beneficiaryId, beneficiaryServiceNo,
		// long serviceId,long transAmount,Date pmtReceivedDate,	      String epayTransId, String paymentStatus,String paymentChannel, String paymentMethod,	      String pmtBankId,String beneficiaryId,String beneficiaryServiceNo,
		String sql = " select distinct a,"+
					 " b.epayTransId, "+
					 " b.submissionDate, " +
					 " bank.name"+lang+", "+
					 " service.descriptiveName"+lang+" "+
					 " from RefundReconLog a, RefundLog b, " +
					 " Bank bank, BusinessService service "+
					 
					 " where  a.pmtBankId = bank.samaCode and "+
					 		" a.serviceId=service.serviceId and " +
					 		" a.refundId = b.refundId and "+
					 		" service.status='"+AuditUtil.STATUS_ACTIVE+"'"+" and "+
					 		" bank.status='"+AuditUtil.STATUS_ACTIVE+"'"+
					 		
				 (paramExists(serviceId)?" and a.serviceId = '"+serviceId+"' ":"") +
				 (paramExists(reconciliationType)?" and a.reconciliationType = '"+reconciliationType+"' ":"") +
				 (paramExists(pmtBankId)?" and a.pmtBankId = '"+pmtBankId+"' ":"") +
				 (paramExists(reconciliationDate)?" and to_char(a.effDt, 'MM/DD/YYYY') = '"+reconciliationDate+"' ":"")+
				
				" ";	 

		System.out.println(sql);
		try {
		Query query = refundReconLogPersistence.getCurrentSession().createQuery(sql);
		
		System.out.println("SIZE: "+query.list().size());
		return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<RefundReconLog>();
	}
	
	
	private boolean paramExists(String s) {
		return !(StringUtils.isEmpty(s) || CpConstants.DEFAULT.equals(s)); 
	}

}