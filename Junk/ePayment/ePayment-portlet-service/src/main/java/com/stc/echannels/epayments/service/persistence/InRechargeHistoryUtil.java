package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.InRechargeHistory;

import java.util.List;

/**
 * The persistence utility for the in recharge history service. This utility wraps {@link InRechargeHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see InRechargeHistoryPersistence
 * @see InRechargeHistoryPersistenceImpl
 * @generated
 */
public class InRechargeHistoryUtil {
    private static InRechargeHistoryPersistence _persistence;

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
    public static void clearCache(InRechargeHistory inRechargeHistory) {
        getPersistence().clearCache(inRechargeHistory);
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
    public static List<InRechargeHistory> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<InRechargeHistory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<InRechargeHistory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static InRechargeHistory update(InRechargeHistory inRechargeHistory)
        throws SystemException {
        return getPersistence().update(inRechargeHistory);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static InRechargeHistory update(
        InRechargeHistory inRechargeHistory, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(inRechargeHistory, serviceContext);
    }

    /**
    * Caches the in recharge history in the entity cache if it is enabled.
    *
    * @param inRechargeHistory the in recharge history
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.InRechargeHistory inRechargeHistory) {
        getPersistence().cacheResult(inRechargeHistory);
    }

    /**
    * Caches the in recharge histories in the entity cache if it is enabled.
    *
    * @param inRechargeHistories the in recharge histories
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.InRechargeHistory> inRechargeHistories) {
        getPersistence().cacheResult(inRechargeHistories);
    }

    /**
    * Creates a new in recharge history with the primary key. Does not add the in recharge history to the database.
    *
    * @param msisdn the primary key for the new in recharge history
    * @return the new in recharge history
    */
    public static com.stc.echannels.epayments.model.InRechargeHistory create(
        java.lang.String msisdn) {
        return getPersistence().create(msisdn);
    }

    /**
    * Removes the in recharge history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param msisdn the primary key of the in recharge history
    * @return the in recharge history that was removed
    * @throws com.stc.echannels.epayments.NoSuchInRechargeHistoryException if a in recharge history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.InRechargeHistory remove(
        java.lang.String msisdn)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchInRechargeHistoryException {
        return getPersistence().remove(msisdn);
    }

    public static com.stc.echannels.epayments.model.InRechargeHistory updateImpl(
        com.stc.echannels.epayments.model.InRechargeHistory inRechargeHistory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(inRechargeHistory);
    }

    /**
    * Returns the in recharge history with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchInRechargeHistoryException} if it could not be found.
    *
    * @param msisdn the primary key of the in recharge history
    * @return the in recharge history
    * @throws com.stc.echannels.epayments.NoSuchInRechargeHistoryException if a in recharge history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.InRechargeHistory findByPrimaryKey(
        java.lang.String msisdn)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchInRechargeHistoryException {
        return getPersistence().findByPrimaryKey(msisdn);
    }

    /**
    * Returns the in recharge history with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param msisdn the primary key of the in recharge history
    * @return the in recharge history, or <code>null</code> if a in recharge history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.InRechargeHistory fetchByPrimaryKey(
        java.lang.String msisdn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(msisdn);
    }

    /**
    * Returns all the in recharge histories.
    *
    * @return the in recharge histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.InRechargeHistory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.InRechargeHistory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.InRechargeHistory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the in recharge histories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of in recharge histories.
    *
    * @return the number of in recharge histories
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static InRechargeHistoryPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (InRechargeHistoryPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    InRechargeHistoryPersistence.class.getName());

            ReferenceRegistry.registerReference(InRechargeHistoryUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(InRechargeHistoryPersistence persistence) {
    }
}
