package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for PaymentChannel. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.PaymentChannelLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelLocalService
 * @see com.stc.echannels.epayments.service.base.PaymentChannelLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.PaymentChannelLocalServiceImpl
 * @generated
 */
public class PaymentChannelLocalServiceUtil {
    private static PaymentChannelLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.PaymentChannelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the payment channel to the database. Also notifies the appropriate model listeners.
    *
    * @param paymentChannel the payment channel
    * @return the payment channel that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel addPaymentChannel(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPaymentChannel(paymentChannel);
    }

    /**
    * Creates a new payment channel with the primary key. Does not add the payment channel to the database.
    *
    * @param transId the primary key for the new payment channel
    * @return the new payment channel
    */
    public static com.stc.echannels.epayments.model.PaymentChannel createPaymentChannel(
        java.lang.String transId) {
        return getService().createPaymentChannel(transId);
    }

    /**
    * Deletes the payment channel with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel that was removed
    * @throws PortalException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel deletePaymentChannel(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePaymentChannel(transId);
    }

    /**
    * Deletes the payment channel from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentChannel the payment channel
    * @return the payment channel that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel deletePaymentChannel(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePaymentChannel(paymentChannel);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.PaymentChannel fetchPaymentChannel(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPaymentChannel(transId);
    }

    /**
    * Returns the payment channel with the primary key.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel
    * @throws PortalException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel getPaymentChannel(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPaymentChannel(transId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the payment channels.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment channels
    * @param end the upper bound of the range of payment channels (not inclusive)
    * @return the range of payment channels
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> getPaymentChannels(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPaymentChannels(start, end);
    }

    /**
    * Returns the number of payment channels.
    *
    * @return the number of payment channels
    * @throws SystemException if a system exception occurred
    */
    public static int getPaymentChannelsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPaymentChannelsCount();
    }

    /**
    * Updates the payment channel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param paymentChannel the payment channel
    * @return the payment channel that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentChannel updatePaymentChannel(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePaymentChannel(paymentChannel);
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

    public static com.stc.echannels.epayments.model.PaymentChannel addPaymentChannel(
        java.lang.String channelType, java.lang.String nameEn,
        java.lang.String nameAr,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addPaymentChannel(channelType, nameEn, nameAr,
            serviceContext);
    }

    public static com.stc.echannels.epayments.model.PaymentChannel updatePaymentChannel(
        java.lang.String transId, java.lang.String nameEn,
        java.lang.String nameAr,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updatePaymentChannel(transId, nameEn, nameAr, serviceContext);
    }

    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> getPaymentChannels()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPaymentChannels();
    }

    public static java.util.List<com.stc.echannels.epayments.model.PaymentChannel> getPaymentChannels(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPaymentChannels(status, start, end);
    }

    public static com.stc.echannels.epayments.model.PaymentChannel deleteChannel(
        java.lang.String transId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteChannel(transId, serviceContext);
    }

    public static void deleteChannels()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteChannels();
    }

    public static com.stc.echannels.epayments.model.PaymentChannel getChannel(
        long channelId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getChannel(channelId);
    }

    public static com.stc.echannels.epayments.model.PaymentChannel getChannelByType(
        java.lang.String channelType)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getChannelByType(channelType);
    }

    public static boolean isPmtchnlTypeExists(java.lang.String channelType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isPmtchnlTypeExists(channelType);
    }

    public static boolean isEnnameExists(java.lang.String nameEn,
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isEnnameExists(nameEn, transId);
    }

    public static boolean isArnameExists(java.lang.String nameAr,
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isArnameExists(nameAr, transId);
    }

    public static void clearService() {
        _service = null;
    }

    public static PaymentChannelLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PaymentChannelLocalService.class.getName());

            if (invokableLocalService instanceof PaymentChannelLocalService) {
                _service = (PaymentChannelLocalService) invokableLocalService;
            } else {
                _service = new PaymentChannelLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PaymentChannelLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PaymentChannelLocalService service) {
    }
}
