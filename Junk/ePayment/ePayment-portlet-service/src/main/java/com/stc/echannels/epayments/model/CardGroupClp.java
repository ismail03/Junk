package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.CardGroupLocalServiceUtil;
import com.stc.echannels.epayments.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class CardGroupClp extends BaseModelImpl<CardGroup> implements CardGroup {
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _cardGroupId;
    private long _cardValue;
    private long _promotionValue;
    private String _inPaymentSystem;
    private long _serviceId;
    private BaseModel<?> _cardGroupRemoteModel;

    public CardGroupClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return CardGroup.class;
    }

    @Override
    public String getModelClassName() {
        return CardGroup.class.getName();
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
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("cardGroupId", getCardGroupId());
        attributes.put("cardValue", getCardValue());
        attributes.put("promotionValue", getPromotionValue());
        attributes.put("inPaymentSystem", getInPaymentSystem());
        attributes.put("serviceId", getServiceId());

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

        String cardGroupId = (String) attributes.get("cardGroupId");

        if (cardGroupId != null) {
            setCardGroupId(cardGroupId);
        }

        Long cardValue = (Long) attributes.get("cardValue");

        if (cardValue != null) {
            setCardValue(cardValue);
        }

        Long promotionValue = (Long) attributes.get("promotionValue");

        if (promotionValue != null) {
            setPromotionValue(promotionValue);
        }

        String inPaymentSystem = (String) attributes.get("inPaymentSystem");

        if (inPaymentSystem != null) {
            setInPaymentSystem(inPaymentSystem);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }
    }

    @Override
    public String getTransId() {
        return _transId;
    }

    @Override
    public void setTransId(String transId) {
        _transId = transId;

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setTransId", String.class);

                method.invoke(_cardGroupRemoteModel, transId);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateTimestamp",
                        Date.class);

                method.invoke(_cardGroupRemoteModel, lastUpdateTimestamp);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUserid",
                        String.class);

                method.invoke(_cardGroupRemoteModel, lastUpdateUserid);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setLastUpdateUsername",
                        String.class);

                method.invoke(_cardGroupRemoteModel, lastUpdateUsername);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setActive", String.class);

                method.invoke(_cardGroupRemoteModel, active);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setEffectiveTimestamp",
                        Date.class);

                method.invoke(_cardGroupRemoteModel, effectiveTimestamp);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setClientIp", String.class);

                method.invoke(_cardGroupRemoteModel, clientIp);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setServerIp", String.class);

                method.invoke(_cardGroupRemoteModel, serverIp);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setUserAgent", String.class);

                method.invoke(_cardGroupRemoteModel, userAgent);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setOperation", String.class);

                method.invoke(_cardGroupRemoteModel, operation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCardGroupId() {
        return _cardGroupId;
    }

    @Override
    public void setCardGroupId(String cardGroupId) {
        _cardGroupId = cardGroupId;

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setCardGroupId", String.class);

                method.invoke(_cardGroupRemoteModel, cardGroupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCardValue() {
        return _cardValue;
    }

    @Override
    public void setCardValue(long cardValue) {
        _cardValue = cardValue;

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setCardValue", long.class);

                method.invoke(_cardGroupRemoteModel, cardValue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPromotionValue() {
        return _promotionValue;
    }

    @Override
    public void setPromotionValue(long promotionValue) {
        _promotionValue = promotionValue;

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setPromotionValue", long.class);

                method.invoke(_cardGroupRemoteModel, promotionValue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInPaymentSystem() {
        return _inPaymentSystem;
    }

    @Override
    public void setInPaymentSystem(String inPaymentSystem) {
        _inPaymentSystem = inPaymentSystem;

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setInPaymentSystem",
                        String.class);

                method.invoke(_cardGroupRemoteModel, inPaymentSystem);
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

        if (_cardGroupRemoteModel != null) {
            try {
                Class<?> clazz = _cardGroupRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_cardGroupRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCardGroupRemoteModel() {
        return _cardGroupRemoteModel;
    }

    public void setCardGroupRemoteModel(BaseModel<?> cardGroupRemoteModel) {
        _cardGroupRemoteModel = cardGroupRemoteModel;
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

        Class<?> remoteModelClass = _cardGroupRemoteModel.getClass();

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

        Object returnValue = method.invoke(_cardGroupRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CardGroupLocalServiceUtil.addCardGroup(this);
        } else {
            CardGroupLocalServiceUtil.updateCardGroup(this);
        }
    }

    @Override
    public CardGroup toEscapedModel() {
        return (CardGroup) ProxyUtil.newProxyInstance(CardGroup.class.getClassLoader(),
            new Class[] { CardGroup.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CardGroupClp clone = new CardGroupClp();

        clone.setTransId(getTransId());
        clone.setLastUpdateTimestamp(getLastUpdateTimestamp());
        clone.setLastUpdateUserid(getLastUpdateUserid());
        clone.setLastUpdateUsername(getLastUpdateUsername());
        clone.setActive(getActive());
        clone.setEffectiveTimestamp(getEffectiveTimestamp());
        clone.setClientIp(getClientIp());
        clone.setServerIp(getServerIp());
        clone.setUserAgent(getUserAgent());
        clone.setOperation(getOperation());
        clone.setCardGroupId(getCardGroupId());
        clone.setCardValue(getCardValue());
        clone.setPromotionValue(getPromotionValue());
        clone.setInPaymentSystem(getInPaymentSystem());
        clone.setServiceId(getServiceId());

        return clone;
    }

    @Override
    public int compareTo(CardGroup cardGroup) {
        int value = 0;

        value = getCardGroupId().compareTo(cardGroup.getCardGroupId());

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

        if (!(obj instanceof CardGroupClp)) {
            return false;
        }

        CardGroupClp cardGroup = (CardGroupClp) obj;

        String primaryKey = cardGroup.getPrimaryKey();

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
        StringBundler sb = new StringBundler(31);

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
        sb.append(", clientIp=");
        sb.append(getClientIp());
        sb.append(", serverIp=");
        sb.append(getServerIp());
        sb.append(", userAgent=");
        sb.append(getUserAgent());
        sb.append(", operation=");
        sb.append(getOperation());
        sb.append(", cardGroupId=");
        sb.append(getCardGroupId());
        sb.append(", cardValue=");
        sb.append(getCardValue());
        sb.append(", promotionValue=");
        sb.append(getPromotionValue());
        sb.append(", inPaymentSystem=");
        sb.append(getInPaymentSystem());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.CardGroup");
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
            "<column><column-name>cardGroupId</column-name><column-value><![CDATA[");
        sb.append(getCardGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cardValue</column-name><column-value><![CDATA[");
        sb.append(getCardValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>promotionValue</column-name><column-value><![CDATA[");
        sb.append(getPromotionValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inPaymentSystem</column-name><column-value><![CDATA[");
        sb.append(getInPaymentSystem());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
