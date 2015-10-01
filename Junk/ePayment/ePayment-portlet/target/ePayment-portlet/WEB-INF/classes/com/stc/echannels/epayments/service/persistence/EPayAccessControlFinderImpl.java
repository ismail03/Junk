package com.stc.echannels.epayments.service.persistence;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import stc.com.echannels.util.DataFormatterUtil;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.stc.echannels.epayments.custommodel.AccessControlModel;
import com.stc.echannels.epayments.model.BizRuleConfig;
import com.stc.echannels.epayments.model.EPayAccessControl;
import com.stc.echannels.epayments.service.impl.AuditUtil;

public class EPayAccessControlFinderImpl extends BasePersistenceImpl<BizRuleConfig> implements EPayAccessControlFinder {
 
	public static String FIND_BY_SERVICEID_AND_STATUS = "com.stc.echannels.service.persistence.epayAccessContol.findByserviceIdAndStatus";
	public static String UPDATE_TO_INACTIVE = "com.stc.echannels.service.persistence.epayAccessContol.updateStatusToPending";

	public List<AccessControlModel> findActiveEpayAccessControlByServiceType(Long serviceTypeId)
		throws SystemException {

		List<AccessControlModel> accessControlModels = new ArrayList<AccessControlModel>();
		Session session = getCurrentSession();

		SQLQuery q =
			prepareCriteriaSQLQuery(session, FIND_BY_SERVICEID_AND_STATUS, serviceTypeId, AuditUtil.STATUS_ACTIVE);
		
		q.addScalar("epayAccessControlId", Type.LONG);
		q.addScalar("businessServiceEn", Type.STRING);
		q.addScalar("businessServiceAr", Type.STRING);
		q.addScalar("paymentChannelEn", Type.STRING);
		q.addScalar("paymentChannelAr", Type.STRING);
		q.addScalar("serviceTypeNameEn", Type.STRING);
		q.addScalar("paymentMethodEn", Type.STRING);
		q.addScalar("paymentMethodAr", Type.STRING);
		q.addScalar("disabledTime", Type.TIMESTAMP);
		q.addScalar("disabledBy", Type.STRING);
		q.addScalar("serviceTypeNameAr", Type.STRING);
		List<Object[]> resultRecords = (List<Object[]>) q.list();
		for (Object[] resultRecord : resultRecords) {

			AccessControlModel accessControlModel = new AccessControlModel();
			accessControlModel.setEpayAccessControlId((Long) resultRecord[0]);
			accessControlModel.setBusinessServiceEn(checkNull((String) resultRecord[1]));
			accessControlModel.setBusinessServiceAr(checkNull((String) resultRecord[2]));
			accessControlModel.setPaymentChannelEn(checkNull((String) resultRecord[3]));
			accessControlModel.setPaymentChannelAr(checkNull((String) resultRecord[4]));
			accessControlModel.setServiceTypeNameEn(checkNull((String) resultRecord[5]));
			accessControlModel.setPaymentMethodEn(checkNull((String) resultRecord[6]));
			accessControlModel.setPaymentMethodAr(checkNull((String) resultRecord[7]));
			accessControlModel.setDisabledTime(String.valueOf(resultRecord[8] ));
			accessControlModel.setDisabledBy(checkNull((String) resultRecord[9]));
			accessControlModel.setServiceTypeNameAr(checkNull((String) resultRecord[10]));
			accessControlModels.add(accessControlModel); 
		}

		return accessControlModels;
	}


	private String checkNull(String s) {
		if (s == null)
			s = "";
		return s;
	}

	 public void enableEPayAcessControl(long[] ids,EPayAccessControl ePayAc)
			  throws SystemException {

		  Session session = getCurrentSession();
		  String sql = CustomSQLUtil.get(UPDATE_TO_INACTIVE);
		  StringBuilder concatenatedIds = new StringBuilder(" IN ( ");
		  for (int i=0; i<ids.length; i++) {
			  if(i >0){
				  concatenatedIds.append(",");
			  }
			  concatenatedIds.append(ids[i]);
		  }
		  
		  concatenatedIds.append(" ) ");
		  SQLQuery q = session.createSQLQuery(sql+concatenatedIds.toString());
		  q.setString(0, AuditUtil.STATUS_INACTIVE);
		  
		  
		  q.executeUpdate();
		}

	private SQLQuery prepareCriteriaSQLQuery(Session session, String sqlTemplate, Long serviceTypeId, String status)
		throws SystemException {

		try {
			// Get the Default SQL Template
			String sql = CustomSQLUtil.get(sqlTemplate);
			SQLQuery q = session.createSQLQuery(sql);
			q.setString(0, status);
			q.setString(1, status);
			q.setLong(2, serviceTypeId);
			return q;
		}
		catch (Exception e) {
			throw processException(e);
		}
	}

	public int findMaxRuleId() {

		Session session = getCurrentSession();
		SQLQuery q = session.createSQLQuery("SELECT MAX(EPAY_CONFIG_ID) FROM EPAY_ACCESS_CONTROL");
		BigDecimal maxRuleId = (BigDecimal) q.uniqueResult();
		return maxRuleId.intValue();
	}

	public void addEPayAccessControl(final EPayAccessControl accessControl) {
		Session session = getCurrentSession();
		
		StringBuilder builder = new StringBuilder();
		builder.append(accessControl.getServiceId() +", ");
		builder.append(" ? ,");
		builder.append(" ? ,");
		builder.append(" ? ,");
		builder.append(DataFormatterUtil.getFormattedString(accessControl.getTransId())+", ");
		builder.append(DataFormatterUtil.getFormattedString(accessControl.getClientIP())+", ");
		builder.append(DataFormatterUtil.getFormattedString(accessControl.getServerIP())+", ");
		builder.append(DataFormatterUtil.getFormattedString(accessControl.getUserAgent())+", ");
		builder.append(DataFormatterUtil.getFormattedString(accessControl.getOperation())+", ");
		builder.append(" ? ,");
		builder.append(DataFormatterUtil.getFormattedString(accessControl.getLastUpdateUserid())+", ");
		builder.append(DataFormatterUtil.getFormattedString(accessControl.getLastUpdateUsername())+", ");
		builder.append(DataFormatterUtil.getFormattedString(accessControl.getStatus())+", ");
		builder.append(" ? ,");
		builder.append(accessControl.getEpayCofignId());
		
		SQLQuery query = session.createSQLQuery("insert into EPAY_ACCESS_CONTROL (SERVICE_ID, SERVICE_TYPE_ID, CHANNEL_ID, PMT_METHOD_ID, TRANS_ID, CLIENT_IP, SERVER_IP, USER_AGENT, OPERATION, last_update_timestamp, last_update_userid, last_update_username, status, effective_timestamp, EPAY_CONFIG_ID) values ("+builder.toString()+")");
		
		if(accessControl.getServiceTypeId()!= 0 ){
			query.setLong(0,accessControl.getServiceTypeId());
		}
		else
		{ 
			query.setString(0, null);
		}
		
		if(accessControl.getChannelId()!= 0 ){
			query.setLong(1,accessControl.getChannelId());
		}
		else
		{ 
			query.setString(1, null);
		}
		
		if(accessControl.getPmtMethodId()!= 0 ){
			query.setLong(2,accessControl.getPmtMethodId());
		}
		else
		{ 
			query.setString(2, null);
		}
		query.setTimestamp(3, DataFormatterUtil.getTimeStamp(accessControl.getLastUpdateTimestamp()));
		query.setTimestamp(4, DataFormatterUtil.getTimeStamp(accessControl.getEffectiveTimestamp()));
		query.executeUpdate();
		
	}
	
}
