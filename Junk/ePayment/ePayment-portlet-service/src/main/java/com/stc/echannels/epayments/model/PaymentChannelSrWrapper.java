package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentChannelSr}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSr
 * @generated
 */
public class PaymentChannelSrWrapper implements PaymentChannelSr,
    ModelWrapper<PaymentChannelSr> {
    private PaymentChannelSr _paymentChannelSr;

    public PaymentChannelSrWrapper(PaymentChannelSr paymentChannelSr) {
        _paymentChannelSr = paymentChannelSr;
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentChannelSr.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentChannelSr.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("channelid", getChannelid());
        attributes.put("serviceid", getServiceid());
        attributes.put("id", getId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long channelid = (Long) attributes.get("channelid");

        if (channelid != null) {
            setChannelid(channelid);
        }

        Long serviceid = (Long) attributes.get("serviceid");

        if (serviceid != null) {
            setServiceid(serviceid);
        }

        String id = (String) attributes.get("id");

        if (id != null) {
            setId(id);
        }
    }

    /**
    * Returns the primary key of this payment channel sr.
    *
    * @return the primary key of this payment channel sr
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _paymentChannelSr.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment channel sr.
    *
    * @param primaryKey the primary key of this payment channel sr
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _paymentChannelSr.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the channelid of this payment channel sr.
    *
    * @return the channelid of this payment channel sr
    */
    @Override
    public long getChannelid() {
        return _paymentChannelSr.getChannelid();
    }

    /**
    * Sets the channelid of this payment channel sr.
    *
    * @param channelid the channelid of this payment channel sr
    */
    @Override
    public void setChannelid(long channelid) {
        _paymentChannelSr.setChannelid(channelid);
    }

    /**
    * Returns the serviceid of this payment channel sr.
    *
    * @return the serviceid of this payment channel sr
    */
    @Override
    public long getServiceid() {
        return _paymentChannelSr.getServiceid();
    }

    /**
    * Sets the serviceid of this payment channel sr.
    *
    * @param serviceid the serviceid of this payment channel sr
    */
    @Override
    public void setServiceid(long serviceid) {
        _paymentChannelSr.setServiceid(serviceid);
    }

    /**
    * Returns the ID of this payment channel sr.
    *
    * @return the ID of this payment channel sr
    */
    @Override
    public java.lang.String getId() {
        return _paymentChannelSr.getId();
    }

    /**
    * Sets the ID of this payment channel sr.
    *
    * @param id the ID of this payment channel sr
    */
    @Override
    public void setId(java.lang.String id) {
        _paymentChannelSr.setId(id);
    }

    @Override
    public boolean isNew() {
        return _paymentChannelSr.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentChannelSr.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentChannelSr.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentChannelSr.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentChannelSr.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentChannelSr.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentChannelSr.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentChannelSr.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentChannelSr.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentChannelSr.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentChannelSr.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentChannelSrWrapper((PaymentChannelSr) _paymentChannelSr.clone());
    }

    @Override
    public int compareTo(PaymentChannelSr paymentChannelSr) {
        return _paymentChannelSr.compareTo(paymentChannelSr);
    }

    @Override
    public int hashCode() {
        return _paymentChannelSr.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentChannelSr> toCacheModel() {
        return _paymentChannelSr.toCacheModel();
    }

    @Override
    public PaymentChannelSr toEscapedModel() {
        return new PaymentChannelSrWrapper(_paymentChannelSr.toEscapedModel());
    }

    @Override
    public PaymentChannelSr toUnescapedModel() {
        return new PaymentChannelSrWrapper(_paymentChannelSr.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentChannelSr.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentChannelSr.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentChannelSr.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentChannelSrWrapper)) {
            return false;
        }

        PaymentChannelSrWrapper paymentChannelSrWrapper = (PaymentChannelSrWrapper) obj;

        if (Validator.equals(_paymentChannelSr,
                    paymentChannelSrWrapper._paymentChannelSr)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentChannelSr getWrappedPaymentChannelSr() {
        return _paymentChannelSr;
    }

    @Override
    public PaymentChannelSr getWrappedModel() {
        return _paymentChannelSr;
    }

    @Override
    public void resetOriginalValues() {
        _paymentChannelSr.resetOriginalValues();
    }
}
