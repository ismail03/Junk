package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.NotifParamLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class NotifParamClp extends BaseModelImpl<NotifParam>
    implements NotifParam {
    private long _notifParamId;
    private String _nameAr;
    private String _nameEn;
    private String _paramName;
    private BaseModel<?> _notifParamRemoteModel;

    public NotifParamClp() {
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
    public long getPrimaryKey() {
        return _notifParamId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setNotifParamId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _notifParamId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getNotifParamId() {
        return _notifParamId;
    }

    @Override
    public void setNotifParamId(long notifParamId) {
        _notifParamId = notifParamId;

        if (_notifParamRemoteModel != null) {
            try {
                Class<?> clazz = _notifParamRemoteModel.getClass();

                Method method = clazz.getMethod("setNotifParamId", long.class);

                method.invoke(_notifParamRemoteModel, notifParamId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNameAr() {
        return _nameAr;
    }

    @Override
    public void setNameAr(String nameAr) {
        _nameAr = nameAr;

        if (_notifParamRemoteModel != null) {
            try {
                Class<?> clazz = _notifParamRemoteModel.getClass();

                Method method = clazz.getMethod("setNameAr", String.class);

                method.invoke(_notifParamRemoteModel, nameAr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNameEn() {
        return _nameEn;
    }

    @Override
    public void setNameEn(String nameEn) {
        _nameEn = nameEn;

        if (_notifParamRemoteModel != null) {
            try {
                Class<?> clazz = _notifParamRemoteModel.getClass();

                Method method = clazz.getMethod("setNameEn", String.class);

                method.invoke(_notifParamRemoteModel, nameEn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParamName() {
        return _paramName;
    }

    @Override
    public void setParamName(String paramName) {
        _paramName = paramName;

        if (_notifParamRemoteModel != null) {
            try {
                Class<?> clazz = _notifParamRemoteModel.getClass();

                Method method = clazz.getMethod("setParamName", String.class);

                method.invoke(_notifParamRemoteModel, paramName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
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

    public BaseModel<?> getNotifParamRemoteModel() {
        return _notifParamRemoteModel;
    }

    public void setNotifParamRemoteModel(BaseModel<?> notifParamRemoteModel) {
        _notifParamRemoteModel = notifParamRemoteModel;
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

        Class<?> remoteModelClass = _notifParamRemoteModel.getClass();

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

        Object returnValue = method.invoke(_notifParamRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            NotifParamLocalServiceUtil.addNotifParam(this);
        } else {
            NotifParamLocalServiceUtil.updateNotifParam(this);
        }
    }

    @Override
    public NotifParam toEscapedModel() {
        return (NotifParam) ProxyUtil.newProxyInstance(NotifParam.class.getClassLoader(),
            new Class[] { NotifParam.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        NotifParamClp clone = new NotifParamClp();

        clone.setNotifParamId(getNotifParamId());
        clone.setNameAr(getNameAr());
        clone.setNameEn(getNameEn());
        clone.setParamName(getParamName());

        return clone;
    }

    @Override
    public int compareTo(NotifParam notifParam) {
        int value = 0;

        value = getParamName().compareTo(notifParam.getParamName());

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

        if (!(obj instanceof NotifParamClp)) {
            return false;
        }

        NotifParamClp notifParam = (NotifParamClp) obj;

        long primaryKey = notifParam.getPrimaryKey();

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

        sb.append("{notifParamId=");
        sb.append(getNotifParamId());
        sb.append(", nameAr=");
        sb.append(getNameAr());
        sb.append(", nameEn=");
        sb.append(getNameEn());
        sb.append(", paramName=");
        sb.append(getParamName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.NotifParam");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>notifParamId</column-name><column-value><![CDATA[");
        sb.append(getNotifParamId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nameAr</column-name><column-value><![CDATA[");
        sb.append(getNameAr());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nameEn</column-name><column-value><![CDATA[");
        sb.append(getNameEn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paramName</column-name><column-value><![CDATA[");
        sb.append(getParamName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
