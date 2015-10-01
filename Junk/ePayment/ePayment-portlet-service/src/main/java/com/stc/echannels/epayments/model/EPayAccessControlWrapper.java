package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EPayAccessControl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see EPayAccessControl
 * @generated
 */
public class EPayAccessControlWrapper implements EPayAccessControl,
    ModelWrapper<EPayAccessControl> {
    private EPayAccessControl _ePayAccessControl;

    public EPayAccessControlWrapper(EPayAccessControl ePayAccessControl) {
        _ePayAccessControl = ePayAccessControl;
    }

    @Override
    public Class<?> getModelClass() {
        return EPayAccessControl.class;
    }

    @Override
    public String getModelClassName() {
        return EPayAccessControl.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("epayCofignId", getEpayCofignId());
        attributes.put("serviceId", getServiceId());
        attributes.put("serviceTypeId", getServiceTypeId());
        attributes.put("channelId", getChannelId());
        attributes.put("pmtMethodId", getPmtMethodId());
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
        Long epayCofignId = (Long) attributes.get("epayCofignId");

        if (epayCofignId != null) {
            setEpayCofignId(epayCofignId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Long serviceTypeId = (Long) attributes.get("serviceTypeId");

        if (serviceTypeId != null) {
            setServiceTypeId(serviceTypeId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        Long pmtMethodId = (Long) attributes.get("pmtMethodId");

        if (pmtMethodId != null) {
            setPmtMethodId(pmtMethodId);
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
    * Returns the primary key of this e pay access control.
    *
    * @return the primary key of this e pay access control
    */
    @Override
    public long getPrimaryKey() {
        return _ePayAccessControl.getPrimaryKey();
    }

    /**
    * Sets the primary key of this e pay access control.
    *
    * @param primaryKey the primary key of this e pay access control
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _ePayAccessControl.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the epay cofign ID of this e pay access control.
    *
    * @return the epay cofign ID of this e pay access control
    */
    @Override
    public long getEpayCofignId() {
        return _ePayAccessControl.getEpayCofignId();
    }

    /**
    * Sets the epay cofign ID of this e pay access control.
    *
    * @param epayCofignId the epay cofign ID of this e pay access control
    */
    @Override
    public void setEpayCofignId(long epayCofignId) {
        _ePayAccessControl.setEpayCofignId(epayCofignId);
    }

    /**
    * Returns the service ID of this e pay access control.
    *
    * @return the service ID of this e pay access control
    */
    @Override
    public long getServiceId() {
        return _ePayAccessControl.getServiceId();
    }

    /**
    * Sets the service ID of this e pay access control.
    *
    * @param serviceId the service ID of this e pay access control
    */
    @Override
    public void setServiceId(long serviceId) {
        _ePayAccessControl.setServiceId(serviceId);
    }

    /**
    * Returns the service type ID of this e pay access control.
    *
    * @return the service type ID of this e pay access control
    */
    @Override
    public long getServiceTypeId() {
        return _ePayAccessControl.getServiceTypeId();
    }

    /**
    * Sets the service type ID of this e pay access control.
    *
    * @param serviceTypeId the service type ID of this e pay access control
    */
    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _ePayAccessControl.setServiceTypeId(serviceTypeId);
    }

    /**
    * Returns the channel ID of this e pay access control.
    *
    * @return the channel ID of this e pay access control
    */
    @Override
    public long getChannelId() {
        return _ePayAccessControl.getChannelId();
    }

    /**
    * Sets the channel ID of this e pay access control.
    *
    * @param channelId the channel ID of this e pay access control
    */
    @Override
    public void setChannelId(long channelId) {
        _ePayAccessControl.setChannelId(channelId);
    }

    /**
    * Returns the pmt method ID of this e pay access control.
    *
    * @return the pmt method ID of this e pay access control
    */
    @Override
    public long getPmtMethodId() {
        return _ePayAccessControl.getPmtMethodId();
    }

    /**
    * Sets the pmt method ID of this e pay access control.
    *
    * @param pmtMethodId the pmt method ID of this e pay access control
    */
    @Override
    public void setPmtMethodId(long pmtMethodId) {
        _ePayAccessControl.setPmtMethodId(pmtMethodId);
    }

    /**
    * Returns the trans ID of this e pay access control.
    *
    * @return the trans ID of this e pay access control
    */
    @Override
    public java.lang.String getTransId() {
        return _ePayAccessControl.getTransId();
    }

    /**
    * Sets the trans ID of this e pay access control.
    *
    * @param transId the trans ID of this e pay access control
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _ePayAccessControl.setTransId(transId);
    }

    /**
    * Returns the client i p of this e pay access control.
    *
    * @return the client i p of this e pay access control
    */
    @Override
    public java.lang.String getClientIP() {
        return _ePayAccessControl.getClientIP();
    }

    /**
    * Sets the client i p of this e pay access control.
    *
    * @param clientIP the client i p of this e pay access control
    */
    @Override
    public void setClientIP(java.lang.String clientIP) {
        _ePayAccessControl.setClientIP(clientIP);
    }

    /**
    * Returns the server i p of this e pay access control.
    *
    * @return the server i p of this e pay access control
    */
    @Override
    public java.lang.String getServerIP() {
        return _ePayAccessControl.getServerIP();
    }

    /**
    * Sets the server i p of this e pay access control.
    *
    * @param serverIP the server i p of this e pay access control
    */
    @Override
    public void setServerIP(java.lang.String serverIP) {
        _ePayAccessControl.setServerIP(serverIP);
    }

    /**
    * Returns the user agent of this e pay access control.
    *
    * @return the user agent of this e pay access control
    */
    @Override
    public java.lang.String getUserAgent() {
        return _ePayAccessControl.getUserAgent();
    }

    /**
    * Sets the user agent of this e pay access control.
    *
    * @param userAgent the user agent of this e pay access control
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _ePayAccessControl.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this e pay access control.
    *
    * @return the operation of this e pay access control
    */
    @Override
    public java.lang.String getOperation() {
        return _ePayAccessControl.getOperation();
    }

    /**
    * Sets the operation of this e pay access control.
    *
    * @param operation the operation of this e pay access control
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _ePayAccessControl.setOperation(operation);
    }

    /**
    * Returns the last update timestamp of this e pay access control.
    *
    * @return the last update timestamp of this e pay access control
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _ePayAccessControl.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this e pay access control.
    *
    * @param lastUpdateTimestamp the last update timestamp of this e pay access control
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _ePayAccessControl.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this e pay access control.
    *
    * @return the last update userid of this e pay access control
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _ePayAccessControl.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this e pay access control.
    *
    * @param lastUpdateUserid the last update userid of this e pay access control
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _ePayAccessControl.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this e pay access control.
    *
    * @return the last update username of this e pay access control
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _ePayAccessControl.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this e pay access control.
    *
    * @param lastUpdateUsername the last update username of this e pay access control
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _ePayAccessControl.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the status of this e pay access control.
    *
    * @return the status of this e pay access control
    */
    @Override
    public java.lang.String getStatus() {
        return _ePayAccessControl.getStatus();
    }

    /**
    * Sets the status of this e pay access control.
    *
    * @param status the status of this e pay access control
    */
    @Override
    public void setStatus(java.lang.String status) {
        _ePayAccessControl.setStatus(status);
    }

    /**
    * Returns the effective timestamp of this e pay access control.
    *
    * @return the effective timestamp of this e pay access control
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _ePayAccessControl.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this e pay access control.
    *
    * @param effectiveTimestamp the effective timestamp of this e pay access control
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _ePayAccessControl.setEffectiveTimestamp(effectiveTimestamp);
    }

    @Override
    public boolean isNew() {
        return _ePayAccessControl.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _ePayAccessControl.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _ePayAccessControl.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _ePayAccessControl.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _ePayAccessControl.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _ePayAccessControl.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _ePayAccessControl.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _ePayAccessControl.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _ePayAccessControl.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _ePayAccessControl.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _ePayAccessControl.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EPayAccessControlWrapper((EPayAccessControl) _ePayAccessControl.clone());
    }

    @Override
    public int compareTo(EPayAccessControl ePayAccessControl) {
        return _ePayAccessControl.compareTo(ePayAccessControl);
    }

    @Override
    public int hashCode() {
        return _ePayAccessControl.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<EPayAccessControl> toCacheModel() {
        return _ePayAccessControl.toCacheModel();
    }

    @Override
    public EPayAccessControl toEscapedModel() {
        return new EPayAccessControlWrapper(_ePayAccessControl.toEscapedModel());
    }

    @Override
    public EPayAccessControl toUnescapedModel() {
        return new EPayAccessControlWrapper(_ePayAccessControl.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _ePayAccessControl.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _ePayAccessControl.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _ePayAccessControl.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EPayAccessControlWrapper)) {
            return false;
        }

        EPayAccessControlWrapper ePayAccessControlWrapper = (EPayAccessControlWrapper) obj;

        if (Validator.equals(_ePayAccessControl,
                    ePayAccessControlWrapper._ePayAccessControl)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EPayAccessControl getWrappedEPayAccessControl() {
        return _ePayAccessControl;
    }

    @Override
    public EPayAccessControl getWrappedModel() {
        return _ePayAccessControl;
    }

    @Override
    public void resetOriginalValues() {
        _ePayAccessControl.resetOriginalValues();
    }
}
