package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.BankBranch;

/**
 * The persistence interface for the bank branch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankBranchPersistenceImpl
 * @see BankBranchUtil
 * @generated
 */
public interface BankBranchPersistence extends BasePersistence<BankBranch> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BankBranchUtil} to access the bank branch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the bank branchs where status = &#63;.
    *
    * @param status the status
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the bank branchs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the bank branchs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first bank branch in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the first bank branch in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last bank branch in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the last bank branch in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where status = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch[] findByStatus_PrevAndNext(
        java.lang.String transId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Removes all the bank branchs where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank branchs where status = &#63;.
    *
    * @param status the status
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank branchs where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankId(
        java.lang.String bankId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the bank branchs where bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankId(
        java.lang.String bankId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the bank branchs where bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankId(
        java.lang.String bankId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByBankId_First(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the first bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByBankId_First(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByBankId_Last(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the last bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByBankId_Last(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch[] findByBankId_PrevAndNext(
        java.lang.String transId, java.lang.String bankId,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Removes all the bank branchs where bankId = &#63; and status = &#63; from the database.
    *
    * @param bankId the bank ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByBankId(java.lang.String bankId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank branchs where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public int countByBankId(java.lang.String bankId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankPaymentChannel(
        java.lang.String bankId, long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankPaymentChannel(
        java.lang.String bankId, long channelId, java.lang.String status,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankPaymentChannel(
        java.lang.String bankId, long channelId, java.lang.String status,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByBankPaymentChannel_First(
        java.lang.String bankId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the first bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByBankPaymentChannel_First(
        java.lang.String bankId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByBankPaymentChannel_Last(
        java.lang.String bankId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the last bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByBankPaymentChannel_Last(
        java.lang.String bankId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch[] findByBankPaymentChannel_PrevAndNext(
        java.lang.String transId, java.lang.String bankId, long channelId,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Removes all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63; from the database.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByBankPaymentChannel(java.lang.String bankId,
        long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public int countByBankPaymentChannel(java.lang.String bankId,
        long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank branchs where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCode(
        java.lang.String stcBranchCode, java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the bank branchs where stcBranchCode = &#63; and active = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCode(
        java.lang.String stcBranchCode, java.lang.String active, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the bank branchs where stcBranchCode = &#63; and active = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCode(
        java.lang.String stcBranchCode, java.lang.String active, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByBranchCode_First(
        java.lang.String stcBranchCode, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByBranchCode_First(
        java.lang.String stcBranchCode, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByBranchCode_Last(
        java.lang.String stcBranchCode, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByBranchCode_Last(
        java.lang.String stcBranchCode, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch[] findByBranchCode_PrevAndNext(
        java.lang.String transId, java.lang.String stcBranchCode,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Removes all the bank branchs where stcBranchCode = &#63; and active = &#63; from the database.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public void removeByBranchCode(java.lang.String stcBranchCode,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank branchs where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public int countByBranchCode(java.lang.String stcBranchCode,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank branchs where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCodeAndStatus(
        java.lang.String stcBranchCode, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the bank branchs where stcBranchCode = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCodeAndStatus(
        java.lang.String stcBranchCode, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the bank branchs where stcBranchCode = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCodeAndStatus(
        java.lang.String stcBranchCode, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByBranchCodeAndStatus_First(
        java.lang.String stcBranchCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByBranchCodeAndStatus_First(
        java.lang.String stcBranchCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByBranchCodeAndStatus_Last(
        java.lang.String stcBranchCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByBranchCodeAndStatus_Last(
        java.lang.String stcBranchCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch[] findByBranchCodeAndStatus_PrevAndNext(
        java.lang.String transId, java.lang.String stcBranchCode,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Removes all the bank branchs where stcBranchCode = &#63; and status = &#63; from the database.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByBranchCodeAndStatus(java.lang.String stcBranchCode,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank branchs where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public int countByBranchCodeAndStatus(java.lang.String stcBranchCode,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the bank branch in the entity cache if it is enabled.
    *
    * @param bankBranch the bank branch
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.BankBranch bankBranch);

    /**
    * Caches the bank branchs in the entity cache if it is enabled.
    *
    * @param bankBranchs the bank branchs
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.BankBranch> bankBranchs);

    /**
    * Creates a new bank branch with the primary key. Does not add the bank branch to the database.
    *
    * @param transId the primary key for the new bank branch
    * @return the new bank branch
    */
    public com.stc.echannels.epayments.model.BankBranch create(
        java.lang.String transId);

    /**
    * Removes the bank branch with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the bank branch
    * @return the bank branch that was removed
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    public com.stc.echannels.epayments.model.BankBranch updateImpl(
        com.stc.echannels.epayments.model.BankBranch bankBranch)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank branch with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBankBranchException} if it could not be found.
    *
    * @param transId the primary key of the bank branch
    * @return the bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException;

    /**
    * Returns the bank branch with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the bank branch
    * @return the bank branch, or <code>null</code> if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BankBranch fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the bank branchs.
    *
    * @return the bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the bank branchs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the bank branchs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of bank branchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the bank branchs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of bank branchs.
    *
    * @return the number of bank branchs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
