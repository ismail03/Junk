package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RefundLog}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see RefundLog
 * @generated
 */
public class RefundLogWrapper implements RefundLog, ModelWrapper<RefundLog> {
    private RefundLog _refundLog;

    public RefundLogWrapper(RefundLog refundLog) {
        _refundLog = refundLog;
    }

    @Override
    public Class<?> getModelClass() {
        return RefundLog.class;
    }

    @Override
    public String getModelClassName() {
        return RefundLog.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("refundId", getRefundId());
        attributes.put("epayTransId", getEpayTransId());
        attributes.put("amount", getAmount());
        attributes.put("submissionDate", getSubmissionDate());
        attributes.put("approvalDate", getApprovalDate());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String refundId = (String) attributes.get("refundId");

        if (refundId != null) {
            setRefundId(refundId);
        }

        String epayTransId = (String) attributes.get("epayTransId");

        if (epayTransId != null) {
            setEpayTransId(epayTransId);
        }

        Double amount = (Double) attributes.get("amount");

        if (amount != null) {
            setAmount(amount);
        }

        Date submissionDate = (Date) attributes.get("submissionDate");

        if (submissionDate != null) {
            setSubmissionDate(submissionDate);
        }

        Date approvalDate = (Date) attributes.get("approvalDate");

        if (approvalDate != null) {
            setApprovalDate(approvalDate);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    /**
    * Returns the primary key of this refund log.
    *
    * @return the primary key of this refund log
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _refundLog.getPrimaryKey();
    }

    /**
    * Sets the primary key of this refund log.
    *
    * @param primaryKey the primary key of this refund log
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _refundLog.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the refund ID of this refund log.
    *
    * @return the refund ID of this refund log
    */
    @Override
    public java.lang.String getRefundId() {
        return _refundLog.getRefundId();
    }

    /**
    * Sets the refund ID of this refund log.
    *
    * @param refundId the refund ID of this refund log
    */
    @Override
    public void setRefundId(java.lang.String refundId) {
        _refundLog.setRefundId(refundId);
    }

    /**
    * Returns the epay trans ID of this refund log.
    *
    * @return the epay trans ID of this refund log
    */
    @Override
    public java.lang.String getEpayTransId() {
        return _refundLog.getEpayTransId();
    }

    /**
    * Sets the epay trans ID of this refund log.
    *
    * @param epayTransId the epay trans ID of this refund log
    */
    @Override
    public void setEpayTransId(java.lang.String epayTransId) {
        _refundLog.setEpayTransId(epayTransId);
    }

    /**
    * Returns the amount of this refund log.
    *
    * @return the amount of this refund log
    */
    @Override
    public double getAmount() {
        return _refundLog.getAmount();
    }

    /**
    * Sets the amount of this refund log.
    *
    * @param amount the amount of this refund log
    */
    @Override
    public void setAmount(double amount) {
        _refundLog.setAmount(amount);
    }

    /**
    * Returns the submission date of this refund log.
    *
    * @return the submission date of this refund log
    */
    @Override
    public java.util.Date getSubmissionDate() {
        return _refundLog.getSubmissionDate();
    }

    /**
    * Sets the submission date of this refund log.
    *
    * @param submissionDate the submission date of this refund log
    */
    @Override
    public void setSubmissionDate(java.util.Date submissionDate) {
        _refundLog.setSubmissionDate(submissionDate);
    }

    /**
    * Returns the approval date of this refund log.
    *
    * @return the approval date of this refund log
    */
    @Override
    public java.util.Date getApprovalDate() {
        return _refundLog.getApprovalDate();
    }

    /**
    * Sets the approval date of this refund log.
    *
    * @param approvalDate the approval date of this refund log
    */
    @Override
    public void setApprovalDate(java.util.Date approvalDate) {
        _refundLog.setApprovalDate(approvalDate);
    }

    /**
    * Returns the status of this refund log.
    *
    * @return the status of this refund log
    */
    @Override
    public java.lang.String getStatus() {
        return _refundLog.getStatus();
    }

    /**
    * Sets the status of this refund log.
    *
    * @param status the status of this refund log
    */
    @Override
    public void setStatus(java.lang.String status) {
        _refundLog.setStatus(status);
    }

    @Override
    public boolean isNew() {
        return _refundLog.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _refundLog.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _refundLog.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _refundLog.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _refundLog.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _refundLog.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _refundLog.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _refundLog.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _refundLog.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _refundLog.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _refundLog.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RefundLogWrapper((RefundLog) _refundLog.clone());
    }

    @Override
    public int compareTo(RefundLog refundLog) {
        return _refundLog.compareTo(refundLog);
    }

    @Override
    public int hashCode() {
        return _refundLog.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<RefundLog> toCacheModel() {
        return _refundLog.toCacheModel();
    }

    @Override
    public RefundLog toEscapedModel() {
        return new RefundLogWrapper(_refundLog.toEscapedModel());
    }

    @Override
    public RefundLog toUnescapedModel() {
        return new RefundLogWrapper(_refundLog.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _refundLog.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _refundLog.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _refundLog.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RefundLogWrapper)) {
            return false;
        }

        RefundLogWrapper refundLogWrapper = (RefundLogWrapper) obj;

        if (Validator.equals(_refundLog, refundLogWrapper._refundLog)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RefundLog getWrappedRefundLog() {
        return _refundLog;
    }

    @Override
    public RefundLog getWrappedModel() {
        return _refundLog;
    }

    @Override
    public void resetOriginalValues() {
        _refundLog.resetOriginalValues();
    }
}
