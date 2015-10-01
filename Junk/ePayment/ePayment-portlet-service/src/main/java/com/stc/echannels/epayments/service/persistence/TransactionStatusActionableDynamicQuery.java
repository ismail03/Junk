package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.TransactionStatus;
import com.stc.echannels.epayments.service.TransactionStatusLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class TransactionStatusActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TransactionStatusActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TransactionStatusLocalServiceUtil.getService());
        setClass(TransactionStatus.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
