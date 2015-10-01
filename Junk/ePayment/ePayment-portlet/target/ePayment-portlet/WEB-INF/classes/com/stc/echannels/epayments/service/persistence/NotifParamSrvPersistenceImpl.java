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

import com.stc.echannels.epayments.NoSuchNotifParamSrvException;
import com.stc.echannels.epayments.model.NotifParamSrv;
import com.stc.echannels.epayments.model.impl.NotifParamSrvImpl;
import com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl;
import com.stc.echannels.epayments.service.persistence.NotifParamSrvPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the notif param srv service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifParamSrvPersistence
 * @see NotifParamSrvUtil
 * @generated
 */
public class NotifParamSrvPersistenceImpl extends BasePersistenceImpl<NotifParamSrv>
    implements NotifParamSrvPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link NotifParamSrvUtil} to access the notif param srv persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = NotifParamSrvImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvModelImpl.FINDER_CACHE_ENABLED,
            NotifParamSrvImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvModelImpl.FINDER_CACHE_ENABLED,
            NotifParamSrvImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvModelImpl.FINDER_CACHE_ENABLED,
            NotifParamSrvImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByServiceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvModelImpl.FINDER_CACHE_ENABLED,
            NotifParamSrvImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByServiceId", new String[] { Long.class.getName() },
            NotifParamSrvModelImpl.SERVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "notifParamSrv.id.serviceId = ?";
    private static final String _SQL_SELECT_NOTIFPARAMSRV = "SELECT notifParamSrv FROM NotifParamSrv notifParamSrv";
    private static final String _SQL_SELECT_NOTIFPARAMSRV_WHERE = "SELECT notifParamSrv FROM NotifParamSrv notifParamSrv WHERE ";
    private static final String _SQL_COUNT_NOTIFPARAMSRV = "SELECT COUNT(notifParamSrv) FROM NotifParamSrv notifParamSrv";
    private static final String _SQL_COUNT_NOTIFPARAMSRV_WHERE = "SELECT COUNT(notifParamSrv) FROM NotifParamSrv notifParamSrv WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "notifParamSrv.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NotifParamSrv exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NotifParamSrv exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(NotifParamSrvPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "notifParamId", "serviceId"
            });
    private static NotifParamSrv _nullNotifParamSrv = new NotifParamSrvImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<NotifParamSrv> toCacheModel() {
                return _nullNotifParamSrvCacheModel;
            }
        };

    private static CacheModel<NotifParamSrv> _nullNotifParamSrvCacheModel = new CacheModel<NotifParamSrv>() {
            @Override
            public NotifParamSrv toEntityModel() {
                return _nullNotifParamSrv;
            }
        };

    public NotifParamSrvPersistenceImpl() {
        setModelClass(NotifParamSrv.class);
    }

    /**
     * Returns all the notif param srvs where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the matching notif param srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParamSrv> findByServiceId(long serviceId)
        throws SystemException {
        return findByServiceId(serviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the notif param srvs where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of notif param srvs
     * @param end the upper bound of the range of notif param srvs (not inclusive)
     * @return the range of matching notif param srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParamSrv> findByServiceId(long serviceId, int start,
        int end) throws SystemException {
        return findByServiceId(serviceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the notif param srvs where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of notif param srvs
     * @param end the upper bound of the range of notif param srvs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching notif param srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParamSrv> findByServiceId(long serviceId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
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

        List<NotifParamSrv> list = (List<NotifParamSrv>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (NotifParamSrv notifParamSrv : list) {
                if ((serviceId != notifParamSrv.getServiceId())) {
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

            query.append(_SQL_SELECT_NOTIFPARAMSRV_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(NotifParamSrvModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

                if (!pagination) {
                    list = (List<NotifParamSrv>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifParamSrv>(list);
                } else {
                    list = (List<NotifParamSrv>) QueryUtil.list(q,
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
     * Returns the first notif param srv in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif param srv
     * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a matching notif param srv could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv findByServiceId_First(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamSrvException, SystemException {
        NotifParamSrv notifParamSrv = fetchByServiceId_First(serviceId,
                orderByComparator);

        if (notifParamSrv != null) {
            return notifParamSrv;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifParamSrvException(msg.toString());
    }

    /**
     * Returns the first notif param srv in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif param srv, or <code>null</code> if a matching notif param srv could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv fetchByServiceId_First(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<NotifParamSrv> list = findByServiceId(serviceId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last notif param srv in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif param srv
     * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a matching notif param srv could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv findByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamSrvException, SystemException {
        NotifParamSrv notifParamSrv = fetchByServiceId_Last(serviceId,
                orderByComparator);

        if (notifParamSrv != null) {
            return notifParamSrv;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifParamSrvException(msg.toString());
    }

    /**
     * Returns the last notif param srv in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif param srv, or <code>null</code> if a matching notif param srv could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv fetchByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByServiceId(serviceId);

        if (count == 0) {
            return null;
        }

        List<NotifParamSrv> list = findByServiceId(serviceId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the notif param srvs before and after the current notif param srv in the ordered set where serviceId = &#63;.
     *
     * @param notifParamSrvPK the primary key of the current notif param srv
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next notif param srv
     * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a notif param srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv[] findByServiceId_PrevAndNext(
        NotifParamSrvPK notifParamSrvPK, long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamSrvException, SystemException {
        NotifParamSrv notifParamSrv = findByPrimaryKey(notifParamSrvPK);

        Session session = null;

        try {
            session = openSession();

            NotifParamSrv[] array = new NotifParamSrvImpl[3];

            array[0] = getByServiceId_PrevAndNext(session, notifParamSrv,
                    serviceId, orderByComparator, true);

            array[1] = notifParamSrv;

            array[2] = getByServiceId_PrevAndNext(session, notifParamSrv,
                    serviceId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected NotifParamSrv getByServiceId_PrevAndNext(Session session,
        NotifParamSrv notifParamSrv, long serviceId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_NOTIFPARAMSRV_WHERE);

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
            query.append(NotifParamSrvModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(notifParamSrv);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<NotifParamSrv> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the notif param srvs where serviceId = &#63; from the database.
     *
     * @param serviceId the service ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByServiceId(long serviceId) throws SystemException {
        for (NotifParamSrv notifParamSrv : findByServiceId(serviceId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(notifParamSrv);
        }
    }

    /**
     * Returns the number of notif param srvs where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the number of matching notif param srvs
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

            query.append(_SQL_COUNT_NOTIFPARAMSRV_WHERE);

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
     * Caches the notif param srv in the entity cache if it is enabled.
     *
     * @param notifParamSrv the notif param srv
     */
    @Override
    public void cacheResult(NotifParamSrv notifParamSrv) {
        EntityCacheUtil.putResult(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvImpl.class, notifParamSrv.getPrimaryKey(),
            notifParamSrv);

        notifParamSrv.resetOriginalValues();
    }

    /**
     * Caches the notif param srvs in the entity cache if it is enabled.
     *
     * @param notifParamSrvs the notif param srvs
     */
    @Override
    public void cacheResult(List<NotifParamSrv> notifParamSrvs) {
        for (NotifParamSrv notifParamSrv : notifParamSrvs) {
            if (EntityCacheUtil.getResult(
                        NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
                        NotifParamSrvImpl.class, notifParamSrv.getPrimaryKey()) == null) {
                cacheResult(notifParamSrv);
            } else {
                notifParamSrv.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all notif param srvs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(NotifParamSrvImpl.class.getName());
        }

        EntityCacheUtil.clearCache(NotifParamSrvImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the notif param srv.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(NotifParamSrv notifParamSrv) {
        EntityCacheUtil.removeResult(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvImpl.class, notifParamSrv.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<NotifParamSrv> notifParamSrvs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (NotifParamSrv notifParamSrv : notifParamSrvs) {
            EntityCacheUtil.removeResult(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
                NotifParamSrvImpl.class, notifParamSrv.getPrimaryKey());
        }
    }

    /**
     * Creates a new notif param srv with the primary key. Does not add the notif param srv to the database.
     *
     * @param notifParamSrvPK the primary key for the new notif param srv
     * @return the new notif param srv
     */
    @Override
    public NotifParamSrv create(NotifParamSrvPK notifParamSrvPK) {
        NotifParamSrv notifParamSrv = new NotifParamSrvImpl();

        notifParamSrv.setNew(true);
        notifParamSrv.setPrimaryKey(notifParamSrvPK);

        return notifParamSrv;
    }

    /**
     * Removes the notif param srv with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param notifParamSrvPK the primary key of the notif param srv
     * @return the notif param srv that was removed
     * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a notif param srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv remove(NotifParamSrvPK notifParamSrvPK)
        throws NoSuchNotifParamSrvException, SystemException {
        return remove((Serializable) notifParamSrvPK);
    }

    /**
     * Removes the notif param srv with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the notif param srv
     * @return the notif param srv that was removed
     * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a notif param srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv remove(Serializable primaryKey)
        throws NoSuchNotifParamSrvException, SystemException {
        Session session = null;

        try {
            session = openSession();

            NotifParamSrv notifParamSrv = (NotifParamSrv) session.get(NotifParamSrvImpl.class,
                    primaryKey);

            if (notifParamSrv == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchNotifParamSrvException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(notifParamSrv);
        } catch (NoSuchNotifParamSrvException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected NotifParamSrv removeImpl(NotifParamSrv notifParamSrv)
        throws SystemException {
        notifParamSrv = toUnwrappedModel(notifParamSrv);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(notifParamSrv)) {
                notifParamSrv = (NotifParamSrv) session.get(NotifParamSrvImpl.class,
                        notifParamSrv.getPrimaryKeyObj());
            }

            if (notifParamSrv != null) {
                session.delete(notifParamSrv);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (notifParamSrv != null) {
            clearCache(notifParamSrv);
        }

        return notifParamSrv;
    }

    @Override
    public NotifParamSrv updateImpl(
        com.stc.echannels.epayments.model.NotifParamSrv notifParamSrv)
        throws SystemException {
        notifParamSrv = toUnwrappedModel(notifParamSrv);

        boolean isNew = notifParamSrv.isNew();

        NotifParamSrvModelImpl notifParamSrvModelImpl = (NotifParamSrvModelImpl) notifParamSrv;

        Session session = null;

        try {
            session = openSession();

            if (notifParamSrv.isNew()) {
                session.save(notifParamSrv);

                notifParamSrv.setNew(false);
            } else {
                session.merge(notifParamSrv);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !NotifParamSrvModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((notifParamSrvModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        notifParamSrvModelImpl.getOriginalServiceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] { notifParamSrvModelImpl.getServiceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamSrvImpl.class, notifParamSrv.getPrimaryKey(),
            notifParamSrv);

        return notifParamSrv;
    }

    protected NotifParamSrv toUnwrappedModel(NotifParamSrv notifParamSrv) {
        if (notifParamSrv instanceof NotifParamSrvImpl) {
            return notifParamSrv;
        }

        NotifParamSrvImpl notifParamSrvImpl = new NotifParamSrvImpl();

        notifParamSrvImpl.setNew(notifParamSrv.isNew());
        notifParamSrvImpl.setPrimaryKey(notifParamSrv.getPrimaryKey());

        notifParamSrvImpl.setNotifParamId(notifParamSrv.getNotifParamId());
        notifParamSrvImpl.setServiceId(notifParamSrv.getServiceId());

        return notifParamSrvImpl;
    }

    /**
     * Returns the notif param srv with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the notif param srv
     * @return the notif param srv
     * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a notif param srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv findByPrimaryKey(Serializable primaryKey)
        throws NoSuchNotifParamSrvException, SystemException {
        NotifParamSrv notifParamSrv = fetchByPrimaryKey(primaryKey);

        if (notifParamSrv == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchNotifParamSrvException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return notifParamSrv;
    }

    /**
     * Returns the notif param srv with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchNotifParamSrvException} if it could not be found.
     *
     * @param notifParamSrvPK the primary key of the notif param srv
     * @return the notif param srv
     * @throws com.stc.echannels.epayments.NoSuchNotifParamSrvException if a notif param srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv findByPrimaryKey(NotifParamSrvPK notifParamSrvPK)
        throws NoSuchNotifParamSrvException, SystemException {
        return findByPrimaryKey((Serializable) notifParamSrvPK);
    }

    /**
     * Returns the notif param srv with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the notif param srv
     * @return the notif param srv, or <code>null</code> if a notif param srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        NotifParamSrv notifParamSrv = (NotifParamSrv) EntityCacheUtil.getResult(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
                NotifParamSrvImpl.class, primaryKey);

        if (notifParamSrv == _nullNotifParamSrv) {
            return null;
        }

        if (notifParamSrv == null) {
            Session session = null;

            try {
                session = openSession();

                notifParamSrv = (NotifParamSrv) session.get(NotifParamSrvImpl.class,
                        primaryKey);

                if (notifParamSrv != null) {
                    cacheResult(notifParamSrv);
                } else {
                    EntityCacheUtil.putResult(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
                        NotifParamSrvImpl.class, primaryKey, _nullNotifParamSrv);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(NotifParamSrvModelImpl.ENTITY_CACHE_ENABLED,
                    NotifParamSrvImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return notifParamSrv;
    }

    /**
     * Returns the notif param srv with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param notifParamSrvPK the primary key of the notif param srv
     * @return the notif param srv, or <code>null</code> if a notif param srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParamSrv fetchByPrimaryKey(NotifParamSrvPK notifParamSrvPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) notifParamSrvPK);
    }

    /**
     * Returns all the notif param srvs.
     *
     * @return the notif param srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParamSrv> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif param srvs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of notif param srvs
     * @param end the upper bound of the range of notif param srvs (not inclusive)
     * @return the range of notif param srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParamSrv> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the notif param srvs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of notif param srvs
     * @param end the upper bound of the range of notif param srvs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of notif param srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParamSrv> findAll(int start, int end,
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

        List<NotifParamSrv> list = (List<NotifParamSrv>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_NOTIFPARAMSRV);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_NOTIFPARAMSRV;

                if (pagination) {
                    sql = sql.concat(NotifParamSrvModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<NotifParamSrv>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifParamSrv>(list);
                } else {
                    list = (List<NotifParamSrv>) QueryUtil.list(q,
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
     * Removes all the notif param srvs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (NotifParamSrv notifParamSrv : findAll()) {
            remove(notifParamSrv);
        }
    }

    /**
     * Returns the number of notif param srvs.
     *
     * @return the number of notif param srvs
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

                Query q = session.createQuery(_SQL_COUNT_NOTIFPARAMSRV);

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
     * Initializes the notif param srv persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.NotifParamSrv")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<NotifParamSrv>> listenersList = new ArrayList<ModelListener<NotifParamSrv>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<NotifParamSrv>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(NotifParamSrvImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
