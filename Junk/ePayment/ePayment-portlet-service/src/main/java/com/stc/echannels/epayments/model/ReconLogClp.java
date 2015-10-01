package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.ReconLogLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ReconLogClp extends BaseModelImpl<ReconLog> implements ReconLog {
    private String _paymentSystemTransId;
    private long _bankTransId;
    private double _transAmount;
    private String _paymentMethod;
    private String _paymentChannel;
    private String _pmtBankId;
    private Date _bankTransDate;
    private String _beneficiaryServiceNo;
    private long _serviceId;
    private String _paymentStatus;
    private BaseModel<?> _reconLogRemoteModel;

    public ReconLogClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return ReconLog.class;
    }

    @Override
    public String getModelClassName() {
        return ReconLog.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _paymentSystemTransId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setPaymentSystemTransId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _paymentSystemTransId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("paymentSystemTransId", getPaymentSystemTransId());
        attributes.put("bankTransId", getBankTransId());
        attributes.put("transAmount", getTransAmount());
        attributes.put("paymentMethod", getPaymentMethod());
        attributes.put("paymentChannel", getPaymentChannel());
        attributes.put("pmtBankId", getPmtBankId());
        attributes.put("bankTransDate", getBankTransDate());
        attributes.put("beneficiaryServiceNo", getBeneficiaryServiceNo());
        attributes.put("serviceId", getServiceId());
        attributes.put("paymentStatus", getPaymentStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String paymentSystemTransId = (String) attributes.get(
                "paymentSystemTransId");

        if (paymentSystemTransId != null) {
            setPaymentSystemTransId(paymentSystemTransId);
        }

        Long bankTransId = (Long) attributes.get("bankTransId");

        if (bankTransId != null) {
            setBankTransId(bankTransId);
        }

        Double transAmount = (Double) attributes.get("transAmount");

        if (transAmount != null) {
            setTransAmount(transAmount);
        }

        String paymentMethod = (String) attributes.get("paymentMethod");

        if (paymentMethod != null) {
            setPaymentMethod(paymentMethod);
        }

        String paymentChannel = (String) attributes.get("paymentChannel");

        if (paymentChannel != null) {
            setPaymentChannel(paymentChannel);
        }

        String pmtBankId = (String) attributes.get("pmtBankId");

        if (pmtBankId != null) {
            setPmtBankId(pmtBankId);
        }

        Date bankTransDate = (Date) attributes.get("bankTransDate");

        if (bankTransDate != null) {
            setBankTransDate(bankTransDate);
        }

        String beneficiaryServiceNo = (String) attributes.get(
                "beneficiaryServiceNo");

        if (beneficiaryServiceNo != null) {
            setBeneficiaryServiceNo(beneficiaryServiceNo);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        String paymentStatus = (String) attributes.get("paymentStatus");

        if (paymentStatus != null) {
            setPaymentStatus(paymentStatus);
        }
    }

    @Override
    public String getPaymentSystemTransId() {
        return _paymentSystemTransId;
    }

    @Override
    public void setPaymentSystemTransId(String paymentSystemTransId) {
        _paymentSystemTransId = paymentSystemTransId;

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setPaymentSystemTransId",
                        String.class);

                method.invoke(_reconLogRemoteModel, paymentSystemTransId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBankTransId() {
        return _bankTransId;
    }

    @Override
    public void setBankTransId(long bankTransId) {
        _bankTransId = bankTransId;

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setBankTransId", long.class);

                method.invoke(_reconLogRemoteModel, bankTransId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getTransAmount() {
        return _transAmount;
    }

    @Override
    public void setTransAmount(double transAmount) {
        _transAmount = transAmount;

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setTransAmount", double.class);

                method.invoke(_reconLogRemoteModel, transAmount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPaymentMethod() {
        return _paymentMethod;
    }

    @Override
    public void setPaymentMethod(String paymentMethod) {
        _paymentMethod = paymentMethod;

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setPaymentMethod", String.class);

                method.invoke(_reconLogRemoteModel, paymentMethod);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPaymentChannel() {
        return _paymentChannel;
    }

    @Override
    public void setPaymentChannel(String paymentChannel) {
        _paymentChannel = paymentChannel;

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setPaymentChannel",
                        String.class);

                method.invoke(_reconLogRemoteModel, paymentChannel);
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

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setPmtBankId", String.class);

                method.invoke(_reconLogRemoteModel, pmtBankId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getBankTransDate() {
        return _bankTransDate;
    }

    @Override
    public void setBankTransDate(Date bankTransDate) {
        _bankTransDate = bankTransDate;

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setBankTransDate", Date.class);

                method.invoke(_reconLogRemoteModel, bankTransDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBeneficiaryServiceNo() {
        return _beneficiaryServiceNo;
    }

    @Override
    public void setBeneficiaryServiceNo(String beneficiaryServiceNo) {
        _beneficiaryServiceNo = beneficiaryServiceNo;

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setBeneficiaryServiceNo",
                        String.class);

                method.invoke(_reconLogRemoteModel, beneficiaryServiceNo);
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

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_reconLogRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPaymentStatus() {
        return _paymentStatus;
    }

    @Override
    public void setPaymentStatus(String paymentStatus) {
        _paymentStatus = paymentStatus;

        if (_reconLogRemoteModel != null) {
            try {
                Class<?> clazz = _reconLogRemoteModel.getClass();

                Method method = clazz.getMethod("setPaymentStatus", String.class);

                method.invoke(_reconLogRemoteModel, paymentStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getReconLogRemoteModel() {
        return _reconLogRemoteModel;
    }

    public void setReconLogRemoteModel(BaseModel<?> reconLogRemoteModel) {
        _reconLogRemoteModel = reconLogRemoteModel;
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

        Class<?> remoteModelClass = _reconLogRemoteModel.getClass();

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

        Object returnValue = method.invoke(_reconLogRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ReconLogLocalServiceUtil.addReconLog(this);
        } else {
            ReconLogLocalServiceUtil.updateReconLog(this);
        }
    }

    @Override
    public ReconLog toEscapedModel() {
        return (ReconLog) ProxyUtil.newProxyInstance(ReconLog.class.getClassLoader(),
            new Class[] { ReconLog.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ReconLogClp clone = new ReconLogClp();

        clone.setPaymentSystemTransId(getPaymentSystemTransId());
        clone.setBankTransId(getBankTransId());
        clone.setTransAmount(getTransAmount());
        clone.setPaymentMethod(getPaymentMethod());
        clone.setPaymentChannel(getPaymentChannel());
        clone.setPmtBankId(getPmtBankId());
        clone.setBankTransDate(getBankTransDate());
        clone.setBeneficiaryServiceNo(getBeneficiaryServiceNo());
        clone.setServiceId(getServiceId());
        clone.setPaymentStatus(getPaymentStatus());

        return clone;
    }

    @Override
    public int compareTo(ReconLog reconLog) {
        int value = 0;

        value = getPaymentChannel().compareTo(reconLog.getPaymentChannel());

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

        if (!(obj instanceof ReconLogClp)) {
            return false;
        }

        ReconLogClp reconLog = (ReconLogClp) obj;

        String primaryKey = reconLog.getPrimaryKey();

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

        sb.append("{paymentSystemTransId=");
        sb.append(getPaymentSystemTransId());
        sb.append(", bankTransId=");
        sb.append(getBankTransId());
        sb.append(", transAmount=");
        sb.append(getTransAmount());
        sb.append(", paymentMethod=");
        sb.append(getPaymentMethod());
        sb.append(", paymentChannel=");
        sb.append(getPaymentChannel());
        sb.append(", pmtBankId=");
        sb.append(getPmtBankId());
        sb.append(", bankTransDate=");
        sb.append(getBankTransDate());
        sb.append(", beneficiaryServiceNo=");
        sb.append(getBeneficiaryServiceNo());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", paymentStatus=");
        sb.append(getPaymentStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.ReconLog");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>paymentSystemTransId</column-name><column-value><![CDATA[");
        sb.append(getPaymentSystemTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankTransId</column-name><column-value><![CDATA[");
        sb.append(getBankTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transAmount</column-name><column-value><![CDATA[");
        sb.append(getTransAmount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paymentMethod</column-name><column-value><![CDATA[");
        sb.append(getPaymentMethod());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paymentChannel</column-name><column-value><![CDATA[");
        sb.append(getPaymentChannel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtBankId</column-name><column-value><![CDATA[");
        sb.append(getPmtBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankTransDate</column-name><column-value><![CDATA[");
        sb.append(getBankTransDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beneficiaryServiceNo</column-name><column-value><![CDATA[");
        sb.append(getBeneficiaryServiceNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paymentStatus</column-name><column-value><![CDATA[");
        sb.append(getPaymentStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
