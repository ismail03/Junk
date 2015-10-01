package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link InRechargeHistory}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see InRechargeHistory
 * @generated
 */
public class InRechargeHistoryWrapper implements InRechargeHistory,
    ModelWrapper<InRechargeHistory> {
    private InRechargeHistory _inRechargeHistory;

    public InRechargeHistoryWrapper(InRechargeHistory inRechargeHistory) {
        _inRechargeHistory = inRechargeHistory;
    }

    @Override
    public Class<?> getModelClass() {
        return InRechargeHistory.class;
    }

    @Override
    public String getModelClassName() {
        return InRechargeHistory.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("msisdn", getMsisdn());
        attributes.put("transactionId", getTransactionId());
        attributes.put("cardGroup", getCardGroup());
        attributes.put("serviceClass", getServiceClass());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String msisdn = (String) attributes.get("msisdn");

        if (msisdn != null) {
            setMsisdn(msisdn);
        }

        String transactionId = (String) attributes.get("transactionId");

        if (transactionId != null) {
            setTransactionId(transactionId);
        }

        String cardGroup = (String) attributes.get("cardGroup");

        if (cardGroup != null) {
            setCardGroup(cardGroup);
        }

        String serviceClass = (String) attributes.get("serviceClass");

        if (serviceClass != null) {
            setServiceClass(serviceClass);
        }
    }

    /**
    * Returns the primary key of this in recharge history.
    *
    * @return the primary key of this in recharge history
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _inRechargeHistory.getPrimaryKey();
    }

    /**
    * Sets the primary key of this in recharge history.
    *
    * @param primaryKey the primary key of this in recharge history
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _inRechargeHistory.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the msisdn of this in recharge history.
    *
    * @return the msisdn of this in recharge history
    */
    @Override
    public java.lang.String getMsisdn() {
        return _inRechargeHistory.getMsisdn();
    }

    /**
    * Sets the msisdn of this in recharge history.
    *
    * @param msisdn the msisdn of this in recharge history
    */
    @Override
    public void setMsisdn(java.lang.String msisdn) {
        _inRechargeHistory.setMsisdn(msisdn);
    }

    /**
    * Returns the transaction ID of this in recharge history.
    *
    * @return the transaction ID of this in recharge history
    */
    @Override
    public java.lang.String getTransactionId() {
        return _inRechargeHistory.getTransactionId();
    }

    /**
    * Sets the transaction ID of this in recharge history.
    *
    * @param transactionId the transaction ID of this in recharge history
    */
    @Override
    public void setTransactionId(java.lang.String transactionId) {
        _inRechargeHistory.setTransactionId(transactionId);
    }

    /**
    * Returns the card group of this in recharge history.
    *
    * @return the card group of this in recharge history
    */
    @Override
    public java.lang.String getCardGroup() {
        return _inRechargeHistory.getCardGroup();
    }

    /**
    * Sets the card group of this in recharge history.
    *
    * @param cardGroup the card group of this in recharge history
    */
    @Override
    public void setCardGroup(java.lang.String cardGroup) {
        _inRechargeHistory.setCardGroup(cardGroup);
    }

    /**
    * Returns the service class of this in recharge history.
    *
    * @return the service class of this in recharge history
    */
    @Override
    public java.lang.String getServiceClass() {
        return _inRechargeHistory.getServiceClass();
    }

    /**
    * Sets the service class of this in recharge history.
    *
    * @param serviceClass the service class of this in recharge history
    */
    @Override
    public void setServiceClass(java.lang.String serviceClass) {
        _inRechargeHistory.setServiceClass(serviceClass);
    }

    @Override
    public boolean isNew() {
        return _inRechargeHistory.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _inRechargeHistory.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _inRechargeHistory.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _inRechargeHistory.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _inRechargeHistory.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _inRechargeHistory.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _inRechargeHistory.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _inRechargeHistory.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _inRechargeHistory.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _inRechargeHistory.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _inRechargeHistory.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new InRechargeHistoryWrapper((InRechargeHistory) _inRechargeHistory.clone());
    }

    @Override
    public int compareTo(InRechargeHistory inRechargeHistory) {
        return _inRechargeHistory.compareTo(inRechargeHistory);
    }

    @Override
    public int hashCode() {
        return _inRechargeHistory.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<InRechargeHistory> toCacheModel() {
        return _inRechargeHistory.toCacheModel();
    }

    @Override
    public InRechargeHistory toEscapedModel() {
        return new InRechargeHistoryWrapper(_inRechargeHistory.toEscapedModel());
    }

    @Override
    public InRechargeHistory toUnescapedModel() {
        return new InRechargeHistoryWrapper(_inRechargeHistory.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _inRechargeHistory.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _inRechargeHistory.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _inRechargeHistory.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof InRechargeHistoryWrapper)) {
            return false;
        }

        InRechargeHistoryWrapper inRechargeHistoryWrapper = (InRechargeHistoryWrapper) obj;

        if (Validator.equals(_inRechargeHistory,
                    inRechargeHistoryWrapper._inRechargeHistory)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public InRechargeHistory getWrappedInRechargeHistory() {
        return _inRechargeHistory;
    }

    @Override
    public InRechargeHistory getWrappedModel() {
        return _inRechargeHistory;
    }

    @Override
    public void resetOriginalValues() {
        _inRechargeHistory.resetOriginalValues();
    }
}
