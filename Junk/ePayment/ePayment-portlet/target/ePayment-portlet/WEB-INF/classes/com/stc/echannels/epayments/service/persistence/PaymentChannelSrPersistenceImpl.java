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

import com.stc.echannels.epayments.NoSuchPaymentChannelSrException;
import com.stc.echannels.epayments.model.PaymentChannelSr;
import com.stc.echannels.epayments.model.impl.PaymentChannelSrImpl;
import com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentChannelSrPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment channel sr service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrPersistence
 * @see PaymentChannelSrUtil
 * @generated
 */
public class PaymentChannelSrPersistenceImpl extends BasePersistenceImpl<PaymentChannelSr>
    implements PaymentChannelSrPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentChannelSrUtil} to access the payment channel sr persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentChannelSrImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELID =
        new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findBychannelid",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID =
        new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBychannelid",
            new String[] { Long.class.getName() },
            PaymentChannelSrModelImpl.CHANNELID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CHANNELID = new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBychannelid",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CHANNELID_CHANNELID_2 = "paymentChannelSr.channelid = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByserviceid",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelSrImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByserviceid",
            new String[] { Long.class.getName() },
            PaymentChannelSrModelImpl.SERVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByserviceid",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "paymentChannelSr.serviceid = ?";
    private static final String _SQL_SELECT_PAYMENTCHANNELSR = "SELECT paymentChannelSr FROM PaymentChannelSr paymentChannelSr";
    private static final String _SQL_SELECT_PAYMENTCHANNELSR_WHERE = "SELECT paymentChannelSr FROM PaymentChannelSr paymentChannelSr WHERE ";
    private static final String _SQL_COUNT_PAYMENTCHANNELSR = "SELECT COUNT(paymentChannelSr) FROM PaymentChannelSr paymentChannelSr";
    private static final String _SQL_COUNT_PAYMENTCHANNELSR_WHERE = "SELECT COUNT(paymentChannelSr) FROM PaymentChannelSr paymentChannelSr WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentChannelSr.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentChannelSr exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentChannelSr exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentChannelSrPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "channelid", "serviceid", "id"
            });
    private static PaymentChannelSr _nullPaymentChannelSr = new PaymentChannelSrImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentChannelSr> toCacheModel() {
                return _nullPaymentChannelSrCacheModel;
            }
        };

    private static CacheModel<PaymentChannelSr> _nullPaymentChannelSrCacheModel = new CacheModel<PaymentChannelSr>() {
            @Override
            public PaymentChannelSr toEntityModel() {
                return _nullPaymentChannelSr;
            }
        };

    public PaymentChannelSrPersistenceImpl() {
        setModelClass(PaymentChannelSr.class);
    }

    /**
     * Returns all the payment channel srs where channelid = &#63;.
     *
     * @param channelid the channelid
     * @return the matching payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSr> findBychannelid(long channelid)
        throws SystemException {
        return findBychannelid(channelid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the payment channel srs where channelid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param channelid the channelid
     * @param start the lower bound of the range of payment channel srs
     * @param end the upper bound of the range of payment channel srs (not inclusive)
     * @return the range of matching payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSr> findBychannelid(long channelid, int start,
        int end) throws SystemException {
        return findBychannelid(channelid, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channel srs where channelid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param channelid the channelid
     * @param start the lower bound of the range of payment channel srs
     * @param end the upper bound of the range of payment channel srs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSr> findBychannelid(long channelid, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID;
            finderArgs = new Object[] { channelid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELID;
            finderArgs = new Object[] { channelid, start, end, orderByComparator };
        }

        List<PaymentChannelSr> list = (List<PaymentChannelSr>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentChannelSr paymentChannelSr : list) {
                if ((channelid != paymentChannelSr.getChannelid())) {
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

            query.append(_SQL_SELECT_PAYMENTCHANNELSR_WHERE);

            query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentChannelSrModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(channelid);

                if (!pagination) {
                    list = (List<PaymentChannelSr>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannelSr>(list);
                } else {
                    list = (List<PaymentChannelSr>) QueryUtil.list(q,
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
     * Returns the first payment channel sr in the ordered set where channelid = &#63;.
     *
     * @param channelid the channelid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel sr
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a matching payment channel sr could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr findBychannelid_First(long channelid,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrException, SystemException {
        PaymentChannelSr paymentChannelSr = fetchBychannelid_First(channelid,
                orderByComparator);

        if (paymentChannelSr != null) {
            return paymentChannelSr;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("channelid=");
        msg.append(channelid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelSrException(msg.toString());
    }

    /**
     * Returns the first payment channel sr in the ordered set where channelid = &#63;.
     *
     * @param channelid the channelid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel sr, or <code>null</code> if a matching payment channel sr could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr fetchBychannelid_First(long channelid,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentChannelSr> list = findBychannelid(channelid, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment channel sr in the ordered set where channelid = &#63;.
     *
     * @param channelid the channelid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel sr
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a matching payment channel sr could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr findBychannelid_Last(long channelid,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrException, SystemException {
        PaymentChannelSr paymentChannelSr = fetchBychannelid_Last(channelid,
                orderByComparator);

        if (paymentChannelSr != null) {
            return paymentChannelSr;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("channelid=");
        msg.append(channelid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelSrException(msg.toString());
    }

    /**
     * Returns the last payment channel sr in the ordered set where channelid = &#63;.
     *
     * @param channelid the channelid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel sr, or <code>null</code> if a matching payment channel sr could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr fetchBychannelid_Last(long channelid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBychannelid(channelid);

        if (count == 0) {
            return null;
        }

        List<PaymentChannelSr> list = findBychannelid(channelid, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment channel srs before and after the current payment channel sr in the ordered set where channelid = &#63;.
     *
     * @param id the primary key of the current payment channel sr
     * @param channelid the channelid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment channel sr
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr[] findBychannelid_PrevAndNext(String id,
        long channelid, OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrException, SystemException {
        PaymentChannelSr paymentChannelSr = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            PaymentChannelSr[] array = new PaymentChannelSrImpl[3];

            array[0] = getBychannelid_PrevAndNext(session, paymentChannelSr,
                    channelid, orderByComparator, true);

            array[1] = paymentChannelSr;

            array[2] = getBychannelid_PrevAndNext(session, paymentChannelSr,
                    channelid, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentChannelSr getBychannelid_PrevAndNext(Session session,
        PaymentChannelSr paymentChannelSr, long channelid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTCHANNELSR_WHERE);

        query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

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
            query.append(PaymentChannelSrModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(channelid);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentChannelSr);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentChannelSr> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment channel srs where channelid = &#63; from the database.
     *
     * @param channelid the channelid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBychannelid(long channelid) throws SystemException {
        for (PaymentChannelSr paymentChannelSr : findBychannelid(channelid,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentChannelSr);
        }
    }

    /**
     * Returns the number of payment channel srs where channelid = &#63;.
     *
     * @param channelid the channelid
     * @return the number of matching payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBychannelid(long channelid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CHANNELID;

        Object[] finderArgs = new Object[] { channelid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PAYMENTCHANNELSR_WHERE);

            query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(channelid);

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
     * Returns all the payment channel srs where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @return the matching payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSr> findByserviceid(long serviceid)
        throws SystemException {
        return findByserviceid(serviceid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the payment channel srs where serviceid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceid the serviceid
     * @param start the lower bound of the range of payment channel srs
     * @param end the upper bound of the range of payment channel srs (not inclusive)
     * @return the range of matching payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSr> findByserviceid(long serviceid, int start,
        int end) throws SystemException {
        return findByserviceid(serviceid, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channel srs where serviceid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceid the serviceid
     * @param start the lower bound of the range of payment channel srs
     * @param end the upper bound of the range of payment channel srs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSr> findByserviceid(long serviceid, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID;
            finderArgs = new Object[] { serviceid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID;
            finderArgs = new Object[] { serviceid, start, end, orderByComparator };
        }

        List<PaymentChannelSr> list = (List<PaymentChannelSr>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentChannelSr paymentChannelSr : list) {
                if ((serviceid != paymentChannelSr.getServiceid())) {
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

            query.append(_SQL_SELECT_PAYMENTCHANNELSR_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentChannelSrModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceid);

                if (!pagination) {
                    list = (List<PaymentChannelSr>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannelSr>(list);
                } else {
                    list = (List<PaymentChannelSr>) QueryUtil.list(q,
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
     * Returns the first payment channel sr in the ordered set where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel sr
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a matching payment channel sr could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr findByserviceid_First(long serviceid,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrException, SystemException {
        PaymentChannelSr paymentChannelSr = fetchByserviceid_First(serviceid,
                orderByComparator);

        if (paymentChannelSr != null) {
            return paymentChannelSr;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceid=");
        msg.append(serviceid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelSrException(msg.toString());
    }

    /**
     * Returns the first payment channel sr in the ordered set where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel sr, or <code>null</code> if a matching payment channel sr could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr fetchByserviceid_First(long serviceid,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentChannelSr> list = findByserviceid(serviceid, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment channel sr in the ordered set where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel sr
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a matching payment channel sr could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr findByserviceid_Last(long serviceid,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrException, SystemException {
        PaymentChannelSr paymentChannelSr = fetchByserviceid_Last(serviceid,
                orderByComparator);

        if (paymentChannelSr != null) {
            return paymentChannelSr;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceid=");
        msg.append(serviceid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelSrException(msg.toString());
    }

    /**
     * Returns the last payment channel sr in the ordered set where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel sr, or <code>null</code> if a matching payment channel sr could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr fetchByserviceid_Last(long serviceid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByserviceid(serviceid);

        if (count == 0) {
            return null;
        }

        List<PaymentChannelSr> list = findByserviceid(serviceid, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment channel srs before and after the current payment channel sr in the ordered set where serviceid = &#63;.
     *
     * @param id the primary key of the current payment channel sr
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment channel sr
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr[] findByserviceid_PrevAndNext(String id,
        long serviceid, OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelSrException, SystemException {
        PaymentChannelSr paymentChannelSr = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            PaymentChannelSr[] array = new PaymentChannelSrImpl[3];

            array[0] = getByserviceid_PrevAndNext(session, paymentChannelSr,
                    serviceid, orderByComparator, true);

            array[1] = paymentChannelSr;

            array[2] = getByserviceid_PrevAndNext(session, paymentChannelSr,
                    serviceid, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentChannelSr getByserviceid_PrevAndNext(Session session,
        PaymentChannelSr paymentChannelSr, long serviceid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTCHANNELSR_WHERE);

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
            query.append(PaymentChannelSrModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceid);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentChannelSr);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentChannelSr> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment channel srs where serviceid = &#63; from the database.
     *
     * @param serviceid the serviceid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByserviceid(long serviceid) throws SystemException {
        for (PaymentChannelSr paymentChannelSr : findByserviceid(serviceid,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentChannelSr);
        }
    }

    /**
     * Returns the number of payment channel srs where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @return the number of matching payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByserviceid(long serviceid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICEID;

        Object[] finderArgs = new Object[] { serviceid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PAYMENTCHANNELSR_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceid);

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
     * Caches the payment channel sr in the entity cache if it is enabled.
     *
     * @param paymentChannelSr the payment channel sr
     */
    @Override
    public void cacheResult(PaymentChannelSr paymentChannelSr) {
        EntityCacheUtil.putResult(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrImpl.class, paymentChannelSr.getPrimaryKey(),
            paymentChannelSr);

        paymentChannelSr.resetOriginalValues();
    }

    /**
     * Caches the payment channel srs in the entity cache if it is enabled.
     *
     * @param paymentChannelSrs the payment channel srs
     */
    @Override
    public void cacheResult(List<PaymentChannelSr> paymentChannelSrs) {
        for (PaymentChannelSr paymentChannelSr : paymentChannelSrs) {
            if (EntityCacheUtil.getResult(
                        PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentChannelSrImpl.class,
                        paymentChannelSr.getPrimaryKey()) == null) {
                cacheResult(paymentChannelSr);
            } else {
                paymentChannelSr.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment channel srs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentChannelSrImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentChannelSrImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment channel sr.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentChannelSr paymentChannelSr) {
        EntityCacheUtil.removeResult(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrImpl.class, paymentChannelSr.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PaymentChannelSr> paymentChannelSrs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentChannelSr paymentChannelSr : paymentChannelSrs) {
            EntityCacheUtil.removeResult(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
                PaymentChannelSrImpl.class, paymentChannelSr.getPrimaryKey());
        }
    }

    /**
     * Creates a new payment channel sr with the primary key. Does not add the payment channel sr to the database.
     *
     * @param id the primary key for the new payment channel sr
     * @return the new payment channel sr
     */
    @Override
    public PaymentChannelSr create(String id) {
        PaymentChannelSr paymentChannelSr = new PaymentChannelSrImpl();

        paymentChannelSr.setNew(true);
        paymentChannelSr.setPrimaryKey(id);

        return paymentChannelSr;
    }

    /**
     * Removes the payment channel sr with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the payment channel sr
     * @return the payment channel sr that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr remove(String id)
        throws NoSuchPaymentChannelSrException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the payment channel sr with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment channel sr
     * @return the payment channel sr that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr remove(Serializable primaryKey)
        throws NoSuchPaymentChannelSrException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentChannelSr paymentChannelSr = (PaymentChannelSr) session.get(PaymentChannelSrImpl.class,
                    primaryKey);

            if (paymentChannelSr == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentChannelSrException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentChannelSr);
        } catch (NoSuchPaymentChannelSrException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentChannelSr removeImpl(PaymentChannelSr paymentChannelSr)
        throws SystemException {
        paymentChannelSr = toUnwrappedModel(paymentChannelSr);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentChannelSr)) {
                paymentChannelSr = (PaymentChannelSr) session.get(PaymentChannelSrImpl.class,
                        paymentChannelSr.getPrimaryKeyObj());
            }

            if (paymentChannelSr != null) {
                session.delete(paymentChannelSr);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentChannelSr != null) {
            clearCache(paymentChannelSr);
        }

        return paymentChannelSr;
    }

    @Override
    public PaymentChannelSr updateImpl(
        com.stc.echannels.epayments.model.PaymentChannelSr paymentChannelSr)
        throws SystemException {
        paymentChannelSr = toUnwrappedModel(paymentChannelSr);

        boolean isNew = paymentChannelSr.isNew();

        PaymentChannelSrModelImpl paymentChannelSrModelImpl = (PaymentChannelSrModelImpl) paymentChannelSr;

        Session session = null;

        try {
            session = openSession();

            if (paymentChannelSr.isNew()) {
                session.save(paymentChannelSr);

                paymentChannelSr.setNew(false);
            } else {
                session.merge(paymentChannelSr);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PaymentChannelSrModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((paymentChannelSrModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentChannelSrModelImpl.getOriginalChannelid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID,
                    args);

                args = new Object[] { paymentChannelSrModelImpl.getChannelid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID,
                    args);
            }

            if ((paymentChannelSrModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentChannelSrModelImpl.getOriginalServiceid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] { paymentChannelSrModelImpl.getServiceid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelSrImpl.class, paymentChannelSr.getPrimaryKey(),
            paymentChannelSr);

        return paymentChannelSr;
    }

    protected PaymentChannelSr toUnwrappedModel(
        PaymentChannelSr paymentChannelSr) {
        if (paymentChannelSr instanceof PaymentChannelSrImpl) {
            return paymentChannelSr;
        }

        PaymentChannelSrImpl paymentChannelSrImpl = new PaymentChannelSrImpl();

        paymentChannelSrImpl.setNew(paymentChannelSr.isNew());
        paymentChannelSrImpl.setPrimaryKey(paymentChannelSr.getPrimaryKey());

        paymentChannelSrImpl.setChannelid(paymentChannelSr.getChannelid());
        paymentChannelSrImpl.setServiceid(paymentChannelSr.getServiceid());
        paymentChannelSrImpl.setId(paymentChannelSr.getId());

        return paymentChannelSrImpl;
    }

    /**
     * Returns the payment channel sr with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment channel sr
     * @return the payment channel sr
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentChannelSrException, SystemException {
        PaymentChannelSr paymentChannelSr = fetchByPrimaryKey(primaryKey);

        if (paymentChannelSr == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentChannelSrException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentChannelSr;
    }

    /**
     * Returns the payment channel sr with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentChannelSrException} if it could not be found.
     *
     * @param id the primary key of the payment channel sr
     * @return the payment channel sr
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelSrException if a payment channel sr with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr findByPrimaryKey(String id)
        throws NoSuchPaymentChannelSrException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the payment channel sr with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment channel sr
     * @return the payment channel sr, or <code>null</code> if a payment channel sr with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentChannelSr paymentChannelSr = (PaymentChannelSr) EntityCacheUtil.getResult(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
                PaymentChannelSrImpl.class, primaryKey);

        if (paymentChannelSr == _nullPaymentChannelSr) {
            return null;
        }

        if (paymentChannelSr == null) {
            Session session = null;

            try {
                session = openSession();

                paymentChannelSr = (PaymentChannelSr) session.get(PaymentChannelSrImpl.class,
                        primaryKey);

                if (paymentChannelSr != null) {
                    cacheResult(paymentChannelSr);
                } else {
                    EntityCacheUtil.putResult(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentChannelSrImpl.class, primaryKey,
                        _nullPaymentChannelSr);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentChannelSrModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentChannelSrImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentChannelSr;
    }

    /**
     * Returns the payment channel sr with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the payment channel sr
     * @return the payment channel sr, or <code>null</code> if a payment channel sr with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannelSr fetchByPrimaryKey(String id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the payment channel srs.
     *
     * @return the payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSr> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<PaymentChannelSr> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channel srs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment channel srs
     * @param end the upper bound of the range of payment channel srs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of payment channel srs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannelSr> findAll(int start, int end,
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

        List<PaymentChannelSr> list = (List<PaymentChannelSr>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTCHANNELSR);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTCHANNELSR;

                if (pagination) {
                    sql = sql.concat(PaymentChannelSrModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentChannelSr>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannelSr>(list);
                } else {
                    list = (List<PaymentChannelSr>) QueryUtil.list(q,
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
     * Removes all the payment channel srs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentChannelSr paymentChannelSr : findAll()) {
            remove(paymentChannelSr);
        }
    }

    /**
     * Returns the number of payment channel srs.
     *
     * @return the number of payment channel srs
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

                Query q = session.createQuery(_SQL_COUNT_PAYMENTCHANNELSR);

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
     * Initializes the payment channel sr persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentChannelSr")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentChannelSr>> listenersList = new ArrayList<ModelListener<PaymentChannelSr>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentChannelSr>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentChannelSrImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
