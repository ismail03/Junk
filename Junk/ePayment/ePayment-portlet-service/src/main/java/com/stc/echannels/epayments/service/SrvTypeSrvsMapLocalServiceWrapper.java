package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SrvTypeSrvsMapLocalService}.
 *
 * @author ahmed_fadlus
 * @see SrvTypeSrvsMapLocalService
 * @generated
 */
public class SrvTypeSrvsMapLocalServiceWrapper
    implements SrvTypeSrvsMapLocalService,
        ServiceWrapper<SrvTypeSrvsMapLocalService> {
    private SrvTypeSrvsMapLocalService _srvTypeSrvsMapLocalService;

    public SrvTypeSrvsMapLocalServiceWrapper(
        SrvTypeSrvsMapLocalService srvTypeSrvsMapLocalService) {
        _srvTypeSrvsMapLocalService = srvTypeSrvsMapLocalService;
    }

    /**
    * Adds the srv type srvs map to the database. Also notifies the appropriate model listeners.
    *
    * @param srvTypeSrvsMap the srv type srvs map
    * @return the srv type srvs map that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap addSrvTypeSrvsMap(
        com.stc.echannels.epayments.model.SrvTypeSrvsMap srvTypeSrvsMap)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.addSrvTypeSrvsMap(srvTypeSrvsMap);
    }

    /**
    * Creates a new srv type srvs map with the primary key. Does not add the srv type srvs map to the database.
    *
    * @param id the primary key for the new srv type srvs map
    * @return the new srv type srvs map
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap createSrvTypeSrvsMap(
        java.lang.String id) {
        return _srvTypeSrvsMapLocalService.createSrvTypeSrvsMap(id);
    }

    /**
    * Deletes the srv type srvs map with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the srv type srvs map
    * @return the srv type srvs map that was removed
    * @throws PortalException if a srv type srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap deleteSrvTypeSrvsMap(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.deleteSrvTypeSrvsMap(id);
    }

    /**
    * Deletes the srv type srvs map from the database. Also notifies the appropriate model listeners.
    *
    * @param srvTypeSrvsMap the srv type srvs map
    * @return the srv type srvs map that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap deleteSrvTypeSrvsMap(
        com.stc.echannels.epayments.model.SrvTypeSrvsMap srvTypeSrvsMap)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.deleteSrvTypeSrvsMap(srvTypeSrvsMap);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _srvTypeSrvsMapLocalService.dynamicQuery();
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
        return _srvTypeSrvsMapLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _srvTypeSrvsMapLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _srvTypeSrvsMapLocalService.dynamicQuery(dynamicQuery, start,
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
        return _srvTypeSrvsMapLocalService.dynamicQueryCount(dynamicQuery);
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
        return _srvTypeSrvsMapLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap fetchSrvTypeSrvsMap(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.fetchSrvTypeSrvsMap(id);
    }

    /**
    * Returns the srv type srvs map with the primary key.
    *
    * @param id the primary key of the srv type srvs map
    * @return the srv type srvs map
    * @throws PortalException if a srv type srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap getSrvTypeSrvsMap(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.getSrvTypeSrvsMap(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the srv type srvs maps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of srv type srvs maps
    * @param end the upper bound of the range of srv type srvs maps (not inclusive)
    * @return the range of srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.SrvTypeSrvsMap> getSrvTypeSrvsMaps(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.getSrvTypeSrvsMaps(start, end);
    }

    /**
    * Returns the number of srv type srvs maps.
    *
    * @return the number of srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSrvTypeSrvsMapsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.getSrvTypeSrvsMapsCount();
    }

    /**
    * Updates the srv type srvs map in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param srvTypeSrvsMap the srv type srvs map
    * @return the srv type srvs map that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap updateSrvTypeSrvsMap(
        com.stc.echannels.epayments.model.SrvTypeSrvsMap srvTypeSrvsMap)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _srvTypeSrvsMapLocalService.updateSrvTypeSrvsMap(srvTypeSrvsMap);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _srvTypeSrvsMapLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _srvTypeSrvsMapLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _srvTypeSrvsMapLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SrvTypeSrvsMapLocalService getWrappedSrvTypeSrvsMapLocalService() {
        return _srvTypeSrvsMapLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSrvTypeSrvsMapLocalService(
        SrvTypeSrvsMapLocalService srvTypeSrvsMapLocalService) {
        _srvTypeSrvsMapLocalService = srvTypeSrvsMapLocalService;
    }

    @Override
    public SrvTypeSrvsMapLocalService getWrappedService() {
        return _srvTypeSrvsMapLocalService;
    }

    @Override
    public void setWrappedService(
        SrvTypeSrvsMapLocalService srvTypeSrvsMapLocalService) {
        _srvTypeSrvsMapLocalService = srvTypeSrvsMapLocalService;
    }
}
