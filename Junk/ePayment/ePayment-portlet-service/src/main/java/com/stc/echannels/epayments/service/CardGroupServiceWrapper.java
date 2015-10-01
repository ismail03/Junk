package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CardGroupService}.
 *
 * @author ahmed_fadlus
 * @see CardGroupService
 * @generated
 */
public class CardGroupServiceWrapper implements CardGroupService,
    ServiceWrapper<CardGroupService> {
    private CardGroupService _cardGroupService;

    public CardGroupServiceWrapper(CardGroupService cardGroupService) {
        _cardGroupService = cardGroupService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _cardGroupService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _cardGroupService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _cardGroupService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CardGroupService getWrappedCardGroupService() {
        return _cardGroupService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCardGroupService(CardGroupService cardGroupService) {
        _cardGroupService = cardGroupService;
    }

    @Override
    public CardGroupService getWrappedService() {
        return _cardGroupService;
    }

    @Override
    public void setWrappedService(CardGroupService cardGroupService) {
        _cardGroupService = cardGroupService;
    }
}
