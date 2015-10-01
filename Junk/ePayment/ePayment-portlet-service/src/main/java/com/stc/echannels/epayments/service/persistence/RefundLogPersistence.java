package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.RefundLog;

/**
 * The persistence interface for the refund log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see RefundLogPersistenceImpl
 * @see RefundLogUtil
 * @generated
 */
public interface RefundLogPersistence extends BasePersistence<RefundLog> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RefundLogUtil} to access the refund log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the refund log in the entity cache if it is enabled.
    *
    * @param refundLog the refund log
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.RefundLog refundLog);

    /**
    * Caches the refund logs in the entity cache if it is enabled.
    *
    * @param refundLogs the refund logs
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.RefundLog> refundLogs);

    /**
    * Creates a new refund log with the primary key. Does not add the refund log to the database.
    *
    * @param epayTransId the primary key for the new refund log
    * @return the new refund log
    */
    public com.stc.echannels.epayments.model.RefundLog create(
        java.lang.String epayTransId);

    /**
    * Removes the refund log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log that was removed
    * @throws com.stc.echannels.epayments.NoSuchRefundLogException if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.RefundLog remove(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchRefundLogException;

    public com.stc.echannels.epayments.model.RefundLog updateImpl(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the refund log with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchRefundLogException} if it could not be found.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log
    * @throws com.stc.echannels.epayments.NoSuchRefundLogException if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.RefundLog findByPrimaryKey(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchRefundLogException;

    /**
    * Returns the refund log with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log, or <code>null</code> if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.RefundLog fetchByPrimaryKey(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the refund logs.
    *
    * @return the refund logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.RefundLog> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the refund logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refund logs
    * @param end the upper bound of the range of refund logs (not inclusive)
    * @return the range of refund logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.RefundLog> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the refund logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refund logs
    * @param end the upper bound of the range of refund logs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of refund logs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.RefundLog> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the refund logs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of refund logs.
    *
    * @return the number of refund logs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
