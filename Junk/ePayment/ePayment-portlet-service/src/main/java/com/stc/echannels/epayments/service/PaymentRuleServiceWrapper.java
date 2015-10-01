package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentRuleService}.
 *
 * @author ahmed_fadlus
 * @see PaymentRuleService
 * @generated
 */
public class PaymentRuleServiceWrapper implements PaymentRuleService,
    ServiceWrapper<PaymentRuleService> {
    private PaymentRuleService _paymentRuleService;

    public PaymentRuleServiceWrapper(PaymentRuleService paymentRuleService) {
        _paymentRuleService = paymentRuleService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentRuleService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentRuleService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentRuleService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentRuleService getWrappedPaymentRuleService() {
        return _paymentRuleService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentRuleService(
        PaymentRuleService paymentRuleService) {
        _paymentRuleService = paymentRuleService;
    }

    @Override
    public PaymentRuleService getWrappedService() {
        return _paymentRuleService;
    }

    @Override
    public void setWrappedService(PaymentRuleService paymentRuleService) {
        _paymentRuleService = paymentRuleService;
    }
}
