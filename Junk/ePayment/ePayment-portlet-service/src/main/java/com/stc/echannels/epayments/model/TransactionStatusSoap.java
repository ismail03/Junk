package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.TransactionStatusServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.TransactionStatusServiceSoap
 * @generated
 */
public class TransactionStatusSoap implements Serializable {
    private long _id;
    private String _description;
    private String _descriptiveNameEn;
    private String _descriptiveNameAr;

    public TransactionStatusSoap() {
    }

    public static TransactionStatusSoap toSoapModel(TransactionStatus model) {
        TransactionStatusSoap soapModel = new TransactionStatusSoap();

        soapModel.setId(model.getId());
        soapModel.setDescription(model.getDescription());
        soapModel.setDescriptiveNameEn(model.getDescriptiveNameEn());
        soapModel.setDescriptiveNameAr(model.getDescriptiveNameAr());

        return soapModel;
    }

    public static TransactionStatusSoap[] toSoapModels(
        TransactionStatus[] models) {
        TransactionStatusSoap[] soapModels = new TransactionStatusSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TransactionStatusSoap[][] toSoapModels(
        TransactionStatus[][] models) {
        TransactionStatusSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TransactionStatusSoap[models.length][models[0].length];
        } else {
            soapModels = new TransactionStatusSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TransactionStatusSoap[] toSoapModels(
        List<TransactionStatus> models) {
        List<TransactionStatusSoap> soapModels = new ArrayList<TransactionStatusSoap>(models.size());

        for (TransactionStatus model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TransactionStatusSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
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
}
