package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.BusinessSrvServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.BusinessSrvServiceSoap
 * @generated
 */
public class BusinessSrvSoap implements Serializable {
    private long _serviceId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;
    private String _refMask;
    private String _serviceType;
    private String _serviceNameEn;
    private String _serviceNameAr;

    public BusinessSrvSoap() {
    }

    public static BusinessSrvSoap toSoapModel(BusinessSrv model) {
        BusinessSrvSoap soapModel = new BusinessSrvSoap();

        soapModel.setServiceId(model.getServiceId());
        soapModel.setLastUpdateTimestamp(model.getLastUpdateTimestamp());
        soapModel.setLastUpdateUserid(model.getLastUpdateUserid());
        soapModel.setLastUpdateUsername(model.getLastUpdateUsername());
        soapModel.setStatus(model.getStatus());
        soapModel.setEffectiveTimestamp(model.getEffectiveTimestamp());
        soapModel.setRefMask(model.getRefMask());
        soapModel.setServiceType(model.getServiceType());
        soapModel.setServiceNameEn(model.getServiceNameEn());
        soapModel.setServiceNameAr(model.getServiceNameAr());

        return soapModel;
    }

    public static BusinessSrvSoap[] toSoapModels(BusinessSrv[] models) {
        BusinessSrvSoap[] soapModels = new BusinessSrvSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BusinessSrvSoap[][] toSoapModels(BusinessSrv[][] models) {
        BusinessSrvSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BusinessSrvSoap[models.length][models[0].length];
        } else {
            soapModels = new BusinessSrvSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BusinessSrvSoap[] toSoapModels(List<BusinessSrv> models) {
        List<BusinessSrvSoap> soapModels = new ArrayList<BusinessSrvSoap>(models.size());

        for (BusinessSrv model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BusinessSrvSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _serviceId;
    }

    public void setPrimaryKey(long pk) {
        setServiceId(pk);
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }

    public Date getLastUpdateTimestamp() {
        return _lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        _lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public String getLastUpdateUserid() {
        return _lastUpdateUserid;
    }

    public void setLastUpdateUserid(String lastUpdateUserid) {
        _lastUpdateUserid = lastUpdateUserid;
    }

    public String getLastUpdateUsername() {
        return _lastUpdateUsername;
    }

    public void setLastUpdateUsername(String lastUpdateUsername) {
        _lastUpdateUsername = lastUpdateUsername;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }

    public Date getEffectiveTimestamp() {
        return _effectiveTimestamp;
    }

    public void setEffectiveTimestamp(Date effectiveTimestamp) {
        _effectiveTimestamp = effectiveTimestamp;
    }

    public String getRefMask() {
        return _refMask;
    }

    public void setRefMask(String refMask) {
        _refMask = refMask;
    }

    public String getServiceType() {
        return _serviceType;
    }

    public void setServiceType(String serviceType) {
        _serviceType = serviceType;
    }

    public String getServiceNameEn() {
        return _serviceNameEn;
    }

    public void setServiceNameEn(String serviceNameEn) {
        _serviceNameEn = serviceNameEn;
    }

    public String getServiceNameAr() {
        return _serviceNameAr;
    }

    public void setServiceNameAr(String serviceNameAr) {
        _serviceNameAr = serviceNameAr;
    }
}
