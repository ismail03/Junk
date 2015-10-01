package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentTransactionDetails}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionDetails
 * @generated
 */
public class PaymentTransactionDetailsWrapper
    implements PaymentTransactionDetails,
        ModelWrapper<PaymentTransactionDetails> {
    private PaymentTransactionDetails _paymentTransactionDetails;

    public PaymentTransactionDetailsWrapper(
        PaymentTransactionDetails paymentTransactionDetails) {
        _paymentTransactionDetails = paymentTransactionDetails;
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentTransactionDetails.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentTransactionDetails.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("epayTransId", getEpayTransId());
        attributes.put("epayInstanceId", getEpayInstanceId());
        attributes.put("accountNumber", getAccountNumber());
        attributes.put("serviceTypeId", getServiceTypeId());
        attributes.put("transAmount", getTransAmount());
        attributes.put("transValue", getTransValue());
        attributes.put("processDate", getProcessDate());
        attributes.put("serviceNumber", getServiceNumber());
        attributes.put("idType", getIdType());
        attributes.put("recipientId", getRecipientId());
        attributes.put("recipientIdType", getRecipientIdType());
        attributes.put("notificationNumber", getNotificationNumber());
        attributes.put("processStatus", getProcessStatus());
        attributes.put("serviceCategory", getServiceCategory());
        attributes.put("reasonCode", getReasonCode());
        attributes.put("nativeReasonCode", getNativeReasonCode());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String epayTransId = (String) attributes.get("epayTransId");

        if (epayTransId != null) {
            setEpayTransId(epayTransId);
        }

        String epayInstanceId = (String) attributes.get("epayInstanceId");

        if (epayInstanceId != null) {
            setEpayInstanceId(epayInstanceId);
        }

        String accountNumber = (String) attributes.get("accountNumber");

        if (accountNumber != null) {
            setAccountNumber(accountNumber);
        }

        Long serviceTypeId = (Long) attributes.get("serviceTypeId");

        if (serviceTypeId != null) {
            setServiceTypeId(serviceTypeId);
        }

        Long transAmount = (Long) attributes.get("transAmount");

        if (transAmount != null) {
            setTransAmount(transAmount);
        }

        String transValue = (String) attributes.get("transValue");

        if (transValue != null) {
            setTransValue(transValue);
        }

        Date processDate = (Date) attributes.get("processDate");

        if (processDate != null) {
            setProcessDate(processDate);
        }

        String serviceNumber = (String) attributes.get("serviceNumber");

        if (serviceNumber != null) {
            setServiceNumber(serviceNumber);
        }

        String idType = (String) attributes.get("idType");

        if (idType != null) {
            setIdType(idType);
        }

        String recipientId = (String) attributes.get("recipientId");

        if (recipientId != null) {
            setRecipientId(recipientId);
        }

        String recipientIdType = (String) attributes.get("recipientIdType");

        if (recipientIdType != null) {
            setRecipientIdType(recipientIdType);
        }

        String notificationNumber = (String) attributes.get(
                "notificationNumber");

        if (notificationNumber != null) {
            setNotificationNumber(notificationNumber);
        }

        String processStatus = (String) attributes.get("processStatus");

        if (processStatus != null) {
            setProcessStatus(processStatus);
        }

        String serviceCategory = (String) attributes.get("serviceCategory");

        if (serviceCategory != null) {
            setServiceCategory(serviceCategory);
        }

        String reasonCode = (String) attributes.get("reasonCode");

        if (reasonCode != null) {
            setReasonCode(reasonCode);
        }

        String nativeReasonCode = (String) attributes.get("nativeReasonCode");

        if (nativeReasonCode != null) {
            setNativeReasonCode(nativeReasonCode);
        }
    }

    /**
    * Returns the primary key of this payment transaction details.
    *
    * @return the primary key of this payment transaction details
    */
    @Override
    public com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK getPrimaryKey() {
        return _paymentTransactionDetails.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment transaction details.
    *
    * @param primaryKey the primary key of this payment transaction details
    */
    @Override
    public void setPrimaryKey(
        com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK primaryKey) {
        _paymentTransactionDetails.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the epay trans ID of this payment transaction details.
    *
    * @return the epay trans ID of this payment transaction details
    */
    @Override
    public java.lang.String getEpayTransId() {
        return _paymentTransactionDetails.getEpayTransId();
    }

    /**
    * Sets the epay trans ID of this payment transaction details.
    *
    * @param epayTransId the epay trans ID of this payment transaction details
    */
    @Override
    public void setEpayTransId(java.lang.String epayTransId) {
        _paymentTransactionDetails.setEpayTransId(epayTransId);
    }

    /**
    * Returns the epay instance ID of this payment transaction details.
    *
    * @return the epay instance ID of this payment transaction details
    */
    @Override
    public java.lang.String getEpayInstanceId() {
        return _paymentTransactionDetails.getEpayInstanceId();
    }

    /**
    * Sets the epay instance ID of this payment transaction details.
    *
    * @param epayInstanceId the epay instance ID of this payment transaction details
    */
    @Override
    public void setEpayInstanceId(java.lang.String epayInstanceId) {
        _paymentTransactionDetails.setEpayInstanceId(epayInstanceId);
    }

    /**
    * Returns the account number of this payment transaction details.
    *
    * @return the account number of this payment transaction details
    */
    @Override
    public java.lang.String getAccountNumber() {
        return _paymentTransactionDetails.getAccountNumber();
    }

    /**
    * Sets the account number of this payment transaction details.
    *
    * @param accountNumber the account number of this payment transaction details
    */
    @Override
    public void setAccountNumber(java.lang.String accountNumber) {
        _paymentTransactionDetails.setAccountNumber(accountNumber);
    }

    /**
    * Returns the service type ID of this payment transaction details.
    *
    * @return the service type ID of this payment transaction details
    */
    @Override
    public long getServiceTypeId() {
        return _paymentTransactionDetails.getServiceTypeId();
    }

    /**
    * Sets the service type ID of this payment transaction details.
    *
    * @param serviceTypeId the service type ID of this payment transaction details
    */
    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _paymentTransactionDetails.setServiceTypeId(serviceTypeId);
    }

    /**
    * Returns the trans amount of this payment transaction details.
    *
    * @return the trans amount of this payment transaction details
    */
    @Override
    public long getTransAmount() {
        return _paymentTransactionDetails.getTransAmount();
    }

    /**
    * Sets the trans amount of this payment transaction details.
    *
    * @param transAmount the trans amount of this payment transaction details
    */
    @Override
    public void setTransAmount(long transAmount) {
        _paymentTransactionDetails.setTransAmount(transAmount);
    }

    /**
    * Returns the trans value of this payment transaction details.
    *
    * @return the trans value of this payment transaction details
    */
    @Override
    public java.lang.String getTransValue() {
        return _paymentTransactionDetails.getTransValue();
    }

    /**
    * Sets the trans value of this payment transaction details.
    *
    * @param transValue the trans value of this payment transaction details
    */
    @Override
    public void setTransValue(java.lang.String transValue) {
        _paymentTransactionDetails.setTransValue(transValue);
    }

    /**
    * Returns the process date of this payment transaction details.
    *
    * @return the process date of this payment transaction details
    */
    @Override
    public java.util.Date getProcessDate() {
        return _paymentTransactionDetails.getProcessDate();
    }

    /**
    * Sets the process date of this payment transaction details.
    *
    * @param processDate the process date of this payment transaction details
    */
    @Override
    public void setProcessDate(java.util.Date processDate) {
        _paymentTransactionDetails.setProcessDate(processDate);
    }

    /**
    * Returns the service number of this payment transaction details.
    *
    * @return the service number of this payment transaction details
    */
    @Override
    public java.lang.String getServiceNumber() {
        return _paymentTransactionDetails.getServiceNumber();
    }

    /**
    * Sets the service number of this payment transaction details.
    *
    * @param serviceNumber the service number of this payment transaction details
    */
    @Override
    public void setServiceNumber(java.lang.String serviceNumber) {
        _paymentTransactionDetails.setServiceNumber(serviceNumber);
    }

    /**
    * Returns the id type of this payment transaction details.
    *
    * @return the id type of this payment transaction details
    */
    @Override
    public java.lang.String getIdType() {
        return _paymentTransactionDetails.getIdType();
    }

    /**
    * Sets the id type of this payment transaction details.
    *
    * @param idType the id type of this payment transaction details
    */
    @Override
    public void setIdType(java.lang.String idType) {
        _paymentTransactionDetails.setIdType(idType);
    }

    /**
    * Returns the recipient ID of this payment transaction details.
    *
    * @return the recipient ID of this payment transaction details
    */
    @Override
    public java.lang.String getRecipientId() {
        return _paymentTransactionDetails.getRecipientId();
    }

    /**
    * Sets the recipient ID of this payment transaction details.
    *
    * @param recipientId the recipient ID of this payment transaction details
    */
    @Override
    public void setRecipientId(java.lang.String recipientId) {
        _paymentTransactionDetails.setRecipientId(recipientId);
    }

    /**
    * Returns the recipient ID type of this payment transaction details.
    *
    * @return the recipient ID type of this payment transaction details
    */
    @Override
    public java.lang.String getRecipientIdType() {
        return _paymentTransactionDetails.getRecipientIdType();
    }

    /**
    * Sets the recipient ID type of this payment transaction details.
    *
    * @param recipientIdType the recipient ID type of this payment transaction details
    */
    @Override
    public void setRecipientIdType(java.lang.String recipientIdType) {
        _paymentTransactionDetails.setRecipientIdType(recipientIdType);
    }

    /**
    * Returns the notification number of this payment transaction details.
    *
    * @return the notification number of this payment transaction details
    */
    @Override
    public java.lang.String getNotificationNumber() {
        return _paymentTransactionDetails.getNotificationNumber();
    }

    /**
    * Sets the notification number of this payment transaction details.
    *
    * @param notificationNumber the notification number of this payment transaction details
    */
    @Override
    public void setNotificationNumber(java.lang.String notificationNumber) {
        _paymentTransactionDetails.setNotificationNumber(notificationNumber);
    }

    /**
    * Returns the process status of this payment transaction details.
    *
    * @return the process status of this payment transaction details
    */
    @Override
    public java.lang.String getProcessStatus() {
        return _paymentTransactionDetails.getProcessStatus();
    }

    /**
    * Sets the process status of this payment transaction details.
    *
    * @param processStatus the process status of this payment transaction details
    */
    @Override
    public void setProcessStatus(java.lang.String processStatus) {
        _paymentTransactionDetails.setProcessStatus(processStatus);
    }

    /**
    * Returns the service category of this payment transaction details.
    *
    * @return the service category of this payment transaction details
    */
    @Override
    public java.lang.String getServiceCategory() {
        return _paymentTransactionDetails.getServiceCategory();
    }

    /**
    * Sets the service category of this payment transaction details.
    *
    * @param serviceCategory the service category of this payment transaction details
    */
    @Override
    public void setServiceCategory(java.lang.String serviceCategory) {
        _paymentTransactionDetails.setServiceCategory(serviceCategory);
    }

    /**
    * Returns the reason code of this payment transaction details.
    *
    * @return the reason code of this payment transaction details
    */
    @Override
    public java.lang.String getReasonCode() {
        return _paymentTransactionDetails.getReasonCode();
    }

    /**
    * Sets the reason code of this payment transaction details.
    *
    * @param reasonCode the reason code of this payment transaction details
    */
    @Override
    public void setReasonCode(java.lang.String reasonCode) {
        _paymentTransactionDetails.setReasonCode(reasonCode);
    }

    /**
    * Returns the native reason code of this payment transaction details.
    *
    * @return the native reason code of this payment transaction details
    */
    @Override
    public java.lang.String getNativeReasonCode() {
        return _paymentTransactionDetails.getNativeReasonCode();
    }

    /**
    * Sets the native reason code of this payment transaction details.
    *
    * @param nativeReasonCode the native reason code of this payment transaction details
    */
    @Override
    public void setNativeReasonCode(java.lang.String nativeReasonCode) {
        _paymentTransactionDetails.setNativeReasonCode(nativeReasonCode);
    }

    @Override
    public boolean isNew() {
        return _paymentTransactionDetails.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentTransactionDetails.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentTransactionDetails.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentTransactionDetails.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentTransactionDetails.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentTransactionDetails.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentTransactionDetails.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentTransactionDetails.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentTransactionDetails.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentTransactionDetails.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentTransactionDetails.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentTransactionDetailsWrapper((PaymentTransactionDetails) _paymentTransactionDetails.clone());
    }

    @Override
    public int compareTo(PaymentTransactionDetails paymentTransactionDetails) {
        return _paymentTransactionDetails.compareTo(paymentTransactionDetails);
    }

    @Override
    public int hashCode() {
        return _paymentTransactionDetails.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentTransactionDetails> toCacheModel() {
        return _paymentTransactionDetails.toCacheModel();
    }

    @Override
    public PaymentTransactionDetails toEscapedModel() {
        return new PaymentTransactionDetailsWrapper(_paymentTransactionDetails.toEscapedModel());
    }

    @Override
    public PaymentTransactionDetails toUnescapedModel() {
        return new PaymentTransactionDetailsWrapper(_paymentTransactionDetails.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentTransactionDetails.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentTransactionDetails.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentTransactionDetails.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentTransactionDetailsWrapper)) {
            return false;
        }

        PaymentTransactionDetailsWrapper paymentTransactionDetailsWrapper = (PaymentTransactionDetailsWrapper) obj;

        if (Validator.equals(_paymentTransactionDetails,
                    paymentTransactionDetailsWrapper._paymentTransactionDetails)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentTransactionDetails getWrappedPaymentTransactionDetails() {
        return _paymentTransactionDetails;
    }

    @Override
    public PaymentTransactionDetails getWrappedModel() {
        return _paymentTransactionDetails;
    }

    @Override
    public void resetOriginalValues() {
        _paymentTransactionDetails.resetOriginalValues();
    }
}
