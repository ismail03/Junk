package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentMethodLocalService}.
 *
 * @author ahmed_fadlus
 * @see PaymentMethodLocalService
 * @generated
 */
public class PaymentMethodLocalServiceWrapper
    implements PaymentMethodLocalService,
        ServiceWrapper<PaymentMethodLocalService> {
    private PaymentMethodLocalService _paymentMethodLocalService;

    public PaymentMethodLocalServiceWrapper(
        PaymentMethodLocalService paymentMethodLocalService) {
        _paymentMethodLocalService = paymentMethodLocalService;
    }

    /**
    * Adds the payment method to the database. Also notifies the appropriate model listeners.
    *
    * @param paymentMethod the payment method
    * @return the payment method that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentMethod addPaymentMethod(
        com.stc.echannels.epayments.model.PaymentMethod paymentMethod)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.addPaymentMethod(paymentMethod);
    }

    /**
    * Creates a new payment method with the primary key. Does not add the payment method to the database.
    *
    * @param pmtMethodId the primary key for the new payment method
    * @return the new payment method
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentMethod createPaymentMethod(
        long pmtMethodId) {
        return _paymentMethodLocalService.createPaymentMethod(pmtMethodId);
    }

    /**
    * Deletes the payment method with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pmtMethodId the primary key of the payment method
    * @return the payment method that was removed
    * @throws PortalException if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentMethod deletePaymentMethod(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.deletePaymentMethod(pmtMethodId);
    }

    /**
    * Deletes the payment method from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentMethod the payment method
    * @return the payment method that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentMethod deletePaymentMethod(
        com.stc.echannels.epayments.model.PaymentMethod paymentMethod)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.deletePaymentMethod(paymentMethod);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _paymentMethodLocalService.dynamicQuery();
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
        return _paymentMethodLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paymentMethodLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paymentMethodLocalService.dynamicQuery(dynamicQuery, start,
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
        return _paymentMethodLocalService.dynamicQueryCount(dynamicQuery);
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
        return _paymentMethodLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentMethod fetchPaymentMethod(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.fetchPaymentMethod(pmtMethodId);
    }

    /**
    * Returns the payment method with the primary key.
    *
    * @param pmtMethodId the primary key of the payment method
    * @return the payment method
    * @throws PortalException if a payment method with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentMethod getPaymentMethod(
        long pmtMethodId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.getPaymentMethod(pmtMethodId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the payment methods.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment methods
    * @param end the upper bound of the range of payment methods (not inclusive)
    * @return the range of payment methods
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> getPaymentMethods(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.getPaymentMethods(start, end);
    }

    /**
    * Returns the number of payment methods.
    *
    * @return the number of payment methods
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPaymentMethodsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.getPaymentMethodsCount();
    }

    /**
    * Updates the payment method in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param paymentMethod the payment method
    * @return the payment method that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentMethod updatePaymentMethod(
        com.stc.echannels.epayments.model.PaymentMethod paymentMethod)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.updatePaymentMethod(paymentMethod);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentMethodLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentMethodLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentMethodLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentMethod addPaymentMethod(
        java.lang.String descriptiveNameEN, java.lang.String descriptiveNameAR,
        java.lang.String pmtMethodIdType,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.addPaymentMethod(descriptiveNameEN,
            descriptiveNameAR, pmtMethodIdType, serviceContext);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentMethod> findAll()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.findAll();
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentMethod getPaymentMethodByType(
        java.lang.String paymentMethodType)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentMethodLocalService.getPaymentMethodByType(paymentMethodType);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentMethodLocalService getWrappedPaymentMethodLocalService() {
        return _paymentMethodLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentMethodLocalService(
        PaymentMethodLocalService paymentMethodLocalService) {
        _paymentMethodLocalService = paymentMethodLocalService;
    }

    @Override
    public PaymentMethodLocalService getWrappedService() {
        return _paymentMethodLocalService;
    }

    @Override
    public void setWrappedService(
        PaymentMethodLocalService paymentMethodLocalService) {
        _paymentMethodLocalService = paymentMethodLocalService;
    }
}
