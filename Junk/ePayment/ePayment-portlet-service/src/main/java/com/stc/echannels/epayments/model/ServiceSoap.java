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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.ServiceServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.ServiceServiceSoap
 * @generated
 */
public class ServiceSoap implements Serializable {
	public static ServiceSoap toSoapModel(Service model) {
		ServiceSoap soapModel = new ServiceSoap();

		soapModel.setServiceId(model.getServiceId());
		soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
		soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
		soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
		soapModel.setActive(model.getActive());
		soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
		soapModel.setServiceName(model.getServiceName());
		soapModel.setDescriptiveNameEn(model.getDescriptiveNameEn());
		soapModel.setDescriptiveNameAr(model.getDescriptiveNameAr());

		return soapModel;
	}

	public static ServiceSoap[] toSoapModels(Service[] models) {
		ServiceSoap[] soapModels = new ServiceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceSoap[][] toSoapModels(Service[][] models) {
		ServiceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceSoap[] toSoapModels(List<Service> models) {
		List<ServiceSoap> soapModels = new ArrayList<ServiceSoap>(models.size());

		for (Service model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceSoap[soapModels.size()]);
	}

	public ServiceSoap() {
	}

	public long getPrimaryKey() {
		return _serviceId;
	}

	public void setPrimaryKey(long pk) {
		setServiceId(pk);
	}

	public long getServiceId() {
		return _serviceId;
	}

	public void setServiceId(long serviceId) {
		_serviceId = serviceId;
	}

	public Date getLastUpdateTimestamp() {
		return _lastUpdateTimestamp;
	}

	public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
		_lastUpdateTimestamp = lastUpdateTimestamp;
	}

	public String getLastUpdateUserid() {
		return _lastUpdateUserid;
	}

	public void setLastUpdateUserid(String lastUpdateUserid) {
		_lastUpdateUserid = lastUpdateUserid;
	}

	public String getLastUpdateUsername() {
		return _lastUpdateUsername;
	}

	public void setLastUpdateUsername(String lastUpdateUsername) {
		_lastUpdateUsername = lastUpdateUsername;
	}

	public long getActive() {
		return _active;
	}

	public void setActive(long active) {
		_active = active;
	}

	public Date getEffectiveTimestamp() {
		return _effectiveTimestamp;
	}

	public void setEffectiveTimestamp(Date effectiveTimestamp) {
		_effectiveTimestamp = effectiveTimestamp;
	}

	public String getServiceName() {
		return _serviceName;
	}

	public void setServiceName(String serviceName) {
		_serviceName = serviceName;
	}

	public String getDescriptiveNameEn() {
		return _descriptiveNameEn;
	}

	public void setDescriptiveNameEn(String descriptiveNameEn) {
		_descriptiveNameEn = descriptiveNameEn;
	}

	public String getDescriptiveNameAr() {
		return _descriptiveNameAr;
	}

	public void setDescriptiveNameAr(String descriptiveNameAr) {
		_descriptiveNameAr = descriptiveNameAr;
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
}