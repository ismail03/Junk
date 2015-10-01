package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReconLogService}.
 *
 * @author ahmed_fadlus
 * @see ReconLogService
 * @generated
 */
public class ReconLogServiceWrapper implements ReconLogService,
    ServiceWrapper<ReconLogService> {
    private ReconLogService _reconLogService;

    public ReconLogServiceWrapper(ReconLogService reconLogService) {
        _reconLogService = reconLogService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _reconLogService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _reconLogService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _reconLogService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ReconLogService getWrappedReconLogService() {
        return _reconLogService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedReconLogService(ReconLogService reconLogService) {
        _reconLogService = reconLogService;
    }

    @Override
    public ReconLogService getWrappedService() {
        return _reconLogService;
    }

    @Override
    public void setWrappedService(ReconLogService reconLogService) {
        _reconLogService = reconLogService;
    }
}
