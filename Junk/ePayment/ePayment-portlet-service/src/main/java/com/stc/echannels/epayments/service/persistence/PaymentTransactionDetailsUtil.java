package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.PaymentTransactionDetails;

import java.util.List;

/**
 * The persistence utility for the payment transaction details service. This utility wraps {@link PaymentTransactionDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionDetailsPersistence
 * @see PaymentTransactionDetailsPersistenceImpl
 * @generated
 */
public class PaymentTransactionDetailsUtil {
    private static PaymentTransactionDetailsPersistence _persistence;

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
    public static void clearCache(
        PaymentTransactionDetails paymentTransactionDetails) {
        getPersistence().clearCache(paymentTransactionDetails);
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
    public static List<PaymentTransactionDetails> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PaymentTransactionDetails> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PaymentTransactionDetails> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PaymentTransactionDetails update(
        PaymentTransactionDetails paymentTransactionDetails)
        throws SystemException {
        return getPersistence().update(paymentTransactionDetails);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PaymentTransactionDetails update(
        PaymentTransactionDetails paymentTransactionDetails,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(paymentTransactionDetails, serviceContext);
    }

    /**
    * Caches the payment transaction details in the entity cache if it is enabled.
    *
    * @param paymentTransactionDetails the payment transaction details
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.PaymentTransactionDetails paymentTransactionDetails) {
        getPersistence().cacheResult(paymentTransactionDetails);
    }

    /**
    * Caches the payment transaction detailses in the entity cache if it is enabled.
    *
    * @param paymentTransactionDetailses the payment transaction detailses
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentTransactionDetails> paymentTransactionDetailses) {
        getPersistence().cacheResult(paymentTransactionDetailses);
    }

    /**
    * Creates a new payment transaction details with the primary key. Does not add the payment transaction details to the database.
    *
    * @param paymentTransactionDetailsPK the primary key for the new payment transaction details
    * @return the new payment transaction details
    */
    public static com.stc.echannels.epayments.model.PaymentTransactionDetails create(
        PaymentTransactionDetailsPK paymentTransactionDetailsPK) {
        return getPersistence().create(paymentTransactionDetailsPK);
    }

    /**
    * Removes the payment transaction details with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentTransactionDetailsPK the primary key of the payment transaction details
    * @return the payment transaction details that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException if a payment transaction details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactionDetails remove(
        PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException {
        return getPersistence().remove(paymentTransactionDetailsPK);
    }

    public static com.stc.echannels.epayments.model.PaymentTransactionDetails updateImpl(
        com.stc.echannels.epayments.model.PaymentTransactionDetails paymentTransactionDetails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(paymentTransactionDetails);
    }

    /**
    * Returns the payment transaction details with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException} if it could not be found.
    *
    * @param paymentTransactionDetailsPK the primary key of the payment transaction details
    * @return the payment transaction details
    * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException if a payment transaction details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactionDetails findByPrimaryKey(
        PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException {
        return getPersistence().findByPrimaryKey(paymentTransactionDetailsPK);
    }

    /**
    * Returns the payment transaction details with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param paymentTransactionDetailsPK the primary key of the payment transaction details
    * @return the payment transaction details, or <code>null</code> if a payment transaction details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentTransactionDetails fetchByPrimaryKey(
        PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(paymentTransactionDetailsPK);
    }

    /**
    * Returns all the payment transaction detailses.
    *
    * @return the payment transaction detailses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactionDetails> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the payment transaction detailses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment transaction detailses
    * @param end the upper bound of the range of payment transaction detailses (not inclusive)
    * @return the range of payment transaction detailses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactionDetails> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the payment transaction detailses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment transaction detailses
    * @param end the upper bound of the range of payment transaction detailses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of payment transaction detailses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentTransactionDetails> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the payment transaction detailses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of payment transaction detailses.
    *
    * @return the number of payment transaction detailses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PaymentTransactionDetailsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PaymentTransactionDetailsPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    PaymentTransactionDetailsPersistence.class.getName());

            ReferenceRegistry.registerReference(PaymentTransactionDetailsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PaymentTransactionDetailsPersistence persistence) {
    }
}
