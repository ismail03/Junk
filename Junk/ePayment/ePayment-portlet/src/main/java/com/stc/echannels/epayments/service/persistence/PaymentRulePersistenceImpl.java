package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.stc.echannels.epayments.NoSuchPaymentRuleException;
import com.stc.echannels.epayments.model.PaymentRule;
import com.stc.echannels.epayments.model.impl.PaymentRuleImpl;
import com.stc.echannels.epayments.model.impl.PaymentRuleModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentRulePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment rule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentRulePersistence
 * @see PaymentRuleUtil
 * @generated
 */
public class PaymentRulePersistenceImpl extends BasePersistenceImpl<PaymentRule>
    implements PaymentRulePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentRuleUtil} to access the payment rule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentRuleImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleModelImpl.FINDER_CACHE_ENABLED, PaymentRuleImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleModelImpl.FINDER_CACHE_ENABLED, PaymentRuleImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RULECATEGORYANDSTATUS =
        new FinderPath(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleModelImpl.FINDER_CACHE_ENABLED, PaymentRuleImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByRuleCategoryAndStatus",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RULECATEGORYANDSTATUS =
        new FinderPath(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleModelImpl.FINDER_CACHE_ENABLED, PaymentRuleImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByRuleCategoryAndStatus",
            new String[] { String.class.getName(), String.class.getName() },
            PaymentRuleModelImpl.RULECATEGORY_COLUMN_BITMASK |
            PaymentRuleModelImpl.STATUS_COLUMN_BITMASK |
            PaymentRuleModelImpl.RULENAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_RULECATEGORYANDSTATUS = new FinderPath(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByRuleCategoryAndStatus",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_1 =
        "paymentRule.ruleCategory IS NULL AND ";
    private static final String _FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_2 =
        "paymentRule.ruleCategory = ? AND ";
    private static final String _FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_3 =
        "(paymentRule.ruleCategory IS NULL OR paymentRule.ruleCategory = '') AND ";
    private static final String _FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_1 = "paymentRule.status IS NULL";
    private static final String _FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_2 = "paymentRule.status = ?";
    private static final String _FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_3 = "(paymentRule.status IS NULL OR paymentRule.status = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_RULEIDANDTRANSID = new FinderPath(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleModelImpl.FINDER_CACHE_ENABLED, PaymentRuleImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByRuleIdAndTransId",
            new String[] { Long.class.getName(), String.class.getName() },
            PaymentRuleModelImpl.RULEID_COLUMN_BITMASK |
            PaymentRuleModelImpl.TRANSID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_RULEIDANDTRANSID = new FinderPath(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByRuleIdAndTransId",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_RULEIDANDTRANSID_RULEID_2 = "paymentRule.id.ruleId = ? AND ";
    private static final String _FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_1 = "paymentRule.id.transId IS NULL";
    private static final String _FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_2 = "paymentRule.id.transId = ?";
    private static final String _FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_3 = "(paymentRule.id.transId IS NULL OR paymentRule.id.transId = '')";
    private static final String _SQL_SELECT_PAYMENTRULE = "SELECT paymentRule FROM PaymentRule paymentRule";
    private static final String _SQL_SELECT_PAYMENTRULE_WHERE = "SELECT paymentRule FROM PaymentRule paymentRule WHERE ";
    private static final String _SQL_COUNT_PAYMENTRULE = "SELECT COUNT(paymentRule) FROM PaymentRule paymentRule";
    private static final String _SQL_COUNT_PAYMENTRULE_WHERE = "SELECT COUNT(paymentRule) FROM PaymentRule paymentRule WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentRule.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentRule exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentRule exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentRulePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "ruleId", "transId", "ruleName", "value", "descriptionEN",
                "descriptionAR", "isEditable", "refundOnViolation",
                "ruleCategory", "clientIP", "serverIP", "userAgent", "operation",
                "isList", "serviceTypeId", "lastUpdateTimestamp",
                "lastUpdateUserid", "lastUpdateUsername", "effectiveTimestamp"
            });
    private static PaymentRule _nullPaymentRule = new PaymentRuleImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentRule> toCacheModel() {
                return _nullPaymentRuleCacheModel;
            }
        };

    private static CacheModel<PaymentRule> _nullPaymentRuleCacheModel = new CacheModel<PaymentRule>() {
            @Override
            public PaymentRule toEntityModel() {
                return _nullPaymentRule;
            }
        };

    public PaymentRulePersistenceImpl() {
        setModelClass(PaymentRule.class);
    }

    /**
     * Returns all the payment rules where ruleCategory = &#63; and status = &#63;.
     *
     * @param ruleCategory the rule category
     * @param status the status
     * @return the matching payment rules
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentRule> findByRuleCategoryAndStatus(String ruleCategory,
        String status) throws SystemException {
        return findByRuleCategoryAndStatus(ruleCategory, status,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<PaymentRule> findByRuleCategoryAndStatus(String ruleCategory,
        String status, int start, int end) throws SystemException {
        return findByRuleCategoryAndStatus(ruleCategory, status, start, end,
            null);
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
    @Override
    public List<PaymentRule> findByRuleCategoryAndStatus(String ruleCategory,
        String status, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RULECATEGORYANDSTATUS;
            finderArgs = new Object[] { ruleCategory, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RULECATEGORYANDSTATUS;
            finderArgs = new Object[] {
                    ruleCategory, status,
                    
                    start, end, orderByComparator
                };
        }

        List<PaymentRule> list = (List<PaymentRule>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentRule paymentRule : list) {
                if (!Validator.equals(ruleCategory,
                            paymentRule.getRuleCategory()) ||
                        !Validator.equals(status, paymentRule.getStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_PAYMENTRULE_WHERE);

            boolean bindRuleCategory = false;

            if (ruleCategory == null) {
                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_1);
            } else if (ruleCategory.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_3);
            } else {
                bindRuleCategory = true;

                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentRuleModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRuleCategory) {
                    qPos.add(ruleCategory);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<PaymentRule>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentRule>(list);
                } else {
                    list = (List<PaymentRule>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public PaymentRule findByRuleCategoryAndStatus_First(String ruleCategory,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentRuleException, SystemException {
        PaymentRule paymentRule = fetchByRuleCategoryAndStatus_First(ruleCategory,
                status, orderByComparator);

        if (paymentRule != null) {
            return paymentRule;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("ruleCategory=");
        msg.append(ruleCategory);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentRuleException(msg.toString());
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
    @Override
    public PaymentRule fetchByRuleCategoryAndStatus_First(String ruleCategory,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        List<PaymentRule> list = findByRuleCategoryAndStatus(ruleCategory,
                status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public PaymentRule findByRuleCategoryAndStatus_Last(String ruleCategory,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentRuleException, SystemException {
        PaymentRule paymentRule = fetchByRuleCategoryAndStatus_Last(ruleCategory,
                status, orderByComparator);

        if (paymentRule != null) {
            return paymentRule;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("ruleCategory=");
        msg.append(ruleCategory);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentRuleException(msg.toString());
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
    @Override
    public PaymentRule fetchByRuleCategoryAndStatus_Last(String ruleCategory,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByRuleCategoryAndStatus(ruleCategory, status);

        if (count == 0) {
            return null;
        }

        List<PaymentRule> list = findByRuleCategoryAndStatus(ruleCategory,
                status, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public PaymentRule[] findByRuleCategoryAndStatus_PrevAndNext(
        PaymentRulePK paymentRulePK, String ruleCategory, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentRuleException, SystemException {
        PaymentRule paymentRule = findByPrimaryKey(paymentRulePK);

        Session session = null;

        try {
            session = openSession();

            PaymentRule[] array = new PaymentRuleImpl[3];

            array[0] = getByRuleCategoryAndStatus_PrevAndNext(session,
                    paymentRule, ruleCategory, status, orderByComparator, true);

            array[1] = paymentRule;

            array[2] = getByRuleCategoryAndStatus_PrevAndNext(session,
                    paymentRule, ruleCategory, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentRule getByRuleCategoryAndStatus_PrevAndNext(
        Session session, PaymentRule paymentRule, String ruleCategory,
        String status, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTRULE_WHERE);

        boolean bindRuleCategory = false;

        if (ruleCategory == null) {
            query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_1);
        } else if (ruleCategory.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_3);
        } else {
            bindRuleCategory = true;

            query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(PaymentRuleModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindRuleCategory) {
            qPos.add(ruleCategory);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentRule);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentRule> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment rules where ruleCategory = &#63; and status = &#63; from the database.
     *
     * @param ruleCategory the rule category
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRuleCategoryAndStatus(String ruleCategory, String status)
        throws SystemException {
        for (PaymentRule paymentRule : findByRuleCategoryAndStatus(
                ruleCategory, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentRule);
        }
    }

    /**
     * Returns the number of payment rules where ruleCategory = &#63; and status = &#63;.
     *
     * @param ruleCategory the rule category
     * @param status the status
     * @return the number of matching payment rules
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRuleCategoryAndStatus(String ruleCategory, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_RULECATEGORYANDSTATUS;

        Object[] finderArgs = new Object[] { ruleCategory, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PAYMENTRULE_WHERE);

            boolean bindRuleCategory = false;

            if (ruleCategory == null) {
                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_1);
            } else if (ruleCategory.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_3);
            } else {
                bindRuleCategory = true;

                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_RULECATEGORY_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_RULECATEGORYANDSTATUS_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRuleCategory) {
                    qPos.add(ruleCategory);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
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
    @Override
    public PaymentRule findByRuleIdAndTransId(long ruleId, String transId)
        throws NoSuchPaymentRuleException, SystemException {
        PaymentRule paymentRule = fetchByRuleIdAndTransId(ruleId, transId);

        if (paymentRule == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("ruleId=");
            msg.append(ruleId);

            msg.append(", transId=");
            msg.append(transId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPaymentRuleException(msg.toString());
        }

        return paymentRule;
    }

    /**
     * Returns the payment rule where ruleId = &#63; and transId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param ruleId the rule ID
     * @param transId the trans ID
     * @return the matching payment rule, or <code>null</code> if a matching payment rule could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentRule fetchByRuleIdAndTransId(long ruleId, String transId)
        throws SystemException {
        return fetchByRuleIdAndTransId(ruleId, transId, true);
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
    @Override
    public PaymentRule fetchByRuleIdAndTransId(long ruleId, String transId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { ruleId, transId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID,
                    finderArgs, this);
        }

        if (result instanceof PaymentRule) {
            PaymentRule paymentRule = (PaymentRule) result;

            if ((ruleId != paymentRule.getRuleId()) ||
                    !Validator.equals(transId, paymentRule.getTransId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_PAYMENTRULE_WHERE);

            query.append(_FINDER_COLUMN_RULEIDANDTRANSID_RULEID_2);

            boolean bindTransId = false;

            if (transId == null) {
                query.append(_FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_1);
            } else if (transId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_3);
            } else {
                bindTransId = true;

                query.append(_FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(ruleId);

                if (bindTransId) {
                    qPos.add(transId);
                }

                List<PaymentRule> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "PaymentRulePersistenceImpl.fetchByRuleIdAndTransId(long, String, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    PaymentRule paymentRule = list.get(0);

                    result = paymentRule;

                    cacheResult(paymentRule);

                    if ((paymentRule.getRuleId() != ruleId) ||
                            (paymentRule.getTransId() == null) ||
                            !paymentRule.getTransId().equals(transId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID,
                            finderArgs, paymentRule);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (PaymentRule) result;
        }
    }

    /**
     * Removes the payment rule where ruleId = &#63; and transId = &#63; from the database.
     *
     * @param ruleId the rule ID
     * @param transId the trans ID
     * @return the payment rule that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentRule removeByRuleIdAndTransId(long ruleId, String transId)
        throws NoSuchPaymentRuleException, SystemException {
        PaymentRule paymentRule = findByRuleIdAndTransId(ruleId, transId);

        return remove(paymentRule);
    }

    /**
     * Returns the number of payment rules where ruleId = &#63; and transId = &#63;.
     *
     * @param ruleId the rule ID
     * @param transId the trans ID
     * @return the number of matching payment rules
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRuleIdAndTransId(long ruleId, String transId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_RULEIDANDTRANSID;

        Object[] finderArgs = new Object[] { ruleId, transId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PAYMENTRULE_WHERE);

            query.append(_FINDER_COLUMN_RULEIDANDTRANSID_RULEID_2);

            boolean bindTransId = false;

            if (transId == null) {
                query.append(_FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_1);
            } else if (transId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_3);
            } else {
                bindTransId = true;

                query.append(_FINDER_COLUMN_RULEIDANDTRANSID_TRANSID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(ruleId);

                if (bindTransId) {
                    qPos.add(transId);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the payment rule in the entity cache if it is enabled.
     *
     * @param paymentRule the payment rule
     */
    @Override
    public void cacheResult(PaymentRule paymentRule) {
        EntityCacheUtil.putResult(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleImpl.class, paymentRule.getPrimaryKey(), paymentRule);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID,
            new Object[] { paymentRule.getRuleId(), paymentRule.getTransId() },
            paymentRule);

        paymentRule.resetOriginalValues();
    }

    /**
     * Caches the payment rules in the entity cache if it is enabled.
     *
     * @param paymentRules the payment rules
     */
    @Override
    public void cacheResult(List<PaymentRule> paymentRules) {
        for (PaymentRule paymentRule : paymentRules) {
            if (EntityCacheUtil.getResult(
                        PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentRuleImpl.class, paymentRule.getPrimaryKey()) == null) {
                cacheResult(paymentRule);
            } else {
                paymentRule.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment rules.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentRuleImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentRuleImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment rule.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentRule paymentRule) {
        EntityCacheUtil.removeResult(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleImpl.class, paymentRule.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(paymentRule);
    }

    @Override
    public void clearCache(List<PaymentRule> paymentRules) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentRule paymentRule : paymentRules) {
            EntityCacheUtil.removeResult(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
                PaymentRuleImpl.class, paymentRule.getPrimaryKey());

            clearUniqueFindersCache(paymentRule);
        }
    }

    protected void cacheUniqueFindersCache(PaymentRule paymentRule) {
        if (paymentRule.isNew()) {
            Object[] args = new Object[] {
                    paymentRule.getRuleId(), paymentRule.getTransId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RULEIDANDTRANSID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID,
                args, paymentRule);
        } else {
            PaymentRuleModelImpl paymentRuleModelImpl = (PaymentRuleModelImpl) paymentRule;

            if ((paymentRuleModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_RULEIDANDTRANSID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentRule.getRuleId(), paymentRule.getTransId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_RULEIDANDTRANSID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID,
                    args, paymentRule);
            }
        }
    }

    protected void clearUniqueFindersCache(PaymentRule paymentRule) {
        PaymentRuleModelImpl paymentRuleModelImpl = (PaymentRuleModelImpl) paymentRule;

        Object[] args = new Object[] {
                paymentRule.getRuleId(), paymentRule.getTransId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RULEIDANDTRANSID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID, args);

        if ((paymentRuleModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_RULEIDANDTRANSID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    paymentRuleModelImpl.getOriginalRuleId(),
                    paymentRuleModelImpl.getOriginalTransId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RULEIDANDTRANSID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_RULEIDANDTRANSID,
                args);
        }
    }

    /**
     * Creates a new payment rule with the primary key. Does not add the payment rule to the database.
     *
     * @param paymentRulePK the primary key for the new payment rule
     * @return the new payment rule
     */
    @Override
    public PaymentRule create(PaymentRulePK paymentRulePK) {
        PaymentRule paymentRule = new PaymentRuleImpl();

        paymentRule.setNew(true);
        paymentRule.setPrimaryKey(paymentRulePK);

        return paymentRule;
    }

    /**
     * Removes the payment rule with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param paymentRulePK the primary key of the payment rule
     * @return the payment rule that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentRule remove(PaymentRulePK paymentRulePK)
        throws NoSuchPaymentRuleException, SystemException {
        return remove((Serializable) paymentRulePK);
    }

    /**
     * Removes the payment rule with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment rule
     * @return the payment rule that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentRule remove(Serializable primaryKey)
        throws NoSuchPaymentRuleException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentRule paymentRule = (PaymentRule) session.get(PaymentRuleImpl.class,
                    primaryKey);

            if (paymentRule == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentRuleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentRule);
        } catch (NoSuchPaymentRuleException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentRule removeImpl(PaymentRule paymentRule)
        throws SystemException {
        paymentRule = toUnwrappedModel(paymentRule);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentRule)) {
                paymentRule = (PaymentRule) session.get(PaymentRuleImpl.class,
                        paymentRule.getPrimaryKeyObj());
            }

            if (paymentRule != null) {
                session.delete(paymentRule);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentRule != null) {
            clearCache(paymentRule);
        }

        return paymentRule;
    }

    @Override
    public PaymentRule updateImpl(
        com.stc.echannels.epayments.model.PaymentRule paymentRule)
        throws SystemException {
        paymentRule = toUnwrappedModel(paymentRule);

        boolean isNew = paymentRule.isNew();

        PaymentRuleModelImpl paymentRuleModelImpl = (PaymentRuleModelImpl) paymentRule;

        Session session = null;

        try {
            session = openSession();

            if (paymentRule.isNew()) {
                session.save(paymentRule);

                paymentRule.setNew(false);
            } else {
                session.merge(paymentRule);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PaymentRuleModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((paymentRuleModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RULECATEGORYANDSTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentRuleModelImpl.getOriginalRuleCategory(),
                        paymentRuleModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RULECATEGORYANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RULECATEGORYANDSTATUS,
                    args);

                args = new Object[] {
                        paymentRuleModelImpl.getRuleCategory(),
                        paymentRuleModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RULECATEGORYANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RULECATEGORYANDSTATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
            PaymentRuleImpl.class, paymentRule.getPrimaryKey(), paymentRule);

        clearUniqueFindersCache(paymentRule);
        cacheUniqueFindersCache(paymentRule);

        return paymentRule;
    }

    protected PaymentRule toUnwrappedModel(PaymentRule paymentRule) {
        if (paymentRule instanceof PaymentRuleImpl) {
            return paymentRule;
        }

        PaymentRuleImpl paymentRuleImpl = new PaymentRuleImpl();

        paymentRuleImpl.setNew(paymentRule.isNew());
        paymentRuleImpl.setPrimaryKey(paymentRule.getPrimaryKey());

        paymentRuleImpl.setRuleId(paymentRule.getRuleId());
        paymentRuleImpl.setTransId(paymentRule.getTransId());
        paymentRuleImpl.setRuleName(paymentRule.getRuleName());
        paymentRuleImpl.setValue(paymentRule.getValue());
        paymentRuleImpl.setDescriptionEN(paymentRule.getDescriptionEN());
        paymentRuleImpl.setDescriptionAR(paymentRule.getDescriptionAR());
        paymentRuleImpl.setIsEditable(paymentRule.getIsEditable());
        paymentRuleImpl.setRefundOnViolation(paymentRule.getRefundOnViolation());
        paymentRuleImpl.setRuleCategory(paymentRule.getRuleCategory());
        paymentRuleImpl.setClientIP(paymentRule.getClientIP());
        paymentRuleImpl.setServerIP(paymentRule.getServerIP());
        paymentRuleImpl.setUserAgent(paymentRule.getUserAgent());
        paymentRuleImpl.setOperation(paymentRule.getOperation());
        paymentRuleImpl.setIsList(paymentRule.getIsList());
        paymentRuleImpl.setServiceTypeId(paymentRule.getServiceTypeId());
        paymentRuleImpl.setLastUpdateTimestamp(paymentRule.getLastUpdateTimestamp());
        paymentRuleImpl.setLastUpdateUserid(paymentRule.getLastUpdateUserid());
        paymentRuleImpl.setLastUpdateUsername(paymentRule.getLastUpdateUsername());
        paymentRuleImpl.setStatus(paymentRule.getStatus());
        paymentRuleImpl.setEffectiveTimestamp(paymentRule.getEffectiveTimestamp());

        return paymentRuleImpl;
    }

    /**
     * Returns the payment rule with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment rule
     * @return the payment rule
     * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentRule findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentRuleException, SystemException {
        PaymentRule paymentRule = fetchByPrimaryKey(primaryKey);

        if (paymentRule == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentRuleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentRule;
    }

    /**
     * Returns the payment rule with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentRuleException} if it could not be found.
     *
     * @param paymentRulePK the primary key of the payment rule
     * @return the payment rule
     * @throws com.stc.echannels.epayments.NoSuchPaymentRuleException if a payment rule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentRule findByPrimaryKey(PaymentRulePK paymentRulePK)
        throws NoSuchPaymentRuleException, SystemException {
        return findByPrimaryKey((Serializable) paymentRulePK);
    }

    /**
     * Returns the payment rule with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment rule
     * @return the payment rule, or <code>null</code> if a payment rule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentRule fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentRule paymentRule = (PaymentRule) EntityCacheUtil.getResult(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
                PaymentRuleImpl.class, primaryKey);

        if (paymentRule == _nullPaymentRule) {
            return null;
        }

        if (paymentRule == null) {
            Session session = null;

            try {
                session = openSession();

                paymentRule = (PaymentRule) session.get(PaymentRuleImpl.class,
                        primaryKey);

                if (paymentRule != null) {
                    cacheResult(paymentRule);
                } else {
                    EntityCacheUtil.putResult(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentRuleImpl.class, primaryKey, _nullPaymentRule);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentRuleModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentRuleImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentRule;
    }

    /**
     * Returns the payment rule with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param paymentRulePK the primary key of the payment rule
     * @return the payment rule, or <code>null</code> if a payment rule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentRule fetchByPrimaryKey(PaymentRulePK paymentRulePK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) paymentRulePK);
    }

    /**
     * Returns all the payment rules.
     *
     * @return the payment rules
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentRule> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<PaymentRule> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<PaymentRule> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<PaymentRule> list = (List<PaymentRule>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTRULE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTRULE;

                if (pagination) {
                    sql = sql.concat(PaymentRuleModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentRule>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentRule>(list);
                } else {
                    list = (List<PaymentRule>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the payment rules from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentRule paymentRule : findAll()) {
            remove(paymentRule);
        }
    }

    /**
     * Returns the number of payment rules.
     *
     * @return the number of payment rules
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PAYMENTRULE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the payment rule persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentRule")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentRule>> listenersList = new ArrayList<ModelListener<PaymentRule>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentRule>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentRuleImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
