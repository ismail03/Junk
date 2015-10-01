package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RefundLogLocalService}.
 *
 * @author ahmed_fadlus
 * @see RefundLogLocalService
 * @generated
 */
public class RefundLogLocalServiceWrapper implements RefundLogLocalService,
    ServiceWrapper<RefundLogLocalService> {
    private RefundLogLocalService _refundLogLocalService;

    public RefundLogLocalServiceWrapper(
        RefundLogLocalService refundLogLocalService) {
        _refundLogLocalService = refundLogLocalService;
    }

    /**
    * Adds the refund log to the database. Also notifies the appropriate model listeners.
    *
    * @param refundLog the refund log
    * @return the refund log that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundLog addRefundLog(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.addRefundLog(refundLog);
    }

    /**
    * Creates a new refund log with the primary key. Does not add the refund log to the database.
    *
    * @param epayTransId the primary key for the new refund log
    * @return the new refund log
    */
    @Override
    public com.stc.echannels.epayments.model.RefundLog createRefundLog(
        java.lang.String epayTransId) {
        return _refundLogLocalService.createRefundLog(epayTransId);
    }

    /**
    * Deletes the refund log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log that was removed
    * @throws PortalException if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundLog deleteRefundLog(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.deleteRefundLog(epayTransId);
    }

    /**
    * Deletes the refund log from the database. Also notifies the appropriate model listeners.
    *
    * @param refundLog the refund log
    * @return the refund log that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundLog deleteRefundLog(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.deleteRefundLog(refundLog);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _refundLogLocalService.dynamicQuery();
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
        return _refundLogLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _refundLogLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _refundLogLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _refundLogLocalService.dynamicQueryCount(dynamicQuery);
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
        return _refundLogLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.stc.echannels.epayments.model.RefundLog fetchRefundLog(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.fetchRefundLog(epayTransId);
    }

    /**
    * Returns the refund log with the primary key.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log
    * @throws PortalException if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundLog getRefundLog(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.getRefundLog(epayTransId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the refund logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refund logs
    * @param end the upper bound of the range of refund logs (not inclusive)
    * @return the range of refund logs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.RefundLog> getRefundLogs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.getRefundLogs(start, end);
    }

    /**
    * Returns the number of refund logs.
    *
    * @return the number of refund logs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRefundLogsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.getRefundLogsCount();
    }

    /**
    * Updates the refund log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param refundLog the refund log
    * @return the refund log that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundLog updateRefundLog(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.updateRefundLog(refundLog);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _refundLogLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _refundLogLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _refundLogLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List findTransactions(java.lang.String serviceId,
        java.lang.String transAmount, java.lang.String dateFrom,
        java.lang.String dateTo, java.lang.String paymentChannel,
        java.lang.String paymentMethod, java.lang.String pmtBankId,
        java.lang.String beneficiaryId, java.lang.String beneficiaryServiceNo,
        java.lang.String refundStatus, java.util.Locale locale)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refundLogLocalService.findTransactions(serviceId, transAmount,
            dateFrom, dateTo, paymentChannel, paymentMethod, pmtBankId,
            beneficiaryId, beneficiaryServiceNo, refundStatus, locale);
    }

    @Override
    public java.util.List<java.lang.String> getRefundStatuses() {
        return _refundLogLocalService.getRefundStatuses();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RefundLogLocalService getWrappedRefundLogLocalService() {
        return _refundLogLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRefundLogLocalService(
        RefundLogLocalService refundLogLocalService) {
        _refundLogLocalService = refundLogLocalService;
    }

    @Override
    public RefundLogLocalService getWrappedService() {
        return _refundLogLocalService;
    }

    @Override
    public void setWrappedService(RefundLogLocalService refundLogLocalService) {
        _refundLogLocalService = refundLogLocalService;
    }
}
