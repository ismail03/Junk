package com.stc.echannels.epayments.model;

import com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentTransactionDetailsServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentTransactionDetailsServiceSoap
 * @generated
 */
public class PaymentTransactionDetailsSoap implements Serializable {
    private String _epayTransId;
    private String _epayInstanceId;
    private String _accountNumber;
    private long _serviceTypeId;
    private long _transAmount;
    private String _transValue;
    private Date _processDate;
    private String _serviceNumber;
    private String _idType;
    private String _recipientId;
    private String _recipientIdType;
    private String _notificationNumber;
    private String _processStatus;
    private String _serviceCategory;
    private String _reasonCode;
    private String _nativeReasonCode;

    public PaymentTransactionDetailsSoap() {
    }

    public static PaymentTransactionDetailsSoap toSoapModel(
        PaymentTransactionDetails model) {
        PaymentTransactionDetailsSoap soapModel = new PaymentTransactionDetailsSoap();

        soapModel.setEpayTransId(model.getEpayTransId());
        soapModel.setEpayInstanceId(model.getEpayInstanceId());
        soapModel.setAccountNumber(model.getAccountNumber());
        soapModel.setServiceTypeId(model.getServiceTypeId());
        soapModel.setTransAmount(model.getTransAmount());
        soapModel.setTransValue(model.getTransValue());
        soapModel.setProcessDate(model.getProcessDate());
        soapModel.setServiceNumber(model.getServiceNumber());
        soapModel.setIdType(model.getIdType());
        soapModel.setRecipientId(model.getRecipientId());
        soapModel.setRecipientIdType(model.getRecipientIdType());
        soapModel.setNotificationNumber(model.getNotificationNumber());
        soapModel.setProcessStatus(model.getProcessStatus());
        soapModel.setServiceCategory(model.getServiceCategory());
        soapModel.setReasonCode(model.getReasonCode());
        soapModel.setNativeReasonCode(model.getNativeReasonCode());

        return soapModel;
    }

    public static PaymentTransactionDetailsSoap[] toSoapModels(
        PaymentTransactionDetails[] models) {
        PaymentTransactionDetailsSoap[] soapModels = new PaymentTransactionDetailsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentTransactionDetailsSoap[][] toSoapModels(
        PaymentTransactionDetails[][] models) {
        PaymentTransactionDetailsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentTransactionDetailsSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentTransactionDetailsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentTransactionDetailsSoap[] toSoapModels(
        List<PaymentTransactionDetails> models) {
        List<PaymentTransactionDetailsSoap> soapModels = new ArrayList<PaymentTransactionDetailsSoap>(models.size());

        for (PaymentTransactionDetails model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentTransactionDetailsSoap[soapModels.size()]);
    }

    public PaymentTransactionDetailsPK getPrimaryKey() {
        return new PaymentTransactionDetailsPK(_epayTransId, _epayInstanceId);
    }

    public void setPrimaryKey(PaymentTransactionDetailsPK pk) {
        setEpayTransId(pk.epayTransId);
        setEpayInstanceId(pk.epayInstanceId);
    }

    public String getEpayTransId() {
        return _epayTransId;
    }

    public void setEpayTransId(String epayTransId) {
        _epayTransId = epayTransId;
    }

    public String getEpayInstanceId() {
        return _epayInstanceId;
    }

    public void setEpayInstanceId(String epayInstanceId) {
        _epayInstanceId = epayInstanceId;
    }

    public String getAccountNumber() {
        return _accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        _accountNumber = accountNumber;
    }

    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;
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

    public Date getProcessDate() {
        return _processDate;
    }

    public void setProcessDate(Date processDate) {
        _processDate = processDate;
    }

    public String getServiceNumber() {
        return _serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        _serviceNumber = serviceNumber;
    }

    public String getIdType() {
        return _idType;
    }

    public void setIdType(String idType) {
        _idType = idType;
    }

    public String getRecipientId() {
        return _recipientId;
    }

    public void setRecipientId(String recipientId) {
        _recipientId = recipientId;
    }

    public String getRecipientIdType() {
        return _recipientIdType;
    }

    public void setRecipientIdType(String recipientIdType) {
        _recipientIdType = recipientIdType;
    }

    public String getNotificationNumber() {
        return _notificationNumber;
    }

    public void setNotificationNumber(String notificationNumber) {
        _notificationNumber = notificationNumber;
    }

    public String getProcessStatus() {
        return _processStatus;
    }

    public void setProcessStatus(String processStatus) {
        _processStatus = processStatus;
    }

    public String getServiceCategory() {
        return _serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        _serviceCategory = serviceCategory;
    }

    public String getReasonCode() {
        return _reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        _reasonCode = reasonCode;
    }

    public String getNativeReasonCode() {
        return _nativeReasonCode;
    }

    public void setNativeReasonCode(String nativeReasonCode) {
        _nativeReasonCode = nativeReasonCode;
    }
}
