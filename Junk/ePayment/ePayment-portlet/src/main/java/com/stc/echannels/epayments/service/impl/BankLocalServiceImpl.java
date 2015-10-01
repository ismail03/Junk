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
import java.util.Locale;
import java.util.UUID;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.cp.CpConstants;
import com.stc.echannels.epayments.custommodel.BizRuleConfigModel;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.BankBranch;
import com.stc.echannels.epayments.model.impl.BankImpl;
import com.stc.echannels.epayments.service.BankLocalServiceUtil;
import com.stc.echannels.epayments.service.base.BankLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.persistence.BankFinder;
import com.stc.echannels.epayments.service.persistence.BankFinderUtil;
import com.stc.echannels.exceptions.IntegrityViolationException;

/**
 * The implementation of the bank local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.BankLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.BankLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.BankLocalServiceUtil
 */
public class BankLocalServiceImpl extends BankLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.BankLocalServiceUtil} to access the bank local service.
	 */
	Log log = LogFactoryUtil.getLog(BankLocalServiceImpl.class);
	private List<Bank> replicate(String transId, String operation, ServiceContext serviceContext) throws PortalException, SystemException
	{

		Bank oldRecord= BankLocalServiceUtil.fetchBank(transId);
		oldRecord= this.getBank(oldRecord.getTransId());
		String newTransId=(UUID.randomUUID()).toString();
		Bank obj = bankPersistence.create(newTransId);
		obj.setBankId(oldRecord.getBankId());
		AuditUtil.delete(oldRecord);
		AuditUtil.setAudit(obj, operation, serviceContext);

		obj.setStcCode(oldRecord.getStcCode());
		obj.setNameAr(oldRecord.getNameAr());
		obj.setNameEn(oldRecord.getNameEn());
		obj.setComments(oldRecord.getComments());

		List<Bank> list = new ArrayList<Bank>();
		list.add(oldRecord);
		list.add(obj);
		return list;
	}



	/*
	 * SAMA_BANK_CODE, BANK_NAME_EN, BANK_NAME_AR,
   STC_BANK_CODE, COMMENTS, BANK
	 */
	@Override
	public Bank addBank(  String bankId,String stcCode, String nameAr, String nameEn,String comments,
			ServiceContext serviceContext)
					throws PortalException	, SystemException {

		if (bankPersistence.countByBankId(bankId.toUpperCase(Locale.ENGLISH), AuditUtil.STATUS_ACTIVE) > 0)
		{
			log.info("Cann't add, this bank Same Bank code already exist ");
			throw new IntegrityViolationException(CpConstants.DUPLICATE_SAMA_BANK_CODE);
		}
		if (bankPersistence.countByStcCode(stcCode, AuditUtil.STATUS_ACTIVE) > 0)
		{
			log.info("Cann't add, this bank Same Bank code already exist ");
			throw new IntegrityViolationException(CpConstants.DUPLICATE_STC_BANK_CODE);
		}
		List<Bank> banks =bankPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		for(Bank b:banks){

			if((b.getNameAr().trim()).equals(nameAr.trim())){
				log.info("Cann't add. this bank Arabic name  already exist ");
				throw new IntegrityViolationException(CpConstants.DUPLICATE_BANK_AR);
			}
		}
		for(Bank b:banks){

			if((b.getNameEn().trim()).equalsIgnoreCase(nameEn.trim())){
				log.info("Cann't add. this bank English name  already exist ");
				throw new IntegrityViolationException(CpConstants.DUPLICATE_BANK_EN);
			}
		}
		String transId=(UUID.randomUUID()).toString();

		Bank bank = bankPersistence.create(transId);
		bank.setBankId(bankId.toUpperCase(Locale.ENGLISH));

		bank.setStcCode(stcCode);
		bank.setNameAr(nameAr);
		bank.setNameEn(nameEn);;
		bank.setComments(comments);

		AuditUtil.setAudit(bank, AuditUtil.OPERATION_ADD, serviceContext);
		super.addBank(bank);

		return bank;
	}


	@Override
	public Bank updateBank(String transId,
			String bankId,String stcCode, String nameAr, String nameEn,String comments,
			ServiceContext serviceContext)
					throws PortalException, SystemException {
		List<Bank> banks =bankPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		for(Bank b:banks){
			if(b.getTransId().equalsIgnoreCase(transId))
				continue;
			if((b.getNameAr().trim()).equals(nameAr.trim())){
				log.info("Cann't . this bank Arabic name  already exist ");
				throw new IntegrityViolationException(CpConstants.DUPLICATE_BANK_AR);
			}
		}
		for(Bank b:banks){
			if(b.getTransId().equalsIgnoreCase(transId))
				continue;
			if((b.getNameEn().trim()).equalsIgnoreCase(nameEn.trim())){
				log.info("Cann't add. this bank English name  already exist ");
				throw new IntegrityViolationException(CpConstants.DUPLICATE_BANK_EN);
			}
		}

		AuditUtil.validateUnique(bankPersistence.findByBankId(bankId.toUpperCase(Locale.ENGLISH), AuditUtil.STATUS_ACTIVE), transId, CpConstants.DUPLICATE_SAMA_BANK_CODE);
		AuditUtil.validateUnique(bankPersistence.findByStcCode(stcCode, AuditUtil.STATUS_ACTIVE), transId, CpConstants.DUPLICATE_STC_BANK_CODE);

		List<Bank> list = this.replicate(transId, AuditUtil.OPERATION_UPDATE, serviceContext);

		Bank obj = list.get(AuditUtil.NEW_RECORD);
		//	    obj.setTransId(transId);
		obj.setBankId(bankId);
		obj.setStcCode(stcCode);
		obj.setNameAr(nameAr);
		obj.setNameEn(nameEn);
		obj.setComments(comments);


		AuditUtil.setAudit(obj, AuditUtil.OPERATION_UPDATE, serviceContext);

		super.updateBank(list.get(AuditUtil.OLD_RECORD));

		super.addBank(obj);
		return obj;
	}


	@Override
	public List<Bank> getBanks() throws SystemException {
		return bankPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
	}
	@Override
	public List<Bank> getBanks(String status,int start, int end) throws SystemException {
		return bankPersistence.findByStatus(status,start,end);
	}

	@Override
	public List<BankBranch> getBankBranchs(String bankId) throws SystemException {
		return bankBranchPersistence.findByBankId(bankId,AuditUtil.STATUS_ACTIVE);
	}
	@Override
	public void deleteBanks()
			throws PortalException, SystemException {
		//PaymentChannel channel = paymentChannelPersistence.findByPrimaryKey(channelId);
		bankBranchPersistence.removeAll();
	}
	@Override
	public Bank deleteBank(String transId, ServiceContext serviceContext) throws PortalException, SystemException {
		List<Bank> list = this.replicate(transId, AuditUtil.OPERATION_DELETE, serviceContext);
		AuditUtil.delete(list.get(AuditUtil.NEW_RECORD));
		super.updateBank(list.get(AuditUtil.OLD_RECORD));

		super.addBank(list.get(AuditUtil.NEW_RECORD));
		return list.get(AuditUtil.NEW_RECORD);
	}

	@Override
	public Bank getBank(String transId)
			throws PortalException, SystemException {
		return bankPersistence.findByPrimaryKey(transId);
	}

	@Override
	public List<Bank> getBanksByServiceId(long serviceid){
		List l=	BankFinderUtil.getBanksByBusinessServiceId(serviceid);
		List<Bank> banks = new ArrayList<Bank>();
		Bank b = null;
		for(Object object:l){
			Object[] arrayobject=(Object[])object;

			b=(Bank)arrayobject[1];
			banks.add(b);
		}
		return banks;
	}
	@Override
	public boolean isSamaBankCodeExists(String samabnkcode) throws SystemException{

		if (bankPersistence.countByBankId(samabnkcode.toUpperCase(Locale.ENGLISH), AuditUtil.STATUS_ACTIVE) > 0)
		{
			log.info("Cann't add, this bank Same Bank code already exist ");
			return true;
		}
		return false;




	}
	@Override
	public boolean isStcBankCodeExists(String stcCode) throws SystemException{

		if (bankPersistence.countByStcCode(stcCode, AuditUtil.STATUS_ACTIVE) > 0)
		{
			log.info("Cann't add, this bank Same Bank code already exist ");
			return true;
		}


		return false;
	}

	@Override
	public boolean isEnnameExists(String nameEn,String transId) throws SystemException{
		List<Bank> banks =bankPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		if(transId.trim().equals("empty")){

			for(Bank b:banks){

				if((b.getNameEn().trim()).equalsIgnoreCase(nameEn.trim())){
					log.info("Cann't add. this bank English name  already exist ");
					return true;
				}
			}
		}else{
			for(Bank b:banks){
				if(b.getTransId().equalsIgnoreCase(transId))
					continue;
				if((b.getNameEn().trim()).equalsIgnoreCase(nameEn.trim())){
					log.info("Cann't update. this bank English name  already exist ");
					return true;
				}
			}
		}
		return false;
	}
	public boolean isArnameExists(String nameAr,String transId) throws SystemException{
		List<Bank> banks =bankPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		if(transId.trim().equals("empty")){

			for(Bank b:banks){

				if((b.getNameAr().trim()).equals(nameAr.trim())){
					log.info("Cann't add. this bank Arabic name  already exist ");
					return true;
				}
			}
		}else{
			for(Bank b:banks){
				if(b.getTransId().equalsIgnoreCase(transId))
					continue;
				if((b.getNameAr().trim()).equals(nameAr.trim())){
					log.info("Cann't update. this bank Arabic name  already exist ");
					return true;
				}
			}
		}
		return false;
	}
}

