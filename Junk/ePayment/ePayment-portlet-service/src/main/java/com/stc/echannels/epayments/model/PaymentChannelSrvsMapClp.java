package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentChannelSrvsMapLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PaymentChannelSrvsMapClp extends BaseModelImpl<PaymentChannelSrvsMap>
    implements PaymentChannelSrvsMap {
    private String _id;
    private long _serviceId;
    private long _channelId;
    private BaseModel<?> _paymentChannelSrvsMapRemoteModel;

    public PaymentChannelSrvsMapClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentChannelSrvsMap.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentChannelSrvsMap.class.getName();
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

        attributes.put("id", getId());
        attributes.put("serviceId", getServiceId());
        attributes.put("channelId", getChannelId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String id = (String) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }
    }

    @Override
    public String getId() {
        return _id;
    }

    @Override
    public void setId(String id) {
        _id = id;

        if (_paymentChannelSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setId", String.class);

                method.invoke(_paymentChannelSrvsMapRemoteModel, id);
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

        if (_paymentChannelSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_paymentChannelSrvsMapRemoteModel, serviceId);
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

        if (_paymentChannelSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _paymentChannelSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setChannelId", long.class);

                method.invoke(_paymentChannelSrvsMapRemoteModel, channelId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaymentChannelSrvsMapRemoteModel() {
        return _paymentChannelSrvsMapRemoteModel;
    }

    public void setPaymentChannelSrvsMapRemoteModel(
        BaseModel<?> paymentChannelSrvsMapRemoteModel) {
        _paymentChannelSrvsMapRemoteModel = paymentChannelSrvsMapRemoteModel;
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

        Class<?> remoteModelClass = _paymentChannelSrvsMapRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paymentChannelSrvsMapRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentChannelSrvsMapLocalServiceUtil.addPaymentChannelSrvsMap(this);
        } else {
            PaymentChannelSrvsMapLocalServiceUtil.updatePaymentChannelSrvsMap(this);
        }
    }

    @Override
    public PaymentChannelSrvsMap toEscapedModel() {
        return (PaymentChannelSrvsMap) ProxyUtil.newProxyInstance(PaymentChannelSrvsMap.class.getClassLoader(),
            new Class[] { PaymentChannelSrvsMap.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentChannelSrvsMapClp clone = new PaymentChannelSrvsMapClp();

        clone.setId(getId());
        clone.setServiceId(getServiceId());
        clone.setChannelId(getChannelId());

        return clone;
    }

    @Override
    public int compareTo(PaymentChannelSrvsMap paymentChannelSrvsMap) {
        String primaryKey = paymentChannelSrvsMap.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentChannelSrvsMapClp)) {
            return false;
        }

        PaymentChannelSrvsMapClp paymentChannelSrvsMap = (PaymentChannelSrvsMapClp) obj;

        String primaryKey = paymentChannelSrvsMap.getPrimaryKey();

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

        sb.append("{id=");
        sb.append(getId());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", channelId=");
        sb.append(getChannelId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentChannelSrvsMap");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>channelId</column-name><column-value><![CDATA[");
        sb.append(getChannelId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
