package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for NotifConfig. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.NotifConfigLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see NotifConfigLocalService
 * @see com.stc.echannels.epayments.service.base.NotifConfigLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.NotifConfigLocalServiceImpl
 * @generated
 */
public class NotifConfigLocalServiceUtil {
    private static NotifConfigLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.NotifConfigLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the notif config to the database. Also notifies the appropriate model listeners.
    *
    * @param notifConfig the notif config
    * @return the notif config that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig addNotifConfig(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addNotifConfig(notifConfig);
    }

    /**
    * Creates a new notif config with the primary key. Does not add the notif config to the database.
    *
    * @param notifId the primary key for the new notif config
    * @return the new notif config
    */
    public static com.stc.echannels.epayments.model.NotifConfig createNotifConfig(
        long notifId) {
        return getService().createNotifConfig(notifId);
    }

    /**
    * Deletes the notif config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config that was removed
    * @throws PortalException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig deleteNotifConfig(
        long notifId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteNotifConfig(notifId);
    }

    /**
    * Deletes the notif config from the database. Also notifies the appropriate model listeners.
    *
    * @param notifConfig the notif config
    * @return the notif config that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig deleteNotifConfig(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteNotifConfig(notifConfig);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.stc.echannels.epayments.model.NotifConfig fetchNotifConfig(
        long notifId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchNotifConfig(notifId);
    }

    /**
    * Returns the notif config with the primary key.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config
    * @throws PortalException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig getNotifConfig(
        long notifId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotifConfig(notifId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> getNotifConfigs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotifConfigs(start, end);
    }

    /**
    * Returns the number of notif configs.
    *
    * @return the number of notif configs
    * @throws SystemException if a system exception occurred
    */
    public static int getNotifConfigsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotifConfigsCount();
    }

    /**
    * Updates the notif config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param notifConfig the notif config
    * @return the notif config that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig updateNotifConfig(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateNotifConfig(notifConfig);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.stc.echannels.epayments.model.NotifConfig addNotifConfig(
        long serviceId, java.lang.String enabled, java.lang.String notifName,
        java.lang.String msgEn, java.lang.String msgAr,
        java.lang.String decriptiveNameEn, java.lang.String decriptiveNameAr,
        java.lang.String param1, java.lang.String param2,
        java.lang.String param3, java.lang.String param4,
        java.lang.String param5,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addNotifConfig(serviceId, enabled, notifName, msgEn, msgAr,
            decriptiveNameEn, decriptiveNameAr, param1, param2, param3, param4,
            param5, serviceContext);
    }

    public static com.stc.echannels.epayments.model.NotifConfig updateNotifConfig(
        long notifId, java.lang.String enabled, java.lang.String msgEn,
        java.lang.String msgAr, java.util.List<java.lang.String> arParams,
        java.util.List<java.lang.String> enParams,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateNotifConfig(notifId, enabled, msgEn, msgAr, arParams,
            enParams, serviceContext);
    }

    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> getNotifConfigs()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotifConfigs();
    }

    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByServiceId(
        long serviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByServiceId(serviceId, start, end);
    }

    public static void deleteAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static NotifConfigLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    NotifConfigLocalService.class.getName());

            if (invokableLocalService instanceof NotifConfigLocalService) {
                _service = (NotifConfigLocalService) invokableLocalService;
            } else {
                _service = new NotifConfigLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(NotifConfigLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(NotifConfigLocalService service) {
    }
}
