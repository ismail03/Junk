package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.ReconLog;

import java.util.List;

/**
 * The persistence utility for the recon log service. This utility wraps {@link ReconLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see ReconLogPersistence
 * @see ReconLogPersistenceImpl
 * @generated
 */
public class ReconLogUtil {
    private static ReconLogPersistence _persistence;

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
    public static void clearCache(ReconLog reconLog) {
        getPersistence().clearCache(reconLog);
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
    public static List<ReconLog> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<ReconLog> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<ReconLog> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static ReconLog update(ReconLog reconLog) throws SystemException {
        return getPersistence().update(reconLog);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static ReconLog update(ReconLog reconLog,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(reconLog, serviceContext);
    }

    /**
    * Caches the recon log in the entity cache if it is enabled.
    *
    * @param reconLog the recon log
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.ReconLog reconLog) {
        getPersistence().cacheResult(reconLog);
    }

    /**
    * Caches the recon logs in the entity cache if it is enabled.
    *
    * @param reconLogs the recon logs
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.ReconLog> reconLogs) {
        getPersistence().cacheResult(reconLogs);
    }

    /**
    * Creates a new recon log with the primary key. Does not add the recon log to the database.
    *
    * @param paymentSystemTransId the primary key for the new recon log
    * @return the new recon log
    */
    public static com.stc.echannels.epayments.model.ReconLog create(
        java.lang.String paymentSystemTransId) {
        return getPersistence().create(paymentSystemTransId);
    }

    /**
    * Removes the recon log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log that was removed
    * @throws com.stc.echannels.epayments.NoSuchReconLogException if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.ReconLog remove(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchReconLogException {
        return getPersistence().remove(paymentSystemTransId);
    }

    public static com.stc.echannels.epayments.model.ReconLog updateImpl(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(reconLog);
    }

    /**
    * Returns the recon log with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchReconLogException} if it could not be found.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log
    * @throws com.stc.echannels.epayments.NoSuchReconLogException if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.ReconLog findByPrimaryKey(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchReconLogException {
        return getPersistence().findByPrimaryKey(paymentSystemTransId);
    }

    /**
    * Returns the recon log with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log, or <code>null</code> if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.ReconLog fetchByPrimaryKey(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(paymentSystemTransId);
    }

    /**
    * Returns all the recon logs.
    *
    * @return the recon logs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.ReconLog> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.ReconLog> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.ReconLog> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the recon logs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of recon logs.
    *
    * @return the number of recon logs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ReconLogPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ReconLogPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    ReconLogPersistence.class.getName());

            ReferenceRegistry.registerReference(ReconLogUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ReconLogPersistence persistence) {
    }
}
