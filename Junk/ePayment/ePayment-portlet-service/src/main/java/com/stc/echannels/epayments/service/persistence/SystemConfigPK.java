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

package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author ahmed_fadlus
 */
public class SystemConfigPK implements Comparable<SystemConfigPK>, Serializable {
	public long serviceId;
	public long bankId;

	public SystemConfigPK() {
	}

	public SystemConfigPK(long serviceId, long bankId) {
		this.serviceId = serviceId;
		this.bankId = bankId;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

	@Override
	public int compareTo(SystemConfigPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (serviceId < pk.serviceId) {
			value = -1;
		}
		else if (serviceId > pk.serviceId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (bankId < pk.bankId) {
			value = -1;
		}
		else if (bankId > pk.bankId) {
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

		if (!(obj instanceof SystemConfigPK)) {
			return false;
		}

		SystemConfigPK pk = (SystemConfigPK)obj;

		if ((serviceId == pk.serviceId) && (bankId == pk.bankId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(serviceId) + String.valueOf(bankId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("serviceId");
		sb.append(StringPool.EQUAL);
		sb.append(serviceId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("bankId");
		sb.append(StringPool.EQUAL);
		sb.append(bankId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}