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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.practical.service.CategoryLocalServiceUtil;
import com.liferay.practical.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saifulla
 */
public class CategoryClp extends BaseModelImpl<Category> implements Category {
	public CategoryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Category.class;
	}

	@Override
	public String getModelClassName() {
		return Category.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _categoryid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCategoryid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _categoryid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoryid", getCategoryid());
		attributes.put("categoryname", getCategoryname());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long categoryid = (Long)attributes.get("categoryid");

		if (categoryid != null) {
			setCategoryid(categoryid);
		}

		String categoryname = (String)attributes.get("categoryname");

		if (categoryname != null) {
			setCategoryname(categoryname);
		}
	}

	@Override
	public long getCategoryid() {
		return _categoryid;
	}

	@Override
	public void setCategoryid(long categoryid) {
		_categoryid = categoryid;

		if (_categoryRemoteModel != null) {
			try {
				Class<?> clazz = _categoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryid", long.class);

				method.invoke(_categoryRemoteModel, categoryid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategoryname() {
		return _categoryname;
	}

	@Override
	public void setCategoryname(String categoryname) {
		_categoryname = categoryname;

		if (_categoryRemoteModel != null) {
			try {
				Class<?> clazz = _categoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCategoryname", String.class);

				method.invoke(_categoryRemoteModel, categoryname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCategoryRemoteModel() {
		return _categoryRemoteModel;
	}

	public void setCategoryRemoteModel(BaseModel<?> categoryRemoteModel) {
		_categoryRemoteModel = categoryRemoteModel;
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

		Class<?> remoteModelClass = _categoryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_categoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CategoryLocalServiceUtil.addCategory(this);
		}
		else {
			CategoryLocalServiceUtil.updateCategory(this);
		}
	}

	@Override
	public Category toEscapedModel() {
		return (Category)ProxyUtil.newProxyInstance(Category.class.getClassLoader(),
			new Class[] { Category.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CategoryClp clone = new CategoryClp();

		clone.setCategoryid(getCategoryid());
		clone.setCategoryname(getCategoryname());

		return clone;
	}

	@Override
	public int compareTo(Category category) {
		long primaryKey = category.getPrimaryKey();

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

		if (!(obj instanceof CategoryClp)) {
			return false;
		}

		CategoryClp category = (CategoryClp)obj;

		long primaryKey = category.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{categoryid=");
		sb.append(getCategoryid());
		sb.append(", categoryname=");
		sb.append(getCategoryname());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.liferay.practical.model.Category");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>categoryid</column-name><column-value><![CDATA[");
		sb.append(getCategoryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryname</column-name><column-value><![CDATA[");
		sb.append(getCategoryname());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _categoryid;
	private String _categoryname;
	private BaseModel<?> _categoryRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.practical.service.ClpSerializer.class;
}