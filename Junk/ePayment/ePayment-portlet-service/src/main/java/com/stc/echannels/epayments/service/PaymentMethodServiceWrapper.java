package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentMethodService}.
 *
 * @author ahmed_fadlus
 * @see PaymentMethodService
 * @generated
 */
public class PaymentMethodServiceWrapper implements PaymentMethodService,
    ServiceWrapper<PaymentMethodService> {
    private PaymentMethodService _paymentMethodService;

    public PaymentMethodServiceWrapper(
        PaymentMethodService paymentMethodService) {
        _paymentMethodService = paymentMethodService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentMethodService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentMethodService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentMethodService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentMethodService getWrappedPaymentMethodService() {
        return _paymentMethodService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentMethodService(
        PaymentMethodService paymentMethodService) {
        _paymentMethodService = paymentMethodService;
    }

    @Override
    public PaymentMethodService getWrappedService() {
        return _paymentMethodService;
    }

    @Override
    public void setWrappedService(PaymentMethodService paymentMethodService) {
        _paymentMethodService = paymentMethodService;
    }
}
