package com.stc.echannels.epayments.custommodel;

import java.util.Date;

public class PaymentTransactionsCustomModel {
	
	private String epayTransId;
	private String accountNumber;
	private String serviceTypeNameEn;
	private long transAmount;
	private String paymentMethodNameEn;
	private String paymentChannelNameEn;
	private String bankNameEn;
	private Date transDate;
	private Date processDate;
	private String paymentStatus;
	private String reason;
	private String beneficiaryId;
	private String beneficiaryServiceNumber;
	private String businessService;
	private Date fromDate;
	private Date todate;
	
	
	public PaymentTransactionsCustomModel() {
		super();
	}
	
	public PaymentTransactionsCustomModel(String epayTransId,
			String accountNumber, String serviceTypeNameEn, long transAmount,
			String paymentMethodNameEn, String paymentChannelNameEn,
			String bankNameEn, Date transDate, Date processDate,
			String paymentStatus, String reason, String beneficiaryId,
			String beneficiaryServiceNumber, String businessService,
			Date fromDate, Date todate) {
		super();
		this.epayTransId = epayTransId;
		this.accountNumber = accountNumber;
		this.serviceTypeNameEn = serviceTypeNameEn;
		this.transAmount = transAmount;
		this.paymentMethodNameEn = paymentMethodNameEn;
		this.paymentChannelNameEn = paymentChannelNameEn;
		this.bankNameEn = bankNameEn;
		this.transDate = transDate;
		this.processDate = processDate;
		this.paymentStatus = paymentStatus;
		this.reason = reason;
		this.beneficiaryId = beneficiaryId;
		this.beneficiaryServiceNumber = beneficiaryServiceNumber;
		this.businessService = businessService;
		this.fromDate = fromDate;
		this.todate = todate;
	}

	public String getEpayTransId() {
		return epayTransId;
	}
	public void setEpayTransId(String epayTransId) {
		this.epayTransId = epayTransId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getServiceTypeNameEn() {
		return serviceTypeNameEn;
	}
	public void setServiceTypeNameEn(String serviceTypeNameEn) {
		this.serviceTypeNameEn = serviceTypeNameEn;
	}
	public long getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(long transAmount) {
		this.transAmount = transAmount;
	}
	public String getPaymentMethodNameEn() {
		return paymentMethodNameEn;
	}
	public void setPaymentMethodNameEn(String paymentMethodNameEn) {
		this.paymentMethodNameEn = paymentMethodNameEn;
	}
	public String getPaymentChannelNameEn() {
		return paymentChannelNameEn;
	}
	public void setPaymentChannelNameEn(String paymentChannelNameEn) {
		this.paymentChannelNameEn = paymentChannelNameEn;
	}
	public String getBankNameEn() {
		return bankNameEn;
	}
	public void setBankNameEn(String bankNameEn) {
		this.bankNameEn = bankNameEn;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getBeneficiaryServiceNumber() {
		return beneficiaryServiceNumber;
	}
	public void setBeneficiaryServiceNumber(String beneficiaryServiceNumber) {
		this.beneficiaryServiceNumber = beneficiaryServiceNumber;
	}
	public String getBusinessService() {
		return businessService;
	}
	public void setBusinessService(String businessService) {
		this.businessService = businessService;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	

}
