package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SrvTypeSrvsMap}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypeSrvsMap
 * @generated
 */
public class SrvTypeSrvsMapWrapper implements SrvTypeSrvsMap,
    ModelWrapper<SrvTypeSrvsMap> {
    private SrvTypeSrvsMap _srvTypeSrvsMap;

    public SrvTypeSrvsMapWrapper(SrvTypeSrvsMap srvTypeSrvsMap) {
        _srvTypeSrvsMap = srvTypeSrvsMap;
    }

    @Override
    public Class<?> getModelClass() {
        return SrvTypeSrvsMap.class;
    }

    @Override
    public String getModelClassName() {
        return SrvTypeSrvsMap.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("serviceId", getServiceId());
        attributes.put("serviceTypeId", getServiceTypeId());

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

        Long serviceTypeId = (Long) attributes.get("serviceTypeId");

        if (serviceTypeId != null) {
            setServiceTypeId(serviceTypeId);
        }
    }

    /**
    * Returns the primary key of this srv type srvs map.
    *
    * @return the primary key of this srv type srvs map
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _srvTypeSrvsMap.getPrimaryKey();
    }

    /**
    * Sets the primary key of this srv type srvs map.
    *
    * @param primaryKey the primary key of this srv type srvs map
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _srvTypeSrvsMap.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this srv type srvs map.
    *
    * @return the ID of this srv type srvs map
    */
    @Override
    public java.lang.String getId() {
        return _srvTypeSrvsMap.getId();
    }

    /**
    * Sets the ID of this srv type srvs map.
    *
    * @param id the ID of this srv type srvs map
    */
    @Override
    public void setId(java.lang.String id) {
        _srvTypeSrvsMap.setId(id);
    }

    /**
    * Returns the service ID of this srv type srvs map.
    *
    * @return the service ID of this srv type srvs map
    */
    @Override
    public long getServiceId() {
        return _srvTypeSrvsMap.getServiceId();
    }

    /**
    * Sets the service ID of this srv type srvs map.
    *
    * @param serviceId the service ID of this srv type srvs map
    */
    @Override
    public void setServiceId(long serviceId) {
        _srvTypeSrvsMap.setServiceId(serviceId);
    }

    /**
    * Returns the service type ID of this srv type srvs map.
    *
    * @return the service type ID of this srv type srvs map
    */
    @Override
    public long getServiceTypeId() {
        return _srvTypeSrvsMap.getServiceTypeId();
    }

    /**
    * Sets the service type ID of this srv type srvs map.
    *
    * @param serviceTypeId the service type ID of this srv type srvs map
    */
    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _srvTypeSrvsMap.setServiceTypeId(serviceTypeId);
    }

    @Override
    public boolean isNew() {
        return _srvTypeSrvsMap.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _srvTypeSrvsMap.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _srvTypeSrvsMap.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _srvTypeSrvsMap.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _srvTypeSrvsMap.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _srvTypeSrvsMap.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _srvTypeSrvsMap.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _srvTypeSrvsMap.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _srvTypeSrvsMap.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _srvTypeSrvsMap.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _srvTypeSrvsMap.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SrvTypeSrvsMapWrapper((SrvTypeSrvsMap) _srvTypeSrvsMap.clone());
    }

    @Override
    public int compareTo(SrvTypeSrvsMap srvTypeSrvsMap) {
        return _srvTypeSrvsMap.compareTo(srvTypeSrvsMap);
    }

    @Override
    public int hashCode() {
        return _srvTypeSrvsMap.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SrvTypeSrvsMap> toCacheModel() {
        return _srvTypeSrvsMap.toCacheModel();
    }

    @Override
    public SrvTypeSrvsMap toEscapedModel() {
        return new SrvTypeSrvsMapWrapper(_srvTypeSrvsMap.toEscapedModel());
    }

    @Override
    public SrvTypeSrvsMap toUnescapedModel() {
        return new SrvTypeSrvsMapWrapper(_srvTypeSrvsMap.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _srvTypeSrvsMap.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _srvTypeSrvsMap.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _srvTypeSrvsMap.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SrvTypeSrvsMapWrapper)) {
            return false;
        }

        SrvTypeSrvsMapWrapper srvTypeSrvsMapWrapper = (SrvTypeSrvsMapWrapper) obj;

        if (Validator.equals(_srvTypeSrvsMap,
                    srvTypeSrvsMapWrapper._srvTypeSrvsMap)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SrvTypeSrvsMap getWrappedSrvTypeSrvsMap() {
        return _srvTypeSrvsMap;
    }

    @Override
    public SrvTypeSrvsMap getWrappedModel() {
        return _srvTypeSrvsMap;
    }

    @Override
    public void resetOriginalValues() {
        _srvTypeSrvsMap.resetOriginalValues();
    }
}
