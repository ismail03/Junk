package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.stc.echannels.epayments.NoSuchRefundLogException;
import com.stc.echannels.epayments.model.RefundLog;
import com.stc.echannels.epayments.model.impl.RefundLogImpl;
import com.stc.echannels.epayments.model.impl.RefundLogModelImpl;
import com.stc.echannels.epayments.service.persistence.RefundLogPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the refund log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see RefundLogPersistence
 * @see RefundLogUtil
 * @generated
 */
public class RefundLogPersistenceImpl extends BasePersistenceImpl<RefundLog>
    implements RefundLogPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RefundLogUtil} to access the refund log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RefundLogImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundLogModelImpl.FINDER_CACHE_ENABLED, RefundLogImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundLogModelImpl.FINDER_CACHE_ENABLED, RefundLogImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_REFUNDLOG = "SELECT refundLog FROM RefundLog refundLog";
    private static final String _SQL_COUNT_REFUNDLOG = "SELECT COUNT(refundLog) FROM RefundLog refundLog";
    private static final String _ORDER_BY_ENTITY_ALIAS = "refundLog.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RefundLog exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RefundLogPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "refundId", "epayTransId", "amount", "submissionDate",
                "approvalDate", "status"
            });
    private static RefundLog _nullRefundLog = new RefundLogImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<RefundLog> toCacheModel() {
                return _nullRefundLogCacheModel;
            }
        };

    private static CacheModel<RefundLog> _nullRefundLogCacheModel = new CacheModel<RefundLog>() {
            @Override
            public RefundLog toEntityModel() {
                return _nullRefundLog;
            }
        };

    public RefundLogPersistenceImpl() {
        setModelClass(RefundLog.class);
    }

    /**
     * Caches the refund log in the entity cache if it is enabled.
     *
     * @param refundLog the refund log
     */
    @Override
    public void cacheResult(RefundLog refundLog) {
        EntityCacheUtil.putResult(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundLogImpl.class, refundLog.getPrimaryKey(), refundLog);

        refundLog.resetOriginalValues();
    }

    /**
     * Caches the refund logs in the entity cache if it is enabled.
     *
     * @param refundLogs the refund logs
     */
    @Override
    public void cacheResult(List<RefundLog> refundLogs) {
        for (RefundLog refundLog : refundLogs) {
            if (EntityCacheUtil.getResult(
                        RefundLogModelImpl.ENTITY_CACHE_ENABLED,
                        RefundLogImpl.class, refundLog.getPrimaryKey()) == null) {
                cacheResult(refundLog);
            } else {
                refundLog.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all refund logs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RefundLogImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RefundLogImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the refund log.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(RefundLog refundLog) {
        EntityCacheUtil.removeResult(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundLogImpl.class, refundLog.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<RefundLog> refundLogs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (RefundLog refundLog : refundLogs) {
            EntityCacheUtil.removeResult(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
                RefundLogImpl.class, refundLog.getPrimaryKey());
        }
    }

    /**
     * Creates a new refund log with the primary key. Does not add the refund log to the database.
     *
     * @param epayTransId the primary key for the new refund log
     * @return the new refund log
     */
    @Override
    public RefundLog create(String epayTransId) {
        RefundLog refundLog = new RefundLogImpl();

        refundLog.setNew(true);
        refundLog.setPrimaryKey(epayTransId);

        return refundLog;
    }

    /**
     * Removes the refund log with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param epayTransId the primary key of the refund log
     * @return the refund log that was removed
     * @throws com.stc.echannels.epayments.NoSuchRefundLogException if a refund log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundLog remove(String epayTransId)
        throws NoSuchRefundLogException, SystemException {
        return remove((Serializable) epayTransId);
    }

    /**
     * Removes the refund log with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the refund log
     * @return the refund log that was removed
     * @throws com.stc.echannels.epayments.NoSuchRefundLogException if a refund log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundLog remove(Serializable primaryKey)
        throws NoSuchRefundLogException, SystemException {
        Session session = null;

        try {
            session = openSession();

            RefundLog refundLog = (RefundLog) session.get(RefundLogImpl.class,
                    primaryKey);

            if (refundLog == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRefundLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(refundLog);
        } catch (NoSuchRefundLogException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected RefundLog removeImpl(RefundLog refundLog)
        throws SystemException {
        refundLog = toUnwrappedModel(refundLog);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(refundLog)) {
                refundLog = (RefundLog) session.get(RefundLogImpl.class,
                        refundLog.getPrimaryKeyObj());
            }

            if (refundLog != null) {
                session.delete(refundLog);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (refundLog != null) {
            clearCache(refundLog);
        }

        return refundLog;
    }

    @Override
    public RefundLog updateImpl(
        com.stc.echannels.epayments.model.RefundLog refundLog)
        throws SystemException {
        refundLog = toUnwrappedModel(refundLog);

        boolean isNew = refundLog.isNew();

        Session session = null;

        try {
            session = openSession();

            if (refundLog.isNew()) {
                session.save(refundLog);

                refundLog.setNew(false);
            } else {
                session.merge(refundLog);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundLogImpl.class, refundLog.getPrimaryKey(), refundLog);

        return refundLog;
    }

    protected RefundLog toUnwrappedModel(RefundLog refundLog) {
        if (refundLog instanceof RefundLogImpl) {
            return refundLog;
        }

        RefundLogImpl refundLogImpl = new RefundLogImpl();

        refundLogImpl.setNew(refundLog.isNew());
        refundLogImpl.setPrimaryKey(refundLog.getPrimaryKey());

        refundLogImpl.setRefundId(refundLog.getRefundId());
        refundLogImpl.setEpayTransId(refundLog.getEpayTransId());
        refundLogImpl.setAmount(refundLog.getAmount());
        refundLogImpl.setSubmissionDate(refundLog.getSubmissionDate());
        refundLogImpl.setApprovalDate(refundLog.getApprovalDate());
        refundLogImpl.setStatus(refundLog.getStatus());

        return refundLogImpl;
    }

    /**
     * Returns the refund log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the refund log
     * @return the refund log
     * @throws com.stc.echannels.epayments.NoSuchRefundLogException if a refund log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundLog findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRefundLogException, SystemException {
        RefundLog refundLog = fetchByPrimaryKey(primaryKey);

        if (refundLog == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRefundLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return refundLog;
    }

    /**
     * Returns the refund log with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchRefundLogException} if it could not be found.
     *
     * @param epayTransId the primary key of the refund log
     * @return the refund log
     * @throws com.stc.echannels.epayments.NoSuchRefundLogException if a refund log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundLog findByPrimaryKey(String epayTransId)
        throws NoSuchRefundLogException, SystemException {
        return findByPrimaryKey((Serializable) epayTransId);
    }

    /**
     * Returns the refund log with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the refund log
     * @return the refund log, or <code>null</code> if a refund log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundLog fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        RefundLog refundLog = (RefundLog) EntityCacheUtil.getResult(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
                RefundLogImpl.class, primaryKey);

        if (refundLog == _nullRefundLog) {
            return null;
        }

        if (refundLog == null) {
            Session session = null;

            try {
                session = openSession();

                refundLog = (RefundLog) session.get(RefundLogImpl.class,
                        primaryKey);

                if (refundLog != null) {
                    cacheResult(refundLog);
                } else {
                    EntityCacheUtil.putResult(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
                        RefundLogImpl.class, primaryKey, _nullRefundLog);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RefundLogModelImpl.ENTITY_CACHE_ENABLED,
                    RefundLogImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return refundLog;
    }

    /**
     * Returns the refund log with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param epayTransId the primary key of the refund log
     * @return the refund log, or <code>null</code> if a refund log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundLog fetchByPrimaryKey(String epayTransId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) epayTransId);
    }

    /**
     * Returns all the refund logs.
     *
     * @return the refund logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RefundLog> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the refund logs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of refund logs
     * @param end the upper bound of the range of refund logs (not inclusive)
     * @return the range of refund logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RefundLog> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the refund logs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of refund logs
     * @param end the upper bound of the range of refund logs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of refund logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RefundLog> findAll(int start, int end,
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

        List<RefundLog> list = (List<RefundLog>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_REFUNDLOG);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_REFUNDLOG;

                if (pagination) {
                    sql = sql.concat(RefundLogModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<RefundLog>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RefundLog>(list);
                } else {
                    list = (List<RefundLog>) QueryUtil.list(q, getDialect(),
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
     * Removes all the refund logs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (RefundLog refundLog : findAll()) {
            remove(refundLog);
        }
    }

    /**
     * Returns the number of refund logs.
     *
     * @return the number of refund logs
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

                Query q = session.createQuery(_SQL_COUNT_REFUNDLOG);

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
     * Initializes the refund log persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.RefundLog")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<RefundLog>> listenersList = new ArrayList<ModelListener<RefundLog>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<RefundLog>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RefundLogImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
