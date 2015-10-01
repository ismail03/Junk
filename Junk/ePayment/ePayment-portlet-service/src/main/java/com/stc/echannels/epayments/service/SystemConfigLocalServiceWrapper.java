package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SystemConfigLocalService}.
 *
 * @author ahmed_fadlus
 * @see SystemConfigLocalService
 * @generated
 */
public class SystemConfigLocalServiceWrapper implements SystemConfigLocalService,
    ServiceWrapper<SystemConfigLocalService> {
    private SystemConfigLocalService _systemConfigLocalService;

    public SystemConfigLocalServiceWrapper(
        SystemConfigLocalService systemConfigLocalService) {
        _systemConfigLocalService = systemConfigLocalService;
    }

    /**
    * Adds the system config to the database. Also notifies the appropriate model listeners.
    *
    * @param systemConfig the system config
    * @return the system config that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SystemConfig addSystemConfig(
        com.stc.echannels.epayments.model.SystemConfig systemConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.addSystemConfig(systemConfig);
    }

    /**
    * Creates a new system config with the primary key. Does not add the system config to the database.
    *
    * @param transId the primary key for the new system config
    * @return the new system config
    */
    @Override
    public com.stc.echannels.epayments.model.SystemConfig createSystemConfig(
        java.lang.String transId) {
        return _systemConfigLocalService.createSystemConfig(transId);
    }

    /**
    * Deletes the system config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the system config
    * @return the system config that was removed
    * @throws PortalException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SystemConfig deleteSystemConfig(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.deleteSystemConfig(transId);
    }

    /**
    * Deletes the system config from the database. Also notifies the appropriate model listeners.
    *
    * @param systemConfig the system config
    * @return the system config that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SystemConfig deleteSystemConfig(
        com.stc.echannels.epayments.model.SystemConfig systemConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.deleteSystemConfig(systemConfig);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _systemConfigLocalService.dynamicQuery();
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
        return _systemConfigLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _systemConfigLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _systemConfigLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _systemConfigLocalService.dynamicQueryCount(dynamicQuery);
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
        return _systemConfigLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.SystemConfig fetchSystemConfig(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.fetchSystemConfig(transId);
    }

    /**
    * Returns the system config with the primary key.
    *
    * @param transId the primary key of the system config
    * @return the system config
    * @throws PortalException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SystemConfig getSystemConfig(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.getSystemConfig(transId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the system configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of system configs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> getSystemConfigs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.getSystemConfigs(start, end);
    }

    /**
    * Returns the number of system configs.
    *
    * @return the number of system configs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSystemConfigsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.getSystemConfigsCount();
    }

    /**
    * Updates the system config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param systemConfig the system config
    * @return the system config that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.SystemConfig updateSystemConfig(
        com.stc.echannels.epayments.model.SystemConfig systemConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.updateSystemConfig(systemConfig);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _systemConfigLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _systemConfigLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _systemConfigLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.stc.echannels.epayments.model.SystemConfig addSystemConfig(
        long serviceId, java.lang.String bankId, java.lang.String config,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.addSystemConfig(serviceId, bankId,
            config, serviceContext);
    }

    @Override
    public com.stc.echannels.epayments.model.SystemConfig updateSystemConfig(
        java.lang.String transId, long serviceId, java.lang.String bankId,
        java.lang.String config,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.updateSystemConfig(transId, serviceId,
            bankId, config, serviceContext);
    }

    @Override
    public java.lang.String getColumns(
        javax.portlet.PortletConfig portletConfig, java.util.Locale locale,
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.getColumns(portletConfig, locale,
            serviceId);
    }

    @Override
    public java.lang.String getData(java.util.Locale locale, long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.getData(locale, serviceId);
    }

    @Override
    public com.stc.echannels.epayments.model.SystemConfig deleteSystemConfig(
        java.lang.String transId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.deleteSystemConfig(transId,
            serviceContext);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> getSystemConfigs(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _systemConfigLocalService.getSystemConfigs(serviceId);
    }

    @Override
    public void saveSystemConfigs(long serviceId, java.lang.String config,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _systemConfigLocalService.saveSystemConfigs(serviceId, config,
            serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SystemConfigLocalService getWrappedSystemConfigLocalService() {
        return _systemConfigLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSystemConfigLocalService(
        SystemConfigLocalService systemConfigLocalService) {
        _systemConfigLocalService = systemConfigLocalService;
    }

    @Override
    public SystemConfigLocalService getWrappedService() {
        return _systemConfigLocalService;
    }

    @Override
    public void setWrappedService(
        SystemConfigLocalService systemConfigLocalService) {
        _systemConfigLocalService = systemConfigLocalService;
    }
}
