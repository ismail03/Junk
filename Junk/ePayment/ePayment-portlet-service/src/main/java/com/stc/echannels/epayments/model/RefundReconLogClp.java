package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.RefundReconLogLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class RefundReconLogClp extends BaseModelImpl<RefundReconLog>
    implements RefundReconLog {
    private String _batchId;
    private long _serviceId;
    private String _refundId;
    private String _pmtBankId;
    private String _pmtSystemRefundTransId;
    private String _bankRefundTransId;
    private Date _effDt;
    private Date _processDate;
    private double _refundAmount;
    private String _refundStatusCode;
    private BaseModel<?> _refundReconLogRemoteModel;

    public RefundReconLogClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RefundReconLog.class;
    }

    @Override
    public String getModelClassName() {
        return RefundReconLog.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _batchId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setBatchId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _batchId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("batchId", getBatchId());
        attributes.put("serviceId", getServiceId());
        attributes.put("refundId", getRefundId());
        attributes.put("pmtBankId", getPmtBankId());
        attributes.put("pmtSystemRefundTransId", getPmtSystemRefundTransId());
        attributes.put("bankRefundTransId", getBankRefundTransId());
        attributes.put("effDt", getEffDt());
        attributes.put("processDate", getProcessDate());
        attributes.put("refundAmount", getRefundAmount());
        attributes.put("refundStatusCode", getRefundStatusCode());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String batchId = (String) attributes.get("batchId");

        if (batchId != null) {
            setBatchId(batchId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        String refundId = (String) attributes.get("refundId");

        if (refundId != null) {
            setRefundId(refundId);
        }

        String pmtBankId = (String) attributes.get("pmtBankId");

        if (pmtBankId != null) {
            setPmtBankId(pmtBankId);
        }

        String pmtSystemRefundTransId = (String) attributes.get(
                "pmtSystemRefundTransId");

        if (pmtSystemRefundTransId != null) {
            setPmtSystemRefundTransId(pmtSystemRefundTransId);
        }

        String bankRefundTransId = (String) attributes.get("bankRefundTransId");

        if (bankRefundTransId != null) {
            setBankRefundTransId(bankRefundTransId);
        }

        Date effDt = (Date) attributes.get("effDt");

        if (effDt != null) {
            setEffDt(effDt);
        }

        Date processDate = (Date) attributes.get("processDate");

        if (processDate != null) {
            setProcessDate(processDate);
        }

        Double refundAmount = (Double) attributes.get("refundAmount");

        if (refundAmount != null) {
            setRefundAmount(refundAmount);
        }

        String refundStatusCode = (String) attributes.get("refundStatusCode");

        if (refundStatusCode != null) {
            setRefundStatusCode(refundStatusCode);
        }
    }

    @Override
    public String getBatchId() {
        return _batchId;
    }

    @Override
    public void setBatchId(String batchId) {
        _batchId = batchId;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setBatchId", String.class);

                method.invoke(_refundReconLogRemoteModel, batchId);
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

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_refundReconLogRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRefundId() {
        return _refundId;
    }

    @Override
    public void setRefundId(String refundId) {
        _refundId = refundId;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setRefundId", String.class);

                method.invoke(_refundReconLogRemoteModel, refundId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPmtBankId() {
        return _pmtBankId;
    }

    @Override
    public void setPmtBankId(String pmtBankId) {
        _pmtBankId = pmtBankId;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtBankId", String.class);

                method.invoke(_refundReconLogRemoteModel, pmtBankId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPmtSystemRefundTransId() {
        return _pmtSystemRefundTransId;
    }

    @Override
    public void setPmtSystemRefundTransId(String pmtSystemRefundTransId) {
        _pmtSystemRefundTransId = pmtSystemRefundTransId;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtSystemRefundTransId",
                        String.class);

                method.invoke(_refundReconLogRemoteModel, pmtSystemRefundTransId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBankRefundTransId() {
        return _bankRefundTransId;
    }

    @Override
    public void setBankRefundTransId(String bankRefundTransId) {
        _bankRefundTransId = bankRefundTransId;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setBankRefundTransId",
                        String.class);

                method.invoke(_refundReconLogRemoteModel, bankRefundTransId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getEffDt() {
        return _effDt;
    }

    @Override
    public void setEffDt(Date effDt) {
        _effDt = effDt;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setEffDt", Date.class);

                method.invoke(_refundReconLogRemoteModel, effDt);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getProcessDate() {
        return _processDate;
    }

    @Override
    public void setProcessDate(Date processDate) {
        _processDate = processDate;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setProcessDate", Date.class);

                method.invoke(_refundReconLogRemoteModel, processDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getRefundAmount() {
        return _refundAmount;
    }

    @Override
    public void setRefundAmount(double refundAmount) {
        _refundAmount = refundAmount;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setRefundAmount", double.class);

                method.invoke(_refundReconLogRemoteModel, refundAmount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRefundStatusCode() {
        return _refundStatusCode;
    }

    @Override
    public void setRefundStatusCode(String refundStatusCode) {
        _refundStatusCode = refundStatusCode;

        if (_refundReconLogRemoteModel != null) {
            try {
                Class<?> clazz = _refundReconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setRefundStatusCode",
                        String.class);

                method.invoke(_refundReconLogRemoteModel, refundStatusCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRefundReconLogRemoteModel() {
        return _refundReconLogRemoteModel;
    }

    public void setRefundReconLogRemoteModel(
        BaseModel<?> refundReconLogRemoteModel) {
        _refundReconLogRemoteModel = refundReconLogRemoteModel;
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

        Class<?> remoteModelClass = _refundReconLogRemoteModel.getClass();

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

        Object returnValue = method.invoke(_refundReconLogRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RefundReconLogLocalServiceUtil.addRefundReconLog(this);
        } else {
            RefundReconLogLocalServiceUtil.updateRefundReconLog(this);
        }
    }

    @Override
    public RefundReconLog toEscapedModel() {
        return (RefundReconLog) ProxyUtil.newProxyInstance(RefundReconLog.class.getClassLoader(),
            new Class[] { RefundReconLog.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RefundReconLogClp clone = new RefundReconLogClp();

        clone.setBatchId(getBatchId());
        clone.setServiceId(getServiceId());
        clone.setRefundId(getRefundId());
        clone.setPmtBankId(getPmtBankId());
        clone.setPmtSystemRefundTransId(getPmtSystemRefundTransId());
        clone.setBankRefundTransId(getBankRefundTransId());
        clone.setEffDt(getEffDt());
        clone.setProcessDate(getProcessDate());
        clone.setRefundAmount(getRefundAmount());
        clone.setRefundStatusCode(getRefundStatusCode());

        return clone;
    }

    @Override
    public int compareTo(RefundReconLog refundReconLog) {
        int value = 0;

        value = DateUtil.compareTo(getProcessDate(),
                refundReconLog.getProcessDate());

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

        if (!(obj instanceof RefundReconLogClp)) {
            return false;
        }

        RefundReconLogClp refundReconLog = (RefundReconLogClp) obj;

        String primaryKey = refundReconLog.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{batchId=");
        sb.append(getBatchId());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", refundId=");
        sb.append(getRefundId());
        sb.append(", pmtBankId=");
        sb.append(getPmtBankId());
        sb.append(", pmtSystemRefundTransId=");
        sb.append(getPmtSystemRefundTransId());
        sb.append(", bankRefundTransId=");
        sb.append(getBankRefundTransId());
        sb.append(", effDt=");
        sb.append(getEffDt());
        sb.append(", processDate=");
        sb.append(getProcessDate());
        sb.append(", refundAmount=");
        sb.append(getRefundAmount());
        sb.append(", refundStatusCode=");
        sb.append(getRefundStatusCode());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.RefundReconLog");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>batchId</column-name><column-value><![CDATA[");
        sb.append(getBatchId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>refundId</column-name><column-value><![CDATA[");
        sb.append(getRefundId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtBankId</column-name><column-value><![CDATA[");
        sb.append(getPmtBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtSystemRefundTransId</column-name><column-value><![CDATA[");
        sb.append(getPmtSystemRefundTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankRefundTransId</column-name><column-value><![CDATA[");
        sb.append(getBankRefundTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>effDt</column-name><column-value><![CDATA[");
        sb.append(getEffDt());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>processDate</column-name><column-value><![CDATA[");
        sb.append(getProcessDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>refundAmount</column-name><column-value><![CDATA[");
        sb.append(getRefundAmount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>refundStatusCode</column-name><column-value><![CDATA[");
        sb.append(getRefundStatusCode());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
