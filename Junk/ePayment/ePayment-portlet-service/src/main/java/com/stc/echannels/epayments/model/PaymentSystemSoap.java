package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentSystemServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentSystemServiceSoap
 * @generated
 */
public class PaymentSystemSoap implements Serializable {
    private long _paymentSystemId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private Date _effectiveTimestamp;
    private String _systemName;
    private String _dateFormat;

    public PaymentSystemSoap() {
    }

    public static PaymentSystemSoap toSoapModel(PaymentSystem model) {
        PaymentSystemSoap soapModel = new PaymentSystemSoap();

        soapModel.setPaymentSystemId(model.getPaymentSystemId());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setActive(model.getActive());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
        soapModel.setSystemName(model.getSystemName());
        soapModel.setDateFormat(model.getDateFormat());

        return soapModel;
    }

    public static PaymentSystemSoap[] toSoapModels(PaymentSystem[] models) {
        PaymentSystemSoap[] soapModels = new PaymentSystemSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentSystemSoap[][] toSoapModels(PaymentSystem[][] models) {
        PaymentSystemSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentSystemSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentSystemSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentSystemSoap[] toSoapModels(List<PaymentSystem> models) {
        List<PaymentSystemSoap> soapModels = new ArrayList<PaymentSystemSoap>(models.size());

        for (PaymentSystem model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentSystemSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _paymentSystemId;
    }

    public void setPrimaryKey(long pk) {
        setPaymentSystemId(pk);
    }

    public long getPaymentSystemId() {
        return _paymentSystemId;
    }

    public void setPaymentSystemId(long paymentSystemId) {
        _paymentSystemId = paymentSystemId;
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

    public String getSystemName() {
        return _systemName;
    }

    public void setSystemName(String systemName) {
        _systemName = systemName;
    }

    public String getDateFormat() {
        return _dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        _dateFormat = dateFormat;
    }
}
