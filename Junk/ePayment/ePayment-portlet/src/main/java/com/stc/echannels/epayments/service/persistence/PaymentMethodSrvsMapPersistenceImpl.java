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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException;
import com.stc.echannels.epayments.model.PaymentMethodSrvsMap;
import com.stc.echannels.epayments.model.impl.PaymentMethodSrvsMapImpl;
import com.stc.echannels.epayments.model.impl.PaymentMethodSrvsMapModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentMethodSrvsMapPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment method srvs map service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentMethodSrvsMapPersistence
 * @see PaymentMethodSrvsMapUtil
 * @generated
 */
public class PaymentMethodSrvsMapPersistenceImpl extends BasePersistenceImpl<PaymentMethodSrvsMap>
    implements PaymentMethodSrvsMapPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentMethodSrvsMapUtil} to access the payment method srvs map persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentMethodSrvsMapImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServiceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServiceId",
            new String[] { Long.class.getName() },
            PaymentMethodSrvsMapModelImpl.SERVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "paymentMethodSrvsMap.serviceId = ?";
    private static final String _SQL_SELECT_PAYMENTMETHODSRVSMAP = "SELECT paymentMethodSrvsMap FROM PaymentMethodSrvsMap paymentMethodSrvsMap";
    private static final String _SQL_SELECT_PAYMENTMETHODSRVSMAP_WHERE = "SELECT paymentMethodSrvsMap FROM PaymentMethodSrvsMap paymentMethodSrvsMap WHERE ";
    private static final String _SQL_COUNT_PAYMENTMETHODSRVSMAP = "SELECT COUNT(paymentMethodSrvsMap) FROM PaymentMethodSrvsMap paymentMethodSrvsMap";
    private static final String _SQL_COUNT_PAYMENTMETHODSRVSMAP_WHERE = "SELECT COUNT(paymentMethodSrvsMap) FROM PaymentMethodSrvsMap paymentMethodSrvsMap WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentMethodSrvsMap.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentMethodSrvsMap exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentMethodSrvsMap exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentMethodSrvsMapPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "serviceId", "paymentMethodId"
            });
    private static PaymentMethodSrvsMap _nullPaymentMethodSrvsMap = new PaymentMethodSrvsMapImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentMethodSrvsMap> toCacheModel() {
                return _nullPaymentMethodSrvsMapCacheModel;
            }
        };

    private static CacheModel<PaymentMethodSrvsMap> _nullPaymentMethodSrvsMapCacheModel =
        new CacheModel<PaymentMethodSrvsMap>() {
            @Override
            public PaymentMethodSrvsMap toEntityModel() {
                return _nullPaymentMethodSrvsMap;
            }
        };

    public PaymentMethodSrvsMapPersistenceImpl() {
        setModelClass(PaymentMethodSrvsMap.class);
    }

    /**
     * Returns all the payment method srvs maps where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the matching payment method srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethodSrvsMap> findByServiceId(long serviceId)
        throws SystemException {
        return findByServiceId(serviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the payment method srvs maps where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of payment method srvs maps
     * @param end the upper bound of the range of payment method srvs maps (not inclusive)
     * @return the range of matching payment method srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethodSrvsMap> findByServiceId(long serviceId,
        int start, int end) throws SystemException {
        return findByServiceId(serviceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment method srvs maps where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of payment method srvs maps
     * @param end the upper bound of the range of payment method srvs maps (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment method srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethodSrvsMap> findByServiceId(long serviceId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID;
            finderArgs = new Object[] { serviceId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID;
            finderArgs = new Object[] { serviceId, start, end, orderByComparator };
        }

        List<PaymentMethodSrvsMap> list = (List<PaymentMethodSrvsMap>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentMethodSrvsMap paymentMethodSrvsMap : list) {
                if ((serviceId != paymentMethodSrvsMap.getServiceId())) {
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

            query.append(_SQL_SELECT_PAYMENTMETHODSRVSMAP_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentMethodSrvsMapModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

                if (!pagination) {
                    list = (List<PaymentMethodSrvsMap>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentMethodSrvsMap>(list);
                } else {
                    list = (List<PaymentMethodSrvsMap>) QueryUtil.list(q,
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
     * Returns the first payment method srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment method srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException if a matching payment method srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap findByServiceId_First(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodSrvsMapException, SystemException {
        PaymentMethodSrvsMap paymentMethodSrvsMap = fetchByServiceId_First(serviceId,
                orderByComparator);

        if (paymentMethodSrvsMap != null) {
            return paymentMethodSrvsMap;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentMethodSrvsMapException(msg.toString());
    }

    /**
     * Returns the first payment method srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment method srvs map, or <code>null</code> if a matching payment method srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap fetchByServiceId_First(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentMethodSrvsMap> list = findByServiceId(serviceId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment method srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment method srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException if a matching payment method srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap findByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodSrvsMapException, SystemException {
        PaymentMethodSrvsMap paymentMethodSrvsMap = fetchByServiceId_Last(serviceId,
                orderByComparator);

        if (paymentMethodSrvsMap != null) {
            return paymentMethodSrvsMap;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentMethodSrvsMapException(msg.toString());
    }

    /**
     * Returns the last payment method srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment method srvs map, or <code>null</code> if a matching payment method srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap fetchByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByServiceId(serviceId);

        if (count == 0) {
            return null;
        }

        List<PaymentMethodSrvsMap> list = findByServiceId(serviceId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment method srvs maps before and after the current payment method srvs map in the ordered set where serviceId = &#63;.
     *
     * @param id the primary key of the current payment method srvs map
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment method srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException if a payment method srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap[] findByServiceId_PrevAndNext(String id,
        long serviceId, OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodSrvsMapException, SystemException {
        PaymentMethodSrvsMap paymentMethodSrvsMap = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            PaymentMethodSrvsMap[] array = new PaymentMethodSrvsMapImpl[3];

            array[0] = getByServiceId_PrevAndNext(session,
                    paymentMethodSrvsMap, serviceId, orderByComparator, true);

            array[1] = paymentMethodSrvsMap;

            array[2] = getByServiceId_PrevAndNext(session,
                    paymentMethodSrvsMap, serviceId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentMethodSrvsMap getByServiceId_PrevAndNext(Session session,
        PaymentMethodSrvsMap paymentMethodSrvsMap, long serviceId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTMETHODSRVSMAP_WHERE);

        query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

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
            query.append(PaymentMethodSrvsMapModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentMethodSrvsMap);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentMethodSrvsMap> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment method srvs maps where serviceId = &#63; from the database.
     *
     * @param serviceId the service ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByServiceId(long serviceId) throws SystemException {
        for (PaymentMethodSrvsMap paymentMethodSrvsMap : findByServiceId(
                serviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentMethodSrvsMap);
        }
    }

    /**
     * Returns the number of payment method srvs maps where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the number of matching payment method srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByServiceId(long serviceId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICEID;

        Object[] finderArgs = new Object[] { serviceId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PAYMENTMETHODSRVSMAP_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

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
     * Caches the payment method srvs map in the entity cache if it is enabled.
     *
     * @param paymentMethodSrvsMap the payment method srvs map
     */
    @Override
    public void cacheResult(PaymentMethodSrvsMap paymentMethodSrvsMap) {
        EntityCacheUtil.putResult(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapImpl.class,
            paymentMethodSrvsMap.getPrimaryKey(), paymentMethodSrvsMap);

        paymentMethodSrvsMap.resetOriginalValues();
    }

    /**
     * Caches the payment method srvs maps in the entity cache if it is enabled.
     *
     * @param paymentMethodSrvsMaps the payment method srvs maps
     */
    @Override
    public void cacheResult(List<PaymentMethodSrvsMap> paymentMethodSrvsMaps) {
        for (PaymentMethodSrvsMap paymentMethodSrvsMap : paymentMethodSrvsMaps) {
            if (EntityCacheUtil.getResult(
                        PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentMethodSrvsMapImpl.class,
                        paymentMethodSrvsMap.getPrimaryKey()) == null) {
                cacheResult(paymentMethodSrvsMap);
            } else {
                paymentMethodSrvsMap.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment method srvs maps.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentMethodSrvsMapImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentMethodSrvsMapImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment method srvs map.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentMethodSrvsMap paymentMethodSrvsMap) {
        EntityCacheUtil.removeResult(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapImpl.class, paymentMethodSrvsMap.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PaymentMethodSrvsMap> paymentMethodSrvsMaps) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentMethodSrvsMap paymentMethodSrvsMap : paymentMethodSrvsMaps) {
            EntityCacheUtil.removeResult(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                PaymentMethodSrvsMapImpl.class,
                paymentMethodSrvsMap.getPrimaryKey());
        }
    }

    /**
     * Creates a new payment method srvs map with the primary key. Does not add the payment method srvs map to the database.
     *
     * @param id the primary key for the new payment method srvs map
     * @return the new payment method srvs map
     */
    @Override
    public PaymentMethodSrvsMap create(String id) {
        PaymentMethodSrvsMap paymentMethodSrvsMap = new PaymentMethodSrvsMapImpl();

        paymentMethodSrvsMap.setNew(true);
        paymentMethodSrvsMap.setPrimaryKey(id);

        return paymentMethodSrvsMap;
    }

    /**
     * Removes the payment method srvs map with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the payment method srvs map
     * @return the payment method srvs map that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException if a payment method srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap remove(String id)
        throws NoSuchPaymentMethodSrvsMapException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the payment method srvs map with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment method srvs map
     * @return the payment method srvs map that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException if a payment method srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap remove(Serializable primaryKey)
        throws NoSuchPaymentMethodSrvsMapException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentMethodSrvsMap paymentMethodSrvsMap = (PaymentMethodSrvsMap) session.get(PaymentMethodSrvsMapImpl.class,
                    primaryKey);

            if (paymentMethodSrvsMap == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentMethodSrvsMapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentMethodSrvsMap);
        } catch (NoSuchPaymentMethodSrvsMapException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentMethodSrvsMap removeImpl(
        PaymentMethodSrvsMap paymentMethodSrvsMap) throws SystemException {
        paymentMethodSrvsMap = toUnwrappedModel(paymentMethodSrvsMap);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentMethodSrvsMap)) {
                paymentMethodSrvsMap = (PaymentMethodSrvsMap) session.get(PaymentMethodSrvsMapImpl.class,
                        paymentMethodSrvsMap.getPrimaryKeyObj());
            }

            if (paymentMethodSrvsMap != null) {
                session.delete(paymentMethodSrvsMap);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentMethodSrvsMap != null) {
            clearCache(paymentMethodSrvsMap);
        }

        return paymentMethodSrvsMap;
    }

    @Override
    public PaymentMethodSrvsMap updateImpl(
        com.stc.echannels.epayments.model.PaymentMethodSrvsMap paymentMethodSrvsMap)
        throws SystemException {
        paymentMethodSrvsMap = toUnwrappedModel(paymentMethodSrvsMap);

        boolean isNew = paymentMethodSrvsMap.isNew();

        PaymentMethodSrvsMapModelImpl paymentMethodSrvsMapModelImpl = (PaymentMethodSrvsMapModelImpl) paymentMethodSrvsMap;

        Session session = null;

        try {
            session = openSession();

            if (paymentMethodSrvsMap.isNew()) {
                session.save(paymentMethodSrvsMap);

                paymentMethodSrvsMap.setNew(false);
            } else {
                session.merge(paymentMethodSrvsMap);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PaymentMethodSrvsMapModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((paymentMethodSrvsMapModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentMethodSrvsMapModelImpl.getOriginalServiceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] { paymentMethodSrvsMapModelImpl.getServiceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodSrvsMapImpl.class,
            paymentMethodSrvsMap.getPrimaryKey(), paymentMethodSrvsMap);

        return paymentMethodSrvsMap;
    }

    protected PaymentMethodSrvsMap toUnwrappedModel(
        PaymentMethodSrvsMap paymentMethodSrvsMap) {
        if (paymentMethodSrvsMap instanceof PaymentMethodSrvsMapImpl) {
            return paymentMethodSrvsMap;
        }

        PaymentMethodSrvsMapImpl paymentMethodSrvsMapImpl = new PaymentMethodSrvsMapImpl();

        paymentMethodSrvsMapImpl.setNew(paymentMethodSrvsMap.isNew());
        paymentMethodSrvsMapImpl.setPrimaryKey(paymentMethodSrvsMap.getPrimaryKey());

        paymentMethodSrvsMapImpl.setId(paymentMethodSrvsMap.getId());
        paymentMethodSrvsMapImpl.setServiceId(paymentMethodSrvsMap.getServiceId());
        paymentMethodSrvsMapImpl.setPaymentMethodId(paymentMethodSrvsMap.getPaymentMethodId());

        return paymentMethodSrvsMapImpl;
    }

    /**
     * Returns the payment method srvs map with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment method srvs map
     * @return the payment method srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException if a payment method srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentMethodSrvsMapException, SystemException {
        PaymentMethodSrvsMap paymentMethodSrvsMap = fetchByPrimaryKey(primaryKey);

        if (paymentMethodSrvsMap == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentMethodSrvsMapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentMethodSrvsMap;
    }

    /**
     * Returns the payment method srvs map with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException} if it could not be found.
     *
     * @param id the primary key of the payment method srvs map
     * @return the payment method srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException if a payment method srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap findByPrimaryKey(String id)
        throws NoSuchPaymentMethodSrvsMapException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the payment method srvs map with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment method srvs map
     * @return the payment method srvs map, or <code>null</code> if a payment method srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentMethodSrvsMap paymentMethodSrvsMap = (PaymentMethodSrvsMap) EntityCacheUtil.getResult(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                PaymentMethodSrvsMapImpl.class, primaryKey);

        if (paymentMethodSrvsMap == _nullPaymentMethodSrvsMap) {
            return null;
        }

        if (paymentMethodSrvsMap == null) {
            Session session = null;

            try {
                session = openSession();

                paymentMethodSrvsMap = (PaymentMethodSrvsMap) session.get(PaymentMethodSrvsMapImpl.class,
                        primaryKey);

                if (paymentMethodSrvsMap != null) {
                    cacheResult(paymentMethodSrvsMap);
                } else {
                    EntityCacheUtil.putResult(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentMethodSrvsMapImpl.class, primaryKey,
                        _nullPaymentMethodSrvsMap);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentMethodSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentMethodSrvsMapImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentMethodSrvsMap;
    }

    /**
     * Returns the payment method srvs map with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the payment method srvs map
     * @return the payment method srvs map, or <code>null</code> if a payment method srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethodSrvsMap fetchByPrimaryKey(String id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the payment method srvs maps.
     *
     * @return the payment method srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethodSrvsMap> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment method srvs maps.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment method srvs maps
     * @param end the upper bound of the range of payment method srvs maps (not inclusive)
     * @return the range of payment method srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethodSrvsMap> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the payment method srvs maps.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment method srvs maps
     * @param end the upper bound of the range of payment method srvs maps (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of payment method srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethodSrvsMap> findAll(int start, int end,
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

        List<PaymentMethodSrvsMap> list = (List<PaymentMethodSrvsMap>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTMETHODSRVSMAP);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTMETHODSRVSMAP;

                if (pagination) {
                    sql = sql.concat(PaymentMethodSrvsMapModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentMethodSrvsMap>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentMethodSrvsMap>(list);
                } else {
                    list = (List<PaymentMethodSrvsMap>) QueryUtil.list(q,
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
     * Removes all the payment method srvs maps from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentMethodSrvsMap paymentMethodSrvsMap : findAll()) {
            remove(paymentMethodSrvsMap);
        }
    }

    /**
     * Returns the number of payment method srvs maps.
     *
     * @return the number of payment method srvs maps
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

                Query q = session.createQuery(_SQL_COUNT_PAYMENTMETHODSRVSMAP);

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
     * Initializes the payment method srvs map persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentMethodSrvsMap")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentMethodSrvsMap>> listenersList = new ArrayList<ModelListener<PaymentMethodSrvsMap>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentMethodSrvsMap>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentMethodSrvsMapImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
