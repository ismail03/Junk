package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.SystemConfig;

/**
 * The persistence interface for the system config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see SystemConfigPersistenceImpl
 * @see SystemConfigUtil
 * @generated
 */
public interface SystemConfigPersistence extends BasePersistence<SystemConfig> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SystemConfigUtil} to access the system config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the system configs where status = &#63;.
    *
    * @param status the status
    * @return the matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the system configs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the system configs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first system config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Returns the first system config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last system config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Returns the last system config in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the system configs before and after the current system config in the ordered set where status = &#63;.
    *
    * @param transId the primary key of the current system config
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig[] findByStatus_PrevAndNext(
        java.lang.String transId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Removes all the system configs where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of system configs where status = &#63;.
    *
    * @param status the status
    * @return the number of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the system configs where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByServiceId(
        long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the system configs where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByServiceId(
        long serviceId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the system configs where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByServiceId(
        long serviceId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig findByServiceId_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Returns the first system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig fetchByServiceId_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig findByServiceId_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Returns the last system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig fetchByServiceId_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the system configs before and after the current system config in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current system config
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig[] findByServiceId_PrevAndNext(
        java.lang.String transId, long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Removes all the system configs where serviceId = &#63; and status = &#63; from the database.
    *
    * @param serviceId the service ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByServiceId(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of system configs where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the number of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public int countByServiceId(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @return the matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByBankId(
        long serviceId, java.lang.String bankId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByBankId(
        long serviceId, java.lang.String bankId, java.lang.String status,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findByBankId(
        long serviceId, java.lang.String bankId, java.lang.String status,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig findByBankId_First(
        long serviceId, java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Returns the first system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig fetchByBankId_First(
        long serviceId, java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig findByBankId_Last(
        long serviceId, java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Returns the last system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching system config, or <code>null</code> if a matching system config could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig fetchByBankId_Last(
        long serviceId, java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the system configs before and after the current system config in the ordered set where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current system config
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig[] findByBankId_PrevAndNext(
        java.lang.String transId, long serviceId, java.lang.String bankId,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Removes all the system configs where serviceId = &#63; and bankId = &#63; and status = &#63; from the database.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByBankId(long serviceId, java.lang.String bankId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of system configs where serviceId = &#63; and bankId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param bankId the bank ID
    * @param status the status
    * @return the number of matching system configs
    * @throws SystemException if a system exception occurred
    */
    public int countByBankId(long serviceId, java.lang.String bankId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the system config in the entity cache if it is enabled.
    *
    * @param systemConfig the system config
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.SystemConfig systemConfig);

    /**
    * Caches the system configs in the entity cache if it is enabled.
    *
    * @param systemConfigs the system configs
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.SystemConfig> systemConfigs);

    /**
    * Creates a new system config with the primary key. Does not add the system config to the database.
    *
    * @param transId the primary key for the new system config
    * @return the new system config
    */
    public com.stc.echannels.epayments.model.SystemConfig create(
        java.lang.String transId);

    /**
    * Removes the system config with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the system config
    * @return the system config that was removed
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    public com.stc.echannels.epayments.model.SystemConfig updateImpl(
        com.stc.echannels.epayments.model.SystemConfig systemConfig)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the system config with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchSystemConfigException} if it could not be found.
    *
    * @param transId the primary key of the system config
    * @return the system config
    * @throws com.stc.echannels.epayments.NoSuchSystemConfigException if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSystemConfigException;

    /**
    * Returns the system config with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the system config
    * @return the system config, or <code>null</code> if a system config with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SystemConfig fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the system configs.
    *
    * @return the system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the system configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @return the range of system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the system configs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SystemConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of system configs
    * @param end the upper bound of the range of system configs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of system configs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SystemConfig> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the system configs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of system configs.
    *
    * @return the number of system configs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
