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
public class RefundLogPK implements Comparable<RefundLogPK>, Serializable {
	public String refundId;
	public String epayTransId;

	public RefundLogPK() {
	}

	public RefundLogPK(String refundId, String epayTransId) {
		this.refundId = refundId;
		this.epayTransId = epayTransId;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getEpayTransId() {
		return epayTransId;
	}

	public void setEpayTransId(String epayTransId) {
		this.epayTransId = epayTransId;
	}

	@Override
	public int compareTo(RefundLogPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = refundId.compareTo(pk.refundId);

		if (value != 0) {
			return value;
		}

		value = epayTransId.compareTo(pk.epayTransId);

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

		if (!(obj instanceof RefundLogPK)) {
			return false;
		}

		RefundLogPK pk = (RefundLogPK)obj;

		if ((refundId.equals(pk.refundId)) &&
				(epayTransId.equals(pk.epayTransId))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(refundId) + String.valueOf(epayTransId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("refundId");
		sb.append(StringPool.EQUAL);
		sb.append(refundId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("epayTransId");
		sb.append(StringPool.EQUAL);
		sb.append(epayTransId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}