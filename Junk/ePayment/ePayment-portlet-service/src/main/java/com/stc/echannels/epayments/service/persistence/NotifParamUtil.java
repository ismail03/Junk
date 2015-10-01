package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.NotifParam;

import java.util.List;

/**
 * The persistence utility for the notif param service. This utility wraps {@link NotifParamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifParamPersistence
 * @see NotifParamPersistenceImpl
 * @generated
 */
public class NotifParamUtil {
    private static NotifParamPersistence _persistence;

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
    public static void clearCache(NotifParam notifParam) {
        getPersistence().clearCache(notifParam);
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
    public static List<NotifParam> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<NotifParam> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<NotifParam> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static NotifParam update(NotifParam notifParam)
        throws SystemException {
        return getPersistence().update(notifParam);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static NotifParam update(NotifParam notifParam,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(notifParam, serviceContext);
    }

    /**
    * Returns all the notif params where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @return the matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNotifParamId(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNotifParamId(notifParamId);
    }

    /**
    * Returns a range of all the notif params where notifParamId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param notifParamId the notif param ID
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @return the range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNotifParamId(
        long notifParamId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNotifParamId(notifParamId, start, end);
    }

    /**
    * Returns an ordered range of all the notif params where notifParamId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param notifParamId the notif param ID
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNotifParamId(
        long notifParamId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNotifParamId(notifParamId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first notif param in the ordered set where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam findByNotifParamId_First(
        long notifParamId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence()
                   .findByNotifParamId_First(notifParamId, orderByComparator);
    }

    /**
    * Returns the first notif param in the ordered set where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam fetchByNotifParamId_First(
        long notifParamId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNotifParamId_First(notifParamId, orderByComparator);
    }

    /**
    * Returns the last notif param in the ordered set where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam findByNotifParamId_Last(
        long notifParamId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence()
                   .findByNotifParamId_Last(notifParamId, orderByComparator);
    }

    /**
    * Returns the last notif param in the ordered set where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam fetchByNotifParamId_Last(
        long notifParamId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNotifParamId_Last(notifParamId, orderByComparator);
    }

    /**
    * Removes all the notif params where notifParamId = &#63; from the database.
    *
    * @param notifParamId the notif param ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNotifParamId(long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNotifParamId(notifParamId);
    }

    /**
    * Returns the number of notif params where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @return the number of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static int countByNotifParamId(long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNotifParamId(notifParamId);
    }

    /**
    * Returns all the notif params where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @return the matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameEn(
        java.lang.String nameEn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNameEn(nameEn);
    }

    /**
    * Returns a range of all the notif params where nameEn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nameEn the name en
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @return the range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameEn(
        java.lang.String nameEn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNameEn(nameEn, start, end);
    }

    /**
    * Returns an ordered range of all the notif params where nameEn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nameEn the name en
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameEn(
        java.lang.String nameEn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNameEn(nameEn, start, end, orderByComparator);
    }

    /**
    * Returns the first notif param in the ordered set where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam findByNameEn_First(
        java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence().findByNameEn_First(nameEn, orderByComparator);
    }

    /**
    * Returns the first notif param in the ordered set where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam fetchByNameEn_First(
        java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNameEn_First(nameEn, orderByComparator);
    }

    /**
    * Returns the last notif param in the ordered set where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam findByNameEn_Last(
        java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence().findByNameEn_Last(nameEn, orderByComparator);
    }

    /**
    * Returns the last notif param in the ordered set where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam fetchByNameEn_Last(
        java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNameEn_Last(nameEn, orderByComparator);
    }

    /**
    * Returns the notif params before and after the current notif param in the ordered set where nameEn = &#63;.
    *
    * @param notifParamId the primary key of the current notif param
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam[] findByNameEn_PrevAndNext(
        long notifParamId, java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence()
                   .findByNameEn_PrevAndNext(notifParamId, nameEn,
            orderByComparator);
    }

    /**
    * Removes all the notif params where nameEn = &#63; from the database.
    *
    * @param nameEn the name en
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNameEn(java.lang.String nameEn)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNameEn(nameEn);
    }

    /**
    * Returns the number of notif params where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @return the number of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static int countByNameEn(java.lang.String nameEn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNameEn(nameEn);
    }

    /**
    * Returns all the notif params where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @return the matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameAr(
        java.lang.String nameAr)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNameAr(nameAr);
    }

    /**
    * Returns a range of all the notif params where nameAr = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nameAr the name ar
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @return the range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameAr(
        java.lang.String nameAr, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNameAr(nameAr, start, end);
    }

    /**
    * Returns an ordered range of all the notif params where nameAr = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nameAr the name ar
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameAr(
        java.lang.String nameAr, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNameAr(nameAr, start, end, orderByComparator);
    }

    /**
    * Returns the first notif param in the ordered set where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam findByNameAr_First(
        java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence().findByNameAr_First(nameAr, orderByComparator);
    }

    /**
    * Returns the first notif param in the ordered set where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam fetchByNameAr_First(
        java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNameAr_First(nameAr, orderByComparator);
    }

    /**
    * Returns the last notif param in the ordered set where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam findByNameAr_Last(
        java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence().findByNameAr_Last(nameAr, orderByComparator);
    }

    /**
    * Returns the last notif param in the ordered set where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam fetchByNameAr_Last(
        java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNameAr_Last(nameAr, orderByComparator);
    }

    /**
    * Returns the notif params before and after the current notif param in the ordered set where nameAr = &#63;.
    *
    * @param notifParamId the primary key of the current notif param
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam[] findByNameAr_PrevAndNext(
        long notifParamId, java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence()
                   .findByNameAr_PrevAndNext(notifParamId, nameAr,
            orderByComparator);
    }

    /**
    * Removes all the notif params where nameAr = &#63; from the database.
    *
    * @param nameAr the name ar
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNameAr(java.lang.String nameAr)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNameAr(nameAr);
    }

    /**
    * Returns the number of notif params where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @return the number of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public static int countByNameAr(java.lang.String nameAr)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNameAr(nameAr);
    }

    /**
    * Caches the notif param in the entity cache if it is enabled.
    *
    * @param notifParam the notif param
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.NotifParam notifParam) {
        getPersistence().cacheResult(notifParam);
    }

    /**
    * Caches the notif params in the entity cache if it is enabled.
    *
    * @param notifParams the notif params
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.NotifParam> notifParams) {
        getPersistence().cacheResult(notifParams);
    }

    /**
    * Creates a new notif param with the primary key. Does not add the notif param to the database.
    *
    * @param notifParamId the primary key for the new notif param
    * @return the new notif param
    */
    public static com.stc.echannels.epayments.model.NotifParam create(
        long notifParamId) {
        return getPersistence().create(notifParamId);
    }

    /**
    * Removes the notif param with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notifParamId the primary key of the notif param
    * @return the notif param that was removed
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam remove(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence().remove(notifParamId);
    }

    public static com.stc.echannels.epayments.model.NotifParam updateImpl(
        com.stc.echannels.epayments.model.NotifParam notifParam)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(notifParam);
    }

    /**
    * Returns the notif param with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchNotifParamException} if it could not be found.
    *
    * @param notifParamId the primary key of the notif param
    * @return the notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam findByPrimaryKey(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException {
        return getPersistence().findByPrimaryKey(notifParamId);
    }

    /**
    * Returns the notif param with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param notifParamId the primary key of the notif param
    * @return the notif param, or <code>null</code> if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.NotifParam fetchByPrimaryKey(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(notifParamId);
    }

    /**
    * Returns all the notif params.
    *
    * @return the notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the notif params.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of notif params
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.NotifParam> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the notif params from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of notif params.
    *
    * @return the number of notif params
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static NotifParamPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (NotifParamPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    NotifParamPersistence.class.getName());

            ReferenceRegistry.registerReference(NotifParamUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(NotifParamPersistence persistence) {
    }
}
