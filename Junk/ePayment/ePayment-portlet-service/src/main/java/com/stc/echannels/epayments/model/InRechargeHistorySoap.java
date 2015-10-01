package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.InRechargeHistoryServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.InRechargeHistoryServiceSoap
 * @generated
 */
public class InRechargeHistorySoap implements Serializable {
    private String _msisdn;
    private String _transactionId;
    private String _cardGroup;
    private String _serviceClass;

    public InRechargeHistorySoap() {
    }

    public static InRechargeHistorySoap toSoapModel(InRechargeHistory model) {
        InRechargeHistorySoap soapModel = new InRechargeHistorySoap();

        soapModel.setMsisdn(model.getMsisdn());
        soapModel.setTransactionId(model.getTransactionId());
        soapModel.setCardGroup(model.getCardGroup());
        soapModel.setServiceClass(model.getServiceClass());

        return soapModel;
    }

    public static InRechargeHistorySoap[] toSoapModels(
        InRechargeHistory[] models) {
        InRechargeHistorySoap[] soapModels = new InRechargeHistorySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static InRechargeHistorySoap[][] toSoapModels(
        InRechargeHistory[][] models) {
        InRechargeHistorySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new InRechargeHistorySoap[models.length][models[0].length];
        } else {
            soapModels = new InRechargeHistorySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static InRechargeHistorySoap[] toSoapModels(
        List<InRechargeHistory> models) {
        List<InRechargeHistorySoap> soapModels = new ArrayList<InRechargeHistorySoap>(models.size());

        for (InRechargeHistory model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new InRechargeHistorySoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _msisdn;
    }

    public void setPrimaryKey(String pk) {
        setMsisdn(pk);
    }

    public String getMsisdn() {
        return _msisdn;
    }

    public void setMsisdn(String msisdn) {
        _msisdn = msisdn;
    }

    public String getTransactionId() {
        return _transactionId;
    }

    public void setTransactionId(String transactionId) {
        _transactionId = transactionId;
    }

    public String getCardGroup() {
        return _cardGroup;
    }

    public void setCardGroup(String cardGroup) {
        _cardGroup = cardGroup;
    }

    public String getServiceClass() {
        return _serviceClass;
    }

    public void setServiceClass(String serviceClass) {
        _serviceClass = serviceClass;
    }
}
