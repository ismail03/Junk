package com.stc.echannels.epayments.custommodel;

import java.util.Date;

public class RefundTransactionsCustomModel {
	
	private String epayTransId;
	private String accountNumber;
	private String serviceTypeNameEn;
	private long transAmount;
	private String paymentMethodNameEn;
	private String paymentChannelNameEn;
	private String bankNameEn;
	private Date refundSubmissionDate;
	private Date processDate;
	private String paymentStatus;
	private String reason;
	private String beneficiaryId;
	private String beneficiaryServiceNumber;
	private String businessService;
	
	private String refundStatus;
	private String refundId;
	private long refundAmount;
	private Date refundApprovalDate;
	private Date fromDate;
	private Date todate;
	
	

	public RefundTransactionsCustomModel() {
		super();
	}
	
	

	public RefundTransactionsCustomModel(String epayTransId,
			String accountNumber, String serviceTypeNameEn, long transAmount,
			String paymentMethodNameEn, String paymentChannelNameEn,
			String bankNameEn, Date refundSubmissionDate, Date processDate,
			String paymentStatus, String reason, String beneficiaryId,
			String beneficiaryServiceNumber, String businessService,
			String refundStatus, String refundId, long refundAmount,
			Date refundApprovalDate, Date fromDate, Date todate) {
		super();
		this.epayTransId = epayTransId;
		this.accountNumber = accountNumber;
		this.serviceTypeNameEn = serviceTypeNameEn;
		this.transAmount = transAmount;
		this.paymentMethodNameEn = paymentMethodNameEn;
		this.paymentChannelNameEn = paymentChannelNameEn;
		this.bankNameEn = bankNameEn;
		this.refundSubmissionDate = refundSubmissionDate;
		this.processDate = processDate;
		this.paymentStatus = paymentStatus;
		this.reason = reason;
		this.beneficiaryId = beneficiaryId;
		this.beneficiaryServiceNumber = beneficiaryServiceNumber;
		this.businessService = businessService;
		this.refundStatus = refundStatus;
		this.refundId = refundId;
		this.refundAmount = refundAmount;
		this.refundApprovalDate = refundApprovalDate;
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

	public Date getRefundSubmissionDate() {
		return refundSubmissionDate;
	}

	public void setRefundSubmissionDate(Date refundSubmissionDate) {
		this.refundSubmissionDate = refundSubmissionDate;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public long getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getRefundApprovalDate() {
		return refundApprovalDate;
	}

	public void setRefundApprovalDate(Date refundApprovalDate) {
		this.refundApprovalDate = refundApprovalDate;
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
