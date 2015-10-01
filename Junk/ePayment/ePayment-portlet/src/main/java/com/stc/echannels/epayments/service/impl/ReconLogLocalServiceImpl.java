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
import com.stc.echannels.epayments.model.ReconLog;
import com.stc.echannels.epayments.service.base.ReconLogLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

/**
 * The implementation of the recon log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.ReconLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.ReconLogLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.ReconLogLocalServiceUtil
 */
public class ReconLogLocalServiceImpl extends ReconLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.ReconLogLocalServiceUtil} to access the recon log local service.
	 */
	
	public List findTransactions( 
		      String serviceId, String date, 
		      String paymentStatus, String pmtBankId ,Locale locale)
		    throws PortalException, SystemException {
		System.out.println("bankId==============="+pmtBankId);
		System.out.println("language ====" +locale.getLanguage());
		String lang=locale.getLanguage().equals("en")?"En":"Ar";
		//(serviceId, transAmount, , paymentStatus, paymentChannel, paymentMethod, pmtBankId, beneficiaryId, beneficiaryServiceNo,
		// long serviceId,long transAmount,Date pmtReceivedDate,	      String epayTransId, String paymentStatus,String paymentChannel, String paymentMethod,	      String pmtBankId,String beneficiaryId,String beneficiaryServiceNo,
		String sql = " select distinct a, "+
					 " bank.name"+lang+", "+
					 " service.descriptiveName"+lang+", "+
					 " paymentMethod.descriptiveName, "+
					 " paymentChannel.descriptiveName"+lang+", " +
					 " c.transactionDate, "+
					 " c.epayTransId, "+ //prepaidTransId, "+
					 " b.cardGroup, " +
					 " b.serviceClass "+
					 " from ReconLog a, InRechargeHistory b, SddPayment c, " +
					 " Bank bank, PaymentMethod paymentMethod , PaymentChannel paymentChannel ,BusinessService service "+
					 " where a.paymentChannel=paymentChannel.channelType and "+
					 		" a.serviceId=service.serviceId and " +
					 		" a.paymentMethod = paymentMethod.pmtMethodId and "+
					 		" a.pmtBankId = bank.bankId and "+
					 		" a.bankTransId = c.bankTransId and "+
					 		" a.paymentSystemTransId = c.paymentSystemTransId and " +
					 		" c.epayTransId = b.transactionId (+) and "+
					 		" paymentChannel.status='"+AuditUtil.STATUS_ACTIVE+"' and "+
					 		" service.status='"+AuditUtil.STATUS_ACTIVE+"'"+" and "+
					 		" bank.status='"+AuditUtil.STATUS_ACTIVE+"'"+
				 (paramExists(serviceId)?" and a.serviceId = '"+serviceId+"' ":"") +
				 (paramExists(paymentStatus)?" and a.paymentStatus = '"+paymentStatus+"' ":"") +
				 (paramExists(pmtBankId)?" and a.pmtBankId = '"+pmtBankId+"' ":"") +
				 (paramExists(date)?" and to_char(a.bankTransDate, 'MM/DD/YYYY') = '"+date+"' ":"")+
				" ";	 
		
		 sql+=" order by c.transactionDate, a.pmtBankId ";
		//sql+=paramExists(orderBy)?" order by sddpayment."+orderBy+" " +orderType:"";
		System.out.println(sql);
		try {
		Query query = reconLogPersistence.getCurrentSession().createQuery(sql);
		
		System.out.println("SIZE: "+query.list().size());
		return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<ReconLog>();
	}
	
	
	private boolean paramExists(String s) {
		return !(StringUtils.isEmpty(s) || CpConstants.DEFAULT.equals(s)); 
	}

}