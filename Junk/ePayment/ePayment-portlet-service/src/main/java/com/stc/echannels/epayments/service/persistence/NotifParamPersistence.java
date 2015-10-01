package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.NotifParam;

/**
 * The persistence interface for the notif param service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifParamPersistenceImpl
 * @see NotifParamUtil
 * @generated
 */
public interface NotifParamPersistence extends BasePersistence<NotifParam> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link NotifParamUtil} to access the notif param persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the notif params where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @return the matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNotifParamId(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the notif params where notifParamId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param notifParamId the notif param ID
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @return the range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNotifParamId(
        long notifParamId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the notif params where notifParamId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param notifParamId the notif param ID
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNotifParamId(
        long notifParamId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first notif param in the ordered set where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam findByNotifParamId_First(
        long notifParamId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Returns the first notif param in the ordered set where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam fetchByNotifParamId_First(
        long notifParamId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last notif param in the ordered set where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam findByNotifParamId_Last(
        long notifParamId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Returns the last notif param in the ordered set where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam fetchByNotifParamId_Last(
        long notifParamId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the notif params where notifParamId = &#63; from the database.
    *
    * @param notifParamId the notif param ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByNotifParamId(long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of notif params where notifParamId = &#63;.
    *
    * @param notifParamId the notif param ID
    * @return the number of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public int countByNotifParamId(long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the notif params where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @return the matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameEn(
        java.lang.String nameEn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the notif params where nameEn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nameEn the name en
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @return the range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameEn(
        java.lang.String nameEn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the notif params where nameEn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nameEn the name en
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameEn(
        java.lang.String nameEn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first notif param in the ordered set where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam findByNameEn_First(
        java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Returns the first notif param in the ordered set where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam fetchByNameEn_First(
        java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last notif param in the ordered set where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam findByNameEn_Last(
        java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Returns the last notif param in the ordered set where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam fetchByNameEn_Last(
        java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the notif params before and after the current notif param in the ordered set where nameEn = &#63;.
    *
    * @param notifParamId the primary key of the current notif param
    * @param nameEn the name en
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam[] findByNameEn_PrevAndNext(
        long notifParamId, java.lang.String nameEn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Removes all the notif params where nameEn = &#63; from the database.
    *
    * @param nameEn the name en
    * @throws SystemException if a system exception occurred
    */
    public void removeByNameEn(java.lang.String nameEn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of notif params where nameEn = &#63;.
    *
    * @param nameEn the name en
    * @return the number of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public int countByNameEn(java.lang.String nameEn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the notif params where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @return the matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameAr(
        java.lang.String nameAr)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the notif params where nameAr = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nameAr the name ar
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @return the range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameAr(
        java.lang.String nameAr, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the notif params where nameAr = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nameAr the name ar
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findByNameAr(
        java.lang.String nameAr, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first notif param in the ordered set where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam findByNameAr_First(
        java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Returns the first notif param in the ordered set where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam fetchByNameAr_First(
        java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last notif param in the ordered set where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam findByNameAr_Last(
        java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Returns the last notif param in the ordered set where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif param, or <code>null</code> if a matching notif param could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam fetchByNameAr_Last(
        java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the notif params before and after the current notif param in the ordered set where nameAr = &#63;.
    *
    * @param notifParamId the primary key of the current notif param
    * @param nameAr the name ar
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam[] findByNameAr_PrevAndNext(
        long notifParamId, java.lang.String nameAr,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Removes all the notif params where nameAr = &#63; from the database.
    *
    * @param nameAr the name ar
    * @throws SystemException if a system exception occurred
    */
    public void removeByNameAr(java.lang.String nameAr)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of notif params where nameAr = &#63;.
    *
    * @param nameAr the name ar
    * @return the number of matching notif params
    * @throws SystemException if a system exception occurred
    */
    public int countByNameAr(java.lang.String nameAr)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the notif param in the entity cache if it is enabled.
    *
    * @param notifParam the notif param
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.NotifParam notifParam);

    /**
    * Caches the notif params in the entity cache if it is enabled.
    *
    * @param notifParams the notif params
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.NotifParam> notifParams);

    /**
    * Creates a new notif param with the primary key. Does not add the notif param to the database.
    *
    * @param notifParamId the primary key for the new notif param
    * @return the new notif param
    */
    public com.stc.echannels.epayments.model.NotifParam create(
        long notifParamId);

    /**
    * Removes the notif param with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notifParamId the primary key of the notif param
    * @return the notif param that was removed
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam remove(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    public com.stc.echannels.epayments.model.NotifParam updateImpl(
        com.stc.echannels.epayments.model.NotifParam notifParam)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the notif param with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchNotifParamException} if it could not be found.
    *
    * @param notifParamId the primary key of the notif param
    * @return the notif param
    * @throws com.stc.echannels.epayments.NoSuchNotifParamException if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam findByPrimaryKey(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifParamException;

    /**
    * Returns the notif param with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param notifParamId the primary key of the notif param
    * @return the notif param, or <code>null</code> if a notif param with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifParam fetchByPrimaryKey(
        long notifParamId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the notif params.
    *
    * @return the notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the notif params.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @return the range of notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the notif params.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif params
    * @param end the upper bound of the range of notif params (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of notif params
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifParam> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the notif params from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of notif params.
    *
    * @return the number of notif params
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
