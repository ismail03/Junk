package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NotifConfigService}.
 *
 * @author ahmed_fadlus
 * @see NotifConfigService
 * @generated
 */
public class NotifConfigServiceWrapper implements NotifConfigService,
    ServiceWrapper<NotifConfigService> {
    private NotifConfigService _notifConfigService;

    public NotifConfigServiceWrapper(NotifConfigService notifConfigService) {
        _notifConfigService = notifConfigService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _notifConfigService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _notifConfigService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _notifConfigService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public NotifConfigService getWrappedNotifConfigService() {
        return _notifConfigService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedNotifConfigService(
        NotifConfigService notifConfigService) {
        _notifConfigService = notifConfigService;
    }

    @Override
    public NotifConfigService getWrappedService() {
        return _notifConfigService;
    }

    @Override
    public void setWrappedService(NotifConfigService notifConfigService) {
        _notifConfigService = notifConfigService;
    }
}
