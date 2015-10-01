package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BankServicesService}.
 *
 * @author ahmed_fadlus
 * @see BankServicesService
 * @generated
 */
public class BankServicesServiceWrapper implements BankServicesService,
    ServiceWrapper<BankServicesService> {
    private BankServicesService _bankServicesService;

    public BankServicesServiceWrapper(BankServicesService bankServicesService) {
        _bankServicesService = bankServicesService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bankServicesService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bankServicesService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bankServicesService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BankServicesService getWrappedBankServicesService() {
        return _bankServicesService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBankServicesService(
        BankServicesService bankServicesService) {
        _bankServicesService = bankServicesService;
    }

    @Override
    public BankServicesService getWrappedService() {
        return _bankServicesService;
    }

    @Override
    public void setWrappedService(BankServicesService bankServicesService) {
        _bankServicesService = bankServicesService;
    }
}
