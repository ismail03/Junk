package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NotifParamService}.
 *
 * @author ahmed_fadlus
 * @see NotifParamService
 * @generated
 */
public class NotifParamServiceWrapper implements NotifParamService,
    ServiceWrapper<NotifParamService> {
    private NotifParamService _notifParamService;

    public NotifParamServiceWrapper(NotifParamService notifParamService) {
        _notifParamService = notifParamService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _notifParamService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _notifParamService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _notifParamService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public NotifParamService getWrappedNotifParamService() {
        return _notifParamService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedNotifParamService(NotifParamService notifParamService) {
        _notifParamService = notifParamService;
    }

    @Override
    public NotifParamService getWrappedService() {
        return _notifParamService;
    }

    @Override
    public void setWrappedService(NotifParamService notifParamService) {
        _notifParamService = notifParamService;
    }
}
