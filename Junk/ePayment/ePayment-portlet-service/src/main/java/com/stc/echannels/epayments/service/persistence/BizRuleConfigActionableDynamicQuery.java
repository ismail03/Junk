package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.BizRuleConfig;
import com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class BizRuleConfigActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BizRuleConfigActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BizRuleConfigLocalServiceUtil.getService());
        setClass(BizRuleConfig.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bizRuleId");
    }
}
