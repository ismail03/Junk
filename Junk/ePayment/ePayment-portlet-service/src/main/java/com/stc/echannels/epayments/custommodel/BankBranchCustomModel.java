package com.stc.echannels.epayments.custommodel;

public class BankBranchCustomModel {

	private String stcBankCode;
	private String bankNameEn;
	private String bankNameAr;
	private String stcBranchCode;
	private String bankId;
	private String paymentChannelNameEn;
	private String paymentChannelNameAr;
	private String paymentChannelId;
	public String getStcBankCode() {
		return stcBankCode;
	}
	public void setStcBankCode(String stcBankCode) {
		this.stcBankCode = stcBankCode;
	}
	public String getBankNameEn() {
		return bankNameEn;
	}
	public void setBankNameEn(String bankNameEn) {
		this.bankNameEn = bankNameEn;
	}
	public String getBankNameAr() {
		return bankNameAr;
	}
	public void setBankNameAr(String bankNameAr) {
		this.bankNameAr = bankNameAr;
	}
	public String getStcBranchCode() {
		return stcBranchCode;
	}
	public void setStcBranchCode(String stcBranchCode) {
		this.stcBranchCode = stcBranchCode;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getPaymentChannelNameEn() {
		return paymentChannelNameEn;
	}
	public void setPaymentChannelNameEn(String paymentChannelNameEn) {
		this.paymentChannelNameEn = paymentChannelNameEn;
	}
	public String getPaymentChannelNameAr() {
		return paymentChannelNameAr;
	}
	public void setPaymentChannelNameAr(String paymentChannelNameAr) {
		this.paymentChannelNameAr = paymentChannelNameAr;
	}
	public String getPaymentChannelId() {
		return paymentChannelId;
	}
	public void setPaymentChannelId(String paymentChannelId) {
		this.paymentChannelId = paymentChannelId;
	}
	@Override
	public String toString() {
		return "BankBranchModel [stcBankCode=" + stcBankCode + ", bankNameEn="
				+ bankNameEn + ", bankNameAr=" + bankNameAr
				+ ", stcBranchCode=" + stcBranchCode + ", bankId=" + bankId
				+ ", paymentChannelNameEn=" + paymentChannelNameEn
				+ ", paymentChannelNameAR=" + paymentChannelNameAr
				+ ", paymentChannelId=" + paymentChannelId + "]";
	}
	
}
