package com.stc.echannels.epayments.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EPayAccessControlLocalService}.
 *
 * @author ahmed_fadlus
 * @see EPayAccessControlLocalService
 * @generated
 */
public class EPayAccessControlLocalServiceWrapper
    implements EPayAccessControlLocalService,
        ServiceWrapper<EPayAccessControlLocalService> {
    private EPayAccessControlLocalService _ePayAccessControlLocalService;

    public EPayAccessControlLocalServiceWrapper(
        EPayAccessControlLocalService ePayAccessControlLocalService) {
        _ePayAccessControlLocalService = ePayAccessControlLocalService;
    }

    /**
    * Adds the e pay access control to the database. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.EPayAccessControl addEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.addEPayAccessControl(ePayAccessControl);
    }

    /**
    * Creates a new e pay access control with the primary key. Does not add the e pay access control to the database.
    *
    * @param epayCofignId the primary key for the new e pay access control
    * @return the new e pay access control
    */
    @Override
    public com.stc.echannels.epayments.model.EPayAccessControl createEPayAccessControl(
        long epayCofignId) {
        return _ePayAccessControlLocalService.createEPayAccessControl(epayCofignId);
    }

    /**
    * Deletes the e pay access control with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control that was removed
    * @throws PortalException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.EPayAccessControl deleteEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.deleteEPayAccessControl(epayCofignId);
    }

    /**
    * Deletes the e pay access control from the database. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.EPayAccessControl deleteEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.deleteEPayAccessControl(ePayAccessControl);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _ePayAccessControlLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.dynamicQuery(dynamicQuery);
    }

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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.stc.echannels.epayments.model.EPayAccessControl fetchEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.fetchEPayAccessControl(epayCofignId);
    }

    /**
    * Returns the e pay access control with the primary key.
    *
    * @param epayCofignId the primary key of the e pay access control
    * @return the e pay access control
    * @throws PortalException if a e pay access control with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.EPayAccessControl getEPayAccessControl(
        long epayCofignId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.getEPayAccessControl(epayCofignId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.getPersistedModel(primaryKeyObj);
    }

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
    @Override
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> getEPayAccessControls(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.getEPayAccessControls(start, end);
    }

    /**
    * Returns the number of e pay access controls.
    *
    * @return the number of e pay access controls
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEPayAccessControlsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.getEPayAccessControlsCount();
    }

    /**
    * Updates the e pay access control in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ePayAccessControl the e pay access control
    * @return the e pay access control that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.stc.echannels.epayments.model.EPayAccessControl updateEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl ePayAccessControl)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.updateEPayAccessControl(ePayAccessControl);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ePayAccessControlLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ePayAccessControlLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ePayAccessControlLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.custommodel.AccessControlModel> findActiveEpayAccessControlByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.findActiveEpayAccessControlByServiceType(serviceTypeId);
    }

    @Override
    public void enableEPayAcessControl(long[] ids,
        com.stc.echannels.epayments.model.EPayAccessControl epac)
        throws com.liferay.portal.kernel.exception.SystemException {
        _ePayAccessControlLocalService.enableEPayAcessControl(ids, epac);
    }

    @Override
    public void addEPayAcessControl(
        java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> accessControls)
        throws com.liferay.portal.kernel.exception.SystemException {
        _ePayAccessControlLocalService.addEPayAcessControl(accessControls);
    }

    @Override
    public boolean isBusinessServiceDisabled(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.isBusinessServiceDisabled(serviceId);
    }

    @Override
    public boolean isBusinessServiceDownHierarchyDisabled(long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.isBusinessServiceDownHierarchyDisabled(serviceId);
    }

    @Override
    public boolean isCombinationDisabled(long serviceId, long serviceTypeId,
        long channelId, long pmtMethodId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.isCombinationDisabled(serviceId,
            serviceTypeId, channelId, pmtMethodId);
    }

    @Override
    public java.util.List<com.stc.echannels.epayments.model.EPayAccessControl> findByServiceidAndStatus(
        long srvid, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ePayAccessControlLocalService.findByServiceidAndStatus(srvid,
            status);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EPayAccessControlLocalService getWrappedEPayAccessControlLocalService() {
        return _ePayAccessControlLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEPayAccessControlLocalService(
        EPayAccessControlLocalService ePayAccessControlLocalService) {
        _ePayAccessControlLocalService = ePayAccessControlLocalService;
    }

    @Override
    public EPayAccessControlLocalService getWrappedService() {
        return _ePayAccessControlLocalService;
    }

    @Override
    public void setWrappedService(
        EPayAccessControlLocalService ePayAccessControlLocalService) {
        _ePayAccessControlLocalService = ePayAccessControlLocalService;
    }
}
