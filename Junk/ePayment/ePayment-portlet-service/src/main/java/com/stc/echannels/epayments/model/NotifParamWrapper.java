package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NotifParam}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifParam
 * @generated
 */
public class NotifParamWrapper implements NotifParam, ModelWrapper<NotifParam> {
    private NotifParam _notifParam;

    public NotifParamWrapper(NotifParam notifParam) {
        _notifParam = notifParam;
    }

    @Override
    public Class<?> getModelClass() {
        return NotifParam.class;
    }

    @Override
    public String getModelClassName() {
        return NotifParam.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("notifParamId", getNotifParamId());
        attributes.put("nameAr", getNameAr());
        attributes.put("nameEn", getNameEn());
        attributes.put("paramName", getParamName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long notifParamId = (Long) attributes.get("notifParamId");

        if (notifParamId != null) {
            setNotifParamId(notifParamId);
        }

        String nameAr = (String) attributes.get("nameAr");

        if (nameAr != null) {
            setNameAr(nameAr);
        }

        String nameEn = (String) attributes.get("nameEn");

        if (nameEn != null) {
            setNameEn(nameEn);
        }

        String paramName = (String) attributes.get("paramName");

        if (paramName != null) {
            setParamName(paramName);
        }
    }

    /**
    * Returns the primary key of this notif param.
    *
    * @return the primary key of this notif param
    */
    @Override
    public long getPrimaryKey() {
        return _notifParam.getPrimaryKey();
    }

    /**
    * Sets the primary key of this notif param.
    *
    * @param primaryKey the primary key of this notif param
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _notifParam.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the notif param ID of this notif param.
    *
    * @return the notif param ID of this notif param
    */
    @Override
    public long getNotifParamId() {
        return _notifParam.getNotifParamId();
    }

    /**
    * Sets the notif param ID of this notif param.
    *
    * @param notifParamId the notif param ID of this notif param
    */
    @Override
    public void setNotifParamId(long notifParamId) {
        _notifParam.setNotifParamId(notifParamId);
    }

    /**
    * Returns the name ar of this notif param.
    *
    * @return the name ar of this notif param
    */
    @Override
    public java.lang.String getNameAr() {
        return _notifParam.getNameAr();
    }

    /**
    * Sets the name ar of this notif param.
    *
    * @param nameAr the name ar of this notif param
    */
    @Override
    public void setNameAr(java.lang.String nameAr) {
        _notifParam.setNameAr(nameAr);
    }

    /**
    * Returns the name en of this notif param.
    *
    * @return the name en of this notif param
    */
    @Override
    public java.lang.String getNameEn() {
        return _notifParam.getNameEn();
    }

    /**
    * Sets the name en of this notif param.
    *
    * @param nameEn the name en of this notif param
    */
    @Override
    public void setNameEn(java.lang.String nameEn) {
        _notifParam.setNameEn(nameEn);
    }

    /**
    * Returns the param name of this notif param.
    *
    * @return the param name of this notif param
    */
    @Override
    public java.lang.String getParamName() {
        return _notifParam.getParamName();
    }

    /**
    * Sets the param name of this notif param.
    *
    * @param paramName the param name of this notif param
    */
    @Override
    public void setParamName(java.lang.String paramName) {
        _notifParam.setParamName(paramName);
    }

    @Override
    public boolean isNew() {
        return _notifParam.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _notifParam.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _notifParam.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _notifParam.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _notifParam.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _notifParam.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _notifParam.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _notifParam.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _notifParam.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _notifParam.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _notifParam.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new NotifParamWrapper((NotifParam) _notifParam.clone());
    }

    @Override
    public int compareTo(NotifParam notifParam) {
        return _notifParam.compareTo(notifParam);
    }

    @Override
    public int hashCode() {
        return _notifParam.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<NotifParam> toCacheModel() {
        return _notifParam.toCacheModel();
    }

    @Override
    public NotifParam toEscapedModel() {
        return new NotifParamWrapper(_notifParam.toEscapedModel());
    }

    @Override
    public NotifParam toUnescapedModel() {
        return new NotifParamWrapper(_notifParam.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _notifParam.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _notifParam.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _notifParam.persist();
    }

    @Override
    public java.lang.String getName(java.util.Locale locale) {
        return _notifParam.getName(locale);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NotifParamWrapper)) {
            return false;
        }

        NotifParamWrapper notifParamWrapper = (NotifParamWrapper) obj;

        if (Validator.equals(_notifParam, notifParamWrapper._notifParam)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public NotifParam getWrappedNotifParam() {
        return _notifParam;
    }

    @Override
    public NotifParam getWrappedModel() {
        return _notifParam;
    }

    @Override
    public void resetOriginalValues() {
        _notifParam.resetOriginalValues();
    }
}
