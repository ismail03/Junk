package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.PaymentMethod;

/**
 * The persistence interface for the payment method service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentMethodPersistenceImpl
 * @see PaymentMethodUtil
 * @generated
 */
public interface PaymentMethodPersistence extends BasePersistence<PaymentMethod> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaymentMethodUtil} to access the payment method persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the payment methods where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @return the matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodId(
        long pmtMethodId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment methods where pmtMethodId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @return the range of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodId(
        long pmtMethodId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment methods where pmtMethodId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodId(
        long pmtMethodId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod findByPmtMethodId_First(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Returns the first payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod fetchByPmtMethodId_First(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod findByPmtMethodId_Last(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Returns the last payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod fetchByPmtMethodId_Last(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the payment methods where pmtMethodId = &#63; and status = &#63; from the database.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByPmtMethodId(long pmtMethodId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment methods where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @return the number of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public int countByPmtMethodId(long pmtMethodId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment methods where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @return the matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodIdType(
        java.lang.String pmtMethodIdType, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment methods where pmtMethodIdType = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @return the range of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodIdType(
        java.lang.String pmtMethodIdType, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment methods where pmtMethodIdType = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodIdType(
        java.lang.String pmtMethodIdType, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod findByPmtMethodIdType_First(
        java.lang.String pmtMethodIdType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Returns the first payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod fetchByPmtMethodIdType_First(
        java.lang.String pmtMethodIdType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod findByPmtMethodIdType_Last(
        java.lang.String pmtMethodIdType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Returns the last payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod fetchByPmtMethodIdType_Last(
        java.lang.String pmtMethodIdType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment methods before and after the current payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodId the primary key of the current payment method
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod[] findByPmtMethodIdType_PrevAndNext(
        long pmtMethodId, java.lang.String pmtMethodIdType,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Removes all the payment methods where pmtMethodIdType = &#63; and status = &#63; from the database.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByPmtMethodIdType(java.lang.String pmtMethodIdType,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment methods where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @return the number of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public int countByPmtMethodIdType(java.lang.String pmtMethodIdType,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment methods where status = &#63;.
    *
    * @param status the status
    * @return the matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment methods where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @return the range of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment methods where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment method in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Returns the first payment method in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment method in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Returns the last payment method in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment methods before and after the current payment method in the ordered set where status = &#63;.
    *
    * @param pmtMethodId the primary key of the current payment method
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod[] findByStatus_PrevAndNext(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Removes all the payment methods where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment methods where status = &#63;.
    *
    * @param status the status
    * @return the number of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the payment method in the entity cache if it is enabled.
    *
    * @param paymentMethod the payment method
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.PaymentMethod paymentMethod);

    /**
    * Caches the payment methods in the entity cache if it is enabled.
    *
    * @param paymentMethods the payment methods
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentMethod> paymentMethods);

    /**
    * Creates a new payment method with the primary key. Does not add the payment method to the database.
    *
    * @param pmtMethodId the primary key for the new payment method
    * @return the new payment method
    */
    public com.stc.echannels.epayments.model.PaymentMethod create(
        long pmtMethodId);

    /**
    * Removes the payment method with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pmtMethodId the primary key of the payment method
    * @return the payment method that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod remove(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    public com.stc.echannels.epayments.model.PaymentMethod updateImpl(
        com.stc.echannels.epayments.model.PaymentMethod paymentMethod)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment method with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentMethodException} if it could not be found.
    *
    * @param pmtMethodId the primary key of the payment method
    * @return the payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod findByPrimaryKey(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException;

    /**
    * Returns the payment method with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param pmtMethodId the primary key of the payment method
    * @return the payment method, or <code>null</code> if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentMethod fetchByPrimaryKey(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment methods.
    *
    * @return the payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment methods.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @return the range of payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment methods.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of payment methods
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the payment methods from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment methods.
    *
    * @return the number of payment methods
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
