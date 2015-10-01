package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentMethod}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentMethod
 * @generated
 */
public class PaymentMethodWrapper implements PaymentMethod,
    ModelWrapper<PaymentMethod> {
    private PaymentMethod _paymentMethod;

    public PaymentMethodWrapper(PaymentMethod paymentMethod) {
        _paymentMethod = paymentMethod;
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentMethod.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentMethod.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("pmtMethodId", getPmtMethodId());
        attributes.put("status", getStatus());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("descriptiveNameEn", getDescriptiveNameEn());
        attributes.put("descriptiveNameAr", getDescriptiveNameAr());
        attributes.put("pmtMethodIdType", getPmtMethodIdType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long pmtMethodId = (Long) attributes.get("pmtMethodId");

        if (pmtMethodId != null) {
            setPmtMethodId(pmtMethodId);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
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

        String descriptiveNameEn = (String) attributes.get("descriptiveNameEn");

        if (descriptiveNameEn != null) {
            setDescriptiveNameEn(descriptiveNameEn);
        }

        String descriptiveNameAr = (String) attributes.get("descriptiveNameAr");

        if (descriptiveNameAr != null) {
            setDescriptiveNameAr(descriptiveNameAr);
        }

        String pmtMethodIdType = (String) attributes.get("pmtMethodIdType");

        if (pmtMethodIdType != null) {
            setPmtMethodIdType(pmtMethodIdType);
        }
    }

    /**
    * Returns the primary key of this payment method.
    *
    * @return the primary key of this payment method
    */
    @Override
    public long getPrimaryKey() {
        return _paymentMethod.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment method.
    *
    * @param primaryKey the primary key of this payment method
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _paymentMethod.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the pmt method ID of this payment method.
    *
    * @return the pmt method ID of this payment method
    */
    @Override
    public long getPmtMethodId() {
        return _paymentMethod.getPmtMethodId();
    }

    /**
    * Sets the pmt method ID of this payment method.
    *
    * @param pmtMethodId the pmt method ID of this payment method
    */
    @Override
    public void setPmtMethodId(long pmtMethodId) {
        _paymentMethod.setPmtMethodId(pmtMethodId);
    }

    /**
    * Returns the status of this payment method.
    *
    * @return the status of this payment method
    */
    @Override
    public java.lang.String getStatus() {
        return _paymentMethod.getStatus();
    }

    /**
    * Sets the status of this payment method.
    *
    * @param status the status of this payment method
    */
    @Override
    public void setStatus(java.lang.String status) {
        _paymentMethod.setStatus(status);
    }

    /**
    * Returns the last update timestamp of this payment method.
    *
    * @return the last update timestamp of this payment method
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _paymentMethod.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this payment method.
    *
    * @param lastUpdateTimestamp the last update timestamp of this payment method
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _paymentMethod.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this payment method.
    *
    * @return the last update userid of this payment method
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _paymentMethod.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this payment method.
    *
    * @param lastUpdateUserid the last update userid of this payment method
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _paymentMethod.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this payment method.
    *
    * @return the last update username of this payment method
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _paymentMethod.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this payment method.
    *
    * @param lastUpdateUsername the last update username of this payment method
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _paymentMethod.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the effective timestamp of this payment method.
    *
    * @return the effective timestamp of this payment method
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _paymentMethod.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this payment method.
    *
    * @param effectiveTimestamp the effective timestamp of this payment method
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _paymentMethod.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the client ip of this payment method.
    *
    * @return the client ip of this payment method
    */
    @Override
    public java.lang.String getClientIp() {
        return _paymentMethod.getClientIp();
    }

    /**
    * Sets the client ip of this payment method.
    *
    * @param clientIp the client ip of this payment method
    */
    @Override
    public void setClientIp(java.lang.String clientIp) {
        _paymentMethod.setClientIp(clientIp);
    }

    /**
    * Returns the server ip of this payment method.
    *
    * @return the server ip of this payment method
    */
    @Override
    public java.lang.String getServerIp() {
        return _paymentMethod.getServerIp();
    }

    /**
    * Sets the server ip of this payment method.
    *
    * @param serverIp the server ip of this payment method
    */
    @Override
    public void setServerIp(java.lang.String serverIp) {
        _paymentMethod.setServerIp(serverIp);
    }

    /**
    * Returns the user agent of this payment method.
    *
    * @return the user agent of this payment method
    */
    @Override
    public java.lang.String getUserAgent() {
        return _paymentMethod.getUserAgent();
    }

    /**
    * Sets the user agent of this payment method.
    *
    * @param userAgent the user agent of this payment method
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _paymentMethod.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this payment method.
    *
    * @return the operation of this payment method
    */
    @Override
    public java.lang.String getOperation() {
        return _paymentMethod.getOperation();
    }

    /**
    * Sets the operation of this payment method.
    *
    * @param operation the operation of this payment method
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _paymentMethod.setOperation(operation);
    }

    /**
    * Returns the descriptive name en of this payment method.
    *
    * @return the descriptive name en of this payment method
    */
    @Override
    public java.lang.String getDescriptiveNameEn() {
        return _paymentMethod.getDescriptiveNameEn();
    }

    /**
    * Sets the descriptive name en of this payment method.
    *
    * @param descriptiveNameEn the descriptive name en of this payment method
    */
    @Override
    public void setDescriptiveNameEn(java.lang.String descriptiveNameEn) {
        _paymentMethod.setDescriptiveNameEn(descriptiveNameEn);
    }

    /**
    * Returns the descriptive name ar of this payment method.
    *
    * @return the descriptive name ar of this payment method
    */
    @Override
    public java.lang.String getDescriptiveNameAr() {
        return _paymentMethod.getDescriptiveNameAr();
    }

    /**
    * Sets the descriptive name ar of this payment method.
    *
    * @param descriptiveNameAr the descriptive name ar of this payment method
    */
    @Override
    public void setDescriptiveNameAr(java.lang.String descriptiveNameAr) {
        _paymentMethod.setDescriptiveNameAr(descriptiveNameAr);
    }

    /**
    * Returns the pmt method ID type of this payment method.
    *
    * @return the pmt method ID type of this payment method
    */
    @Override
    public java.lang.String getPmtMethodIdType() {
        return _paymentMethod.getPmtMethodIdType();
    }

    /**
    * Sets the pmt method ID type of this payment method.
    *
    * @param pmtMethodIdType the pmt method ID type of this payment method
    */
    @Override
    public void setPmtMethodIdType(java.lang.String pmtMethodIdType) {
        _paymentMethod.setPmtMethodIdType(pmtMethodIdType);
    }

    @Override
    public boolean isNew() {
        return _paymentMethod.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentMethod.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentMethod.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentMethod.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentMethod.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentMethod.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentMethod.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentMethod.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentMethod.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentMethod.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentMethod.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentMethodWrapper((PaymentMethod) _paymentMethod.clone());
    }

    @Override
    public int compareTo(PaymentMethod paymentMethod) {
        return _paymentMethod.compareTo(paymentMethod);
    }

    @Override
    public int hashCode() {
        return _paymentMethod.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentMethod> toCacheModel() {
        return _paymentMethod.toCacheModel();
    }

    @Override
    public PaymentMethod toEscapedModel() {
        return new PaymentMethodWrapper(_paymentMethod.toEscapedModel());
    }

    @Override
    public PaymentMethod toUnescapedModel() {
        return new PaymentMethodWrapper(_paymentMethod.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentMethod.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentMethod.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentMethod.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentMethodWrapper)) {
            return false;
        }

        PaymentMethodWrapper paymentMethodWrapper = (PaymentMethodWrapper) obj;

        if (Validator.equals(_paymentMethod, paymentMethodWrapper._paymentMethod)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentMethod getWrappedPaymentMethod() {
        return _paymentMethod;
    }

    @Override
    public PaymentMethod getWrappedModel() {
        return _paymentMethod;
    }

    @Override
    public void resetOriginalValues() {
        _paymentMethod.resetOriginalValues();
    }
}
