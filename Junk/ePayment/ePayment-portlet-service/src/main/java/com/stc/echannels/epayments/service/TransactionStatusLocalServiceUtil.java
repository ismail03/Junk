package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TransactionStatus. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.TransactionStatusLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see TransactionStatusLocalService
 * @see com.stc.echannels.epayments.service.base.TransactionStatusLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.TransactionStatusLocalServiceImpl
 * @generated
 */
public class TransactionStatusLocalServiceUtil {
    private static TransactionStatusLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.TransactionStatusLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the transaction status to the database. Also notifies the appropriate model listeners.
    *
    * @param transactionStatus the transaction status
    * @return the transaction status that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.TransactionStatus addTransactionStatus(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addTransactionStatus(transactionStatus);
    }

    /**
    * Creates a new transaction status with the primary key. Does not add the transaction status to the database.
    *
    * @param id the primary key for the new transaction status
    * @return the new transaction status
    */
    public static com.stc.echannels.epayments.model.TransactionStatus createTransactionStatus(
        long id) {
        return getService().createTransactionStatus(id);
    }

    /**
    * Deletes the transaction status with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status that was removed
    * @throws PortalException if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.TransactionStatus deleteTransactionStatus(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTransactionStatus(id);
    }

    /**
    * Deletes the transaction status from the database. Also notifies the appropriate model listeners.
    *
    * @param transactionStatus the transaction status
    * @return the transaction status that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.TransactionStatus deleteTransactionStatus(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTransactionStatus(transactionStatus);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.TransactionStatus fetchTransactionStatus(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchTransactionStatus(id);
    }

    /**
    * Returns the transaction status with the primary key.
    *
    * @param id the primary key of the transaction status
    * @return the transaction status
    * @throws PortalException if a transaction status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.TransactionStatus getTransactionStatus(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getTransactionStatus(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the transaction statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of transaction statuses
    * @param end the upper bound of the range of transaction statuses (not inclusive)
    * @return the range of transaction statuses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.TransactionStatus> getTransactionStatuses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTransactionStatuses(start, end);
    }

    /**
    * Returns the number of transaction statuses.
    *
    * @return the number of transaction statuses
    * @throws SystemException if a system exception occurred
    */
    public static int getTransactionStatusesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTransactionStatusesCount();
    }

    /**
    * Updates the transaction status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param transactionStatus the transaction status
    * @return the transaction status that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.TransactionStatus updateTransactionStatus(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateTransactionStatus(transactionStatus);
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

    public static com.stc.echannels.epayments.model.TransactionStatus addTransactionStatus(
        java.lang.String name, java.lang.String description,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addTransactionStatus(name, description, serviceContext);
    }

    public static java.util.List<com.stc.echannels.epayments.model.TransactionStatus> findAll()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().findAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static TransactionStatusLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TransactionStatusLocalService.class.getName());

            if (invokableLocalService instanceof TransactionStatusLocalService) {
                _service = (TransactionStatusLocalService) invokableLocalService;
            } else {
                _service = new TransactionStatusLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(TransactionStatusLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TransactionStatusLocalService service) {
    }
}
