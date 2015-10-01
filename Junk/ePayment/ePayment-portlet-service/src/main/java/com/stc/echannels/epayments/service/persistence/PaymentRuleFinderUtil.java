package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class PaymentRuleFinderUtil {
    private static PaymentRuleFinder _finder;

    public static java.util.List<com.stc.echannels.epayments.custommodel.PaymentRuleListModel> findActivePaymentRuleByServiceType(
        java.lang.Long serviceTypeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findActivePaymentRuleByServiceType(serviceTypeId, start, end);
    }

    public static java.lang.Long findCountActivePaymentRuleByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findCountActivePaymentRuleByServiceType(serviceTypeId);
    }

    public static int findMaxRuleId() {
        return getFinder().findMaxRuleId();
    }

    public static int findActiveReferencedServiceTypes() {
        return getFinder().findActiveReferencedServiceTypes();
    }

    public static PaymentRuleFinder getFinder() {
        if (_finder == null) {
            _finder = (PaymentRuleFinder) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    PaymentRuleFinder.class.getName());

            ReferenceRegistry.registerReference(PaymentRuleFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(PaymentRuleFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(PaymentRuleFinderUtil.class,
            "_finder");
    }
}
