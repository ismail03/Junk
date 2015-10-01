package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentChannelSrvsMapServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentChannelSrvsMapServiceSoap
 * @generated
 */
public class PaymentChannelSrvsMapSoap implements Serializable {
    private String _id;
    private long _serviceId;
    private long _channelId;

    public PaymentChannelSrvsMapSoap() {
    }

    public static PaymentChannelSrvsMapSoap toSoapModel(
        PaymentChannelSrvsMap model) {
        PaymentChannelSrvsMapSoap soapModel = new PaymentChannelSrvsMapSoap();

        soapModel.setId(model.getId());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setChannelId(model.getChannelId());

        return soapModel;
    }

    public static PaymentChannelSrvsMapSoap[] toSoapModels(
        PaymentChannelSrvsMap[] models) {
        PaymentChannelSrvsMapSoap[] soapModels = new PaymentChannelSrvsMapSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentChannelSrvsMapSoap[][] toSoapModels(
        PaymentChannelSrvsMap[][] models) {
        PaymentChannelSrvsMapSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentChannelSrvsMapSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentChannelSrvsMapSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentChannelSrvsMapSoap[] toSoapModels(
        List<PaymentChannelSrvsMap> models) {
        List<PaymentChannelSrvsMapSoap> soapModels = new ArrayList<PaymentChannelSrvsMapSoap>(models.size());

        for (PaymentChannelSrvsMap model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentChannelSrvsMapSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(String pk) {
        setId(pk);
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        _id = id;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }

    public long getChannelId() {
        return _channelId;
    }

    public void setChannelId(long channelId) {
        _channelId = channelId;
    }
}
