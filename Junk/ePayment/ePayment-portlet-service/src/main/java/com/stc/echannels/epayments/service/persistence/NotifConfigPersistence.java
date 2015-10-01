package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.NotifConfig;

/**
 * The persistence interface for the notif config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifConfigPersistenceImpl
 * @see NotifConfigUtil
 * @generated
 */
public interface NotifConfigPersistence extends BasePersistence<NotifConfig> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link NotifConfigUtil} to access the notif config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the notif configs where status = &#63;.
    *
    * @param status the status
    * @return the matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the notif configs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @return the range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the notif configs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first notif config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Returns the first notif config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last notif config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Returns the last notif config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the notif configs before and after the current notif config in the ordered set where status = &#63;.
    *
    * @param notifId the primary key of the current notif config
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig[] findByStatus_PrevAndNext(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Removes all the notif configs where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of notif configs where status = &#63;.
    *
    * @param status the status
    * @return the number of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the notif configs where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByServiceId(
        long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the notif configs where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @return the range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByServiceId(
        long serviceId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the notif configs where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByServiceId(
        long serviceId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig findByServiceId_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Returns the first notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig fetchByServiceId_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig findByServiceId_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Returns the last notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig fetchByServiceId_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the notif configs before and after the current notif config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param notifId the primary key of the current notif config
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig[] findByServiceId_PrevAndNext(
        long notifId, long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Removes all the notif configs where serviceId = &#63; and status = &#63; from the database.
    *
    * @param serviceId the service ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByServiceId(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of notif configs where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the number of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public int countByServiceId(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the notif configs where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @return the matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByNotifId(
        long notifId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the notif configs where notifId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param notifId the notif ID
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @return the range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByNotifId(
        long notifId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the notif configs where notifId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param notifId the notif ID
    * @param status the status
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findByNotifId(
        long notifId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first notif config in the ordered set where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig findByNotifId_First(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Returns the first notif config in the ordered set where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig fetchByNotifId_First(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last notif config in the ordered set where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig findByNotifId_Last(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Returns the last notif config in the ordered set where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching notif config, or <code>null</code> if a matching notif config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig fetchByNotifId_Last(
        long notifId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the notif configs where notifId = &#63; and status = &#63; from the database.
    *
    * @param notifId the notif ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByNotifId(long notifId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of notif configs where notifId = &#63; and status = &#63;.
    *
    * @param notifId the notif ID
    * @param status the status
    * @return the number of matching notif configs
    * @throws SystemException if a system exception occurred
    */
    public int countByNotifId(long notifId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the notif config in the entity cache if it is enabled.
    *
    * @param notifConfig the notif config
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.NotifConfig notifConfig);

    /**
    * Caches the notif configs in the entity cache if it is enabled.
    *
    * @param notifConfigs the notif configs
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.NotifConfig> notifConfigs);

    /**
    * Creates a new notif config with the primary key. Does not add the notif config to the database.
    *
    * @param notifId the primary key for the new notif config
    * @return the new notif config
    */
    public com.stc.echannels.epayments.model.NotifConfig create(long notifId);

    /**
    * Removes the notif config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config that was removed
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig remove(long notifId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    public com.stc.echannels.epayments.model.NotifConfig updateImpl(
        com.stc.echannels.epayments.model.NotifConfig notifConfig)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the notif config with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchNotifConfigException} if it could not be found.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config
    * @throws com.stc.echannels.epayments.NoSuchNotifConfigException if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig findByPrimaryKey(
        long notifId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchNotifConfigException;

    /**
    * Returns the notif config with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param notifId the primary key of the notif config
    * @return the notif config, or <code>null</code> if a notif config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.NotifConfig fetchByPrimaryKey(
        long notifId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the notif configs.
    *
    * @return the notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the notif configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @return the range of notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the notif configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of notif configs
    * @param end the upper bound of the range of notif configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of notif configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.NotifConfig> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the notif configs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of notif configs.
    *
    * @return the number of notif configs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
