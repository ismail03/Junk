package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.BusinessSrv;
import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;

/**
 * @author ahmed_fadlus
 * @generated
 */
public abstract class BusinessSrvActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BusinessSrvActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BusinessSrvLocalServiceUtil.getService());
        setClass(BusinessSrv.class);

        setClassLoader(com.stc.echannels.epayments.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("serviceId");
    }
}
