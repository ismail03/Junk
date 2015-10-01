package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil;
import com.stc.echannels.epayments.service.persistence.PaymentRulePK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PaymentRuleClp extends BaseModelImpl<PaymentRule>
    implements PaymentRule {
    private long _ruleId;
    private String _transId;
    private String _ruleName;
    private String _value;
    private String _descriptionEN;
    private String _descriptionAR;
    private String _isEditable;
    private String _refundOnViolation;
    private String _ruleCategory;
    private String _clientIP;
    private String _serverIP;
    private String _userAgent;
    private String _operation;
    private String _isList;
    private long _serviceTypeId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;
    private BaseModel<?> _paymentRuleRemoteModel;

    public PaymentRuleClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return PaymentRule.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentRule.class.getName();
    }

    @Override
    public PaymentRulePK getPrimaryKey() {
        return new PaymentRulePK(_ruleId, _transId);
    }

    @Override
    public void setPrimaryKey(PaymentRulePK primaryKey) {
        setRuleId(primaryKey.ruleId);
        setTransId(primaryKey.transId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new PaymentRulePK(_ruleId, _transId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((PaymentRulePK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("ruleId", getRuleId());
        attributes.put("transId", getTransId());
        attributes.put("ruleName", getRuleName());
        attributes.put("value", getValue());
        attributes.put("descriptionEN", getDescriptionEN());
        attributes.put("descriptionAR", getDescriptionAR());
        attributes.put("isEditable", getIsEditable());
        attributes.put("refundOnViolation", getRefundOnViolation());
        attributes.put("ruleCategory", getRuleCategory());
        attributes.put("clientIP", getClientIP());
        attributes.put("serverIP", getServerIP());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("isList", getIsList());
        attributes.put("serviceTypeId", getServiceTypeId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long ruleId = (Long) attributes.get("ruleId");

        if (ruleId != null) {
            setRuleId(ruleId);
        }

        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
        }

        String ruleName = (String) attributes.get("ruleName");

        if (ruleName != null) {
            setRuleName(ruleName);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }

        String descriptionEN = (String) attributes.get("descriptionEN");

        if (descriptionEN != null) {
            setDescriptionEN(descriptionEN);
        }

        String descriptionAR = (String) attributes.get("descriptionAR");

        if (descriptionAR != null) {
            setDescriptionAR(descriptionAR);
        }

        String isEditable = (String) attributes.get("isEditable");

        if (isEditable != null) {
            setIsEditable(isEditable);
        }

        String refundOnViolation = (String) attributes.get("refundOnViolation");

        if (refundOnViolation != null) {
            setRefundOnViolation(refundOnViolation);
        }

        String ruleCategory = (String) attributes.get("ruleCategory");

        if (ruleCategory != null) {
            setRuleCategory(ruleCategory);
        }

        String clientIP = (String) attributes.get("clientIP");

        if (clientIP != null) {
            setClientIP(clientIP);
        }

        String serverIP = (String) attributes.get("serverIP");

        if (serverIP != null) {
            setServerIP(serverIP);
        }

        String userAgent = (String) attributes.get("userAgent");

        if (userAgent != null) {
            setUserAgent(userAgent);
        }

        String operation = (String) attributes.get("operation");

        if (operation != null) {
            setOperation(operation);
        }

        String isList = (String) attributes.get("isList");

        if (isList != null) {
            setIsList(isList);
        }

        Long serviceTypeId = (Long) attributes.get("serviceTypeId");

        if (serviceTypeId != null) {
            setServiceTypeId(serviceTypeId);
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

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
        }
    }

    @Override
    public long getRuleId() {
        return _ruleId;
    }

    @Override
    public void setRuleId(long ruleId) {
        _ruleId = ruleId;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setRuleId", long.class);

                method.invoke(_paymentRuleRemoteModel, ruleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTransId() {
        return _transId;
    }

    @Override
    public void setTransId(String transId) {
        _transId = transId;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_paymentRuleRemoteModel, transId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRuleName() {
        return _ruleName;
    }

    @Override
    public void setRuleName(String ruleName) {
        _ruleName = ruleName;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setRuleName", String.class);

                method.invoke(_paymentRuleRemoteModel, ruleName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getValue() {
        return _value;
    }

    @Override
    public void setValue(String value) {
        _value = value;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setValue", String.class);

                method.invoke(_paymentRuleRemoteModel, value);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescriptionEN() {
        return _descriptionEN;
    }

    @Override
    public void setDescriptionEN(String descriptionEN) {
        _descriptionEN = descriptionEN;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptionEN", String.class);

                method.invoke(_paymentRuleRemoteModel, descriptionEN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescriptionAR() {
        return _descriptionAR;
    }

    @Override
    public void setDescriptionAR(String descriptionAR) {
        _descriptionAR = descriptionAR;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setDescriptionAR", String.class);

                method.invoke(_paymentRuleRemoteModel, descriptionAR);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIsEditable() {
        return _isEditable;
    }

    @Override
    public void setIsEditable(String isEditable) {
        _isEditable = isEditable;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setIsEditable", String.class);

                method.invoke(_paymentRuleRemoteModel, isEditable);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRefundOnViolation() {
        return _refundOnViolation;
    }

    @Override
    public void setRefundOnViolation(String refundOnViolation) {
        _refundOnViolation = refundOnViolation;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setRefundOnViolation",
                        String.class);

                method.invoke(_paymentRuleRemoteModel, refundOnViolation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRuleCategory() {
        return _ruleCategory;
    }

    @Override
    public void setRuleCategory(String ruleCategory) {
        _ruleCategory = ruleCategory;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setRuleCategory", String.class);

                method.invoke(_paymentRuleRemoteModel, ruleCategory);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getClientIP() {
        return _clientIP;
    }

    @Override
    public void setClientIP(String clientIP) {
        _clientIP = clientIP;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIP", String.class);

                method.invoke(_paymentRuleRemoteModel, clientIP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServerIP() {
        return _serverIP;
    }

    @Override
    public void setServerIP(String serverIP) {
        _serverIP = serverIP;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIP", String.class);

                method.invoke(_paymentRuleRemoteModel, serverIP);
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

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_paymentRuleRemoteModel, userAgent);
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

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_paymentRuleRemoteModel, operation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIsList() {
        return _isList;
    }

    @Override
    public void setIsList(String isList) {
        _isList = isList;

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setIsList", String.class);

                method.invoke(_paymentRuleRemoteModel, isList);
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

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceTypeId", long.class);

                method.invoke(_paymentRuleRemoteModel, serviceTypeId);
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

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_paymentRuleRemoteModel, lastUpdateTimestamp);
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

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_paymentRuleRemoteModel, lastUpdateUserid);
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

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_paymentRuleRemoteModel, lastUpdateUsername);
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

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", String.class);

                method.invoke(_paymentRuleRemoteModel, status);
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

        if (_paymentRuleRemoteModel != null) {
            try {
                Class<?> clazz = _paymentRuleRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_paymentRuleRemoteModel, effectiveTimestamp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaymentRuleRemoteModel() {
        return _paymentRuleRemoteModel;
    }

    public void setPaymentRuleRemoteModel(BaseModel<?> paymentRuleRemoteModel) {
        _paymentRuleRemoteModel = paymentRuleRemoteModel;
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

        Class<?> remoteModelClass = _paymentRuleRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paymentRuleRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaymentRuleLocalServiceUtil.addPaymentRule(this);
        } else {
            PaymentRuleLocalServiceUtil.updatePaymentRule(this);
        }
    }

    @Override
    public PaymentRule toEscapedModel() {
        return (PaymentRule) ProxyUtil.newProxyInstance(PaymentRule.class.getClassLoader(),
            new Class[] { PaymentRule.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaymentRuleClp clone = new PaymentRuleClp();

        clone.setRuleId(getRuleId());
        clone.setTransId(getTransId());
        clone.setRuleName(getRuleName());
        clone.setValue(getValue());
        clone.setDescriptionEN(getDescriptionEN());
        clone.setDescriptionAR(getDescriptionAR());
        clone.setIsEditable(getIsEditable());
        clone.setRefundOnViolation(getRefundOnViolation());
        clone.setRuleCategory(getRuleCategory());
        clone.setClientIP(getClientIP());
        clone.setServerIP(getServerIP());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());
        clone.setIsList(getIsList());
        clone.setServiceTypeId(getServiceTypeId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setStatus(getStatus());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());

        return clone;
    }

    @Override
    public int compareTo(PaymentRule paymentRule) {
        int value = 0;

        value = getRuleName().compareTo(paymentRule.getRuleName());

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

        if (!(obj instanceof PaymentRuleClp)) {
            return false;
        }

        PaymentRuleClp paymentRule = (PaymentRuleClp) obj;

        PaymentRulePK primaryKey = paymentRule.getPrimaryKey();

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
        StringBundler sb = new StringBundler(41);

        sb.append("{ruleId=");
        sb.append(getRuleId());
        sb.append(", transId=");
        sb.append(getTransId());
        sb.append(", ruleName=");
        sb.append(getRuleName());
        sb.append(", value=");
        sb.append(getValue());
        sb.append(", descriptionEN=");
        sb.append(getDescriptionEN());
        sb.append(", descriptionAR=");
        sb.append(getDescriptionAR());
        sb.append(", isEditable=");
        sb.append(getIsEditable());
        sb.append(", refundOnViolation=");
        sb.append(getRefundOnViolation());
        sb.append(", ruleCategory=");
        sb.append(getRuleCategory());
        sb.append(", clientIP=");
        sb.append(getClientIP());
        sb.append(", serverIP=");
        sb.append(getServerIP());
        sb.append(", userAgent=");
        sb.append(getUserAgent());
        sb.append(", operation=");
        sb.append(getOperation());
        sb.append(", isList=");
        sb.append(getIsList());
        sb.append(", serviceTypeId=");
        sb.append(getServiceTypeId());
        sb.append(", lastUpdateTimestamp=");
        sb.append(getLastUpdateTimestamp());
        sb.append(", lastUpdateUserid=");
        sb.append(getLastUpdateUserid());
        sb.append(", lastUpdateUsername=");
        sb.append(getLastUpdateUsername());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", effectiveTimestamp=");
        sb.append(getEffectiveTimestamp());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(64);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentRule");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>ruleId</column-name><column-value><![CDATA[");
        sb.append(getRuleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transId</column-name><column-value><![CDATA[");
        sb.append(getTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ruleName</column-name><column-value><![CDATA[");
        sb.append(getRuleName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>value</column-name><column-value><![CDATA[");
        sb.append(getValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptionEN</column-name><column-value><![CDATA[");
        sb.append(getDescriptionEN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descriptionAR</column-name><column-value><![CDATA[");
        sb.append(getDescriptionAR());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isEditable</column-name><column-value><![CDATA[");
        sb.append(getIsEditable());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>refundOnViolation</column-name><column-value><![CDATA[");
        sb.append(getRefundOnViolation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ruleCategory</column-name><column-value><![CDATA[");
        sb.append(getRuleCategory());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>clientIP</column-name><column-value><![CDATA[");
        sb.append(getClientIP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serverIP</column-name><column-value><![CDATA[");
        sb.append(getServerIP());
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
            "<column><column-name>isList</column-name><column-value><![CDATA[");
        sb.append(getIsList());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceTypeId</column-name><column-value><![CDATA[");
        sb.append(getServiceTypeId());
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
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>effectiveTimestamp</column-name><column-value><![CDATA[");
        sb.append(getEffectiveTimestamp());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
