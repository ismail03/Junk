package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BizRuleConfig. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.BizRuleConfigLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see BizRuleConfigLocalService
 * @see com.stc.echannels.epayments.service.base.BizRuleConfigLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.BizRuleConfigLocalServiceImpl
 * @generated
 */
public class BizRuleConfigLocalServiceUtil {
    private static BizRuleConfigLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.BizRuleConfigLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the biz rule config to the database. Also notifies the appropriate model listeners.
    *
    * @param bizRuleConfig the biz rule config
    * @return the biz rule config that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig addBizRuleConfig(
        com.stc.echannels.epayments.model.BizRuleConfig bizRuleConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBizRuleConfig(bizRuleConfig);
    }

    /**
    * Creates a new biz rule config with the primary key. Does not add the biz rule config to the database.
    *
    * @param bizRuleId the primary key for the new biz rule config
    * @return the new biz rule config
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig createBizRuleConfig(
        long bizRuleId) {
        return getService().createBizRuleConfig(bizRuleId);
    }

    /**
    * Deletes the biz rule config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bizRuleId the primary key of the biz rule config
    * @return the biz rule config that was removed
    * @throws PortalException if a biz rule config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig deleteBizRuleConfig(
        long bizRuleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBizRuleConfig(bizRuleId);
    }

    /**
    * Deletes the biz rule config from the database. Also notifies the appropriate model listeners.
    *
    * @param bizRuleConfig the biz rule config
    * @return the biz rule config that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig deleteBizRuleConfig(
        com.stc.echannels.epayments.model.BizRuleConfig bizRuleConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBizRuleConfig(bizRuleConfig);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BizRuleConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BizRuleConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.stc.echannels.epayments.model.BizRuleConfig fetchBizRuleConfig(
        long bizRuleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBizRuleConfig(bizRuleId);
    }

    /**
    * Returns the biz rule config with the primary key.
    *
    * @param bizRuleId the primary key of the biz rule config
    * @return the biz rule config
    * @throws PortalException if a biz rule config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig getBizRuleConfig(
        long bizRuleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBizRuleConfig(bizRuleId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.stc.echannels.epayments.model.BizRuleConfig> getBizRuleConfigs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBizRuleConfigs(start, end);
    }

    /**
    * Returns the number of biz rule configs.
    *
    * @return the number of biz rule configs
    * @throws SystemException if a system exception occurred
    */
    public static int getBizRuleConfigsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBizRuleConfigsCount();
    }

    /**
    * Updates the biz rule config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bizRuleConfig the biz rule config
    * @return the biz rule config that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BizRuleConfig updateBizRuleConfig(
        com.stc.echannels.epayments.model.BizRuleConfig bizRuleConfig)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBizRuleConfig(bizRuleConfig);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<com.stc.echannels.epayments.custommodel.BizRuleConfigModel> findActiveBizRuleByServiceType(
        java.lang.Long serviceTypeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findActiveBizRuleByServiceType(serviceTypeId, start, end);
    }

    public static void updateBizRuleConfigToInActive(long[] recordIds,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().updateBizRuleConfigToInActive(recordIds, serviceContext);
    }

    public static java.lang.Long findCountBizRuleByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findCountBizRuleByServiceType(serviceTypeId);
    }

    public static boolean isBizRuleConfigCombinationAlreadyAdded(
        long serviceId, long channelId, long pmtMethodId, long ruleId) {
        return getService()
                   .isBizRuleConfigCombinationAlreadyAdded(serviceId,
            channelId, pmtMethodId, ruleId);
    }

    public static void addBizRuleConfig(
        java.util.List<com.stc.echannels.epayments.model.BizRuleConfig> bizRuleConfigs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addBizRuleConfig(bizRuleConfigs);
    }

    public static void clearService() {
        _service = null;
    }

    public static BizRuleConfigLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BizRuleConfigLocalService.class.getName());

            if (invokableLocalService instanceof BizRuleConfigLocalService) {
                _service = (BizRuleConfigLocalService) invokableLocalService;
            } else {
                _service = new BizRuleConfigLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BizRuleConfigLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BizRuleConfigLocalService service) {
    }
}
