package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.SrvTypesServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.SrvTypesServiceSoap
 * @generated
 */
public class SrvTypesSoap implements Serializable {
    private long _serviceTypeId;
    private String _serviceTypeName;
    private String _serviceNameEN;
    private String _serviceNameAR;

    public SrvTypesSoap() {
    }

    public static SrvTypesSoap toSoapModel(SrvTypes model) {
        SrvTypesSoap soapModel = new SrvTypesSoap();

        soapModel.setServiceTypeId(model.getServiceTypeId());
        soapModel.setServiceTypeName(model.getServiceTypeName());
        soapModel.setServiceNameEN(model.getServiceNameEN());
        soapModel.setServiceNameAR(model.getServiceNameAR());

        return soapModel;
    }

    public static SrvTypesSoap[] toSoapModels(SrvTypes[] models) {
        SrvTypesSoap[] soapModels = new SrvTypesSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SrvTypesSoap[][] toSoapModels(SrvTypes[][] models) {
        SrvTypesSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SrvTypesSoap[models.length][models[0].length];
        } else {
            soapModels = new SrvTypesSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SrvTypesSoap[] toSoapModels(List<SrvTypes> models) {
        List<SrvTypesSoap> soapModels = new ArrayList<SrvTypesSoap>(models.size());

        for (SrvTypes model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SrvTypesSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _serviceTypeId;
    }

    public void setPrimaryKey(long pk) {
        setServiceTypeId(pk);
    }

    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return _serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        _serviceTypeName = serviceTypeName;
    }

    public String getServiceNameEN() {
        return _serviceNameEN;
    }

    public void setServiceNameEN(String serviceNameEN) {
        _serviceNameEN = serviceNameEN;
    }

    public String getServiceNameAR() {
        return _serviceNameAR;
    }

    public void setServiceNameAR(String serviceNameAR) {
        _serviceNameAR = serviceNameAR;
    }
}
