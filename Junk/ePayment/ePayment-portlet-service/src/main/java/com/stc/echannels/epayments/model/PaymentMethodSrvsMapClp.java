package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentMethodSrvsMapLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PaymentMethodSrvsMapClp extends BaseModelImpl<PaymentMethodSrvsMap>
    implements PaymentMethodSrvsMap {
    private String _id;
    private long _serviceId;
    private long _paymentMethodId;
    private BaseModel<?> _paymentMethodSrvsMapRemoteModel;

    public PaymentMethodSrvsMapClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentMethodSrvsMap.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentMethodSrvsMap.class.getName();
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
        attributes.put("paymentMethodId", getPaymentMethodId());

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

        Long paymentMethodId = (Long) attributes.get("paymentMethodId");

        if (paymentMethodId != null) {
            setPaymentMethodId(paymentMethodId);
        }
    }

    @Override
    public String getId() {
        return _id;
    }

    @Override
    public void setId(String id) {
        _id = id;

        if (_paymentMethodSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setId", String.class);

                method.invoke(_paymentMethodSrvsMapRemoteModel, id);
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

        if (_paymentMethodSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_paymentMethodSrvsMapRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPaymentMethodId() {
        return _paymentMethodId;
    }

    @Override
    public void setPaymentMethodId(long paymentMethodId) {
        _paymentMethodId = paymentMethodId;

        if (_paymentMethodSrvsMapRemoteModel != null) {
            try {
                Class<?> clazz = _paymentMethodSrvsMapRemoteModel.getClass();

                Method method = clazz.getMethod("setPaymentMethodId", long.class);

                method.invoke(_paymentMethodSrvsMapRemoteModel, paymentMethodId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaymentMethodSrvsMapRemoteModel() {
        return _paymentMethodSrvsMapRemoteModel;
    }

    public void setPaymentMethodSrvsMapRemoteModel(
        BaseModel<?> paymentMethodSrvsMapRemoteModel) {
        _paymentMethodSrvsMapRemoteModel = paymentMethodSrvsMapRemoteModel;
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

        Class<?> remoteModelClass = _paymentMethodSrvsMapRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paymentMethodSrvsMapRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentMethodSrvsMapLocalServiceUtil.addPaymentMethodSrvsMap(this);
        } else {
            PaymentMethodSrvsMapLocalServiceUtil.updatePaymentMethodSrvsMap(this);
        }
    }

    @Override
    public PaymentMethodSrvsMap toEscapedModel() {
        return (PaymentMethodSrvsMap) ProxyUtil.newProxyInstance(PaymentMethodSrvsMap.class.getClassLoader(),
            new Class[] { PaymentMethodSrvsMap.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentMethodSrvsMapClp clone = new PaymentMethodSrvsMapClp();

        clone.setId(getId());
        clone.setServiceId(getServiceId());
        clone.setPaymentMethodId(getPaymentMethodId());

        return clone;
    }

    @Override
    public int compareTo(PaymentMethodSrvsMap paymentMethodSrvsMap) {
        String primaryKey = paymentMethodSrvsMap.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentMethodSrvsMapClp)) {
            return false;
        }

        PaymentMethodSrvsMapClp paymentMethodSrvsMap = (PaymentMethodSrvsMapClp) obj;

        String primaryKey = paymentMethodSrvsMap.getPrimaryKey();

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
        sb.append(", paymentMethodId=");
        sb.append(getPaymentMethodId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentMethodSrvsMap");
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
            "<column><column-name>paymentMethodId</column-name><column-value><![CDATA[");
        sb.append(getPaymentMethodId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
