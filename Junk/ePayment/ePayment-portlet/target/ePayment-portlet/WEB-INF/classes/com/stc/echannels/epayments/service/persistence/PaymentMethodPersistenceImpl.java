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

import com.stc.echannels.epayments.NoSuchPaymentMethodException;
import com.stc.echannels.epayments.model.PaymentMethod;
import com.stc.echannels.epayments.model.impl.PaymentMethodImpl;
import com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentMethodPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment method service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentMethodPersistence
 * @see PaymentMethodUtil
 * @generated
 */
public class PaymentMethodPersistenceImpl extends BasePersistenceImpl<PaymentMethod>
    implements PaymentMethodPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentMethodUtil} to access the payment method persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentMethodImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PMTMETHODID =
        new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByPmtMethodId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODID =
        new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByPmtMethodId",
            new String[] { Long.class.getName(), String.class.getName() },
            PaymentMethodModelImpl.PMTMETHODID_COLUMN_BITMASK |
            PaymentMethodModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PMTMETHODID = new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPmtMethodId",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_PMTMETHODID_PMTMETHODID_2 = "paymentMethod.pmtMethodId = ? AND ";
    private static final String _FINDER_COLUMN_PMTMETHODID_STATUS_1 = "paymentMethod.status IS NULL";
    private static final String _FINDER_COLUMN_PMTMETHODID_STATUS_2 = "paymentMethod.status = ?";
    private static final String _FINDER_COLUMN_PMTMETHODID_STATUS_3 = "(paymentMethod.status IS NULL OR paymentMethod.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PMTMETHODIDTYPE =
        new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByPmtMethodIdType",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODIDTYPE =
        new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByPmtMethodIdType",
            new String[] { String.class.getName(), String.class.getName() },
            PaymentMethodModelImpl.PMTMETHODIDTYPE_COLUMN_BITMASK |
            PaymentMethodModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PMTMETHODIDTYPE = new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPmtMethodIdType",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_1 =
        "paymentMethod.pmtMethodIdType IS NULL AND ";
    private static final String _FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_2 =
        "paymentMethod.pmtMethodIdType = ? AND ";
    private static final String _FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_3 =
        "(paymentMethod.pmtMethodIdType IS NULL OR paymentMethod.pmtMethodIdType = '') AND ";
    private static final String _FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_1 = "paymentMethod.status IS NULL";
    private static final String _FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_2 = "paymentMethod.status = ?";
    private static final String _FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_3 = "(paymentMethod.status IS NULL OR paymentMethod.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByStatus",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED,
            PaymentMethodImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByStatus", new String[] { String.class.getName() },
            PaymentMethodModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "paymentMethod.status IS NULL";
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "paymentMethod.status = ?";
    private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(paymentMethod.status IS NULL OR paymentMethod.status = '')";
    private static final String _SQL_SELECT_PAYMENTMETHOD = "SELECT paymentMethod FROM PaymentMethod paymentMethod";
    private static final String _SQL_SELECT_PAYMENTMETHOD_WHERE = "SELECT paymentMethod FROM PaymentMethod paymentMethod WHERE ";
    private static final String _SQL_COUNT_PAYMENTMETHOD = "SELECT COUNT(paymentMethod) FROM PaymentMethod paymentMethod";
    private static final String _SQL_COUNT_PAYMENTMETHOD_WHERE = "SELECT COUNT(paymentMethod) FROM PaymentMethod paymentMethod WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentMethod.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentMethod exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentMethod exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentMethodPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "pmtMethodId", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp", "clientIp",
                "serverIp", "userAgent", "operation", "descriptiveNameEn",
                "descriptiveNameAr", "pmtMethodIdType"
            });
    private static PaymentMethod _nullPaymentMethod = new PaymentMethodImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentMethod> toCacheModel() {
                return _nullPaymentMethodCacheModel;
            }
        };

    private static CacheModel<PaymentMethod> _nullPaymentMethodCacheModel = new CacheModel<PaymentMethod>() {
            @Override
            public PaymentMethod toEntityModel() {
                return _nullPaymentMethod;
            }
        };

    public PaymentMethodPersistenceImpl() {
        setModelClass(PaymentMethod.class);
    }

    /**
     * Returns all the payment methods where pmtMethodId = &#63; and status = &#63;.
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @return the matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByPmtMethodId(long pmtMethodId, String status)
        throws SystemException {
        return findByPmtMethodId(pmtMethodId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment methods where pmtMethodId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @param start the lower bound of the range of payment methods
     * @param end the upper bound of the range of payment methods (not inclusive)
     * @return the range of matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByPmtMethodId(long pmtMethodId,
        String status, int start, int end) throws SystemException {
        return findByPmtMethodId(pmtMethodId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment methods where pmtMethodId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @param start the lower bound of the range of payment methods
     * @param end the upper bound of the range of payment methods (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByPmtMethodId(long pmtMethodId,
        String status, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODID;
            finderArgs = new Object[] { pmtMethodId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PMTMETHODID;
            finderArgs = new Object[] {
                    pmtMethodId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<PaymentMethod> list = (List<PaymentMethod>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentMethod paymentMethod : list) {
                if ((pmtMethodId != paymentMethod.getPmtMethodId()) ||
                        !Validator.equals(status, paymentMethod.getStatus())) {
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

            query.append(_SQL_SELECT_PAYMENTMETHOD_WHERE);

            query.append(_FINDER_COLUMN_PMTMETHODID_PMTMETHODID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_PMTMETHODID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTMETHODID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_PMTMETHODID_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentMethodModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(pmtMethodId);

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<PaymentMethod>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentMethod>(list);
                } else {
                    list = (List<PaymentMethod>) QueryUtil.list(q,
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
     * Returns the first payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod findByPmtMethodId_First(long pmtMethodId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = fetchByPmtMethodId_First(pmtMethodId,
                status, orderByComparator);

        if (paymentMethod != null) {
            return paymentMethod;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pmtMethodId=");
        msg.append(pmtMethodId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentMethodException(msg.toString());
    }

    /**
     * Returns the first payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod fetchByPmtMethodId_First(long pmtMethodId,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        List<PaymentMethod> list = findByPmtMethodId(pmtMethodId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod findByPmtMethodId_Last(long pmtMethodId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = fetchByPmtMethodId_Last(pmtMethodId,
                status, orderByComparator);

        if (paymentMethod != null) {
            return paymentMethod;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pmtMethodId=");
        msg.append(pmtMethodId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentMethodException(msg.toString());
    }

    /**
     * Returns the last payment method in the ordered set where pmtMethodId = &#63; and status = &#63;.
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod fetchByPmtMethodId_Last(long pmtMethodId,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByPmtMethodId(pmtMethodId, status);

        if (count == 0) {
            return null;
        }

        List<PaymentMethod> list = findByPmtMethodId(pmtMethodId, status,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the payment methods where pmtMethodId = &#63; and status = &#63; from the database.
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPmtMethodId(long pmtMethodId, String status)
        throws SystemException {
        for (PaymentMethod paymentMethod : findByPmtMethodId(pmtMethodId,
                status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentMethod);
        }
    }

    /**
     * Returns the number of payment methods where pmtMethodId = &#63; and status = &#63;.
     *
     * @param pmtMethodId the pmt method ID
     * @param status the status
     * @return the number of matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPmtMethodId(long pmtMethodId, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PMTMETHODID;

        Object[] finderArgs = new Object[] { pmtMethodId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PAYMENTMETHOD_WHERE);

            query.append(_FINDER_COLUMN_PMTMETHODID_PMTMETHODID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_PMTMETHODID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTMETHODID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_PMTMETHODID_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(pmtMethodId);

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
     * Returns all the payment methods where pmtMethodIdType = &#63; and status = &#63;.
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @return the matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByPmtMethodIdType(String pmtMethodIdType,
        String status) throws SystemException {
        return findByPmtMethodIdType(pmtMethodIdType, status,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment methods where pmtMethodIdType = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @param start the lower bound of the range of payment methods
     * @param end the upper bound of the range of payment methods (not inclusive)
     * @return the range of matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByPmtMethodIdType(String pmtMethodIdType,
        String status, int start, int end) throws SystemException {
        return findByPmtMethodIdType(pmtMethodIdType, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment methods where pmtMethodIdType = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @param start the lower bound of the range of payment methods
     * @param end the upper bound of the range of payment methods (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByPmtMethodIdType(String pmtMethodIdType,
        String status, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODIDTYPE;
            finderArgs = new Object[] { pmtMethodIdType, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PMTMETHODIDTYPE;
            finderArgs = new Object[] {
                    pmtMethodIdType, status,
                    
                    start, end, orderByComparator
                };
        }

        List<PaymentMethod> list = (List<PaymentMethod>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentMethod paymentMethod : list) {
                if (!Validator.equals(pmtMethodIdType,
                            paymentMethod.getPmtMethodIdType()) ||
                        !Validator.equals(status, paymentMethod.getStatus())) {
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

            query.append(_SQL_SELECT_PAYMENTMETHOD_WHERE);

            boolean bindPmtMethodIdType = false;

            if (pmtMethodIdType == null) {
                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_1);
            } else if (pmtMethodIdType.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_3);
            } else {
                bindPmtMethodIdType = true;

                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentMethodModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPmtMethodIdType) {
                    qPos.add(pmtMethodIdType);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<PaymentMethod>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentMethod>(list);
                } else {
                    list = (List<PaymentMethod>) QueryUtil.list(q,
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
     * Returns the first payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod findByPmtMethodIdType_First(String pmtMethodIdType,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = fetchByPmtMethodIdType_First(pmtMethodIdType,
                status, orderByComparator);

        if (paymentMethod != null) {
            return paymentMethod;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pmtMethodIdType=");
        msg.append(pmtMethodIdType);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentMethodException(msg.toString());
    }

    /**
     * Returns the first payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod fetchByPmtMethodIdType_First(String pmtMethodIdType,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        List<PaymentMethod> list = findByPmtMethodIdType(pmtMethodIdType,
                status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod findByPmtMethodIdType_Last(String pmtMethodIdType,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = fetchByPmtMethodIdType_Last(pmtMethodIdType,
                status, orderByComparator);

        if (paymentMethod != null) {
            return paymentMethod;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pmtMethodIdType=");
        msg.append(pmtMethodIdType);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentMethodException(msg.toString());
    }

    /**
     * Returns the last payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod fetchByPmtMethodIdType_Last(String pmtMethodIdType,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByPmtMethodIdType(pmtMethodIdType, status);

        if (count == 0) {
            return null;
        }

        List<PaymentMethod> list = findByPmtMethodIdType(pmtMethodIdType,
                status, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment methods before and after the current payment method in the ordered set where pmtMethodIdType = &#63; and status = &#63;.
     *
     * @param pmtMethodId the primary key of the current payment method
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod[] findByPmtMethodIdType_PrevAndNext(long pmtMethodId,
        String pmtMethodIdType, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = findByPrimaryKey(pmtMethodId);

        Session session = null;

        try {
            session = openSession();

            PaymentMethod[] array = new PaymentMethodImpl[3];

            array[0] = getByPmtMethodIdType_PrevAndNext(session, paymentMethod,
                    pmtMethodIdType, status, orderByComparator, true);

            array[1] = paymentMethod;

            array[2] = getByPmtMethodIdType_PrevAndNext(session, paymentMethod,
                    pmtMethodIdType, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentMethod getByPmtMethodIdType_PrevAndNext(Session session,
        PaymentMethod paymentMethod, String pmtMethodIdType, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTMETHOD_WHERE);

        boolean bindPmtMethodIdType = false;

        if (pmtMethodIdType == null) {
            query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_1);
        } else if (pmtMethodIdType.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_3);
        } else {
            bindPmtMethodIdType = true;

            query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_2);
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
            query.append(PaymentMethodModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindPmtMethodIdType) {
            qPos.add(pmtMethodIdType);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentMethod);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentMethod> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment methods where pmtMethodIdType = &#63; and status = &#63; from the database.
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPmtMethodIdType(String pmtMethodIdType, String status)
        throws SystemException {
        for (PaymentMethod paymentMethod : findByPmtMethodIdType(
                pmtMethodIdType, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(paymentMethod);
        }
    }

    /**
     * Returns the number of payment methods where pmtMethodIdType = &#63; and status = &#63;.
     *
     * @param pmtMethodIdType the pmt method ID type
     * @param status the status
     * @return the number of matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPmtMethodIdType(String pmtMethodIdType, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PMTMETHODIDTYPE;

        Object[] finderArgs = new Object[] { pmtMethodIdType, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PAYMENTMETHOD_WHERE);

            boolean bindPmtMethodIdType = false;

            if (pmtMethodIdType == null) {
                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_1);
            } else if (pmtMethodIdType.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_3);
            } else {
                bindPmtMethodIdType = true;

                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_PMTMETHODIDTYPE_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_PMTMETHODIDTYPE_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPmtMethodIdType) {
                    qPos.add(pmtMethodIdType);
                }

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
     * Returns all the payment methods where status = &#63;.
     *
     * @param status the status
     * @return the matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByStatus(String status)
        throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment methods where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of payment methods
     * @param end the upper bound of the range of payment methods (not inclusive)
     * @return the range of matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByStatus(String status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment methods where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of payment methods
     * @param end the upper bound of the range of payment methods (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findByStatus(String status, int start, int end,
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

        List<PaymentMethod> list = (List<PaymentMethod>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentMethod paymentMethod : list) {
                if (!Validator.equals(status, paymentMethod.getStatus())) {
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

            query.append(_SQL_SELECT_PAYMENTMETHOD_WHERE);

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
                query.append(PaymentMethodModelImpl.ORDER_BY_JPQL);
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
                    list = (List<PaymentMethod>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentMethod>(list);
                } else {
                    list = (List<PaymentMethod>) QueryUtil.list(q,
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
     * Returns the first payment method in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod findByStatus_First(String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = fetchByStatus_First(status,
                orderByComparator);

        if (paymentMethod != null) {
            return paymentMethod;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentMethodException(msg.toString());
    }

    /**
     * Returns the first payment method in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment method, or <code>null</code> if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod fetchByStatus_First(String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentMethod> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment method in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod findByStatus_Last(String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = fetchByStatus_Last(status,
                orderByComparator);

        if (paymentMethod != null) {
            return paymentMethod;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentMethodException(msg.toString());
    }

    /**
     * Returns the last payment method in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment method, or <code>null</code> if a matching payment method could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod fetchByStatus_Last(String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<PaymentMethod> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment methods before and after the current payment method in the ordered set where status = &#63;.
     *
     * @param pmtMethodId the primary key of the current payment method
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod[] findByStatus_PrevAndNext(long pmtMethodId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = findByPrimaryKey(pmtMethodId);

        Session session = null;

        try {
            session = openSession();

            PaymentMethod[] array = new PaymentMethodImpl[3];

            array[0] = getByStatus_PrevAndNext(session, paymentMethod, status,
                    orderByComparator, true);

            array[1] = paymentMethod;

            array[2] = getByStatus_PrevAndNext(session, paymentMethod, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentMethod getByStatus_PrevAndNext(Session session,
        PaymentMethod paymentMethod, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTMETHOD_WHERE);

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
            query.append(PaymentMethodModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(paymentMethod);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentMethod> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment methods where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(String status) throws SystemException {
        for (PaymentMethod paymentMethod : findByStatus(status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentMethod);
        }
    }

    /**
     * Returns the number of payment methods where status = &#63;.
     *
     * @param status the status
     * @return the number of matching payment methods
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

            query.append(_SQL_COUNT_PAYMENTMETHOD_WHERE);

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
     * Caches the payment method in the entity cache if it is enabled.
     *
     * @param paymentMethod the payment method
     */
    @Override
    public void cacheResult(PaymentMethod paymentMethod) {
        EntityCacheUtil.putResult(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodImpl.class, paymentMethod.getPrimaryKey(),
            paymentMethod);

        paymentMethod.resetOriginalValues();
    }

    /**
     * Caches the payment methods in the entity cache if it is enabled.
     *
     * @param paymentMethods the payment methods
     */
    @Override
    public void cacheResult(List<PaymentMethod> paymentMethods) {
        for (PaymentMethod paymentMethod : paymentMethods) {
            if (EntityCacheUtil.getResult(
                        PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentMethodImpl.class, paymentMethod.getPrimaryKey()) == null) {
                cacheResult(paymentMethod);
            } else {
                paymentMethod.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment methods.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentMethodImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentMethodImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment method.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentMethod paymentMethod) {
        EntityCacheUtil.removeResult(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodImpl.class, paymentMethod.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PaymentMethod> paymentMethods) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentMethod paymentMethod : paymentMethods) {
            EntityCacheUtil.removeResult(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
                PaymentMethodImpl.class, paymentMethod.getPrimaryKey());
        }
    }

    /**
     * Creates a new payment method with the primary key. Does not add the payment method to the database.
     *
     * @param pmtMethodId the primary key for the new payment method
     * @return the new payment method
     */
    @Override
    public PaymentMethod create(long pmtMethodId) {
        PaymentMethod paymentMethod = new PaymentMethodImpl();

        paymentMethod.setNew(true);
        paymentMethod.setPrimaryKey(pmtMethodId);

        return paymentMethod;
    }

    /**
     * Removes the payment method with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param pmtMethodId the primary key of the payment method
     * @return the payment method that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod remove(long pmtMethodId)
        throws NoSuchPaymentMethodException, SystemException {
        return remove((Serializable) pmtMethodId);
    }

    /**
     * Removes the payment method with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment method
     * @return the payment method that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod remove(Serializable primaryKey)
        throws NoSuchPaymentMethodException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentMethod paymentMethod = (PaymentMethod) session.get(PaymentMethodImpl.class,
                    primaryKey);

            if (paymentMethod == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentMethodException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentMethod);
        } catch (NoSuchPaymentMethodException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentMethod removeImpl(PaymentMethod paymentMethod)
        throws SystemException {
        paymentMethod = toUnwrappedModel(paymentMethod);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentMethod)) {
                paymentMethod = (PaymentMethod) session.get(PaymentMethodImpl.class,
                        paymentMethod.getPrimaryKeyObj());
            }

            if (paymentMethod != null) {
                session.delete(paymentMethod);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentMethod != null) {
            clearCache(paymentMethod);
        }

        return paymentMethod;
    }

    @Override
    public PaymentMethod updateImpl(
        com.stc.echannels.epayments.model.PaymentMethod paymentMethod)
        throws SystemException {
        paymentMethod = toUnwrappedModel(paymentMethod);

        boolean isNew = paymentMethod.isNew();

        PaymentMethodModelImpl paymentMethodModelImpl = (PaymentMethodModelImpl) paymentMethod;

        Session session = null;

        try {
            session = openSession();

            if (paymentMethod.isNew()) {
                session.save(paymentMethod);

                paymentMethod.setNew(false);
            } else {
                session.merge(paymentMethod);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PaymentMethodModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((paymentMethodModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentMethodModelImpl.getOriginalPmtMethodId(),
                        paymentMethodModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PMTMETHODID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODID,
                    args);

                args = new Object[] {
                        paymentMethodModelImpl.getPmtMethodId(),
                        paymentMethodModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PMTMETHODID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODID,
                    args);
            }

            if ((paymentMethodModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODIDTYPE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentMethodModelImpl.getOriginalPmtMethodIdType(),
                        paymentMethodModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PMTMETHODIDTYPE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODIDTYPE,
                    args);

                args = new Object[] {
                        paymentMethodModelImpl.getPmtMethodIdType(),
                        paymentMethodModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PMTMETHODIDTYPE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTMETHODIDTYPE,
                    args);
            }

            if ((paymentMethodModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentMethodModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { paymentMethodModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
            PaymentMethodImpl.class, paymentMethod.getPrimaryKey(),
            paymentMethod);

        return paymentMethod;
    }

    protected PaymentMethod toUnwrappedModel(PaymentMethod paymentMethod) {
        if (paymentMethod instanceof PaymentMethodImpl) {
            return paymentMethod;
        }

        PaymentMethodImpl paymentMethodImpl = new PaymentMethodImpl();

        paymentMethodImpl.setNew(paymentMethod.isNew());
        paymentMethodImpl.setPrimaryKey(paymentMethod.getPrimaryKey());

        paymentMethodImpl.setPmtMethodId(paymentMethod.getPmtMethodId());
        paymentMethodImpl.setStatus(paymentMethod.getStatus());
        paymentMethodImpl.setLastUpdateTimestamp(paymentMethod.getLastUpdateTimestamp());
        paymentMethodImpl.setLastUpdateUserid(paymentMethod.getLastUpdateUserid());
        paymentMethodImpl.setLastUpdateUsername(paymentMethod.getLastUpdateUsername());
        paymentMethodImpl.setEffectiveTimestamp(paymentMethod.getEffectiveTimestamp());
        paymentMethodImpl.setClientIp(paymentMethod.getClientIp());
        paymentMethodImpl.setServerIp(paymentMethod.getServerIp());
        paymentMethodImpl.setUserAgent(paymentMethod.getUserAgent());
        paymentMethodImpl.setOperation(paymentMethod.getOperation());
        paymentMethodImpl.setDescriptiveNameEn(paymentMethod.getDescriptiveNameEn());
        paymentMethodImpl.setDescriptiveNameAr(paymentMethod.getDescriptiveNameAr());
        paymentMethodImpl.setPmtMethodIdType(paymentMethod.getPmtMethodIdType());

        return paymentMethodImpl;
    }

    /**
     * Returns the payment method with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment method
     * @return the payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentMethodException, SystemException {
        PaymentMethod paymentMethod = fetchByPrimaryKey(primaryKey);

        if (paymentMethod == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentMethodException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentMethod;
    }

    /**
     * Returns the payment method with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentMethodException} if it could not be found.
     *
     * @param pmtMethodId the primary key of the payment method
     * @return the payment method
     * @throws com.stc.echannels.epayments.NoSuchPaymentMethodException if a payment method with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod findByPrimaryKey(long pmtMethodId)
        throws NoSuchPaymentMethodException, SystemException {
        return findByPrimaryKey((Serializable) pmtMethodId);
    }

    /**
     * Returns the payment method with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment method
     * @return the payment method, or <code>null</code> if a payment method with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentMethod paymentMethod = (PaymentMethod) EntityCacheUtil.getResult(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
                PaymentMethodImpl.class, primaryKey);

        if (paymentMethod == _nullPaymentMethod) {
            return null;
        }

        if (paymentMethod == null) {
            Session session = null;

            try {
                session = openSession();

                paymentMethod = (PaymentMethod) session.get(PaymentMethodImpl.class,
                        primaryKey);

                if (paymentMethod != null) {
                    cacheResult(paymentMethod);
                } else {
                    EntityCacheUtil.putResult(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentMethodImpl.class, primaryKey, _nullPaymentMethod);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentMethodModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentMethodImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentMethod;
    }

    /**
     * Returns the payment method with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param pmtMethodId the primary key of the payment method
     * @return the payment method, or <code>null</code> if a payment method with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentMethod fetchByPrimaryKey(long pmtMethodId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) pmtMethodId);
    }

    /**
     * Returns all the payment methods.
     *
     * @return the payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment methods.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment methods
     * @param end the upper bound of the range of payment methods (not inclusive)
     * @return the range of payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the payment methods.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment methods
     * @param end the upper bound of the range of payment methods (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of payment methods
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentMethod> findAll(int start, int end,
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

        List<PaymentMethod> list = (List<PaymentMethod>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTMETHOD);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTMETHOD;

                if (pagination) {
                    sql = sql.concat(PaymentMethodModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentMethod>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentMethod>(list);
                } else {
                    list = (List<PaymentMethod>) QueryUtil.list(q,
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
     * Removes all the payment methods from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentMethod paymentMethod : findAll()) {
            remove(paymentMethod);
        }
    }

    /**
     * Returns the number of payment methods.
     *
     * @return the number of payment methods
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

                Query q = session.createQuery(_SQL_COUNT_PAYMENTMETHOD);

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
     * Initializes the payment method persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentMethod")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentMethod>> listenersList = new ArrayList<ModelListener<PaymentMethod>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentMethod>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentMethodImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
