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

package com.liferay.practicle.slayer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.practicle.slayer.model.tops_user;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing tops_user in entity cache.
 *
 * @author Ismail
 * @see tops_user
 * @generated
 */
public class tops_userCacheModel implements CacheModel<tops_user>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{tops_userId=");
		sb.append(tops_userId);
		sb.append(", firstname=");
		sb.append(firstname);
		sb.append(", LastName=");
		sb.append(LastName);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", password=");
		sb.append(password);
		sb.append(", email=");
		sb.append(email);
		sb.append(", phone=");
		sb.append(phone);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public tops_user toEntityModel() {
		tops_userImpl tops_userImpl = new tops_userImpl();

		tops_userImpl.setTops_userId(tops_userId);

		if (firstname == null) {
			tops_userImpl.setFirstname(StringPool.BLANK);
		}
		else {
			tops_userImpl.setFirstname(firstname);
		}

		if (LastName == null) {
			tops_userImpl.setLastName(StringPool.BLANK);
		}
		else {
			tops_userImpl.setLastName(LastName);
		}

		if (userName == null) {
			tops_userImpl.setUserName(StringPool.BLANK);
		}
		else {
			tops_userImpl.setUserName(userName);
		}

		if (password == null) {
			tops_userImpl.setPassword(StringPool.BLANK);
		}
		else {
			tops_userImpl.setPassword(password);
		}

		if (email == null) {
			tops_userImpl.setEmail(StringPool.BLANK);
		}
		else {
			tops_userImpl.setEmail(email);
		}

		if (phone == null) {
			tops_userImpl.setPhone(StringPool.BLANK);
		}
		else {
			tops_userImpl.setPhone(phone);
		}

		tops_userImpl.resetOriginalValues();

		return tops_userImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tops_userId = objectInput.readLong();
		firstname = objectInput.readUTF();
		LastName = objectInput.readUTF();
		userName = objectInput.readUTF();
		password = objectInput.readUTF();
		email = objectInput.readUTF();
		phone = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tops_userId);

		if (firstname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstname);
		}

		if (LastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LastName);
		}

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(password);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}
	}

	public long tops_userId;
	public String firstname;
	public String LastName;
	public String userName;
	public String password;
	public String email;
	public String phone;
}