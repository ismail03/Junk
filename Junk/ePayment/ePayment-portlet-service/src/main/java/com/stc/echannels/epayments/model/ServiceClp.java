/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.ServiceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ahmed_fadlus
 */
public class ServiceClp extends BaseModelImpl<Service> implements Service {
	public ServiceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Service.class;
	}

	@Override
	public String getModelClassName() {
		return Service.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _serviceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _serviceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("serviceId", getServiceId());
		attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
		attributes.put("lastUpdateUserid", getLastUpdateUserid());
		attributes.put("lastUpdateUsername", getLastUpdateUsername());
		attributes.put("active", getActive());
		attributes.put("effectiveTimestamp", getEffectiveTimestamp());
		attributes.put("serviceName", getServiceName());
		attributes.put("descriptiveNameEn", getDescriptiveNameEn());
		attributes.put("descriptiveNameAr", getDescriptiveNameAr());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long serviceId = (Long)attributes.get("serviceId");

		if (serviceId != null) {
			setServiceId(serviceId);
		}

		Date lastUpdateTimestamp = (Date)attributes.get("lastUpdateTimestamp");

		if (lastUpdateTimestamp != null) {
			setLastUpdateTimestamp(lastUpdateTimestamp);
		}

		String lastUpdateUserid = (String)attributes.get("lastUpdateUserid");

		if (lastUpdateUserid != null) {
			setLastUpdateUserid(lastUpdateUserid);
		}

		String lastUpdateUsername = (String)attributes.get("lastUpdateUsername");

		if (lastUpdateUsername != null) {
			setLastUpdateUsername(lastUpdateUsername);
		}

		Long active = (Long)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Date effectiveTimestamp = (Date)attributes.get("effectiveTimestamp");

		if (effectiveTimestamp != null) {
			setEffectiveTimestamp(effectiveTimestamp);
		}

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		String descriptiveNameEn = (String)attributes.get("descriptiveNameEn");

		if (descriptiveNameEn != null) {
			setDescriptiveNameEn(descriptiveNameEn);
		}

		String descriptiveNameAr = (String)attributes.get("descriptiveNameAr");

		if (descriptiveNameAr != null) {
			setDescriptiveNameAr(descriptiveNameAr);
		}
	}

	@Override
	public long getServiceId() {
		return _serviceId;
	}

	@Override
	public void setServiceId(long serviceId) {
		_serviceId = serviceId;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceId", long.class);

				method.invoke(_serviceRemoteModel, serviceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLastUpdateTimestamp() {
		return _lastUpdateTimestamp;
	}

	@Override
	public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
		_lastUpdateTimestamp = lastUpdateTimestamp;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setLastUpdateTimestamp",
						Date.class);

				method.invoke(_serviceRemoteModel, lastUpdateTimestamp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastUpdateUserid() {
		return _lastUpdateUserid;
	}

	@Override
	public void setLastUpdateUserid(String lastUpdateUserid) {
		_lastUpdateUserid = lastUpdateUserid;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setLastUpdateUserid",
						String.class);

				method.invoke(_serviceRemoteModel, lastUpdateUserid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastUpdateUsername() {
		return _lastUpdateUsername;
	}

	@Override
	public void setLastUpdateUsername(String lastUpdateUsername) {
		_lastUpdateUsername = lastUpdateUsername;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setLastUpdateUsername",
						String.class);

				method.invoke(_serviceRemoteModel, lastUpdateUsername);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getActive() {
		return _active;
	}

	@Override
	public void setActive(long active) {
		_active = active;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setActive", long.class);

				method.invoke(_serviceRemoteModel, active);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEffectiveTimestamp() {
		return _effectiveTimestamp;
	}

	@Override
	public void setEffectiveTimestamp(Date effectiveTimestamp) {
		_effectiveTimestamp = effectiveTimestamp;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectiveTimestamp",
						Date.class);

				method.invoke(_serviceRemoteModel, effectiveTimestamp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceName() {
		return _serviceName;
	}

	@Override
	public void setServiceName(String serviceName) {
		_serviceName = serviceName;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceName", String.class);

				method.invoke(_serviceRemoteModel, serviceName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescriptiveNameEn() {
		return _descriptiveNameEn;
	}

	@Override
	public void setDescriptiveNameEn(String descriptiveNameEn) {
		_descriptiveNameEn = descriptiveNameEn;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setDescriptiveNameEn",
						String.class);

				method.invoke(_serviceRemoteModel, descriptiveNameEn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescriptiveNameAr() {
		return _descriptiveNameAr;
	}

	@Override
	public void setDescriptiveNameAr(String descriptiveNameAr) {
		_descriptiveNameAr = descriptiveNameAr;

		if (_serviceRemoteModel != null) {
			try {
				Class<?> clazz = _serviceRemoteModel.getClass();

				Method method = clazz.getMethod("setDescriptiveNameAr",
						String.class);

				method.invoke(_serviceRemoteModel, descriptiveNameAr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getServiceRemoteModel() {
		return _serviceRemoteModel;
	}

	public void setServiceRemoteModel(BaseModel<?> serviceRemoteModel) {
		_serviceRemoteModel = serviceRemoteModel;
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

		Class<?> remoteModelClass = _serviceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_serviceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServiceLocalServiceUtil.addService(this);
		}
		else {
			ServiceLocalServiceUtil.updateService(this);
		}
	}

	@Override
	public Service toEscapedModel() {
		return (Service)ProxyUtil.newProxyInstance(Service.class.getClassLoader(),
			new Class[] { Service.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServiceClp clone = new ServiceClp();

		clone.setServiceId(getServiceId());
		clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
		clone.setLastUpdateUserid(getLastUpdateUserid());
		clone.setLastUpdateUsername(getLastUpdateUsername());
		clone.setActive(getActive());
		clone.setEffectiveTimestamp(getEffectiveTimestamp());
		clone.setServiceName(getServiceName());
		clone.setDescriptiveNameEn(getDescriptiveNameEn());
		clone.setDescriptiveNameAr(getDescriptiveNameAr());

		return clone;
	}

	@Override
	public int compareTo(Service service) {
		int value = 0;

		if (getServiceId() < service.getServiceId()) {
			value = -1;
		}
		else if (getServiceId() > service.getServiceId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof ServiceClp)) {
			return false;
		}

		ServiceClp service = (ServiceClp)obj;

		long primaryKey = service.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{serviceId=");
		sb.append(getServiceId());
		sb.append(", lastUpdateTimestamp=");
		sb.append(getLastUpdateTimestamp());
		sb.append(", lastUpdateUserid=");
		sb.append(getLastUpdateUserid());
		sb.append(", lastUpdateUsername=");
		sb.append(getLastUpdateUsername());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", effectiveTimestamp=");
		sb.append(getEffectiveTimestamp());
		sb.append(", serviceName=");
		sb.append(getServiceName());
		sb.append(", descriptiveNameEn=");
		sb.append(getDescriptiveNameEn());
		sb.append(", descriptiveNameAr=");
		sb.append(getDescriptiveNameAr());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.stc.echannels.epayments.model.Service");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>serviceId</column-name><column-value><![CDATA[");
		sb.append(getServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastUpdateTimestamp</column-name><column-value><![CDATA[");
		sb.append(getLastUpdateTimestamp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastUpdateUserid</column-name><column-value><![CDATA[");
		sb.append(getLastUpdateUserid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastUpdateUsername</column-name><column-value><![CDATA[");
		sb.append(getLastUpdateUsername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveTimestamp</column-name><column-value><![CDATA[");
		sb.append(getEffectiveTimestamp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descriptiveNameEn</column-name><column-value><![CDATA[");
		sb.append(getDescriptiveNameEn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descriptiveNameAr</column-name><column-value><![CDATA[");
		sb.append(getDescriptiveNameAr());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _serviceId;
	private Date _lastUpdateTimestamp;
	private String _lastUpdateUserid;
	private String _lastUpdateUsername;
	private long _active;
	private Date _effectiveTimestamp;
	private String _serviceName;
	private String _descriptiveNameEn;
	private String _descriptiveNameAr;
	private BaseModel<?> _serviceRemoteModel;
}