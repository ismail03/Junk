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

package com.liferay.practical.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Orders}.
 * </p>
 *
 * @author saifulla
 * @see Orders
 * @generated
 */
public class OrdersWrapper implements Orders, ModelWrapper<Orders> {
	public OrdersWrapper(Orders orders) {
		_orders = orders;
	}

	@Override
	public Class<?> getModelClass() {
		return Orders.class;
	}

	@Override
	public String getModelClassName() {
		return Orders.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orderid", getOrderid());
		attributes.put("orderdate", getOrderdate());
		attributes.put("productname", getProductname());
		attributes.put("productpackage", getProductpackage());
		attributes.put("orderstatus", getOrderstatus());
		attributes.put("Subscription", getSubscription());
		attributes.put("documnetid", getDocumnetid());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusDate", getStatusDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long orderid = (Long)attributes.get("orderid");

		if (orderid != null) {
			setOrderid(orderid);
		}

		Date orderdate = (Date)attributes.get("orderdate");

		if (orderdate != null) {
			setOrderdate(orderdate);
		}

		String productname = (String)attributes.get("productname");

		if (productname != null) {
			setProductname(productname);
		}

		String productpackage = (String)attributes.get("productpackage");

		if (productpackage != null) {
			setProductpackage(productpackage);
		}

		Integer orderstatus = (Integer)attributes.get("orderstatus");

		if (orderstatus != null) {
			setOrderstatus(orderstatus);
		}

		Boolean Subscription = (Boolean)attributes.get("Subscription");

		if (Subscription != null) {
			setSubscription(Subscription);
		}

		Long documnetid = (Long)attributes.get("documnetid");

		if (documnetid != null) {
			setDocumnetid(documnetid);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	/**
	* Returns the primary key of this orders.
	*
	* @return the primary key of this orders
	*/
	@Override
	public long getPrimaryKey() {
		return _orders.getPrimaryKey();
	}

	/**
	* Sets the primary key of this orders.
	*
	* @param primaryKey the primary key of this orders
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_orders.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the orderid of this orders.
	*
	* @return the orderid of this orders
	*/
	@Override
	public long getOrderid() {
		return _orders.getOrderid();
	}

	/**
	* Sets the orderid of this orders.
	*
	* @param orderid the orderid of this orders
	*/
	@Override
	public void setOrderid(long orderid) {
		_orders.setOrderid(orderid);
	}

	/**
	* Returns the orderdate of this orders.
	*
	* @return the orderdate of this orders
	*/
	@Override
	public java.util.Date getOrderdate() {
		return _orders.getOrderdate();
	}

	/**
	* Sets the orderdate of this orders.
	*
	* @param orderdate the orderdate of this orders
	*/
	@Override
	public void setOrderdate(java.util.Date orderdate) {
		_orders.setOrderdate(orderdate);
	}

	/**
	* Returns the productname of this orders.
	*
	* @return the productname of this orders
	*/
	@Override
	public java.lang.String getProductname() {
		return _orders.getProductname();
	}

	/**
	* Sets the productname of this orders.
	*
	* @param productname the productname of this orders
	*/
	@Override
	public void setProductname(java.lang.String productname) {
		_orders.setProductname(productname);
	}

	/**
	* Returns the productpackage of this orders.
	*
	* @return the productpackage of this orders
	*/
	@Override
	public java.lang.String getProductpackage() {
		return _orders.getProductpackage();
	}

	/**
	* Sets the productpackage of this orders.
	*
	* @param productpackage the productpackage of this orders
	*/
	@Override
	public void setProductpackage(java.lang.String productpackage) {
		_orders.setProductpackage(productpackage);
	}

	/**
	* Returns the orderstatus of this orders.
	*
	* @return the orderstatus of this orders
	*/
	@Override
	public int getOrderstatus() {
		return _orders.getOrderstatus();
	}

	/**
	* Sets the orderstatus of this orders.
	*
	* @param orderstatus the orderstatus of this orders
	*/
	@Override
	public void setOrderstatus(int orderstatus) {
		_orders.setOrderstatus(orderstatus);
	}

	/**
	* Returns the subscription of this orders.
	*
	* @return the subscription of this orders
	*/
	@Override
	public boolean getSubscription() {
		return _orders.getSubscription();
	}

	/**
	* Returns <code>true</code> if this orders is subscription.
	*
	* @return <code>true</code> if this orders is subscription; <code>false</code> otherwise
	*/
	@Override
	public boolean isSubscription() {
		return _orders.isSubscription();
	}

	/**
	* Sets whether this orders is subscription.
	*
	* @param Subscription the subscription of this orders
	*/
	@Override
	public void setSubscription(boolean Subscription) {
		_orders.setSubscription(Subscription);
	}

	/**
	* Returns the documnetid of this orders.
	*
	* @return the documnetid of this orders
	*/
	@Override
	public long getDocumnetid() {
		return _orders.getDocumnetid();
	}

	/**
	* Sets the documnetid of this orders.
	*
	* @param documnetid the documnetid of this orders
	*/
	@Override
	public void setDocumnetid(long documnetid) {
		_orders.setDocumnetid(documnetid);
	}

	/**
	* Returns the status by user ID of this orders.
	*
	* @return the status by user ID of this orders
	*/
	@Override
	public long getStatusByUserId() {
		return _orders.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this orders.
	*
	* @param statusByUserId the status by user ID of this orders
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_orders.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this orders.
	*
	* @return the status by user uuid of this orders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orders.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this orders.
	*
	* @param statusByUserUuid the status by user uuid of this orders
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_orders.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status date of this orders.
	*
	* @return the status date of this orders
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _orders.getStatusDate();
	}

	/**
	* Sets the status date of this orders.
	*
	* @param statusDate the status date of this orders
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_orders.setStatusDate(statusDate);
	}

	/**
	* Returns the company ID of this orders.
	*
	* @return the company ID of this orders
	*/
	@Override
	public long getCompanyId() {
		return _orders.getCompanyId();
	}

	/**
	* Sets the company ID of this orders.
	*
	* @param companyId the company ID of this orders
	*/
	@Override
	public void setCompanyId(long companyId) {
		_orders.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this orders.
	*
	* @return the group ID of this orders
	*/
	@Override
	public long getGroupId() {
		return _orders.getGroupId();
	}

	/**
	* Sets the group ID of this orders.
	*
	* @param groupId the group ID of this orders
	*/
	@Override
	public void setGroupId(long groupId) {
		_orders.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this orders.
	*
	* @return the user ID of this orders
	*/
	@Override
	public long getUserId() {
		return _orders.getUserId();
	}

	/**
	* Sets the user ID of this orders.
	*
	* @param userId the user ID of this orders
	*/
	@Override
	public void setUserId(long userId) {
		_orders.setUserId(userId);
	}

	/**
	* Returns the user uuid of this orders.
	*
	* @return the user uuid of this orders
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orders.getUserUuid();
	}

	/**
	* Sets the user uuid of this orders.
	*
	* @param userUuid the user uuid of this orders
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_orders.setUserUuid(userUuid);
	}

	@Override
	public boolean isNew() {
		return _orders.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_orders.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _orders.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_orders.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _orders.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _orders.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_orders.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _orders.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_orders.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_orders.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_orders.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OrdersWrapper((Orders)_orders.clone());
	}

	@Override
	public int compareTo(com.liferay.practical.model.Orders orders) {
		return _orders.compareTo(orders);
	}

	@Override
	public int hashCode() {
		return _orders.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.practical.model.Orders> toCacheModel() {
		return _orders.toCacheModel();
	}

	@Override
	public com.liferay.practical.model.Orders toEscapedModel() {
		return new OrdersWrapper(_orders.toEscapedModel());
	}

	@Override
	public com.liferay.practical.model.Orders toUnescapedModel() {
		return new OrdersWrapper(_orders.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _orders.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _orders.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_orders.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrdersWrapper)) {
			return false;
		}

		OrdersWrapper ordersWrapper = (OrdersWrapper)obj;

		if (Validator.equals(_orders, ordersWrapper._orders)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Orders getWrappedOrders() {
		return _orders;
	}

	@Override
	public Orders getWrappedModel() {
		return _orders;
	}

	@Override
	public void resetOriginalValues() {
		_orders.resetOriginalValues();
	}

	private Orders _orders;
}