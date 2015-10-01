package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.NotifConfig;

import java.util.List;

/**
 * The persistence utility for the notif config service. This utility wraps {@link NotifConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifConfigPersistence
 * @see NotifConfigPersistenceImpl
 * @generated
 */
public class NotifConfigUtil {
    private static NotifConfigPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(NotifConfig notifConfig) {
        getPersistence().clearCache(notifConfig);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<NotifConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<NotifConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<NotifConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static NotifConfig update(NotifConfig notifConfig)
        throws SystemException {
        return getPersistence().update(notifConfig);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static NotifConfig update(NotifConfig notifConfig,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(notifConfig, serviceContext);
    }

    /**
    * Returns all the notif configs where status = &#63;.
    *
    * @param status the status
    * @return the matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

    /**
    * Returns a range of all the notif configs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @return the range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

    /**
    * Returns an ordered range of all the notif configs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first notif config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first notif config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last notif config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last notif config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the notif configs before and after the current notif config in the ordered set where status = &#63;.
    *
    * @param notifId the primary key of the current notif config
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig[] findByStatus_PrevAndNext(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence()
                   .findByStatus_PrevAndNext(notifId, status, orderByComparator);
    }

    /**
    * Removes all the notif configs where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of notif configs where status = &#63;.
    *
    * @param status the status
    * @return the number of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Returns all the notif configs where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByServiceId(
        long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId, status);
    }

    /**
    * Returns a range of all the notif configs where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @return the range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByServiceId(
        long serviceId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId, status, start, end);
    }

    /**
    * Returns an ordered range of all the notif configs where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByServiceId(
        long serviceId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByServiceId(serviceId, status, start, end,
            orderByComparator);
    }

    /**
    * Returns the first notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig findByServiceId_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence()
                   .findByServiceId_First(serviceId, status, orderByComparator);
    }

    /**
    * Returns the first notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig fetchByServiceId_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_First(serviceId, status, orderByComparator);
    }

    /**
    * Returns the last notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig findByServiceId_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence()
                   .findByServiceId_Last(serviceId, status, orderByComparator);
    }

    /**
    * Returns the last notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig fetchByServiceId_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_Last(serviceId, status, orderByComparator);
    }

    /**
    * Returns the notif configs before and after the current notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param notifId the primary key of the current notif config
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig[] findByServiceId_PrevAndNext(
        long notifId, long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence()
                   .findByServiceId_PrevAndNext(notifId, serviceId, status,
            orderByComparator);
    }

    /**
    * Removes all the notif configs where serviceId = &#63; and status = &#63; from the database.
    *
    * @param serviceId the service ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByServiceId(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByServiceId(serviceId, status);
    }

    /**
    * Returns the number of notif configs where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the number of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static int countByServiceId(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByServiceId(serviceId, status);
    }

    /**
    * Returns all the notif configs where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @return the matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByNotifId(
        long notifId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNotifId(notifId, status);
    }

    /**
    * Returns a range of all the notif configs where notifId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param notifId the notif ID
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @return the range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByNotifId(
        long notifId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNotifId(notifId, status, start, end);
    }

    /**
    * Returns an ordered range of all the notif configs where notifId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param notifId the notif ID
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByNotifId(
        long notifId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNotifId(notifId, status, start, end, orderByComparator);
    }

    /**
    * Returns the first notif config in the ordered set where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig findByNotifId_First(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence()
                   .findByNotifId_First(notifId, status, orderByComparator);
    }

    /**
    * Returns the first notif config in the ordered set where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig fetchByNotifId_First(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNotifId_First(notifId, status, orderByComparator);
    }

    /**
    * Returns the last notif config in the ordered set where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig findByNotifId_Last(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence()
                   .findByNotifId_Last(notifId, status, orderByComparator);
    }

    /**
    * Returns the last notif config in the ordered set where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig fetchByNotifId_Last(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNotifId_Last(notifId, status, orderByComparator);
    }

    /**
    * Removes all the notif configs where notifId = &#63; and status = &#63; from the database.
    *
    * @param notifId the notif ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNotifId(long notifId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNotifId(notifId, status);
    }

    /**
    * Returns the number of notif configs where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @return the number of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public static int countByNotifId(long notifId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNotifId(notifId, status);
    }

    /**
    * Caches the notif config in the entity cache if it is enabled.
    *
    * @param notifConfig the notif config
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.NotifConfig notifConfig) {
        getPersistence().cacheResult(notifConfig);
    }

    /**
    * Caches the notif configs in the entity cache if it is enabled.
    *
    * @param notifConfigs the notif configs
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.NotifConfig> notifConfigs) {
        getPersistence().cacheResult(notifConfigs);
    }

    /**
    * Creates a new notif config with the primary key. Does not add the notif config to the database.
    *
    * @param notifId the primary key for the new notif config
    * @return the new notif config
    */
    public static com.stc.echannels.epayments.model.NotifConfig create(
        long notifId) {
        return getPersistence().create(notifId);
    }

    /**
    * Removes the notif config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config that was removed
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig remove(
        long notifId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence().remove(notifId);
    }

    public static com.stc.echannels.epayments.model.NotifConfig updateImpl(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(notifConfig);
    }

    /**
    * Returns the notif config with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchNotifConfigException} if it could not be found.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig findByPrimaryKey(
        long notifId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException {
        return getPersistence().findByPrimaryKey(notifId);
    }

    /**
    * Returns the notif config with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config, or <code>null</code> if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifConfig fetchByPrimaryKey(
        long notifId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(notifId);
    }

    /**
    * Returns all the notif configs.
    *
    * @return the notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the notif configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of notif configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifConfig> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the notif configs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of notif configs.
    *
    * @return the number of notif configs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static NotifConfigPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (NotifConfigPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    NotifConfigPersistence.class.getName());

            ReferenceRegistry.registerReference(NotifConfigUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(NotifConfigPersistence persistence) {
    }
}
