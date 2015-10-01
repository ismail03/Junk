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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.practical.service.http.OrdersServiceSoap}.
 *
 * @author saifulla
 * @see com.liferay.practical.service.http.OrdersServiceSoap
 * @generated
 */
public class OrdersSoap implements Serializable {
	public static OrdersSoap toSoapModel(Orders model) {
		OrdersSoap soapModel = new OrdersSoap();

		soapModel.setOrderid(model.getOrderid());
		soapModel.setOrderdate(model.getOrderdate());
		soapModel.setProductname(model.getProductname());
		soapModel.setProductpackage(model.getProductpackage());
		soapModel.setOrderstatus(model.getOrderstatus());
		soapModel.setSubscription(model.getSubscription());
		soapModel.setDocumnetid(model.getDocumnetid());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static OrdersSoap[] toSoapModels(Orders[] models) {
		OrdersSoap[] soapModels = new OrdersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrdersSoap[][] toSoapModels(Orders[][] models) {
		OrdersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrdersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrdersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrdersSoap[] toSoapModels(List<Orders> models) {
		List<OrdersSoap> soapModels = new ArrayList<OrdersSoap>(models.size());

		for (Orders model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrdersSoap[soapModels.size()]);
	}

	public OrdersSoap() {
	}

	public long getPrimaryKey() {
		return _orderid;
	}

	public void setPrimaryKey(long pk) {
		setOrderid(pk);
	}

	public long getOrderid() {
		return _orderid;
	}

	public void setOrderid(long orderid) {
		_orderid = orderid;
	}

	public Date getOrderdate() {
		return _orderdate;
	}

	public void setOrderdate(Date orderdate) {
		_orderdate = orderdate;
	}

	public String getProductname() {
		return _productname;
	}

	public void setProductname(String productname) {
		_productname = productname;
	}

	public String getProductpackage() {
		return _productpackage;
	}

	public void setProductpackage(String productpackage) {
		_productpackage = productpackage;
	}

	public int getOrderstatus() {
		return _orderstatus;
	}

	public void setOrderstatus(int orderstatus) {
		_orderstatus = orderstatus;
	}

	public boolean getSubscription() {
		return _Subscription;
	}

	public boolean isSubscription() {
		return _Subscription;
	}

	public void setSubscription(boolean Subscription) {
		_Subscription = Subscription;
	}

	public long getDocumnetid() {
		return _documnetid;
	}

	public void setDocumnetid(long documnetid) {
		_documnetid = documnetid;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _orderid;
	private Date _orderdate;
	private String _productname;
	private String _productpackage;
	private int _orderstatus;
	private boolean _Subscription;
	private long _documnetid;
	private long _statusByUserId;
	private Date _statusDate;
	private long _companyId;
	private long _groupId;
	private long _userId;
}