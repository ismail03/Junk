package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.BankBranchLocalServiceUtil;
import com.stc.echannels.epayments.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BankBranchClp extends BaseModelImpl<BankBranch>
    implements BankBranch {
    private String _transId;
    private String _stcBranchCode;
    private String _bankId;
    private long _channelId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private String _status;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private BaseModel<?> _bankBranchRemoteModel;

    public BankBranchClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return BankBranch.class;
    }

    @Override
    public String getModelClassName() {
        return BankBranch.class.getName();
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
        attributes.put("stcBranchCode", getStcBranchCode());
        attributes.put("bankId", getBankId());
        attributes.put("channelId", getChannelId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("active", getActive());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
        }

        String stcBranchCode = (String) attributes.get("stcBranchCode");

        if (stcBranchCode != null) {
            setStcBranchCode(stcBranchCode);
        }

        String bankId = (String) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
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

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
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
    }

    @Override
    public String getTransId() {
        return _transId;
    }

    @Override
    public void setTransId(String transId) {
        _transId = transId;

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_bankBranchRemoteModel, transId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStcBranchCode() {
        return _stcBranchCode;
    }

    @Override
    public void setStcBranchCode(String stcBranchCode) {
        _stcBranchCode = stcBranchCode;

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setStcBranchCode", String.class);

                method.invoke(_bankBranchRemoteModel, stcBranchCode);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setBankId", String.class);

                method.invoke(_bankBranchRemoteModel, bankId);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setChannelId", long.class);

                method.invoke(_bankBranchRemoteModel, channelId);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_bankBranchRemoteModel, lastUpdateTimestamp);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_bankBranchRemoteModel, lastUpdateUserid);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_bankBranchRemoteModel, lastUpdateUsername);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setActive", String.class);

                method.invoke(_bankBranchRemoteModel, active);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_bankBranchRemoteModel, status);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_bankBranchRemoteModel, effectiveTimestamp);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIp", String.class);

                method.invoke(_bankBranchRemoteModel, clientIp);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIp", String.class);

                method.invoke(_bankBranchRemoteModel, serverIp);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_bankBranchRemoteModel, userAgent);
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

        if (_bankBranchRemoteModel != null) {
            try {
                Class<?> clazz = _bankBranchRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_bankBranchRemoteModel, operation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public java.lang.String getBankNameEn() {
        try {
            String methodName = "getBankNameEn";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getBankNameAr() {
        try {
            String methodName = "getBankNameAr";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
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
    public void setBankNameAr(java.lang.String bankNameAr) {
        try {
            String methodName = "setBankNameAr";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { bankNameAr };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getPaymentChannelNameAr() {
        try {
            String methodName = "getPaymentChannelNameAr";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setBankNameEn(java.lang.String bankNameEn) {
        try {
            String methodName = "setBankNameEn";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { bankNameEn };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
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
    public void setPaymentChannelNameAr(java.lang.String paymentChannelNameAr) {
        try {
            String methodName = "setPaymentChannelNameAr";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { paymentChannelNameAr };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getPaymentChannelNameEn() {
        try {
            String methodName = "getPaymentChannelNameEn";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setStcBankCode(java.lang.String stcBankCode) {
        try {
            String methodName = "setStcBankCode";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { stcBankCode };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setPaymentChannelNameEn(java.lang.String paymentChannelNameEn) {
        try {
            String methodName = "setPaymentChannelNameEn";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.String.class };

            Object[] parameterValues = new Object[] { paymentChannelNameEn };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getStcBankCode() {
        try {
            String methodName = "getStcBankCode";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getBankBranchRemoteModel() {
        return _bankBranchRemoteModel;
    }

    public void setBankBranchRemoteModel(BaseModel<?> bankBranchRemoteModel) {
        _bankBranchRemoteModel = bankBranchRemoteModel;
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

        Class<?> remoteModelClass = _bankBranchRemoteModel.getClass();

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

        Object returnValue = method.invoke(_bankBranchRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BankBranchLocalServiceUtil.addBankBranch(this);
        } else {
            BankBranchLocalServiceUtil.updateBankBranch(this);
        }
    }

    @Override
    public BankBranch toEscapedModel() {
        return (BankBranch) ProxyUtil.newProxyInstance(BankBranch.class.getClassLoader(),
            new Class[] { BankBranch.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BankBranchClp clone = new BankBranchClp();

        clone.setTransId(getTransId());
        clone.setStcBranchCode(getStcBranchCode());
        clone.setBankId(getBankId());
        clone.setChannelId(getChannelId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setActive(getActive());
        clone.setStatus(getStatus());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setClientIp(getClientIp());
        clone.setServerIp(getServerIp());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());

        return clone;
    }

    @Override
    public int compareTo(BankBranch bankBranch) {
        int value = 0;

        value = getBankId().compareTo(bankBranch.getBankId());

        if (value != 0) {
            return value;
        }

        if (getChannelId() < bankBranch.getChannelId()) {
            value = -1;
        } else if (getChannelId() > bankBranch.getChannelId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = getStcBranchCode().compareTo(bankBranch.getStcBranchCode());

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

        if (!(obj instanceof BankBranchClp)) {
            return false;
        }

        BankBranchClp bankBranch = (BankBranchClp) obj;

        String primaryKey = bankBranch.getPrimaryKey();

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
        StringBundler sb = new StringBundler(29);

        sb.append("{transId=");
        sb.append(getTransId());
        sb.append(", stcBranchCode=");
        sb.append(getStcBranchCode());
        sb.append(", bankId=");
        sb.append(getBankId());
        sb.append(", channelId=");
        sb.append(getChannelId());
        sb.append(", lastUpdateTimestamp=");
        sb.append(getLastUpdateTimestamp());
        sb.append(", lastUpdateUserid=");
        sb.append(getLastUpdateUserid());
        sb.append(", lastUpdateUsername=");
        sb.append(getLastUpdateUsername());
        sb.append(", active=");
        sb.append(getActive());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", effectiveTimestamp=");
        sb.append(getEffectiveTimestamp());
        sb.append(", clientIp=");
        sb.append(getClientIp());
        sb.append(", serverIp=");
        sb.append(getServerIp());
        sb.append(", userAgent=");
        sb.append(getUserAgent());
        sb.append(", operation=");
        sb.append(getOperation());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.BankBranch");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>transId</column-name><column-value><![CDATA[");
        sb.append(getTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stcBranchCode</column-name><column-value><![CDATA[");
        sb.append(getStcBranchCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankId</column-name><column-value><![CDATA[");
        sb.append(getBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>channelId</column-name><column-value><![CDATA[");
        sb.append(getChannelId());
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
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>effectiveTimestamp</column-name><column-value><![CDATA[");
        sb.append(getEffectiveTimestamp());
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

        sb.append("</model>");

        return sb.toString();
    }
}
