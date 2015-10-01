package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentMethodSrvsMapService}.
 *
 * @author ahmed_fadlus
 * @see PaymentMethodSrvsMapService
 * @generated
 */
public class PaymentMethodSrvsMapServiceWrapper
    implements PaymentMethodSrvsMapService,
        ServiceWrapper<PaymentMethodSrvsMapService> {
    private PaymentMethodSrvsMapService _paymentMethodSrvsMapService;

    public PaymentMethodSrvsMapServiceWrapper(
        PaymentMethodSrvsMapService paymentMethodSrvsMapService) {
        _paymentMethodSrvsMapService = paymentMethodSrvsMapService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentMethodSrvsMapService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentMethodSrvsMapService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentMethodSrvsMapService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentMethodSrvsMapService getWrappedPaymentMethodSrvsMapService() {
        return _paymentMethodSrvsMapService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentMethodSrvsMapService(
        PaymentMethodSrvsMapService paymentMethodSrvsMapService) {
        _paymentMethodSrvsMapService = paymentMethodSrvsMapService;
    }

    @Override
    public PaymentMethodSrvsMapService getWrappedService() {
        return _paymentMethodSrvsMapService;
    }

    @Override
    public void setWrappedService(
        PaymentMethodSrvsMapService paymentMethodSrvsMapService) {
        _paymentMethodSrvsMapService = paymentMethodSrvsMapService;
    }
}
