package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NotifParamSrv}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifParamSrv
 * @generated
 */
public class NotifParamSrvWrapper implements NotifParamSrv,
    ModelWrapper<NotifParamSrv> {
    private NotifParamSrv _notifParamSrv;

    public NotifParamSrvWrapper(NotifParamSrv notifParamSrv) {
        _notifParamSrv = notifParamSrv;
    }

    @Override
    public Class<?> getModelClass() {
        return NotifParamSrv.class;
    }

    @Override
    public String getModelClassName() {
        return NotifParamSrv.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("notifParamId", getNotifParamId());
        attributes.put("serviceId", getServiceId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long notifParamId = (Long) attributes.get("notifParamId");

        if (notifParamId != null) {
            setNotifParamId(notifParamId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }
    }

    /**
    * Returns the primary key of this notif param srv.
    *
    * @return the primary key of this notif param srv
    */
    @Override
    public com.stc.echannels.epayments.service.persistence.NotifParamSrvPK getPrimaryKey() {
        return _notifParamSrv.getPrimaryKey();
    }

    /**
    * Sets the primary key of this notif param srv.
    *
    * @param primaryKey the primary key of this notif param srv
    */
    @Override
    public void setPrimaryKey(
        com.stc.echannels.epayments.service.persistence.NotifParamSrvPK primaryKey) {
        _notifParamSrv.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the notif param ID of this notif param srv.
    *
    * @return the notif param ID of this notif param srv
    */
    @Override
    public long getNotifParamId() {
        return _notifParamSrv.getNotifParamId();
    }

    /**
    * Sets the notif param ID of this notif param srv.
    *
    * @param notifParamId the notif param ID of this notif param srv
    */
    @Override
    public void setNotifParamId(long notifParamId) {
        _notifParamSrv.setNotifParamId(notifParamId);
    }

    /**
    * Returns the service ID of this notif param srv.
    *
    * @return the service ID of this notif param srv
    */
    @Override
    public long getServiceId() {
        return _notifParamSrv.getServiceId();
    }

    /**
    * Sets the service ID of this notif param srv.
    *
    * @param serviceId the service ID of this notif param srv
    */
    @Override
    public void setServiceId(long serviceId) {
        _notifParamSrv.setServiceId(serviceId);
    }

    @Override
    public boolean isNew() {
        return _notifParamSrv.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _notifParamSrv.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _notifParamSrv.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _notifParamSrv.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _notifParamSrv.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _notifParamSrv.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _notifParamSrv.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _notifParamSrv.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _notifParamSrv.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _notifParamSrv.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _notifParamSrv.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new NotifParamSrvWrapper((NotifParamSrv) _notifParamSrv.clone());
    }

    @Override
    public int compareTo(NotifParamSrv notifParamSrv) {
        return _notifParamSrv.compareTo(notifParamSrv);
    }

    @Override
    public int hashCode() {
        return _notifParamSrv.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<NotifParamSrv> toCacheModel() {
        return _notifParamSrv.toCacheModel();
    }

    @Override
    public NotifParamSrv toEscapedModel() {
        return new NotifParamSrvWrapper(_notifParamSrv.toEscapedModel());
    }

    @Override
    public NotifParamSrv toUnescapedModel() {
        return new NotifParamSrvWrapper(_notifParamSrv.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _notifParamSrv.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _notifParamSrv.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _notifParamSrv.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NotifParamSrvWrapper)) {
            return false;
        }

        NotifParamSrvWrapper notifParamSrvWrapper = (NotifParamSrvWrapper) obj;

        if (Validator.equals(_notifParamSrv, notifParamSrvWrapper._notifParamSrv)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public NotifParamSrv getWrappedNotifParamSrv() {
        return _notifParamSrv;
    }

    @Override
    public NotifParamSrv getWrappedModel() {
        return _notifParamSrv;
    }

    @Override
    public void resetOriginalValues() {
        _notifParamSrv.resetOriginalValues();
    }
}
