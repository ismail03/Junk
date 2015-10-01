package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NotifParamSrvService}.
 *
 * @author ahmed_fadlus
 * @see NotifParamSrvService
 * @generated
 */
public class NotifParamSrvServiceWrapper implements NotifParamSrvService,
    ServiceWrapper<NotifParamSrvService> {
    private NotifParamSrvService _notifParamSrvService;

    public NotifParamSrvServiceWrapper(
        NotifParamSrvService notifParamSrvService) {
        _notifParamSrvService = notifParamSrvService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _notifParamSrvService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _notifParamSrvService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _notifParamSrvService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public NotifParamSrvService getWrappedNotifParamSrvService() {
        return _notifParamSrvService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedNotifParamSrvService(
        NotifParamSrvService notifParamSrvService) {
        _notifParamSrvService = notifParamSrvService;
    }

    @Override
    public NotifParamSrvService getWrappedService() {
        return _notifParamSrvService;
    }

    @Override
    public void setWrappedService(NotifParamSrvService notifParamSrvService) {
        _notifParamSrvService = notifParamSrvService;
    }
}
