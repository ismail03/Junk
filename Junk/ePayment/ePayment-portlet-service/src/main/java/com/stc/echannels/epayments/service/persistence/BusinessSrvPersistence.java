package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.BusinessSrv;

/**
 * The persistence interface for the business srv service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BusinessSrvPersistenceImpl
 * @see BusinessSrvUtil
 * @generated
 */
public interface BusinessSrvPersistence extends BasePersistence<BusinessSrv> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BusinessSrvUtil} to access the business srv persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the business srvs where status = &#63;.
    *
    * @param status the status
    * @return the matching business srvs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the business srvs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of business srvs
    * @param end the upper bound of the range of business srvs (not inclusive)
    * @return the range of matching business srvs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the business srvs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of business srvs
    * @param end the upper bound of the range of business srvs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching business srvs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first business srv in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching business srv
    * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a matching business srv could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BusinessSrv findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBusinessSrvException;

    /**
    * Returns the first business srv in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching business srv, or <code>null</code> if a matching business srv could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BusinessSrv fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last business srv in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching business srv
    * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a matching business srv could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BusinessSrv findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBusinessSrvException;

    /**
    * Returns the last business srv in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching business srv, or <code>null</code> if a matching business srv could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BusinessSrv fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the business srvs before and after the current business srv in the ordered set where status = &#63;.
    *
    * @param serviceId the primary key of the current business srv
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next business srv
    * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a business srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BusinessSrv[] findByStatus_PrevAndNext(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBusinessSrvException;

    /**
    * Removes all the business srvs where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of business srvs where status = &#63;.
    *
    * @param status the status
    * @return the number of matching business srvs
    * @throws SystemException if a system exception occurred
    */
    public int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the business srv in the entity cache if it is enabled.
    *
    * @param businessSrv the business srv
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv);

    /**
    * Caches the business srvs in the entity cache if it is enabled.
    *
    * @param businessSrvs the business srvs
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.BusinessSrv> businessSrvs);

    /**
    * Creates a new business srv with the primary key. Does not add the business srv to the database.
    *
    * @param serviceId the primary key for the new business srv
    * @return the new business srv
    */
    public com.stc.echannels.epayments.model.BusinessSrv create(long serviceId);

    /**
    * Removes the business srv with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceId the primary key of the business srv
    * @return the business srv that was removed
    * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a business srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BusinessSrv remove(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBusinessSrvException;

    public com.stc.echannels.epayments.model.BusinessSrv updateImpl(
        com.stc.echannels.epayments.model.BusinessSrv businessSrv)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the business srv with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBusinessSrvException} if it could not be found.
    *
    * @param serviceId the primary key of the business srv
    * @return the business srv
    * @throws com.stc.echannels.epayments.NoSuchBusinessSrvException if a business srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BusinessSrv findByPrimaryKey(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBusinessSrvException;

    /**
    * Returns the business srv with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param serviceId the primary key of the business srv
    * @return the business srv, or <code>null</code> if a business srv with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.BusinessSrv fetchByPrimaryKey(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the business srvs.
    *
    * @return the business srvs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the business srvs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of business srvs
    * @param end the upper bound of the range of business srvs (not inclusive)
    * @return the range of business srvs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the business srvs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BusinessSrvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of business srvs
    * @param end the upper bound of the range of business srvs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of business srvs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.BusinessSrv> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the business srvs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of business srvs.
    *
    * @return the number of business srvs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
