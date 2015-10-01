package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.RefundReconLog;

/**
 * The persistence interface for the refund recon log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see RefundReconLogPersistenceImpl
 * @see RefundReconLogUtil
 * @generated
 */
public interface RefundReconLogPersistence extends BasePersistence<RefundReconLog> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RefundReconLogUtil} to access the refund recon log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the refund recon log in the entity cache if it is enabled.
    *
    * @param refundReconLog the refund recon log
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog);

    /**
    * Caches the refund recon logs in the entity cache if it is enabled.
    *
    * @param refundReconLogs the refund recon logs
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.RefundReconLog> refundReconLogs);

    /**
    * Creates a new refund recon log with the primary key. Does not add the refund recon log to the database.
    *
    * @param batchId the primary key for the new refund recon log
    * @return the new refund recon log
    */
    public com.stc.echannels.epayments.model.RefundReconLog create(
        java.lang.String batchId);

    /**
    * Removes the refund recon log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param batchId the primary key of the refund recon log
    * @return the refund recon log that was removed
    * @throws com.stc.echannels.epayments.NoSuchRefundReconLogException if a refund recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.RefundReconLog remove(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchRefundReconLogException;

    public com.stc.echannels.epayments.model.RefundReconLog updateImpl(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the refund recon log with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchRefundReconLogException} if it could not be found.
    *
    * @param batchId the primary key of the refund recon log
    * @return the refund recon log
    * @throws com.stc.echannels.epayments.NoSuchRefundReconLogException if a refund recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.RefundReconLog findByPrimaryKey(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchRefundReconLogException;

    /**
    * Returns the refund recon log with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param batchId the primary key of the refund recon log
    * @return the refund recon log, or <code>null</code> if a refund recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.RefundReconLog fetchByPrimaryKey(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the refund recon logs.
    *
    * @return the refund recon logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.RefundReconLog> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the refund recon logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refund recon logs
    * @param end the upper bound of the range of refund recon logs (not inclusive)
    * @return the range of refund recon logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.RefundReconLog> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the refund recon logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refund recon logs
    * @param end the upper bound of the range of refund recon logs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of refund recon logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.RefundReconLog> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the refund recon logs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of refund recon logs.
    *
    * @return the number of refund recon logs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
