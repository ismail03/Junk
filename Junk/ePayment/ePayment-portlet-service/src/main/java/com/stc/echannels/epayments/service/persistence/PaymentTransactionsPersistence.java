package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.PaymentTransactions;

/**
 * The persistence interface for the payment transactions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionsPersistenceImpl
 * @see PaymentTransactionsUtil
 * @generated
 */
public interface PaymentTransactionsPersistence extends BasePersistence<PaymentTransactions> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaymentTransactionsUtil} to access the payment transactions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the payment transactionses where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @return the matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByChannelId(
        long channelId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByChannelId(
        long channelId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByChannelId(
        long channelId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment transactions in the ordered set where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions findByChannelId_First(
        long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Returns the first payment transactions in the ordered set where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions fetchByChannelId_First(
        long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment transactions in the ordered set where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions findByChannelId_Last(
        long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Returns the last payment transactions in the ordered set where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions fetchByChannelId_Last(
        long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.PaymentTransactions[] findByChannelId_PrevAndNext(
        java.lang.String epayTransId, long channelId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Removes all the payment transactionses where channelId = &#63; from the database.
    *
    * @param channelId the channel ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByChannelId(long channelId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment transactionses where channelId = &#63;.
    *
    * @param channelId the channel ID
    * @return the number of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public int countByChannelId(long channelId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment transactionses where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @return the matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBankId(
        java.lang.String pmtBankId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBankId(
        java.lang.String pmtBankId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBankId(
        java.lang.String pmtBankId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions findByPmtBankId_First(
        java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Returns the first payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions fetchByPmtBankId_First(
        java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions findByPmtBankId_Last(
        java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Returns the last payment transactions in the ordered set where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions fetchByPmtBankId_Last(
        java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.PaymentTransactions[] findByPmtBankId_PrevAndNext(
        java.lang.String epayTransId, java.lang.String pmtBankId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Removes all the payment transactionses where pmtBankId = &#63; from the database.
    *
    * @param pmtBankId the pmt bank ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByPmtBankId(java.lang.String pmtBankId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment transactionses where pmtBankId = &#63;.
    *
    * @param pmtBankId the pmt bank ID
    * @return the number of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public int countByPmtBankId(java.lang.String pmtBankId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment transactionses where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @return the matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBranchId(
        java.lang.String pmtBranchId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBranchId(
        java.lang.String pmtBranchId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findByPmtBranchId(
        java.lang.String pmtBranchId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions findByPmtBranchId_First(
        java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Returns the first payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions fetchByPmtBranchId_First(
        java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions findByPmtBranchId_Last(
        java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Returns the last payment transactions in the ordered set where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions fetchByPmtBranchId_Last(
        java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.PaymentTransactions[] findByPmtBranchId_PrevAndNext(
        java.lang.String epayTransId, java.lang.String pmtBranchId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Removes all the payment transactionses where pmtBranchId = &#63; from the database.
    *
    * @param pmtBranchId the pmt branch ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByPmtBranchId(java.lang.String pmtBranchId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment transactionses where pmtBranchId = &#63;.
    *
    * @param pmtBranchId the pmt branch ID
    * @return the number of matching payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public int countByPmtBranchId(java.lang.String pmtBranchId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the payment transactions in the entity cache if it is enabled.
    *
    * @param paymentTransactions the payment transactions
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.PaymentTransactions paymentTransactions);

    /**
    * Caches the payment transactionses in the entity cache if it is enabled.
    *
    * @param paymentTransactionses the payment transactionses
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> paymentTransactionses);

    /**
    * Creates a new payment transactions with the primary key. Does not add the payment transactions to the database.
    *
    * @param epayTransId the primary key for the new payment transactions
    * @return the new payment transactions
    */
    public com.stc.echannels.epayments.model.PaymentTransactions create(
        java.lang.String epayTransId);

    /**
    * Removes the payment transactions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayTransId the primary key of the payment transactions
    * @return the payment transactions that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions remove(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    public com.stc.echannels.epayments.model.PaymentTransactions updateImpl(
        com.stc.echannels.epayments.model.PaymentTransactions paymentTransactions)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment transactions with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentTransactionsException} if it could not be found.
    *
    * @param epayTransId the primary key of the payment transactions
    * @return the payment transactions
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions findByPrimaryKey(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionsException;

    /**
    * Returns the payment transactions with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param epayTransId the primary key of the payment transactions
    * @return the payment transactions, or <code>null</code> if a payment transactions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactions fetchByPrimaryKey(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment transactionses.
    *
    * @return the payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactions> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the payment transactionses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment transactionses.
    *
    * @return the number of payment transactionses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
