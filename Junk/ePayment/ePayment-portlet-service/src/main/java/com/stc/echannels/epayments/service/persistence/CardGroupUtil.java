package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.CardGroup;

import java.util.List;

/**
 * The persistence utility for the card group service. This utility wraps {@link CardGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see CardGroupPersistence
 * @see CardGroupPersistenceImpl
 * @generated
 */
public class CardGroupUtil {
    private static CardGroupPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(CardGroup cardGroup) {
        getPersistence().clearCache(cardGroup);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<CardGroup> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<CardGroup> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<CardGroup> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static CardGroup update(CardGroup cardGroup)
        throws SystemException {
        return getPersistence().update(cardGroup);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static CardGroup update(CardGroup cardGroup,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(cardGroup, serviceContext);
    }

    /**
    * Returns all the card groups where cardGroupId = &#63; and active = &#63;.
    *
    * @param cardGroupId the card group ID
    * @param active the active
    * @return the matching card groups
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardGroupId(
        java.lang.String cardGroupId, java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCardGroupId(cardGroupId, active);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardGroupId(
        java.lang.String cardGroupId, java.lang.String active, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCardGroupId(cardGroupId, active, start, end);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardGroupId(
        java.lang.String cardGroupId, java.lang.String active, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCardGroupId(cardGroupId, active, start, end,
            orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup findByCardGroupId_First(
        java.lang.String cardGroupId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence()
                   .findByCardGroupId_First(cardGroupId, active,
            orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup fetchByCardGroupId_First(
        java.lang.String cardGroupId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCardGroupId_First(cardGroupId, active,
            orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup findByCardGroupId_Last(
        java.lang.String cardGroupId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence()
                   .findByCardGroupId_Last(cardGroupId, active,
            orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup fetchByCardGroupId_Last(
        java.lang.String cardGroupId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCardGroupId_Last(cardGroupId, active,
            orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup[] findByCardGroupId_PrevAndNext(
        java.lang.String transId, java.lang.String cardGroupId,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence()
                   .findByCardGroupId_PrevAndNext(transId, cardGroupId, active,
            orderByComparator);
    }

    /**
    * Removes all the card groups where cardGroupId = &#63; and active = &#63; from the database.
    *
    * @param cardGroupId the card group ID
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCardGroupId(java.lang.String cardGroupId,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCardGroupId(cardGroupId, active);
    }

    /**
    * Returns the number of card groups where cardGroupId = &#63; and active = &#63;.
    *
    * @param cardGroupId the card group ID
    * @param active the active
    * @return the number of matching card groups
    * @throws SystemException if a system exception occurred
    */
    public static int countByCardGroupId(java.lang.String cardGroupId,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCardGroupId(cardGroupId, active);
    }

    /**
    * Returns all the card groups where active = &#63;.
    *
    * @param active the active
    * @return the matching card groups
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByActive(
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByActive(active);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByActive(
        java.lang.String active, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByActive(active, start, end);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByActive(
        java.lang.String active, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActive(active, start, end, orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup findByActive_First(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence().findByActive_First(active, orderByComparator);
    }

    /**
    * Returns the first card group in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching card group, or <code>null</code> if a matching card group could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup fetchByActive_First(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByActive_First(active, orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup findByActive_Last(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence().findByActive_Last(active, orderByComparator);
    }

    /**
    * Returns the last card group in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching card group, or <code>null</code> if a matching card group could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup fetchByActive_Last(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByActive_Last(active, orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup[] findByActive_PrevAndNext(
        java.lang.String transId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence()
                   .findByActive_PrevAndNext(transId, active, orderByComparator);
    }

    /**
    * Removes all the card groups where active = &#63; from the database.
    *
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public static void removeByActive(java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByActive(active);
    }

    /**
    * Returns the number of card groups where active = &#63;.
    *
    * @param active the active
    * @return the number of matching card groups
    * @throws SystemException if a system exception occurred
    */
    public static int countByActive(java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByActive(active);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardValue_InPaymentSystem(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCardValue_InPaymentSystem(cardValue, inPaymentSystem,
            active);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardValue_InPaymentSystem(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCardValue_InPaymentSystem(cardValue, inPaymentSystem,
            active, start, end);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardValue_InPaymentSystem(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCardValue_InPaymentSystem(cardValue, inPaymentSystem,
            active, start, end, orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup findByCardValue_InPaymentSystem_First(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence()
                   .findByCardValue_InPaymentSystem_First(cardValue,
            inPaymentSystem, active, orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup fetchByCardValue_InPaymentSystem_First(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCardValue_InPaymentSystem_First(cardValue,
            inPaymentSystem, active, orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup findByCardValue_InPaymentSystem_Last(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence()
                   .findByCardValue_InPaymentSystem_Last(cardValue,
            inPaymentSystem, active, orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup fetchByCardValue_InPaymentSystem_Last(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCardValue_InPaymentSystem_Last(cardValue,
            inPaymentSystem, active, orderByComparator);
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
    public static com.stc.echannels.epayments.model.CardGroup[] findByCardValue_InPaymentSystem_PrevAndNext(
        java.lang.String transId, long cardValue,
        java.lang.String inPaymentSystem, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence()
                   .findByCardValue_InPaymentSystem_PrevAndNext(transId,
            cardValue, inPaymentSystem, active, orderByComparator);
    }

    /**
    * Removes all the card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63; from the database.
    *
    * @param cardValue the card value
    * @param inPaymentSystem the in payment system
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCardValue_InPaymentSystem(long cardValue,
        java.lang.String inPaymentSystem, java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence()
            .removeByCardValue_InPaymentSystem(cardValue, inPaymentSystem,
            active);
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
    public static int countByCardValue_InPaymentSystem(long cardValue,
        java.lang.String inPaymentSystem, java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByCardValue_InPaymentSystem(cardValue,
            inPaymentSystem, active);
    }

    /**
    * Caches the card group in the entity cache if it is enabled.
    *
    * @param cardGroup the card group
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.CardGroup cardGroup) {
        getPersistence().cacheResult(cardGroup);
    }

    /**
    * Caches the card groups in the entity cache if it is enabled.
    *
    * @param cardGroups the card groups
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.CardGroup> cardGroups) {
        getPersistence().cacheResult(cardGroups);
    }

    /**
    * Creates a new card group with the primary key. Does not add the card group to the database.
    *
    * @param transId the primary key for the new card group
    * @return the new card group
    */
    public static com.stc.echannels.epayments.model.CardGroup create(
        java.lang.String transId) {
        return getPersistence().create(transId);
    }

    /**
    * Removes the card group with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the card group
    * @return the card group that was removed
    * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence().remove(transId);
    }

    public static com.stc.echannels.epayments.model.CardGroup updateImpl(
        com.stc.echannels.epayments.model.CardGroup cardGroup)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(cardGroup);
    }

    /**
    * Returns the card group with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchCardGroupException} if it could not be found.
    *
    * @param transId the primary key of the card group
    * @return the card group
    * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException {
        return getPersistence().findByPrimaryKey(transId);
    }

    /**
    * Returns the card group with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the card group
    * @return the card group, or <code>null</code> if a card group with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(transId);
    }

    /**
    * Returns all the card groups.
    *
    * @return the card groups
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the card groups from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of card groups.
    *
    * @return the number of card groups
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CardGroupPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CardGroupPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    CardGroupPersistence.class.getName());

            ReferenceRegistry.registerReference(CardGroupUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CardGroupPersistence persistence) {
    }
}
