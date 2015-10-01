package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.CardGroupServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.CardGroupServiceSoap
 * @generated
 */
public class CardGroupSoap implements Serializable {
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _cardGroupId;
    private long _cardValue;
    private long _promotionValue;
    private String _inPaymentSystem;
    private long _serviceId;

    public CardGroupSoap() {
    }

    public static CardGroupSoap toSoapModel(CardGroup model) {
        CardGroupSoap soapModel = new CardGroupSoap();

        soapModel.setTransId(model.getTransId());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setActive(model.getActive());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
        soapModel.setClientIp(model.getClientIp());
        soapModel.setServerIp(model.getServerIp());
        soapModel.setUserAgent(model.getUserAgent());
        soapModel.setOperation(model.getOperation());
        soapModel.setCardGroupId(model.getCardGroupId());
        soapModel.setCardValue(model.getCardValue());
        soapModel.setPromotionValue(model.getPromotionValue());
        soapModel.setInPaymentSystem(model.getInPaymentSystem());
        soapModel.setServiceId(model.getServiceId());

        return soapModel;
    }

    public static CardGroupSoap[] toSoapModels(CardGroup[] models) {
        CardGroupSoap[] soapModels = new CardGroupSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CardGroupSoap[][] toSoapModels(CardGroup[][] models) {
        CardGroupSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CardGroupSoap[models.length][models[0].length];
        } else {
            soapModels = new CardGroupSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CardGroupSoap[] toSoapModels(List<CardGroup> models) {
        List<CardGroupSoap> soapModels = new ArrayList<CardGroupSoap>(models.size());

        for (CardGroup model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CardGroupSoap[soapModels.size()]);
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

    public String getCardGroupId() {
        return _cardGroupId;
    }

    public void setCardGroupId(String cardGroupId) {
        _cardGroupId = cardGroupId;
    }

    public long getCardValue() {
        return _cardValue;
    }

    public void setCardValue(long cardValue) {
        _cardValue = cardValue;
    }

    public long getPromotionValue() {
        return _promotionValue;
    }

    public void setPromotionValue(long promotionValue) {
        _promotionValue = promotionValue;
    }

    public String getInPaymentSystem() {
        return _inPaymentSystem;
    }

    public void setInPaymentSystem(String inPaymentSystem) {
        _inPaymentSystem = inPaymentSystem;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }
}
