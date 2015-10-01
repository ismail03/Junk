package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentTransactionsServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentTransactionsServiceSoap
 * @generated
 */
public class PaymentTransactionsSoap implements Serializable {
    private String _epayTransId;
    private long _transAmount;
    private String _transValue;
    private long _transAmotChkDigit;
    private String _processorReference;
    private long _channelId;
    private String _pmtBankId;
    private String _pmtBranchId;
    private Date _transProcessDate;
    private String _batchId;
    private long _serviceId;
    private Date _appliedDate;
    private long _appliedAmount;
    private String _processStatus;
    private String _notificationNumber;
    private String _currencyCode;
    private String _confirmationNumber;
    private Date _pmtRecievedDate;
    private String _reasonCode;
    private long _eventTypeId;
    private long _pmtMethodId;
    private String _pmtType;
    private String _rpmId;
    private String _nativeReasonCode;
    private long _feeId;
    private String _requestLocation;
    private String _profileId;
    private String _senderId;
    private String _last4Digits;
    private String _cardType;
    private Date _expiryDate;
    private String _sourceTransType;

    public PaymentTransactionsSoap() {
    }

    public static PaymentTransactionsSoap toSoapModel(PaymentTransactions model) {
        PaymentTransactionsSoap soapModel = new PaymentTransactionsSoap();

        soapModel.setEpayTransId(model.getEpayTransId());
        soapModel.setTransAmount(model.getTransAmount());
        soapModel.setTransValue(model.getTransValue());
        soapModel.setTransAmotChkDigit(model.getTransAmotChkDigit());
        soapModel.setProcessorReference(model.getProcessorReference());
        soapModel.setChannelId(model.getChannelId());
        soapModel.setPmtBankId(model.getPmtBankId());
        soapModel.setPmtBranchId(model.getPmtBranchId());
        soapModel.setTransProcessDate(model.getTransProcessDate());
        soapModel.setBatchId(model.getBatchId());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setAppliedDate(model.getAppliedDate());
        soapModel.setAppliedAmount(model.getAppliedAmount());
        soapModel.setProcessStatus(model.getProcessStatus());
        soapModel.setNotificationNumber(model.getNotificationNumber());
        soapModel.setCurrencyCode(model.getCurrencyCode());
        soapModel.setConfirmationNumber(model.getConfirmationNumber());
        soapModel.setPmtRecievedDate(model.getPmtRecievedDate());
        soapModel.setReasonCode(model.getReasonCode());
        soapModel.setEventTypeId(model.getEventTypeId());
        soapModel.setPmtMethodId(model.getPmtMethodId());
        soapModel.setPmtType(model.getPmtType());
        soapModel.setRpmId(model.getRpmId());
        soapModel.setNativeReasonCode(model.getNativeReasonCode());
        soapModel.setFeeId(model.getFeeId());
        soapModel.setRequestLocation(model.getRequestLocation());
        soapModel.setProfileId(model.getProfileId());
        soapModel.setSenderId(model.getSenderId());
        soapModel.setLast4Digits(model.getLast4Digits());
        soapModel.setCardType(model.getCardType());
        soapModel.setExpiryDate(model.getExpiryDate());
        soapModel.setSourceTransType(model.getSourceTransType());

        return soapModel;
    }

