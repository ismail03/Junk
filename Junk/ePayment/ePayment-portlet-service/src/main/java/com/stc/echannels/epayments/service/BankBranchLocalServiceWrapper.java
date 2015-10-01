package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BankBranchLocalService}.
 *
 * @author ahmed_fadlus
 * @see BankBranchLocalService
 * @generated
 */
public class BankBranchLocalServiceWrapper implements BankBranchLocalService,
    ServiceWrapper<BankBranchLocalService> {
    private BankBranchLocalService _bankBranchLocalService;

    public BankBranchLocalServiceWrapper(
        BankBranchLocalService bankBranchLocalService) {
        _bankBranchLocalService = bankBranchLocalService;
    }

    /**
    * Adds the bank branch to the database. Also notifies the appropriate model listeners.
    *
    * @param bankBranch the bank branch
    * @return the bank branch that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankBranch addBankBranch(
        com.stc.echannels.epayments.model.BankBranch bankBranch)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.addBankBranch(bankBranch);
    }

    /**
    * Creates a new bank branch with the primary key. Does not add the bank branch to the database.
    *
    * @param transId the primary key for the new bank branch
    * @return the new bank branch
    */
    @Override
    public com.stc.echannels.epayments.model.BankBranch createBankBranch(
        java.lang.String transId) {
        return _bankBranchLocalService.createBankBranch(transId);
    }

    /**
    * Deletes the bank branch with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the bank branch
    * @return the bank branch that was removed
    * @throws PortalException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankBranch deleteBankBranch(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.deleteBankBranch(transId);
    }

    /**
    * Deletes the bank branch from the database. Also notifies the appropriate model listeners.
    *
    * @param bankBranch the bank branch
    * @return the bank branch that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankBranch deleteBankBranch(
        com.stc.echannels.epayments.model.BankBranch bankBranch)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.deleteBankBranch(bankBranch);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _bankBranchLocalService.dynamicQuery();
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
        return _bankBranchLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _bankBranchLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _bankBranchLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _bankBranchLocalService.dynamicQueryCount(dynamicQuery);
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
        return _bankBranchLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.BankBranch fetchBankBranch(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.fetchBankBranch(transId);
    }

    /**
    * Returns the bank branch with the primary key.
    *
    * @param transId the primary key of the bank branch
    * @return the bank branch
    * @throws PortalException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankBranch getBankBranch(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.getBankBranch(transId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the bank branchs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of bank branchs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> getBankBranchs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.getBankBranchs(start, end);
    }

    /**
    * Returns the number of bank branchs.
    *
    * @return the number of bank branchs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBankBranchsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.getBankBranchsCount();
    }

    /**
    * Updates the bank branch in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bankBranch the bank branch
    * @return the bank branch that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankBranch updateBankBranch(
        com.stc.echannels.epayments.model.BankBranch bankBranch)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.updateBankBranch(bankBranch);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bankBranchLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bankBranchLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bankBranchLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.stc.echannels.epayments.model.BankBranch addBankBranch(
        java.lang.String bankId, java.lang.String stcBranchCode,
        long channelId, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.addBankBranch(bankId, stcBranchCode,
            channelId, serviceContext);
    }

    @Override
    public com.stc.echannels.epayments.model.BankBranch deleteBankBranch(
        java.lang.String transId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.deleteBankBranch(transId, serviceContext);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> getActiveBankBranchesByStatus(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.getActiveBankBranchesByStatus(start, end);
    }

    @Override
    public java.lang.Integer getActiveBankBranchesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.getActiveBankBranchesCount();
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> getBankBranchs(
        java.lang.String bankId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.getBankBranchs(bankId);
    }

    @Override
    public boolean isStcBranchCodeExists(java.lang.String stcBranchCode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.isStcBranchCodeExists(stcBranchCode);
    }

    @Override
    public boolean isBankandPaymentChannelExists(java.lang.String bankId,
        long channelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankBranchLocalService.isBankandPaymentChannelExists(bankId,
            channelId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BankBranchLocalService getWrappedBankBranchLocalService() {
        return _bankBranchLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBankBranchLocalService(
        BankBranchLocalService bankBranchLocalService) {
        _bankBranchLocalService = bankBranchLocalService;
    }

    @Override
    public BankBranchLocalService getWrappedService() {
        return _bankBranchLocalService;
    }

    @Override
    public void setWrappedService(BankBranchLocalService bankBranchLocalService) {
        _bankBranchLocalService = bankBranchLocalService;
    }
}
