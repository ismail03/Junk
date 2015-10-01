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

import com.stc.echannels.epayments.NoSuchInRechargeHistoryException;
import com.stc.echannels.epayments.model.InRechargeHistory;
import com.stc.echannels.epayments.model.impl.InRechargeHistoryImpl;
import com.stc.echannels.epayments.model.impl.InRechargeHistoryModelImpl;
import com.stc.echannels.epayments.service.persistence.InRechargeHistoryPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the in recharge history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see InRechargeHistoryPersistence
 * @see InRechargeHistoryUtil
 * @generated
 */
public class InRechargeHistoryPersistenceImpl extends BasePersistenceImpl<InRechargeHistory>
    implements InRechargeHistoryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link InRechargeHistoryUtil} to access the in recharge history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = InRechargeHistoryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
            InRechargeHistoryModelImpl.FINDER_CACHE_ENABLED,
            InRechargeHistoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
            InRechargeHistoryModelImpl.FINDER_CACHE_ENABLED,
            InRechargeHistoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
            InRechargeHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_INRECHARGEHISTORY = "SELECT inRechargeHistory FROM InRechargeHistory inRechargeHistory";
    private static final String _SQL_COUNT_INRECHARGEHISTORY = "SELECT COUNT(inRechargeHistory) FROM InRechargeHistory inRechargeHistory";
    private static final String _ORDER_BY_ENTITY_ALIAS = "inRechargeHistory.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InRechargeHistory exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(InRechargeHistoryPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "msisdn", "transactionId", "cardGroup", "serviceClass"
            });
    private static InRechargeHistory _nullInRechargeHistory = new InRechargeHistoryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<InRechargeHistory> toCacheModel() {
                return _nullInRechargeHistoryCacheModel;
            }
        };

    private static CacheModel<InRechargeHistory> _nullInRechargeHistoryCacheModel =
        new CacheModel<InRechargeHistory>() {
            @Override
            public InRechargeHistory toEntityModel() {
                return _nullInRechargeHistory;
            }
        };

    public InRechargeHistoryPersistenceImpl() {
        setModelClass(InRechargeHistory.class);
    }

    /**
     * Caches the in recharge history in the entity cache if it is enabled.
     *
     * @param inRechargeHistory the in recharge history
     */
    @Override
    public void cacheResult(InRechargeHistory inRechargeHistory) {
        EntityCacheUtil.putResult(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
            InRechargeHistoryImpl.class, inRechargeHistory.getPrimaryKey(),
            inRechargeHistory);

        inRechargeHistory.resetOriginalValues();
    }

    /**
     * Caches the in recharge histories in the entity cache if it is enabled.
     *
     * @param inRechargeHistories the in recharge histories
     */
    @Override
    public void cacheResult(List<InRechargeHistory> inRechargeHistories) {
        for (InRechargeHistory inRechargeHistory : inRechargeHistories) {
            if (EntityCacheUtil.getResult(
                        InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
                        InRechargeHistoryImpl.class,
                        inRechargeHistory.getPrimaryKey()) == null) {
                cacheResult(inRechargeHistory);
            } else {
                inRechargeHistory.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all in recharge histories.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(InRechargeHistoryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(InRechargeHistoryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the in recharge history.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(InRechargeHistory inRechargeHistory) {
        EntityCacheUtil.removeResult(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
            InRechargeHistoryImpl.class, inRechargeHistory.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<InRechargeHistory> inRechargeHistories) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (InRechargeHistory inRechargeHistory : inRechargeHistories) {
            EntityCacheUtil.removeResult(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
                InRechargeHistoryImpl.class, inRechargeHistory.getPrimaryKey());
        }
    }

    /**
     * Creates a new in recharge history with the primary key. Does not add the in recharge history to the database.
     *
     * @param msisdn the primary key for the new in recharge history
     * @return the new in recharge history
     */
    @Override
    public InRechargeHistory create(String msisdn) {
        InRechargeHistory inRechargeHistory = new InRechargeHistoryImpl();

        inRechargeHistory.setNew(true);
        inRechargeHistory.setPrimaryKey(msisdn);

        return inRechargeHistory;
    }

    /**
     * Removes the in recharge history with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param msisdn the primary key of the in recharge history
     * @return the in recharge history that was removed
     * @throws com.stc.echannels.epayments.NoSuchInRechargeHistoryException if a in recharge history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InRechargeHistory remove(String msisdn)
        throws NoSuchInRechargeHistoryException, SystemException {
        return remove((Serializable) msisdn);
    }

    /**
     * Removes the in recharge history with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the in recharge history
     * @return the in recharge history that was removed
     * @throws com.stc.echannels.epayments.NoSuchInRechargeHistoryException if a in recharge history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InRechargeHistory remove(Serializable primaryKey)
        throws NoSuchInRechargeHistoryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            InRechargeHistory inRechargeHistory = (InRechargeHistory) session.get(InRechargeHistoryImpl.class,
                    primaryKey);

            if (inRechargeHistory == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInRechargeHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(inRechargeHistory);
        } catch (NoSuchInRechargeHistoryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected InRechargeHistory removeImpl(InRechargeHistory inRechargeHistory)
        throws SystemException {
        inRechargeHistory = toUnwrappedModel(inRechargeHistory);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(inRechargeHistory)) {
                inRechargeHistory = (InRechargeHistory) session.get(InRechargeHistoryImpl.class,
                        inRechargeHistory.getPrimaryKeyObj());
            }

            if (inRechargeHistory != null) {
                session.delete(inRechargeHistory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (inRechargeHistory != null) {
            clearCache(inRechargeHistory);
        }

        return inRechargeHistory;
    }

    @Override
    public InRechargeHistory updateImpl(
        com.stc.echannels.epayments.model.InRechargeHistory inRechargeHistory)
        throws SystemException {
        inRechargeHistory = toUnwrappedModel(inRechargeHistory);

        boolean isNew = inRechargeHistory.isNew();

        Session session = null;

        try {
            session = openSession();

            if (inRechargeHistory.isNew()) {
                session.save(inRechargeHistory);

                inRechargeHistory.setNew(false);
            } else {
                session.merge(inRechargeHistory);
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

        EntityCacheUtil.putResult(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
            InRechargeHistoryImpl.class, inRechargeHistory.getPrimaryKey(),
            inRechargeHistory);

        return inRechargeHistory;
    }

    protected InRechargeHistory toUnwrappedModel(
        InRechargeHistory inRechargeHistory) {
        if (inRechargeHistory instanceof InRechargeHistoryImpl) {
            return inRechargeHistory;
        }

        InRechargeHistoryImpl inRechargeHistoryImpl = new InRechargeHistoryImpl();

        inRechargeHistoryImpl.setNew(inRechargeHistory.isNew());
        inRechargeHistoryImpl.setPrimaryKey(inRechargeHistory.getPrimaryKey());

        inRechargeHistoryImpl.setMsisdn(inRechargeHistory.getMsisdn());
        inRechargeHistoryImpl.setTransactionId(inRechargeHistory.getTransactionId());
        inRechargeHistoryImpl.setCardGroup(inRechargeHistory.getCardGroup());
        inRechargeHistoryImpl.setServiceClass(inRechargeHistory.getServiceClass());

        return inRechargeHistoryImpl;
    }

    /**
     * Returns the in recharge history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the in recharge history
     * @return the in recharge history
     * @throws com.stc.echannels.epayments.NoSuchInRechargeHistoryException if a in recharge history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InRechargeHistory findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInRechargeHistoryException, SystemException {
        InRechargeHistory inRechargeHistory = fetchByPrimaryKey(primaryKey);

        if (inRechargeHistory == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInRechargeHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return inRechargeHistory;
    }

    /**
     * Returns the in recharge history with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchInRechargeHistoryException} if it could not be found.
     *
     * @param msisdn the primary key of the in recharge history
     * @return the in recharge history
     * @throws com.stc.echannels.epayments.NoSuchInRechargeHistoryException if a in recharge history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InRechargeHistory findByPrimaryKey(String msisdn)
        throws NoSuchInRechargeHistoryException, SystemException {
        return findByPrimaryKey((Serializable) msisdn);
    }

    /**
     * Returns the in recharge history with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the in recharge history
     * @return the in recharge history, or <code>null</code> if a in recharge history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InRechargeHistory fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        InRechargeHistory inRechargeHistory = (InRechargeHistory) EntityCacheUtil.getResult(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
                InRechargeHistoryImpl.class, primaryKey);

        if (inRechargeHistory == _nullInRechargeHistory) {
            return null;
        }

        if (inRechargeHistory == null) {
            Session session = null;

            try {
                session = openSession();

                inRechargeHistory = (InRechargeHistory) session.get(InRechargeHistoryImpl.class,
                        primaryKey);

                if (inRechargeHistory != null) {
                    cacheResult(inRechargeHistory);
                } else {
                    EntityCacheUtil.putResult(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
                        InRechargeHistoryImpl.class, primaryKey,
                        _nullInRechargeHistory);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(InRechargeHistoryModelImpl.ENTITY_CACHE_ENABLED,
                    InRechargeHistoryImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return inRechargeHistory;
    }

    /**
     * Returns the in recharge history with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param msisdn the primary key of the in recharge history
     * @return the in recharge history, or <code>null</code> if a in recharge history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InRechargeHistory fetchByPrimaryKey(String msisdn)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) msisdn);
    }

    /**
     * Returns all the in recharge histories.
     *
     * @return the in recharge histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InRechargeHistory> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the in recharge histories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.InRechargeHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of in recharge histories
     * @param end the upper bound of the range of in recharge histories (not inclusive)
     * @return the range of in recharge histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InRechargeHistory> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the in recharge histories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.InRechargeHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of in recharge histories
     * @param end the upper bound of the range of in recharge histories (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of in recharge histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InRechargeHistory> findAll(int start, int end,
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

        List<InRechargeHistory> list = (List<InRechargeHistory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INRECHARGEHISTORY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INRECHARGEHISTORY;

                if (pagination) {
                    sql = sql.concat(InRechargeHistoryModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<InRechargeHistory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<InRechargeHistory>(list);
                } else {
                    list = (List<InRechargeHistory>) QueryUtil.list(q,
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
     * Removes all the in recharge histories from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (InRechargeHistory inRechargeHistory : findAll()) {
            remove(inRechargeHistory);
        }
    }

    /**
     * Returns the number of in recharge histories.
     *
     * @return the number of in recharge histories
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

                Query q = session.createQuery(_SQL_COUNT_INRECHARGEHISTORY);

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
     * Initializes the in recharge history persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.InRechargeHistory")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<InRechargeHistory>> listenersList = new ArrayList<ModelListener<InRechargeHistory>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<InRechargeHistory>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(InRechargeHistoryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
