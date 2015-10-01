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

import com.stc.echannels.epayments.NoSuchBusinessSrvException;
import com.stc.echannels.epayments.model.BusinessSrv;
import com.stc.echannels.epayments.model.impl.BusinessSrvImpl;
import com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl;
import com.stc.echannels.epayments.service.persistence.BusinessSrvPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the business srv service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BusinessSrvPersistence
 * @see BusinessSrvUtil
 * @generated
 */
public class BusinessSrvPersistenceImpl extends BasePersistenceImpl<BusinessSrv>
    implements BusinessSrvPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BusinessSrvUtil} to access the business srv persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BusinessSrvImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvModelImpl.FINDER_CACHE_ENABLED, BusinessSrvImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvModelImpl.FINDER_CACHE_ENABLED, BusinessSrvImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvModelImpl.FINDER_CACHE_ENABLED, BusinessSrvImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvModelImpl.FINDER_CACHE_ENABLED, BusinessSrvImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { String.class.getName() },
            BusinessSrvModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "businessSrv.status IS NULL";
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "businessSrv.status = ?";
    private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(businessSrv.status IS NULL OR businessSrv.status = '')";
    private static final String _SQL_SELECT_BUSINESSSRV = "SELECT businessSrv FROM BusinessSrv businessSrv";
    private static final String _SQL_SELECT_BUSINESSSRV_WHERE = "SELECT businessSrv FROM BusinessSrv businessSrv WHERE ";
    private static final String _SQL_COUNT_BUSINESSSRV = "SELECT COUNT(businessSrv) FROM BusinessSrv businessSrv";
    private static final String _SQL_COUNT_BUSINESSSRV_WHERE = "SELECT COUNT(businessSrv) FROM BusinessSrv businessSrv WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "businessSrv.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BusinessSrv exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BusinessSrv exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BusinessSrvPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "serviceId", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp", "refMask",
                "serviceType", "serviceNameEn", "serviceNameAr"
            });
    private static BusinessSrv _nullBusinessSrv = new BusinessSrvImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BusinessSrv> toCacheModel() {
                return _nullBusinessSrvCacheModel;
            }
        };

    private static CacheModel<BusinessSrv> _nullBusinessSrvCacheModel = new CacheModel<BusinessSrv>() {
            @Override
            public BusinessSrv toEntityModel() {
                return _nullBusinessSrv;
            }
        };

    public BusinessSrvPersistenceImpl() {
        setModelClass(BusinessSrv.class);
    }

    /**
     * Returns all the business srvs where status = &#63;.
     *
     * @param status the status
     * @return the matching business srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessSrv> findByStatus(String status)
        throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the business srvs where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of business srvs
     * @param end the upper bound of the range of business srvs (not inclusive)
     * @return the range of matching business srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessSrv> findByStatus(String status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the business srvs where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of business srvs
     * @param end the upper bound of the range of business srvs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching business srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessSrv> findByStatus(String status, int start, int end,
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

        List<BusinessSrv> list = (List<BusinessSrv>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BusinessSrv businessSrv : list) {
                if (!Validator.equals(status, businessSrv.getStatus())) {
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

            query.append(_SQL_SELECT_BUSINESSSRV_WHERE);

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
                query.append(BusinessSrvModelImpl.ORDER_BY_JPQL);
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
                    list = (List<BusinessSrv>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BusinessSrv>(list);
                } else {
                    list = (List<BusinessSrv>) QueryUtil.list(q, getDialect(),
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
     * Returns the first business srv in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching business srv
     * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a matching business srv could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv findByStatus_First(String status,
        OrderByComparator orderByComparator)
        throws NoSuchBusinessSrvException, SystemException {
        BusinessSrv businessSrv = fetchByStatus_First(status, orderByComparator);

        if (businessSrv != null) {
            return businessSrv;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBusinessSrvException(msg.toString());
    }

    /**
     * Returns the first business srv in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching business srv, or <code>null</code> if a matching business srv could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv fetchByStatus_First(String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<BusinessSrv> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last business srv in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching business srv
     * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a matching business srv could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv findByStatus_Last(String status,
        OrderByComparator orderByComparator)
        throws NoSuchBusinessSrvException, SystemException {
        BusinessSrv businessSrv = fetchByStatus_Last(status, orderByComparator);

        if (businessSrv != null) {
            return businessSrv;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBusinessSrvException(msg.toString());
    }

    /**
     * Returns the last business srv in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching business srv, or <code>null</code> if a matching business srv could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv fetchByStatus_Last(String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<BusinessSrv> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the business srvs before and after the current business srv in the ordered set where status = &#63;.
     *
     * @param serviceId the primary key of the current business srv
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next business srv
     * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a business srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv[] findByStatus_PrevAndNext(long serviceId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchBusinessSrvException, SystemException {
        BusinessSrv businessSrv = findByPrimaryKey(serviceId);

        Session session = null;

        try {
            session = openSession();

            BusinessSrv[] array = new BusinessSrvImpl[3];

            array[0] = getByStatus_PrevAndNext(session, businessSrv, status,
                    orderByComparator, true);

            array[1] = businessSrv;

            array[2] = getByStatus_PrevAndNext(session, businessSrv, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BusinessSrv getByStatus_PrevAndNext(Session session,
        BusinessSrv businessSrv, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BUSINESSSRV_WHERE);

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
            query.append(BusinessSrvModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(businessSrv);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BusinessSrv> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the business srvs where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(String status) throws SystemException {
        for (BusinessSrv businessSrv : findByStatus(status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(businessSrv);
        }
    }

    /**
     * Returns the number of business srvs where status = &#63;.
     *
     * @param status the status
     * @return the number of matching business srvs
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

            query.append(_SQL_COUNT_BUSINESSSRV_WHERE);

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
     * Caches the business srv in the entity cache if it is enabled.
     *
     * @param businessSrv the business srv
     */
    @Override
    public void cacheResult(BusinessSrv businessSrv) {
        EntityCacheUtil.putResult(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvImpl.class, businessSrv.getPrimaryKey(), businessSrv);

        businessSrv.resetOriginalValues();
    }

    /**
     * Caches the business srvs in the entity cache if it is enabled.
     *
     * @param businessSrvs the business srvs
     */
    @Override
    public void cacheResult(List<BusinessSrv> businessSrvs) {
        for (BusinessSrv businessSrv : businessSrvs) {
            if (EntityCacheUtil.getResult(
                        BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
                        BusinessSrvImpl.class, businessSrv.getPrimaryKey()) == null) {
                cacheResult(businessSrv);
            } else {
                businessSrv.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all business srvs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BusinessSrvImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BusinessSrvImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the business srv.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BusinessSrv businessSrv) {
        EntityCacheUtil.removeResult(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvImpl.class, businessSrv.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BusinessSrv> businessSrvs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BusinessSrv businessSrv : businessSrvs) {
            EntityCacheUtil.removeResult(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
                BusinessSrvImpl.class, businessSrv.getPrimaryKey());
        }
    }

    /**
     * Creates a new business srv with the primary key. Does not add the business srv to the database.
     *
     * @param serviceId the primary key for the new business srv
     * @return the new business srv
     */
    @Override
    public BusinessSrv create(long serviceId) {
        BusinessSrv businessSrv = new BusinessSrvImpl();

        businessSrv.setNew(true);
        businessSrv.setPrimaryKey(serviceId);

        return businessSrv;
    }

    /**
     * Removes the business srv with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param serviceId the primary key of the business srv
     * @return the business srv that was removed
     * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a business srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv remove(long serviceId)
        throws NoSuchBusinessSrvException, SystemException {
        return remove((Serializable) serviceId);
    }

    /**
     * Removes the business srv with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the business srv
     * @return the business srv that was removed
     * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a business srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv remove(Serializable primaryKey)
        throws NoSuchBusinessSrvException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BusinessSrv businessSrv = (BusinessSrv) session.get(BusinessSrvImpl.class,
                    primaryKey);

            if (businessSrv == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBusinessSrvException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(businessSrv);
        } catch (NoSuchBusinessSrvException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BusinessSrv removeImpl(BusinessSrv businessSrv)
        throws SystemException {
        businessSrv = toUnwrappedModel(businessSrv);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(businessSrv)) {
                businessSrv = (BusinessSrv) session.get(BusinessSrvImpl.class,
                        businessSrv.getPrimaryKeyObj());
            }

            if (businessSrv != null) {
                session.delete(businessSrv);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (businessSrv != null) {
            clearCache(businessSrv);
        }

        return businessSrv;
    }

    @Override
    public BusinessSrv updateImpl(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv)
        throws SystemException {
        businessSrv = toUnwrappedModel(businessSrv);

        boolean isNew = businessSrv.isNew();

        BusinessSrvModelImpl businessSrvModelImpl = (BusinessSrvModelImpl) businessSrv;

        Session session = null;

        try {
            session = openSession();

            if (businessSrv.isNew()) {
                session.save(businessSrv);

                businessSrv.setNew(false);
            } else {
                session.merge(businessSrv);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BusinessSrvModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((businessSrvModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        businessSrvModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { businessSrvModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
            BusinessSrvImpl.class, businessSrv.getPrimaryKey(), businessSrv);

        return businessSrv;
    }

    protected BusinessSrv toUnwrappedModel(BusinessSrv businessSrv) {
        if (businessSrv instanceof BusinessSrvImpl) {
            return businessSrv;
        }

        BusinessSrvImpl businessSrvImpl = new BusinessSrvImpl();

        businessSrvImpl.setNew(businessSrv.isNew());
        businessSrvImpl.setPrimaryKey(businessSrv.getPrimaryKey());

        businessSrvImpl.setServiceId(businessSrv.getServiceId());
        businessSrvImpl.setLastUpdateTimestamp(businessSrv.getLastUpdateTimestamp());
        businessSrvImpl.setLastUpdateUserid(businessSrv.getLastUpdateUserid());
        businessSrvImpl.setLastUpdateUsername(businessSrv.getLastUpdateUsername());
        businessSrvImpl.setStatus(businessSrv.getStatus());
        businessSrvImpl.setEffectiveTimestamp(businessSrv.getEffectiveTimestamp());
        businessSrvImpl.setRefMask(businessSrv.getRefMask());
        businessSrvImpl.setServiceType(businessSrv.getServiceType());
        businessSrvImpl.setServiceNameEn(businessSrv.getServiceNameEn());
        businessSrvImpl.setServiceNameAr(businessSrv.getServiceNameAr());

        return businessSrvImpl;
    }

    /**
     * Returns the business srv with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the business srv
     * @return the business srv
     * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a business srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBusinessSrvException, SystemException {
        BusinessSrv businessSrv = fetchByPrimaryKey(primaryKey);

        if (businessSrv == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBusinessSrvException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return businessSrv;
    }

    /**
     * Returns the business srv with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBusinessSrvException} if it could not be found.
     *
     * @param serviceId the primary key of the business srv
     * @return the business srv
     * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a business srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv findByPrimaryKey(long serviceId)
        throws NoSuchBusinessSrvException, SystemException {
        return findByPrimaryKey((Serializable) serviceId);
    }

    /**
     * Returns the business srv with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the business srv
     * @return the business srv, or <code>null</code> if a business srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BusinessSrv businessSrv = (BusinessSrv) EntityCacheUtil.getResult(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
                BusinessSrvImpl.class, primaryKey);

        if (businessSrv == _nullBusinessSrv) {
            return null;
        }

        if (businessSrv == null) {
            Session session = null;

            try {
                session = openSession();

                businessSrv = (BusinessSrv) session.get(BusinessSrvImpl.class,
                        primaryKey);

                if (businessSrv != null) {
                    cacheResult(businessSrv);
                } else {
                    EntityCacheUtil.putResult(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
                        BusinessSrvImpl.class, primaryKey, _nullBusinessSrv);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BusinessSrvModelImpl.ENTITY_CACHE_ENABLED,
                    BusinessSrvImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return businessSrv;
    }

    /**
     * Returns the business srv with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param serviceId the primary key of the business srv
     * @return the business srv, or <code>null</code> if a business srv with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BusinessSrv fetchByPrimaryKey(long serviceId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) serviceId);
    }

    /**
     * Returns all the business srvs.
     *
     * @return the business srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessSrv> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the business srvs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of business srvs
     * @param end the upper bound of the range of business srvs (not inclusive)
     * @return the range of business srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessSrv> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the business srvs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of business srvs
     * @param end the upper bound of the range of business srvs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of business srvs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BusinessSrv> findAll(int start, int end,
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

        List<BusinessSrv> list = (List<BusinessSrv>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BUSINESSSRV);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BUSINESSSRV;

                if (pagination) {
                    sql = sql.concat(BusinessSrvModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BusinessSrv>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BusinessSrv>(list);
                } else {
                    list = (List<BusinessSrv>) QueryUtil.list(q, getDialect(),
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
     * Removes all the business srvs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BusinessSrv businessSrv : findAll()) {
            remove(businessSrv);
        }
    }

    /**
     * Returns the number of business srvs.
     *
     * @return the number of business srvs
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

                Query q = session.createQuery(_SQL_COUNT_BUSINESSSRV);

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
     * Initializes the business srv persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.BusinessSrv")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BusinessSrv>> listenersList = new ArrayList<ModelListener<BusinessSrv>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BusinessSrv>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BusinessSrvImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
