package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.NotifParamServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.NotifParamServiceSoap
 * @generated
 */
public class NotifParamSoap implements Serializable {
    private long _notifParamId;
    private String _nameAr;
    private String _nameEn;
    private String _paramName;

    public NotifParamSoap() {
    }

    public static NotifParamSoap toSoapModel(NotifParam model) {
        NotifParamSoap soapModel = new NotifParamSoap();

        soapModel.setNotifParamId(model.getNotifParamId());
        soapModel.setNameAr(model.getNameAr());
        soapModel.setNameEn(model.getNameEn());
        soapModel.setParamName(model.getParamName());

        return soapModel;
    }

    public static NotifParamSoap[] toSoapModels(NotifParam[] models) {
        NotifParamSoap[] soapModels = new NotifParamSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static NotifParamSoap[][] toSoapModels(NotifParam[][] models) {
        NotifParamSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new NotifParamSoap[models.length][models[0].length];
        } else {
            soapModels = new NotifParamSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static NotifParamSoap[] toSoapModels(List<NotifParam> models) {
        List<NotifParamSoap> soapModels = new ArrayList<NotifParamSoap>(models.size());

        for (NotifParam model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new NotifParamSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _notifParamId;
    }

    public void setPrimaryKey(long pk) {
        setNotifParamId(pk);
    }

    public long getNotifParamId() {
        return _notifParamId;
    }

    public void setNotifParamId(long notifParamId) {
        _notifParamId = notifParamId;
    }

    public String getNameAr() {
        return _nameAr;
    }

    public void setNameAr(String nameAr) {
        _nameAr = nameAr;
    }

    public String getNameEn() {
        return _nameEn;
    }

    public void setNameEn(String nameEn) {
        _nameEn = nameEn;
    }

    public String getParamName() {
        return _paramName;
    }

    public void setParamName(String paramName) {
        _paramName = paramName;
    }
}
