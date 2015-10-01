package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.BankLocalServiceUtil;
import com.stc.echannels.epayments.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BankClp extends BaseModelImpl<Bank> implements Bank {
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private Date _effectiveTimestamp;
    private String _status;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _bankId;
    private String _stcCode;
    private String _nameEn;
    private String _nameAr;
    private String _comments;
    private BaseModel<?> _bankRemoteModel;

    public BankClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Bank.class;
    }

    @Override
    public String getModelClassName() {
        return Bank.class.getName();
    }

    @Override
    public String getPrimaryKey() {
        return _transId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setTransId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _transId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("active", getActive());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("status", getStatus());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("bankId", getBankId());
        attributes.put("stcCode", getStcCode());
        attributes.put("nameEn", getNameEn());
        attributes.put("nameAr", getNameAr());
        attributes.put("comments", getComments());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
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

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        String clientIp = (String) attributes.get("clientIp");

        if (clientIp != null) {
            setClientIp(clientIp);
        }

        String serverIp = (String) attributes.get("serverIp");

        if (serverIp != null) {
            setServerIp(serverIp);
        }

        String userAgent = (String) attributes.get("userAgent");

        if (userAgent != null) {
            setUserAgent(userAgent);
        }

        String operation = (String) attributes.get("operation");

        if (operation != null) {
            setOperation(operation);
        }

        String bankId = (String) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        String stcCode = (String) attributes.get("stcCode");

        if (stcCode != null) {
            setStcCode(stcCode);
        }

        String nameEn = (String) attributes.get("nameEn");

        if (nameEn != null) {
            setNameEn(nameEn);
        }

        String nameAr = (String) attributes.get("nameAr");

        if (nameAr != null) {
            setNameAr(nameAr);
        }

        String comments = (String) attributes.get("comments");

        if (comments != null) {
            setComments(comments);
        }
    }

    @Override
    public String getTransId() {
        return _transId;
    }

    @Override
    public void setTransId(String transId) {
        _transId = transId;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_bankRemoteModel, transId);
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

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_bankRemoteModel, lastUpdateTimestamp);
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

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_bankRemoteModel, lastUpdateUserid);
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

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_bankRemoteModel, lastUpdateUsername);
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

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setActive", String.class);

                method.invoke(_bankRemoteModel, active);
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

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_bankRemoteModel, effectiveTimestamp);
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

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_bankRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getClientIp() {
        return _clientIp;
    }

    @Override
    public void setClientIp(String clientIp) {
        _clientIp = clientIp;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIp", String.class);

                method.invoke(_bankRemoteModel, clientIp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServerIp() {
        return _serverIp;
    }

    @Override
    public void setServerIp(String serverIp) {
        _serverIp = serverIp;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIp", String.class);

                method.invoke(_bankRemoteModel, serverIp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserAgent() {
        return _userAgent;
    }

    @Override
    public void setUserAgent(String userAgent) {
        _userAgent = userAgent;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_bankRemoteModel, userAgent);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOperation() {
        return _operation;
    }

    @Override
    public void setOperation(String operation) {
        _operation = operation;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_bankRemoteModel, operation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBankId() {
        return _bankId;
    }

    @Override
    public void setBankId(String bankId) {
        _bankId = bankId;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setBankId", String.class);

                method.invoke(_bankRemoteModel, bankId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStcCode() {
        return _stcCode;
    }

    @Override
    public void setStcCode(String stcCode) {
        _stcCode = stcCode;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setStcCode", String.class);

                method.invoke(_bankRemoteModel, stcCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNameEn() {
        return _nameEn;
    }

    @Override
    public void setNameEn(String nameEn) {
        _nameEn = nameEn;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setNameEn", String.class);

                method.invoke(_bankRemoteModel, nameEn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNameAr() {
        return _nameAr;
    }

    @Override
    public void setNameAr(String nameAr) {
        _nameAr = nameAr;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setNameAr", String.class);

                method.invoke(_bankRemoteModel, nameAr);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getComments() {
        return _comments;
    }

    @Override
    public void setComments(String comments) {
        _comments = comments;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setComments", String.class);

                method.invoke(_bankRemoteModel, comments);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean isPaymentTransactionRecorded() {
        try {
            String methodName = "isPaymentTransactionRecorded";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            Boolean returnObj = (Boolean) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setPaymentTransactionRecorded(
        boolean isPaymentTransactionRecorded) {
        try {
            String methodName = "setPaymentTransactionRecorded";

            Class<?>[] parameterTypes = new Class<?>[] { boolean.class };

            Object[] parameterValues = new Object[] { isPaymentTransactionRecorded };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getName(java.util.Locale locale) {
        try {
            String methodName = "getName";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.Locale.class };

            Object[] parameterValues = new Object[] { locale };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getBankRemoteModel() {
        return _bankRemoteModel;
    }

    public void setBankRemoteModel(BaseModel<?> bankRemoteModel) {
        _bankRemoteModel = bankRemoteModel;
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

        Class<?> remoteModelClass = _bankRemoteModel.getClass();

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

        Object returnValue = method.invoke(_bankRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BankLocalServiceUtil.addBank(this);
        } else {
            BankLocalServiceUtil.updateBank(this);
        }
    }

    @Override
    public Bank toEscapedModel() {
        return (Bank) ProxyUtil.newProxyInstance(Bank.class.getClassLoader(),
            new Class[] { Bank.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BankClp clone = new BankClp();

        clone.setTransId(getTransId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setActive(getActive());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setStatus(getStatus());
        clone.setClientIp(getClientIp());
        clone.setServerIp(getServerIp());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());
        clone.setBankId(getBankId());
        clone.setStcCode(getStcCode());
        clone.setNameEn(getNameEn());
        clone.setNameAr(getNameAr());
        clone.setComments(getComments());

        return clone;
    }

    @Override
    public int compareTo(Bank bank) {
        int value = 0;

        value = getBankId().compareTo(bank.getBankId());

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

        if (!(obj instanceof BankClp)) {
            return false;
        }

        BankClp bank = (BankClp) obj;

        String primaryKey = bank.getPrimaryKey();

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

        sb.append("{transId=");
        sb.append(getTransId());
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
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", clientIp=");
        sb.append(getClientIp());
        sb.append(", serverIp=");
        sb.append(getServerIp());
        sb.append(", userAgent=");
        sb.append(getUserAgent());
        sb.append(", operation=");
        sb.append(getOperation());
        sb.append(", bankId=");
        sb.append(getBankId());
        sb.append(", stcCode=");
        sb.append(getStcCode());
        sb.append(", nameEn=");
        sb.append(getNameEn());
        sb.append(", nameAr=");
        sb.append(getNameAr());
        sb.append(", comments=");
        sb.append(getComments());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(52);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.Bank");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>transId</column-name><column-value><![CDATA[");
        sb.append(getTransId());
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
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>clientIp</column-name><column-value><![CDATA[");
        sb.append(getClientIp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serverIp</column-name><column-value><![CDATA[");
        sb.append(getServerIp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userAgent</column-name><column-value><![CDATA[");
        sb.append(getUserAgent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>operation</column-name><column-value><![CDATA[");
        sb.append(getOperation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankId</column-name><column-value><![CDATA[");
        sb.append(getBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stcCode</column-name><column-value><![CDATA[");
        sb.append(getStcCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nameEn</column-name><column-value><![CDATA[");
        sb.append(getNameEn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nameAr</column-name><column-value><![CDATA[");
        sb.append(getNameAr());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>comments</column-name><column-value><![CDATA[");
        sb.append(getComments());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
