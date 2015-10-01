package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.BankServices;

/**
 * The persistence interface for the bank services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankServicesPersistenceImpl
 * @see BankServicesUtil
 * @generated
 */
public interface BankServicesPersistence extends BasePersistence<BankServices> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BankServicesUtil} to access the bank services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the bank serviceses where bankid = &#63;.
    *
    * @param bankid the bankid
    * @return the matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findBybankid(
        java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findBybankid(
        java.lang.String bankid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findBybankid(
        java.lang.String bankid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first bank services in the ordered set where bankid = &#63;.
    *
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices findBybankid_First(
        java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Returns the first bank services in the ordered set where bankid = &#63;.
    *
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices fetchBybankid_First(
        java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last bank services in the ordered set where bankid = &#63;.
    *
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices findBybankid_Last(
        java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Returns the last bank services in the ordered set where bankid = &#63;.
    *
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices fetchBybankid_Last(
        java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.BankServices[] findBybankid_PrevAndNext(
        java.lang.String id, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Removes all the bank serviceses where bankid = &#63; from the database.
    *
    * @param bankid the bankid
    * @throws SystemException if a system exception occurred
    */
    public void removeBybankid(java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank serviceses where bankid = &#63;.
    *
    * @param bankid the bankid
    * @return the number of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public int countBybankid(java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank serviceses where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @return the matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceid(
        long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceid(
        long serviceid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceid(
        long serviceid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first bank services in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices findByserviceid_First(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Returns the first bank services in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices fetchByserviceid_First(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last bank services in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices findByserviceid_Last(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Returns the last bank services in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices fetchByserviceid_Last(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.BankServices[] findByserviceid_PrevAndNext(
        java.lang.String id, long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Removes all the bank serviceses where serviceid = &#63; from the database.
    *
    * @param serviceid the serviceid
    * @throws SystemException if a system exception occurred
    */
    public void removeByserviceid(long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank serviceses where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @return the number of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public int countByserviceid(long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank serviceses where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @return the matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceidAndBankid(
        long serviceid, java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceidAndBankid(
        long serviceid, java.lang.String bankid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findByserviceidAndBankid(
        long serviceid, java.lang.String bankid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.BankServices findByserviceidAndBankid_First(
        long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Returns the first bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices fetchByserviceidAndBankid_First(
        long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.BankServices findByserviceidAndBankid_Last(
        long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Returns the last bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices fetchByserviceidAndBankid_Last(
        long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.BankServices[] findByserviceidAndBankid_PrevAndNext(
        java.lang.String id, long serviceid, java.lang.String bankid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Removes all the bank serviceses where serviceid = &#63; and bankid = &#63; from the database.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @throws SystemException if a system exception occurred
    */
    public void removeByserviceidAndBankid(long serviceid,
        java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank serviceses where serviceid = &#63; and bankid = &#63;.
    *
    * @param serviceid the serviceid
    * @param bankid the bankid
    * @return the number of matching bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public int countByserviceidAndBankid(long serviceid, java.lang.String bankid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the bank services in the entity cache if it is enabled.
    *
    * @param bankServices the bank services
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.BankServices bankServices);

    /**
    * Caches the bank serviceses in the entity cache if it is enabled.
    *
    * @param bankServiceses the bank serviceses
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.BankServices> bankServiceses);

    /**
    * Creates a new bank services with the primary key. Does not add the bank services to the database.
    *
    * @param id the primary key for the new bank services
    * @return the new bank services
    */
    public com.stc.echannels.epayments.model.BankServices create(
        java.lang.String id);

    /**
    * Removes the bank services with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the bank services
    * @return the bank services that was removed
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices remove(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    public com.stc.echannels.epayments.model.BankServices updateImpl(
        com.stc.echannels.epayments.model.BankServices bankServices)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank services with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBankServicesException} if it could not be found.
    *
    * @param id the primary key of the bank services
    * @return the bank services
    * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices findByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankServicesException;

    /**
    * Returns the bank services with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the bank services
    * @return the bank services, or <code>null</code> if a bank services with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankServices fetchByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank serviceses.
    *
    * @return the bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.BankServices> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the bank serviceses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank serviceses.
    *
    * @return the number of bank serviceses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
