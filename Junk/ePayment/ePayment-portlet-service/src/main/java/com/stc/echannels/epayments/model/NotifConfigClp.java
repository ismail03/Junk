package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class NotifConfigClp extends BaseModelImpl<NotifConfig>
    implements NotifConfig {
    private long _notifId;
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private String _active;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _enabled;
    private String _msgEn;
    private String _msgAr;
    private String _param1;
    private String _param2;
    private String _param3;
    private String _param4;
    private String _param5;
    private String _decriptiveNameEn;
    private String _decriptiveNameAr;
    private String _notifName;
    private long _serviceId;
    private BaseModel<?> _notifConfigRemoteModel;

    public NotifConfigClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return NotifConfig.class;
    }

    @Override
    public String getModelClassName() {
        return NotifConfig.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _notifId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setNotifId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _notifId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("notifId", getNotifId());
        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("active", getActive());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("enabled", getEnabled());
        attributes.put("msgEn", getMsgEn());
        attributes.put("msgAr", getMsgAr());
        attributes.put("param1", getParam1());
        attributes.put("param2", getParam2());
        attributes.put("param3", getParam3());
        attributes.put("param4", getParam4());
        attributes.put("param5", getParam5());
        attributes.put("decriptiveNameEn", getDecriptiveNameEn());
        attributes.put("decriptiveNameAr", getDecriptiveNameAr());
        attributes.put("notifName", getNotifName());
        attributes.put("serviceId", getServiceId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long notifId = (Long) attributes.get("notifId");

        if (notifId != null) {
            setNotifId(notifId);
        }

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

        String active = (String) attributes.get("active");

        if (active != null) {
            setActive(active);
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

        String enabled = (String) attributes.get("enabled");

        if (enabled != null) {
            setEnabled(enabled);
        }

        String msgEn = (String) attributes.get("msgEn");

        if (msgEn != null) {
            setMsgEn(msgEn);
        }

        String msgAr = (String) attributes.get("msgAr");

        if (msgAr != null) {
            setMsgAr(msgAr);
        }

        String param1 = (String) attributes.get("param1");

        if (param1 != null) {
            setParam1(param1);
        }

        String param2 = (String) attributes.get("param2");

        if (param2 != null) {
            setParam2(param2);
        }

        String param3 = (String) attributes.get("param3");

        if (param3 != null) {
            setParam3(param3);
        }

        String param4 = (String) attributes.get("param4");

        if (param4 != null) {
            setParam4(param4);
        }

        String param5 = (String) attributes.get("param5");

        if (param5 != null) {
            setParam5(param5);
        }

        String decriptiveNameEn = (String) attributes.get("decriptiveNameEn");

        if (decriptiveNameEn != null) {
            setDecriptiveNameEn(decriptiveNameEn);
        }

        String decriptiveNameAr = (String) attributes.get("decriptiveNameAr");

        if (decriptiveNameAr != null) {
            setDecriptiveNameAr(decriptiveNameAr);
        }

        String notifName = (String) attributes.get("notifName");

        if (notifName != null) {
            setNotifName(notifName);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }
    }

    @Override
    public long getNotifId() {
        return _notifId;
    }

    @Override
    public void setNotifId(long notifId) {
        _notifId = notifId;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setNotifId", long.class);

                method.invoke(_notifConfigRemoteModel, notifId);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_notifConfigRemoteModel, transId);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_notifConfigRemoteModel, lastUpdateTimestamp);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_notifConfigRemoteModel, lastUpdateUserid);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_notifConfigRemoteModel, lastUpdateUsername);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_notifConfigRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getActive() {
        return _active;
    }

    @Override
    public void setActive(String active) {
        _active = active;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setActive", String.class);

                method.invoke(_notifConfigRemoteModel, active);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_notifConfigRemoteModel, effectiveTimestamp);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIp", String.class);

                method.invoke(_notifConfigRemoteModel, clientIp);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIp", String.class);

                method.invoke(_notifConfigRemoteModel, serverIp);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_notifConfigRemoteModel, userAgent);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_notifConfigRemoteModel, operation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEnabled() {
        return _enabled;
    }

    @Override
    public void setEnabled(String enabled) {
        _enabled = enabled;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setEnabled", String.class);

                method.invoke(_notifConfigRemoteModel, enabled);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMsgEn() {
        return _msgEn;
    }

    @Override
    public void setMsgEn(String msgEn) {
        _msgEn = msgEn;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setMsgEn", String.class);

                method.invoke(_notifConfigRemoteModel, msgEn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMsgAr() {
        return _msgAr;
    }

    @Override
    public void setMsgAr(String msgAr) {
        _msgAr = msgAr;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setMsgAr", String.class);

                method.invoke(_notifConfigRemoteModel, msgAr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParam1() {
        return _param1;
    }

    @Override
    public void setParam1(String param1) {
        _param1 = param1;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setParam1", String.class);

                method.invoke(_notifConfigRemoteModel, param1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParam2() {
        return _param2;
    }

    @Override
    public void setParam2(String param2) {
        _param2 = param2;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setParam2", String.class);

                method.invoke(_notifConfigRemoteModel, param2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParam3() {
        return _param3;
    }

    @Override
    public void setParam3(String param3) {
        _param3 = param3;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setParam3", String.class);

                method.invoke(_notifConfigRemoteModel, param3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParam4() {
        return _param4;
    }

    @Override
    public void setParam4(String param4) {
        _param4 = param4;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setParam4", String.class);

                method.invoke(_notifConfigRemoteModel, param4);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParam5() {
        return _param5;
    }

    @Override
    public void setParam5(String param5) {
        _param5 = param5;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setParam5", String.class);

                method.invoke(_notifConfigRemoteModel, param5);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDecriptiveNameEn() {
        return _decriptiveNameEn;
    }

    @Override
    public void setDecriptiveNameEn(String decriptiveNameEn) {
        _decriptiveNameEn = decriptiveNameEn;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setDecriptiveNameEn",
                        String.class);

                method.invoke(_notifConfigRemoteModel, decriptiveNameEn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDecriptiveNameAr() {
        return _decriptiveNameAr;
    }

    @Override
    public void setDecriptiveNameAr(String decriptiveNameAr) {
        _decriptiveNameAr = decriptiveNameAr;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setDecriptiveNameAr",
                        String.class);

                method.invoke(_notifConfigRemoteModel, decriptiveNameAr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNotifName() {
        return _notifName;
    }

    @Override
    public void setNotifName(String notifName) {
        _notifName = notifName;

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setNotifName", String.class);

                method.invoke(_notifConfigRemoteModel, notifName);
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

        if (_notifConfigRemoteModel != null) {
            try {
                Class<?> clazz = _notifConfigRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_notifConfigRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public java.lang.String getArMsgWithParams() {
        try {
            String methodName = "getArMsgWithParams";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getEnMsgWithParams() {
        try {
            String methodName = "getEnMsgWithParams";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getNotifConfigRemoteModel() {
        return _notifConfigRemoteModel;
    }

    public void setNotifConfigRemoteModel(BaseModel<?> notifConfigRemoteModel) {
        _notifConfigRemoteModel = notifConfigRemoteModel;
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

        Class<?> remoteModelClass = _notifConfigRemoteModel.getClass();

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

        Object returnValue = method.invoke(_notifConfigRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            NotifConfigLocalServiceUtil.addNotifConfig(this);
        } else {
            NotifConfigLocalServiceUtil.updateNotifConfig(this);
        }
    }

    @Override
    public NotifConfig toEscapedModel() {
        return (NotifConfig) ProxyUtil.newProxyInstance(NotifConfig.class.getClassLoader(),
            new Class[] { NotifConfig.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        NotifConfigClp clone = new NotifConfigClp();

        clone.setNotifId(getNotifId());
        clone.setTransId(getTransId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setStatus(getStatus());
        clone.setActive(getActive());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setClientIp(getClientIp());
        clone.setServerIp(getServerIp());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());
        clone.setEnabled(getEnabled());
        clone.setMsgEn(getMsgEn());
        clone.setMsgAr(getMsgAr());
        clone.setParam1(getParam1());
        clone.setParam2(getParam2());
        clone.setParam3(getParam3());
        clone.setParam4(getParam4());
        clone.setParam5(getParam5());
        clone.setDecriptiveNameEn(getDecriptiveNameEn());
        clone.setDecriptiveNameAr(getDecriptiveNameAr());
        clone.setNotifName(getNotifName());
        clone.setServiceId(getServiceId());

        return clone;
    }

    @Override
    public int compareTo(NotifConfig notifConfig) {
        int value = 0;

        value = getNotifName().compareTo(notifConfig.getNotifName());

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

        if (!(obj instanceof NotifConfigClp)) {
            return false;
        }

        NotifConfigClp notifConfig = (NotifConfigClp) obj;

        long primaryKey = notifConfig.getPrimaryKey();

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
        StringBundler sb = new StringBundler(49);

        sb.append("{notifId=");
        sb.append(getNotifId());
        sb.append(", transId=");
        sb.append(getTransId());
        sb.append(", lastUpdateTimestamp=");
        sb.append(getLastUpdateTimestamp());
        sb.append(", lastUpdateUserid=");
        sb.append(getLastUpdateUserid());
        sb.append(", lastUpdateUsername=");
        sb.append(getLastUpdateUsername());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", active=");
        sb.append(getActive());
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
        sb.append(", enabled=");
        sb.append(getEnabled());
        sb.append(", msgEn=");
        sb.append(getMsgEn());
        sb.append(", msgAr=");
        sb.append(getMsgAr());
        sb.append(", param1=");
        sb.append(getParam1());
        sb.append(", param2=");
        sb.append(getParam2());
        sb.append(", param3=");
        sb.append(getParam3());
        sb.append(", param4=");
        sb.append(getParam4());
        sb.append(", param5=");
        sb.append(getParam5());
        sb.append(", decriptiveNameEn=");
        sb.append(getDecriptiveNameEn());
        sb.append(", decriptiveNameAr=");
        sb.append(getDecriptiveNameAr());
        sb.append(", notifName=");
        sb.append(getNotifName());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(76);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.NotifConfig");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>notifId</column-name><column-value><![CDATA[");
        sb.append(getNotifId());
        sb.append("]]></column-value></column>");
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
            "<column><column-name>active</column-name><column-value><![CDATA[");
        sb.append(getActive());
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
            "<column><column-name>enabled</column-name><column-value><![CDATA[");
        sb.append(getEnabled());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>msgEn</column-name><column-value><![CDATA[");
        sb.append(getMsgEn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>msgAr</column-name><column-value><![CDATA[");
        sb.append(getMsgAr());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>param1</column-name><column-value><![CDATA[");
        sb.append(getParam1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>param2</column-name><column-value><![CDATA[");
        sb.append(getParam2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>param3</column-name><column-value><![CDATA[");
        sb.append(getParam3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>param4</column-name><column-value><![CDATA[");
        sb.append(getParam4());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>param5</column-name><column-value><![CDATA[");
        sb.append(getParam5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>decriptiveNameEn</column-name><column-value><![CDATA[");
        sb.append(getDecriptiveNameEn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>decriptiveNameAr</column-name><column-value><![CDATA[");
        sb.append(getDecriptiveNameAr());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>notifName</column-name><column-value><![CDATA[");
        sb.append(getNotifName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
