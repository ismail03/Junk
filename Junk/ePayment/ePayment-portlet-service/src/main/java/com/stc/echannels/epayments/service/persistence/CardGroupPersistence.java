package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.CardGroup;

/**
 * The persistence interface for the card group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see CardGroupPersistenceImpl
 * @see CardGroupUtil
 * @generated
 */
public interface CardGroupPersistence extends BasePersistence<CardGroup> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CardGroupUtil} to access the card group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the card groups where cardGroupId = &#63; and active = &#63;.
    *
    * @param cardGroupId the card group ID
    * @param active the active
    * @return the matching card groups
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardGroupId(
        java.lang.String cardGroupId, java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardGroupId(
        java.lang.String cardGroupId, java.lang.String active, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardGroupId(
        java.lang.String cardGroupId, java.lang.String active, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.CardGroup findByCardGroupId_First(
        java.lang.String cardGroupId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    /**
    * Returns the first card group in the ordered set where cardGroupId = &#63; and active = &#63;.
    *
    * @param cardGroupId the card group ID
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching card group, or <code>null</code> if a matching card group could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup fetchByCardGroupId_First(
        java.lang.String cardGroupId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.CardGroup findByCardGroupId_Last(
        java.lang.String cardGroupId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    /**
    * Returns the last card group in the ordered set where cardGroupId = &#63; and active = &#63;.
    *
    * @param cardGroupId the card group ID
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching card group, or <code>null</code> if a matching card group could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup fetchByCardGroupId_Last(
        java.lang.String cardGroupId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.CardGroup[] findByCardGroupId_PrevAndNext(
        java.lang.String transId, java.lang.String cardGroupId,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    /**
    * Removes all the card groups where cardGroupId = &#63; and active = &#63; from the database.
    *
    * @param cardGroupId the card group ID
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public void removeByCardGroupId(java.lang.String cardGroupId,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of card groups where cardGroupId = &#63; and active = &#63;.
    *
    * @param cardGroupId the card group ID
    * @param active the active
    * @return the number of matching card groups
    * @throws SystemException if a system exception occurred
    */
    public int countByCardGroupId(java.lang.String cardGroupId,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the card groups where active = &#63;.
    *
    * @param active the active
    * @return the matching card groups
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByActive(
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByActive(
        java.lang.String active, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByActive(
        java.lang.String active, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first card group in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching card group
    * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a matching card group could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup findByActive_First(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    /**
    * Returns the first card group in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching card group, or <code>null</code> if a matching card group could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup fetchByActive_First(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last card group in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching card group
    * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a matching card group could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup findByActive_Last(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    /**
    * Returns the last card group in the ordered set where active = &#63;.
    *
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching card group, or <code>null</code> if a matching card group could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup fetchByActive_Last(
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.CardGroup[] findByActive_PrevAndNext(
        java.lang.String transId, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    /**
    * Removes all the card groups where active = &#63; from the database.
    *
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public void removeByActive(java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of card groups where active = &#63;.
    *
    * @param active the active
    * @return the number of matching card groups
    * @throws SystemException if a system exception occurred
    */
    public int countByActive(java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
    *
    * @param cardValue the card value
    * @param inPaymentSystem the in payment system
    * @param active the active
    * @return the matching card groups
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardValue_InPaymentSystem(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardValue_InPaymentSystem(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findByCardValue_InPaymentSystem(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.CardGroup findByCardValue_InPaymentSystem_First(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

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
    public com.stc.echannels.epayments.model.CardGroup fetchByCardValue_InPaymentSystem_First(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.CardGroup findByCardValue_InPaymentSystem_Last(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

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
    public com.stc.echannels.epayments.model.CardGroup fetchByCardValue_InPaymentSystem_Last(
        long cardValue, java.lang.String inPaymentSystem,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.stc.echannels.epayments.model.CardGroup[] findByCardValue_InPaymentSystem_PrevAndNext(
        java.lang.String transId, long cardValue,
        java.lang.String inPaymentSystem, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    /**
    * Removes all the card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63; from the database.
    *
    * @param cardValue the card value
    * @param inPaymentSystem the in payment system
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public void removeByCardValue_InPaymentSystem(long cardValue,
        java.lang.String inPaymentSystem, java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of card groups where cardValue = &#63; and inPaymentSystem = &#63; and active = &#63;.
    *
    * @param cardValue the card value
    * @param inPaymentSystem the in payment system
    * @param active the active
    * @return the number of matching card groups
    * @throws SystemException if a system exception occurred
    */
    public int countByCardValue_InPaymentSystem(long cardValue,
        java.lang.String inPaymentSystem, java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the card group in the entity cache if it is enabled.
    *
    * @param cardGroup the card group
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.CardGroup cardGroup);

    /**
    * Caches the card groups in the entity cache if it is enabled.
    *
    * @param cardGroups the card groups
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.CardGroup> cardGroups);

    /**
    * Creates a new card group with the primary key. Does not add the card group to the database.
    *
    * @param transId the primary key for the new card group
    * @return the new card group
    */
    public com.stc.echannels.epayments.model.CardGroup create(
        java.lang.String transId);

    /**
    * Removes the card group with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the card group
    * @return the card group that was removed
    * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    public com.stc.echannels.epayments.model.CardGroup updateImpl(
        com.stc.echannels.epayments.model.CardGroup cardGroup)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the card group with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchCardGroupException} if it could not be found.
    *
    * @param transId the primary key of the card group
    * @return the card group
    * @throws com.stc.echannels.epayments.NoSuchCardGroupException if a card group with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchCardGroupException;

    /**
    * Returns the card group with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the card group
    * @return the card group, or <code>null</code> if a card group with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.CardGroup fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the card groups.
    *
    * @return the card groups
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.stc.echannels.epayments.model.CardGroup> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the card groups from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of card groups.
    *
    * @return the number of card groups
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}