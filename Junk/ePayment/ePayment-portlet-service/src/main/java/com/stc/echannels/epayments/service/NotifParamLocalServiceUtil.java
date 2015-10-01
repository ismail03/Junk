package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for NotifParam. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.NotifParamLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see NotifParamLocalService
 * @see com.stc.echannels.epayments.service.base.NotifParamLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.NotifParamLocalServiceImpl
 * @generated
 */
public class NotifParamLocalServiceUtil {
    private static NotifParamLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.NotifParamLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the notif param to the database. Also notifies the appropriate model listeners.
    *
    * @param notifParam the notif param
    * @return the notif param that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam addNotifParam(
        com.stc.echannels.epayments.model.NotifParam notifParam)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addNotifParam(notifParam);
    }

    /**
    * Creates a new notif param with the primary key. Does not add the notif param to the database.
    *
    * @param notifParamId the primary key for the new notif param
    * @return the new notif param
    */
    public static com.stc.echannels.epayments.model.NotifParam createNotifParam(
        long notifParamId) {
        return getService().createNotifParam(notifParamId);
    }

    /**
    * Deletes the notif param with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notifParamId the primary key of the notif param
    * @return the notif param that was removed
    * @throws PortalException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam deleteNotifParam(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteNotifParam(notifParamId);
    }

    /**
    * Deletes the notif param from the database. Also notifies the appropriate model listeners.
    *
    * @param notifParam the notif param
    * @return the notif param that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam deleteNotifParam(
        com.stc.echannels.epayments.model.NotifParam notifParam)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteNotifParam(notifParam);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.NotifParam fetchNotifParam(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchNotifParam(notifParamId);
    }

    /**
    * Returns the notif param with the primary key.
    *
    * @param notifParamId the primary key of the notif param
    * @return the notif param
    * @throws PortalException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam getNotifParam(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotifParam(notifParamId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the notif params.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @return the range of notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> getNotifParams(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotifParams(start, end);
    }

    /**
    * Returns the number of notif params.
    *
    * @return the number of notif params
    * @throws SystemException if a system exception occurred
    */
    public static int getNotifParamsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotifParamsCount();
    }

    /**
    * Updates the notif param in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param notifParam the notif param
    * @return the notif param that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam updateNotifParam(
        com.stc.echannels.epayments.model.NotifParam notifParam)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateNotifParam(notifParam);
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

    public static com.stc.echannels.epayments.model.NotifParam addNotifParam(
        long paramId, java.lang.String nameAr, java.lang.String nameEn,
        java.lang.String paramName,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addNotifParam(paramId, nameAr, nameEn, paramName,
            serviceContext);
    }

    public static java.lang.String getParamName(java.util.Locale locale,
        long notifParamId) {
        return getService().getParamName(locale, notifParamId);
    }

    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> getNotifParams(
        long serviceId) {
        return getService().getNotifParams(serviceId);
    }

    public static java.util.List<java.lang.String> getNotifParamNames(
        java.util.Locale locale, long serviceId) {
        return getService().getNotifParamNames(locale, serviceId);
    }

    public static void clearService() {
        _service = null;
    }

    public static NotifParamLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    NotifParamLocalService.class.getName());

            if (invokableLocalService instanceof NotifParamLocalService) {
                _service = (NotifParamLocalService) invokableLocalService;
            } else {
                _service = new NotifParamLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(NotifParamLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(NotifParamLocalService service) {
    }
}
