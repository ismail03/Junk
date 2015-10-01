package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.BizRuleConfigServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.BizRuleConfigServiceSoap
 * @generated
 */
public class BizRuleConfigSoap implements Serializable {
    private long _bizRuleId;
    private long _serviceId;
    private long _channelId;
    private long _pmtMethodId;
    private String _customValue;
    private long _ruleId;
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

    public BizRuleConfigSoap() {
    }

    public static BizRuleConfigSoap toSoapModel(BizRuleConfig model) {
        BizRuleConfigSoap soapModel = new BizRuleConfigSoap();

        soapModel.setBizRuleId(model.getBizRuleId());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setChannelId(model.getChannelId());
        soapModel.setPmtMethodId(model.getPmtMethodId());
        soapModel.setCustomValue(model.getCustomValue());
        soapModel.setRuleId(model.getRuleId());
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

    public static BizRuleConfigSoap[] toSoapModels(BizRuleConfig[] models) {
        BizRuleConfigSoap[] soapModels = new BizRuleConfigSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BizRuleConfigSoap[][] toSoapModels(BizRuleConfig[][] models) {
        BizRuleConfigSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BizRuleConfigSoap[models.length][models[0].length];
        } else {
            soapModels = new BizRuleConfigSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BizRuleConfigSoap[] toSoapModels(List<BizRuleConfig> models) {
        List<BizRuleConfigSoap> soapModels = new ArrayList<BizRuleConfigSoap>(models.size());

        for (BizRuleConfig model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BizRuleConfigSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _bizRuleId;
    }

    public void setPrimaryKey(long pk) {
        setBizRuleId(pk);
    }

    public long getBizRuleId() {
        return _bizRuleId;
    }

    public void setBizRuleId(long bizRuleId) {
        _bizRuleId = bizRuleId;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
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

    public String getCustomValue() {
        return _customValue;
    }

    public void setCustomValue(String customValue) {
        _customValue = customValue;
    }

    public long getRuleId() {
        return _ruleId;
    }

    public void setRuleId(long ruleId) {
        _ruleId = ruleId;
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
