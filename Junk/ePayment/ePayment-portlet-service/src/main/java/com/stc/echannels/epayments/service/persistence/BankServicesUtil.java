package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.BankServices;

import java.util.List;

/**
 * The persistence utility for the bank services service. This utility wraps {@link BankServicesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankServicesPersistence
 * @see BankServicesPersistenceImpl
 * @generated
 */
public class BankServicesUtil {
    private static BankServicesPersistence _persistence;

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
    public static void clearCache(BankServices bankServices) {
        getPersistence().clearCache(bankServices);
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
    public static List<BankServices> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BankServices> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BankServices> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BankServices update(BankServices bankServices)
        throws SystemException {
        return getPersistence().update(bankServices);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BankServices update(BankServices bankServices,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(bankServices, serviceContext);
    }

    /**
    * Returns all the bank serviceses where bankid = &#63;.
    *
    * @param bankid the bankid
    * @return the matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findBybankid(
        java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBybankid(bankid);
    }

    /**
    * Returns a range of all the bank serviceses where bankid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankid the bankid
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @return the range of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findBybankid(
        java.lang.String bankid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBybankid(bankid, start, end);
    }

    /**
    * Returns an ordered range of all the bank serviceses where bankid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankid the bankid
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findBybankid(
        java.lang.String bankid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBybankid(bankid, start, end, orderByComparator);
    }

    /**
    * Returns the first bank services in the ordered set where bankid = &#63;.
    *
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices findBybankid_First(
        java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence().findBybankid_First(bankid, orderByComparator);
    }

    /**
    * Returns the first bank services in the ordered set where bankid = &#63;.
    *
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices fetchBybankid_First(
        java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBybankid_First(bankid, orderByComparator);
    }

    /**
    * Returns the last bank services in the ordered set where bankid = &#63;.
    *
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices findBybankid_Last(
        java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence().findBybankid_Last(bankid, orderByComparator);
    }

    /**
    * Returns the last bank services in the ordered set where bankid = &#63;.
    *
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices fetchBybankid_Last(
        java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBybankid_Last(bankid, orderByComparator);
    }

    /**
    * Returns the bank serviceses before and after the current bank services in the ordered set where bankid = &#63;.
    *
    * @param id the primary key of the current bank services
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices[] findBybankid_PrevAndNext(
        java.lang.String id, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence()
                   .findBybankid_PrevAndNext(id, bankid, orderByComparator);
    }

    /**
    * Removes all the bank serviceses where bankid = &#63; from the database.
    *
    * @param bankid the bankid
    * @throws SystemException if a system exception occurred
    */
    public static void removeBybankid(java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBybankid(bankid);
    }

    /**
    * Returns the number of bank serviceses where bankid = &#63;.
    *
    * @param bankid the bankid
    * @return the number of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static int countBybankid(java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBybankid(bankid);
    }

    /**
    * Returns all the bank serviceses where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @return the matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceid(
        long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByserviceid(serviceid);
    }

    /**
    * Returns a range of all the bank serviceses where serviceid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceid the serviceid
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @return the range of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceid(
        long serviceid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByserviceid(serviceid, start, end);
    }

    /**
    * Returns an ordered range of all the bank serviceses where serviceid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceid the serviceid
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceid(
        long serviceid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByserviceid(serviceid, start, end, orderByComparator);
    }

    /**
    * Returns the first bank services in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices findByserviceid_First(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence()
                   .findByserviceid_First(serviceid, orderByComparator);
    }

    /**
    * Returns the first bank services in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices fetchByserviceid_First(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByserviceid_First(serviceid, orderByComparator);
    }

    /**
    * Returns the last bank services in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices findByserviceid_Last(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence()
                   .findByserviceid_Last(serviceid, orderByComparator);
    }

    /**
    * Returns the last bank services in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices fetchByserviceid_Last(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByserviceid_Last(serviceid, orderByComparator);
    }

    /**
    * Returns the bank serviceses before and after the current bank services in the ordered set where serviceid = &#63;.
    *
    * @param id the primary key of the current bank services
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices[] findByserviceid_PrevAndNext(
        java.lang.String id, long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence()
                   .findByserviceid_PrevAndNext(id, serviceid, orderByComparator);
    }

    /**
    * Removes all the bank serviceses where serviceid = &#63; from the database.
    *
    * @param serviceid the serviceid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByserviceid(long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByserviceid(serviceid);
    }

    /**
    * Returns the number of bank serviceses where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @return the number of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static int countByserviceid(long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByserviceid(serviceid);
    }

    /**
    * Returns all the bank serviceses where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @return the matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceidAndBankid(
        long serviceid, java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByserviceidAndBankid(serviceid, bankid);
    }

    /**
    * Returns a range of all the bank serviceses where serviceid = &#63; and bankid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @return the range of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceidAndBankid(
        long serviceid, java.lang.String bankid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByserviceidAndBankid(serviceid, bankid, start, end);
    }

    /**
    * Returns an ordered range of all the bank serviceses where serviceid = &#63; and bankid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceidAndBankid(
        long serviceid, java.lang.String bankid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByserviceidAndBankid(serviceid, bankid, start, end,
            orderByComparator);
    }

    /**
    * Returns the first bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices findByserviceidAndBankid_First(
        long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence()
                   .findByserviceidAndBankid_First(serviceid, bankid,
            orderByComparator);
    }

    /**
    * Returns the first bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices fetchByserviceidAndBankid_First(
        long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByserviceidAndBankid_First(serviceid, bankid,
            orderByComparator);
    }

    /**
    * Returns the last bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices findByserviceidAndBankid_Last(
        long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence()
                   .findByserviceidAndBankid_Last(serviceid, bankid,
            orderByComparator);
    }

    /**
    * Returns the last bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices fetchByserviceidAndBankid_Last(
        long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByserviceidAndBankid_Last(serviceid, bankid,
            orderByComparator);
    }

    /**
    * Returns the bank serviceses before and after the current bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
    *
    * @param id the primary key of the current bank services
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices[] findByserviceidAndBankid_PrevAndNext(
        java.lang.String id, long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence()
                   .findByserviceidAndBankid_PrevAndNext(id, serviceid, bankid,
            orderByComparator);
    }

    /**
    * Removes all the bank serviceses where serviceid = &#63; and bankid = &#63; from the database.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByserviceidAndBankid(long serviceid,
        java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByserviceidAndBankid(serviceid, bankid);
    }

    /**
    * Returns the number of bank serviceses where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @return the number of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static int countByserviceidAndBankid(long serviceid,
        java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByserviceidAndBankid(serviceid, bankid);
    }

    /**
    * Caches the bank services in the entity cache if it is enabled.
    *
    * @param bankServices the bank services
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.BankServices bankServices) {
        getPersistence().cacheResult(bankServices);
    }

    /**
    * Caches the bank serviceses in the entity cache if it is enabled.
    *
    * @param bankServiceses the bank serviceses
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.BankServices> bankServiceses) {
        getPersistence().cacheResult(bankServiceses);
    }

    /**
    * Creates a new bank services with the primary key. Does not add the bank services to the database.
    *
    * @param id the primary key for the new bank services
    * @return the new bank services
    */
    public static com.stc.echannels.epayments.model.BankServices create(
        java.lang.String id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the bank services with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the bank services
    * @return the bank services that was removed
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices remove(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence().remove(id);
    }

    public static com.stc.echannels.epayments.model.BankServices updateImpl(
        com.stc.echannels.epayments.model.BankServices bankServices)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bankServices);
    }

    /**
    * Returns the bank services with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBankServicesException} if it could not be found.
    *
    * @param id the primary key of the bank services
    * @return the bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices findByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the bank services with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the bank services
    * @return the bank services, or <code>null</code> if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankServices fetchByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the bank serviceses.
    *
    * @return the bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the bank serviceses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @return the range of bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the bank serviceses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bank serviceses
    * @param end the upper bound of the range of bank serviceses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankServices> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the bank serviceses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of bank serviceses.
    *
    * @return the number of bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BankServicesPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BankServicesPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    BankServicesPersistence.class.getName());

            ReferenceRegistry.registerReference(BankServicesUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BankServicesPersistence persistence) {
    }
}
