package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.SystemConfig;

import java.util.List;

/**
 * The persistence utility for the system config service. This utility wraps {@link SystemConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see SystemConfigPersistence
 * @see SystemConfigPersistenceImpl
 * @generated
 */
public class SystemConfigUtil {
    private static SystemConfigPersistence _persistence;

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
    public static void clearCache(SystemConfig systemConfig) {
        getPersistence().clearCache(systemConfig);
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
    public static List<SystemConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<SystemConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<SystemConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static SystemConfig update(SystemConfig systemConfig)
        throws SystemException {
        return getPersistence().update(systemConfig);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static SystemConfig update(SystemConfig systemConfig,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(systemConfig, serviceContext);
    }

    /**
    * Returns all the system configs where status = &#63;.
    *
    * @param status the status
    * @return the matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

    /**
    * Returns a range of all the system configs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

    /**
    * Returns an ordered range of all the system configs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first system config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first system config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last system config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last system config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the system configs before and after the current system config in the ordered set where status = &#63;.
    *
    * @param transId the primary key of the current system config
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig[] findByStatus_PrevAndNext(
        java.lang.String transId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence()
                   .findByStatus_PrevAndNext(transId, status, orderByComparator);
    }

    /**
    * Removes all the system configs where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of system configs where status = &#63;.
    *
    * @param status the status
    * @return the number of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Returns all the system configs where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByServiceId(
        long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId, status);
    }

    /**
    * Returns a range of all the system configs where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByServiceId(
        long serviceId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByServiceId(serviceId, status, start, end);
    }

    /**
    * Returns an ordered range of all the system configs where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByServiceId(
        long serviceId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByServiceId(serviceId, status, start, end,
            orderByComparator);
    }

    /**
    * Returns the first system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig findByServiceId_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence()
                   .findByServiceId_First(serviceId, status, orderByComparator);
    }

    /**
    * Returns the first system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig fetchByServiceId_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_First(serviceId, status, orderByComparator);
    }

    /**
    * Returns the last system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig findByServiceId_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence()
                   .findByServiceId_Last(serviceId, status, orderByComparator);
    }

    /**
    * Returns the last system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig fetchByServiceId_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByServiceId_Last(serviceId, status, orderByComparator);
    }

    /**
    * Returns the system configs before and after the current system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current system config
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig[] findByServiceId_PrevAndNext(
        java.lang.String transId, long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence()
                   .findByServiceId_PrevAndNext(transId, serviceId, status,
            orderByComparator);
    }

    /**
    * Removes all the system configs where serviceId = &#63; and status = &#63; from the database.
    *
    * @param serviceId the service ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByServiceId(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByServiceId(serviceId, status);
    }

    /**
    * Returns the number of system configs where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the number of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static int countByServiceId(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByServiceId(serviceId, status);
    }

    /**
    * Returns all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @return the matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByBankId(
        long serviceId, java.lang.String bankId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(serviceId, bankId, status);
    }

    /**
    * Returns a range of all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByBankId(
        long serviceId, java.lang.String bankId, java.lang.String status,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankId(serviceId, bankId, status, start, end);
    }

    /**
    * Returns an ordered range of all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByBankId(
        long serviceId, java.lang.String bankId, java.lang.String status,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankId(serviceId, bankId, status, start, end,
            orderByComparator);
    }

    /**
    * Returns the first system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig findByBankId_First(
        long serviceId, java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence()
                   .findByBankId_First(serviceId, bankId, status,
            orderByComparator);
    }

    /**
    * Returns the first system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig fetchByBankId_First(
        long serviceId, java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBankId_First(serviceId, bankId, status,
            orderByComparator);
    }

    /**
    * Returns the last system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig findByBankId_Last(
        long serviceId, java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence()
                   .findByBankId_Last(serviceId, bankId, status,
            orderByComparator);
    }

    /**
    * Returns the last system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig fetchByBankId_Last(
        long serviceId, java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBankId_Last(serviceId, bankId, status,
            orderByComparator);
    }

    /**
    * Returns the system configs before and after the current system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current system config
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig[] findByBankId_PrevAndNext(
        java.lang.String transId, long serviceId, java.lang.String bankId,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence()
                   .findByBankId_PrevAndNext(transId, serviceId, bankId,
            status, orderByComparator);
    }

    /**
    * Removes all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63; from the database.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBankId(long serviceId, java.lang.String bankId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBankId(serviceId, bankId, status);
    }

    /**
    * Returns the number of system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @return the number of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public static int countByBankId(long serviceId, java.lang.String bankId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBankId(serviceId, bankId, status);
    }

    /**
    * Caches the system config in the entity cache if it is enabled.
    *
    * @param systemConfig the system config
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.SystemConfig systemConfig) {
        getPersistence().cacheResult(systemConfig);
    }

    /**
    * Caches the system configs in the entity cache if it is enabled.
    *
    * @param systemConfigs the system configs
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.SystemConfig> systemConfigs) {
        getPersistence().cacheResult(systemConfigs);
    }

    /**
    * Creates a new system config with the primary key. Does not add the system config to the database.
    *
    * @param transId the primary key for the new system config
    * @return the new system config
    */
    public static com.stc.echannels.epayments.model.SystemConfig create(
        java.lang.String transId) {
        return getPersistence().create(transId);
    }

    /**
    * Removes the system config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the system config
    * @return the system config that was removed
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence().remove(transId);
    }

    public static com.stc.echannels.epayments.model.SystemConfig updateImpl(
        com.stc.echannels.epayments.model.SystemConfig systemConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(systemConfig);
    }

    /**
    * Returns the system config with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchSystemConfigException} if it could not be found.
    *
    * @param transId the primary key of the system config
    * @return the system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException {
        return getPersistence().findByPrimaryKey(transId);
    }

    /**
    * Returns the system config with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the system config
    * @return the system config, or <code>null</code> if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.SystemConfig fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(transId);
    }

    /**
    * Returns all the system configs.
    *
    * @return the system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the system configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the system configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of system configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.SystemConfig> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the system configs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of system configs.
    *
    * @return the number of system configs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SystemConfigPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SystemConfigPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    SystemConfigPersistence.class.getName());

            ReferenceRegistry.registerReference(SystemConfigUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SystemConfigPersistence persistence) {
    }
}
