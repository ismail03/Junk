package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TransactionStatusLocalService}.
 *
 * @author ahmed_fadlus
 * @see TransactionStatusLocalService
 * @generated
 */
public class TransactionStatusLocalServiceWrapper
    implements TransactionStatusLocalService,
        ServiceWrapper<TransactionStatusLocalService> {
    private TransactionStatusLocalService _transactionStatusLocalService;

    public TransactionStatusLocalServiceWrapper(
        TransactionStatusLocalService transactionStatusLocalService) {
        _transactionStatusLocalService = transactionStatusLocalService;
    }

    /**
    * Adds the transaction status to the database. Also notifies the appropriate model listeners.
    *
    * @param transactionStatus the transaction status
    * @return the transaction status that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.TransactionStatus addTransactionStatus(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.addTransactionStatus(transactionStatus);
    }

    /**
    * Creates a new transaction status with the primary key. Does not add the transaction status to the database.
    *
    * @param id the primary key for the new transaction status
    * @return the new transaction status
    */
    @Override
    public com.stc.echannels.epayments.model.TransactionStatus createTransactionStatus(
        long id) {
        return _transactionStatusLocalService.createTransactionStatus(id);
    }

    /**
    * Deletes the transaction status with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status that was removed
    * @throws PortalException if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.TransactionStatus deleteTransactionStatus(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.deleteTransactionStatus(id);
    }

    /**
    * Deletes the transaction status from the database. Also notifies the appropriate model listeners.
    *
    * @param transactionStatus the transaction status
    * @return the transaction status that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.TransactionStatus deleteTransactionStatus(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.deleteTransactionStatus(transactionStatus);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _transactionStatusLocalService.dynamicQuery();
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
        return _transactionStatusLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _transactionStatusLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _transactionStatusLocalService.dynamicQuery(dynamicQuery, start,
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
        return _transactionStatusLocalService.dynamicQueryCount(dynamicQuery);
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
        return _transactionStatusLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.TransactionStatus fetchTransactionStatus(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.fetchTransactionStatus(id);
    }

    /**
    * Returns the transaction status with the primary key.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status
    * @throws PortalException if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.TransactionStatus getTransactionStatus(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.getTransactionStatus(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the transaction statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of transaction statuses
    * @param end the upper bound of the range of transaction statuses (not inclusive)
    * @return the range of transaction statuses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.TransactionStatus> getTransactionStatuses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.getTransactionStatuses(start, end);
    }

    /**
    * Returns the number of transaction statuses.
    *
    * @return the number of transaction statuses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTransactionStatusesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.getTransactionStatusesCount();
    }

    /**
    * Updates the transaction status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param transactionStatus the transaction status
    * @return the transaction status that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.TransactionStatus updateTransactionStatus(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.updateTransactionStatus(transactionStatus);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _transactionStatusLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _transactionStatusLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _transactionStatusLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public com.stc.echannels.epayments.model.TransactionStatus addTransactionStatus(
        java.lang.String name, java.lang.String description,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.addTransactionStatus(name,
            description, serviceContext);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.TransactionStatus> findAll()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _transactionStatusLocalService.findAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TransactionStatusLocalService getWrappedTransactionStatusLocalService() {
        return _transactionStatusLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTransactionStatusLocalService(
        TransactionStatusLocalService transactionStatusLocalService) {
        _transactionStatusLocalService = transactionStatusLocalService;
    }

    @Override
    public TransactionStatusLocalService getWrappedService() {
        return _transactionStatusLocalService;
    }

    @Override
    public void setWrappedService(
        TransactionStatusLocalService transactionStatusLocalService) {
        _transactionStatusLocalService = transactionStatusLocalService;
    }
}
