package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class SystemConfigClp extends BaseModelImpl<SystemConfig>
    implements SystemConfig {
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private long _serviceId;
    private String _bankId;
    private String _config;
    private BaseModel<?> _systemConfigRemoteModel;

    public SystemConfigClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return SystemConfig.class;
    }

    @Override
    public String getModelClassName() {
        return SystemConfig.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _transId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setTransId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _transId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("serviceId", getServiceId());
        attributes.put("bankId", getBankId());
        attributes.put("config", getConfig());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
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

        String clientIp = (String) attributes.get("clientIp");

        if (clientIp != null) {
            setClientIp(clientIp);
        }

        String serverIp = (String) attributes.get("serverIp");

        if (serverIp != null) {
            setServerIp(serverIp);
        }

        String userAgent = (String) attributes.get("userAgent");

        if (userAgent != null) {
            setUserAgent(userAgent);
        }

        String operation = (String) attributes.get("operation");

        if (operation != null) {
            setOperation(operation);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        String bankId = (String) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        String config = (String) attributes.get("config");

        if (config != null) {
            setConfig(config);
        }
    }

    @Override
    public String getTransId() {
        return _transId;
    }

    @Override
    public void setTransId(String transId) {
        _transId = transId;

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_systemConfigRemoteModel, transId);
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

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_systemConfigRemoteModel, lastUpdateTimestamp);
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

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_systemConfigRemoteModel, lastUpdateUserid);
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

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_systemConfigRemoteModel, lastUpdateUsername);
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

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_systemConfigRemoteModel, status);
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

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_systemConfigRemoteModel, effectiveTimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getClientIp() {
        return _clientIp;
    }

    @Override
    public void setClientIp(String clientIp) {
        _clientIp = clientIp;

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIp", String.class);

                method.invoke(_systemConfigRemoteModel, clientIp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServerIp() {
        return _serverIp;
    }

    @Override
    public void setServerIp(String serverIp) {
        _serverIp = serverIp;

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIp", String.class);

                method.invoke(_systemConfigRemoteModel, serverIp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserAgent() {
        return _userAgent;
    }

    @Override
    public void setUserAgent(String userAgent) {
        _userAgent = userAgent;

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_systemConfigRemoteModel, userAgent);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOperation() {
        return _operation;
    }

    @Override
    public void setOperation(String operation) {
        _operation = operation;

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_systemConfigRemoteModel, operation);
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

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_systemConfigRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBankId() {
        return _bankId;
    }

    @Override
    public void setBankId(String bankId) {
        _bankId = bankId;

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setBankId", String.class);

                method.invoke(_systemConfigRemoteModel, bankId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getConfig() {
        return _config;
    }

    @Override
    public void setConfig(String config) {
        _config = config;

        if (_systemConfigRemoteModel != null) {
            try {
                Class<?> clazz = _systemConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setConfig", String.class);

                method.invoke(_systemConfigRemoteModel, config);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSystemConfigRemoteModel() {
        return _systemConfigRemoteModel;
    }

    public void setSystemConfigRemoteModel(BaseModel<?> systemConfigRemoteModel) {
        _systemConfigRemoteModel = systemConfigRemoteModel;
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

        Class<?> remoteModelClass = _systemConfigRemoteModel.getClass();

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

        Object returnValue = method.invoke(_systemConfigRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SystemConfigLocalServiceUtil.addSystemConfig(this);
        } else {
            SystemConfigLocalServiceUtil.updateSystemConfig(this);
        }
    }

    @Override
    public SystemConfig toEscapedModel() {
        return (SystemConfig) ProxyUtil.newProxyInstance(SystemConfig.class.getClassLoader(),
            new Class[] { SystemConfig.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SystemConfigClp clone = new SystemConfigClp();

        clone.setTransId(getTransId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setStatus(getStatus());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setClientIp(getClientIp());
        clone.setServerIp(getServerIp());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());
        clone.setServiceId(getServiceId());
        clone.setBankId(getBankId());
        clone.setConfig(getConfig());

        return clone;
    }

    @Override
    public int compareTo(SystemConfig systemConfig) {
        int value = 0;

        if (getServiceId() < systemConfig.getServiceId()) {
            value = -1;
        } else if (getServiceId() > systemConfig.getServiceId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = getBankId().compareTo(systemConfig.getBankId());

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

        if (!(obj instanceof SystemConfigClp)) {
            return false;
        }

        SystemConfigClp systemConfig = (SystemConfigClp) obj;

        String primaryKey = systemConfig.getPrimaryKey();

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
        StringBundler sb = new StringBundler(27);

        sb.append("{transId=");
        sb.append(getTransId());
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
        sb.append(", clientIp=");
        sb.append(getClientIp());
        sb.append(", serverIp=");
        sb.append(getServerIp());
        sb.append(", userAgent=");
        sb.append(getUserAgent());
        sb.append(", operation=");
        sb.append(getOperation());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", bankId=");
        sb.append(getBankId());
        sb.append(", config=");
        sb.append(getConfig());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.SystemConfig");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>transId</column-name><column-value><![CDATA[");
        sb.append(getTransId());
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
            "<column><column-name>clientIp</column-name><column-value><![CDATA[");
        sb.append(getClientIp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serverIp</column-name><column-value><![CDATA[");
        sb.append(getServerIp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userAgent</column-name><column-value><![CDATA[");
        sb.append(getUserAgent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>operation</column-name><column-value><![CDATA[");
        sb.append(getOperation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankId</column-name><column-value><![CDATA[");
        sb.append(getBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>config</column-name><column-value><![CDATA[");
        sb.append(getConfig());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
