package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.NotifParam;
import com.stc.echannels.epayments.service.NotifParamLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class NotifParamActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public NotifParamActionableDynamicQuery() throws SystemException {
        setBaseLocalService(NotifParamLocalServiceUtil.getService());
        setClass(NotifParam.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("notifParamId");
    }
}
