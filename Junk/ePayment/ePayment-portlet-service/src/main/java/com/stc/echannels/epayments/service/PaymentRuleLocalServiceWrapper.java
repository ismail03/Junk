package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaymentRuleLocalService}.
 *
 * @author ahmed_fadlus
 * @see PaymentRuleLocalService
 * @generated
 */
public class PaymentRuleLocalServiceWrapper implements PaymentRuleLocalService,
    ServiceWrapper<PaymentRuleLocalService> {
    private PaymentRuleLocalService _paymentRuleLocalService;

    public PaymentRuleLocalServiceWrapper(
        PaymentRuleLocalService paymentRuleLocalService) {
        _paymentRuleLocalService = paymentRuleLocalService;
    }

    /**
    * Adds the payment rule to the database. Also notifies the appropriate model listeners.
    *
    * @param paymentRule the payment rule
    * @return the payment rule that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentRule addPaymentRule(
        com.stc.echannels.epayments.model.PaymentRule paymentRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.addPaymentRule(paymentRule);
    }

    /**
    * Creates a new payment rule with the primary key. Does not add the payment rule to the database.
    *
    * @param paymentRulePK the primary key for the new payment rule
    * @return the new payment rule
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentRule createPaymentRule(
        com.stc.echannels.epayments.service.persistence.PaymentRulePK paymentRulePK) {
        return _paymentRuleLocalService.createPaymentRule(paymentRulePK);
    }

    /**
    * Deletes the payment rule with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentRulePK the primary key of the payment rule
    * @return the payment rule that was removed
    * @throws PortalException if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentRule deletePaymentRule(
        com.stc.echannels.epayments.service.persistence.PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.deletePaymentRule(paymentRulePK);
    }

    /**
    * Deletes the payment rule from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentRule the payment rule
    * @return the payment rule that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentRule deletePaymentRule(
        com.stc.echannels.epayments.model.PaymentRule paymentRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.deletePaymentRule(paymentRule);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _paymentRuleLocalService.dynamicQuery();
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
        return _paymentRuleLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentRuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paymentRuleLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentRuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paymentRuleLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _paymentRuleLocalService.dynamicQueryCount(dynamicQuery);
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
        return _paymentRuleLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentRule fetchPaymentRule(
        com.stc.echannels.epayments.service.persistence.PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.fetchPaymentRule(paymentRulePK);
    }

    /**
    * Returns the payment rule with the primary key.
    *
    * @param paymentRulePK the primary key of the payment rule
    * @return the payment rule
    * @throws PortalException if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentRule getPaymentRule(
        com.stc.echannels.epayments.service.persistence.PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.getPaymentRule(paymentRulePK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the payment rules.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentRuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment rules
    * @param end the upper bound of the range of payment rules (not inclusive)
    * @return the range of payment rules
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.stc.echannels.epayments.model.PaymentRule> getPaymentRules(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.getPaymentRules(start, end);
    }

    /**
    * Returns the number of payment rules.
    *
    * @return the number of payment rules
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPaymentRulesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.getPaymentRulesCount();
    }

    /**
    * Updates the payment rule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param paymentRule the payment rule
    * @return the payment rule that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.PaymentRule updatePaymentRule(
        com.stc.echannels.epayments.model.PaymentRule paymentRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.updatePaymentRule(paymentRule);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paymentRuleLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paymentRuleLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paymentRuleLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.custommodel.PaymentRuleListModel> findActivePaymentRuleByServiceType(
        java.lang.Long serviceTypeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.findActivePaymentRuleByServiceType(serviceTypeId,
            start, end);
    }

    @Override
    public com.stc.echannels.epayments.model.PaymentRule fetchByRuleIdAndTransId(
        long ruleId, java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.fetchByRuleIdAndTransId(ruleId, transId);
    }

    @Override
    public java.lang.Long findCountActivePaymentRuleByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paymentRuleLocalService.findCountActivePaymentRuleByServiceType(serviceTypeId);
    }

    @Override
    public void updatePaymentRuleDefaultValue(java.lang.Long ruleId,
        java.lang.String transId, java.lang.String defaultValue,
        java.lang.String userId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentRuleLocalService.updatePaymentRuleDefaultValue(ruleId, transId,
            defaultValue, userId, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaymentRuleLocalService getWrappedPaymentRuleLocalService() {
        return _paymentRuleLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaymentRuleLocalService(
        PaymentRuleLocalService paymentRuleLocalService) {
        _paymentRuleLocalService = paymentRuleLocalService;
    }

    @Override
    public PaymentRuleLocalService getWrappedService() {
        return _paymentRuleLocalService;
    }

    @Override
    public void setWrappedService(
        PaymentRuleLocalService paymentRuleLocalService) {
        _paymentRuleLocalService = paymentRuleLocalService;
    }
}
