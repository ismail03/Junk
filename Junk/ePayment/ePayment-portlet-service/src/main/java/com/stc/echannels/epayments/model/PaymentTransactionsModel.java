package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PaymentTransactions service. Represents a row in the &quot;PAYMENT_TRANSACTIONS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.PaymentTransactionsImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactions
 * @see com.stc.echannels.epayments.model.impl.PaymentTransactionsImpl
 * @see com.stc.echannels.epayments.model.impl.PaymentTransactionsModelImpl
 * @generated
 */
public interface PaymentTransactionsModel extends BaseModel<PaymentTransactions> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a payment transactions model instance should use the {@link PaymentTransactions} interface instead.
     */

    /**
     * Returns the primary key of this payment transactions.
     *
     * @return the primary key of this payment transactions
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this payment transactions.
     *
     * @param primaryKey the primary key of this payment transactions
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the epay trans ID of this payment transactions.
     *
     * @return the epay trans ID of this payment transactions
     */
    @AutoEscape
    public String getEpayTransId();

    /**
     * Sets the epay trans ID of this payment transactions.
     *
     * @param epayTransId the epay trans ID of this payment transactions
     */
    public void setEpayTransId(String epayTransId);

    /**
     * Returns the trans amount of this payment transactions.
     *
     * @return the trans amount of this payment transactions
     */
    public long getTransAmount();

    /**
     * Sets the trans amount of this payment transactions.
     *
     * @param transAmount the trans amount of this payment transactions
     */
    public void setTransAmount(long transAmount);

    /**
     * Returns the trans value of this payment transactions.
     *
     * @return the trans value of this payment transactions
     */
    @AutoEscape
    public String getTransValue();

    /**
     * Sets the trans value of this payment transactions.
     *
     * @param transValue the trans value of this payment transactions
     */
    public void setTransValue(String transValue);

    /**
     * Returns the trans amot chk digit of this payment transactions.
     *
     * @return the trans amot chk digit of this payment transactions
     */
    public long getTransAmotChkDigit();

    /**
     * Sets the trans amot chk digit of this payment transactions.
     *
     * @param transAmotChkDigit the trans amot chk digit of this payment transactions
     */
    public void setTransAmotChkDigit(long transAmotChkDigit);

    /**
     * Returns the processor reference of this payment transactions.
     *
     * @return the processor reference of this payment transactions
     */
    @AutoEscape
    public String getProcessorReference();

    /**
     * Sets the processor reference of this payment transactions.
     *
     * @param processorReference the processor reference of this payment transactions
     */
    public void setProcessorReference(String processorReference);

    /**
     * Returns the channel ID of this payment transactions.
     *
     * @return the channel ID of this payment transactions
     */
    public long getChannelId();

    /**
     * Sets the channel ID of this payment transactions.
     *
     * @param channelId the channel ID of this payment transactions
     */
    public void setChannelId(long channelId);

    /**
     * Returns the pmt bank ID of this payment transactions.
     *
     * @return the pmt bank ID of this payment transactions
     */
    @AutoEscape
    public String getPmtBankId();

    /**
     * Sets the pmt bank ID of this payment transactions.
     *
     * @param pmtBankId the pmt bank ID of this payment transactions
     */
    public void setPmtBankId(String pmtBankId);

    /**
     * Returns the pmt branch ID of this payment transactions.
     *
     * @return the pmt branch ID of this payment transactions
     */
    @AutoEscape
    public String getPmtBranchId();

    /**
     * Sets the pmt branch ID of this payment transactions.
     *
     * @param pmtBranchId the pmt branch ID of this payment transactions
     */
    public void setPmtBranchId(String pmtBranchId);

    /**
     * Returns the trans process date of this payment transactions.
     *
     * @return the trans process date of this payment transactions
     */
    public Date getTransProcessDate();

    /**
     * Sets the trans process date of this payment transactions.
     *
     * @param transProcessDate the trans process date of this payment transactions
     */
    public void setTransProcessDate(Date transProcessDate);

    /**
     * Returns the batch ID of this payment transactions.
     *
     * @return the batch ID of this payment transactions
     */
    @AutoEscape
    public String getBatchId();

    /**
     * Sets the batch ID of this payment transactions.
     *
     * @param batchId the batch ID of this payment transactions
     */
    public void setBatchId(String batchId);

    /**
     * Returns the service ID of this payment transactions.
     *
     * @return the service ID of this payment transactions
     */
    public long getServiceId();

    /**
     * Sets the service ID of this payment transactions.
     *
     * @param serviceId the service ID of this payment transactions
     */
    public void setServiceId(long serviceId);

    /**
     * Returns the applied date of this payment transactions.
     *
     * @return the applied date of this payment transactions
     */
    public Date getAppliedDate();

    /**
     * Sets the applied date of this payment transactions.
     *
     * @param appliedDate the applied date of this payment transactions
     */
    public void setAppliedDate(Date appliedDate);

    /**
     * Returns the applied amount of this payment transactions.
     *
     * @return the applied amount of this payment transactions
     */
    public long getAppliedAmount();

    /**
     * Sets the applied amount of this payment transactions.
     *
     * @param appliedAmount the applied amount of this payment transactions
     */
    public void setAppliedAmount(long appliedAmount);

    /**
     * Returns the process status of this payment transactions.
     *
     * @return the process status of this payment transactions
     */
    @AutoEscape
    public String getProcessStatus();

    /**
     * Sets the process status of this payment transactions.
     *
     * @param processStatus the process status of this payment transactions
     */
    public void setProcessStatus(String processStatus);

    /**
     * Returns the notification number of this payment transactions.
     *
     * @return the notification number of this payment transactions
     */
    @AutoEscape
    public String getNotificationNumber();

    /**
     * Sets the notification number of this payment transactions.
     *
     * @param notificationNumber the notification number of this payment transactions
     */
    public void setNotificationNumber(String notificationNumber);

    /**
     * Returns the currency code of this payment transactions.
     *
     * @return the currency code of this payment transactions
     */
    @AutoEscape
    public String getCurrencyCode();

    /**
     * Sets the currency code of this payment transactions.
     *
     * @param currencyCode the currency code of this payment transactions
     */
    public void setCurrencyCode(String currencyCode);

    /**
     * Returns the confirmation number of this payment transactions.
     *
     * @return the confirmation number of this payment transactions
     */
    @AutoEscape
    public String getConfirmationNumber();

    /**
     * Sets the confirmation number of this payment transactions.
     *
     * @param confirmationNumber the confirmation number of this payment transactions
     */
    public void setConfirmationNumber(String confirmationNumber);

    /**
     * Returns the pmt recieved date of this payment transactions.
     *
     * @return the pmt recieved date of this payment transactions
     */
    public Date getPmtRecievedDate();

    /**
     * Sets the pmt recieved date of this payment transactions.
     *
     * @param pmtRecievedDate the pmt recieved date of this payment transactions
     */
    public void setPmtRecievedDate(Date pmtRecievedDate);

    /**
     * Returns the reason code of this payment transactions.
     *
     * @return the reason code of this payment transactions
     */
    @AutoEscape
    public String getReasonCode();

    /**
     * Sets the reason code of this payment transactions.
     *
     * @param reasonCode the reason code of this payment transactions
     */
    public void setReasonCode(String reasonCode);

    /**
     * Returns the event type ID of this payment transactions.
     *
     * @return the event type ID of this payment transactions
     */
    public long getEventTypeId();

    /**
     * Sets the event type ID of this payment transactions.
     *
     * @param eventTypeId the event type ID of this payment transactions
     */
    public void setEventTypeId(long eventTypeId);

    /**
     * Returns the pmt method ID of this payment transactions.
     *
     * @return the pmt method ID of this payment transactions
     */
    public long getPmtMethodId();

    /**
     * Sets the pmt method ID of this payment transactions.
     *
     * @param pmtMethodId the pmt method ID of this payment transactions
     */
    public void setPmtMethodId(long pmtMethodId);

    /**
     * Returns the pmt type of this payment transactions.
     *
     * @return the pmt type of this payment transactions
     */
    @AutoEscape
    public String getPmtType();

    /**
     * Sets the pmt type of this payment transactions.
     *
     * @param pmtType the pmt type of this payment transactions
     */
    public void setPmtType(String pmtType);

    /**
     * Returns the rpm ID of this payment transactions.
     *
     * @return the rpm ID of this payment transactions
     */
    @AutoEscape
    public String getRpmId();

    /**
     * Sets the rpm ID of this payment transactions.
     *
     * @param rpmId the rpm ID of this payment transactions
     */
    public void setRpmId(String rpmId);

    /**
     * Returns the native reason code of this payment transactions.
     *
     * @return the native reason code of this payment transactions
     */
    @AutoEscape
    public String getNativeReasonCode();

    /**
     * Sets the native reason code of this payment transactions.
     *
     * @param nativeReasonCode the native reason code of this payment transactions
     */
    public void setNativeReasonCode(String nativeReasonCode);

    /**
     * Returns the fee ID of this payment transactions.
     *
     * @return the fee ID of this payment transactions
     */
    public long getFeeId();

    /**
     * Sets the fee ID of this payment transactions.
     *
     * @param feeId the fee ID of this payment transactions
     */
    public void setFeeId(long feeId);

    /**
     * Returns the request location of this payment transactions.
     *
     * @return the request location of this payment transactions
     */
    @AutoEscape
    public String getRequestLocation();

    /**
     * Sets the request location of this payment transactions.
     *
     * @param requestLocation the request location of this payment transactions
     */
    public void setRequestLocation(String requestLocation);

    /**
     * Returns the profile ID of this payment transactions.
     *
     * @return the profile ID of this payment transactions
     */
    @AutoEscape
    public String getProfileId();

    /**
     * Sets the profile ID of this payment transactions.
     *
     * @param profileId the profile ID of this payment transactions
     */
    public void setProfileId(String profileId);

    /**
     * Returns the sender ID of this payment transactions.
     *
     * @return the sender ID of this payment transactions
     */
    @AutoEscape
    public String getSenderId();

    /**
     * Sets the sender ID of this payment transactions.
     *
     * @param senderId the sender ID of this payment transactions
     */
    public void setSenderId(String senderId);

    /**
     * Returns the last4 digits of this payment transactions.
     *
     * @return the last4 digits of this payment transactions
     */
    @AutoEscape
    public String getLast4Digits();

    /**
     * Sets the last4 digits of this payment transactions.
     *
     * @param last4Digits the last4 digits of this payment transactions
     */
    public void setLast4Digits(String last4Digits);

    /**
     * Returns the card type of this payment transactions.
     *
     * @return the card type of this payment transactions
     */
    @AutoEscape
    public String getCardType();

    /**
     * Sets the card type of this payment transactions.
     *
     * @param cardType the card type of this payment transactions
     */
    public void setCardType(String cardType);

    /**
     * Returns the expiry date of this payment transactions.
     *
     * @return the expiry date of this payment transactions
     */
    public Date getExpiryDate();

    /**
     * Sets the expiry date of this payment transactions.
     *
     * @param expiryDate the expiry date of this payment transactions
     */
    public void setExpiryDate(Date expiryDate);

    /**
     * Returns the source trans type of this payment transactions.
     *
     * @return the source trans type of this payment transactions
     */
    @AutoEscape
    public String getSourceTransType();

    /**
     * Sets the source trans type of this payment transactions.
     *
     * @param sourceTransType the source trans type of this payment transactions
     */
    public void setSourceTransType(String sourceTransType);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(PaymentTransactions paymentTransactions);

    @Override
    public int hashCode();

    @Override
    public CacheModel<PaymentTransactions> toCacheModel();

    @Override
    public PaymentTransactions toEscapedModel();

    @Override
    public PaymentTransactions toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
