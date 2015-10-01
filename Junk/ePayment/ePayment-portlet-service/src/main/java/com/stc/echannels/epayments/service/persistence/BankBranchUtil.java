package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.BankBranch;

import java.util.List;

/**
 * The persistence utility for the bank branch service. This utility wraps {@link BankBranchPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankBranchPersistence
 * @see BankBranchPersistenceImpl
 * @generated
 */
public class BankBranchUtil {
    private static BankBranchPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(BankBranch bankBranch) {
        getPersistence().clearCache(bankBranch);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<BankBranch> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BankBranch> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BankBranch> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BankBranch update(BankBranch bankBranch)
        throws SystemException {
        return getPersistence().update(bankBranch);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BankBranch update(BankBranch bankBranch,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(bankBranch, serviceContext);
    }

    /**
    * Returns all the bank branchs where status = &#63;.
    *
    * @param status the status
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

    /**
    * Returns a range of all the bank branchs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

    /**
    * Returns an ordered range of all the bank branchs where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where status = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch[] findByStatus_PrevAndNext(
        java.lang.String transId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByStatus_PrevAndNext(transId, status, orderByComparator);
    }

    /**
    * Removes all the bank branchs where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of bank branchs where status = &#63;.
    *
    * @param status the status
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Returns all the bank branchs where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankId(
        java.lang.String bankId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bankId, status);
    }

    /**
    * Returns a range of all the bank branchs where bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankId(
        java.lang.String bankId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bankId, status, start, end);
    }

    /**
    * Returns an ordered range of all the bank branchs where bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankId(
        java.lang.String bankId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankId(bankId, status, start, end, orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByBankId_First(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBankId_First(bankId, status, orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByBankId_First(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBankId_First(bankId, status, orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByBankId_Last(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBankId_Last(bankId, status, orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByBankId_Last(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBankId_Last(bankId, status, orderByComparator);
    }

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch[] findByBankId_PrevAndNext(
        java.lang.String transId, java.lang.String bankId,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBankId_PrevAndNext(transId, bankId, status,
            orderByComparator);
    }

    /**
    * Removes all the bank branchs where bankId = &#63; and status = &#63; from the database.
    *
    * @param bankId the bank ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBankId(java.lang.String bankId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBankId(bankId, status);
    }

    /**
    * Returns the number of bank branchs where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static int countByBankId(java.lang.String bankId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBankId(bankId, status);
    }

    /**
    * Returns all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankPaymentChannel(
        java.lang.String bankId, long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankPaymentChannel(bankId, channelId, status);
    }

    /**
    * Returns a range of all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankPaymentChannel(
        java.lang.String bankId, long channelId, java.lang.String status,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankPaymentChannel(bankId, channelId, status, start,
            end);
    }

    /**
    * Returns an ordered range of all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBankPaymentChannel(
        java.lang.String bankId, long channelId, java.lang.String status,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankPaymentChannel(bankId, channelId, status, start,
            end, orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByBankPaymentChannel_First(
        java.lang.String bankId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBankPaymentChannel_First(bankId, channelId, status,
            orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByBankPaymentChannel_First(
        java.lang.String bankId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBankPaymentChannel_First(bankId, channelId, status,
            orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByBankPaymentChannel_Last(
        java.lang.String bankId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBankPaymentChannel_Last(bankId, channelId, status,
            orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByBankPaymentChannel_Last(
        java.lang.String bankId, long channelId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBankPaymentChannel_Last(bankId, channelId, status,
            orderByComparator);
    }

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch[] findByBankPaymentChannel_PrevAndNext(
        java.lang.String transId, java.lang.String bankId, long channelId,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBankPaymentChannel_PrevAndNext(transId, bankId,
            channelId, status, orderByComparator);
    }

    /**
    * Removes all the bank branchs where bankId = &#63; and channelId = &#63; and status = &#63; from the database.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBankPaymentChannel(java.lang.String bankId,
        long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBankPaymentChannel(bankId, channelId, status);
    }

    /**
    * Returns the number of bank branchs where bankId = &#63; and channelId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param channelId the channel ID
    * @param status the status
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static int countByBankPaymentChannel(java.lang.String bankId,
        long channelId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByBankPaymentChannel(bankId, channelId, status);
    }

    /**
    * Returns all the bank branchs where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCode(
        java.lang.String stcBranchCode, java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBranchCode(stcBranchCode, active);
    }

    /**
    * Returns a range of all the bank branchs where stcBranchCode = &#63; and active = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCode(
        java.lang.String stcBranchCode, java.lang.String active, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBranchCode(stcBranchCode, active, start, end);
    }

    /**
    * Returns an ordered range of all the bank branchs where stcBranchCode = &#63; and active = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCode(
        java.lang.String stcBranchCode, java.lang.String active, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBranchCode(stcBranchCode, active, start, end,
            orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByBranchCode_First(
        java.lang.String stcBranchCode, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBranchCode_First(stcBranchCode, active,
            orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByBranchCode_First(
        java.lang.String stcBranchCode, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBranchCode_First(stcBranchCode, active,
            orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByBranchCode_Last(
        java.lang.String stcBranchCode, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBranchCode_Last(stcBranchCode, active,
            orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByBranchCode_Last(
        java.lang.String stcBranchCode, java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBranchCode_Last(stcBranchCode, active,
            orderByComparator);
    }

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where stcBranchCode = &#63; and active = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch[] findByBranchCode_PrevAndNext(
        java.lang.String transId, java.lang.String stcBranchCode,
        java.lang.String active,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBranchCode_PrevAndNext(transId, stcBranchCode,
            active, orderByComparator);
    }

    /**
    * Removes all the bank branchs where stcBranchCode = &#63; and active = &#63; from the database.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBranchCode(java.lang.String stcBranchCode,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBranchCode(stcBranchCode, active);
    }

    /**
    * Returns the number of bank branchs where stcBranchCode = &#63; and active = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param active the active
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static int countByBranchCode(java.lang.String stcBranchCode,
        java.lang.String active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBranchCode(stcBranchCode, active);
    }

    /**
    * Returns all the bank branchs where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @return the matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCodeAndStatus(
        java.lang.String stcBranchCode, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBranchCodeAndStatus(stcBranchCode, status);
    }

    /**
    * Returns a range of all the bank branchs where stcBranchCode = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCodeAndStatus(
        java.lang.String stcBranchCode, java.lang.String status, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBranchCodeAndStatus(stcBranchCode, status, start, end);
    }

    /**
    * Returns an ordered range of all the bank branchs where stcBranchCode = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findByBranchCodeAndStatus(
        java.lang.String stcBranchCode, java.lang.String status, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBranchCodeAndStatus(stcBranchCode, status, start,
            end, orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByBranchCodeAndStatus_First(
        java.lang.String stcBranchCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBranchCodeAndStatus_First(stcBranchCode, status,
            orderByComparator);
    }

    /**
    * Returns the first bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByBranchCodeAndStatus_First(
        java.lang.String stcBranchCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBranchCodeAndStatus_First(stcBranchCode, status,
            orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByBranchCodeAndStatus_Last(
        java.lang.String stcBranchCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBranchCodeAndStatus_Last(stcBranchCode, status,
            orderByComparator);
    }

    /**
    * Returns the last bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank branch, or <code>null</code> if a matching bank branch could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByBranchCodeAndStatus_Last(
        java.lang.String stcBranchCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBranchCodeAndStatus_Last(stcBranchCode, status,
            orderByComparator);
    }

    /**
    * Returns the bank branchs before and after the current bank branch in the ordered set where stcBranchCode = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current bank branch
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch[] findByBranchCodeAndStatus_PrevAndNext(
        java.lang.String transId, java.lang.String stcBranchCode,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence()
                   .findByBranchCodeAndStatus_PrevAndNext(transId,
            stcBranchCode, status, orderByComparator);
    }

    /**
    * Removes all the bank branchs where stcBranchCode = &#63; and status = &#63; from the database.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBranchCodeAndStatus(
        java.lang.String stcBranchCode, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBranchCodeAndStatus(stcBranchCode, status);
    }

    /**
    * Returns the number of bank branchs where stcBranchCode = &#63; and status = &#63;.
    *
    * @param stcBranchCode the stc branch code
    * @param status the status
    * @return the number of matching bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static int countByBranchCodeAndStatus(
        java.lang.String stcBranchCode, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBranchCodeAndStatus(stcBranchCode, status);
    }

    /**
    * Caches the bank branch in the entity cache if it is enabled.
    *
    * @param bankBranch the bank branch
    */
    public static void cacheResult(
        com.stc.echannels.epayments.model.BankBranch bankBranch) {
        getPersistence().cacheResult(bankBranch);
    }

    /**
    * Caches the bank branchs in the entity cache if it is enabled.
    *
    * @param bankBranchs the bank branchs
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.BankBranch> bankBranchs) {
        getPersistence().cacheResult(bankBranchs);
    }

    /**
    * Creates a new bank branch with the primary key. Does not add the bank branch to the database.
    *
    * @param transId the primary key for the new bank branch
    * @return the new bank branch
    */
    public static com.stc.echannels.epayments.model.BankBranch create(
        java.lang.String transId) {
        return getPersistence().create(transId);
    }

    /**
    * Removes the bank branch with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the bank branch
    * @return the bank branch that was removed
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence().remove(transId);
    }

    public static com.stc.echannels.epayments.model.BankBranch updateImpl(
        com.stc.echannels.epayments.model.BankBranch bankBranch)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bankBranch);
    }

    /**
    * Returns the bank branch with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBankBranchException} if it could not be found.
    *
    * @param transId the primary key of the bank branch
    * @return the bank branch
    * @throws com.stc.echannels.epayments.NoSuchBankBranchException if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankBranchException {
        return getPersistence().findByPrimaryKey(transId);
    }

    /**
    * Returns the bank branch with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the bank branch
    * @return the bank branch, or <code>null</code> if a bank branch with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.BankBranch fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(transId);
    }

    /**
    * Returns all the bank branchs.
    *
    * @return the bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the bank branchs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @return the range of bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the bank branchs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bank branchs
    * @param end the upper bound of the range of bank branchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.BankBranch> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the bank branchs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of bank branchs.
    *
    * @return the number of bank branchs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BankBranchPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BankBranchPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    BankBranchPersistence.class.getName());

            ReferenceRegistry.registerReference(BankBranchUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BankBranchPersistence persistence) {
    }
}
