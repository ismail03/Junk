package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EPayAccessControlClp extends BaseModelImpl<EPayAccessControl>
    implements EPayAccessControl {
    private long _epayCofignId;
    private long _serviceId;
    private long _serviceTypeId;
    private long _channelId;
    private long _pmtMethodId;
    private String _transId;
    private String _clientIP;
    private String _serverIP;
    private String _userAgent;
    private String _operation;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;
    private BaseModel<?> _ePayAccessControlRemoteModel;

    public EPayAccessControlClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EPayAccessControl.class;
    }

    @Override
    public String getModelClassName() {
        return EPayAccessControl.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _epayCofignId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEpayCofignId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _epayCofignId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("epayCofignId", getEpayCofignId());
        attributes.put("serviceId", getServiceId());
        attributes.put("serviceTypeId", getServiceTypeId());
        attributes.put("channelId", getChannelId());
        attributes.put("pmtMethodId", getPmtMethodId());
        attributes.put("transId", getTransId());
        attributes.put("clientIP", getClientIP());
        attributes.put("serverIP", getServerIP());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long epayCofignId = (Long) attributes.get("epayCofignId");

        if (epayCofignId != null) {
            setEpayCofignId(epayCofignId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Long serviceTypeId = (Long) attributes.get("serviceTypeId");

        if (serviceTypeId != null) {
            setServiceTypeId(serviceTypeId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        Long pmtMethodId = (Long) attributes.get("pmtMethodId");

        if (pmtMethodId != null) {
            setPmtMethodId(pmtMethodId);
        }

        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
        }

        String clientIP = (String) attributes.get("clientIP");

        if (clientIP != null) {
            setClientIP(clientIP);
        }

        String serverIP = (String) attributes.get("serverIP");

        if (serverIP != null) {
            setServerIP(serverIP);
        }

        String userAgent = (String) attributes.get("userAgent");

        if (userAgent != null) {
            setUserAgent(userAgent);
        }

        String operation = (String) attributes.get("operation");

        if (operation != null) {
            setOperation(operation);
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
    }

    @Override
    public long getEpayCofignId() {
        return _epayCofignId;
    }

    @Override
    public void setEpayCofignId(long epayCofignId) {
        _epayCofignId = epayCofignId;

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setEpayCofignId", long.class);

                method.invoke(_ePayAccessControlRemoteModel, epayCofignId);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_ePayAccessControlRemoteModel, serviceId);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceTypeId", long.class);

                method.invoke(_ePayAccessControlRemoteModel, serviceTypeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getChannelId() {
        return _channelId;
    }

    @Override
    public void setChannelId(long channelId) {
        _channelId = channelId;

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setChannelId", long.class);

                method.invoke(_ePayAccessControlRemoteModel, channelId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPmtMethodId() {
        return _pmtMethodId;
    }

    @Override
    public void setPmtMethodId(long pmtMethodId) {
        _pmtMethodId = pmtMethodId;

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtMethodId", long.class);

                method.invoke(_ePayAccessControlRemoteModel, pmtMethodId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTransId() {
        return _transId;
    }

    @Override
    public void setTransId(String transId) {
        _transId = transId;

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_ePayAccessControlRemoteModel, transId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getClientIP() {
        return _clientIP;
    }

    @Override
    public void setClientIP(String clientIP) {
        _clientIP = clientIP;

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIP", String.class);

                method.invoke(_ePayAccessControlRemoteModel, clientIP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServerIP() {
        return _serverIP;
    }

    @Override
    public void setServerIP(String serverIP) {
        _serverIP = serverIP;

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIP", String.class);

                method.invoke(_ePayAccessControlRemoteModel, serverIP);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_ePayAccessControlRemoteModel, userAgent);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_ePayAccessControlRemoteModel, operation);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_ePayAccessControlRemoteModel, lastUpdateTimestamp);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_ePayAccessControlRemoteModel, lastUpdateUserid);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_ePayAccessControlRemoteModel, lastUpdateUsername);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_ePayAccessControlRemoteModel, status);
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

        if (_ePayAccessControlRemoteModel != null) {
            try {
                Class<?> clazz = _ePayAccessControlRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_ePayAccessControlRemoteModel, effectiveTimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEPayAccessControlRemoteModel() {
        return _ePayAccessControlRemoteModel;
    }

    public void setEPayAccessControlRemoteModel(
        BaseModel<?> ePayAccessControlRemoteModel) {
        _ePayAccessControlRemoteModel = ePayAccessControlRemoteModel;
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

        Class<?> remoteModelClass = _ePayAccessControlRemoteModel.getClass();

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

        Object returnValue = method.invoke(_ePayAccessControlRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EPayAccessControlLocalServiceUtil.addEPayAccessControl(this);
        } else {
            EPayAccessControlLocalServiceUtil.updateEPayAccessControl(this);
        }
    }

    @Override
    public EPayAccessControl toEscapedModel() {
        return (EPayAccessControl) ProxyUtil.newProxyInstance(EPayAccessControl.class.getClassLoader(),
            new Class[] { EPayAccessControl.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EPayAccessControlClp clone = new EPayAccessControlClp();

        clone.setEpayCofignId(getEpayCofignId());
        clone.setServiceId(getServiceId());
        clone.setServiceTypeId(getServiceTypeId());
        clone.setChannelId(getChannelId());
        clone.setPmtMethodId(getPmtMethodId());
        clone.setTransId(getTransId());
        clone.setClientIP(getClientIP());
        clone.setServerIP(getServerIP());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setStatus(getStatus());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());

        return clone;
    }

    @Override
    public int compareTo(EPayAccessControl ePayAccessControl) {
        long primaryKey = ePayAccessControl.getPrimaryKey();

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

        if (!(obj instanceof EPayAccessControlClp)) {
            return false;
        }

        EPayAccessControlClp ePayAccessControl = (EPayAccessControlClp) obj;

        long primaryKey = ePayAccessControl.getPrimaryKey();

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
        StringBundler sb = new StringBundler(31);

        sb.append("{epayCofignId=");
        sb.append(getEpayCofignId());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", serviceTypeId=");
        sb.append(getServiceTypeId());
        sb.append(", channelId=");
        sb.append(getChannelId());
        sb.append(", pmtMethodId=");
        sb.append(getPmtMethodId());
        sb.append(", transId=");
        sb.append(getTransId());
        sb.append(", clientIP=");
        sb.append(getClientIP());
        sb.append(", serverIP=");
        sb.append(getServerIP());
        sb.append(", userAgent=");
        sb.append(getUserAgent());
        sb.append(", operation=");
        sb.append(getOperation());
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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.EPayAccessControl");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>epayCofignId</column-name><column-value><![CDATA[");
        sb.append(getEpayCofignId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceTypeId</column-name><column-value><![CDATA[");
        sb.append(getServiceTypeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>channelId</column-name><column-value><![CDATA[");
        sb.append(getChannelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtMethodId</column-name><column-value><![CDATA[");
        sb.append(getPmtMethodId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transId</column-name><column-value><![CDATA[");
        sb.append(getTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>clientIP</column-name><column-value><![CDATA[");
        sb.append(getClientIP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serverIP</column-name><column-value><![CDATA[");
        sb.append(getServerIP());
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

        sb.append("</model>");

        return sb.toString();
    }
}
