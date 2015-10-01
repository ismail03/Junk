package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException;
import com.stc.echannels.epayments.model.PaymentTransactionDetails;
import com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsImpl;
import com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl;
import com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the payment transaction details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionDetailsPersistence
 * @see PaymentTransactionDetailsUtil
 * @generated
 */
public class PaymentTransactionDetailsPersistenceImpl
    extends BasePersistenceImpl<PaymentTransactionDetails>
    implements PaymentTransactionDetailsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaymentTransactionDetailsUtil} to access the payment transaction details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaymentTransactionDetailsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionDetailsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionDetailsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionDetailsModelImpl.FINDER_CACHE_ENABLED,
            PaymentTransactionDetailsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionDetailsModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
            new String[0]);
    private static final String _SQL_SELECT_PAYMENTTRANSACTIONDETAILS = "SELECT paymentTransactionDetails FROM PaymentTransactionDetails paymentTransactionDetails";
    private static final String _SQL_COUNT_PAYMENTTRANSACTIONDETAILS = "SELECT COUNT(paymentTransactionDetails) FROM PaymentTransactionDetails paymentTransactionDetails";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paymentTransactionDetails.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PaymentTransactionDetails exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaymentTransactionDetailsPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "epayTransId", "epayInstanceId", "accountNumber",
                "serviceTypeId", "transAmount", "transValue", "processDate",
                "serviceNumber", "idType", "recipientId", "recipientIdType",
                "notificationNumber", "processStatus", "serviceCategory",
                "reasonCode", "nativeReasonCode"
            });
    private static PaymentTransactionDetails _nullPaymentTransactionDetails = new PaymentTransactionDetailsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PaymentTransactionDetails> toCacheModel() {
                return _nullPaymentTransactionDetailsCacheModel;
            }
        };

    private static CacheModel<PaymentTransactionDetails> _nullPaymentTransactionDetailsCacheModel =
        new CacheModel<PaymentTransactionDetails>() {
            @Override
            public PaymentTransactionDetails toEntityModel() {
                return _nullPaymentTransactionDetails;
            }
        };

    public PaymentTransactionDetailsPersistenceImpl() {
        setModelClass(PaymentTransactionDetails.class);
    }

    /**
     * Caches the payment transaction details in the entity cache if it is enabled.
     *
     * @param paymentTransactionDetails the payment transaction details
     */
    @Override
    public void cacheResult(PaymentTransactionDetails paymentTransactionDetails) {
        EntityCacheUtil.putResult(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionDetailsImpl.class,
            paymentTransactionDetails.getPrimaryKey(), paymentTransactionDetails);

        paymentTransactionDetails.resetOriginalValues();
    }

    /**
     * Caches the payment transaction detailses in the entity cache if it is enabled.
     *
     * @param paymentTransactionDetailses the payment transaction detailses
     */
    @Override
    public void cacheResult(
        List<PaymentTransactionDetails> paymentTransactionDetailses) {
        for (PaymentTransactionDetails paymentTransactionDetails : paymentTransactionDetailses) {
            if (EntityCacheUtil.getResult(
                        PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentTransactionDetailsImpl.class,
                        paymentTransactionDetails.getPrimaryKey()) == null) {
                cacheResult(paymentTransactionDetails);
            } else {
                paymentTransactionDetails.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all payment transaction detailses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaymentTransactionDetailsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaymentTransactionDetailsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the payment transaction details.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PaymentTransactionDetails paymentTransactionDetails) {
        EntityCacheUtil.removeResult(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionDetailsImpl.class,
            paymentTransactionDetails.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<PaymentTransactionDetails> paymentTransactionDetailses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PaymentTransactionDetails paymentTransactionDetails : paymentTransactionDetailses) {
            EntityCacheUtil.removeResult(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
                PaymentTransactionDetailsImpl.class,
                paymentTransactionDetails.getPrimaryKey());
        }
    }

    /**
     * Creates a new payment transaction details with the primary key. Does not add the payment transaction details to the database.
     *
     * @param paymentTransactionDetailsPK the primary key for the new payment transaction details
     * @return the new payment transaction details
     */
    @Override
    public PaymentTransactionDetails create(
        PaymentTransactionDetailsPK paymentTransactionDetailsPK) {
        PaymentTransactionDetails paymentTransactionDetails = new PaymentTransactionDetailsImpl();

        paymentTransactionDetails.setNew(true);
        paymentTransactionDetails.setPrimaryKey(paymentTransactionDetailsPK);

        return paymentTransactionDetails;
    }

    /**
     * Removes the payment transaction details with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param paymentTransactionDetailsPK the primary key of the payment transaction details
     * @return the payment transaction details that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException if a payment transaction details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactionDetails remove(
        PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws NoSuchPaymentTransactionDetailsException, SystemException {
        return remove((Serializable) paymentTransactionDetailsPK);
    }

    /**
     * Removes the payment transaction details with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the payment transaction details
     * @return the payment transaction details that was removed
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException if a payment transaction details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactionDetails remove(Serializable primaryKey)
        throws NoSuchPaymentTransactionDetailsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PaymentTransactionDetails paymentTransactionDetails = (PaymentTransactionDetails) session.get(PaymentTransactionDetailsImpl.class,
                    primaryKey);

            if (paymentTransactionDetails == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaymentTransactionDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paymentTransactionDetails);
        } catch (NoSuchPaymentTransactionDetailsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PaymentTransactionDetails removeImpl(
        PaymentTransactionDetails paymentTransactionDetails)
        throws SystemException {
        paymentTransactionDetails = toUnwrappedModel(paymentTransactionDetails);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paymentTransactionDetails)) {
                paymentTransactionDetails = (PaymentTransactionDetails) session.get(PaymentTransactionDetailsImpl.class,
                        paymentTransactionDetails.getPrimaryKeyObj());
            }

            if (paymentTransactionDetails != null) {
                session.delete(paymentTransactionDetails);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paymentTransactionDetails != null) {
            clearCache(paymentTransactionDetails);
        }

        return paymentTransactionDetails;
    }

    @Override
    public PaymentTransactionDetails updateImpl(
        com.stc.echannels.epayments.model.PaymentTransactionDetails paymentTransactionDetails)
        throws SystemException {
        paymentTransactionDetails = toUnwrappedModel(paymentTransactionDetails);

        boolean isNew = paymentTransactionDetails.isNew();

        Session session = null;

        try {
            session = openSession();

            if (paymentTransactionDetails.isNew()) {
                session.save(paymentTransactionDetails);

                paymentTransactionDetails.setNew(false);
            } else {
                session.merge(paymentTransactionDetails);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
            PaymentTransactionDetailsImpl.class,
            paymentTransactionDetails.getPrimaryKey(), paymentTransactionDetails);

        return paymentTransactionDetails;
    }

    protected PaymentTransactionDetails toUnwrappedModel(
        PaymentTransactionDetails paymentTransactionDetails) {
        if (paymentTransactionDetails instanceof PaymentTransactionDetailsImpl) {
            return paymentTransactionDetails;
        }

        PaymentTransactionDetailsImpl paymentTransactionDetailsImpl = new PaymentTransactionDetailsImpl();

        paymentTransactionDetailsImpl.setNew(paymentTransactionDetails.isNew());
        paymentTransactionDetailsImpl.setPrimaryKey(paymentTransactionDetails.getPrimaryKey());

        paymentTransactionDetailsImpl.setEpayTransId(paymentTransactionDetails.getEpayTransId());
        paymentTransactionDetailsImpl.setEpayInstanceId(paymentTransactionDetails.getEpayInstanceId());
        paymentTransactionDetailsImpl.setAccountNumber(paymentTransactionDetails.getAccountNumber());
        paymentTransactionDetailsImpl.setServiceTypeId(paymentTransactionDetails.getServiceTypeId());
        paymentTransactionDetailsImpl.setTransAmount(paymentTransactionDetails.getTransAmount());
        paymentTransactionDetailsImpl.setTransValue(paymentTransactionDetails.getTransValue());
        paymentTransactionDetailsImpl.setProcessDate(paymentTransactionDetails.getProcessDate());
        paymentTransactionDetailsImpl.setServiceNumber(paymentTransactionDetails.getServiceNumber());
        paymentTransactionDetailsImpl.setIdType(paymentTransactionDetails.getIdType());
        paymentTransactionDetailsImpl.setRecipientId(paymentTransactionDetails.getRecipientId());
        paymentTransactionDetailsImpl.setRecipientIdType(paymentTransactionDetails.getRecipientIdType());
        paymentTransactionDetailsImpl.setNotificationNumber(paymentTransactionDetails.getNotificationNumber());
        paymentTransactionDetailsImpl.setProcessStatus(paymentTransactionDetails.getProcessStatus());
        paymentTransactionDetailsImpl.setServiceCategory(paymentTransactionDetails.getServiceCategory());
        paymentTransactionDetailsImpl.setReasonCode(paymentTransactionDetails.getReasonCode());
        paymentTransactionDetailsImpl.setNativeReasonCode(paymentTransactionDetails.getNativeReasonCode());

        return paymentTransactionDetailsImpl;
    }

    /**
     * Returns the payment transaction details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the payment transaction details
     * @return the payment transaction details
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException if a payment transaction details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactionDetails findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaymentTransactionDetailsException, SystemException {
        PaymentTransactionDetails paymentTransactionDetails = fetchByPrimaryKey(primaryKey);

        if (paymentTransactionDetails == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaymentTransactionDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paymentTransactionDetails;
    }

    /**
     * Returns the payment transaction details with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException} if it could not be found.
     *
     * @param paymentTransactionDetailsPK the primary key of the payment transaction details
     * @return the payment transaction details
     * @throws com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException if a payment transaction details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactionDetails findByPrimaryKey(
        PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws NoSuchPaymentTransactionDetailsException, SystemException {
        return findByPrimaryKey((Serializable) paymentTransactionDetailsPK);
    }

    /**
     * Returns the payment transaction details with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the payment transaction details
     * @return the payment transaction details, or <code>null</code> if a payment transaction details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactionDetails fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PaymentTransactionDetails paymentTransactionDetails = (PaymentTransactionDetails) EntityCacheUtil.getResult(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
                PaymentTransactionDetailsImpl.class, primaryKey);

        if (paymentTransactionDetails == _nullPaymentTransactionDetails) {
            return null;
        }

        if (paymentTransactionDetails == null) {
            Session session = null;

            try {
                session = openSession();

                paymentTransactionDetails = (PaymentTransactionDetails) session.get(PaymentTransactionDetailsImpl.class,
                        primaryKey);

                if (paymentTransactionDetails != null) {
                    cacheResult(paymentTransactionDetails);
                } else {
                    EntityCacheUtil.putResult(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
                        PaymentTransactionDetailsImpl.class, primaryKey,
                        _nullPaymentTransactionDetails);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaymentTransactionDetailsModelImpl.ENTITY_CACHE_ENABLED,
                    PaymentTransactionDetailsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paymentTransactionDetails;
    }

    /**
     * Returns the payment transaction details with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param paymentTransactionDetailsPK the primary key of the payment transaction details
     * @return the payment transaction details, or <code>null</code> if a payment transaction details with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PaymentTransactionDetails fetchByPrimaryKey(
        PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) paymentTransactionDetailsPK);
    }

    /**
     * Returns all the payment transaction detailses.
     *
     * @return the payment transaction detailses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactionDetails> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the payment transaction detailses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment transaction detailses
     * @param end the upper bound of the range of payment transaction detailses (not inclusive)
     * @return the range of payment transaction detailses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactionDetails> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the payment transaction detailses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of payment transaction detailses
     * @param end the upper bound of the range of payment transaction detailses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of payment transaction detailses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PaymentTransactionDetails> findAll(int start, int end,
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

        List<PaymentTransactionDetails> list = (List<PaymentTransactionDetails>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAYMENTTRANSACTIONDETAILS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAYMENTTRANSACTIONDETAILS;

                if (pagination) {
                    sql = sql.concat(PaymentTransactionDetailsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PaymentTransactionDetails>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PaymentTransactionDetails>(list);
                } else {
                    list = (List<PaymentTransactionDetails>) QueryUtil.list(q,
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
     * Removes all the payment transaction detailses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PaymentTransactionDetails paymentTransactionDetails : findAll()) {
            remove(paymentTransactionDetails);
        }
    }

    /**
     * Returns the number of payment transaction detailses.
     *
     * @return the number of payment transaction detailses
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

                Query q = session.createQuery(_SQL_COUNT_PAYMENTTRANSACTIONDETAILS);

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
     * Initializes the payment transaction details persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.stc.echannels.epayments.model.PaymentTransactionDetails")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PaymentTransactionDetails>> listenersList = new ArrayList<ModelListener<PaymentTransactionDetails>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PaymentTransactionDetails>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaymentTransactionDetailsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
