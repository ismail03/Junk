package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PaymentSystemClp extends BaseModelImpl<PaymentSystem>
    implements PaymentSystem {
    private long _paymentSystemId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private Date _effectiveTimestamp;
    private String _systemName;
    private String _dateFormat;
    private BaseModel<?> _paymentSystemRemoteModel;

    public PaymentSystemClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentSystem.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentSystem.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _paymentSystemId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPaymentSystemId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _paymentSystemId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("paymentSystemId", getPaymentSystemId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("active", getActive());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("systemName", getSystemName());
        attributes.put("dateFormat", getDateFormat());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long paymentSystemId = (Long) attributes.get("paymentSystemId");

        if (paymentSystemId != null) {
            setPaymentSystemId(paymentSystemId);
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

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
        }

        String systemName = (String) attributes.get("systemName");

        if (systemName != null) {
            setSystemName(systemName);
        }

        String dateFormat = (String) attributes.get("dateFormat");

        if (dateFormat != null) {
            setDateFormat(dateFormat);
        }
    }

    @Override
    public long getPaymentSystemId() {
        return _paymentSystemId;
    }

    @Override
    public void setPaymentSystemId(long paymentSystemId) {
        _paymentSystemId = paymentSystemId;

        if (_paymentSystemRemoteModel != null) {
            try {
                Class<?> clazz = _paymentSystemRemoteModel.getClass();

                Method method = clazz.getMethod("setPaymentSystemId", long.class);

                method.invoke(_paymentSystemRemoteModel, paymentSystemId);
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

        if (_paymentSystemRemoteModel != null) {
            try {
                Class<?> clazz = _paymentSystemRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_paymentSystemRemoteModel, lastUpdateTimestamp);
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

        if (_paymentSystemRemoteModel != null) {
            try {
                Class<?> clazz = _paymentSystemRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_paymentSystemRemoteModel, lastUpdateUserid);
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

        if (_paymentSystemRemoteModel != null) {
            try {
                Class<?> clazz = _paymentSystemRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_paymentSystemRemoteModel, lastUpdateUsername);
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

        if (_paymentSystemRemoteModel != null) {
            try {
                Class<?> clazz = _paymentSystemRemoteModel.getClass();

                Method method = clazz.getMethod("setActive", String.class);

                method.invoke(_paymentSystemRemoteModel, active);
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

        if (_paymentSystemRemoteModel != null) {
            try {
                Class<?> clazz = _paymentSystemRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_paymentSystemRemoteModel, effectiveTimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSystemName() {
        return _systemName;
    }

    @Override
    public void setSystemName(String systemName) {
        _systemName = systemName;

        if (_paymentSystemRemoteModel != null) {
            try {
                Class<?> clazz = _paymentSystemRemoteModel.getClass();

                Method method = clazz.getMethod("setSystemName", String.class);

                method.invoke(_paymentSystemRemoteModel, systemName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDateFormat() {
        return _dateFormat;
    }

    @Override
    public void setDateFormat(String dateFormat) {
        _dateFormat = dateFormat;

        if (_paymentSystemRemoteModel != null) {
            try {
                Class<?> clazz = _paymentSystemRemoteModel.getClass();

                Method method = clazz.getMethod("setDateFormat", String.class);

                method.invoke(_paymentSystemRemoteModel, dateFormat);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaymentSystemRemoteModel() {
        return _paymentSystemRemoteModel;
    }

    public void setPaymentSystemRemoteModel(
        BaseModel<?> paymentSystemRemoteModel) {
        _paymentSystemRemoteModel = paymentSystemRemoteModel;
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

        Class<?> remoteModelClass = _paymentSystemRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paymentSystemRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentSystemLocalServiceUtil.addPaymentSystem(this);
        } else {
            PaymentSystemLocalServiceUtil.updatePaymentSystem(this);
        }
    }

    @Override
    public PaymentSystem toEscapedModel() {
        return (PaymentSystem) ProxyUtil.newProxyInstance(PaymentSystem.class.getClassLoader(),
            new Class[] { PaymentSystem.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentSystemClp clone = new PaymentSystemClp();

        clone.setPaymentSystemId(getPaymentSystemId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setActive(getActive());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setSystemName(getSystemName());
        clone.setDateFormat(getDateFormat());

        return clone;
    }

    @Override
    public int compareTo(PaymentSystem paymentSystem) {
        int value = 0;

        if (getPaymentSystemId() < paymentSystem.getPaymentSystemId()) {
            value = -1;
        } else if (getPaymentSystemId() > paymentSystem.getPaymentSystemId()) {
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

        if (!(obj instanceof PaymentSystemClp)) {
            return false;
        }

        PaymentSystemClp paymentSystem = (PaymentSystemClp) obj;

        long primaryKey = paymentSystem.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{paymentSystemId=");
        sb.append(getPaymentSystemId());
        sb.append(", lastUpdateTimestamp=");
        sb.append(getLastUpdateTimestamp());
        sb.append(", lastUpdateUserid=");
        sb.append(getLastUpdateUserid());
        sb.append(", lastUpdateUsername=");
        sb.append(getLastUpdateUsername());
        sb.append(", active=");
        sb.append(getActive());
        sb.append(", effectiveTimestamp=");
        sb.append(getEffectiveTimestamp());
        sb.append(", systemName=");
        sb.append(getSystemName());
        sb.append(", dateFormat=");
        sb.append(getDateFormat());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentSystem");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>paymentSystemId</column-name><column-value><![CDATA[");
        sb.append(getPaymentSystemId());
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
            "<column><column-name>effectiveTimestamp</column-name><column-value><![CDATA[");
        sb.append(getEffectiveTimestamp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>systemName</column-name><column-value><![CDATA[");
        sb.append(getSystemName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dateFormat</column-name><column-value><![CDATA[");
        sb.append(getDateFormat());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
