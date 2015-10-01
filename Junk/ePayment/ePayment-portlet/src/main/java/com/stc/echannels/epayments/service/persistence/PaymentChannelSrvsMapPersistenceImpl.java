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

import com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException;
import com.stc.echannels.epayments.model.PaymentChannelSrvsMap;
import com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapImpl;
import com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentChannelSrvsMapPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment channel srvs map service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrvsMapPersistence
 * @see PaymentChannelSrvsMapUtil
 * @generated
 */
public class PaymentChannelSrvsMapPersistenceImpl extends BasePersistenceImpl<PaymentChannelSrvsMap>
    implements PaymentChannelSrvsMapPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentChannelSrvsMapUtil} to access the payment channel srvs map persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentChannelSrvsMapImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServiceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServiceId",
            new String[] { Long.class.getName() },
            PaymentChannelSrvsMapModelImpl.SERVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "paymentChannelSrvsMap.serviceId = ?";
    private static final String _SQL_SELECT_PAYMENTCHANNELSRVSMAP = "SELECT paymentChannelSrvsMap FROM PaymentChannelSrvsMap paymentChannelSrvsMap";
    private static final String _SQL_SELECT_PAYMENTCHANNELSRVSMAP_WHERE = "SELECT paymentChannelSrvsMap FROM PaymentChannelSrvsMap paymentChannelSrvsMap WHERE ";
    private static final String _SQL_COUNT_PAYMENTCHANNELSRVSMAP = "SELECT COUNT(paymentChannelSrvsMap) FROM PaymentChannelSrvsMap paymentChannelSrvsMap";
    private static final String _SQL_COUNT_PAYMENTCHANNELSRVSMAP_WHERE = "SELECT COUNT(paymentChannelSrvsMap) FROM PaymentChannelSrvsMap paymentChannelSrvsMap WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentChannelSrvsMap.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentChannelSrvsMap exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentChannelSrvsMap exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentChannelSrvsMapPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "serviceId", "channelId"
            });
    private static PaymentChannelSrvsMap _nullPaymentChannelSrvsMap = new PaymentChannelSrvsMapImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentChannelSrvsMap> toCacheModel() {
                return _nullPaymentChannelSrvsMapCacheModel;
            }
        };

    private static CacheModel<PaymentChannelSrvsMap> _nullPaymentChannelSrvsMapCacheModel =
        new CacheModel<PaymentChannelSrvsMap>() {
            @Override
            public PaymentChannelSrvsMap toEntityModel() {
                return _nullPaymentChannelSrvsMap;
            }
        };

    public PaymentChannelSrvsMapPersistenceImpl() {
        setModelClass(PaymentChannelSrvsMap.class);
    }

    /**
     * Returns all the payment channel srvs maps where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the matching payment channel srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSrvsMap> findByServiceId(long serviceId)
        throws SystemException {
        return findByServiceId(serviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the payment channel srvs maps where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of payment channel srvs maps
     * @param end the upper bound of the range of payment channel srvs maps (not inclusive)
     * @return the range of matching payment channel srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSrvsMap> findByServiceId(long serviceId,
        int start, int end) throws SystemException {
        return findByServiceId(serviceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channel srvs maps where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of payment channel srvs maps
     * @param end the upper bound of the range of payment channel srvs maps (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment channel srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSrvsMap> findByServiceId(long serviceId,
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

        List<PaymentChannelSrvsMap> list = (List<PaymentChannelSrvsMap>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentChannelSrvsMap paymentChannelSrvsMap : list) {
                if ((serviceId != paymentChannelSrvsMap.getServiceId())) {
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

            query.append(_SQL_SELECT_PAYMENTCHANNELSRVSMAP_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentChannelSrvsMapModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

                if (!pagination) {
                    list = (List<PaymentChannelSrvsMap>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannelSrvsMap>(list);
                } else {
                    list = (List<PaymentChannelSrvsMap>) QueryUtil.list(q,
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
     * Returns the first payment channel srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a matching payment channel srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap findByServiceId_First(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrvsMapException, SystemException {
        PaymentChannelSrvsMap paymentChannelSrvsMap = fetchByServiceId_First(serviceId,
                orderByComparator);

        if (paymentChannelSrvsMap != null) {
            return paymentChannelSrvsMap;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelSrvsMapException(msg.toString());
    }

    /**
     * Returns the first payment channel srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel srvs map, or <code>null</code> if a matching payment channel srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap fetchByServiceId_First(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentChannelSrvsMap> list = findByServiceId(serviceId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment channel srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a matching payment channel srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap findByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrvsMapException, SystemException {
        PaymentChannelSrvsMap paymentChannelSrvsMap = fetchByServiceId_Last(serviceId,
                orderByComparator);

        if (paymentChannelSrvsMap != null) {
            return paymentChannelSrvsMap;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelSrvsMapException(msg.toString());
    }

    /**
     * Returns the last payment channel srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel srvs map, or <code>null</code> if a matching payment channel srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap fetchByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByServiceId(serviceId);

        if (count == 0) {
            return null;
        }

        List<PaymentChannelSrvsMap> list = findByServiceId(serviceId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment channel srvs maps before and after the current payment channel srvs map in the ordered set where serviceId = &#63;.
     *
     * @param id the primary key of the current payment channel srvs map
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment channel srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a payment channel srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap[] findByServiceId_PrevAndNext(String id,
        long serviceId, OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrvsMapException, SystemException {
        PaymentChannelSrvsMap paymentChannelSrvsMap = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            PaymentChannelSrvsMap[] array = new PaymentChannelSrvsMapImpl[3];

            array[0] = getByServiceId_PrevAndNext(session,
                    paymentChannelSrvsMap, serviceId, orderByComparator, true);

            array[1] = paymentChannelSrvsMap;

            array[2] = getByServiceId_PrevAndNext(session,
                    paymentChannelSrvsMap, serviceId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentChannelSrvsMap getByServiceId_PrevAndNext(
        Session session, PaymentChannelSrvsMap paymentChannelSrvsMap,
        long serviceId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTCHANNELSRVSMAP_WHERE);

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
            query.append(PaymentChannelSrvsMapModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentChannelSrvsMap);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentChannelSrvsMap> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment channel srvs maps where serviceId = &#63; from the database.
     *
     * @param serviceId the service ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByServiceId(long serviceId) throws SystemException {
        for (PaymentChannelSrvsMap paymentChannelSrvsMap : findByServiceId(
                serviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentChannelSrvsMap);
        }
    }

    /**
     * Returns the number of payment channel srvs maps where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the number of matching payment channel srvs maps
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

            query.append(_SQL_COUNT_PAYMENTCHANNELSRVSMAP_WHERE);

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
     * Caches the payment channel srvs map in the entity cache if it is enabled.
     *
     * @param paymentChannelSrvsMap the payment channel srvs map
     */
    @Override
    public void cacheResult(PaymentChannelSrvsMap paymentChannelSrvsMap) {
        EntityCacheUtil.putResult(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapImpl.class,
            paymentChannelSrvsMap.getPrimaryKey(), paymentChannelSrvsMap);

        paymentChannelSrvsMap.resetOriginalValues();
    }

    /**
     * Caches the payment channel srvs maps in the entity cache if it is enabled.
     *
     * @param paymentChannelSrvsMaps the payment channel srvs maps
     */
    @Override
    public void cacheResult(List<PaymentChannelSrvsMap> paymentChannelSrvsMaps) {
        for (PaymentChannelSrvsMap paymentChannelSrvsMap : paymentChannelSrvsMaps) {
            if (EntityCacheUtil.getResult(
                        PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentChannelSrvsMapImpl.class,
                        paymentChannelSrvsMap.getPrimaryKey()) == null) {
                cacheResult(paymentChannelSrvsMap);
            } else {
                paymentChannelSrvsMap.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment channel srvs maps.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentChannelSrvsMapImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentChannelSrvsMapImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment channel srvs map.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentChannelSrvsMap paymentChannelSrvsMap) {
        EntityCacheUtil.removeResult(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapImpl.class,
            paymentChannelSrvsMap.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PaymentChannelSrvsMap> paymentChannelSrvsMaps) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentChannelSrvsMap paymentChannelSrvsMap : paymentChannelSrvsMaps) {
            EntityCacheUtil.removeResult(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                PaymentChannelSrvsMapImpl.class,
                paymentChannelSrvsMap.getPrimaryKey());
        }
    }

    /**
     * Creates a new payment channel srvs map with the primary key. Does not add the payment channel srvs map to the database.
     *
     * @param id the primary key for the new payment channel srvs map
     * @return the new payment channel srvs map
     */
    @Override
    public PaymentChannelSrvsMap create(String id) {
        PaymentChannelSrvsMap paymentChannelSrvsMap = new PaymentChannelSrvsMapImpl();

        paymentChannelSrvsMap.setNew(true);
        paymentChannelSrvsMap.setPrimaryKey(id);

        return paymentChannelSrvsMap;
    }

    /**
     * Removes the payment channel srvs map with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the payment channel srvs map
     * @return the payment channel srvs map that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a payment channel srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap remove(String id)
        throws NoSuchPaymentChannelSrvsMapException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the payment channel srvs map with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment channel srvs map
     * @return the payment channel srvs map that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a payment channel srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap remove(Serializable primaryKey)
        throws NoSuchPaymentChannelSrvsMapException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentChannelSrvsMap paymentChannelSrvsMap = (PaymentChannelSrvsMap) session.get(PaymentChannelSrvsMapImpl.class,
                    primaryKey);

            if (paymentChannelSrvsMap == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentChannelSrvsMapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentChannelSrvsMap);
        } catch (NoSuchPaymentChannelSrvsMapException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentChannelSrvsMap removeImpl(
        PaymentChannelSrvsMap paymentChannelSrvsMap) throws SystemException {
        paymentChannelSrvsMap = toUnwrappedModel(paymentChannelSrvsMap);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentChannelSrvsMap)) {
                paymentChannelSrvsMap = (PaymentChannelSrvsMap) session.get(PaymentChannelSrvsMapImpl.class,
                        paymentChannelSrvsMap.getPrimaryKeyObj());
            }

            if (paymentChannelSrvsMap != null) {
                session.delete(paymentChannelSrvsMap);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentChannelSrvsMap != null) {
            clearCache(paymentChannelSrvsMap);
        }

        return paymentChannelSrvsMap;
    }

    @Override
    public PaymentChannelSrvsMap updateImpl(
        com.stc.echannels.epayments.model.PaymentChannelSrvsMap paymentChannelSrvsMap)
        throws SystemException {
        paymentChannelSrvsMap = toUnwrappedModel(paymentChannelSrvsMap);

        boolean isNew = paymentChannelSrvsMap.isNew();

        PaymentChannelSrvsMapModelImpl paymentChannelSrvsMapModelImpl = (PaymentChannelSrvsMapModelImpl) paymentChannelSrvsMap;

        Session session = null;

        try {
            session = openSession();

            if (paymentChannelSrvsMap.isNew()) {
                session.save(paymentChannelSrvsMap);

                paymentChannelSrvsMap.setNew(false);
            } else {
                session.merge(paymentChannelSrvsMap);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PaymentChannelSrvsMapModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((paymentChannelSrvsMapModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentChannelSrvsMapModelImpl.getOriginalServiceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] {
                        paymentChannelSrvsMapModelImpl.getServiceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrvsMapImpl.class,
            paymentChannelSrvsMap.getPrimaryKey(), paymentChannelSrvsMap);

        return paymentChannelSrvsMap;
    }

    protected PaymentChannelSrvsMap toUnwrappedModel(
        PaymentChannelSrvsMap paymentChannelSrvsMap) {
        if (paymentChannelSrvsMap instanceof PaymentChannelSrvsMapImpl) {
            return paymentChannelSrvsMap;
        }

        PaymentChannelSrvsMapImpl paymentChannelSrvsMapImpl = new PaymentChannelSrvsMapImpl();

        paymentChannelSrvsMapImpl.setNew(paymentChannelSrvsMap.isNew());
        paymentChannelSrvsMapImpl.setPrimaryKey(paymentChannelSrvsMap.getPrimaryKey());

        paymentChannelSrvsMapImpl.setId(paymentChannelSrvsMap.getId());
        paymentChannelSrvsMapImpl.setServiceId(paymentChannelSrvsMap.getServiceId());
        paymentChannelSrvsMapImpl.setChannelId(paymentChannelSrvsMap.getChannelId());

        return paymentChannelSrvsMapImpl;
    }

    /**
     * Returns the payment channel srvs map with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment channel srvs map
     * @return the payment channel srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a payment channel srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentChannelSrvsMapException, SystemException {
        PaymentChannelSrvsMap paymentChannelSrvsMap = fetchByPrimaryKey(primaryKey);

        if (paymentChannelSrvsMap == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentChannelSrvsMapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentChannelSrvsMap;
    }

    /**
     * Returns the payment channel srvs map with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException} if it could not be found.
     *
     * @param id the primary key of the payment channel srvs map
     * @return the payment channel srvs map
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException if a payment channel srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap findByPrimaryKey(String id)
        throws NoSuchPaymentChannelSrvsMapException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the payment channel srvs map with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment channel srvs map
     * @return the payment channel srvs map, or <code>null</code> if a payment channel srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentChannelSrvsMap paymentChannelSrvsMap = (PaymentChannelSrvsMap) EntityCacheUtil.getResult(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                PaymentChannelSrvsMapImpl.class, primaryKey);

        if (paymentChannelSrvsMap == _nullPaymentChannelSrvsMap) {
            return null;
        }

        if (paymentChannelSrvsMap == null) {
            Session session = null;

            try {
                session = openSession();

                paymentChannelSrvsMap = (PaymentChannelSrvsMap) session.get(PaymentChannelSrvsMapImpl.class,
                        primaryKey);

                if (paymentChannelSrvsMap != null) {
                    cacheResult(paymentChannelSrvsMap);
                } else {
                    EntityCacheUtil.putResult(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentChannelSrvsMapImpl.class, primaryKey,
                        _nullPaymentChannelSrvsMap);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentChannelSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentChannelSrvsMapImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentChannelSrvsMap;
    }

    /**
     * Returns the payment channel srvs map with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the payment channel srvs map
     * @return the payment channel srvs map, or <code>null</code> if a payment channel srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSrvsMap fetchByPrimaryKey(String id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the payment channel srvs maps.
     *
     * @return the payment channel srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSrvsMap> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment channel srvs maps.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment channel srvs maps
     * @param end the upper bound of the range of payment channel srvs maps (not inclusive)
     * @return the range of payment channel srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSrvsMap> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channel srvs maps.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment channel srvs maps
     * @param end the upper bound of the range of payment channel srvs maps (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of payment channel srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSrvsMap> findAll(int start, int end,
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

        List<PaymentChannelSrvsMap> list = (List<PaymentChannelSrvsMap>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTCHANNELSRVSMAP);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTCHANNELSRVSMAP;

                if (pagination) {
                    sql = sql.concat(PaymentChannelSrvsMapModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentChannelSrvsMap>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannelSrvsMap>(list);
                } else {
                    list = (List<PaymentChannelSrvsMap>) QueryUtil.list(q,
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
     * Removes all the payment channel srvs maps from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentChannelSrvsMap paymentChannelSrvsMap : findAll()) {
            remove(paymentChannelSrvsMap);
        }
    }

    /**
     * Returns the number of payment channel srvs maps.
     *
     * @return the number of payment channel srvs maps
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

                Query q = session.createQuery(_SQL_COUNT_PAYMENTCHANNELSRVSMAP);

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
     * Initializes the payment channel srvs map persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentChannelSrvsMap")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentChannelSrvsMap>> listenersList = new ArrayList<ModelListener<PaymentChannelSrvsMap>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentChannelSrvsMap>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentChannelSrvsMapImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
