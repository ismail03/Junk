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
 * Provides the local service interface for PaymentTransactionDetails. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionDetailsLocalServiceUtil
 * @see com.stc.echannels.epayments.service.base.PaymentTransactionDetailsLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.impl.PaymentTransactionDetailsLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface PaymentTransactionDetailsLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaymentTransactionDetailsLocalServiceUtil} to access the payment transaction details local service. Add custom service methods to {@link com.stc.echannels.epayments.service.impl.PaymentTransactionDetailsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the payment transaction details to the database. Also notifies the appropriate model listeners.
    *
    * @param paymentTransactionDetails the payment transaction details
    * @return the payment transaction details that was added
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactionDetails addPaymentTransactionDetails(
        com.stc.echannels.epayments.model.PaymentTransactionDetails paymentTransactionDetails)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new payment transaction details with the primary key. Does not add the payment transaction details to the database.
    *
    * @param paymentTransactionDetailsPK the primary key for the new payment transaction details
    * @return the new payment transaction details
    */
    public com.stc.echannels.epayments.model.PaymentTransactionDetails createPaymentTransactionDetails(
        com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK paymentTransactionDetailsPK);

    /**
    * Deletes the payment transaction details with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentTransactionDetailsPK the primary key of the payment transaction details
    * @return the payment transaction details that was removed
    * @throws PortalException if a payment transaction details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactionDetails deletePaymentTransactionDetails(
        com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the payment transaction details from the database. Also notifies the appropriate model listeners.
    *
    * @param paymentTransactionDetails the payment transaction details
    * @return the payment transaction details that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactionDetails deletePaymentTransactionDetails(
        com.stc.echannels.epayments.model.PaymentTransactionDetails paymentTransactionDetails)
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public com.stc.echannels.epayments.model.PaymentTransactionDetails fetchPaymentTransactionDetails(
        com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the payment transaction details with the primary key.
    *
    * @param paymentTransactionDetailsPK the primary key of the payment transaction details
    * @return the payment transaction details
    * @throws PortalException if a payment transaction details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.stc.echannels.epayments.model.PaymentTransactionDetails getPaymentTransactionDetails(
        com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK paymentTransactionDetailsPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the payment transaction detailses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of payment transaction detailses
    * @param end the upper bound of the range of payment transaction detailses (not inclusive)
    * @return the range of payment transaction detailses
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.stc.echannels.epayments.model.PaymentTransactionDetails> getPaymentTransactionDetailses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of payment transaction detailses.
    *
    * @return the number of payment transaction detailses
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getPaymentTransactionDetailsesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the payment transaction details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param paymentTransactionDetails the payment transaction details
    * @return the payment transaction details that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.PaymentTransactionDetails updatePaymentTransactionDetails(
        com.stc.echannels.epayments.model.PaymentTransactionDetails paymentTransactionDetails)
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
}