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

package com.liferay.practicle.slayer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Ismail
 * @generated
 */
public class tops_userSoap implements Serializable {
	public static tops_userSoap toSoapModel(tops_user model) {
		tops_userSoap soapModel = new tops_userSoap();

		soapModel.setTops_userId(model.getTops_userId());
		soapModel.setFirstname(model.getFirstname());
		soapModel.setLastName(model.getLastName());
		soapModel.setUserName(model.getUserName());
		soapModel.setPassword(model.getPassword());
		soapModel.setEmail(model.getEmail());
		soapModel.setPhone(model.getPhone());

		return soapModel;
	}

	public static tops_userSoap[] toSoapModels(tops_user[] models) {
		tops_userSoap[] soapModels = new tops_userSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static tops_userSoap[][] toSoapModels(tops_user[][] models) {
		tops_userSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new tops_userSoap[models.length][models[0].length];
		}
		else {
			soapModels = new tops_userSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static tops_userSoap[] toSoapModels(List<tops_user> models) {
		List<tops_userSoap> soapModels = new ArrayList<tops_userSoap>(models.size());

		for (tops_user model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new tops_userSoap[soapModels.size()]);
	}

	public tops_userSoap() {
	}

	public long getPrimaryKey() {
		return _tops_userId;
	}

	public void setPrimaryKey(long pk) {
		setTops_userId(pk);
	}

	public long getTops_userId() {
		return _tops_userId;
	}

	public void setTops_userId(long tops_userId) {
		_tops_userId = tops_userId;
	}

	public String getFirstname() {
		return _firstname;
	}

	public void setFirstname(String firstname) {
		_firstname = firstname;
	}

	public String getLastName() {
		return _LastName;
	}

	public void setLastName(String LastName) {
		_LastName = LastName;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	private long _tops_userId;
	private String _firstname;
	private String _LastName;
	private String _userName;
	private String _password;
	private String _email;
	private String _phone;
}