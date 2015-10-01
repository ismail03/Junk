package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.NotifConfigServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.NotifConfigServiceSoap
 * @generated
 */
public class NotifConfigSoap implements Serializable {
    private long _notifId;
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private String _active;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _enabled;
    private String _msgEn;
    private String _msgAr;
    private String _param1;
    private String _param2;
    private String _param3;
    private String _param4;
    private String _param5;
    private String _decriptiveNameEn;
    private String _decriptiveNameAr;
    private String _notifName;
    private long _serviceId;

    public NotifConfigSoap() {
    }

    public static NotifConfigSoap toSoapModel(NotifConfig model) {
        NotifConfigSoap soapModel = new NotifConfigSoap();

        soapModel.setNotifId(model.getNotifId());
        soapModel.setTransId(model.getTransId());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setStatus(model.getStatus());
        soapModel.setActive(model.getActive());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
        soapModel.setClientIp(model.getClientIp());
        soapModel.setServerIp(model.getServerIp());
        soapModel.setUserAgent(model.getUserAgent());
        soapModel.setOperation(model.getOperation());
        soapModel.setEnabled(model.getEnabled());
        soapModel.setMsgEn(model.getMsgEn());
        soapModel.setMsgAr(model.getMsgAr());
        soapModel.setParam1(model.getParam1());
        soapModel.setParam2(model.getParam2());
        soapModel.setParam3(model.getParam3());
        soapModel.setParam4(model.getParam4());
        soapModel.setParam5(model.getParam5());
        soapModel.setDecriptiveNameEn(model.getDecriptiveNameEn());
        soapModel.setDecriptiveNameAr(model.getDecriptiveNameAr());
        soapModel.setNotifName(model.getNotifName());
        soapModel.setServiceId(model.getServiceId());

        return soapModel;
    }

    public static NotifConfigSoap[] toSoapModels(NotifConfig[] models) {
        NotifConfigSoap[] soapModels = new NotifConfigSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static NotifConfigSoap[][] toSoapModels(NotifConfig[][] models) {
        NotifConfigSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new NotifConfigSoap[models.length][models[0].length];
        } else {
            soapModels = new NotifConfigSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static NotifConfigSoap[] toSoapModels(List<NotifConfig> models) {
        List<NotifConfigSoap> soapModels = new ArrayList<NotifConfigSoap>(models.size());

        for (NotifConfig model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new NotifConfigSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _notifId;
    }

    public void setPrimaryKey(long pk) {
        setNotifId(pk);
    }

    public long getNotifId() {
        return _notifId;
    }

    public void setNotifId(long notifId) {
        _notifId = notifId;
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

    public String getActive() {
        return _active;
    }

    public void setActive(String active) {
        _active = active;
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

    public String getEnabled() {
        return _enabled;
    }

    public void setEnabled(String enabled) {
        _enabled = enabled;
    }

    public String getMsgEn() {
        return _msgEn;
    }

    public void setMsgEn(String msgEn) {
        _msgEn = msgEn;
    }

    public String getMsgAr() {
        return _msgAr;
    }

    public void setMsgAr(String msgAr) {
        _msgAr = msgAr;
    }

    public String getParam1() {
        return _param1;
    }

    public void setParam1(String param1) {
        _param1 = param1;
    }

    public String getParam2() {
        return _param2;
    }

    public void setParam2(String param2) {
        _param2 = param2;
    }

    public String getParam3() {
        return _param3;
    }

    public void setParam3(String param3) {
        _param3 = param3;
    }

    public String getParam4() {
        return _param4;
    }

    public void setParam4(String param4) {
        _param4 = param4;
    }

    public String getParam5() {
        return _param5;
    }

    public void setParam5(String param5) {
        _param5 = param5;
    }

    public String getDecriptiveNameEn() {
        return _decriptiveNameEn;
    }

    public void setDecriptiveNameEn(String decriptiveNameEn) {
        _decriptiveNameEn = decriptiveNameEn;
    }

    public String getDecriptiveNameAr() {
        return _decriptiveNameAr;
    }

    public void setDecriptiveNameAr(String decriptiveNameAr) {
        _decriptiveNameAr = decriptiveNameAr;
    }

    public String getNotifName() {
        return _notifName;
    }

    public void setNotifName(String notifName) {
        _notifName = notifName;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }
}
