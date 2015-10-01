package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentChannelSrvsMap}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrvsMap
 * @generated
 */
public class PaymentChannelSrvsMapWrapper implements PaymentChannelSrvsMap,
    ModelWrapper<PaymentChannelSrvsMap> {
    private PaymentChannelSrvsMap _paymentChannelSrvsMap;

    public PaymentChannelSrvsMapWrapper(
        PaymentChannelSrvsMap paymentChannelSrvsMap) {
        _paymentChannelSrvsMap = paymentChannelSrvsMap;
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentChannelSrvsMap.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentChannelSrvsMap.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("serviceId", getServiceId());
        attributes.put("channelId", getChannelId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String id = (String) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }
    }

    /**
    * Returns the primary key of this payment channel srvs map.
    *
    * @return the primary key of this payment channel srvs map
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _paymentChannelSrvsMap.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment channel srvs map.
    *
    * @param primaryKey the primary key of this payment channel srvs map
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _paymentChannelSrvsMap.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this payment channel srvs map.
    *
    * @return the ID of this payment channel srvs map
    */
    @Override
    public java.lang.String getId() {
        return _paymentChannelSrvsMap.getId();
    }

    /**
    * Sets the ID of this payment channel srvs map.
    *
    * @param id the ID of this payment channel srvs map
    */
    @Override
    public void setId(java.lang.String id) {
        _paymentChannelSrvsMap.setId(id);
    }

    /**
    * Returns the service ID of this payment channel srvs map.
    *
    * @return the service ID of this payment channel srvs map
    */
    @Override
    public long getServiceId() {
        return _paymentChannelSrvsMap.getServiceId();
    }

    /**
    * Sets the service ID of this payment channel srvs map.
    *
    * @param serviceId the service ID of this payment channel srvs map
    */
    @Override
    public void setServiceId(long serviceId) {
        _paymentChannelSrvsMap.setServiceId(serviceId);
    }

    /**
    * Returns the channel ID of this payment channel srvs map.
    *
    * @return the channel ID of this payment channel srvs map
    */
    @Override
    public long getChannelId() {
        return _paymentChannelSrvsMap.getChannelId();
    }

    /**
    * Sets the channel ID of this payment channel srvs map.
    *
    * @param channelId the channel ID of this payment channel srvs map
    */
    @Override
    public void setChannelId(long channelId) {
        _paymentChannelSrvsMap.setChannelId(channelId);
    }

    @Override
    public boolean isNew() {
        return _paymentChannelSrvsMap.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentChannelSrvsMap.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentChannelSrvsMap.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentChannelSrvsMap.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentChannelSrvsMap.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentChannelSrvsMap.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentChannelSrvsMap.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentChannelSrvsMap.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentChannelSrvsMap.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentChannelSrvsMap.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentChannelSrvsMap.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentChannelSrvsMapWrapper((PaymentChannelSrvsMap) _paymentChannelSrvsMap.clone());
    }

    @Override
    public int compareTo(PaymentChannelSrvsMap paymentChannelSrvsMap) {
        return _paymentChannelSrvsMap.compareTo(paymentChannelSrvsMap);
    }

    @Override
    public int hashCode() {
        return _paymentChannelSrvsMap.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentChannelSrvsMap> toCacheModel() {
        return _paymentChannelSrvsMap.toCacheModel();
    }

    @Override
    public PaymentChannelSrvsMap toEscapedModel() {
        return new PaymentChannelSrvsMapWrapper(_paymentChannelSrvsMap.toEscapedModel());
    }

    @Override
    public PaymentChannelSrvsMap toUnescapedModel() {
        return new PaymentChannelSrvsMapWrapper(_paymentChannelSrvsMap.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentChannelSrvsMap.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentChannelSrvsMap.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentChannelSrvsMap.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentChannelSrvsMapWrapper)) {
            return false;
        }

        PaymentChannelSrvsMapWrapper paymentChannelSrvsMapWrapper = (PaymentChannelSrvsMapWrapper) obj;

        if (Validator.equals(_paymentChannelSrvsMap,
                    paymentChannelSrvsMapWrapper._paymentChannelSrvsMap)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentChannelSrvsMap getWrappedPaymentChannelSrvsMap() {
        return _paymentChannelSrvsMap;
    }

    @Override
    public PaymentChannelSrvsMap getWrappedModel() {
        return _paymentChannelSrvsMap;
    }

    @Override
    public void resetOriginalValues() {
        _paymentChannelSrvsMap.resetOriginalValues();
    }
}
