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

import com.stc.echannels.epayments.NoSuchNotifConfigException;
import com.stc.echannels.epayments.model.NotifConfig;
import com.stc.echannels.epayments.model.impl.NotifConfigImpl;
import com.stc.echannels.epayments.model.impl.NotifConfigModelImpl;
import com.stc.echannels.epayments.service.persistence.NotifConfigPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the notif config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifConfigPersistence
 * @see NotifConfigUtil
 * @generated
 */
public class NotifConfigPersistenceImpl extends BasePersistenceImpl<NotifConfig>
    implements NotifConfigPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link NotifConfigUtil} to access the notif config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = NotifConfigImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, NotifConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, NotifConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, NotifConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, NotifConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { String.class.getName() },
            NotifConfigModelImpl.STATUS_COLUMN_BITMASK |
            NotifConfigModelImpl.NOTIFNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "notifConfig.status IS NULL";
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "notifConfig.status = ?";
    private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(notifConfig.status IS NULL OR notifConfig.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, NotifConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServiceId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, NotifConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServiceId",
            new String[] { Long.class.getName(), String.class.getName() },
            NotifConfigModelImpl.SERVICEID_COLUMN_BITMASK |
            NotifConfigModelImpl.STATUS_COLUMN_BITMASK |
            NotifConfigModelImpl.NOTIFNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceId",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "notifConfig.serviceId = ? AND ";
    private static final String _FINDER_COLUMN_SERVICEID_STATUS_1 = "notifConfig.status IS NULL";
    private static final String _FINDER_COLUMN_SERVICEID_STATUS_2 = "notifConfig.status = ?";
    private static final String _FINDER_COLUMN_SERVICEID_STATUS_3 = "(notifConfig.status IS NULL OR notifConfig.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOTIFID = new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, NotifConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNotifId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFID =
        new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, NotifConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNotifId",
            new String[] { Long.class.getName(), String.class.getName() },
            NotifConfigModelImpl.NOTIFID_COLUMN_BITMASK |
            NotifConfigModelImpl.STATUS_COLUMN_BITMASK |
            NotifConfigModelImpl.NOTIFNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NOTIFID = new FinderPath(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNotifId",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_NOTIFID_NOTIFID_2 = "notifConfig.notifId = ? AND ";
    private static final String _FINDER_COLUMN_NOTIFID_STATUS_1 = "notifConfig.status IS NULL";
    private static final String _FINDER_COLUMN_NOTIFID_STATUS_2 = "notifConfig.status = ?";
    private static final String _FINDER_COLUMN_NOTIFID_STATUS_3 = "(notifConfig.status IS NULL OR notifConfig.status = '')";
    private static final String _SQL_SELECT_NOTIFCONFIG = "SELECT notifConfig FROM NotifConfig notifConfig";
    private static final String _SQL_SELECT_NOTIFCONFIG_WHERE = "SELECT notifConfig FROM NotifConfig notifConfig WHERE ";
    private static final String _SQL_COUNT_NOTIFCONFIG = "SELECT COUNT(notifConfig) FROM NotifConfig notifConfig";
    private static final String _SQL_COUNT_NOTIFCONFIG_WHERE = "SELECT COUNT(notifConfig) FROM NotifConfig notifConfig WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "notifConfig.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NotifConfig exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NotifConfig exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(NotifConfigPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "notifId", "transId", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp", "clientIp",
                "serverIp", "userAgent", "operation", "enabled", "msgEn",
                "msgAr", "param1", "param2", "param3", "param4", "param5",
                "decriptiveNameEn", "decriptiveNameAr", "notifName", "serviceId"
            });
    private static NotifConfig _nullNotifConfig = new NotifConfigImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<NotifConfig> toCacheModel() {
                return _nullNotifConfigCacheModel;
            }
        };

    private static CacheModel<NotifConfig> _nullNotifConfigCacheModel = new CacheModel<NotifConfig>() {
            @Override
            public NotifConfig toEntityModel() {
                return _nullNotifConfig;
            }
        };

    public NotifConfigPersistenceImpl() {
        setModelClass(NotifConfig.class);
    }

    /**
     * Returns all the notif configs where status = &#63;.
     *
     * @param status the status
     * @return the matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByStatus(String status)
        throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif configs where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of notif configs
     * @param end the upper bound of the range of notif configs (not inclusive)
     * @return the range of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByStatus(String status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the notif configs where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of notif configs
     * @param end the upper bound of the range of notif configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByStatus(String status, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
            finderArgs = new Object[] { status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
            finderArgs = new Object[] { status, start, end, orderByComparator };
        }

        List<NotifConfig> list = (List<NotifConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (NotifConfig notifConfig : list) {
                if (!Validator.equals(status, notifConfig.getStatus())) {
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

            query.append(_SQL_SELECT_NOTIFCONFIG_WHERE);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_STATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_STATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_STATUS_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(NotifConfigModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<NotifConfig>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifConfig>(list);
                } else {
                    list = (List<NotifConfig>) QueryUtil.list(q, getDialect(),
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
     * Returns the first notif config in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig findByStatus_First(String status,
        OrderByComparator orderByComparator)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = fetchByStatus_First(status, orderByComparator);

        if (notifConfig != null) {
            return notifConfig;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifConfigException(msg.toString());
    }

    /**
     * Returns the first notif config in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig fetchByStatus_First(String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<NotifConfig> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last notif config in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig findByStatus_Last(String status,
        OrderByComparator orderByComparator)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = fetchByStatus_Last(status, orderByComparator);

        if (notifConfig != null) {
            return notifConfig;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifConfigException(msg.toString());
    }

    /**
     * Returns the last notif config in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig fetchByStatus_Last(String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<NotifConfig> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the notif configs before and after the current notif config in the ordered set where status = &#63;.
     *
     * @param notifId the primary key of the current notif config
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig[] findByStatus_PrevAndNext(long notifId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = findByPrimaryKey(notifId);

        Session session = null;

        try {
            session = openSession();

            NotifConfig[] array = new NotifConfigImpl[3];

            array[0] = getByStatus_PrevAndNext(session, notifConfig, status,
                    orderByComparator, true);

            array[1] = notifConfig;

            array[2] = getByStatus_PrevAndNext(session, notifConfig, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected NotifConfig getByStatus_PrevAndNext(Session session,
        NotifConfig notifConfig, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_NOTIFCONFIG_WHERE);

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_STATUS_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_STATUS_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_STATUS_STATUS_2);
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
            query.append(NotifConfigModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(notifConfig);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<NotifConfig> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the notif configs where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(String status) throws SystemException {
        for (NotifConfig notifConfig : findByStatus(status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(notifConfig);
        }
    }

    /**
     * Returns the number of notif configs where status = &#63;.
     *
     * @param status the status
     * @return the number of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByStatus(String status) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

        Object[] finderArgs = new Object[] { status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_NOTIFCONFIG_WHERE);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_STATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_STATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_STATUS_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

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
     * Returns all the notif configs where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @return the matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByServiceId(long serviceId, String status)
        throws SystemException {
        return findByServiceId(serviceId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif configs where serviceId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param status the status
     * @param start the lower bound of the range of notif configs
     * @param end the upper bound of the range of notif configs (not inclusive)
     * @return the range of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByServiceId(long serviceId, String status,
        int start, int end) throws SystemException {
        return findByServiceId(serviceId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the notif configs where serviceId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param status the status
     * @param start the lower bound of the range of notif configs
     * @param end the upper bound of the range of notif configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByServiceId(long serviceId, String status,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID;
            finderArgs = new Object[] { serviceId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID;
            finderArgs = new Object[] {
                    serviceId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<NotifConfig> list = (List<NotifConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (NotifConfig notifConfig : list) {
                if ((serviceId != notifConfig.getServiceId()) ||
                        !Validator.equals(status, notifConfig.getStatus())) {
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

            query.append(_SQL_SELECT_NOTIFCONFIG_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_SERVICEID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_SERVICEID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_SERVICEID_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(NotifConfigModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<NotifConfig>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifConfig>(list);
                } else {
                    list = (List<NotifConfig>) QueryUtil.list(q, getDialect(),
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
     * Returns the first notif config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig findByServiceId_First(long serviceId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = fetchByServiceId_First(serviceId, status,
                orderByComparator);

        if (notifConfig != null) {
            return notifConfig;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifConfigException(msg.toString());
    }

    /**
     * Returns the first notif config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig fetchByServiceId_First(long serviceId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<NotifConfig> list = findByServiceId(serviceId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last notif config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig findByServiceId_Last(long serviceId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = fetchByServiceId_Last(serviceId, status,
                orderByComparator);

        if (notifConfig != null) {
            return notifConfig;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifConfigException(msg.toString());
    }

    /**
     * Returns the last notif config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig fetchByServiceId_Last(long serviceId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByServiceId(serviceId, status);

        if (count == 0) {
            return null;
        }

        List<NotifConfig> list = findByServiceId(serviceId, status, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the notif configs before and after the current notif config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param notifId the primary key of the current notif config
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig[] findByServiceId_PrevAndNext(long notifId,
        long serviceId, String status, OrderByComparator orderByComparator)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = findByPrimaryKey(notifId);

        Session session = null;

        try {
            session = openSession();

            NotifConfig[] array = new NotifConfigImpl[3];

            array[0] = getByServiceId_PrevAndNext(session, notifConfig,
                    serviceId, status, orderByComparator, true);

            array[1] = notifConfig;

            array[2] = getByServiceId_PrevAndNext(session, notifConfig,
                    serviceId, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected NotifConfig getByServiceId_PrevAndNext(Session session,
        NotifConfig notifConfig, long serviceId, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_NOTIFCONFIG_WHERE);

        query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_SERVICEID_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_SERVICEID_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_SERVICEID_STATUS_2);
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
            query.append(NotifConfigModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceId);

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(notifConfig);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<NotifConfig> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the notif configs where serviceId = &#63; and status = &#63; from the database.
     *
     * @param serviceId the service ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByServiceId(long serviceId, String status)
        throws SystemException {
        for (NotifConfig notifConfig : findByServiceId(serviceId, status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(notifConfig);
        }
    }

    /**
     * Returns the number of notif configs where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @return the number of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByServiceId(long serviceId, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICEID;

        Object[] finderArgs = new Object[] { serviceId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_NOTIFCONFIG_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_SERVICEID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_SERVICEID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_SERVICEID_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

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
     * Returns all the notif configs where notifId = &#63; and status = &#63;.
     *
     * @param notifId the notif ID
     * @param status the status
     * @return the matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByNotifId(long notifId, String status)
        throws SystemException {
        return findByNotifId(notifId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif configs where notifId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param notifId the notif ID
     * @param status the status
     * @param start the lower bound of the range of notif configs
     * @param end the upper bound of the range of notif configs (not inclusive)
     * @return the range of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByNotifId(long notifId, String status,
        int start, int end) throws SystemException {
        return findByNotifId(notifId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the notif configs where notifId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param notifId the notif ID
     * @param status the status
     * @param start the lower bound of the range of notif configs
     * @param end the upper bound of the range of notif configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findByNotifId(long notifId, String status,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFID;
            finderArgs = new Object[] { notifId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOTIFID;
            finderArgs = new Object[] {
                    notifId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<NotifConfig> list = (List<NotifConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (NotifConfig notifConfig : list) {
                if ((notifId != notifConfig.getNotifId()) ||
                        !Validator.equals(status, notifConfig.getStatus())) {
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

            query.append(_SQL_SELECT_NOTIFCONFIG_WHERE);

            query.append(_FINDER_COLUMN_NOTIFID_NOTIFID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_NOTIFID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOTIFID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_NOTIFID_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(NotifConfigModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(notifId);

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<NotifConfig>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifConfig>(list);
                } else {
                    list = (List<NotifConfig>) QueryUtil.list(q, getDialect(),
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
     * Returns the first notif config in the ordered set where notifId = &#63; and status = &#63;.
     *
     * @param notifId the notif ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig findByNotifId_First(long notifId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = fetchByNotifId_First(notifId, status,
                orderByComparator);

        if (notifConfig != null) {
            return notifConfig;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("notifId=");
        msg.append(notifId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifConfigException(msg.toString());
    }

    /**
     * Returns the first notif config in the ordered set where notifId = &#63; and status = &#63;.
     *
     * @param notifId the notif ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig fetchByNotifId_First(long notifId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<NotifConfig> list = findByNotifId(notifId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last notif config in the ordered set where notifId = &#63; and status = &#63;.
     *
     * @param notifId the notif ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig findByNotifId_Last(long notifId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = fetchByNotifId_Last(notifId, status,
                orderByComparator);

        if (notifConfig != null) {
            return notifConfig;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("notifId=");
        msg.append(notifId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifConfigException(msg.toString());
    }

    /**
     * Returns the last notif config in the ordered set where notifId = &#63; and status = &#63;.
     *
     * @param notifId the notif ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig fetchByNotifId_Last(long notifId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByNotifId(notifId, status);

        if (count == 0) {
            return null;
        }

        List<NotifConfig> list = findByNotifId(notifId, status, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the notif configs where notifId = &#63; and status = &#63; from the database.
     *
     * @param notifId the notif ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByNotifId(long notifId, String status)
        throws SystemException {
        for (NotifConfig notifConfig : findByNotifId(notifId, status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(notifConfig);
        }
    }

    /**
     * Returns the number of notif configs where notifId = &#63; and status = &#63;.
     *
     * @param notifId the notif ID
     * @param status the status
     * @return the number of matching notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNotifId(long notifId, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NOTIFID;

        Object[] finderArgs = new Object[] { notifId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_NOTIFCONFIG_WHERE);

            query.append(_FINDER_COLUMN_NOTIFID_NOTIFID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_NOTIFID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOTIFID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_NOTIFID_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(notifId);

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
     * Caches the notif config in the entity cache if it is enabled.
     *
     * @param notifConfig the notif config
     */
    @Override
    public void cacheResult(NotifConfig notifConfig) {
        EntityCacheUtil.putResult(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigImpl.class, notifConfig.getPrimaryKey(), notifConfig);

        notifConfig.resetOriginalValues();
    }

    /**
     * Caches the notif configs in the entity cache if it is enabled.
     *
     * @param notifConfigs the notif configs
     */
    @Override
    public void cacheResult(List<NotifConfig> notifConfigs) {
        for (NotifConfig notifConfig : notifConfigs) {
            if (EntityCacheUtil.getResult(
                        NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
                        NotifConfigImpl.class, notifConfig.getPrimaryKey()) == null) {
                cacheResult(notifConfig);
            } else {
                notifConfig.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all notif configs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(NotifConfigImpl.class.getName());
        }

        EntityCacheUtil.clearCache(NotifConfigImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the notif config.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(NotifConfig notifConfig) {
        EntityCacheUtil.removeResult(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigImpl.class, notifConfig.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<NotifConfig> notifConfigs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (NotifConfig notifConfig : notifConfigs) {
            EntityCacheUtil.removeResult(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
                NotifConfigImpl.class, notifConfig.getPrimaryKey());
        }
    }

    /**
     * Creates a new notif config with the primary key. Does not add the notif config to the database.
     *
     * @param notifId the primary key for the new notif config
     * @return the new notif config
     */
    @Override
    public NotifConfig create(long notifId) {
        NotifConfig notifConfig = new NotifConfigImpl();

        notifConfig.setNew(true);
        notifConfig.setPrimaryKey(notifId);

        return notifConfig;
    }

    /**
     * Removes the notif config with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param notifId the primary key of the notif config
     * @return the notif config that was removed
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig remove(long notifId)
        throws NoSuchNotifConfigException, SystemException {
        return remove((Serializable) notifId);
    }

    /**
     * Removes the notif config with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the notif config
     * @return the notif config that was removed
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig remove(Serializable primaryKey)
        throws NoSuchNotifConfigException, SystemException {
        Session session = null;

        try {
            session = openSession();

            NotifConfig notifConfig = (NotifConfig) session.get(NotifConfigImpl.class,
                    primaryKey);

            if (notifConfig == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchNotifConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(notifConfig);
        } catch (NoSuchNotifConfigException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected NotifConfig removeImpl(NotifConfig notifConfig)
        throws SystemException {
        notifConfig = toUnwrappedModel(notifConfig);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(notifConfig)) {
                notifConfig = (NotifConfig) session.get(NotifConfigImpl.class,
                        notifConfig.getPrimaryKeyObj());
            }

            if (notifConfig != null) {
                session.delete(notifConfig);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (notifConfig != null) {
            clearCache(notifConfig);
        }

        return notifConfig;
    }

    @Override
    public NotifConfig updateImpl(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws SystemException {
        notifConfig = toUnwrappedModel(notifConfig);

        boolean isNew = notifConfig.isNew();

        NotifConfigModelImpl notifConfigModelImpl = (NotifConfigModelImpl) notifConfig;

        Session session = null;

        try {
            session = openSession();

            if (notifConfig.isNew()) {
                session.save(notifConfig);

                notifConfig.setNew(false);
            } else {
                session.merge(notifConfig);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !NotifConfigModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((notifConfigModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        notifConfigModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { notifConfigModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }

            if ((notifConfigModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        notifConfigModelImpl.getOriginalServiceId(),
                        notifConfigModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] {
                        notifConfigModelImpl.getServiceId(),
                        notifConfigModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }

            if ((notifConfigModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        notifConfigModelImpl.getOriginalNotifId(),
                        notifConfigModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOTIFID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFID,
                    args);

                args = new Object[] {
                        notifConfigModelImpl.getNotifId(),
                        notifConfigModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOTIFID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFID,
                    args);
            }
        }

        EntityCacheUtil.putResult(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
            NotifConfigImpl.class, notifConfig.getPrimaryKey(), notifConfig);

        return notifConfig;
    }

    protected NotifConfig toUnwrappedModel(NotifConfig notifConfig) {
        if (notifConfig instanceof NotifConfigImpl) {
            return notifConfig;
        }

        NotifConfigImpl notifConfigImpl = new NotifConfigImpl();

        notifConfigImpl.setNew(notifConfig.isNew());
        notifConfigImpl.setPrimaryKey(notifConfig.getPrimaryKey());

        notifConfigImpl.setNotifId(notifConfig.getNotifId());
        notifConfigImpl.setTransId(notifConfig.getTransId());
        notifConfigImpl.setLastUpdateTimestamp(notifConfig.getLastUpdateTimestamp());
        notifConfigImpl.setLastUpdateUserid(notifConfig.getLastUpdateUserid());
        notifConfigImpl.setLastUpdateUsername(notifConfig.getLastUpdateUsername());
        notifConfigImpl.setStatus(notifConfig.getStatus());
        notifConfigImpl.setActive(notifConfig.getActive());
        notifConfigImpl.setEffectiveTimestamp(notifConfig.getEffectiveTimestamp());
        notifConfigImpl.setClientIp(notifConfig.getClientIp());
        notifConfigImpl.setServerIp(notifConfig.getServerIp());
        notifConfigImpl.setUserAgent(notifConfig.getUserAgent());
        notifConfigImpl.setOperation(notifConfig.getOperation());
        notifConfigImpl.setEnabled(notifConfig.getEnabled());
        notifConfigImpl.setMsgEn(notifConfig.getMsgEn());
        notifConfigImpl.setMsgAr(notifConfig.getMsgAr());
        notifConfigImpl.setParam1(notifConfig.getParam1());
        notifConfigImpl.setParam2(notifConfig.getParam2());
        notifConfigImpl.setParam3(notifConfig.getParam3());
        notifConfigImpl.setParam4(notifConfig.getParam4());
        notifConfigImpl.setParam5(notifConfig.getParam5());
        notifConfigImpl.setDecriptiveNameEn(notifConfig.getDecriptiveNameEn());
        notifConfigImpl.setDecriptiveNameAr(notifConfig.getDecriptiveNameAr());
        notifConfigImpl.setNotifName(notifConfig.getNotifName());
        notifConfigImpl.setServiceId(notifConfig.getServiceId());

        return notifConfigImpl;
    }

    /**
     * Returns the notif config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the notif config
     * @return the notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig findByPrimaryKey(Serializable primaryKey)
        throws NoSuchNotifConfigException, SystemException {
        NotifConfig notifConfig = fetchByPrimaryKey(primaryKey);

        if (notifConfig == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchNotifConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return notifConfig;
    }

    /**
     * Returns the notif config with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchNotifConfigException} if it could not be found.
     *
     * @param notifId the primary key of the notif config
     * @return the notif config
     * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig findByPrimaryKey(long notifId)
        throws NoSuchNotifConfigException, SystemException {
        return findByPrimaryKey((Serializable) notifId);
    }

    /**
     * Returns the notif config with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the notif config
     * @return the notif config, or <code>null</code> if a notif config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        NotifConfig notifConfig = (NotifConfig) EntityCacheUtil.getResult(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
                NotifConfigImpl.class, primaryKey);

        if (notifConfig == _nullNotifConfig) {
            return null;
        }

        if (notifConfig == null) {
            Session session = null;

            try {
                session = openSession();

                notifConfig = (NotifConfig) session.get(NotifConfigImpl.class,
                        primaryKey);

                if (notifConfig != null) {
                    cacheResult(notifConfig);
                } else {
                    EntityCacheUtil.putResult(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
                        NotifConfigImpl.class, primaryKey, _nullNotifConfig);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(NotifConfigModelImpl.ENTITY_CACHE_ENABLED,
                    NotifConfigImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return notifConfig;
    }

    /**
     * Returns the notif config with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param notifId the primary key of the notif config
     * @return the notif config, or <code>null</code> if a notif config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifConfig fetchByPrimaryKey(long notifId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) notifId);
    }

    /**
     * Returns all the notif configs.
     *
     * @return the notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif configs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of notif configs
     * @param end the upper bound of the range of notif configs (not inclusive)
     * @return the range of notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the notif configs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of notif configs
     * @param end the upper bound of the range of notif configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of notif configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifConfig> findAll(int start, int end,
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

        List<NotifConfig> list = (List<NotifConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_NOTIFCONFIG);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_NOTIFCONFIG;

                if (pagination) {
                    sql = sql.concat(NotifConfigModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<NotifConfig>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifConfig>(list);
                } else {
                    list = (List<NotifConfig>) QueryUtil.list(q, getDialect(),
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
     * Removes all the notif configs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (NotifConfig notifConfig : findAll()) {
            remove(notifConfig);
        }
    }

    /**
     * Returns the number of notif configs.
     *
     * @return the number of notif configs
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

                Query q = session.createQuery(_SQL_COUNT_NOTIFCONFIG);

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
     * Initializes the notif config persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.NotifConfig")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<NotifConfig>> listenersList = new ArrayList<ModelListener<NotifConfig>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<NotifConfig>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(NotifConfigImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
