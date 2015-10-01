package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.PaymentMethod;
import com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class PaymentMethodActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PaymentMethodActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PaymentMethodLocalServiceUtil.getService());
        setClass(PaymentMethod.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("pmtMethodId");
    }
}
