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

/**
 * The extended model implementation for the BankBranch service. Represents a row in the &quot;BRANCH_CODES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.model.BankBranch} interface.
 * </p>
 *
 * @author ahmed_fadlus
 */
public class BankBranchImpl extends BankBranchBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a bank branch model instance should use the {@link com.stc.echannels.epayments.model.BankBranch} interface instead.
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4023402657859407944L;
	private String bankNameEn;
	private String bankNameAr;
	private String stcBankCode;
	private String paymentChannelNameEn;
	private String paymentChannelNameAr;
	private boolean isPaymentTransactionRecorded;
	
	public String getBankNameEn() {
		return bankNameEn!=null?bankNameEn:"" ;
	}

	public void setBankNameEn(String bankNameEn) {
		this.bankNameEn = bankNameEn;
	}

	public String getBankNameAr() {
		return bankNameAr!=null ? bankNameAr : "";
	}

	public void setBankNameAr(String bankNameAr) {
		this.bankNameAr = bankNameAr;
	}

	

	public String getPaymentChannelNameEn() {
		return paymentChannelNameEn !=null ? paymentChannelNameEn : "" ;
	}

	public void setPaymentChannelNameEn(String paymentChannelNameEn) {
		this.paymentChannelNameEn = paymentChannelNameEn;
	}

	public String getPaymentChannelNameAr() {
		return paymentChannelNameAr != null ? paymentChannelNameAr : "";
	}

	public void setPaymentChannelNameAr(String paymentChannelNameAr) {
		this.paymentChannelNameAr = paymentChannelNameAr;
	}
	
	

	public String getStcBankCode() {
		return stcBankCode !=null ? stcBankCode : "" ;
	}

	public void setStcBankCode(String stcBankCode) {
		this.stcBankCode = stcBankCode;
	}

	public boolean isPaymentTransactionRecorded() {
		return isPaymentTransactionRecorded;
	}

	public void setPaymentTransactionRecorded(boolean isPaymentTransactionRecorded) {
		this.isPaymentTransactionRecorded = isPaymentTransactionRecorded;
	}

	public BankBranchImpl() {
	}
}