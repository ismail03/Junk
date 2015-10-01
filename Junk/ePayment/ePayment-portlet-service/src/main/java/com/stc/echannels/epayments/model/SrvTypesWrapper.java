package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SrvTypes}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypes
 * @generated
 */
public class SrvTypesWrapper implements SrvTypes, ModelWrapper<SrvTypes> {
    private SrvTypes _srvTypes;

    public SrvTypesWrapper(SrvTypes srvTypes) {
        _srvTypes = srvTypes;
    }

    @Override
    public Class<?> getModelClass() {
        return SrvTypes.class;
    }

    @Override
    public String getModelClassName() {
        return SrvTypes.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("serviceTypeId", getServiceTypeId());
        attributes.put("serviceTypeName", getServiceTypeName());
        attributes.put("serviceNameEN", getServiceNameEN());
        attributes.put("serviceNameAR", getServiceNameAR());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long serviceTypeId = (Long) attributes.get("serviceTypeId");

        if (serviceTypeId != null) {
            setServiceTypeId(serviceTypeId);
        }

        String serviceTypeName = (String) attributes.get("serviceTypeName");

        if (serviceTypeName != null) {
            setServiceTypeName(serviceTypeName);
        }

        String serviceNameEN = (String) attributes.get("serviceNameEN");

        if (serviceNameEN != null) {
            setServiceNameEN(serviceNameEN);
        }

        String serviceNameAR = (String) attributes.get("serviceNameAR");

        if (serviceNameAR != null) {
            setServiceNameAR(serviceNameAR);
        }
    }

    /**
    * Returns the primary key of this srv types.
    *
    * @return the primary key of this srv types
    */
    @Override
    public long getPrimaryKey() {
        return _srvTypes.getPrimaryKey();
    }

    /**
    * Sets the primary key of this srv types.
    *
    * @param primaryKey the primary key of this srv types
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _srvTypes.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the service type ID of this srv types.
    *
    * @return the service type ID of this srv types
    */
    @Override
    public long getServiceTypeId() {
        return _srvTypes.getServiceTypeId();
    }

    /**
    * Sets the service type ID of this srv types.
    *
    * @param serviceTypeId the service type ID of this srv types
    */
    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _srvTypes.setServiceTypeId(serviceTypeId);
    }

    /**
    * Returns the service type name of this srv types.
    *
    * @return the service type name of this srv types
    */
    @Override
    public java.lang.String getServiceTypeName() {
        return _srvTypes.getServiceTypeName();
    }

    /**
    * Sets the service type name of this srv types.
    *
    * @param serviceTypeName the service type name of this srv types
    */
    @Override
    public void setServiceTypeName(java.lang.String serviceTypeName) {
        _srvTypes.setServiceTypeName(serviceTypeName);
    }

    /**
    * Returns the service name e n of this srv types.
    *
    * @return the service name e n of this srv types
    */
    @Override
    public java.lang.String getServiceNameEN() {
        return _srvTypes.getServiceNameEN();
    }

    /**
    * Sets the service name e n of this srv types.
    *
    * @param serviceNameEN the service name e n of this srv types
    */
    @Override
    public void setServiceNameEN(java.lang.String serviceNameEN) {
        _srvTypes.setServiceNameEN(serviceNameEN);
    }

    /**
    * Returns the service name a r of this srv types.
    *
    * @return the service name a r of this srv types
    */
    @Override
    public java.lang.String getServiceNameAR() {
        return _srvTypes.getServiceNameAR();
    }

    /**
    * Sets the service name a r of this srv types.
    *
    * @param serviceNameAR the service name a r of this srv types
    */
    @Override
    public void setServiceNameAR(java.lang.String serviceNameAR) {
        _srvTypes.setServiceNameAR(serviceNameAR);
    }

    @Override
    public boolean isNew() {
        return _srvTypes.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _srvTypes.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _srvTypes.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _srvTypes.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _srvTypes.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _srvTypes.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _srvTypes.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _srvTypes.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _srvTypes.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _srvTypes.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _srvTypes.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SrvTypesWrapper((SrvTypes) _srvTypes.clone());
    }

    @Override
    public int compareTo(SrvTypes srvTypes) {
        return _srvTypes.compareTo(srvTypes);
    }

    @Override
    public int hashCode() {
        return _srvTypes.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<SrvTypes> toCacheModel() {
        return _srvTypes.toCacheModel();
    }

    @Override
    public SrvTypes toEscapedModel() {
        return new SrvTypesWrapper(_srvTypes.toEscapedModel());
    }

    @Override
    public SrvTypes toUnescapedModel() {
        return new SrvTypesWrapper(_srvTypes.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _srvTypes.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _srvTypes.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _srvTypes.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SrvTypesWrapper)) {
            return false;
        }

        SrvTypesWrapper srvTypesWrapper = (SrvTypesWrapper) obj;

        if (Validator.equals(_srvTypes, srvTypesWrapper._srvTypes)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public SrvTypes getWrappedSrvTypes() {
        return _srvTypes;
    }

    @Override
    public SrvTypes getWrappedModel() {
        return _srvTypes;
    }

    @Override
    public void resetOriginalValues() {
        _srvTypes.resetOriginalValues();
    }
}
