package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentTransactionDetailsService}.
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionDetailsService
 * @generated
 */
public class PaymentTransactionDetailsServiceWrapper
    implements PaymentTransactionDetailsService,
        ServiceWrapper<PaymentTransactionDetailsService> {
    private PaymentTransactionDetailsService _paymentTransactionDetailsService;

    public PaymentTransactionDetailsServiceWrapper(
        PaymentTransactionDetailsService paymentTransactionDetailsService) {
        _paymentTransactionDetailsService = paymentTransactionDetailsService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentTransactionDetailsService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentTransactionDetailsService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentTransactionDetailsService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentTransactionDetailsService getWrappedPaymentTransactionDetailsService() {
        return _paymentTransactionDetailsService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentTransactionDetailsService(
        PaymentTransactionDetailsService paymentTransactionDetailsService) {
        _paymentTransactionDetailsService = paymentTransactionDetailsService;
    }

    @Override
    public PaymentTransactionDetailsService getWrappedService() {
        return _paymentTransactionDetailsService;
    }

    @Override
    public void setWrappedService(
        PaymentTransactionDetailsService paymentTransactionDetailsService) {
        _paymentTransactionDetailsService = paymentTransactionDetailsService;
    }
}
