package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NotifConfigLocalService}.
 *
 * @author ahmed_fadlus
 * @see NotifConfigLocalService
 * @generated
 */
public class NotifConfigLocalServiceWrapper implements NotifConfigLocalService,
    ServiceWrapper<NotifConfigLocalService> {
    private NotifConfigLocalService _notifConfigLocalService;

    public NotifConfigLocalServiceWrapper(
        NotifConfigLocalService notifConfigLocalService) {
        _notifConfigLocalService = notifConfigLocalService;
    }

    /**
    * Adds the notif config to the database. Also notifies the appropriate model listeners.
    *
    * @param notifConfig the notif config
    * @return the notif config that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.NotifConfig addNotifConfig(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.addNotifConfig(notifConfig);
    }

    /**
    * Creates a new notif config with the primary key. Does not add the notif config to the database.
    *
    * @param notifId the primary key for the new notif config
    * @return the new notif config
    */
    @Override
    public com.stc.echannels.epayments.model.NotifConfig createNotifConfig(
        long notifId) {
        return _notifConfigLocalService.createNotifConfig(notifId);
    }

    /**
    * Deletes the notif config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config that was removed
    * @throws PortalException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.NotifConfig deleteNotifConfig(
        long notifId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.deleteNotifConfig(notifId);
    }

    /**
    * Deletes the notif config from the database. Also notifies the appropriate model listeners.
    *
    * @param notifConfig the notif config
    * @return the notif config that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.NotifConfig deleteNotifConfig(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.deleteNotifConfig(notifConfig);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _notifConfigLocalService.dynamicQuery();
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
        return _notifConfigLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _notifConfigLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _notifConfigLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _notifConfigLocalService.dynamicQueryCount(dynamicQuery);
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
        return _notifConfigLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.NotifConfig fetchNotifConfig(
        long notifId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.fetchNotifConfig(notifId);
    }

    /**
    * Returns the notif config with the primary key.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config
    * @throws PortalException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.NotifConfig getNotifConfig(
        long notifId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.getNotifConfig(notifId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the notif configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @return the range of notif configs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> getNotifConfigs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.getNotifConfigs(start, end);
    }

    /**
    * Returns the number of notif configs.
    *
    * @return the number of notif configs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getNotifConfigsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.getNotifConfigsCount();
    }

    /**
    * Updates the notif config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param notifConfig the notif config
    * @return the notif config that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.NotifConfig updateNotifConfig(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.updateNotifConfig(notifConfig);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _notifConfigLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _notifConfigLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _notifConfigLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.stc.echannels.epayments.model.NotifConfig addNotifConfig(
        long serviceId, java.lang.String enabled, java.lang.String notifName,
        java.lang.String msgEn, java.lang.String msgAr,
        java.lang.String decriptiveNameEn, java.lang.String decriptiveNameAr,
        java.lang.String param1, java.lang.String param2,
        java.lang.String param3, java.lang.String param4,
        java.lang.String param5,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.addNotifConfig(serviceId, enabled,
            notifName, msgEn, msgAr, decriptiveNameEn, decriptiveNameAr,
            param1, param2, param3, param4, param5, serviceContext);
    }

    @Override
    public com.stc.echannels.epayments.model.NotifConfig updateNotifConfig(
        long notifId, java.lang.String enabled, java.lang.String msgEn,
        java.lang.String msgAr, java.util.List<java.lang.String> arParams,
        java.util.List<java.lang.String> enParams,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.updateNotifConfig(notifId, enabled,
            msgEn, msgAr, arParams, enParams, serviceContext);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> getNotifConfigs()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.getNotifConfigs();
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByServiceId(
        long serviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notifConfigLocalService.findByServiceId(serviceId, start, end);
    }

    @Override
    public void deleteAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _notifConfigLocalService.deleteAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public NotifConfigLocalService getWrappedNotifConfigLocalService() {
        return _notifConfigLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedNotifConfigLocalService(
        NotifConfigLocalService notifConfigLocalService) {
        _notifConfigLocalService = notifConfigLocalService;
    }

    @Override
    public NotifConfigLocalService getWrappedService() {
        return _notifConfigLocalService;
    }

    @Override
    public void setWrappedService(
        NotifConfigLocalService notifConfigLocalService) {
        _notifConfigLocalService = notifConfigLocalService;
    }
}
