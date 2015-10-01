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
public class InRechargeHistoryPK implements Comparable<InRechargeHistoryPK>,
	Serializable {
	public String msisdn;
	public String transactionId;

	public InRechargeHistoryPK() {
	}

	public InRechargeHistoryPK(String msisdn, String transactionId) {
		this.msisdn = msisdn;
		this.transactionId = transactionId;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public int compareTo(InRechargeHistoryPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = msisdn.compareTo(pk.msisdn);

		if (value != 0) {
			return value;
		}

		value = transactionId.compareTo(pk.transactionId);

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

		if (!(obj instanceof InRechargeHistoryPK)) {
			return false;
		}

		InRechargeHistoryPK pk = (InRechargeHistoryPK)obj;

		if ((msisdn.equals(pk.msisdn)) &&
				(transactionId.equals(pk.transactionId))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(msisdn) + String.valueOf(transactionId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("msisdn");
		sb.append(StringPool.EQUAL);
		sb.append(msisdn);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("transactionId");
		sb.append(StringPool.EQUAL);
		sb.append(transactionId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}