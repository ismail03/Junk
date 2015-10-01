package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SrvTypesService}.
 *
 * @author ahmed_fadlus
 * @see SrvTypesService
 * @generated
 */
public class SrvTypesServiceWrapper implements SrvTypesService,
    ServiceWrapper<SrvTypesService> {
    private SrvTypesService _srvTypesService;

    public SrvTypesServiceWrapper(SrvTypesService srvTypesService) {
        _srvTypesService = srvTypesService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _srvTypesService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _srvTypesService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _srvTypesService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SrvTypesService getWrappedSrvTypesService() {
        return _srvTypesService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSrvTypesService(SrvTypesService srvTypesService) {
        _srvTypesService = srvTypesService;
    }

    @Override
    public SrvTypesService getWrappedService() {
        return _srvTypesService;
    }

    @Override
    public void setWrappedService(SrvTypesService srvTypesService) {
        _srvTypesService = srvTypesService;
    }
}
