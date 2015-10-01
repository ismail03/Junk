package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentChannelSrvsMapService}.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrvsMapService
 * @generated
 */
public class PaymentChannelSrvsMapServiceWrapper
    implements PaymentChannelSrvsMapService,
        ServiceWrapper<PaymentChannelSrvsMapService> {
    private PaymentChannelSrvsMapService _paymentChannelSrvsMapService;

    public PaymentChannelSrvsMapServiceWrapper(
        PaymentChannelSrvsMapService paymentChannelSrvsMapService) {
        _paymentChannelSrvsMapService = paymentChannelSrvsMapService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentChannelSrvsMapService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentChannelSrvsMapService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentChannelSrvsMapService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentChannelSrvsMapService getWrappedPaymentChannelSrvsMapService() {
        return _paymentChannelSrvsMapService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentChannelSrvsMapService(
        PaymentChannelSrvsMapService paymentChannelSrvsMapService) {
        _paymentChannelSrvsMapService = paymentChannelSrvsMapService;
    }

    @Override
    public PaymentChannelSrvsMapService getWrappedService() {
        return _paymentChannelSrvsMapService;
    }

    @Override
    public void setWrappedService(
        PaymentChannelSrvsMapService paymentChannelSrvsMapService) {
        _paymentChannelSrvsMapService = paymentChannelSrvsMapService;
    }
}
