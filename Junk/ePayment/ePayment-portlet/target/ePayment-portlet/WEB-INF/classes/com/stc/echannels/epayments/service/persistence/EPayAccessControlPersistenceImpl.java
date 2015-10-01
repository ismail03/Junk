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

import com.stc.echannels.epayments.NoSuchEPayAccessControlException;
import com.stc.echannels.epayments.model.EPayAccessControl;
import com.stc.echannels.epayments.model.impl.EPayAccessControlImpl;
import com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl;
import com.stc.echannels.epayments.service.persistence.EPayAccessControlPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the e pay access control service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see EPayAccessControlPersistence
 * @see EPayAccessControlUtil
 * @generated
 */
public class EPayAccessControlPersistenceImpl extends BasePersistenceImpl<EPayAccessControl>
    implements EPayAccessControlPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EPayAccessControlUtil} to access the e pay access control persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EPayAccessControlImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED,
            EPayAccessControlImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED,
            EPayAccessControlImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED,
            EPayAccessControlImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServiceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED,
            EPayAccessControlImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServiceId",
            new String[] { Long.class.getName() },
            EPayAccessControlModelImpl.SERVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServiceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "ePayAccessControl.serviceId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEIDANDSTATUS =
        new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED,
            EPayAccessControlImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByserviceIdAndstatus",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDSTATUS =
        new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED,
            EPayAccessControlImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByserviceIdAndstatus",
            new String[] { Long.class.getName(), String.class.getName() },
            EPayAccessControlModelImpl.SERVICEID_COLUMN_BITMASK |
            EPayAccessControlModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEIDANDSTATUS = new FinderPath(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByserviceIdAndstatus",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEIDANDSTATUS_SERVICEID_2 = "ePayAccessControl.serviceId = ? AND ";
    private static final String _FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_1 = "ePayAccessControl.status IS NULL";
    private static final String _FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_2 = "ePayAccessControl.status = ?";
    private static final String _FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_3 = "(ePayAccessControl.status IS NULL OR ePayAccessControl.status = '')";
    private static final String _SQL_SELECT_EPAYACCESSCONTROL = "SELECT ePayAccessControl FROM EPayAccessControl ePayAccessControl";
    private static final String _SQL_SELECT_EPAYACCESSCONTROL_WHERE = "SELECT ePayAccessControl FROM EPayAccessControl ePayAccessControl WHERE ";
    private static final String _SQL_COUNT_EPAYACCESSCONTROL = "SELECT COUNT(ePayAccessControl) FROM EPayAccessControl ePayAccessControl";
    private static final String _SQL_COUNT_EPAYACCESSCONTROL_WHERE = "SELECT COUNT(ePayAccessControl) FROM EPayAccessControl ePayAccessControl WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "ePayAccessControl.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EPayAccessControl exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EPayAccessControl exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EPayAccessControlPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "epayCofignId", "serviceId", "serviceTypeId", "channelId",
                "pmtMethodId", "transId", "clientIP", "serverIP", "userAgent",
                "operation", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp"
            });
    private static EPayAccessControl _nullEPayAccessControl = new EPayAccessControlImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EPayAccessControl> toCacheModel() {
                return _nullEPayAccessControlCacheModel;
            }
        };

    private static CacheModel<EPayAccessControl> _nullEPayAccessControlCacheModel =
        new CacheModel<EPayAccessControl>() {
            @Override
            public EPayAccessControl toEntityModel() {
                return _nullEPayAccessControl;
            }
        };

    public EPayAccessControlPersistenceImpl() {
        setModelClass(EPayAccessControl.class);
    }

    /**
     * Returns all the e pay access controls where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the matching e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findByServiceId(long serviceId)
        throws SystemException {
        return findByServiceId(serviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the e pay access controls where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of e pay access controls
     * @param end the upper bound of the range of e pay access controls (not inclusive)
     * @return the range of matching e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findByServiceId(long serviceId, int start,
        int end) throws SystemException {
        return findByServiceId(serviceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the e pay access controls where serviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param start the lower bound of the range of e pay access controls
     * @param end the upper bound of the range of e pay access controls (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findByServiceId(long serviceId, int start,
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

        List<EPayAccessControl> list = (List<EPayAccessControl>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EPayAccessControl ePayAccessControl : list) {
                if ((serviceId != ePayAccessControl.getServiceId())) {
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

            query.append(_SQL_SELECT_EPAYACCESSCONTROL_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EPayAccessControlModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceId);

                if (!pagination) {
                    list = (List<EPayAccessControl>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EPayAccessControl>(list);
                } else {
                    list = (List<EPayAccessControl>) QueryUtil.list(q,
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
     * Returns the first e pay access control in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching e pay access control
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl findByServiceId_First(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchEPayAccessControlException, SystemException {
        EPayAccessControl ePayAccessControl = fetchByServiceId_First(serviceId,
                orderByComparator);

        if (ePayAccessControl != null) {
            return ePayAccessControl;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEPayAccessControlException(msg.toString());
    }

    /**
     * Returns the first e pay access control in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl fetchByServiceId_First(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EPayAccessControl> list = findByServiceId(serviceId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last e pay access control in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching e pay access control
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl findByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator)
        throws NoSuchEPayAccessControlException, SystemException {
        EPayAccessControl ePayAccessControl = fetchByServiceId_Last(serviceId,
                orderByComparator);

        if (ePayAccessControl != null) {
            return ePayAccessControl;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEPayAccessControlException(msg.toString());
    }

    /**
     * Returns the last e pay access control in the ordered set where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl fetchByServiceId_Last(long serviceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByServiceId(serviceId);

        if (count == 0) {
            return null;
        }

        List<EPayAccessControl> list = findByServiceId(serviceId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the e pay access controls before and after the current e pay access control in the ordered set where serviceId = &#63;.
     *
     * @param epayCofignId the primary key of the current e pay access control
     * @param serviceId the service ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next e pay access control
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl[] findByServiceId_PrevAndNext(long epayCofignId,
        long serviceId, OrderByComparator orderByComparator)
        throws NoSuchEPayAccessControlException, SystemException {
        EPayAccessControl ePayAccessControl = findByPrimaryKey(epayCofignId);

        Session session = null;

        try {
            session = openSession();

            EPayAccessControl[] array = new EPayAccessControlImpl[3];

            array[0] = getByServiceId_PrevAndNext(session, ePayAccessControl,
                    serviceId, orderByComparator, true);

            array[1] = ePayAccessControl;

            array[2] = getByServiceId_PrevAndNext(session, ePayAccessControl,
                    serviceId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EPayAccessControl getByServiceId_PrevAndNext(Session session,
        EPayAccessControl ePayAccessControl, long serviceId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EPAYACCESSCONTROL_WHERE);

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
            query.append(EPayAccessControlModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ePayAccessControl);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EPayAccessControl> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the e pay access controls where serviceId = &#63; from the database.
     *
     * @param serviceId the service ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByServiceId(long serviceId) throws SystemException {
        for (EPayAccessControl ePayAccessControl : findByServiceId(serviceId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(ePayAccessControl);
        }
    }

    /**
     * Returns the number of e pay access controls where serviceId = &#63;.
     *
     * @param serviceId the service ID
     * @return the number of matching e pay access controls
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

            query.append(_SQL_COUNT_EPAYACCESSCONTROL_WHERE);

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
     * Returns all the e pay access controls where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @return the matching e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findByserviceIdAndstatus(long serviceId,
        String status) throws SystemException {
        return findByserviceIdAndstatus(serviceId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the e pay access controls where serviceId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param status the status
     * @param start the lower bound of the range of e pay access controls
     * @param end the upper bound of the range of e pay access controls (not inclusive)
     * @return the range of matching e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findByserviceIdAndstatus(long serviceId,
        String status, int start, int end) throws SystemException {
        return findByserviceIdAndstatus(serviceId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the e pay access controls where serviceId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceId the service ID
     * @param status the status
     * @param start the lower bound of the range of e pay access controls
     * @param end the upper bound of the range of e pay access controls (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findByserviceIdAndstatus(long serviceId,
        String status, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDSTATUS;
            finderArgs = new Object[] { serviceId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEIDANDSTATUS;
            finderArgs = new Object[] {
                    serviceId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<EPayAccessControl> list = (List<EPayAccessControl>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EPayAccessControl ePayAccessControl : list) {
                if ((serviceId != ePayAccessControl.getServiceId()) ||
                        !Validator.equals(status, ePayAccessControl.getStatus())) {
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

            query.append(_SQL_SELECT_EPAYACCESSCONTROL_WHERE);

            query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_SERVICEID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EPayAccessControlModelImpl.ORDER_BY_JPQL);
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
                    list = (List<EPayAccessControl>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EPayAccessControl>(list);
                } else {
                    list = (List<EPayAccessControl>) QueryUtil.list(q,
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
     * Returns the first e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching e pay access control
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl findByserviceIdAndstatus_First(long serviceId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchEPayAccessControlException, SystemException {
        EPayAccessControl ePayAccessControl = fetchByserviceIdAndstatus_First(serviceId,
                status, orderByComparator);

        if (ePayAccessControl != null) {
            return ePayAccessControl;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEPayAccessControlException(msg.toString());
    }

    /**
     * Returns the first e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl fetchByserviceIdAndstatus_First(long serviceId,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        List<EPayAccessControl> list = findByserviceIdAndstatus(serviceId,
                status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching e pay access control
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl findByserviceIdAndstatus_Last(long serviceId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchEPayAccessControlException, SystemException {
        EPayAccessControl ePayAccessControl = fetchByserviceIdAndstatus_Last(serviceId,
                status, orderByComparator);

        if (ePayAccessControl != null) {
            return ePayAccessControl;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceId=");
        msg.append(serviceId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEPayAccessControlException(msg.toString());
    }

    /**
     * Returns the last e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl fetchByserviceIdAndstatus_Last(long serviceId,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByserviceIdAndstatus(serviceId, status);

        if (count == 0) {
            return null;
        }

        List<EPayAccessControl> list = findByserviceIdAndstatus(serviceId,
                status, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the e pay access controls before and after the current e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
     *
     * @param epayCofignId the primary key of the current e pay access control
     * @param serviceId the service ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next e pay access control
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl[] findByserviceIdAndstatus_PrevAndNext(
        long epayCofignId, long serviceId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchEPayAccessControlException, SystemException {
        EPayAccessControl ePayAccessControl = findByPrimaryKey(epayCofignId);

        Session session = null;

        try {
            session = openSession();

            EPayAccessControl[] array = new EPayAccessControlImpl[3];

            array[0] = getByserviceIdAndstatus_PrevAndNext(session,
                    ePayAccessControl, serviceId, status, orderByComparator,
                    true);

            array[1] = ePayAccessControl;

            array[2] = getByserviceIdAndstatus_PrevAndNext(session,
                    ePayAccessControl, serviceId, status, orderByComparator,
                    false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EPayAccessControl getByserviceIdAndstatus_PrevAndNext(
        Session session, EPayAccessControl ePayAccessControl, long serviceId,
        String status, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EPAYACCESSCONTROL_WHERE);

        query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_SERVICEID_2);

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_2);
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
            query.append(EPayAccessControlModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(ePayAccessControl);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EPayAccessControl> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the e pay access controls where serviceId = &#63; and status = &#63; from the database.
     *
     * @param serviceId the service ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByserviceIdAndstatus(long serviceId, String status)
        throws SystemException {
        for (EPayAccessControl ePayAccessControl : findByserviceIdAndstatus(
                serviceId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(ePayAccessControl);
        }
    }

    /**
     * Returns the number of e pay access controls where serviceId = &#63; and status = &#63;.
     *
     * @param serviceId the service ID
     * @param status the status
     * @return the number of matching e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByserviceIdAndstatus(long serviceId, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICEIDANDSTATUS;

        Object[] finderArgs = new Object[] { serviceId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EPAYACCESSCONTROL_WHERE);

            query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_SERVICEID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_SERVICEIDANDSTATUS_STATUS_2);
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
     * Caches the e pay access control in the entity cache if it is enabled.
     *
     * @param ePayAccessControl the e pay access control
     */
    @Override
    public void cacheResult(EPayAccessControl ePayAccessControl) {
        EntityCacheUtil.putResult(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlImpl.class, ePayAccessControl.getPrimaryKey(),
            ePayAccessControl);

        ePayAccessControl.resetOriginalValues();
    }

    /**
     * Caches the e pay access controls in the entity cache if it is enabled.
     *
     * @param ePayAccessControls the e pay access controls
     */
    @Override
    public void cacheResult(List<EPayAccessControl> ePayAccessControls) {
        for (EPayAccessControl ePayAccessControl : ePayAccessControls) {
            if (EntityCacheUtil.getResult(
                        EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
                        EPayAccessControlImpl.class,
                        ePayAccessControl.getPrimaryKey()) == null) {
                cacheResult(ePayAccessControl);
            } else {
                ePayAccessControl.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all e pay access controls.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EPayAccessControlImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EPayAccessControlImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the e pay access control.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EPayAccessControl ePayAccessControl) {
        EntityCacheUtil.removeResult(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlImpl.class, ePayAccessControl.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EPayAccessControl> ePayAccessControls) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EPayAccessControl ePayAccessControl : ePayAccessControls) {
            EntityCacheUtil.removeResult(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
                EPayAccessControlImpl.class, ePayAccessControl.getPrimaryKey());
        }
    }

    /**
     * Creates a new e pay access control with the primary key. Does not add the e pay access control to the database.
     *
     * @param epayCofignId the primary key for the new e pay access control
     * @return the new e pay access control
     */
    @Override
    public EPayAccessControl create(long epayCofignId) {
        EPayAccessControl ePayAccessControl = new EPayAccessControlImpl();

        ePayAccessControl.setNew(true);
        ePayAccessControl.setPrimaryKey(epayCofignId);

        return ePayAccessControl;
    }

    /**
     * Removes the e pay access control with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param epayCofignId the primary key of the e pay access control
     * @return the e pay access control that was removed
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl remove(long epayCofignId)
        throws NoSuchEPayAccessControlException, SystemException {
        return remove((Serializable) epayCofignId);
    }

    /**
     * Removes the e pay access control with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the e pay access control
     * @return the e pay access control that was removed
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl remove(Serializable primaryKey)
        throws NoSuchEPayAccessControlException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EPayAccessControl ePayAccessControl = (EPayAccessControl) session.get(EPayAccessControlImpl.class,
                    primaryKey);

            if (ePayAccessControl == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEPayAccessControlException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(ePayAccessControl);
        } catch (NoSuchEPayAccessControlException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EPayAccessControl removeImpl(EPayAccessControl ePayAccessControl)
        throws SystemException {
        ePayAccessControl = toUnwrappedModel(ePayAccessControl);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(ePayAccessControl)) {
                ePayAccessControl = (EPayAccessControl) session.get(EPayAccessControlImpl.class,
                        ePayAccessControl.getPrimaryKeyObj());
            }

            if (ePayAccessControl != null) {
                session.delete(ePayAccessControl);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (ePayAccessControl != null) {
            clearCache(ePayAccessControl);
        }

        return ePayAccessControl;
    }

    @Override
    public EPayAccessControl updateImpl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws SystemException {
        ePayAccessControl = toUnwrappedModel(ePayAccessControl);

        boolean isNew = ePayAccessControl.isNew();

        EPayAccessControlModelImpl ePayAccessControlModelImpl = (EPayAccessControlModelImpl) ePayAccessControl;

        Session session = null;

        try {
            session = openSession();

            if (ePayAccessControl.isNew()) {
                session.save(ePayAccessControl);

                ePayAccessControl.setNew(false);
            } else {
                session.merge(ePayAccessControl);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EPayAccessControlModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((ePayAccessControlModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ePayAccessControlModelImpl.getOriginalServiceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] { ePayAccessControlModelImpl.getServiceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }

            if ((ePayAccessControlModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDSTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ePayAccessControlModelImpl.getOriginalServiceId(),
                        ePayAccessControlModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEIDANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDSTATUS,
                    args);

                args = new Object[] {
                        ePayAccessControlModelImpl.getServiceId(),
                        ePayAccessControlModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEIDANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDSTATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
            EPayAccessControlImpl.class, ePayAccessControl.getPrimaryKey(),
            ePayAccessControl);

        return ePayAccessControl;
    }

    protected EPayAccessControl toUnwrappedModel(
        EPayAccessControl ePayAccessControl) {
        if (ePayAccessControl instanceof EPayAccessControlImpl) {
            return ePayAccessControl;
        }

        EPayAccessControlImpl ePayAccessControlImpl = new EPayAccessControlImpl();

        ePayAccessControlImpl.setNew(ePayAccessControl.isNew());
        ePayAccessControlImpl.setPrimaryKey(ePayAccessControl.getPrimaryKey());

        ePayAccessControlImpl.setEpayCofignId(ePayAccessControl.getEpayCofignId());
        ePayAccessControlImpl.setServiceId(ePayAccessControl.getServiceId());
        ePayAccessControlImpl.setServiceTypeId(ePayAccessControl.getServiceTypeId());
        ePayAccessControlImpl.setChannelId(ePayAccessControl.getChannelId());
        ePayAccessControlImpl.setPmtMethodId(ePayAccessControl.getPmtMethodId());
        ePayAccessControlImpl.setTransId(ePayAccessControl.getTransId());
        ePayAccessControlImpl.setClientIP(ePayAccessControl.getClientIP());
        ePayAccessControlImpl.setServerIP(ePayAccessControl.getServerIP());
        ePayAccessControlImpl.setUserAgent(ePayAccessControl.getUserAgent());
        ePayAccessControlImpl.setOperation(ePayAccessControl.getOperation());
        ePayAccessControlImpl.setLastUpdateTimestamp(ePayAccessControl.getLastUpdateTimestamp());
        ePayAccessControlImpl.setLastUpdateUserid(ePayAccessControl.getLastUpdateUserid());
        ePayAccessControlImpl.setLastUpdateUsername(ePayAccessControl.getLastUpdateUsername());
        ePayAccessControlImpl.setStatus(ePayAccessControl.getStatus());
        ePayAccessControlImpl.setEffectiveTimestamp(ePayAccessControl.getEffectiveTimestamp());

        return ePayAccessControlImpl;
    }

    /**
     * Returns the e pay access control with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the e pay access control
     * @return the e pay access control
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEPayAccessControlException, SystemException {
        EPayAccessControl ePayAccessControl = fetchByPrimaryKey(primaryKey);

        if (ePayAccessControl == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEPayAccessControlException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return ePayAccessControl;
    }

    /**
     * Returns the e pay access control with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchEPayAccessControlException} if it could not be found.
     *
     * @param epayCofignId the primary key of the e pay access control
     * @return the e pay access control
     * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl findByPrimaryKey(long epayCofignId)
        throws NoSuchEPayAccessControlException, SystemException {
        return findByPrimaryKey((Serializable) epayCofignId);
    }

    /**
     * Returns the e pay access control with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the e pay access control
     * @return the e pay access control, or <code>null</code> if a e pay access control with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EPayAccessControl ePayAccessControl = (EPayAccessControl) EntityCacheUtil.getResult(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
                EPayAccessControlImpl.class, primaryKey);

        if (ePayAccessControl == _nullEPayAccessControl) {
            return null;
        }

        if (ePayAccessControl == null) {
            Session session = null;

            try {
                session = openSession();

                ePayAccessControl = (EPayAccessControl) session.get(EPayAccessControlImpl.class,
                        primaryKey);

                if (ePayAccessControl != null) {
                    cacheResult(ePayAccessControl);
                } else {
                    EntityCacheUtil.putResult(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
                        EPayAccessControlImpl.class, primaryKey,
                        _nullEPayAccessControl);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EPayAccessControlModelImpl.ENTITY_CACHE_ENABLED,
                    EPayAccessControlImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return ePayAccessControl;
    }

    /**
     * Returns the e pay access control with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param epayCofignId the primary key of the e pay access control
     * @return the e pay access control, or <code>null</code> if a e pay access control with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EPayAccessControl fetchByPrimaryKey(long epayCofignId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) epayCofignId);
    }

    /**
     * Returns all the e pay access controls.
     *
     * @return the e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the e pay access controls.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of e pay access controls
     * @param end the upper bound of the range of e pay access controls (not inclusive)
     * @return the range of e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the e pay access controls.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of e pay access controls
     * @param end the upper bound of the range of e pay access controls (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of e pay access controls
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EPayAccessControl> findAll(int start, int end,
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

        List<EPayAccessControl> list = (List<EPayAccessControl>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EPAYACCESSCONTROL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EPAYACCESSCONTROL;

                if (pagination) {
                    sql = sql.concat(EPayAccessControlModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EPayAccessControl>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EPayAccessControl>(list);
                } else {
                    list = (List<EPayAccessControl>) QueryUtil.list(q,
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
     * Removes all the e pay access controls from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EPayAccessControl ePayAccessControl : findAll()) {
            remove(ePayAccessControl);
        }
    }

    /**
     * Returns the number of e pay access controls.
     *
     * @return the number of e pay access controls
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

                Query q = session.createQuery(_SQL_COUNT_EPAYACCESSCONTROL);

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
     * Initializes the e pay access control persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.EPayAccessControl")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EPayAccessControl>> listenersList = new ArrayList<ModelListener<EPayAccessControl>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EPayAccessControl>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EPayAccessControlImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
