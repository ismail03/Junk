package com.stc.echannels.epayments.model;

import com.stc.echannels.epayments.service.persistence.NotifParamSrvPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.NotifParamSrvServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.NotifParamSrvServiceSoap
 * @generated
 */
public class NotifParamSrvSoap implements Serializable {
    private long _notifParamId;
    private long _serviceId;

    public NotifParamSrvSoap() {
    }

    public static NotifParamSrvSoap toSoapModel(NotifParamSrv model) {
        NotifParamSrvSoap soapModel = new NotifParamSrvSoap();

        soapModel.setNotifParamId(model.getNotifParamId());
        soapModel.setServiceId(model.getServiceId());

        return soapModel;
    }

    public static NotifParamSrvSoap[] toSoapModels(NotifParamSrv[] models) {
        NotifParamSrvSoap[] soapModels = new NotifParamSrvSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static NotifParamSrvSoap[][] toSoapModels(NotifParamSrv[][] models) {
        NotifParamSrvSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new NotifParamSrvSoap[models.length][models[0].length];
        } else {
            soapModels = new NotifParamSrvSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static NotifParamSrvSoap[] toSoapModels(List<NotifParamSrv> models) {
        List<NotifParamSrvSoap> soapModels = new ArrayList<NotifParamSrvSoap>(models.size());

        for (NotifParamSrv model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new NotifParamSrvSoap[soapModels.size()]);
    }

    public NotifParamSrvPK getPrimaryKey() {
        return new NotifParamSrvPK(_notifParamId, _serviceId);
    }

    public void setPrimaryKey(NotifParamSrvPK pk) {
        setNotifParamId(pk.notifParamId);
        setServiceId(pk.serviceId);
    }

    public long getNotifParamId() {
        return _notifParamId;
    }

    public void setNotifParamId(long notifParamId) {
        _notifParamId = notifParamId;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }
}
