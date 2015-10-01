package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class BankBranchFinderUtil {
    private static BankBranchFinder _finder;

    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findCustomBankBranchByStatus(
        java.lang.String status, int start, int end) {
        return getFinder().findCustomBankBranchByStatus(status, start, end);
    }

    public static int getBankBranchCount(java.lang.String status) {
        return getFinder().getBankBranchCount(status);
    }

    public static com.liferay.portal.kernel.dao.orm.SQLQuery fetchQueryBankBranchByStatus(
        java.lang.String status) {
        return getFinder().fetchQueryBankBranchByStatus(status);
    }

    public static BankBranchFinder getFinder() {
        if (_finder == null) {
            _finder = (BankBranchFinder) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    BankBranchFinder.class.getName());

            ReferenceRegistry.registerReference(BankBranchFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(BankBranchFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(BankBranchFinderUtil.class,
            "_finder");
    }
}
