package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.SrvTypesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SrvTypesClp extends BaseModelImpl<SrvTypes> implements SrvTypes {
    private long _serviceTypeId;
    private String _serviceTypeName;
    private String _serviceNameEN;
    private String _serviceNameAR;
    private BaseModel<?> _srvTypesRemoteModel;

    public SrvTypesClp() {
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
    public long getPrimaryKey() {
        return _serviceTypeId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setServiceTypeId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _serviceTypeId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;

        if (_srvTypesRemoteModel != null) {
            try {
                Class<?> clazz = _srvTypesRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceTypeId", long.class);

                method.invoke(_srvTypesRemoteModel, serviceTypeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceTypeName() {
        return _serviceTypeName;
    }

    @Override
    public void setServiceTypeName(String serviceTypeName) {
        _serviceTypeName = serviceTypeName;

        if (_srvTypesRemoteModel != null) {
            try {
                Class<?> clazz = _srvTypesRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceTypeName",
                        String.class);

                method.invoke(_srvTypesRemoteModel, serviceTypeName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceNameEN() {
        return _serviceNameEN;
    }

    @Override
    public void setServiceNameEN(String serviceNameEN) {
        _serviceNameEN = serviceNameEN;

        if (_srvTypesRemoteModel != null) {
            try {
                Class<?> clazz = _srvTypesRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceNameEN", String.class);

                method.invoke(_srvTypesRemoteModel, serviceNameEN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceNameAR() {
        return _serviceNameAR;
    }

    @Override
    public void setServiceNameAR(String serviceNameAR) {
        _serviceNameAR = serviceNameAR;

        if (_srvTypesRemoteModel != null) {
            try {
                Class<?> clazz = _srvTypesRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceNameAR", String.class);

                method.invoke(_srvTypesRemoteModel, serviceNameAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSrvTypesRemoteModel() {
        return _srvTypesRemoteModel;
    }

    public void setSrvTypesRemoteModel(BaseModel<?> srvTypesRemoteModel) {
        _srvTypesRemoteModel = srvTypesRemoteModel;
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

        Class<?> remoteModelClass = _srvTypesRemoteModel.getClass();

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

        Object returnValue = method.invoke(_srvTypesRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SrvTypesLocalServiceUtil.addSrvTypes(this);
        } else {
            SrvTypesLocalServiceUtil.updateSrvTypes(this);
        }
    }

    @Override
    public SrvTypes toEscapedModel() {
        return (SrvTypes) ProxyUtil.newProxyInstance(SrvTypes.class.getClassLoader(),
            new Class[] { SrvTypes.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SrvTypesClp clone = new SrvTypesClp();

        clone.setServiceTypeId(getServiceTypeId());
        clone.setServiceTypeName(getServiceTypeName());
        clone.setServiceNameEN(getServiceNameEN());
        clone.setServiceNameAR(getServiceNameAR());

        return clone;
    }

    @Override
    public int compareTo(SrvTypes srvTypes) {
        long primaryKey = srvTypes.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SrvTypesClp)) {
            return false;
        }

        SrvTypesClp srvTypes = (SrvTypesClp) obj;

        long primaryKey = srvTypes.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{serviceTypeId=");
        sb.append(getServiceTypeId());
        sb.append(", serviceTypeName=");
        sb.append(getServiceTypeName());
        sb.append(", serviceNameEN=");
        sb.append(getServiceNameEN());
        sb.append(", serviceNameAR=");
        sb.append(getServiceNameAR());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.SrvTypes");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>serviceTypeId</column-name><column-value><![CDATA[");
        sb.append(getServiceTypeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceTypeName</column-name><column-value><![CDATA[");
        sb.append(getServiceTypeName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceNameEN</column-name><column-value><![CDATA[");
        sb.append(getServiceNameEN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceNameAR</column-name><column-value><![CDATA[");
        sb.append(getServiceNameAR());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
