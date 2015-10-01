package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.InRechargeHistoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class InRechargeHistoryClp extends BaseModelImpl<InRechargeHistory>
    implements InRechargeHistory {
    private String _msisdn;
    private String _transactionId;
    private String _cardGroup;
    private String _serviceClass;
    private BaseModel<?> _inRechargeHistoryRemoteModel;

    public InRechargeHistoryClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return InRechargeHistory.class;
    }

    @Override
    public String getModelClassName() {
        return InRechargeHistory.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _msisdn;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setMsisdn(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _msisdn;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("msisdn", getMsisdn());
        attributes.put("transactionId", getTransactionId());
        attributes.put("cardGroup", getCardGroup());
        attributes.put("serviceClass", getServiceClass());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String msisdn = (String) attributes.get("msisdn");

        if (msisdn != null) {
            setMsisdn(msisdn);
        }

        String transactionId = (String) attributes.get("transactionId");

        if (transactionId != null) {
            setTransactionId(transactionId);
        }

        String cardGroup = (String) attributes.get("cardGroup");

        if (cardGroup != null) {
            setCardGroup(cardGroup);
        }

        String serviceClass = (String) attributes.get("serviceClass");

        if (serviceClass != null) {
            setServiceClass(serviceClass);
        }
    }

    @Override
    public String getMsisdn() {
        return _msisdn;
    }

    @Override
    public void setMsisdn(String msisdn) {
        _msisdn = msisdn;

        if (_inRechargeHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _inRechargeHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setMsisdn", String.class);

                method.invoke(_inRechargeHistoryRemoteModel, msisdn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTransactionId() {
        return _transactionId;
    }

    @Override
    public void setTransactionId(String transactionId) {
        _transactionId = transactionId;

        if (_inRechargeHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _inRechargeHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setTransactionId", String.class);

                method.invoke(_inRechargeHistoryRemoteModel, transactionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCardGroup() {
        return _cardGroup;
    }

    @Override
    public void setCardGroup(String cardGroup) {
        _cardGroup = cardGroup;

        if (_inRechargeHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _inRechargeHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setCardGroup", String.class);

                method.invoke(_inRechargeHistoryRemoteModel, cardGroup);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceClass() {
        return _serviceClass;
    }

    @Override
    public void setServiceClass(String serviceClass) {
        _serviceClass = serviceClass;

        if (_inRechargeHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _inRechargeHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceClass", String.class);

                method.invoke(_inRechargeHistoryRemoteModel, serviceClass);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getInRechargeHistoryRemoteModel() {
        return _inRechargeHistoryRemoteModel;
    }

    public void setInRechargeHistoryRemoteModel(
        BaseModel<?> inRechargeHistoryRemoteModel) {
        _inRechargeHistoryRemoteModel = inRechargeHistoryRemoteModel;
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

        Class<?> remoteModelClass = _inRechargeHistoryRemoteModel.getClass();

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

        Object returnValue = method.invoke(_inRechargeHistoryRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            InRechargeHistoryLocalServiceUtil.addInRechargeHistory(this);
        } else {
            InRechargeHistoryLocalServiceUtil.updateInRechargeHistory(this);
        }
    }

    @Override
    public InRechargeHistory toEscapedModel() {
        return (InRechargeHistory) ProxyUtil.newProxyInstance(InRechargeHistory.class.getClassLoader(),
            new Class[] { InRechargeHistory.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        InRechargeHistoryClp clone = new InRechargeHistoryClp();

        clone.setMsisdn(getMsisdn());
        clone.setTransactionId(getTransactionId());
        clone.setCardGroup(getCardGroup());
        clone.setServiceClass(getServiceClass());

        return clone;
    }

    @Override
    public int compareTo(InRechargeHistory inRechargeHistory) {
        int value = 0;

        value = getServiceClass().compareTo(inRechargeHistory.getServiceClass());

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

        if (!(obj instanceof InRechargeHistoryClp)) {
            return false;
        }

        InRechargeHistoryClp inRechargeHistory = (InRechargeHistoryClp) obj;

        String primaryKey = inRechargeHistory.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{msisdn=");
        sb.append(getMsisdn());
        sb.append(", transactionId=");
        sb.append(getTransactionId());
        sb.append(", cardGroup=");
        sb.append(getCardGroup());
        sb.append(", serviceClass=");
        sb.append(getServiceClass());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.InRechargeHistory");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>msisdn</column-name><column-value><![CDATA[");
        sb.append(getMsisdn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transactionId</column-name><column-value><![CDATA[");
        sb.append(getTransactionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cardGroup</column-name><column-value><![CDATA[");
        sb.append(getCardGroup());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceClass</column-name><column-value><![CDATA[");
        sb.append(getServiceClass());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
