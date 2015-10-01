package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.PaymentSystem;

/**
 * The persistence interface for the payment system service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentSystemPersistenceImpl
 * @see PaymentSystemUtil
 * @generated
 */
public interface PaymentSystemPersistence extends BasePersistence<PaymentSystem> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaymentSystemUtil} to access the payment system persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the payment systems where active = &#63;.
    *
    * @param active the active
    * @return the matching payment systems
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentSystem> findByActive(
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment systems where active = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param active the active
    * @param start the lower bound of the range of payment systems
    * @param end the upper bound of the range of payment systems (not inclusive)
    * @return the range of matching payment systems
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentSystem> findByActive(
        java.lang.String active, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment systems where active = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param active the active
    * @param start the lower bound of the range of payment systems
    * @param end the upper bound of the range of payment systems (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment systems
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentSystem> findByActive(
        java.lang.String active, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment system in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment system
    * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a matching payment system could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentSystem findByActive_First(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentSystemException;

    /**
    * Returns the first payment system in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment system, or <code>null</code> if a matching payment system could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentSystem fetchByActive_First(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment system in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment system
    * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a matching payment system could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentSystem findByActive_Last(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentSystemException;

    /**
    * Returns the last payment system in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment system, or <code>null</code> if a matching payment system could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentSystem fetchByActive_Last(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment systems before and after the current payment system in the ordered set where active = &#63;.
    *
    * @param paymentSystemId the primary key of the current payment system
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment system
    * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a payment system with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentSystem[] findByActive_PrevAndNext(
        long paymentSystemId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentSystemException;

    /**
    * Removes all the payment systems where active = &#63; from the database.
    *
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public void removeByActive(java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment systems where active = &#63;.
    *
    * @param active the active
    * @return the number of matching payment systems
    * @throws SystemException if a system exception occurred
    */
    public int countByActive(java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the payment system in the entity cache if it is enabled.
    *
    * @param paymentSystem the payment system
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.PaymentSystem paymentSystem);

    /**
    * Caches the payment systems in the entity cache if it is enabled.
    *
    * @param paymentSystems the payment systems
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentSystem> paymentSystems);

    /**
    * Creates a new payment system with the primary key. Does not add the payment system to the database.
    *
    * @param paymentSystemId the primary key for the new payment system
    * @return the new payment system
    */
    public com.stc.echannels.epayments.model.PaymentSystem create(
        long paymentSystemId);

    /**
    * Removes the payment system with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentSystemId the primary key of the payment system
    * @return the payment system that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a payment system with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentSystem remove(
        long paymentSystemId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentSystemException;

    public com.stc.echannels.epayments.model.PaymentSystem updateImpl(
        com.stc.echannels.epayments.model.PaymentSystem paymentSystem)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment system with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentSystemException} if it could not be found.
    *
    * @param paymentSystemId the primary key of the payment system
    * @return the payment system
    * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a payment system with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentSystem findByPrimaryKey(
        long paymentSystemId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentSystemException;

    /**
    * Returns the payment system with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param paymentSystemId the primary key of the payment system
    * @return the payment system, or <code>null</code> if a payment system with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentSystem fetchByPrimaryKey(
        long paymentSystemId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment systems.
    *
    * @return the payment systems
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentSystem> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment systems.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment systems
    * @param end the upper bound of the range of payment systems (not inclusive)
    * @return the range of payment systems
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentSystem> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment systems.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment systems
    * @param end the upper bound of the range of payment systems (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of payment systems
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentSystem> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the payment systems from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment systems.
    *
    * @return the number of payment systems
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
