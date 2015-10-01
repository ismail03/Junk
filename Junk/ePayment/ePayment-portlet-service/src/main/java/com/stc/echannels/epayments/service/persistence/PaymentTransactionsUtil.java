package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.PaymentTransactions;

import java.util.List;

/**
 * The persistence utility for the payment transactions service. This utility wraps {@link PaymentTransactionsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionsPersistence
 * @see PaymentTransactionsPersistenceImpl
 * @generated
 */
public class PaymentTransactionsUtil {
    private static PaymentTransactionsPersistence _persistence;

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
    public static void clearCache(PaymentTransactions paymentTransactions) {
        getPersistence().clearCache(paymentTransactions);
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
    public static List<PaymentTransactions> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PaymentTransactions> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PaymentTransactions> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PaymentTransactions update(
        PaymentTransactions paymentTransactions) throws SystemException {
        return getPersistence().update(paymentTransactions);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PaymentTransactions update(
        PaymentTransactions paymentTransactions, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(paymentTransactions, serviceContext);
    }

    /**
    * Returns all the payment transactionses where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @return the matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByChannelId(
        long channelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByChannelId(channelId);
    }

    /**
    * Returns a range of all the payment transactionses where channelId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param channelId the channel ID
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @return the range of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByChannelId(
        long channelId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByChannelId(channelId, start, end);
    }

    /**
    * Returns an ordered range of all the payment transactionses where channelId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param channelId the channel ID
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByChannelId(
        long channelId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByChannelId(channelId, start, end, orderByComparator);
    }

    /**
    * Returns the first payment transactions in the ordered set where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions findByChannelId_First(
        long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByChannelId_First(channelId, orderByComparator);
    }

    /**
    * Returns the first payment transactions in the ordered set where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions fetchByChannelId_First(
        long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelId_First(channelId, orderByComparator);
    }

    /**
    * Returns the last payment transactions in the ordered set where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions findByChannelId_Last(
        long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByChannelId_Last(channelId, orderByComparator);
    }

    /**
    * Returns the last payment transactions in the ordered set where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions fetchByChannelId_Last(
        long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByChannelId_Last(channelId, orderByComparator);
    }

    /**
    * Returns the payment transactionses before and after the current payment transactions in the ordered set where channelId = &#63;.
    *
    * @param epayTransId the primary key of the current payment transactions
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions[] findByChannelId_PrevAndNext(
        java.lang.String epayTransId, long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByChannelId_PrevAndNext(epayTransId, channelId,
            orderByComparator);
    }

    /**
    * Removes all the payment transactionses where channelId = &#63; from the database.
    *
    * @param channelId the channel ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByChannelId(long channelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByChannelId(channelId);
    }

    /**
    * Returns the number of payment transactionses where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @return the number of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static int countByChannelId(long channelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByChannelId(channelId);
    }

    /**
    * Returns all the payment transactionses where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @return the matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBankId(
        java.lang.String pmtBankId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPmtBankId(pmtBankId);
    }

    /**
    * Returns a range of all the payment transactionses where pmtBankId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pmtBankId the pmt bank ID
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @return the range of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBankId(
        java.lang.String pmtBankId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPmtBankId(pmtBankId, start, end);
    }

    /**
    * Returns an ordered range of all the payment transactionses where pmtBankId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pmtBankId the pmt bank ID
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBankId(
        java.lang.String pmtBankId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPmtBankId(pmtBankId, start, end, orderByComparator);
    }

    /**
    * Returns the first payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions findByPmtBankId_First(
        java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByPmtBankId_First(pmtBankId, orderByComparator);
    }

    /**
    * Returns the first payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions fetchByPmtBankId_First(
        java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPmtBankId_First(pmtBankId, orderByComparator);
    }

    /**
    * Returns the last payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions findByPmtBankId_Last(
        java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByPmtBankId_Last(pmtBankId, orderByComparator);
    }

    /**
    * Returns the last payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions fetchByPmtBankId_Last(
        java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPmtBankId_Last(pmtBankId, orderByComparator);
    }

    /**
    * Returns the payment transactionses before and after the current payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param epayTransId the primary key of the current payment transactions
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions[] findByPmtBankId_PrevAndNext(
        java.lang.String epayTransId, java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByPmtBankId_PrevAndNext(epayTransId, pmtBankId,
            orderByComparator);
    }

    /**
    * Removes all the payment transactionses where pmtBankId = &#63; from the database.
    *
    * @param pmtBankId the pmt bank ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPmtBankId(java.lang.String pmtBankId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPmtBankId(pmtBankId);
    }

    /**
    * Returns the number of payment transactionses where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @return the number of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static int countByPmtBankId(java.lang.String pmtBankId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPmtBankId(pmtBankId);
    }

    /**
    * Returns all the payment transactionses where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @return the matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBranchId(
        java.lang.String pmtBranchId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPmtBranchId(pmtBranchId);
    }

    /**
    * Returns a range of all the payment transactionses where pmtBranchId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pmtBranchId the pmt branch ID
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @return the range of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBranchId(
        java.lang.String pmtBranchId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPmtBranchId(pmtBranchId, start, end);
    }

    /**
    * Returns an ordered range of all the payment transactionses where pmtBranchId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pmtBranchId the pmt branch ID
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBranchId(
        java.lang.String pmtBranchId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPmtBranchId(pmtBranchId, start, end, orderByComparator);
    }

    /**
    * Returns the first payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions findByPmtBranchId_First(
        java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByPmtBranchId_First(pmtBranchId, orderByComparator);
    }

    /**
    * Returns the first payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions fetchByPmtBranchId_First(
        java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPmtBranchId_First(pmtBranchId, orderByComparator);
    }

    /**
    * Returns the last payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions findByPmtBranchId_Last(
        java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByPmtBranchId_Last(pmtBranchId, orderByComparator);
    }

    /**
    * Returns the last payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions fetchByPmtBranchId_Last(
        java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPmtBranchId_Last(pmtBranchId, orderByComparator);
    }

    /**
    * Returns the payment transactionses before and after the current payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param epayTransId the primary key of the current payment transactions
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions[] findByPmtBranchId_PrevAndNext(
        java.lang.String epayTransId, java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence()
                   .findByPmtBranchId_PrevAndNext(epayTransId, pmtBranchId,
            orderByComparator);
    }

    /**
    * Removes all the payment transactionses where pmtBranchId = &#63; from the database.
    *
    * @param pmtBranchId the pmt branch ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPmtBranchId(java.lang.String pmtBranchId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPmtBranchId(pmtBranchId);
    }

    /**
    * Returns the number of payment transactionses where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @return the number of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static int countByPmtBranchId(java.lang.String pmtBranchId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPmtBranchId(pmtBranchId);
    }

    /**
    * Caches the payment transactions in the entity cache if it is enabled.
    *
    * @param paymentTransactions the payment transactions
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.PaymentTransactions paymentTransactions) {
        getPersistence().cacheResult(paymentTransactions);
    }

    /**
    * Caches the payment transactionses in the entity cache if it is enabled.
    *
    * @param paymentTransactionses the payment transactionses
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> paymentTransactionses) {
        getPersistence().cacheResult(paymentTransactionses);
    }

    /**
    * Creates a new payment transactions with the primary key. Does not add the payment transactions to the database.
    *
    * @param epayTransId the primary key for the new payment transactions
    * @return the new payment transactions
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions create(
        java.lang.String epayTransId) {
        return getPersistence().create(epayTransId);
    }

    /**
    * Removes the payment transactions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayTransId the primary key of the payment transactions
    * @return the payment transactions that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions remove(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence().remove(epayTransId);
    }

    public static com.stc.echannels.epayments.model.PaymentTransactions updateImpl(
        com.stc.echannels.epayments.model.PaymentTransactions paymentTransactions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(paymentTransactions);
    }

    /**
    * Returns the payment transactions with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentTransactionsException} if it could not be found.
    *
    * @param epayTransId the primary key of the payment transactions
    * @return the payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions findByPrimaryKey(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException {
        return getPersistence().findByPrimaryKey(epayTransId);
    }

    /**
    * Returns the payment transactions with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param epayTransId the primary key of the payment transactions
    * @return the payment transactions, or <code>null</code> if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactions fetchByPrimaryKey(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(epayTransId);
    }

    /**
    * Returns all the payment transactionses.
    *
    * @return the payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the payment transactionses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @return the range of payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the payment transactionses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment transactionses
    * @param end the upper bound of the range of payment transactionses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the payment transactionses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of payment transactionses.
    *
    * @return the number of payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PaymentTransactionsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PaymentTransactionsPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    PaymentTransactionsPersistence.class.getName());

            ReferenceRegistry.registerReference(PaymentTransactionsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PaymentTransactionsPersistence persistence) {
    }
}
