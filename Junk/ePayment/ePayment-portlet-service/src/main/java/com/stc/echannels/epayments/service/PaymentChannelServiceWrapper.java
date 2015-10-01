package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentChannelService}.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelService
 * @generated
 */
public class PaymentChannelServiceWrapper implements PaymentChannelService,
    ServiceWrapper<PaymentChannelService> {
    private PaymentChannelService _paymentChannelService;

    public PaymentChannelServiceWrapper(
        PaymentChannelService paymentChannelService) {
        _paymentChannelService = paymentChannelService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentChannelService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentChannelService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentChannelService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentChannelService getWrappedPaymentChannelService() {
        return _paymentChannelService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentChannelService(
        PaymentChannelService paymentChannelService) {
        _paymentChannelService = paymentChannelService;
    }

    @Override
    public PaymentChannelService getWrappedService() {
        return _paymentChannelService;
    }

    @Override
    public void setWrappedService(PaymentChannelService paymentChannelService) {
        _paymentChannelService = paymentChannelService;
    }
}
