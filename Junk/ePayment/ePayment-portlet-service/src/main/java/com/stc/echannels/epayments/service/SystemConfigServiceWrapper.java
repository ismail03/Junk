package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SystemConfigService}.
 *
 * @author ahmed_fadlus
 * @see SystemConfigService
 * @generated
 */
public class SystemConfigServiceWrapper implements SystemConfigService,
    ServiceWrapper<SystemConfigService> {
    private SystemConfigService _systemConfigService;

    public SystemConfigServiceWrapper(SystemConfigService systemConfigService) {
        _systemConfigService = systemConfigService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _systemConfigService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _systemConfigService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _systemConfigService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SystemConfigService getWrappedSystemConfigService() {
        return _systemConfigService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSystemConfigService(
        SystemConfigService systemConfigService) {
        _systemConfigService = systemConfigService;
    }

    @Override
    public SystemConfigService getWrappedService() {
        return _systemConfigService;
    }

    @Override
    public void setWrappedService(SystemConfigService systemConfigService) {
        _systemConfigService = systemConfigService;
    }
}
