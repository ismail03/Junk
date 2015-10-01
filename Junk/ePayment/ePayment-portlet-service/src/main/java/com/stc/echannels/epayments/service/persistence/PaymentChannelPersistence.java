package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.PaymentChannel;

/**
 * The persistence interface for the payment channel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelPersistenceImpl
 * @see PaymentChannelUtil
 * @generated
 */
public interface PaymentChannelPersistence extends BasePersistence<PaymentChannel> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaymentChannelUtil} to access the payment channel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the payment channels where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelId(
        long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channels where channelId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param channelId the channel ID
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @return the range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelId(
        long channelId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channels where channelId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param channelId the channel ID
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelId(
        long channelId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment channel in the ordered set where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByChannelId_First(
        long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the first payment channel in the ordered set where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByChannelId_First(
        long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment channel in the ordered set where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByChannelId_Last(
        long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the last payment channel in the ordered set where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByChannelId_Last(
        long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channels before and after the current payment channel in the ordered set where channelId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current payment channel
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel[] findByChannelId_PrevAndNext(
        java.lang.String transId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Removes all the payment channels where channelId = &#63; and status = &#63; from the database.
    *
    * @param channelId the channel ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByChannelId(long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channels where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public int countByChannelId(long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment channels where status = &#63;.
    *
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channels where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @return the range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channels where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment channel in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the first payment channel in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment channel in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the last payment channel in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channels before and after the current payment channel in the ordered set where status = &#63;.
    *
    * @param transId the primary key of the current payment channel
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel[] findByStatus_PrevAndNext(
        java.lang.String transId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Removes all the payment channels where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channels where status = &#63;.
    *
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment channels where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelType(
        java.lang.String channelType, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channels where channelType = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param channelType the channel type
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @return the range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelType(
        java.lang.String channelType, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channels where channelType = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param channelType the channel type
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelType(
        java.lang.String channelType, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment channel in the ordered set where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByChannelType_First(
        java.lang.String channelType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the first payment channel in the ordered set where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByChannelType_First(
        java.lang.String channelType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment channel in the ordered set where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByChannelType_Last(
        java.lang.String channelType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the last payment channel in the ordered set where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByChannelType_Last(
        java.lang.String channelType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channels before and after the current payment channel in the ordered set where channelType = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current payment channel
    * @param channelType the channel type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel[] findByChannelType_PrevAndNext(
        java.lang.String transId, java.lang.String channelType,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Removes all the payment channels where channelType = &#63; and status = &#63; from the database.
    *
    * @param channelType the channel type
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByChannelType(java.lang.String channelType,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channels where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public int countByChannelType(java.lang.String channelType,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment channels where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelEnAndStatus(
        java.lang.String descriptiveNameEn, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channels where descriptiveNameEn = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @return the range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelEnAndStatus(
        java.lang.String descriptiveNameEn, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channels where descriptiveNameEn = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelEnAndStatus(
        java.lang.String descriptiveNameEn, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByChannelEnAndStatus_First(
        java.lang.String descriptiveNameEn, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the first payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByChannelEnAndStatus_First(
        java.lang.String descriptiveNameEn, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByChannelEnAndStatus_Last(
        java.lang.String descriptiveNameEn, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the last payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByChannelEnAndStatus_Last(
        java.lang.String descriptiveNameEn, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channels before and after the current payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current payment channel
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel[] findByChannelEnAndStatus_PrevAndNext(
        java.lang.String transId, java.lang.String descriptiveNameEn,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Removes all the payment channels where descriptiveNameEn = &#63; and status = &#63; from the database.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByChannelEnAndStatus(java.lang.String descriptiveNameEn,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channels where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public int countByChannelEnAndStatus(java.lang.String descriptiveNameEn,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment channels where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelArAndStatus(
        java.lang.String descriptiveNameAr, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channels where descriptiveNameAr = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @return the range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelArAndStatus(
        java.lang.String descriptiveNameAr, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channels where descriptiveNameAr = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelArAndStatus(
        java.lang.String descriptiveNameAr, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByChannelArAndStatus_First(
        java.lang.String descriptiveNameAr, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the first payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByChannelArAndStatus_First(
        java.lang.String descriptiveNameAr, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByChannelArAndStatus_Last(
        java.lang.String descriptiveNameAr, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the last payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByChannelArAndStatus_Last(
        java.lang.String descriptiveNameAr, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channels before and after the current payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current payment channel
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel[] findByChannelArAndStatus_PrevAndNext(
        java.lang.String transId, java.lang.String descriptiveNameAr,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Removes all the payment channels where descriptiveNameAr = &#63; and status = &#63; from the database.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByChannelArAndStatus(java.lang.String descriptiveNameAr,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channels where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public int countByChannelArAndStatus(java.lang.String descriptiveNameAr,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the payment channel in the entity cache if it is enabled.
    *
    * @param paymentChannel the payment channel
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel);

    /**
    * Caches the payment channels in the entity cache if it is enabled.
    *
    * @param paymentChannels the payment channels
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentChannel> paymentChannels);

    /**
    * Creates a new payment channel with the primary key. Does not add the payment channel to the database.
    *
    * @param transId the primary key for the new payment channel
    * @return the new payment channel
    */
    public com.stc.echannels.epayments.model.PaymentChannel create(
        java.lang.String transId);

    /**
    * Removes the payment channel with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    public com.stc.echannels.epayments.model.PaymentChannel updateImpl(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment channel with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentChannelException} if it could not be found.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException;

    /**
    * Returns the payment channel with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel, or <code>null</code> if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentChannel fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment channels.
    *
    * @return the payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment channels.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @return the range of payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment channels.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of payment channels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the payment channels from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment channels.
    *
    * @return the number of payment channels
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
