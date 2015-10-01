package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RefundReconLogService}.
 *
 * @author ahmed_fadlus
 * @see RefundReconLogService
 * @generated
 */
public class RefundReconLogServiceWrapper implements RefundReconLogService,
    ServiceWrapper<RefundReconLogService> {
    private RefundReconLogService _refundReconLogService;

    public RefundReconLogServiceWrapper(
        RefundReconLogService refundReconLogService) {
        _refundReconLogService = refundReconLogService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _refundReconLogService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _refundReconLogService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _refundReconLogService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RefundReconLogService getWrappedRefundReconLogService() {
        return _refundReconLogService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRefundReconLogService(
        RefundReconLogService refundReconLogService) {
        _refundReconLogService = refundReconLogService;
    }

    @Override
    public RefundReconLogService getWrappedService() {
        return _refundReconLogService;
    }

    @Override
    public void setWrappedService(RefundReconLogService refundReconLogService) {
        _refundReconLogService = refundReconLogService;
    }
}
