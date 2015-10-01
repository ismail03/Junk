package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentMethodServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentMethodServiceSoap
 * @generated
 */
public class PaymentMethodSoap implements Serializable {
    private long _pmtMethodId;
    private String _status;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _descriptiveNameEn;
    private String _descriptiveNameAr;
    private String _pmtMethodIdType;

    public PaymentMethodSoap() {
    }

    public static PaymentMethodSoap toSoapModel(PaymentMethod model) {
        PaymentMethodSoap soapModel = new PaymentMethodSoap();

        soapModel.setPmtMethodId(model.getPmtMethodId());
        soapModel.setStatus(model.getStatus());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
        soapModel.setClientIp(model.getClientIp());
        soapModel.setServerIp(model.getServerIp());
        soapModel.setUserAgent(model.getUserAgent());
        soapModel.setOperation(model.getOperation());
        soapModel.setDescriptiveNameEn(model.getDescriptiveNameEn());
        soapModel.setDescriptiveNameAr(model.getDescriptiveNameAr());
        soapModel.setPmtMethodIdType(model.getPmtMethodIdType());

        return soapModel;
    }

    public static PaymentMethodSoap[] toSoapModels(PaymentMethod[] models) {
        PaymentMethodSoap[] soapModels = new PaymentMethodSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentMethodSoap[][] toSoapModels(PaymentMethod[][] models) {
        PaymentMethodSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentMethodSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentMethodSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentMethodSoap[] toSoapModels(List<PaymentMethod> models) {
        List<PaymentMethodSoap> soapModels = new ArrayList<PaymentMethodSoap>(models.size());

        for (PaymentMethod model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentMethodSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _pmtMethodId;
    }

    public void setPrimaryKey(long pk) {
        setPmtMethodId(pk);
    }

    public long getPmtMethodId() {
        return _pmtMethodId;
    }

    public void setPmtMethodId(long pmtMethodId) {
        _pmtMethodId = pmtMethodId;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
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

    public String getPmtMethodIdType() {
        return _pmtMethodIdType;
    }

    public void setPmtMethodIdType(String pmtMethodIdType) {
        _pmtMethodIdType = pmtMethodIdType;
    }
}
