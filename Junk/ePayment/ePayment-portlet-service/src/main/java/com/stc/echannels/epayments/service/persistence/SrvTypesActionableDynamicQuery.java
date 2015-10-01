package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.SrvTypes;
import com.stc.echannels.epayments.service.SrvTypesLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class SrvTypesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SrvTypesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SrvTypesLocalServiceUtil.getService());
        setClass(SrvTypes.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("serviceTypeId");
    }
}
