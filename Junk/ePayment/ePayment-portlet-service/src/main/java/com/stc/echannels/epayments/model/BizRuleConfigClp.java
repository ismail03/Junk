package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BizRuleConfigClp extends BaseModelImpl<BizRuleConfig>
    implements BizRuleConfig {
    private long _bizRuleId;
    private long _serviceId;
    private long _channelId;
    private long _pmtMethodId;
    private String _customValue;
    private long _ruleId;
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
    private BaseModel<?> _bizRuleConfigRemoteModel;

    public BizRuleConfigClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return BizRuleConfig.class;
    }

    @Override
    public String getModelClassName() {
        return BizRuleConfig.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _bizRuleId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBizRuleId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bizRuleId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bizRuleId", getBizRuleId());
        attributes.put("serviceId", getServiceId());
        attributes.put("channelId", getChannelId());
        attributes.put("pmtMethodId", getPmtMethodId());
        attributes.put("customValue", getCustomValue());
        attributes.put("ruleId", getRuleId());
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
        Long bizRuleId = (Long) attributes.get("bizRuleId");

        if (bizRuleId != null) {
            setBizRuleId(bizRuleId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        Long pmtMethodId = (Long) attributes.get("pmtMethodId");

        if (pmtMethodId != null) {
            setPmtMethodId(pmtMethodId);
        }

        String customValue = (String) attributes.get("customValue");

        if (customValue != null) {
            setCustomValue(customValue);
        }

        Long ruleId = (Long) attributes.get("ruleId");

        if (ruleId != null) {
            setRuleId(ruleId);
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
    public long getBizRuleId() {
        return _bizRuleId;
    }

    @Override
    public void setBizRuleId(long bizRuleId) {
        _bizRuleId = bizRuleId;

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setBizRuleId", long.class);

                method.invoke(_bizRuleConfigRemoteModel, bizRuleId);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_bizRuleConfigRemoteModel, serviceId);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setChannelId", long.class);

                method.invoke(_bizRuleConfigRemoteModel, channelId);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtMethodId", long.class);

                method.invoke(_bizRuleConfigRemoteModel, pmtMethodId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCustomValue() {
        return _customValue;
    }

    @Override
    public void setCustomValue(String customValue) {
        _customValue = customValue;

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomValue", String.class);

                method.invoke(_bizRuleConfigRemoteModel, customValue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRuleId() {
        return _ruleId;
    }

    @Override
    public void setRuleId(long ruleId) {
        _ruleId = ruleId;

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setRuleId", long.class);

                method.invoke(_bizRuleConfigRemoteModel, ruleId);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_bizRuleConfigRemoteModel, transId);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIP", String.class);

                method.invoke(_bizRuleConfigRemoteModel, clientIP);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIP", String.class);

                method.invoke(_bizRuleConfigRemoteModel, serverIP);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_bizRuleConfigRemoteModel, userAgent);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_bizRuleConfigRemoteModel, operation);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_bizRuleConfigRemoteModel, lastUpdateTimestamp);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_bizRuleConfigRemoteModel, lastUpdateUserid);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_bizRuleConfigRemoteModel, lastUpdateUsername);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_bizRuleConfigRemoteModel, status);
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

        if (_bizRuleConfigRemoteModel != null) {
            try {
                Class<?> clazz = _bizRuleConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_bizRuleConfigRemoteModel, effectiveTimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBizRuleConfigRemoteModel() {
        return _bizRuleConfigRemoteModel;
    }

    public void setBizRuleConfigRemoteModel(
        BaseModel<?> bizRuleConfigRemoteModel) {
        _bizRuleConfigRemoteModel = bizRuleConfigRemoteModel;
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

        Class<?> remoteModelClass = _bizRuleConfigRemoteModel.getClass();

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

        Object returnValue = method.invoke(_bizRuleConfigRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BizRuleConfigLocalServiceUtil.addBizRuleConfig(this);
        } else {
            BizRuleConfigLocalServiceUtil.updateBizRuleConfig(this);
        }
    }

    @Override
    public BizRuleConfig toEscapedModel() {
        return (BizRuleConfig) ProxyUtil.newProxyInstance(BizRuleConfig.class.getClassLoader(),
            new Class[] { BizRuleConfig.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BizRuleConfigClp clone = new BizRuleConfigClp();

        clone.setBizRuleId(getBizRuleId());
        clone.setServiceId(getServiceId());
        clone.setChannelId(getChannelId());
        clone.setPmtMethodId(getPmtMethodId());
        clone.setCustomValue(getCustomValue());
        clone.setRuleId(getRuleId());
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
    public int compareTo(BizRuleConfig bizRuleConfig) {
        long primaryKey = bizRuleConfig.getPrimaryKey();

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

        if (!(obj instanceof BizRuleConfigClp)) {
            return false;
        }

        BizRuleConfigClp bizRuleConfig = (BizRuleConfigClp) obj;

        long primaryKey = bizRuleConfig.getPrimaryKey();

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
        StringBundler sb = new StringBundler(33);

        sb.append("{bizRuleId=");
        sb.append(getBizRuleId());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", channelId=");
        sb.append(getChannelId());
        sb.append(", pmtMethodId=");
        sb.append(getPmtMethodId());
        sb.append(", customValue=");
        sb.append(getCustomValue());
        sb.append(", ruleId=");
        sb.append(getRuleId());
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
        StringBundler sb = new StringBundler(52);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.BizRuleConfig");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bizRuleId</column-name><column-value><![CDATA[");
        sb.append(getBizRuleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
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
            "<column><column-name>customValue</column-name><column-value><![CDATA[");
        sb.append(getCustomValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ruleId</column-name><column-value><![CDATA[");
        sb.append(getRuleId());
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
