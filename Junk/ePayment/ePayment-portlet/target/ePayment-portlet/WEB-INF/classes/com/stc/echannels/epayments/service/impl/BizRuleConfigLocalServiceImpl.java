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
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.stc.echannels.epayments.model.BizRuleConfig;
import com.stc.echannels.epayments.service.base.BizRuleConfigLocalServiceBaseImpl;
import com.stc.echannels.epayments.service.persistence.BizRuleConfigFinderUtil;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;

import stc.com.echannels.util.DataFormatterUtil;

/**
 * The implementation of the biz rule config local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.BizRuleConfigLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.BizRuleConfigLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil
 */
public class BizRuleConfigLocalServiceImpl
	extends BizRuleConfigLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil} to access the biz rule config local service.
	 */
	
	public List<com.stc.echannels.epayments.custommodel.BizRuleConfigModel> findActiveBizRuleByServiceType( Long serviceTypeId,int start, int end) throws SystemException {
		return getBizRuleConfigFinder().findActiveBizRuleByServiceType(serviceTypeId, start, end);
	}
	
	public void updateBizRuleConfigToInActive(long[] recordIds, ServiceContext serviceContext) throws SystemException {
		String status = "";
		for (long l : recordIds) {
			String sql = "from BizRuleConfig a where a.bizRuleId = ?";
			Query query = bizRuleConfigPersistence.getCurrentSession().createQuery(sql);
			query.setLong(0,l);
			List<BizRuleConfig> list = query.list();
			if(list!=null){
				final long bizRuleId= counterLocalService.increment(BizRuleConfig.class.getName());
				BizRuleConfig addBizRuleConfig = bizRuleConfigPersistence.create(bizRuleId);
				BizRuleConfig  bizRuleConfig = list.get(0);
				try {
					BeanUtils.copyProperties(addBizRuleConfig, bizRuleConfig);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				addBizRuleConfig.setBizRuleId(bizRuleId);
				bizRuleConfig= fillAuditFields(addBizRuleConfig, serviceContext);
				if( bizRuleConfig.getStatus().equals(AuditUtil.STATUS_PENDING )){
					addBizRuleConfig.setStatus(AuditUtil.STATUS_INACTIVE);
					addBizRuleConfig.setEffectiveTimestamp(null);
				}else if( bizRuleConfig.getStatus().equals(AuditUtil.STATUS_ACTIVE ) ){
					addBizRuleConfig.setStatus(AuditUtil.STATUS_PENDING);
				}
				getBizRuleConfigFinder().addBizRuleConfig(addBizRuleConfig);
			}
		
		}
		getBizRuleConfigFinder().updateBizRuleConfigToInActive(recordIds);
					
	}
	
	private BizRuleConfig fillAuditFields(BizRuleConfig bizRuleConfig, ServiceContext serviceContext){
		
	
	
		bizRuleConfig.setLastUpdateTimestamp(new Date());
		bizRuleConfig.setEffectiveTimestamp(DataFormatterUtil.getEffectiveDate());
		bizRuleConfig.setLastUpdateUserid(serviceContext.getUserId() + "");
		bizRuleConfig.setClientIP(serviceContext.getRemoteAddr());
		bizRuleConfig.setServerIP(serviceContext.getRequest().getLocalAddr());
		bizRuleConfig.setUserAgent(serviceContext.getUserAgent());
		bizRuleConfig.setTransId((UUID.randomUUID()).toString());
		try {
			bizRuleConfig.setLastUpdateUsername(UserLocalServiceUtil.getUser(
					serviceContext.getUserId()).getEmailAddress());
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		bizRuleConfig.setOperation(AuditUtil.OPERATION_DELETE);
		return bizRuleConfig;
	}
	public Long findCountBizRuleByServiceType(Long serviceTypeId) throws SystemException {
		return getBizRuleConfigFinder().findCountBizRuleByServiceType(serviceTypeId);
	}
	
	public boolean isBizRuleConfigCombinationAlreadyAdded(long serviceId,long channelId,long pmtMethodId,long ruleId){
		SQLQuery query =null;
		StringBuilder sql = new StringBuilder("SELECT COUNT(*) FROM BIZ_RULE_CONFIG WHERE SERVICE_ID = ? AND STATUS = 'PENDING' AND OPERATION = 'ADD' AND RULE_ID = ?  ");
		
		if(channelId!= 0 ){
			sql.append(" AND CHANNEL_ID ="+channelId);
		}
		else
		{ 
			sql.append(" AND CHANNEL_ID IS NULL ");
		}
		if(pmtMethodId!= 0 ){
			sql.append(" AND PMT_METHOD_ID ="+pmtMethodId);
		}
		else
		{ 
			sql.append(" AND PMT_METHOD_ID IS NULL ");
		}
				
	 	query = bizRuleConfigPersistence.getCurrentSession().createSQLQuery(sql.toString());
	 	query.setLong(0,serviceId);
	 	query.setLong(1,ruleId);
		
		
		List bizRuleConfigs = query.list();
		return ((BigDecimal)bizRuleConfigs.get(0)).intValueExact() > 0;
	}
	
	public void addBizRuleConfig(List<BizRuleConfig> bizRuleConfigs) throws SystemException{
		
		for (BizRuleConfig bizRuleConfig : bizRuleConfigs) {
			long bizRuleConfigId= counterLocalService.increment(BizRuleConfig.class.getName());
			BizRuleConfig addBizRuleConfig = bizRuleConfigPersistence.create(bizRuleConfigId);
			try {
				BeanUtils.copyProperties(addBizRuleConfig, bizRuleConfig);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			addBizRuleConfig.setBizRuleId(bizRuleConfigId);
			BizRuleConfigFinderUtil.addBizRuleConfig(addBizRuleConfig);
		}
	}

}