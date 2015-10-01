package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RefundReconLog}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see RefundReconLog
 * @generated
 */
public class RefundReconLogWrapper implements RefundReconLog,
    ModelWrapper<RefundReconLog> {
    private RefundReconLog _refundReconLog;

    public RefundReconLogWrapper(RefundReconLog refundReconLog) {
        _refundReconLog = refundReconLog;
    }

    @Override
    public Class<?> getModelClass() {
        return RefundReconLog.class;
    }

    @Override
    public String getModelClassName() {
        return RefundReconLog.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("batchId", getBatchId());
        attributes.put("serviceId", getServiceId());
        attributes.put("refundId", getRefundId());
        attributes.put("pmtBankId", getPmtBankId());
        attributes.put("pmtSystemRefundTransId", getPmtSystemRefundTransId());
        attributes.put("bankRefundTransId", getBankRefundTransId());
        attributes.put("effDt", getEffDt());
        attributes.put("processDate", getProcessDate());
        attributes.put("refundAmount", getRefundAmount());
        attributes.put("refundStatusCode", getRefundStatusCode());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String batchId = (String) attributes.get("batchId");

        if (batchId != null) {
            setBatchId(batchId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        String refundId = (String) attributes.get("refundId");

        if (refundId != null) {
            setRefundId(refundId);
        }

        String pmtBankId = (String) attributes.get("pmtBankId");

        if (pmtBankId != null) {
            setPmtBankId(pmtBankId);
        }

        String pmtSystemRefundTransId = (String) attributes.get(
                "pmtSystemRefundTransId");

        if (pmtSystemRefundTransId != null) {
            setPmtSystemRefundTransId(pmtSystemRefundTransId);
        }

        String bankRefundTransId = (String) attributes.get("bankRefundTransId");

        if (bankRefundTransId != null) {
            setBankRefundTransId(bankRefundTransId);
        }

        Date effDt = (Date) attributes.get("effDt");

        if (effDt != null) {
            setEffDt(effDt);
        }

        Date processDate = (Date) attributes.get("processDate");

        if (processDate != null) {
            setProcessDate(processDate);
        }

        Double refundAmount = (Double) attributes.get("refundAmount");

        if (refundAmount != null) {
            setRefundAmount(refundAmount);
        }

        String refundStatusCode = (String) attributes.get("refundStatusCode");

        if (refundStatusCode != null) {
            setRefundStatusCode(refundStatusCode);
        }
    }

    /**
    * Returns the primary key of this refund recon log.
    *
    * @return the primary key of this refund recon log
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _refundReconLog.getPrimaryKey();
    }

    /**
    * Sets the primary key of this refund recon log.
    *
    * @param primaryKey the primary key of this refund recon log
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _refundReconLog.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the batch ID of this refund recon log.
    *
    * @return the batch ID of this refund recon log
    */
    @Override
    public java.lang.String getBatchId() {
        return _refundReconLog.getBatchId();
    }

    /**
    * Sets the batch ID of this refund recon log.
    *
    * @param batchId the batch ID of this refund recon log
    */
    @Override
    public void setBatchId(java.lang.String batchId) {
        _refundReconLog.setBatchId(batchId);
    }

    /**
    * Returns the service ID of this refund recon log.
    *
    * @return the service ID of this refund recon log
    */
    @Override
    public long getServiceId() {
        return _refundReconLog.getServiceId();
    }

    /**
    * Sets the service ID of this refund recon log.
    *
    * @param serviceId the service ID of this refund recon log
    */
    @Override
    public void setServiceId(long serviceId) {
        _refundReconLog.setServiceId(serviceId);
    }

    /**
    * Returns the refund ID of this refund recon log.
    *
    * @return the refund ID of this refund recon log
    */
    @Override
    public java.lang.String getRefundId() {
        return _refundReconLog.getRefundId();
    }

    /**
    * Sets the refund ID of this refund recon log.
    *
    * @param refundId the refund ID of this refund recon log
    */
    @Override
    public void setRefundId(java.lang.String refundId) {
        _refundReconLog.setRefundId(refundId);
    }

    /**
    * Returns the pmt bank ID of this refund recon log.
    *
    * @return the pmt bank ID of this refund recon log
    */
    @Override
    public java.lang.String getPmtBankId() {
        return _refundReconLog.getPmtBankId();
    }

    /**
    * Sets the pmt bank ID of this refund recon log.
    *
    * @param pmtBankId the pmt bank ID of this refund recon log
    */
    @Override
    public void setPmtBankId(java.lang.String pmtBankId) {
        _refundReconLog.setPmtBankId(pmtBankId);
    }

    /**
    * Returns the pmt system refund trans ID of this refund recon log.
    *
    * @return the pmt system refund trans ID of this refund recon log
    */
    @Override
    public java.lang.String getPmtSystemRefundTransId() {
        return _refundReconLog.getPmtSystemRefundTransId();
    }

    /**
    * Sets the pmt system refund trans ID of this refund recon log.
    *
    * @param pmtSystemRefundTransId the pmt system refund trans ID of this refund recon log
    */
    @Override
    public void setPmtSystemRefundTransId(
        java.lang.String pmtSystemRefundTransId) {
        _refundReconLog.setPmtSystemRefundTransId(pmtSystemRefundTransId);
    }

    /**
    * Returns the bank refund trans ID of this refund recon log.
    *
    * @return the bank refund trans ID of this refund recon log
    */
    @Override
    public java.lang.String getBankRefundTransId() {
        return _refundReconLog.getBankRefundTransId();
    }

    /**
    * Sets the bank refund trans ID of this refund recon log.
    *
    * @param bankRefundTransId the bank refund trans ID of this refund recon log
    */
    @Override
    public void setBankRefundTransId(java.lang.String bankRefundTransId) {
        _refundReconLog.setBankRefundTransId(bankRefundTransId);
    }

    /**
    * Returns the eff dt of this refund recon log.
    *
    * @return the eff dt of this refund recon log
    */
    @Override
    public java.util.Date getEffDt() {
        return _refundReconLog.getEffDt();
    }

    /**
    * Sets the eff dt of this refund recon log.
    *
    * @param effDt the eff dt of this refund recon log
    */
    @Override
    public void setEffDt(java.util.Date effDt) {
        _refundReconLog.setEffDt(effDt);
    }

    /**
    * Returns the process date of this refund recon log.
    *
    * @return the process date of this refund recon log
    */
    @Override
    public java.util.Date getProcessDate() {
        return _refundReconLog.getProcessDate();
    }

    /**
    * Sets the process date of this refund recon log.
    *
    * @param processDate the process date of this refund recon log
    */
    @Override
    public void setProcessDate(java.util.Date processDate) {
        _refundReconLog.setProcessDate(processDate);
    }

    /**
    * Returns the refund amount of this refund recon log.
    *
    * @return the refund amount of this refund recon log
    */
    @Override
    public double getRefundAmount() {
        return _refundReconLog.getRefundAmount();
    }

    /**
    * Sets the refund amount of this refund recon log.
    *
    * @param refundAmount the refund amount of this refund recon log
    */
    @Override
    public void setRefundAmount(double refundAmount) {
        _refundReconLog.setRefundAmount(refundAmount);
    }

    /**
    * Returns the refund status code of this refund recon log.
    *
    * @return the refund status code of this refund recon log
    */
    @Override
    public java.lang.String getRefundStatusCode() {
        return _refundReconLog.getRefundStatusCode();
    }

    /**
    * Sets the refund status code of this refund recon log.
    *
    * @param refundStatusCode the refund status code of this refund recon log
    */
    @Override
    public void setRefundStatusCode(java.lang.String refundStatusCode) {
        _refundReconLog.setRefundStatusCode(refundStatusCode);
    }

    @Override
    public boolean isNew() {
        return _refundReconLog.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _refundReconLog.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _refundReconLog.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _refundReconLog.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _refundReconLog.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _refundReconLog.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _refundReconLog.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _refundReconLog.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _refundReconLog.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _refundReconLog.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _refundReconLog.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RefundReconLogWrapper((RefundReconLog) _refundReconLog.clone());
    }

    @Override
    public int compareTo(RefundReconLog refundReconLog) {
        return _refundReconLog.compareTo(refundReconLog);
    }

    @Override
    public int hashCode() {
        return _refundReconLog.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<RefundReconLog> toCacheModel() {
        return _refundReconLog.toCacheModel();
    }

    @Override
    public RefundReconLog toEscapedModel() {
        return new RefundReconLogWrapper(_refundReconLog.toEscapedModel());
    }

    @Override
    public RefundReconLog toUnescapedModel() {
        return new RefundReconLogWrapper(_refundReconLog.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _refundReconLog.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _refundReconLog.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _refundReconLog.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RefundReconLogWrapper)) {
            return false;
        }

        RefundReconLogWrapper refundReconLogWrapper = (RefundReconLogWrapper) obj;

        if (Validator.equals(_refundReconLog,
                    refundReconLogWrapper._refundReconLog)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RefundReconLog getWrappedRefundReconLog() {
        return _refundReconLog;
    }

    @Override
    public RefundReconLog getWrappedModel() {
        return _refundReconLog;
    }

    @Override
    public void resetOriginalValues() {
        _refundReconLog.resetOriginalValues();
    }
}
