package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentRule}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentRule
 * @generated
 */
public class PaymentRuleWrapper implements PaymentRule,
    ModelWrapper<PaymentRule> {
    private PaymentRule _paymentRule;

    public PaymentRuleWrapper(PaymentRule paymentRule) {
        _paymentRule = paymentRule;
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentRule.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentRule.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("ruleId", getRuleId());
        attributes.put("transId", getTransId());
        attributes.put("ruleName", getRuleName());
        attributes.put("value", getValue());
        attributes.put("descriptionEN", getDescriptionEN());
        attributes.put("descriptionAR", getDescriptionAR());
        attributes.put("isEditable", getIsEditable());
        attributes.put("refundOnViolation", getRefundOnViolation());
        attributes.put("ruleCategory", getRuleCategory());
        attributes.put("clientIP", getClientIP());
        attributes.put("serverIP", getServerIP());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("isList", getIsList());
        attributes.put("serviceTypeId", getServiceTypeId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long ruleId = (Long) attributes.get("ruleId");

        if (ruleId != null) {
            setRuleId(ruleId);
        }

        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
        }

        String ruleName = (String) attributes.get("ruleName");

        if (ruleName != null) {
            setRuleName(ruleName);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }

        String descriptionEN = (String) attributes.get("descriptionEN");

        if (descriptionEN != null) {
            setDescriptionEN(descriptionEN);
        }

        String descriptionAR = (String) attributes.get("descriptionAR");

        if (descriptionAR != null) {
            setDescriptionAR(descriptionAR);
        }

        String isEditable = (String) attributes.get("isEditable");

        if (isEditable != null) {
            setIsEditable(isEditable);
        }

        String refundOnViolation = (String) attributes.get("refundOnViolation");

        if (refundOnViolation != null) {
            setRefundOnViolation(refundOnViolation);
        }

        String ruleCategory = (String) attributes.get("ruleCategory");

        if (ruleCategory != null) {
            setRuleCategory(ruleCategory);
        }

        String clientIP = (String) attributes.get("clientIP");

        if (clientIP != null) {
            setClientIP(clientIP);
        }

        String serverIP = (String) attributes.get("serverIP");

        if (serverIP != null) {
            setServerIP(serverIP);
        }

        String userAgent = (String) attributes.get("userAgent");

        if (userAgent != null) {
            setUserAgent(userAgent);
        }

        String operation = (String) attributes.get("operation");

        if (operation != null) {
            setOperation(operation);
        }

        String isList = (String) attributes.get("isList");

        if (isList != null) {
            setIsList(isList);
        }

        Long serviceTypeId = (Long) attributes.get("serviceTypeId");

        if (serviceTypeId != null) {
            setServiceTypeId(serviceTypeId);
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

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
        }
    }

    /**
    * Returns the primary key of this payment rule.
    *
    * @return the primary key of this payment rule
    */
    @Override
    public com.stc.echannels.epayments.service.persistence.PaymentRulePK getPrimaryKey() {
        return _paymentRule.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment rule.
    *
    * @param primaryKey the primary key of this payment rule
    */
    @Override
    public void setPrimaryKey(
        com.stc.echannels.epayments.service.persistence.PaymentRulePK primaryKey) {
        _paymentRule.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the rule ID of this payment rule.
    *
    * @return the rule ID of this payment rule
    */
    @Override
    public long getRuleId() {
        return _paymentRule.getRuleId();
    }

    /**
    * Sets the rule ID of this payment rule.
    *
    * @param ruleId the rule ID of this payment rule
    */
    @Override
    public void setRuleId(long ruleId) {
        _paymentRule.setRuleId(ruleId);
    }

    /**
    * Returns the trans ID of this payment rule.
    *
    * @return the trans ID of this payment rule
    */
    @Override
    public java.lang.String getTransId() {
        return _paymentRule.getTransId();
    }

    /**
    * Sets the trans ID of this payment rule.
    *
    * @param transId the trans ID of this payment rule
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _paymentRule.setTransId(transId);
    }

    /**
    * Returns the rule name of this payment rule.
    *
    * @return the rule name of this payment rule
    */
    @Override
    public java.lang.String getRuleName() {
        return _paymentRule.getRuleName();
    }

    /**
    * Sets the rule name of this payment rule.
    *
    * @param ruleName the rule name of this payment rule
    */
    @Override
    public void setRuleName(java.lang.String ruleName) {
        _paymentRule.setRuleName(ruleName);
    }

    /**
    * Returns the value of this payment rule.
    *
    * @return the value of this payment rule
    */
    @Override
    public java.lang.String getValue() {
        return _paymentRule.getValue();
    }

    /**
    * Sets the value of this payment rule.
    *
    * @param value the value of this payment rule
    */
    @Override
    public void setValue(java.lang.String value) {
        _paymentRule.setValue(value);
    }

    /**
    * Returns the description e n of this payment rule.
    *
    * @return the description e n of this payment rule
    */
    @Override
    public java.lang.String getDescriptionEN() {
        return _paymentRule.getDescriptionEN();
    }

    /**
    * Sets the description e n of this payment rule.
    *
    * @param descriptionEN the description e n of this payment rule
    */
    @Override
    public void setDescriptionEN(java.lang.String descriptionEN) {
        _paymentRule.setDescriptionEN(descriptionEN);
    }

    /**
    * Returns the description a r of this payment rule.
    *
    * @return the description a r of this payment rule
    */
    @Override
    public java.lang.String getDescriptionAR() {
        return _paymentRule.getDescriptionAR();
    }

    /**
    * Sets the description a r of this payment rule.
    *
    * @param descriptionAR the description a r of this payment rule
    */
    @Override
    public void setDescriptionAR(java.lang.String descriptionAR) {
        _paymentRule.setDescriptionAR(descriptionAR);
    }

    /**
    * Returns the is editable of this payment rule.
    *
    * @return the is editable of this payment rule
    */
    @Override
    public java.lang.String getIsEditable() {
        return _paymentRule.getIsEditable();
    }

    /**
    * Sets the is editable of this payment rule.
    *
    * @param isEditable the is editable of this payment rule
    */
    @Override
    public void setIsEditable(java.lang.String isEditable) {
        _paymentRule.setIsEditable(isEditable);
    }

    /**
    * Returns the refund on violation of this payment rule.
    *
    * @return the refund on violation of this payment rule
    */
    @Override
    public java.lang.String getRefundOnViolation() {
        return _paymentRule.getRefundOnViolation();
    }

    /**
    * Sets the refund on violation of this payment rule.
    *
    * @param refundOnViolation the refund on violation of this payment rule
    */
    @Override
    public void setRefundOnViolation(java.lang.String refundOnViolation) {
        _paymentRule.setRefundOnViolation(refundOnViolation);
    }

    /**
    * Returns the rule category of this payment rule.
    *
    * @return the rule category of this payment rule
    */
    @Override
    public java.lang.String getRuleCategory() {
        return _paymentRule.getRuleCategory();
    }

    /**
    * Sets the rule category of this payment rule.
    *
    * @param ruleCategory the rule category of this payment rule
    */
    @Override
    public void setRuleCategory(java.lang.String ruleCategory) {
        _paymentRule.setRuleCategory(ruleCategory);
    }

    /**
    * Returns the client i p of this payment rule.
    *
    * @return the client i p of this payment rule
    */
    @Override
    public java.lang.String getClientIP() {
        return _paymentRule.getClientIP();
    }

    /**
    * Sets the client i p of this payment rule.
    *
    * @param clientIP the client i p of this payment rule
    */
    @Override
    public void setClientIP(java.lang.String clientIP) {
        _paymentRule.setClientIP(clientIP);
    }

    /**
    * Returns the server i p of this payment rule.
    *
    * @return the server i p of this payment rule
    */
    @Override
    public java.lang.String getServerIP() {
        return _paymentRule.getServerIP();
    }

    /**
    * Sets the server i p of this payment rule.
    *
    * @param serverIP the server i p of this payment rule
    */
    @Override
    public void setServerIP(java.lang.String serverIP) {
        _paymentRule.setServerIP(serverIP);
    }

    /**
    * Returns the user agent of this payment rule.
    *
    * @return the user agent of this payment rule
    */
    @Override
    public java.lang.String getUserAgent() {
        return _paymentRule.getUserAgent();
    }

    /**
    * Sets the user agent of this payment rule.
    *
    * @param userAgent the user agent of this payment rule
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _paymentRule.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this payment rule.
    *
    * @return the operation of this payment rule
    */
    @Override
    public java.lang.String getOperation() {
        return _paymentRule.getOperation();
    }

    /**
    * Sets the operation of this payment rule.
    *
    * @param operation the operation of this payment rule
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _paymentRule.setOperation(operation);
    }

    /**
    * Returns the is list of this payment rule.
    *
    * @return the is list of this payment rule
    */
    @Override
    public java.lang.String getIsList() {
        return _paymentRule.getIsList();
    }

    /**
    * Sets the is list of this payment rule.
    *
    * @param isList the is list of this payment rule
    */
    @Override
    public void setIsList(java.lang.String isList) {
        _paymentRule.setIsList(isList);
    }

    /**
    * Returns the service type ID of this payment rule.
    *
    * @return the service type ID of this payment rule
    */
    @Override
    public long getServiceTypeId() {
        return _paymentRule.getServiceTypeId();
    }

    /**
    * Sets the service type ID of this payment rule.
    *
    * @param serviceTypeId the service type ID of this payment rule
    */
    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _paymentRule.setServiceTypeId(serviceTypeId);
    }

    /**
    * Returns the last update timestamp of this payment rule.
    *
    * @return the last update timestamp of this payment rule
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _paymentRule.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this payment rule.
    *
    * @param lastUpdateTimestamp the last update timestamp of this payment rule
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _paymentRule.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this payment rule.
    *
    * @return the last update userid of this payment rule
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _paymentRule.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this payment rule.
    *
    * @param lastUpdateUserid the last update userid of this payment rule
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _paymentRule.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this payment rule.
    *
    * @return the last update username of this payment rule
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _paymentRule.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this payment rule.
    *
    * @param lastUpdateUsername the last update username of this payment rule
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _paymentRule.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the status of this payment rule.
    *
    * @return the status of this payment rule
    */
    @Override
    public java.lang.String getStatus() {
        return _paymentRule.getStatus();
    }

    /**
    * Sets the status of this payment rule.
    *
    * @param status the status of this payment rule
    */
    @Override
    public void setStatus(java.lang.String status) {
        _paymentRule.setStatus(status);
    }

    /**
    * Returns the effective timestamp of this payment rule.
    *
    * @return the effective timestamp of this payment rule
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _paymentRule.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this payment rule.
    *
    * @param effectiveTimestamp the effective timestamp of this payment rule
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _paymentRule.setEffectiveTimestamp(effectiveTimestamp);
    }

    @Override
    public boolean isNew() {
        return _paymentRule.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentRule.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentRule.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentRule.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentRule.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentRule.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentRule.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentRule.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentRule.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentRule.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentRule.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentRuleWrapper((PaymentRule) _paymentRule.clone());
    }

    @Override
    public int compareTo(PaymentRule paymentRule) {
        return _paymentRule.compareTo(paymentRule);
    }

    @Override
    public int hashCode() {
        return _paymentRule.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentRule> toCacheModel() {
        return _paymentRule.toCacheModel();
    }

    @Override
    public PaymentRule toEscapedModel() {
        return new PaymentRuleWrapper(_paymentRule.toEscapedModel());
    }

    @Override
    public PaymentRule toUnescapedModel() {
        return new PaymentRuleWrapper(_paymentRule.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentRule.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentRule.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentRule.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentRuleWrapper)) {
            return false;
        }

        PaymentRuleWrapper paymentRuleWrapper = (PaymentRuleWrapper) obj;

        if (Validator.equals(_paymentRule, paymentRuleWrapper._paymentRule)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentRule getWrappedPaymentRule() {
        return _paymentRule;
    }

    @Override
    public PaymentRule getWrappedModel() {
        return _paymentRule;
    }

    @Override
    public void resetOriginalValues() {
        _paymentRule.resetOriginalValues();
    }
}
