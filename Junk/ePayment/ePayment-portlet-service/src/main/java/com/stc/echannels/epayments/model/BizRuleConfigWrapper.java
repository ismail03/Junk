package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BizRuleConfig}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BizRuleConfig
 * @generated
 */
public class BizRuleConfigWrapper implements BizRuleConfig,
    ModelWrapper<BizRuleConfig> {
    private BizRuleConfig _bizRuleConfig;

    public BizRuleConfigWrapper(BizRuleConfig bizRuleConfig) {
        _bizRuleConfig = bizRuleConfig;
    }

    @Override
    public Class<?> getModelClass() {
        return BizRuleConfig.class;
    }

    @Override
    public String getModelClassName() {
        return BizRuleConfig.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bizRuleId", getBizRuleId());
        attributes.put("serviceId", getServiceId());
        attributes.put("channelId", getChannelId());
        attributes.put("pmtMethodId", getPmtMethodId());
        attributes.put("customValue", getCustomValue());
        attributes.put("ruleId", getRuleId());
        attributes.put("transId", getTransId());
        attributes.put("clientIP", getClientIP());
        attributes.put("serverIP", getServerIP());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bizRuleId = (Long) attributes.get("bizRuleId");

        if (bizRuleId != null) {
            setBizRuleId(bizRuleId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        Long pmtMethodId = (Long) attributes.get("pmtMethodId");

        if (pmtMethodId != null) {
            setPmtMethodId(pmtMethodId);
        }

        String customValue = (String) attributes.get("customValue");

        if (customValue != null) {
            setCustomValue(customValue);
        }

        Long ruleId = (Long) attributes.get("ruleId");

        if (ruleId != null) {
            setRuleId(ruleId);
        }

        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
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
    * Returns the primary key of this biz rule config.
    *
    * @return the primary key of this biz rule config
    */
    @Override
    public long getPrimaryKey() {
        return _bizRuleConfig.getPrimaryKey();
    }

    /**
    * Sets the primary key of this biz rule config.
    *
    * @param primaryKey the primary key of this biz rule config
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _bizRuleConfig.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the biz rule ID of this biz rule config.
    *
    * @return the biz rule ID of this biz rule config
    */
    @Override
    public long getBizRuleId() {
        return _bizRuleConfig.getBizRuleId();
    }

    /**
    * Sets the biz rule ID of this biz rule config.
    *
    * @param bizRuleId the biz rule ID of this biz rule config
    */
    @Override
    public void setBizRuleId(long bizRuleId) {
        _bizRuleConfig.setBizRuleId(bizRuleId);
    }

    /**
    * Returns the service ID of this biz rule config.
    *
    * @return the service ID of this biz rule config
    */
    @Override
    public long getServiceId() {
        return _bizRuleConfig.getServiceId();
    }

    /**
    * Sets the service ID of this biz rule config.
    *
    * @param serviceId the service ID of this biz rule config
    */
    @Override
    public void setServiceId(long serviceId) {
        _bizRuleConfig.setServiceId(serviceId);
    }

    /**
    * Returns the channel ID of this biz rule config.
    *
    * @return the channel ID of this biz rule config
    */
    @Override
    public long getChannelId() {
        return _bizRuleConfig.getChannelId();
    }

    /**
    * Sets the channel ID of this biz rule config.
    *
    * @param channelId the channel ID of this biz rule config
    */
    @Override
    public void setChannelId(long channelId) {
        _bizRuleConfig.setChannelId(channelId);
    }

    /**
    * Returns the pmt method ID of this biz rule config.
    *
    * @return the pmt method ID of this biz rule config
    */
    @Override
    public long getPmtMethodId() {
        return _bizRuleConfig.getPmtMethodId();
    }

    /**
    * Sets the pmt method ID of this biz rule config.
    *
    * @param pmtMethodId the pmt method ID of this biz rule config
    */
    @Override
    public void setPmtMethodId(long pmtMethodId) {
        _bizRuleConfig.setPmtMethodId(pmtMethodId);
    }

    /**
    * Returns the custom value of this biz rule config.
    *
    * @return the custom value of this biz rule config
    */
    @Override
    public java.lang.String getCustomValue() {
        return _bizRuleConfig.getCustomValue();
    }

    /**
    * Sets the custom value of this biz rule config.
    *
    * @param customValue the custom value of this biz rule config
    */
    @Override
    public void setCustomValue(java.lang.String customValue) {
        _bizRuleConfig.setCustomValue(customValue);
    }

    /**
    * Returns the rule ID of this biz rule config.
    *
    * @return the rule ID of this biz rule config
    */
    @Override
    public long getRuleId() {
        return _bizRuleConfig.getRuleId();
    }

    /**
    * Sets the rule ID of this biz rule config.
    *
    * @param ruleId the rule ID of this biz rule config
    */
    @Override
    public void setRuleId(long ruleId) {
        _bizRuleConfig.setRuleId(ruleId);
    }

    /**
    * Returns the trans ID of this biz rule config.
    *
    * @return the trans ID of this biz rule config
    */
    @Override
    public java.lang.String getTransId() {
        return _bizRuleConfig.getTransId();
    }

    /**
    * Sets the trans ID of this biz rule config.
    *
    * @param transId the trans ID of this biz rule config
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _bizRuleConfig.setTransId(transId);
    }

    /**
    * Returns the client i p of this biz rule config.
    *
    * @return the client i p of this biz rule config
    */
    @Override
    public java.lang.String getClientIP() {
        return _bizRuleConfig.getClientIP();
    }

    /**
    * Sets the client i p of this biz rule config.
    *
    * @param clientIP the client i p of this biz rule config
    */
    @Override
    public void setClientIP(java.lang.String clientIP) {
        _bizRuleConfig.setClientIP(clientIP);
    }

    /**
    * Returns the server i p of this biz rule config.
    *
    * @return the server i p of this biz rule config
    */
    @Override
    public java.lang.String getServerIP() {
        return _bizRuleConfig.getServerIP();
    }

    /**
    * Sets the server i p of this biz rule config.
    *
    * @param serverIP the server i p of this biz rule config
    */
    @Override
    public void setServerIP(java.lang.String serverIP) {
        _bizRuleConfig.setServerIP(serverIP);
    }

    /**
    * Returns the user agent of this biz rule config.
    *
    * @return the user agent of this biz rule config
    */
    @Override
    public java.lang.String getUserAgent() {
        return _bizRuleConfig.getUserAgent();
    }

    /**
    * Sets the user agent of this biz rule config.
    *
    * @param userAgent the user agent of this biz rule config
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _bizRuleConfig.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this biz rule config.
    *
    * @return the operation of this biz rule config
    */
    @Override
    public java.lang.String getOperation() {
        return _bizRuleConfig.getOperation();
    }

    /**
    * Sets the operation of this biz rule config.
    *
    * @param operation the operation of this biz rule config
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _bizRuleConfig.setOperation(operation);
    }

    /**
    * Returns the last update timestamp of this biz rule config.
    *
    * @return the last update timestamp of this biz rule config
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _bizRuleConfig.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this biz rule config.
    *
    * @param lastUpdateTimestamp the last update timestamp of this biz rule config
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _bizRuleConfig.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this biz rule config.
    *
    * @return the last update userid of this biz rule config
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _bizRuleConfig.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this biz rule config.
    *
    * @param lastUpdateUserid the last update userid of this biz rule config
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _bizRuleConfig.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this biz rule config.
    *
    * @return the last update username of this biz rule config
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _bizRuleConfig.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this biz rule config.
    *
    * @param lastUpdateUsername the last update username of this biz rule config
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _bizRuleConfig.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the status of this biz rule config.
    *
    * @return the status of this biz rule config
    */
    @Override
    public java.lang.String getStatus() {
        return _bizRuleConfig.getStatus();
    }

    /**
    * Sets the status of this biz rule config.
    *
    * @param status the status of this biz rule config
    */
    @Override
    public void setStatus(java.lang.String status) {
        _bizRuleConfig.setStatus(status);
    }

    /**
    * Returns the effective timestamp of this biz rule config.
    *
    * @return the effective timestamp of this biz rule config
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _bizRuleConfig.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this biz rule config.
    *
    * @param effectiveTimestamp the effective timestamp of this biz rule config
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _bizRuleConfig.setEffectiveTimestamp(effectiveTimestamp);
    }

    @Override
    public boolean isNew() {
        return _bizRuleConfig.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bizRuleConfig.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bizRuleConfig.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bizRuleConfig.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bizRuleConfig.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bizRuleConfig.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bizRuleConfig.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bizRuleConfig.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bizRuleConfig.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bizRuleConfig.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bizRuleConfig.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BizRuleConfigWrapper((BizRuleConfig) _bizRuleConfig.clone());
    }

    @Override
    public int compareTo(BizRuleConfig bizRuleConfig) {
        return _bizRuleConfig.compareTo(bizRuleConfig);
    }

    @Override
    public int hashCode() {
        return _bizRuleConfig.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<BizRuleConfig> toCacheModel() {
        return _bizRuleConfig.toCacheModel();
    }

    @Override
    public BizRuleConfig toEscapedModel() {
        return new BizRuleConfigWrapper(_bizRuleConfig.toEscapedModel());
    }

    @Override
    public BizRuleConfig toUnescapedModel() {
        return new BizRuleConfigWrapper(_bizRuleConfig.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bizRuleConfig.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bizRuleConfig.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bizRuleConfig.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BizRuleConfigWrapper)) {
            return false;
        }

        BizRuleConfigWrapper bizRuleConfigWrapper = (BizRuleConfigWrapper) obj;

        if (Validator.equals(_bizRuleConfig, bizRuleConfigWrapper._bizRuleConfig)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BizRuleConfig getWrappedBizRuleConfig() {
        return _bizRuleConfig;
    }

    @Override
    public BizRuleConfig getWrappedModel() {
        return _bizRuleConfig;
    }

    @Override
    public void resetOriginalValues() {
        _bizRuleConfig.resetOriginalValues();
    }
}
