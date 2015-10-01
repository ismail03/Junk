package com.stc.echannels.epayments.service.persistence;

public interface PaymentRuleFinder {
    public java.util.List<com.stc.echannels.epayments.custommodel.PaymentRuleListModel> findActivePaymentRuleByServiceType(
        java.lang.Long serviceTypeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.Long findCountActivePaymentRuleByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int findMaxRuleId();

    public int findActiveReferencedServiceTypes();
}
