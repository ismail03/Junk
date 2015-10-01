package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.PaymentRule;

/**
 * The persistence interface for the payment rule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentRulePersistenceImpl
 * @see PaymentRuleUtil
 * @generated
 */
public interface PaymentRulePersistence extends BasePersistence<PaymentRule> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaymentRuleUtil} to access the payment rule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the payment rules where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @return the matching payment rules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentRule> findByRuleCategoryAndStatus(
        java.lang.String ruleCategory, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment rules where ruleCategory = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentRuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @param start the lower bound of the range of payment rules
    * @param end the upper bound of the range of payment rules (not inclusive)
    * @return the range of matching payment rules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentRule> findByRuleCategoryAndStatus(
        java.lang.String ruleCategory, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment rules where ruleCategory = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentRuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @param start the lower bound of the range of payment rules
    * @param end the upper bound of the range of payment rules (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching payment rules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentRule> findByRuleCategoryAndStatus(
        java.lang.String ruleCategory, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first payment rule in the ordered set where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment rule
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule findByRuleCategoryAndStatus_First(
        java.lang.String ruleCategory, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException;

    /**
    * Returns the first payment rule in the ordered set where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment rule, or <code>null</code> if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule fetchByRuleCategoryAndStatus_First(
        java.lang.String ruleCategory, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last payment rule in the ordered set where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment rule
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule findByRuleCategoryAndStatus_Last(
        java.lang.String ruleCategory, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException;

    /**
    * Returns the last payment rule in the ordered set where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment rule, or <code>null</code> if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule fetchByRuleCategoryAndStatus_Last(
        java.lang.String ruleCategory, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment rules before and after the current payment rule in the ordered set where ruleCategory = &#63; and status = &#63;.
    *
    * @param paymentRulePK the primary key of the current payment rule
    * @param ruleCategory the rule category
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next payment rule
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule[] findByRuleCategoryAndStatus_PrevAndNext(
        PaymentRulePK paymentRulePK, java.lang.String ruleCategory,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException;

    /**
    * Removes all the payment rules where ruleCategory = &#63; and status = &#63; from the database.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByRuleCategoryAndStatus(java.lang.String ruleCategory,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment rules where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @return the number of matching payment rules
    * @throws SystemException if a system exception occurred
    */
    public int countByRuleCategoryAndStatus(java.lang.String ruleCategory,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment rule where ruleId = &#63; and transId = &#63; or throws a {@link com.stc.echannels.epayments.NoSuchPaymentRuleException} if it could not be found.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @return the matching payment rule
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule findByRuleIdAndTransId(
        long ruleId, java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException;

    /**
    * Returns the payment rule where ruleId = &#63; and transId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @return the matching payment rule, or <code>null</code> if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule fetchByRuleIdAndTransId(
        long ruleId, java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment rule where ruleId = &#63; and transId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching payment rule, or <code>null</code> if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule fetchByRuleIdAndTransId(
        long ruleId, java.lang.String transId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the payment rule where ruleId = &#63; and transId = &#63; from the database.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @return the payment rule that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule removeByRuleIdAndTransId(
        long ruleId, java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException;

    /**
    * Returns the number of payment rules where ruleId = &#63; and transId = &#63;.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @return the number of matching payment rules
    * @throws SystemException if a system exception occurred
    */
    public int countByRuleIdAndTransId(long ruleId, java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the payment rule in the entity cache if it is enabled.
    *
    * @param paymentRule the payment rule
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.PaymentRule paymentRule);

    /**
    * Caches the payment rules in the entity cache if it is enabled.
    *
    * @param paymentRules the payment rules
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentRule> paymentRules);

    /**
    * Creates a new payment rule with the primary key. Does not add the payment rule to the database.
    *
    * @param paymentRulePK the primary key for the new payment rule
    * @return the new payment rule
    */
    public com.stc.echannels.epayments.model.PaymentRule create(
        PaymentRulePK paymentRulePK);

    /**
    * Removes the payment rule with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentRulePK the primary key of the payment rule
    * @return the payment rule that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule remove(
        PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException;

    public com.stc.echannels.epayments.model.PaymentRule updateImpl(
        com.stc.echannels.epayments.model.PaymentRule paymentRule)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment rule with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentRuleException} if it could not be found.
    *
    * @param paymentRulePK the primary key of the payment rule
    * @return the payment rule
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule findByPrimaryKey(
        PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException;

    /**
    * Returns the payment rule with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param paymentRulePK the primary key of the payment rule
    * @return the payment rule, or <code>null</code> if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentRule fetchByPrimaryKey(
        PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the payment rules.
    *
    * @return the payment rules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentRule> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.PaymentRule> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the payment rules.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentRuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment rules
    * @param end the upper bound of the range of payment rules (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of payment rules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.PaymentRule> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the payment rules from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment rules.
    *
    * @return the number of payment rules
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
