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

import com.stc.echannels.epayments.NoSuchTransactionStatusException;
import com.stc.echannels.epayments.model.TransactionStatus;
import com.stc.echannels.epayments.model.impl.TransactionStatusImpl;
import com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl;
import com.stc.echannels.epayments.service.persistence.TransactionStatusPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the transaction status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see TransactionStatusPersistence
 * @see TransactionStatusUtil
 * @generated
 */
public class TransactionStatusPersistenceImpl extends BasePersistenceImpl<TransactionStatus>
    implements TransactionStatusPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TransactionStatusUtil} to access the transaction status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TransactionStatusImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
            TransactionStatusModelImpl.FINDER_CACHE_ENABLED,
            TransactionStatusImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
            TransactionStatusModelImpl.FINDER_CACHE_ENABLED,
            TransactionStatusImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
            TransactionStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TRANSACTIONSTATUS = "SELECT transactionStatus FROM TransactionStatus transactionStatus";
    private static final String _SQL_COUNT_TRANSACTIONSTATUS = "SELECT COUNT(transactionStatus) FROM TransactionStatus transactionStatus";
    private static final String _ORDER_BY_ENTITY_ALIAS = "transactionStatus.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TransactionStatus exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TransactionStatusPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "description", "descriptiveNameEn", "descriptiveNameAr"
            });
    private static TransactionStatus _nullTransactionStatus = new TransactionStatusImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<TransactionStatus> toCacheModel() {
                return _nullTransactionStatusCacheModel;
            }
        };

    private static CacheModel<TransactionStatus> _nullTransactionStatusCacheModel =
        new CacheModel<TransactionStatus>() {
            @Override
            public TransactionStatus toEntityModel() {
                return _nullTransactionStatus;
            }
        };

    public TransactionStatusPersistenceImpl() {
        setModelClass(TransactionStatus.class);
    }

    /**
     * Caches the transaction status in the entity cache if it is enabled.
     *
     * @param transactionStatus the transaction status
     */
    @Override
    public void cacheResult(TransactionStatus transactionStatus) {
        EntityCacheUtil.putResult(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
            TransactionStatusImpl.class, transactionStatus.getPrimaryKey(),
            transactionStatus);

        transactionStatus.resetOriginalValues();
    }

    /**
     * Caches the transaction statuses in the entity cache if it is enabled.
     *
     * @param transactionStatuses the transaction statuses
     */
    @Override
    public void cacheResult(List<TransactionStatus> transactionStatuses) {
        for (TransactionStatus transactionStatus : transactionStatuses) {
            if (EntityCacheUtil.getResult(
                        TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
                        TransactionStatusImpl.class,
                        transactionStatus.getPrimaryKey()) == null) {
                cacheResult(transactionStatus);
            } else {
                transactionStatus.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all transaction statuses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TransactionStatusImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TransactionStatusImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the transaction status.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(TransactionStatus transactionStatus) {
        EntityCacheUtil.removeResult(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
            TransactionStatusImpl.class, transactionStatus.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<TransactionStatus> transactionStatuses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (TransactionStatus transactionStatus : transactionStatuses) {
            EntityCacheUtil.removeResult(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
                TransactionStatusImpl.class, transactionStatus.getPrimaryKey());
        }
    }

    /**
     * Creates a new transaction status with the primary key. Does not add the transaction status to the database.
     *
     * @param id the primary key for the new transaction status
     * @return the new transaction status
     */
    @Override
    public TransactionStatus create(long id) {
        TransactionStatus transactionStatus = new TransactionStatusImpl();

        transactionStatus.setNew(true);
        transactionStatus.setPrimaryKey(id);

        return transactionStatus;
    }

    /**
     * Removes the transaction status with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the transaction status
     * @return the transaction status that was removed
     * @throws com.stc.echannels.epayments.NoSuchTransactionStatusException if a transaction status with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TransactionStatus remove(long id)
        throws NoSuchTransactionStatusException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the transaction status with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the transaction status
     * @return the transaction status that was removed
     * @throws com.stc.echannels.epayments.NoSuchTransactionStatusException if a transaction status with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TransactionStatus remove(Serializable primaryKey)
        throws NoSuchTransactionStatusException, SystemException {
        Session session = null;

        try {
            session = openSession();

            TransactionStatus transactionStatus = (TransactionStatus) session.get(TransactionStatusImpl.class,
                    primaryKey);

            if (transactionStatus == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTransactionStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(transactionStatus);
        } catch (NoSuchTransactionStatusException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected TransactionStatus removeImpl(TransactionStatus transactionStatus)
        throws SystemException {
        transactionStatus = toUnwrappedModel(transactionStatus);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(transactionStatus)) {
                transactionStatus = (TransactionStatus) session.get(TransactionStatusImpl.class,
                        transactionStatus.getPrimaryKeyObj());
            }

            if (transactionStatus != null) {
                session.delete(transactionStatus);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (transactionStatus != null) {
            clearCache(transactionStatus);
        }

        return transactionStatus;
    }

    @Override
    public TransactionStatus updateImpl(
        com.stc.echannels.epayments.model.TransactionStatus transactionStatus)
        throws SystemException {
        transactionStatus = toUnwrappedModel(transactionStatus);

        boolean isNew = transactionStatus.isNew();

        Session session = null;

        try {
            session = openSession();

            if (transactionStatus.isNew()) {
                session.save(transactionStatus);

                transactionStatus.setNew(false);
            } else {
                session.merge(transactionStatus);
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

        EntityCacheUtil.putResult(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
            TransactionStatusImpl.class, transactionStatus.getPrimaryKey(),
            transactionStatus);

        return transactionStatus;
    }

    protected TransactionStatus toUnwrappedModel(
        TransactionStatus transactionStatus) {
        if (transactionStatus instanceof TransactionStatusImpl) {
            return transactionStatus;
        }

        TransactionStatusImpl transactionStatusImpl = new TransactionStatusImpl();

        transactionStatusImpl.setNew(transactionStatus.isNew());
        transactionStatusImpl.setPrimaryKey(transactionStatus.getPrimaryKey());

        transactionStatusImpl.setId(transactionStatus.getId());
        transactionStatusImpl.setDescription(transactionStatus.getDescription());
        transactionStatusImpl.setDescriptiveNameEn(transactionStatus.getDescriptiveNameEn());
        transactionStatusImpl.setDescriptiveNameAr(transactionStatus.getDescriptiveNameAr());

        return transactionStatusImpl;
    }

    /**
     * Returns the transaction status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the transaction status
     * @return the transaction status
     * @throws com.stc.echannels.epayments.NoSuchTransactionStatusException if a transaction status with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TransactionStatus findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTransactionStatusException, SystemException {
        TransactionStatus transactionStatus = fetchByPrimaryKey(primaryKey);

        if (transactionStatus == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTransactionStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return transactionStatus;
    }

    /**
     * Returns the transaction status with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchTransactionStatusException} if it could not be found.
     *
     * @param id the primary key of the transaction status
     * @return the transaction status
     * @throws com.stc.echannels.epayments.NoSuchTransactionStatusException if a transaction status with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TransactionStatus findByPrimaryKey(long id)
        throws NoSuchTransactionStatusException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the transaction status with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the transaction status
     * @return the transaction status, or <code>null</code> if a transaction status with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TransactionStatus fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        TransactionStatus transactionStatus = (TransactionStatus) EntityCacheUtil.getResult(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
                TransactionStatusImpl.class, primaryKey);

        if (transactionStatus == _nullTransactionStatus) {
            return null;
        }

        if (transactionStatus == null) {
            Session session = null;

            try {
                session = openSession();

                transactionStatus = (TransactionStatus) session.get(TransactionStatusImpl.class,
                        primaryKey);

                if (transactionStatus != null) {
                    cacheResult(transactionStatus);
                } else {
                    EntityCacheUtil.putResult(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
                        TransactionStatusImpl.class, primaryKey,
                        _nullTransactionStatus);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TransactionStatusModelImpl.ENTITY_CACHE_ENABLED,
                    TransactionStatusImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return transactionStatus;
    }

    /**
     * Returns the transaction status with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the transaction status
     * @return the transaction status, or <code>null</code> if a transaction status with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TransactionStatus fetchByPrimaryKey(long id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the transaction statuses.
     *
     * @return the transaction statuses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TransactionStatus> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the transaction statuses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of transaction statuses
     * @param end the upper bound of the range of transaction statuses (not inclusive)
     * @return the range of transaction statuses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TransactionStatus> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the transaction statuses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.TransactionStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of transaction statuses
     * @param end the upper bound of the range of transaction statuses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of transaction statuses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TransactionStatus> findAll(int start, int end,
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

        List<TransactionStatus> list = (List<TransactionStatus>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TRANSACTIONSTATUS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TRANSACTIONSTATUS;

                if (pagination) {
                    sql = sql.concat(TransactionStatusModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<TransactionStatus>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<TransactionStatus>(list);
                } else {
                    list = (List<TransactionStatus>) QueryUtil.list(q,
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
     * Removes all the transaction statuses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (TransactionStatus transactionStatus : findAll()) {
            remove(transactionStatus);
        }
    }

    /**
     * Returns the number of transaction statuses.
     *
     * @return the number of transaction statuses
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

                Query q = session.createQuery(_SQL_COUNT_TRANSACTIONSTATUS);

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
     * Initializes the transaction status persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.TransactionStatus")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<TransactionStatus>> listenersList = new ArrayList<ModelListener<TransactionStatus>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<TransactionStatus>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TransactionStatusImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
