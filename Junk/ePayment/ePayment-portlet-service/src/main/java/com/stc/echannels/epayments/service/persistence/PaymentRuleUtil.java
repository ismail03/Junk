package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.PaymentRule;

import java.util.List;

/**
 * The persistence utility for the payment rule service. This utility wraps {@link PaymentRulePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentRulePersistence
 * @see PaymentRulePersistenceImpl
 * @generated
 */
public class PaymentRuleUtil {
    private static PaymentRulePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(PaymentRule paymentRule) {
        getPersistence().clearCache(paymentRule);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<PaymentRule> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PaymentRule> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PaymentRule> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PaymentRule update(PaymentRule paymentRule)
        throws SystemException {
        return getPersistence().update(paymentRule);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PaymentRule update(PaymentRule paymentRule,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(paymentRule, serviceContext);
    }

    /**
    * Returns all the payment rules where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @return the matching payment rules
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentRule> findByRuleCategoryAndStatus(
        java.lang.String ruleCategory, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRuleCategoryAndStatus(ruleCategory, status);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentRule> findByRuleCategoryAndStatus(
        java.lang.String ruleCategory, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRuleCategoryAndStatus(ruleCategory, status, start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentRule> findByRuleCategoryAndStatus(
        java.lang.String ruleCategory, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRuleCategoryAndStatus(ruleCategory, status, start,
            end, orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentRule findByRuleCategoryAndStatus_First(
        java.lang.String ruleCategory, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException {
        return getPersistence()
                   .findByRuleCategoryAndStatus_First(ruleCategory, status,
            orderByComparator);
    }

    /**
    * Returns the first payment rule in the ordered set where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching payment rule, or <code>null</code> if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule fetchByRuleCategoryAndStatus_First(
        java.lang.String ruleCategory, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRuleCategoryAndStatus_First(ruleCategory, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentRule findByRuleCategoryAndStatus_Last(
        java.lang.String ruleCategory, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException {
        return getPersistence()
                   .findByRuleCategoryAndStatus_Last(ruleCategory, status,
            orderByComparator);
    }

    /**
    * Returns the last payment rule in the ordered set where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching payment rule, or <code>null</code> if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule fetchByRuleCategoryAndStatus_Last(
        java.lang.String ruleCategory, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRuleCategoryAndStatus_Last(ruleCategory, status,
            orderByComparator);
    }

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
    public static com.stc.echannels.epayments.model.PaymentRule[] findByRuleCategoryAndStatus_PrevAndNext(
        PaymentRulePK paymentRulePK, java.lang.String ruleCategory,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException {
        return getPersistence()
                   .findByRuleCategoryAndStatus_PrevAndNext(paymentRulePK,
            ruleCategory, status, orderByComparator);
    }

    /**
    * Removes all the payment rules where ruleCategory = &#63; and status = &#63; from the database.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRuleCategoryAndStatus(
        java.lang.String ruleCategory, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRuleCategoryAndStatus(ruleCategory, status);
    }

    /**
    * Returns the number of payment rules where ruleCategory = &#63; and status = &#63;.
    *
    * @param ruleCategory the rule category
    * @param status the status
    * @return the number of matching payment rules
    * @throws SystemException if a system exception occurred
    */
    public static int countByRuleCategoryAndStatus(
        java.lang.String ruleCategory, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByRuleCategoryAndStatus(ruleCategory, status);
    }

    /**
    * Returns the payment rule where ruleId = &#63; and transId = &#63; or throws a {@link com.stc.echannels.epayments.NoSuchPaymentRuleException} if it could not be found.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @return the matching payment rule
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule findByRuleIdAndTransId(
        long ruleId, java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException {
        return getPersistence().findByRuleIdAndTransId(ruleId, transId);
    }

    /**
    * Returns the payment rule where ruleId = &#63; and transId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @return the matching payment rule, or <code>null</code> if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule fetchByRuleIdAndTransId(
        long ruleId, java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByRuleIdAndTransId(ruleId, transId);
    }

    /**
    * Returns the payment rule where ruleId = &#63; and transId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching payment rule, or <code>null</code> if a matching payment rule could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule fetchByRuleIdAndTransId(
        long ruleId, java.lang.String transId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRuleIdAndTransId(ruleId, transId, retrieveFromCache);
    }

    /**
    * Removes the payment rule where ruleId = &#63; and transId = &#63; from the database.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @return the payment rule that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule removeByRuleIdAndTransId(
        long ruleId, java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException {
        return getPersistence().removeByRuleIdAndTransId(ruleId, transId);
    }

    /**
    * Returns the number of payment rules where ruleId = &#63; and transId = &#63;.
    *
    * @param ruleId the rule ID
    * @param transId the trans ID
    * @return the number of matching payment rules
    * @throws SystemException if a system exception occurred
    */
    public static int countByRuleIdAndTransId(long ruleId,
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRuleIdAndTransId(ruleId, transId);
    }

    /**
    * Caches the payment rule in the entity cache if it is enabled.
    *
    * @param paymentRule the payment rule
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.PaymentRule paymentRule) {
        getPersistence().cacheResult(paymentRule);
    }

    /**
    * Caches the payment rules in the entity cache if it is enabled.
    *
    * @param paymentRules the payment rules
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.PaymentRule> paymentRules) {
        getPersistence().cacheResult(paymentRules);
    }

    /**
    * Creates a new payment rule with the primary key. Does not add the payment rule to the database.
    *
    * @param paymentRulePK the primary key for the new payment rule
    * @return the new payment rule
    */
    public static com.stc.echannels.epayments.model.PaymentRule create(
        PaymentRulePK paymentRulePK) {
        return getPersistence().create(paymentRulePK);
    }

    /**
    * Removes the payment rule with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentRulePK the primary key of the payment rule
    * @return the payment rule that was removed
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule remove(
        PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException {
        return getPersistence().remove(paymentRulePK);
    }

    public static com.stc.echannels.epayments.model.PaymentRule updateImpl(
        com.stc.echannels.epayments.model.PaymentRule paymentRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(paymentRule);
    }

    /**
    * Returns the payment rule with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentRuleException} if it could not be found.
    *
    * @param paymentRulePK the primary key of the payment rule
    * @return the payment rule
    * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule findByPrimaryKey(
        PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchPaymentRuleException {
        return getPersistence().findByPrimaryKey(paymentRulePK);
    }

    /**
    * Returns the payment rule with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param paymentRulePK the primary key of the payment rule
    * @return the payment rule, or <code>null</code> if a payment rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.PaymentRule fetchByPrimaryKey(
        PaymentRulePK paymentRulePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(paymentRulePK);
    }

    /**
    * Returns all the payment rules.
    *
    * @return the payment rules
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.PaymentRule> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentRule> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.stc.echannels.epayments.model.PaymentRule> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the payment rules from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of payment rules.
    *
    * @return the number of payment rules
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PaymentRulePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PaymentRulePersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    PaymentRulePersistence.class.getName());

            ReferenceRegistry.registerReference(PaymentRuleUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PaymentRulePersistence persistence) {
    }
}
