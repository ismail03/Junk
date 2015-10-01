package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentChannelSrLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PaymentChannelSrClp extends BaseModelImpl<PaymentChannelSr>
    implements PaymentChannelSr {
    private long _channelid;
    private long _serviceid;
    private String _id;
    private BaseModel<?> _paymentChannelSrRemoteModel;

    public PaymentChannelSrClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentChannelSr.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentChannelSr.class.getName();
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

        attributes.put("channelid", getChannelid());
        attributes.put("serviceid", getServiceid());
        attributes.put("id", getId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long channelid = (Long) attributes.get("channelid");

        if (channelid != null) {
            setChannelid(channelid);
        }

        Long serviceid = (Long) attributes.get("serviceid");

        if (serviceid != null) {
            setServiceid(serviceid);
        }

        String id = (String) attributes.get("id");

        if (id != null) {
            setId(id);
        }
    }

    @Override
    public long getChannelid() {
        return _channelid;
    }

    @Override
    public void setChannelid(long channelid) {
        _channelid = channelid;

        if (_paymentChannelSrRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelSrRemoteModel.getClass();

                Method method = clazz.getMethod("setChannelid", long.class);

                method.invoke(_paymentChannelSrRemoteModel, channelid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getServiceid() {
        return _serviceid;
    }

    @Override
    public void setServiceid(long serviceid) {
        _serviceid = serviceid;

        if (_paymentChannelSrRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelSrRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceid", long.class);

                method.invoke(_paymentChannelSrRemoteModel, serviceid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getId() {
        return _id;
    }

    @Override
    public void setId(String id) {
        _id = id;

        if (_paymentChannelSrRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelSrRemoteModel.getClass();

                Method method = clazz.getMethod("setId", String.class);

                method.invoke(_paymentChannelSrRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaymentChannelSrRemoteModel() {
        return _paymentChannelSrRemoteModel;
    }

    public void setPaymentChannelSrRemoteModel(
        BaseModel<?> paymentChannelSrRemoteModel) {
        _paymentChannelSrRemoteModel = paymentChannelSrRemoteModel;
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

        Class<?> remoteModelClass = _paymentChannelSrRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paymentChannelSrRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentChannelSrLocalServiceUtil.addPaymentChannelSr(this);
        } else {
            PaymentChannelSrLocalServiceUtil.updatePaymentChannelSr(this);
        }
    }

    @Override
    public PaymentChannelSr toEscapedModel() {
        return (PaymentChannelSr) ProxyUtil.newProxyInstance(PaymentChannelSr.class.getClassLoader(),
            new Class[] { PaymentChannelSr.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentChannelSrClp clone = new PaymentChannelSrClp();

        clone.setChannelid(getChannelid());
        clone.setServiceid(getServiceid());
        clone.setId(getId());

        return clone;
    }

    @Override
    public int compareTo(PaymentChannelSr paymentChannelSr) {
        String primaryKey = paymentChannelSr.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentChannelSrClp)) {
            return false;
        }

        PaymentChannelSrClp paymentChannelSr = (PaymentChannelSrClp) obj;

        String primaryKey = paymentChannelSr.getPrimaryKey();

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

        sb.append("{channelid=");
        sb.append(getChannelid());
        sb.append(", serviceid=");
        sb.append(getServiceid());
        sb.append(", id=");
        sb.append(getId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentChannelSr");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>channelid</column-name><column-value><![CDATA[");
        sb.append(getChannelid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceid</column-name><column-value><![CDATA[");
        sb.append(getServiceid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
