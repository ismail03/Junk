package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.PaymentMethodSrvsMapServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.PaymentMethodSrvsMapServiceSoap
 * @generated
 */
public class PaymentMethodSrvsMapSoap implements Serializable {
    private String _id;
    private long _serviceId;
    private long _paymentMethodId;

    public PaymentMethodSrvsMapSoap() {
    }

    public static PaymentMethodSrvsMapSoap toSoapModel(
        PaymentMethodSrvsMap model) {
        PaymentMethodSrvsMapSoap soapModel = new PaymentMethodSrvsMapSoap();

        soapModel.setId(model.getId());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setPaymentMethodId(model.getPaymentMethodId());

        return soapModel;
    }

    public static PaymentMethodSrvsMapSoap[] toSoapModels(
        PaymentMethodSrvsMap[] models) {
        PaymentMethodSrvsMapSoap[] soapModels = new PaymentMethodSrvsMapSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaymentMethodSrvsMapSoap[][] toSoapModels(
        PaymentMethodSrvsMap[][] models) {
        PaymentMethodSrvsMapSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaymentMethodSrvsMapSoap[models.length][models[0].length];
        } else {
            soapModels = new PaymentMethodSrvsMapSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaymentMethodSrvsMapSoap[] toSoapModels(
        List<PaymentMethodSrvsMap> models) {
        List<PaymentMethodSrvsMapSoap> soapModels = new ArrayList<PaymentMethodSrvsMapSoap>(models.size());

        for (PaymentMethodSrvsMap model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaymentMethodSrvsMapSoap[soapModels.size()]);
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

    public long getPaymentMethodId() {
        return _paymentMethodId;
    }

    public void setPaymentMethodId(long paymentMethodId) {
        _paymentMethodId = paymentMethodId;
    }
}
