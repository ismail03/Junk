package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ReconLog. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.ReconLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see ReconLogLocalService
 * @see com.stc.echannels.epayments.service.base.ReconLogLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.ReconLogLocalServiceImpl
 * @generated
 */
public class ReconLogLocalServiceUtil {
    private static ReconLogLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.ReconLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the recon log to the database. Also notifies the appropriate model listeners.
    *
    * @param reconLog the recon log
    * @return the recon log that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.ReconLog addReconLog(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addReconLog(reconLog);
    }

    /**
    * Creates a new recon log with the primary key. Does not add the recon log to the database.
    *
    * @param paymentSystemTransId the primary key for the new recon log
    * @return the new recon log
    */
    public static com.stc.echannels.epayments.model.ReconLog createReconLog(
        java.lang.String paymentSystemTransId) {
        return getService().createReconLog(paymentSystemTransId);
    }

    /**
    * Deletes the recon log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log that was removed
    * @throws PortalException if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.ReconLog deleteReconLog(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteReconLog(paymentSystemTransId);
    }

    /**
    * Deletes the recon log from the database. Also notifies the appropriate model listeners.
    *
    * @param reconLog the recon log
    * @return the recon log that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.ReconLog deleteReconLog(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteReconLog(reconLog);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.ReconLog fetchReconLog(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchReconLog(paymentSystemTransId);
    }

    /**
    * Returns the recon log with the primary key.
    *
    * @param paymentSystemTransId the primary key of the recon log
    * @return the recon log
    * @throws PortalException if a recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.ReconLog getReconLog(
        java.lang.String paymentSystemTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getReconLog(paymentSystemTransId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.stc.echannels.epayments.model.ReconLog> getReconLogs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getReconLogs(start, end);
    }

    /**
    * Returns the number of recon logs.
    *
    * @return the number of recon logs
    * @throws SystemException if a system exception occurred
    */
    public static int getReconLogsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getReconLogsCount();
    }

    /**
    * Updates the recon log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param reconLog the recon log
    * @return the recon log that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.ReconLog updateReconLog(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateReconLog(reconLog);
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

    public static java.util.List findTransactions(java.lang.String serviceId,
        java.lang.String date, java.lang.String paymentStatus,
        java.lang.String pmtBankId, java.util.Locale locale)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findTransactions(serviceId, date, paymentStatus, pmtBankId,
            locale);
    }

    public static void clearService() {
        _service = null;
    }

    public static ReconLogLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ReconLogLocalService.class.getName());

            if (invokableLocalService instanceof ReconLogLocalService) {
                _service = (ReconLogLocalService) invokableLocalService;
            } else {
                _service = new ReconLogLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(ReconLogLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ReconLogLocalService service) {
    }
}
