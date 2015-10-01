package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentChannelSrServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentChannelSrServiceSoap
 * @generated
 */
public class PaymentChannelSrSoap implements Serializable {
    private long _channelid;
    private long _serviceid;
    private String _id;

    public PaymentChannelSrSoap() {
    }

    public static PaymentChannelSrSoap toSoapModel(PaymentChannelSr model) {
        PaymentChannelSrSoap soapModel = new PaymentChannelSrSoap();

        soapModel.setChannelid(model.getChannelid());
        soapModel.setServiceid(model.getServiceid());
        soapModel.setId(model.getId());

        return soapModel;
    }

    public static PaymentChannelSrSoap[] toSoapModels(PaymentChannelSr[] models) {
        PaymentChannelSrSoap[] soapModels = new PaymentChannelSrSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentChannelSrSoap[][] toSoapModels(
        PaymentChannelSr[][] models) {
        PaymentChannelSrSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentChannelSrSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentChannelSrSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentChannelSrSoap[] toSoapModels(
        List<PaymentChannelSr> models) {
        List<PaymentChannelSrSoap> soapModels = new ArrayList<PaymentChannelSrSoap>(models.size());

        for (PaymentChannelSr model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentChannelSrSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(String pk) {
        setId(pk);
    }

    public long getChannelid() {
        return _channelid;
    }

    public void setChannelid(long channelid) {
        _channelid = channelid;
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