    public static PaymentTransactionsSoap[] toSoapModels(
        PaymentTransactions[] models) {
        PaymentTransactionsSoap[] soapModels = new PaymentTransactionsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentTransactionsSoap[][] toSoapModels(
        PaymentTransactions[][] models) {
        PaymentTransactionsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentTransactionsSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentTransactionsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentTransactionsSoap[] toSoapModels(
        List<PaymentTransactions> models) {
        List<PaymentTransactionsSoap> soapModels = new ArrayList<PaymentTransactionsSoap>(models.size());

        for (PaymentTransactions model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentTransactionsSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _epayTransId;
    }

    public void setPrimaryKey(String pk) {
        setEpayTransId(pk);
    }

    public String getEpayTransId() {
        return _epayTransId;
    }

    public void setEpayTransId(String epayTransId) {
        _epayTransId = epayTransId;
    }

    public long getTransAmount() {
        return _transAmount;
    }

    public void setTransAmount(long transAmount) {
        _transAmount = transAmount;
    }

    public String getTransValue() {
        return _transValue;
    }

    public void setTransValue(String transValue) {
        _transValue = transValue;
    }

    public long getTransAmotChkDigit() {
        return _transAmotChkDigit;
    }

    public void setTransAmotChkDigit(long transAmotChkDigit) {
        _transAmotChkDigit = transAmotChkDigit;
    }

    public String getProcessorReference() {
        return _processorReference;
    }

    public void setProcessorReference(String processorReference) {
        _processorReference = processorReference;
    }

    public long getChannelId() {
        return _channelId;
    }

    public void setChannelId(long channelId) {
        _channelId = channelId;
    }

    public String getPmtBankId() {
        return _pmtBankId;
    }

    public void setPmtBankId(String pmtBankId) {
        _pmtBankId = pmtBankId;
    }

    public String getPmtBranchId() {
        return _pmtBranchId;
    }

    public void setPmtBranchId(String pmtBranchId) {
        _pmtBranchId = pmtBranchId;
    }

    public Date getTransProcessDate() {
        return _transProcessDate;
    }

    public void setTransProcessDate(Date transProcessDate) {
        _transProcessDate = transProcessDate;
    }

    public String getBatchId() {
        return _batchId;
    }

    public void setBatchId(String batchId) {
        _batchId = batchId;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }

    public Date getAppliedDate() {
        return _appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        _appliedDate = appliedDate;
    }

    public long getAppliedAmount() {
        return _appliedAmount;
    }

    public void setAppliedAmount(long appliedAmount) {
        _appliedAmount = appliedAmount;
    }

    public String getProcessStatus() {
        return _processStatus;
    }

    public void setProcessStatus(String processStatus) {
        _processStatus = processStatus;
    }

    public String getNotificationNumber() {
        return _notificationNumber;
    }

    public void setNotificationNumber(String notificationNumber) {
        _notificationNumber = notificationNumber;
    }

    public String getCurrencyCode() {
        return _currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        _currencyCode = currencyCode;
    }

    public String getConfirmationNumber() {
        return _confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        _confirmationNumber = confirmationNumber;
    }

    public Date getPmtRecievedDate() {
        return _pmtRecievedDate;
    }

    public void setPmtRecievedDate(Date pmtRecievedDate) {
        _pmtRecievedDate = pmtRecievedDate;
    }

    public String getReasonCode() {
        return _reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        _reasonCode = reasonCode;
    }

    public long getEventTypeId() {
        return _eventTypeId;
    }

    public void setEventTypeId(long eventTypeId) {
        _eventTypeId = eventTypeId;
    }

    public long getPmtMethodId() {
        return _pmtMethodId;
    }

    public void setPmtMethodId(long pmtMethodId) {
        _pmtMethodId = pmtMethodId;
    }

    public String getPmtType() {
        return _pmtType;
    }

    public void setPmtType(String pmtType) {
        _pmtType = pmtType;
    }

    public String getRpmId() {
        return _rpmId;
    }

    public void setRpmId(String rpmId) {
        _rpmId = rpmId;
    }

    public String getNativeReasonCode() {
        return _nativeReasonCode;
    }

    public void setNativeReasonCode(String nativeReasonCode) {
        _nativeReasonCode = nativeReasonCode;
    }

    public long getFeeId() {
        return _feeId;
    }

    public void setFeeId(long feeId) {
        _feeId = feeId;
    }

    public String getRequestLocation() {
        return _requestLocation;
    }

    public void setRequestLocation(String requestLocation) {
        _requestLocation = requestLocation;
    }

    public String getProfileId() {
        return _profileId;
    }

    public void setProfileId(String profileId) {
        _profileId = profileId;
    }

    public String getSenderId() {
        return _senderId;
    }

    public void setSenderId(String senderId) {
        _senderId = senderId;
    }

    public String getLast4Digits() {
        return _last4Digits;
    }

    public void setLast4Digits(String last4Digits) {
        _last4Digits = last4Digits;
    }

    public String getCardType() {
        return _cardType;
    }

    public void setCardType(String cardType) {
        _cardType = cardType;
    }

    public Date getExpiryDate() {
        return _expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        _expiryDate = expiryDate;
    }

    public String getSourceTransType() {
        return _sourceTransType;
    }

    public void setSourceTransType(String sourceTransType) {
        _sourceTransType = sourceTransType;
    }
}
