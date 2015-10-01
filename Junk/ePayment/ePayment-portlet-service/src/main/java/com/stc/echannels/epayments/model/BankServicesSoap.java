package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.BankServicesServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.BankServicesServiceSoap
 * @generated
 */
public class BankServicesSoap implements Serializable {
    private String _bankid;
    private long _serviceid;
    private String _id;

    public BankServicesSoap() {
    }

    public static BankServicesSoap toSoapModel(BankServices model) {
        BankServicesSoap soapModel = new BankServicesSoap();

        soapModel.setBankid(model.getBankid());
        soapModel.setServiceid(model.getServiceid());
        soapModel.setId(model.getId());

        return soapModel;
    }

    public static BankServicesSoap[] toSoapModels(BankServices[] models) {
        BankServicesSoap[] soapModels = new BankServicesSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BankServicesSoap[][] toSoapModels(BankServices[][] models) {
        BankServicesSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BankServicesSoap[models.length][models[0].length];
        } else {
            soapModels = new BankServicesSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BankServicesSoap[] toSoapModels(List<BankServices> models) {
        List<BankServicesSoap> soapModels = new ArrayList<BankServicesSoap>(models.size());

        for (BankServices model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BankServicesSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(String pk) {
        setId(pk);
    }

    public String getBankid() {
        return _bankid;
    }

    public void setBankid(String bankid) {
        _bankid = bankid;
    }

    public long getServiceid() {
        return _serviceid;
    }

    public void setServiceid(long serviceid) {
        _serviceid = serviceid;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        _id = id;
    }
}
