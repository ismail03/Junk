package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BusinessSrv}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BusinessSrv
 * @generated
 */
public class BusinessSrvWrapper implements BusinessSrv,
    ModelWrapper<BusinessSrv> {
    private BusinessSrv _businessSrv;

    public BusinessSrvWrapper(BusinessSrv businessSrv) {
        _businessSrv = businessSrv;
    }

    @Override
    public Class<?> getModelClass() {
        return BusinessSrv.class;
    }

    @Override
    public String getModelClassName() {
        return BusinessSrv.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("serviceId", getServiceId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("refMask", getRefMask());
        attributes.put("serviceType", getServiceType());
        attributes.put("serviceNameEn", getServiceNameEn());
        attributes.put("serviceNameAr", getServiceNameAr());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Date lastUpdateTimestamp = (Date) attributes.get("lastUpdateTimestamp");

        if (lastUpdateTimestamp != null) {
            setLastUpdateTimestamp(lastUpdateTimestamp);
        }

        String lastUpdateUserid = (String) attributes.get("lastUpdateUserid");

        if (lastUpdateUserid != null) {
            setLastUpdateUserid(lastUpdateUserid);
        }

        String lastUpdateUsername = (String) attributes.get(
                "lastUpdateUsername");

        if (lastUpdateUsername != null) {
            setLastUpdateUsername(lastUpdateUsername);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
        }

        String refMask = (String) attributes.get("refMask");

        if (refMask != null) {
            setRefMask(refMask);
        }

        String serviceType = (String) attributes.get("serviceType");

        if (serviceType != null) {
            setServiceType(serviceType);
        }

        String serviceNameEn = (String) attributes.get("serviceNameEn");

        if (serviceNameEn != null) {
            setServiceNameEn(serviceNameEn);
        }

        String serviceNameAr = (String) attributes.get("serviceNameAr");

        if (serviceNameAr != null) {
            setServiceNameAr(serviceNameAr);
        }
    }

    /**
    * Returns the primary key of this business srv.
    *
    * @return the primary key of this business srv
    */
    @Override
    public long getPrimaryKey() {
        return _businessSrv.getPrimaryKey();
    }

    /**
    * Sets the primary key of this business srv.
    *
    * @param primaryKey the primary key of this business srv
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _businessSrv.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the service ID of this business srv.
    *
    * @return the service ID of this business srv
    */
    @Override
    public long getServiceId() {
        return _businessSrv.getServiceId();
    }

    /**
    * Sets the service ID of this business srv.
    *
    * @param serviceId the service ID of this business srv
    */
    @Override
    public void setServiceId(long serviceId) {
        _businessSrv.setServiceId(serviceId);
    }

    /**
    * Returns the last update timestamp of this business srv.
    *
    * @return the last update timestamp of this business srv
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _businessSrv.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this business srv.
    *
    * @param lastUpdateTimestamp the last update timestamp of this business srv
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _businessSrv.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this business srv.
    *
    * @return the last update userid of this business srv
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _businessSrv.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this business srv.
    *
    * @param lastUpdateUserid the last update userid of this business srv
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _businessSrv.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this business srv.
    *
    * @return the last update username of this business srv
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _businessSrv.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this business srv.
    *
    * @param lastUpdateUsername the last update username of this business srv
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _businessSrv.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the status of this business srv.
    *
    * @return the status of this business srv
    */
    @Override
    public java.lang.String getStatus() {
        return _businessSrv.getStatus();
    }

    /**
    * Sets the status of this business srv.
    *
    * @param status the status of this business srv
    */
    @Override
    public void setStatus(java.lang.String status) {
        _businessSrv.setStatus(status);
    }

    /**
    * Returns the effective timestamp of this business srv.
    *
    * @return the effective timestamp of this business srv
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _businessSrv.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this business srv.
    *
    * @param effectiveTimestamp the effective timestamp of this business srv
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _businessSrv.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the ref mask of this business srv.
    *
    * @return the ref mask of this business srv
    */
    @Override
    public java.lang.String getRefMask() {
        return _businessSrv.getRefMask();
    }

    /**
    * Sets the ref mask of this business srv.
    *
    * @param refMask the ref mask of this business srv
    */
    @Override
    public void setRefMask(java.lang.String refMask) {
        _businessSrv.setRefMask(refMask);
    }

    /**
    * Returns the service type of this business srv.
    *
    * @return the service type of this business srv
    */
    @Override
    public java.lang.String getServiceType() {
        return _businessSrv.getServiceType();
    }

    /**
    * Sets the service type of this business srv.
    *
    * @param serviceType the service type of this business srv
    */
    @Override
    public void setServiceType(java.lang.String serviceType) {
        _businessSrv.setServiceType(serviceType);
    }

    /**
    * Returns the service name en of this business srv.
    *
    * @return the service name en of this business srv
    */
    @Override
    public java.lang.String getServiceNameEn() {
        return _businessSrv.getServiceNameEn();
    }

    /**
    * Sets the service name en of this business srv.
    *
    * @param serviceNameEn the service name en of this business srv
    */
    @Override
    public void setServiceNameEn(java.lang.String serviceNameEn) {
        _businessSrv.setServiceNameEn(serviceNameEn);
    }

    /**
    * Returns the service name ar of this business srv.
    *
    * @return the service name ar of this business srv
    */
    @Override
    public java.lang.String getServiceNameAr() {
        return _businessSrv.getServiceNameAr();
    }

    /**
    * Sets the service name ar of this business srv.
    *
    * @param serviceNameAr the service name ar of this business srv
    */
    @Override
    public void setServiceNameAr(java.lang.String serviceNameAr) {
        _businessSrv.setServiceNameAr(serviceNameAr);
    }

    @Override
    public boolean isNew() {
        return _businessSrv.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _businessSrv.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _businessSrv.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _businessSrv.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _businessSrv.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _businessSrv.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _businessSrv.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _businessSrv.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _businessSrv.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _businessSrv.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _businessSrv.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BusinessSrvWrapper((BusinessSrv) _businessSrv.clone());
    }

    @Override
    public int compareTo(BusinessSrv businessSrv) {
        return _businessSrv.compareTo(businessSrv);
    }

    @Override
    public int hashCode() {
        return _businessSrv.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<BusinessSrv> toCacheModel() {
        return _businessSrv.toCacheModel();
    }

    @Override
    public BusinessSrv toEscapedModel() {
        return new BusinessSrvWrapper(_businessSrv.toEscapedModel());
    }

    @Override
    public BusinessSrv toUnescapedModel() {
        return new BusinessSrvWrapper(_businessSrv.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _businessSrv.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _businessSrv.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _businessSrv.persist();
    }

    @Override
    public java.lang.String getName(java.util.Locale locale) {
        return _businessSrv.getName(locale);
    }

    @Override
    public boolean isEpayAccessControlPresent() {
        return _businessSrv.isEpayAccessControlPresent();
    }

    @Override
    public void setEpayAccessControlPresent(boolean isEpayAccessControlPresent) {
        _businessSrv.setEpayAccessControlPresent(isEpayAccessControlPresent);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BusinessSrvWrapper)) {
            return false;
        }

        BusinessSrvWrapper businessSrvWrapper = (BusinessSrvWrapper) obj;

        if (Validator.equals(_businessSrv, businessSrvWrapper._businessSrv)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BusinessSrv getWrappedBusinessSrv() {
        return _businessSrv;
    }

    @Override
    public BusinessSrv getWrappedModel() {
        return _businessSrv;
    }

    @Override
    public void resetOriginalValues() {
        _businessSrv.resetOriginalValues();
    }
}
