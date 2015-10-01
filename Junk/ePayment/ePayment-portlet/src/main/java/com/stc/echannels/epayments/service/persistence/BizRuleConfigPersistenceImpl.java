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

import com.stc.echannels.epayments.NoSuchBizRuleConfigException;
import com.stc.echannels.epayments.model.BizRuleConfig;
import com.stc.echannels.epayments.model.impl.BizRuleConfigImpl;
import com.stc.echannels.epayments.model.impl.BizRuleConfigModelImpl;
import com.stc.echannels.epayments.service.persistence.BizRuleConfigPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the biz rule config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BizRuleConfigPersistence
 * @see BizRuleConfigUtil
 * @generated
 */
public class BizRuleConfigPersistenceImpl extends BasePersistenceImpl<BizRuleConfig>
    implements BizRuleConfigPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BizRuleConfigUtil} to access the biz rule config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BizRuleConfigImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
            BizRuleConfigModelImpl.FINDER_CACHE_ENABLED,
            BizRuleConfigImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
            BizRuleConfigModelImpl.FINDER_CACHE_ENABLED,
            BizRuleConfigImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
            BizRuleConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_BIZRULECONFIG = "SELECT bizRuleConfig FROM BizRuleConfig bizRuleConfig";
    private static final String _SQL_COUNT_BIZRULECONFIG = "SELECT COUNT(bizRuleConfig) FROM BizRuleConfig bizRuleConfig";
    private static final String _ORDER_BY_ENTITY_ALIAS = "bizRuleConfig.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BizRuleConfig exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BizRuleConfigPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "bizRuleId", "serviceId", "channelId", "pmtMethodId",
                "customValue", "ruleId", "transId", "clientIP", "serverIP",
                "userAgent", "operation", "lastUpdateTimestamp",
                "lastUpdateUserid", "lastUpdateUsername", "effectiveTimestamp"
            });
    private static BizRuleConfig _nullBizRuleConfig = new BizRuleConfigImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BizRuleConfig> toCacheModel() {
                return _nullBizRuleConfigCacheModel;
            }
        };

    private static CacheModel<BizRuleConfig> _nullBizRuleConfigCacheModel = new CacheModel<BizRuleConfig>() {
            @Override
            public BizRuleConfig toEntityModel() {
                return _nullBizRuleConfig;
            }
        };

    public BizRuleConfigPersistenceImpl() {
        setModelClass(BizRuleConfig.class);
    }

    /**
     * Caches the biz rule config in the entity cache if it is enabled.
     *
     * @param bizRuleConfig the biz rule config
     */
    @Override
    public void cacheResult(BizRuleConfig bizRuleConfig) {
        EntityCacheUtil.putResult(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
            BizRuleConfigImpl.class, bizRuleConfig.getPrimaryKey(),
            bizRuleConfig);

        bizRuleConfig.resetOriginalValues();
    }

    /**
     * Caches the biz rule configs in the entity cache if it is enabled.
     *
     * @param bizRuleConfigs the biz rule configs
     */
    @Override
    public void cacheResult(List<BizRuleConfig> bizRuleConfigs) {
        for (BizRuleConfig bizRuleConfig : bizRuleConfigs) {
            if (EntityCacheUtil.getResult(
                        BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
                        BizRuleConfigImpl.class, bizRuleConfig.getPrimaryKey()) == null) {
                cacheResult(bizRuleConfig);
            } else {
                bizRuleConfig.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all biz rule configs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BizRuleConfigImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BizRuleConfigImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the biz rule config.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BizRuleConfig bizRuleConfig) {
        EntityCacheUtil.removeResult(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
            BizRuleConfigImpl.class, bizRuleConfig.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BizRuleConfig> bizRuleConfigs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BizRuleConfig bizRuleConfig : bizRuleConfigs) {
            EntityCacheUtil.removeResult(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
                BizRuleConfigImpl.class, bizRuleConfig.getPrimaryKey());
        }
    }

    /**
     * Creates a new biz rule config with the primary key. Does not add the biz rule config to the database.
     *
     * @param bizRuleId the primary key for the new biz rule config
     * @return the new biz rule config
     */
    @Override
    public BizRuleConfig create(long bizRuleId) {
        BizRuleConfig bizRuleConfig = new BizRuleConfigImpl();

        bizRuleConfig.setNew(true);
        bizRuleConfig.setPrimaryKey(bizRuleId);

        return bizRuleConfig;
    }

    /**
     * Removes the biz rule config with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bizRuleId the primary key of the biz rule config
     * @return the biz rule config that was removed
     * @throws com.stc.echannels.epayments.NoSuchBizRuleConfigException if a biz rule config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BizRuleConfig remove(long bizRuleId)
        throws NoSuchBizRuleConfigException, SystemException {
        return remove((Serializable) bizRuleId);
    }

    /**
     * Removes the biz rule config with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the biz rule config
     * @return the biz rule config that was removed
     * @throws com.stc.echannels.epayments.NoSuchBizRuleConfigException if a biz rule config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BizRuleConfig remove(Serializable primaryKey)
        throws NoSuchBizRuleConfigException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BizRuleConfig bizRuleConfig = (BizRuleConfig) session.get(BizRuleConfigImpl.class,
                    primaryKey);

            if (bizRuleConfig == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBizRuleConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(bizRuleConfig);
        } catch (NoSuchBizRuleConfigException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BizRuleConfig removeImpl(BizRuleConfig bizRuleConfig)
        throws SystemException {
        bizRuleConfig = toUnwrappedModel(bizRuleConfig);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(bizRuleConfig)) {
                bizRuleConfig = (BizRuleConfig) session.get(BizRuleConfigImpl.class,
                        bizRuleConfig.getPrimaryKeyObj());
            }

            if (bizRuleConfig != null) {
                session.delete(bizRuleConfig);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (bizRuleConfig != null) {
            clearCache(bizRuleConfig);
        }

        return bizRuleConfig;
    }

    @Override
    public BizRuleConfig updateImpl(
        com.stc.echannels.epayments.model.BizRuleConfig bizRuleConfig)
        throws SystemException {
        bizRuleConfig = toUnwrappedModel(bizRuleConfig);

        boolean isNew = bizRuleConfig.isNew();

        Session session = null;

        try {
            session = openSession();

            if (bizRuleConfig.isNew()) {
                session.save(bizRuleConfig);

                bizRuleConfig.setNew(false);
            } else {
                session.merge(bizRuleConfig);
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

        EntityCacheUtil.putResult(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
            BizRuleConfigImpl.class, bizRuleConfig.getPrimaryKey(),
            bizRuleConfig);

        return bizRuleConfig;
    }

    protected BizRuleConfig toUnwrappedModel(BizRuleConfig bizRuleConfig) {
        if (bizRuleConfig instanceof BizRuleConfigImpl) {
            return bizRuleConfig;
        }

        BizRuleConfigImpl bizRuleConfigImpl = new BizRuleConfigImpl();

        bizRuleConfigImpl.setNew(bizRuleConfig.isNew());
        bizRuleConfigImpl.setPrimaryKey(bizRuleConfig.getPrimaryKey());

        bizRuleConfigImpl.setBizRuleId(bizRuleConfig.getBizRuleId());
        bizRuleConfigImpl.setServiceId(bizRuleConfig.getServiceId());
        bizRuleConfigImpl.setChannelId(bizRuleConfig.getChannelId());
        bizRuleConfigImpl.setPmtMethodId(bizRuleConfig.getPmtMethodId());
        bizRuleConfigImpl.setCustomValue(bizRuleConfig.getCustomValue());
        bizRuleConfigImpl.setRuleId(bizRuleConfig.getRuleId());
        bizRuleConfigImpl.setTransId(bizRuleConfig.getTransId());
        bizRuleConfigImpl.setClientIP(bizRuleConfig.getClientIP());
        bizRuleConfigImpl.setServerIP(bizRuleConfig.getServerIP());
        bizRuleConfigImpl.setUserAgent(bizRuleConfig.getUserAgent());
        bizRuleConfigImpl.setOperation(bizRuleConfig.getOperation());
        bizRuleConfigImpl.setLastUpdateTimestamp(bizRuleConfig.getLastUpdateTimestamp());
        bizRuleConfigImpl.setLastUpdateUserid(bizRuleConfig.getLastUpdateUserid());
        bizRuleConfigImpl.setLastUpdateUsername(bizRuleConfig.getLastUpdateUsername());
        bizRuleConfigImpl.setStatus(bizRuleConfig.getStatus());
        bizRuleConfigImpl.setEffectiveTimestamp(bizRuleConfig.getEffectiveTimestamp());

        return bizRuleConfigImpl;
    }

    /**
     * Returns the biz rule config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the biz rule config
     * @return the biz rule config
     * @throws com.stc.echannels.epayments.NoSuchBizRuleConfigException if a biz rule config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BizRuleConfig findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBizRuleConfigException, SystemException {
        BizRuleConfig bizRuleConfig = fetchByPrimaryKey(primaryKey);

        if (bizRuleConfig == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBizRuleConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return bizRuleConfig;
    }

    /**
     * Returns the biz rule config with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBizRuleConfigException} if it could not be found.
     *
     * @param bizRuleId the primary key of the biz rule config
     * @return the biz rule config
     * @throws com.stc.echannels.epayments.NoSuchBizRuleConfigException if a biz rule config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BizRuleConfig findByPrimaryKey(long bizRuleId)
        throws NoSuchBizRuleConfigException, SystemException {
        return findByPrimaryKey((Serializable) bizRuleId);
    }

    /**
     * Returns the biz rule config with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the biz rule config
     * @return the biz rule config, or <code>null</code> if a biz rule config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BizRuleConfig fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BizRuleConfig bizRuleConfig = (BizRuleConfig) EntityCacheUtil.getResult(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
                BizRuleConfigImpl.class, primaryKey);

        if (bizRuleConfig == _nullBizRuleConfig) {
            return null;
        }

        if (bizRuleConfig == null) {
            Session session = null;

            try {
                session = openSession();

                bizRuleConfig = (BizRuleConfig) session.get(BizRuleConfigImpl.class,
                        primaryKey);

                if (bizRuleConfig != null) {
                    cacheResult(bizRuleConfig);
                } else {
                    EntityCacheUtil.putResult(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
                        BizRuleConfigImpl.class, primaryKey, _nullBizRuleConfig);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BizRuleConfigModelImpl.ENTITY_CACHE_ENABLED,
                    BizRuleConfigImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return bizRuleConfig;
    }

    /**
     * Returns the biz rule config with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param bizRuleId the primary key of the biz rule config
     * @return the biz rule config, or <code>null</code> if a biz rule config with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BizRuleConfig fetchByPrimaryKey(long bizRuleId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) bizRuleId);
    }

    /**
     * Returns all the biz rule configs.
     *
     * @return the biz rule configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BizRuleConfig> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the biz rule configs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BizRuleConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of biz rule configs
     * @param end the upper bound of the range of biz rule configs (not inclusive)
     * @return the range of biz rule configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BizRuleConfig> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the biz rule configs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BizRuleConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of biz rule configs
     * @param end the upper bound of the range of biz rule configs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of biz rule configs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BizRuleConfig> findAll(int start, int end,
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

        List<BizRuleConfig> list = (List<BizRuleConfig>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BIZRULECONFIG);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BIZRULECONFIG;

                if (pagination) {
                    sql = sql.concat(BizRuleConfigModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BizRuleConfig>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BizRuleConfig>(list);
                } else {
                    list = (List<BizRuleConfig>) QueryUtil.list(q,
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
     * Removes all the biz rule configs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BizRuleConfig bizRuleConfig : findAll()) {
            remove(bizRuleConfig);
        }
    }

    /**
     * Returns the number of biz rule configs.
     *
     * @return the number of biz rule configs
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

                Query q = session.createQuery(_SQL_COUNT_BIZRULECONFIG);

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
     * Initializes the biz rule config persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.BizRuleConfig")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BizRuleConfig>> listenersList = new ArrayList<ModelListener<BizRuleConfig>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BizRuleConfig>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BizRuleConfigImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
