package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.RefundLog;

import java.util.List;

/**
 * The persistence utility for the refund log service. This utility wraps {@link RefundLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see RefundLogPersistence
 * @see RefundLogPersistenceImpl
 * @generated
 */
public class RefundLogUtil {
    private static RefundLogPersistence _persistence;

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
    public static void clearCache(RefundLog refundLog) {
        getPersistence().clearCache(refundLog);
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
    public static List<RefundLog> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<RefundLog> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<RefundLog> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static RefundLog update(RefundLog refundLog)
        throws SystemException {
        return getPersistence().update(refundLog);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static RefundLog update(RefundLog refundLog,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(refundLog, serviceContext);
    }

    /**
    * Caches the refund log in the entity cache if it is enabled.
    *
    * @param refundLog the refund log
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.RefundLog refundLog) {
        getPersistence().cacheResult(refundLog);
    }

    /**
    * Caches the refund logs in the entity cache if it is enabled.
    *
    * @param refundLogs the refund logs
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.RefundLog> refundLogs) {
        getPersistence().cacheResult(refundLogs);
    }

    /**
    * Creates a new refund log with the primary key. Does not add the refund log to the database.
    *
    * @param epayTransId the primary key for the new refund log
    * @return the new refund log
    */
    public static com.stc.echannels.epayments.model.RefundLog create(
        java.lang.String epayTransId) {
        return getPersistence().create(epayTransId);
    }

    /**
    * Removes the refund log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log that was removed
    * @throws com.stc.echannels.epayments.NoSuchRefundLogException if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundLog remove(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchRefundLogException {
        return getPersistence().remove(epayTransId);
    }

    public static com.stc.echannels.epayments.model.RefundLog updateImpl(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(refundLog);
    }

    /**
    * Returns the refund log with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchRefundLogException} if it could not be found.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log
    * @throws com.stc.echannels.epayments.NoSuchRefundLogException if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundLog findByPrimaryKey(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchRefundLogException {
        return getPersistence().findByPrimaryKey(epayTransId);
    }

    /**
    * Returns the refund log with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log, or <code>null</code> if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundLog fetchByPrimaryKey(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(epayTransId);
    }

    /**
    * Returns all the refund logs.
    *
    * @return the refund logs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.RefundLog> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.RefundLog> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.RefundLog> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the refund logs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of refund logs.
    *
    * @return the number of refund logs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RefundLogPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RefundLogPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    RefundLogPersistence.class.getName());

            ReferenceRegistry.registerReference(RefundLogUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RefundLogPersistence persistence) {
    }
}
