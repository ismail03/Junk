package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.BizRuleConfig;

import java.util.List;

/**
 * The persistence utility for the biz rule config service. This utility wraps {@link BizRuleConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BizRuleConfigPersistence
 * @see BizRuleConfigPersistenceImpl
 * @generated
 */
public class BizRuleConfigUtil {
    private static BizRuleConfigPersistence _persistence;

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
    public static void clearCache(BizRuleConfig bizRuleConfig) {
        getPersistence().clearCache(bizRuleConfig);
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
    public static List<BizRuleConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BizRuleConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BizRuleConfig> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BizRuleConfig update(BizRuleConfig bizRuleConfig)
        throws SystemException {
        return getPersistence().update(bizRuleConfig);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BizRuleConfig update(BizRuleConfig bizRuleConfig,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(bizRuleConfig, serviceContext);
    }

    /**
    * Caches the biz rule config in the entity cache if it is enabled.
    *
    * @param bizRuleConfig the biz rule config
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.BizRuleConfig bizRuleConfig) {
        getPersistence().cacheResult(bizRuleConfig);
    }

    /**
    * Caches the biz rule configs in the entity cache if it is enabled.
    *
    * @param bizRuleConfigs the biz rule configs
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.BizRuleConfig> bizRuleConfigs) {
        getPersistence().cacheResult(bizRuleConfigs);
    }

    /**
    * Creates a new biz rule config with the primary key. Does not add the biz rule config to the database.
    *
    * @param bizRuleId the primary key for the new biz rule config
    * @return the new biz rule config
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig create(
        long bizRuleId) {
        return getPersistence().create(bizRuleId);
    }

    /**
    * Removes the biz rule config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bizRuleId the primary key of the biz rule config
    * @return the biz rule config that was removed
    * @throws com.stc.echannels.epayments.NoSuchBizRuleConfigException if a biz rule config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig remove(
        long bizRuleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBizRuleConfigException {
        return getPersistence().remove(bizRuleId);
    }

    public static com.stc.echannels.epayments.model.BizRuleConfig updateImpl(
        com.stc.echannels.epayments.model.BizRuleConfig bizRuleConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bizRuleConfig);
    }

    /**
    * Returns the biz rule config with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBizRuleConfigException} if it could not be found.
    *
    * @param bizRuleId the primary key of the biz rule config
    * @return the biz rule config
    * @throws com.stc.echannels.epayments.NoSuchBizRuleConfigException if a biz rule config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig findByPrimaryKey(
        long bizRuleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBizRuleConfigException {
        return getPersistence().findByPrimaryKey(bizRuleId);
    }

    /**
    * Returns the biz rule config with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bizRuleId the primary key of the biz rule config
    * @return the biz rule config, or <code>null</code> if a biz rule config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig fetchByPrimaryKey(
        long bizRuleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(bizRuleId);
    }

    /**
    * Returns all the biz rule configs.
    *
    * @return the biz rule configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BizRuleConfig> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the biz rule configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BizRuleConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of biz rule configs
    * @param end the upper bound of the range of biz rule configs (not inclusive)
    * @return the range of biz rule configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BizRuleConfig> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the biz rule configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BizRuleConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of biz rule configs
    * @param end the upper bound of the range of biz rule configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of biz rule configs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BizRuleConfig> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the biz rule configs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of biz rule configs.
    *
    * @return the number of biz rule configs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BizRuleConfigPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BizRuleConfigPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    BizRuleConfigPersistence.class.getName());

            ReferenceRegistry.registerReference(BizRuleConfigUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BizRuleConfigPersistence persistence) {
    }
}
