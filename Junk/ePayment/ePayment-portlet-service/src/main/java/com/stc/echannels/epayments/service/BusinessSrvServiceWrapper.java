package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BusinessSrvService}.
 *
 * @author ahmed_fadlus
 * @see BusinessSrvService
 * @generated
 */
public class BusinessSrvServiceWrapper implements BusinessSrvService,
    ServiceWrapper<BusinessSrvService> {
    private BusinessSrvService _businessSrvService;

    public BusinessSrvServiceWrapper(BusinessSrvService businessSrvService) {
        _businessSrvService = businessSrvService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _businessSrvService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _businessSrvService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _businessSrvService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BusinessSrvService getWrappedBusinessSrvService() {
        return _businessSrvService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBusinessSrvService(
        BusinessSrvService businessSrvService) {
        _businessSrvService = businessSrvService;
    }

    @Override
    public BusinessSrvService getWrappedService() {
        return _businessSrvService;
    }

    @Override
    public void setWrappedService(BusinessSrvService businessSrvService) {
        _businessSrvService = businessSrvService;
    }
}
