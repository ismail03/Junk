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

package com.liferay.practical.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OrdersLocalService}.
 *
 * @author saifulla
 * @see OrdersLocalService
 * @generated
 */
public class OrdersLocalServiceWrapper implements OrdersLocalService,
	ServiceWrapper<OrdersLocalService> {
	public OrdersLocalServiceWrapper(OrdersLocalService ordersLocalService) {
		_ordersLocalService = ordersLocalService;
	}

	/**
	* Adds the orders to the database. Also notifies the appropriate model listeners.
	*
	* @param orders the orders
	* @return the orders that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Orders addOrders(
		com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.addOrders(orders);
	}

	/**
	* Creates a new orders with the primary key. Does not add the orders to the database.
	*
	* @param orderid the primary key for the new orders
	* @return the new orders
	*/
	@Override
	public com.liferay.practical.model.Orders createOrders(long orderid) {
		return _ordersLocalService.createOrders(orderid);
	}

	/**
	* Deletes the orders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderid the primary key of the orders
	* @return the orders that was removed
	* @throws PortalException if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Orders deleteOrders(long orderid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.deleteOrders(orderid);
	}

	/**
	* Deletes the orders from the database. Also notifies the appropriate model listeners.
	*
	* @param orders the orders
	* @return the orders that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Orders deleteOrders(
		com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.deleteOrders(orders);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ordersLocalService.dynamicQuery();
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
		return _ordersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ordersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.practical.model.impl.OrdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ordersLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _ordersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ordersLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.practical.model.Orders fetchOrders(long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.fetchOrders(orderid);
	}

	/**
	* Returns the orders with the primary key.
	*
	* @param orderid the primary key of the orders
	* @return the orders
	* @throws PortalException if a orders with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Orders getOrders(long orderid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.getOrders(orderid);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.liferay.practical.model.Orders> getOrderses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.getOrderses(start, end);
	}

	/**
	* Returns the number of orderses.
	*
	* @return the number of orderses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOrdersesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.getOrdersesCount();
	}

	/**
	* Updates the orders in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param orders the orders
	* @return the orders that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.practical.model.Orders updateOrders(
		com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.updateOrders(orders);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCategoryOrders(long categoryid, long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.addCategoryOrders(categoryid, orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCategoryOrders(long categoryid,
		com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.addCategoryOrders(categoryid, orders);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCategoryOrderses(long categoryid, long[] orderids)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.addCategoryOrderses(categoryid, orderids);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCategoryOrderses(long categoryid,
		java.util.List<com.liferay.practical.model.Orders> Orderses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.addCategoryOrderses(categoryid, Orderses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearCategoryOrderses(long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.clearCategoryOrderses(categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCategoryOrders(long categoryid, long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.deleteCategoryOrders(categoryid, orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCategoryOrders(long categoryid,
		com.liferay.practical.model.Orders orders)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.deleteCategoryOrders(categoryid, orders);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCategoryOrderses(long categoryid, long[] orderids)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.deleteCategoryOrderses(categoryid, orderids);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCategoryOrderses(long categoryid,
		java.util.List<com.liferay.practical.model.Orders> Orderses)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.deleteCategoryOrderses(categoryid, Orderses);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.practical.model.Orders> getCategoryOrderses(
		long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.getCategoryOrderses(categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.practical.model.Orders> getCategoryOrderses(
		long categoryid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.getCategoryOrderses(categoryid, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.practical.model.Orders> getCategoryOrderses(
		long categoryid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.getCategoryOrderses(categoryid, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCategoryOrdersesCount(long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.getCategoryOrdersesCount(categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasCategoryOrders(long categoryid, long orderid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.hasCategoryOrders(categoryid, orderid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasCategoryOrderses(long categoryid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.hasCategoryOrderses(categoryid);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setCategoryOrderses(long categoryid, long[] orderids)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ordersLocalService.setCategoryOrderses(categoryid, orderids);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ordersLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ordersLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ordersLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.liferay.practical.model.Orders> findBypendingorders(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ordersLocalService.findBypendingorders(groupId, status);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OrdersLocalService getWrappedOrdersLocalService() {
		return _ordersLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOrdersLocalService(
		OrdersLocalService ordersLocalService) {
		_ordersLocalService = ordersLocalService;
	}

	@Override
	public OrdersLocalService getWrappedService() {
		return _ordersLocalService;
	}

	@Override
	public void setWrappedService(OrdersLocalService ordersLocalService) {
		_ordersLocalService = ordersLocalService;
	}

	private OrdersLocalService _ordersLocalService;
}