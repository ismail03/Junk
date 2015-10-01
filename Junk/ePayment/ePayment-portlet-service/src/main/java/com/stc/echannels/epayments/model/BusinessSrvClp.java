package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;
import com.stc.echannels.epayments.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BusinessSrvClp extends BaseModelImpl<BusinessSrv>
    implements BusinessSrv {
    private long _serviceId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;
    private String _refMask;
    private String _serviceType;
    private String _serviceNameEn;
    private String _serviceNameAr;
    private BaseModel<?> _businessSrvRemoteModel;

    public BusinessSrvClp() {
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
    public long getPrimaryKey() {
        return _serviceId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setServiceId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _serviceId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getServiceId() {
        return _serviceId;
    }

    @Override
    public void setServiceId(long serviceId) {
        _serviceId = serviceId;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_businessSrvRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getLastUpdateTimestamp() {
        return _lastUpdateTimestamp;
    }

    @Override
    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        _lastUpdateTimestamp = lastUpdateTimestamp;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_businessSrvRemoteModel, lastUpdateTimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastUpdateUserid() {
        return _lastUpdateUserid;
    }

    @Override
    public void setLastUpdateUserid(String lastUpdateUserid) {
        _lastUpdateUserid = lastUpdateUserid;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_businessSrvRemoteModel, lastUpdateUserid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastUpdateUsername() {
        return _lastUpdateUsername;
    }

    @Override
    public void setLastUpdateUsername(String lastUpdateUsername) {
        _lastUpdateUsername = lastUpdateUsername;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_businessSrvRemoteModel, lastUpdateUsername);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatus() {
        return _status;
    }

    @Override
    public void setStatus(String status) {
        _status = status;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_businessSrvRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getEffectiveTimestamp() {
        return _effectiveTimestamp;
    }

    @Override
    public void setEffectiveTimestamp(Date effectiveTimestamp) {
        _effectiveTimestamp = effectiveTimestamp;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_businessSrvRemoteModel, effectiveTimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRefMask() {
        return _refMask;
    }

    @Override
    public void setRefMask(String refMask) {
        _refMask = refMask;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setRefMask", String.class);

                method.invoke(_businessSrvRemoteModel, refMask);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceType() {
        return _serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        _serviceType = serviceType;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceType", String.class);

                method.invoke(_businessSrvRemoteModel, serviceType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceNameEn() {
        return _serviceNameEn;
    }

    @Override
    public void setServiceNameEn(String serviceNameEn) {
        _serviceNameEn = serviceNameEn;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceNameEn", String.class);

                method.invoke(_businessSrvRemoteModel, serviceNameEn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceNameAr() {
        return _serviceNameAr;
    }

    @Override
    public void setServiceNameAr(String serviceNameAr) {
        _serviceNameAr = serviceNameAr;

        if (_businessSrvRemoteModel != null) {
            try {
                Class<?> clazz = _businessSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceNameAr", String.class);

                method.invoke(_businessSrvRemoteModel, serviceNameAr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setEpayAccessControlPresent(boolean isEpayAccessControlPresent) {
        try {
            String methodName = "setEpayAccessControlPresent";

            Class<?>[] parameterTypes = new Class<?>[] { boolean.class };

            Object[] parameterValues = new Object[] { isEpayAccessControlPresent };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public boolean isEpayAccessControlPresent() {
        try {
            String methodName = "isEpayAccessControlPresent";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            Boolean returnObj = (Boolean) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getName(java.util.Locale locale) {
        try {
            String methodName = "getName";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.Locale.class };

            Object[] parameterValues = new Object[] { locale };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getBusinessSrvRemoteModel() {
        return _businessSrvRemoteModel;
    }

    public void setBusinessSrvRemoteModel(BaseModel<?> businessSrvRemoteModel) {
        _businessSrvRemoteModel = businessSrvRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _businessSrvRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_businessSrvRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BusinessSrvLocalServiceUtil.addBusinessSrv(this);
        } else {
            BusinessSrvLocalServiceUtil.updateBusinessSrv(this);
        }
    }

    @Override
    public BusinessSrv toEscapedModel() {
        return (BusinessSrv) ProxyUtil.newProxyInstance(BusinessSrv.class.getClassLoader(),
            new Class[] { BusinessSrv.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BusinessSrvClp clone = new BusinessSrvClp();

        clone.setServiceId(getServiceId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setStatus(getStatus());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setRefMask(getRefMask());
        clone.setServiceType(getServiceType());
        clone.setServiceNameEn(getServiceNameEn());
        clone.setServiceNameAr(getServiceNameAr());

        return clone;
    }

    @Override
    public int compareTo(BusinessSrv businessSrv) {
        int value = 0;

        if (getServiceId() < businessSrv.getServiceId()) {
            value = -1;
        } else if (getServiceId() > businessSrv.getServiceId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BusinessSrvClp)) {
            return false;
        }

        BusinessSrvClp businessSrv = (BusinessSrvClp) obj;

        long primaryKey = businessSrv.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{serviceId=");
        sb.append(getServiceId());
        sb.append(", lastUpdateTimestamp=");
        sb.append(getLastUpdateTimestamp());
        sb.append(", lastUpdateUserid=");
        sb.append(getLastUpdateUserid());
        sb.append(", lastUpdateUsername=");
        sb.append(getLastUpdateUsername());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", effectiveTimestamp=");
        sb.append(getEffectiveTimestamp());
        sb.append(", refMask=");
        sb.append(getRefMask());
        sb.append(", serviceType=");
        sb.append(getServiceType());
        sb.append(", serviceNameEn=");
        sb.append(getServiceNameEn());
        sb.append(", serviceNameAr=");
        sb.append(getServiceNameAr());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.BusinessSrv");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastUpdateTimestamp</column-name><column-value><![CDATA[");
        sb.append(getLastUpdateTimestamp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastUpdateUserid</column-name><column-value><![CDATA[");
        sb.append(getLastUpdateUserid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastUpdateUsername</column-name><column-value><![CDATA[");
        sb.append(getLastUpdateUsername());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>effectiveTimestamp</column-name><column-value><![CDATA[");
        sb.append(getEffectiveTimestamp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>refMask</column-name><column-value><![CDATA[");
        sb.append(getRefMask());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceType</column-name><column-value><![CDATA[");
        sb.append(getServiceType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceNameEn</column-name><column-value><![CDATA[");
        sb.append(getServiceNameEn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceNameAr</column-name><column-value><![CDATA[");
        sb.append(getServiceNameAr());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
