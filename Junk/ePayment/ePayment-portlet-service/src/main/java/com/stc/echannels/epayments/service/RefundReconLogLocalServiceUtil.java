package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for RefundReconLog. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.RefundReconLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see RefundReconLogLocalService
 * @see com.stc.echannels.epayments.service.base.RefundReconLogLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.RefundReconLogLocalServiceImpl
 * @generated
 */
public class RefundReconLogLocalServiceUtil {
    private static RefundReconLogLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.RefundReconLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the refund recon log to the database. Also notifies the appropriate model listeners.
    *
    * @param refundReconLog the refund recon log
    * @return the refund recon log that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundReconLog addRefundReconLog(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRefundReconLog(refundReconLog);
    }

    /**
    * Creates a new refund recon log with the primary key. Does not add the refund recon log to the database.
    *
    * @param batchId the primary key for the new refund recon log
    * @return the new refund recon log
    */
    public static com.stc.echannels.epayments.model.RefundReconLog createRefundReconLog(
        java.lang.String batchId) {
        return getService().createRefundReconLog(batchId);
    }

    /**
    * Deletes the refund recon log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param batchId the primary key of the refund recon log
    * @return the refund recon log that was removed
    * @throws PortalException if a refund recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundReconLog deleteRefundReconLog(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRefundReconLog(batchId);
    }

    /**
    * Deletes the refund recon log from the database. Also notifies the appropriate model listeners.
    *
    * @param refundReconLog the refund recon log
    * @return the refund recon log that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundReconLog deleteRefundReconLog(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRefundReconLog(refundReconLog);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.RefundReconLog fetchRefundReconLog(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRefundReconLog(batchId);
    }

    /**
    * Returns the refund recon log with the primary key.
    *
    * @param batchId the primary key of the refund recon log
    * @return the refund recon log
    * @throws PortalException if a refund recon log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundReconLog getRefundReconLog(
        java.lang.String batchId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRefundReconLog(batchId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the refund recon logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refund recon logs
    * @param end the upper bound of the range of refund recon logs (not inclusive)
    * @return the range of refund recon logs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.RefundReconLog> getRefundReconLogs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRefundReconLogs(start, end);
    }

    /**
    * Returns the number of refund recon logs.
    *
    * @return the number of refund recon logs
    * @throws SystemException if a system exception occurred
    */
    public static int getRefundReconLogsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRefundReconLogsCount();
    }

    /**
    * Updates the refund recon log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param refundReconLog the refund recon log
    * @return the refund recon log that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundReconLog updateRefundReconLog(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRefundReconLog(refundReconLog);
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
        java.lang.String reconciliationDate, java.lang.String pmtBankId,
        java.lang.String reconciliationType, java.util.Locale locale)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findTransactions(serviceId, reconciliationDate, pmtBankId,
            reconciliationType, locale);
    }

    public static void clearService() {
        _service = null;
    }

    public static RefundReconLogLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RefundReconLogLocalService.class.getName());

            if (invokableLocalService instanceof RefundReconLogLocalService) {
                _service = (RefundReconLogLocalService) invokableLocalService;
            } else {
                _service = new RefundReconLogLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RefundReconLogLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RefundReconLogLocalService service) {
    }
}
