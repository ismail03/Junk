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

import com.stc.echannels.epayments.NoSuchRefundReconLogException;
import com.stc.echannels.epayments.model.RefundReconLog;
import com.stc.echannels.epayments.model.impl.RefundReconLogImpl;
import com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl;
import com.stc.echannels.epayments.service.persistence.RefundReconLogPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the refund recon log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see RefundReconLogPersistence
 * @see RefundReconLogUtil
 * @generated
 */
public class RefundReconLogPersistenceImpl extends BasePersistenceImpl<RefundReconLog>
    implements RefundReconLogPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RefundReconLogUtil} to access the refund recon log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RefundReconLogImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundReconLogModelImpl.FINDER_CACHE_ENABLED,
            RefundReconLogImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundReconLogModelImpl.FINDER_CACHE_ENABLED,
            RefundReconLogImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundReconLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_REFUNDRECONLOG = "SELECT refundReconLog FROM RefundReconLog refundReconLog";
    private static final String _SQL_COUNT_REFUNDRECONLOG = "SELECT COUNT(refundReconLog) FROM RefundReconLog refundReconLog";
    private static final String _ORDER_BY_ENTITY_ALIAS = "refundReconLog.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RefundReconLog exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RefundReconLogPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "batchId", "serviceId", "refundId", "pmtBankId",
                "pmtSystemRefundTransId", "bankRefundTransId", "effDt",
                "processDate", "refundAmount", "refundStatusCode"
            });
    private static RefundReconLog _nullRefundReconLog = new RefundReconLogImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<RefundReconLog> toCacheModel() {
                return _nullRefundReconLogCacheModel;
            }
        };

    private static CacheModel<RefundReconLog> _nullRefundReconLogCacheModel = new CacheModel<RefundReconLog>() {
            @Override
            public RefundReconLog toEntityModel() {
                return _nullRefundReconLog;
            }
        };

    public RefundReconLogPersistenceImpl() {
        setModelClass(RefundReconLog.class);
    }

    /**
     * Caches the refund recon log in the entity cache if it is enabled.
     *
     * @param refundReconLog the refund recon log
     */
    @Override
    public void cacheResult(RefundReconLog refundReconLog) {
        EntityCacheUtil.putResult(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundReconLogImpl.class, refundReconLog.getPrimaryKey(),
            refundReconLog);

        refundReconLog.resetOriginalValues();
    }

    /**
     * Caches the refund recon logs in the entity cache if it is enabled.
     *
     * @param refundReconLogs the refund recon logs
     */
    @Override
    public void cacheResult(List<RefundReconLog> refundReconLogs) {
        for (RefundReconLog refundReconLog : refundReconLogs) {
            if (EntityCacheUtil.getResult(
                        RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
                        RefundReconLogImpl.class, refundReconLog.getPrimaryKey()) == null) {
                cacheResult(refundReconLog);
            } else {
                refundReconLog.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all refund recon logs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RefundReconLogImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RefundReconLogImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the refund recon log.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(RefundReconLog refundReconLog) {
        EntityCacheUtil.removeResult(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundReconLogImpl.class, refundReconLog.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<RefundReconLog> refundReconLogs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (RefundReconLog refundReconLog : refundReconLogs) {
            EntityCacheUtil.removeResult(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
                RefundReconLogImpl.class, refundReconLog.getPrimaryKey());
        }
    }

    /**
     * Creates a new refund recon log with the primary key. Does not add the refund recon log to the database.
     *
     * @param batchId the primary key for the new refund recon log
     * @return the new refund recon log
     */
    @Override
    public RefundReconLog create(String batchId) {
        RefundReconLog refundReconLog = new RefundReconLogImpl();

        refundReconLog.setNew(true);
        refundReconLog.setPrimaryKey(batchId);

        return refundReconLog;
    }

    /**
     * Removes the refund recon log with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param batchId the primary key of the refund recon log
     * @return the refund recon log that was removed
     * @throws com.stc.echannels.epayments.NoSuchRefundReconLogException if a refund recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundReconLog remove(String batchId)
        throws NoSuchRefundReconLogException, SystemException {
        return remove((Serializable) batchId);
    }

    /**
     * Removes the refund recon log with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the refund recon log
     * @return the refund recon log that was removed
     * @throws com.stc.echannels.epayments.NoSuchRefundReconLogException if a refund recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundReconLog remove(Serializable primaryKey)
        throws NoSuchRefundReconLogException, SystemException {
        Session session = null;

        try {
            session = openSession();

            RefundReconLog refundReconLog = (RefundReconLog) session.get(RefundReconLogImpl.class,
                    primaryKey);

            if (refundReconLog == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRefundReconLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(refundReconLog);
        } catch (NoSuchRefundReconLogException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected RefundReconLog removeImpl(RefundReconLog refundReconLog)
        throws SystemException {
        refundReconLog = toUnwrappedModel(refundReconLog);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(refundReconLog)) {
                refundReconLog = (RefundReconLog) session.get(RefundReconLogImpl.class,
                        refundReconLog.getPrimaryKeyObj());
            }

            if (refundReconLog != null) {
                session.delete(refundReconLog);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (refundReconLog != null) {
            clearCache(refundReconLog);
        }

        return refundReconLog;
    }

    @Override
    public RefundReconLog updateImpl(
        com.stc.echannels.epayments.model.RefundReconLog refundReconLog)
        throws SystemException {
        refundReconLog = toUnwrappedModel(refundReconLog);

        boolean isNew = refundReconLog.isNew();

        Session session = null;

        try {
            session = openSession();

            if (refundReconLog.isNew()) {
                session.save(refundReconLog);

                refundReconLog.setNew(false);
            } else {
                session.merge(refundReconLog);
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

        EntityCacheUtil.putResult(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
            RefundReconLogImpl.class, refundReconLog.getPrimaryKey(),
            refundReconLog);

        return refundReconLog;
    }

    protected RefundReconLog toUnwrappedModel(RefundReconLog refundReconLog) {
        if (refundReconLog instanceof RefundReconLogImpl) {
            return refundReconLog;
        }

        RefundReconLogImpl refundReconLogImpl = new RefundReconLogImpl();

        refundReconLogImpl.setNew(refundReconLog.isNew());
        refundReconLogImpl.setPrimaryKey(refundReconLog.getPrimaryKey());

        refundReconLogImpl.setBatchId(refundReconLog.getBatchId());
        refundReconLogImpl.setServiceId(refundReconLog.getServiceId());
        refundReconLogImpl.setRefundId(refundReconLog.getRefundId());
        refundReconLogImpl.setPmtBankId(refundReconLog.getPmtBankId());
        refundReconLogImpl.setPmtSystemRefundTransId(refundReconLog.getPmtSystemRefundTransId());
        refundReconLogImpl.setBankRefundTransId(refundReconLog.getBankRefundTransId());
        refundReconLogImpl.setEffDt(refundReconLog.getEffDt());
        refundReconLogImpl.setProcessDate(refundReconLog.getProcessDate());
        refundReconLogImpl.setRefundAmount(refundReconLog.getRefundAmount());
        refundReconLogImpl.setRefundStatusCode(refundReconLog.getRefundStatusCode());

        return refundReconLogImpl;
    }

    /**
     * Returns the refund recon log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the refund recon log
     * @return the refund recon log
     * @throws com.stc.echannels.epayments.NoSuchRefundReconLogException if a refund recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundReconLog findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRefundReconLogException, SystemException {
        RefundReconLog refundReconLog = fetchByPrimaryKey(primaryKey);

        if (refundReconLog == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRefundReconLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return refundReconLog;
    }

    /**
     * Returns the refund recon log with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchRefundReconLogException} if it could not be found.
     *
     * @param batchId the primary key of the refund recon log
     * @return the refund recon log
     * @throws com.stc.echannels.epayments.NoSuchRefundReconLogException if a refund recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundReconLog findByPrimaryKey(String batchId)
        throws NoSuchRefundReconLogException, SystemException {
        return findByPrimaryKey((Serializable) batchId);
    }

    /**
     * Returns the refund recon log with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the refund recon log
     * @return the refund recon log, or <code>null</code> if a refund recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundReconLog fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        RefundReconLog refundReconLog = (RefundReconLog) EntityCacheUtil.getResult(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
                RefundReconLogImpl.class, primaryKey);

        if (refundReconLog == _nullRefundReconLog) {
            return null;
        }

        if (refundReconLog == null) {
            Session session = null;

            try {
                session = openSession();

                refundReconLog = (RefundReconLog) session.get(RefundReconLogImpl.class,
                        primaryKey);

                if (refundReconLog != null) {
                    cacheResult(refundReconLog);
                } else {
                    EntityCacheUtil.putResult(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
                        RefundReconLogImpl.class, primaryKey,
                        _nullRefundReconLog);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RefundReconLogModelImpl.ENTITY_CACHE_ENABLED,
                    RefundReconLogImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return refundReconLog;
    }

    /**
     * Returns the refund recon log with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param batchId the primary key of the refund recon log
     * @return the refund recon log, or <code>null</code> if a refund recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RefundReconLog fetchByPrimaryKey(String batchId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) batchId);
    }

    /**
     * Returns all the refund recon logs.
     *
     * @return the refund recon logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RefundReconLog> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the refund recon logs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of refund recon logs
     * @param end the upper bound of the range of refund recon logs (not inclusive)
     * @return the range of refund recon logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RefundReconLog> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the refund recon logs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.RefundReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of refund recon logs
     * @param end the upper bound of the range of refund recon logs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of refund recon logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RefundReconLog> findAll(int start, int end,
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

        List<RefundReconLog> list = (List<RefundReconLog>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_REFUNDRECONLOG);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_REFUNDRECONLOG;

                if (pagination) {
                    sql = sql.concat(RefundReconLogModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<RefundReconLog>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RefundReconLog>(list);
                } else {
                    list = (List<RefundReconLog>) QueryUtil.list(q,
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
     * Removes all the refund recon logs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (RefundReconLog refundReconLog : findAll()) {
            remove(refundReconLog);
        }
    }

    /**
     * Returns the number of refund recon logs.
     *
     * @return the number of refund recon logs
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

                Query q = session.createQuery(_SQL_COUNT_REFUNDRECONLOG);

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
     * Initializes the refund recon log persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.RefundReconLog")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<RefundReconLog>> listenersList = new ArrayList<ModelListener<RefundReconLog>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<RefundReconLog>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RefundReconLogImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
