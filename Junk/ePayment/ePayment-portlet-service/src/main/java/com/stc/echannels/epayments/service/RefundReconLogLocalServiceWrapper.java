package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RefundReconLogLocalService}.
 *
 * @author ahmed_fadlus
 * @see RefundReconLogLocalService
 * @generated
 */
public class RefundReconLogLocalServiceWrapper
    implements RefundReconLogLocalService,
        ServiceWrapper<RefundReconLogLocalService> {
    private RefundReconLogLocalService _refundReconLogLocalService;

    public RefundReconLogLocalServiceWrapper(
        RefundReconLogLocalService refundReconLogLocalService) {
        _refundReconLogLocalService = refundReconLogLocalService;
    }

    /**
    * Adds the refund recon log to the database. Also notifies the appropriate model listeners.
    *
    * @param refundReconLog the refund recon log
    * @return the refund recon log that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundReconLog addRefundReconLog(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.addRefundReconLog(refundReconLog);
    }

    /**
    * Creates a new refund recon log with the primary key. Does not add the refund recon log to the database.
    *
    * @param batchId the primary key for the new refund recon log
    * @return the new refund recon log
    */
    @Override
    public com.stc.echannels.epayments.model.RefundReconLog createRefundReconLog(
        java.lang.String batchId) {
        return _refundReconLogLocalService.createRefundReconLog(batchId);
    }

    /**
    * Deletes the refund recon log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param batchId the primary key of the refund recon log
    * @return the refund recon log that was removed
    * @throws PortalException if a refund recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundReconLog deleteRefundReconLog(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.deleteRefundReconLog(batchId);
    }

    /**
    * Deletes the refund recon log from the database. Also notifies the appropriate model listeners.
    *
    * @param refundReconLog the refund recon log
    * @return the refund recon log that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundReconLog deleteRefundReconLog(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.deleteRefundReconLog(refundReconLog);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _refundReconLogLocalService.dynamicQuery();
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
        return _refundReconLogLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _refundReconLogLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _refundReconLogLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _refundReconLogLocalService.dynamicQueryCount(dynamicQuery);
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
        return _refundReconLogLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.RefundReconLog fetchRefundReconLog(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.fetchRefundReconLog(batchId);
    }

    /**
    * Returns the refund recon log with the primary key.
    *
    * @param batchId the primary key of the refund recon log
    * @return the refund recon log
    * @throws PortalException if a refund recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundReconLog getRefundReconLog(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.getRefundReconLog(batchId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the refund recon logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refund recon logs
    * @param end the upper bound of the range of refund recon logs (not inclusive)
    * @return the range of refund recon logs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.RefundReconLog> getRefundReconLogs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.getRefundReconLogs(start, end);
    }

    /**
    * Returns the number of refund recon logs.
    *
    * @return the number of refund recon logs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRefundReconLogsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.getRefundReconLogsCount();
    }

    /**
    * Updates the refund recon log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param refundReconLog the refund recon log
    * @return the refund recon log that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.RefundReconLog updateRefundReconLog(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.updateRefundReconLog(refundReconLog);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _refundReconLogLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _refundReconLogLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _refundReconLogLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List findTransactions(java.lang.String serviceId,
        java.lang.String reconciliationDate, java.lang.String pmtBankId,
        java.lang.String reconciliationType, java.util.Locale locale)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _refundReconLogLocalService.findTransactions(serviceId,
            reconciliationDate, pmtBankId, reconciliationType, locale);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RefundReconLogLocalService getWrappedRefundReconLogLocalService() {
        return _refundReconLogLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRefundReconLogLocalService(
        RefundReconLogLocalService refundReconLogLocalService) {
        _refundReconLogLocalService = refundReconLogLocalService;
    }

    @Override
    public RefundReconLogLocalService getWrappedService() {
        return _refundReconLogLocalService;
    }

    @Override
    public void setWrappedService(
        RefundReconLogLocalService refundReconLogLocalService) {
        _refundReconLogLocalService = refundReconLogLocalService;
    }
}