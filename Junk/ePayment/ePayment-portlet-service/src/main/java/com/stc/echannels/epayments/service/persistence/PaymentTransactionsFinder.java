package com.stc.echannels.epayments.service.persistence;

public interface PaymentTransactionsFinder {
    public java.util.List<com.stc.echannels.epayments.custommodel.PaymentTransactionsCustomModel> findCustomPaymentTransactions(
        com.stc.echannels.epayments.custommodel.PaymentTransactionsCustomModel searchPaymentTransactionsCustomModel,
        int start, int end);

    public java.util.List<com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel> findCustomRefundTransactions(
        com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel searchRefundTransactionsCustomModel,
        int start, int end);
}
