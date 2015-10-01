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

package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.Service;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Service in entity cache.
 *
 * @author ahmed_fadlus
 * @see Service
 * @generated
 */
public class ServiceCacheModel implements CacheModel<Service>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{serviceId=");
		sb.append(serviceId);
		sb.append(", lastUpdateTimestamp=");
		sb.append(lastUpdateTimestamp);
		sb.append(", lastUpdateUserid=");
		sb.append(lastUpdateUserid);
		sb.append(", lastUpdateUsername=");
		sb.append(lastUpdateUsername);
		sb.append(", active=");
		sb.append(active);
		sb.append(", effectiveTimestamp=");
		sb.append(effectiveTimestamp);
		sb.append(", serviceName=");
		sb.append(serviceName);
		sb.append(", descriptiveNameEn=");
		sb.append(descriptiveNameEn);
		sb.append(", descriptiveNameAr=");
		sb.append(descriptiveNameAr);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Service toEntityModel() {
		ServiceImpl serviceImpl = new ServiceImpl();

		serviceImpl.setServiceId(serviceId);

		if (lastUpdateTimestamp == Long.MIN_VALUE) {
			serviceImpl.setLastUpdateTimestamp(null);
		}
		else {
			serviceImpl.setLastUpdateTimestamp(new Date(lastUpdateTimestamp));
		}

		if (lastUpdateUserid == null) {
			serviceImpl.setLastUpdateUserid(StringPool.BLANK);
		}
		else {
			serviceImpl.setLastUpdateUserid(lastUpdateUserid);
		}

		if (lastUpdateUsername == null) {
			serviceImpl.setLastUpdateUsername(StringPool.BLANK);
		}
		else {
			serviceImpl.setLastUpdateUsername(lastUpdateUsername);
		}

		serviceImpl.setActive(active);

		if (effectiveTimestamp == Long.MIN_VALUE) {
			serviceImpl.setEffectiveTimestamp(null);
		}
		else {
			serviceImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
		}

		if (serviceName == null) {
			serviceImpl.setServiceName(StringPool.BLANK);
		}
		else {
			serviceImpl.setServiceName(serviceName);
		}

		if (descriptiveNameEn == null) {
			serviceImpl.setDescriptiveNameEn(StringPool.BLANK);
		}
		else {
			serviceImpl.setDescriptiveNameEn(descriptiveNameEn);
		}

		if (descriptiveNameAr == null) {
			serviceImpl.setDescriptiveNameAr(StringPool.BLANK);
		}
		else {
			serviceImpl.setDescriptiveNameAr(descriptiveNameAr);
		}

		serviceImpl.resetOriginalValues();

		return serviceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		serviceId = objectInput.readLong();
		lastUpdateTimestamp = objectInput.readLong();
		lastUpdateUserid = objectInput.readUTF();
		lastUpdateUsername = objectInput.readUTF();
		active = objectInput.readLong();
		effectiveTimestamp = objectInput.readLong();
		serviceName = objectInput.readUTF();
		descriptiveNameEn = objectInput.readUTF();
		descriptiveNameAr = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(serviceId);
		objectOutput.writeLong(lastUpdateTimestamp);

		if (lastUpdateUserid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastUpdateUserid);
		}

		if (lastUpdateUsername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastUpdateUsername);
		}

		objectOutput.writeLong(active);
		objectOutput.writeLong(effectiveTimestamp);

		if (serviceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serviceName);
		}

		if (descriptiveNameEn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descriptiveNameEn);
		}

		if (descriptiveNameAr == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descriptiveNameAr);
		}
	}

	public long serviceId;
	public long lastUpdateTimestamp;
	public String lastUpdateUserid;
	public String lastUpdateUsername;
	public long active;
	public long effectiveTimestamp;
	public String serviceName;
	public String descriptiveNameEn;
	public String descriptiveNameAr;
}