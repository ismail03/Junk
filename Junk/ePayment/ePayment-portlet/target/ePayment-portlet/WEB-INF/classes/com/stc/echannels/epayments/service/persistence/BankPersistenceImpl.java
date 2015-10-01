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

import com.stc.echannels.epayments.NoSuchBankException;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.impl.BankImpl;
import com.stc.echannels.epayments.model.impl.BankModelImpl;
import com.stc.echannels.epayments.service.persistence.BankPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the bank service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankPersistence
 * @see BankUtil
 * @generated
 */
public class BankPersistenceImpl extends BasePersistenceImpl<Bank>
    implements BankPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BankUtil} to access the bank persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BankImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, BankImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, BankImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, BankImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBankId",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID =
        new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, BankImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBankId",
            new String[] { String.class.getName(), String.class.getName() },
            BankModelImpl.BANKID_COLUMN_BITMASK |
            BankModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKID = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBankId",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_BANKID_BANKID_1 = "bank.bankId IS NULL AND ";
    private static final String _FINDER_COLUMN_BANKID_BANKID_2 = "bank.bankId = ? AND ";
    private static final String _FINDER_COLUMN_BANKID_BANKID_3 = "(bank.bankId IS NULL OR bank.bankId = '') AND ";
    private static final String _FINDER_COLUMN_BANKID_STATUS_1 = "bank.status IS NULL";
    private static final String _FINDER_COLUMN_BANKID_STATUS_2 = "bank.status = ?";
    private static final String _FINDER_COLUMN_BANKID_STATUS_3 = "(bank.status IS NULL OR bank.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, BankImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
        new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, BankImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
            new String[] { String.class.getName() },
            BankModelImpl.STATUS_COLUMN_BITMASK |
            BankModelImpl.BANKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "bank.status IS NULL";
    private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "bank.status = ?";
    private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(bank.status IS NULL OR bank.status = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STCCODE = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, BankImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStcCode",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STCCODE =
        new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, BankImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStcCode",
            new String[] { String.class.getName(), String.class.getName() },
            BankModelImpl.STCCODE_COLUMN_BITMASK |
            BankModelImpl.STATUS_COLUMN_BITMASK |
            BankModelImpl.BANKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STCCODE = new FinderPath(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStcCode",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_STCCODE_STCCODE_1 = "bank.stcCode IS NULL AND ";
    private static final String _FINDER_COLUMN_STCCODE_STCCODE_2 = "bank.stcCode = ? AND ";
    private static final String _FINDER_COLUMN_STCCODE_STCCODE_3 = "(bank.stcCode IS NULL OR bank.stcCode = '') AND ";
    private static final String _FINDER_COLUMN_STCCODE_STATUS_1 = "bank.status IS NULL";
    private static final String _FINDER_COLUMN_STCCODE_STATUS_2 = "bank.status = ?";
    private static final String _FINDER_COLUMN_STCCODE_STATUS_3 = "(bank.status IS NULL OR bank.status = '')";
    private static final String _SQL_SELECT_BANK = "SELECT bank FROM Bank bank";
    private static final String _SQL_SELECT_BANK_WHERE = "SELECT bank FROM Bank bank WHERE ";
    private static final String _SQL_COUNT_BANK = "SELECT COUNT(bank) FROM Bank bank";
    private static final String _SQL_COUNT_BANK_WHERE = "SELECT COUNT(bank) FROM Bank bank WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "bank.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bank exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Bank exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BankPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "transId", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp", "clientIp",
                "serverIp", "userAgent", "operation", "bankId", "stcCode",
                "nameEn", "nameAr", "comments"
            });
    private static Bank _nullBank = new BankImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Bank> toCacheModel() {
                return _nullBankCacheModel;
            }
        };

    private static CacheModel<Bank> _nullBankCacheModel = new CacheModel<Bank>() {
            @Override
            public Bank toEntityModel() {
                return _nullBank;
            }
        };

    public BankPersistenceImpl() {
        setModelClass(Bank.class);
    }

    /**
     * Returns all the banks where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @return the matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByBankId(String bankId, String status)
        throws SystemException {
        return findByBankId(bankId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the banks where bankId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param bankId the bank ID
     * @param status the status
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @return the range of matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByBankId(String bankId, String status, int start,
        int end) throws SystemException {
        return findByBankId(bankId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the banks where bankId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param bankId the bank ID
     * @param status the status
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByBankId(String bankId, String status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
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

        List<Bank> list = (List<Bank>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Bank bank : list) {
                if (!Validator.equals(bankId, bank.getBankId()) ||
                        !Validator.equals(status, bank.getStatus())) {
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

            query.append(_SQL_SELECT_BANK_WHERE);

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
                query.append(BankModelImpl.ORDER_BY_JPQL);
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
                    list = (List<Bank>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Bank>(list);
                } else {
                    list = (List<Bank>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first bank in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank findByBankId_First(String bankId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = fetchByBankId_First(bankId, status, orderByComparator);

        if (bank != null) {
            return bank;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bankId=");
        msg.append(bankId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankException(msg.toString());
    }

    /**
     * Returns the first bank in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank, or <code>null</code> if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank fetchByBankId_First(String bankId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Bank> list = findByBankId(bankId, status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank findByBankId_Last(String bankId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = fetchByBankId_Last(bankId, status, orderByComparator);

        if (bank != null) {
            return bank;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bankId=");
        msg.append(bankId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankException(msg.toString());
    }

    /**
     * Returns the last bank in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank, or <code>null</code> if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank fetchByBankId_Last(String bankId, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByBankId(bankId, status);

        if (count == 0) {
            return null;
        }

        List<Bank> list = findByBankId(bankId, status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the banks before and after the current bank in the ordered set where bankId = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current bank
     * @param bankId the bank ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank[] findByBankId_PrevAndNext(String transId, String bankId,
        String status, OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            Bank[] array = new BankImpl[3];

            array[0] = getByBankId_PrevAndNext(session, bank, bankId, status,
                    orderByComparator, true);

            array[1] = bank;

            array[2] = getByBankId_PrevAndNext(session, bank, bankId, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Bank getByBankId_PrevAndNext(Session session, Bank bank,
        String bankId, String status, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANK_WHERE);

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
            query.append(BankModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(bank);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Bank> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the banks where bankId = &#63; and status = &#63; from the database.
     *
     * @param bankId the bank ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBankId(String bankId, String status)
        throws SystemException {
        for (Bank bank : findByBankId(bankId, status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(bank);
        }
    }

    /**
     * Returns the number of banks where bankId = &#63; and status = &#63;.
     *
     * @param bankId the bank ID
     * @param status the status
     * @return the number of matching banks
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

            query.append(_SQL_COUNT_BANK_WHERE);

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
     * Returns all the banks where status = &#63;.
     *
     * @param status the status
     * @return the matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByStatus(String status) throws SystemException {
        return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the banks where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @return the range of matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByStatus(String status, int start, int end)
        throws SystemException {
        return findByStatus(status, start, end, null);
    }

    /**
     * Returns an ordered range of all the banks where status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param status the status
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByStatus(String status, int start, int end,
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

        List<Bank> list = (List<Bank>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Bank bank : list) {
                if (!Validator.equals(status, bank.getStatus())) {
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

            query.append(_SQL_SELECT_BANK_WHERE);

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
                query.append(BankModelImpl.ORDER_BY_JPQL);
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
                    list = (List<Bank>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Bank>(list);
                } else {
                    list = (List<Bank>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first bank in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank findByStatus_First(String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = fetchByStatus_First(status, orderByComparator);

        if (bank != null) {
            return bank;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankException(msg.toString());
    }

    /**
     * Returns the first bank in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank, or <code>null</code> if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank fetchByStatus_First(String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Bank> list = findByStatus(status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank findByStatus_Last(String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = fetchByStatus_Last(status, orderByComparator);

        if (bank != null) {
            return bank;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankException(msg.toString());
    }

    /**
     * Returns the last bank in the ordered set where status = &#63;.
     *
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank, or <code>null</code> if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank fetchByStatus_Last(String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStatus(status);

        if (count == 0) {
            return null;
        }

        List<Bank> list = findByStatus(status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the banks before and after the current bank in the ordered set where status = &#63;.
     *
     * @param transId the primary key of the current bank
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank[] findByStatus_PrevAndNext(String transId, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            Bank[] array = new BankImpl[3];

            array[0] = getByStatus_PrevAndNext(session, bank, status,
                    orderByComparator, true);

            array[1] = bank;

            array[2] = getByStatus_PrevAndNext(session, bank, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Bank getByStatus_PrevAndNext(Session session, Bank bank,
        String status, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANK_WHERE);

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
            query.append(BankModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(bank);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Bank> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the banks where status = &#63; from the database.
     *
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStatus(String status) throws SystemException {
        for (Bank bank : findByStatus(status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(bank);
        }
    }

    /**
     * Returns the number of banks where status = &#63;.
     *
     * @param status the status
     * @return the number of matching banks
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

            query.append(_SQL_COUNT_BANK_WHERE);

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
     * Returns all the banks where stcCode = &#63; and status = &#63;.
     *
     * @param stcCode the stc code
     * @param status the status
     * @return the matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByStcCode(String stcCode, String status)
        throws SystemException {
        return findByStcCode(stcCode, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the banks where stcCode = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param stcCode the stc code
     * @param status the status
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @return the range of matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByStcCode(String stcCode, String status, int start,
        int end) throws SystemException {
        return findByStcCode(stcCode, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the banks where stcCode = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param stcCode the stc code
     * @param status the status
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findByStcCode(String stcCode, String status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STCCODE;
            finderArgs = new Object[] { stcCode, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STCCODE;
            finderArgs = new Object[] {
                    stcCode, status,
                    
                    start, end, orderByComparator
                };
        }

        List<Bank> list = (List<Bank>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Bank bank : list) {
                if (!Validator.equals(stcCode, bank.getStcCode()) ||
                        !Validator.equals(status, bank.getStatus())) {
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

            query.append(_SQL_SELECT_BANK_WHERE);

            boolean bindStcCode = false;

            if (stcCode == null) {
                query.append(_FINDER_COLUMN_STCCODE_STCCODE_1);
            } else if (stcCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_STCCODE_STCCODE_3);
            } else {
                bindStcCode = true;

                query.append(_FINDER_COLUMN_STCCODE_STCCODE_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_STCCODE_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_STCCODE_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_STCCODE_STATUS_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BankModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStcCode) {
                    qPos.add(stcCode);
                }

                if (bindStatus) {
                    qPos.add(status);
                }

                if (!pagination) {
                    list = (List<Bank>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Bank>(list);
                } else {
                    list = (List<Bank>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first bank in the ordered set where stcCode = &#63; and status = &#63;.
     *
     * @param stcCode the stc code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank findByStcCode_First(String stcCode, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = fetchByStcCode_First(stcCode, status, orderByComparator);

        if (bank != null) {
            return bank;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("stcCode=");
        msg.append(stcCode);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankException(msg.toString());
    }

    /**
     * Returns the first bank in the ordered set where stcCode = &#63; and status = &#63;.
     *
     * @param stcCode the stc code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching bank, or <code>null</code> if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank fetchByStcCode_First(String stcCode, String status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Bank> list = findByStcCode(stcCode, status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last bank in the ordered set where stcCode = &#63; and status = &#63;.
     *
     * @param stcCode the stc code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank findByStcCode_Last(String stcCode, String status,
        OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = fetchByStcCode_Last(stcCode, status, orderByComparator);

        if (bank != null) {
            return bank;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("stcCode=");
        msg.append(stcCode);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBankException(msg.toString());
    }

    /**
     * Returns the last bank in the ordered set where stcCode = &#63; and status = &#63;.
     *
     * @param stcCode the stc code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching bank, or <code>null</code> if a matching bank could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank fetchByStcCode_Last(String stcCode, String status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStcCode(stcCode, status);

        if (count == 0) {
            return null;
        }

        List<Bank> list = findByStcCode(stcCode, status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the banks before and after the current bank in the ordered set where stcCode = &#63; and status = &#63;.
     *
     * @param transId the primary key of the current bank
     * @param stcCode the stc code
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank[] findByStcCode_PrevAndNext(String transId, String stcCode,
        String status, OrderByComparator orderByComparator)
        throws NoSuchBankException, SystemException {
        Bank bank = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            Bank[] array = new BankImpl[3];

            array[0] = getByStcCode_PrevAndNext(session, bank, stcCode, status,
                    orderByComparator, true);

            array[1] = bank;

            array[2] = getByStcCode_PrevAndNext(session, bank, stcCode, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Bank getByStcCode_PrevAndNext(Session session, Bank bank,
        String stcCode, String status, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BANK_WHERE);

        boolean bindStcCode = false;

        if (stcCode == null) {
            query.append(_FINDER_COLUMN_STCCODE_STCCODE_1);
        } else if (stcCode.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_STCCODE_STCCODE_3);
        } else {
            bindStcCode = true;

            query.append(_FINDER_COLUMN_STCCODE_STCCODE_2);
        }

        boolean bindStatus = false;

        if (status == null) {
            query.append(_FINDER_COLUMN_STCCODE_STATUS_1);
        } else if (status.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_STCCODE_STATUS_3);
        } else {
            bindStatus = true;

            query.append(_FINDER_COLUMN_STCCODE_STATUS_2);
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
            query.append(BankModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindStcCode) {
            qPos.add(stcCode);
        }

        if (bindStatus) {
            qPos.add(status);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(bank);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Bank> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the banks where stcCode = &#63; and status = &#63; from the database.
     *
     * @param stcCode the stc code
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStcCode(String stcCode, String status)
        throws SystemException {
        for (Bank bank : findByStcCode(stcCode, status, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(bank);
        }
    }

    /**
     * Returns the number of banks where stcCode = &#63; and status = &#63;.
     *
     * @param stcCode the stc code
     * @param status the status
     * @return the number of matching banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByStcCode(String stcCode, String status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_STCCODE;

        Object[] finderArgs = new Object[] { stcCode, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_BANK_WHERE);

            boolean bindStcCode = false;

            if (stcCode == null) {
                query.append(_FINDER_COLUMN_STCCODE_STCCODE_1);
            } else if (stcCode.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_STCCODE_STCCODE_3);
            } else {
                bindStcCode = true;

                query.append(_FINDER_COLUMN_STCCODE_STCCODE_2);
            }

            boolean bindStatus = false;

            if (status == null) {
                query.append(_FINDER_COLUMN_STCCODE_STATUS_1);
            } else if (status.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_STCCODE_STATUS_3);
            } else {
                bindStatus = true;

                query.append(_FINDER_COLUMN_STCCODE_STATUS_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindStcCode) {
                    qPos.add(stcCode);
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
     * Caches the bank in the entity cache if it is enabled.
     *
     * @param bank the bank
     */
    @Override
    public void cacheResult(Bank bank) {
        EntityCacheUtil.putResult(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankImpl.class, bank.getPrimaryKey(), bank);

        bank.resetOriginalValues();
    }

    /**
     * Caches the banks in the entity cache if it is enabled.
     *
     * @param banks the banks
     */
    @Override
    public void cacheResult(List<Bank> banks) {
        for (Bank bank : banks) {
            if (EntityCacheUtil.getResult(BankModelImpl.ENTITY_CACHE_ENABLED,
                        BankImpl.class, bank.getPrimaryKey()) == null) {
                cacheResult(bank);
            } else {
                bank.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all banks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BankImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BankImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the bank.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Bank bank) {
        EntityCacheUtil.removeResult(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankImpl.class, bank.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Bank> banks) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Bank bank : banks) {
            EntityCacheUtil.removeResult(BankModelImpl.ENTITY_CACHE_ENABLED,
                BankImpl.class, bank.getPrimaryKey());
        }
    }

    /**
     * Creates a new bank with the primary key. Does not add the bank to the database.
     *
     * @param transId the primary key for the new bank
     * @return the new bank
     */
    @Override
    public Bank create(String transId) {
        Bank bank = new BankImpl();

        bank.setNew(true);
        bank.setPrimaryKey(transId);

        return bank;
    }

    /**
     * Removes the bank with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param transId the primary key of the bank
     * @return the bank that was removed
     * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank remove(String transId)
        throws NoSuchBankException, SystemException {
        return remove((Serializable) transId);
    }

    /**
     * Removes the bank with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the bank
     * @return the bank that was removed
     * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank remove(Serializable primaryKey)
        throws NoSuchBankException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Bank bank = (Bank) session.get(BankImpl.class, primaryKey);

            if (bank == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBankException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(bank);
        } catch (NoSuchBankException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Bank removeImpl(Bank bank) throws SystemException {
        bank = toUnwrappedModel(bank);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(bank)) {
                bank = (Bank) session.get(BankImpl.class,
                        bank.getPrimaryKeyObj());
            }

            if (bank != null) {
                session.delete(bank);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (bank != null) {
            clearCache(bank);
        }

        return bank;
    }

    @Override
    public Bank updateImpl(com.stc.echannels.epayments.model.Bank bank)
        throws SystemException {
        bank = toUnwrappedModel(bank);

        boolean isNew = bank.isNew();

        BankModelImpl bankModelImpl = (BankModelImpl) bank;

        Session session = null;

        try {
            session = openSession();

            if (bank.isNew()) {
                session.save(bank);

                bank.setNew(false);
            } else {
                session.merge(bank);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BankModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((bankModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankModelImpl.getOriginalBankId(),
                        bankModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);

                args = new Object[] {
                        bankModelImpl.getBankId(), bankModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);
            }

            if ((bankModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { bankModelImpl.getOriginalStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);

                args = new Object[] { bankModelImpl.getStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
                    args);
            }

            if ((bankModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STCCODE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        bankModelImpl.getOriginalStcCode(),
                        bankModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STCCODE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STCCODE,
                    args);

                args = new Object[] {
                        bankModelImpl.getStcCode(), bankModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STCCODE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STCCODE,
                    args);
            }
        }

        EntityCacheUtil.putResult(BankModelImpl.ENTITY_CACHE_ENABLED,
            BankImpl.class, bank.getPrimaryKey(), bank);

        return bank;
    }

    protected Bank toUnwrappedModel(Bank bank) {
        if (bank instanceof BankImpl) {
            return bank;
        }

        BankImpl bankImpl = new BankImpl();

        bankImpl.setNew(bank.isNew());
        bankImpl.setPrimaryKey(bank.getPrimaryKey());

        bankImpl.setTransId(bank.getTransId());
        bankImpl.setLastUpdateTimestamp(bank.getLastUpdateTimestamp());
        bankImpl.setLastUpdateUserid(bank.getLastUpdateUserid());
        bankImpl.setLastUpdateUsername(bank.getLastUpdateUsername());
        bankImpl.setActive(bank.getActive());
        bankImpl.setEffectiveTimestamp(bank.getEffectiveTimestamp());
        bankImpl.setStatus(bank.getStatus());
        bankImpl.setClientIp(bank.getClientIp());
        bankImpl.setServerIp(bank.getServerIp());
        bankImpl.setUserAgent(bank.getUserAgent());
        bankImpl.setOperation(bank.getOperation());
        bankImpl.setBankId(bank.getBankId());
        bankImpl.setStcCode(bank.getStcCode());
        bankImpl.setNameEn(bank.getNameEn());
        bankImpl.setNameAr(bank.getNameAr());
        bankImpl.setComments(bank.getComments());

        return bankImpl;
    }

    /**
     * Returns the bank with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the bank
     * @return the bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBankException, SystemException {
        Bank bank = fetchByPrimaryKey(primaryKey);

        if (bank == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBankException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return bank;
    }

    /**
     * Returns the bank with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBankException} if it could not be found.
     *
     * @param transId the primary key of the bank
     * @return the bank
     * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank findByPrimaryKey(String transId)
        throws NoSuchBankException, SystemException {
        return findByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns the bank with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the bank
     * @return the bank, or <code>null</code> if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Bank bank = (Bank) EntityCacheUtil.getResult(BankModelImpl.ENTITY_CACHE_ENABLED,
                BankImpl.class, primaryKey);

        if (bank == _nullBank) {
            return null;
        }

        if (bank == null) {
            Session session = null;

            try {
                session = openSession();

                bank = (Bank) session.get(BankImpl.class, primaryKey);

                if (bank != null) {
                    cacheResult(bank);
                } else {
                    EntityCacheUtil.putResult(BankModelImpl.ENTITY_CACHE_ENABLED,
                        BankImpl.class, primaryKey, _nullBank);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BankModelImpl.ENTITY_CACHE_ENABLED,
                    BankImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return bank;
    }

    /**
     * Returns the bank with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param transId the primary key of the bank
     * @return the bank, or <code>null</code> if a bank with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Bank fetchByPrimaryKey(String transId) throws SystemException {
        return fetchByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns all the banks.
     *
     * @return the banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the banks.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @return the range of banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the banks.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of banks
     * @param end the upper bound of the range of banks (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of banks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Bank> findAll(int start, int end,
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

        List<Bank> list = (List<Bank>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BANK);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BANK;

                if (pagination) {
                    sql = sql.concat(BankModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Bank>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Bank>(list);
                } else {
                    list = (List<Bank>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the banks from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Bank bank : findAll()) {
            remove(bank);
        }
    }

    /**
     * Returns the number of banks.
     *
     * @return the number of banks
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

                Query q = session.createQuery(_SQL_COUNT_BANK);

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
     * Initializes the bank persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.Bank")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Bank>> listenersList = new ArrayList<ModelListener<Bank>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Bank>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BankImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
