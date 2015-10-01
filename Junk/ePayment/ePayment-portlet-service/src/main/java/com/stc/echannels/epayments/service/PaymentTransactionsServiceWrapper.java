package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentTransactionsService}.
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionsService
 * @generated
 */
public class PaymentTransactionsServiceWrapper
    implements PaymentTransactionsService,
        ServiceWrapper<PaymentTransactionsService> {
    private PaymentTransactionsService _paymentTransactionsService;

    public PaymentTransactionsServiceWrapper(
        PaymentTransactionsService paymentTransactionsService) {
        _paymentTransactionsService = paymentTransactionsService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentTransactionsService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentTransactionsService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentTransactionsService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentTransactionsService getWrappedPaymentTransactionsService() {
        return _paymentTransactionsService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentTransactionsService(
        PaymentTransactionsService paymentTransactionsService) {
        _paymentTransactionsService = paymentTransactionsService;
    }

    @Override
    public PaymentTransactionsService getWrappedService() {
        return _paymentTransactionsService;
    }

    @Override
    public void setWrappedService(
        PaymentTransactionsService paymentTransactionsService) {
        _paymentTransactionsService = paymentTransactionsService;
    }
}
