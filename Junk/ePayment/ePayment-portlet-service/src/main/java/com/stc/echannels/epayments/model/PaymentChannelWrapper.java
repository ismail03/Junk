package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentChannel}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannel
 * @generated
 */
public class PaymentChannelWrapper implements PaymentChannel,
    ModelWrapper<PaymentChannel> {
    private PaymentChannel _paymentChannel;

    public PaymentChannelWrapper(PaymentChannel paymentChannel) {
        _paymentChannel = paymentChannel;
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentChannel.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentChannel.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("active", getActive());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("channelId", getChannelId());
        attributes.put("channelType", getChannelType());
        attributes.put("descriptiveNameEn", getDescriptiveNameEn());
        attributes.put("descriptiveNameAr", getDescriptiveNameAr());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
        }

        Date lastUpdateTimestamp = (Date) attributes.get("lastUpdateTimestamp");

        if (lastUpdateTimestamp != null) {
            setLastUpdateTimestamp(lastUpdateTimestamp);
        }

        String lastUpdateUserid = (String) attributes.get("lastUpdateUserid");

        if (lastUpdateUserid != null) {
            setLastUpdateUserid(lastUpdateUserid);
        }

        String lastUpdateUsername = (String) attributes.get(
                "lastUpdateUsername");

        if (lastUpdateUsername != null) {
            setLastUpdateUsername(lastUpdateUsername);
        }

        String active = (String) attributes.get("active");

        if (active != null) {
            setActive(active);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
        }

        String clientIp = (String) attributes.get("clientIp");

        if (clientIp != null) {
            setClientIp(clientIp);
        }

        String serverIp = (String) attributes.get("serverIp");

        if (serverIp != null) {
            setServerIp(serverIp);
        }

        String userAgent = (String) attributes.get("userAgent");

        if (userAgent != null) {
            setUserAgent(userAgent);
        }

        String operation = (String) attributes.get("operation");

        if (operation != null) {
            setOperation(operation);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        String channelType = (String) attributes.get("channelType");

        if (channelType != null) {
            setChannelType(channelType);
        }

        String descriptiveNameEn = (String) attributes.get("descriptiveNameEn");

        if (descriptiveNameEn != null) {
            setDescriptiveNameEn(descriptiveNameEn);
        }

        String descriptiveNameAr = (String) attributes.get("descriptiveNameAr");

        if (descriptiveNameAr != null) {
            setDescriptiveNameAr(descriptiveNameAr);
        }
    }

    /**
    * Returns the primary key of this payment channel.
    *
    * @return the primary key of this payment channel
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _paymentChannel.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment channel.
    *
    * @param primaryKey the primary key of this payment channel
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _paymentChannel.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the trans ID of this payment channel.
    *
    * @return the trans ID of this payment channel
    */
    @Override
    public java.lang.String getTransId() {
        return _paymentChannel.getTransId();
    }

    /**
    * Sets the trans ID of this payment channel.
    *
    * @param transId the trans ID of this payment channel
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _paymentChannel.setTransId(transId);
    }

    /**
    * Returns the last update timestamp of this payment channel.
    *
    * @return the last update timestamp of this payment channel
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _paymentChannel.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this payment channel.
    *
    * @param lastUpdateTimestamp the last update timestamp of this payment channel
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _paymentChannel.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this payment channel.
    *
    * @return the last update userid of this payment channel
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _paymentChannel.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this payment channel.
    *
    * @param lastUpdateUserid the last update userid of this payment channel
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _paymentChannel.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this payment channel.
    *
    * @return the last update username of this payment channel
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _paymentChannel.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this payment channel.
    *
    * @param lastUpdateUsername the last update username of this payment channel
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _paymentChannel.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the active of this payment channel.
    *
    * @return the active of this payment channel
    */
    @Override
    public java.lang.String getActive() {
        return _paymentChannel.getActive();
    }

    /**
    * Sets the active of this payment channel.
    *
    * @param active the active of this payment channel
    */
    @Override
    public void setActive(java.lang.String active) {
        _paymentChannel.setActive(active);
    }

    /**
    * Returns the status of this payment channel.
    *
    * @return the status of this payment channel
    */
    @Override
    public java.lang.String getStatus() {
        return _paymentChannel.getStatus();
    }

    /**
    * Sets the status of this payment channel.
    *
    * @param status the status of this payment channel
    */
    @Override
    public void setStatus(java.lang.String status) {
        _paymentChannel.setStatus(status);
    }

    /**
    * Returns the effective timestamp of this payment channel.
    *
    * @return the effective timestamp of this payment channel
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _paymentChannel.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this payment channel.
    *
    * @param effectiveTimestamp the effective timestamp of this payment channel
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _paymentChannel.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the client ip of this payment channel.
    *
    * @return the client ip of this payment channel
    */
    @Override
    public java.lang.String getClientIp() {
        return _paymentChannel.getClientIp();
    }

    /**
    * Sets the client ip of this payment channel.
    *
    * @param clientIp the client ip of this payment channel
    */
    @Override
    public void setClientIp(java.lang.String clientIp) {
        _paymentChannel.setClientIp(clientIp);
    }

    /**
    * Returns the server ip of this payment channel.
    *
    * @return the server ip of this payment channel
    */
    @Override
    public java.lang.String getServerIp() {
        return _paymentChannel.getServerIp();
    }

    /**
    * Sets the server ip of this payment channel.
    *
    * @param serverIp the server ip of this payment channel
    */
    @Override
    public void setServerIp(java.lang.String serverIp) {
        _paymentChannel.setServerIp(serverIp);
    }

    /**
    * Returns the user agent of this payment channel.
    *
    * @return the user agent of this payment channel
    */
    @Override
    public java.lang.String getUserAgent() {
        return _paymentChannel.getUserAgent();
    }

    /**
    * Sets the user agent of this payment channel.
    *
    * @param userAgent the user agent of this payment channel
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _paymentChannel.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this payment channel.
    *
    * @return the operation of this payment channel
    */
    @Override
    public java.lang.String getOperation() {
        return _paymentChannel.getOperation();
    }

    /**
    * Sets the operation of this payment channel.
    *
    * @param operation the operation of this payment channel
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _paymentChannel.setOperation(operation);
    }

    /**
    * Returns the channel ID of this payment channel.
    *
    * @return the channel ID of this payment channel
    */
    @Override
    public long getChannelId() {
        return _paymentChannel.getChannelId();
    }

    /**
    * Sets the channel ID of this payment channel.
    *
    * @param channelId the channel ID of this payment channel
    */
    @Override
    public void setChannelId(long channelId) {
        _paymentChannel.setChannelId(channelId);
    }

    /**
    * Returns the channel type of this payment channel.
    *
    * @return the channel type of this payment channel
    */
    @Override
    public java.lang.String getChannelType() {
        return _paymentChannel.getChannelType();
    }

    /**
    * Sets the channel type of this payment channel.
    *
    * @param channelType the channel type of this payment channel
    */
    @Override
    public void setChannelType(java.lang.String channelType) {
        _paymentChannel.setChannelType(channelType);
    }

    /**
    * Returns the descriptive name en of this payment channel.
    *
    * @return the descriptive name en of this payment channel
    */
    @Override
    public java.lang.String getDescriptiveNameEn() {
        return _paymentChannel.getDescriptiveNameEn();
    }

    /**
    * Sets the descriptive name en of this payment channel.
    *
    * @param descriptiveNameEn the descriptive name en of this payment channel
    */
    @Override
    public void setDescriptiveNameEn(java.lang.String descriptiveNameEn) {
        _paymentChannel.setDescriptiveNameEn(descriptiveNameEn);
    }

    /**
    * Returns the descriptive name ar of this payment channel.
    *
    * @return the descriptive name ar of this payment channel
    */
    @Override
    public java.lang.String getDescriptiveNameAr() {
        return _paymentChannel.getDescriptiveNameAr();
    }

    /**
    * Sets the descriptive name ar of this payment channel.
    *
    * @param descriptiveNameAr the descriptive name ar of this payment channel
    */
    @Override
    public void setDescriptiveNameAr(java.lang.String descriptiveNameAr) {
        _paymentChannel.setDescriptiveNameAr(descriptiveNameAr);
    }

    @Override
    public boolean isNew() {
        return _paymentChannel.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentChannel.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentChannel.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentChannel.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentChannel.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentChannel.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentChannel.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentChannel.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentChannel.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentChannel.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentChannel.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentChannelWrapper((PaymentChannel) _paymentChannel.clone());
    }

    @Override
    public int compareTo(PaymentChannel paymentChannel) {
        return _paymentChannel.compareTo(paymentChannel);
    }

    @Override
    public int hashCode() {
        return _paymentChannel.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentChannel> toCacheModel() {
        return _paymentChannel.toCacheModel();
    }

    @Override
    public PaymentChannel toEscapedModel() {
        return new PaymentChannelWrapper(_paymentChannel.toEscapedModel());
    }

    @Override
    public PaymentChannel toUnescapedModel() {
        return new PaymentChannelWrapper(_paymentChannel.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentChannel.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentChannel.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentChannel.persist();
    }

    @Override
    public boolean isPaymentTransactionRecorded() {
        return _paymentChannel.isPaymentTransactionRecorded();
    }

    @Override
    public void setPaymentTransactionRecorded(
        boolean isPaymentTransactionRecorded) {
        _paymentChannel.setPaymentTransactionRecorded(isPaymentTransactionRecorded);
    }

    @Override
    public java.lang.String getName(java.util.Locale locale) {
        return _paymentChannel.getName(locale);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentChannelWrapper)) {
            return false;
        }

        PaymentChannelWrapper paymentChannelWrapper = (PaymentChannelWrapper) obj;

        if (Validator.equals(_paymentChannel,
                    paymentChannelWrapper._paymentChannel)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentChannel getWrappedPaymentChannel() {
        return _paymentChannel;
    }

    @Override
    public PaymentChannel getWrappedModel() {
        return _paymentChannel;
    }

    @Override
    public void resetOriginalValues() {
        _paymentChannel.resetOriginalValues();
    }
}
