package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PaymentTransactionDetails service. Represents a row in the &quot;PAYMENT_TRANSACTION_DETAILS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentTransactionDetails
 * @see com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsImpl
 * @see com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsModelImpl
 * @generated
 */
public interface PaymentTransactionDetailsModel extends BaseModel<PaymentTransactionDetails> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a payment transaction details model instance should use the {@link PaymentTransactionDetails} interface instead.
     */

    /**
     * Returns the primary key of this payment transaction details.
     *
     * @return the primary key of this payment transaction details
     */
    public PaymentTransactionDetailsPK getPrimaryKey();

    /**
     * Sets the primary key of this payment transaction details.
     *
     * @param primaryKey the primary key of this payment transaction details
     */
    public void setPrimaryKey(PaymentTransactionDetailsPK primaryKey);

    /**
     * Returns the epay trans ID of this payment transaction details.
     *
     * @return the epay trans ID of this payment transaction details
     */
    @AutoEscape
    public String getEpayTransId();

    /**
     * Sets the epay trans ID of this payment transaction details.
     *
     * @param epayTransId the epay trans ID of this payment transaction details
     */
    public void setEpayTransId(String epayTransId);

    /**
     * Returns the epay instance ID of this payment transaction details.
     *
     * @return the epay instance ID of this payment transaction details
     */
    @AutoEscape
    public String getEpayInstanceId();

    /**
     * Sets the epay instance ID of this payment transaction details.
     *
     * @param epayInstanceId the epay instance ID of this payment transaction details
     */
    public void setEpayInstanceId(String epayInstanceId);

    /**
     * Returns the account number of this payment transaction details.
     *
     * @return the account number of this payment transaction details
     */
    @AutoEscape
    public String getAccountNumber();

    /**
     * Sets the account number of this payment transaction details.
     *
     * @param accountNumber the account number of this payment transaction details
     */
    public void setAccountNumber(String accountNumber);

    /**
     * Returns the service type ID of this payment transaction details.
     *
     * @return the service type ID of this payment transaction details
     */
    public long getServiceTypeId();

    /**
     * Sets the service type ID of this payment transaction details.
     *
     * @param serviceTypeId the service type ID of this payment transaction details
     */
    public void setServiceTypeId(long serviceTypeId);

    /**
     * Returns the trans amount of this payment transaction details.
     *
     * @return the trans amount of this payment transaction details
     */
    public long getTransAmount();

    /**
     * Sets the trans amount of this payment transaction details.
     *
     * @param transAmount the trans amount of this payment transaction details
     */
    public void setTransAmount(long transAmount);

    /**
     * Returns the trans value of this payment transaction details.
     *
     * @return the trans value of this payment transaction details
     */
    @AutoEscape
    public String getTransValue();

    /**
     * Sets the trans value of this payment transaction details.
     *
     * @param transValue the trans value of this payment transaction details
     */
    public void setTransValue(String transValue);

    /**
     * Returns the process date of this payment transaction details.
     *
     * @return the process date of this payment transaction details
     */
    public Date getProcessDate();

    /**
     * Sets the process date of this payment transaction details.
     *
     * @param processDate the process date of this payment transaction details
     */
    public void setProcessDate(Date processDate);

    /**
     * Returns the service number of this payment transaction details.
     *
     * @return the service number of this payment transaction details
     */
    @AutoEscape
    public String getServiceNumber();

    /**
     * Sets the service number of this payment transaction details.
     *
     * @param serviceNumber the service number of this payment transaction details
     */
    public void setServiceNumber(String serviceNumber);

    /**
     * Returns the id type of this payment transaction details.
     *
     * @return the id type of this payment transaction details
     */
    @AutoEscape
    public String getIdType();

    /**
     * Sets the id type of this payment transaction details.
     *
     * @param idType the id type of this payment transaction details
     */
    public void setIdType(String idType);

    /**
     * Returns the recipient ID of this payment transaction details.
     *
     * @return the recipient ID of this payment transaction details
     */
    @AutoEscape
    public String getRecipientId();

    /**
     * Sets the recipient ID of this payment transaction details.
     *
     * @param recipientId the recipient ID of this payment transaction details
     */
    public void setRecipientId(String recipientId);

    /**
     * Returns the recipient ID type of this payment transaction details.
     *
     * @return the recipient ID type of this payment transaction details
     */
    @AutoEscape
    public String getRecipientIdType();

    /**
     * Sets the recipient ID type of this payment transaction details.
     *
     * @param recipientIdType the recipient ID type of this payment transaction details
     */
    public void setRecipientIdType(String recipientIdType);

    /**
     * Returns the notification number of this payment transaction details.
     *
     * @return the notification number of this payment transaction details
     */
    @AutoEscape
    public String getNotificationNumber();

    /**
     * Sets the notification number of this payment transaction details.
     *
     * @param notificationNumber the notification number of this payment transaction details
     */
    public void setNotificationNumber(String notificationNumber);

    /**
     * Returns the process status of this payment transaction details.
     *
     * @return the process status of this payment transaction details
     */
    @AutoEscape
    public String getProcessStatus();

    /**
     * Sets the process status of this payment transaction details.
     *
     * @param processStatus the process status of this payment transaction details
     */
    public void setProcessStatus(String processStatus);

    /**
     * Returns the service category of this payment transaction details.
     *
     * @return the service category of this payment transaction details
     */
    @AutoEscape
    public String getServiceCategory();

    /**
     * Sets the service category of this payment transaction details.
     *
     * @param serviceCategory the service category of this payment transaction details
     */
    public void setServiceCategory(String serviceCategory);

    /**
     * Returns the reason code of this payment transaction details.
     *
     * @return the reason code of this payment transaction details
     */
    @AutoEscape
    public String getReasonCode();

    /**
     * Sets the reason code of this payment transaction details.
     *
     * @param reasonCode the reason code of this payment transaction details
     */
    public void setReasonCode(String reasonCode);

    /**
     * Returns the native reason code of this payment transaction details.
     *
     * @return the native reason code of this payment transaction details
     */
    @AutoEscape
    public String getNativeReasonCode();

    /**
     * Sets the native reason code of this payment transaction details.
     *
     * @param nativeReasonCode the native reason code of this payment transaction details
     */
    public void setNativeReasonCode(String nativeReasonCode);

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
    public int compareTo(PaymentTransactionDetails paymentTransactionDetails);

    @Override
    public int hashCode();

    @Override
    public CacheModel<PaymentTransactionDetails> toCacheModel();

    @Override
    public PaymentTransactionDetails toEscapedModel();

    @Override
    public PaymentTransactionDetails toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
