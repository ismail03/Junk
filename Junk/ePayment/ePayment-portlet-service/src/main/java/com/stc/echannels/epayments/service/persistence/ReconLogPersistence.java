package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.ReconLog;

/**
 * The persistence interface for the recon log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see ReconLogPersistenceImpl
 * @see ReconLogUtil
 * @generated
 */
public interface ReconLogPersistence extends BasePersistence<ReconLog> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ReconLogUtil} to access the recon log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the recon log in the entity cache if it is enabled.
    *
    * @param reconLog the recon log
    */
    public void cacheResult(com.stc.echannels.epayments.model.ReconLog reconLog);

    /**
    * Caches the recon logs in the entity cache if it is enabled.
    *
    * @param reconLogs the recon logs
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.ReconLog> reconLogs);

    /**
    * Creates a new recon log with the primary key. Does not add the recon log to the database.
    *
    * @param paymentSystemTransId the primary key for the new recon log
    * @return the new recon log
    */
    public com.stc.echannels.epayments.model.ReconLog create(
        java.lang.String paymentSystemTransId);

    /**
    * Removes the recon log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log that was removed
    * @throws com.stc.echannels.epayments.NoSuchReconLogException if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.ReconLog remove(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchReconLogException;

    public com.stc.echannels.epayments.model.ReconLog updateImpl(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the recon log with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchReconLogException} if it could not be found.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log
    * @throws com.stc.echannels.epayments.NoSuchReconLogException if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.ReconLog findByPrimaryKey(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchReconLogException;

    /**
    * Returns the recon log with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log, or <code>null</code> if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.ReconLog fetchByPrimaryKey(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the recon logs.
    *
    * @return the recon logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.ReconLog> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the recon logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of recon logs
    * @param end the upper bound of the range of recon logs (not inclusive)
    * @return the range of recon logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.ReconLog> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the recon logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of recon logs
    * @param end the upper bound of the range of recon logs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of recon logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.ReconLog> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the recon logs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of recon logs.
    *
    * @return the number of recon logs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
