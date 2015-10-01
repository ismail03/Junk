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

import com.stc.echannels.epayments.NoSuchPaymentSystemException;
import com.stc.echannels.epayments.model.PaymentSystem;
import com.stc.echannels.epayments.model.impl.PaymentSystemImpl;
import com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentSystemPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment system service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentSystemPersistence
 * @see PaymentSystemUtil
 * @generated
 */
public class PaymentSystemPersistenceImpl extends BasePersistenceImpl<PaymentSystem>
    implements PaymentSystemPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentSystemUtil} to access the payment system persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentSystemImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemModelImpl.FINDER_CACHE_ENABLED,
            PaymentSystemImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemModelImpl.FINDER_CACHE_ENABLED,
            PaymentSystemImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE = new FinderPath(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemModelImpl.FINDER_CACHE_ENABLED,
            PaymentSystemImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByActive",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE =
        new FinderPath(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemModelImpl.FINDER_CACHE_ENABLED,
            PaymentSystemImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByActive", new String[] { String.class.getName() },
            PaymentSystemModelImpl.ACTIVE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVE = new FinderPath(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActive",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_1 = "paymentSystem.active IS NULL";
    private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_2 = "paymentSystem.active = ?";
    private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_3 = "(paymentSystem.active IS NULL OR paymentSystem.active = '')";
    private static final String _SQL_SELECT_PAYMENTSYSTEM = "SELECT paymentSystem FROM PaymentSystem paymentSystem";
    private static final String _SQL_SELECT_PAYMENTSYSTEM_WHERE = "SELECT paymentSystem FROM PaymentSystem paymentSystem WHERE ";
    private static final String _SQL_COUNT_PAYMENTSYSTEM = "SELECT COUNT(paymentSystem) FROM PaymentSystem paymentSystem";
    private static final String _SQL_COUNT_PAYMENTSYSTEM_WHERE = "SELECT COUNT(paymentSystem) FROM PaymentSystem paymentSystem WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentSystem.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentSystem exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentSystem exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentSystemPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "paymentSystemId", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp", "systemName",
                "dateFormat"
            });
    private static PaymentSystem _nullPaymentSystem = new PaymentSystemImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentSystem> toCacheModel() {
                return _nullPaymentSystemCacheModel;
            }
        };

    private static CacheModel<PaymentSystem> _nullPaymentSystemCacheModel = new CacheModel<PaymentSystem>() {
            @Override
            public PaymentSystem toEntityModel() {
                return _nullPaymentSystem;
            }
        };

    public PaymentSystemPersistenceImpl() {
        setModelClass(PaymentSystem.class);
    }

    /**
     * Returns all the payment systems where active = &#63;.
     *
     * @param active the active
     * @return the matching payment systems
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentSystem> findByActive(String active)
        throws SystemException {
        return findByActive(active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment systems where active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param active the active
     * @param start the lower bound of the range of payment systems
     * @param end the upper bound of the range of payment systems (not inclusive)
     * @return the range of matching payment systems
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentSystem> findByActive(String active, int start, int end)
        throws SystemException {
        return findByActive(active, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment systems where active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param active the active
     * @param start the lower bound of the range of payment systems
     * @param end the upper bound of the range of payment systems (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment systems
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentSystem> findByActive(String active, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE;
            finderArgs = new Object[] { active };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE;
            finderArgs = new Object[] { active, start, end, orderByComparator };
        }

        List<PaymentSystem> list = (List<PaymentSystem>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentSystem paymentSystem : list) {
                if (!Validator.equals(active, paymentSystem.getActive())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PAYMENTSYSTEM_WHERE);

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentSystemModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindActive) {
                    qPos.add(active);
                }

                if (!pagination) {
                    list = (List<PaymentSystem>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentSystem>(list);
                } else {
                    list = (List<PaymentSystem>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first payment system in the ordered set where active = &#63;.
     *
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment system
     * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a matching payment system could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem findByActive_First(String active,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentSystemException, SystemException {
        PaymentSystem paymentSystem = fetchByActive_First(active,
                orderByComparator);

        if (paymentSystem != null) {
            return paymentSystem;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentSystemException(msg.toString());
    }

    /**
     * Returns the first payment system in the ordered set where active = &#63;.
     *
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment system, or <code>null</code> if a matching payment system could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem fetchByActive_First(String active,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentSystem> list = findByActive(active, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment system in the ordered set where active = &#63;.
     *
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment system
     * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a matching payment system could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem findByActive_Last(String active,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentSystemException, SystemException {
        PaymentSystem paymentSystem = fetchByActive_Last(active,
                orderByComparator);

        if (paymentSystem != null) {
            return paymentSystem;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentSystemException(msg.toString());
    }

    /**
     * Returns the last payment system in the ordered set where active = &#63;.
     *
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment system, or <code>null</code> if a matching payment system could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem fetchByActive_Last(String active,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByActive(active);

        if (count == 0) {
            return null;
        }

        List<PaymentSystem> list = findByActive(active, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment systems before and after the current payment system in the ordered set where active = &#63;.
     *
     * @param paymentSystemId the primary key of the current payment system
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment system
     * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a payment system with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem[] findByActive_PrevAndNext(long paymentSystemId,
        String active, OrderByComparator orderByComparator)
        throws NoSuchPaymentSystemException, SystemException {
        PaymentSystem paymentSystem = findByPrimaryKey(paymentSystemId);

        Session session = null;

        try {
            session = openSession();

            PaymentSystem[] array = new PaymentSystemImpl[3];

            array[0] = getByActive_PrevAndNext(session, paymentSystem, active,
                    orderByComparator, true);

            array[1] = paymentSystem;

            array[2] = getByActive_PrevAndNext(session, paymentSystem, active,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentSystem getByActive_PrevAndNext(Session session,
        PaymentSystem paymentSystem, String active,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTSYSTEM_WHERE);

        boolean bindActive = false;

        if (active == null) {
            query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_1);
        } else if (active.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_3);
        } else {
            bindActive = true;

            query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);
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
            query.append(PaymentSystemModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindActive) {
            qPos.add(active);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentSystem);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentSystem> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment systems where active = &#63; from the database.
     *
     * @param active the active
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByActive(String active) throws SystemException {
        for (PaymentSystem paymentSystem : findByActive(active,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentSystem);
        }
    }

    /**
     * Returns the number of payment systems where active = &#63;.
     *
     * @param active the active
     * @return the number of matching payment systems
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByActive(String active) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVE;

        Object[] finderArgs = new Object[] { active };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PAYMENTSYSTEM_WHERE);

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindActive) {
                    qPos.add(active);
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
     * Caches the payment system in the entity cache if it is enabled.
     *
     * @param paymentSystem the payment system
     */
    @Override
    public void cacheResult(PaymentSystem paymentSystem) {
        EntityCacheUtil.putResult(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemImpl.class, paymentSystem.getPrimaryKey(),
            paymentSystem);

        paymentSystem.resetOriginalValues();
    }

    /**
     * Caches the payment systems in the entity cache if it is enabled.
     *
     * @param paymentSystems the payment systems
     */
    @Override
    public void cacheResult(List<PaymentSystem> paymentSystems) {
        for (PaymentSystem paymentSystem : paymentSystems) {
            if (EntityCacheUtil.getResult(
                        PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentSystemImpl.class, paymentSystem.getPrimaryKey()) == null) {
                cacheResult(paymentSystem);
            } else {
                paymentSystem.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment systems.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentSystemImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentSystemImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment system.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentSystem paymentSystem) {
        EntityCacheUtil.removeResult(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemImpl.class, paymentSystem.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PaymentSystem> paymentSystems) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentSystem paymentSystem : paymentSystems) {
            EntityCacheUtil.removeResult(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
                PaymentSystemImpl.class, paymentSystem.getPrimaryKey());
        }
    }

    /**
     * Creates a new payment system with the primary key. Does not add the payment system to the database.
     *
     * @param paymentSystemId the primary key for the new payment system
     * @return the new payment system
     */
    @Override
    public PaymentSystem create(long paymentSystemId) {
        PaymentSystem paymentSystem = new PaymentSystemImpl();

        paymentSystem.setNew(true);
        paymentSystem.setPrimaryKey(paymentSystemId);

        return paymentSystem;
    }

    /**
     * Removes the payment system with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param paymentSystemId the primary key of the payment system
     * @return the payment system that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a payment system with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem remove(long paymentSystemId)
        throws NoSuchPaymentSystemException, SystemException {
        return remove((Serializable) paymentSystemId);
    }

    /**
     * Removes the payment system with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment system
     * @return the payment system that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a payment system with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem remove(Serializable primaryKey)
        throws NoSuchPaymentSystemException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentSystem paymentSystem = (PaymentSystem) session.get(PaymentSystemImpl.class,
                    primaryKey);

            if (paymentSystem == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentSystemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentSystem);
        } catch (NoSuchPaymentSystemException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentSystem removeImpl(PaymentSystem paymentSystem)
        throws SystemException {
        paymentSystem = toUnwrappedModel(paymentSystem);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentSystem)) {
                paymentSystem = (PaymentSystem) session.get(PaymentSystemImpl.class,
                        paymentSystem.getPrimaryKeyObj());
            }

            if (paymentSystem != null) {
                session.delete(paymentSystem);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentSystem != null) {
            clearCache(paymentSystem);
        }

        return paymentSystem;
    }

    @Override
    public PaymentSystem updateImpl(
        com.stc.echannels.epayments.model.PaymentSystem paymentSystem)
        throws SystemException {
        paymentSystem = toUnwrappedModel(paymentSystem);

        boolean isNew = paymentSystem.isNew();

        PaymentSystemModelImpl paymentSystemModelImpl = (PaymentSystemModelImpl) paymentSystem;

        Session session = null;

        try {
            session = openSession();

            if (paymentSystem.isNew()) {
                session.save(paymentSystem);

                paymentSystem.setNew(false);
            } else {
                session.merge(paymentSystem);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PaymentSystemModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((paymentSystemModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentSystemModelImpl.getOriginalActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
                    args);

                args = new Object[] { paymentSystemModelImpl.getActive() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
                    args);
            }
        }

        EntityCacheUtil.putResult(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
            PaymentSystemImpl.class, paymentSystem.getPrimaryKey(),
            paymentSystem);

        return paymentSystem;
    }

    protected PaymentSystem toUnwrappedModel(PaymentSystem paymentSystem) {
        if (paymentSystem instanceof PaymentSystemImpl) {
            return paymentSystem;
        }

        PaymentSystemImpl paymentSystemImpl = new PaymentSystemImpl();

        paymentSystemImpl.setNew(paymentSystem.isNew());
        paymentSystemImpl.setPrimaryKey(paymentSystem.getPrimaryKey());

        paymentSystemImpl.setPaymentSystemId(paymentSystem.getPaymentSystemId());
        paymentSystemImpl.setLastUpdateTimestamp(paymentSystem.getLastUpdateTimestamp());
        paymentSystemImpl.setLastUpdateUserid(paymentSystem.getLastUpdateUserid());
        paymentSystemImpl.setLastUpdateUsername(paymentSystem.getLastUpdateUsername());
        paymentSystemImpl.setActive(paymentSystem.getActive());
        paymentSystemImpl.setEffectiveTimestamp(paymentSystem.getEffectiveTimestamp());
        paymentSystemImpl.setSystemName(paymentSystem.getSystemName());
        paymentSystemImpl.setDateFormat(paymentSystem.getDateFormat());

        return paymentSystemImpl;
    }

    /**
     * Returns the payment system with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment system
     * @return the payment system
     * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a payment system with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentSystemException, SystemException {
        PaymentSystem paymentSystem = fetchByPrimaryKey(primaryKey);

        if (paymentSystem == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentSystemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentSystem;
    }

    /**
     * Returns the payment system with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentSystemException} if it could not be found.
     *
     * @param paymentSystemId the primary key of the payment system
     * @return the payment system
     * @throws com.stc.echannels.epayments.NoSuchPaymentSystemException if a payment system with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem findByPrimaryKey(long paymentSystemId)
        throws NoSuchPaymentSystemException, SystemException {
        return findByPrimaryKey((Serializable) paymentSystemId);
    }

    /**
     * Returns the payment system with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment system
     * @return the payment system, or <code>null</code> if a payment system with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentSystem paymentSystem = (PaymentSystem) EntityCacheUtil.getResult(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
                PaymentSystemImpl.class, primaryKey);

        if (paymentSystem == _nullPaymentSystem) {
            return null;
        }

        if (paymentSystem == null) {
            Session session = null;

            try {
                session = openSession();

                paymentSystem = (PaymentSystem) session.get(PaymentSystemImpl.class,
                        primaryKey);

                if (paymentSystem != null) {
                    cacheResult(paymentSystem);
                } else {
                    EntityCacheUtil.putResult(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentSystemImpl.class, primaryKey, _nullPaymentSystem);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentSystemModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentSystemImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentSystem;
    }

    /**
     * Returns the payment system with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param paymentSystemId the primary key of the payment system
     * @return the payment system, or <code>null</code> if a payment system with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentSystem fetchByPrimaryKey(long paymentSystemId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) paymentSystemId);
    }

    /**
     * Returns all the payment systems.
     *
     * @return the payment systems
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentSystem> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment systems.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment systems
     * @param end the upper bound of the range of payment systems (not inclusive)
     * @return the range of payment systems
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentSystem> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the payment systems.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentSystemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment systems
     * @param end the upper bound of the range of payment systems (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of payment systems
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentSystem> findAll(int start, int end,
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

        List<PaymentSystem> list = (List<PaymentSystem>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTSYSTEM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTSYSTEM;

                if (pagination) {
                    sql = sql.concat(PaymentSystemModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentSystem>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentSystem>(list);
                } else {
                    list = (List<PaymentSystem>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the payment systems from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentSystem paymentSystem : findAll()) {
            remove(paymentSystem);
        }
    }

    /**
     * Returns the number of payment systems.
     *
     * @return the number of payment systems
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

                Query q = session.createQuery(_SQL_COUNT_PAYMENTSYSTEM);

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
     * Initializes the payment system persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentSystem")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentSystem>> listenersList = new ArrayList<ModelListener<PaymentSystem>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentSystem>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentSystemImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
