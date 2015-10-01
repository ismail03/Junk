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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Service service. Represents a row in the &quot;SERVICES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.ServiceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.ServiceImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see Service
 * @see com.stc.echannels.epayments.model.impl.ServiceImpl
 * @see com.stc.echannels.epayments.model.impl.ServiceModelImpl
 * @generated
 */
public interface ServiceModel extends BaseModel<Service> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service model instance should use the {@link Service} interface instead.
	 */

	/**
	 * Returns the primary key of this service.
	 *
	 * @return the primary key of this service
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this service.
	 *
	 * @param primaryKey the primary key of this service
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the service ID of this service.
	 *
	 * @return the service ID of this service
	 */
	public long getServiceId();

	/**
	 * Sets the service ID of this service.
	 *
	 * @param serviceId the service ID of this service
	 */
	public void setServiceId(long serviceId);

	/**
	 * Returns the last update timestamp of this service.
	 *
	 * @return the last update timestamp of this service
	 */
	public Date getLastUpdateTimestamp();

	/**
	 * Sets the last update timestamp of this service.
	 *
	 * @param lastUpdateTimestamp the last update timestamp of this service
	 */
	public void setLastUpdateTimestamp(Date lastUpdateTimestamp);

	/**
	 * Returns the last update userid of this service.
	 *
	 * @return the last update userid of this service
	 */
	@AutoEscape
	public String getLastUpdateUserid();

	/**
	 * Sets the last update userid of this service.
	 *
	 * @param lastUpdateUserid the last update userid of this service
	 */
	public void setLastUpdateUserid(String lastUpdateUserid);

	/**
	 * Returns the last update username of this service.
	 *
	 * @return the last update username of this service
	 */
	@AutoEscape
	public String getLastUpdateUsername();

	/**
	 * Sets the last update username of this service.
	 *
	 * @param lastUpdateUsername the last update username of this service
	 */
	public void setLastUpdateUsername(String lastUpdateUsername);

	/**
	 * Returns the active of this service.
	 *
	 * @return the active of this service
	 */
	public long getActive();

	/**
	 * Sets the active of this service.
	 *
	 * @param active the active of this service
	 */
	public void setActive(long active);

	/**
	 * Returns the effective timestamp of this service.
	 *
	 * @return the effective timestamp of this service
	 */
	public Date getEffectiveTimestamp();

	/**
	 * Sets the effective timestamp of this service.
	 *
	 * @param effectiveTimestamp the effective timestamp of this service
	 */
	public void setEffectiveTimestamp(Date effectiveTimestamp);

	/**
	 * Returns the service name of this service.
	 *
	 * @return the service name of this service
	 */
	@AutoEscape
	public String getServiceName();

	/**
	 * Sets the service name of this service.
	 *
	 * @param serviceName the service name of this service
	 */
	public void setServiceName(String serviceName);

	/**
	 * Returns the descriptive name en of this service.
	 *
	 * @return the descriptive name en of this service
	 */
	@AutoEscape
	public String getDescriptiveNameEn();

	/**
	 * Sets the descriptive name en of this service.
	 *
	 * @param descriptiveNameEn the descriptive name en of this service
	 */
	public void setDescriptiveNameEn(String descriptiveNameEn);

	/**
	 * Returns the descriptive name ar of this service.
	 *
	 * @return the descriptive name ar of this service
	 */
	@AutoEscape
	public String getDescriptiveNameAr();

	/**
	 * Sets the descriptive name ar of this service.
	 *
	 * @param descriptiveNameAr the descriptive name ar of this service
	 */
	public void setDescriptiveNameAr(String descriptiveNameAr);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Service service);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Service> toCacheModel();

	@Override
	public Service toEscapedModel();

	@Override
	public Service toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}