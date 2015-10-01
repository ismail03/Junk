package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.PaymentChannelSr;

/**
 * The persistence interface for the payment channel sr service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrPersistenceImpl
 * @see PaymentChannelSrUtil
 * @generated
 */
public interface PaymentChannelSrPersistence extends BasePersistence<PaymentChannelSr> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaymentChannelSrUtil} to access the payment channel sr persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the payment channel srs where channelid = &#63;.
    *
    * @param channelid the channelid
    * @return the matching payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findBychannelid(
        long channelid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channel srs where channelid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param channelid the channelid
    * @param start the lower bound of the range of payment channel srs
    * @param end the upper bound of the range of payment channel srs (not inclusive)
    * @return the range of matching payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findBychannelid(
        long channelid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channel srs where channelid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param channelid the channelid
    * @param start the lower bound of the range of payment channel srs
    * @param end the upper bound of the range of payment channel srs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findBychannelid(
        long channelid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment channel sr in the ordered set where channelid = &#63;.
    *
    * @param channelid the channelid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel sr
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a matching payment channel sr could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr findBychannelid_First(
        long channelid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrException;

    /**
    * Returns the first payment channel sr in the ordered set where channelid = &#63;.
    *
    * @param channelid the channelid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel sr, or <code>null</code> if a matching payment channel sr could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr fetchBychannelid_First(
        long channelid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment channel sr in the ordered set where channelid = &#63;.
    *
    * @param channelid the channelid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel sr
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a matching payment channel sr could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr findBychannelid_Last(
        long channelid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrException;

    /**
    * Returns the last payment channel sr in the ordered set where channelid = &#63;.
    *
    * @param channelid the channelid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel sr, or <code>null</code> if a matching payment channel sr could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr fetchBychannelid_Last(
        long channelid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channel srs before and after the current payment channel sr in the ordered set where channelid = &#63;.
    *
    * @param id the primary key of the current payment channel sr
    * @param channelid the channelid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment channel sr
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr[] findBychannelid_PrevAndNext(
        java.lang.String id, long channelid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrException;

    /**
    * Removes all the payment channel srs where channelid = &#63; from the database.
    *
    * @param channelid the channelid
    * @throws SystemException if a system exception occurred
    */
    public void removeBychannelid(long channelid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channel srs where channelid = &#63;.
    *
    * @param channelid the channelid
    * @return the number of matching payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public int countBychannelid(long channelid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment channel srs where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @return the matching payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findByserviceid(
        long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channel srs where serviceid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceid the serviceid
    * @param start the lower bound of the range of payment channel srs
    * @param end the upper bound of the range of payment channel srs (not inclusive)
    * @return the range of matching payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findByserviceid(
        long serviceid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channel srs where serviceid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceid the serviceid
    * @param start the lower bound of the range of payment channel srs
    * @param end the upper bound of the range of payment channel srs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findByserviceid(
        long serviceid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment channel sr in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel sr
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a matching payment channel sr could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr findByserviceid_First(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrException;

    /**
    * Returns the first payment channel sr in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel sr, or <code>null</code> if a matching payment channel sr could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr fetchByserviceid_First(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment channel sr in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel sr
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a matching payment channel sr could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr findByserviceid_Last(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrException;

    /**
    * Returns the last payment channel sr in the ordered set where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel sr, or <code>null</code> if a matching payment channel sr could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr fetchByserviceid_Last(
        long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channel srs before and after the current payment channel sr in the ordered set where serviceid = &#63;.
    *
    * @param id the primary key of the current payment channel sr
    * @param serviceid the serviceid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment channel sr
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr[] findByserviceid_PrevAndNext(
        java.lang.String id, long serviceid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrException;

    /**
    * Removes all the payment channel srs where serviceid = &#63; from the database.
    *
    * @param serviceid the serviceid
    * @throws SystemException if a system exception occurred
    */
    public void removeByserviceid(long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channel srs where serviceid = &#63;.
    *
    * @param serviceid the serviceid
    * @return the number of matching payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public int countByserviceid(long serviceid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the payment channel sr in the entity cache if it is enabled.
    *
    * @param paymentChannelSr the payment channel sr
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.PaymentChannelSr paymentChannelSr);

    /**
    * Caches the payment channel srs in the entity cache if it is enabled.
    *
    * @param paymentChannelSrs the payment channel srs
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> paymentChannelSrs);

    /**
    * Creates a new payment channel sr with the primary key. Does not add the payment channel sr to the database.
    *
    * @param id the primary key for the new payment channel sr
    * @return the new payment channel sr
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr create(
        java.lang.String id);

    /**
    * Removes the payment channel sr with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the payment channel sr
    * @return the payment channel sr that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr remove(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrException;

    public com.stc.echannels.epayments.model.PaymentChannelSr updateImpl(
        com.stc.echannels.epayments.model.PaymentChannelSr paymentChannelSr)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channel sr with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentChannelSrException} if it could not be found.
    *
    * @param id the primary key of the payment channel sr
    * @return the payment channel sr
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr findByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelSrException;

    /**
    * Returns the payment channel sr with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the payment channel sr
    * @return the payment channel sr, or <code>null</code> if a payment channel sr with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannelSr fetchByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment channel srs.
    *
    * @return the payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channel srs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment channel srs
    * @param end the upper bound of the range of payment channel srs (not inclusive)
    * @return the range of payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channel srs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment channel srs
    * @param end the upper bound of the range of payment channel srs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the payment channel srs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channel srs.
    *
    * @return the number of payment channel srs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
