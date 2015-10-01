package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for CardGroup. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.CardGroupLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see CardGroupLocalService
 * @see com.stc.echannels.epayments.service.base.CardGroupLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.CardGroupLocalServiceImpl
 * @generated
 */
public class CardGroupLocalServiceUtil {
    private static CardGroupLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.CardGroupLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the card group to the database. Also notifies the appropriate model listeners.
    *
    * @param cardGroup the card group
    * @return the card group that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup addCardGroup(
        com.stc.echannels.epayments.model.CardGroup cardGroup)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addCardGroup(cardGroup);
    }

    /**
    * Creates a new card group with the primary key. Does not add the card group to the database.
    *
    * @param transId the primary key for the new card group
    * @return the new card group
    */
    public static com.stc.echannels.epayments.model.CardGroup createCardGroup(
        java.lang.String transId) {
        return getService().createCardGroup(transId);
    }

    /**
    * Deletes the card group with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the card group
    * @return the card group that was removed
    * @throws PortalException if a card group with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup deleteCardGroup(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCardGroup(transId);
    }

    /**
    * Deletes the card group from the database. Also notifies the appropriate model listeners.
    *
    * @param cardGroup the card group
    * @return the card group that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup deleteCardGroup(
        com.stc.echannels.epayments.model.CardGroup cardGroup)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCardGroup(cardGroup);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.stc.echannels.epayments.model.CardGroup fetchCardGroup(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchCardGroup(transId);
    }

    /**
    * Returns the card group with the primary key.
    *
    * @param transId the primary key of the card group
    * @return the card group
    * @throws PortalException if a card group with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup getCardGroup(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getCardGroup(transId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> getCardGroups(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCardGroups(start, end);
    }

    /**
    * Returns the number of card groups.
    *
    * @return the number of card groups
    * @throws SystemException if a system exception occurred
    */
    public static int getCardGroupsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCardGroupsCount();
    }

    /**
    * Updates the card group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param cardGroup the card group
    * @return the card group that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.CardGroup updateCardGroup(
        com.stc.echannels.epayments.model.CardGroup cardGroup)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateCardGroup(cardGroup);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.stc.echannels.epayments.model.CardGroup addCardGroup(
        java.lang.String cardGroupId, long cardValue, long promotionValue,
        java.lang.String inPaymentSystem, long serviceId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addCardGroup(cardGroupId, cardValue, promotionValue,
            inPaymentSystem, serviceId, serviceContext);
    }

    public static com.stc.echannels.epayments.model.CardGroup updateCardGroup(
        java.lang.String transId, java.lang.String cardGroupId, long cardValue,
        long promotionValue, java.lang.String inPaymentSystem, long serviceId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateCardGroup(transId, cardGroupId, cardValue,
            promotionValue, inPaymentSystem, serviceId, serviceContext);
    }

    public static java.util.List<com.stc.echannels.epayments.model.CardGroup> getCardGroups()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCardGroups();
    }

    public static com.stc.echannels.epayments.model.CardGroup deleteCardGroup(
        java.lang.String transId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCardGroup(transId, serviceContext);
    }

    public static void deleteCardGroups()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteCardGroups();
    }

    public static void clearService() {
        _service = null;
    }

    public static CardGroupLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    CardGroupLocalService.class.getName());

            if (invokableLocalService instanceof CardGroupLocalService) {
                _service = (CardGroupLocalService) invokableLocalService;
            } else {
                _service = new CardGroupLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(CardGroupLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(CardGroupLocalService service) {
    }
}