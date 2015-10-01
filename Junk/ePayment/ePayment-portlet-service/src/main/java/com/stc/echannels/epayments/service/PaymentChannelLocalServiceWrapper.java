package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentChannelLocalService}.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelLocalService
 * @generated
 */
public class PaymentChannelLocalServiceWrapper
    implements PaymentChannelLocalService,
        ServiceWrapper<PaymentChannelLocalService> {
    private PaymentChannelLocalService _paymentChannelLocalService;

    public PaymentChannelLocalServiceWrapper(
        PaymentChannelLocalService paymentChannelLocalService) {
        _paymentChannelLocalService = paymentChannelLocalService;
    }

    /**
    * Adds the payment channel to the database. Also notifies the appropriate model listeners.
    *
    * @param paymentChannel the payment channel
    * @return the payment channel that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannel addPaymentChannel(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.addPaymentChannel(paymentChannel);
    }

    /**
    * Creates a new payment channel with the primary key. Does not add the payment channel to the database.
    *
    * @param transId the primary key for the new payment channel
    * @return the new payment channel
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannel createPaymentChannel(
        java.lang.String transId) {
        return _paymentChannelLocalService.createPaymentChannel(transId);
    }

    /**
    * Deletes the payment channel with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel that was removed
    * @throws PortalException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannel deletePaymentChannel(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.deletePaymentChannel(transId);
    }

    /**
    * Deletes the payment channel from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentChannel the payment channel
    * @return the payment channel that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannel deletePaymentChannel(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.deletePaymentChannel(paymentChannel);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _paymentChannelLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentChannel fetchPaymentChannel(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.fetchPaymentChannel(transId);
    }

    /**
    * Returns the payment channel with the primary key.
    *
    * @param transId the primary key of the payment channel
    * @return the payment channel
    * @throws PortalException if a payment channel with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannel getPaymentChannel(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.getPaymentChannel(transId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> getPaymentChannels(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.getPaymentChannels(start, end);
    }

    /**
    * Returns the number of payment channels.
    *
    * @return the number of payment channels
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPaymentChannelsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.getPaymentChannelsCount();
    }

    /**
    * Updates the payment channel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param paymentChannel the payment channel
    * @return the payment channel that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannel updatePaymentChannel(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.updatePaymentChannel(paymentChannel);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentChannelLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentChannelLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentChannelLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentChannel addPaymentChannel(
        java.lang.String channelType, java.lang.String nameEn,
        java.lang.String nameAr,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.addPaymentChannel(channelType,
            nameEn, nameAr, serviceContext);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentChannel updatePaymentChannel(
        java.lang.String transId, java.lang.String nameEn,
        java.lang.String nameAr,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.updatePaymentChannel(transId,
            nameEn, nameAr, serviceContext);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> getPaymentChannels()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.getPaymentChannels();
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannel> getPaymentChannels(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.getPaymentChannels(status, start, end);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentChannel deleteChannel(
        java.lang.String transId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.deleteChannel(transId, serviceContext);
    }

    @Override
    public void deleteChannels()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _paymentChannelLocalService.deleteChannels();
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentChannel getChannel(
        long channelId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.getChannel(channelId);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentChannel getChannelByType(
        java.lang.String channelType)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.getChannelByType(channelType);
    }

    @Override
    public boolean isPmtchnlTypeExists(java.lang.String channelType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.isPmtchnlTypeExists(channelType);
    }

    @Override
    public boolean isEnnameExists(java.lang.String nameEn,
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.isEnnameExists(nameEn, transId);
    }

    @Override
    public boolean isArnameExists(java.lang.String nameAr,
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelLocalService.isArnameExists(nameAr, transId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentChannelLocalService getWrappedPaymentChannelLocalService() {
        return _paymentChannelLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentChannelLocalService(
        PaymentChannelLocalService paymentChannelLocalService) {
        _paymentChannelLocalService = paymentChannelLocalService;
    }

    @Override
    public PaymentChannelLocalService getWrappedService() {
        return _paymentChannelLocalService;
    }

    @Override
    public void setWrappedService(
        PaymentChannelLocalService paymentChannelLocalService) {
        _paymentChannelLocalService = paymentChannelLocalService;
    }
}
