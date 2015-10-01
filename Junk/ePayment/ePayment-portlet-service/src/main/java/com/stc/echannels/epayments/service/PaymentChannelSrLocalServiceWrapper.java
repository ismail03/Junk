package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentChannelSrLocalService}.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrLocalService
 * @generated
 */
public class PaymentChannelSrLocalServiceWrapper
    implements PaymentChannelSrLocalService,
        ServiceWrapper<PaymentChannelSrLocalService> {
    private PaymentChannelSrLocalService _paymentChannelSrLocalService;

    public PaymentChannelSrLocalServiceWrapper(
        PaymentChannelSrLocalService paymentChannelSrLocalService) {
        _paymentChannelSrLocalService = paymentChannelSrLocalService;
    }

    /**
    * Adds the payment channel sr to the database. Also notifies the appropriate model listeners.
    *
    * @param paymentChannelSr the payment channel sr
    * @return the payment channel sr that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannelSr addPaymentChannelSr(
        com.stc.echannels.epayments.model.PaymentChannelSr paymentChannelSr)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.addPaymentChannelSr(paymentChannelSr);
    }

    /**
    * Creates a new payment channel sr with the primary key. Does not add the payment channel sr to the database.
    *
    * @param id the primary key for the new payment channel sr
    * @return the new payment channel sr
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannelSr createPaymentChannelSr(
        java.lang.String id) {
        return _paymentChannelSrLocalService.createPaymentChannelSr(id);
    }

    /**
    * Deletes the payment channel sr with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the payment channel sr
    * @return the payment channel sr that was removed
    * @throws PortalException if a payment channel sr with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannelSr deletePaymentChannelSr(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.deletePaymentChannelSr(id);
    }

    /**
    * Deletes the payment channel sr from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentChannelSr the payment channel sr
    * @return the payment channel sr that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannelSr deletePaymentChannelSr(
        com.stc.echannels.epayments.model.PaymentChannelSr paymentChannelSr)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.deletePaymentChannelSr(paymentChannelSr);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _paymentChannelSrLocalService.dynamicQuery();
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
        return _paymentChannelSrLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paymentChannelSrLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paymentChannelSrLocalService.dynamicQuery(dynamicQuery, start,
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
        return _paymentChannelSrLocalService.dynamicQueryCount(dynamicQuery);
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
        return _paymentChannelSrLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentChannelSr fetchPaymentChannelSr(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.fetchPaymentChannelSr(id);
    }

    /**
    * Returns the payment channel sr with the primary key.
    *
    * @param id the primary key of the payment channel sr
    * @return the payment channel sr
    * @throws PortalException if a payment channel sr with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannelSr getPaymentChannelSr(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.getPaymentChannelSr(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the payment channel srs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment channel srs
    * @param end the upper bound of the range of payment channel srs (not inclusive)
    * @return the range of payment channel srs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> getPaymentChannelSrs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.getPaymentChannelSrs(start, end);
    }

    /**
    * Returns the number of payment channel srs.
    *
    * @return the number of payment channel srs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPaymentChannelSrsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.getPaymentChannelSrsCount();
    }

    /**
    * Updates the payment channel sr in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param paymentChannelSr the payment channel sr
    * @return the payment channel sr that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentChannelSr updatePaymentChannelSr(
        com.stc.echannels.epayments.model.PaymentChannelSr paymentChannelSr)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.updatePaymentChannelSr(paymentChannelSr);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentChannelSrLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentChannelSrLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentChannelSrLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> getPaymentChannelsAssociatedWithBuisnessServices(
        java.lang.String servceid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.getPaymentChannelsAssociatedWithBuisnessServices(servceid);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentChannelSr> getBusinessServiceAssociatedWithPmtChannel(
        java.lang.String channelid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentChannelSrLocalService.getBusinessServiceAssociatedWithPmtChannel(channelid);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentChannelSrLocalService getWrappedPaymentChannelSrLocalService() {
        return _paymentChannelSrLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentChannelSrLocalService(
        PaymentChannelSrLocalService paymentChannelSrLocalService) {
        _paymentChannelSrLocalService = paymentChannelSrLocalService;
    }

    @Override
    public PaymentChannelSrLocalService getWrappedService() {
        return _paymentChannelSrLocalService;
    }

    @Override
    public void setWrappedService(
        PaymentChannelSrLocalService paymentChannelSrLocalService) {
        _paymentChannelSrLocalService = paymentChannelSrLocalService;
    }
}
