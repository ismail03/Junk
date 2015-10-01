package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentTransactions}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactions
 * @generated
 */
public class PaymentTransactionsWrapper implements PaymentTransactions,
    ModelWrapper<PaymentTransactions> {
    private PaymentTransactions _paymentTransactions;

    public PaymentTransactionsWrapper(PaymentTransactions paymentTransactions) {
        _paymentTransactions = paymentTransactions;
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

    /**
    * Returns the primary key of this payment transactions.
    *
    * @return the primary key of this payment transactions
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _paymentTransactions.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment transactions.
    *
    * @param primaryKey the primary key of this payment transactions
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _paymentTransactions.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the epay trans ID of this payment transactions.
    *
    * @return the epay trans ID of this payment transactions
    */
    @Override
    public java.lang.String getEpayTransId() {
        return _paymentTransactions.getEpayTransId();
    }

    /**
    * Sets the epay trans ID of this payment transactions.
    *
    * @param epayTransId the epay trans ID of this payment transactions
    */
    @Override
    public void setEpayTransId(java.lang.String epayTransId) {
        _paymentTransactions.setEpayTransId(epayTransId);
    }

    /**
    * Returns the trans amount of this payment transactions.
    *
    * @return the trans amount of this payment transactions
    */
    @Override
    public long getTransAmount() {
        return _paymentTransactions.getTransAmount();
    }

    /**
    * Sets the trans amount of this payment transactions.
    *
    * @param transAmount the trans amount of this payment transactions
    */
    @Override
    public void setTransAmount(long transAmount) {
        _paymentTransactions.setTransAmount(transAmount);
    }

    /**
    * Returns the trans value of this payment transactions.
    *
    * @return the trans value of this payment transactions
    */
    @Override
    public java.lang.String getTransValue() {
        return _paymentTransactions.getTransValue();
    }

    /**
    * Sets the trans value of this payment transactions.
    *
    * @param transValue the trans value of this payment transactions
    */
    @Override
    public void setTransValue(java.lang.String transValue) {
        _paymentTransactions.setTransValue(transValue);
    }

    /**
    * Returns the trans amot chk digit of this payment transactions.
    *
    * @return the trans amot chk digit of this payment transactions
    */
    @Override
    public long getTransAmotChkDigit() {
        return _paymentTransactions.getTransAmotChkDigit();
    }

    /**
    * Sets the trans amot chk digit of this payment transactions.
    *
    * @param transAmotChkDigit the trans amot chk digit of this payment transactions
    */
    @Override
    public void setTransAmotChkDigit(long transAmotChkDigit) {
        _paymentTransactions.setTransAmotChkDigit(transAmotChkDigit);
    }

    /**
    * Returns the processor reference of this payment transactions.
    *
    * @return the processor reference of this payment transactions
    */
    @Override
    public java.lang.String getProcessorReference() {
        return _paymentTransactions.getProcessorReference();
    }

    /**
    * Sets the processor reference of this payment transactions.
    *
    * @param processorReference the processor reference of this payment transactions
    */
    @Override
    public void setProcessorReference(java.lang.String processorReference) {
        _paymentTransactions.setProcessorReference(processorReference);
    }

    /**
    * Returns the channel ID of this payment transactions.
    *
    * @return the channel ID of this payment transactions
    */
    @Override
    public long getChannelId() {
        return _paymentTransactions.getChannelId();
    }

    /**
    * Sets the channel ID of this payment transactions.
    *
    * @param channelId the channel ID of this payment transactions
    */
    @Override
    public void setChannelId(long channelId) {
        _paymentTransactions.setChannelId(channelId);
    }

    /**
    * Returns the pmt bank ID of this payment transactions.
    *
    * @return the pmt bank ID of this payment transactions
    */
    @Override
    public java.lang.String getPmtBankId() {
        return _paymentTransactions.getPmtBankId();
    }

    /**
    * Sets the pmt bank ID of this payment transactions.
    *
    * @param pmtBankId the pmt bank ID of this payment transactions
    */
    @Override
    public void setPmtBankId(java.lang.String pmtBankId) {
        _paymentTransactions.setPmtBankId(pmtBankId);
    }

    /**
    * Returns the pmt branch ID of this payment transactions.
    *
    * @return the pmt branch ID of this payment transactions
    */
    @Override
    public java.lang.String getPmtBranchId() {
        return _paymentTransactions.getPmtBranchId();
    }

    /**
    * Sets the pmt branch ID of this payment transactions.
    *
    * @param pmtBranchId the pmt branch ID of this payment transactions
    */
    @Override
    public void setPmtBranchId(java.lang.String pmtBranchId) {
        _paymentTransactions.setPmtBranchId(pmtBranchId);
    }

    /**
    * Returns the trans process date of this payment transactions.
    *
    * @return the trans process date of this payment transactions
    */
    @Override
    public java.util.Date getTransProcessDate() {
        return _paymentTransactions.getTransProcessDate();
    }

    /**
    * Sets the trans process date of this payment transactions.
    *
    * @param transProcessDate the trans process date of this payment transactions
    */
    @Override
    public void setTransProcessDate(java.util.Date transProcessDate) {
        _paymentTransactions.setTransProcessDate(transProcessDate);
    }

    /**
    * Returns the batch ID of this payment transactions.
    *
    * @return the batch ID of this payment transactions
    */
    @Override
    public java.lang.String getBatchId() {
        return _paymentTransactions.getBatchId();
    }

    /**
    * Sets the batch ID of this payment transactions.
    *
    * @param batchId the batch ID of this payment transactions
    */
    @Override
    public void setBatchId(java.lang.String batchId) {
        _paymentTransactions.setBatchId(batchId);
    }

    /**
    * Returns the service ID of this payment transactions.
    *
    * @return the service ID of this payment transactions
    */
    @Override
    public long getServiceId() {
        return _paymentTransactions.getServiceId();
    }

    /**
    * Sets the service ID of this payment transactions.
    *
    * @param serviceId the service ID of this payment transactions
    */
    @Override
    public void setServiceId(long serviceId) {
        _paymentTransactions.setServiceId(serviceId);
    }

    /**
    * Returns the applied date of this payment transactions.
    *
    * @return the applied date of this payment transactions
    */
    @Override
    public java.util.Date getAppliedDate() {
        return _paymentTransactions.getAppliedDate();
    }

    /**
    * Sets the applied date of this payment transactions.
    *
    * @param appliedDate the applied date of this payment transactions
    */
    @Override
    public void setAppliedDate(java.util.Date appliedDate) {
        _paymentTransactions.setAppliedDate(appliedDate);
    }

    /**
    * Returns the applied amount of this payment transactions.
    *
    * @return the applied amount of this payment transactions
    */
    @Override
    public long getAppliedAmount() {
        return _paymentTransactions.getAppliedAmount();
    }

    /**
    * Sets the applied amount of this payment transactions.
    *
    * @param appliedAmount the applied amount of this payment transactions
    */
    @Override
    public void setAppliedAmount(long appliedAmount) {
        _paymentTransactions.setAppliedAmount(appliedAmount);
    }

    /**
    * Returns the process status of this payment transactions.
    *
    * @return the process status of this payment transactions
    */
    @Override
    public java.lang.String getProcessStatus() {
        return _paymentTransactions.getProcessStatus();
    }

    /**
    * Sets the process status of this payment transactions.
    *
    * @param processStatus the process status of this payment transactions
    */
    @Override
    public void setProcessStatus(java.lang.String processStatus) {
        _paymentTransactions.setProcessStatus(processStatus);
    }

    /**
    * Returns the notification number of this payment transactions.
    *
    * @return the notification number of this payment transactions
    */
    @Override
    public java.lang.String getNotificationNumber() {
        return _paymentTransactions.getNotificationNumber();
    }

    /**
    * Sets the notification number of this payment transactions.
    *
    * @param notificationNumber the notification number of this payment transactions
    */
    @Override
    public void setNotificationNumber(java.lang.String notificationNumber) {
        _paymentTransactions.setNotificationNumber(notificationNumber);
    }

    /**
    * Returns the currency code of this payment transactions.
    *
    * @return the currency code of this payment transactions
    */
    @Override
    public java.lang.String getCurrencyCode() {
        return _paymentTransactions.getCurrencyCode();
    }

    /**
    * Sets the currency code of this payment transactions.
    *
    * @param currencyCode the currency code of this payment transactions
    */
    @Override
    public void setCurrencyCode(java.lang.String currencyCode) {
        _paymentTransactions.setCurrencyCode(currencyCode);
    }

    /**
    * Returns the confirmation number of this payment transactions.
    *
    * @return the confirmation number of this payment transactions
    */
    @Override
    public java.lang.String getConfirmationNumber() {
        return _paymentTransactions.getConfirmationNumber();
    }

    /**
    * Sets the confirmation number of this payment transactions.
    *
    * @param confirmationNumber the confirmation number of this payment transactions
    */
    @Override
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        _paymentTransactions.setConfirmationNumber(confirmationNumber);
    }

    /**
    * Returns the pmt recieved date of this payment transactions.
    *
    * @return the pmt recieved date of this payment transactions
    */
    @Override
    public java.util.Date getPmtRecievedDate() {
        return _paymentTransactions.getPmtRecievedDate();
    }

    /**
    * Sets the pmt recieved date of this payment transactions.
    *
    * @param pmtRecievedDate the pmt recieved date of this payment transactions
    */
    @Override
    public void setPmtRecievedDate(java.util.Date pmtRecievedDate) {
        _paymentTransactions.setPmtRecievedDate(pmtRecievedDate);
    }

    /**
    * Returns the reason code of this payment transactions.
    *
    * @return the reason code of this payment transactions
    */
    @Override
    public java.lang.String getReasonCode() {
        return _paymentTransactions.getReasonCode();
    }

    /**
    * Sets the reason code of this payment transactions.
    *
    * @param reasonCode the reason code of this payment transactions
    */
    @Override
    public void setReasonCode(java.lang.String reasonCode) {
        _paymentTransactions.setReasonCode(reasonCode);
    }

    /**
    * Returns the event type ID of this payment transactions.
    *
    * @return the event type ID of this payment transactions
    */
    @Override
    public long getEventTypeId() {
        return _paymentTransactions.getEventTypeId();
    }

    /**
    * Sets the event type ID of this payment transactions.
    *
    * @param eventTypeId the event type ID of this payment transactions
    */
    @Override
    public void setEventTypeId(long eventTypeId) {
        _paymentTransactions.setEventTypeId(eventTypeId);
    }

    /**
    * Returns the pmt method ID of this payment transactions.
    *
    * @return the pmt method ID of this payment transactions
    */
    @Override
    public long getPmtMethodId() {
        return _paymentTransactions.getPmtMethodId();
    }

    /**
    * Sets the pmt method ID of this payment transactions.
    *
    * @param pmtMethodId the pmt method ID of this payment transactions
    */
    @Override
    public void setPmtMethodId(long pmtMethodId) {
        _paymentTransactions.setPmtMethodId(pmtMethodId);
    }

    /**
    * Returns the pmt type of this payment transactions.
    *
    * @return the pmt type of this payment transactions
    */
    @Override
    public java.lang.String getPmtType() {
        return _paymentTransactions.getPmtType();
    }

    /**
    * Sets the pmt type of this payment transactions.
    *
    * @param pmtType the pmt type of this payment transactions
    */
    @Override
    public void setPmtType(java.lang.String pmtType) {
        _paymentTransactions.setPmtType(pmtType);
    }

    /**
    * Returns the rpm ID of this payment transactions.
    *
    * @return the rpm ID of this payment transactions
    */
    @Override
    public java.lang.String getRpmId() {
        return _paymentTransactions.getRpmId();
    }

    /**
    * Sets the rpm ID of this payment transactions.
    *
    * @param rpmId the rpm ID of this payment transactions
    */
    @Override
    public void setRpmId(java.lang.String rpmId) {
        _paymentTransactions.setRpmId(rpmId);
    }

    /**
    * Returns the native reason code of this payment transactions.
    *
    * @return the native reason code of this payment transactions
    */
    @Override
    public java.lang.String getNativeReasonCode() {
        return _paymentTransactions.getNativeReasonCode();
    }

    /**
    * Sets the native reason code of this payment transactions.
    *
    * @param nativeReasonCode the native reason code of this payment transactions
    */
    @Override
    public void setNativeReasonCode(java.lang.String nativeReasonCode) {
        _paymentTransactions.setNativeReasonCode(nativeReasonCode);
    }

    /**
    * Returns the fee ID of this payment transactions.
    *
    * @return the fee ID of this payment transactions
    */
    @Override
    public long getFeeId() {
        return _paymentTransactions.getFeeId();
    }

    /**
    * Sets the fee ID of this payment transactions.
    *
    * @param feeId the fee ID of this payment transactions
    */
    @Override
    public void setFeeId(long feeId) {
        _paymentTransactions.setFeeId(feeId);
    }

    /**
    * Returns the request location of this payment transactions.
    *
    * @return the request location of this payment transactions
    */
    @Override
    public java.lang.String getRequestLocation() {
        return _paymentTransactions.getRequestLocation();
    }

    /**
    * Sets the request location of this payment transactions.
    *
    * @param requestLocation the request location of this payment transactions
    */
    @Override
    public void setRequestLocation(java.lang.String requestLocation) {
        _paymentTransactions.setRequestLocation(requestLocation);
    }

    /**
    * Returns the profile ID of this payment transactions.
    *
    * @return the profile ID of this payment transactions
    */
    @Override
    public java.lang.String getProfileId() {
        return _paymentTransactions.getProfileId();
    }

    /**
    * Sets the profile ID of this payment transactions.
    *
    * @param profileId the profile ID of this payment transactions
    */
    @Override
    public void setProfileId(java.lang.String profileId) {
        _paymentTransactions.setProfileId(profileId);
    }

    /**
    * Returns the sender ID of this payment transactions.
    *
    * @return the sender ID of this payment transactions
    */
    @Override
    public java.lang.String getSenderId() {
        return _paymentTransactions.getSenderId();
    }

    /**
    * Sets the sender ID of this payment transactions.
    *
    * @param senderId the sender ID of this payment transactions
    */
    @Override
    public void setSenderId(java.lang.String senderId) {
        _paymentTransactions.setSenderId(senderId);
    }

    /**
    * Returns the last4 digits of this payment transactions.
    *
    * @return the last4 digits of this payment transactions
    */
    @Override
    public java.lang.String getLast4Digits() {
        return _paymentTransactions.getLast4Digits();
    }

    /**
    * Sets the last4 digits of this payment transactions.
    *
    * @param last4Digits the last4 digits of this payment transactions
    */
    @Override
    public void setLast4Digits(java.lang.String last4Digits) {
        _paymentTransactions.setLast4Digits(last4Digits);
    }

    /**
    * Returns the card type of this payment transactions.
    *
    * @return the card type of this payment transactions
    */
    @Override
    public java.lang.String getCardType() {
        return _paymentTransactions.getCardType();
    }

    /**
    * Sets the card type of this payment transactions.
    *
    * @param cardType the card type of this payment transactions
    */
    @Override
    public void setCardType(java.lang.String cardType) {
        _paymentTransactions.setCardType(cardType);
    }

    /**
    * Returns the expiry date of this payment transactions.
    *
    * @return the expiry date of this payment transactions
    */
    @Override
    public java.util.Date getExpiryDate() {
        return _paymentTransactions.getExpiryDate();
    }

    /**
    * Sets the expiry date of this payment transactions.
    *
    * @param expiryDate the expiry date of this payment transactions
    */
    @Override
    public void setExpiryDate(java.util.Date expiryDate) {
        _paymentTransactions.setExpiryDate(expiryDate);
    }

    /**
    * Returns the source trans type of this payment transactions.
    *
    * @return the source trans type of this payment transactions
    */
    @Override
    public java.lang.String getSourceTransType() {
        return _paymentTransactions.getSourceTransType();
    }

    /**
    * Sets the source trans type of this payment transactions.
    *
    * @param sourceTransType the source trans type of this payment transactions
    */
    @Override
    public void setSourceTransType(java.lang.String sourceTransType) {
        _paymentTransactions.setSourceTransType(sourceTransType);
    }

    @Override
    public boolean isNew() {
        return _paymentTransactions.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentTransactions.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentTransactions.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentTransactions.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentTransactions.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentTransactions.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentTransactions.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentTransactions.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentTransactions.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentTransactions.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentTransactions.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentTransactionsWrapper((PaymentTransactions) _paymentTransactions.clone());
    }

    @Override
    public int compareTo(PaymentTransactions paymentTransactions) {
        return _paymentTransactions.compareTo(paymentTransactions);
    }

    @Override
    public int hashCode() {
        return _paymentTransactions.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentTransactions> toCacheModel() {
        return _paymentTransactions.toCacheModel();
    }

    @Override
    public PaymentTransactions toEscapedModel() {
        return new PaymentTransactionsWrapper(_paymentTransactions.toEscapedModel());
    }

    @Override
    public PaymentTransactions toUnescapedModel() {
        return new PaymentTransactionsWrapper(_paymentTransactions.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentTransactions.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentTransactions.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentTransactions.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentTransactionsWrapper)) {
            return false;
        }

        PaymentTransactionsWrapper paymentTransactionsWrapper = (PaymentTransactionsWrapper) obj;

        if (Validator.equals(_paymentTransactions,
                    paymentTransactionsWrapper._paymentTransactions)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentTransactions getWrappedPaymentTransactions() {
        return _paymentTransactions;
    }

    @Override
    public PaymentTransactions getWrappedModel() {
        return _paymentTransactions;
    }

    @Override
    public void resetOriginalValues() {
        _paymentTransactions.resetOriginalValues();
    }
}
