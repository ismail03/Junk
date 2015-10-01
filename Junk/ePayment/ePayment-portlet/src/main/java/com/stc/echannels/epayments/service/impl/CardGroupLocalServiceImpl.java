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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.cp.CpConstants;
import com.stc.echannels.epayments.model.CardGroup;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.service.CardGroupLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;
import com.stc.echannels.epayments.service.base.CardGroupLocalServiceBaseImpl;
import com.stc.echannels.exceptions.IntegrityViolationException;

/**
 * The implementation of the card group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.CardGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.CardGroupLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.CardGroupLocalServiceUtil
 */
public class CardGroupLocalServiceImpl extends CardGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.CardGroupLocalServiceUtil} to access the card group local service.
	 */
	
	private List<CardGroup> replicateGroup(String transId,String operation ,ServiceContext serviceContext) throws PortalException, SystemException
	{
		
		CardGroup oldRecord= CardGroupLocalServiceUtil.fetchCardGroup(transId);
		oldRecord= cardGroupPersistence.findByCardGroupId(oldRecord.getCardGroupId(), AuditUtil.STATUS_ACTIVE).get(0);
		  	
		    String newTransId=(UUID.randomUUID()).toString();
		    CardGroup group = cardGroupPersistence.create(newTransId);
		    group.setCardGroupId(oldRecord.getCardGroupId());
		    AuditUtil.delete(oldRecord); 
		    AuditUtil.setAudit(group, operation, serviceContext);
		    
		    group.setCardValue(oldRecord.getCardValue());
		    group.setPromotionValue(oldRecord.getPromotionValue());
		    group.setInPaymentSystem(oldRecord.getInPaymentSystem());
		    group.setServiceId(oldRecord.getServiceId());
		    
		    List<CardGroup> groupRecords=new ArrayList<CardGroup>();
		    groupRecords.add(oldRecord);
		    groupRecords.add(group);
		    return groupRecords;
	}
	
	public CardGroup addCardGroup( String cardGroupId,
		      long cardValue, long promotionValue, String inPaymentSystem,long serviceId,
		          ServiceContext serviceContext)
		    throws PortalException, SystemException {
		
		if (cardGroupPersistence.countByCardGroupId(cardGroupId, AuditUtil.STATUS_ACTIVE) > 0) {
			throw new IntegrityViolationException(CpConstants.DUPLICATE_CARD_GROUP);
		}
		if (cardGroupPersistence.countByCardValue_InPaymentSystem(cardValue, inPaymentSystem, AuditUtil.STATUS_ACTIVE) > 0) {
			throw new IntegrityViolationException(CpConstants.DUPLICATE_CARD_VALUE);
		}
		
		String transId=(UUID.randomUUID()).toString();

	    CardGroup cardGroup = cardGroupPersistence.create(transId);
	    
	    cardGroup.setCardGroupId(cardGroupId);
	    cardGroup.setCardValue(cardValue);
	    cardGroup.setPromotionValue(promotionValue);
	    cardGroup.setInPaymentSystem(inPaymentSystem);
	    cardGroup.setServiceId(serviceId);
	    
	    /*************/   
	    AuditUtil.setAudit(cardGroup, AuditUtil.OPERATION_ADD, serviceContext);
	   
	    /*************/ 

	    super.addCardGroup(cardGroup);

	    return cardGroup;
	}
		
	public CardGroup updateCardGroup(String transId, String cardGroupId,
				long cardValue, long promotionValue, String inPaymentSystem,long serviceId,
			        ServiceContext serviceContext)
		    throws PortalException, SystemException {

		AuditUtil.validateUnique(cardGroupPersistence.findByCardValue_InPaymentSystem(cardValue, inPaymentSystem, AuditUtil.STATUS_ACTIVE), transId, CpConstants.DUPLICATE_CARD_VALUE);
		AuditUtil.validateUnique(cardGroupPersistence.findByCardGroupId(cardGroupId, AuditUtil.STATUS_ACTIVE), transId, CpConstants.DUPLICATE_CARD_GROUP);
		
		List<CardGroup> cardGroupRecords=this.replicateGroup(transId, AuditUtil.OPERATION_UPDATE, serviceContext);
		
		CardGroup cardGroup = cardGroupRecords.get(AuditUtil.NEW_RECORD);
	    
		cardGroup.setPromotionValue(promotionValue);
		cardGroup.setInPaymentSystem(inPaymentSystem);
	    cardGroup.setCardValue(cardValue);
	    cardGroup.setServiceId(serviceId);

	    AuditUtil.setAudit(cardGroup, AuditUtil.OPERATION_UPDATE, serviceContext);
	    
	    super.updateCardGroup(cardGroupRecords.get(AuditUtil.OLD_RECORD));
	    super.addCardGroup(cardGroup);
	 
	    return cardGroup;
	}

	public List<CardGroup> getCardGroups() throws SystemException {
	    return cardGroupPersistence.findByActive(AuditUtil.STATUS_ACTIVE);
	}
		
	public CardGroup deleteCardGroup(String transId,ServiceContext serviceContext)
		    throws PortalException, SystemException {

		//CardGroup cardGroup = cardGroupPersistence.findByPrimaryKey(cardGroupId);

		List<CardGroup> groupRecords=this.replicateGroup(transId, AuditUtil.OPERATION_DELETE, serviceContext);
		CardGroup newRecord=groupRecords.get(AuditUtil.NEW_RECORD);
		AuditUtil.delete(newRecord);
		 super.updateCardGroup(groupRecords.get(AuditUtil.OLD_RECORD));
		 super.addCardGroup(newRecord);
	   
		return groupRecords.get(AuditUtil.NEW_RECORD);
	}
	public void deleteCardGroups()
			 throws SystemException 
	{
		cardGroupPersistence.removeAll();
	}
	
	
}