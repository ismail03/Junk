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
public class RefundReconLogPK implements Comparable<RefundReconLogPK>,
	Serializable {
	public String batchId;
	public long serviceId;

	public RefundReconLogPK() {
	}

	public RefundReconLogPK(String batchId, long serviceId) {
		this.batchId = batchId;
		this.serviceId = serviceId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	@Override
	public int compareTo(RefundReconLogPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = batchId.compareTo(pk.batchId);

		if (value != 0) {
			return value;
		}

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

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RefundReconLogPK)) {
			return false;
		}

		RefundReconLogPK pk = (RefundReconLogPK)obj;

		if ((batchId.equals(pk.batchId)) && (serviceId == pk.serviceId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(batchId) + String.valueOf(serviceId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("batchId");
		sb.append(StringPool.EQUAL);
		sb.append(batchId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("serviceId");
		sb.append(StringPool.EQUAL);
		sb.append(serviceId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}