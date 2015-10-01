package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class BusinessSrvFinderUtil {
    private static BusinessSrvFinder _finder;

    public static java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findBusinessServiceExcludingSADAD() {
        return getFinder().findBusinessServiceExcludingSADAD();
    }

    public static BusinessSrvFinder getFinder() {
        if (_finder == null) {
            _finder = (BusinessSrvFinder) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    BusinessSrvFinder.class.getName());

            ReferenceRegistry.registerReference(BusinessSrvFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(BusinessSrvFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(BusinessSrvFinderUtil.class,
            "_finder");
    }
}
