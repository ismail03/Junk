package com.stc.echannels.epayments.service.persistence;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.stc.echannels.epayments.custommodel.PaymentRuleListModel;
import com.stc.echannels.epayments.model.PaymentRule;
import com.stc.echannels.epayments.service.impl.AuditUtil;

public class PaymentRuleFinderImpl extends BasePersistenceImpl<PaymentRule> implements PaymentRuleFinder {

	public static String FIND_ACTIVE_PAYMENT_RULE_BY_SERVICE_TYPE =
		"com.stc.echannels.service.persistence.PaymentRuleFinder.findActivePaymentRuleByServiceType";
	public static String FIND_COUNT_ACTIVE_PAYMENT_RULE_BY_SERVICE_TYPE =
		"com.stc.echannels.service.persistence.PaymentRuleFinder.findCountActivePaymentRuleByServiceType";

	public List<PaymentRuleListModel> findActivePaymentRuleByServiceType(Long serviceTypeId, int start, int end)
		throws SystemException {

		Session session = getCurrentSession();
		SQLQuery q = prepareCriteriaSQLQuery(session, FIND_ACTIVE_PAYMENT_RULE_BY_SERVICE_TYPE, serviceTypeId, Boolean.TRUE);

		q.addScalar("ruleId", Type.LONG);
		q.addScalar("transId", Type.STRING);
		q.addScalar("ruleName", Type.STRING);
		q.addScalar("descriptionEN", Type.STRING);
		q.addScalar("descriptionAR", Type.STRING);
		q.addScalar("value", Type.STRING);
		q.addScalar("ruleCategory", Type.STRING);
		q.addScalar("effectiveTimestamp", Type.TIMESTAMP);

		List<Object[]> resultRecords = (List<Object[]>) QueryUtil.list(q, getDialect(), start, end);
		List<PaymentRuleListModel> paymentRuleList = new ArrayList<PaymentRuleListModel>();
		for (Object[] resultRecord : resultRecords) {

			// RULE_ID as ruleId,TRANS_ID as transId, RULE_NAME as ruleName,
			// DESCRIPTION_EN as descriptionEN, DESCRIPTION_AR as descriptionAR,
			// RULE_CATEGORY as ruleCategory, VALUE as value

			PaymentRuleListModel paymentRuleListModel = new PaymentRuleListModel();
			paymentRuleListModel.setRuleId((Long) resultRecord[0]);
			paymentRuleListModel.setTransId((String) resultRecord[1]);
			paymentRuleListModel.setRuleName((String) resultRecord[2]);
			paymentRuleListModel.setDescriptionEN((String) resultRecord[3]);
			paymentRuleListModel.setDescriptionAR((String) resultRecord[4]);
			paymentRuleListModel.setDefaultValue((String) resultRecord[5]);
			paymentRuleListModel.setRuleCategory((String) resultRecord[6]);
			//TODO [ARE] : To check whether effective date of bizruleconfig is needed
			paymentRuleListModel.setEffectiveDate((Date) resultRecord[7]);
			paymentRuleList.add(paymentRuleListModel);
		}

		return paymentRuleList;
	}

	public Long findCountActivePaymentRuleByServiceType(Long serviceTypeId)
		throws SystemException {

		Session session = getCurrentSession();
		SQLQuery q =
			prepareCriteriaSQLQuery(
				session, FIND_COUNT_ACTIVE_PAYMENT_RULE_BY_SERVICE_TYPE, serviceTypeId, Boolean.TRUE);
		BigDecimal recordsCount = (BigDecimal) q.uniqueResult();
		return recordsCount.longValue();
	}

	private SQLQuery prepareCriteriaSQLQuery(
		Session session, String sqlTemplate, Long serviceTypeId, Boolean andOperator)
		throws SystemException {

		try {
			// Get the Default SQL Template
			String sql = CustomSQLUtil.get(sqlTemplate);
			SQLQuery q = session.createSQLQuery(sql);
			q.setLong(0, serviceTypeId);
			q.setString(1, AuditUtil.STATUS_ACTIVE);
			q.setString(2, AuditUtil.OPERATION_ADD);
			return q;
		}
		catch (Exception e) {
			throw processException(e);
		}
	}

	public int findMaxRuleId() {

		Session session = getCurrentSession();
		SQLQuery q = session.createSQLQuery("SELECT MAX(RULE_ID) FROM PAYMENT_RULES");
		BigDecimal maxRuleId = (BigDecimal) q.uniqueResult();
		return maxRuleId.intValue();
	}

	public int findActiveReferencedServiceTypes() {

		Session session = getCurrentSession();
		SQLQuery q = session.createSQLQuery("SELECT MAX(RULE_ID) FROM PAYMENT_RULES");
		BigDecimal maxRuleId = (BigDecimal) q.uniqueResult();
		return maxRuleId.intValue();
	}
}
