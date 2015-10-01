package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.TransactionStatus;

import java.util.List;

/**
 * The persistence utility for the transaction status service. This utility wraps {@link TransactionStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see TransactionStatusPersistence
 * @see TransactionStatusPersistenceImpl
 * @generated
 */
public class TransactionStatusUtil {
    private static TransactionStatusPersistence _persistence;

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
    public static void clearCache(TransactionStatus transactionStatus) {
        getPersistence().clearCache(transactionStatus);
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
    public static List<TransactionStatus> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<TransactionStatus> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<TransactionStatus> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static TransactionStatus update(TransactionStatus transactionStatus)
        throws SystemException {
        return getPersistence().update(transactionStatus);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static TransactionStatus update(
        TransactionStatus transactionStatus, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(transactionStatus, serviceContext);
    }

    /**
    * Caches the transaction status in the entity cache if it is enabled.
    *
    * @param transactionStatus the transaction status
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus) {
        getPersistence().cacheResult(transactionStatus);
    }

    /**
    * Caches the transaction statuses in the entity cache if it is enabled.
    *
    * @param transactionStatuses the transaction statuses
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.TransactionStatus> transactionStatuses) {
        getPersistence().cacheResult(transactionStatuses);
    }

    /**
    * Creates a new transaction status with the primary key. Does not add the transaction status to the database.
    *
    * @param id the primary key for the new transaction status
    * @return the new transaction status
    */
    public static com.stc.echannels.epayments.model.TransactionStatus create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the transaction status with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status that was removed
    * @throws com.stc.echannels.epayments.NoSuchTransactionStatusException if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.TransactionStatus remove(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchTransactionStatusException {
        return getPersistence().remove(id);
    }

    public static com.stc.echannels.epayments.model.TransactionStatus updateImpl(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(transactionStatus);
    }

    /**
    * Returns the transaction status with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchTransactionStatusException} if it could not be found.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status
    * @throws com.stc.echannels.epayments.NoSuchTransactionStatusException if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.TransactionStatus findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchTransactionStatusException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the transaction status with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status, or <code>null</code> if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.TransactionStatus fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the transaction statuses.
    *
    * @return the transaction statuses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.TransactionStatus> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.TransactionStatus> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.TransactionStatus> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the transaction statuses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of transaction statuses.
    *
    * @return the number of transaction statuses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TransactionStatusPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TransactionStatusPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    TransactionStatusPersistence.class.getName());

            ReferenceRegistry.registerReference(TransactionStatusUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TransactionStatusPersistence persistence) {
    }
}
