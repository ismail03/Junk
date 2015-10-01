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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import stc.com.echannels.util.DataFormatterUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.stc.echannels.epayments.cp.CpConstants;
import com.stc.echannels.epayments.model.BankBranch;
import com.stc.echannels.epayments.service.BankBranchLocalServiceUtil;
import com.stc.echannels.epayments.service.base.BankBranchLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.persistence.BankBranchFinderUtil;
import com.stc.echannels.exceptions.IntegrityViolationException;

/**
 * The implementation of the bank branch local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.BankBranchLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.BankBranchLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.BankBranchLocalServiceUtil
 */
public class BankBranchLocalServiceImpl extends BankBranchLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.BankBranchLocalServiceUtil} to access the bank branch local service.
	 */
	Log log = LogFactoryUtil.getLog(BankBranchLocalServiceImpl.class);
	private List<BankBranch> replicate(String transId, String operation, ServiceContext serviceContext) throws PortalException, SystemException
	{

		BankBranch oldRecord= BankBranchLocalServiceUtil.fetchBankBranch(transId);

		String newTransId=(UUID.randomUUID()).toString();
		BankBranch obj = bankBranchPersistence.create(newTransId);
		obj.setBankId(oldRecord.getBankId());
		obj.setStcBranchCode(oldRecord.getStcBranchCode());
		obj.setChannelId(oldRecord.getChannelId());
		AuditUtil.delete(oldRecord);
		AuditUtil.setAudit(obj, operation, serviceContext);

		List<BankBranch> list = new ArrayList<BankBranch>();
		list.add(oldRecord);
		list.add(obj);
		return list;
	}
	@Override
	public BankBranch addBankBranch(String bankId,String stcBranchCode, long channelId,
			ServiceContext serviceContext)
					throws PortalException	, SystemException {

		if (bankBranchPersistence.countByBankPaymentChannel(bankId, channelId, AuditUtil.STATUS_ACTIVE) > 0)
		{
			log.info("Cann't add this bankbranch - channel already exists in this bank ");
			throw new IntegrityViolationException(CpConstants.DUPLICATE_PAYMENT_CHANNEL);
		}

		if (bankBranchPersistence.countByBranchCodeAndStatus(stcBranchCode, AuditUtil.STATUS_ACTIVE)> 0)
		{
			log.info("Cann't add this bankbranch - branch code already exists ");
			throw new IntegrityViolationException(CpConstants.DUPLICATE_BRANCH_CODE);
		}

		String transId=(UUID.randomUUID()).toString();

		BankBranch bankBranch = bankBranchPersistence.create(transId);

		bankBranch.setStcBranchCode(stcBranchCode);
		bankBranch.setBankId(bankId);
		bankBranch.setChannelId(channelId);
		bankBranch.setLastUpdateTimestamp(new Date());
		bankBranch.setEffectiveTimestamp(DataFormatterUtil.getEffectiveDate());
		bankBranch.setLastUpdateUserid(serviceContext.getUserId() + "");
		bankBranch.setLastUpdateUsername(UserLocalServiceUtil.getUser(serviceContext.getUserId() ).getEmailAddress());
		bankBranch.setClientIp(serviceContext.getRemoteAddr());
		bankBranch.setServerIp(serviceContext.getRequest().getLocalAddr());
		bankBranch.setUserAgent(serviceContext.getUserAgent());

		//*************//
		AuditUtil.setAudit(bankBranch, AuditUtil.OPERATION_ADD, serviceContext);
		//*****************/
		super.addBankBranch(bankBranch);

		return bankBranch;
	}
	@Override
	public BankBranch deleteBankBranch(String transId,ServiceContext serviceContext)
			throws PortalException, SystemException {


		List<BankBranch> list = this.replicate(transId, AuditUtil.OPERATION_DELETE, serviceContext);
		AuditUtil.delete(list.get(AuditUtil.NEW_RECORD));
		super.updateBankBranch(list.get(AuditUtil.OLD_RECORD));
		super.addBankBranch(list.get(AuditUtil.NEW_RECORD));
		return list.get(AuditUtil.NEW_RECORD);

	}


	@Override
	public List<BankBranch> getActiveBankBranchesByStatus(int start, int end) throws SystemException {
		return BankBranchFinderUtil.findCustomBankBranchByStatus(AuditUtil.STATUS_ACTIVE, start, end);
	}

	@Override
	public Integer getActiveBankBranchesCount() throws SystemException {
		return BankBranchFinderUtil.getBankBranchCount(AuditUtil.STATUS_ACTIVE);
	}

	@Override
	public List<BankBranch> getBankBranchs(String bankId) throws SystemException {
		return bankBranchPersistence.findByBankId(bankId,AuditUtil.STATUS_ACTIVE);
	}
	@Override
	public boolean isStcBranchCodeExists(String stcBranchCode) throws SystemException{
		if (bankBranchPersistence.countByBranchCodeAndStatus(stcBranchCode, AuditUtil.STATUS_ACTIVE) > 0)
		{
			log.info("Cann't add this bankbranch - branch code already exists ");
			return true;
		}
		return false;
	}
	@Override
	public boolean isBankandPaymentChannelExists(String bankId, long channelId) throws SystemException{

		if (bankBranchPersistence.countByBankPaymentChannel(bankId, channelId, AuditUtil.STATUS_ACTIVE) > 0)
		{
			log.info("Cann't add this bankbranch - channel already exists in this bank ");
			return true;
		}
		return false;
	}
}