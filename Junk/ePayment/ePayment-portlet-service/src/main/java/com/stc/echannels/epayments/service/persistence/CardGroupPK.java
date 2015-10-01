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
public class CardGroupPK implements Comparable<CardGroupPK>, Serializable {
	public String cardGroupId;
	public long cardValue;
	public String inPaymentSystem;

	public CardGroupPK() {
	}

	public CardGroupPK(String cardGroupId, long cardValue,
		String inPaymentSystem) {
		this.cardGroupId = cardGroupId;
		this.cardValue = cardValue;
		this.inPaymentSystem = inPaymentSystem;
	}

	public String getCardGroupId() {
		return cardGroupId;
	}

	public void setCardGroupId(String cardGroupId) {
		this.cardGroupId = cardGroupId;
	}

	public long getCardValue() {
		return cardValue;
	}

	public void setCardValue(long cardValue) {
		this.cardValue = cardValue;
	}

	public String getInPaymentSystem() {
		return inPaymentSystem;
	}

	public void setInPaymentSystem(String inPaymentSystem) {
		this.inPaymentSystem = inPaymentSystem;
	}

	@Override
	public int compareTo(CardGroupPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = cardGroupId.compareTo(pk.cardGroupId);

		if (value != 0) {
			return value;
		}

		if (cardValue < pk.cardValue) {
			value = -1;
		}
		else if (cardValue > pk.cardValue) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = inPaymentSystem.compareTo(pk.inPaymentSystem);

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

		if (!(obj instanceof CardGroupPK)) {
			return false;
		}

		CardGroupPK pk = (CardGroupPK)obj;

		if ((cardGroupId.equals(pk.cardGroupId)) &&
				(cardValue == pk.cardValue) &&
				(inPaymentSystem.equals(pk.inPaymentSystem))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(cardGroupId) + String.valueOf(cardValue) +
		String.valueOf(inPaymentSystem)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("cardGroupId");
		sb.append(StringPool.EQUAL);
		sb.append(cardGroupId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("cardValue");
		sb.append(StringPool.EQUAL);
		sb.append(cardValue);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("inPaymentSystem");
		sb.append(StringPool.EQUAL);
		sb.append(inPaymentSystem);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}