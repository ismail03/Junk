package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SystemConfig}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see SystemConfig
 * @generated
 */
public class SystemConfigWrapper implements SystemConfig,
    ModelWrapper<SystemConfig> {
    private SystemConfig _systemConfig;

    public SystemConfigWrapper(SystemConfig systemConfig) {
        _systemConfig = systemConfig;
    }

    @Override
    public Class<?> getModelClass() {
        return SystemConfig.class;
    }

    @Override
    public String getModelClassName() {
        return SystemConfig.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("serviceId", getServiceId());
        attributes.put("bankId", getBankId());
        attributes.put("config", getConfig());

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

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        String bankId = (String) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        String config = (String) attributes.get("config");

        if (config != null) {
            setConfig(config);
        }
    }

    /**
    * Returns the primary key of this system config.
    *
    * @return the primary key of this system config
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _systemConfig.getPrimaryKey();
    }

    /**
    * Sets the primary key of this system config.
    *
    * @param primaryKey the primary key of this system config
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _systemConfig.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the trans ID of this system config.
    *
    * @return the trans ID of this system config
    */
    @Override
    public java.lang.String getTransId() {
        return _systemConfig.getTransId();
    }

    /**
    * Sets the trans ID of this system config.
    *
    * @param transId the trans ID of this system config
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _systemConfig.setTransId(transId);
    }

    /**
    * Returns the last update timestamp of this system config.
    *
    * @return the last update timestamp of this system config
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _systemConfig.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this system config.
    *
    * @param lastUpdateTimestamp the last update timestamp of this system config
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _systemConfig.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this system config.
    *
    * @return the last update userid of this system config
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _systemConfig.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this system config.
    *
    * @param lastUpdateUserid the last update userid of this system config
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _systemConfig.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this system config.
    *
    * @return the last update username of this system config
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _systemConfig.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this system config.
    *
    * @param lastUpdateUsername the last update username of this system config
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _systemConfig.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the status of this system config.
    *
    * @return the status of this system config
    */
    @Override
    public java.lang.String getStatus() {
        return _systemConfig.getStatus();
    }

    /**
    * Sets the status of this system config.
    *
    * @param status the status of this system config
    */
    @Override
    public void setStatus(java.lang.String status) {
        _systemConfig.setStatus(status);
    }

    /**
    * Returns the effective timestamp of this system config.
    *
    * @return the effective timestamp of this system config
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _systemConfig.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this system config.
    *
    * @param effectiveTimestamp the effective timestamp of this system config
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _systemConfig.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the client ip of this system config.
    *
    * @return the client ip of this system config
    */
    @Override
    public java.lang.String getClientIp() {
        return _systemConfig.getClientIp();
    }

    /**
    * Sets the client ip of this system config.
    *
    * @param clientIp the client ip of this system config
    */
    @Override
    public void setClientIp(java.lang.String clientIp) {
        _systemConfig.setClientIp(clientIp);
    }

    /**
    * Returns the server ip of this system config.
    *
    * @return the server ip of this system config
    */
    @Override
    public java.lang.String getServerIp() {
        return _systemConfig.getServerIp();
    }

    /**
    * Sets the server ip of this system config.
    *
    * @param serverIp the server ip of this system config
    */
    @Override
    public void setServerIp(java.lang.String serverIp) {
        _systemConfig.setServerIp(serverIp);
    }

    /**
    * Returns the user agent of this system config.
    *
    * @return the user agent of this system config
    */
    @Override
    public java.lang.String getUserAgent() {
        return _systemConfig.getUserAgent();
    }

    /**
    * Sets the user agent of this system config.
    *
    * @param userAgent the user agent of this system config
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _systemConfig.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this system config.
    *
    * @return the operation of this system config
    */
    @Override
    public java.lang.String getOperation() {
        return _systemConfig.getOperation();
    }

    /**
    * Sets the operation of this system config.
    *
    * @param operation the operation of this system config
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _systemConfig.setOperation(operation);
    }

    /**
    * Returns the service ID of this system config.
    *
    * @return the service ID of this system config
    */
    @Override
    public long getServiceId() {
        return _systemConfig.getServiceId();
    }

    /**
    * Sets the service ID of this system config.
    *
    * @param serviceId the service ID of this system config
    */
    @Override
    public void setServiceId(long serviceId) {
        _systemConfig.setServiceId(serviceId);
    }

    /**
    * Returns the bank ID of this system config.
    *
    * @return the bank ID of this system config
    */
    @Override
    public java.lang.String getBankId() {
        return _systemConfig.getBankId();
    }

    /**
    * Sets the bank ID of this system config.
    *
    * @param bankId the bank ID of this system config
    */
    @Override
    public void setBankId(java.lang.String bankId) {
        _systemConfig.setBankId(bankId);
    }

    /**
    * Returns the config of this system config.
    *
    * @return the config of this system config
    */
    @Override
    public java.lang.String getConfig() {
        return _systemConfig.getConfig();
    }

    /**
    * Sets the config of this system config.
    *
    * @param config the config of this system config
    */
    @Override
    public void setConfig(java.lang.String config) {
        _systemConfig.setConfig(config);
    }

    @Override
    public boolean isNew() {
        return _systemConfig.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _systemConfig.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _systemConfig.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _systemConfig.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _systemConfig.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _systemConfig.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _systemConfig.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _systemConfig.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _systemConfig.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _systemConfig.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _systemConfig.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SystemConfigWrapper((SystemConfig) _systemConfig.clone());
    }

    @Override
    public int compareTo(SystemConfig systemConfig) {
        return _systemConfig.compareTo(systemConfig);
    }

    @Override
    public int hashCode() {
        return _systemConfig.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SystemConfig> toCacheModel() {
        return _systemConfig.toCacheModel();
    }

    @Override
    public SystemConfig toEscapedModel() {
        return new SystemConfigWrapper(_systemConfig.toEscapedModel());
    }

    @Override
    public SystemConfig toUnescapedModel() {
        return new SystemConfigWrapper(_systemConfig.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _systemConfig.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _systemConfig.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _systemConfig.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SystemConfigWrapper)) {
            return false;
        }

        SystemConfigWrapper systemConfigWrapper = (SystemConfigWrapper) obj;

        if (Validator.equals(_systemConfig, systemConfigWrapper._systemConfig)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SystemConfig getWrappedSystemConfig() {
        return _systemConfig;
    }

    @Override
    public SystemConfig getWrappedModel() {
        return _systemConfig;
    }

    @Override
    public void resetOriginalValues() {
        _systemConfig.resetOriginalValues();
    }
}
