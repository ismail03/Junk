package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EPayAccessControlService}.
 *
 * @author ahmed_fadlus
 * @see EPayAccessControlService
 * @generated
 */
public class EPayAccessControlServiceWrapper implements EPayAccessControlService,
    ServiceWrapper<EPayAccessControlService> {
    private EPayAccessControlService _ePayAccessControlService;

    public EPayAccessControlServiceWrapper(
        EPayAccessControlService ePayAccessControlService) {
        _ePayAccessControlService = ePayAccessControlService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ePayAccessControlService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ePayAccessControlService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ePayAccessControlService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EPayAccessControlService getWrappedEPayAccessControlService() {
        return _ePayAccessControlService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEPayAccessControlService(
        EPayAccessControlService ePayAccessControlService) {
        _ePayAccessControlService = ePayAccessControlService;
    }

    @Override
    public EPayAccessControlService getWrappedService() {
        return _ePayAccessControlService;
    }

    @Override
    public void setWrappedService(
        EPayAccessControlService ePayAccessControlService) {
        _ePayAccessControlService = ePayAccessControlService;
    }
}
