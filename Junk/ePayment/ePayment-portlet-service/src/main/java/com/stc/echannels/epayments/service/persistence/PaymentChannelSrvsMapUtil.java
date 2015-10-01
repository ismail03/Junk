package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.PaymentChannelSrvsMap;

import java.util.List;

/**
 * The persistence utility for the payment channel srvs map service. This utility wraps {@link PaymentChannelSrvsMapPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrvsMapPersistence
 * @see PaymentChannelSrvsMapPersistenceImpl
 * @generated
 */
public class PaymentChannelSrvsMapUtil {
    private static PaymentChannelSrvsMapPersistence _persistence;

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
    public static void clearCache(PaymentChannelSrvsMap paymentChannelSrvsMap) {
        getPersistence().clearCache(paymentChannelSrvsMap);
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
    public static List<PaymentChannelSrvsMap> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PaymentChannelSrvsMap> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PaymentChannelSrvsMap> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PaymentChannelSrvsMap update(
        PaymentChannelSrvsMap paymentChannelSrvsMap) throws SystemException {
        return getPersistence().update(paymentChannelSrvsMap);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PaymentChannelSrvsMap update(
        PaymentChannelSrvsMap paymentChannelSrvsMap,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(paymentChannelSrvsMap, serviceContext);
    }

    /**
    * Returns all the payment channel srvs maps where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the matching payment channel srvs maps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannelSrvsMap> findByServiceId(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId);
    }

    /**
    * Returns a range of all the payment channel srvs maps where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of payment channel srvs maps
    * @param end the upper bound of the range of payment channel srvs maps (not inclusive)
    * @return the range of matching payment channel srvs maps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannelSrvsMap> findByServiceId(
        long serviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId, start, end);
    }

    /**
    * Returns an ordered range of all the payment channel srvs maps where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of payment channel srvs maps
    * @param end the upper bound of the range of payment channel srvs maps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment channel srvs maps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannelSrvsMap> findByServiceId(
        long serviceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByServiceId(serviceId, start, end, orderByComparator);
    }

    /**
    * Returns the first payment channel srvs map in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel srvs map
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a matching payment channel srvs map could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap findByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException {
        return getPersistence()
                   .findByServiceId_First(serviceId, orderByComparator);
    }

    /**
    * Returns the first payment channel srvs map in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel srvs map, or <code>null</code> if a matching payment channel srvs map could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap fetchByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_First(serviceId, orderByComparator);
    }

    /**
    * Returns the last payment channel srvs map in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel srvs map
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a matching payment channel srvs map could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap findByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException {
        return getPersistence()
                   .findByServiceId_Last(serviceId, orderByComparator);
    }

    /**
    * Returns the last payment channel srvs map in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel srvs map, or <code>null</code> if a matching payment channel srvs map could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap fetchByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_Last(serviceId, orderByComparator);
    }

    /**
    * Returns the payment channel srvs maps before and after the current payment channel srvs map in the ordered set where serviceId = &#63;.
    *
    * @param id the primary key of the current payment channel srvs map
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment channel srvs map
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a payment channel srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap[] findByServiceId_PrevAndNext(
        java.lang.String id, long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException {
        return getPersistence()
                   .findByServiceId_PrevAndNext(id, serviceId, orderByComparator);
    }

    /**
    * Removes all the payment channel srvs maps where serviceId = &#63; from the database.
    *
    * @param serviceId the service ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByServiceId(serviceId);
    }

    /**
    * Returns the number of payment channel srvs maps where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the number of matching payment channel srvs maps
    * @throws SystemException if a system exception occurred
    */
    public static int countByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByServiceId(serviceId);
    }

    /**
    * Caches the payment channel srvs map in the entity cache if it is enabled.
    *
    * @param paymentChannelSrvsMap the payment channel srvs map
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.PaymentChannelSrvsMap paymentChannelSrvsMap) {
        getPersistence().cacheResult(paymentChannelSrvsMap);
    }

    /**
    * Caches the payment channel srvs maps in the entity cache if it is enabled.
    *
    * @param paymentChannelSrvsMaps the payment channel srvs maps
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentChannelSrvsMap> paymentChannelSrvsMaps) {
        getPersistence().cacheResult(paymentChannelSrvsMaps);
    }

    /**
    * Creates a new payment channel srvs map with the primary key. Does not add the payment channel srvs map to the database.
    *
    * @param id the primary key for the new payment channel srvs map
    * @return the new payment channel srvs map
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap create(
        java.lang.String id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the payment channel srvs map with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the payment channel srvs map
    * @return the payment channel srvs map that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a payment channel srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap remove(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException {
        return getPersistence().remove(id);
    }

    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap updateImpl(
        com.stc.echannels.epayments.model.PaymentChannelSrvsMap paymentChannelSrvsMap)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(paymentChannelSrvsMap);
    }

    /**
    * Returns the payment channel srvs map with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException} if it could not be found.
    *
    * @param id the primary key of the payment channel srvs map
    * @return the payment channel srvs map
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a payment channel srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap findByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the payment channel srvs map with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the payment channel srvs map
    * @return the payment channel srvs map, or <code>null</code> if a payment channel srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannelSrvsMap fetchByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the payment channel srvs maps.
    *
    * @return the payment channel srvs maps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannelSrvsMap> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the payment channel srvs maps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment channel srvs maps
    * @param end the upper bound of the range of payment channel srvs maps (not inclusive)
    * @return the range of payment channel srvs maps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannelSrvsMap> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the payment channel srvs maps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment channel srvs maps
    * @param end the upper bound of the range of payment channel srvs maps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of payment channel srvs maps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannelSrvsMap> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the payment channel srvs maps from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of payment channel srvs maps.
    *
    * @return the number of payment channel srvs maps
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PaymentChannelSrvsMapPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PaymentChannelSrvsMapPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    PaymentChannelSrvsMapPersistence.class.getName());

            ReferenceRegistry.registerReference(PaymentChannelSrvsMapUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PaymentChannelSrvsMapPersistence persistence) {
    }
}
