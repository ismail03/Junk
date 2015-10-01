package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NotifConfig}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifConfig
 * @generated
 */
public class NotifConfigWrapper implements NotifConfig,
    ModelWrapper<NotifConfig> {
    private NotifConfig _notifConfig;

    public NotifConfigWrapper(NotifConfig notifConfig) {
        _notifConfig = notifConfig;
    }

    @Override
    public Class<?> getModelClass() {
        return NotifConfig.class;
    }

    @Override
    public String getModelClassName() {
        return NotifConfig.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("notifId", getNotifId());
        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("active", getActive());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("enabled", getEnabled());
        attributes.put("msgEn", getMsgEn());
        attributes.put("msgAr", getMsgAr());
        attributes.put("param1", getParam1());
        attributes.put("param2", getParam2());
        attributes.put("param3", getParam3());
        attributes.put("param4", getParam4());
        attributes.put("param5", getParam5());
        attributes.put("decriptiveNameEn", getDecriptiveNameEn());
        attributes.put("decriptiveNameAr", getDecriptiveNameAr());
        attributes.put("notifName", getNotifName());
        attributes.put("serviceId", getServiceId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long notifId = (Long) attributes.get("notifId");

        if (notifId != null) {
            setNotifId(notifId);
        }

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

        String active = (String) attributes.get("active");

        if (active != null) {
            setActive(active);
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

        String enabled = (String) attributes.get("enabled");

        if (enabled != null) {
            setEnabled(enabled);
        }

        String msgEn = (String) attributes.get("msgEn");

        if (msgEn != null) {
            setMsgEn(msgEn);
        }

        String msgAr = (String) attributes.get("msgAr");

        if (msgAr != null) {
            setMsgAr(msgAr);
        }

        String param1 = (String) attributes.get("param1");

        if (param1 != null) {
            setParam1(param1);
        }

        String param2 = (String) attributes.get("param2");

        if (param2 != null) {
            setParam2(param2);
        }

        String param3 = (String) attributes.get("param3");

        if (param3 != null) {
            setParam3(param3);
        }

        String param4 = (String) attributes.get("param4");

        if (param4 != null) {
            setParam4(param4);
        }

        String param5 = (String) attributes.get("param5");

        if (param5 != null) {
            setParam5(param5);
        }

        String decriptiveNameEn = (String) attributes.get("decriptiveNameEn");

        if (decriptiveNameEn != null) {
            setDecriptiveNameEn(decriptiveNameEn);
        }

        String decriptiveNameAr = (String) attributes.get("decriptiveNameAr");

        if (decriptiveNameAr != null) {
            setDecriptiveNameAr(decriptiveNameAr);
        }

        String notifName = (String) attributes.get("notifName");

        if (notifName != null) {
            setNotifName(notifName);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }
    }

    /**
    * Returns the primary key of this notif config.
    *
    * @return the primary key of this notif config
    */
    @Override
    public long getPrimaryKey() {
        return _notifConfig.getPrimaryKey();
    }

    /**
    * Sets the primary key of this notif config.
    *
    * @param primaryKey the primary key of this notif config
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _notifConfig.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the notif ID of this notif config.
    *
    * @return the notif ID of this notif config
    */
    @Override
    public long getNotifId() {
        return _notifConfig.getNotifId();
    }

    /**
    * Sets the notif ID of this notif config.
    *
    * @param notifId the notif ID of this notif config
    */
    @Override
    public void setNotifId(long notifId) {
        _notifConfig.setNotifId(notifId);
    }

    /**
    * Returns the trans ID of this notif config.
    *
    * @return the trans ID of this notif config
    */
    @Override
    public java.lang.String getTransId() {
        return _notifConfig.getTransId();
    }

    /**
    * Sets the trans ID of this notif config.
    *
    * @param transId the trans ID of this notif config
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _notifConfig.setTransId(transId);
    }

    /**
    * Returns the last update timestamp of this notif config.
    *
    * @return the last update timestamp of this notif config
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _notifConfig.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this notif config.
    *
    * @param lastUpdateTimestamp the last update timestamp of this notif config
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _notifConfig.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this notif config.
    *
    * @return the last update userid of this notif config
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _notifConfig.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this notif config.
    *
    * @param lastUpdateUserid the last update userid of this notif config
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _notifConfig.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this notif config.
    *
    * @return the last update username of this notif config
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _notifConfig.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this notif config.
    *
    * @param lastUpdateUsername the last update username of this notif config
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _notifConfig.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the status of this notif config.
    *
    * @return the status of this notif config
    */
    @Override
    public java.lang.String getStatus() {
        return _notifConfig.getStatus();
    }

    /**
    * Sets the status of this notif config.
    *
    * @param status the status of this notif config
    */
    @Override
    public void setStatus(java.lang.String status) {
        _notifConfig.setStatus(status);
    }

    /**
    * Returns the active of this notif config.
    *
    * @return the active of this notif config
    */
    @Override
    public java.lang.String getActive() {
        return _notifConfig.getActive();
    }

    /**
    * Sets the active of this notif config.
    *
    * @param active the active of this notif config
    */
    @Override
    public void setActive(java.lang.String active) {
        _notifConfig.setActive(active);
    }

    /**
    * Returns the effective timestamp of this notif config.
    *
    * @return the effective timestamp of this notif config
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _notifConfig.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this notif config.
    *
    * @param effectiveTimestamp the effective timestamp of this notif config
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _notifConfig.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the client ip of this notif config.
    *
    * @return the client ip of this notif config
    */
    @Override
    public java.lang.String getClientIp() {
        return _notifConfig.getClientIp();
    }

    /**
    * Sets the client ip of this notif config.
    *
    * @param clientIp the client ip of this notif config
    */
    @Override
    public void setClientIp(java.lang.String clientIp) {
        _notifConfig.setClientIp(clientIp);
    }

    /**
    * Returns the server ip of this notif config.
    *
    * @return the server ip of this notif config
    */
    @Override
    public java.lang.String getServerIp() {
        return _notifConfig.getServerIp();
    }

    /**
    * Sets the server ip of this notif config.
    *
    * @param serverIp the server ip of this notif config
    */
    @Override
    public void setServerIp(java.lang.String serverIp) {
        _notifConfig.setServerIp(serverIp);
    }

    /**
    * Returns the user agent of this notif config.
    *
    * @return the user agent of this notif config
    */
    @Override
    public java.lang.String getUserAgent() {
        return _notifConfig.getUserAgent();
    }

    /**
    * Sets the user agent of this notif config.
    *
    * @param userAgent the user agent of this notif config
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _notifConfig.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this notif config.
    *
    * @return the operation of this notif config
    */
    @Override
    public java.lang.String getOperation() {
        return _notifConfig.getOperation();
    }

    /**
    * Sets the operation of this notif config.
    *
    * @param operation the operation of this notif config
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _notifConfig.setOperation(operation);
    }

    /**
    * Returns the enabled of this notif config.
    *
    * @return the enabled of this notif config
    */
    @Override
    public java.lang.String getEnabled() {
        return _notifConfig.getEnabled();
    }

    /**
    * Sets the enabled of this notif config.
    *
    * @param enabled the enabled of this notif config
    */
    @Override
    public void setEnabled(java.lang.String enabled) {
        _notifConfig.setEnabled(enabled);
    }

    /**
    * Returns the msg en of this notif config.
    *
    * @return the msg en of this notif config
    */
    @Override
    public java.lang.String getMsgEn() {
        return _notifConfig.getMsgEn();
    }

    /**
    * Sets the msg en of this notif config.
    *
    * @param msgEn the msg en of this notif config
    */
    @Override
    public void setMsgEn(java.lang.String msgEn) {
        _notifConfig.setMsgEn(msgEn);
    }

    /**
    * Returns the msg ar of this notif config.
    *
    * @return the msg ar of this notif config
    */
    @Override
    public java.lang.String getMsgAr() {
        return _notifConfig.getMsgAr();
    }

    /**
    * Sets the msg ar of this notif config.
    *
    * @param msgAr the msg ar of this notif config
    */
    @Override
    public void setMsgAr(java.lang.String msgAr) {
        _notifConfig.setMsgAr(msgAr);
    }

    /**
    * Returns the param1 of this notif config.
    *
    * @return the param1 of this notif config
    */
    @Override
    public java.lang.String getParam1() {
        return _notifConfig.getParam1();
    }

    /**
    * Sets the param1 of this notif config.
    *
    * @param param1 the param1 of this notif config
    */
    @Override
    public void setParam1(java.lang.String param1) {
        _notifConfig.setParam1(param1);
    }

    /**
    * Returns the param2 of this notif config.
    *
    * @return the param2 of this notif config
    */
    @Override
    public java.lang.String getParam2() {
        return _notifConfig.getParam2();
    }

    /**
    * Sets the param2 of this notif config.
    *
    * @param param2 the param2 of this notif config
    */
    @Override
    public void setParam2(java.lang.String param2) {
        _notifConfig.setParam2(param2);
    }

    /**
    * Returns the param3 of this notif config.
    *
    * @return the param3 of this notif config
    */
    @Override
    public java.lang.String getParam3() {
        return _notifConfig.getParam3();
    }

    /**
    * Sets the param3 of this notif config.
    *
    * @param param3 the param3 of this notif config
    */
    @Override
    public void setParam3(java.lang.String param3) {
        _notifConfig.setParam3(param3);
    }

    /**
    * Returns the param4 of this notif config.
    *
    * @return the param4 of this notif config
    */
    @Override
    public java.lang.String getParam4() {
        return _notifConfig.getParam4();
    }

    /**
    * Sets the param4 of this notif config.
    *
    * @param param4 the param4 of this notif config
    */
    @Override
    public void setParam4(java.lang.String param4) {
        _notifConfig.setParam4(param4);
    }

    /**
    * Returns the param5 of this notif config.
    *
    * @return the param5 of this notif config
    */
    @Override
    public java.lang.String getParam5() {
        return _notifConfig.getParam5();
    }

    /**
    * Sets the param5 of this notif config.
    *
    * @param param5 the param5 of this notif config
    */
    @Override
    public void setParam5(java.lang.String param5) {
        _notifConfig.setParam5(param5);
    }

    /**
    * Returns the decriptive name en of this notif config.
    *
    * @return the decriptive name en of this notif config
    */
    @Override
    public java.lang.String getDecriptiveNameEn() {
        return _notifConfig.getDecriptiveNameEn();
    }

    /**
    * Sets the decriptive name en of this notif config.
    *
    * @param decriptiveNameEn the decriptive name en of this notif config
    */
    @Override
    public void setDecriptiveNameEn(java.lang.String decriptiveNameEn) {
        _notifConfig.setDecriptiveNameEn(decriptiveNameEn);
    }

    /**
    * Returns the decriptive name ar of this notif config.
    *
    * @return the decriptive name ar of this notif config
    */
    @Override
    public java.lang.String getDecriptiveNameAr() {
        return _notifConfig.getDecriptiveNameAr();
    }

    /**
    * Sets the decriptive name ar of this notif config.
    *
    * @param decriptiveNameAr the decriptive name ar of this notif config
    */
    @Override
    public void setDecriptiveNameAr(java.lang.String decriptiveNameAr) {
        _notifConfig.setDecriptiveNameAr(decriptiveNameAr);
    }

    /**
    * Returns the notif name of this notif config.
    *
    * @return the notif name of this notif config
    */
    @Override
    public java.lang.String getNotifName() {
        return _notifConfig.getNotifName();
    }

    /**
    * Sets the notif name of this notif config.
    *
    * @param notifName the notif name of this notif config
    */
    @Override
    public void setNotifName(java.lang.String notifName) {
        _notifConfig.setNotifName(notifName);
    }

    /**
    * Returns the service ID of this notif config.
    *
    * @return the service ID of this notif config
    */
    @Override
    public long getServiceId() {
        return _notifConfig.getServiceId();
    }

    /**
    * Sets the service ID of this notif config.
    *
    * @param serviceId the service ID of this notif config
    */
    @Override
    public void setServiceId(long serviceId) {
        _notifConfig.setServiceId(serviceId);
    }

    @Override
    public boolean isNew() {
        return _notifConfig.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _notifConfig.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _notifConfig.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _notifConfig.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _notifConfig.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _notifConfig.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _notifConfig.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _notifConfig.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _notifConfig.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _notifConfig.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _notifConfig.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new NotifConfigWrapper((NotifConfig) _notifConfig.clone());
    }

    @Override
    public int compareTo(NotifConfig notifConfig) {
        return _notifConfig.compareTo(notifConfig);
    }

    @Override
    public int hashCode() {
        return _notifConfig.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<NotifConfig> toCacheModel() {
        return _notifConfig.toCacheModel();
    }

    @Override
    public NotifConfig toEscapedModel() {
        return new NotifConfigWrapper(_notifConfig.toEscapedModel());
    }

    @Override
    public NotifConfig toUnescapedModel() {
        return new NotifConfigWrapper(_notifConfig.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _notifConfig.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _notifConfig.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _notifConfig.persist();
    }

    @Override
    public java.lang.String getEnMsgWithParams() {
        return _notifConfig.getEnMsgWithParams();
    }

    @Override
    public java.lang.String getArMsgWithParams() {
        return _notifConfig.getArMsgWithParams();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NotifConfigWrapper)) {
            return false;
        }

        NotifConfigWrapper notifConfigWrapper = (NotifConfigWrapper) obj;

        if (Validator.equals(_notifConfig, notifConfigWrapper._notifConfig)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public NotifConfig getWrappedNotifConfig() {
        return _notifConfig;
    }

    @Override
    public NotifConfig getWrappedModel() {
        return _notifConfig;
    }

    @Override
    public void resetOriginalValues() {
        _notifConfig.resetOriginalValues();
    }
}
