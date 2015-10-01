package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.PaymentChannel;

import java.util.List;

/**
 * The persistence utility for the payment channel service. This utility wraps {@link PaymentChannelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelPersistence
 * @see PaymentChannelPersistenceImpl
 * @generated
 */
public class PaymentChannelUtil {
    private static PaymentChannelPersistence _persistence;

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
    public static void clearCache(PaymentChannel paymentChannel) {
        getPersistence().clearCache(paymentChannel);
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
    public static List<PaymentChannel> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PaymentChannel> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PaymentChannel> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PaymentChannel update(PaymentChannel paymentChannel)
        throws SystemException {
        return getPersistence().update(paymentChannel);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PaymentChannel update(PaymentChannel paymentChannel,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(paymentChannel, serviceContext);
    }

    /**
    * Returns all the payment channels where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelId(
        long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByChannelId(channelId, status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelId(
        long channelId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByChannelId(channelId, status, start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelId(
        long channelId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelId(channelId, status, start, end,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel findByChannelId_First(
        long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelId_First(channelId, status, orderByComparator);
    }

    /**
    * Returns the first payment channel in the ordered set where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByChannelId_First(
        long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelId_First(channelId, status, orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel findByChannelId_Last(
        long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelId_Last(channelId, status, orderByComparator);
    }

    /**
    * Returns the last payment channel in the ordered set where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByChannelId_Last(
        long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelId_Last(channelId, status, orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel[] findByChannelId_PrevAndNext(
        java.lang.String transId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelId_PrevAndNext(transId, channelId, status,
            orderByComparator);
    }

    /**
    * Removes all the payment channels where channelId = &#63; and status = &#63; from the database.
    *
    * @param channelId the channel ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByChannelId(long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByChannelId(channelId, status);
    }

    /**
    * Returns the number of payment channels where channelId = &#63; and status = &#63;.
    *
    * @param channelId the channel ID
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static int countByChannelId(long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByChannelId(channelId, status);
    }

    /**
    * Returns all the payment channels where status = &#63;.
    *
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first payment channel in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first payment channel in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last payment channel in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last payment channel in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel[] findByStatus_PrevAndNext(
        java.lang.String transId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByStatus_PrevAndNext(transId, status, orderByComparator);
    }

    /**
    * Removes all the payment channels where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of payment channels where status = &#63;.
    *
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Returns all the payment channels where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelType(
        java.lang.String channelType, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByChannelType(channelType, status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelType(
        java.lang.String channelType, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelType(channelType, status, start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelType(
        java.lang.String channelType, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelType(channelType, status, start, end,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel findByChannelType_First(
        java.lang.String channelType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelType_First(channelType, status,
            orderByComparator);
    }

    /**
    * Returns the first payment channel in the ordered set where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByChannelType_First(
        java.lang.String channelType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelType_First(channelType, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel findByChannelType_Last(
        java.lang.String channelType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelType_Last(channelType, status,
            orderByComparator);
    }

    /**
    * Returns the last payment channel in the ordered set where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByChannelType_Last(
        java.lang.String channelType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelType_Last(channelType, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel[] findByChannelType_PrevAndNext(
        java.lang.String transId, java.lang.String channelType,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelType_PrevAndNext(transId, channelType, status,
            orderByComparator);
    }

    /**
    * Removes all the payment channels where channelType = &#63; and status = &#63; from the database.
    *
    * @param channelType the channel type
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByChannelType(java.lang.String channelType,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByChannelType(channelType, status);
    }

    /**
    * Returns the number of payment channels where channelType = &#63; and status = &#63;.
    *
    * @param channelType the channel type
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static int countByChannelType(java.lang.String channelType,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByChannelType(channelType, status);
    }

    /**
    * Returns all the payment channels where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelEnAndStatus(
        java.lang.String descriptiveNameEn, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelEnAndStatus(descriptiveNameEn, status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelEnAndStatus(
        java.lang.String descriptiveNameEn, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelEnAndStatus(descriptiveNameEn, status, start,
            end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelEnAndStatus(
        java.lang.String descriptiveNameEn, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelEnAndStatus(descriptiveNameEn, status, start,
            end, orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel findByChannelEnAndStatus_First(
        java.lang.String descriptiveNameEn, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelEnAndStatus_First(descriptiveNameEn, status,
            orderByComparator);
    }

    /**
    * Returns the first payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByChannelEnAndStatus_First(
        java.lang.String descriptiveNameEn, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelEnAndStatus_First(descriptiveNameEn, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel findByChannelEnAndStatus_Last(
        java.lang.String descriptiveNameEn, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelEnAndStatus_Last(descriptiveNameEn, status,
            orderByComparator);
    }

    /**
    * Returns the last payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByChannelEnAndStatus_Last(
        java.lang.String descriptiveNameEn, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelEnAndStatus_Last(descriptiveNameEn, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel[] findByChannelEnAndStatus_PrevAndNext(
        java.lang.String transId, java.lang.String descriptiveNameEn,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelEnAndStatus_PrevAndNext(transId,
            descriptiveNameEn, status, orderByComparator);
    }

    /**
    * Removes all the payment channels where descriptiveNameEn = &#63; and status = &#63; from the database.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByChannelEnAndStatus(
        java.lang.String descriptiveNameEn, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByChannelEnAndStatus(descriptiveNameEn, status);
    }

    /**
    * Returns the number of payment channels where descriptiveNameEn = &#63; and status = &#63;.
    *
    * @param descriptiveNameEn the descriptive name en
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static int countByChannelEnAndStatus(
        java.lang.String descriptiveNameEn, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByChannelEnAndStatus(descriptiveNameEn, status);
    }

    /**
    * Returns all the payment channels where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @return the matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelArAndStatus(
        java.lang.String descriptiveNameAr, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelArAndStatus(descriptiveNameAr, status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelArAndStatus(
        java.lang.String descriptiveNameAr, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelArAndStatus(descriptiveNameAr, status, start,
            end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findByChannelArAndStatus(
        java.lang.String descriptiveNameAr, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelArAndStatus(descriptiveNameAr, status, start,
            end, orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel findByChannelArAndStatus_First(
        java.lang.String descriptiveNameAr, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelArAndStatus_First(descriptiveNameAr, status,
            orderByComparator);
    }

    /**
    * Returns the first payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByChannelArAndStatus_First(
        java.lang.String descriptiveNameAr, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelArAndStatus_First(descriptiveNameAr, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel findByChannelArAndStatus_Last(
        java.lang.String descriptiveNameAr, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelArAndStatus_Last(descriptiveNameAr, status,
            orderByComparator);
    }

    /**
    * Returns the last payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByChannelArAndStatus_Last(
        java.lang.String descriptiveNameAr, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelArAndStatus_Last(descriptiveNameAr, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentChannel[] findByChannelArAndStatus_PrevAndNext(
        java.lang.String transId, java.lang.String descriptiveNameAr,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence()
                   .findByChannelArAndStatus_PrevAndNext(transId,
            descriptiveNameAr, status, orderByComparator);
    }

    /**
    * Removes all the payment channels where descriptiveNameAr = &#63; and status = &#63; from the database.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByChannelArAndStatus(
        java.lang.String descriptiveNameAr, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByChannelArAndStatus(descriptiveNameAr, status);
    }

    /**
    * Returns the number of payment channels where descriptiveNameAr = &#63; and status = &#63;.
    *
    * @param descriptiveNameAr the descriptive name ar
    * @param status the status
    * @return the number of matching payment channels
    * @throws SystemException if a system exception occurred
    */
    public static int countByChannelArAndStatus(
        java.lang.String descriptiveNameAr, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByChannelArAndStatus(descriptiveNameAr, status);
    }

    /**
    * Caches the payment channel in the entity cache if it is enabled.
    *
    * @param paymentChannel the payment channel
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel) {
        getPersistence().cacheResult(paymentChannel);
    }

    /**
    * Caches the payment channels in the entity cache if it is enabled.
    *
    * @param paymentChannels the payment channels
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentChannel> paymentChannels) {
        getPersistence().cacheResult(paymentChannels);
    }

    /**
    * Creates a new payment channel with the primary key. Does not add the payment channel to the database.
    *
    * @param transId the primary key for the new payment channel
    * @return the new payment channel
    */
    public static com.stc.echannels.epayments.model.PaymentChannel create(
        java.lang.String transId) {
        return getPersistence().create(transId);
    }

    /**
    * Removes the payment channel with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence().remove(transId);
    }

    public static com.stc.echannels.epayments.model.PaymentChannel updateImpl(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(paymentChannel);
    }

    /**
    * Returns the payment channel with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentChannelException} if it could not be found.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel
    * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentChannelException {
        return getPersistence().findByPrimaryKey(transId);
    }

    /**
    * Returns the payment channel with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel, or <code>null</code> if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(transId);
    }

    /**
    * Returns all the payment channels.
    *
    * @return the payment channels
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the payment channels from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of payment channels.
    *
    * @return the number of payment channels
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PaymentChannelPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PaymentChannelPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    PaymentChannelPersistence.class.getName());

            ReferenceRegistry.registerReference(PaymentChannelUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PaymentChannelPersistence persistence) {
    }
}
