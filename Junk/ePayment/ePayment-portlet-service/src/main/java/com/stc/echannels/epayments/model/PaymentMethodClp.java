package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PaymentMethodClp extends BaseModelImpl<PaymentMethod>
    implements PaymentMethod {
    private long _pmtMethodId;
    private String _status;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _descriptiveNameEn;
    private String _descriptiveNameAr;
    private String _pmtMethodIdType;
    private BaseModel<?> _paymentMethodRemoteModel;

    public PaymentMethodClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentMethod.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentMethod.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _pmtMethodId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPmtMethodId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _pmtMethodId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("pmtMethodId", getPmtMethodId());
        attributes.put("status", getStatus());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("descriptiveNameEn", getDescriptiveNameEn());
        attributes.put("descriptiveNameAr", getDescriptiveNameAr());
        attributes.put("pmtMethodIdType", getPmtMethodIdType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long pmtMethodId = (Long) attributes.get("pmtMethodId");

        if (pmtMethodId != null) {
            setPmtMethodId(pmtMethodId);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
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

        String descriptiveNameEn = (String) attributes.get("descriptiveNameEn");

        if (descriptiveNameEn != null) {
            setDescriptiveNameEn(descriptiveNameEn);
        }

        String descriptiveNameAr = (String) attributes.get("descriptiveNameAr");

        if (descriptiveNameAr != null) {
            setDescriptiveNameAr(descriptiveNameAr);
        }

        String pmtMethodIdType = (String) attributes.get("pmtMethodIdType");

        if (pmtMethodIdType != null) {
            setPmtMethodIdType(pmtMethodIdType);
        }
    }

    @Override
    public long getPmtMethodId() {
        return _pmtMethodId;
    }

    @Override
    public void setPmtMethodId(long pmtMethodId) {
        _pmtMethodId = pmtMethodId;

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtMethodId", long.class);

                method.invoke(_paymentMethodRemoteModel, pmtMethodId);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_paymentMethodRemoteModel, status);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_paymentMethodRemoteModel, lastUpdateTimestamp);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_paymentMethodRemoteModel, lastUpdateUserid);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_paymentMethodRemoteModel, lastUpdateUsername);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_paymentMethodRemoteModel, effectiveTimestamp);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIp", String.class);

                method.invoke(_paymentMethodRemoteModel, clientIp);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIp", String.class);

                method.invoke(_paymentMethodRemoteModel, serverIp);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_paymentMethodRemoteModel, userAgent);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_paymentMethodRemoteModel, operation);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptiveNameEn",
                        String.class);

                method.invoke(_paymentMethodRemoteModel, descriptiveNameEn);
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

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptiveNameAr",
                        String.class);

                method.invoke(_paymentMethodRemoteModel, descriptiveNameAr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPmtMethodIdType() {
        return _pmtMethodIdType;
    }

    @Override
    public void setPmtMethodIdType(String pmtMethodIdType) {
        _pmtMethodIdType = pmtMethodIdType;

        if (_paymentMethodRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtMethodIdType",
                        String.class);

                method.invoke(_paymentMethodRemoteModel, pmtMethodIdType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaymentMethodRemoteModel() {
        return _paymentMethodRemoteModel;
    }

    public void setPaymentMethodRemoteModel(
        BaseModel<?> paymentMethodRemoteModel) {
        _paymentMethodRemoteModel = paymentMethodRemoteModel;
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

        Class<?> remoteModelClass = _paymentMethodRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paymentMethodRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentMethodLocalServiceUtil.addPaymentMethod(this);
        } else {
            PaymentMethodLocalServiceUtil.updatePaymentMethod(this);
        }
    }

    @Override
    public PaymentMethod toEscapedModel() {
        return (PaymentMethod) ProxyUtil.newProxyInstance(PaymentMethod.class.getClassLoader(),
            new Class[] { PaymentMethod.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentMethodClp clone = new PaymentMethodClp();

        clone.setPmtMethodId(getPmtMethodId());
        clone.setStatus(getStatus());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setClientIp(getClientIp());
        clone.setServerIp(getServerIp());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());
        clone.setDescriptiveNameEn(getDescriptiveNameEn());
        clone.setDescriptiveNameAr(getDescriptiveNameAr());
        clone.setPmtMethodIdType(getPmtMethodIdType());

        return clone;
    }

    @Override
    public int compareTo(PaymentMethod paymentMethod) {
        int value = 0;

        if (getPmtMethodId() < paymentMethod.getPmtMethodId()) {
            value = -1;
        } else if (getPmtMethodId() > paymentMethod.getPmtMethodId()) {
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

        if (!(obj instanceof PaymentMethodClp)) {
            return false;
        }

        PaymentMethodClp paymentMethod = (PaymentMethodClp) obj;

        long primaryKey = paymentMethod.getPrimaryKey();

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
        StringBundler sb = new StringBundler(27);

        sb.append("{pmtMethodId=");
        sb.append(getPmtMethodId());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", lastUpdateTimestamp=");
        sb.append(getLastUpdateTimestamp());
        sb.append(", lastUpdateUserid=");
        sb.append(getLastUpdateUserid());
        sb.append(", lastUpdateUsername=");
        sb.append(getLastUpdateUsername());
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
        sb.append(", descriptiveNameEn=");
        sb.append(getDescriptiveNameEn());
        sb.append(", descriptiveNameAr=");
        sb.append(getDescriptiveNameAr());
        sb.append(", pmtMethodIdType=");
        sb.append(getPmtMethodIdType());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentMethod");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>pmtMethodId</column-name><column-value><![CDATA[");
        sb.append(getPmtMethodId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
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
            "<column><column-name>descriptiveNameEn</column-name><column-value><![CDATA[");
        sb.append(getDescriptiveNameEn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptiveNameAr</column-name><column-value><![CDATA[");
        sb.append(getDescriptiveNameAr());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtMethodIdType</column-name><column-value><![CDATA[");
        sb.append(getPmtMethodIdType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
