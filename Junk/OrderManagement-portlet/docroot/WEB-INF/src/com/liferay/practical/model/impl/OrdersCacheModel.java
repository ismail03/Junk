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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.practical.model.Orders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Orders in entity cache.
 *
 * @author saifulla
 * @see Orders
 * @generated
 */
public class OrdersCacheModel implements CacheModel<Orders>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{orderid=");
		sb.append(orderid);
		sb.append(", orderdate=");
		sb.append(orderdate);
		sb.append(", productname=");
		sb.append(productname);
		sb.append(", productpackage=");
		sb.append(productpackage);
		sb.append(", orderstatus=");
		sb.append(orderstatus);
		sb.append(", Subscription=");
		sb.append(Subscription);
		sb.append(", documnetid=");
		sb.append(documnetid);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Orders toEntityModel() {
		OrdersImpl ordersImpl = new OrdersImpl();

		ordersImpl.setOrderid(orderid);

		if (orderdate == Long.MIN_VALUE) {
			ordersImpl.setOrderdate(null);
		}
		else {
			ordersImpl.setOrderdate(new Date(orderdate));
		}

		if (productname == null) {
			ordersImpl.setProductname(StringPool.BLANK);
		}
		else {
			ordersImpl.setProductname(productname);
		}

		if (productpackage == null) {
			ordersImpl.setProductpackage(StringPool.BLANK);
		}
		else {
			ordersImpl.setProductpackage(productpackage);
		}

		ordersImpl.setOrderstatus(orderstatus);
		ordersImpl.setSubscription(Subscription);
		ordersImpl.setDocumnetid(documnetid);
		ordersImpl.setStatusByUserId(statusByUserId);

		if (statusDate == Long.MIN_VALUE) {
			ordersImpl.setStatusDate(null);
		}
		else {
			ordersImpl.setStatusDate(new Date(statusDate));
		}

		ordersImpl.setCompanyId(companyId);
		ordersImpl.setGroupId(groupId);
		ordersImpl.setUserId(userId);

		ordersImpl.resetOriginalValues();

		return ordersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		orderid = objectInput.readLong();
		orderdate = objectInput.readLong();
		productname = objectInput.readUTF();
		productpackage = objectInput.readUTF();
		orderstatus = objectInput.readInt();
		Subscription = objectInput.readBoolean();
		documnetid = objectInput.readLong();
		statusByUserId = objectInput.readLong();
		statusDate = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(orderid);
		objectOutput.writeLong(orderdate);

		if (productname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productname);
		}

		if (productpackage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productpackage);
		}

		objectOutput.writeInt(orderstatus);
		objectOutput.writeBoolean(Subscription);
		objectOutput.writeLong(documnetid);
		objectOutput.writeLong(statusByUserId);
		objectOutput.writeLong(statusDate);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
	}

	public long orderid;
	public long orderdate;
	public String productname;
	public String productpackage;
	public int orderstatus;
	public boolean Subscription;
	public long documnetid;
	public long statusByUserId;
	public long statusDate;
	public long companyId;
	public long groupId;
	public long userId;
}