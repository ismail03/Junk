package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BusinessSrv. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.BusinessSrvLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see BusinessSrvLocalService
 * @see com.stc.echannels.epayments.service.base.BusinessSrvLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.BusinessSrvLocalServiceImpl
 * @generated
 */
public class BusinessSrvLocalServiceUtil {
    private static BusinessSrvLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.BusinessSrvLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the business srv to the database. Also notifies the appropriate model listeners.
    *
    * @param businessSrv the business srv
    * @return the business srv that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BusinessSrv addBusinessSrv(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBusinessSrv(businessSrv);
    }

    /**
    * Creates a new business srv with the primary key. Does not add the business srv to the database.
    *
    * @param serviceId the primary key for the new business srv
    * @return the new business srv
    */
    public static com.stc.echannels.epayments.model.BusinessSrv createBusinessSrv(
        long serviceId) {
        return getService().createBusinessSrv(serviceId);
    }

    /**
    * Deletes the business srv with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceId the primary key of the business srv
    * @return the business srv that was removed
    * @throws PortalException if a business srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BusinessSrv deleteBusinessSrv(
        long serviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBusinessSrv(serviceId);
    }

    /**
    * Deletes the business srv from the database. Also notifies the appropriate model listeners.
    *
    * @param businessSrv the business srv
    * @return the business srv that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BusinessSrv deleteBusinessSrv(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBusinessSrv(businessSrv);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.BusinessSrv fetchBusinessSrv(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBusinessSrv(serviceId);
    }

    /**
    * Returns the business srv with the primary key.
    *
    * @param serviceId the primary key of the business srv
    * @return the business srv
    * @throws PortalException if a business srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BusinessSrv getBusinessSrv(
        long serviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessSrv(serviceId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the business srvs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of business srvs
    * @param end the upper bound of the range of business srvs (not inclusive)
    * @return the range of business srvs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BusinessSrv> getBusinessSrvs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessSrvs(start, end);
    }

    /**
    * Returns the number of business srvs.
    *
    * @return the number of business srvs
    * @throws SystemException if a system exception occurred
    */
    public static int getBusinessSrvsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessSrvsCount();
    }

    /**
    * Updates the business srv in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param businessSrv the business srv
    * @return the business srv that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BusinessSrv updateBusinessSrv(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBusinessSrv(businessSrv);
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

    public static com.stc.echannels.epayments.model.BusinessSrv addBusinessSrv(
        java.lang.String serviceName, java.lang.String nameAr,
        java.lang.String nameEn, long active, java.util.Date effectiveDate,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addBusinessSrv(serviceName, nameAr, nameEn, active,
            effectiveDate, serviceContext);
    }

    public static java.util.List<com.stc.echannels.epayments.model.BusinessSrv> getBusinessServices()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBusinessServices();
    }

    public static java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findBusinessServiceExcludingSADAD()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findBusinessServiceExcludingSADAD();
    }

    public static void clearService() {
        _service = null;
    }

    public static BusinessSrvLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BusinessSrvLocalService.class.getName());

            if (invokableLocalService instanceof BusinessSrvLocalService) {
                _service = (BusinessSrvLocalService) invokableLocalService;
            } else {
                _service = new BusinessSrvLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BusinessSrvLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BusinessSrvLocalService service) {
    }
}
