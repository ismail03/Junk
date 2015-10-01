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

import com.stc.echannels.epayments.NoSuchPaymentChannelException;
import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.impl.PaymentChannelImpl;
import com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentChannelPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment channel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelPersistence
 * @see PaymentChannelUtil
 * @generated
 */
public class PaymentChannelPersistenceImpl extends BasePersistenceImpl<PaymentChannel>
    implements PaymentChannelPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentChannelUtil} to access the payment channel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentChannelImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELID =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByChannelId",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByChannelId",
            new String[] { Long.class.getName(), String.class.getName() },
            PaymentChannelModelImpl.CHANNELID_COLUMN_BITMASK |
            PaymentChannelModelImpl.STATUS_COLUMN_BITMASK |
            PaymentChannelModelImpl.CHANNELTYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CHANNELID = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByChannelId",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_CHANNELID_CHANNELID_2 = "paymentChannel.channelId = ? AND ";
    private static final String _FINDER_COLUMN_CHANNELID_STATUS_1 = "paymentChannel.status IS NULL";
    private static final String _FINDER_COLUMN_CHANNELID_STATUS_2 = "paymentChannel.status = ?";
    private static final String _FINDER_COLUMN_CHANNELID_STATUS_3 = "(paymentChannel.status IS NULL OR paymentChannel.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByStatus",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { String.class.getName() },
            PaymentChannelModelImpl.STATUS_COLUMN_BITMASK |
            PaymentChannelModelImpl.CHANNELTYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "paymentChannel.status IS NULL";
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "paymentChannel.status = ?";
    private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(paymentChannel.status IS NULL OR paymentChannel.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELTYPE =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByChannelType",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELTYPE =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByChannelType",
            new String[] { String.class.getName(), String.class.getName() },
            PaymentChannelModelImpl.CHANNELTYPE_COLUMN_BITMASK |
            PaymentChannelModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CHANNELTYPE = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByChannelType",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_1 = "paymentChannel.channelType IS NULL AND ";
    private static final String _FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_2 = "paymentChannel.channelType = ? AND ";
    private static final String _FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_3 = "(paymentChannel.channelType IS NULL OR paymentChannel.channelType = '') AND ";
    private static final String _FINDER_COLUMN_CHANNELTYPE_STATUS_1 = "paymentChannel.status IS NULL";
    private static final String _FINDER_COLUMN_CHANNELTYPE_STATUS_2 = "paymentChannel.status = ?";
    private static final String _FINDER_COLUMN_CHANNELTYPE_STATUS_3 = "(paymentChannel.status IS NULL OR paymentChannel.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELENANDSTATUS =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByChannelEnAndStatus",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELENANDSTATUS =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByChannelEnAndStatus",
            new String[] { String.class.getName(), String.class.getName() },
            PaymentChannelModelImpl.DESCRIPTIVENAMEEN_COLUMN_BITMASK |
            PaymentChannelModelImpl.STATUS_COLUMN_BITMASK |
            PaymentChannelModelImpl.CHANNELTYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CHANNELENANDSTATUS = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByChannelEnAndStatus",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_1 =
        "paymentChannel.descriptiveNameEn IS NULL AND ";
    private static final String _FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_2 =
        "paymentChannel.descriptiveNameEn = ? AND ";
    private static final String _FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_3 =
        "(paymentChannel.descriptiveNameEn IS NULL OR paymentChannel.descriptiveNameEn = '') AND ";
    private static final String _FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_1 = "paymentChannel.status IS NULL";
    private static final String _FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_2 = "paymentChannel.status = ?";
    private static final String _FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_3 = "(paymentChannel.status IS NULL OR paymentChannel.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELARANDSTATUS =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByChannelArAndStatus",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELARANDSTATUS =
        new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED,
            PaymentChannelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByChannelArAndStatus",
            new String[] { String.class.getName(), String.class.getName() },
            PaymentChannelModelImpl.DESCRIPTIVENAMEAR_COLUMN_BITMASK |
            PaymentChannelModelImpl.STATUS_COLUMN_BITMASK |
            PaymentChannelModelImpl.CHANNELTYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CHANNELARANDSTATUS = new FinderPath(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByChannelArAndStatus",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_1 =
        "paymentChannel.descriptiveNameAr IS NULL AND ";
    private static final String _FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_2 =
        "paymentChannel.descriptiveNameAr = ? AND ";
    private static final String _FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_3 =
        "(paymentChannel.descriptiveNameAr IS NULL OR paymentChannel.descriptiveNameAr = '') AND ";
    private static final String _FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_1 = "paymentChannel.status IS NULL";
    private static final String _FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_2 = "paymentChannel.status = ?";
    private static final String _FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_3 = "(paymentChannel.status IS NULL OR paymentChannel.status = '')";
    private static final String _SQL_SELECT_PAYMENTCHANNEL = "SELECT paymentChannel FROM PaymentChannel paymentChannel";
    private static final String _SQL_SELECT_PAYMENTCHANNEL_WHERE = "SELECT paymentChannel FROM PaymentChannel paymentChannel WHERE ";
    private static final String _SQL_COUNT_PAYMENTCHANNEL = "SELECT COUNT(paymentChannel) FROM PaymentChannel paymentChannel";
    private static final String _SQL_COUNT_PAYMENTCHANNEL_WHERE = "SELECT COUNT(paymentChannel) FROM PaymentChannel paymentChannel WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentChannel.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentChannel exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PaymentChannel exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentChannelPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "transId", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp", "clientIp",
                "serverIp", "userAgent", "operation", "channelId", "channelType",
                "descriptiveNameEn", "descriptiveNameAr"
            });
    private static PaymentChannel _nullPaymentChannel = new PaymentChannelImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentChannel> toCacheModel() {
                return _nullPaymentChannelCacheModel;
            }
        };

    private static CacheModel<PaymentChannel> _nullPaymentChannelCacheModel = new CacheModel<PaymentChannel>() {
            @Override
            public PaymentChannel toEntityModel() {
                return _nullPaymentChannel;
            }
        };

    public PaymentChannelPersistenceImpl() {
        setModelClass(PaymentChannel.class);
    }

    /**
     * Returns all the payment channels where channelId = &#63; and status = &#63;.
     *
     * @param channelId the channel ID
     * @param status the status
     * @return the matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelId(long channelId, String status)
        throws SystemException {
        return findByChannelId(channelId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment channels where channelId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param channelId the channel ID
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @return the range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelId(long channelId, String status,
        int start, int end) throws SystemException {
        return findByChannelId(channelId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channels where channelId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param channelId the channel ID
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelId(long channelId, String status,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID;
            finderArgs = new Object[] { channelId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELID;
            finderArgs = new Object[] {
                    channelId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<PaymentChannel> list = (List<PaymentChannel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentChannel paymentChannel : list) {
                if ((channelId != paymentChannel.getChannelId()) ||
                        !Validator.equals(status, paymentChannel.getStatus())) {
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

            query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

            query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_CHANNELID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_CHANNELID_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(channelId);

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannel>(list);
                } else {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
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
     * Returns the first payment channel in the ordered set where channelId = &#63; and status = &#63;.
     *
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByChannelId_First(long channelId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByChannelId_First(channelId,
                status, orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("channelId=");
        msg.append(channelId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the first payment channel in the ordered set where channelId = &#63; and status = &#63;.
     *
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByChannelId_First(long channelId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentChannel> list = findByChannelId(channelId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment channel in the ordered set where channelId = &#63; and status = &#63;.
     *
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByChannelId_Last(long channelId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByChannelId_Last(channelId,
                status, orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("channelId=");
        msg.append(channelId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the last payment channel in the ordered set where channelId = &#63; and status = &#63;.
     *
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByChannelId_Last(long channelId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByChannelId(channelId, status);

        if (count == 0) {
            return null;
        }

        List<PaymentChannel> list = findByChannelId(channelId, status,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment channels before and after the current payment channel in the ordered set where channelId = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current payment channel
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel[] findByChannelId_PrevAndNext(String transId,
        long channelId, String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            PaymentChannel[] array = new PaymentChannelImpl[3];

            array[0] = getByChannelId_PrevAndNext(session, paymentChannel,
                    channelId, status, orderByComparator, true);

            array[1] = paymentChannel;

            array[2] = getByChannelId_PrevAndNext(session, paymentChannel,
                    channelId, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentChannel getByChannelId_PrevAndNext(Session session,
        PaymentChannel paymentChannel, long channelId, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

        query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_CHANNELID_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CHANNELID_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_CHANNELID_STATUS_2);
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
            query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(channelId);

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentChannel);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentChannel> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment channels where channelId = &#63; and status = &#63; from the database.
     *
     * @param channelId the channel ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByChannelId(long channelId, String status)
        throws SystemException {
        for (PaymentChannel paymentChannel : findByChannelId(channelId, status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentChannel);
        }
    }

    /**
     * Returns the number of payment channels where channelId = &#63; and status = &#63;.
     *
     * @param channelId the channel ID
     * @param status the status
     * @return the number of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByChannelId(long channelId, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CHANNELID;

        Object[] finderArgs = new Object[] { channelId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PAYMENTCHANNEL_WHERE);

            query.append(_FINDER_COLUMN_CHANNELID_CHANNELID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_CHANNELID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_CHANNELID_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(channelId);

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
     * Returns all the payment channels where status = &#63;.
     *
     * @param status the status
     * @return the matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByStatus(String status)
        throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment channels where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @return the range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByStatus(String status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channels where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByStatus(String status, int start, int end,
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

        List<PaymentChannel> list = (List<PaymentChannel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentChannel paymentChannel : list) {
                if (!Validator.equals(status, paymentChannel.getStatus())) {
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

            query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

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
                query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
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
                    list = (List<PaymentChannel>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannel>(list);
                } else {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
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
     * Returns the first payment channel in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByStatus_First(String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByStatus_First(status,
                orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the first payment channel in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByStatus_First(String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentChannel> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment channel in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByStatus_Last(String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByStatus_Last(status,
                orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the last payment channel in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByStatus_Last(String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<PaymentChannel> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment channels before and after the current payment channel in the ordered set where status = &#63;.
     *
     * @param transId the primary key of the current payment channel
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel[] findByStatus_PrevAndNext(String transId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            PaymentChannel[] array = new PaymentChannelImpl[3];

            array[0] = getByStatus_PrevAndNext(session, paymentChannel, status,
                    orderByComparator, true);

            array[1] = paymentChannel;

            array[2] = getByStatus_PrevAndNext(session, paymentChannel, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentChannel getByStatus_PrevAndNext(Session session,
        PaymentChannel paymentChannel, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

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
            query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(paymentChannel);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentChannel> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment channels where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(String status) throws SystemException {
        for (PaymentChannel paymentChannel : findByStatus(status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentChannel);
        }
    }

    /**
     * Returns the number of payment channels where status = &#63;.
     *
     * @param status the status
     * @return the number of matching payment channels
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

            query.append(_SQL_COUNT_PAYMENTCHANNEL_WHERE);

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
     * Returns all the payment channels where channelType = &#63; and status = &#63;.
     *
     * @param channelType the channel type
     * @param status the status
     * @return the matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelType(String channelType,
        String status) throws SystemException {
        return findByChannelType(channelType, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment channels where channelType = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param channelType the channel type
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @return the range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelType(String channelType,
        String status, int start, int end) throws SystemException {
        return findByChannelType(channelType, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channels where channelType = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param channelType the channel type
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelType(String channelType,
        String status, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELTYPE;
            finderArgs = new Object[] { channelType, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELTYPE;
            finderArgs = new Object[] {
                    channelType, status,
                    
                    start, end, orderByComparator
                };
        }

        List<PaymentChannel> list = (List<PaymentChannel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentChannel paymentChannel : list) {
                if (!Validator.equals(channelType,
                            paymentChannel.getChannelType()) ||
                        !Validator.equals(status, paymentChannel.getStatus())) {
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

            query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

            boolean bindChannelType = false;

            if (channelType == null) {
                query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_1);
            } else if (channelType.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_3);
            } else {
                bindChannelType = true;

                query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindChannelType) {
                    qPos.add(channelType);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannel>(list);
                } else {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
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
     * Returns the first payment channel in the ordered set where channelType = &#63; and status = &#63;.
     *
     * @param channelType the channel type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByChannelType_First(String channelType,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByChannelType_First(channelType,
                status, orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("channelType=");
        msg.append(channelType);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the first payment channel in the ordered set where channelType = &#63; and status = &#63;.
     *
     * @param channelType the channel type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByChannelType_First(String channelType,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        List<PaymentChannel> list = findByChannelType(channelType, status, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment channel in the ordered set where channelType = &#63; and status = &#63;.
     *
     * @param channelType the channel type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByChannelType_Last(String channelType,
        String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByChannelType_Last(channelType,
                status, orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("channelType=");
        msg.append(channelType);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the last payment channel in the ordered set where channelType = &#63; and status = &#63;.
     *
     * @param channelType the channel type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByChannelType_Last(String channelType,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByChannelType(channelType, status);

        if (count == 0) {
            return null;
        }

        List<PaymentChannel> list = findByChannelType(channelType, status,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment channels before and after the current payment channel in the ordered set where channelType = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current payment channel
     * @param channelType the channel type
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel[] findByChannelType_PrevAndNext(String transId,
        String channelType, String status, OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            PaymentChannel[] array = new PaymentChannelImpl[3];

            array[0] = getByChannelType_PrevAndNext(session, paymentChannel,
                    channelType, status, orderByComparator, true);

            array[1] = paymentChannel;

            array[2] = getByChannelType_PrevAndNext(session, paymentChannel,
                    channelType, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentChannel getByChannelType_PrevAndNext(Session session,
        PaymentChannel paymentChannel, String channelType, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

        boolean bindChannelType = false;

        if (channelType == null) {
            query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_1);
        } else if (channelType.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_3);
        } else {
            bindChannelType = true;

            query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_2);
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
            query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindChannelType) {
            qPos.add(channelType);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentChannel);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentChannel> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment channels where channelType = &#63; and status = &#63; from the database.
     *
     * @param channelType the channel type
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByChannelType(String channelType, String status)
        throws SystemException {
        for (PaymentChannel paymentChannel : findByChannelType(channelType,
                status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(paymentChannel);
        }
    }

    /**
     * Returns the number of payment channels where channelType = &#63; and status = &#63;.
     *
     * @param channelType the channel type
     * @param status the status
     * @return the number of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByChannelType(String channelType, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CHANNELTYPE;

        Object[] finderArgs = new Object[] { channelType, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PAYMENTCHANNEL_WHERE);

            boolean bindChannelType = false;

            if (channelType == null) {
                query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_1);
            } else if (channelType.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_3);
            } else {
                bindChannelType = true;

                query.append(_FINDER_COLUMN_CHANNELTYPE_CHANNELTYPE_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_CHANNELTYPE_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindChannelType) {
                    qPos.add(channelType);
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
     * Returns all the payment channels where descriptiveNameEn = &#63; and status = &#63;.
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @return the matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelEnAndStatus(
        String descriptiveNameEn, String status) throws SystemException {
        return findByChannelEnAndStatus(descriptiveNameEn, status,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment channels where descriptiveNameEn = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @return the range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelEnAndStatus(
        String descriptiveNameEn, String status, int start, int end)
        throws SystemException {
        return findByChannelEnAndStatus(descriptiveNameEn, status, start, end,
            null);
    }

    /**
     * Returns an ordered range of all the payment channels where descriptiveNameEn = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelEnAndStatus(
        String descriptiveNameEn, String status, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELENANDSTATUS;
            finderArgs = new Object[] { descriptiveNameEn, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELENANDSTATUS;
            finderArgs = new Object[] {
                    descriptiveNameEn, status,
                    
                    start, end, orderByComparator
                };
        }

        List<PaymentChannel> list = (List<PaymentChannel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentChannel paymentChannel : list) {
                if (!Validator.equals(descriptiveNameEn,
                            paymentChannel.getDescriptiveNameEn()) ||
                        !Validator.equals(status, paymentChannel.getStatus())) {
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

            query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

            boolean bindDescriptiveNameEn = false;

            if (descriptiveNameEn == null) {
                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_1);
            } else if (descriptiveNameEn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_3);
            } else {
                bindDescriptiveNameEn = true;

                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDescriptiveNameEn) {
                    qPos.add(descriptiveNameEn);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannel>(list);
                } else {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
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
     * Returns the first payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByChannelEnAndStatus_First(
        String descriptiveNameEn, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByChannelEnAndStatus_First(descriptiveNameEn,
                status, orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("descriptiveNameEn=");
        msg.append(descriptiveNameEn);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the first payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByChannelEnAndStatus_First(
        String descriptiveNameEn, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentChannel> list = findByChannelEnAndStatus(descriptiveNameEn,
                status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByChannelEnAndStatus_Last(
        String descriptiveNameEn, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByChannelEnAndStatus_Last(descriptiveNameEn,
                status, orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("descriptiveNameEn=");
        msg.append(descriptiveNameEn);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the last payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByChannelEnAndStatus_Last(
        String descriptiveNameEn, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByChannelEnAndStatus(descriptiveNameEn, status);

        if (count == 0) {
            return null;
        }

        List<PaymentChannel> list = findByChannelEnAndStatus(descriptiveNameEn,
                status, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment channels before and after the current payment channel in the ordered set where descriptiveNameEn = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current payment channel
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel[] findByChannelEnAndStatus_PrevAndNext(
        String transId, String descriptiveNameEn, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            PaymentChannel[] array = new PaymentChannelImpl[3];

            array[0] = getByChannelEnAndStatus_PrevAndNext(session,
                    paymentChannel, descriptiveNameEn, status,
                    orderByComparator, true);

            array[1] = paymentChannel;

            array[2] = getByChannelEnAndStatus_PrevAndNext(session,
                    paymentChannel, descriptiveNameEn, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentChannel getByChannelEnAndStatus_PrevAndNext(
        Session session, PaymentChannel paymentChannel,
        String descriptiveNameEn, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

        boolean bindDescriptiveNameEn = false;

        if (descriptiveNameEn == null) {
            query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_1);
        } else if (descriptiveNameEn.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_3);
        } else {
            bindDescriptiveNameEn = true;

            query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_2);
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
            query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindDescriptiveNameEn) {
            qPos.add(descriptiveNameEn);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentChannel);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentChannel> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment channels where descriptiveNameEn = &#63; and status = &#63; from the database.
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByChannelEnAndStatus(String descriptiveNameEn,
        String status) throws SystemException {
        for (PaymentChannel paymentChannel : findByChannelEnAndStatus(
                descriptiveNameEn, status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(paymentChannel);
        }
    }

    /**
     * Returns the number of payment channels where descriptiveNameEn = &#63; and status = &#63;.
     *
     * @param descriptiveNameEn the descriptive name en
     * @param status the status
     * @return the number of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByChannelEnAndStatus(String descriptiveNameEn, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CHANNELENANDSTATUS;

        Object[] finderArgs = new Object[] { descriptiveNameEn, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PAYMENTCHANNEL_WHERE);

            boolean bindDescriptiveNameEn = false;

            if (descriptiveNameEn == null) {
                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_1);
            } else if (descriptiveNameEn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_3);
            } else {
                bindDescriptiveNameEn = true;

                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_DESCRIPTIVENAMEEN_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_CHANNELENANDSTATUS_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDescriptiveNameEn) {
                    qPos.add(descriptiveNameEn);
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
     * Returns all the payment channels where descriptiveNameAr = &#63; and status = &#63;.
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @return the matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelArAndStatus(
        String descriptiveNameAr, String status) throws SystemException {
        return findByChannelArAndStatus(descriptiveNameAr, status,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment channels where descriptiveNameAr = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @return the range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelArAndStatus(
        String descriptiveNameAr, String status, int start, int end)
        throws SystemException {
        return findByChannelArAndStatus(descriptiveNameAr, status, start, end,
            null);
    }

    /**
     * Returns an ordered range of all the payment channels where descriptiveNameAr = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findByChannelArAndStatus(
        String descriptiveNameAr, String status, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELARANDSTATUS;
            finderArgs = new Object[] { descriptiveNameAr, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHANNELARANDSTATUS;
            finderArgs = new Object[] {
                    descriptiveNameAr, status,
                    
                    start, end, orderByComparator
                };
        }

        List<PaymentChannel> list = (List<PaymentChannel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (PaymentChannel paymentChannel : list) {
                if (!Validator.equals(descriptiveNameAr,
                            paymentChannel.getDescriptiveNameAr()) ||
                        !Validator.equals(status, paymentChannel.getStatus())) {
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

            query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

            boolean bindDescriptiveNameAr = false;

            if (descriptiveNameAr == null) {
                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_1);
            } else if (descriptiveNameAr.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_3);
            } else {
                bindDescriptiveNameAr = true;

                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDescriptiveNameAr) {
                    qPos.add(descriptiveNameAr);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannel>(list);
                } else {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
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
     * Returns the first payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByChannelArAndStatus_First(
        String descriptiveNameAr, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByChannelArAndStatus_First(descriptiveNameAr,
                status, orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("descriptiveNameAr=");
        msg.append(descriptiveNameAr);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the first payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByChannelArAndStatus_First(
        String descriptiveNameAr, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<PaymentChannel> list = findByChannelArAndStatus(descriptiveNameAr,
                status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByChannelArAndStatus_Last(
        String descriptiveNameAr, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByChannelArAndStatus_Last(descriptiveNameAr,
                status, orderByComparator);

        if (paymentChannel != null) {
            return paymentChannel;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("descriptiveNameAr=");
        msg.append(descriptiveNameAr);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPaymentChannelException(msg.toString());
    }

    /**
     * Returns the last payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching payment channel, or <code>null</code> if a matching payment channel could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByChannelArAndStatus_Last(
        String descriptiveNameAr, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByChannelArAndStatus(descriptiveNameAr, status);

        if (count == 0) {
            return null;
        }

        List<PaymentChannel> list = findByChannelArAndStatus(descriptiveNameAr,
                status, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the payment channels before and after the current payment channel in the ordered set where descriptiveNameAr = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current payment channel
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel[] findByChannelArAndStatus_PrevAndNext(
        String transId, String descriptiveNameAr, String status,
        OrderByComparator orderByComparator)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            PaymentChannel[] array = new PaymentChannelImpl[3];

            array[0] = getByChannelArAndStatus_PrevAndNext(session,
                    paymentChannel, descriptiveNameAr, status,
                    orderByComparator, true);

            array[1] = paymentChannel;

            array[2] = getByChannelArAndStatus_PrevAndNext(session,
                    paymentChannel, descriptiveNameAr, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PaymentChannel getByChannelArAndStatus_PrevAndNext(
        Session session, PaymentChannel paymentChannel,
        String descriptiveNameAr, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PAYMENTCHANNEL_WHERE);

        boolean bindDescriptiveNameAr = false;

        if (descriptiveNameAr == null) {
            query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_1);
        } else if (descriptiveNameAr.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_3);
        } else {
            bindDescriptiveNameAr = true;

            query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_2);
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
            query.append(PaymentChannelModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindDescriptiveNameAr) {
            qPos.add(descriptiveNameAr);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(paymentChannel);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PaymentChannel> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the payment channels where descriptiveNameAr = &#63; and status = &#63; from the database.
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByChannelArAndStatus(String descriptiveNameAr,
        String status) throws SystemException {
        for (PaymentChannel paymentChannel : findByChannelArAndStatus(
                descriptiveNameAr, status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(paymentChannel);
        }
    }

    /**
     * Returns the number of payment channels where descriptiveNameAr = &#63; and status = &#63;.
     *
     * @param descriptiveNameAr the descriptive name ar
     * @param status the status
     * @return the number of matching payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByChannelArAndStatus(String descriptiveNameAr, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CHANNELARANDSTATUS;

        Object[] finderArgs = new Object[] { descriptiveNameAr, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PAYMENTCHANNEL_WHERE);

            boolean bindDescriptiveNameAr = false;

            if (descriptiveNameAr == null) {
                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_1);
            } else if (descriptiveNameAr.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_3);
            } else {
                bindDescriptiveNameAr = true;

                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_DESCRIPTIVENAMEAR_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_CHANNELARANDSTATUS_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDescriptiveNameAr) {
                    qPos.add(descriptiveNameAr);
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
     * Caches the payment channel in the entity cache if it is enabled.
     *
     * @param paymentChannel the payment channel
     */
    @Override
    public void cacheResult(PaymentChannel paymentChannel) {
        EntityCacheUtil.putResult(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelImpl.class, paymentChannel.getPrimaryKey(),
            paymentChannel);

        paymentChannel.resetOriginalValues();
    }

    /**
     * Caches the payment channels in the entity cache if it is enabled.
     *
     * @param paymentChannels the payment channels
     */
    @Override
    public void cacheResult(List<PaymentChannel> paymentChannels) {
        for (PaymentChannel paymentChannel : paymentChannels) {
            if (EntityCacheUtil.getResult(
                        PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentChannelImpl.class, paymentChannel.getPrimaryKey()) == null) {
                cacheResult(paymentChannel);
            } else {
                paymentChannel.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment channels.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentChannelImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentChannelImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment channel.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentChannel paymentChannel) {
        EntityCacheUtil.removeResult(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelImpl.class, paymentChannel.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PaymentChannel> paymentChannels) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentChannel paymentChannel : paymentChannels) {
            EntityCacheUtil.removeResult(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
                PaymentChannelImpl.class, paymentChannel.getPrimaryKey());
        }
    }

    /**
     * Creates a new payment channel with the primary key. Does not add the payment channel to the database.
     *
     * @param transId the primary key for the new payment channel
     * @return the new payment channel
     */
    @Override
    public PaymentChannel create(String transId) {
        PaymentChannel paymentChannel = new PaymentChannelImpl();

        paymentChannel.setNew(true);
        paymentChannel.setPrimaryKey(transId);

        return paymentChannel;
    }

    /**
     * Removes the payment channel with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param transId the primary key of the payment channel
     * @return the payment channel that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel remove(String transId)
        throws NoSuchPaymentChannelException, SystemException {
        return remove((Serializable) transId);
    }

    /**
     * Removes the payment channel with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment channel
     * @return the payment channel that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel remove(Serializable primaryKey)
        throws NoSuchPaymentChannelException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentChannel paymentChannel = (PaymentChannel) session.get(PaymentChannelImpl.class,
                    primaryKey);

            if (paymentChannel == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentChannelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentChannel);
        } catch (NoSuchPaymentChannelException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentChannel removeImpl(PaymentChannel paymentChannel)
        throws SystemException {
        paymentChannel = toUnwrappedModel(paymentChannel);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentChannel)) {
                paymentChannel = (PaymentChannel) session.get(PaymentChannelImpl.class,
                        paymentChannel.getPrimaryKeyObj());
            }

            if (paymentChannel != null) {
                session.delete(paymentChannel);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentChannel != null) {
            clearCache(paymentChannel);
        }

        return paymentChannel;
    }

    @Override
    public PaymentChannel updateImpl(
        com.stc.echannels.epayments.model.PaymentChannel paymentChannel)
        throws SystemException {
        paymentChannel = toUnwrappedModel(paymentChannel);

        boolean isNew = paymentChannel.isNew();

        PaymentChannelModelImpl paymentChannelModelImpl = (PaymentChannelModelImpl) paymentChannel;

        Session session = null;

        try {
            session = openSession();

            if (paymentChannel.isNew()) {
                session.save(paymentChannel);

                paymentChannel.setNew(false);
            } else {
                session.merge(paymentChannel);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PaymentChannelModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((paymentChannelModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentChannelModelImpl.getOriginalChannelId(),
                        paymentChannelModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID,
                    args);

                args = new Object[] {
                        paymentChannelModelImpl.getChannelId(),
                        paymentChannelModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELID,
                    args);
            }

            if ((paymentChannelModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentChannelModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { paymentChannelModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }

            if ((paymentChannelModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELTYPE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentChannelModelImpl.getOriginalChannelType(),
                        paymentChannelModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELTYPE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELTYPE,
                    args);

                args = new Object[] {
                        paymentChannelModelImpl.getChannelType(),
                        paymentChannelModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELTYPE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELTYPE,
                    args);
            }

            if ((paymentChannelModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELENANDSTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentChannelModelImpl.getOriginalDescriptiveNameEn(),
                        paymentChannelModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELENANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELENANDSTATUS,
                    args);

                args = new Object[] {
                        paymentChannelModelImpl.getDescriptiveNameEn(),
                        paymentChannelModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELENANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELENANDSTATUS,
                    args);
            }

            if ((paymentChannelModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELARANDSTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        paymentChannelModelImpl.getOriginalDescriptiveNameAr(),
                        paymentChannelModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELARANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELARANDSTATUS,
                    args);

                args = new Object[] {
                        paymentChannelModelImpl.getDescriptiveNameAr(),
                        paymentChannelModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CHANNELARANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHANNELARANDSTATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
            PaymentChannelImpl.class, paymentChannel.getPrimaryKey(),
            paymentChannel);

        return paymentChannel;
    }

    protected PaymentChannel toUnwrappedModel(PaymentChannel paymentChannel) {
        if (paymentChannel instanceof PaymentChannelImpl) {
            return paymentChannel;
        }

        PaymentChannelImpl paymentChannelImpl = new PaymentChannelImpl();

        paymentChannelImpl.setNew(paymentChannel.isNew());
        paymentChannelImpl.setPrimaryKey(paymentChannel.getPrimaryKey());

        paymentChannelImpl.setTransId(paymentChannel.getTransId());
        paymentChannelImpl.setLastUpdateTimestamp(paymentChannel.getLastUpdateTimestamp());
        paymentChannelImpl.setLastUpdateUserid(paymentChannel.getLastUpdateUserid());
        paymentChannelImpl.setLastUpdateUsername(paymentChannel.getLastUpdateUsername());
        paymentChannelImpl.setActive(paymentChannel.getActive());
        paymentChannelImpl.setStatus(paymentChannel.getStatus());
        paymentChannelImpl.setEffectiveTimestamp(paymentChannel.getEffectiveTimestamp());
        paymentChannelImpl.setClientIp(paymentChannel.getClientIp());
        paymentChannelImpl.setServerIp(paymentChannel.getServerIp());
        paymentChannelImpl.setUserAgent(paymentChannel.getUserAgent());
        paymentChannelImpl.setOperation(paymentChannel.getOperation());
        paymentChannelImpl.setChannelId(paymentChannel.getChannelId());
        paymentChannelImpl.setChannelType(paymentChannel.getChannelType());
        paymentChannelImpl.setDescriptiveNameEn(paymentChannel.getDescriptiveNameEn());
        paymentChannelImpl.setDescriptiveNameAr(paymentChannel.getDescriptiveNameAr());

        return paymentChannelImpl;
    }

    /**
     * Returns the payment channel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment channel
     * @return the payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentChannelException, SystemException {
        PaymentChannel paymentChannel = fetchByPrimaryKey(primaryKey);

        if (paymentChannel == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentChannelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentChannel;
    }

    /**
     * Returns the payment channel with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentChannelException} if it could not be found.
     *
     * @param transId the primary key of the payment channel
     * @return the payment channel
     * @throws com.stc.echannels.epayments.NoSuchPaymentChannelException if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel findByPrimaryKey(String transId)
        throws NoSuchPaymentChannelException, SystemException {
        return findByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns the payment channel with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment channel
     * @return the payment channel, or <code>null</code> if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentChannel paymentChannel = (PaymentChannel) EntityCacheUtil.getResult(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
                PaymentChannelImpl.class, primaryKey);

        if (paymentChannel == _nullPaymentChannel) {
            return null;
        }

        if (paymentChannel == null) {
            Session session = null;

            try {
                session = openSession();

                paymentChannel = (PaymentChannel) session.get(PaymentChannelImpl.class,
                        primaryKey);

                if (paymentChannel != null) {
                    cacheResult(paymentChannel);
                } else {
                    EntityCacheUtil.putResult(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentChannelImpl.class, primaryKey,
                        _nullPaymentChannel);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentChannelModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentChannelImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentChannel;
    }

    /**
     * Returns the payment channel with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param transId the primary key of the payment channel
     * @return the payment channel, or <code>null</code> if a payment channel with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentChannel fetchByPrimaryKey(String transId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns all the payment channels.
     *
     * @return the payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment channels.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @return the range of payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the payment channels.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentChannelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment channels
     * @param end the upper bound of the range of payment channels (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of payment channels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentChannel> findAll(int start, int end,
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

        List<PaymentChannel> list = (List<PaymentChannel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTCHANNEL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTCHANNEL;

                if (pagination) {
                    sql = sql.concat(PaymentChannelModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentChannel>(list);
                } else {
                    list = (List<PaymentChannel>) QueryUtil.list(q,
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
     * Removes all the payment channels from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentChannel paymentChannel : findAll()) {
            remove(paymentChannel);
        }
    }

    /**
     * Returns the number of payment channels.
     *
     * @return the number of payment channels
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

                Query q = session.createQuery(_SQL_COUNT_PAYMENTCHANNEL);

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
     * Initializes the payment channel persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentChannel")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentChannel>> listenersList = new ArrayList<ModelListener<PaymentChannel>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentChannel>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentChannelImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
