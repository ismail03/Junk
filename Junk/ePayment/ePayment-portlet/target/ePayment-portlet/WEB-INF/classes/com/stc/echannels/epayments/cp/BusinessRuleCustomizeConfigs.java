/**
 * 
 */
package com.stc.echannels.epayments.cp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.model.BizRuleConfig;
import com.stc.echannels.epayments.model.impl.BizRuleConfigImpl;
import com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.impl.AuditUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang.StringUtils;

import stc.com.echannels.util.DataFormatterUtil;

/**
 * @author arpit
 *
 */
public class BusinessRuleCustomizeConfigs extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		super.doView(renderRequest, renderResponse);
	}	
	
	private String getFieldValue(String keyValuePair){
		String value = null;
		String keyValueItem[] = StringUtils.split(keyValuePair, ":");
		if(keyValueItem.length==2){
			value = keyValueItem[1];
		}
		return value;
	}
	
	@Override
	protected void addSuccessMessage(ActionRequest actionRequest,
			ActionResponse actionResponse) {		
			return;
	}


	
	public void saveBusinessRules(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException, PortalException {
		
		final String recordKeyIds = ParamUtil.getString(actionRequest, "saveBusinessRulesIds");
		final Long ruleId = ParamUtil.getLong(actionRequest, "ruleId");
		final String newValue = ParamUtil.getString(actionRequest, "newValue");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(BusinessRuleCustomizeConfigs.class.getName(), actionRequest);
		List<BizRuleConfig> bizRuleConfigs = new ArrayList<BizRuleConfig>();
		String[] recordIdentityKeys = StringUtils.split(recordKeyIds, ",");
		for (String recordIdentityKey : recordIdentityKeys) {
			BizRuleConfig bizRuleConfig = new BizRuleConfigImpl();
			bizRuleConfig.setCustomValue(newValue);
			bizRuleConfig.setRuleId(ruleId);
			bizRuleConfig.setLastUpdateTimestamp(new Date());
			bizRuleConfig.setLastUpdateUserid(String.valueOf(serviceContext.getUserId() ));
			bizRuleConfig.setEffectiveTimestamp(DataFormatterUtil.getEffectiveDate());
			bizRuleConfig.setLastUpdateUserid(actionRequest.getRemoteUser());
			bizRuleConfig.setOperation(AuditUtil.OPERATION_ADD);
			bizRuleConfig.setStatus(AuditUtil.STATUS_PENDING);
			bizRuleConfig.setClientIP(serviceContext.getRemoteAddr());
			bizRuleConfig.setServerIP(serviceContext.getRequest().getLocalAddr());
			bizRuleConfig.setUserAgent(serviceContext.getUserAgent());
			bizRuleConfig.setTransId((UUID.randomUUID()).toString());

			bizRuleConfigs.add(bizRuleConfig);
			try {
				bizRuleConfig.setLastUpdateUsername(UserLocalServiceUtil.getUser(serviceContext.getUserId()).getEmailAddress());
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
			String[] columnIdentityKeys = StringUtils.split(recordIdentityKey, ";");
			for (String columnIdentityKey : columnIdentityKeys) {
				if(columnIdentityKey.contains("serviceId")){
					bizRuleConfig.setServiceId(Long.parseLong(getFieldValue(columnIdentityKey)));
				}
				if(columnIdentityKey.contains("methodId")){
					bizRuleConfig.setPmtMethodId(Long.parseLong(getFieldValue(columnIdentityKey)));
				}
				if(columnIdentityKey.contains("channelId")){
					bizRuleConfig.setChannelId(Long.parseLong(getFieldValue(columnIdentityKey)));
				}
			}//for column mapping
		}//for record items

		SessionMessages.add(actionRequest, "business-rule-processed");
		
		BizRuleConfigLocalServiceUtil.addBizRuleConfig(bizRuleConfigs);
	}
		
}
