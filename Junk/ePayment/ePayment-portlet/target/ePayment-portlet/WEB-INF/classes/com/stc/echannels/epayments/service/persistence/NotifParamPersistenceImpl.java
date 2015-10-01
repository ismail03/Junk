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

import com.stc.echannels.epayments.NoSuchNotifParamException;
import com.stc.echannels.epayments.model.NotifParam;
import com.stc.echannels.epayments.model.impl.NotifParamImpl;
import com.stc.echannels.epayments.model.impl.NotifParamModelImpl;
import com.stc.echannels.epayments.service.persistence.NotifParamPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the notif param service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifParamPersistence
 * @see NotifParamUtil
 * @generated
 */
public class NotifParamPersistenceImpl extends BasePersistenceImpl<NotifParam>
    implements NotifParamPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link NotifParamUtil} to access the notif param persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = NotifParamImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, NotifParamImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, NotifParamImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOTIFPARAMID =
        new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, NotifParamImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNotifParamId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFPARAMID =
        new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, NotifParamImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNotifParamId",
            new String[] { Long.class.getName() },
            NotifParamModelImpl.NOTIFPARAMID_COLUMN_BITMASK |
            NotifParamModelImpl.PARAMNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NOTIFPARAMID = new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNotifParamId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_NOTIFPARAMID_NOTIFPARAMID_2 = "notifParam.notifParamId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAMEEN = new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, NotifParamImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNameEn",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEEN =
        new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, NotifParamImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNameEn",
            new String[] { String.class.getName() },
            NotifParamModelImpl.NAMEEN_COLUMN_BITMASK |
            NotifParamModelImpl.PARAMNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NAMEEN = new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNameEn",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NAMEEN_NAMEEN_1 = "notifParam.nameEn IS NULL";
    private static final String _FINDER_COLUMN_NAMEEN_NAMEEN_2 = "notifParam.nameEn = ?";
    private static final String _FINDER_COLUMN_NAMEEN_NAMEEN_3 = "(notifParam.nameEn IS NULL OR notifParam.nameEn = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAMEAR = new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, NotifParamImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNameAr",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEAR =
        new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, NotifParamImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNameAr",
            new String[] { String.class.getName() },
            NotifParamModelImpl.NAMEAR_COLUMN_BITMASK |
            NotifParamModelImpl.PARAMNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NAMEAR = new FinderPath(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNameAr",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NAMEAR_NAMEAR_1 = "notifParam.nameAr IS NULL";
    private static final String _FINDER_COLUMN_NAMEAR_NAMEAR_2 = "notifParam.nameAr = ?";
    private static final String _FINDER_COLUMN_NAMEAR_NAMEAR_3 = "(notifParam.nameAr IS NULL OR notifParam.nameAr = '')";
    private static final String _SQL_SELECT_NOTIFPARAM = "SELECT notifParam FROM NotifParam notifParam";
    private static final String _SQL_SELECT_NOTIFPARAM_WHERE = "SELECT notifParam FROM NotifParam notifParam WHERE ";
    private static final String _SQL_COUNT_NOTIFPARAM = "SELECT COUNT(notifParam) FROM NotifParam notifParam";
    private static final String _SQL_COUNT_NOTIFPARAM_WHERE = "SELECT COUNT(notifParam) FROM NotifParam notifParam WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "notifParam.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NotifParam exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NotifParam exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(NotifParamPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "notifParamId", "nameAr", "nameEn", "paramName"
            });
    private static NotifParam _nullNotifParam = new NotifParamImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<NotifParam> toCacheModel() {
                return _nullNotifParamCacheModel;
            }
        };

    private static CacheModel<NotifParam> _nullNotifParamCacheModel = new CacheModel<NotifParam>() {
            @Override
            public NotifParam toEntityModel() {
                return _nullNotifParam;
            }
        };

    public NotifParamPersistenceImpl() {
        setModelClass(NotifParam.class);
    }

    /**
     * Returns all the notif params where notifParamId = &#63;.
     *
     * @param notifParamId the notif param ID
     * @return the matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNotifParamId(long notifParamId)
        throws SystemException {
        return findByNotifParamId(notifParamId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif params where notifParamId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param notifParamId the notif param ID
     * @param start the lower bound of the range of notif params
     * @param end the upper bound of the range of notif params (not inclusive)
     * @return the range of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNotifParamId(long notifParamId, int start,
        int end) throws SystemException {
        return findByNotifParamId(notifParamId, start, end, null);
    }

    /**
     * Returns an ordered range of all the notif params where notifParamId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param notifParamId the notif param ID
     * @param start the lower bound of the range of notif params
     * @param end the upper bound of the range of notif params (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNotifParamId(long notifParamId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFPARAMID;
            finderArgs = new Object[] { notifParamId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOTIFPARAMID;
            finderArgs = new Object[] {
                    notifParamId,
                    
                    start, end, orderByComparator
                };
        }

        List<NotifParam> list = (List<NotifParam>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (NotifParam notifParam : list) {
                if ((notifParamId != notifParam.getNotifParamId())) {
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

            query.append(_SQL_SELECT_NOTIFPARAM_WHERE);

            query.append(_FINDER_COLUMN_NOTIFPARAMID_NOTIFPARAMID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(NotifParamModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(notifParamId);

                if (!pagination) {
                    list = (List<NotifParam>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifParam>(list);
                } else {
                    list = (List<NotifParam>) QueryUtil.list(q, getDialect(),
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
     * Returns the first notif param in the ordered set where notifParamId = &#63;.
     *
     * @param notifParamId the notif param ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam findByNotifParamId_First(long notifParamId,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = fetchByNotifParamId_First(notifParamId,
                orderByComparator);

        if (notifParam != null) {
            return notifParam;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("notifParamId=");
        msg.append(notifParamId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifParamException(msg.toString());
    }

    /**
     * Returns the first notif param in the ordered set where notifParamId = &#63;.
     *
     * @param notifParamId the notif param ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam fetchByNotifParamId_First(long notifParamId,
        OrderByComparator orderByComparator) throws SystemException {
        List<NotifParam> list = findByNotifParamId(notifParamId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last notif param in the ordered set where notifParamId = &#63;.
     *
     * @param notifParamId the notif param ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam findByNotifParamId_Last(long notifParamId,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = fetchByNotifParamId_Last(notifParamId,
                orderByComparator);

        if (notifParam != null) {
            return notifParam;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("notifParamId=");
        msg.append(notifParamId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifParamException(msg.toString());
    }

    /**
     * Returns the last notif param in the ordered set where notifParamId = &#63;.
     *
     * @param notifParamId the notif param ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam fetchByNotifParamId_Last(long notifParamId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByNotifParamId(notifParamId);

        if (count == 0) {
            return null;
        }

        List<NotifParam> list = findByNotifParamId(notifParamId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the notif params where notifParamId = &#63; from the database.
     *
     * @param notifParamId the notif param ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByNotifParamId(long notifParamId)
        throws SystemException {
        for (NotifParam notifParam : findByNotifParamId(notifParamId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(notifParam);
        }
    }

    /**
     * Returns the number of notif params where notifParamId = &#63;.
     *
     * @param notifParamId the notif param ID
     * @return the number of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNotifParamId(long notifParamId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NOTIFPARAMID;

        Object[] finderArgs = new Object[] { notifParamId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_NOTIFPARAM_WHERE);

            query.append(_FINDER_COLUMN_NOTIFPARAMID_NOTIFPARAMID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(notifParamId);

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
     * Returns all the notif params where nameEn = &#63;.
     *
     * @param nameEn the name en
     * @return the matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNameEn(String nameEn)
        throws SystemException {
        return findByNameEn(nameEn, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif params where nameEn = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nameEn the name en
     * @param start the lower bound of the range of notif params
     * @param end the upper bound of the range of notif params (not inclusive)
     * @return the range of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNameEn(String nameEn, int start, int end)
        throws SystemException {
        return findByNameEn(nameEn, start, end, null);
    }

    /**
     * Returns an ordered range of all the notif params where nameEn = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nameEn the name en
     * @param start the lower bound of the range of notif params
     * @param end the upper bound of the range of notif params (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNameEn(String nameEn, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEEN;
            finderArgs = new Object[] { nameEn };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAMEEN;
            finderArgs = new Object[] { nameEn, start, end, orderByComparator };
        }

        List<NotifParam> list = (List<NotifParam>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (NotifParam notifParam : list) {
                if (!Validator.equals(nameEn, notifParam.getNameEn())) {
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

            query.append(_SQL_SELECT_NOTIFPARAM_WHERE);

            boolean bindNameEn = false;

            if (nameEn == null) {
                query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_1);
            } else if (nameEn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_3);
            } else {
                bindNameEn = true;

                query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(NotifParamModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNameEn) {
                    qPos.add(nameEn);
                }

                if (!pagination) {
                    list = (List<NotifParam>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifParam>(list);
                } else {
                    list = (List<NotifParam>) QueryUtil.list(q, getDialect(),
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
     * Returns the first notif param in the ordered set where nameEn = &#63;.
     *
     * @param nameEn the name en
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam findByNameEn_First(String nameEn,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = fetchByNameEn_First(nameEn, orderByComparator);

        if (notifParam != null) {
            return notifParam;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nameEn=");
        msg.append(nameEn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifParamException(msg.toString());
    }

    /**
     * Returns the first notif param in the ordered set where nameEn = &#63;.
     *
     * @param nameEn the name en
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam fetchByNameEn_First(String nameEn,
        OrderByComparator orderByComparator) throws SystemException {
        List<NotifParam> list = findByNameEn(nameEn, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last notif param in the ordered set where nameEn = &#63;.
     *
     * @param nameEn the name en
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam findByNameEn_Last(String nameEn,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = fetchByNameEn_Last(nameEn, orderByComparator);

        if (notifParam != null) {
            return notifParam;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nameEn=");
        msg.append(nameEn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifParamException(msg.toString());
    }

    /**
     * Returns the last notif param in the ordered set where nameEn = &#63;.
     *
     * @param nameEn the name en
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam fetchByNameEn_Last(String nameEn,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByNameEn(nameEn);

        if (count == 0) {
            return null;
        }

        List<NotifParam> list = findByNameEn(nameEn, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the notif params before and after the current notif param in the ordered set where nameEn = &#63;.
     *
     * @param notifParamId the primary key of the current notif param
     * @param nameEn the name en
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam[] findByNameEn_PrevAndNext(long notifParamId,
        String nameEn, OrderByComparator orderByComparator)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = findByPrimaryKey(notifParamId);

        Session session = null;

        try {
            session = openSession();

            NotifParam[] array = new NotifParamImpl[3];

            array[0] = getByNameEn_PrevAndNext(session, notifParam, nameEn,
                    orderByComparator, true);

            array[1] = notifParam;

            array[2] = getByNameEn_PrevAndNext(session, notifParam, nameEn,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected NotifParam getByNameEn_PrevAndNext(Session session,
        NotifParam notifParam, String nameEn,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_NOTIFPARAM_WHERE);

        boolean bindNameEn = false;

        if (nameEn == null) {
            query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_1);
        } else if (nameEn.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_3);
        } else {
            bindNameEn = true;

            query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_2);
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
            query.append(NotifParamModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindNameEn) {
            qPos.add(nameEn);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(notifParam);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<NotifParam> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the notif params where nameEn = &#63; from the database.
     *
     * @param nameEn the name en
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByNameEn(String nameEn) throws SystemException {
        for (NotifParam notifParam : findByNameEn(nameEn, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(notifParam);
        }
    }

    /**
     * Returns the number of notif params where nameEn = &#63;.
     *
     * @param nameEn the name en
     * @return the number of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNameEn(String nameEn) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NAMEEN;

        Object[] finderArgs = new Object[] { nameEn };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_NOTIFPARAM_WHERE);

            boolean bindNameEn = false;

            if (nameEn == null) {
                query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_1);
            } else if (nameEn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_3);
            } else {
                bindNameEn = true;

                query.append(_FINDER_COLUMN_NAMEEN_NAMEEN_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNameEn) {
                    qPos.add(nameEn);
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
     * Returns all the notif params where nameAr = &#63;.
     *
     * @param nameAr the name ar
     * @return the matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNameAr(String nameAr)
        throws SystemException {
        return findByNameAr(nameAr, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif params where nameAr = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nameAr the name ar
     * @param start the lower bound of the range of notif params
     * @param end the upper bound of the range of notif params (not inclusive)
     * @return the range of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNameAr(String nameAr, int start, int end)
        throws SystemException {
        return findByNameAr(nameAr, start, end, null);
    }

    /**
     * Returns an ordered range of all the notif params where nameAr = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nameAr the name ar
     * @param start the lower bound of the range of notif params
     * @param end the upper bound of the range of notif params (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findByNameAr(String nameAr, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEAR;
            finderArgs = new Object[] { nameAr };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAMEAR;
            finderArgs = new Object[] { nameAr, start, end, orderByComparator };
        }

        List<NotifParam> list = (List<NotifParam>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (NotifParam notifParam : list) {
                if (!Validator.equals(nameAr, notifParam.getNameAr())) {
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

            query.append(_SQL_SELECT_NOTIFPARAM_WHERE);

            boolean bindNameAr = false;

            if (nameAr == null) {
                query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_1);
            } else if (nameAr.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_3);
            } else {
                bindNameAr = true;

                query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(NotifParamModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNameAr) {
                    qPos.add(nameAr);
                }

                if (!pagination) {
                    list = (List<NotifParam>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifParam>(list);
                } else {
                    list = (List<NotifParam>) QueryUtil.list(q, getDialect(),
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
     * Returns the first notif param in the ordered set where nameAr = &#63;.
     *
     * @param nameAr the name ar
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam findByNameAr_First(String nameAr,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = fetchByNameAr_First(nameAr, orderByComparator);

        if (notifParam != null) {
            return notifParam;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nameAr=");
        msg.append(nameAr);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifParamException(msg.toString());
    }

    /**
     * Returns the first notif param in the ordered set where nameAr = &#63;.
     *
     * @param nameAr the name ar
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam fetchByNameAr_First(String nameAr,
        OrderByComparator orderByComparator) throws SystemException {
        List<NotifParam> list = findByNameAr(nameAr, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last notif param in the ordered set where nameAr = &#63;.
     *
     * @param nameAr the name ar
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam findByNameAr_Last(String nameAr,
        OrderByComparator orderByComparator)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = fetchByNameAr_Last(nameAr, orderByComparator);

        if (notifParam != null) {
            return notifParam;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nameAr=");
        msg.append(nameAr);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchNotifParamException(msg.toString());
    }

    /**
     * Returns the last notif param in the ordered set where nameAr = &#63;.
     *
     * @param nameAr the name ar
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam fetchByNameAr_Last(String nameAr,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByNameAr(nameAr);

        if (count == 0) {
            return null;
        }

        List<NotifParam> list = findByNameAr(nameAr, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the notif params before and after the current notif param in the ordered set where nameAr = &#63;.
     *
     * @param notifParamId the primary key of the current notif param
     * @param nameAr the name ar
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam[] findByNameAr_PrevAndNext(long notifParamId,
        String nameAr, OrderByComparator orderByComparator)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = findByPrimaryKey(notifParamId);

        Session session = null;

        try {
            session = openSession();

            NotifParam[] array = new NotifParamImpl[3];

            array[0] = getByNameAr_PrevAndNext(session, notifParam, nameAr,
                    orderByComparator, true);

            array[1] = notifParam;

            array[2] = getByNameAr_PrevAndNext(session, notifParam, nameAr,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected NotifParam getByNameAr_PrevAndNext(Session session,
        NotifParam notifParam, String nameAr,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_NOTIFPARAM_WHERE);

        boolean bindNameAr = false;

        if (nameAr == null) {
            query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_1);
        } else if (nameAr.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_3);
        } else {
            bindNameAr = true;

            query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_2);
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
            query.append(NotifParamModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindNameAr) {
            qPos.add(nameAr);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(notifParam);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<NotifParam> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the notif params where nameAr = &#63; from the database.
     *
     * @param nameAr the name ar
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByNameAr(String nameAr) throws SystemException {
        for (NotifParam notifParam : findByNameAr(nameAr, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(notifParam);
        }
    }

    /**
     * Returns the number of notif params where nameAr = &#63;.
     *
     * @param nameAr the name ar
     * @return the number of matching notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNameAr(String nameAr) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NAMEAR;

        Object[] finderArgs = new Object[] { nameAr };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_NOTIFPARAM_WHERE);

            boolean bindNameAr = false;

            if (nameAr == null) {
                query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_1);
            } else if (nameAr.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_3);
            } else {
                bindNameAr = true;

                query.append(_FINDER_COLUMN_NAMEAR_NAMEAR_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNameAr) {
                    qPos.add(nameAr);
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
     * Caches the notif param in the entity cache if it is enabled.
     *
     * @param notifParam the notif param
     */
    @Override
    public void cacheResult(NotifParam notifParam) {
        EntityCacheUtil.putResult(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamImpl.class, notifParam.getPrimaryKey(), notifParam);

        notifParam.resetOriginalValues();
    }

    /**
     * Caches the notif params in the entity cache if it is enabled.
     *
     * @param notifParams the notif params
     */
    @Override
    public void cacheResult(List<NotifParam> notifParams) {
        for (NotifParam notifParam : notifParams) {
            if (EntityCacheUtil.getResult(
                        NotifParamModelImpl.ENTITY_CACHE_ENABLED,
                        NotifParamImpl.class, notifParam.getPrimaryKey()) == null) {
                cacheResult(notifParam);
            } else {
                notifParam.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all notif params.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(NotifParamImpl.class.getName());
        }

        EntityCacheUtil.clearCache(NotifParamImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the notif param.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(NotifParam notifParam) {
        EntityCacheUtil.removeResult(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamImpl.class, notifParam.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<NotifParam> notifParams) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (NotifParam notifParam : notifParams) {
            EntityCacheUtil.removeResult(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
                NotifParamImpl.class, notifParam.getPrimaryKey());
        }
    }

    /**
     * Creates a new notif param with the primary key. Does not add the notif param to the database.
     *
     * @param notifParamId the primary key for the new notif param
     * @return the new notif param
     */
    @Override
    public NotifParam create(long notifParamId) {
        NotifParam notifParam = new NotifParamImpl();

        notifParam.setNew(true);
        notifParam.setPrimaryKey(notifParamId);

        return notifParam;
    }

    /**
     * Removes the notif param with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param notifParamId the primary key of the notif param
     * @return the notif param that was removed
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam remove(long notifParamId)
        throws NoSuchNotifParamException, SystemException {
        return remove((Serializable) notifParamId);
    }

    /**
     * Removes the notif param with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the notif param
     * @return the notif param that was removed
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam remove(Serializable primaryKey)
        throws NoSuchNotifParamException, SystemException {
        Session session = null;

        try {
            session = openSession();

            NotifParam notifParam = (NotifParam) session.get(NotifParamImpl.class,
                    primaryKey);

            if (notifParam == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchNotifParamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(notifParam);
        } catch (NoSuchNotifParamException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected NotifParam removeImpl(NotifParam notifParam)
        throws SystemException {
        notifParam = toUnwrappedModel(notifParam);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(notifParam)) {
                notifParam = (NotifParam) session.get(NotifParamImpl.class,
                        notifParam.getPrimaryKeyObj());
            }

            if (notifParam != null) {
                session.delete(notifParam);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (notifParam != null) {
            clearCache(notifParam);
        }

        return notifParam;
    }

    @Override
    public NotifParam updateImpl(
        com.stc.echannels.epayments.model.NotifParam notifParam)
        throws SystemException {
        notifParam = toUnwrappedModel(notifParam);

        boolean isNew = notifParam.isNew();

        NotifParamModelImpl notifParamModelImpl = (NotifParamModelImpl) notifParam;

        Session session = null;

        try {
            session = openSession();

            if (notifParam.isNew()) {
                session.save(notifParam);

                notifParam.setNew(false);
            } else {
                session.merge(notifParam);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !NotifParamModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((notifParamModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFPARAMID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        notifParamModelImpl.getOriginalNotifParamId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOTIFPARAMID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFPARAMID,
                    args);

                args = new Object[] { notifParamModelImpl.getNotifParamId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOTIFPARAMID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOTIFPARAMID,
                    args);
            }

            if ((notifParamModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEEN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        notifParamModelImpl.getOriginalNameEn()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAMEEN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEEN,
                    args);

                args = new Object[] { notifParamModelImpl.getNameEn() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAMEEN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEEN,
                    args);
            }

            if ((notifParamModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEAR.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        notifParamModelImpl.getOriginalNameAr()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAMEAR, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEAR,
                    args);

                args = new Object[] { notifParamModelImpl.getNameAr() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAMEAR, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAMEAR,
                    args);
            }
        }

        EntityCacheUtil.putResult(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
            NotifParamImpl.class, notifParam.getPrimaryKey(), notifParam);

        return notifParam;
    }

    protected NotifParam toUnwrappedModel(NotifParam notifParam) {
        if (notifParam instanceof NotifParamImpl) {
            return notifParam;
        }

        NotifParamImpl notifParamImpl = new NotifParamImpl();

        notifParamImpl.setNew(notifParam.isNew());
        notifParamImpl.setPrimaryKey(notifParam.getPrimaryKey());

        notifParamImpl.setNotifParamId(notifParam.getNotifParamId());
        notifParamImpl.setNameAr(notifParam.getNameAr());
        notifParamImpl.setNameEn(notifParam.getNameEn());
        notifParamImpl.setParamName(notifParam.getParamName());

        return notifParamImpl;
    }

    /**
     * Returns the notif param with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the notif param
     * @return the notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam findByPrimaryKey(Serializable primaryKey)
        throws NoSuchNotifParamException, SystemException {
        NotifParam notifParam = fetchByPrimaryKey(primaryKey);

        if (notifParam == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchNotifParamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return notifParam;
    }

    /**
     * Returns the notif param with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchNotifParamException} if it could not be found.
     *
     * @param notifParamId the primary key of the notif param
     * @return the notif param
     * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam findByPrimaryKey(long notifParamId)
        throws NoSuchNotifParamException, SystemException {
        return findByPrimaryKey((Serializable) notifParamId);
    }

    /**
     * Returns the notif param with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the notif param
     * @return the notif param, or <code>null</code> if a notif param with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        NotifParam notifParam = (NotifParam) EntityCacheUtil.getResult(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
                NotifParamImpl.class, primaryKey);

        if (notifParam == _nullNotifParam) {
            return null;
        }

        if (notifParam == null) {
            Session session = null;

            try {
                session = openSession();

                notifParam = (NotifParam) session.get(NotifParamImpl.class,
                        primaryKey);

                if (notifParam != null) {
                    cacheResult(notifParam);
                } else {
                    EntityCacheUtil.putResult(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
                        NotifParamImpl.class, primaryKey, _nullNotifParam);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(NotifParamModelImpl.ENTITY_CACHE_ENABLED,
                    NotifParamImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return notifParam;
    }

    /**
     * Returns the notif param with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param notifParamId the primary key of the notif param
     * @return the notif param, or <code>null</code> if a notif param with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotifParam fetchByPrimaryKey(long notifParamId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) notifParamId);
    }

    /**
     * Returns all the notif params.
     *
     * @return the notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the notif params.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of notif params
     * @param end the upper bound of the range of notif params (not inclusive)
     * @return the range of notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the notif params.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of notif params
     * @param end the upper bound of the range of notif params (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of notif params
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotifParam> findAll(int start, int end,
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

        List<NotifParam> list = (List<NotifParam>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_NOTIFPARAM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_NOTIFPARAM;

                if (pagination) {
                    sql = sql.concat(NotifParamModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<NotifParam>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotifParam>(list);
                } else {
                    list = (List<NotifParam>) QueryUtil.list(q, getDialect(),
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
     * Removes all the notif params from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (NotifParam notifParam : findAll()) {
            remove(notifParam);
        }
    }

    /**
     * Returns the number of notif params.
     *
     * @return the number of notif params
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

                Query q = session.createQuery(_SQL_COUNT_NOTIFPARAM);

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
     * Initializes the notif param persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.NotifParam")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<NotifParam>> listenersList = new ArrayList<ModelListener<NotifParam>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<NotifParam>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(NotifParamImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
