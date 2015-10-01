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

import com.stc.echannels.epayments.NoSuchBankServicesException;
import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.model.impl.BankServicesImpl;
import com.stc.echannels.epayments.model.impl.BankServicesModelImpl;
import com.stc.echannels.epayments.service.persistence.BankServicesPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the bank services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankServicesPersistence
 * @see BankServicesUtil
 * @generated
 */
public class BankServicesPersistenceImpl extends BasePersistenceImpl<BankServices>
    implements BankServicesPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BankServicesUtil} to access the bank services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BankServicesImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, BankServicesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, BankServicesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID = new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, BankServicesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBybankid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID =
        new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, BankServicesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBybankid",
            new String[] { String.class.getName() },
            BankServicesModelImpl.BANKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKID = new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBybankid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_BANKID_BANKID_1 = "bankServices.bankid IS NULL";
    private static final String _FINDER_COLUMN_BANKID_BANKID_2 = "bankServices.bankid = ?";
    private static final String _FINDER_COLUMN_BANKID_BANKID_3 = "(bankServices.bankid IS NULL OR bankServices.bankid = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, BankServicesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByserviceid",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID =
        new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, BankServicesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByserviceid",
            new String[] { Long.class.getName() },
            BankServicesModelImpl.SERVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEID = new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByserviceid",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEID_SERVICEID_2 = "bankServices.serviceid = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEIDANDBANKID =
        new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, BankServicesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByserviceidAndBankid",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDBANKID =
        new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, BankServicesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByserviceidAndBankid",
            new String[] { Long.class.getName(), String.class.getName() },
            BankServicesModelImpl.SERVICEID_COLUMN_BITMASK |
            BankServicesModelImpl.BANKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SERVICEIDANDBANKID = new FinderPath(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByserviceidAndBankid",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_SERVICEIDANDBANKID_SERVICEID_2 = "bankServices.serviceid = ? AND ";
    private static final String _FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_1 = "bankServices.bankid IS NULL";
    private static final String _FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_2 = "bankServices.bankid = ?";
    private static final String _FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_3 = "(bankServices.bankid IS NULL OR bankServices.bankid = '')";
    private static final String _SQL_SELECT_BANKSERVICES = "SELECT bankServices FROM BankServices bankServices";
    private static final String _SQL_SELECT_BANKSERVICES_WHERE = "SELECT bankServices FROM BankServices bankServices WHERE ";
    private static final String _SQL_COUNT_BANKSERVICES = "SELECT COUNT(bankServices) FROM BankServices bankServices";
    private static final String _SQL_COUNT_BANKSERVICES_WHERE = "SELECT COUNT(bankServices) FROM BankServices bankServices WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "bankServices.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BankServices exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BankServices exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BankServicesPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "bankid", "serviceid", "id"
            });
    private static BankServices _nullBankServices = new BankServicesImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BankServices> toCacheModel() {
                return _nullBankServicesCacheModel;
            }
        };

    private static CacheModel<BankServices> _nullBankServicesCacheModel = new CacheModel<BankServices>() {
            @Override
            public BankServices toEntityModel() {
                return _nullBankServices;
            }
        };

    public BankServicesPersistenceImpl() {
        setModelClass(BankServices.class);
    }

    /**
     * Returns all the bank serviceses where bankid = &#63;.
     *
     * @param bankid the bankid
     * @return the matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findBybankid(String bankid)
        throws SystemException {
        return findBybankid(bankid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank serviceses where bankid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param bankid the bankid
     * @param start the lower bound of the range of bank serviceses
     * @param end the upper bound of the range of bank serviceses (not inclusive)
     * @return the range of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findBybankid(String bankid, int start, int end)
        throws SystemException {
        return findBybankid(bankid, start, end, null);
    }

    /**
     * Returns an ordered range of all the bank serviceses where bankid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param bankid the bankid
     * @param start the lower bound of the range of bank serviceses
     * @param end the upper bound of the range of bank serviceses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findBybankid(String bankid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] { bankid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] { bankid, start, end, orderByComparator };
        }

        List<BankServices> list = (List<BankServices>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BankServices bankServices : list) {
                if (!Validator.equals(bankid, bankServices.getBankid())) {
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

            query.append(_SQL_SELECT_BANKSERVICES_WHERE);

            boolean bindBankid = false;

            if (bankid == null) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_1);
            } else if (bankid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_3);
            } else {
                bindBankid = true;

                query.append(_FINDER_COLUMN_BANKID_BANKID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BankServicesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBankid) {
                    qPos.add(bankid);
                }

                if (!pagination) {
                    list = (List<BankServices>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankServices>(list);
                } else {
                    list = (List<BankServices>) QueryUtil.list(q, getDialect(),
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
     * Returns the first bank services in the ordered set where bankid = &#63;.
     *
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices findBybankid_First(String bankid,
        OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = fetchBybankid_First(bankid,
                orderByComparator);

        if (bankServices != null) {
            return bankServices;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bankid=");
        msg.append(bankid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankServicesException(msg.toString());
    }

    /**
     * Returns the first bank services in the ordered set where bankid = &#63;.
     *
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices fetchBybankid_First(String bankid,
        OrderByComparator orderByComparator) throws SystemException {
        List<BankServices> list = findBybankid(bankid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank services in the ordered set where bankid = &#63;.
     *
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices findBybankid_Last(String bankid,
        OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = fetchBybankid_Last(bankid, orderByComparator);

        if (bankServices != null) {
            return bankServices;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bankid=");
        msg.append(bankid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankServicesException(msg.toString());
    }

    /**
     * Returns the last bank services in the ordered set where bankid = &#63;.
     *
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices fetchBybankid_Last(String bankid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBybankid(bankid);

        if (count == 0) {
            return null;
        }

        List<BankServices> list = findBybankid(bankid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the bank serviceses before and after the current bank services in the ordered set where bankid = &#63;.
     *
     * @param id the primary key of the current bank services
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices[] findBybankid_PrevAndNext(String id, String bankid,
        OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            BankServices[] array = new BankServicesImpl[3];

            array[0] = getBybankid_PrevAndNext(session, bankServices, bankid,
                    orderByComparator, true);

            array[1] = bankServices;

            array[2] = getBybankid_PrevAndNext(session, bankServices, bankid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BankServices getBybankid_PrevAndNext(Session session,
        BankServices bankServices, String bankid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKSERVICES_WHERE);

        boolean bindBankid = false;

        if (bankid == null) {
            query.append(_FINDER_COLUMN_BANKID_BANKID_1);
        } else if (bankid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BANKID_BANKID_3);
        } else {
            bindBankid = true;

            query.append(_FINDER_COLUMN_BANKID_BANKID_2);
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
            query.append(BankServicesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindBankid) {
            qPos.add(bankid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bankServices);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BankServices> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the bank serviceses where bankid = &#63; from the database.
     *
     * @param bankid the bankid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBybankid(String bankid) throws SystemException {
        for (BankServices bankServices : findBybankid(bankid,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(bankServices);
        }
    }

    /**
     * Returns the number of bank serviceses where bankid = &#63;.
     *
     * @param bankid the bankid
     * @return the number of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBybankid(String bankid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANKID;

        Object[] finderArgs = new Object[] { bankid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BANKSERVICES_WHERE);

            boolean bindBankid = false;

            if (bankid == null) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_1);
            } else if (bankid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_3);
            } else {
                bindBankid = true;

                query.append(_FINDER_COLUMN_BANKID_BANKID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBankid) {
                    qPos.add(bankid);
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
     * Returns all the bank serviceses where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @return the matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findByserviceid(long serviceid)
        throws SystemException {
        return findByserviceid(serviceid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the bank serviceses where serviceid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceid the serviceid
     * @param start the lower bound of the range of bank serviceses
     * @param end the upper bound of the range of bank serviceses (not inclusive)
     * @return the range of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findByserviceid(long serviceid, int start, int end)
        throws SystemException {
        return findByserviceid(serviceid, start, end, null);
    }

    /**
     * Returns an ordered range of all the bank serviceses where serviceid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceid the serviceid
     * @param start the lower bound of the range of bank serviceses
     * @param end the upper bound of the range of bank serviceses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findByserviceid(long serviceid, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID;
            finderArgs = new Object[] { serviceid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEID;
            finderArgs = new Object[] { serviceid, start, end, orderByComparator };
        }

        List<BankServices> list = (List<BankServices>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BankServices bankServices : list) {
                if ((serviceid != bankServices.getServiceid())) {
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

            query.append(_SQL_SELECT_BANKSERVICES_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BankServicesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceid);

                if (!pagination) {
                    list = (List<BankServices>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankServices>(list);
                } else {
                    list = (List<BankServices>) QueryUtil.list(q, getDialect(),
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
     * Returns the first bank services in the ordered set where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices findByserviceid_First(long serviceid,
        OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = fetchByserviceid_First(serviceid,
                orderByComparator);

        if (bankServices != null) {
            return bankServices;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceid=");
        msg.append(serviceid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankServicesException(msg.toString());
    }

    /**
     * Returns the first bank services in the ordered set where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices fetchByserviceid_First(long serviceid,
        OrderByComparator orderByComparator) throws SystemException {
        List<BankServices> list = findByserviceid(serviceid, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank services in the ordered set where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices findByserviceid_Last(long serviceid,
        OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = fetchByserviceid_Last(serviceid,
                orderByComparator);

        if (bankServices != null) {
            return bankServices;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceid=");
        msg.append(serviceid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankServicesException(msg.toString());
    }

    /**
     * Returns the last bank services in the ordered set where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices fetchByserviceid_Last(long serviceid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByserviceid(serviceid);

        if (count == 0) {
            return null;
        }

        List<BankServices> list = findByserviceid(serviceid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the bank serviceses before and after the current bank services in the ordered set where serviceid = &#63;.
     *
     * @param id the primary key of the current bank services
     * @param serviceid the serviceid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices[] findByserviceid_PrevAndNext(String id,
        long serviceid, OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            BankServices[] array = new BankServicesImpl[3];

            array[0] = getByserviceid_PrevAndNext(session, bankServices,
                    serviceid, orderByComparator, true);

            array[1] = bankServices;

            array[2] = getByserviceid_PrevAndNext(session, bankServices,
                    serviceid, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BankServices getByserviceid_PrevAndNext(Session session,
        BankServices bankServices, long serviceid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKSERVICES_WHERE);

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
            query.append(BankServicesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceid);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bankServices);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BankServices> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the bank serviceses where serviceid = &#63; from the database.
     *
     * @param serviceid the serviceid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByserviceid(long serviceid) throws SystemException {
        for (BankServices bankServices : findByserviceid(serviceid,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(bankServices);
        }
    }

    /**
     * Returns the number of bank serviceses where serviceid = &#63;.
     *
     * @param serviceid the serviceid
     * @return the number of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByserviceid(long serviceid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICEID;

        Object[] finderArgs = new Object[] { serviceid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BANKSERVICES_WHERE);

            query.append(_FINDER_COLUMN_SERVICEID_SERVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceid);

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
     * Returns all the bank serviceses where serviceid = &#63; and bankid = &#63;.
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @return the matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findByserviceidAndBankid(long serviceid,
        String bankid) throws SystemException {
        return findByserviceidAndBankid(serviceid, bankid, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank serviceses where serviceid = &#63; and bankid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @param start the lower bound of the range of bank serviceses
     * @param end the upper bound of the range of bank serviceses (not inclusive)
     * @return the range of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findByserviceidAndBankid(long serviceid,
        String bankid, int start, int end) throws SystemException {
        return findByserviceidAndBankid(serviceid, bankid, start, end, null);
    }

    /**
     * Returns an ordered range of all the bank serviceses where serviceid = &#63; and bankid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @param start the lower bound of the range of bank serviceses
     * @param end the upper bound of the range of bank serviceses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findByserviceidAndBankid(long serviceid,
        String bankid, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDBANKID;
            finderArgs = new Object[] { serviceid, bankid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICEIDANDBANKID;
            finderArgs = new Object[] {
                    serviceid, bankid,
                    
                    start, end, orderByComparator
                };
        }

        List<BankServices> list = (List<BankServices>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BankServices bankServices : list) {
                if ((serviceid != bankServices.getServiceid()) ||
                        !Validator.equals(bankid, bankServices.getBankid())) {
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

            query.append(_SQL_SELECT_BANKSERVICES_WHERE);

            query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_SERVICEID_2);

            boolean bindBankid = false;

            if (bankid == null) {
                query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_1);
            } else if (bankid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_3);
            } else {
                bindBankid = true;

                query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BankServicesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceid);

                if (bindBankid) {
                    qPos.add(bankid);
                }

                if (!pagination) {
                    list = (List<BankServices>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankServices>(list);
                } else {
                    list = (List<BankServices>) QueryUtil.list(q, getDialect(),
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
     * Returns the first bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices findByserviceidAndBankid_First(long serviceid,
        String bankid, OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = fetchByserviceidAndBankid_First(serviceid,
                bankid, orderByComparator);

        if (bankServices != null) {
            return bankServices;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceid=");
        msg.append(serviceid);

        msg.append(", bankid=");
        msg.append(bankid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankServicesException(msg.toString());
    }

    /**
     * Returns the first bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank services, or <code>null</code> if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices fetchByserviceidAndBankid_First(long serviceid,
        String bankid, OrderByComparator orderByComparator)
        throws SystemException {
        List<BankServices> list = findByserviceidAndBankid(serviceid, bankid,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices findByserviceidAndBankid_Last(long serviceid,
        String bankid, OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = fetchByserviceidAndBankid_Last(serviceid,
                bankid, orderByComparator);

        if (bankServices != null) {
            return bankServices;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("serviceid=");
        msg.append(serviceid);

        msg.append(", bankid=");
        msg.append(bankid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankServicesException(msg.toString());
    }

    /**
     * Returns the last bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank services, or <code>null</code> if a matching bank services could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices fetchByserviceidAndBankid_Last(long serviceid,
        String bankid, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByserviceidAndBankid(serviceid, bankid);

        if (count == 0) {
            return null;
        }

        List<BankServices> list = findByserviceidAndBankid(serviceid, bankid,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the bank serviceses before and after the current bank services in the ordered set where serviceid = &#63; and bankid = &#63;.
     *
     * @param id the primary key of the current bank services
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices[] findByserviceidAndBankid_PrevAndNext(String id,
        long serviceid, String bankid, OrderByComparator orderByComparator)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            BankServices[] array = new BankServicesImpl[3];

            array[0] = getByserviceidAndBankid_PrevAndNext(session,
                    bankServices, serviceid, bankid, orderByComparator, true);

            array[1] = bankServices;

            array[2] = getByserviceidAndBankid_PrevAndNext(session,
                    bankServices, serviceid, bankid, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BankServices getByserviceidAndBankid_PrevAndNext(
        Session session, BankServices bankServices, long serviceid,
        String bankid, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKSERVICES_WHERE);

        query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_SERVICEID_2);

        boolean bindBankid = false;

        if (bankid == null) {
            query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_1);
        } else if (bankid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_3);
        } else {
            bindBankid = true;

            query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_2);
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
            query.append(BankServicesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(serviceid);

        if (bindBankid) {
            qPos.add(bankid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bankServices);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BankServices> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the bank serviceses where serviceid = &#63; and bankid = &#63; from the database.
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByserviceidAndBankid(long serviceid, String bankid)
        throws SystemException {
        for (BankServices bankServices : findByserviceidAndBankid(serviceid,
                bankid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(bankServices);
        }
    }

    /**
     * Returns the number of bank serviceses where serviceid = &#63; and bankid = &#63;.
     *
     * @param serviceid the serviceid
     * @param bankid the bankid
     * @return the number of matching bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByserviceidAndBankid(long serviceid, String bankid)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICEIDANDBANKID;

        Object[] finderArgs = new Object[] { serviceid, bankid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BANKSERVICES_WHERE);

            query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_SERVICEID_2);

            boolean bindBankid = false;

            if (bankid == null) {
                query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_1);
            } else if (bankid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_3);
            } else {
                bindBankid = true;

                query.append(_FINDER_COLUMN_SERVICEIDANDBANKID_BANKID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(serviceid);

                if (bindBankid) {
                    qPos.add(bankid);
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
     * Caches the bank services in the entity cache if it is enabled.
     *
     * @param bankServices the bank services
     */
    @Override
    public void cacheResult(BankServices bankServices) {
        EntityCacheUtil.putResult(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesImpl.class, bankServices.getPrimaryKey(), bankServices);

        bankServices.resetOriginalValues();
    }

    /**
     * Caches the bank serviceses in the entity cache if it is enabled.
     *
     * @param bankServiceses the bank serviceses
     */
    @Override
    public void cacheResult(List<BankServices> bankServiceses) {
        for (BankServices bankServices : bankServiceses) {
            if (EntityCacheUtil.getResult(
                        BankServicesModelImpl.ENTITY_CACHE_ENABLED,
                        BankServicesImpl.class, bankServices.getPrimaryKey()) == null) {
                cacheResult(bankServices);
            } else {
                bankServices.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all bank serviceses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BankServicesImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BankServicesImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the bank services.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BankServices bankServices) {
        EntityCacheUtil.removeResult(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesImpl.class, bankServices.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BankServices> bankServiceses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BankServices bankServices : bankServiceses) {
            EntityCacheUtil.removeResult(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
                BankServicesImpl.class, bankServices.getPrimaryKey());
        }
    }

    /**
     * Creates a new bank services with the primary key. Does not add the bank services to the database.
     *
     * @param id the primary key for the new bank services
     * @return the new bank services
     */
    @Override
    public BankServices create(String id) {
        BankServices bankServices = new BankServicesImpl();

        bankServices.setNew(true);
        bankServices.setPrimaryKey(id);

        return bankServices;
    }

    /**
     * Removes the bank services with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the bank services
     * @return the bank services that was removed
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices remove(String id)
        throws NoSuchBankServicesException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the bank services with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the bank services
     * @return the bank services that was removed
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices remove(Serializable primaryKey)
        throws NoSuchBankServicesException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BankServices bankServices = (BankServices) session.get(BankServicesImpl.class,
                    primaryKey);

            if (bankServices == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBankServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(bankServices);
        } catch (NoSuchBankServicesException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BankServices removeImpl(BankServices bankServices)
        throws SystemException {
        bankServices = toUnwrappedModel(bankServices);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(bankServices)) {
                bankServices = (BankServices) session.get(BankServicesImpl.class,
                        bankServices.getPrimaryKeyObj());
            }

            if (bankServices != null) {
                session.delete(bankServices);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (bankServices != null) {
            clearCache(bankServices);
        }

        return bankServices;
    }

    @Override
    public BankServices updateImpl(
        com.stc.echannels.epayments.model.BankServices bankServices)
        throws SystemException {
        bankServices = toUnwrappedModel(bankServices);

        boolean isNew = bankServices.isNew();

        BankServicesModelImpl bankServicesModelImpl = (BankServicesModelImpl) bankServices;

        Session session = null;

        try {
            session = openSession();

            if (bankServices.isNew()) {
                session.save(bankServices);

                bankServices.setNew(false);
            } else {
                session.merge(bankServices);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BankServicesModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((bankServicesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankServicesModelImpl.getOriginalBankid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);

                args = new Object[] { bankServicesModelImpl.getBankid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);
            }

            if ((bankServicesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankServicesModelImpl.getOriginalServiceid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);

                args = new Object[] { bankServicesModelImpl.getServiceid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEID,
                    args);
            }

            if ((bankServicesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDBANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankServicesModelImpl.getOriginalServiceid(),
                        bankServicesModelImpl.getOriginalBankid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEIDANDBANKID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDBANKID,
                    args);

                args = new Object[] {
                        bankServicesModelImpl.getServiceid(),
                        bankServicesModelImpl.getBankid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICEIDANDBANKID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICEIDANDBANKID,
                    args);
            }
        }

        EntityCacheUtil.putResult(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
            BankServicesImpl.class, bankServices.getPrimaryKey(), bankServices);

        return bankServices;
    }

    protected BankServices toUnwrappedModel(BankServices bankServices) {
        if (bankServices instanceof BankServicesImpl) {
            return bankServices;
        }

        BankServicesImpl bankServicesImpl = new BankServicesImpl();

        bankServicesImpl.setNew(bankServices.isNew());
        bankServicesImpl.setPrimaryKey(bankServices.getPrimaryKey());

        bankServicesImpl.setBankid(bankServices.getBankid());
        bankServicesImpl.setServiceid(bankServices.getServiceid());
        bankServicesImpl.setId(bankServices.getId());

        return bankServicesImpl;
    }

    /**
     * Returns the bank services with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the bank services
     * @return the bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBankServicesException, SystemException {
        BankServices bankServices = fetchByPrimaryKey(primaryKey);

        if (bankServices == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBankServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return bankServices;
    }

    /**
     * Returns the bank services with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBankServicesException} if it could not be found.
     *
     * @param id the primary key of the bank services
     * @return the bank services
     * @throws com.stc.echannels.epayments.NoSuchBankServicesException if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices findByPrimaryKey(String id)
        throws NoSuchBankServicesException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the bank services with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the bank services
     * @return the bank services, or <code>null</code> if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BankServices bankServices = (BankServices) EntityCacheUtil.getResult(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
                BankServicesImpl.class, primaryKey);

        if (bankServices == _nullBankServices) {
            return null;
        }

        if (bankServices == null) {
            Session session = null;

            try {
                session = openSession();

                bankServices = (BankServices) session.get(BankServicesImpl.class,
                        primaryKey);

                if (bankServices != null) {
                    cacheResult(bankServices);
                } else {
                    EntityCacheUtil.putResult(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
                        BankServicesImpl.class, primaryKey, _nullBankServices);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BankServicesModelImpl.ENTITY_CACHE_ENABLED,
                    BankServicesImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return bankServices;
    }

    /**
     * Returns the bank services with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the bank services
     * @return the bank services, or <code>null</code> if a bank services with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankServices fetchByPrimaryKey(String id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the bank serviceses.
     *
     * @return the bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank serviceses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of bank serviceses
     * @param end the upper bound of the range of bank serviceses (not inclusive)
     * @return the range of bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the bank serviceses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of bank serviceses
     * @param end the upper bound of the range of bank serviceses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of bank serviceses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankServices> findAll(int start, int end,
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

        List<BankServices> list = (List<BankServices>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BANKSERVICES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BANKSERVICES;

                if (pagination) {
                    sql = sql.concat(BankServicesModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BankServices>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankServices>(list);
                } else {
                    list = (List<BankServices>) QueryUtil.list(q, getDialect(),
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
     * Removes all the bank serviceses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BankServices bankServices : findAll()) {
            remove(bankServices);
        }
    }

    /**
     * Returns the number of bank serviceses.
     *
     * @return the number of bank serviceses
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

                Query q = session.createQuery(_SQL_COUNT_BANKSERVICES);

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
     * Initializes the bank services persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.BankServices")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BankServices>> listenersList = new ArrayList<ModelListener<BankServices>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BankServices>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BankServicesImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
