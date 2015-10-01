package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PaymentMethodSrvsMap}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentMethodSrvsMap
 * @generated
 */
public class PaymentMethodSrvsMapWrapper implements PaymentMethodSrvsMap,
    ModelWrapper<PaymentMethodSrvsMap> {
    private PaymentMethodSrvsMap _paymentMethodSrvsMap;

    public PaymentMethodSrvsMapWrapper(
        PaymentMethodSrvsMap paymentMethodSrvsMap) {
        _paymentMethodSrvsMap = paymentMethodSrvsMap;
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentMethodSrvsMap.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentMethodSrvsMap.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("serviceId", getServiceId());
        attributes.put("paymentMethodId", getPaymentMethodId());

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

        Long paymentMethodId = (Long) attributes.get("paymentMethodId");

        if (paymentMethodId != null) {
            setPaymentMethodId(paymentMethodId);
        }
    }

    /**
    * Returns the primary key of this payment method srvs map.
    *
    * @return the primary key of this payment method srvs map
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _paymentMethodSrvsMap.getPrimaryKey();
    }

    /**
    * Sets the primary key of this payment method srvs map.
    *
    * @param primaryKey the primary key of this payment method srvs map
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _paymentMethodSrvsMap.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this payment method srvs map.
    *
    * @return the ID of this payment method srvs map
    */
    @Override
    public java.lang.String getId() {
        return _paymentMethodSrvsMap.getId();
    }

    /**
    * Sets the ID of this payment method srvs map.
    *
    * @param id the ID of this payment method srvs map
    */
    @Override
    public void setId(java.lang.String id) {
        _paymentMethodSrvsMap.setId(id);
    }

    /**
    * Returns the service ID of this payment method srvs map.
    *
    * @return the service ID of this payment method srvs map
    */
    @Override
    public long getServiceId() {
        return _paymentMethodSrvsMap.getServiceId();
    }

    /**
    * Sets the service ID of this payment method srvs map.
    *
    * @param serviceId the service ID of this payment method srvs map
    */
    @Override
    public void setServiceId(long serviceId) {
        _paymentMethodSrvsMap.setServiceId(serviceId);
    }

    /**
    * Returns the payment method ID of this payment method srvs map.
    *
    * @return the payment method ID of this payment method srvs map
    */
    @Override
    public long getPaymentMethodId() {
        return _paymentMethodSrvsMap.getPaymentMethodId();
    }

    /**
    * Sets the payment method ID of this payment method srvs map.
    *
    * @param paymentMethodId the payment method ID of this payment method srvs map
    */
    @Override
    public void setPaymentMethodId(long paymentMethodId) {
        _paymentMethodSrvsMap.setPaymentMethodId(paymentMethodId);
    }

    @Override
    public boolean isNew() {
        return _paymentMethodSrvsMap.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paymentMethodSrvsMap.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paymentMethodSrvsMap.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paymentMethodSrvsMap.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paymentMethodSrvsMap.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paymentMethodSrvsMap.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paymentMethodSrvsMap.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paymentMethodSrvsMap.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paymentMethodSrvsMap.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paymentMethodSrvsMap.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paymentMethodSrvsMap.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaymentMethodSrvsMapWrapper((PaymentMethodSrvsMap) _paymentMethodSrvsMap.clone());
    }

    @Override
    public int compareTo(PaymentMethodSrvsMap paymentMethodSrvsMap) {
        return _paymentMethodSrvsMap.compareTo(paymentMethodSrvsMap);
    }

    @Override
    public int hashCode() {
        return _paymentMethodSrvsMap.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<PaymentMethodSrvsMap> toCacheModel() {
        return _paymentMethodSrvsMap.toCacheModel();
    }

    @Override
    public PaymentMethodSrvsMap toEscapedModel() {
        return new PaymentMethodSrvsMapWrapper(_paymentMethodSrvsMap.toEscapedModel());
    }

    @Override
    public PaymentMethodSrvsMap toUnescapedModel() {
        return new PaymentMethodSrvsMapWrapper(_paymentMethodSrvsMap.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paymentMethodSrvsMap.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paymentMethodSrvsMap.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paymentMethodSrvsMap.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentMethodSrvsMapWrapper)) {
            return false;
        }

        PaymentMethodSrvsMapWrapper paymentMethodSrvsMapWrapper = (PaymentMethodSrvsMapWrapper) obj;

        if (Validator.equals(_paymentMethodSrvsMap,
                    paymentMethodSrvsMapWrapper._paymentMethodSrvsMap)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public PaymentMethodSrvsMap getWrappedPaymentMethodSrvsMap() {
        return _paymentMethodSrvsMap;
    }

    @Override
    public PaymentMethodSrvsMap getWrappedModel() {
        return _paymentMethodSrvsMap;
    }

    @Override
    public void resetOriginalValues() {
        _paymentMethodSrvsMap.resetOriginalValues();
    }
}
