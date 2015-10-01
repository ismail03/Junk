package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.EPayAccessControlServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.EPayAccessControlServiceSoap
 * @generated
 */
public class EPayAccessControlSoap implements Serializable {
    private long _epayCofignId;
    private long _serviceId;
    private long _serviceTypeId;
    private long _channelId;
    private long _pmtMethodId;
    private String _transId;
    private String _clientIP;
    private String _serverIP;
    private String _userAgent;
    private String _operation;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;

    public EPayAccessControlSoap() {
    }

    public static EPayAccessControlSoap toSoapModel(EPayAccessControl model) {
        EPayAccessControlSoap soapModel = new EPayAccessControlSoap();

        soapModel.setEpayCofignId(model.getEpayCofignId());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setServiceTypeId(model.getServiceTypeId());
        soapModel.setChannelId(model.getChannelId());
        soapModel.setPmtMethodId(model.getPmtMethodId());
        soapModel.setTransId(model.getTransId());
        soapModel.setClientIP(model.getClientIP());
        soapModel.setServerIP(model.getServerIP());
        soapModel.setUserAgent(model.getUserAgent());
        soapModel.setOperation(model.getOperation());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setStatus(model.getStatus());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());

        return soapModel;
    }

    public static EPayAccessControlSoap[] toSoapModels(
        EPayAccessControl[] models) {
        EPayAccessControlSoap[] soapModels = new EPayAccessControlSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EPayAccessControlSoap[][] toSoapModels(
        EPayAccessControl[][] models) {
        EPayAccessControlSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EPayAccessControlSoap[models.length][models[0].length];
        } else {
            soapModels = new EPayAccessControlSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EPayAccessControlSoap[] toSoapModels(
        List<EPayAccessControl> models) {
        List<EPayAccessControlSoap> soapModels = new ArrayList<EPayAccessControlSoap>(models.size());

        for (EPayAccessControl model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EPayAccessControlSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _epayCofignId;
    }

    public void setPrimaryKey(long pk) {
        setEpayCofignId(pk);
    }

    public long getEpayCofignId() {
        return _epayCofignId;
    }

    public void setEpayCofignId(long epayCofignId) {
        _epayCofignId = epayCofignId;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }

    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;
    }

    public long getChannelId() {
        return _channelId;
    }

    public void setChannelId(long channelId) {
        _channelId = channelId;
    }

    public long getPmtMethodId() {
        return _pmtMethodId;
    }

    public void setPmtMethodId(long pmtMethodId) {
        _pmtMethodId = pmtMethodId;
    }

    public String getTransId() {
        return _transId;
    }

    public void setTransId(String transId) {
        _transId = transId;
    }

    public String getClientIP() {
        return _clientIP;
    }

    public void setClientIP(String clientIP) {
        _clientIP = clientIP;
    }

    public String getServerIP() {
        return _serverIP;
    }

    public void setServerIP(String serverIP) {
        _serverIP = serverIP;
    }

    public String getUserAgent() {
        return _userAgent;
    }

    public void setUserAgent(String userAgent) {
        _userAgent = userAgent;
    }

    public String getOperation() {
        return _operation;
    }

    public void setOperation(String operation) {
        _operation = operation;
    }

    public Date getLastUpdateTimestamp() {
        return _lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        _lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public String getLastUpdateUserid() {
        return _lastUpdateUserid;
    }

    public void setLastUpdateUserid(String lastUpdateUserid) {
        _lastUpdateUserid = lastUpdateUserid;
    }

    public String getLastUpdateUsername() {
        return _lastUpdateUsername;
    }

    public void setLastUpdateUsername(String lastUpdateUsername) {
        _lastUpdateUsername = lastUpdateUsername;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }

    public Date getEffectiveTimestamp() {
        return _effectiveTimestamp;
    }

    public void setEffectiveTimestamp(Date effectiveTimestamp) {
        _effectiveTimestamp = effectiveTimestamp;
    }
}
