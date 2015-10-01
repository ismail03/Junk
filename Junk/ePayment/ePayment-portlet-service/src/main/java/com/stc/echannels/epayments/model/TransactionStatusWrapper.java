package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TransactionStatus}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see TransactionStatus
 * @generated
 */
public class TransactionStatusWrapper implements TransactionStatus,
    ModelWrapper<TransactionStatus> {
    private TransactionStatus _transactionStatus;

    public TransactionStatusWrapper(TransactionStatus transactionStatus) {
        _transactionStatus = transactionStatus;
    }

    @Override
    public Class<?> getModelClass() {
        return TransactionStatus.class;
    }

    @Override
    public String getModelClassName() {
        return TransactionStatus.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("description", getDescription());
        attributes.put("descriptiveNameEn", getDescriptiveNameEn());
        attributes.put("descriptiveNameAr", getDescriptiveNameAr());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String descriptiveNameEn = (String) attributes.get("descriptiveNameEn");

        if (descriptiveNameEn != null) {
            setDescriptiveNameEn(descriptiveNameEn);
        }

        String descriptiveNameAr = (String) attributes.get("descriptiveNameAr");

        if (descriptiveNameAr != null) {
            setDescriptiveNameAr(descriptiveNameAr);
        }
    }

    /**
    * Returns the primary key of this transaction status.
    *
    * @return the primary key of this transaction status
    */
    @Override
    public long getPrimaryKey() {
        return _transactionStatus.getPrimaryKey();
    }

    /**
    * Sets the primary key of this transaction status.
    *
    * @param primaryKey the primary key of this transaction status
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _transactionStatus.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this transaction status.
    *
    * @return the ID of this transaction status
    */
    @Override
    public long getId() {
        return _transactionStatus.getId();
    }

    /**
    * Sets the ID of this transaction status.
    *
    * @param id the ID of this transaction status
    */
    @Override
    public void setId(long id) {
        _transactionStatus.setId(id);
    }

    /**
    * Returns the description of this transaction status.
    *
    * @return the description of this transaction status
    */
    @Override
    public java.lang.String getDescription() {
        return _transactionStatus.getDescription();
    }

    /**
    * Sets the description of this transaction status.
    *
    * @param description the description of this transaction status
    */
    @Override
    public void setDescription(java.lang.String description) {
        _transactionStatus.setDescription(description);
    }

    /**
    * Returns the descriptive name en of this transaction status.
    *
    * @return the descriptive name en of this transaction status
    */
    @Override
    public java.lang.String getDescriptiveNameEn() {
        return _transactionStatus.getDescriptiveNameEn();
    }

    /**
    * Sets the descriptive name en of this transaction status.
    *
    * @param descriptiveNameEn the descriptive name en of this transaction status
    */
    @Override
    public void setDescriptiveNameEn(java.lang.String descriptiveNameEn) {
        _transactionStatus.setDescriptiveNameEn(descriptiveNameEn);
    }

    /**
    * Returns the descriptive name ar of this transaction status.
    *
    * @return the descriptive name ar of this transaction status
    */
    @Override
    public java.lang.String getDescriptiveNameAr() {
        return _transactionStatus.getDescriptiveNameAr();
    }

    /**
    * Sets the descriptive name ar of this transaction status.
    *
    * @param descriptiveNameAr the descriptive name ar of this transaction status
    */
    @Override
    public void setDescriptiveNameAr(java.lang.String descriptiveNameAr) {
        _transactionStatus.setDescriptiveNameAr(descriptiveNameAr);
    }

    @Override
    public boolean isNew() {
        return _transactionStatus.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _transactionStatus.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _transactionStatus.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _transactionStatus.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _transactionStatus.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _transactionStatus.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _transactionStatus.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _transactionStatus.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _transactionStatus.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _transactionStatus.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _transactionStatus.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TransactionStatusWrapper((TransactionStatus) _transactionStatus.clone());
    }

    @Override
    public int compareTo(TransactionStatus transactionStatus) {
        return _transactionStatus.compareTo(transactionStatus);
    }

    @Override
    public int hashCode() {
        return _transactionStatus.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<TransactionStatus> toCacheModel() {
        return _transactionStatus.toCacheModel();
    }

    @Override
    public TransactionStatus toEscapedModel() {
        return new TransactionStatusWrapper(_transactionStatus.toEscapedModel());
    }

    @Override
    public TransactionStatus toUnescapedModel() {
        return new TransactionStatusWrapper(_transactionStatus.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _transactionStatus.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _transactionStatus.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _transactionStatus.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TransactionStatusWrapper)) {
            return false;
        }

        TransactionStatusWrapper transactionStatusWrapper = (TransactionStatusWrapper) obj;

        if (Validator.equals(_transactionStatus,
                    transactionStatusWrapper._transactionStatus)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public TransactionStatus getWrappedTransactionStatus() {
        return _transactionStatus;
    }

    @Override
    public TransactionStatus getWrappedModel() {
        return _transactionStatus;
    }

    @Override
    public void resetOriginalValues() {
        _transactionStatus.resetOriginalValues();
    }
}
