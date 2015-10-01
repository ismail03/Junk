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

import com.stc.echannels.epayments.NoSuchReconLogException;
import com.stc.echannels.epayments.model.ReconLog;
import com.stc.echannels.epayments.model.impl.ReconLogImpl;
import com.stc.echannels.epayments.model.impl.ReconLogModelImpl;
import com.stc.echannels.epayments.service.persistence.ReconLogPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the recon log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see ReconLogPersistence
 * @see ReconLogUtil
 * @generated
 */
public class ReconLogPersistenceImpl extends BasePersistenceImpl<ReconLog>
    implements ReconLogPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ReconLogUtil} to access the recon log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ReconLogImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
            ReconLogModelImpl.FINDER_CACHE_ENABLED, ReconLogImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
            ReconLogModelImpl.FINDER_CACHE_ENABLED, ReconLogImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
            ReconLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_RECONLOG = "SELECT reconLog FROM ReconLog reconLog";
    private static final String _SQL_COUNT_RECONLOG = "SELECT COUNT(reconLog) FROM ReconLog reconLog";
    private static final String _ORDER_BY_ENTITY_ALIAS = "reconLog.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ReconLog exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ReconLogPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "paymentSystemTransId", "bankTransId", "transAmount",
                "paymentMethod", "paymentChannel", "pmtBankId", "bankTransDate",
                "beneficiaryServiceNo", "serviceId", "paymentStatus"
            });
    private static ReconLog _nullReconLog = new ReconLogImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<ReconLog> toCacheModel() {
                return _nullReconLogCacheModel;
            }
        };

    private static CacheModel<ReconLog> _nullReconLogCacheModel = new CacheModel<ReconLog>() {
            @Override
            public ReconLog toEntityModel() {
                return _nullReconLog;
            }
        };

    public ReconLogPersistenceImpl() {
        setModelClass(ReconLog.class);
    }

    /**
     * Caches the recon log in the entity cache if it is enabled.
     *
     * @param reconLog the recon log
     */
    @Override
    public void cacheResult(ReconLog reconLog) {
        EntityCacheUtil.putResult(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
            ReconLogImpl.class, reconLog.getPrimaryKey(), reconLog);

        reconLog.resetOriginalValues();
    }

    /**
     * Caches the recon logs in the entity cache if it is enabled.
     *
     * @param reconLogs the recon logs
     */
    @Override
    public void cacheResult(List<ReconLog> reconLogs) {
        for (ReconLog reconLog : reconLogs) {
            if (EntityCacheUtil.getResult(
                        ReconLogModelImpl.ENTITY_CACHE_ENABLED,
                        ReconLogImpl.class, reconLog.getPrimaryKey()) == null) {
                cacheResult(reconLog);
            } else {
                reconLog.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all recon logs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ReconLogImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ReconLogImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the recon log.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(ReconLog reconLog) {
        EntityCacheUtil.removeResult(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
            ReconLogImpl.class, reconLog.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<ReconLog> reconLogs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (ReconLog reconLog : reconLogs) {
            EntityCacheUtil.removeResult(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
                ReconLogImpl.class, reconLog.getPrimaryKey());
        }
    }

    /**
     * Creates a new recon log with the primary key. Does not add the recon log to the database.
     *
     * @param paymentSystemTransId the primary key for the new recon log
     * @return the new recon log
     */
    @Override
    public ReconLog create(String paymentSystemTransId) {
        ReconLog reconLog = new ReconLogImpl();

        reconLog.setNew(true);
        reconLog.setPrimaryKey(paymentSystemTransId);

        return reconLog;
    }

    /**
     * Removes the recon log with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param paymentSystemTransId the primary key of the recon log
     * @return the recon log that was removed
     * @throws com.stc.echannels.epayments.NoSuchReconLogException if a recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ReconLog remove(String paymentSystemTransId)
        throws NoSuchReconLogException, SystemException {
        return remove((Serializable) paymentSystemTransId);
    }

    /**
     * Removes the recon log with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the recon log
     * @return the recon log that was removed
     * @throws com.stc.echannels.epayments.NoSuchReconLogException if a recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ReconLog remove(Serializable primaryKey)
        throws NoSuchReconLogException, SystemException {
        Session session = null;

        try {
            session = openSession();

            ReconLog reconLog = (ReconLog) session.get(ReconLogImpl.class,
                    primaryKey);

            if (reconLog == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchReconLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(reconLog);
        } catch (NoSuchReconLogException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected ReconLog removeImpl(ReconLog reconLog) throws SystemException {
        reconLog = toUnwrappedModel(reconLog);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(reconLog)) {
                reconLog = (ReconLog) session.get(ReconLogImpl.class,
                        reconLog.getPrimaryKeyObj());
            }

            if (reconLog != null) {
                session.delete(reconLog);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (reconLog != null) {
            clearCache(reconLog);
        }

        return reconLog;
    }

    @Override
    public ReconLog updateImpl(
        com.stc.echannels.epayments.model.ReconLog reconLog)
        throws SystemException {
        reconLog = toUnwrappedModel(reconLog);

        boolean isNew = reconLog.isNew();

        Session session = null;

        try {
            session = openSession();

            if (reconLog.isNew()) {
                session.save(reconLog);

                reconLog.setNew(false);
            } else {
                session.merge(reconLog);
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

        EntityCacheUtil.putResult(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
            ReconLogImpl.class, reconLog.getPrimaryKey(), reconLog);

        return reconLog;
    }

    protected ReconLog toUnwrappedModel(ReconLog reconLog) {
        if (reconLog instanceof ReconLogImpl) {
            return reconLog;
        }

        ReconLogImpl reconLogImpl = new ReconLogImpl();

        reconLogImpl.setNew(reconLog.isNew());
        reconLogImpl.setPrimaryKey(reconLog.getPrimaryKey());

        reconLogImpl.setPaymentSystemTransId(reconLog.getPaymentSystemTransId());
        reconLogImpl.setBankTransId(reconLog.getBankTransId());
        reconLogImpl.setTransAmount(reconLog.getTransAmount());
        reconLogImpl.setPaymentMethod(reconLog.getPaymentMethod());
        reconLogImpl.setPaymentChannel(reconLog.getPaymentChannel());
        reconLogImpl.setPmtBankId(reconLog.getPmtBankId());
        reconLogImpl.setBankTransDate(reconLog.getBankTransDate());
        reconLogImpl.setBeneficiaryServiceNo(reconLog.getBeneficiaryServiceNo());
        reconLogImpl.setServiceId(reconLog.getServiceId());
        reconLogImpl.setPaymentStatus(reconLog.getPaymentStatus());

        return reconLogImpl;
    }

    /**
     * Returns the recon log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the recon log
     * @return the recon log
     * @throws com.stc.echannels.epayments.NoSuchReconLogException if a recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ReconLog findByPrimaryKey(Serializable primaryKey)
        throws NoSuchReconLogException, SystemException {
        ReconLog reconLog = fetchByPrimaryKey(primaryKey);

        if (reconLog == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchReconLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return reconLog;
    }

    /**
     * Returns the recon log with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchReconLogException} if it could not be found.
     *
     * @param paymentSystemTransId the primary key of the recon log
     * @return the recon log
     * @throws com.stc.echannels.epayments.NoSuchReconLogException if a recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ReconLog findByPrimaryKey(String paymentSystemTransId)
        throws NoSuchReconLogException, SystemException {
        return findByPrimaryKey((Serializable) paymentSystemTransId);
    }

    /**
     * Returns the recon log with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the recon log
     * @return the recon log, or <code>null</code> if a recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ReconLog fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        ReconLog reconLog = (ReconLog) EntityCacheUtil.getResult(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
                ReconLogImpl.class, primaryKey);

        if (reconLog == _nullReconLog) {
            return null;
        }

        if (reconLog == null) {
            Session session = null;

            try {
                session = openSession();

                reconLog = (ReconLog) session.get(ReconLogImpl.class, primaryKey);

                if (reconLog != null) {
                    cacheResult(reconLog);
                } else {
                    EntityCacheUtil.putResult(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
                        ReconLogImpl.class, primaryKey, _nullReconLog);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ReconLogModelImpl.ENTITY_CACHE_ENABLED,
                    ReconLogImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return reconLog;
    }

    /**
     * Returns the recon log with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param paymentSystemTransId the primary key of the recon log
     * @return the recon log, or <code>null</code> if a recon log with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ReconLog fetchByPrimaryKey(String paymentSystemTransId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) paymentSystemTransId);
    }

    /**
     * Returns all the recon logs.
     *
     * @return the recon logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ReconLog> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the recon logs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of recon logs
     * @param end the upper bound of the range of recon logs (not inclusive)
     * @return the range of recon logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ReconLog> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the recon logs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.ReconLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of recon logs
     * @param end the upper bound of the range of recon logs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of recon logs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ReconLog> findAll(int start, int end,
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

        List<ReconLog> list = (List<ReconLog>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_RECONLOG);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_RECONLOG;

                if (pagination) {
                    sql = sql.concat(ReconLogModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<ReconLog>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ReconLog>(list);
                } else {
                    list = (List<ReconLog>) QueryUtil.list(q, getDialect(),
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
     * Removes all the recon logs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (ReconLog reconLog : findAll()) {
            remove(reconLog);
        }
    }

    /**
     * Returns the number of recon logs.
     *
     * @return the number of recon logs
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

                Query q = session.createQuery(_SQL_COUNT_RECONLOG);

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
     * Initializes the recon log persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.ReconLog")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<ReconLog>> listenersList = new ArrayList<ModelListener<ReconLog>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<ReconLog>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ReconLogImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
