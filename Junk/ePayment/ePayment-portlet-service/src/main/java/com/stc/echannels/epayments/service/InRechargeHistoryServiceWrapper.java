package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InRechargeHistoryService}.
 *
 * @author ahmed_fadlus
 * @see InRechargeHistoryService
 * @generated
 */
public class InRechargeHistoryServiceWrapper implements InRechargeHistoryService,
    ServiceWrapper<InRechargeHistoryService> {
    private InRechargeHistoryService _inRechargeHistoryService;

    public InRechargeHistoryServiceWrapper(
        InRechargeHistoryService inRechargeHistoryService) {
        _inRechargeHistoryService = inRechargeHistoryService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _inRechargeHistoryService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _inRechargeHistoryService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _inRechargeHistoryService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public InRechargeHistoryService getWrappedInRechargeHistoryService() {
        return _inRechargeHistoryService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInRechargeHistoryService(
        InRechargeHistoryService inRechargeHistoryService) {
        _inRechargeHistoryService = inRechargeHistoryService;
    }

    @Override
    public InRechargeHistoryService getWrappedService() {
        return _inRechargeHistoryService;
    }

    @Override
    public void setWrappedService(
        InRechargeHistoryService inRechargeHistoryService) {
        _inRechargeHistoryService = inRechargeHistoryService;
    }
}
