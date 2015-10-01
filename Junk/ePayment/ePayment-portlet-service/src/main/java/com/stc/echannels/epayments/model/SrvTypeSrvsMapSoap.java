package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.SrvTypeSrvsMapServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.SrvTypeSrvsMapServiceSoap
 * @generated
 */
public class SrvTypeSrvsMapSoap implements Serializable {
    private String _id;
    private long _serviceId;
    private long _serviceTypeId;

    public SrvTypeSrvsMapSoap() {
    }

    public static SrvTypeSrvsMapSoap toSoapModel(SrvTypeSrvsMap model) {
        SrvTypeSrvsMapSoap soapModel = new SrvTypeSrvsMapSoap();

        soapModel.setId(model.getId());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setServiceTypeId(model.getServiceTypeId());

        return soapModel;
    }

    public static SrvTypeSrvsMapSoap[] toSoapModels(SrvTypeSrvsMap[] models) {
        SrvTypeSrvsMapSoap[] soapModels = new SrvTypeSrvsMapSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SrvTypeSrvsMapSoap[][] toSoapModels(SrvTypeSrvsMap[][] models) {
        SrvTypeSrvsMapSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SrvTypeSrvsMapSoap[models.length][models[0].length];
        } else {
            soapModels = new SrvTypeSrvsMapSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SrvTypeSrvsMapSoap[] toSoapModels(List<SrvTypeSrvsMap> models) {
        List<SrvTypeSrvsMapSoap> soapModels = new ArrayList<SrvTypeSrvsMapSoap>(models.size());

        for (SrvTypeSrvsMap model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SrvTypeSrvsMapSoap[soapModels.size()]);
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

    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;
    }
}
