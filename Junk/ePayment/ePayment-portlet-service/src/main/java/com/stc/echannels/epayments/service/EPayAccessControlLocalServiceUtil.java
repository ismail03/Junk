package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EPayAccessControl. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.EPayAccessControlLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see EPayAccessControlLocalService
 * @see com.stc.echannels.epayments.service.base.EPayAccessControlLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.EPayAccessControlLocalServiceImpl
 * @generated
 */
public class EPayAccessControlLocalServiceUtil {
    private static EPayAccessControlLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.EPayAccessControlLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the e pay access control to the database. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl addEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEPayAccessControl(ePayAccessControl);
    }

    /**
    * Creates a new e pay access control with the primary key. Does not add the e pay access control to the database.
    *
    * @param epayCofignId the primary key for the new e pay access control
    * @return the new e pay access control
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl createEPayAccessControl(
        long epayCofignId) {
        return getService().createEPayAccessControl(epayCofignId);
    }

    /**
    * Deletes the e pay access control with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control that was removed
    * @throws PortalException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl deleteEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEPayAccessControl(epayCofignId);
    }

    /**
    * Deletes the e pay access control from the database. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl deleteEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEPayAccessControl(ePayAccessControl);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.EPayAccessControl fetchEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEPayAccessControl(epayCofignId);
    }

    /**
    * Returns the e pay access control with the primary key.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control
    * @throws PortalException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl getEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEPayAccessControl(epayCofignId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the e pay access controls.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @return the range of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> getEPayAccessControls(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEPayAccessControls(start, end);
    }

    /**
    * Returns the number of e pay access controls.
    *
    * @return the number of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public static int getEPayAccessControlsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEPayAccessControlsCount();
    }

    /**
    * Updates the e pay access control in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.EPayAccessControl updateEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEPayAccessControl(ePayAccessControl);
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

    public static java.util.List<com.stc.echannels.epayments.custommodel.AccessControlModel> findActiveEpayAccessControlByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findActiveEpayAccessControlByServiceType(serviceTypeId);
    }

    public static void enableEPayAcessControl(long[] ids,
        com.stc.echannels.epayments.model.EPayAccessControl epac)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().enableEPayAcessControl(ids, epac);
    }

    public static void addEPayAcessControl(
        java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> accessControls)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addEPayAcessControl(accessControls);
    }

    public static boolean isBusinessServiceDisabled(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isBusinessServiceDisabled(serviceId);
    }

    public static boolean isBusinessServiceDownHierarchyDisabled(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isBusinessServiceDownHierarchyDisabled(serviceId);
    }

    public static boolean isCombinationDisabled(long serviceId,
        long serviceTypeId, long channelId, long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .isCombinationDisabled(serviceId, serviceTypeId, channelId,
            pmtMethodId);
    }

    public static java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceidAndStatus(
        long srvid, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByServiceidAndStatus(srvid, status);
    }

    public static void clearService() {
        _service = null;
    }

    public static EPayAccessControlLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EPayAccessControlLocalService.class.getName());

            if (invokableLocalService instanceof EPayAccessControlLocalService) {
                _service = (EPayAccessControlLocalService) invokableLocalService;
            } else {
                _service = new EPayAccessControlLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EPayAccessControlLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EPayAccessControlLocalService service) {
    }
}
