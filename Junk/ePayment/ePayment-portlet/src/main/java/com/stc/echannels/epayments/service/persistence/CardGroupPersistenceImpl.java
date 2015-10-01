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

import com.stc.echannels.epayments.NoSuchCardGroupException;
import com.stc.echannels.epayments.model.CardGroup;
import com.stc.echannels.epayments.model.impl.CardGroupImpl;
import com.stc.echannels.epayments.model.impl.CardGroupModelImpl;
import com.stc.echannels.epayments.service.persistence.CardGroupPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the card group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see CardGroupPersistence
 * @see CardGroupUtil
 * @generated
 */
public class CardGroupPersistenceImpl extends BasePersistenceImpl<CardGroup>
    implements CardGroupPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CardGroupUtil} to access the card group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CardGroupImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, CardGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, CardGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CARDGROUPID =
        new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, CardGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCardGroupId",
            new String[] {
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDGROUPID =
        new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, CardGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCardGroupId",
            new String[] { String.class.getName(), String.class.getName() },
            CardGroupModelImpl.CARDGROUPID_COLUMN_BITMASK |
            CardGroupModelImpl.ACTIVE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CARDGROUPID = new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCardGroupId",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_CARDGROUPID_CARDGROUPID_1 = "cardGroup.cardGroupId IS NULL AND ";
    private static final String _FINDER_COLUMN_CARDGROUPID_CARDGROUPID_2 = "cardGroup.cardGroupId = ? AND ";
    private static final String _FINDER_COLUMN_CARDGROUPID_CARDGROUPID_3 = "(cardGroup.cardGroupId IS NULL OR cardGroup.cardGroupId = '') AND ";
    private static final String _FINDER_COLUMN_CARDGROUPID_ACTIVE_1 = "cardGroup.active IS NULL";
    private static final String _FINDER_COLUMN_CARDGROUPID_ACTIVE_2 = "cardGroup.active = ?";
    private static final String _FINDER_COLUMN_CARDGROUPID_ACTIVE_3 = "(cardGroup.active IS NULL OR cardGroup.active = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE = new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, CardGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActive",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE =
        new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, CardGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActive",
            new String[] { String.class.getName() },
            CardGroupModelImpl.ACTIVE_COLUMN_BITMASK |
            CardGroupModelImpl.CARDGROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVE = new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActive",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_1 = "cardGroup.active IS NULL";
    private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_2 = "cardGroup.active = ?";
    private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_3 = "(cardGroup.active IS NULL OR cardGroup.active = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CARDVALUE_INPAYMENTSYSTEM =
        new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, CardGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByCardValue_InPaymentSystem",
            new String[] {
                Long.class.getName(), String.class.getName(),
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDVALUE_INPAYMENTSYSTEM =
        new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, CardGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByCardValue_InPaymentSystem",
            new String[] {
                Long.class.getName(), String.class.getName(),
                String.class.getName()
            },
            CardGroupModelImpl.CARDVALUE_COLUMN_BITMASK |
            CardGroupModelImpl.INPAYMENTSYSTEM_COLUMN_BITMASK |
            CardGroupModelImpl.ACTIVE_COLUMN_BITMASK |
            CardGroupModelImpl.CARDGROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CARDVALUE_INPAYMENTSYSTEM =
        new FinderPath(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCardValue_InPaymentSystem",
            new String[] {
                Long.class.getName(), String.class.getName(),
                String.class.getName()
            });
    private static final String _FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_CARDVALUE_2 =
        "cardGroup.cardValue = ? AND ";
    private static final String _FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_1 =
        "cardGroup.inPaymentSystem IS NULL AND ";
    private static final String _FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_2 =
        "cardGroup.inPaymentSystem = ? AND ";
    private static final String _FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_3 =
        "(cardGroup.inPaymentSystem IS NULL OR cardGroup.inPaymentSystem = '') AND ";
    private static final String _FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_1 =
        "cardGroup.active IS NULL";
    private static final String _FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_2 =
        "cardGroup.active = ?";
    private static final String _FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_3 =
        "(cardGroup.active IS NULL OR cardGroup.active = '')";
    private static final String _SQL_SELECT_CARDGROUP = "SELECT cardGroup FROM CardGroup cardGroup";
    private static final String _SQL_SELECT_CARDGROUP_WHERE = "SELECT cardGroup FROM CardGroup cardGroup WHERE ";
    private static final String _SQL_COUNT_CARDGROUP = "SELECT COUNT(cardGroup) FROM CardGroup cardGroup";
    private static final String _SQL_COUNT_CARDGROUP_WHERE = "SELECT COUNT(cardGroup) FROM CardGroup cardGroup WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "cardGroup.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CardGroup exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CardGroup exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CardGroupPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "transId", "lastUpdateTimestamp", "lastUpdateUserid",
                "lastUpdateUsername", "effectiveTimestamp", "clientIp",
                "serverIp", "userAgent", "operation", "cardGroupId", "cardValue",
                "promotionValue", "inPaymentSystem", "serviceId"
            });
    private static CardGroup _nullCardGroup = new CardGroupImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<CardGroup> toCacheModel() {
                return _nullCardGroupCacheModel;
            }
        };

    private static CacheModel<CardGroup> _nullCardGroupCacheModel = new CacheModel<CardGroup>() {
            @Override
            public CardGroup toEntityModel() {
                return _nullCardGroup;
            }
        };

    public CardGroupPersistenceImpl() {
        setModelClass(CardGroup.class);
    }

    /**
     * Returns all the card groups where cardGroupId = &#63; and active = &#63;.
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @return the matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByCardGroupId(String cardGroupId, String active)
        throws SystemException {
        return findByCardGroupId(cardGroupId, active, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the card groups where cardGroupId = &#63; and active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @param start the lower bound of the range of card groups
     * @param end the upper bound of the range of card groups (not inclusive)
     * @return the range of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByCardGroupId(String cardGroupId, String active,
        int start, int end) throws SystemException {
        return findByCardGroupId(cardGroupId, active, start, end, null);
    }

    /**
     * Returns an ordered range of all the card groups where cardGroupId = &#63; and active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @param start the lower bound of the range of card groups
     * @param end the upper bound of the range of card groups (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByCardGroupId(String cardGroupId, String active,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDGROUPID;
            finderArgs = new Object[] { cardGroupId, active };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CARDGROUPID;
            finderArgs = new Object[] {
                    cardGroupId, active,
                    
                    start, end, orderByComparator
                };
        }

        List<CardGroup> list = (List<CardGroup>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (CardGroup cardGroup : list) {
                if (!Validator.equals(cardGroupId, cardGroup.getCardGroupId()) ||
                        !Validator.equals(active, cardGroup.getActive())) {
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

            query.append(_SQL_SELECT_CARDGROUP_WHERE);

            boolean bindCardGroupId = false;

            if (cardGroupId == null) {
                query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_1);
            } else if (cardGroupId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_3);
            } else {
                bindCardGroupId = true;

                query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_2);
            }

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CardGroupModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCardGroupId) {
                    qPos.add(cardGroupId);
                }

                if (bindActive) {
                    qPos.add(active);
                }

                if (!pagination) {
                    list = (List<CardGroup>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CardGroup>(list);
                } else {
                    list = (List<CardGroup>) QueryUtil.list(q, getDialect(),
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
     * Returns the first card group in the ordered set where cardGroupId = &#63; and active = &#63;.
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup findByCardGroupId_First(String cardGroupId, String active,
        OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = fetchByCardGroupId_First(cardGroupId, active,
                orderByComparator);

        if (cardGroup != null) {
            return cardGroup;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("cardGroupId=");
        msg.append(cardGroupId);

        msg.append(", active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCardGroupException(msg.toString());
    }

    /**
     * Returns the first card group in the ordered set where cardGroupId = &#63; and active = &#63;.
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching card group, or <code>null</code> if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup fetchByCardGroupId_First(String cardGroupId,
        String active, OrderByComparator orderByComparator)
        throws SystemException {
        List<CardGroup> list = findByCardGroupId(cardGroupId, active, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last card group in the ordered set where cardGroupId = &#63; and active = &#63;.
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup findByCardGroupId_Last(String cardGroupId, String active,
        OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = fetchByCardGroupId_Last(cardGroupId, active,
                orderByComparator);

        if (cardGroup != null) {
            return cardGroup;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("cardGroupId=");
        msg.append(cardGroupId);

        msg.append(", active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCardGroupException(msg.toString());
    }

    /**
     * Returns the last card group in the ordered set where cardGroupId = &#63; and active = &#63;.
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching card group, or <code>null</code> if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup fetchByCardGroupId_Last(String cardGroupId, String active,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCardGroupId(cardGroupId, active);

        if (count == 0) {
            return null;
        }

        List<CardGroup> list = findByCardGroupId(cardGroupId, active,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the card groups before and after the current card group in the ordered set where cardGroupId = &#63; and active = &#63;.
     *
     * @param transId the primary key of the current card group
     * @param cardGroupId the card group ID
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup[] findByCardGroupId_PrevAndNext(String transId,
        String cardGroupId, String active, OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            CardGroup[] array = new CardGroupImpl[3];

            array[0] = getByCardGroupId_PrevAndNext(session, cardGroup,
                    cardGroupId, active, orderByComparator, true);

            array[1] = cardGroup;

            array[2] = getByCardGroupId_PrevAndNext(session, cardGroup,
                    cardGroupId, active, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected CardGroup getByCardGroupId_PrevAndNext(Session session,
        CardGroup cardGroup, String cardGroupId, String active,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CARDGROUP_WHERE);

        boolean bindCardGroupId = false;

        if (cardGroupId == null) {
            query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_1);
        } else if (cardGroupId.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_3);
        } else {
            bindCardGroupId = true;

            query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_2);
        }

        boolean bindActive = false;

        if (active == null) {
            query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_1);
        } else if (active.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_3);
        } else {
            bindActive = true;

            query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_2);
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
            query.append(CardGroupModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindCardGroupId) {
            qPos.add(cardGroupId);
        }

        if (bindActive) {
            qPos.add(active);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(cardGroup);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<CardGroup> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the card groups where cardGroupId = &#63; and active = &#63; from the database.
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCardGroupId(String cardGroupId, String active)
        throws SystemException {
        for (CardGroup cardGroup : findByCardGroupId(cardGroupId, active,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(cardGroup);
        }
    }

    /**
     * Returns the number of card groups where cardGroupId = &#63; and active = &#63;.
     *
     * @param cardGroupId the card group ID
     * @param active the active
     * @return the number of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCardGroupId(String cardGroupId, String active)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CARDGROUPID;

        Object[] finderArgs = new Object[] { cardGroupId, active };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_CARDGROUP_WHERE);

            boolean bindCardGroupId = false;

            if (cardGroupId == null) {
                query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_1);
            } else if (cardGroupId.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_3);
            } else {
                bindCardGroupId = true;

                query.append(_FINDER_COLUMN_CARDGROUPID_CARDGROUPID_2);
            }

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_CARDGROUPID_ACTIVE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindCardGroupId) {
                    qPos.add(cardGroupId);
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
     * Returns all the card groups where active = &#63;.
     *
     * @param active the active
     * @return the matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByActive(String active)
        throws SystemException {
        return findByActive(active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the card groups where active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param active the active
     * @param start the lower bound of the range of card groups
     * @param end the upper bound of the range of card groups (not inclusive)
     * @return the range of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByActive(String active, int start, int end)
        throws SystemException {
        return findByActive(active, start, end, null);
    }

    /**
     * Returns an ordered range of all the card groups where active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param active the active
     * @param start the lower bound of the range of card groups
     * @param end the upper bound of the range of card groups (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByActive(String active, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE;
            finderArgs = new Object[] { active };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE;
            finderArgs = new Object[] { active, start, end, orderByComparator };
        }

        List<CardGroup> list = (List<CardGroup>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (CardGroup cardGroup : list) {
                if (!Validator.equals(active, cardGroup.getActive())) {
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

            query.append(_SQL_SELECT_CARDGROUP_WHERE);

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CardGroupModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindActive) {
                    qPos.add(active);
                }

                if (!pagination) {
                    list = (List<CardGroup>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CardGroup>(list);
                } else {
                    list = (List<CardGroup>) QueryUtil.list(q, getDialect(),
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
     * Returns the first card group in the ordered set where active = &#63;.
     *
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup findByActive_First(String active,
        OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = fetchByActive_First(active, orderByComparator);

        if (cardGroup != null) {
            return cardGroup;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCardGroupException(msg.toString());
    }

    /**
     * Returns the first card group in the ordered set where active = &#63;.
     *
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching card group, or <code>null</code> if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup fetchByActive_First(String active,
        OrderByComparator orderByComparator) throws SystemException {
        List<CardGroup> list = findByActive(active, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last card group in the ordered set where active = &#63;.
     *
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup findByActive_Last(String active,
        OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = fetchByActive_Last(active, orderByComparator);

        if (cardGroup != null) {
            return cardGroup;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCardGroupException(msg.toString());
    }

    /**
     * Returns the last card group in the ordered set where active = &#63;.
     *
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching card group, or <code>null</code> if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup fetchByActive_Last(String active,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByActive(active);

        if (count == 0) {
            return null;
        }

        List<CardGroup> list = findByActive(active, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the card groups before and after the current card group in the ordered set where active = &#63;.
     *
     * @param transId the primary key of the current card group
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup[] findByActive_PrevAndNext(String transId, String active,
        OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            CardGroup[] array = new CardGroupImpl[3];

            array[0] = getByActive_PrevAndNext(session, cardGroup, active,
                    orderByComparator, true);

            array[1] = cardGroup;

            array[2] = getByActive_PrevAndNext(session, cardGroup, active,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected CardGroup getByActive_PrevAndNext(Session session,
        CardGroup cardGroup, String active,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CARDGROUP_WHERE);

        boolean bindActive = false;

        if (active == null) {
            query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_1);
        } else if (active.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_3);
        } else {
            bindActive = true;

            query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);
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
            query.append(CardGroupModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindActive) {
            qPos.add(active);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(cardGroup);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<CardGroup> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the card groups where active = &#63; from the database.
     *
     * @param active the active
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByActive(String active) throws SystemException {
        for (CardGroup cardGroup : findByActive(active, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(cardGroup);
        }
    }

    /**
     * Returns the number of card groups where active = &#63;.
     *
     * @param active the active
     * @return the number of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByActive(String active) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVE;

        Object[] finderArgs = new Object[] { active };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CARDGROUP_WHERE);

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

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
     * Returns all the card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @return the matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByCardValue_InPaymentSystem(long cardValue,
        String inPaymentSystem, String active) throws SystemException {
        return findByCardValue_InPaymentSystem(cardValue, inPaymentSystem,
            active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @param start the lower bound of the range of card groups
     * @param end the upper bound of the range of card groups (not inclusive)
     * @return the range of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByCardValue_InPaymentSystem(long cardValue,
        String inPaymentSystem, String active, int start, int end)
        throws SystemException {
        return findByCardValue_InPaymentSystem(cardValue, inPaymentSystem,
            active, start, end, null);
    }

    /**
     * Returns an ordered range of all the card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @param start the lower bound of the range of card groups
     * @param end the upper bound of the range of card groups (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findByCardValue_InPaymentSystem(long cardValue,
        String inPaymentSystem, String active, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDVALUE_INPAYMENTSYSTEM;
            finderArgs = new Object[] { cardValue, inPaymentSystem, active };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CARDVALUE_INPAYMENTSYSTEM;
            finderArgs = new Object[] {
                    cardValue, inPaymentSystem, active,
                    
                    start, end, orderByComparator
                };
        }

        List<CardGroup> list = (List<CardGroup>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (CardGroup cardGroup : list) {
                if ((cardValue != cardGroup.getCardValue()) ||
                        !Validator.equals(inPaymentSystem,
                            cardGroup.getInPaymentSystem()) ||
                        !Validator.equals(active, cardGroup.getActive())) {
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

            query.append(_SQL_SELECT_CARDGROUP_WHERE);

            query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_CARDVALUE_2);

            boolean bindInPaymentSystem = false;

            if (inPaymentSystem == null) {
                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_1);
            } else if (inPaymentSystem.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_3);
            } else {
                bindInPaymentSystem = true;

                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_2);
            }

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CardGroupModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(cardValue);

                if (bindInPaymentSystem) {
                    qPos.add(inPaymentSystem);
                }

                if (bindActive) {
                    qPos.add(active);
                }

                if (!pagination) {
                    list = (List<CardGroup>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CardGroup>(list);
                } else {
                    list = (List<CardGroup>) QueryUtil.list(q, getDialect(),
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
     * Returns the first card group in the ordered set where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup findByCardValue_InPaymentSystem_First(long cardValue,
        String inPaymentSystem, String active,
        OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = fetchByCardValue_InPaymentSystem_First(cardValue,
                inPaymentSystem, active, orderByComparator);

        if (cardGroup != null) {
            return cardGroup;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("cardValue=");
        msg.append(cardValue);

        msg.append(", inPaymentSystem=");
        msg.append(inPaymentSystem);

        msg.append(", active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCardGroupException(msg.toString());
    }

    /**
     * Returns the first card group in the ordered set where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching card group, or <code>null</code> if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup fetchByCardValue_InPaymentSystem_First(long cardValue,
        String inPaymentSystem, String active,
        OrderByComparator orderByComparator) throws SystemException {
        List<CardGroup> list = findByCardValue_InPaymentSystem(cardValue,
                inPaymentSystem, active, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last card group in the ordered set where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup findByCardValue_InPaymentSystem_Last(long cardValue,
        String inPaymentSystem, String active,
        OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = fetchByCardValue_InPaymentSystem_Last(cardValue,
                inPaymentSystem, active, orderByComparator);

        if (cardGroup != null) {
            return cardGroup;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("cardValue=");
        msg.append(cardValue);

        msg.append(", inPaymentSystem=");
        msg.append(inPaymentSystem);

        msg.append(", active=");
        msg.append(active);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCardGroupException(msg.toString());
    }

    /**
     * Returns the last card group in the ordered set where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching card group, or <code>null</code> if a matching card group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup fetchByCardValue_InPaymentSystem_Last(long cardValue,
        String inPaymentSystem, String active,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCardValue_InPaymentSystem(cardValue,
                inPaymentSystem, active);

        if (count == 0) {
            return null;
        }

        List<CardGroup> list = findByCardValue_InPaymentSystem(cardValue,
                inPaymentSystem, active, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the card groups before and after the current card group in the ordered set where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * @param transId the primary key of the current card group
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup[] findByCardValue_InPaymentSystem_PrevAndNext(
        String transId, long cardValue, String inPaymentSystem, String active,
        OrderByComparator orderByComparator)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = findByPrimaryKey(transId);

        Session session = null;

        try {
            session = openSession();

            CardGroup[] array = new CardGroupImpl[3];

            array[0] = getByCardValue_InPaymentSystem_PrevAndNext(session,
                    cardGroup, cardValue, inPaymentSystem, active,
                    orderByComparator, true);

            array[1] = cardGroup;

            array[2] = getByCardValue_InPaymentSystem_PrevAndNext(session,
                    cardGroup, cardValue, inPaymentSystem, active,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected CardGroup getByCardValue_InPaymentSystem_PrevAndNext(
        Session session, CardGroup cardGroup, long cardValue,
        String inPaymentSystem, String active,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CARDGROUP_WHERE);

        query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_CARDVALUE_2);

        boolean bindInPaymentSystem = false;

        if (inPaymentSystem == null) {
            query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_1);
        } else if (inPaymentSystem.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_3);
        } else {
            bindInPaymentSystem = true;

            query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_2);
        }

        boolean bindActive = false;

        if (active == null) {
            query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_1);
        } else if (active.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_3);
        } else {
            bindActive = true;

            query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_2);
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
            query.append(CardGroupModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(cardValue);

        if (bindInPaymentSystem) {
            qPos.add(inPaymentSystem);
        }

        if (bindActive) {
            qPos.add(active);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(cardGroup);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<CardGroup> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63; from the database.
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCardValue_InPaymentSystem(long cardValue,
        String inPaymentSystem, String active) throws SystemException {
        for (CardGroup cardGroup : findByCardValue_InPaymentSystem(cardValue,
                inPaymentSystem, active, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(cardGroup);
        }
    }

    /**
     * Returns the number of card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
     *
     * @param cardValue the card value
     * @param inPaymentSystem the in payment system
     * @param active the active
     * @return the number of matching card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCardValue_InPaymentSystem(long cardValue,
        String inPaymentSystem, String active) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CARDVALUE_INPAYMENTSYSTEM;

        Object[] finderArgs = new Object[] { cardValue, inPaymentSystem, active };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_CARDGROUP_WHERE);

            query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_CARDVALUE_2);

            boolean bindInPaymentSystem = false;

            if (inPaymentSystem == null) {
                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_1);
            } else if (inPaymentSystem.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_3);
            } else {
                bindInPaymentSystem = true;

                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_INPAYMENTSYSTEM_2);
            }

            boolean bindActive = false;

            if (active == null) {
                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_1);
            } else if (active.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_3);
            } else {
                bindActive = true;

                query.append(_FINDER_COLUMN_CARDVALUE_INPAYMENTSYSTEM_ACTIVE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(cardValue);

                if (bindInPaymentSystem) {
                    qPos.add(inPaymentSystem);
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
     * Caches the card group in the entity cache if it is enabled.
     *
     * @param cardGroup the card group
     */
    @Override
    public void cacheResult(CardGroup cardGroup) {
        EntityCacheUtil.putResult(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupImpl.class, cardGroup.getPrimaryKey(), cardGroup);

        cardGroup.resetOriginalValues();
    }

    /**
     * Caches the card groups in the entity cache if it is enabled.
     *
     * @param cardGroups the card groups
     */
    @Override
    public void cacheResult(List<CardGroup> cardGroups) {
        for (CardGroup cardGroup : cardGroups) {
            if (EntityCacheUtil.getResult(
                        CardGroupModelImpl.ENTITY_CACHE_ENABLED,
                        CardGroupImpl.class, cardGroup.getPrimaryKey()) == null) {
                cacheResult(cardGroup);
            } else {
                cardGroup.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all card groups.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CardGroupImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CardGroupImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the card group.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(CardGroup cardGroup) {
        EntityCacheUtil.removeResult(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupImpl.class, cardGroup.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<CardGroup> cardGroups) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (CardGroup cardGroup : cardGroups) {
            EntityCacheUtil.removeResult(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
                CardGroupImpl.class, cardGroup.getPrimaryKey());
        }
    }

    /**
     * Creates a new card group with the primary key. Does not add the card group to the database.
     *
     * @param transId the primary key for the new card group
     * @return the new card group
     */
    @Override
    public CardGroup create(String transId) {
        CardGroup cardGroup = new CardGroupImpl();

        cardGroup.setNew(true);
        cardGroup.setPrimaryKey(transId);

        return cardGroup;
    }

    /**
     * Removes the card group with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param transId the primary key of the card group
     * @return the card group that was removed
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup remove(String transId)
        throws NoSuchCardGroupException, SystemException {
        return remove((Serializable) transId);
    }

    /**
     * Removes the card group with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the card group
     * @return the card group that was removed
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup remove(Serializable primaryKey)
        throws NoSuchCardGroupException, SystemException {
        Session session = null;

        try {
            session = openSession();

            CardGroup cardGroup = (CardGroup) session.get(CardGroupImpl.class,
                    primaryKey);

            if (cardGroup == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCardGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(cardGroup);
        } catch (NoSuchCardGroupException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected CardGroup removeImpl(CardGroup cardGroup)
        throws SystemException {
        cardGroup = toUnwrappedModel(cardGroup);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(cardGroup)) {
                cardGroup = (CardGroup) session.get(CardGroupImpl.class,
                        cardGroup.getPrimaryKeyObj());
            }

            if (cardGroup != null) {
                session.delete(cardGroup);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (cardGroup != null) {
            clearCache(cardGroup);
        }

        return cardGroup;
    }

    @Override
    public CardGroup updateImpl(
        com.stc.echannels.epayments.model.CardGroup cardGroup)
        throws SystemException {
        cardGroup = toUnwrappedModel(cardGroup);

        boolean isNew = cardGroup.isNew();

        CardGroupModelImpl cardGroupModelImpl = (CardGroupModelImpl) cardGroup;

        Session session = null;

        try {
            session = openSession();

            if (cardGroup.isNew()) {
                session.save(cardGroup);

                cardGroup.setNew(false);
            } else {
                session.merge(cardGroup);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !CardGroupModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((cardGroupModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDGROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        cardGroupModelImpl.getOriginalCardGroupId(),
                        cardGroupModelImpl.getOriginalActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARDGROUPID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDGROUPID,
                    args);

                args = new Object[] {
                        cardGroupModelImpl.getCardGroupId(),
                        cardGroupModelImpl.getActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARDGROUPID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDGROUPID,
                    args);
            }

            if ((cardGroupModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        cardGroupModelImpl.getOriginalActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
                    args);

                args = new Object[] { cardGroupModelImpl.getActive() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
                    args);
            }

            if ((cardGroupModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDVALUE_INPAYMENTSYSTEM.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        cardGroupModelImpl.getOriginalCardValue(),
                        cardGroupModelImpl.getOriginalInPaymentSystem(),
                        cardGroupModelImpl.getOriginalActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARDVALUE_INPAYMENTSYSTEM,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDVALUE_INPAYMENTSYSTEM,
                    args);

                args = new Object[] {
                        cardGroupModelImpl.getCardValue(),
                        cardGroupModelImpl.getInPaymentSystem(),
                        cardGroupModelImpl.getActive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CARDVALUE_INPAYMENTSYSTEM,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CARDVALUE_INPAYMENTSYSTEM,
                    args);
            }
        }

        EntityCacheUtil.putResult(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
            CardGroupImpl.class, cardGroup.getPrimaryKey(), cardGroup);

        return cardGroup;
    }

    protected CardGroup toUnwrappedModel(CardGroup cardGroup) {
        if (cardGroup instanceof CardGroupImpl) {
            return cardGroup;
        }

        CardGroupImpl cardGroupImpl = new CardGroupImpl();

        cardGroupImpl.setNew(cardGroup.isNew());
        cardGroupImpl.setPrimaryKey(cardGroup.getPrimaryKey());

        cardGroupImpl.setTransId(cardGroup.getTransId());
        cardGroupImpl.setLastUpdateTimestamp(cardGroup.getLastUpdateTimestamp());
        cardGroupImpl.setLastUpdateUserid(cardGroup.getLastUpdateUserid());
        cardGroupImpl.setLastUpdateUsername(cardGroup.getLastUpdateUsername());
        cardGroupImpl.setActive(cardGroup.getActive());
        cardGroupImpl.setEffectiveTimestamp(cardGroup.getEffectiveTimestamp());
        cardGroupImpl.setClientIp(cardGroup.getClientIp());
        cardGroupImpl.setServerIp(cardGroup.getServerIp());
        cardGroupImpl.setUserAgent(cardGroup.getUserAgent());
        cardGroupImpl.setOperation(cardGroup.getOperation());
        cardGroupImpl.setCardGroupId(cardGroup.getCardGroupId());
        cardGroupImpl.setCardValue(cardGroup.getCardValue());
        cardGroupImpl.setPromotionValue(cardGroup.getPromotionValue());
        cardGroupImpl.setInPaymentSystem(cardGroup.getInPaymentSystem());
        cardGroupImpl.setServiceId(cardGroup.getServiceId());

        return cardGroupImpl;
    }

    /**
     * Returns the card group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the card group
     * @return the card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCardGroupException, SystemException {
        CardGroup cardGroup = fetchByPrimaryKey(primaryKey);

        if (cardGroup == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCardGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return cardGroup;
    }

    /**
     * Returns the card group with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchCardGroupException} if it could not be found.
     *
     * @param transId the primary key of the card group
     * @return the card group
     * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup findByPrimaryKey(String transId)
        throws NoSuchCardGroupException, SystemException {
        return findByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns the card group with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the card group
     * @return the card group, or <code>null</code> if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        CardGroup cardGroup = (CardGroup) EntityCacheUtil.getResult(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
                CardGroupImpl.class, primaryKey);

        if (cardGroup == _nullCardGroup) {
            return null;
        }

        if (cardGroup == null) {
            Session session = null;

            try {
                session = openSession();

                cardGroup = (CardGroup) session.get(CardGroupImpl.class,
                        primaryKey);

                if (cardGroup != null) {
                    cacheResult(cardGroup);
                } else {
                    EntityCacheUtil.putResult(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
                        CardGroupImpl.class, primaryKey, _nullCardGroup);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CardGroupModelImpl.ENTITY_CACHE_ENABLED,
                    CardGroupImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return cardGroup;
    }

    /**
     * Returns the card group with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param transId the primary key of the card group
     * @return the card group, or <code>null</code> if a card group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CardGroup fetchByPrimaryKey(String transId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) transId);
    }

    /**
     * Returns all the card groups.
     *
     * @return the card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the card groups.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of card groups
     * @param end the upper bound of the range of card groups (not inclusive)
     * @return the range of card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the card groups.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of card groups
     * @param end the upper bound of the range of card groups (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of card groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CardGroup> findAll(int start, int end,
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

        List<CardGroup> list = (List<CardGroup>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CARDGROUP);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CARDGROUP;

                if (pagination) {
                    sql = sql.concat(CardGroupModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<CardGroup>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CardGroup>(list);
                } else {
                    list = (List<CardGroup>) QueryUtil.list(q, getDialect(),
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
     * Removes all the card groups from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (CardGroup cardGroup : findAll()) {
            remove(cardGroup);
        }
    }

    /**
     * Returns the number of card groups.
     *
     * @return the number of card groups
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

                Query q = session.createQuery(_SQL_COUNT_CARDGROUP);

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
     * Initializes the card group persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.CardGroup")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<CardGroup>> listenersList = new ArrayList<ModelListener<CardGroup>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<CardGroup>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CardGroupImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
