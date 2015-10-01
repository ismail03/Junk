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
import com.stc.echannels.epayments.model.RefundLog;
import com.stc.echannels.epayments.service.base.RefundLogLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import stc.com.echannels.util.eChannelsUtil;

/**
 * The implementation of the refund log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.RefundLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.RefundLogLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.RefundLogLocalServiceUtil
 */
public class RefundLogLocalServiceImpl extends RefundLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.RefundLogLocalServiceUtil} to access the refund log local service.
	 */
	
	public List findTransactions( 
		      String serviceId,String transAmount,String dateFrom, String dateTo,
		      String paymentChannel, String paymentMethod,
		      String pmtBankId,String beneficiaryId,String beneficiaryServiceNo, String refundStatus, Locale locale)
		    throws PortalException, SystemException {
		System.out.println("bankId==============="+pmtBankId);
		System.out.println("language ====" +locale.getLanguage());
		String lang=locale.getLanguage().equals("en")?"En":"Ar";

		String sql = "select distinct sddpayment, bank.name"+lang+" , service.descriptiveName"+lang+" ,paymentMethod.descriptiveName ,paymentChannel.descriptiveName"+lang+", "+//sddpayment.serviceId,sddpayment.transAmount,sddpayment.paymentStatus, paymentChannel.descriptiveNameEn ,paymentMethod.descriptiveName ,bank.nameEn ,sddpayment.beneficiaryId sddpayment.beneficiaryServiceNo"+
							" refundlog "+
		"from SddPayment sddpayment, Bank bank ,PaymentMethod paymentMethod , PaymentChannel paymentChannel ,BusinessService service, RefundLog refundlog, "+""
				+ "where sddpayment.epayTransId = refundlog.epayTransId and sddpayment.paymentChannel=paymentChannel.channelType and sddpayment.serviceId=service.serviceId and sddpayment.paymentMethod=paymentMethod.pmtMethodType and sddpayment.pmtBankId= bank.samaCode and paymentChannel.status='"+AuditUtil.STATUS_ACTIVE+"' and service.status='"+AuditUtil.STATUS_ACTIVE+"'"+" and bank.status='"+AuditUtil.STATUS_ACTIVE+"'"+
				 (paramExists(serviceId)?" and sddpayment.serviceId = '"+serviceId+"' ":"") +
				 (paramExists(refundStatus)?" and refundlog.status = '"+refundStatus+"' ":"") +
				 (paramExists(transAmount)?" and refundlog.amount = "+transAmount+" ":"") +
				 (paramExists(paymentChannel)?" and sddpayment.paymentChannel = '"+paymentChannel+"' ":"") +
				 (paramExists(paymentMethod)?" and sddpayment.paymentMethod = '"+paymentMethod+"' ":"") +
				 (paramExists(pmtBankId)?" and sddpayment.pmtBankId = '"+pmtBankId+"' ":"") +
				 (paramExists(beneficiaryId)?" and sddpayment.beneficiaryId = '"+beneficiaryId+"' ":"") +
				 (paramExists(beneficiaryServiceNo)?" and sddpayment.beneficiaryServiceNo = '"+("966"+eChannelsUtil.normalizePhoneNumber(beneficiaryServiceNo))+"' ":"") +
				" ";	 
		
		/*
		 * 				json.put("pmtBankId", record.getString(1));
				json.put("serviceId", record.getString(2));
				json.put("paymentChannel", record.getString(3));
				json.put("paymentMethod", record.getString(4));
		 */

		if (paramExists(dateFrom) && paramExists(dateTo)) {
			String sqlDateFormat = CpConstants.DATE_TIME_FORMAT.replace("dd", "DD").replace("yyyy", "YYYY").replace("HH", "HH24").replace("mm", "MI").replace("ss", "SS");
			sql += " and sddpayment.transactionDate between to_date('"+dateFrom+" 00:00:00', '"+sqlDateFormat+"') and to_date('"+dateTo+" 23:59:59', '"+sqlDateFormat+"') ";
		}
		 sql+=" order by sddpayment.epayTransId ";
		//sql+=paramExists(orderBy)?" order by sddpayment."+orderBy+" " +orderType:"";
		System.out.println(sql);
		try {
		Query query = paymentTransactionsPersistence.getCurrentSession().createQuery(sql);
		
		System.out.println("SIZE: "+query.list().size());
		return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<RefundLog>();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<String> getRefundStatuses() {
		String sql = "select distinct a.status from RefundLog a";
		try {
			Query query = refundLogPersistence.getCurrentSession().createQuery(sql);
			
			System.out.println("SIZE of REfUND Statuses: "+query.list().size());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<String>();
	}


	private boolean paramExists(String s) {
		return !(StringUtils.isEmpty(s) || CpConstants.DEFAULT.equals(s)); 
	}


	
}