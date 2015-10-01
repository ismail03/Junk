package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.TransactionStatusLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class TransactionStatusClp extends BaseModelImpl<TransactionStatus>
    implements TransactionStatus {
    private long _id;
    private String _description;
    private String _descriptiveNameEn;
    private String _descriptiveNameAr;
    private BaseModel<?> _transactionStatusRemoteModel;

    public TransactionStatusClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return TransactionStatus.class;
    }

    @Override
    public String getModelClassName() {
        return TransactionStatus.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("description", getDescription());
        attributes.put("descriptiveNameEn", getDescriptiveNameEn());
        attributes.put("descriptiveNameAr", getDescriptiveNameAr());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
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
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_transactionStatusRemoteModel != null) {
            try {
                Class<?> clazz = _transactionStatusRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_transactionStatusRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_transactionStatusRemoteModel != null) {
            try {
                Class<?> clazz = _transactionStatusRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_transactionStatusRemoteModel, description);
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

        if (_transactionStatusRemoteModel != null) {
            try {
                Class<?> clazz = _transactionStatusRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptiveNameEn",
                        String.class);

                method.invoke(_transactionStatusRemoteModel, descriptiveNameEn);
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

        if (_transactionStatusRemoteModel != null) {
            try {
                Class<?> clazz = _transactionStatusRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptiveNameAr",
                        String.class);

                method.invoke(_transactionStatusRemoteModel, descriptiveNameAr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTransactionStatusRemoteModel() {
        return _transactionStatusRemoteModel;
    }

    public void setTransactionStatusRemoteModel(
        BaseModel<?> transactionStatusRemoteModel) {
        _transactionStatusRemoteModel = transactionStatusRemoteModel;
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

        Class<?> remoteModelClass = _transactionStatusRemoteModel.getClass();

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

        Object returnValue = method.invoke(_transactionStatusRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TransactionStatusLocalServiceUtil.addTransactionStatus(this);
        } else {
            TransactionStatusLocalServiceUtil.updateTransactionStatus(this);
        }
    }

    @Override
    public TransactionStatus toEscapedModel() {
        return (TransactionStatus) ProxyUtil.newProxyInstance(TransactionStatus.class.getClassLoader(),
            new Class[] { TransactionStatus.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TransactionStatusClp clone = new TransactionStatusClp();

        clone.setId(getId());
        clone.setDescription(getDescription());
        clone.setDescriptiveNameEn(getDescriptiveNameEn());
        clone.setDescriptiveNameAr(getDescriptiveNameAr());

        return clone;
    }

    @Override
    public int compareTo(TransactionStatus transactionStatus) {
        int value = 0;

        if (getId() < transactionStatus.getId()) {
            value = -1;
        } else if (getId() > transactionStatus.getId()) {
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

        if (!(obj instanceof TransactionStatusClp)) {
            return false;
        }

        TransactionStatusClp transactionStatus = (TransactionStatusClp) obj;

        long primaryKey = transactionStatus.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", descriptiveNameEn=");
        sb.append(getDescriptiveNameEn());
        sb.append(", descriptiveNameAr=");
        sb.append(getDescriptiveNameAr());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.TransactionStatus");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
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
