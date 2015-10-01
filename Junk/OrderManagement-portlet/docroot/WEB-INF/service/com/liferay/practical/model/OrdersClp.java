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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.practical.service.ClpSerializer;
import com.liferay.practical.service.OrdersLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author saifulla
 */
public class OrdersClp extends BaseModelImpl<Orders> implements Orders {
	public OrdersClp() {
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
	public long getPrimaryKey() {
		return _orderid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOrderid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orderid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getOrderid() {
		return _orderid;
	}

	@Override
	public void setOrderid(long orderid) {
		_orderid = orderid;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setOrderid", long.class);

				method.invoke(_ordersRemoteModel, orderid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getOrderdate() {
		return _orderdate;
	}

	@Override
	public void setOrderdate(Date orderdate) {
		_orderdate = orderdate;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setOrderdate", Date.class);

				method.invoke(_ordersRemoteModel, orderdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductname() {
		return _productname;
	}

	@Override
	public void setProductname(String productname) {
		_productname = productname;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setProductname", String.class);

				method.invoke(_ordersRemoteModel, productname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductpackage() {
		return _productpackage;
	}

	@Override
	public void setProductpackage(String productpackage) {
		_productpackage = productpackage;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setProductpackage",
						String.class);

				method.invoke(_ordersRemoteModel, productpackage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOrderstatus() {
		return _orderstatus;
	}

	@Override
	public void setOrderstatus(int orderstatus) {
		_orderstatus = orderstatus;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setOrderstatus", int.class);

				method.invoke(_ordersRemoteModel, orderstatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getSubscription() {
		return _Subscription;
	}

	@Override
	public boolean isSubscription() {
		return _Subscription;
	}

	@Override
	public void setSubscription(boolean Subscription) {
		_Subscription = Subscription;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setSubscription", boolean.class);

				method.invoke(_ordersRemoteModel, Subscription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocumnetid() {
		return _documnetid;
	}

	@Override
	public void setDocumnetid(long documnetid) {
		_documnetid = documnetid;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumnetid", long.class);

				method.invoke(_ordersRemoteModel, documnetid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusByUserId", long.class);

				method.invoke(_ordersRemoteModel, statusByUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDate", Date.class);

				method.invoke(_ordersRemoteModel, statusDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_ordersRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_ordersRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_ordersRemoteModel != null) {
			try {
				Class<?> clazz = _ordersRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_ordersRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public BaseModel<?> getOrdersRemoteModel() {
		return _ordersRemoteModel;
	}

	public void setOrdersRemoteModel(BaseModel<?> ordersRemoteModel) {
		_ordersRemoteModel = ordersRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _ordersRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_ordersRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OrdersLocalServiceUtil.addOrders(this);
		}
		else {
			OrdersLocalServiceUtil.updateOrders(this);
		}
	}

	@Override
	public Orders toEscapedModel() {
		return (Orders)ProxyUtil.newProxyInstance(Orders.class.getClassLoader(),
			new Class[] { Orders.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OrdersClp clone = new OrdersClp();

		clone.setOrderid(getOrderid());
		clone.setOrderdate(getOrderdate());
		clone.setProductname(getProductname());
		clone.setProductpackage(getProductpackage());
		clone.setOrderstatus(getOrderstatus());
		clone.setSubscription(getSubscription());
		clone.setDocumnetid(getDocumnetid());
		clone.setStatusByUserId(getStatusByUserId());
		clone.setStatusDate(getStatusDate());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());

		return clone;
	}

	@Override
	public int compareTo(Orders orders) {
		int value = 0;

		if (getOrderid() < orders.getOrderid()) {
			value = -1;
		}
		else if (getOrderid() > orders.getOrderid()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = DateUtil.compareTo(getOrderdate(), orders.getOrderdate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrdersClp)) {
			return false;
		}

		OrdersClp orders = (OrdersClp)obj;

		long primaryKey = orders.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{orderid=");
		sb.append(getOrderid());
		sb.append(", orderdate=");
		sb.append(getOrderdate());
		sb.append(", productname=");
		sb.append(getProductname());
		sb.append(", productpackage=");
		sb.append(getProductpackage());
		sb.append(", orderstatus=");
		sb.append(getOrderstatus());
		sb.append(", Subscription=");
		sb.append(getSubscription());
		sb.append(", documnetid=");
		sb.append(getDocumnetid());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.liferay.practical.model.Orders");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>orderid</column-name><column-value><![CDATA[");
		sb.append(getOrderid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orderdate</column-name><column-value><![CDATA[");
		sb.append(getOrderdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productname</column-name><column-value><![CDATA[");
		sb.append(getProductname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productpackage</column-name><column-value><![CDATA[");
		sb.append(getProductpackage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orderstatus</column-name><column-value><![CDATA[");
		sb.append(getOrderstatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Subscription</column-name><column-value><![CDATA[");
		sb.append(getSubscription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documnetid</column-name><column-value><![CDATA[");
		sb.append(getDocumnetid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _orderid;
	private Date _orderdate;
	private String _productname;
	private String _productpackage;
	private int _orderstatus;
	private boolean _Subscription;
	private long _documnetid;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private Date _statusDate;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private BaseModel<?> _ordersRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.practical.service.ClpSerializer.class;
}