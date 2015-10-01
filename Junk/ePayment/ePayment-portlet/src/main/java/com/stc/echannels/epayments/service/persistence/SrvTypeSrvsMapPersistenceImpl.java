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

import com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException;
import com.stc.echannels.epayments.model.SrvTypeSrvsMap;
import com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapImpl;
import com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl;
import com.stc.echannels.epayments.service.persistence.SrvTypeSrvsMapPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the srv type srvs map service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypeSrvsMapPersistence
 * @see SrvTypeSrvsMapUtil
 * @generated
 */
public class SrvTypeSrvsMapPersistenceImpl extends BasePersistenceImpl<SrvTypeSrvsMap>
    implements SrvTypeSrvsMapPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SrvTypeSrvsMapUtil} to access the srv type srvs map persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SrvTypeSrvsMapImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            SrvTypeSrvsMapImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            SrvTypeSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            SrvTypeSrvsMapImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByServiceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapModelImpl.FINDER_CACHE_ENABLED,
            SrvTypeSrvsMapImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServiceId",
            new String[] { Long.class.getName() },
            SrvTypeSrvsMapModelImpl.SERVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "srvTypeSrvsMap.serviceId = ?";
    private static final String _SQL_SELECT_SRVTYPESRVSMAP = "SELECT srvTypeSrvsMap FROM SrvTypeSrvsMap srvTypeSrvsMap";
    private static final String _SQL_SELECT_SRVTYPESRVSMAP_WHERE = "SELECT srvTypeSrvsMap FROM SrvTypeSrvsMap srvTypeSrvsMap WHERE ";
    private static final String _SQL_COUNT_SRVTYPESRVSMAP = "SELECT COUNT(srvTypeSrvsMap) FROM SrvTypeSrvsMap srvTypeSrvsMap";
    private static final String _SQL_COUNT_SRVTYPESRVSMAP_WHERE = "SELECT COUNT(srvTypeSrvsMap) FROM SrvTypeSrvsMap srvTypeSrvsMap WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "srvTypeSrvsMap.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SrvTypeSrvsMap exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SrvTypeSrvsMap exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SrvTypeSrvsMapPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "serviceId", "serviceTypeId"
            });
    private static SrvTypeSrvsMap _nullSrvTypeSrvsMap = new SrvTypeSrvsMapImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<SrvTypeSrvsMap> toCacheModel() {
                return _nullSrvTypeSrvsMapCacheModel;
            }
        };

    private static CacheModel<SrvTypeSrvsMap> _nullSrvTypeSrvsMapCacheModel = new CacheModel<SrvTypeSrvsMap>() {
            @Override
            public SrvTypeSrvsMap toEntityModel() {
                return _nullSrvTypeSrvsMap;
            }
        };

    public SrvTypeSrvsMapPersistenceImpl() {
        setModelClass(SrvTypeSrvsMap.class);
    }

    /**
     * Returns all the srv type srvs maps where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the matching srv type srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypeSrvsMap> findByServiceId(long serviceId)
        throws SystemException {
        return findByServiceId(serviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the srv type srvs maps where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of srv type srvs maps
     * @param end the upper bound of the range of srv type srvs maps (not inclusive)
     * @return the range of matching srv type srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypeSrvsMap> findByServiceId(long serviceId, int start,
        int end) throws SystemException {
        return findByServiceId(serviceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the srv type srvs maps where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of srv type srvs maps
     * @param end the upper bound of the range of srv type srvs maps (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching srv type srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypeSrvsMap> findByServiceId(long serviceId, int start,
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

        List<SrvTypeSrvsMap> list = (List<SrvTypeSrvsMap>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (SrvTypeSrvsMap srvTypeSrvsMap : list) {
                if ((serviceId != srvTypeSrvsMap.getServiceId())) {
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

            query.append(_SQL_SELECT_SRVTYPESRVSMAP_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SrvTypeSrvsMapModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

                if (!pagination) {
                    list = (List<SrvTypeSrvsMap>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SrvTypeSrvsMap>(list);
                } else {
                    list = (List<SrvTypeSrvsMap>) QueryUtil.list(q,
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
     * Returns the first srv type srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching srv type srvs map
     * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a matching srv type srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap findByServiceId_First(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchSrvTypeSrvsMapException, SystemException {
        SrvTypeSrvsMap srvTypeSrvsMap = fetchByServiceId_First(serviceId,
                orderByComparator);

        if (srvTypeSrvsMap != null) {
            return srvTypeSrvsMap;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSrvTypeSrvsMapException(msg.toString());
    }

    /**
     * Returns the first srv type srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching srv type srvs map, or <code>null</code> if a matching srv type srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap fetchByServiceId_First(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<SrvTypeSrvsMap> list = findByServiceId(serviceId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last srv type srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching srv type srvs map
     * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a matching srv type srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap findByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchSrvTypeSrvsMapException, SystemException {
        SrvTypeSrvsMap srvTypeSrvsMap = fetchByServiceId_Last(serviceId,
                orderByComparator);

        if (srvTypeSrvsMap != null) {
            return srvTypeSrvsMap;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSrvTypeSrvsMapException(msg.toString());
    }

    /**
     * Returns the last srv type srvs map in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching srv type srvs map, or <code>null</code> if a matching srv type srvs map could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap fetchByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByServiceId(serviceId);

        if (count == 0) {
            return null;
        }

        List<SrvTypeSrvsMap> list = findByServiceId(serviceId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the srv type srvs maps before and after the current srv type srvs map in the ordered set where serviceId = &#63;.
     *
     * @param id the primary key of the current srv type srvs map
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next srv type srvs map
     * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a srv type srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap[] findByServiceId_PrevAndNext(String id,
        long serviceId, OrderByComparator orderByComparator)
        throws NoSuchSrvTypeSrvsMapException, SystemException {
        SrvTypeSrvsMap srvTypeSrvsMap = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            SrvTypeSrvsMap[] array = new SrvTypeSrvsMapImpl[3];

            array[0] = getByServiceId_PrevAndNext(session, srvTypeSrvsMap,
                    serviceId, orderByComparator, true);

            array[1] = srvTypeSrvsMap;

            array[2] = getByServiceId_PrevAndNext(session, srvTypeSrvsMap,
                    serviceId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected SrvTypeSrvsMap getByServiceId_PrevAndNext(Session session,
        SrvTypeSrvsMap srvTypeSrvsMap, long serviceId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SRVTYPESRVSMAP_WHERE);

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
            query.append(SrvTypeSrvsMapModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(srvTypeSrvsMap);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<SrvTypeSrvsMap> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the srv type srvs maps where serviceId = &#63; from the database.
     *
     * @param serviceId the service ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByServiceId(long serviceId) throws SystemException {
        for (SrvTypeSrvsMap srvTypeSrvsMap : findByServiceId(serviceId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(srvTypeSrvsMap);
        }
    }

    /**
     * Returns the number of srv type srvs maps where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the number of matching srv type srvs maps
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

            query.append(_SQL_COUNT_SRVTYPESRVSMAP_WHERE);

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
     * Caches the srv type srvs map in the entity cache if it is enabled.
     *
     * @param srvTypeSrvsMap the srv type srvs map
     */
    @Override
    public void cacheResult(SrvTypeSrvsMap srvTypeSrvsMap) {
        EntityCacheUtil.putResult(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapImpl.class, srvTypeSrvsMap.getPrimaryKey(),
            srvTypeSrvsMap);

        srvTypeSrvsMap.resetOriginalValues();
    }

    /**
     * Caches the srv type srvs maps in the entity cache if it is enabled.
     *
     * @param srvTypeSrvsMaps the srv type srvs maps
     */
    @Override
    public void cacheResult(List<SrvTypeSrvsMap> srvTypeSrvsMaps) {
        for (SrvTypeSrvsMap srvTypeSrvsMap : srvTypeSrvsMaps) {
            if (EntityCacheUtil.getResult(
                        SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                        SrvTypeSrvsMapImpl.class, srvTypeSrvsMap.getPrimaryKey()) == null) {
                cacheResult(srvTypeSrvsMap);
            } else {
                srvTypeSrvsMap.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all srv type srvs maps.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SrvTypeSrvsMapImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SrvTypeSrvsMapImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the srv type srvs map.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(SrvTypeSrvsMap srvTypeSrvsMap) {
        EntityCacheUtil.removeResult(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapImpl.class, srvTypeSrvsMap.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<SrvTypeSrvsMap> srvTypeSrvsMaps) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (SrvTypeSrvsMap srvTypeSrvsMap : srvTypeSrvsMaps) {
            EntityCacheUtil.removeResult(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                SrvTypeSrvsMapImpl.class, srvTypeSrvsMap.getPrimaryKey());
        }
    }

    /**
     * Creates a new srv type srvs map with the primary key. Does not add the srv type srvs map to the database.
     *
     * @param id the primary key for the new srv type srvs map
     * @return the new srv type srvs map
     */
    @Override
    public SrvTypeSrvsMap create(String id) {
        SrvTypeSrvsMap srvTypeSrvsMap = new SrvTypeSrvsMapImpl();

        srvTypeSrvsMap.setNew(true);
        srvTypeSrvsMap.setPrimaryKey(id);

        return srvTypeSrvsMap;
    }

    /**
     * Removes the srv type srvs map with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the srv type srvs map
     * @return the srv type srvs map that was removed
     * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a srv type srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap remove(String id)
        throws NoSuchSrvTypeSrvsMapException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the srv type srvs map with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the srv type srvs map
     * @return the srv type srvs map that was removed
     * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a srv type srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap remove(Serializable primaryKey)
        throws NoSuchSrvTypeSrvsMapException, SystemException {
        Session session = null;

        try {
            session = openSession();

            SrvTypeSrvsMap srvTypeSrvsMap = (SrvTypeSrvsMap) session.get(SrvTypeSrvsMapImpl.class,
                    primaryKey);

            if (srvTypeSrvsMap == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSrvTypeSrvsMapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(srvTypeSrvsMap);
        } catch (NoSuchSrvTypeSrvsMapException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected SrvTypeSrvsMap removeImpl(SrvTypeSrvsMap srvTypeSrvsMap)
        throws SystemException {
        srvTypeSrvsMap = toUnwrappedModel(srvTypeSrvsMap);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(srvTypeSrvsMap)) {
                srvTypeSrvsMap = (SrvTypeSrvsMap) session.get(SrvTypeSrvsMapImpl.class,
                        srvTypeSrvsMap.getPrimaryKeyObj());
            }

            if (srvTypeSrvsMap != null) {
                session.delete(srvTypeSrvsMap);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (srvTypeSrvsMap != null) {
            clearCache(srvTypeSrvsMap);
        }

        return srvTypeSrvsMap;
    }

    @Override
    public SrvTypeSrvsMap updateImpl(
        com.stc.echannels.epayments.model.SrvTypeSrvsMap srvTypeSrvsMap)
        throws SystemException {
        srvTypeSrvsMap = toUnwrappedModel(srvTypeSrvsMap);

        boolean isNew = srvTypeSrvsMap.isNew();

        SrvTypeSrvsMapModelImpl srvTypeSrvsMapModelImpl = (SrvTypeSrvsMapModelImpl) srvTypeSrvsMap;

        Session session = null;

        try {
            session = openSession();

            if (srvTypeSrvsMap.isNew()) {
                session.save(srvTypeSrvsMap);

                srvTypeSrvsMap.setNew(false);
            } else {
                session.merge(srvTypeSrvsMap);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SrvTypeSrvsMapModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((srvTypeSrvsMapModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        srvTypeSrvsMapModelImpl.getOriginalServiceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] { srvTypeSrvsMapModelImpl.getServiceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
            SrvTypeSrvsMapImpl.class, srvTypeSrvsMap.getPrimaryKey(),
            srvTypeSrvsMap);

        return srvTypeSrvsMap;
    }

    protected SrvTypeSrvsMap toUnwrappedModel(SrvTypeSrvsMap srvTypeSrvsMap) {
        if (srvTypeSrvsMap instanceof SrvTypeSrvsMapImpl) {
            return srvTypeSrvsMap;
        }

        SrvTypeSrvsMapImpl srvTypeSrvsMapImpl = new SrvTypeSrvsMapImpl();

        srvTypeSrvsMapImpl.setNew(srvTypeSrvsMap.isNew());
        srvTypeSrvsMapImpl.setPrimaryKey(srvTypeSrvsMap.getPrimaryKey());

        srvTypeSrvsMapImpl.setId(srvTypeSrvsMap.getId());
        srvTypeSrvsMapImpl.setServiceId(srvTypeSrvsMap.getServiceId());
        srvTypeSrvsMapImpl.setServiceTypeId(srvTypeSrvsMap.getServiceTypeId());

        return srvTypeSrvsMapImpl;
    }

    /**
     * Returns the srv type srvs map with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the srv type srvs map
     * @return the srv type srvs map
     * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a srv type srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSrvTypeSrvsMapException, SystemException {
        SrvTypeSrvsMap srvTypeSrvsMap = fetchByPrimaryKey(primaryKey);

        if (srvTypeSrvsMap == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSrvTypeSrvsMapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return srvTypeSrvsMap;
    }

    /**
     * Returns the srv type srvs map with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException} if it could not be found.
     *
     * @param id the primary key of the srv type srvs map
     * @return the srv type srvs map
     * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a srv type srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap findByPrimaryKey(String id)
        throws NoSuchSrvTypeSrvsMapException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the srv type srvs map with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the srv type srvs map
     * @return the srv type srvs map, or <code>null</code> if a srv type srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        SrvTypeSrvsMap srvTypeSrvsMap = (SrvTypeSrvsMap) EntityCacheUtil.getResult(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                SrvTypeSrvsMapImpl.class, primaryKey);

        if (srvTypeSrvsMap == _nullSrvTypeSrvsMap) {
            return null;
        }

        if (srvTypeSrvsMap == null) {
            Session session = null;

            try {
                session = openSession();

                srvTypeSrvsMap = (SrvTypeSrvsMap) session.get(SrvTypeSrvsMapImpl.class,
                        primaryKey);

                if (srvTypeSrvsMap != null) {
                    cacheResult(srvTypeSrvsMap);
                } else {
                    EntityCacheUtil.putResult(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                        SrvTypeSrvsMapImpl.class, primaryKey,
                        _nullSrvTypeSrvsMap);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SrvTypeSrvsMapModelImpl.ENTITY_CACHE_ENABLED,
                    SrvTypeSrvsMapImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return srvTypeSrvsMap;
    }

    /**
     * Returns the srv type srvs map with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the srv type srvs map
     * @return the srv type srvs map, or <code>null</code> if a srv type srvs map with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public SrvTypeSrvsMap fetchByPrimaryKey(String id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the srv type srvs maps.
     *
     * @return the srv type srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypeSrvsMap> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the srv type srvs maps.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of srv type srvs maps
     * @param end the upper bound of the range of srv type srvs maps (not inclusive)
     * @return the range of srv type srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypeSrvsMap> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the srv type srvs maps.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of srv type srvs maps
     * @param end the upper bound of the range of srv type srvs maps (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of srv type srvs maps
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<SrvTypeSrvsMap> findAll(int start, int end,
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

        List<SrvTypeSrvsMap> list = (List<SrvTypeSrvsMap>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SRVTYPESRVSMAP);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SRVTYPESRVSMAP;

                if (pagination) {
                    sql = sql.concat(SrvTypeSrvsMapModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<SrvTypeSrvsMap>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<SrvTypeSrvsMap>(list);
                } else {
                    list = (List<SrvTypeSrvsMap>) QueryUtil.list(q,
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
     * Removes all the srv type srvs maps from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (SrvTypeSrvsMap srvTypeSrvsMap : findAll()) {
            remove(srvTypeSrvsMap);
        }
    }

    /**
     * Returns the number of srv type srvs maps.
     *
     * @return the number of srv type srvs maps
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

                Query q = session.createQuery(_SQL_COUNT_SRVTYPESRVSMAP);

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
     * Initializes the srv type srvs map persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.SrvTypeSrvsMap")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<SrvTypeSrvsMap>> listenersList = new ArrayList<ModelListener<SrvTypeSrvsMap>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<SrvTypeSrvsMap>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SrvTypeSrvsMapImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
