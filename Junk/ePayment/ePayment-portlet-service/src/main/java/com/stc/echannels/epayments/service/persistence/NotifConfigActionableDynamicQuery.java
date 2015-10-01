package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.NotifConfig;
import com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class NotifConfigActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public NotifConfigActionableDynamicQuery() throws SystemException {
        setBaseLocalService(NotifConfigLocalServiceUtil.getService());
        setClass(NotifConfig.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("notifId");
    }
}
