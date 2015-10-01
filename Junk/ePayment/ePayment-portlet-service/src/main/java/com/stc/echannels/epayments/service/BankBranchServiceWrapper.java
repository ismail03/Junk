package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BankBranchService}.
 *
 * @author ahmed_fadlus
 * @see BankBranchService
 * @generated
 */
public class BankBranchServiceWrapper implements BankBranchService,
    ServiceWrapper<BankBranchService> {
    private BankBranchService _bankBranchService;

    public BankBranchServiceWrapper(BankBranchService bankBranchService) {
        _bankBranchService = bankBranchService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bankBranchService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bankBranchService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bankBranchService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BankBranchService getWrappedBankBranchService() {
        return _bankBranchService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBankBranchService(BankBranchService bankBranchService) {
        _bankBranchService = bankBranchService;
    }

    @Override
    public BankBranchService getWrappedService() {
        return _bankBranchService;
    }

    @Override
    public void setWrappedService(BankBranchService bankBranchService) {
        _bankBranchService = bankBranchService;
    }
}
