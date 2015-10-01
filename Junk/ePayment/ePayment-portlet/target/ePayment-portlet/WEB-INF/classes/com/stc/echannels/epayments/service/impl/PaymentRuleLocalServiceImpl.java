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

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;

import stc.com.echannels.util.DataFormatterUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.model.PaymentRule;
import com.stc.echannels.epayments.model.impl.PaymentRuleImpl;
import com.stc.echannels.epayments.service.base.PaymentRuleLocalServiceBaseImpl;

/**
 * The implementation of the payment rule local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.PaymentRuleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.PaymentRuleLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil
 */
public class PaymentRuleLocalServiceImpl extends PaymentRuleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil} to access the payment rule local service.
	 */
	
	public java.util.List<com.stc.echannels.epayments.custommodel.PaymentRuleListModel> findActivePaymentRuleByServiceType(
			java.lang.Long serviceTypeId, int start, int end)
			throws com.liferay.portal.kernel.exception.SystemException{
		return getPaymentRuleFinder().findActivePaymentRuleByServiceType(serviceTypeId, start, end);
		
 	}
	
	public PaymentRule fetchByRuleIdAndTransId(long ruleId, String transId) throws SystemException {
		return getPaymentRulePersistence().fetchByRuleIdAndTransId(ruleId, transId);
	}
	
	
	public Long findCountActivePaymentRuleByServiceType(Long serviceTypeId) 
			throws com.liferay.portal.kernel.exception.SystemException{
		return getPaymentRuleFinder().findCountActivePaymentRuleByServiceType(serviceTypeId);
	}
	
	
	public void updatePaymentRuleDefaultValue(Long ruleId,String transId, String defaultValue, String userId,ServiceContext serviceContext) throws SystemException {
		final PaymentRule paymentRuleDB = fetchByRuleIdAndTransId(ruleId, transId);
		final PaymentRule paymentRuleClone = new PaymentRuleImpl();
		
		try {
			BeanUtils.copyProperties(paymentRuleClone, paymentRuleDB);
		} catch (IllegalAccessException e) {
			throw new SystemException(e);
		} catch (InvocationTargetException e) {
			throw new SystemException(e);
		}
		
		paymentRuleDB.setStatus("INACTIVE");
		getPaymentRulePersistence().update(paymentRuleDB);
		
		final Integer maxRuleId = getPaymentRuleFinder().findMaxRuleId();
		paymentRuleClone.setRuleId(maxRuleId + 1);
		paymentRuleClone.setValue(defaultValue);
		paymentRuleClone.setLastUpdateUserid(String.valueOf(serviceContext.getUserId()));
		paymentRuleClone.setStatus(AuditUtil.STATUS_ACTIVE);
		paymentRuleClone.setLastUpdateTimestamp(new Date());
		paymentRuleClone.setOperation(AuditUtil.OPERATION_ADD);
		paymentRuleClone.setEffectiveTimestamp(new Date());
		paymentRuleClone.setClientIP(serviceContext.getRemoteAddr());
		paymentRuleClone.setServerIP(serviceContext.getRequest().getLocalAddr());
		paymentRuleClone.setUserAgent(serviceContext.getUserAgent());
		paymentRuleClone.setLastUpdateUsername(userId);
		getPaymentRuleLocalService().addPaymentRule(paymentRuleClone);
	}
}