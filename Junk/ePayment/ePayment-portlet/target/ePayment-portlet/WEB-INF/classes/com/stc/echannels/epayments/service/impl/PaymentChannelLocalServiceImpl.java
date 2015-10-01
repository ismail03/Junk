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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.cp.CpConstants;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;
import com.stc.echannels.epayments.service.base.PaymentChannelLocalServiceBaseImpl;
import com.stc.echannels.exceptions.IntegrityViolationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/**
 * The implementation of the payment channel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.service.PaymentChannelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.PaymentChannelLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.service.PaymentChannelLocalServiceUtil
 */
public class PaymentChannelLocalServiceImpl
extends PaymentChannelLocalServiceBaseImpl {

	Log log = LogFactoryUtil.getLog(PaymentChannelLocalServiceImpl.class);


	private List<PaymentChannel> replicateChannel(String transId,String operation ,ServiceContext serviceContext) throws PortalException, SystemException
	{

		PaymentChannel oldRecord= PaymentChannelLocalServiceUtil.fetchPaymentChannel(transId);
		oldRecord= this.getChannel(oldRecord.getChannelId());

		String newTransId=(UUID.randomUUID()).toString();
		PaymentChannel channel = paymentChannelPersistence.create(newTransId);
		channel.setChannelId(oldRecord.getChannelId());
		AuditUtil.delete(oldRecord);
		AuditUtil.setAudit(channel, operation, serviceContext);

		channel.setChannelType(oldRecord.getChannelType());
		channel.setDescriptiveNameEn(oldRecord.getDescriptiveNameEn());
		channel.setDescriptiveNameAr(oldRecord.getDescriptiveNameAr());



		List<PaymentChannel> channelRecords=new ArrayList<PaymentChannel>();
		channelRecords.add(oldRecord);
		channelRecords.add(channel);
		return channelRecords;
	}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.service.PaymentChannelLocalServiceUtil} to access the payment channel local service.
	 */
	@Override
	public PaymentChannel addPaymentChannel(
			String channelType, String nameEn, String nameAr,
			ServiceContext serviceContext)
					throws PortalException, SystemException {

		if (paymentChannelPersistence.countByChannelType(channelType.toUpperCase(Locale.ENGLISH), AuditUtil.STATUS_ACTIVE) > 0) {
			log.info("Payment channel type already exists");
			throw new IntegrityViolationException(CpConstants.DUPLICATE_PAYMENT_CHANNEL);
		}
		List<PaymentChannel> channels = paymentChannelPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		for(PaymentChannel p:channels){
			if((p.getDescriptiveNameEn().trim()).equalsIgnoreCase(nameEn.trim())){
				log.info("Payment channel English Name  already exists");
				throw new IntegrityViolationException(CpConstants.DUPLICATE_PAYMENT_CHANNEL_EN_NAME);
			}

			if((p.getDescriptiveNameAr().trim()).equals(nameAr.trim())){
				log.info("Payment channel Arabic Name  already exists");
				throw new IntegrityViolationException(CpConstants.DUPLICATE_PAYMENT_CHANNEL_EN_NAME);
			}
		}


		long channelId = counterLocalService.increment(PaymentChannel.class.getName());
		//User user = userPersistence.findByPrimaryKey(userId);
		String transId=(UUID.randomUUID()).toString();
		PaymentChannel channel = paymentChannelPersistence.create(transId);

		channel.setChannelId(channelId);
		channel.setChannelType(channelType.toUpperCase(Locale.ENGLISH));
		channel.setDescriptiveNameEn(nameEn);
		channel.setDescriptiveNameAr(nameAr);

		/*************/
		AuditUtil.setAudit(channel, AuditUtil.OPERATION_ADD, serviceContext);

		/*************/
		super.addPaymentChannel(channel);

		return channel;
	}

	@Override
	public PaymentChannel updatePaymentChannel(String transId,
			String nameEn, String nameAr,
			ServiceContext serviceContext)
					throws PortalException, SystemException {
		List<PaymentChannel> channels = paymentChannelPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		for(PaymentChannel p:channels){
			if(p.getTransId().equalsIgnoreCase(transId))
				continue;

			if((p.getDescriptiveNameEn().trim()).equalsIgnoreCase(nameEn.trim())){
				log.info("Payment channel English Name  already exists");
				throw new IntegrityViolationException(CpConstants.DUPLICATE_PAYMENT_CHANNEL_EN_NAME);
			}

			if((p.getDescriptiveNameAr().trim()).equals(nameAr.trim())){
				log.info("Payment channel Arabic Name  already exists");
				throw new IntegrityViolationException(CpConstants.DUPLICATE_PAYMENT_CHANNEL_EN_NAME);
			}
		}

		List<PaymentChannel> channelRecords=this.replicateChannel(transId, AuditUtil.OPERATION_UPDATE, serviceContext);

		PaymentChannel channel = channelRecords.get(AuditUtil.NEW_RECORD);

		channel.setDescriptiveNameEn(nameEn);
		channel.setDescriptiveNameAr(nameAr);



		super.updatePaymentChannel(channelRecords.get(AuditUtil.OLD_RECORD));
		super.addPaymentChannel(channel);


		return channel;
	}

	@Override
	public List<PaymentChannel> getPaymentChannels() throws SystemException {
		return paymentChannelPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
	}

	@Override
	public List<PaymentChannel> getPaymentChannels(String status, int start, int end) throws SystemException {
		return paymentChannelPersistence.findByStatus(status,start,end);
	}


	@Override
	public PaymentChannel deleteChannel(String transId ,ServiceContext serviceContext)
			throws PortalException, SystemException {

		List<PaymentChannel> channelRecords=this.replicateChannel(transId, AuditUtil.OPERATION_DELETE, serviceContext);

		int sddPaymentsCount=0;//sddPaymentPersistence.countByPaymentChannel(channelRecords.get(AuditUtil.OLD_RECORD).getChannelType());
		if(sddPaymentsCount>0)
		{
			log.info("Can't  delete payment channel :"+channelRecords.get(AuditUtil.OLD_RECORD).getChannelType()+" while it has sddpayment linked to it");
			throw new IntegrityViolationException(CpConstants.PAYMENT_CHANNEL_ALREADY_USED);
		}

		PaymentChannel newRecord=channelRecords.get(AuditUtil.NEW_RECORD);
		AuditUtil.delete(newRecord);
		super.updatePaymentChannel(channelRecords.get(AuditUtil.OLD_RECORD));
		super.addPaymentChannel(newRecord);

		return channelRecords.get(AuditUtil.NEW_RECORD);
	}

	@Override
	public void deleteChannels()
			throws PortalException, SystemException {

		paymentChannelPersistence.removeAll();
	}
	@Override
	public PaymentChannel getChannel(long channelId)
			throws PortalException, SystemException {

		return paymentChannelPersistence.findByChannelId(channelId, AuditUtil.STATUS_ACTIVE).get(0);
	}
	@Override
	public PaymentChannel getChannelByType(String channelType)
			throws PortalException, SystemException {

		return paymentChannelPersistence.findByChannelType(channelType, AuditUtil.STATUS_ACTIVE).get(0);
	}
	public boolean isPmtchnlTypeExists(String channelType) throws SystemException{

		if (paymentChannelPersistence.countByChannelType(channelType.toUpperCase(Locale.ENGLISH), AuditUtil.STATUS_ACTIVE) > 0) {
			//	log.info("Payment channel type already exists");
			return true;
		}
		return false;
	}



	public boolean isEnnameExists(String nameEn,String transId) throws SystemException{
		List<PaymentChannel> channels = paymentChannelPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		if(transId.trim().equals("empty")){

			for(PaymentChannel p:channels){
				if((p.getDescriptiveNameEn().trim()).equalsIgnoreCase(nameEn.trim())){
					log.info("Payment channel English Name  already exists");
					return true;
				}


			}
		}else{
			for(PaymentChannel p:channels){
				if(p.getTransId().equalsIgnoreCase(transId))
					continue;

				if((p.getDescriptiveNameEn().trim()).equalsIgnoreCase(nameEn.trim())){
					log.info("Payment channel English Name  already exists");
					return true;
				}


			}

		}
		return false;
	}
	public boolean isArnameExists(String nameAr,String transId) throws SystemException{
		List<PaymentChannel> channels = paymentChannelPersistence.findByStatus(AuditUtil.STATUS_ACTIVE);
		if(transId.trim().equals("empty")){

			for(PaymentChannel p:channels){

				if((p.getDescriptiveNameAr().trim()).equals(nameAr.trim())){
					log.info("Payment channel Arabic Name  already exists");
					return true;
				}
			}
		}else{
			for(PaymentChannel p:channels){
				if(p.getTransId().equalsIgnoreCase(transId))
					continue;
				if((p.getDescriptiveNameAr().trim()).equals(nameAr.trim())){
					log.info("Payment channel Arabic Name  already exists");
					return true;
				}
			}
		}
		return false;
	}

}