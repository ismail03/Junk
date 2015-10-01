package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.PaymentSystem;
import com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class PaymentSystemActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PaymentSystemActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PaymentSystemLocalServiceUtil.getService());
        setClass(PaymentSystem.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("paymentSystemId");
    }
}
