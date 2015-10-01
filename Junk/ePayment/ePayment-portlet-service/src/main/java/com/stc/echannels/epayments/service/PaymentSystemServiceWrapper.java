package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentSystemService}.
 *
 * @author ahmed_fadlus
 * @see PaymentSystemService
 * @generated
 */
public class PaymentSystemServiceWrapper implements PaymentSystemService,
    ServiceWrapper<PaymentSystemService> {
    private PaymentSystemService _paymentSystemService;

    public PaymentSystemServiceWrapper(
        PaymentSystemService paymentSystemService) {
        _paymentSystemService = paymentSystemService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentSystemService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentSystemService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentSystemService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentSystemService getWrappedPaymentSystemService() {
        return _paymentSystemService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentSystemService(
        PaymentSystemService paymentSystemService) {
        _paymentSystemService = paymentSystemService;
    }

    @Override
    public PaymentSystemService getWrappedService() {
        return _paymentSystemService;
    }

    @Override
    public void setWrappedService(PaymentSystemService paymentSystemService) {
        _paymentSystemService = paymentSystemService;
    }
}
