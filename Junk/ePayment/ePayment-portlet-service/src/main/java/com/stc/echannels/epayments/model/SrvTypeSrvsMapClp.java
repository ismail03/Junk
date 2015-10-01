package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.SrvTypeSrvsMapLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SrvTypeSrvsMapClp extends BaseModelImpl<SrvTypeSrvsMap>
    implements SrvTypeSrvsMap {
    private String _id;
    private long _serviceId;
    private long _serviceTypeId;
    private BaseModel<?> _srvTypeSrvsMapRemoteModel;

    public SrvTypeSrvsMapClp() {
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
    public String getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
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

    @Override
    public String getId() {
        return _id;
    }

    @Override
    public void setId(String id) {
        _id = id;

        if (_srvTypeSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _srvTypeSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setId", String.class);

                method.invoke(_srvTypeSrvsMapRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getServiceId() {
        return _serviceId;
    }

    @Override
    public void setServiceId(long serviceId) {
        _serviceId = serviceId;

        if (_srvTypeSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _srvTypeSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_srvTypeSrvsMapRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;

        if (_srvTypeSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _srvTypeSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceTypeId", long.class);

                method.invoke(_srvTypeSrvsMapRemoteModel, serviceTypeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSrvTypeSrvsMapRemoteModel() {
        return _srvTypeSrvsMapRemoteModel;
    }

    public void setSrvTypeSrvsMapRemoteModel(
        BaseModel<?> srvTypeSrvsMapRemoteModel) {
        _srvTypeSrvsMapRemoteModel = srvTypeSrvsMapRemoteModel;
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

        Class<?> remoteModelClass = _srvTypeSrvsMapRemoteModel.getClass();

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

        Object returnValue = method.invoke(_srvTypeSrvsMapRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SrvTypeSrvsMapLocalServiceUtil.addSrvTypeSrvsMap(this);
        } else {
            SrvTypeSrvsMapLocalServiceUtil.updateSrvTypeSrvsMap(this);
        }
    }

    @Override
    public SrvTypeSrvsMap toEscapedModel() {
        return (SrvTypeSrvsMap) ProxyUtil.newProxyInstance(SrvTypeSrvsMap.class.getClassLoader(),
            new Class[] { SrvTypeSrvsMap.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SrvTypeSrvsMapClp clone = new SrvTypeSrvsMapClp();

        clone.setId(getId());
        clone.setServiceId(getServiceId());
        clone.setServiceTypeId(getServiceTypeId());

        return clone;
    }

    @Override
    public int compareTo(SrvTypeSrvsMap srvTypeSrvsMap) {
        String primaryKey = srvTypeSrvsMap.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SrvTypeSrvsMapClp)) {
            return false;
        }

        SrvTypeSrvsMapClp srvTypeSrvsMap = (SrvTypeSrvsMapClp) obj;

        String primaryKey = srvTypeSrvsMap.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", serviceTypeId=");
        sb.append(getServiceTypeId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.SrvTypeSrvsMap");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceTypeId</column-name><column-value><![CDATA[");
        sb.append(getServiceTypeId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
