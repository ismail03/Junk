package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ReconLog}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see ReconLog
 * @generated
 */
public class ReconLogWrapper implements ReconLog, ModelWrapper<ReconLog> {
    private ReconLog _reconLog;

    public ReconLogWrapper(ReconLog reconLog) {
        _reconLog = reconLog;
    }

    @Override
    public Class<?> getModelClass() {
        return ReconLog.class;
    }

    @Override
    public String getModelClassName() {
        return ReconLog.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("paymentSystemTransId", getPaymentSystemTransId());
        attributes.put("bankTransId", getBankTransId());
        attributes.put("transAmount", getTransAmount());
        attributes.put("paymentMethod", getPaymentMethod());
        attributes.put("paymentChannel", getPaymentChannel());
        attributes.put("pmtBankId", getPmtBankId());
        attributes.put("bankTransDate", getBankTransDate());
        attributes.put("beneficiaryServiceNo", getBeneficiaryServiceNo());
        attributes.put("serviceId", getServiceId());
        attributes.put("paymentStatus", getPaymentStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String paymentSystemTransId = (String) attributes.get(
                "paymentSystemTransId");

        if (paymentSystemTransId != null) {
            setPaymentSystemTransId(paymentSystemTransId);
        }

        Long bankTransId = (Long) attributes.get("bankTransId");

        if (bankTransId != null) {
            setBankTransId(bankTransId);
        }

        Double transAmount = (Double) attributes.get("transAmount");

        if (transAmount != null) {
            setTransAmount(transAmount);
        }

        String paymentMethod = (String) attributes.get("paymentMethod");

        if (paymentMethod != null) {
            setPaymentMethod(paymentMethod);
        }

        String paymentChannel = (String) attributes.get("paymentChannel");

        if (paymentChannel != null) {
            setPaymentChannel(paymentChannel);
        }

        String pmtBankId = (String) attributes.get("pmtBankId");

        if (pmtBankId != null) {
            setPmtBankId(pmtBankId);
        }

        Date bankTransDate = (Date) attributes.get("bankTransDate");

        if (bankTransDate != null) {
            setBankTransDate(bankTransDate);
        }

        String beneficiaryServiceNo = (String) attributes.get(
                "beneficiaryServiceNo");

        if (beneficiaryServiceNo != null) {
            setBeneficiaryServiceNo(beneficiaryServiceNo);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        String paymentStatus = (String) attributes.get("paymentStatus");

        if (paymentStatus != null) {
            setPaymentStatus(paymentStatus);
        }
    }

    /**
    * Returns the primary key of this recon log.
    *
    * @return the primary key of this recon log
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _reconLog.getPrimaryKey();
    }

    /**
    * Sets the primary key of this recon log.
    *
    * @param primaryKey the primary key of this recon log
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _reconLog.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the payment system trans ID of this recon log.
    *
    * @return the payment system trans ID of this recon log
    */
    @Override
    public java.lang.String getPaymentSystemTransId() {
        return _reconLog.getPaymentSystemTransId();
    }

    /**
    * Sets the payment system trans ID of this recon log.
    *
    * @param paymentSystemTransId the payment system trans ID of this recon log
    */
    @Override
    public void setPaymentSystemTransId(java.lang.String paymentSystemTransId) {
        _reconLog.setPaymentSystemTransId(paymentSystemTransId);
    }

    /**
    * Returns the bank trans ID of this recon log.
    *
    * @return the bank trans ID of this recon log
    */
    @Override
    public long getBankTransId() {
        return _reconLog.getBankTransId();
    }

    /**
    * Sets the bank trans ID of this recon log.
    *
    * @param bankTransId the bank trans ID of this recon log
    */
    @Override
    public void setBankTransId(long bankTransId) {
        _reconLog.setBankTransId(bankTransId);
    }

    /**
    * Returns the trans amount of this recon log.
    *
    * @return the trans amount of this recon log
    */
    @Override
    public double getTransAmount() {
        return _reconLog.getTransAmount();
    }

    /**
    * Sets the trans amount of this recon log.
    *
    * @param transAmount the trans amount of this recon log
    */
    @Override
    public void setTransAmount(double transAmount) {
        _reconLog.setTransAmount(transAmount);
    }

    /**
    * Returns the payment method of this recon log.
    *
    * @return the payment method of this recon log
    */
    @Override
    public java.lang.String getPaymentMethod() {
        return _reconLog.getPaymentMethod();
    }

    /**
    * Sets the payment method of this recon log.
    *
    * @param paymentMethod the payment method of this recon log
    */
    @Override
    public void setPaymentMethod(java.lang.String paymentMethod) {
        _reconLog.setPaymentMethod(paymentMethod);
    }

    /**
    * Returns the payment channel of this recon log.
    *
    * @return the payment channel of this recon log
    */
    @Override
    public java.lang.String getPaymentChannel() {
        return _reconLog.getPaymentChannel();
    }

    /**
    * Sets the payment channel of this recon log.
    *
    * @param paymentChannel the payment channel of this recon log
    */
    @Override
    public void setPaymentChannel(java.lang.String paymentChannel) {
        _reconLog.setPaymentChannel(paymentChannel);
    }

    /**
    * Returns the pmt bank ID of this recon log.
    *
    * @return the pmt bank ID of this recon log
    */
    @Override
    public java.lang.String getPmtBankId() {
        return _reconLog.getPmtBankId();
    }

    /**
    * Sets the pmt bank ID of this recon log.
    *
    * @param pmtBankId the pmt bank ID of this recon log
    */
    @Override
    public void setPmtBankId(java.lang.String pmtBankId) {
        _reconLog.setPmtBankId(pmtBankId);
    }

    /**
    * Returns the bank trans date of this recon log.
    *
    * @return the bank trans date of this recon log
    */
    @Override
    public java.util.Date getBankTransDate() {
        return _reconLog.getBankTransDate();
    }

    /**
    * Sets the bank trans date of this recon log.
    *
    * @param bankTransDate the bank trans date of this recon log
    */
    @Override
    public void setBankTransDate(java.util.Date bankTransDate) {
        _reconLog.setBankTransDate(bankTransDate);
    }

    /**
    * Returns the beneficiary service no of this recon log.
    *
    * @return the beneficiary service no of this recon log
    */
    @Override
    public java.lang.String getBeneficiaryServiceNo() {
        return _reconLog.getBeneficiaryServiceNo();
    }

    /**
    * Sets the beneficiary service no of this recon log.
    *
    * @param beneficiaryServiceNo the beneficiary service no of this recon log
    */
    @Override
    public void setBeneficiaryServiceNo(java.lang.String beneficiaryServiceNo) {
        _reconLog.setBeneficiaryServiceNo(beneficiaryServiceNo);
    }

    /**
    * Returns the service ID of this recon log.
    *
    * @return the service ID of this recon log
    */
    @Override
    public long getServiceId() {
        return _reconLog.getServiceId();
    }

    /**
    * Sets the service ID of this recon log.
    *
    * @param serviceId the service ID of this recon log
    */
    @Override
    public void setServiceId(long serviceId) {
        _reconLog.setServiceId(serviceId);
    }

    /**
    * Returns the payment status of this recon log.
    *
    * @return the payment status of this recon log
    */
    @Override
    public java.lang.String getPaymentStatus() {
        return _reconLog.getPaymentStatus();
    }

    /**
    * Sets the payment status of this recon log.
    *
    * @param paymentStatus the payment status of this recon log
    */
    @Override
    public void setPaymentStatus(java.lang.String paymentStatus) {
        _reconLog.setPaymentStatus(paymentStatus);
    }

    @Override
    public boolean isNew() {
        return _reconLog.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _reconLog.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _reconLog.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _reconLog.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _reconLog.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _reconLog.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _reconLog.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _reconLog.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _reconLog.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _reconLog.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _reconLog.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ReconLogWrapper((ReconLog) _reconLog.clone());
    }

    @Override
    public int compareTo(ReconLog reconLog) {
        return _reconLog.compareTo(reconLog);
    }

    @Override
    public int hashCode() {
        return _reconLog.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ReconLog> toCacheModel() {
        return _reconLog.toCacheModel();
    }

    @Override
    public ReconLog toEscapedModel() {
        return new ReconLogWrapper(_reconLog.toEscapedModel());
    }

    @Override
    public ReconLog toUnescapedModel() {
        return new ReconLogWrapper(_reconLog.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _reconLog.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _reconLog.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _reconLog.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ReconLogWrapper)) {
            return false;
        }

        ReconLogWrapper reconLogWrapper = (ReconLogWrapper) obj;

        if (Validator.equals(_reconLog, reconLogWrapper._reconLog)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public ReconLog getWrappedReconLog() {
        return _reconLog;
    }

    @Override
    public ReconLog getWrappedModel() {
        return _reconLog;
    }

    @Override
    public void resetOriginalValues() {
        _reconLog.resetOriginalValues();
    }
}
