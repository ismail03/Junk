package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.BankServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.BankServiceSoap
 * @generated
 */
public class BankSoap implements Serializable {
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private Date _effectiveTimestamp;
    private String _status;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _bankId;
    private String _stcCode;
    private String _nameEn;
    private String _nameAr;
    private String _comments;

    public BankSoap() {
    }

    public static BankSoap toSoapModel(Bank model) {
        BankSoap soapModel = new BankSoap();

        soapModel.setTransId(model.getTransId());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setActive(model.getActive());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
        soapModel.setStatus(model.getStatus());
        soapModel.setClientIp(model.getClientIp());
        soapModel.setServerIp(model.getServerIp());
        soapModel.setUserAgent(model.getUserAgent());
        soapModel.setOperation(model.getOperation());
        soapModel.setBankId(model.getBankId());
        soapModel.setStcCode(model.getStcCode());
        soapModel.setNameEn(model.getNameEn());
        soapModel.setNameAr(model.getNameAr());
        soapModel.setComments(model.getComments());

        return soapModel;
    }

    public static BankSoap[] toSoapModels(Bank[] models) {
        BankSoap[] soapModels = new BankSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BankSoap[][] toSoapModels(Bank[][] models) {
        BankSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BankSoap[models.length][models[0].length];
        } else {
            soapModels = new BankSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BankSoap[] toSoapModels(List<Bank> models) {
        List<BankSoap> soapModels = new ArrayList<BankSoap>(models.size());

        for (Bank model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BankSoap[soapModels.size()]);
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

    public Date getEffectiveTimestamp() {
        return _effectiveTimestamp;
    }

    public void setEffectiveTimestamp(Date effectiveTimestamp) {
        _effectiveTimestamp = effectiveTimestamp;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
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

    public String getBankId() {
        return _bankId;
    }

    public void setBankId(String bankId) {
        _bankId = bankId;
    }

    public String getStcCode() {
        return _stcCode;
    }

    public void setStcCode(String stcCode) {
        _stcCode = stcCode;
    }

    public String getNameEn() {
        return _nameEn;
    }

    public void setNameEn(String nameEn) {
        _nameEn = nameEn;
    }

    public String getNameAr() {
        return _nameAr;
    }

    public void setNameAr(String nameAr) {
        _nameAr = nameAr;
    }

    public String getComments() {
        return _comments;
    }

    public void setComments(String comments) {
        _comments = comments;
    }
}
