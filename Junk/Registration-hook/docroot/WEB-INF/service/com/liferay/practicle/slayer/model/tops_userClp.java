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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.practicle.slayer.service.ClpSerializer;
import com.liferay.practicle.slayer.service.tops_userLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ismail
 */
public class tops_userClp extends BaseModelImpl<tops_user> implements tops_user {
	public tops_userClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return tops_user.class;
	}

	@Override
	public String getModelClassName() {
		return tops_user.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _tops_userId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTops_userId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tops_userId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tops_userId", getTops_userId());
		attributes.put("firstname", getFirstname());
		attributes.put("LastName", getLastName());
		attributes.put("userName", getUserName());
		attributes.put("password", getPassword());
		attributes.put("email", getEmail());
		attributes.put("phone", getPhone());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tops_userId = (Long)attributes.get("tops_userId");

		if (tops_userId != null) {
			setTops_userId(tops_userId);
		}

		String firstname = (String)attributes.get("firstname");

		if (firstname != null) {
			setFirstname(firstname);
		}

		String LastName = (String)attributes.get("LastName");

		if (LastName != null) {
			setLastName(LastName);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}
	}

	@Override
	public long getTops_userId() {
		return _tops_userId;
	}

	@Override
	public void setTops_userId(long tops_userId) {
		_tops_userId = tops_userId;

		if (_tops_userRemoteModel != null) {
			try {
				Class<?> clazz = _tops_userRemoteModel.getClass();

				Method method = clazz.getMethod("setTops_userId", long.class);

				method.invoke(_tops_userRemoteModel, tops_userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFirstname() {
		return _firstname;
	}

	@Override
	public void setFirstname(String firstname) {
		_firstname = firstname;

		if (_tops_userRemoteModel != null) {
			try {
				Class<?> clazz = _tops_userRemoteModel.getClass();

				Method method = clazz.getMethod("setFirstname", String.class);

				method.invoke(_tops_userRemoteModel, firstname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastName() {
		return _LastName;
	}

	@Override
	public void setLastName(String LastName) {
		_LastName = LastName;

		if (_tops_userRemoteModel != null) {
			try {
				Class<?> clazz = _tops_userRemoteModel.getClass();

				Method method = clazz.getMethod("setLastName", String.class);

				method.invoke(_tops_userRemoteModel, LastName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_tops_userRemoteModel != null) {
			try {
				Class<?> clazz = _tops_userRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_tops_userRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassword() {
		return _password;
	}

	@Override
	public void setPassword(String password) {
		_password = password;

		if (_tops_userRemoteModel != null) {
			try {
				Class<?> clazz = _tops_userRemoteModel.getClass();

				Method method = clazz.getMethod("setPassword", String.class);

				method.invoke(_tops_userRemoteModel, password);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_tops_userRemoteModel != null) {
			try {
				Class<?> clazz = _tops_userRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_tops_userRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone() {
		return _phone;
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;

		if (_tops_userRemoteModel != null) {
			try {
				Class<?> clazz = _tops_userRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone", String.class);

				method.invoke(_tops_userRemoteModel, phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gettops_userRemoteModel() {
		return _tops_userRemoteModel;
	}

	public void settops_userRemoteModel(BaseModel<?> tops_userRemoteModel) {
		_tops_userRemoteModel = tops_userRemoteModel;
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

		Class<?> remoteModelClass = _tops_userRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tops_userRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			tops_userLocalServiceUtil.addtops_user(this);
		}
		else {
			tops_userLocalServiceUtil.updatetops_user(this);
		}
	}

	@Override
	public tops_user toEscapedModel() {
		return (tops_user)ProxyUtil.newProxyInstance(tops_user.class.getClassLoader(),
			new Class[] { tops_user.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		tops_userClp clone = new tops_userClp();

		clone.setTops_userId(getTops_userId());
		clone.setFirstname(getFirstname());
		clone.setLastName(getLastName());
		clone.setUserName(getUserName());
		clone.setPassword(getPassword());
		clone.setEmail(getEmail());
		clone.setPhone(getPhone());

		return clone;
	}

	@Override
	public int compareTo(tops_user tops_user) {
		long primaryKey = tops_user.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tops_userClp)) {
			return false;
		}

		tops_userClp tops_user = (tops_userClp)obj;

		long primaryKey = tops_user.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{tops_userId=");
		sb.append(getTops_userId());
		sb.append(", firstname=");
		sb.append(getFirstname());
		sb.append(", LastName=");
		sb.append(getLastName());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.liferay.practicle.slayer.model.tops_user");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tops_userId</column-name><column-value><![CDATA[");
		sb.append(getTops_userId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstname</column-name><column-value><![CDATA[");
		sb.append(getFirstname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _tops_userId;
	private String _firstname;
	private String _LastName;
	private String _userName;
	private String _password;
	private String _email;
	private String _phone;
	private BaseModel<?> _tops_userRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.practicle.slayer.service.ClpSerializer.class;
}