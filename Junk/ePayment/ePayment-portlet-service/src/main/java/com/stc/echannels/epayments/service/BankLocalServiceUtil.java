package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Bank. This utility wraps
 * {@link com.stc.echannels.epayments.service.impl.BankLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ahmed_fadlus
 * @see BankLocalService
 * @see com.stc.echannels.epayments.service.base.BankLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.BankLocalServiceImpl
 * @generated
 */
public class BankLocalServiceUtil {
    private static BankLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.BankLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the bank to the database. Also notifies the appropriate model listeners.
    *
    * @param bank the bank
    * @return the bank that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank addBank(
        com.stc.echannels.epayments.model.Bank bank)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBank(bank);
    }

    /**
    * Creates a new bank with the primary key. Does not add the bank to the database.
    *
    * @param transId the primary key for the new bank
    * @return the new bank
    */
    public static com.stc.echannels.epayments.model.Bank createBank(
        java.lang.String transId) {
        return getService().createBank(transId);
    }

    /**
    * Deletes the bank with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the bank
    * @return the bank that was removed
    * @throws PortalException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank deleteBank(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBank(transId);
    }

    /**
    * Deletes the bank from the database. Also notifies the appropriate model listeners.
    *
    * @param bank the bank
    * @return the bank that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank deleteBank(
        com.stc.echannels.epayments.model.Bank bank)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBank(bank);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.stc.echannels.epayments.model.Bank fetchBank(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBank(transId);
    }

    /**
    * Returns the bank with the primary key.
    *
    * @param transId the primary key of the bank
    * @return the bank
    * @throws PortalException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank getBank(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBank(transId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the banks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @return the range of banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> getBanks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBanks(start, end);
    }

    /**
    * Returns the number of banks.
    *
    * @return the number of banks
    * @throws SystemException if a system exception occurred
    */
    public static int getBanksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBanksCount();
    }

    /**
    * Updates the bank in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bank the bank
    * @return the bank that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank updateBank(
        com.stc.echannels.epayments.model.Bank bank)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBank(bank);
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

    public static com.stc.echannels.epayments.model.Bank addBank(
        java.lang.String bankId, java.lang.String stcCode,
        java.lang.String nameAr, java.lang.String nameEn,
        java.lang.String comments,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addBank(bankId, stcCode, nameAr, nameEn, comments,
            serviceContext);
    }

    public static com.stc.echannels.epayments.model.Bank updateBank(
        java.lang.String transId, java.lang.String bankId,
        java.lang.String stcCode, java.lang.String nameAr,
        java.lang.String nameEn, java.lang.String comments,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateBank(transId, bankId, stcCode, nameAr, nameEn,
            comments, serviceContext);
    }

    public static java.util.List<com.stc.echannels.epayments.model.Bank> getBanks()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBanks();
    }

    public static java.util.List<com.stc.echannels.epayments.model.Bank> getBanks(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBanks(status, start, end);
    }

    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> getBankBranchs(
        java.lang.String bankId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBankBranchs(bankId);
    }

    public static void deleteBanks()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteBanks();
    }

    public static com.stc.echannels.epayments.model.Bank deleteBank(
        java.lang.String transId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBank(transId, serviceContext);
    }

    public static java.util.List<com.stc.echannels.epayments.model.Bank> getBanksByServiceId(
        long serviceid) {
        return getService().getBanksByServiceId(serviceid);
    }

    public static boolean isSamaBankCodeExists(java.lang.String samabnkcode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isSamaBankCodeExists(samabnkcode);
    }

    public static boolean isStcBankCodeExists(java.lang.String stcCode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isStcBankCodeExists(stcCode);
    }

    public static boolean isEnnameExists(java.lang.String nameEn,
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isEnnameExists(nameEn, transId);
    }

    public static boolean isArnameExists(java.lang.String nameAr,
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().isArnameExists(nameAr, transId);
    }

    public static void clearService() {
        _service = null;
    }

    public static BankLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BankLocalService.class.getName());

            if (invokableLocalService instanceof BankLocalService) {
                _service = (BankLocalService) invokableLocalService;
            } else {
                _service = new BankLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BankLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BankLocalService service) {
    }
}
