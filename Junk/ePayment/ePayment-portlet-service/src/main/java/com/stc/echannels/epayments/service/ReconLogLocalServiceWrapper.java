package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReconLogLocalService}.
 *
 * @author ahmed_fadlus
 * @see ReconLogLocalService
 * @generated
 */
public class ReconLogLocalServiceWrapper implements ReconLogLocalService,
    ServiceWrapper<ReconLogLocalService> {
    private ReconLogLocalService _reconLogLocalService;

    public ReconLogLocalServiceWrapper(
        ReconLogLocalService reconLogLocalService) {
        _reconLogLocalService = reconLogLocalService;
    }

    /**
    * Adds the recon log to the database. Also notifies the appropriate model listeners.
    *
    * @param reconLog the recon log
    * @return the recon log that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.ReconLog addReconLog(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.addReconLog(reconLog);
    }

    /**
    * Creates a new recon log with the primary key. Does not add the recon log to the database.
    *
    * @param paymentSystemTransId the primary key for the new recon log
    * @return the new recon log
    */
    @Override
    public com.stc.echannels.epayments.model.ReconLog createReconLog(
        java.lang.String paymentSystemTransId) {
        return _reconLogLocalService.createReconLog(paymentSystemTransId);
    }

    /**
    * Deletes the recon log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log that was removed
    * @throws PortalException if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.ReconLog deleteReconLog(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.deleteReconLog(paymentSystemTransId);
    }

    /**
    * Deletes the recon log from the database. Also notifies the appropriate model listeners.
    *
    * @param reconLog the recon log
    * @return the recon log that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.ReconLog deleteReconLog(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.deleteReconLog(reconLog);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _reconLogLocalService.dynamicQuery();
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
        return _reconLogLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _reconLogLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _reconLogLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _reconLogLocalService.dynamicQueryCount(dynamicQuery);
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
        return _reconLogLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.stc.echannels.epayments.model.ReconLog fetchReconLog(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.fetchReconLog(paymentSystemTransId);
    }

    /**
    * Returns the recon log with the primary key.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log
    * @throws PortalException if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.ReconLog getReconLog(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.getReconLog(paymentSystemTransId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the recon logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of recon logs
    * @param end the upper bound of the range of recon logs (not inclusive)
    * @return the range of recon logs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.ReconLog> getReconLogs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.getReconLogs(start, end);
    }

    /**
    * Returns the number of recon logs.
    *
    * @return the number of recon logs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getReconLogsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.getReconLogsCount();
    }

    /**
    * Updates the recon log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param reconLog the recon log
    * @return the recon log that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.ReconLog updateReconLog(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.updateReconLog(reconLog);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _reconLogLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _reconLogLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _reconLogLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List findTransactions(java.lang.String serviceId,
        java.lang.String date, java.lang.String paymentStatus,
        java.lang.String pmtBankId, java.util.Locale locale)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _reconLogLocalService.findTransactions(serviceId, date,
            paymentStatus, pmtBankId, locale);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ReconLogLocalService getWrappedReconLogLocalService() {
        return _reconLogLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedReconLogLocalService(
        ReconLogLocalService reconLogLocalService) {
        _reconLogLocalService = reconLogLocalService;
    }

    @Override
    public ReconLogLocalService getWrappedService() {
        return _reconLogLocalService;
    }

    @Override
    public void setWrappedService(ReconLogLocalService reconLogLocalService) {
        _reconLogLocalService = reconLogLocalService;
    }
}
