package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.SrvTypes;

import java.util.List;

/**
 * The persistence utility for the srv types service. This utility wraps {@link SrvTypesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypesPersistence
 * @see SrvTypesPersistenceImpl
 * @generated
 */
public class SrvTypesUtil {
    private static SrvTypesPersistence _persistence;

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
    public static void clearCache(SrvTypes srvTypes) {
        getPersistence().clearCache(srvTypes);
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
    public static List<SrvTypes> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SrvTypes> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SrvTypes> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SrvTypes update(SrvTypes srvTypes) throws SystemException {
        return getPersistence().update(srvTypes);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SrvTypes update(SrvTypes srvTypes,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(srvTypes, serviceContext);
    }

    /**
    * Caches the srv types in the entity cache if it is enabled.
    *
    * @param srvTypes the srv types
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.SrvTypes srvTypes) {
        getPersistence().cacheResult(srvTypes);
    }

    /**
    * Caches the srv typeses in the entity cache if it is enabled.
    *
    * @param srvTypeses the srv typeses
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.SrvTypes> srvTypeses) {
        getPersistence().cacheResult(srvTypeses);
    }

    /**
    * Creates a new srv types with the primary key. Does not add the srv types to the database.
    *
    * @param serviceTypeId the primary key for the new srv types
    * @return the new srv types
    */
    public static com.stc.echannels.epayments.model.SrvTypes create(
        long serviceTypeId) {
        return getPersistence().create(serviceTypeId);
    }

    /**
    * Removes the srv types with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceTypeId the primary key of the srv types
    * @return the srv types that was removed
    * @throws com.stc.echannels.epayments.NoSuchSrvTypesException if a srv types with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SrvTypes remove(
        long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypesException {
        return getPersistence().remove(serviceTypeId);
    }

    public static com.stc.echannels.epayments.model.SrvTypes updateImpl(
        com.stc.echannels.epayments.model.SrvTypes srvTypes)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(srvTypes);
    }

    /**
    * Returns the srv types with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchSrvTypesException} if it could not be found.
    *
    * @param serviceTypeId the primary key of the srv types
    * @return the srv types
    * @throws com.stc.echannels.epayments.NoSuchSrvTypesException if a srv types with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SrvTypes findByPrimaryKey(
        long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypesException {
        return getPersistence().findByPrimaryKey(serviceTypeId);
    }

    /**
    * Returns the srv types with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param serviceTypeId the primary key of the srv types
    * @return the srv types, or <code>null</code> if a srv types with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SrvTypes fetchByPrimaryKey(
        long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(serviceTypeId);
    }

    /**
    * Returns all the srv typeses.
    *
    * @return the srv typeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SrvTypes> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the srv typeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of srv typeses
    * @param end the upper bound of the range of srv typeses (not inclusive)
    * @return the range of srv typeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SrvTypes> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the srv typeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of srv typeses
    * @param end the upper bound of the range of srv typeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of srv typeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SrvTypes> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the srv typeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of srv typeses.
    *
    * @return the number of srv typeses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SrvTypesPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SrvTypesPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    SrvTypesPersistence.class.getName());

            ReferenceRegistry.registerReference(SrvTypesUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SrvTypesPersistence persistence) {
    }
}
