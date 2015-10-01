package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.RefundLogLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class RefundLogClp extends BaseModelImpl<RefundLog> implements RefundLog {
    private String _refundId;
    private String _epayTransId;
    private double _amount;
    private Date _submissionDate;
    private Date _approvalDate;
    private String _status;
    private BaseModel<?> _refundLogRemoteModel;

    public RefundLogClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RefundLog.class;
    }

    @Override
    public String getModelClassName() {
        return RefundLog.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _epayTransId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setEpayTransId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _epayTransId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("refundId", getRefundId());
        attributes.put("epayTransId", getEpayTransId());
        attributes.put("amount", getAmount());
        attributes.put("submissionDate", getSubmissionDate());
        attributes.put("approvalDate", getApprovalDate());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String refundId = (String) attributes.get("refundId");

        if (refundId != null) {
            setRefundId(refundId);
        }

        String epayTransId = (String) attributes.get("epayTransId");

        if (epayTransId != null) {
            setEpayTransId(epayTransId);
        }

        Double amount = (Double) attributes.get("amount");

        if (amount != null) {
            setAmount(amount);
        }

        Date submissionDate = (Date) attributes.get("submissionDate");

        if (submissionDate != null) {
            setSubmissionDate(submissionDate);
        }

        Date approvalDate = (Date) attributes.get("approvalDate");

        if (approvalDate != null) {
            setApprovalDate(approvalDate);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    @Override
    public String getRefundId() {
        return _refundId;
    }

    @Override
    public void setRefundId(String refundId) {
        _refundId = refundId;

        if (_refundLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundLogRemoteModel.getClass();

                Method method = clazz.getMethod("setRefundId", String.class);

                method.invoke(_refundLogRemoteModel, refundId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEpayTransId() {
        return _epayTransId;
    }

    @Override
    public void setEpayTransId(String epayTransId) {
        _epayTransId = epayTransId;

        if (_refundLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundLogRemoteModel.getClass();

                Method method = clazz.getMethod("setEpayTransId", String.class);

                method.invoke(_refundLogRemoteModel, epayTransId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getAmount() {
        return _amount;
    }

    @Override
    public void setAmount(double amount) {
        _amount = amount;

        if (_refundLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundLogRemoteModel.getClass();

                Method method = clazz.getMethod("setAmount", double.class);

                method.invoke(_refundLogRemoteModel, amount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getSubmissionDate() {
        return _submissionDate;
    }

    @Override
    public void setSubmissionDate(Date submissionDate) {
        _submissionDate = submissionDate;

        if (_refundLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundLogRemoteModel.getClass();

                Method method = clazz.getMethod("setSubmissionDate", Date.class);

                method.invoke(_refundLogRemoteModel, submissionDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getApprovalDate() {
        return _approvalDate;
    }

    @Override
    public void setApprovalDate(Date approvalDate) {
        _approvalDate = approvalDate;

        if (_refundLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundLogRemoteModel.getClass();

                Method method = clazz.getMethod("setApprovalDate", Date.class);

                method.invoke(_refundLogRemoteModel, approvalDate);
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

        if (_refundLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundLogRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_refundLogRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRefundLogRemoteModel() {
        return _refundLogRemoteModel;
    }

    public void setRefundLogRemoteModel(BaseModel<?> refundLogRemoteModel) {
        _refundLogRemoteModel = refundLogRemoteModel;
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

        Class<?> remoteModelClass = _refundLogRemoteModel.getClass();

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

        Object returnValue = method.invoke(_refundLogRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RefundLogLocalServiceUtil.addRefundLog(this);
        } else {
            RefundLogLocalServiceUtil.updateRefundLog(this);
        }
    }

    @Override
    public RefundLog toEscapedModel() {
        return (RefundLog) ProxyUtil.newProxyInstance(RefundLog.class.getClassLoader(),
            new Class[] { RefundLog.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RefundLogClp clone = new RefundLogClp();

        clone.setRefundId(getRefundId());
        clone.setEpayTransId(getEpayTransId());
        clone.setAmount(getAmount());
        clone.setSubmissionDate(getSubmissionDate());
        clone.setApprovalDate(getApprovalDate());
        clone.setStatus(getStatus());

        return clone;
    }

    @Override
    public int compareTo(RefundLog refundLog) {
        int value = 0;

        value = DateUtil.compareTo(getSubmissionDate(),
                refundLog.getSubmissionDate());

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

        if (!(obj instanceof RefundLogClp)) {
            return false;
        }

        RefundLogClp refundLog = (RefundLogClp) obj;

        String primaryKey = refundLog.getPrimaryKey();

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
        StringBundler sb = new StringBundler(13);

        sb.append("{refundId=");
        sb.append(getRefundId());
        sb.append(", epayTransId=");
        sb.append(getEpayTransId());
        sb.append(", amount=");
        sb.append(getAmount());
        sb.append(", submissionDate=");
        sb.append(getSubmissionDate());
        sb.append(", approvalDate=");
        sb.append(getApprovalDate());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.RefundLog");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>refundId</column-name><column-value><![CDATA[");
        sb.append(getRefundId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>epayTransId</column-name><column-value><![CDATA[");
        sb.append(getEpayTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>amount</column-name><column-value><![CDATA[");
        sb.append(getAmount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>submissionDate</column-name><column-value><![CDATA[");
        sb.append(getSubmissionDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>approvalDate</column-name><column-value><![CDATA[");
        sb.append(getApprovalDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
