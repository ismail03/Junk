package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BankServicesLocalService}.
 *
 * @author ahmed_fadlus
 * @see BankServicesLocalService
 * @generated
 */
public class BankServicesLocalServiceWrapper implements BankServicesLocalService,
    ServiceWrapper<BankServicesLocalService> {
    private BankServicesLocalService _bankServicesLocalService;

    public BankServicesLocalServiceWrapper(
        BankServicesLocalService bankServicesLocalService) {
        _bankServicesLocalService = bankServicesLocalService;
    }

    /**
    * Adds the bank services to the database. Also notifies the appropriate model listeners.
    *
    * @param bankServices the bank services
    * @return the bank services that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankServices addBankServices(
        com.stc.echannels.epayments.model.BankServices bankServices)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.addBankServices(bankServices);
    }

    /**
    * Creates a new bank services with the primary key. Does not add the bank services to the database.
    *
    * @param id the primary key for the new bank services
    * @return the new bank services
    */
    @Override
    public com.stc.echannels.epayments.model.BankServices createBankServices(
        java.lang.String id) {
        return _bankServicesLocalService.createBankServices(id);
    }

    /**
    * Deletes the bank services with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the bank services
    * @return the bank services that was removed
    * @throws PortalException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankServices deleteBankServices(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.deleteBankServices(id);
    }

    /**
    * Deletes the bank services from the database. Also notifies the appropriate model listeners.
    *
    * @param bankServices the bank services
    * @return the bank services that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankServices deleteBankServices(
        com.stc.echannels.epayments.model.BankServices bankServices)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.deleteBankServices(bankServices);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _bankServicesLocalService.dynamicQuery();
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
        return _bankServicesLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _bankServicesLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _bankServicesLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _bankServicesLocalService.dynamicQueryCount(dynamicQuery);
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
        return _bankServicesLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.BankServices fetchBankServices(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.fetchBankServices(id);
    }

    /**
    * Returns the bank services with the primary key.
    *
    * @param id the primary key of the bank services
    * @return the bank services
    * @throws PortalException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankServices getBankServices(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.getBankServices(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the bank serviceses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @return the range of bank serviceses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.BankServices> getBankServiceses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.getBankServiceses(start, end);
    }

    /**
    * Returns the number of bank serviceses.
    *
    * @return the number of bank serviceses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBankServicesesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.getBankServicesesCount();
    }

    /**
    * Updates the bank services in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bankServices the bank services
    * @return the bank services that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BankServices updateBankServices(
        com.stc.echannels.epayments.model.BankServices bankServices)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.updateBankServices(bankServices);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bankServicesLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bankServicesLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bankServicesLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.BankServices> getBanksAssociatedWithBankServices(
        java.lang.String servceid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.getBanksAssociatedWithBankServices(servceid);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.BankServices> getBanksIDsAssociatedWithBankServices(
        java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bankServicesLocalService.getBanksIDsAssociatedWithBankServices(bankid);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BankServicesLocalService getWrappedBankServicesLocalService() {
        return _bankServicesLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBankServicesLocalService(
        BankServicesLocalService bankServicesLocalService) {
        _bankServicesLocalService = bankServicesLocalService;
    }

    @Override
    public BankServicesLocalService getWrappedService() {
        return _bankServicesLocalService;
    }

    @Override
    public void setWrappedService(
        BankServicesLocalService bankServicesLocalService) {
        _bankServicesLocalService = bankServicesLocalService;
    }
}
