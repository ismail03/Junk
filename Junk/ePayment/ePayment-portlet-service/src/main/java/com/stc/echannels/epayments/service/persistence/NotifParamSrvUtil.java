package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.NotifParamSrv;

import java.util.List;

/**
 * The persistence utility for the notif param srv service. This utility wraps {@link NotifParamSrvPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifParamSrvPersistence
 * @see NotifParamSrvPersistenceImpl
 * @generated
 */
public class NotifParamSrvUtil {
    private static NotifParamSrvPersistence _persistence;

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
    public static void clearCache(NotifParamSrv notifParamSrv) {
        getPersistence().clearCache(notifParamSrv);
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
    public static List<NotifParamSrv> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<NotifParamSrv> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<NotifParamSrv> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static NotifParamSrv update(NotifParamSrv notifParamSrv)
        throws SystemException {
        return getPersistence().update(notifParamSrv);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static NotifParamSrv update(NotifParamSrv notifParamSrv,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(notifParamSrv, serviceContext);
    }

    /**
    * Returns all the notif param srvs where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the matching notif param srvs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParamSrv> findByServiceId(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId);
    }

    /**
    * Returns a range of all the notif param srvs where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of notif param srvs
    * @param end the upper bound of the range of notif param srvs (not inclusive)
    * @return the range of matching notif param srvs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParamSrv> findByServiceId(
        long serviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId, start, end);
    }

    /**
    * Returns an ordered range of all the notif param srvs where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of notif param srvs
    * @param end the upper bound of the range of notif param srvs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif param srvs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParamSrv> findByServiceId(
        long serviceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByServiceId(serviceId, start, end, orderByComparator);
    }

    /**
    * Returns the first notif param srv in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param srv
    * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a matching notif param srv could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv findByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamSrvException {
        return getPersistence()
                   .findByServiceId_First(serviceId, orderByComparator);
    }

    /**
    * Returns the first notif param srv in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param srv, or <code>null</code> if a matching notif param srv could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv fetchByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_First(serviceId, orderByComparator);
    }

    /**
    * Returns the last notif param srv in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param srv
    * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a matching notif param srv could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv findByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamSrvException {
        return getPersistence()
                   .findByServiceId_Last(serviceId, orderByComparator);
    }

    /**
    * Returns the last notif param srv in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param srv, or <code>null</code> if a matching notif param srv could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv fetchByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_Last(serviceId, orderByComparator);
    }

    /**
    * Returns the notif param srvs before and after the current notif param srv in the ordered set where serviceId = &#63;.
    *
    * @param notifParamSrvPK the primary key of the current notif param srv
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif param srv
    * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a notif param srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv[] findByServiceId_PrevAndNext(
        NotifParamSrvPK notifParamSrvPK, long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamSrvException {
        return getPersistence()
                   .findByServiceId_PrevAndNext(notifParamSrvPK, serviceId,
            orderByComparator);
    }

    /**
    * Removes all the notif param srvs where serviceId = &#63; from the database.
    *
    * @param serviceId the service ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByServiceId(serviceId);
    }

    /**
    * Returns the number of notif param srvs where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the number of matching notif param srvs
    * @throws SystemException if a system exception occurred
    */
    public static int countByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByServiceId(serviceId);
    }

    /**
    * Caches the notif param srv in the entity cache if it is enabled.
    *
    * @param notifParamSrv the notif param srv
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.NotifParamSrv notifParamSrv) {
        getPersistence().cacheResult(notifParamSrv);
    }

    /**
    * Caches the notif param srvs in the entity cache if it is enabled.
    *
    * @param notifParamSrvs the notif param srvs
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.NotifParamSrv> notifParamSrvs) {
        getPersistence().cacheResult(notifParamSrvs);
    }

    /**
    * Creates a new notif param srv with the primary key. Does not add the notif param srv to the database.
    *
    * @param notifParamSrvPK the primary key for the new notif param srv
    * @return the new notif param srv
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv create(
        NotifParamSrvPK notifParamSrvPK) {
        return getPersistence().create(notifParamSrvPK);
    }

    /**
    * Removes the notif param srv with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notifParamSrvPK the primary key of the notif param srv
    * @return the notif param srv that was removed
    * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a notif param srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv remove(
        NotifParamSrvPK notifParamSrvPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamSrvException {
        return getPersistence().remove(notifParamSrvPK);
    }

    public static com.stc.echannels.epayments.model.NotifParamSrv updateImpl(
        com.stc.echannels.epayments.model.NotifParamSrv notifParamSrv)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(notifParamSrv);
    }

    /**
    * Returns the notif param srv with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchNotifParamSrvException} if it could not be found.
    *
    * @param notifParamSrvPK the primary key of the notif param srv
    * @return the notif param srv
    * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a notif param srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv findByPrimaryKey(
        NotifParamSrvPK notifParamSrvPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamSrvException {
        return getPersistence().findByPrimaryKey(notifParamSrvPK);
    }

    /**
    * Returns the notif param srv with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param notifParamSrvPK the primary key of the notif param srv
    * @return the notif param srv, or <code>null</code> if a notif param srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParamSrv fetchByPrimaryKey(
        NotifParamSrvPK notifParamSrvPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(notifParamSrvPK);
    }

    /**
    * Returns all the notif param srvs.
    *
    * @return the notif param srvs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParamSrv> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the notif param srvs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif param srvs
    * @param end the upper bound of the range of notif param srvs (not inclusive)
    * @return the range of notif param srvs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParamSrv> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the notif param srvs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif param srvs
    * @param end the upper bound of the range of notif param srvs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of notif param srvs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParamSrv> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the notif param srvs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of notif param srvs.
    *
    * @return the number of notif param srvs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static NotifParamSrvPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (NotifParamSrvPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    NotifParamSrvPersistence.class.getName());

            ReferenceRegistry.registerReference(NotifParamSrvUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(NotifParamSrvPersistence persistence) {
    }
}
