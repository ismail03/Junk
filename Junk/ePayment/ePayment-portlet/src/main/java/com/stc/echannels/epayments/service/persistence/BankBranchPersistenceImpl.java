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

import com.stc.echannels.epayments.NoSuchBankBranchException;
import com.stc.echannels.epayments.model.BankBranch;
import com.stc.echannels.epayments.model.impl.BankBranchImpl;
import com.stc.echannels.epayments.model.impl.BankBranchModelImpl;
import com.stc.echannels.epayments.service.persistence.BankBranchPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the bank branch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankBranchPersistence
 * @see BankBranchUtil
 * @generated
 */
public class BankBranchPersistenceImpl extends BasePersistenceImpl<BankBranch>
    implements BankBranchPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BankBranchUtil} to access the bank branch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BankBranchImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { String.class.getName() },
            BankBranchModelImpl.STATUS_COLUMN_BITMASK |
            BankBranchModelImpl.BANKID_COLUMN_BITMASK |
            BankBranchModelImpl.CHANNELID_COLUMN_BITMASK |
            BankBranchModelImpl.STCBRANCHCODE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "bankBranch.status IS NULL";
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "bankBranch.status = ?";
    private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(bankBranch.status IS NULL OR bankBranch.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBankId",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID =
        new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBankId",
            new String[] { String.class.getName(), String.class.getName() },
            BankBranchModelImpl.BANKID_COLUMN_BITMASK |
            BankBranchModelImpl.STATUS_COLUMN_BITMASK |
            BankBranchModelImpl.CHANNELID_COLUMN_BITMASK |
            BankBranchModelImpl.STCBRANCHCODE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKID = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBankId",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_BANKID_BANKID_1 = "bankBranch.bankId IS NULL AND ";
    private static final String _FINDER_COLUMN_BANKID_BANKID_2 = "bankBranch.bankId = ? AND ";
    private static final String _FINDER_COLUMN_BANKID_BANKID_3 = "(bankBranch.bankId IS NULL OR bankBranch.bankId = '') AND ";
    private static final String _FINDER_COLUMN_BANKID_STATUS_1 = "bankBranch.status IS NULL";
    private static final String _FINDER_COLUMN_BANKID_STATUS_2 = "bankBranch.status = ?";
    private static final String _FINDER_COLUMN_BANKID_STATUS_3 = "(bankBranch.status IS NULL OR bankBranch.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKPAYMENTCHANNEL =
        new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBankPaymentChannel",
            new String[] {
                String.class.getName(), Long.class.getName(),
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKPAYMENTCHANNEL =
        new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByBankPaymentChannel",
            new String[] {
                String.class.getName(), Long.class.getName(),
                String.class.getName()
            },
            BankBranchModelImpl.BANKID_COLUMN_BITMASK |
            BankBranchModelImpl.CHANNELID_COLUMN_BITMASK |
            BankBranchModelImpl.STATUS_COLUMN_BITMASK |
            BankBranchModelImpl.STCBRANCHCODE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKPAYMENTCHANNEL = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByBankPaymentChannel",
            new String[] {
                String.class.getName(), Long.class.getName(),
                String.class.getName()
            });
    private static final String _FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_1 = "bankBranch.bankId IS NULL AND ";
    private static final String _FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_2 = "bankBranch.bankId = ? AND ";
    private static final String _FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_3 = "(bankBranch.bankId IS NULL OR bankBranch.bankId = '') AND ";
    private static final String _FINDER_COLUMN_BANKPAYMENTCHANNEL_CHANNELID_2 = "bankBranch.channelId = ? AND ";
    private static final String _FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_1 = "bankBranch.status IS NULL";
    private static final String _FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_2 = "bankBranch.status = ?";
    private static final String _FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_3 = "(bankBranch.status IS NULL OR bankBranch.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANCHCODE =
        new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBranchCode",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODE =
        new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBranchCode",
            new String[] { String.class.getName(), String.class.getName() },
            BankBranchModelImpl.STCBRANCHCODE_COLUMN_BITMASK |
            BankBranchModelImpl.ACTIVE_COLUMN_BITMASK |
            BankBranchModelImpl.BANKID_COLUMN_BITMASK |
            BankBranchModelImpl.CHANNELID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BRANCHCODE = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBranchCode",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_1 = "bankBranch.stcBranchCode IS NULL AND ";
    private static final String _FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_2 = "bankBranch.stcBranchCode = ? AND ";
    private static final String _FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_3 = "(bankBranch.stcBranchCode IS NULL OR bankBranch.stcBranchCode = '') AND ";
    private static final String _FINDER_COLUMN_BRANCHCODE_ACTIVE_1 = "bankBranch.active IS NULL";
    private static final String _FINDER_COLUMN_BRANCHCODE_ACTIVE_2 = "bankBranch.active = ?";
    private static final String _FINDER_COLUMN_BRANCHCODE_ACTIVE_3 = "(bankBranch.active IS NULL OR bankBranch.active = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANCHCODEANDSTATUS =
        new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByBranchCodeAndStatus",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODEANDSTATUS =
        new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, BankBranchImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByBranchCodeAndStatus",
            new String[] { String.class.getName(), String.class.getName() },
            BankBranchModelImpl.STCBRANCHCODE_COLUMN_BITMASK |
            BankBranchModelImpl.STATUS_COLUMN_BITMASK |
            BankBranchModelImpl.BANKID_COLUMN_BITMASK |
            BankBranchModelImpl.CHANNELID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BRANCHCODEANDSTATUS = new FinderPath(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByBranchCodeAndStatus",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_1 =
        "bankBranch.stcBranchCode IS NULL AND ";
    private static final String _FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_2 =
        "bankBranch.stcBranchCode = ? AND ";
    private static final String _FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_3 =
        "(bankBranch.stcBranchCode IS NULL OR bankBranch.stcBranchCode = '') AND ";
    private static final String _FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_1 = "bankBranch.status IS NULL";
    private static final String _FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_2 = "bankBranch.status = ?";
    private static final String _FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_3 = "(bankBranch.status IS NULL OR bankBranch.status = '')";
    private static final String _SQL_SELECT_BANKBRANCH = "SELECT bankBranch FROM BankBranch bankBranch";
    private static final String _SQL_SELECT_BANKBRANCH_WHERE = "SELECT bankBranch FROM BankBranch bankBranch WHERE ";
    private static final String _SQL_COUNT_BANKBRANCH = "SELECT COUNT(bankBranch) FROM BankBranch bankBranch";
    private static final String _SQL_COUNT_BANKBRANCH_WHERE = "SELECT COUNT(bankBranch) FROM BankBranch bankBranch WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "bankBranch.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BankBranch exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BankBranch exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BankBranchPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "transId", "stcBranchCode", "bankId", "channelId",
                "lastUpdateTimestamp", "lastUpdateUserid", "lastUpdateUsername",
                "effectiveTimestamp", "clientIp", "serverIp", "userAgent",
                "operation"
            });
    private static BankBranch _nullBankBranch = new BankBranchImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BankBranch> toCacheModel() {
                return _nullBankBranchCacheModel;
            }
        };

    private static CacheModel<BankBranch> _nullBankBranchCacheModel = new CacheModel<BankBranch>() {
            @Override
            public BankBranch toEntityModel() {
                return _nullBankBranch;
            }
        };

    public BankBranchPersistenceImpl() {
        setModelClass(BankBranch.class);
    }

    /**
     * Returns all the bank branchs where status = &#63;.
     *
     * @param status the status
     * @return the matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByStatus(String status)
        throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank branchs where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @return the range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByStatus(String status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the bank branchs where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByStatus(String status, int start, int end,
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

        List<BankBranch> list = (List<BankBranch>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BankBranch bankBranch : list) {
                if (!Validator.equals(status, bankBranch.getStatus())) {
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

            query.append(_SQL_SELECT_BANKBRANCH_WHERE);

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
                query.append(BankBranchModelImpl.ORDER_BY_JPQL);
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
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankBranch>(list);
                } else {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
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
     * Returns the first bank branch in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByStatus_First(String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByStatus_First(status, orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the first bank branch in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByStatus_First(String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<BankBranch> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank branch in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByStatus_Last(String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByStatus_Last(status, orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the last bank branch in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByStatus_Last(String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<BankBranch> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the bank branchs before and after the current bank branch in the ordered set where status = &#63;.
     *
     * @param transId the primary key of the current bank branch
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch[] findByStatus_PrevAndNext(String transId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            BankBranch[] array = new BankBranchImpl[3];

            array[0] = getByStatus_PrevAndNext(session, bankBranch, status,
                    orderByComparator, true);

            array[1] = bankBranch;

            array[2] = getByStatus_PrevAndNext(session, bankBranch, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BankBranch getByStatus_PrevAndNext(Session session,
        BankBranch bankBranch, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKBRANCH_WHERE);

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
            query.append(BankBranchModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(bankBranch);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BankBranch> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the bank branchs where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(String status) throws SystemException {
        for (BankBranch bankBranch : findByStatus(status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(bankBranch);
        }
    }

    /**
     * Returns the number of bank branchs where status = &#63;.
     *
     * @param status the status
     * @return the number of matching bank branchs
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

            query.append(_SQL_COUNT_BANKBRANCH_WHERE);

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
     * Returns all the bank branchs where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @return the matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBankId(String bankId, String status)
        throws SystemException {
        return findByBankId(bankId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank branchs where bankId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param bankId the bank ID
     * @param status the status
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @return the range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBankId(String bankId, String status,
        int start, int end) throws SystemException {
        return findByBankId(bankId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the bank branchs where bankId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param bankId the bank ID
     * @param status the status
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBankId(String bankId, String status,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] { bankId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] {
                    bankId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<BankBranch> list = (List<BankBranch>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BankBranch bankBranch : list) {
                if (!Validator.equals(bankId, bankBranch.getBankId()) ||
                        !Validator.equals(status, bankBranch.getStatus())) {
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

            query.append(_SQL_SELECT_BANKBRANCH_WHERE);

            boolean bindBankId = false;

            if (bankId == null) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_1);
            } else if (bankId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_3);
            } else {
                bindBankId = true;

                query.append(_FINDER_COLUMN_BANKID_BANKID_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_BANKID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_BANKID_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BankBranchModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBankId) {
                    qPos.add(bankId);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankBranch>(list);
                } else {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
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
     * Returns the first bank branch in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByBankId_First(String bankId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByBankId_First(bankId, status,
                orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bankId=");
        msg.append(bankId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the first bank branch in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByBankId_First(String bankId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<BankBranch> list = findByBankId(bankId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank branch in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByBankId_Last(String bankId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByBankId_Last(bankId, status,
                orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bankId=");
        msg.append(bankId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the last bank branch in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByBankId_Last(String bankId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByBankId(bankId, status);

        if (count == 0) {
            return null;
        }

        List<BankBranch> list = findByBankId(bankId, status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the bank branchs before and after the current bank branch in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current bank branch
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch[] findByBankId_PrevAndNext(String transId, String bankId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            BankBranch[] array = new BankBranchImpl[3];

            array[0] = getByBankId_PrevAndNext(session, bankBranch, bankId,
                    status, orderByComparator, true);

            array[1] = bankBranch;

            array[2] = getByBankId_PrevAndNext(session, bankBranch, bankId,
                    status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BankBranch getByBankId_PrevAndNext(Session session,
        BankBranch bankBranch, String bankId, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKBRANCH_WHERE);

        boolean bindBankId = false;

        if (bankId == null) {
            query.append(_FINDER_COLUMN_BANKID_BANKID_1);
        } else if (bankId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BANKID_BANKID_3);
        } else {
            bindBankId = true;

            query.append(_FINDER_COLUMN_BANKID_BANKID_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_BANKID_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BANKID_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_BANKID_STATUS_2);
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
            query.append(BankBranchModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindBankId) {
            qPos.add(bankId);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bankBranch);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BankBranch> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the bank branchs where bankId = &#63; and status = &#63; from the database.
     *
     * @param bankId the bank ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBankId(String bankId, String status)
        throws SystemException {
        for (BankBranch bankBranch : findByBankId(bankId, status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(bankBranch);
        }
    }

    /**
     * Returns the number of bank branchs where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @return the number of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBankId(String bankId, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANKID;

        Object[] finderArgs = new Object[] { bankId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BANKBRANCH_WHERE);

            boolean bindBankId = false;

            if (bankId == null) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_1);
            } else if (bankId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_BANKID_3);
            } else {
                bindBankId = true;

                query.append(_FINDER_COLUMN_BANKID_BANKID_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_BANKID_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKID_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_BANKID_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBankId) {
                    qPos.add(bankId);
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
     * Returns all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @return the matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBankPaymentChannel(String bankId,
        long channelId, String status) throws SystemException {
        return findByBankPaymentChannel(bankId, channelId, status,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @return the range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBankPaymentChannel(String bankId,
        long channelId, String status, int start, int end)
        throws SystemException {
        return findByBankPaymentChannel(bankId, channelId, status, start, end,
            null);
    }

    /**
     * Returns an ordered range of all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBankPaymentChannel(String bankId,
        long channelId, String status, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKPAYMENTCHANNEL;
            finderArgs = new Object[] { bankId, channelId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKPAYMENTCHANNEL;
            finderArgs = new Object[] {
                    bankId, channelId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<BankBranch> list = (List<BankBranch>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BankBranch bankBranch : list) {
                if (!Validator.equals(bankId, bankBranch.getBankId()) ||
                        (channelId != bankBranch.getChannelId()) ||
                        !Validator.equals(status, bankBranch.getStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(5 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(5);
            }

            query.append(_SQL_SELECT_BANKBRANCH_WHERE);

            boolean bindBankId = false;

            if (bankId == null) {
                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_1);
            } else if (bankId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_3);
            } else {
                bindBankId = true;

                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_2);
            }

            query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_CHANNELID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BankBranchModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBankId) {
                    qPos.add(bankId);
                }

                qPos.add(channelId);

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankBranch>(list);
                } else {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
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
     * Returns the first bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByBankPaymentChannel_First(String bankId,
        long channelId, String status, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByBankPaymentChannel_First(bankId,
                channelId, status, orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bankId=");
        msg.append(bankId);

        msg.append(", channelId=");
        msg.append(channelId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the first bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByBankPaymentChannel_First(String bankId,
        long channelId, String status, OrderByComparator orderByComparator)
        throws SystemException {
        List<BankBranch> list = findByBankPaymentChannel(bankId, channelId,
                status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByBankPaymentChannel_Last(String bankId,
        long channelId, String status, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByBankPaymentChannel_Last(bankId,
                channelId, status, orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bankId=");
        msg.append(bankId);

        msg.append(", channelId=");
        msg.append(channelId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the last bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByBankPaymentChannel_Last(String bankId,
        long channelId, String status, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByBankPaymentChannel(bankId, channelId, status);

        if (count == 0) {
            return null;
        }

        List<BankBranch> list = findByBankPaymentChannel(bankId, channelId,
                status, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the bank branchs before and after the current bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current bank branch
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch[] findByBankPaymentChannel_PrevAndNext(String transId,
        String bankId, long channelId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            BankBranch[] array = new BankBranchImpl[3];

            array[0] = getByBankPaymentChannel_PrevAndNext(session, bankBranch,
                    bankId, channelId, status, orderByComparator, true);

            array[1] = bankBranch;

            array[2] = getByBankPaymentChannel_PrevAndNext(session, bankBranch,
                    bankId, channelId, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BankBranch getByBankPaymentChannel_PrevAndNext(Session session,
        BankBranch bankBranch, String bankId, long channelId, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKBRANCH_WHERE);

        boolean bindBankId = false;

        if (bankId == null) {
            query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_1);
        } else if (bankId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_3);
        } else {
            bindBankId = true;

            query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_2);
        }

        query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_CHANNELID_2);

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_2);
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
            query.append(BankBranchModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindBankId) {
            qPos.add(bankId);
        }

        qPos.add(channelId);

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bankBranch);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BankBranch> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63; from the database.
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBankPaymentChannel(String bankId, long channelId,
        String status) throws SystemException {
        for (BankBranch bankBranch : findByBankPaymentChannel(bankId,
                channelId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(bankBranch);
        }
    }

    /**
     * Returns the number of bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param channelId the channel ID
     * @param status the status
     * @return the number of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBankPaymentChannel(String bankId, long channelId,
        String status) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANKPAYMENTCHANNEL;

        Object[] finderArgs = new Object[] { bankId, channelId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_BANKBRANCH_WHERE);

            boolean bindBankId = false;

            if (bankId == null) {
                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_1);
            } else if (bankId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_3);
            } else {
                bindBankId = true;

                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_BANKID_2);
            }

            query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_CHANNELID_2);

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_BANKPAYMENTCHANNEL_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBankId) {
                    qPos.add(bankId);
                }

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
     * Returns all the bank branchs where stcBranchCode = &#63; and active = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @return the matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBranchCode(String stcBranchCode, String active)
        throws SystemException {
        return findByBranchCode(stcBranchCode, active, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank branchs where stcBranchCode = &#63; and active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @return the range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBranchCode(String stcBranchCode,
        String active, int start, int end) throws SystemException {
        return findByBranchCode(stcBranchCode, active, start, end, null);
    }

    /**
     * Returns an ordered range of all the bank branchs where stcBranchCode = &#63; and active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBranchCode(String stcBranchCode,
        String active, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODE;
            finderArgs = new Object[] { stcBranchCode, active };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANCHCODE;
            finderArgs = new Object[] {
                    stcBranchCode, active,
                    
                    start, end, orderByComparator
                };
        }

        List<BankBranch> list = (List<BankBranch>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BankBranch bankBranch : list) {
                if (!Validator.equals(stcBranchCode,
                            bankBranch.getStcBranchCode()) ||
                        !Validator.equals(active, bankBranch.getActive())) {
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

            query.append(_SQL_SELECT_BANKBRANCH_WHERE);

            boolean bindStcBranchCode = false;

            if (stcBranchCode == null) {
                query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_1);
            } else if (stcBranchCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_3);
            } else {
                bindStcBranchCode = true;

                query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_2);
            }

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BankBranchModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStcBranchCode) {
                    qPos.add(stcBranchCode);
                }

                if (bindActive) {
                    qPos.add(active);
                }

                if (!pagination) {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankBranch>(list);
                } else {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
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
     * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByBranchCode_First(String stcBranchCode,
        String active, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByBranchCode_First(stcBranchCode, active,
                orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("stcBranchCode=");
        msg.append(stcBranchCode);

        msg.append(", active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByBranchCode_First(String stcBranchCode,
        String active, OrderByComparator orderByComparator)
        throws SystemException {
        List<BankBranch> list = findByBranchCode(stcBranchCode, active, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByBranchCode_Last(String stcBranchCode,
        String active, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByBranchCode_Last(stcBranchCode, active,
                orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("stcBranchCode=");
        msg.append(stcBranchCode);

        msg.append(", active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByBranchCode_Last(String stcBranchCode,
        String active, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByBranchCode(stcBranchCode, active);

        if (count == 0) {
            return null;
        }

        List<BankBranch> list = findByBranchCode(stcBranchCode, active,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the bank branchs before and after the current bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
     *
     * @param transId the primary key of the current bank branch
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch[] findByBranchCode_PrevAndNext(String transId,
        String stcBranchCode, String active, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            BankBranch[] array = new BankBranchImpl[3];

            array[0] = getByBranchCode_PrevAndNext(session, bankBranch,
                    stcBranchCode, active, orderByComparator, true);

            array[1] = bankBranch;

            array[2] = getByBranchCode_PrevAndNext(session, bankBranch,
                    stcBranchCode, active, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BankBranch getByBranchCode_PrevAndNext(Session session,
        BankBranch bankBranch, String stcBranchCode, String active,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKBRANCH_WHERE);

        boolean bindStcBranchCode = false;

        if (stcBranchCode == null) {
            query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_1);
        } else if (stcBranchCode.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_3);
        } else {
            bindStcBranchCode = true;

            query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_2);
        }

        boolean bindActive = false;

        if (active == null) {
            query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_1);
        } else if (active.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_3);
        } else {
            bindActive = true;

            query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_2);
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
            query.append(BankBranchModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindStcBranchCode) {
            qPos.add(stcBranchCode);
        }

        if (bindActive) {
            qPos.add(active);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bankBranch);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BankBranch> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the bank branchs where stcBranchCode = &#63; and active = &#63; from the database.
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBranchCode(String stcBranchCode, String active)
        throws SystemException {
        for (BankBranch bankBranch : findByBranchCode(stcBranchCode, active,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(bankBranch);
        }
    }

    /**
     * Returns the number of bank branchs where stcBranchCode = &#63; and active = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param active the active
     * @return the number of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBranchCode(String stcBranchCode, String active)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BRANCHCODE;

        Object[] finderArgs = new Object[] { stcBranchCode, active };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BANKBRANCH_WHERE);

            boolean bindStcBranchCode = false;

            if (stcBranchCode == null) {
                query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_1);
            } else if (stcBranchCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_3);
            } else {
                bindStcBranchCode = true;

                query.append(_FINDER_COLUMN_BRANCHCODE_STCBRANCHCODE_2);
            }

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_BRANCHCODE_ACTIVE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStcBranchCode) {
                    qPos.add(stcBranchCode);
                }

                if (bindActive) {
                    qPos.add(active);
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
     * Returns all the bank branchs where stcBranchCode = &#63; and status = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @return the matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBranchCodeAndStatus(String stcBranchCode,
        String status) throws SystemException {
        return findByBranchCodeAndStatus(stcBranchCode, status,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank branchs where stcBranchCode = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @return the range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBranchCodeAndStatus(String stcBranchCode,
        String status, int start, int end) throws SystemException {
        return findByBranchCodeAndStatus(stcBranchCode, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the bank branchs where stcBranchCode = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findByBranchCodeAndStatus(String stcBranchCode,
        String status, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODEANDSTATUS;
            finderArgs = new Object[] { stcBranchCode, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANCHCODEANDSTATUS;
            finderArgs = new Object[] {
                    stcBranchCode, status,
                    
                    start, end, orderByComparator
                };
        }

        List<BankBranch> list = (List<BankBranch>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BankBranch bankBranch : list) {
                if (!Validator.equals(stcBranchCode,
                            bankBranch.getStcBranchCode()) ||
                        !Validator.equals(status, bankBranch.getStatus())) {
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

            query.append(_SQL_SELECT_BANKBRANCH_WHERE);

            boolean bindStcBranchCode = false;

            if (stcBranchCode == null) {
                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_1);
            } else if (stcBranchCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_3);
            } else {
                bindStcBranchCode = true;

                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BankBranchModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStcBranchCode) {
                    qPos.add(stcBranchCode);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankBranch>(list);
                } else {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
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
     * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByBranchCodeAndStatus_First(String stcBranchCode,
        String status, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByBranchCodeAndStatus_First(stcBranchCode,
                status, orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("stcBranchCode=");
        msg.append(stcBranchCode);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByBranchCodeAndStatus_First(String stcBranchCode,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        List<BankBranch> list = findByBranchCodeAndStatus(stcBranchCode,
                status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByBranchCodeAndStatus_Last(String stcBranchCode,
        String status, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByBranchCodeAndStatus_Last(stcBranchCode,
                status, orderByComparator);

        if (bankBranch != null) {
            return bankBranch;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("stcBranchCode=");
        msg.append(stcBranchCode);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankBranchException(msg.toString());
    }

    /**
     * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByBranchCodeAndStatus_Last(String stcBranchCode,
        String status, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByBranchCodeAndStatus(stcBranchCode, status);

        if (count == 0) {
            return null;
        }

        List<BankBranch> list = findByBranchCodeAndStatus(stcBranchCode,
                status, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the bank branchs before and after the current bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current bank branch
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch[] findByBranchCodeAndStatus_PrevAndNext(String transId,
        String stcBranchCode, String status, OrderByComparator orderByComparator)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            BankBranch[] array = new BankBranchImpl[3];

            array[0] = getByBranchCodeAndStatus_PrevAndNext(session,
                    bankBranch, stcBranchCode, status, orderByComparator, true);

            array[1] = bankBranch;

            array[2] = getByBranchCodeAndStatus_PrevAndNext(session,
                    bankBranch, stcBranchCode, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BankBranch getByBranchCodeAndStatus_PrevAndNext(Session session,
        BankBranch bankBranch, String stcBranchCode, String status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANKBRANCH_WHERE);

        boolean bindStcBranchCode = false;

        if (stcBranchCode == null) {
            query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_1);
        } else if (stcBranchCode.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_3);
        } else {
            bindStcBranchCode = true;

            query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_2);
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
            query.append(BankBranchModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindStcBranchCode) {
            qPos.add(stcBranchCode);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bankBranch);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BankBranch> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the bank branchs where stcBranchCode = &#63; and status = &#63; from the database.
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBranchCodeAndStatus(String stcBranchCode, String status)
        throws SystemException {
        for (BankBranch bankBranch : findByBranchCodeAndStatus(stcBranchCode,
                status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(bankBranch);
        }
    }

    /**
     * Returns the number of bank branchs where stcBranchCode = &#63; and status = &#63;.
     *
     * @param stcBranchCode the stc branch code
     * @param status the status
     * @return the number of matching bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBranchCodeAndStatus(String stcBranchCode, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BRANCHCODEANDSTATUS;

        Object[] finderArgs = new Object[] { stcBranchCode, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BANKBRANCH_WHERE);

            boolean bindStcBranchCode = false;

            if (stcBranchCode == null) {
                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_1);
            } else if (stcBranchCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_3);
            } else {
                bindStcBranchCode = true;

                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STCBRANCHCODE_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_BRANCHCODEANDSTATUS_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStcBranchCode) {
                    qPos.add(stcBranchCode);
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
     * Caches the bank branch in the entity cache if it is enabled.
     *
     * @param bankBranch the bank branch
     */
    @Override
    public void cacheResult(BankBranch bankBranch) {
        EntityCacheUtil.putResult(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchImpl.class, bankBranch.getPrimaryKey(), bankBranch);

        bankBranch.resetOriginalValues();
    }

    /**
     * Caches the bank branchs in the entity cache if it is enabled.
     *
     * @param bankBranchs the bank branchs
     */
    @Override
    public void cacheResult(List<BankBranch> bankBranchs) {
        for (BankBranch bankBranch : bankBranchs) {
            if (EntityCacheUtil.getResult(
                        BankBranchModelImpl.ENTITY_CACHE_ENABLED,
                        BankBranchImpl.class, bankBranch.getPrimaryKey()) == null) {
                cacheResult(bankBranch);
            } else {
                bankBranch.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all bank branchs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BankBranchImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BankBranchImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the bank branch.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BankBranch bankBranch) {
        EntityCacheUtil.removeResult(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchImpl.class, bankBranch.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BankBranch> bankBranchs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BankBranch bankBranch : bankBranchs) {
            EntityCacheUtil.removeResult(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
                BankBranchImpl.class, bankBranch.getPrimaryKey());
        }
    }

    /**
     * Creates a new bank branch with the primary key. Does not add the bank branch to the database.
     *
     * @param transId the primary key for the new bank branch
     * @return the new bank branch
     */
    @Override
    public BankBranch create(String transId) {
        BankBranch bankBranch = new BankBranchImpl();

        bankBranch.setNew(true);
        bankBranch.setPrimaryKey(transId);

        return bankBranch;
    }

    /**
     * Removes the bank branch with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param transId the primary key of the bank branch
     * @return the bank branch that was removed
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch remove(String transId)
        throws NoSuchBankBranchException, SystemException {
        return remove((Serializable) transId);
    }

    /**
     * Removes the bank branch with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the bank branch
     * @return the bank branch that was removed
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch remove(Serializable primaryKey)
        throws NoSuchBankBranchException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BankBranch bankBranch = (BankBranch) session.get(BankBranchImpl.class,
                    primaryKey);

            if (bankBranch == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBankBranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(bankBranch);
        } catch (NoSuchBankBranchException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BankBranch removeImpl(BankBranch bankBranch)
        throws SystemException {
        bankBranch = toUnwrappedModel(bankBranch);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(bankBranch)) {
                bankBranch = (BankBranch) session.get(BankBranchImpl.class,
                        bankBranch.getPrimaryKeyObj());
            }

            if (bankBranch != null) {
                session.delete(bankBranch);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (bankBranch != null) {
            clearCache(bankBranch);
        }

        return bankBranch;
    }

    @Override
    public BankBranch updateImpl(
        com.stc.echannels.epayments.model.BankBranch bankBranch)
        throws SystemException {
        bankBranch = toUnwrappedModel(bankBranch);

        boolean isNew = bankBranch.isNew();

        BankBranchModelImpl bankBranchModelImpl = (BankBranchModelImpl) bankBranch;

        Session session = null;

        try {
            session = openSession();

            if (bankBranch.isNew()) {
                session.save(bankBranch);

                bankBranch.setNew(false);
            } else {
                session.merge(bankBranch);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BankBranchModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((bankBranchModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankBranchModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { bankBranchModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }

            if ((bankBranchModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankBranchModelImpl.getOriginalBankId(),
                        bankBranchModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);

                args = new Object[] {
                        bankBranchModelImpl.getBankId(),
                        bankBranchModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);
            }

            if ((bankBranchModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKPAYMENTCHANNEL.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankBranchModelImpl.getOriginalBankId(),
                        bankBranchModelImpl.getOriginalChannelId(),
                        bankBranchModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKPAYMENTCHANNEL,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKPAYMENTCHANNEL,
                    args);

                args = new Object[] {
                        bankBranchModelImpl.getBankId(),
                        bankBranchModelImpl.getChannelId(),
                        bankBranchModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKPAYMENTCHANNEL,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKPAYMENTCHANNEL,
                    args);
            }

            if ((bankBranchModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankBranchModelImpl.getOriginalStcBranchCode(),
                        bankBranchModelImpl.getOriginalActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANCHCODE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODE,
                    args);

                args = new Object[] {
                        bankBranchModelImpl.getStcBranchCode(),
                        bankBranchModelImpl.getActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANCHCODE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODE,
                    args);
            }

            if ((bankBranchModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODEANDSTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankBranchModelImpl.getOriginalStcBranchCode(),
                        bankBranchModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANCHCODEANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODEANDSTATUS,
                    args);

                args = new Object[] {
                        bankBranchModelImpl.getStcBranchCode(),
                        bankBranchModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANCHCODEANDSTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANCHCODEANDSTATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
            BankBranchImpl.class, bankBranch.getPrimaryKey(), bankBranch);

        return bankBranch;
    }

    protected BankBranch toUnwrappedModel(BankBranch bankBranch) {
        if (bankBranch instanceof BankBranchImpl) {
            return bankBranch;
        }

        BankBranchImpl bankBranchImpl = new BankBranchImpl();

        bankBranchImpl.setNew(bankBranch.isNew());
        bankBranchImpl.setPrimaryKey(bankBranch.getPrimaryKey());

        bankBranchImpl.setTransId(bankBranch.getTransId());
        bankBranchImpl.setStcBranchCode(bankBranch.getStcBranchCode());
        bankBranchImpl.setBankId(bankBranch.getBankId());
        bankBranchImpl.setChannelId(bankBranch.getChannelId());
        bankBranchImpl.setLastUpdateTimestamp(bankBranch.getLastUpdateTimestamp());
        bankBranchImpl.setLastUpdateUserid(bankBranch.getLastUpdateUserid());
        bankBranchImpl.setLastUpdateUsername(bankBranch.getLastUpdateUsername());
        bankBranchImpl.setActive(bankBranch.getActive());
        bankBranchImpl.setStatus(bankBranch.getStatus());
        bankBranchImpl.setEffectiveTimestamp(bankBranch.getEffectiveTimestamp());
        bankBranchImpl.setClientIp(bankBranch.getClientIp());
        bankBranchImpl.setServerIp(bankBranch.getServerIp());
        bankBranchImpl.setUserAgent(bankBranch.getUserAgent());
        bankBranchImpl.setOperation(bankBranch.getOperation());

        return bankBranchImpl;
    }

    /**
     * Returns the bank branch with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the bank branch
     * @return the bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBankBranchException, SystemException {
        BankBranch bankBranch = fetchByPrimaryKey(primaryKey);

        if (bankBranch == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBankBranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return bankBranch;
    }

    /**
     * Returns the bank branch with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBankBranchException} if it could not be found.
     *
     * @param transId the primary key of the bank branch
     * @return the bank branch
     * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch findByPrimaryKey(String transId)
        throws NoSuchBankBranchException, SystemException {
        return findByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns the bank branch with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the bank branch
     * @return the bank branch, or <code>null</code> if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BankBranch bankBranch = (BankBranch) EntityCacheUtil.getResult(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
                BankBranchImpl.class, primaryKey);

        if (bankBranch == _nullBankBranch) {
            return null;
        }

        if (bankBranch == null) {
            Session session = null;

            try {
                session = openSession();

                bankBranch = (BankBranch) session.get(BankBranchImpl.class,
                        primaryKey);

                if (bankBranch != null) {
                    cacheResult(bankBranch);
                } else {
                    EntityCacheUtil.putResult(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
                        BankBranchImpl.class, primaryKey, _nullBankBranch);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BankBranchModelImpl.ENTITY_CACHE_ENABLED,
                    BankBranchImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return bankBranch;
    }

    /**
     * Returns the bank branch with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param transId the primary key of the bank branch
     * @return the bank branch, or <code>null</code> if a bank branch with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BankBranch fetchByPrimaryKey(String transId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns all the bank branchs.
     *
     * @return the bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the bank branchs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @return the range of bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the bank branchs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of bank branchs
     * @param end the upper bound of the range of bank branchs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of bank branchs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BankBranch> findAll(int start, int end,
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

        List<BankBranch> list = (List<BankBranch>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BANKBRANCH);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BANKBRANCH;

                if (pagination) {
                    sql = sql.concat(BankBranchModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BankBranch>(list);
                } else {
                    list = (List<BankBranch>) QueryUtil.list(q, getDialect(),
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
     * Removes all the bank branchs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BankBranch bankBranch : findAll()) {
            remove(bankBranch);
        }
    }

    /**
     * Returns the number of bank branchs.
     *
     * @return the number of bank branchs
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

                Query q = session.createQuery(_SQL_COUNT_BANKBRANCH);

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
     * Initializes the bank branch persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.BankBranch")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BankBranch>> listenersList = new ArrayList<ModelListener<BankBranch>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BankBranch>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BankBranchImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
