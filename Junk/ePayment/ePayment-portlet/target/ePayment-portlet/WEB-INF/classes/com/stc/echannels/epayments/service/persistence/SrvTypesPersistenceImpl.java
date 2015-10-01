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

import com.stc.echannels.epayments.NoSuchSrvTypesException;
import com.stc.echannels.epayments.model.SrvTypes;
import com.stc.echannels.epayments.model.impl.SrvTypesImpl;
import com.stc.echannels.epayments.model.impl.SrvTypesModelImpl;
import com.stc.echannels.epayments.service.persistence.SrvTypesPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the srv types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypesPersistence
 * @see SrvTypesUtil
 * @generated
 */
public class SrvTypesPersistenceImpl extends BasePersistenceImpl<SrvTypes>
    implements SrvTypesPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SrvTypesUtil} to access the srv types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SrvTypesImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypesModelImpl.FINDER_CACHE_ENABLED, SrvTypesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypesModelImpl.FINDER_CACHE_ENABLED, SrvTypesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SRVTYPES = "SELECT srvTypes FROM SrvTypes srvTypes";
    private static final String _SQL_COUNT_SRVTYPES = "SELECT COUNT(srvTypes) FROM SrvTypes srvTypes";
    private static final String _ORDER_BY_ENTITY_ALIAS = "srvTypes.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SrvTypes exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SrvTypesPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "serviceTypeId", "serviceTypeName", "serviceNameEN",
                "serviceNameAR"
            });
    private static SrvTypes _nullSrvTypes = new SrvTypesImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SrvTypes> toCacheModel() {
                return _nullSrvTypesCacheModel;
            }
        };

    private static CacheModel<SrvTypes> _nullSrvTypesCacheModel = new CacheModel<SrvTypes>() {
            @Override
            public SrvTypes toEntityModel() {
                return _nullSrvTypes;
            }
        };

    public SrvTypesPersistenceImpl() {
        setModelClass(SrvTypes.class);
    }

    /**
     * Caches the srv types in the entity cache if it is enabled.
     *
     * @param srvTypes the srv types
     */
    @Override
    public void cacheResult(SrvTypes srvTypes) {
        EntityCacheUtil.putResult(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypesImpl.class, srvTypes.getPrimaryKey(), srvTypes);

        srvTypes.resetOriginalValues();
    }

    /**
     * Caches the srv typeses in the entity cache if it is enabled.
     *
     * @param srvTypeses the srv typeses
     */
    @Override
    public void cacheResult(List<SrvTypes> srvTypeses) {
        for (SrvTypes srvTypes : srvTypeses) {
            if (EntityCacheUtil.getResult(
                        SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
                        SrvTypesImpl.class, srvTypes.getPrimaryKey()) == null) {
                cacheResult(srvTypes);
            } else {
                srvTypes.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all srv typeses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SrvTypesImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SrvTypesImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the srv types.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SrvTypes srvTypes) {
        EntityCacheUtil.removeResult(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypesImpl.class, srvTypes.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SrvTypes> srvTypeses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SrvTypes srvTypes : srvTypeses) {
            EntityCacheUtil.removeResult(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
                SrvTypesImpl.class, srvTypes.getPrimaryKey());
        }
    }

    /**
     * Creates a new srv types with the primary key. Does not add the srv types to the database.
     *
     * @param serviceTypeId the primary key for the new srv types
     * @return the new srv types
     */
    @Override
    public SrvTypes create(long serviceTypeId) {
        SrvTypes srvTypes = new SrvTypesImpl();

        srvTypes.setNew(true);
        srvTypes.setPrimaryKey(serviceTypeId);

        return srvTypes;
    }

    /**
     * Removes the srv types with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param serviceTypeId the primary key of the srv types
     * @return the srv types that was removed
     * @throws com.stc.echannels.epayments.NoSuchSrvTypesException if a srv types with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypes remove(long serviceTypeId)
        throws NoSuchSrvTypesException, SystemException {
        return remove((Serializable) serviceTypeId);
    }

    /**
     * Removes the srv types with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the srv types
     * @return the srv types that was removed
     * @throws com.stc.echannels.epayments.NoSuchSrvTypesException if a srv types with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypes remove(Serializable primaryKey)
        throws NoSuchSrvTypesException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SrvTypes srvTypes = (SrvTypes) session.get(SrvTypesImpl.class,
                    primaryKey);

            if (srvTypes == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSrvTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(srvTypes);
        } catch (NoSuchSrvTypesException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SrvTypes removeImpl(SrvTypes srvTypes) throws SystemException {
        srvTypes = toUnwrappedModel(srvTypes);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(srvTypes)) {
                srvTypes = (SrvTypes) session.get(SrvTypesImpl.class,
                        srvTypes.getPrimaryKeyObj());
            }

            if (srvTypes != null) {
                session.delete(srvTypes);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (srvTypes != null) {
            clearCache(srvTypes);
        }

        return srvTypes;
    }

    @Override
    public SrvTypes updateImpl(
        com.stc.echannels.epayments.model.SrvTypes srvTypes)
        throws SystemException {
        srvTypes = toUnwrappedModel(srvTypes);

        boolean isNew = srvTypes.isNew();

        Session session = null;

        try {
            session = openSession();

            if (srvTypes.isNew()) {
                session.save(srvTypes);

                srvTypes.setNew(false);
            } else {
                session.merge(srvTypes);
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

        EntityCacheUtil.putResult(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypesImpl.class, srvTypes.getPrimaryKey(), srvTypes);

        return srvTypes;
    }

    protected SrvTypes toUnwrappedModel(SrvTypes srvTypes) {
        if (srvTypes instanceof SrvTypesImpl) {
            return srvTypes;
        }

        SrvTypesImpl srvTypesImpl = new SrvTypesImpl();

        srvTypesImpl.setNew(srvTypes.isNew());
        srvTypesImpl.setPrimaryKey(srvTypes.getPrimaryKey());

        srvTypesImpl.setServiceTypeId(srvTypes.getServiceTypeId());
        srvTypesImpl.setServiceTypeName(srvTypes.getServiceTypeName());
        srvTypesImpl.setServiceNameEN(srvTypes.getServiceNameEN());
        srvTypesImpl.setServiceNameAR(srvTypes.getServiceNameAR());

        return srvTypesImpl;
    }

    /**
     * Returns the srv types with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the srv types
     * @return the srv types
     * @throws com.stc.echannels.epayments.NoSuchSrvTypesException if a srv types with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypes findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSrvTypesException, SystemException {
        SrvTypes srvTypes = fetchByPrimaryKey(primaryKey);

        if (srvTypes == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSrvTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return srvTypes;
    }

    /**
     * Returns the srv types with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchSrvTypesException} if it could not be found.
     *
     * @param serviceTypeId the primary key of the srv types
     * @return the srv types
     * @throws com.stc.echannels.epayments.NoSuchSrvTypesException if a srv types with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypes findByPrimaryKey(long serviceTypeId)
        throws NoSuchSrvTypesException, SystemException {
        return findByPrimaryKey((Serializable) serviceTypeId);
    }

    /**
     * Returns the srv types with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the srv types
     * @return the srv types, or <code>null</code> if a srv types with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypes fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SrvTypes srvTypes = (SrvTypes) EntityCacheUtil.getResult(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
                SrvTypesImpl.class, primaryKey);

        if (srvTypes == _nullSrvTypes) {
            return null;
        }

        if (srvTypes == null) {
            Session session = null;

            try {
                session = openSession();

                srvTypes = (SrvTypes) session.get(SrvTypesImpl.class, primaryKey);

                if (srvTypes != null) {
                    cacheResult(srvTypes);
                } else {
                    EntityCacheUtil.putResult(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
                        SrvTypesImpl.class, primaryKey, _nullSrvTypes);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SrvTypesModelImpl.ENTITY_CACHE_ENABLED,
                    SrvTypesImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return srvTypes;
    }

    /**
     * Returns the srv types with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param serviceTypeId the primary key of the srv types
     * @return the srv types, or <code>null</code> if a srv types with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypes fetchByPrimaryKey(long serviceTypeId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) serviceTypeId);
    }

    /**
     * Returns all the srv typeses.
     *
     * @return the srv typeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypes> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the srv typeses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of srv typeses
     * @param end the upper bound of the range of srv typeses (not inclusive)
     * @return the range of srv typeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypes> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the srv typeses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of srv typeses
     * @param end the upper bound of the range of srv typeses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of srv typeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypes> findAll(int start, int end,
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

        List<SrvTypes> list = (List<SrvTypes>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SRVTYPES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SRVTYPES;

                if (pagination) {
                    sql = sql.concat(SrvTypesModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SrvTypes>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SrvTypes>(list);
                } else {
                    list = (List<SrvTypes>) QueryUtil.list(q, getDialect(),
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
     * Removes all the srv typeses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SrvTypes srvTypes : findAll()) {
            remove(srvTypes);
        }
    }

    /**
     * Returns the number of srv typeses.
     *
     * @return the number of srv typeses
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

                Query q = session.createQuery(_SQL_COUNT_SRVTYPES);

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
     * Initializes the srv types persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.SrvTypes")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SrvTypes>> listenersList = new ArrayList<ModelListener<SrvTypes>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SrvTypes>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SrvTypesImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
