package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.NotifParamSrvLocalServiceUtil;
import com.stc.echannels.epayments.service.persistence.NotifParamSrvPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class NotifParamSrvClp extends BaseModelImpl<NotifParamSrv>
    implements NotifParamSrv {
    private long _notifParamId;
    private long _serviceId;
    private BaseModel<?> _notifParamSrvRemoteModel;

    public NotifParamSrvClp() {
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
    public NotifParamSrvPK getPrimaryKey() {
        return new NotifParamSrvPK(_notifParamId, _serviceId);
    }

    @Override
    public void setPrimaryKey(NotifParamSrvPK primaryKey) {
        setNotifParamId(primaryKey.notifParamId);
        setServiceId(primaryKey.serviceId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new NotifParamSrvPK(_notifParamId, _serviceId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((NotifParamSrvPK) primaryKeyObj);
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

    @Override
    public long getNotifParamId() {
        return _notifParamId;
    }

    @Override
    public void setNotifParamId(long notifParamId) {
        _notifParamId = notifParamId;

        if (_notifParamSrvRemoteModel != null) {
            try {
                Class<?> clazz = _notifParamSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setNotifParamId", long.class);

                method.invoke(_notifParamSrvRemoteModel, notifParamId);
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

        if (_notifParamSrvRemoteModel != null) {
            try {
                Class<?> clazz = _notifParamSrvRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_notifParamSrvRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getNotifParamSrvRemoteModel() {
        return _notifParamSrvRemoteModel;
    }

    public void setNotifParamSrvRemoteModel(
        BaseModel<?> notifParamSrvRemoteModel) {
        _notifParamSrvRemoteModel = notifParamSrvRemoteModel;
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

        Class<?> remoteModelClass = _notifParamSrvRemoteModel.getClass();

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

        Object returnValue = method.invoke(_notifParamSrvRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            NotifParamSrvLocalServiceUtil.addNotifParamSrv(this);
        } else {
            NotifParamSrvLocalServiceUtil.updateNotifParamSrv(this);
        }
    }

    @Override
    public NotifParamSrv toEscapedModel() {
        return (NotifParamSrv) ProxyUtil.newProxyInstance(NotifParamSrv.class.getClassLoader(),
            new Class[] { NotifParamSrv.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        NotifParamSrvClp clone = new NotifParamSrvClp();

        clone.setNotifParamId(getNotifParamId());
        clone.setServiceId(getServiceId());

        return clone;
    }

    @Override
    public int compareTo(NotifParamSrv notifParamSrv) {
        int value = 0;

        if (getNotifParamId() < notifParamSrv.getNotifParamId()) {
            value = -1;
        } else if (getNotifParamId() > notifParamSrv.getNotifParamId()) {
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

        if (!(obj instanceof NotifParamSrvClp)) {
            return false;
        }

        NotifParamSrvClp notifParamSrv = (NotifParamSrvClp) obj;

        NotifParamSrvPK primaryKey = notifParamSrv.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{notifParamId=");
        sb.append(getNotifParamId());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.NotifParamSrv");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>notifParamId</column-name><column-value><![CDATA[");
        sb.append(getNotifParamId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
