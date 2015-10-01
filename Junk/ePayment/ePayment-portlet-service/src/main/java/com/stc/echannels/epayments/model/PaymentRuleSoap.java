package com.stc.echannels.epayments.model;

import com.stc.echannels.epayments.service.persistence.PaymentRulePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentRuleServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentRuleServiceSoap
 * @generated
 */
public class PaymentRuleSoap implements Serializable {
    private long _ruleId;
    private String _transId;
    private String _ruleName;
    private String _value;
    private String _descriptionEN;
    private String _descriptionAR;
    private String _isEditable;
    private String _refundOnViolation;
    private String _ruleCategory;
    private String _clientIP;
    private String _serverIP;
    private String _userAgent;
    private String _operation;
    private String _isList;
    private long _serviceTypeId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;

    public PaymentRuleSoap() {
    }

    public static PaymentRuleSoap toSoapModel(PaymentRule model) {
        PaymentRuleSoap soapModel = new PaymentRuleSoap();

        soapModel.setRuleId(model.getRuleId());
        soapModel.setTransId(model.getTransId());
        soapModel.setRuleName(model.getRuleName());
        soapModel.setValue(model.getValue());
        soapModel.setDescriptionEN(model.getDescriptionEN());
        soapModel.setDescriptionAR(model.getDescriptionAR());
        soapModel.setIsEditable(model.getIsEditable());
        soapModel.setRefundOnViolation(model.getRefundOnViolation());
        soapModel.setRuleCategory(model.getRuleCategory());
        soapModel.setClientIP(model.getClientIP());
        soapModel.setServerIP(model.getServerIP());
        soapModel.setUserAgent(model.getUserAgent());
        soapModel.setOperation(model.getOperation());
        soapModel.setIsList(model.getIsList());
        soapModel.setServiceTypeId(model.getServiceTypeId());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setStatus(model.getStatus());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());

        return soapModel;
    }

    public static PaymentRuleSoap[] toSoapModels(PaymentRule[] models) {
        PaymentRuleSoap[] soapModels = new PaymentRuleSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentRuleSoap[][] toSoapModels(PaymentRule[][] models) {
        PaymentRuleSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentRuleSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentRuleSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentRuleSoap[] toSoapModels(List<PaymentRule> models) {
        List<PaymentRuleSoap> soapModels = new ArrayList<PaymentRuleSoap>(models.size());

        for (PaymentRule model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentRuleSoap[soapModels.size()]);
    }

    public PaymentRulePK getPrimaryKey() {
        return new PaymentRulePK(_ruleId, _transId);
    }

    public void setPrimaryKey(PaymentRulePK pk) {
        setRuleId(pk.ruleId);
        setTransId(pk.transId);
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

    public String getRuleName() {
        return _ruleName;
    }

    public void setRuleName(String ruleName) {
        _ruleName = ruleName;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }

    public String getDescriptionEN() {
        return _descriptionEN;
    }

    public void setDescriptionEN(String descriptionEN) {
        _descriptionEN = descriptionEN;
    }

    public String getDescriptionAR() {
        return _descriptionAR;
    }

    public void setDescriptionAR(String descriptionAR) {
        _descriptionAR = descriptionAR;
    }

    public String getIsEditable() {
        return _isEditable;
    }

    public void setIsEditable(String isEditable) {
        _isEditable = isEditable;
    }

    public String getRefundOnViolation() {
        return _refundOnViolation;
    }

    public void setRefundOnViolation(String refundOnViolation) {
        _refundOnViolation = refundOnViolation;
    }

    public String getRuleCategory() {
        return _ruleCategory;
    }

    public void setRuleCategory(String ruleCategory) {
        _ruleCategory = ruleCategory;
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

    public String getIsList() {
        return _isList;
    }

    public void setIsList(String isList) {
        _isList = isList;
    }

    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;
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
