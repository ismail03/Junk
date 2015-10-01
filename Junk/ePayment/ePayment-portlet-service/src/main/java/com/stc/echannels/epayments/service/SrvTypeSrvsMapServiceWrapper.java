package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SrvTypeSrvsMapService}.
 *
 * @author ahmed_fadlus
 * @see SrvTypeSrvsMapService
 * @generated
 */
public class SrvTypeSrvsMapServiceWrapper implements SrvTypeSrvsMapService,
    ServiceWrapper<SrvTypeSrvsMapService> {
    private SrvTypeSrvsMapService _srvTypeSrvsMapService;

    public SrvTypeSrvsMapServiceWrapper(
        SrvTypeSrvsMapService srvTypeSrvsMapService) {
        _srvTypeSrvsMapService = srvTypeSrvsMapService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _srvTypeSrvsMapService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _srvTypeSrvsMapService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _srvTypeSrvsMapService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SrvTypeSrvsMapService getWrappedSrvTypeSrvsMapService() {
        return _srvTypeSrvsMapService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSrvTypeSrvsMapService(
        SrvTypeSrvsMapService srvTypeSrvsMapService) {
        _srvTypeSrvsMapService = srvTypeSrvsMapService;
    }

    @Override
    public SrvTypeSrvsMapService getWrappedService() {
        return _srvTypeSrvsMapService;
    }

    @Override
    public void setWrappedService(SrvTypeSrvsMapService srvTypeSrvsMapService) {
        _srvTypeSrvsMapService = srvTypeSrvsMapService;
    }
}
