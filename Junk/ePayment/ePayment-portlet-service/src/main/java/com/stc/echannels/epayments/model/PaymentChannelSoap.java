package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentChannelServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentChannelServiceSoap
 * @generated
 */
public class PaymentChannelSoap implements Serializable {
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private String _status;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private long _channelId;
    private String _channelType;
    private String _descriptiveNameEn;
    private String _descriptiveNameAr;

    public PaymentChannelSoap() {
    }

    public static PaymentChannelSoap toSoapModel(PaymentChannel model) {
        PaymentChannelSoap soapModel = new PaymentChannelSoap();

        soapModel.setTransId(model.getTransId());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setActive(model.getActive());
        soapModel.setStatus(model.getStatus());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
        soapModel.setClientIp(model.getClientIp());
        soapModel.setServerIp(model.getServerIp());
        soapModel.setUserAgent(model.getUserAgent());
        soapModel.setOperation(model.getOperation());
        soapModel.setChannelId(model.getChannelId());
        soapModel.setChannelType(model.getChannelType());
        soapModel.setDescriptiveNameEn(model.getDescriptiveNameEn());
        soapModel.setDescriptiveNameAr(model.getDescriptiveNameAr());

        return soapModel;
    }

    public static PaymentChannelSoap[] toSoapModels(PaymentChannel[] models) {
        PaymentChannelSoap[] soapModels = new PaymentChannelSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentChannelSoap[][] toSoapModels(PaymentChannel[][] models) {
        PaymentChannelSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentChannelSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentChannelSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentChannelSoap[] toSoapModels(List<PaymentChannel> models) {
        List<PaymentChannelSoap> soapModels = new ArrayList<PaymentChannelSoap>(models.size());

        for (PaymentChannel model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentChannelSoap[soapModels.size()]);
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

    public String getActive() {
        return _active;
    }

    public void setActive(String active) {
        _active = active;
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

    public long getChannelId() {
        return _channelId;
    }

    public void setChannelId(long channelId) {
        _channelId = channelId;
    }

    public String getChannelType() {
        return _channelType;
    }

    public void setChannelType(String channelType) {
        _channelType = channelType;
    }

    public String getDescriptiveNameEn() {
        return _descriptiveNameEn;
    }

    public void setDescriptiveNameEn(String descriptiveNameEn) {
        _descriptiveNameEn = descriptiveNameEn;
    }

    public String getDescriptiveNameAr() {
        return _descriptiveNameAr;
    }

    public void setDescriptiveNameAr(String descriptiveNameAr) {
        _descriptiveNameAr = descriptiveNameAr;
    }
}
