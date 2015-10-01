package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for RefundLog. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.RefundLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see RefundLogLocalService
 * @see com.stc.echannels.epayments.service.base.RefundLogLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.RefundLogLocalServiceImpl
 * @generated
 */
public class RefundLogLocalServiceUtil {
    private static RefundLogLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.RefundLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the refund log to the database. Also notifies the appropriate model listeners.
    *
    * @param refundLog the refund log
    * @return the refund log that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundLog addRefundLog(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRefundLog(refundLog);
    }

    /**
    * Creates a new refund log with the primary key. Does not add the refund log to the database.
    *
    * @param epayTransId the primary key for the new refund log
    * @return the new refund log
    */
    public static com.stc.echannels.epayments.model.RefundLog createRefundLog(
        java.lang.String epayTransId) {
        return getService().createRefundLog(epayTransId);
    }

    /**
    * Deletes the refund log with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log that was removed
    * @throws PortalException if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundLog deleteRefundLog(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRefundLog(epayTransId);
    }

    /**
    * Deletes the refund log from the database. Also notifies the appropriate model listeners.
    *
    * @param refundLog the refund log
    * @return the refund log that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundLog deleteRefundLog(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRefundLog(refundLog);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.RefundLog fetchRefundLog(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRefundLog(epayTransId);
    }

    /**
    * Returns the refund log with the primary key.
    *
    * @param epayTransId the primary key of the refund log
    * @return the refund log
    * @throws PortalException if a refund log with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundLog getRefundLog(
        java.lang.String epayTransId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRefundLog(epayTransId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the refund logs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of refund logs
    * @param end the upper bound of the range of refund logs (not inclusive)
    * @return the range of refund logs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.RefundLog> getRefundLogs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRefundLogs(start, end);
    }

    /**
    * Returns the number of refund logs.
    *
    * @return the number of refund logs
    * @throws SystemException if a system exception occurred
    */
    public static int getRefundLogsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRefundLogsCount();
    }

    /**
    * Updates the refund log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param refundLog the refund log
    * @return the refund log that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.RefundLog updateRefundLog(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRefundLog(refundLog);
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
        java.lang.String transAmount, java.lang.String dateFrom,
        java.lang.String dateTo, java.lang.String paymentChannel,
        java.lang.String paymentMethod, java.lang.String pmtBankId,
        java.lang.String beneficiaryId, java.lang.String beneficiaryServiceNo,
        java.lang.String refundStatus, java.util.Locale locale)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findTransactions(serviceId, transAmount, dateFrom, dateTo,
            paymentChannel, paymentMethod, pmtBankId, beneficiaryId,
            beneficiaryServiceNo, refundStatus, locale);
    }

    public static java.util.List<java.lang.String> getRefundStatuses() {
        return getService().getRefundStatuses();
    }

    public static void clearService() {
        _service = null;
    }

    public static RefundLogLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RefundLogLocalService.class.getName());

            if (invokableLocalService instanceof RefundLogLocalService) {
                _service = (RefundLogLocalService) invokableLocalService;
            } else {
                _service = new RefundLogLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RefundLogLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RefundLogLocalService service) {
    }
}
