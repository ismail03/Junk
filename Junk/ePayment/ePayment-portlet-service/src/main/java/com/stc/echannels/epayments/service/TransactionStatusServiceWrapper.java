package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TransactionStatusService}.
 *
 * @author ahmed_fadlus
 * @see TransactionStatusService
 * @generated
 */
public class TransactionStatusServiceWrapper implements TransactionStatusService,
    ServiceWrapper<TransactionStatusService> {
    private TransactionStatusService _transactionStatusService;

    public TransactionStatusServiceWrapper(
        TransactionStatusService transactionStatusService) {
        _transactionStatusService = transactionStatusService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _transactionStatusService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _transactionStatusService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _transactionStatusService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TransactionStatusService getWrappedTransactionStatusService() {
        return _transactionStatusService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTransactionStatusService(
        TransactionStatusService transactionStatusService) {
        _transactionStatusService = transactionStatusService;
    }

    @Override
    public TransactionStatusService getWrappedService() {
        return _transactionStatusService;
    }

    @Override
    public void setWrappedService(
        TransactionStatusService transactionStatusService) {
        _transactionStatusService = transactionStatusService;
    }
}
