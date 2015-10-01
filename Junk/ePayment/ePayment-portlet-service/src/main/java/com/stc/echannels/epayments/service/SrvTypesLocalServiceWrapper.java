package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SrvTypesLocalService}.
 *
 * @author ahmed_fadlus
 * @see SrvTypesLocalService
 * @generated
 */
public class SrvTypesLocalServiceWrapper implements SrvTypesLocalService,
    ServiceWrapper<SrvTypesLocalService> {
    private SrvTypesLocalService _srvTypesLocalService;

    public SrvTypesLocalServiceWrapper(
        SrvTypesLocalService srvTypesLocalService) {
        _srvTypesLocalService = srvTypesLocalService;
    }

    /**
    * Adds the srv types to the database. Also notifies the appropriate model listeners.
    *
    * @param srvTypes the srv types
    * @return the srv types that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypes addSrvTypes(
        com.stc.echannels.epayments.model.SrvTypes srvTypes)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.addSrvTypes(srvTypes);
    }

    /**
    * Creates a new srv types with the primary key. Does not add the srv types to the database.
    *
    * @param serviceTypeId the primary key for the new srv types
    * @return the new srv types
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypes createSrvTypes(
        long serviceTypeId) {
        return _srvTypesLocalService.createSrvTypes(serviceTypeId);
    }

    /**
    * Deletes the srv types with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceTypeId the primary key of the srv types
    * @return the srv types that was removed
    * @throws PortalException if a srv types with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypes deleteSrvTypes(
        long serviceTypeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.deleteSrvTypes(serviceTypeId);
    }

    /**
    * Deletes the srv types from the database. Also notifies the appropriate model listeners.
    *
    * @param srvTypes the srv types
    * @return the srv types that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypes deleteSrvTypes(
        com.stc.echannels.epayments.model.SrvTypes srvTypes)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.deleteSrvTypes(srvTypes);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _srvTypesLocalService.dynamicQuery();
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
        return _srvTypesLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _srvTypesLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _srvTypesLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _srvTypesLocalService.dynamicQueryCount(dynamicQuery);
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
        return _srvTypesLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.stc.echannels.epayments.model.SrvTypes fetchSrvTypes(
        long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.fetchSrvTypes(serviceTypeId);
    }

    /**
    * Returns the srv types with the primary key.
    *
    * @param serviceTypeId the primary key of the srv types
    * @return the srv types
    * @throws PortalException if a srv types with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypes getSrvTypes(
        long serviceTypeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.getSrvTypes(serviceTypeId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the srv typeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of srv typeses
    * @param end the upper bound of the range of srv typeses (not inclusive)
    * @return the range of srv typeses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.SrvTypes> getSrvTypeses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.getSrvTypeses(start, end);
    }

    /**
    * Returns the number of srv typeses.
    *
    * @return the number of srv typeses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSrvTypesesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.getSrvTypesesCount();
    }

    /**
    * Updates the srv types in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param srvTypes the srv types
    * @return the srv types that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypes updateSrvTypes(
        com.stc.echannels.epayments.model.SrvTypes srvTypes)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypesLocalService.updateSrvTypes(srvTypes);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _srvTypesLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _srvTypesLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _srvTypesLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SrvTypesLocalService getWrappedSrvTypesLocalService() {
        return _srvTypesLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSrvTypesLocalService(
        SrvTypesLocalService srvTypesLocalService) {
        _srvTypesLocalService = srvTypesLocalService;
    }

    @Override
    public SrvTypesLocalService getWrappedService() {
        return _srvTypesLocalService;
    }

    @Override
    public void setWrappedService(SrvTypesLocalService srvTypesLocalService) {
        _srvTypesLocalService = srvTypesLocalService;
    }
}
