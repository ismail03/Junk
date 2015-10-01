package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.PaymentMethod;

import java.util.List;

/**
 * The persistence utility for the payment method service. This utility wraps {@link PaymentMethodPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentMethodPersistence
 * @see PaymentMethodPersistenceImpl
 * @generated
 */
public class PaymentMethodUtil {
    private static PaymentMethodPersistence _persistence;

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
    public static void clearCache(PaymentMethod paymentMethod) {
        getPersistence().clearCache(paymentMethod);
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
    public static List<PaymentMethod> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PaymentMethod> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PaymentMethod> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PaymentMethod update(PaymentMethod paymentMethod)
        throws SystemException {
        return getPersistence().update(paymentMethod);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PaymentMethod update(PaymentMethod paymentMethod,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(paymentMethod, serviceContext);
    }

    /**
    * Returns all the payment methods where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @return the matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodId(
        long pmtMethodId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPmtMethodId(pmtMethodId, status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodId(
        long pmtMethodId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPmtMethodId(pmtMethodId, status, start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodId(
        long pmtMethodId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPmtMethodId(pmtMethodId, status, start, end,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentMethod findByPmtMethodId_First(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence()
                   .findByPmtMethodId_First(pmtMethodId, status,
            orderByComparator);
    }

    /**
    * Returns the first payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod fetchByPmtMethodId_First(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPmtMethodId_First(pmtMethodId, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentMethod findByPmtMethodId_Last(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence()
                   .findByPmtMethodId_Last(pmtMethodId, status,
            orderByComparator);
    }

    /**
    * Returns the last payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod fetchByPmtMethodId_Last(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPmtMethodId_Last(pmtMethodId, status,
            orderByComparator);
    }

    /**
    * Removes all the payment methods where pmtMethodId = &#63; and status = &#63; from the database.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPmtMethodId(long pmtMethodId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPmtMethodId(pmtMethodId, status);
    }

    /**
    * Returns the number of payment methods where pmtMethodId = &#63; and status = &#63;.
    *
    * @param pmtMethodId the pmt method ID
    * @param status the status
    * @return the number of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public static int countByPmtMethodId(long pmtMethodId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPmtMethodId(pmtMethodId, status);
    }

    /**
    * Returns all the payment methods where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @return the matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodIdType(
        java.lang.String pmtMethodIdType, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPmtMethodIdType(pmtMethodIdType, status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodIdType(
        java.lang.String pmtMethodIdType, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPmtMethodIdType(pmtMethodIdType, status, start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByPmtMethodIdType(
        java.lang.String pmtMethodIdType, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPmtMethodIdType(pmtMethodIdType, status, start, end,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentMethod findByPmtMethodIdType_First(
        java.lang.String pmtMethodIdType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence()
                   .findByPmtMethodIdType_First(pmtMethodIdType, status,
            orderByComparator);
    }

    /**
    * Returns the first payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod fetchByPmtMethodIdType_First(
        java.lang.String pmtMethodIdType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPmtMethodIdType_First(pmtMethodIdType, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentMethod findByPmtMethodIdType_Last(
        java.lang.String pmtMethodIdType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence()
                   .findByPmtMethodIdType_Last(pmtMethodIdType, status,
            orderByComparator);
    }

    /**
    * Returns the last payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod fetchByPmtMethodIdType_Last(
        java.lang.String pmtMethodIdType, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPmtMethodIdType_Last(pmtMethodIdType, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentMethod[] findByPmtMethodIdType_PrevAndNext(
        long pmtMethodId, java.lang.String pmtMethodIdType,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence()
                   .findByPmtMethodIdType_PrevAndNext(pmtMethodId,
            pmtMethodIdType, status, orderByComparator);
    }

    /**
    * Removes all the payment methods where pmtMethodIdType = &#63; and status = &#63; from the database.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPmtMethodIdType(
        java.lang.String pmtMethodIdType, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPmtMethodIdType(pmtMethodIdType, status);
    }

    /**
    * Returns the number of payment methods where pmtMethodIdType = &#63; and status = &#63;.
    *
    * @param pmtMethodIdType the pmt method ID type
    * @param status the status
    * @return the number of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public static int countByPmtMethodIdType(java.lang.String pmtMethodIdType,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPmtMethodIdType(pmtMethodIdType, status);
    }

    /**
    * Returns all the payment methods where status = &#63;.
    *
    * @param status the status
    * @return the matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first payment method in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first payment method in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last payment method in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last payment method in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentMethod[] findByStatus_PrevAndNext(
        long pmtMethodId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence()
                   .findByStatus_PrevAndNext(pmtMethodId, status,
            orderByComparator);
    }

    /**
    * Removes all the payment methods where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of payment methods where status = &#63;.
    *
    * @param status the status
    * @return the number of matching payment methods
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Caches the payment method in the entity cache if it is enabled.
    *
    * @param paymentMethod the payment method
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.PaymentMethod paymentMethod) {
        getPersistence().cacheResult(paymentMethod);
    }

    /**
    * Caches the payment methods in the entity cache if it is enabled.
    *
    * @param paymentMethods the payment methods
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentMethod> paymentMethods) {
        getPersistence().cacheResult(paymentMethods);
    }

    /**
    * Creates a new payment method with the primary key. Does not add the payment method to the database.
    *
    * @param pmtMethodId the primary key for the new payment method
    * @return the new payment method
    */
    public static com.stc.echannels.epayments.model.PaymentMethod create(
        long pmtMethodId) {
        return getPersistence().create(pmtMethodId);
    }

    /**
    * Removes the payment method with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pmtMethodId the primary key of the payment method
    * @return the payment method that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod remove(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence().remove(pmtMethodId);
    }

    public static com.stc.echannels.epayments.model.PaymentMethod updateImpl(
        com.stc.echannels.epayments.model.PaymentMethod paymentMethod)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(paymentMethod);
    }

    /**
    * Returns the payment method with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentMethodException} if it could not be found.
    *
    * @param pmtMethodId the primary key of the payment method
    * @return the payment method
    * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod findByPrimaryKey(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentMethodException {
        return getPersistence().findByPrimaryKey(pmtMethodId);
    }

    /**
    * Returns the payment method with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param pmtMethodId the primary key of the payment method
    * @return the payment method, or <code>null</code> if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentMethod fetchByPrimaryKey(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(pmtMethodId);
    }

    /**
    * Returns all the payment methods.
    *
    * @return the payment methods
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the payment methods from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of payment methods.
    *
    * @return the number of payment methods
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PaymentMethodPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PaymentMethodPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    PaymentMethodPersistence.class.getName());

            ReferenceRegistry.registerReference(PaymentMethodUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PaymentMethodPersistence persistence) {
    }
}
