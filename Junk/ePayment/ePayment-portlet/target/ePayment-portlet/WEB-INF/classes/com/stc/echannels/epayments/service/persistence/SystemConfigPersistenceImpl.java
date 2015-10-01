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

import com.stc.echannels.epayments.NoSuchSystemConfigException;
import com.stc.echannels.epayments.model.SystemConfig;
import com.stc.echannels.epayments.model.impl.SystemConfigImpl;
import com.stc.echannels.epayments.model.impl.SystemConfigModelImpl;
import com.stc.echannels.epayments.service.persistence.SystemConfigPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the system config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see SystemConfigPersistence
 * @see SystemConfigUtil
 * @generated
 */
public class SystemConfigPersistenceImpl extends BasePersistenceImpl<SystemConfig>
    implements SystemConfigPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SystemConfigUtil} to access the system config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SystemConfigImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { String.class.getName() },
            SystemConfigModelImpl.STATUS_COLUMN_BITMASK |
            SystemConfigModelImpl.SERVICEID_COLUMN_BITMASK |
            SystemConfigModelImpl.BANKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "systemConfig.status IS NULL";
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "systemConfig.status = ?";
    private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(systemConfig.status IS NULL OR systemConfig.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServiceId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServiceId",
            new String[] { Long.class.getName(), String.class.getName() },
            SystemConfigModelImpl.SERVICEID_COLUMN_BITMASK |
            SystemConfigModelImpl.STATUS_COLUMN_BITMASK |
            SystemConfigModelImpl.BANKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceId",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "systemConfig.serviceId = ? AND ";
    private static final String _FINDER_COLUMN_SERVICEID_STATUS_1 = "systemConfig.status IS NULL";
    private static final String _FINDER_COLUMN_SERVICEID_STATUS_2 = "systemConfig.status = ?";
    private static final String _FINDER_COLUMN_SERVICEID_STATUS_3 = "(systemConfig.status IS NULL OR systemConfig.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBankId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID =
        new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, SystemConfigImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBankId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                String.class.getName()
            },
            SystemConfigModelImpl.SERVICEID_COLUMN_BITMASK |
            SystemConfigModelImpl.BANKID_COLUMN_BITMASK |
            SystemConfigModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKID = new FinderPath(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBankId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                String.class.getName()
            });
    private static final String _FINDER_COLUMN_BANKID_SERVICEID_2 = "systemConfig.serviceId = ? AND ";
    private static final String _FINDER_COLUMN_BANKID_BANKID_1 = "systemConfig.bankId IS NULL AND ";
    private static final String _FINDER_COLUMN_BANKID_BANKID_2 = "systemConfig.bankId = ? AND ";
    private static final String _FINDER_COLUMN_BANKID_BANKID_3 = "(systemConfig.bankId IS NULL OR systemConfig.bankId = '') AND ";
    private static final String _FINDER_COLUMN_BANKID_STATUS_1 = "systemConfig.status IS NULL";
    private static final String _FINDER_COLUMN_BANKID_STATUS_2 = "systemConfig.status = ?";
    private static final String _FINDER_COLUMN_BANKID_STATUS_3 = "(systemConfig.status IS NULL OR systemConfig.status = '')";
    private static final String _SQL_SELECT_SYSTEMCONFIG = "SELECT systemConfig FROM SystemConfig systemConfig";
    private static final String _SQL_SELECT_SYSTEMCONFIG_WHERE = "SELECT systemConfig FROM SystemConfig systemConfig WHERE ";
    private static final String _SQL_COUNT_SYSTEMCONFIG = "SELECT COUNT(systemConfig) FROM SystemConfig systemConfig";
    private static final String _SQL_COUNT_SYSTEMCONFIG_WHERE = "SELECT COUNT(systemConfig) FROM SystemConfig systemConfig WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "systemConfig.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SystemConfig exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SystemConfig exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SystemConfigPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "transId", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp", "clientIp",
                "serverIp", "userAgent", "operation", "serviceId", "bankId",
                "config"
            });
    private static SystemConfig _nullSystemConfig = new SystemConfigImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SystemConfig> toCacheModel() {
                return _nullSystemConfigCacheModel;
            }
        };

    private static CacheModel<SystemConfig> _nullSystemConfigCacheModel = new CacheModel<SystemConfig>() {
            @Override
            public SystemConfig toEntityModel() {
                return _nullSystemConfig;
            }
        };

    public SystemConfigPersistenceImpl() {
        setModelClass(SystemConfig.class);
    }

    /**
     * Returns all the system configs where status = &#63;.
     *
     * @param status the status
     * @return the matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByStatus(String status)
        throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the system configs where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of system configs
     * @param end the upper bound of the range of system configs (not inclusive)
     * @return the range of matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByStatus(String status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the system configs where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of system configs
     * @param end the upper bound of the range of system configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByStatus(String status, int start, int end,
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

        List<SystemConfig> list = (List<SystemConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SystemConfig systemConfig : list) {
                if (!Validator.equals(status, systemConfig.getStatus())) {
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

            query.append(_SQL_SELECT_SYSTEMCONFIG_WHERE);

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
                query.append(SystemConfigModelImpl.ORDER_BY_JPQL);
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
                    list = (List<SystemConfig>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SystemConfig>(list);
                } else {
                    list = (List<SystemConfig>) QueryUtil.list(q, getDialect(),
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
     * Returns the first system config in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig findByStatus_First(String status,
        OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = fetchByStatus_First(status,
                orderByComparator);

        if (systemConfig != null) {
            return systemConfig;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSystemConfigException(msg.toString());
    }

    /**
     * Returns the first system config in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching system config, or <code>null</code> if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig fetchByStatus_First(String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<SystemConfig> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last system config in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig findByStatus_Last(String status,
        OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = fetchByStatus_Last(status, orderByComparator);

        if (systemConfig != null) {
            return systemConfig;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSystemConfigException(msg.toString());
    }

    /**
     * Returns the last system config in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching system config, or <code>null</code> if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig fetchByStatus_Last(String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<SystemConfig> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the system configs before and after the current system config in the ordered set where status = &#63;.
     *
     * @param transId the primary key of the current system config
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig[] findByStatus_PrevAndNext(String transId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            SystemConfig[] array = new SystemConfigImpl[3];

            array[0] = getByStatus_PrevAndNext(session, systemConfig, status,
                    orderByComparator, true);

            array[1] = systemConfig;

            array[2] = getByStatus_PrevAndNext(session, systemConfig, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SystemConfig getByStatus_PrevAndNext(Session session,
        SystemConfig systemConfig, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SYSTEMCONFIG_WHERE);

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
            query.append(SystemConfigModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(systemConfig);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SystemConfig> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the system configs where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(String status) throws SystemException {
        for (SystemConfig systemConfig : findByStatus(status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(systemConfig);
        }
    }

    /**
     * Returns the number of system configs where status = &#63;.
     *
     * @param status the status
     * @return the number of matching system configs
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

            query.append(_SQL_COUNT_SYSTEMCONFIG_WHERE);

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
     * Returns all the system configs where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @return the matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByServiceId(long serviceId, String status)
        throws SystemException {
        return findByServiceId(serviceId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the system configs where serviceId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param status the status
     * @param start the lower bound of the range of system configs
     * @param end the upper bound of the range of system configs (not inclusive)
     * @return the range of matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByServiceId(long serviceId, String status,
        int start, int end) throws SystemException {
        return findByServiceId(serviceId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the system configs where serviceId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param status the status
     * @param start the lower bound of the range of system configs
     * @param end the upper bound of the range of system configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByServiceId(long serviceId, String status,
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

        List<SystemConfig> list = (List<SystemConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SystemConfig systemConfig : list) {
                if ((serviceId != systemConfig.getServiceId()) ||
                        !Validator.equals(status, systemConfig.getStatus())) {
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

            query.append(_SQL_SELECT_SYSTEMCONFIG_WHERE);

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
                query.append(SystemConfigModelImpl.ORDER_BY_JPQL);
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
                    list = (List<SystemConfig>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SystemConfig>(list);
                } else {
                    list = (List<SystemConfig>) QueryUtil.list(q, getDialect(),
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
     * Returns the first system config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig findByServiceId_First(long serviceId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = fetchByServiceId_First(serviceId, status,
                orderByComparator);

        if (systemConfig != null) {
            return systemConfig;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSystemConfigException(msg.toString());
    }

    /**
     * Returns the first system config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching system config, or <code>null</code> if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig fetchByServiceId_First(long serviceId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<SystemConfig> list = findByServiceId(serviceId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last system config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig findByServiceId_Last(long serviceId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = fetchByServiceId_Last(serviceId, status,
                orderByComparator);

        if (systemConfig != null) {
            return systemConfig;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSystemConfigException(msg.toString());
    }

    /**
     * Returns the last system config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching system config, or <code>null</code> if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig fetchByServiceId_Last(long serviceId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByServiceId(serviceId, status);

        if (count == 0) {
            return null;
        }

        List<SystemConfig> list = findByServiceId(serviceId, status, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the system configs before and after the current system config in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current system config
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig[] findByServiceId_PrevAndNext(String transId,
        long serviceId, String status, OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            SystemConfig[] array = new SystemConfigImpl[3];

            array[0] = getByServiceId_PrevAndNext(session, systemConfig,
                    serviceId, status, orderByComparator, true);

            array[1] = systemConfig;

            array[2] = getByServiceId_PrevAndNext(session, systemConfig,
                    serviceId, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SystemConfig getByServiceId_PrevAndNext(Session session,
        SystemConfig systemConfig, long serviceId, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SYSTEMCONFIG_WHERE);

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
            query.append(SystemConfigModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(systemConfig);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SystemConfig> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the system configs where serviceId = &#63; and status = &#63; from the database.
     *
     * @param serviceId the service ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByServiceId(long serviceId, String status)
        throws SystemException {
        for (SystemConfig systemConfig : findByServiceId(serviceId, status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(systemConfig);
        }
    }

    /**
     * Returns the number of system configs where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @return the number of matching system configs
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

            query.append(_SQL_COUNT_SYSTEMCONFIG_WHERE);

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
     * Returns all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @return the matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByBankId(long serviceId, String bankId,
        String status) throws SystemException {
        return findByBankId(serviceId, bankId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @param start the lower bound of the range of system configs
     * @param end the upper bound of the range of system configs (not inclusive)
     * @return the range of matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByBankId(long serviceId, String bankId,
        String status, int start, int end) throws SystemException {
        return findByBankId(serviceId, bankId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @param start the lower bound of the range of system configs
     * @param end the upper bound of the range of system configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findByBankId(long serviceId, String bankId,
        String status, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] { serviceId, bankId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] {
                    serviceId, bankId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<SystemConfig> list = (List<SystemConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SystemConfig systemConfig : list) {
                if ((serviceId != systemConfig.getServiceId()) ||
                        !Validator.equals(bankId, systemConfig.getBankId()) ||
                        !Validator.equals(status, systemConfig.getStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(5 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(5);
            }

            query.append(_SQL_SELECT_SYSTEMCONFIG_WHERE);

            query.append(_FINDER_COLUMN_BANKID_SERVICEID_2);

            boolean bindBankId = false;

            if (bankId == null) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_1);
            } else if (bankId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_3);
            } else {
                bindBankId = true;

                query.append(_FINDER_COLUMN_BANKID_BANKID_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_BANKID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_BANKID_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SystemConfigModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

                if (bindBankId) {
                    qPos.add(bankId);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<SystemConfig>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SystemConfig>(list);
                } else {
                    list = (List<SystemConfig>) QueryUtil.list(q, getDialect(),
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
     * Returns the first system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig findByBankId_First(long serviceId, String bankId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = fetchByBankId_First(serviceId, bankId,
                status, orderByComparator);

        if (systemConfig != null) {
            return systemConfig;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(", bankId=");
        msg.append(bankId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSystemConfigException(msg.toString());
    }

    /**
     * Returns the first system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching system config, or <code>null</code> if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig fetchByBankId_First(long serviceId, String bankId,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        List<SystemConfig> list = findByBankId(serviceId, bankId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig findByBankId_Last(long serviceId, String bankId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = fetchByBankId_Last(serviceId, bankId,
                status, orderByComparator);

        if (systemConfig != null) {
            return systemConfig;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(", bankId=");
        msg.append(bankId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSystemConfigException(msg.toString());
    }

    /**
     * Returns the last system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching system config, or <code>null</code> if a matching system config could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig fetchByBankId_Last(long serviceId, String bankId,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByBankId(serviceId, bankId, status);

        if (count == 0) {
            return null;
        }

        List<SystemConfig> list = findByBankId(serviceId, bankId, status,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the system configs before and after the current system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current system config
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig[] findByBankId_PrevAndNext(String transId,
        long serviceId, String bankId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            SystemConfig[] array = new SystemConfigImpl[3];

            array[0] = getByBankId_PrevAndNext(session, systemConfig,
                    serviceId, bankId, status, orderByComparator, true);

            array[1] = systemConfig;

            array[2] = getByBankId_PrevAndNext(session, systemConfig,
                    serviceId, bankId, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SystemConfig getByBankId_PrevAndNext(Session session,
        SystemConfig systemConfig, long serviceId, String bankId,
        String status, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SYSTEMCONFIG_WHERE);

        query.append(_FINDER_COLUMN_BANKID_SERVICEID_2);

        boolean bindBankId = false;

        if (bankId == null) {
            query.append(_FINDER_COLUMN_BANKID_BANKID_1);
        } else if (bankId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BANKID_BANKID_3);
        } else {
            bindBankId = true;

            query.append(_FINDER_COLUMN_BANKID_BANKID_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_BANKID_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BANKID_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_BANKID_STATUS_2);
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
            query.append(SystemConfigModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceId);

        if (bindBankId) {
            qPos.add(bankId);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(systemConfig);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SystemConfig> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63; from the database.
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBankId(long serviceId, String bankId, String status)
        throws SystemException {
        for (SystemConfig systemConfig : findByBankId(serviceId, bankId,
                status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(systemConfig);
        }
    }

    /**
     * Returns the number of system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param bankId the bank ID
     * @param status the status
     * @return the number of matching system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBankId(long serviceId, String bankId, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANKID;

        Object[] finderArgs = new Object[] { serviceId, bankId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_SYSTEMCONFIG_WHERE);

            query.append(_FINDER_COLUMN_BANKID_SERVICEID_2);

            boolean bindBankId = false;

            if (bankId == null) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_1);
            } else if (bankId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_3);
            } else {
                bindBankId = true;

                query.append(_FINDER_COLUMN_BANKID_BANKID_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_BANKID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_BANKID_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

                if (bindBankId) {
                    qPos.add(bankId);
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
     * Caches the system config in the entity cache if it is enabled.
     *
     * @param systemConfig the system config
     */
    @Override
    public void cacheResult(SystemConfig systemConfig) {
        EntityCacheUtil.putResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigImpl.class, systemConfig.getPrimaryKey(), systemConfig);

        systemConfig.resetOriginalValues();
    }

    /**
     * Caches the system configs in the entity cache if it is enabled.
     *
     * @param systemConfigs the system configs
     */
    @Override
    public void cacheResult(List<SystemConfig> systemConfigs) {
        for (SystemConfig systemConfig : systemConfigs) {
            if (EntityCacheUtil.getResult(
                        SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
                        SystemConfigImpl.class, systemConfig.getPrimaryKey()) == null) {
                cacheResult(systemConfig);
            } else {
                systemConfig.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all system configs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SystemConfigImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SystemConfigImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the system config.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SystemConfig systemConfig) {
        EntityCacheUtil.removeResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigImpl.class, systemConfig.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SystemConfig> systemConfigs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SystemConfig systemConfig : systemConfigs) {
            EntityCacheUtil.removeResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
                SystemConfigImpl.class, systemConfig.getPrimaryKey());
        }
    }

    /**
     * Creates a new system config with the primary key. Does not add the system config to the database.
     *
     * @param transId the primary key for the new system config
     * @return the new system config
     */
    @Override
    public SystemConfig create(String transId) {
        SystemConfig systemConfig = new SystemConfigImpl();

        systemConfig.setNew(true);
        systemConfig.setPrimaryKey(transId);

        return systemConfig;
    }

    /**
     * Removes the system config with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param transId the primary key of the system config
     * @return the system config that was removed
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig remove(String transId)
        throws NoSuchSystemConfigException, SystemException {
        return remove((Serializable) transId);
    }

    /**
     * Removes the system config with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the system config
     * @return the system config that was removed
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig remove(Serializable primaryKey)
        throws NoSuchSystemConfigException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SystemConfig systemConfig = (SystemConfig) session.get(SystemConfigImpl.class,
                    primaryKey);

            if (systemConfig == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSystemConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(systemConfig);
        } catch (NoSuchSystemConfigException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SystemConfig removeImpl(SystemConfig systemConfig)
        throws SystemException {
        systemConfig = toUnwrappedModel(systemConfig);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(systemConfig)) {
                systemConfig = (SystemConfig) session.get(SystemConfigImpl.class,
                        systemConfig.getPrimaryKeyObj());
            }

            if (systemConfig != null) {
                session.delete(systemConfig);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (systemConfig != null) {
            clearCache(systemConfig);
        }

        return systemConfig;
    }

    @Override
    public SystemConfig updateImpl(
        com.stc.echannels.epayments.model.SystemConfig systemConfig)
        throws SystemException {
        systemConfig = toUnwrappedModel(systemConfig);

        boolean isNew = systemConfig.isNew();

        SystemConfigModelImpl systemConfigModelImpl = (SystemConfigModelImpl) systemConfig;

        Session session = null;

        try {
            session = openSession();

            if (systemConfig.isNew()) {
                session.save(systemConfig);

                systemConfig.setNew(false);
            } else {
                session.merge(systemConfig);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SystemConfigModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((systemConfigModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        systemConfigModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { systemConfigModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }

            if ((systemConfigModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        systemConfigModelImpl.getOriginalServiceId(),
                        systemConfigModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] {
                        systemConfigModelImpl.getServiceId(),
                        systemConfigModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }

            if ((systemConfigModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        systemConfigModelImpl.getOriginalServiceId(),
                        systemConfigModelImpl.getOriginalBankId(),
                        systemConfigModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);

                args = new Object[] {
                        systemConfigModelImpl.getServiceId(),
                        systemConfigModelImpl.getBankId(),
                        systemConfigModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);
            }
        }

        EntityCacheUtil.putResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
            SystemConfigImpl.class, systemConfig.getPrimaryKey(), systemConfig);

        return systemConfig;
    }

    protected SystemConfig toUnwrappedModel(SystemConfig systemConfig) {
        if (systemConfig instanceof SystemConfigImpl) {
            return systemConfig;
        }

        SystemConfigImpl systemConfigImpl = new SystemConfigImpl();

        systemConfigImpl.setNew(systemConfig.isNew());
        systemConfigImpl.setPrimaryKey(systemConfig.getPrimaryKey());

        systemConfigImpl.setTransId(systemConfig.getTransId());
        systemConfigImpl.setLastUpdateTimestamp(systemConfig.getLastUpdateTimestamp());
        systemConfigImpl.setLastUpdateUserid(systemConfig.getLastUpdateUserid());
        systemConfigImpl.setLastUpdateUsername(systemConfig.getLastUpdateUsername());
        systemConfigImpl.setStatus(systemConfig.getStatus());
        systemConfigImpl.setEffectiveTimestamp(systemConfig.getEffectiveTimestamp());
        systemConfigImpl.setClientIp(systemConfig.getClientIp());
        systemConfigImpl.setServerIp(systemConfig.getServerIp());
        systemConfigImpl.setUserAgent(systemConfig.getUserAgent());
        systemConfigImpl.setOperation(systemConfig.getOperation());
        systemConfigImpl.setServiceId(systemConfig.getServiceId());
        systemConfigImpl.setBankId(systemConfig.getBankId());
        systemConfigImpl.setConfig(systemConfig.getConfig());

        return systemConfigImpl;
    }

    /**
     * Returns the system config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the system config
     * @return the system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSystemConfigException, SystemException {
        SystemConfig systemConfig = fetchByPrimaryKey(primaryKey);

        if (systemConfig == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSystemConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return systemConfig;
    }

    /**
     * Returns the system config with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchSystemConfigException} if it could not be found.
     *
     * @param transId the primary key of the system config
     * @return the system config
     * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig findByPrimaryKey(String transId)
        throws NoSuchSystemConfigException, SystemException {
        return findByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns the system config with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the system config
     * @return the system config, or <code>null</code> if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SystemConfig systemConfig = (SystemConfig) EntityCacheUtil.getResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
                SystemConfigImpl.class, primaryKey);

        if (systemConfig == _nullSystemConfig) {
            return null;
        }

        if (systemConfig == null) {
            Session session = null;

            try {
                session = openSession();

                systemConfig = (SystemConfig) session.get(SystemConfigImpl.class,
                        primaryKey);

                if (systemConfig != null) {
                    cacheResult(systemConfig);
                } else {
                    EntityCacheUtil.putResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
                        SystemConfigImpl.class, primaryKey, _nullSystemConfig);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SystemConfigModelImpl.ENTITY_CACHE_ENABLED,
                    SystemConfigImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return systemConfig;
    }

    /**
     * Returns the system config with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param transId the primary key of the system config
     * @return the system config, or <code>null</code> if a system config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SystemConfig fetchByPrimaryKey(String transId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns all the system configs.
     *
     * @return the system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the system configs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of system configs
     * @param end the upper bound of the range of system configs (not inclusive)
     * @return the range of system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the system configs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of system configs
     * @param end the upper bound of the range of system configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of system configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SystemConfig> findAll(int start, int end,
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

        List<SystemConfig> list = (List<SystemConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SYSTEMCONFIG);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SYSTEMCONFIG;

                if (pagination) {
                    sql = sql.concat(SystemConfigModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SystemConfig>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SystemConfig>(list);
                } else {
                    list = (List<SystemConfig>) QueryUtil.list(q, getDialect(),
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
     * Removes all the system configs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SystemConfig systemConfig : findAll()) {
            remove(systemConfig);
        }
    }

    /**
     * Returns the number of system configs.
     *
     * @return the number of system configs
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

                Query q = session.createQuery(_SQL_COUNT_SYSTEMCONFIG);

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
     * Initializes the system config persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.SystemConfig")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SystemConfig>> listenersList = new ArrayList<ModelListener<SystemConfig>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SystemConfig>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SystemConfigImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
