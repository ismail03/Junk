package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class PaymentTransactionsFinderUtil {
    private static PaymentTransactionsFinder _finder;

    public static java.util.List<com.stc.echannels.epayments.custommodel.PaymentTransactionsCustomModel> findCustomPaymentTransactions(
        com.stc.echannels.epayments.custommodel.PaymentTransactionsCustomModel searchPaymentTransactionsCustomModel,
        int start, int end) {
        return getFinder()
                   .findCustomPaymentTransactions(searchPaymentTransactionsCustomModel,
            start, end);
    }

    public static java.util.List<com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel> findCustomRefundTransactions(
        com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel searchRefundTransactionsCustomModel,
        int start, int end) {
        return getFinder()
                   .findCustomRefundTransactions(searchRefundTransactionsCustomModel,
            start, end);
    }

    public static PaymentTransactionsFinder getFinder() {
        if (_finder == null) {
            _finder = (PaymentTransactionsFinder) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    PaymentTransactionsFinder.class.getName());

            ReferenceRegistry.registerReference(PaymentTransactionsFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(PaymentTransactionsFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(PaymentTransactionsFinderUtil.class,
            "_finder");
    }
}
