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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Service}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see Service
 * @generated
 */
public class ServiceWrapper implements Service, ModelWrapper<Service> {
	public ServiceWrapper(Service service) {
		_service = service;
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

	/**
	* Returns the primary key of this service.
	*
	* @return the primary key of this service
	*/
	@Override
	public long getPrimaryKey() {
		return _service.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service.
	*
	* @param primaryKey the primary key of this service
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_service.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the service ID of this service.
	*
	* @return the service ID of this service
	*/
	@Override
	public long getServiceId() {
		return _service.getServiceId();
	}

	/**
	* Sets the service ID of this service.
	*
	* @param serviceId the service ID of this service
	*/
	@Override
	public void setServiceId(long serviceId) {
		_service.setServiceId(serviceId);
	}

	/**
	* Returns the last update timestamp of this service.
	*
	* @return the last update timestamp of this service
	*/
	@Override
	public java.util.Date getLastUpdateTimestamp() {
		return _service.getLastUpdateTimestamp();
	}

	/**
	* Sets the last update timestamp of this service.
	*
	* @param lastUpdateTimestamp the last update timestamp of this service
	*/
	@Override
	public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
		_service.setLastUpdateTimestamp(lastUpdateTimestamp);
	}

	/**
	* Returns the last update userid of this service.
	*
	* @return the last update userid of this service
	*/
	@Override
	public java.lang.String getLastUpdateUserid() {
		return _service.getLastUpdateUserid();
	}

	/**
	* Sets the last update userid of this service.
	*
	* @param lastUpdateUserid the last update userid of this service
	*/
	@Override
	public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
		_service.setLastUpdateUserid(lastUpdateUserid);
	}

	/**
	* Returns the last update username of this service.
	*
	* @return the last update username of this service
	*/
	@Override
	public java.lang.String getLastUpdateUsername() {
		return _service.getLastUpdateUsername();
	}

	/**
	* Sets the last update username of this service.
	*
	* @param lastUpdateUsername the last update username of this service
	*/
	@Override
	public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
		_service.setLastUpdateUsername(lastUpdateUsername);
	}

	/**
	* Returns the active of this service.
	*
	* @return the active of this service
	*/
	@Override
	public long getActive() {
		return _service.getActive();
	}

	/**
	* Sets the active of this service.
	*
	* @param active the active of this service
	*/
	@Override
	public void setActive(long active) {
		_service.setActive(active);
	}

	/**
	* Returns the effective timestamp of this service.
	*
	* @return the effective timestamp of this service
	*/
	@Override
	public java.util.Date getEffectiveTimestamp() {
		return _service.getEffectiveTimestamp();
	}

	/**
	* Sets the effective timestamp of this service.
	*
	* @param effectiveTimestamp the effective timestamp of this service
	*/
	@Override
	public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
		_service.setEffectiveTimestamp(effectiveTimestamp);
	}

	/**
	* Returns the service name of this service.
	*
	* @return the service name of this service
	*/
	@Override
	public java.lang.String getServiceName() {
		return _service.getServiceName();
	}

	/**
	* Sets the service name of this service.
	*
	* @param serviceName the service name of this service
	*/
	@Override
	public void setServiceName(java.lang.String serviceName) {
		_service.setServiceName(serviceName);
	}

	/**
	* Returns the descriptive name en of this service.
	*
	* @return the descriptive name en of this service
	*/
	@Override
	public java.lang.String getDescriptiveNameEn() {
		return _service.getDescriptiveNameEn();
	}

	/**
	* Sets the descriptive name en of this service.
	*
	* @param descriptiveNameEn the descriptive name en of this service
	*/
	@Override
	public void setDescriptiveNameEn(java.lang.String descriptiveNameEn) {
		_service.setDescriptiveNameEn(descriptiveNameEn);
	}

	/**
	* Returns the descriptive name ar of this service.
	*
	* @return the descriptive name ar of this service
	*/
	@Override
	public java.lang.String getDescriptiveNameAr() {
		return _service.getDescriptiveNameAr();
	}

	/**
	* Sets the descriptive name ar of this service.
	*
	* @param descriptiveNameAr the descriptive name ar of this service
	*/
	@Override
	public void setDescriptiveNameAr(java.lang.String descriptiveNameAr) {
		_service.setDescriptiveNameAr(descriptiveNameAr);
	}

	@Override
	public boolean isNew() {
		return _service.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_service.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _service.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_service.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _service.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _service.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_service.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _service.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_service.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_service.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_service.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceWrapper((Service)_service.clone());
	}

	@Override
	public int compareTo(com.stc.echannels.epayments.model.Service service) {
		return _service.compareTo(service);
	}

	@Override
	public int hashCode() {
		return _service.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.stc.echannels.epayments.model.Service> toCacheModel() {
		return _service.toCacheModel();
	}

	@Override
	public com.stc.echannels.epayments.model.Service toEscapedModel() {
		return new ServiceWrapper(_service.toEscapedModel());
	}

	@Override
	public com.stc.echannels.epayments.model.Service toUnescapedModel() {
		return new ServiceWrapper(_service.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _service.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _service.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_service.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceWrapper)) {
			return false;
		}

		ServiceWrapper serviceWrapper = (ServiceWrapper)obj;

		if (Validator.equals(_service, serviceWrapper._service)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Service getWrappedService() {
		return _service;
	}

	@Override
	public Service getWrappedModel() {
		return _service;
	}

	@Override
	public void resetOriginalValues() {
		_service.resetOriginalValues();
	}

	private Service _service;
}