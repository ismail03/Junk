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

package com.liferay.practical.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.practical.model.Orders;
import com.liferay.practical.model.OrdersModel;
import com.liferay.practical.model.OrdersSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Orders service. Represents a row in the &quot;Orders&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.practical.model.OrdersModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OrdersImpl}.
 * </p>
 *
 * @author saifulla
 * @see OrdersImpl
 * @see com.liferay.practical.model.Orders
 * @see com.liferay.practical.model.OrdersModel
 * @generated
 */
@JSON(strict = true)
public class OrdersModelImpl extends BaseModelImpl<Orders>
	implements OrdersModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a orders model instance should use the {@link com.liferay.practical.model.Orders} interface instead.
	 */
	public static final String TABLE_NAME = "Orders";
	public static final Object[][] TABLE_COLUMNS = {
			{ "orderid", Types.BIGINT },
			{ "orderdate", Types.TIMESTAMP },
			{ "productname", Types.VARCHAR },
			{ "productpackage", Types.VARCHAR },
			{ "orderstatus", Types.INTEGER },
			{ "Subscription", Types.BOOLEAN },
			{ "documnetid", Types.BIGINT },
			{ "statusByUserId", Types.BIGINT },
			{ "statusDate", Types.TIMESTAMP },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table Orders (orderid LONG not null primary key,orderdate DATE null,productname VARCHAR(75) null,productpackage VARCHAR(75) null,orderstatus INTEGER,Subscription BOOLEAN,documnetid LONG,statusByUserId LONG,statusDate DATE null,companyId LONG,groupId LONG,userId LONG)";
	public static final String TABLE_SQL_DROP = "drop table Orders";
	public static final String ORDER_BY_JPQL = " ORDER BY orders.orderid ASC, orders.orderdate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY Orders.orderid ASC, Orders.orderdate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.practical.model.Orders"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.practical.model.Orders"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.practical.model.Orders"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long ORDERSTATUS_COLUMN_BITMASK = 4L;
	public static long PRODUCTNAME_COLUMN_BITMASK = 8L;
	public static long ORDERID_COLUMN_BITMASK = 16L;
	public static long ORDERDATE_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Orders toModel(OrdersSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Orders model = new OrdersImpl();

		model.setOrderid(soapModel.getOrderid());
		model.setOrderdate(soapModel.getOrderdate());
		model.setProductname(soapModel.getProductname());
		model.setProductpackage(soapModel.getProductpackage());
		model.setOrderstatus(soapModel.getOrderstatus());
		model.setSubscription(soapModel.getSubscription());
		model.setDocumnetid(soapModel.getDocumnetid());
		model.setStatusByUserId(soapModel.getStatusByUserId());
		model.setStatusDate(soapModel.getStatusDate());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Orders> toModels(OrdersSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Orders> models = new ArrayList<Orders>(soapModels.length);

		for (OrdersSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_ORDERS_CATEGORY_NAME = "Orders_Category";
	public static final Object[][] MAPPING_TABLE_ORDERS_CATEGORY_COLUMNS = {
			{ "categoryid", Types.BIGINT },
			{ "orderid", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_ORDERS_CATEGORY_SQL_CREATE = "create table Orders_Category (categoryid LONG not null,orderid LONG not null,primary key (categoryid, orderid))";
	public static final boolean FINDER_CACHE_ENABLED_ORDERS_CATEGORY = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.Orders_Category"), true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.practical.model.Orders"));

	public OrdersModelImpl() {
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

	@JSON
	@Override
	public long getOrderid() {
		return _orderid;
	}

	@Override
	public void setOrderid(long orderid) {
		_columnBitmask = -1L;

		_orderid = orderid;
	}

	@JSON
	@Override
	public Date getOrderdate() {
		return _orderdate;
	}

	@Override
	public void setOrderdate(Date orderdate) {
		_columnBitmask = -1L;

		_orderdate = orderdate;
	}

	@JSON
	@Override
	public String getProductname() {
		if (_productname == null) {
			return StringPool.BLANK;
		}
		else {
			return _productname;
		}
	}

	@Override
	public void setProductname(String productname) {
		_columnBitmask |= PRODUCTNAME_COLUMN_BITMASK;

		if (_originalProductname == null) {
			_originalProductname = _productname;
		}

		_productname = productname;
	}

	public String getOriginalProductname() {
		return GetterUtil.getString(_originalProductname);
	}

	@JSON
	@Override
	public String getProductpackage() {
		if (_productpackage == null) {
			return StringPool.BLANK;
		}
		else {
			return _productpackage;
		}
	}

	@Override
	public void setProductpackage(String productpackage) {
		_productpackage = productpackage;
	}

	@JSON
	@Override
	public int getOrderstatus() {
		return _orderstatus;
	}

	@Override
	public void setOrderstatus(int orderstatus) {
		_columnBitmask |= ORDERSTATUS_COLUMN_BITMASK;

		if (!_setOriginalOrderstatus) {
			_setOriginalOrderstatus = true;

			_originalOrderstatus = _orderstatus;
		}

		_orderstatus = orderstatus;
	}

	public int getOriginalOrderstatus() {
		return _originalOrderstatus;
	}

	@JSON
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
	}

	@JSON
	@Override
	public long getDocumnetid() {
		return _documnetid;
	}

	@Override
	public void setDocumnetid(long documnetid) {
		_documnetid = documnetid;
	}

	@JSON
	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
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

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Orders.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Orders toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Orders)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OrdersImpl ordersImpl = new OrdersImpl();

		ordersImpl.setOrderid(getOrderid());
		ordersImpl.setOrderdate(getOrderdate());
		ordersImpl.setProductname(getProductname());
		ordersImpl.setProductpackage(getProductpackage());
		ordersImpl.setOrderstatus(getOrderstatus());
		ordersImpl.setSubscription(getSubscription());
		ordersImpl.setDocumnetid(getDocumnetid());
		ordersImpl.setStatusByUserId(getStatusByUserId());
		ordersImpl.setStatusDate(getStatusDate());
		ordersImpl.setCompanyId(getCompanyId());
		ordersImpl.setGroupId(getGroupId());
		ordersImpl.setUserId(getUserId());

		ordersImpl.resetOriginalValues();

		return ordersImpl;
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

		if (!(obj instanceof Orders)) {
			return false;
		}

		Orders orders = (Orders)obj;

		long primaryKey = orders.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		OrdersModelImpl ordersModelImpl = this;

		ordersModelImpl._originalProductname = ordersModelImpl._productname;

		ordersModelImpl._originalOrderstatus = ordersModelImpl._orderstatus;

		ordersModelImpl._setOriginalOrderstatus = false;

		ordersModelImpl._originalCompanyId = ordersModelImpl._companyId;

		ordersModelImpl._setOriginalCompanyId = false;

		ordersModelImpl._originalGroupId = ordersModelImpl._groupId;

		ordersModelImpl._setOriginalGroupId = false;

		ordersModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Orders> toCacheModel() {
		OrdersCacheModel ordersCacheModel = new OrdersCacheModel();

		ordersCacheModel.orderid = getOrderid();

		Date orderdate = getOrderdate();

		if (orderdate != null) {
			ordersCacheModel.orderdate = orderdate.getTime();
		}
		else {
			ordersCacheModel.orderdate = Long.MIN_VALUE;
		}

		ordersCacheModel.productname = getProductname();

		String productname = ordersCacheModel.productname;

		if ((productname != null) && (productname.length() == 0)) {
			ordersCacheModel.productname = null;
		}

		ordersCacheModel.productpackage = getProductpackage();

		String productpackage = ordersCacheModel.productpackage;

		if ((productpackage != null) && (productpackage.length() == 0)) {
			ordersCacheModel.productpackage = null;
		}

		ordersCacheModel.orderstatus = getOrderstatus();

		ordersCacheModel.Subscription = getSubscription();

		ordersCacheModel.documnetid = getDocumnetid();

		ordersCacheModel.statusByUserId = getStatusByUserId();

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			ordersCacheModel.statusDate = statusDate.getTime();
		}
		else {
			ordersCacheModel.statusDate = Long.MIN_VALUE;
		}

		ordersCacheModel.companyId = getCompanyId();

		ordersCacheModel.groupId = getGroupId();

		ordersCacheModel.userId = getUserId();

		return ordersCacheModel;
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

	private static ClassLoader _classLoader = Orders.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Orders.class };
	private long _orderid;
	private Date _orderdate;
	private String _productname;
	private String _originalProductname;
	private String _productpackage;
	private int _orderstatus;
	private int _originalOrderstatus;
	private boolean _setOriginalOrderstatus;
	private boolean _Subscription;
	private long _documnetid;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private Date _statusDate;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private long _columnBitmask;
	private Orders _escapedModel;
}