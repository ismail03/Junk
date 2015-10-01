package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.stc.echannels.epayments.custommodel.BizRuleConfigModel;
import com.stc.echannels.epayments.model.BizRuleConfig;
import com.stc.echannels.epayments.service.impl.AuditUtil;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import stc.com.echannels.util.DataFormatterUtil;

public class BizRuleConfigFinderImpl extends BasePersistenceImpl<BizRuleConfig>
		implements BizRuleConfigFinder {

	public static String FIND_ACTIVE_BIZ_RULE_BY_SERVICE_TYPE="com.stc.echannels.service.persistence.BizRuleConfigFinder.findActiveBizRuleByServiceType";
	public static String FIND_COUNT_BIZ_RULE_BY_SERVICE_TYPE="com.stc.echannels.service.persistence.BizRuleConfigFinder.findCountBizRuleByServiceType";
	
	public List<BizRuleConfigModel> findActiveBizRuleByServiceType( Long serviceTypeId,int start, int end) throws SystemException {
		
		List<BizRuleConfigModel> bizRuleConfigModels = new ArrayList<BizRuleConfigModel>();
		
		Session session = getCurrentSession();
		
		String sql = CustomSQLUtil.get(FIND_ACTIVE_BIZ_RULE_BY_SERVICE_TYPE);
		SQLQuery q = session.createSQLQuery(sql);
		
		q.setString(0, AuditUtil.STATUS_ACTIVE);
		q.setString(1, AuditUtil.STATUS_PENDING);
		q.setString(2, AuditUtil.STATUS_ACTIVE);
		q.setString(3, AuditUtil.STATUS_PENDING);
		q.setString(4, AuditUtil.STATUS_PENDING);
		q.setString(5, AuditUtil.STATUS_ACTIVE);
		q.setLong(6, serviceTypeId);
		q.setString(7, AuditUtil.OPERATION_ADD);
		q.addScalar("ruleId", Type.LONG);
		q.addScalar("ruleName", Type.STRING);
		q.addScalar("descriptionEN", Type.STRING);
		q.addScalar("descriptionAR", Type.STRING);
		q.addScalar("value", Type.STRING);
		q.addScalar("effectiveTimestanp", Type.TIMESTAMP);
		q.addScalar("ruleCategory", Type.STRING);
		q.addScalar("serviceNameEN", Type.STRING);
		q.addScalar("serviceNameAR", Type.STRING);
		q.addScalar("customValue", Type.STRING);
		q.addScalar("channelType", Type.STRING);
		q.addScalar("paymentChannelNameEN", Type.STRING);
		q.addScalar("paymentChannelNameAR", Type.STRING);
		q.addScalar("paymentModuleNameEN", Type.STRING);
		q.addScalar("paymentModuleNameAR", Type.STRING);
		q.addScalar("status", Type.STRING);

		List<Object[]> resultRecords =  (List<Object[]>) QueryUtil.list(q,getDialect(), start, end);
		for (Object[] resultRecord : resultRecords) {
		 
			BizRuleConfigModel bizRuleConfigModel = new BizRuleConfigModel();
			bizRuleConfigModel.setRuleId((Long)resultRecord[0]);
			bizRuleConfigModel.setRuleName(checkNull((String)resultRecord[1]));
			
			bizRuleConfigModel.setDescriptionEN(checkNull((String)resultRecord[2]));
			bizRuleConfigModel.setDescriptionAR(checkNull((String)resultRecord[3]));
			bizRuleConfigModel.setValue(checkNull((String)resultRecord[4]));

			bizRuleConfigModel.setEffectiveTime((Date)resultRecord[5]);
			bizRuleConfigModel.setRuleCategory(checkNull((String)resultRecord[6]));
			bizRuleConfigModel.setServiceNameEN(checkNull((String)resultRecord[7]));
			bizRuleConfigModel.setServiceNameAR(checkNull((String)resultRecord[8]));

			bizRuleConfigModel.setCustomValue(checkNull((String)resultRecord[9]));
			bizRuleConfigModel.setChannelType(checkNull((String)resultRecord[10]));
			bizRuleConfigModel.setPaymentChannelNameEN(checkNull((String)resultRecord[11]));
			bizRuleConfigModel.setPaymentChannelNameAR(checkNull((String)resultRecord[12]));
			bizRuleConfigModel.setPaymentModuleNameEN(checkNull((String)resultRecord[13]));		
			bizRuleConfigModel.setPaymentModuleNameAR(checkNull((String)resultRecord[14]));		
			bizRuleConfigModel.setStatus(checkNull((String)resultRecord[15]));
			
			bizRuleConfigModels.add(bizRuleConfigModel);
		}
 		return bizRuleConfigModels;
	}

	private String checkNull(String s) {

		if (s == null)
			s = "";
		return s;
	}

	public Long findCountBizRuleByServiceType(Long serviceTypeId) throws SystemException {

		Session session = getCurrentSession();
		
		String sql = CustomSQLUtil.get(FIND_COUNT_BIZ_RULE_BY_SERVICE_TYPE);
		SQLQuery q = session.createSQLQuery(sql);
		
		q.setString(0, AuditUtil.STATUS_ACTIVE);
		q.setString(1, AuditUtil.STATUS_PENDING);
		q.setString(2, AuditUtil.STATUS_ACTIVE);
		q.setString(3, AuditUtil.STATUS_PENDING);
		q.setLong(4, serviceTypeId);
		q.setString(5, AuditUtil.OPERATION_ADD);
		
		q.addScalar("count", Type.LONG);
		
		Object result = q.uniqueResult();
		Long recordsCount = (Long) result;
		return recordsCount;
	}

	
	private SQLQuery prepareCriteriaSQLQuery(Session session,String sqlTemplate,Long serviceTypeId) throws SystemException {
	 	try{	
			// Get the Default SQL Template
			String sql = CustomSQLUtil.get(sqlTemplate);
			SQLQuery q = session.createSQLQuery(sql);
			q.setLong(0, serviceTypeId);
			return q;
		}catch (Exception e) {			
			throw processException(e);
		} 
	}

	public void addBizRuleConfig(final BizRuleConfig bizRuleConfig) {
		Session session = getCurrentSession();
		
		StringBuilder builder = new StringBuilder();
		builder.append(bizRuleConfig.getServiceId()+", ");
		builder.append(" ? ,");
		builder.append(" ? ,");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getCustomValue())+", ");
		builder.append(bizRuleConfig.getRuleId()+", ");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getTransId())+", ");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getClientIP())+", ");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getServerIP())+", ");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getUserAgent())+", ");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getOperation())+", ");
		builder.append(" ? ,");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getLastUpdateUserid())+", ");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getLastUpdateUsername())+", ");
		builder.append(DataFormatterUtil.getFormattedString(bizRuleConfig.getStatus())+", ");
		builder.append(" ? ,");
		builder.append(bizRuleConfig.getBizRuleId());
		
		SQLQuery query = session.createSQLQuery("insert into BIZ_RULE_CONFIG (SERVICE_ID, CHANNEL_ID, PMT_METHOD_ID, CUSTOM_VALUE, RULE_ID, TRANS_ID, CLIENT_IP, SERVER_IP, USER_AGENT, OPERATION, last_update_timestamp, last_update_userid, last_update_username, status, effective_timestamp, BIZ_RULE_ID) values ("+builder.toString()+")");
				
		if(bizRuleConfig.getChannelId()!= 0 ){
			query.setLong(0,bizRuleConfig.getChannelId());
		}
		else
		{ 
			query.setString(0, null);
		}
		
		if(bizRuleConfig.getPmtMethodId()!= 0 ){
			query.setLong(1,bizRuleConfig.getPmtMethodId());
		}
		else
		{ 
			query.setString(1, null);
		}
		
		query.setTimestamp(2, DataFormatterUtil.getTimeStamp(bizRuleConfig.getLastUpdateTimestamp()));
		query.setTimestamp(3, DataFormatterUtil.getTimeStamp(bizRuleConfig.getEffectiveTimestamp()));
		query.executeUpdate();
		
	}
	
	public void updateBizRuleConfigToInActive(long[] recordIds) {

		Session session = getCurrentSession();
		StringBuilder sb = new StringBuilder("");
		for (int i=0; i< recordIds.length; i++) {
			if(i>0){
				sb.append(" , ");
			}
			sb.append(recordIds[i]);
		}
		sb.append(" ) ");
		String queryString = ""; 
		SQLQuery query =null;
		queryString=	"update BIZ_RULE_CONFIG set STATUS='" + AuditUtil.STATUS_INACTIVE + "' where BIZ_RULE_Id IN ( "+sb.toString();
	 	query = session.createSQLQuery(queryString);
		query.executeUpdate();


	}
	
	

}
