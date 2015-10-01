package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.InRechargeHistory;

/**
 * The persistence interface for the in recharge history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see InRechargeHistoryPersistenceImpl
 * @see InRechargeHistoryUtil
 * @generated
 */
public interface InRechargeHistoryPersistence extends BasePersistence<InRechargeHistory> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link InRechargeHistoryUtil} to access the in recharge history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the in recharge history in the entity cache if it is enabled.
    *
    * @param inRechargeHistory the in recharge history
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.InRechargeHistory inRechargeHistory);

    /**
    * Caches the in recharge histories in the entity cache if it is enabled.
    *
    * @param inRechargeHistories the in recharge histories
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.InRechargeHistory> inRechargeHistories);

    /**
    * Creates a new in recharge history with the primary key. Does not add the in recharge history to the database.
    *
    * @param msisdn the primary key for the new in recharge history
    * @return the new in recharge history
    */
    public com.stc.echannels.epayments.model.InRechargeHistory create(
        java.lang.String msisdn);

    /**
    * Removes the in recharge history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param msisdn the primary key of the in recharge history
    * @return the in recharge history that was removed
    * @throws com.stc.echannels.epayments.NoSuchInRechargeHistoryException if a in recharge history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.InRechargeHistory remove(
        java.lang.String msisdn)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchInRechargeHistoryException;

    public com.stc.echannels.epayments.model.InRechargeHistory updateImpl(
        com.stc.echannels.epayments.model.InRechargeHistory inRechargeHistory)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the in recharge history with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchInRechargeHistoryException} if it could not be found.
    *
    * @param msisdn the primary key of the in recharge history
    * @return the in recharge history
    * @throws com.stc.echannels.epayments.NoSuchInRechargeHistoryException if a in recharge history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.InRechargeHistory findByPrimaryKey(
        java.lang.String msisdn)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchInRechargeHistoryException;

    /**
    * Returns the in recharge history with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param msisdn the primary key of the in recharge history
    * @return the in recharge history, or <code>null</code> if a in recharge history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.InRechargeHistory fetchByPrimaryKey(
        java.lang.String msisdn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the in recharge histories.
    *
    * @return the in recharge histories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.InRechargeHistory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the in recharge histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.InRechargeHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of in recharge histories
    * @param end the upper bound of the range of in recharge histories (not inclusive)
    * @return the range of in recharge histories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.InRechargeHistory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the in recharge histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.InRechargeHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of in recharge histories
    * @param end the upper bound of the range of in recharge histories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of in recharge histories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.InRechargeHistory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the in recharge histories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of in recharge histories.
    *
    * @return the number of in recharge histories
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
