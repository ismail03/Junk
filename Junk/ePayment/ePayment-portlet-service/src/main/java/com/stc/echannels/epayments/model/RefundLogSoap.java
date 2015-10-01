package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.RefundLogServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.RefundLogServiceSoap
 * @generated
 */
public class RefundLogSoap implements Serializable {
    private String _refundId;
    private String _epayTransId;
    private double _amount;
    private Date _submissionDate;
    private Date _approvalDate;
    private String _status;

    public RefundLogSoap() {
    }

    public static RefundLogSoap toSoapModel(RefundLog model) {
        RefundLogSoap soapModel = new RefundLogSoap();

        soapModel.setRefundId(model.getRefundId());
        soapModel.setEpayTransId(model.getEpayTransId());
        soapModel.setAmount(model.getAmount());
        soapModel.setSubmissionDate(model.getSubmissionDate());
        soapModel.setApprovalDate(model.getApprovalDate());
        soapModel.setStatus(model.getStatus());

        return soapModel;
    }

    public static RefundLogSoap[] toSoapModels(RefundLog[] models) {
        RefundLogSoap[] soapModels = new RefundLogSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RefundLogSoap[][] toSoapModels(RefundLog[][] models) {
        RefundLogSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RefundLogSoap[models.length][models[0].length];
        } else {
            soapModels = new RefundLogSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RefundLogSoap[] toSoapModels(List<RefundLog> models) {
        List<RefundLogSoap> soapModels = new ArrayList<RefundLogSoap>(models.size());

        for (RefundLog model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RefundLogSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _epayTransId;
    }

    public void setPrimaryKey(String pk) {
        setEpayTransId(pk);
    }

    public String getRefundId() {
        return _refundId;
    }

    public void setRefundId(String refundId) {
        _refundId = refundId;
    }

    public String getEpayTransId() {
        return _epayTransId;
    }

    public void setEpayTransId(String epayTransId) {
        _epayTransId = epayTransId;
    }

    public double getAmount() {
        return _amount;
    }

    public void setAmount(double amount) {
        _amount = amount;
    }

    public Date getSubmissionDate() {
        return _submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        _submissionDate = submissionDate;
    }

    public Date getApprovalDate() {
        return _approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        _approvalDate = approvalDate;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }
}
