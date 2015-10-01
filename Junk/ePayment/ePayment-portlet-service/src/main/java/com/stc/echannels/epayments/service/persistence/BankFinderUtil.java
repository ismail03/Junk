package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class BankFinderUtil {
    private static BankFinder _finder;

    public static java.util.List getBanksByBusinessServiceId(long serviceid) {
        return getFinder().getBanksByBusinessServiceId(serviceid);
    }

    public static BankFinder getFinder() {
        if (_finder == null) {
            _finder = (BankFinder) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    BankFinder.class.getName());

            ReferenceRegistry.registerReference(BankFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(BankFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(BankFinderUtil.class, "_finder");
    }
}
