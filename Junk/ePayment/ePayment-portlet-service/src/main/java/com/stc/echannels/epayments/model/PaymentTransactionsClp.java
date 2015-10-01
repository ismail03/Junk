package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentTransactionsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PaymentTransactionsClp extends BaseModelImpl<PaymentTransactions>
    implements PaymentTransactions {
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
    private BaseModel<?> _paymentTransactionsRemoteModel;

    public PaymentTransactionsClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentTransactions.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentTransactions.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _epayTransId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setEpayTransId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _epayTransId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("epayTransId", getEpayTransId());
        attributes.put("transAmount", getTransAmount());
        attributes.put("transValue", getTransValue());
        attributes.put("transAmotChkDigit", getTransAmotChkDigit());
        attributes.put("processorReference", getProcessorReference());
        attributes.put("channelId", getChannelId());
        attributes.put("pmtBankId", getPmtBankId());
        attributes.put("pmtBranchId", getPmtBranchId());
        attributes.put("transProcessDate", getTransProcessDate());
        attributes.put("batchId", getBatchId());
        attributes.put("serviceId", getServiceId());
        attributes.put("appliedDate", getAppliedDate());
        attributes.put("appliedAmount", getAppliedAmount());
        attributes.put("processStatus", getProcessStatus());
        attributes.put("notificationNumber", getNotificationNumber());
        attributes.put("currencyCode", getCurrencyCode());
        attributes.put("confirmationNumber", getConfirmationNumber());
        attributes.put("pmtRecievedDate", getPmtRecievedDate());
        attributes.put("reasonCode", getReasonCode());
        attributes.put("eventTypeId", getEventTypeId());
        attributes.put("pmtMethodId", getPmtMethodId());
        attributes.put("pmtType", getPmtType());
        attributes.put("rpmId", getRpmId());
        attributes.put("nativeReasonCode", getNativeReasonCode());
        attributes.put("feeId", getFeeId());
        attributes.put("requestLocation", getRequestLocation());
        attributes.put("profileId", getProfileId());
        attributes.put("senderId", getSenderId());
        attributes.put("last4Digits", getLast4Digits());
        attributes.put("cardType", getCardType());
        attributes.put("expiryDate", getExpiryDate());
        attributes.put("sourceTransType", getSourceTransType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String epayTransId = (String) attributes.get("epayTransId");

        if (epayTransId != null) {
            setEpayTransId(epayTransId);
        }

        Long transAmount = (Long) attributes.get("transAmount");

        if (transAmount != null) {
            setTransAmount(transAmount);
        }

        String transValue = (String) attributes.get("transValue");

        if (transValue != null) {
            setTransValue(transValue);
        }

        Long transAmotChkDigit = (Long) attributes.get("transAmotChkDigit");

        if (transAmotChkDigit != null) {
            setTransAmotChkDigit(transAmotChkDigit);
        }

        String processorReference = (String) attributes.get(
                "processorReference");

        if (processorReference != null) {
            setProcessorReference(processorReference);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        String pmtBankId = (String) attributes.get("pmtBankId");

        if (pmtBankId != null) {
            setPmtBankId(pmtBankId);
        }

        String pmtBranchId = (String) attributes.get("pmtBranchId");

        if (pmtBranchId != null) {
            setPmtBranchId(pmtBranchId);
        }

        Date transProcessDate = (Date) attributes.get("transProcessDate");

        if (transProcessDate != null) {
            setTransProcessDate(transProcessDate);
        }

        String batchId = (String) attributes.get("batchId");

        if (batchId != null) {
            setBatchId(batchId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Date appliedDate = (Date) attributes.get("appliedDate");

        if (appliedDate != null) {
            setAppliedDate(appliedDate);
        }

        Long appliedAmount = (Long) attributes.get("appliedAmount");

        if (appliedAmount != null) {
            setAppliedAmount(appliedAmount);
        }

        String processStatus = (String) attributes.get("processStatus");

        if (processStatus != null) {
            setProcessStatus(processStatus);
        }

        String notificationNumber = (String) attributes.get(
                "notificationNumber");

        if (notificationNumber != null) {
            setNotificationNumber(notificationNumber);
        }

        String currencyCode = (String) attributes.get("currencyCode");

        if (currencyCode != null) {
            setCurrencyCode(currencyCode);
        }

        String confirmationNumber = (String) attributes.get(
                "confirmationNumber");

        if (confirmationNumber != null) {
            setConfirmationNumber(confirmationNumber);
        }

        Date pmtRecievedDate = (Date) attributes.get("pmtRecievedDate");

        if (pmtRecievedDate != null) {
            setPmtRecievedDate(pmtRecievedDate);
        }

        String reasonCode = (String) attributes.get("reasonCode");

        if (reasonCode != null) {
            setReasonCode(reasonCode);
        }

        Long eventTypeId = (Long) attributes.get("eventTypeId");

        if (eventTypeId != null) {
            setEventTypeId(eventTypeId);
        }

        Long pmtMethodId = (Long) attributes.get("pmtMethodId");

        if (pmtMethodId != null) {
            setPmtMethodId(pmtMethodId);
        }

        String pmtType = (String) attributes.get("pmtType");

        if (pmtType != null) {
            setPmtType(pmtType);
        }

        String rpmId = (String) attributes.get("rpmId");

        if (rpmId != null) {
            setRpmId(rpmId);
        }

        String nativeReasonCode = (String) attributes.get("nativeReasonCode");

        if (nativeReasonCode != null) {
            setNativeReasonCode(nativeReasonCode);
        }

        Long feeId = (Long) attributes.get("feeId");

        if (feeId != null) {
            setFeeId(feeId);
        }

        String requestLocation = (String) attributes.get("requestLocation");

        if (requestLocation != null) {
            setRequestLocation(requestLocation);
        }

        String profileId = (String) attributes.get("profileId");

        if (profileId != null) {
            setProfileId(profileId);
        }

        String senderId = (String) attributes.get("senderId");

        if (senderId != null) {
            setSenderId(senderId);
        }

        String last4Digits = (String) attributes.get("last4Digits");

        if (last4Digits != null) {
            setLast4Digits(last4Digits);
        }

        String cardType = (String) attributes.get("cardType");

        if (cardType != null) {
            setCardType(cardType);
        }

        Date expiryDate = (Date) attributes.get("expiryDate");

        if (expiryDate != null) {
            setExpiryDate(expiryDate);
        }

        String sourceTransType = (String) attributes.get("sourceTransType");

        if (sourceTransType != null) {
            setSourceTransType(sourceTransType);
        }
    }

    @Override
    public String getEpayTransId() {
        return _epayTransId;
    }

    @Override
    public void setEpayTransId(String epayTransId) {
        _epayTransId = epayTransId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setEpayTransId", String.class);

                method.invoke(_paymentTransactionsRemoteModel, epayTransId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTransAmount() {
        return _transAmount;
    }

    @Override
    public void setTransAmount(long transAmount) {
        _transAmount = transAmount;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setTransAmount", long.class);

                method.invoke(_paymentTransactionsRemoteModel, transAmount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTransValue() {
        return _transValue;
    }

    @Override
    public void setTransValue(String transValue) {
        _transValue = transValue;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setTransValue", String.class);

                method.invoke(_paymentTransactionsRemoteModel, transValue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTransAmotChkDigit() {
        return _transAmotChkDigit;
    }

    @Override
    public void setTransAmotChkDigit(long transAmotChkDigit) {
        _transAmotChkDigit = transAmotChkDigit;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setTransAmotChkDigit",
                        long.class);

                method.invoke(_paymentTransactionsRemoteModel, transAmotChkDigit);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProcessorReference() {
        return _processorReference;
    }

    @Override
    public void setProcessorReference(String processorReference) {
        _processorReference = processorReference;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setProcessorReference",
                        String.class);

                method.invoke(_paymentTransactionsRemoteModel,
                    processorReference);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getChannelId() {
        return _channelId;
    }

    @Override
    public void setChannelId(long channelId) {
        _channelId = channelId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setChannelId", long.class);

                method.invoke(_paymentTransactionsRemoteModel, channelId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPmtBankId() {
        return _pmtBankId;
    }

    @Override
    public void setPmtBankId(String pmtBankId) {
        _pmtBankId = pmtBankId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtBankId", String.class);

                method.invoke(_paymentTransactionsRemoteModel, pmtBankId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPmtBranchId() {
        return _pmtBranchId;
    }

    @Override
    public void setPmtBranchId(String pmtBranchId) {
        _pmtBranchId = pmtBranchId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtBranchId", String.class);

                method.invoke(_paymentTransactionsRemoteModel, pmtBranchId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getTransProcessDate() {
        return _transProcessDate;
    }

    @Override
    public void setTransProcessDate(Date transProcessDate) {
        _transProcessDate = transProcessDate;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setTransProcessDate",
                        Date.class);

                method.invoke(_paymentTransactionsRemoteModel, transProcessDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBatchId() {
        return _batchId;
    }

    @Override
    public void setBatchId(String batchId) {
        _batchId = batchId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setBatchId", String.class);

                method.invoke(_paymentTransactionsRemoteModel, batchId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getServiceId() {
        return _serviceId;
    }

    @Override
    public void setServiceId(long serviceId) {
        _serviceId = serviceId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_paymentTransactionsRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getAppliedDate() {
        return _appliedDate;
    }

    @Override
    public void setAppliedDate(Date appliedDate) {
        _appliedDate = appliedDate;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setAppliedDate", Date.class);

                method.invoke(_paymentTransactionsRemoteModel, appliedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAppliedAmount() {
        return _appliedAmount;
    }

    @Override
    public void setAppliedAmount(long appliedAmount) {
        _appliedAmount = appliedAmount;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setAppliedAmount", long.class);

                method.invoke(_paymentTransactionsRemoteModel, appliedAmount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProcessStatus() {
        return _processStatus;
    }

    @Override
    public void setProcessStatus(String processStatus) {
        _processStatus = processStatus;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setProcessStatus", String.class);

                method.invoke(_paymentTransactionsRemoteModel, processStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNotificationNumber() {
        return _notificationNumber;
    }

    @Override
    public void setNotificationNumber(String notificationNumber) {
        _notificationNumber = notificationNumber;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setNotificationNumber",
                        String.class);

                method.invoke(_paymentTransactionsRemoteModel,
                    notificationNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCurrencyCode() {
        return _currencyCode;
    }

    @Override
    public void setCurrencyCode(String currencyCode) {
        _currencyCode = currencyCode;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setCurrencyCode", String.class);

                method.invoke(_paymentTransactionsRemoteModel, currencyCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getConfirmationNumber() {
        return _confirmationNumber;
    }

    @Override
    public void setConfirmationNumber(String confirmationNumber) {
        _confirmationNumber = confirmationNumber;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setConfirmationNumber",
                        String.class);

                method.invoke(_paymentTransactionsRemoteModel,
                    confirmationNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPmtRecievedDate() {
        return _pmtRecievedDate;
    }

    @Override
    public void setPmtRecievedDate(Date pmtRecievedDate) {
        _pmtRecievedDate = pmtRecievedDate;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtRecievedDate", Date.class);

                method.invoke(_paymentTransactionsRemoteModel, pmtRecievedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReasonCode() {
        return _reasonCode;
    }

    @Override
    public void setReasonCode(String reasonCode) {
        _reasonCode = reasonCode;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setReasonCode", String.class);

                method.invoke(_paymentTransactionsRemoteModel, reasonCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getEventTypeId() {
        return _eventTypeId;
    }

    @Override
    public void setEventTypeId(long eventTypeId) {
        _eventTypeId = eventTypeId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setEventTypeId", long.class);

                method.invoke(_paymentTransactionsRemoteModel, eventTypeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPmtMethodId() {
        return _pmtMethodId;
    }

    @Override
    public void setPmtMethodId(long pmtMethodId) {
        _pmtMethodId = pmtMethodId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtMethodId", long.class);

                method.invoke(_paymentTransactionsRemoteModel, pmtMethodId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPmtType() {
        return _pmtType;
    }

    @Override
    public void setPmtType(String pmtType) {
        _pmtType = pmtType;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtType", String.class);

                method.invoke(_paymentTransactionsRemoteModel, pmtType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRpmId() {
        return _rpmId;
    }

    @Override
    public void setRpmId(String rpmId) {
        _rpmId = rpmId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setRpmId", String.class);

                method.invoke(_paymentTransactionsRemoteModel, rpmId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNativeReasonCode() {
        return _nativeReasonCode;
    }

    @Override
    public void setNativeReasonCode(String nativeReasonCode) {
        _nativeReasonCode = nativeReasonCode;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setNativeReasonCode",
                        String.class);

                method.invoke(_paymentTransactionsRemoteModel, nativeReasonCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFeeId() {
        return _feeId;
    }

    @Override
    public void setFeeId(long feeId) {
        _feeId = feeId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setFeeId", long.class);

                method.invoke(_paymentTransactionsRemoteModel, feeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRequestLocation() {
        return _requestLocation;
    }

    @Override
    public void setRequestLocation(String requestLocation) {
        _requestLocation = requestLocation;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setRequestLocation",
                        String.class);

                method.invoke(_paymentTransactionsRemoteModel, requestLocation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProfileId() {
        return _profileId;
    }

    @Override
    public void setProfileId(String profileId) {
        _profileId = profileId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setProfileId", String.class);

                method.invoke(_paymentTransactionsRemoteModel, profileId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSenderId() {
        return _senderId;
    }

    @Override
    public void setSenderId(String senderId) {
        _senderId = senderId;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setSenderId", String.class);

                method.invoke(_paymentTransactionsRemoteModel, senderId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLast4Digits() {
        return _last4Digits;
    }

    @Override
    public void setLast4Digits(String last4Digits) {
        _last4Digits = last4Digits;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setLast4Digits", String.class);

                method.invoke(_paymentTransactionsRemoteModel, last4Digits);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCardType() {
        return _cardType;
    }

    @Override
    public void setCardType(String cardType) {
        _cardType = cardType;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setCardType", String.class);

                method.invoke(_paymentTransactionsRemoteModel, cardType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getExpiryDate() {
        return _expiryDate;
    }

    @Override
    public void setExpiryDate(Date expiryDate) {
        _expiryDate = expiryDate;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setExpiryDate", Date.class);

                method.invoke(_paymentTransactionsRemoteModel, expiryDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSourceTransType() {
        return _sourceTransType;
    }

    @Override
    public void setSourceTransType(String sourceTransType) {
        _sourceTransType = sourceTransType;

        if (_paymentTransactionsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionsRemoteModel.getClass();

                Method method = clazz.getMethod("setSourceTransType",
                        String.class);

                method.invoke(_paymentTransactionsRemoteModel, sourceTransType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaymentTransactionsRemoteModel() {
        return _paymentTransactionsRemoteModel;
    }

    public void setPaymentTransactionsRemoteModel(
        BaseModel<?> paymentTransactionsRemoteModel) {
        _paymentTransactionsRemoteModel = paymentTransactionsRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _paymentTransactionsRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_paymentTransactionsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentTransactionsLocalServiceUtil.addPaymentTransactions(this);
        } else {
            PaymentTransactionsLocalServiceUtil.updatePaymentTransactions(this);
        }
    }

    @Override
    public PaymentTransactions toEscapedModel() {
        return (PaymentTransactions) ProxyUtil.newProxyInstance(PaymentTransactions.class.getClassLoader(),
            new Class[] { PaymentTransactions.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentTransactionsClp clone = new PaymentTransactionsClp();

        clone.setEpayTransId(getEpayTransId());
        clone.setTransAmount(getTransAmount());
        clone.setTransValue(getTransValue());
        clone.setTransAmotChkDigit(getTransAmotChkDigit());
        clone.setProcessorReference(getProcessorReference());
        clone.setChannelId(getChannelId());
        clone.setPmtBankId(getPmtBankId());
        clone.setPmtBranchId(getPmtBranchId());
        clone.setTransProcessDate(getTransProcessDate());
        clone.setBatchId(getBatchId());
        clone.setServiceId(getServiceId());
        clone.setAppliedDate(getAppliedDate());
        clone.setAppliedAmount(getAppliedAmount());
        clone.setProcessStatus(getProcessStatus());
        clone.setNotificationNumber(getNotificationNumber());
        clone.setCurrencyCode(getCurrencyCode());
        clone.setConfirmationNumber(getConfirmationNumber());
        clone.setPmtRecievedDate(getPmtRecievedDate());
        clone.setReasonCode(getReasonCode());
        clone.setEventTypeId(getEventTypeId());
        clone.setPmtMethodId(getPmtMethodId());
        clone.setPmtType(getPmtType());
        clone.setRpmId(getRpmId());
        clone.setNativeReasonCode(getNativeReasonCode());
        clone.setFeeId(getFeeId());
        clone.setRequestLocation(getRequestLocation());
        clone.setProfileId(getProfileId());
        clone.setSenderId(getSenderId());
        clone.setLast4Digits(getLast4Digits());
        clone.setCardType(getCardType());
        clone.setExpiryDate(getExpiryDate());
        clone.setSourceTransType(getSourceTransType());

        return clone;
    }

    @Override
    public int compareTo(PaymentTransactions paymentTransactions) {
        String primaryKey = paymentTransactions.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentTransactionsClp)) {
            return false;
        }

        PaymentTransactionsClp paymentTransactions = (PaymentTransactionsClp) obj;

        String primaryKey = paymentTransactions.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(65);

        sb.append("{epayTransId=");
        sb.append(getEpayTransId());
        sb.append(", transAmount=");
        sb.append(getTransAmount());
        sb.append(", transValue=");
        sb.append(getTransValue());
        sb.append(", transAmotChkDigit=");
        sb.append(getTransAmotChkDigit());
        sb.append(", processorReference=");
        sb.append(getProcessorReference());
        sb.append(", channelId=");
        sb.append(getChannelId());
        sb.append(", pmtBankId=");
        sb.append(getPmtBankId());
        sb.append(", pmtBranchId=");
        sb.append(getPmtBranchId());
        sb.append(", transProcessDate=");
        sb.append(getTransProcessDate());
        sb.append(", batchId=");
        sb.append(getBatchId());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", appliedDate=");
        sb.append(getAppliedDate());
        sb.append(", appliedAmount=");
        sb.append(getAppliedAmount());
        sb.append(", processStatus=");
        sb.append(getProcessStatus());
        sb.append(", notificationNumber=");
        sb.append(getNotificationNumber());
        sb.append(", currencyCode=");
        sb.append(getCurrencyCode());
        sb.append(", confirmationNumber=");
        sb.append(getConfirmationNumber());
        sb.append(", pmtRecievedDate=");
        sb.append(getPmtRecievedDate());
        sb.append(", reasonCode=");
        sb.append(getReasonCode());
        sb.append(", eventTypeId=");
        sb.append(getEventTypeId());
        sb.append(", pmtMethodId=");
        sb.append(getPmtMethodId());
        sb.append(", pmtType=");
        sb.append(getPmtType());
        sb.append(", rpmId=");
        sb.append(getRpmId());
        sb.append(", nativeReasonCode=");
        sb.append(getNativeReasonCode());
        sb.append(", feeId=");
        sb.append(getFeeId());
        sb.append(", requestLocation=");
        sb.append(getRequestLocation());
        sb.append(", profileId=");
        sb.append(getProfileId());
        sb.append(", senderId=");
        sb.append(getSenderId());
        sb.append(", last4Digits=");
        sb.append(getLast4Digits());
        sb.append(", cardType=");
        sb.append(getCardType());
        sb.append(", expiryDate=");
        sb.append(getExpiryDate());
        sb.append(", sourceTransType=");
        sb.append(getSourceTransType());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(100);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentTransactions");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>epayTransId</column-name><column-value><![CDATA[");
        sb.append(getEpayTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transAmount</column-name><column-value><![CDATA[");
        sb.append(getTransAmount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transValue</column-name><column-value><![CDATA[");
        sb.append(getTransValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transAmotChkDigit</column-name><column-value><![CDATA[");
        sb.append(getTransAmotChkDigit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>processorReference</column-name><column-value><![CDATA[");
        sb.append(getProcessorReference());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>channelId</column-name><column-value><![CDATA[");
        sb.append(getChannelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtBankId</column-name><column-value><![CDATA[");
        sb.append(getPmtBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtBranchId</column-name><column-value><![CDATA[");
        sb.append(getPmtBranchId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transProcessDate</column-name><column-value><![CDATA[");
        sb.append(getTransProcessDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>batchId</column-name><column-value><![CDATA[");
        sb.append(getBatchId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>appliedDate</column-name><column-value><![CDATA[");
        sb.append(getAppliedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>appliedAmount</column-name><column-value><![CDATA[");
        sb.append(getAppliedAmount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>processStatus</column-name><column-value><![CDATA[");
        sb.append(getProcessStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>notificationNumber</column-name><column-value><![CDATA[");
        sb.append(getNotificationNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>currencyCode</column-name><column-value><![CDATA[");
        sb.append(getCurrencyCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>confirmationNumber</column-name><column-value><![CDATA[");
        sb.append(getConfirmationNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtRecievedDate</column-name><column-value><![CDATA[");
        sb.append(getPmtRecievedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>reasonCode</column-name><column-value><![CDATA[");
        sb.append(getReasonCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eventTypeId</column-name><column-value><![CDATA[");
        sb.append(getEventTypeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtMethodId</column-name><column-value><![CDATA[");
        sb.append(getPmtMethodId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtType</column-name><column-value><![CDATA[");
        sb.append(getPmtType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rpmId</column-name><column-value><![CDATA[");
        sb.append(getRpmId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nativeReasonCode</column-name><column-value><![CDATA[");
        sb.append(getNativeReasonCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>feeId</column-name><column-value><![CDATA[");
        sb.append(getFeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>requestLocation</column-name><column-value><![CDATA[");
        sb.append(getRequestLocation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>profileId</column-name><column-value><![CDATA[");
        sb.append(getProfileId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>senderId</column-name><column-value><![CDATA[");
        sb.append(getSenderId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>last4Digits</column-name><column-value><![CDATA[");
        sb.append(getLast4Digits());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cardType</column-name><column-value><![CDATA[");
        sb.append(getCardType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>expiryDate</column-name><column-value><![CDATA[");
        sb.append(getExpiryDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sourceTransType</column-name><column-value><![CDATA[");
        sb.append(getSourceTransType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
