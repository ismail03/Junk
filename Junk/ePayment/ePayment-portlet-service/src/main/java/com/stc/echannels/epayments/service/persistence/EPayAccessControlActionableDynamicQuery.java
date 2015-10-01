package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.EPayAccessControl;
import com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class EPayAccessControlActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EPayAccessControlActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EPayAccessControlLocalServiceUtil.getService());
        setClass(EPayAccessControl.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("epayCofignId");
    }
}
