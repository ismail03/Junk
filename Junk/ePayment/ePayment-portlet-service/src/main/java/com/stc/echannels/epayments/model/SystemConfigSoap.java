package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.SystemConfigServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.SystemConfigServiceSoap
 * @generated
 */
public class SystemConfigSoap implements Serializable {
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private long _serviceId;
    private String _bankId;
    private String _config;

    public SystemConfigSoap() {
    }

    public static SystemConfigSoap toSoapModel(SystemConfig model) {
        SystemConfigSoap soapModel = new SystemConfigSoap();

        soapModel.setTransId(model.getTransId());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setStatus(model.getStatus());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
        soapModel.setClientIp(model.getClientIp());
        soapModel.setServerIp(model.getServerIp());
        soapModel.setUserAgent(model.getUserAgent());
        soapModel.setOperation(model.getOperation());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setBankId(model.getBankId());
        soapModel.setConfig(model.getConfig());

        return soapModel;
    }

    public static SystemConfigSoap[] toSoapModels(SystemConfig[] models) {
        SystemConfigSoap[] soapModels = new SystemConfigSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SystemConfigSoap[][] toSoapModels(SystemConfig[][] models) {
        SystemConfigSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SystemConfigSoap[models.length][models[0].length];
        } else {
            soapModels = new SystemConfigSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SystemConfigSoap[] toSoapModels(List<SystemConfig> models) {
        List<SystemConfigSoap> soapModels = new ArrayList<SystemConfigSoap>(models.size());

        for (SystemConfig model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SystemConfigSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _transId;
    }

    public void setPrimaryKey(String pk) {
        setTransId(pk);
    }

    public String getTransId() {
        return _transId;
    }

    public void setTransId(String transId) {
        _transId = transId;
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

    public String getClientIp() {
        return _clientIp;
    }

    public void setClientIp(String clientIp) {
        _clientIp = clientIp;
    }

    public String getServerIp() {
        return _serverIp;
    }

    public void setServerIp(String serverIp) {
        _serverIp = serverIp;
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

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }

    public String getBankId() {
        return _bankId;
    }

    public void setBankId(String bankId) {
        _bankId = bankId;
    }

    public String getConfig() {
        return _config;
    }

    public void setConfig(String config) {
        _config = config;
    }
}
