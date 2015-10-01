package com.stc.echannels.epayments.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.stc.echannels.epayments.service.http.ReconLogServiceSoap}.
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.http.ReconLogServiceSoap
 * @generated
 */
public class ReconLogSoap implements Serializable {
    private String _paymentSystemTransId;
    private long _bankTransId;
    private double _transAmount;
    private String _paymentMethod;
    private String _paymentChannel;
    private String _pmtBankId;
    private Date _bankTransDate;
    private String _beneficiaryServiceNo;
    private long _serviceId;
    private String _paymentStatus;

    public ReconLogSoap() {
    }

    public static ReconLogSoap toSoapModel(ReconLog model) {
        ReconLogSoap soapModel = new ReconLogSoap();

        soapModel.setPaymentSystemTransId(model.getPaymentSystemTransId());
        soapModel.setBankTransId(model.getBankTransId());
        soapModel.setTransAmount(model.getTransAmount());
        soapModel.setPaymentMethod(model.getPaymentMethod());
        soapModel.setPaymentChannel(model.getPaymentChannel());
        soapModel.setPmtBankId(model.getPmtBankId());
        soapModel.setBankTransDate(model.getBankTransDate());
        soapModel.setBeneficiaryServiceNo(model.getBeneficiaryServiceNo());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setPaymentStatus(model.getPaymentStatus());

        return soapModel;
    }

    public static ReconLogSoap[] toSoapModels(ReconLog[] models) {
        ReconLogSoap[] soapModels = new ReconLogSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ReconLogSoap[][] toSoapModels(ReconLog[][] models) {
        ReconLogSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ReconLogSoap[models.length][models[0].length];
        } else {
            soapModels = new ReconLogSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ReconLogSoap[] toSoapModels(List<ReconLog> models) {
        List<ReconLogSoap> soapModels = new ArrayList<ReconLogSoap>(models.size());

        for (ReconLog model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ReconLogSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _paymentSystemTransId;
    }

    public void setPrimaryKey(String pk) {
        setPaymentSystemTransId(pk);
    }

    public String getPaymentSystemTransId() {
        return _paymentSystemTransId;
    }

    public void setPaymentSystemTransId(String paymentSystemTransId) {
        _paymentSystemTransId = paymentSystemTransId;
    }

    public long getBankTransId() {
        return _bankTransId;
    }

    public void setBankTransId(long bankTransId) {
        _bankTransId = bankTransId;
    }

    public double getTransAmount() {
        return _transAmount;
    }

    public void setTransAmount(double transAmount) {
        _transAmount = transAmount;
    }

    public String getPaymentMethod() {
        return _paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        _paymentMethod = paymentMethod;
    }

    public String getPaymentChannel() {
        return _paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        _paymentChannel = paymentChannel;
    }

    public String getPmtBankId() {
        return _pmtBankId;
    }

    public void setPmtBankId(String pmtBankId) {
        _pmtBankId = pmtBankId;
    }

    public Date getBankTransDate() {
        return _bankTransDate;
    }

    public void setBankTransDate(Date bankTransDate) {
        _bankTransDate = bankTransDate;
    }

    public String getBeneficiaryServiceNo() {
        return _beneficiaryServiceNo;
    }

    public void setBeneficiaryServiceNo(String beneficiaryServiceNo) {
        _beneficiaryServiceNo = beneficiaryServiceNo;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }

    public String getPaymentStatus() {
        return _paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        _paymentStatus = paymentStatus;
    }
}
