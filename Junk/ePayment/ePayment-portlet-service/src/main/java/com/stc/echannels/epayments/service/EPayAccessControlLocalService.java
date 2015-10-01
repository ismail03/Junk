package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for EPayAccessControl. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author ahmed_fadlus
 * @see EPayAccessControlLocalServiceUtil
 * @see com.stc.echannels.epayments.service.base.EPayAccessControlLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.EPayAccessControlLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface EPayAccessControlLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EPayAccessControlLocalServiceUtil} to access the e pay access control local service. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.EPayAccessControlLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the e pay access control to the database. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was added
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl addEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new e pay access control with the primary key. Does not add the e pay access control to the database.
    *
    * @param epayCofignId the primary key for the new e pay access control
    * @return the new e pay access control
    */
    public com.stc.echannels.epayments.model.EPayAccessControl createEPayAccessControl(
        long epayCofignId);

    /**
    * Deletes the e pay access control with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control that was removed
    * @throws PortalException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl deleteEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the e pay access control from the database. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl deleteEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.EPayAccessControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.stc.echannels.epayments.model.EPayAccessControl fetchEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the e pay access control with the primary key.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control
    * @throws PortalException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.stc.echannels.epayments.model.EPayAccessControl getEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> getEPayAccessControls(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of e pay access controls.
    *
    * @return the number of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getEPayAccessControlsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the e pay access control in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.EPayAccessControl updateEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public java.util.List<com.stc.echannels.epayments.custommodel.AccessControlModel> findActiveEpayAccessControlByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void enableEPayAcessControl(long[] ids,
        com.stc.echannels.epayments.model.EPayAccessControl epac)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void addEPayAcessControl(
        java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> accessControls)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean isBusinessServiceDisabled(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean isBusinessServiceDownHierarchyDisabled(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean isCombinationDisabled(long serviceId, long serviceTypeId,
        long channelId, long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceidAndStatus(
        long srvid, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;
}
