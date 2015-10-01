package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.PaymentRule;
import com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class PaymentRuleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PaymentRuleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PaymentRuleLocalServiceUtil.getService());
        setClass(PaymentRule.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.ruleId");
    }
}
