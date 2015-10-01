package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BizRuleConfigService}.
 *
 * @author ahmed_fadlus
 * @see BizRuleConfigService
 * @generated
 */
public class BizRuleConfigServiceWrapper implements BizRuleConfigService,
    ServiceWrapper<BizRuleConfigService> {
    private BizRuleConfigService _bizRuleConfigService;

    public BizRuleConfigServiceWrapper(
        BizRuleConfigService bizRuleConfigService) {
        _bizRuleConfigService = bizRuleConfigService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bizRuleConfigService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bizRuleConfigService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bizRuleConfigService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BizRuleConfigService getWrappedBizRuleConfigService() {
        return _bizRuleConfigService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBizRuleConfigService(
        BizRuleConfigService bizRuleConfigService) {
        _bizRuleConfigService = bizRuleConfigService;
    }

    @Override
    public BizRuleConfigService getWrappedService() {
        return _bizRuleConfigService;
    }

    @Override
    public void setWrappedService(BizRuleConfigService bizRuleConfigService) {
        _bizRuleConfigService = bizRuleConfigService;
    }
}
