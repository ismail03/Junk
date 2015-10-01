package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentTransactionsLocalService}.
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionsLocalService
 * @generated
 */
public class PaymentTransactionsLocalServiceWrapper
    implements PaymentTransactionsLocalService,
        ServiceWrapper<PaymentTransactionsLocalService> {
    private PaymentTransactionsLocalService _paymentTransactionsLocalService;

    public PaymentTransactionsLocalServiceWrapper(
        PaymentTransactionsLocalService paymentTransactionsLocalService) {
        _paymentTransactionsLocalService = paymentTransactionsLocalService;
    }

    /**
    * Adds the payment transactions to the database. Also notifies the appropriate model listeners.
    *
    * @param paymentTransactions the payment transactions
    * @return the payment transactions that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentTransactions addPaymentTransactions(
        com.stc.echannels.epayments.model.PaymentTransactions paymentTransactions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.addPaymentTransactions(paymentTransactions);
    }

    /**
    * Creates a new payment transactions with the primary key. Does not add the payment transactions to the database.
    *
    * @param epayTransId the primary key for the new payment transactions
    * @return the new payment transactions
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentTransactions createPaymentTransactions(
        java.lang.String epayTransId) {
        return _paymentTransactionsLocalService.createPaymentTransactions(epayTransId);
    }

    /**
    * Deletes the payment transactions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayTransId the primary key of the payment transactions
    * @return the payment transactions that was removed
    * @throws PortalException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentTransactions deletePaymentTransactions(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.deletePaymentTransactions(epayTransId);
    }

    /**
    * Deletes the payment transactions from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentTransactions the payment transactions
    * @return the payment transactions that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentTransactions deletePaymentTransactions(
        com.stc.echannels.epayments.model.PaymentTransactions paymentTransactions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.deletePaymentTransactions(paymentTransactions);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _paymentTransactionsLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentTransactions fetchPaymentTransactions(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.fetchPaymentTransactions(epayTransId);
    }

    /**
    * Returns the payment transactions with the primary key.
    *
    * @param epayTransId the primary key of the payment transactions
    * @return the payment transactions
    * @throws PortalException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentTransactions getPaymentTransactions(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.getPaymentTransactions(epayTransId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the payment transactionses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @return the range of payment transactionses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> getPaymentTransactionses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.getPaymentTransactionses(start,
            end);
    }

    /**
    * Returns the number of payment transactionses.
    *
    * @return the number of payment transactionses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPaymentTransactionsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.getPaymentTransactionsesCount();
    }

    /**
    * Updates the payment transactions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param paymentTransactions the payment transactions
    * @return the payment transactions that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentTransactions updatePaymentTransactions(
        com.stc.echannels.epayments.model.PaymentTransactions paymentTransactions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentTransactionsLocalService.updatePaymentTransactions(paymentTransactions);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentTransactionsLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentTransactionsLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentTransactionsLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.custommodel.PaymentTransactionsCustomModel> findCustomPaymentTransactions(
        com.stc.echannels.epayments.custommodel.PaymentTransactionsCustomModel paymentTransactionsCustomModel) {
        return _paymentTransactionsLocalService.findCustomPaymentTransactions(paymentTransactionsCustomModel);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel> findCustomRefundTransactions(
        com.stc.echannels.epayments.custommodel.RefundTransactionsCustomModel refundTransactionsCustomModel) {
        return _paymentTransactionsLocalService.findCustomRefundTransactions(refundTransactionsCustomModel);
    }

    @Override
    public java.util.List<java.lang.String> getPaymentStatuses() {
        return _paymentTransactionsLocalService.getPaymentStatuses();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentTransactionsLocalService getWrappedPaymentTransactionsLocalService() {
        return _paymentTransactionsLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentTransactionsLocalService(
        PaymentTransactionsLocalService paymentTransactionsLocalService) {
        _paymentTransactionsLocalService = paymentTransactionsLocalService;
    }

    @Override
    public PaymentTransactionsLocalService getWrappedService() {
        return _paymentTransactionsLocalService;
    }

    @Override
    public void setWrappedService(
        PaymentTransactionsLocalService paymentTransactionsLocalService) {
        _paymentTransactionsLocalService = paymentTransactionsLocalService;
    }
}