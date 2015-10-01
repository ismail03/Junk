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

import java.util.Locale;

/**
 * The extended model implementation for the Bank service. Represents a row in the &quot;BANK_CODES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.model.Bank} interface.
 * </p>
 *
 * @author ahmed_fadlus
 */
public class BankImpl extends BankBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a bank model instance should use the {@link com.stc.echannels.epayments.model.Bank} interface instead.
	 */
	private boolean isPaymentTransactionRecorded;
	
	public boolean isPaymentTransactionRecorded() {
		return isPaymentTransactionRecorded;
	}
	public void setPaymentTransactionRecorded(boolean isPaymentTransactionRecorded) {
		this.isPaymentTransactionRecorded = isPaymentTransactionRecorded;
	}
	public String getName(Locale locale)
	{
		return locale.getLanguage().equals("ar")?this.getNameAr():this.getNameEn();
	}
	public BankImpl() {
	}
}