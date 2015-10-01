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
 * Provides a wrapper for {@link OrdersService}.
 *
 * @author saifulla
 * @see OrdersService
 * @generated
 */
public class OrdersServiceWrapper implements OrdersService,
	ServiceWrapper<OrdersService> {
	public OrdersServiceWrapper(OrdersService ordersService) {
		_ordersService = ordersService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ordersService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ordersService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ordersService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OrdersService getWrappedOrdersService() {
		return _ordersService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOrdersService(OrdersService ordersService) {
		_ordersService = ordersService;
	}

	@Override
	public OrdersService getWrappedService() {
		return _ordersService;
	}

	@Override
	public void setWrappedService(OrdersService ordersService) {
		_ordersService = ordersService;
	}

	private OrdersService _ordersService;
}