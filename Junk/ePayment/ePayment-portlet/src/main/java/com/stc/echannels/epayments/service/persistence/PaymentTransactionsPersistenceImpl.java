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

import com.stc.echannels.epayments.NoSuchPaymentTransactionsException;
import com.stc.echannels.epayments.model.PaymentTransactions;
import com.stc.echannels.epayments.model.impl.PaymentTransactionsImpl;
import com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentTransactionsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment transactions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionsPersistence
 * @see PaymentTransactionsUtil
 * @generated
 */
public class PaymentTransactionsPersistenceImpl extends BasePersistenceImpl<PaymentTransactions>
    implements PaymentTransactionsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentTransactionsUtil} to access the payment transactions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentTransactionsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELID =
        new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByChannelId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID =
        new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByChannelId",
            new String[] { Long.class.getName() },
            PaymentTransactionsModelImpl.CHANNELID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CHANNELID = new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByChannelId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CHANNELID_CHANNELID_2 = "paymentTransactions.channelId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PMTBANKID =
        new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPmtBankId",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBANKID =
        new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPmtBankId",
            new String[] { String.class.getName() },
            PaymentTransactionsModelImpl.PMTBANKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PMTBANKID = new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPmtBankId",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_PMTBANKID_PMTBANKID_1 = "paymentTransactions.pmtBankId IS NULL";
    private static final String _FINDER_COLUMN_PMTBANKID_PMTBANKID_2 = "paymentTransactions.pmtBankId = ?";
    private static final String _FINDER_COLUMN_PMTBANKID_PMTBANKID_3 = "(paymentTransactions.pmtBankId IS NULL OR paymentTransactions.pmtBankId = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PMTBRANCHID =
        new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPmtBranchId",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBRANCHID =
        new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPmtBranchId",
            new String[] { String.class.getName() },
            PaymentTransactionsModelImpl.PMTBRANCHID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PMTBRANCHID = new FinderPath(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPmtBranchId",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_1 = "paymentTransactions.pmtBranchId IS NULL";
    private static final String _FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_2 = "paymentTransactions.pmtBranchId = ?";
    private static final String _FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_3 = "(paymentTransactions.pmtBranchId IS NULL OR paymentTransactions.pmtBranchId = '')";
    private static final String _SQL_SELECT_PAYMENTTRANSACTIONS = "SELECT paymentTransactions FROM PaymentTransactions paymentTransactions";
    private static final String _SQL_SELECT_PAYMENTTRANSACTIONS_WHERE = "SELECT paymentTransactions FROM PaymentTransactions paymentTransactions WHERE ";
    private static final String _SQL_COUNT_PAYMENTTRANSACTIONS = "SELECT COUNT(paymentTransactions) FROM PaymentTransactions paymentTransactions";
    private static final String _SQL_COUNT_PAYMENTTRANSACTIONS_WHERE = "SELECT COUNT(paymentTransactions) FROM PaymentTransactions paymentTransactions WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentTransactions.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentTransactions exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentTransactions exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentTransactionsPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "epayTransId", "transAmount", "transValue", "transAmotChkDigit",
                "processorReference", "channelId", "pmtBankId", "pmtBranchId",
                "transProcessDate", "batchId", "serviceId", "appliedDate",
                "appliedAmount", "processStatus", "notificationNumber",
                "currencyCode", "confirmationNumber", "pmtRecievedDate",
                "reasonCode", "eventTypeId", "pmtMethodId", "pmtType", "rpmId",
                "nativeReasonCode", "feeId", "requestLocation", "profileId",
                "senderId", "last4Digits", "cardType", "expiryDate",
                "sourceTransType"
            });
    private static PaymentTransactions _nullPaymentTransactions = new PaymentTransactionsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentTransactions> toCacheModel() {
                return _nullPaymentTransactionsCacheModel;
            }
        };

    private static CacheModel<PaymentTransactions> _nullPaymentTransactionsCacheModel =
        new CacheModel<PaymentTransactions>() {
            @Override
            public PaymentTransactions toEntityModel() {
                return _nullPaymentTransactions;
            }
        };

    public PaymentTransactionsPersistenceImpl() {
        setModelClass(PaymentTransactions.class);
    }

    /**
     * Returns all the payment transactionses where channelId = &#63;.
     *
     * @param channelId the channel ID
     * @return the matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByChannelId(long channelId)
        throws SystemException {
        return findByChannelId(channelId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the payment transactionses where channelId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param channelId the channel ID
     * @param start the lower bound of the range of payment transactionses
     * @param end the upper bound of the range of payment transactionses (not inclusive)
     * @return the range of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByChannelId(long channelId, int start,
        int end) throws SystemException {
        return findByChannelId(channelId, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment transactionses where channelId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param channelId the channel ID
     * @param start the lower bound of the range of payment transactionses
     * @param end the upper bound of the range of payment transactionses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByChannelId(long channelId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID;
            finderArgs = new Object[] { channelId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELID;
            finderArgs = new Object[] { channelId, start, end, orderByComparator };
        }

        List<PaymentTransactions> list = (List<PaymentTransactions>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentTransactions paymentTransactions : list) {
                if ((channelId != paymentTransactions.getChannelId())) {
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

            query.append(_SQL_SELECT_PAYMENTTRANSACTIONS_WHERE);

            query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentTransactionsModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(channelId);

                if (!pagination) {
                    list = (List<PaymentTransactions>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentTransactions>(list);
                } else {
                    list = (List<PaymentTransactions>) QueryUtil.list(q,
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
     * Returns the first payment transactions in the ordered set where channelId = &#63;.
     *
     * @param channelId the channel ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions findByChannelId_First(long channelId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = fetchByChannelId_First(channelId,
                orderByComparator);

        if (paymentTransactions != null) {
            return paymentTransactions;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("channelId=");
        msg.append(channelId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentTransactionsException(msg.toString());
    }

    /**
     * Returns the first payment transactions in the ordered set where channelId = &#63;.
     *
     * @param channelId the channel ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions fetchByChannelId_First(long channelId,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentTransactions> list = findByChannelId(channelId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment transactions in the ordered set where channelId = &#63;.
     *
     * @param channelId the channel ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions findByChannelId_Last(long channelId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = fetchByChannelId_Last(channelId,
                orderByComparator);

        if (paymentTransactions != null) {
            return paymentTransactions;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("channelId=");
        msg.append(channelId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentTransactionsException(msg.toString());
    }

    /**
     * Returns the last payment transactions in the ordered set where channelId = &#63;.
     *
     * @param channelId the channel ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions fetchByChannelId_Last(long channelId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByChannelId(channelId);

        if (count == 0) {
            return null;
        }

        List<PaymentTransactions> list = findByChannelId(channelId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment transactionses before and after the current payment transactions in the ordered set where channelId = &#63;.
     *
     * @param epayTransId the primary key of the current payment transactions
     * @param channelId the channel ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions[] findByChannelId_PrevAndNext(
        String epayTransId, long channelId, OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = findByPrimaryKey(epayTransId);

        Session session = null;

        try {
            session = openSession();

            PaymentTransactions[] array = new PaymentTransactionsImpl[3];

            array[0] = getByChannelId_PrevAndNext(session, paymentTransactions,
                    channelId, orderByComparator, true);

            array[1] = paymentTransactions;

            array[2] = getByChannelId_PrevAndNext(session, paymentTransactions,
                    channelId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentTransactions getByChannelId_PrevAndNext(Session session,
        PaymentTransactions paymentTransactions, long channelId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTTRANSACTIONS_WHERE);

        query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

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
            query.append(PaymentTransactionsModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(channelId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentTransactions);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentTransactions> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment transactionses where channelId = &#63; from the database.
     *
     * @param channelId the channel ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByChannelId(long channelId) throws SystemException {
        for (PaymentTransactions paymentTransactions : findByChannelId(
                channelId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentTransactions);
        }
    }

    /**
     * Returns the number of payment transactionses where channelId = &#63;.
     *
     * @param channelId the channel ID
     * @return the number of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByChannelId(long channelId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CHANNELID;

        Object[] finderArgs = new Object[] { channelId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PAYMENTTRANSACTIONS_WHERE);

            query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(channelId);

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
     * Returns all the payment transactionses where pmtBankId = &#63;.
     *
     * @param pmtBankId the pmt bank ID
     * @return the matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByPmtBankId(String pmtBankId)
        throws SystemException {
        return findByPmtBankId(pmtBankId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the payment transactionses where pmtBankId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pmtBankId the pmt bank ID
     * @param start the lower bound of the range of payment transactionses
     * @param end the upper bound of the range of payment transactionses (not inclusive)
     * @return the range of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByPmtBankId(String pmtBankId,
        int start, int end) throws SystemException {
        return findByPmtBankId(pmtBankId, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment transactionses where pmtBankId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pmtBankId the pmt bank ID
     * @param start the lower bound of the range of payment transactionses
     * @param end the upper bound of the range of payment transactionses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByPmtBankId(String pmtBankId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBANKID;
            finderArgs = new Object[] { pmtBankId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PMTBANKID;
            finderArgs = new Object[] { pmtBankId, start, end, orderByComparator };
        }

        List<PaymentTransactions> list = (List<PaymentTransactions>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentTransactions paymentTransactions : list) {
                if (!Validator.equals(pmtBankId,
                            paymentTransactions.getPmtBankId())) {
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

            query.append(_SQL_SELECT_PAYMENTTRANSACTIONS_WHERE);

            boolean bindPmtBankId = false;

            if (pmtBankId == null) {
                query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_1);
            } else if (pmtBankId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_3);
            } else {
                bindPmtBankId = true;

                query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentTransactionsModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPmtBankId) {
                    qPos.add(pmtBankId);
                }

                if (!pagination) {
                    list = (List<PaymentTransactions>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentTransactions>(list);
                } else {
                    list = (List<PaymentTransactions>) QueryUtil.list(q,
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
     * Returns the first payment transactions in the ordered set where pmtBankId = &#63;.
     *
     * @param pmtBankId the pmt bank ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions findByPmtBankId_First(String pmtBankId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = fetchByPmtBankId_First(pmtBankId,
                orderByComparator);

        if (paymentTransactions != null) {
            return paymentTransactions;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pmtBankId=");
        msg.append(pmtBankId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentTransactionsException(msg.toString());
    }

    /**
     * Returns the first payment transactions in the ordered set where pmtBankId = &#63;.
     *
     * @param pmtBankId the pmt bank ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions fetchByPmtBankId_First(String pmtBankId,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentTransactions> list = findByPmtBankId(pmtBankId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment transactions in the ordered set where pmtBankId = &#63;.
     *
     * @param pmtBankId the pmt bank ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions findByPmtBankId_Last(String pmtBankId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = fetchByPmtBankId_Last(pmtBankId,
                orderByComparator);

        if (paymentTransactions != null) {
            return paymentTransactions;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pmtBankId=");
        msg.append(pmtBankId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentTransactionsException(msg.toString());
    }

    /**
     * Returns the last payment transactions in the ordered set where pmtBankId = &#63;.
     *
     * @param pmtBankId the pmt bank ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions fetchByPmtBankId_Last(String pmtBankId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPmtBankId(pmtBankId);

        if (count == 0) {
            return null;
        }

        List<PaymentTransactions> list = findByPmtBankId(pmtBankId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment transactionses before and after the current payment transactions in the ordered set where pmtBankId = &#63;.
     *
     * @param epayTransId the primary key of the current payment transactions
     * @param pmtBankId the pmt bank ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions[] findByPmtBankId_PrevAndNext(
        String epayTransId, String pmtBankId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = findByPrimaryKey(epayTransId);

        Session session = null;

        try {
            session = openSession();

            PaymentTransactions[] array = new PaymentTransactionsImpl[3];

            array[0] = getByPmtBankId_PrevAndNext(session, paymentTransactions,
                    pmtBankId, orderByComparator, true);

            array[1] = paymentTransactions;

            array[2] = getByPmtBankId_PrevAndNext(session, paymentTransactions,
                    pmtBankId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentTransactions getByPmtBankId_PrevAndNext(Session session,
        PaymentTransactions paymentTransactions, String pmtBankId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTTRANSACTIONS_WHERE);

        boolean bindPmtBankId = false;

        if (pmtBankId == null) {
            query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_1);
        } else if (pmtBankId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_3);
        } else {
            bindPmtBankId = true;

            query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_2);
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
            query.append(PaymentTransactionsModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindPmtBankId) {
            qPos.add(pmtBankId);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentTransactions);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentTransactions> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment transactionses where pmtBankId = &#63; from the database.
     *
     * @param pmtBankId the pmt bank ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPmtBankId(String pmtBankId) throws SystemException {
        for (PaymentTransactions paymentTransactions : findByPmtBankId(
                pmtBankId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentTransactions);
        }
    }

    /**
     * Returns the number of payment transactionses where pmtBankId = &#63;.
     *
     * @param pmtBankId the pmt bank ID
     * @return the number of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPmtBankId(String pmtBankId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PMTBANKID;

        Object[] finderArgs = new Object[] { pmtBankId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PAYMENTTRANSACTIONS_WHERE);

            boolean bindPmtBankId = false;

            if (pmtBankId == null) {
                query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_1);
            } else if (pmtBankId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_3);
            } else {
                bindPmtBankId = true;

                query.append(_FINDER_COLUMN_PMTBANKID_PMTBANKID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPmtBankId) {
                    qPos.add(pmtBankId);
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
     * Returns all the payment transactionses where pmtBranchId = &#63;.
     *
     * @param pmtBranchId the pmt branch ID
     * @return the matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByPmtBranchId(String pmtBranchId)
        throws SystemException {
        return findByPmtBranchId(pmtBranchId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment transactionses where pmtBranchId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pmtBranchId the pmt branch ID
     * @param start the lower bound of the range of payment transactionses
     * @param end the upper bound of the range of payment transactionses (not inclusive)
     * @return the range of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByPmtBranchId(String pmtBranchId,
        int start, int end) throws SystemException {
        return findByPmtBranchId(pmtBranchId, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment transactionses where pmtBranchId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param pmtBranchId the pmt branch ID
     * @param start the lower bound of the range of payment transactionses
     * @param end the upper bound of the range of payment transactionses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findByPmtBranchId(String pmtBranchId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBRANCHID;
            finderArgs = new Object[] { pmtBranchId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PMTBRANCHID;
            finderArgs = new Object[] { pmtBranchId, start, end, orderByComparator };
        }

        List<PaymentTransactions> list = (List<PaymentTransactions>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentTransactions paymentTransactions : list) {
                if (!Validator.equals(pmtBranchId,
                            paymentTransactions.getPmtBranchId())) {
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

            query.append(_SQL_SELECT_PAYMENTTRANSACTIONS_WHERE);

            boolean bindPmtBranchId = false;

            if (pmtBranchId == null) {
                query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_1);
            } else if (pmtBranchId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_3);
            } else {
                bindPmtBranchId = true;

                query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentTransactionsModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPmtBranchId) {
                    qPos.add(pmtBranchId);
                }

                if (!pagination) {
                    list = (List<PaymentTransactions>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentTransactions>(list);
                } else {
                    list = (List<PaymentTransactions>) QueryUtil.list(q,
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
     * Returns the first payment transactions in the ordered set where pmtBranchId = &#63;.
     *
     * @param pmtBranchId the pmt branch ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions findByPmtBranchId_First(String pmtBranchId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = fetchByPmtBranchId_First(pmtBranchId,
                orderByComparator);

        if (paymentTransactions != null) {
            return paymentTransactions;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pmtBranchId=");
        msg.append(pmtBranchId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentTransactionsException(msg.toString());
    }

    /**
     * Returns the first payment transactions in the ordered set where pmtBranchId = &#63;.
     *
     * @param pmtBranchId the pmt branch ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions fetchByPmtBranchId_First(String pmtBranchId,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentTransactions> list = findByPmtBranchId(pmtBranchId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment transactions in the ordered set where pmtBranchId = &#63;.
     *
     * @param pmtBranchId the pmt branch ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions findByPmtBranchId_Last(String pmtBranchId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = fetchByPmtBranchId_Last(pmtBranchId,
                orderByComparator);

        if (paymentTransactions != null) {
            return paymentTransactions;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("pmtBranchId=");
        msg.append(pmtBranchId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentTransactionsException(msg.toString());
    }

    /**
     * Returns the last payment transactions in the ordered set where pmtBranchId = &#63;.
     *
     * @param pmtBranchId the pmt branch ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment transactions, or <code>null</code> if a matching payment transactions could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions fetchByPmtBranchId_Last(String pmtBranchId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPmtBranchId(pmtBranchId);

        if (count == 0) {
            return null;
        }

        List<PaymentTransactions> list = findByPmtBranchId(pmtBranchId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment transactionses before and after the current payment transactions in the ordered set where pmtBranchId = &#63;.
     *
     * @param epayTransId the primary key of the current payment transactions
     * @param pmtBranchId the pmt branch ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions[] findByPmtBranchId_PrevAndNext(
        String epayTransId, String pmtBranchId,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = findByPrimaryKey(epayTransId);

        Session session = null;

        try {
            session = openSession();

            PaymentTransactions[] array = new PaymentTransactionsImpl[3];

            array[0] = getByPmtBranchId_PrevAndNext(session,
                    paymentTransactions, pmtBranchId, orderByComparator, true);

            array[1] = paymentTransactions;

            array[2] = getByPmtBranchId_PrevAndNext(session,
                    paymentTransactions, pmtBranchId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentTransactions getByPmtBranchId_PrevAndNext(
        Session session, PaymentTransactions paymentTransactions,
        String pmtBranchId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTTRANSACTIONS_WHERE);

        boolean bindPmtBranchId = false;

        if (pmtBranchId == null) {
            query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_1);
        } else if (pmtBranchId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_3);
        } else {
            bindPmtBranchId = true;

            query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_2);
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
            query.append(PaymentTransactionsModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindPmtBranchId) {
            qPos.add(pmtBranchId);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentTransactions);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentTransactions> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment transactionses where pmtBranchId = &#63; from the database.
     *
     * @param pmtBranchId the pmt branch ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPmtBranchId(String pmtBranchId)
        throws SystemException {
        for (PaymentTransactions paymentTransactions : findByPmtBranchId(
                pmtBranchId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentTransactions);
        }
    }

    /**
     * Returns the number of payment transactionses where pmtBranchId = &#63;.
     *
     * @param pmtBranchId the pmt branch ID
     * @return the number of matching payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPmtBranchId(String pmtBranchId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PMTBRANCHID;

        Object[] finderArgs = new Object[] { pmtBranchId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PAYMENTTRANSACTIONS_WHERE);

            boolean bindPmtBranchId = false;

            if (pmtBranchId == null) {
                query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_1);
            } else if (pmtBranchId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_3);
            } else {
                bindPmtBranchId = true;

                query.append(_FINDER_COLUMN_PMTBRANCHID_PMTBRANCHID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPmtBranchId) {
                    qPos.add(pmtBranchId);
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
     * Caches the payment transactions in the entity cache if it is enabled.
     *
     * @param paymentTransactions the payment transactions
     */
    @Override
    public void cacheResult(PaymentTransactions paymentTransactions) {
        EntityCacheUtil.putResult(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsImpl.class, paymentTransactions.getPrimaryKey(),
            paymentTransactions);

        paymentTransactions.resetOriginalValues();
    }

    /**
     * Caches the payment transactionses in the entity cache if it is enabled.
     *
     * @param paymentTransactionses the payment transactionses
     */
    @Override
    public void cacheResult(List<PaymentTransactions> paymentTransactionses) {
        for (PaymentTransactions paymentTransactions : paymentTransactionses) {
            if (EntityCacheUtil.getResult(
                        PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentTransactionsImpl.class,
                        paymentTransactions.getPrimaryKey()) == null) {
                cacheResult(paymentTransactions);
            } else {
                paymentTransactions.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment transactionses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentTransactionsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentTransactionsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment transactions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentTransactions paymentTransactions) {
        EntityCacheUtil.removeResult(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsImpl.class, paymentTransactions.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PaymentTransactions> paymentTransactionses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentTransactions paymentTransactions : paymentTransactionses) {
            EntityCacheUtil.removeResult(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
                PaymentTransactionsImpl.class,
                paymentTransactions.getPrimaryKey());
        }
    }

    /**
     * Creates a new payment transactions with the primary key. Does not add the payment transactions to the database.
     *
     * @param epayTransId the primary key for the new payment transactions
     * @return the new payment transactions
     */
    @Override
    public PaymentTransactions create(String epayTransId) {
        PaymentTransactions paymentTransactions = new PaymentTransactionsImpl();

        paymentTransactions.setNew(true);
        paymentTransactions.setPrimaryKey(epayTransId);

        return paymentTransactions;
    }

    /**
     * Removes the payment transactions with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param epayTransId the primary key of the payment transactions
     * @return the payment transactions that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions remove(String epayTransId)
        throws NoSuchPaymentTransactionsException, SystemException {
        return remove((Serializable) epayTransId);
    }

    /**
     * Removes the payment transactions with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment transactions
     * @return the payment transactions that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions remove(Serializable primaryKey)
        throws NoSuchPaymentTransactionsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentTransactions paymentTransactions = (PaymentTransactions) session.get(PaymentTransactionsImpl.class,
                    primaryKey);

            if (paymentTransactions == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentTransactionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentTransactions);
        } catch (NoSuchPaymentTransactionsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentTransactions removeImpl(
        PaymentTransactions paymentTransactions) throws SystemException {
        paymentTransactions = toUnwrappedModel(paymentTransactions);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentTransactions)) {
                paymentTransactions = (PaymentTransactions) session.get(PaymentTransactionsImpl.class,
                        paymentTransactions.getPrimaryKeyObj());
            }

            if (paymentTransactions != null) {
                session.delete(paymentTransactions);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentTransactions != null) {
            clearCache(paymentTransactions);
        }

        return paymentTransactions;
    }

    @Override
    public PaymentTransactions updateImpl(
        com.stc.echannels.epayments.model.PaymentTransactions paymentTransactions)
        throws SystemException {
        paymentTransactions = toUnwrappedModel(paymentTransactions);

        boolean isNew = paymentTransactions.isNew();

        PaymentTransactionsModelImpl paymentTransactionsModelImpl = (PaymentTransactionsModelImpl) paymentTransactions;

        Session session = null;

        try {
            session = openSession();

            if (paymentTransactions.isNew()) {
                session.save(paymentTransactions);

                paymentTransactions.setNew(false);
            } else {
                session.merge(paymentTransactions);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PaymentTransactionsModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((paymentTransactionsModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentTransactionsModelImpl.getOriginalChannelId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID,
                    args);

                args = new Object[] { paymentTransactionsModelImpl.getChannelId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID,
                    args);
            }

            if ((paymentTransactionsModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentTransactionsModelImpl.getOriginalPmtBankId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PMTBANKID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBANKID,
                    args);

                args = new Object[] { paymentTransactionsModelImpl.getPmtBankId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PMTBANKID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBANKID,
                    args);
            }

            if ((paymentTransactionsModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBRANCHID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentTransactionsModelImpl.getOriginalPmtBranchId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PMTBRANCHID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBRANCHID,
                    args);

                args = new Object[] {
                        paymentTransactionsModelImpl.getPmtBranchId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PMTBRANCHID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PMTBRANCHID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionsImpl.class, paymentTransactions.getPrimaryKey(),
            paymentTransactions);

        return paymentTransactions;
    }

    protected PaymentTransactions toUnwrappedModel(
        PaymentTransactions paymentTransactions) {
        if (paymentTransactions instanceof PaymentTransactionsImpl) {
            return paymentTransactions;
        }

        PaymentTransactionsImpl paymentTransactionsImpl = new PaymentTransactionsImpl();

        paymentTransactionsImpl.setNew(paymentTransactions.isNew());
        paymentTransactionsImpl.setPrimaryKey(paymentTransactions.getPrimaryKey());

        paymentTransactionsImpl.setEpayTransId(paymentTransactions.getEpayTransId());
        paymentTransactionsImpl.setTransAmount(paymentTransactions.getTransAmount());
        paymentTransactionsImpl.setTransValue(paymentTransactions.getTransValue());
        paymentTransactionsImpl.setTransAmotChkDigit(paymentTransactions.getTransAmotChkDigit());
        paymentTransactionsImpl.setProcessorReference(paymentTransactions.getProcessorReference());
        paymentTransactionsImpl.setChannelId(paymentTransactions.getChannelId());
        paymentTransactionsImpl.setPmtBankId(paymentTransactions.getPmtBankId());
        paymentTransactionsImpl.setPmtBranchId(paymentTransactions.getPmtBranchId());
        paymentTransactionsImpl.setTransProcessDate(paymentTransactions.getTransProcessDate());
        paymentTransactionsImpl.setBatchId(paymentTransactions.getBatchId());
        paymentTransactionsImpl.setServiceId(paymentTransactions.getServiceId());
        paymentTransactionsImpl.setAppliedDate(paymentTransactions.getAppliedDate());
        paymentTransactionsImpl.setAppliedAmount(paymentTransactions.getAppliedAmount());
        paymentTransactionsImpl.setProcessStatus(paymentTransactions.getProcessStatus());
        paymentTransactionsImpl.setNotificationNumber(paymentTransactions.getNotificationNumber());
        paymentTransactionsImpl.setCurrencyCode(paymentTransactions.getCurrencyCode());
        paymentTransactionsImpl.setConfirmationNumber(paymentTransactions.getConfirmationNumber());
        paymentTransactionsImpl.setPmtRecievedDate(paymentTransactions.getPmtRecievedDate());
        paymentTransactionsImpl.setReasonCode(paymentTransactions.getReasonCode());
        paymentTransactionsImpl.setEventTypeId(paymentTransactions.getEventTypeId());
        paymentTransactionsImpl.setPmtMethodId(paymentTransactions.getPmtMethodId());
        paymentTransactionsImpl.setPmtType(paymentTransactions.getPmtType());
        paymentTransactionsImpl.setRpmId(paymentTransactions.getRpmId());
        paymentTransactionsImpl.setNativeReasonCode(paymentTransactions.getNativeReasonCode());
        paymentTransactionsImpl.setFeeId(paymentTransactions.getFeeId());
        paymentTransactionsImpl.setRequestLocation(paymentTransactions.getRequestLocation());
        paymentTransactionsImpl.setProfileId(paymentTransactions.getProfileId());
        paymentTransactionsImpl.setSenderId(paymentTransactions.getSenderId());
        paymentTransactionsImpl.setLast4Digits(paymentTransactions.getLast4Digits());
        paymentTransactionsImpl.setCardType(paymentTransactions.getCardType());
        paymentTransactionsImpl.setExpiryDate(paymentTransactions.getExpiryDate());
        paymentTransactionsImpl.setSourceTransType(paymentTransactions.getSourceTransType());

        return paymentTransactionsImpl;
    }

    /**
     * Returns the payment transactions with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment transactions
     * @return the payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentTransactionsException, SystemException {
        PaymentTransactions paymentTransactions = fetchByPrimaryKey(primaryKey);

        if (paymentTransactions == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentTransactionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentTransactions;
    }

    /**
     * Returns the payment transactions with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentTransactionsException} if it could not be found.
     *
     * @param epayTransId the primary key of the payment transactions
     * @return the payment transactions
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionsException if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions findByPrimaryKey(String epayTransId)
        throws NoSuchPaymentTransactionsException, SystemException {
        return findByPrimaryKey((Serializable) epayTransId);
    }

    /**
     * Returns the payment transactions with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment transactions
     * @return the payment transactions, or <code>null</code> if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentTransactions paymentTransactions = (PaymentTransactions) EntityCacheUtil.getResult(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
                PaymentTransactionsImpl.class, primaryKey);

        if (paymentTransactions == _nullPaymentTransactions) {
            return null;
        }

        if (paymentTransactions == null) {
            Session session = null;

            try {
                session = openSession();

                paymentTransactions = (PaymentTransactions) session.get(PaymentTransactionsImpl.class,
                        primaryKey);

                if (paymentTransactions != null) {
                    cacheResult(paymentTransactions);
                } else {
                    EntityCacheUtil.putResult(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentTransactionsImpl.class, primaryKey,
                        _nullPaymentTransactions);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentTransactionsModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentTransactionsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentTransactions;
    }

    /**
     * Returns the payment transactions with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param epayTransId the primary key of the payment transactions
     * @return the payment transactions, or <code>null</code> if a payment transactions with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactions fetchByPrimaryKey(String epayTransId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) epayTransId);
    }

    /**
     * Returns all the payment transactionses.
     *
     * @return the payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment transactionses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment transactionses
     * @param end the upper bound of the range of payment transactionses (not inclusive)
     * @return the range of payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the payment transactionses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment transactionses
     * @param end the upper bound of the range of payment transactionses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of payment transactionses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactions> findAll(int start, int end,
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

        List<PaymentTransactions> list = (List<PaymentTransactions>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTTRANSACTIONS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTTRANSACTIONS;

                if (pagination) {
                    sql = sql.concat(PaymentTransactionsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentTransactions>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentTransactions>(list);
                } else {
                    list = (List<PaymentTransactions>) QueryUtil.list(q,
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
     * Removes all the payment transactionses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentTransactions paymentTransactions : findAll()) {
            remove(paymentTransactions);
        }
    }

    /**
     * Returns the number of payment transactionses.
     *
     * @return the number of payment transactionses
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

                Query q = session.createQuery(_SQL_COUNT_PAYMENTTRANSACTIONS);

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
     * Initializes the payment transactions persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentTransactions")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentTransactions>> listenersList = new ArrayList<ModelListener<PaymentTransactions>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentTransactions>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentTransactionsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
