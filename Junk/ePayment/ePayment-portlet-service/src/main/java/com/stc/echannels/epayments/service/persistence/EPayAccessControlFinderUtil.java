package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class EPayAccessControlFinderUtil {
    private static EPayAccessControlFinder _finder;

    public static java.util.List<com.stc.echannels.epayments.custommodel.AccessControlModel> findActiveEpayAccessControlByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findActiveEpayAccessControlByServiceType(serviceTypeId);
    }

    public static void enableEPayAcessControl(long[] ids,
        com.stc.echannels.epayments.model.EPayAccessControl ePayAc)
        throws com.liferay.portal.kernel.exception.SystemException {
        getFinder().enableEPayAcessControl(ids, ePayAc);
    }

    public static int findMaxRuleId() {
        return getFinder().findMaxRuleId();
    }

    public static void addEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl accessControl) {
        getFinder().addEPayAccessControl(accessControl);
    }

    public static EPayAccessControlFinder getFinder() {
        if (_finder == null) {
            _finder = (EPayAccessControlFinder) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    EPayAccessControlFinder.class.getName());

            ReferenceRegistry.registerReference(EPayAccessControlFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(EPayAccessControlFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(EPayAccessControlFinderUtil.class,
            "_finder");
    }
}
