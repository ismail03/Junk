package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BusinessSrvLocalService}.
 *
 * @author ahmed_fadlus
 * @see BusinessSrvLocalService
 * @generated
 */
public class BusinessSrvLocalServiceWrapper implements BusinessSrvLocalService,
    ServiceWrapper<BusinessSrvLocalService> {
    private BusinessSrvLocalService _businessSrvLocalService;

    public BusinessSrvLocalServiceWrapper(
        BusinessSrvLocalService businessSrvLocalService) {
        _businessSrvLocalService = businessSrvLocalService;
    }

    /**
    * Adds the business srv to the database. Also notifies the appropriate model listeners.
    *
    * @param businessSrv the business srv
    * @return the business srv that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BusinessSrv addBusinessSrv(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.addBusinessSrv(businessSrv);
    }

    /**
    * Creates a new business srv with the primary key. Does not add the business srv to the database.
    *
    * @param serviceId the primary key for the new business srv
    * @return the new business srv
    */
    @Override
    public com.stc.echannels.epayments.model.BusinessSrv createBusinessSrv(
        long serviceId) {
        return _businessSrvLocalService.createBusinessSrv(serviceId);
    }

    /**
    * Deletes the business srv with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceId the primary key of the business srv
    * @return the business srv that was removed
    * @throws PortalException if a business srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BusinessSrv deleteBusinessSrv(
        long serviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.deleteBusinessSrv(serviceId);
    }

    /**
    * Deletes the business srv from the database. Also notifies the appropriate model listeners.
    *
    * @param businessSrv the business srv
    * @return the business srv that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BusinessSrv deleteBusinessSrv(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.deleteBusinessSrv(businessSrv);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _businessSrvLocalService.dynamicQuery();
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
        return _businessSrvLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _businessSrvLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _businessSrvLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _businessSrvLocalService.dynamicQueryCount(dynamicQuery);
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
        return _businessSrvLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.BusinessSrv fetchBusinessSrv(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.fetchBusinessSrv(serviceId);
    }

    /**
    * Returns the business srv with the primary key.
    *
    * @param serviceId the primary key of the business srv
    * @return the business srv
    * @throws PortalException if a business srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BusinessSrv getBusinessSrv(
        long serviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.getBusinessSrv(serviceId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the business srvs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of business srvs
    * @param end the upper bound of the range of business srvs (not inclusive)
    * @return the range of business srvs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> getBusinessSrvs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.getBusinessSrvs(start, end);
    }

    /**
    * Returns the number of business srvs.
    *
    * @return the number of business srvs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBusinessSrvsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.getBusinessSrvsCount();
    }

    /**
    * Updates the business srv in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param businessSrv the business srv
    * @return the business srv that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.BusinessSrv updateBusinessSrv(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.updateBusinessSrv(businessSrv);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _businessSrvLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _businessSrvLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _businessSrvLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.stc.echannels.epayments.model.BusinessSrv addBusinessSrv(
        java.lang.String serviceName, java.lang.String nameAr,
        java.lang.String nameEn, long active, java.util.Date effectiveDate,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.addBusinessSrv(serviceName, nameAr,
            nameEn, active, effectiveDate, serviceContext);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> getBusinessServices()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.getBusinessServices();
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findBusinessServiceExcludingSADAD()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _businessSrvLocalService.findBusinessServiceExcludingSADAD();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BusinessSrvLocalService getWrappedBusinessSrvLocalService() {
        return _businessSrvLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBusinessSrvLocalService(
        BusinessSrvLocalService businessSrvLocalService) {
        _businessSrvLocalService = businessSrvLocalService;
    }

    @Override
    public BusinessSrvLocalService getWrappedService() {
        return _businessSrvLocalService;
    }

    @Override
    public void setWrappedService(
        BusinessSrvLocalService businessSrvLocalService) {
        _businessSrvLocalService = businessSrvLocalService;
    }
}
