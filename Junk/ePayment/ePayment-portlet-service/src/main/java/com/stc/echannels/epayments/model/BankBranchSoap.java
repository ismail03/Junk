package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.BankBranchServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.BankBranchServiceSoap
 * @generated
 */
public class BankBranchSoap implements Serializable {
    private String _transId;
    private String _stcBranchCode;
    private String _bankId;
    private long _channelId;
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

    public BankBranchSoap() {
    }

    public static BankBranchSoap toSoapModel(BankBranch model) {
        BankBranchSoap soapModel = new BankBranchSoap();

        soapModel.setTransId(model.getTransId());
        soapModel.setStcBranchCode(model.getStcBranchCode());
        soapModel.setBankId(model.getBankId());
        soapModel.setChannelId(model.getChannelId());
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

        return soapModel;
    }

    public static BankBranchSoap[] toSoapModels(BankBranch[] models) {
        BankBranchSoap[] soapModels = new BankBranchSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BankBranchSoap[][] toSoapModels(BankBranch[][] models) {
        BankBranchSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BankBranchSoap[models.length][models[0].length];
        } else {
            soapModels = new BankBranchSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BankBranchSoap[] toSoapModels(List<BankBranch> models) {
        List<BankBranchSoap> soapModels = new ArrayList<BankBranchSoap>(models.size());

        for (BankBranch model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BankBranchSoap[soapModels.size()]);
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

    public String getStcBranchCode() {
        return _stcBranchCode;
    }

    public void setStcBranchCode(String stcBranchCode) {
        _stcBranchCode = stcBranchCode;
    }

    public String getBankId() {
        return _bankId;
    }

    public void setBankId(String bankId) {
        _bankId = bankId;
    }

    public long getChannelId() {
        return _channelId;
    }

    public void setChannelId(long channelId) {
        _channelId = channelId;
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
}
