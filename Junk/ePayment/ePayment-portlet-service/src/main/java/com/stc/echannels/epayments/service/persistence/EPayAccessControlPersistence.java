package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.EPayAccessControl;

/**
 * The persistence interface for the e pay access control service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see EPayAccessControlPersistenceImpl
 * @see EPayAccessControlUtil
 * @generated
 */
public interface EPayAccessControlPersistence extends BasePersistence<EPayAccessControl> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EPayAccessControlUtil} to access the e pay access control persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the e pay access controls where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceId(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the e pay access controls where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @return the range of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceId(
        long serviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the e pay access controls where serviceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceId(
        long serviceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl findByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException;

    /**
    * Returns the first e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl fetchByServiceId_First(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl findByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException;

    /**
    * Returns the last e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl fetchByServiceId_Last(
        long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the e pay access controls before and after the current e pay access control in the ordered set where serviceId = &#63;.
    *
    * @param epayCofignId the primary key of the current e pay access control
    * @param serviceId the service ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl[] findByServiceId_PrevAndNext(
        long epayCofignId, long serviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException;

    /**
    * Removes all the e pay access controls where serviceId = &#63; from the database.
    *
    * @param serviceId the service ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of e pay access controls where serviceId = &#63;.
    *
    * @param serviceId the service ID
    * @return the number of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public int countByServiceId(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the e pay access controls where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByserviceIdAndstatus(
        long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the e pay access controls where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @return the range of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByserviceIdAndstatus(
        long serviceId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the e pay access controls where serviceId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param serviceId the service ID
    * @param status the status
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByserviceIdAndstatus(
        long serviceId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl findByserviceIdAndstatus_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException;

    /**
    * Returns the first e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl fetchByserviceIdAndstatus_First(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl findByserviceIdAndstatus_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException;

    /**
    * Returns the last e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching e pay access control, or <code>null</code> if a matching e pay access control could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl fetchByserviceIdAndstatus_Last(
        long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the e pay access controls before and after the current e pay access control in the ordered set where serviceId = &#63; and status = &#63;.
    *
    * @param epayCofignId the primary key of the current e pay access control
    * @param serviceId the service ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl[] findByserviceIdAndstatus_PrevAndNext(
        long epayCofignId, long serviceId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException;

    /**
    * Removes all the e pay access controls where serviceId = &#63; and status = &#63; from the database.
    *
    * @param serviceId the service ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByserviceIdAndstatus(long serviceId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of e pay access controls where serviceId = &#63; and status = &#63;.
    *
    * @param serviceId the service ID
    * @param status the status
    * @return the number of matching e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public int countByserviceIdAndstatus(long serviceId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the e pay access control in the entity cache if it is enabled.
    *
    * @param ePayAccessControl the e pay access control
    */
    public void cacheResult(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl);

    /**
    * Caches the e pay access controls in the entity cache if it is enabled.
    *
    * @param ePayAccessControls the e pay access controls
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> ePayAccessControls);

    /**
    * Creates a new e pay access control with the primary key. Does not add the e pay access control to the database.
    *
    * @param epayCofignId the primary key for the new e pay access control
    * @return the new e pay access control
    */
    public com.stc.echannels.epayments.model.EPayAccessControl create(
        long epayCofignId);

    /**
    * Removes the e pay access control with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control that was removed
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl remove(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException;

    public com.stc.echannels.epayments.model.EPayAccessControl updateImpl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the e pay access control with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchEPayAccessControlException} if it could not be found.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control
    * @throws com.stc.echannels.epayments.NoSuchEPayAccessControlException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl findByPrimaryKey(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchEPayAccessControlException;

    /**
    * Returns the e pay access control with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control, or <code>null</code> if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl fetchByPrimaryKey(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the e pay access controls.
    *
    * @return the e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the e pay access controls.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @return the range of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the e pay access controls.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of e pay access controls
    * @param end the upper bound of the range of e pay access controls (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the e pay access controls from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of e pay access controls.
    *
    * @return the number of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
