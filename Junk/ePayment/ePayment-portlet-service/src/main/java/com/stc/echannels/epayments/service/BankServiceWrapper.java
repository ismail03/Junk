package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BankService}.
 *
 * @author ahmed_fadlus
 * @see BankService
 * @generated
 */
public class BankServiceWrapper implements BankService,
    ServiceWrapper<BankService> {
    private BankService _bankService;

    public BankServiceWrapper(BankService bankService) {
        _bankService = bankService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bankService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bankService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bankService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BankService getWrappedBankService() {
        return _bankService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBankService(BankService bankService) {
        _bankService = bankService;
    }

    @Override
    public BankService getWrappedService() {
        return _bankService;
    }

    @Override
    public void setWrappedService(BankService bankService) {
        _bankService = bankService;
    }
}
