package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.SrvTypeSrvsMap;

/**
 * The persistence interface for the srv type srvs map service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypeSrvsMapPersistenceImpl
 * @see SrvTypeSrvsMapUtil
 * @generated
 */
public interface SrvTypeSrvsMapPersistence extends BasePersistence<SrvTypeSrvsMap> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SrvTypeSrvsMapUtil} to access the srv type srvs map persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the srv type srvs maps where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the matching srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypeSrvsMap> findByServiceId(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the srv type srvs maps where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of srv type srvs maps
    * @param end the upper bound of the range of srv type srvs maps (not inclusive)
    * @return the range of matching srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypeSrvsMap> findByServiceId(
        long serviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the srv type srvs maps where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of srv type srvs maps
    * @param end the upper bound of the range of srv type srvs maps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypeSrvsMap> findByServiceId(
        long serviceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first srv type srvs map in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching srv type srvs map
    * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a matching srv type srvs map could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap findByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException;

    /**
    * Returns the first srv type srvs map in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching srv type srvs map, or <code>null</code> if a matching srv type srvs map could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap fetchByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last srv type srvs map in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching srv type srvs map
    * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a matching srv type srvs map could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap findByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException;

    /**
    * Returns the last srv type srvs map in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching srv type srvs map, or <code>null</code> if a matching srv type srvs map could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap fetchByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the srv type srvs maps before and after the current srv type srvs map in the ordered set where serviceId = &#63;.
    *
    * @param id the primary key of the current srv type srvs map
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next srv type srvs map
    * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a srv type srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap[] findByServiceId_PrevAndNext(
        java.lang.String id, long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException;

    /**
    * Removes all the srv type srvs maps where serviceId = &#63; from the database.
    *
    * @param serviceId the service ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of srv type srvs maps where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the number of matching srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    public int countByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the srv type srvs map in the entity cache if it is enabled.
    *
    * @param srvTypeSrvsMap the srv type srvs map
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.SrvTypeSrvsMap srvTypeSrvsMap);

    /**
    * Caches the srv type srvs maps in the entity cache if it is enabled.
    *
    * @param srvTypeSrvsMaps the srv type srvs maps
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.SrvTypeSrvsMap> srvTypeSrvsMaps);

    /**
    * Creates a new srv type srvs map with the primary key. Does not add the srv type srvs map to the database.
    *
    * @param id the primary key for the new srv type srvs map
    * @return the new srv type srvs map
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap create(
        java.lang.String id);

    /**
    * Removes the srv type srvs map with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the srv type srvs map
    * @return the srv type srvs map that was removed
    * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a srv type srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap remove(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException;

    public com.stc.echannels.epayments.model.SrvTypeSrvsMap updateImpl(
        com.stc.echannels.epayments.model.SrvTypeSrvsMap srvTypeSrvsMap)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the srv type srvs map with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException} if it could not be found.
    *
    * @param id the primary key of the srv type srvs map
    * @return the srv type srvs map
    * @throws com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException if a srv type srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap findByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException;

    /**
    * Returns the srv type srvs map with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the srv type srvs map
    * @return the srv type srvs map, or <code>null</code> if a srv type srvs map with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypeSrvsMap fetchByPrimaryKey(
        java.lang.String id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the srv type srvs maps.
    *
    * @return the srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypeSrvsMap> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the srv type srvs maps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of srv type srvs maps
    * @param end the upper bound of the range of srv type srvs maps (not inclusive)
    * @return the range of srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypeSrvsMap> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the srv type srvs maps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of srv type srvs maps
    * @param end the upper bound of the range of srv type srvs maps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypeSrvsMap> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the srv type srvs maps from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of srv type srvs maps.
    *
    * @return the number of srv type srvs maps
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
