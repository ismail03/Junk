package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentSystem}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentSystem
 * @generated
 */
public class PaymentSystemWrapper implements PaymentSystem,
    ModelWrapper<PaymentSystem> {
    private PaymentSystem _paymentSystem;

    public PaymentSystemWrapper(PaymentSystem paymentSystem) {
        _paymentSystem = paymentSystem;
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentSystem.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentSystem.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("paymentSystemId", getPaymentSystemId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("active", getActive());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("systemName", getSystemName());
        attributes.put("dateFormat", getDateFormat());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long paymentSystemId = (Long) attributes.get("paymentSystemId");

        if (paymentSystemId != null) {
            setPaymentSystemId(paymentSystemId);
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

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
        }

        String systemName = (String) attributes.get("systemName");

        if (systemName != null) {
            setSystemName(systemName);
        }

        String dateFormat = (String) attributes.get("dateFormat");

        if (dateFormat != null) {
            setDateFormat(dateFormat);
        }
    }

    /**
    * Returns the primary key of this payment system.
    *
    * @return the primary key of this payment system
    */
    @Override
    public long getPrimaryKey() {
        return _paymentSystem.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment system.
    *
    * @param primaryKey the primary key of this payment system
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _paymentSystem.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the payment system ID of this payment system.
    *
    * @return the payment system ID of this payment system
    */
    @Override
    public long getPaymentSystemId() {
        return _paymentSystem.getPaymentSystemId();
    }

    /**
    * Sets the payment system ID of this payment system.
    *
    * @param paymentSystemId the payment system ID of this payment system
    */
    @Override
    public void setPaymentSystemId(long paymentSystemId) {
        _paymentSystem.setPaymentSystemId(paymentSystemId);
    }

    /**
    * Returns the last update timestamp of this payment system.
    *
    * @return the last update timestamp of this payment system
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _paymentSystem.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this payment system.
    *
    * @param lastUpdateTimestamp the last update timestamp of this payment system
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _paymentSystem.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this payment system.
    *
    * @return the last update userid of this payment system
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _paymentSystem.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this payment system.
    *
    * @param lastUpdateUserid the last update userid of this payment system
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _paymentSystem.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this payment system.
    *
    * @return the last update username of this payment system
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _paymentSystem.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this payment system.
    *
    * @param lastUpdateUsername the last update username of this payment system
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _paymentSystem.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the active of this payment system.
    *
    * @return the active of this payment system
    */
    @Override
    public java.lang.String getActive() {
        return _paymentSystem.getActive();
    }

    /**
    * Sets the active of this payment system.
    *
    * @param active the active of this payment system
    */
    @Override
    public void setActive(java.lang.String active) {
        _paymentSystem.setActive(active);
    }

    /**
    * Returns the effective timestamp of this payment system.
    *
    * @return the effective timestamp of this payment system
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _paymentSystem.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this payment system.
    *
    * @param effectiveTimestamp the effective timestamp of this payment system
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _paymentSystem.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the system name of this payment system.
    *
    * @return the system name of this payment system
    */
    @Override
    public java.lang.String getSystemName() {
        return _paymentSystem.getSystemName();
    }

    /**
    * Sets the system name of this payment system.
    *
    * @param systemName the system name of this payment system
    */
    @Override
    public void setSystemName(java.lang.String systemName) {
        _paymentSystem.setSystemName(systemName);
    }

    /**
    * Returns the date format of this payment system.
    *
    * @return the date format of this payment system
    */
    @Override
    public java.lang.String getDateFormat() {
        return _paymentSystem.getDateFormat();
    }

    /**
    * Sets the date format of this payment system.
    *
    * @param dateFormat the date format of this payment system
    */
    @Override
    public void setDateFormat(java.lang.String dateFormat) {
        _paymentSystem.setDateFormat(dateFormat);
    }

    @Override
    public boolean isNew() {
        return _paymentSystem.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentSystem.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentSystem.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentSystem.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentSystem.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentSystem.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentSystem.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentSystem.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentSystem.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentSystem.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentSystem.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentSystemWrapper((PaymentSystem) _paymentSystem.clone());
    }

    @Override
    public int compareTo(PaymentSystem paymentSystem) {
        return _paymentSystem.compareTo(paymentSystem);
    }

    @Override
    public int hashCode() {
        return _paymentSystem.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentSystem> toCacheModel() {
        return _paymentSystem.toCacheModel();
    }

    @Override
    public PaymentSystem toEscapedModel() {
        return new PaymentSystemWrapper(_paymentSystem.toEscapedModel());
    }

    @Override
    public PaymentSystem toUnescapedModel() {
        return new PaymentSystemWrapper(_paymentSystem.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentSystem.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentSystem.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentSystem.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentSystemWrapper)) {
            return false;
        }

        PaymentSystemWrapper paymentSystemWrapper = (PaymentSystemWrapper) obj;

        if (Validator.equals(_paymentSystem, paymentSystemWrapper._paymentSystem)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentSystem getWrappedPaymentSystem() {
        return _paymentSystem;
    }

    @Override
    public PaymentSystem getWrappedModel() {
        return _paymentSystem;
    }

    @Override
    public void resetOriginalValues() {
        _paymentSystem.resetOriginalValues();
    }
}
