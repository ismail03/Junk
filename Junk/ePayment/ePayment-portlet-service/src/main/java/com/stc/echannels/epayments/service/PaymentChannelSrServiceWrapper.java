package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentChannelSrService}.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrService
 * @generated
 */
public class PaymentChannelSrServiceWrapper implements PaymentChannelSrService,
    ServiceWrapper<PaymentChannelSrService> {
    private PaymentChannelSrService _paymentChannelSrService;

    public PaymentChannelSrServiceWrapper(
        PaymentChannelSrService paymentChannelSrService) {
        _paymentChannelSrService = paymentChannelSrService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentChannelSrService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentChannelSrService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentChannelSrService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentChannelSrService getWrappedPaymentChannelSrService() {
        return _paymentChannelSrService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentChannelSrService(
        PaymentChannelSrService paymentChannelSrService) {
        _paymentChannelSrService = paymentChannelSrService;
    }

    @Override
    public PaymentChannelSrService getWrappedService() {
        return _paymentChannelSrService;
    }

    @Override
    public void setWrappedService(
        PaymentChannelSrService paymentChannelSrService) {
        _paymentChannelSrService = paymentChannelSrService;
    }
}
