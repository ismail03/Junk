package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.NotifParamSrv;
import com.stc.echannels.epayments.service.NotifParamSrvLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class NotifParamSrvActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public NotifParamSrvActionableDynamicQuery() throws SystemException {
        setBaseLocalService(NotifParamSrvLocalServiceUtil.getService());
        setClass(NotifParamSrv.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.notifParamId");
    }
}
