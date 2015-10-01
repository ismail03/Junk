package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PaymentChannelClp extends BaseModelImpl<PaymentChannel>
    implements PaymentChannel {
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private String _status;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private long _channelId;
    private String _channelType;
    private String _descriptiveNameEn;
    private String _descriptiveNameAr;
    private BaseModel<?> _paymentChannelRemoteModel;

    public PaymentChannelClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentChannel.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentChannel.class.getName();
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
        attributes.put("active", getActive());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("channelId", getChannelId());
        attributes.put("channelType", getChannelType());
        attributes.put("descriptiveNameEn", getDescriptiveNameEn());
        attributes.put("descriptiveNameAr", getDescriptiveNameAr());

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

        String active = (String) attributes.get("active");

        if (active != null) {
            setActive(active);
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

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        String channelType = (String) attributes.get("channelType");

        if (channelType != null) {
            setChannelType(channelType);
        }

        String descriptiveNameEn = (String) attributes.get("descriptiveNameEn");

        if (descriptiveNameEn != null) {
            setDescriptiveNameEn(descriptiveNameEn);
        }

        String descriptiveNameAr = (String) attributes.get("descriptiveNameAr");

        if (descriptiveNameAr != null) {
            setDescriptiveNameAr(descriptiveNameAr);
        }
    }

    @Override
    public String getTransId() {
        return _transId;
    }

    @Override
    public void setTransId(String transId) {
        _transId = transId;

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_paymentChannelRemoteModel, transId);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_paymentChannelRemoteModel, lastUpdateTimestamp);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_paymentChannelRemoteModel, lastUpdateUserid);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_paymentChannelRemoteModel, lastUpdateUsername);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setActive", String.class);

                method.invoke(_paymentChannelRemoteModel, active);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_paymentChannelRemoteModel, status);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_paymentChannelRemoteModel, effectiveTimestamp);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIp", String.class);

                method.invoke(_paymentChannelRemoteModel, clientIp);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIp", String.class);

                method.invoke(_paymentChannelRemoteModel, serverIp);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_paymentChannelRemoteModel, userAgent);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_paymentChannelRemoteModel, operation);
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

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setChannelId", long.class);

                method.invoke(_paymentChannelRemoteModel, channelId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getChannelType() {
        return _channelType;
    }

    @Override
    public void setChannelType(String channelType) {
        _channelType = channelType;

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setChannelType", String.class);

                method.invoke(_paymentChannelRemoteModel, channelType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescriptiveNameEn() {
        return _descriptiveNameEn;
    }

    @Override
    public void setDescriptiveNameEn(String descriptiveNameEn) {
        _descriptiveNameEn = descriptiveNameEn;

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptiveNameEn",
                        String.class);

                method.invoke(_paymentChannelRemoteModel, descriptiveNameEn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescriptiveNameAr() {
        return _descriptiveNameAr;
    }

    @Override
    public void setDescriptiveNameAr(String descriptiveNameAr) {
        _descriptiveNameAr = descriptiveNameAr;

        if (_paymentChannelRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptiveNameAr",
                        String.class);

                method.invoke(_paymentChannelRemoteModel, descriptiveNameAr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean isPaymentTransactionRecorded() {
        try {
            String methodName = "isPaymentTransactionRecorded";

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
    public void setPaymentTransactionRecorded(
        boolean isPaymentTransactionRecorded) {
        try {
            String methodName = "setPaymentTransactionRecorded";

            Class<?>[] parameterTypes = new Class<?>[] { boolean.class };

            Object[] parameterValues = new Object[] { isPaymentTransactionRecorded };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
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

    public BaseModel<?> getPaymentChannelRemoteModel() {
        return _paymentChannelRemoteModel;
    }

    public void setPaymentChannelRemoteModel(
        BaseModel<?> paymentChannelRemoteModel) {
        _paymentChannelRemoteModel = paymentChannelRemoteModel;
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

        Class<?> remoteModelClass = _paymentChannelRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paymentChannelRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentChannelLocalServiceUtil.addPaymentChannel(this);
        } else {
            PaymentChannelLocalServiceUtil.updatePaymentChannel(this);
        }
    }

    @Override
    public PaymentChannel toEscapedModel() {
        return (PaymentChannel) ProxyUtil.newProxyInstance(PaymentChannel.class.getClassLoader(),
            new Class[] { PaymentChannel.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentChannelClp clone = new PaymentChannelClp();

        clone.setTransId(getTransId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setActive(getActive());
        clone.setStatus(getStatus());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setClientIp(getClientIp());
        clone.setServerIp(getServerIp());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());
        clone.setChannelId(getChannelId());
        clone.setChannelType(getChannelType());
        clone.setDescriptiveNameEn(getDescriptiveNameEn());
        clone.setDescriptiveNameAr(getDescriptiveNameAr());

        return clone;
    }

    @Override
    public int compareTo(PaymentChannel paymentChannel) {
        int value = 0;

        value = getChannelType().compareTo(paymentChannel.getChannelType());

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

        if (!(obj instanceof PaymentChannelClp)) {
            return false;
        }

        PaymentChannelClp paymentChannel = (PaymentChannelClp) obj;

        String primaryKey = paymentChannel.getPrimaryKey();

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
        StringBundler sb = new StringBundler(31);

        sb.append("{transId=");
        sb.append(getTransId());
        sb.append(", lastUpdateTimestamp=");
        sb.append(getLastUpdateTimestamp());
        sb.append(", lastUpdateUserid=");
        sb.append(getLastUpdateUserid());
        sb.append(", lastUpdateUsername=");
        sb.append(getLastUpdateUsername());
        sb.append(", active=");
        sb.append(getActive());
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
        sb.append(", channelId=");
        sb.append(getChannelId());
        sb.append(", channelType=");
        sb.append(getChannelType());
        sb.append(", descriptiveNameEn=");
        sb.append(getDescriptiveNameEn());
        sb.append(", descriptiveNameAr=");
        sb.append(getDescriptiveNameAr());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentChannel");
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
            "<column><column-name>active</column-name><column-value><![CDATA[");
        sb.append(getActive());
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
            "<column><column-name>channelId</column-name><column-value><![CDATA[");
        sb.append(getChannelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>channelType</column-name><column-value><![CDATA[");
        sb.append(getChannelType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptiveNameEn</column-name><column-value><![CDATA[");
        sb.append(getDescriptiveNameEn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptiveNameAr</column-name><column-value><![CDATA[");
        sb.append(getDescriptiveNameAr());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
