package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class BizRuleConfigFinderUtil {
    private static BizRuleConfigFinder _finder;

    public static java.util.List<com.stc.echannels.epayments.custommodel.BizRuleConfigModel> findActiveBizRuleByServiceType(
        java.lang.Long serviceTypeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findActiveBizRuleByServiceType(serviceTypeId, start, end);
    }

    public static java.lang.Long findCountBizRuleByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findCountBizRuleByServiceType(serviceTypeId);
    }

    public static void addBizRuleConfig(
        com.stc.echannels.epayments.model.BizRuleConfig bizRuleConfig) {
        getFinder().addBizRuleConfig(bizRuleConfig);
    }

    public static void updateBizRuleConfigToInActive(long[] recordIds) {
        getFinder().updateBizRuleConfigToInActive(recordIds);
    }

    public static BizRuleConfigFinder getFinder() {
        if (_finder == null) {
            _finder = (BizRuleConfigFinder) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    BizRuleConfigFinder.class.getName());

            ReferenceRegistry.registerReference(BizRuleConfigFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(BizRuleConfigFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(BizRuleConfigFinderUtil.class,
            "_finder");
    }
}
