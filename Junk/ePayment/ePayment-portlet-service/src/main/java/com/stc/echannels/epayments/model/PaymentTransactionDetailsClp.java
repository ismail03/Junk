package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentTransactionDetailsLocalServiceUtil;
import com.stc.echannels.epayments.service.persistence.PaymentTransactionDetailsPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PaymentTransactionDetailsClp extends BaseModelImpl<PaymentTransactionDetails>
    implements PaymentTransactionDetails {
    private String _epayTransId;
    private String _epayInstanceId;
    private String _accountNumber;
    private long _serviceTypeId;
    private long _transAmount;
    private String _transValue;
    private Date _processDate;
    private String _serviceNumber;
    private String _idType;
    private String _recipientId;
    private String _recipientIdType;
    private String _notificationNumber;
    private String _processStatus;
    private String _serviceCategory;
    private String _reasonCode;
    private String _nativeReasonCode;
    private BaseModel<?> _paymentTransactionDetailsRemoteModel;

    public PaymentTransactionDetailsClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentTransactionDetails.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentTransactionDetails.class.getName();
    }

    @Override
    public PaymentTransactionDetailsPK getPrimaryKey() {
        return new PaymentTransactionDetailsPK(_epayTransId, _epayInstanceId);
    }

    @Override
    public void setPrimaryKey(PaymentTransactionDetailsPK primaryKey) {
        setEpayTransId(primaryKey.epayTransId);
        setEpayInstanceId(primaryKey.epayInstanceId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new PaymentTransactionDetailsPK(_epayTransId, _epayInstanceId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((PaymentTransactionDetailsPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("epayTransId", getEpayTransId());
        attributes.put("epayInstanceId", getEpayInstanceId());
        attributes.put("accountNumber", getAccountNumber());
        attributes.put("serviceTypeId", getServiceTypeId());
        attributes.put("transAmount", getTransAmount());
        attributes.put("transValue", getTransValue());
        attributes.put("processDate", getProcessDate());
        attributes.put("serviceNumber", getServiceNumber());
        attributes.put("idType", getIdType());
        attributes.put("recipientId", getRecipientId());
        attributes.put("recipientIdType", getRecipientIdType());
        attributes.put("notificationNumber", getNotificationNumber());
        attributes.put("processStatus", getProcessStatus());
        attributes.put("serviceCategory", getServiceCategory());
        attributes.put("reasonCode", getReasonCode());
        attributes.put("nativeReasonCode", getNativeReasonCode());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String epayTransId = (String) attributes.get("epayTransId");

        if (epayTransId != null) {
            setEpayTransId(epayTransId);
        }

        String epayInstanceId = (String) attributes.get("epayInstanceId");

        if (epayInstanceId != null) {
            setEpayInstanceId(epayInstanceId);
        }

        String accountNumber = (String) attributes.get("accountNumber");

        if (accountNumber != null) {
            setAccountNumber(accountNumber);
        }

        Long serviceTypeId = (Long) attributes.get("serviceTypeId");

        if (serviceTypeId != null) {
            setServiceTypeId(serviceTypeId);
        }

        Long transAmount = (Long) attributes.get("transAmount");

        if (transAmount != null) {
            setTransAmount(transAmount);
        }

        String transValue = (String) attributes.get("transValue");

        if (transValue != null) {
            setTransValue(transValue);
        }

        Date processDate = (Date) attributes.get("processDate");

        if (processDate != null) {
            setProcessDate(processDate);
        }

        String serviceNumber = (String) attributes.get("serviceNumber");

        if (serviceNumber != null) {
            setServiceNumber(serviceNumber);
        }

        String idType = (String) attributes.get("idType");

        if (idType != null) {
            setIdType(idType);
        }

        String recipientId = (String) attributes.get("recipientId");

        if (recipientId != null) {
            setRecipientId(recipientId);
        }

        String recipientIdType = (String) attributes.get("recipientIdType");

        if (recipientIdType != null) {
            setRecipientIdType(recipientIdType);
        }

        String notificationNumber = (String) attributes.get(
                "notificationNumber");

        if (notificationNumber != null) {
            setNotificationNumber(notificationNumber);
        }

        String processStatus = (String) attributes.get("processStatus");

        if (processStatus != null) {
            setProcessStatus(processStatus);
        }

        String serviceCategory = (String) attributes.get("serviceCategory");

        if (serviceCategory != null) {
            setServiceCategory(serviceCategory);
        }

        String reasonCode = (String) attributes.get("reasonCode");

        if (reasonCode != null) {
            setReasonCode(reasonCode);
        }

        String nativeReasonCode = (String) attributes.get("nativeReasonCode");

        if (nativeReasonCode != null) {
            setNativeReasonCode(nativeReasonCode);
        }
    }

    @Override
    public String getEpayTransId() {
        return _epayTransId;
    }

    @Override
    public void setEpayTransId(String epayTransId) {
        _epayTransId = epayTransId;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setEpayTransId", String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel, epayTransId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEpayInstanceId() {
        return _epayInstanceId;
    }

    @Override
    public void setEpayInstanceId(String epayInstanceId) {
        _epayInstanceId = epayInstanceId;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setEpayInstanceId",
                        String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    epayInstanceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAccountNumber() {
        return _accountNumber;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        _accountNumber = accountNumber;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setAccountNumber", String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    accountNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceTypeId", long.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    serviceTypeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTransAmount() {
        return _transAmount;
    }

    @Override
    public void setTransAmount(long transAmount) {
        _transAmount = transAmount;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setTransAmount", long.class);

                method.invoke(_paymentTransactionDetailsRemoteModel, transAmount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTransValue() {
        return _transValue;
    }

    @Override
    public void setTransValue(String transValue) {
        _transValue = transValue;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setTransValue", String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel, transValue);
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

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setProcessDate", Date.class);

                method.invoke(_paymentTransactionDetailsRemoteModel, processDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceNumber() {
        return _serviceNumber;
    }

    @Override
    public void setServiceNumber(String serviceNumber) {
        _serviceNumber = serviceNumber;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceNumber", String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    serviceNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIdType() {
        return _idType;
    }

    @Override
    public void setIdType(String idType) {
        _idType = idType;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setIdType", String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel, idType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRecipientId() {
        return _recipientId;
    }

    @Override
    public void setRecipientId(String recipientId) {
        _recipientId = recipientId;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setRecipientId", String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel, recipientId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRecipientIdType() {
        return _recipientIdType;
    }

    @Override
    public void setRecipientIdType(String recipientIdType) {
        _recipientIdType = recipientIdType;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setRecipientIdType",
                        String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    recipientIdType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNotificationNumber() {
        return _notificationNumber;
    }

    @Override
    public void setNotificationNumber(String notificationNumber) {
        _notificationNumber = notificationNumber;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setNotificationNumber",
                        String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    notificationNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProcessStatus() {
        return _processStatus;
    }

    @Override
    public void setProcessStatus(String processStatus) {
        _processStatus = processStatus;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setProcessStatus", String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    processStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceCategory() {
        return _serviceCategory;
    }

    @Override
    public void setServiceCategory(String serviceCategory) {
        _serviceCategory = serviceCategory;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceCategory",
                        String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    serviceCategory);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReasonCode() {
        return _reasonCode;
    }

    @Override
    public void setReasonCode(String reasonCode) {
        _reasonCode = reasonCode;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setReasonCode", String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel, reasonCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNativeReasonCode() {
        return _nativeReasonCode;
    }

    @Override
    public void setNativeReasonCode(String nativeReasonCode) {
        _nativeReasonCode = nativeReasonCode;

        if (_paymentTransactionDetailsRemoteModel != null) {
            try {
                Class<?> clazz = _paymentTransactionDetailsRemoteModel.getClass();

                Method method = clazz.getMethod("setNativeReasonCode",
                        String.class);

                method.invoke(_paymentTransactionDetailsRemoteModel,
                    nativeReasonCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaymentTransactionDetailsRemoteModel() {
        return _paymentTransactionDetailsRemoteModel;
    }

    public void setPaymentTransactionDetailsRemoteModel(
        BaseModel<?> paymentTransactionDetailsRemoteModel) {
        _paymentTransactionDetailsRemoteModel = paymentTransactionDetailsRemoteModel;
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

        Class<?> remoteModelClass = _paymentTransactionDetailsRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paymentTransactionDetailsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentTransactionDetailsLocalServiceUtil.addPaymentTransactionDetails(this);
        } else {
            PaymentTransactionDetailsLocalServiceUtil.updatePaymentTransactionDetails(this);
        }
    }

    @Override
    public PaymentTransactionDetails toEscapedModel() {
        return (PaymentTransactionDetails) ProxyUtil.newProxyInstance(PaymentTransactionDetails.class.getClassLoader(),
            new Class[] { PaymentTransactionDetails.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentTransactionDetailsClp clone = new PaymentTransactionDetailsClp();

        clone.setEpayTransId(getEpayTransId());
        clone.setEpayInstanceId(getEpayInstanceId());
        clone.setAccountNumber(getAccountNumber());
        clone.setServiceTypeId(getServiceTypeId());
        clone.setTransAmount(getTransAmount());
        clone.setTransValue(getTransValue());
        clone.setProcessDate(getProcessDate());
        clone.setServiceNumber(getServiceNumber());
        clone.setIdType(getIdType());
        clone.setRecipientId(getRecipientId());
        clone.setRecipientIdType(getRecipientIdType());
        clone.setNotificationNumber(getNotificationNumber());
        clone.setProcessStatus(getProcessStatus());
        clone.setServiceCategory(getServiceCategory());
        clone.setReasonCode(getReasonCode());
        clone.setNativeReasonCode(getNativeReasonCode());

        return clone;
    }

    @Override
    public int compareTo(PaymentTransactionDetails paymentTransactionDetails) {
        PaymentTransactionDetailsPK primaryKey = paymentTransactionDetails.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaymentTransactionDetailsClp)) {
            return false;
        }

        PaymentTransactionDetailsClp paymentTransactionDetails = (PaymentTransactionDetailsClp) obj;

        PaymentTransactionDetailsPK primaryKey = paymentTransactionDetails.getPrimaryKey();

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
        StringBundler sb = new StringBundler(33);

        sb.append("{epayTransId=");
        sb.append(getEpayTransId());
        sb.append(", epayInstanceId=");
        sb.append(getEpayInstanceId());
        sb.append(", accountNumber=");
        sb.append(getAccountNumber());
        sb.append(", serviceTypeId=");
        sb.append(getServiceTypeId());
        sb.append(", transAmount=");
        sb.append(getTransAmount());
        sb.append(", transValue=");
        sb.append(getTransValue());
        sb.append(", processDate=");
        sb.append(getProcessDate());
        sb.append(", serviceNumber=");
        sb.append(getServiceNumber());
        sb.append(", idType=");
        sb.append(getIdType());
        sb.append(", recipientId=");
        sb.append(getRecipientId());
        sb.append(", recipientIdType=");
        sb.append(getRecipientIdType());
        sb.append(", notificationNumber=");
        sb.append(getNotificationNumber());
        sb.append(", processStatus=");
        sb.append(getProcessStatus());
        sb.append(", serviceCategory=");
        sb.append(getServiceCategory());
        sb.append(", reasonCode=");
        sb.append(getReasonCode());
        sb.append(", nativeReasonCode=");
        sb.append(getNativeReasonCode());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(52);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentTransactionDetails");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>epayTransId</column-name><column-value><![CDATA[");
        sb.append(getEpayTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>epayInstanceId</column-name><column-value><![CDATA[");
        sb.append(getEpayInstanceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>accountNumber</column-name><column-value><![CDATA[");
        sb.append(getAccountNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceTypeId</column-name><column-value><![CDATA[");
        sb.append(getServiceTypeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transAmount</column-name><column-value><![CDATA[");
        sb.append(getTransAmount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transValue</column-name><column-value><![CDATA[");
        sb.append(getTransValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>processDate</column-name><column-value><![CDATA[");
        sb.append(getProcessDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceNumber</column-name><column-value><![CDATA[");
        sb.append(getServiceNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idType</column-name><column-value><![CDATA[");
        sb.append(getIdType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>recipientId</column-name><column-value><![CDATA[");
        sb.append(getRecipientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>recipientIdType</column-name><column-value><![CDATA[");
        sb.append(getRecipientIdType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>notificationNumber</column-name><column-value><![CDATA[");
        sb.append(getNotificationNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>processStatus</column-name><column-value><![CDATA[");
        sb.append(getProcessStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceCategory</column-name><column-value><![CDATA[");
        sb.append(getServiceCategory());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>reasonCode</column-name><column-value><![CDATA[");
        sb.append(getReasonCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nativeReasonCode</column-name><column-value><![CDATA[");
        sb.append(getNativeReasonCode());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
