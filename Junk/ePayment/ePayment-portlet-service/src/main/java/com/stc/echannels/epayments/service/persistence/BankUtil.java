package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.stc.echannels.epayments.model.Bank;

import java.util.List;

/**
 * The persistence utility for the bank service. This utility wraps {@link BankPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankPersistence
 * @see BankPersistenceImpl
 * @generated
 */
public class BankUtil {
    private static BankPersistence _persistence;

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
    public static void clearCache(Bank bank) {
        getPersistence().clearCache(bank);
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
    public static List<Bank> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Bank> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Bank> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Bank update(Bank bank) throws SystemException {
        return getPersistence().update(bank);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Bank update(Bank bank, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(bank, serviceContext);
    }

    /**
    * Returns all the banks where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @return the matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByBankId(
        java.lang.String bankId, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bankId, status);
    }

    /**
    * Returns a range of all the banks where bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @return the range of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByBankId(
        java.lang.String bankId, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bankId, status, start, end);
    }

    /**
    * Returns an ordered range of all the banks where bankId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bankId the bank ID
    * @param status the status
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByBankId(
        java.lang.String bankId, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankId(bankId, status, start, end, orderByComparator);
    }

    /**
    * Returns the first bank in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank findByBankId_First(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence()
                   .findByBankId_First(bankId, status, orderByComparator);
    }

    /**
    * Returns the first bank in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank, or <code>null</code> if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank fetchByBankId_First(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBankId_First(bankId, status, orderByComparator);
    }

    /**
    * Returns the last bank in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank findByBankId_Last(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence()
                   .findByBankId_Last(bankId, status, orderByComparator);
    }

    /**
    * Returns the last bank in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank, or <code>null</code> if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank fetchByBankId_Last(
        java.lang.String bankId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByBankId_Last(bankId, status, orderByComparator);
    }

    /**
    * Returns the banks before and after the current bank in the ordered set where bankId = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current bank
    * @param bankId the bank ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank[] findByBankId_PrevAndNext(
        java.lang.String transId, java.lang.String bankId,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence()
                   .findByBankId_PrevAndNext(transId, bankId, status,
            orderByComparator);
    }

    /**
    * Removes all the banks where bankId = &#63; and status = &#63; from the database.
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
    * Returns the number of banks where bankId = &#63; and status = &#63;.
    *
    * @param bankId the bank ID
    * @param status the status
    * @return the number of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static int countByBankId(java.lang.String bankId,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBankId(bankId, status);
    }

    /**
    * Returns all the banks where status = &#63;.
    *
    * @param status the status
    * @return the matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status);
    }

    /**
    * Returns a range of all the banks where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @return the range of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStatus(status, start, end);
    }

    /**
    * Returns an ordered range of all the banks where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByStatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStatus(status, start, end, orderByComparator);
    }

    /**
    * Returns the first bank in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank findByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence().findByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the first bank in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank, or <code>null</code> if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank fetchByStatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_First(status, orderByComparator);
    }

    /**
    * Returns the last bank in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank findByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence().findByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the last bank in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank, or <code>null</code> if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank fetchByStatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStatus_Last(status, orderByComparator);
    }

    /**
    * Returns the banks before and after the current bank in the ordered set where status = &#63;.
    *
    * @param transId the primary key of the current bank
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank[] findByStatus_PrevAndNext(
        java.lang.String transId, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence()
                   .findByStatus_PrevAndNext(transId, status, orderByComparator);
    }

    /**
    * Removes all the banks where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStatus(status);
    }

    /**
    * Returns the number of banks where status = &#63;.
    *
    * @param status the status
    * @return the number of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static int countByStatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStatus(status);
    }

    /**
    * Returns all the banks where stcCode = &#63; and status = &#63;.
    *
    * @param stcCode the stc code
    * @param status the status
    * @return the matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByStcCode(
        java.lang.String stcCode, java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStcCode(stcCode, status);
    }

    /**
    * Returns a range of all the banks where stcCode = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcCode the stc code
    * @param status the status
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @return the range of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByStcCode(
        java.lang.String stcCode, java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStcCode(stcCode, status, start, end);
    }

    /**
    * Returns an ordered range of all the banks where stcCode = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param stcCode the stc code
    * @param status the status
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findByStcCode(
        java.lang.String stcCode, java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStcCode(stcCode, status, start, end, orderByComparator);
    }

    /**
    * Returns the first bank in the ordered set where stcCode = &#63; and status = &#63;.
    *
    * @param stcCode the stc code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank findByStcCode_First(
        java.lang.String stcCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence()
                   .findByStcCode_First(stcCode, status, orderByComparator);
    }

    /**
    * Returns the first bank in the ordered set where stcCode = &#63; and status = &#63;.
    *
    * @param stcCode the stc code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching bank, or <code>null</code> if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank fetchByStcCode_First(
        java.lang.String stcCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStcCode_First(stcCode, status, orderByComparator);
    }

    /**
    * Returns the last bank in the ordered set where stcCode = &#63; and status = &#63;.
    *
    * @param stcCode the stc code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank findByStcCode_Last(
        java.lang.String stcCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence()
                   .findByStcCode_Last(stcCode, status, orderByComparator);
    }

    /**
    * Returns the last bank in the ordered set where stcCode = &#63; and status = &#63;.
    *
    * @param stcCode the stc code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching bank, or <code>null</code> if a matching bank could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank fetchByStcCode_Last(
        java.lang.String stcCode, java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStcCode_Last(stcCode, status, orderByComparator);
    }

    /**
    * Returns the banks before and after the current bank in the ordered set where stcCode = &#63; and status = &#63;.
    *
    * @param transId the primary key of the current bank
    * @param stcCode the stc code
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank[] findByStcCode_PrevAndNext(
        java.lang.String transId, java.lang.String stcCode,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence()
                   .findByStcCode_PrevAndNext(transId, stcCode, status,
            orderByComparator);
    }

    /**
    * Removes all the banks where stcCode = &#63; and status = &#63; from the database.
    *
    * @param stcCode the stc code
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStcCode(java.lang.String stcCode,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStcCode(stcCode, status);
    }

    /**
    * Returns the number of banks where stcCode = &#63; and status = &#63;.
    *
    * @param stcCode the stc code
    * @param status the status
    * @return the number of matching banks
    * @throws SystemException if a system exception occurred
    */
    public static int countByStcCode(java.lang.String stcCode,
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStcCode(stcCode, status);
    }

    /**
    * Caches the bank in the entity cache if it is enabled.
    *
    * @param bank the bank
    */
    public static void cacheResult(com.stc.echannels.epayments.model.Bank bank) {
        getPersistence().cacheResult(bank);
    }

    /**
    * Caches the banks in the entity cache if it is enabled.
    *
    * @param banks the banks
    */
    public static void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.Bank> banks) {
        getPersistence().cacheResult(banks);
    }

    /**
    * Creates a new bank with the primary key. Does not add the bank to the database.
    *
    * @param transId the primary key for the new bank
    * @return the new bank
    */
    public static com.stc.echannels.epayments.model.Bank create(
        java.lang.String transId) {
        return getPersistence().create(transId);
    }

    /**
    * Removes the bank with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param transId the primary key of the bank
    * @return the bank that was removed
    * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank remove(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence().remove(transId);
    }

    public static com.stc.echannels.epayments.model.Bank updateImpl(
        com.stc.echannels.epayments.model.Bank bank)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bank);
    }

    /**
    * Returns the bank with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchBankException} if it could not be found.
    *
    * @param transId the primary key of the bank
    * @return the bank
    * @throws com.stc.echannels.epayments.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank findByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchBankException {
        return getPersistence().findByPrimaryKey(transId);
    }

    /**
    * Returns the bank with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param transId the primary key of the bank
    * @return the bank, or <code>null</code> if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.stc.echannels.epayments.model.Bank fetchByPrimaryKey(
        java.lang.String transId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(transId);
    }

    /**
    * Returns all the banks.
    *
    * @return the banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the banks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of banks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.stc.echannels.epayments.model.Bank> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the banks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of banks.
    *
    * @return the number of banks
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BankPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BankPersistence) PortletBeanLocatorUtil.locate(com.stc.echannels.epayments.service.ClpSerializer.getServletContextName(),
                    BankPersistence.class.getName());

            ReferenceRegistry.registerReference(BankUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BankPersistence persistence) {
    }
}
