package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.RefundReconLogServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.RefundReconLogServiceSoap
 * @generated
 */
public class RefundReconLogSoap implements Serializable {
    private String _batchId;
    private long _serviceId;
    private String _refundId;
    private String _pmtBankId;
    private String _pmtSystemRefundTransId;
    private String _bankRefundTransId;
    private Date _effDt;
    private Date _processDate;
    private double _refundAmount;
    private String _refundStatusCode;

    public RefundReconLogSoap() {
    }

    public static RefundReconLogSoap toSoapModel(RefundReconLog model) {
        RefundReconLogSoap soapModel = new RefundReconLogSoap();

        soapModel.setBatchId(model.getBatchId());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setRefundId(model.getRefundId());
        soapModel.setPmtBankId(model.getPmtBankId());
        soapModel.setPmtSystemRefundTransId(model.getPmtSystemRefundTransId());
        soapModel.setBankRefundTransId(model.getBankRefundTransId());
        soapModel.setEffDt(model.getEffDt());
        soapModel.setProcessDate(model.getProcessDate());
        soapModel.setRefundAmount(model.getRefundAmount());
        soapModel.setRefundStatusCode(model.getRefundStatusCode());

        return soapModel;
    }

    public static RefundReconLogSoap[] toSoapModels(RefundReconLog[] models) {
        RefundReconLogSoap[] soapModels = new RefundReconLogSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RefundReconLogSoap[][] toSoapModels(RefundReconLog[][] models) {
        RefundReconLogSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RefundReconLogSoap[models.length][models[0].length];
        } else {
            soapModels = new RefundReconLogSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RefundReconLogSoap[] toSoapModels(List<RefundReconLog> models) {
        List<RefundReconLogSoap> soapModels = new ArrayList<RefundReconLogSoap>(models.size());

        for (RefundReconLog model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RefundReconLogSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _batchId;
    }

    public void setPrimaryKey(String pk) {
        setBatchId(pk);
    }

    public String getBatchId() {
        return _batchId;
    }

    public void setBatchId(String batchId) {
        _batchId = batchId;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }

    public String getRefundId() {
        return _refundId;
    }

    public void setRefundId(String refundId) {
        _refundId = refundId;
    }

    public String getPmtBankId() {
        return _pmtBankId;
    }

    public void setPmtBankId(String pmtBankId) {
        _pmtBankId = pmtBankId;
    }

    public String getPmtSystemRefundTransId() {
        return _pmtSystemRefundTransId;
    }

    public void setPmtSystemRefundTransId(String pmtSystemRefundTransId) {
        _pmtSystemRefundTransId = pmtSystemRefundTransId;
    }

    public String getBankRefundTransId() {
        return _bankRefundTransId;
    }

    public void setBankRefundTransId(String bankRefundTransId) {
        _bankRefundTransId = bankRefundTransId;
    }

    public Date getEffDt() {
        return _effDt;
    }

    public void setEffDt(Date effDt) {
        _effDt = effDt;
    }

    public Date getProcessDate() {
        return _processDate;
    }

    public void setProcessDate(Date processDate) {
        _processDate = processDate;
    }

    public double getRefundAmount() {
        return _refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        _refundAmount = refundAmount;
    }

    public String getRefundStatusCode() {
        return _refundStatusCode;
    }

    public void setRefundStatusCode(String refundStatusCode) {
        _refundStatusCode = refundStatusCode;
    }
}
