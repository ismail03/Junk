package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.TransactionStatus;

/**
 * The persistence interface for the transaction status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see TransactionStatusPersistenceImpl
 * @see TransactionStatusUtil
 * @generated
 */
public interface TransactionStatusPersistence extends BasePersistence<TransactionStatus> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TransactionStatusUtil} to access the transaction status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the transaction status in the entity cache if it is enabled.
    *
    * @param transactionStatus the transaction status
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus);

    /**
    * Caches the transaction statuses in the entity cache if it is enabled.
    *
    * @param transactionStatuses the transaction statuses
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.TransactionStatus> transactionStatuses);

    /**
    * Creates a new transaction status with the primary key. Does not add the transaction status to the database.
    *
    * @param id the primary key for the new transaction status
    * @return the new transaction status
    */
    public com.stc.echannels.epayments.model.TransactionStatus create(long id);

    /**
    * Removes the transaction status with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status that was removed
    * @throws com.stc.echannels.epayments.NoSuchTransactionStatusException if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.TransactionStatus remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchTransactionStatusException;

    public com.stc.echannels.epayments.model.TransactionStatus updateImpl(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the transaction status with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchTransactionStatusException} if it could not be found.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status
    * @throws com.stc.echannels.epayments.NoSuchTransactionStatusException if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.TransactionStatus findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchTransactionStatusException;

    /**
    * Returns the transaction status with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status, or <code>null</code> if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.TransactionStatus fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the transaction statuses.
    *
    * @return the transaction statuses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.TransactionStatus> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the transaction statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of transaction statuses
    * @param end the upper bound of the range of transaction statuses (not inclusive)
    * @return the range of transaction statuses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.TransactionStatus> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the transaction statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of transaction statuses
    * @param end the upper bound of the range of transaction statuses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of transaction statuses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.TransactionStatus> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the transaction statuses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of transaction statuses.
    *
    * @return the number of transaction statuses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
