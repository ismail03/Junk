package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.EPayAccessControl;

import java.util.List;

/**
 * The persistence utility for the e pay access control service. This utility wraps {@link EPayAccessControlPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see EPayAccessControlPersistence
 * @see EPayAccessControlPersistenceImpl
 * @generated
 */
public class EPayAccessControlUtil {
    private static EPayAccessControlPersistence _persistence;

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
    public static void clearCache(EPayAccessControl ePayAccessControl) {
        getPersistence().clearCache(ePayAccessControl);
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
    public static List<EPayAccessControl> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EPayAccessControl> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EPayAccessControl> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EPayAccessControl update(EPayAccessControl ePayAccessControl)
        throws SystemException {
        return getPersistence().update(ePayAccessControl);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EPayAccessControl update(
        EPayAccessControl ePayAccessControl, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(ePayAccessControl, serviceContext);
    }

    /**
    * Returns all the e pay access controls where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceId(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId);
    }

    /**
    * Returns a range of all the e pay access controls where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @return the range of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceId(
        long serviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId, start, end);
    }

    /**
    * Returns an ordered range of all the e pay access controls where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceId(
        long serviceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByServiceId(serviceId, start, end, orderByComparator);
    }

    /**
    * Returns the first e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl findByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException {
        return getPersistence()
                   .findByServiceId_First(serviceId, orderByComparator);
    }

    /**
    * Returns the first e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl fetchByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_First(serviceId, orderByComparator);
    }

    /**
    * Returns the last e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl findByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException {
        return getPersistence()
                   .findByServiceId_Last(serviceId, orderByComparator);
    }

    /**
    * Returns the last e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl fetchByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_Last(serviceId, orderByComparator);
    }

    /**
    * Returns the e pay access controls before and after the current e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param epayCofignId the primary key of the current e pay access control
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl[] findByServiceId_PrevAndNext(
        long epayCofignId, long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException {
        return getPersistence()
                   .findByServiceId_PrevAndNext(epayCofignId, serviceId,
            orderByComparator);
    }

    /**
    * Removes all the e pay access controls where serviceId = &#63; from the database.
    *
    * @param serviceId the service ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByServiceId(serviceId);
    }

    /**
    * Returns the number of e pay access controls where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the number of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static int countByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByServiceId(serviceId);
    }

    /**
    * Returns all the e pay access controls where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByserviceIdAndstatus(
        long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByserviceIdAndstatus(serviceId, status);
    }

    /**
    * Returns a range of all the e pay access controls where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @return the range of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByserviceIdAndstatus(
        long serviceId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByserviceIdAndstatus(serviceId, status, start, end);
    }

    /**
    * Returns an ordered range of all the e pay access controls where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByserviceIdAndstatus(
        long serviceId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByserviceIdAndstatus(serviceId, status, start, end,
            orderByComparator);
    }

    /**
    * Returns the first e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl findByserviceIdAndstatus_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException {
        return getPersistence()
                   .findByserviceIdAndstatus_First(serviceId, status,
            orderByComparator);
    }

    /**
    * Returns the first e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl fetchByserviceIdAndstatus_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByserviceIdAndstatus_First(serviceId, status,
            orderByComparator);
    }

    /**
    * Returns the last e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl findByserviceIdAndstatus_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException {
        return getPersistence()
                   .findByserviceIdAndstatus_Last(serviceId, status,
            orderByComparator);
    }

    /**
    * Returns the last e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl fetchByserviceIdAndstatus_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByserviceIdAndstatus_Last(serviceId, status,
            orderByComparator);
    }

    /**
    * Returns the e pay access controls before and after the current e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param epayCofignId the primary key of the current e pay access control
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl[] findByserviceIdAndstatus_PrevAndNext(
        long epayCofignId, long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException {
        return getPersistence()
                   .findByserviceIdAndstatus_PrevAndNext(epayCofignId,
            serviceId, status, orderByComparator);
    }

    /**
    * Removes all the e pay access controls where serviceId = &#63; and status = &#63; from the database.
    *
    * @param serviceId the service ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByserviceIdAndstatus(long serviceId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByserviceIdAndstatus(serviceId, status);
    }

    /**
    * Returns the number of e pay access controls where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the number of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static int countByserviceIdAndstatus(long serviceId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByserviceIdAndstatus(serviceId, status);
    }

    /**
    * Caches the e pay access control in the entity cache if it is enabled.
    *
    * @param ePayAccessControl the e pay access control
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl) {
        getPersistence().cacheResult(ePayAccessControl);
    }

    /**
    * Caches the e pay access controls in the entity cache if it is enabled.
    *
    * @param ePayAccessControls the e pay access controls
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> ePayAccessControls) {
        getPersistence().cacheResult(ePayAccessControls);
    }

    /**
    * Creates a new e pay access control with the primary key. Does not add the e pay access control to the database.
    *
    * @param epayCofignId the primary key for the new e pay access control
    * @return the new e pay access control
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl create(
        long epayCofignId) {
        return getPersistence().create(epayCofignId);
    }

    /**
    * Removes the e pay access control with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control that was removed
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl remove(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException {
        return getPersistence().remove(epayCofignId);
    }

    public static com.stc.echannels.epayments.model.EPayAccessControl updateImpl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(ePayAccessControl);
    }

    /**
    * Returns the e pay access control with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchEPayAccessControlException} if it could not be found.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl findByPrimaryKey(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException {
        return getPersistence().findByPrimaryKey(epayCofignId);
    }

    /**
    * Returns the e pay access control with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control, or <code>null</code> if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl fetchByPrimaryKey(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(epayCofignId);
    }

    /**
    * Returns all the e pay access controls.
    *
    * @return the e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the e pay access controls.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @return the range of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the e pay access controls.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the e pay access controls from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of e pay access controls.
    *
    * @return the number of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EPayAccessControlPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EPayAccessControlPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    EPayAccessControlPersistence.class.getName());

            ReferenceRegistry.registerReference(EPayAccessControlUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EPayAccessControlPersistence persistence) {
    }
}
