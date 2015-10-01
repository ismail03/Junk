/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.practical.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.practical.model.Orders;

/**
 * The persistence interface for the orders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author saifulla
 * @see OrdersPersistenceImpl
 * @see OrdersUtil
 * @generated
 */
public interface OrdersPersistence extends BasePersistence<Orders> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrdersUtil} to access the orders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the orderses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orderses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @return the range of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orderses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first orders in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orders
	* @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the first orders in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orders, or <code>null</code> if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last orders in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orders
	* @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the last orders in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orders, or <code>null</code> if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the orderses before and after the current orders in the ordered set where groupId = &#63;.
	*
	* @param orderid the primary key of the current orders
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next orders
	* @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders[] findByGroupId_PrevAndNext(
		long orderid, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Removes all the orderses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orderses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the orderses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orderses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @return the range of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orderses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first orders in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orders
	* @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the first orders in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orders, or <code>null</code> if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last orders in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orders
	* @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the last orders in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orders, or <code>null</code> if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the orderses before and after the current orders in the ordered set where companyId = &#63;.
	*
	* @param orderid the primary key of the current orders
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next orders
	* @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders[] findByCompanyId_PrevAndNext(
		long orderid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Removes all the orderses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orderses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the orderses where productname = &#63;.
	*
	* @param productname the productname
	* @return the matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByproductname(
		java.lang.String productname)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orderses where productname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productname the productname
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @return the range of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByproductname(
		java.lang.String productname, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orderses where productname = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productname the productname
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByproductname(
		java.lang.String productname, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first orders in the ordered set where productname = &#63;.
	*
	* @param productname the productname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orders
	* @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByproductname_First(
		java.lang.String productname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the first orders in the ordered set where productname = &#63;.
	*
	* @param productname the productname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orders, or <code>null</code> if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByproductname_First(
		java.lang.String productname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last orders in the ordered set where productname = &#63;.
	*
	* @param productname the productname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orders
	* @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByproductname_Last(
		java.lang.String productname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the last orders in the ordered set where productname = &#63;.
	*
	* @param productname the productname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orders, or <code>null</code> if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByproductname_Last(
		java.lang.String productname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the orderses before and after the current orders in the ordered set where productname = &#63;.
	*
	* @param orderid the primary key of the current orders
	* @param productname the productname
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next orders
	* @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders[] findByproductname_PrevAndNext(
		long orderid, java.lang.String productname,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Removes all the orderses where productname = &#63; from the database.
	*
	* @param productname the productname
	* @throws SystemException if a system exception occurred
	*/
	public void removeByproductname(java.lang.String productname)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orderses where productname = &#63;.
	*
	* @param productname the productname
	* @return the number of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public int countByproductname(java.lang.String productname)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the orderses where groupId = &#63; and orderstatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @return the matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByG_O(
		long groupId, int orderstatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orderses where groupId = &#63; and orderstatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @return the range of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByG_O(
		long groupId, int orderstatus, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orderses where groupId = &#63; and orderstatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findByG_O(
		long groupId, int orderstatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orders
	* @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByG_O_First(long groupId,
		int orderstatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the first orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching orders, or <code>null</code> if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByG_O_First(long groupId,
		int orderstatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orders
	* @throws com.liferay.practical.NoSuchOrdersException if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByG_O_Last(long groupId,
		int orderstatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the last orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching orders, or <code>null</code> if a matching orders could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByG_O_Last(long groupId,
		int orderstatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the orderses before and after the current orders in the ordered set where groupId = &#63; and orderstatus = &#63;.
	*
	* @param orderid the primary key of the current orders
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next orders
	* @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders[] findByG_O_PrevAndNext(
		long orderid, long groupId, int orderstatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Removes all the orderses where groupId = &#63; and orderstatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_O(long groupId, int orderstatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orderses where groupId = &#63; and orderstatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderstatus the orderstatus
	* @return the number of matching orderses
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_O(long groupId, int orderstatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the orders in the entity cache if it is enabled.
	*
	* @param orders the orders
	*/
	public void cacheResult(com.liferay.practical.model.Orders orders);

	/**
	* Caches the orderses in the entity cache if it is enabled.
	*
	* @param orderses the orderses
	*/
	public void cacheResult(
		java.util.List<com.liferay.practical.model.Orders> orderses);

	/**
	* Creates a new orders with the primary key. Does not add the orders to the database.
	*
	* @param orderid the primary key for the new orders
	* @return the new orders
	*/
	public com.liferay.practical.model.Orders create(long orderid);

	/**
	* Removes the orders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderid the primary key of the orders
	* @return the orders that was removed
	* @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders remove(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	public com.liferay.practical.model.Orders updateImpl(
		com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the orders with the primary key or throws a {@link com.liferay.practical.NoSuchOrdersException} if it could not be found.
	*
	* @param orderid the primary key of the orders
	* @return the orders
	* @throws com.liferay.practical.NoSuchOrdersException if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders findByPrimaryKey(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.practical.NoSuchOrdersException;

	/**
	* Returns the orders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderid the primary key of the orders
	* @return the orders, or <code>null</code> if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.practical.model.Orders fetchByPrimaryKey(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the orderses.
	*
	* @return the orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @return the range of orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of orderses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Orders> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the orderses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orderses.
	*
	* @return the number of orderses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the categories associated with the orders.
	*
	* @param pk the primary key of the orders
	* @return the categories associated with the orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Category> getCategories(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the categories associated with the orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the orders
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @return the range of categories associated with the orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Category> getCategories(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the categories associated with the orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the orders
	* @param start the lower bound of the range of orderses
	* @param end the upper bound of the range of orderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of categories associated with the orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.practical.model.Category> getCategories(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of categories associated with the orders.
	*
	* @param pk the primary key of the orders
	* @return the number of categories associated with the orders
	* @throws SystemException if a system exception occurred
	*/
	public int getCategoriesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the category is associated with the orders.
	*
	* @param pk the primary key of the orders
	* @param categoryPK the primary key of the category
	* @return <code>true</code> if the category is associated with the orders; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsCategory(long pk, long categoryPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the orders has any categories associated with it.
	*
	* @param pk the primary key of the orders to check for associations with categories
	* @return <code>true</code> if the orders has any categories associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsCategories(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the orders and the category. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param categoryPK the primary key of the category
	* @throws SystemException if a system exception occurred
	*/
	public void addCategory(long pk, long categoryPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the orders and the category. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param category the category
	* @throws SystemException if a system exception occurred
	*/
	public void addCategory(long pk,
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the orders and the categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param categoryPKs the primary keys of the categories
	* @throws SystemException if a system exception occurred
	*/
	public void addCategories(long pk, long[] categoryPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the orders and the categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param categories the categories
	* @throws SystemException if a system exception occurred
	*/
	public void addCategories(long pk,
		java.util.List<com.liferay.practical.model.Category> categories)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the orders and its categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders to clear the associated categories from
	* @throws SystemException if a system exception occurred
	*/
	public void clearCategories(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the orders and the category. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param categoryPK the primary key of the category
	* @throws SystemException if a system exception occurred
	*/
	public void removeCategory(long pk, long categoryPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the orders and the category. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param category the category
	* @throws SystemException if a system exception occurred
	*/
	public void removeCategory(long pk,
		com.liferay.practical.model.Category category)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the orders and the categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param categoryPKs the primary keys of the categories
	* @throws SystemException if a system exception occurred
	*/
	public void removeCategories(long pk, long[] categoryPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the orders and the categories. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param categories the categories
	* @throws SystemException if a system exception occurred
	*/
	public void removeCategories(long pk,
		java.util.List<com.liferay.practical.model.Category> categories)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the categories associated with the orders, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param categoryPKs the primary keys of the categories to be associated with the orders
	* @throws SystemException if a system exception occurred
	*/
	public void setCategories(long pk, long[] categoryPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the categories associated with the orders, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the orders
	* @param categories the categories to be associated with the orders
	* @throws SystemException if a system exception occurred
	*/
	public void setCategories(long pk,
		java.util.List<com.liferay.practical.model.Category> categories)
		throws com.liferay.portal.kernel.exception.SystemException;
}