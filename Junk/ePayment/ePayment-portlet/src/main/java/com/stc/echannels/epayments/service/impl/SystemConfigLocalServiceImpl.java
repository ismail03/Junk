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
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.portlet.PortletConfig;

import stc.com.echannels.util.BizRuleUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.service.ServiceContext;
import com.stc.echannels.epayments.cp.CpConstants;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.SystemConfig;
import com.stc.echannels.epayments.service.BankLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;
import com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.base.SystemConfigLocalServiceBaseImpl;

/**
 * The implementation of the system config local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.SystemConfigLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.SystemConfigLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil
 */
public class SystemConfigLocalServiceImpl
	extends SystemConfigLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil} to access the system config local service.
	 */
	
	private List<SystemConfig> replicate(String transId, String operation, ServiceContext serviceContext) throws PortalException, SystemException
	{
		
		SystemConfig oldRecord= SystemConfigLocalServiceUtil.fetchSystemConfig(transId);
		
		String newTransId=(UUID.randomUUID()).toString();
		SystemConfig obj = systemConfigPersistence.create(newTransId);
		//obj.setSystemConfigId(oldRecord.ge);
		AuditUtil.delete(oldRecord); 
		AuditUtil.setAudit(obj, operation, serviceContext);
		    
		List<SystemConfig> list = new ArrayList<SystemConfig>();
		list.add(oldRecord);
		list.add(obj);
		return list;
	}
	
	public SystemConfig addSystemConfig(  long serviceId,String bankId, String config,
		       ServiceContext serviceContext)
		    throws PortalException	, SystemException {

		String transId=(UUID.randomUUID()).toString();

	    SystemConfig systemConfig = systemConfigPersistence.create(transId);

	    /*
	     * 		<column name="serviceId" db-name="service_Id" type="long" />
		<column name="bankId" db-name="bank_Id" type="long" />
		<column db-name="config_code" name="config" type="String" />
	     */
	    systemConfig.setServiceId(serviceId);
	    systemConfig.setBankId(bankId);
	    systemConfig.setConfig(config);
	   
	    
	    AuditUtil.setAudit(systemConfig, AuditUtil.OPERATION_ADD, serviceContext);
	    super.addSystemConfig(systemConfig);

	    return systemConfig;
	}
	

	public SystemConfig updateSystemConfig(String transId,long serviceId,String bankId, String config,
		       ServiceContext serviceContext)
	    throws PortalException, SystemException {

		List<SystemConfig> list = this.replicate(transId, AuditUtil.OPERATION_UPDATE, serviceContext);
		
	    SystemConfig obj = list.get(AuditUtil.NEW_RECORD);
	    
	    obj.setServiceId(serviceId);
	    obj.setBankId(bankId);
	    obj.setConfig(config);

	    AuditUtil.setAudit(obj, AuditUtil.OPERATION_UPDATE, serviceContext);
	    
	    super.updateSystemConfig(list.get(AuditUtil.OLD_RECORD));
	    obj.setOperation(AuditUtil.OPERATION_ADD);
	    super.addSystemConfig(obj);
	    return obj;
	}
	
	public String getColumns(PortletConfig portletConfig, Locale locale,long serviceId) throws SystemException {
		List<PaymentChannel> channels = BizRuleUtil.getPaymentChannelsByBusiniessServiceId(serviceId);
		JSONArray array = new JSONArray();
		JSONObject first = JSONObject.fromObject("{\"key\":\""+CpConstants.KEY_BANK+"\", \"label\":\""+LanguageUtil.get(portletConfig, locale, CpConstants.LABEL_BANK)+"\"}");
		array.add(first);
		for (PaymentChannel channel: channels) {
			JSONObject o = new JSONObject();
			o.put("key", String.valueOf(channel.getChannelId()));
			o.put("label", locale.getLanguage().equals("en")?channel.getDescriptiveNameEn():channel.getDescriptiveNameAr());
			array.add(o);
		}
		return array.toString();
	}
	
	
	public String getData(Locale locale,long serviceId) throws SystemException {
		
		List<PaymentChannel> channels = BizRuleUtil.getPaymentChannelsByBusiniessServiceId(serviceId);
		
		List<Bank> banks = BankLocalServiceUtil.getBanksByServiceId(serviceId);	
	
	
		List<SystemConfig> configs = systemConfigPersistence.findByServiceId(serviceId,AuditUtil.STATUS_ACTIVE);

		JSONArray array = new JSONArray();
		JSONObject bankObject = null;

		for (Bank bank: banks) {
			bankObject = new JSONObject();
			
			
			bankObject.put("id", bank.getBankId());
			bankObject.put("bank", locale.getLanguage().equals("en")?bank.getNameEn():bank.getNameAr());
			array.add(bankObject);
		}
		List<String> activePaymentChannelIds = new ArrayList<String>();
		for (PaymentChannel paymentChannel : channels){
			activePaymentChannelIds.add(String.valueOf(paymentChannel.getChannelId()));
		}
		if(activePaymentChannelIds.size() > 0){
			for(SystemConfig config : configs){
				JSONObject jsonObject =  JSONObject.fromObject(config.getConfig());
				JSONArray jsonArray = jsonObject.getJSONArray("channels");
				JSONObject jObject = new JSONObject();
				for(Object key :  jsonArray ){ 
					
					String configChannel = (String)key;
					if(! activePaymentChannelIds.contains(configChannel)){
						jsonArray.remove(String.valueOf(configChannel));
					}else{
						
						jObject.put(configChannel, "checked");
					}
					
				}		
				
				config.setConfig(jObject.toString());
			}
			int size = array.size();
			for (SystemConfig config: configs) {
				String bankId = config.getBankId();
				for (int i=0; i<size; i++) {
					
					JSONObject b = array.getJSONObject(i);
					if (b.getString("id").equals(bankId)) {
						b.putAll(JSONObject.fromObject(config.getConfig()));
						break;
					}
				}
			}
			return array.toString();
		}else{
			return null;
		}
		
	}
	


	public SystemConfig deleteSystemConfig(String transId, ServiceContext serviceContext) throws PortalException, SystemException {
		List<SystemConfig> list = this.replicate(transId, AuditUtil.OPERATION_DELETE, serviceContext);
		AuditUtil.delete(list.get(AuditUtil.NEW_RECORD));
		super.updateSystemConfig(list.get(AuditUtil.OLD_RECORD));
		super.addSystemConfig(list.get(AuditUtil.NEW_RECORD));
		return list.get(AuditUtil.NEW_RECORD);
	}
	
	public List<SystemConfig> getSystemConfigs(long serviceId) throws SystemException{
		
		return systemConfigPersistence.findByServiceId(serviceId,AuditUtil.STATUS_ACTIVE);
		
	}
	
	
	public void saveSystemConfigs(long serviceId, String config, ServiceContext serviceContext) throws SystemException, PortalException {
		JSONArray a = JSONArray.fromObject(config);
		String bankId;
		JSONObject c = null;
		JSONObject data = null;
		int size = a.size();
		for (int i=0; i<size; i++) {
			c = a.getJSONObject(i);
			bankId = c.getString("id");
			data = JSONObject.fromObject(c);
			data.remove("bank");
			data.remove("id");
			JSONArray checkBoxesSelectedIds = new JSONArray();
			JSONObject savableConfig = new JSONObject();
			for(Object s :data.keySet() ){
				checkBoxesSelectedIds.add(s);
			}
			savableConfig.put("channels", checkBoxesSelectedIds);
			List<SystemConfig> sysConfigs = systemConfigPersistence.findByBankId(serviceId, bankId, AuditUtil.STATUS_ACTIVE);
			
			if (sysConfigs!= null && sysConfigs.size()>0) {
				this.updateSystemConfig(sysConfigs.get(0).getTransId(),
										serviceId,bankId, savableConfig.toString(), serviceContext);
			}
			else {
				this.addSystemConfig(serviceId, bankId, savableConfig.toString(), serviceContext);
			}
			
		}
	}
	
	
}