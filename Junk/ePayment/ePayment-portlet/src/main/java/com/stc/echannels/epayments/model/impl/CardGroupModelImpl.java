package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.model.CardGroup;
import com.stc.echannels.epayments.model.CardGroupModel;
import com.stc.echannels.epayments.model.CardGroupSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CardGroup service. Represents a row in the &quot;IN_CARD_GROUPS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.CardGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CardGroupImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see CardGroupImpl
 * @see com.stc.echannels.epayments.model.CardGroup
 * @see com.stc.echannels.epayments.model.CardGroupModel
 * @generated
 */
@JSON(strict = true)
public class CardGroupModelImpl extends BaseModelImpl<CardGroup>
    implements CardGroupModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a card group model instance should use the {@link com.stc.echannels.epayments.model.CardGroup} interface instead.
     */
    public static final String TABLE_NAME = "IN_CARD_GROUPS";
    public static final Object[][] TABLE_COLUMNS = {
            { "TRANS_ID", Types.VARCHAR },
            { "last_update_timestamp", Types.TIMESTAMP },
            { "last_update_userid", Types.VARCHAR },
            { "last_update_username", Types.VARCHAR },
            { "active", Types.VARCHAR },
            { "effective_timestamp", Types.TIMESTAMP },
            { "CLIENT_IP", Types.VARCHAR },
            { "SERVER_IP", Types.VARCHAR },
            { "USER_AGENT", Types.VARCHAR },
            { "OPERATION", Types.VARCHAR },
            { "CARD_GROUP", Types.VARCHAR },
            { "CARD_VALUE", Types.BIGINT },
            { "PROMOTION_VALUE", Types.BIGINT },
            { "IN_PAYMENT_SYSTEM", Types.VARCHAR },
            { "SERVICE_ID", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table IN_CARD_GROUPS (TRANS_ID VARCHAR(75) not null primary key,last_update_timestamp DATE null,last_update_userid VARCHAR(75) null,last_update_username VARCHAR(75) null,active VARCHAR(75) null,effective_timestamp DATE null,CLIENT_IP VARCHAR(75) null,SERVER_IP VARCHAR(75) null,USER_AGENT VARCHAR(200) null,OPERATION VARCHAR(75) null,CARD_GROUP VARCHAR(75) null,CARD_VALUE LONG,PROMOTION_VALUE LONG,IN_PAYMENT_SYSTEM VARCHAR(75) null,SERVICE_ID LONG)";
    public static final String TABLE_SQL_DROP = "drop table IN_CARD_GROUPS";
    public static final String ORDER_BY_JPQL = " ORDER BY cardGroup.cardGroupId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY IN_CARD_GROUPS.CARD_GROUP ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.CardGroup"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.CardGroup"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.stc.echannels.epayments.model.CardGroup"),
            true);
    public static long ACTIVE_COLUMN_BITMASK = 1L;
    public static long CARDGROUPID_COLUMN_BITMASK = 2L;
    public static long CARDVALUE_COLUMN_BITMASK = 4L;
    public static long INPAYMENTSYSTEM_COLUMN_BITMASK = 8L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.CardGroup"));
    private static ClassLoader _classLoader = CardGroup.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            CardGroup.class
        };
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private String _originalActive;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private String _cardGroupId;
    private String _originalCardGroupId;
    private long _cardValue;
    private long _originalCardValue;
    private boolean _setOriginalCardValue;
    private long _promotionValue;
    private String _inPaymentSystem;
    private String _originalInPaymentSystem;
    private long _serviceId;
    private long _columnBitmask;
    private CardGroup _escapedModel;

    public CardGroupModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static CardGroup toModel(CardGroupSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        CardGroup model = new CardGroupImpl();

        model.setTransId(soapModel.getTransId());
        model.setLastUpdateTimestamp(soapModel.getLastUpdateTimestamp());
        model.setLastUpdateUserid(soapModel.getLastUpdateUserid());
        model.setLastUpdateUsername(soapModel.getLastUpdateUsername());
        model.setActive(soapModel.getActive());
        model.setEffectiveTimestamp(soapModel.getEffectiveTimestamp());
        model.setClientIp(soapModel.getClientIp());
        model.setServerIp(soapModel.getServerIp());
        model.setUserAgent(soapModel.getUserAgent());
        model.setOperation(soapModel.getOperation());
        model.setCardGroupId(soapModel.getCardGroupId());
        model.setCardValue(soapModel.getCardValue());
        model.setPromotionValue(soapModel.getPromotionValue());
        model.setInPaymentSystem(soapModel.getInPaymentSystem());
        model.setServiceId(soapModel.getServiceId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<CardGroup> toModels(CardGroupSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<CardGroup> models = new ArrayList<CardGroup>(soapModels.length);

        for (CardGroupSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return CardGroup.class;
    }

    @Override
    public String getModelClassName() {
        return CardGroup.class.getName();
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

    @JSON
    @Override
    public String getTransId() {
        if (_transId == null) {
            return StringPool.BLANK;
        } else {
            return _transId;
        }
    }

    @Override
    public void setTransId(String transId) {
        _transId = transId;
    }

    @JSON
    @Override
    public Date getLastUpdateTimestamp() {
        return _lastUpdateTimestamp;
    }

    @Override
    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        _lastUpdateTimestamp = lastUpdateTimestamp;
    }

    @JSON
    @Override
    public String getLastUpdateUserid() {
        if (_lastUpdateUserid == null) {
            return StringPool.BLANK;
        } else {
            return _lastUpdateUserid;
        }
    }

    @Override
    public void setLastUpdateUserid(String lastUpdateUserid) {
        _lastUpdateUserid = lastUpdateUserid;
    }

    @JSON
    @Override
    public String getLastUpdateUsername() {
        if (_lastUpdateUsername == null) {
            return StringPool.BLANK;
        } else {
            return _lastUpdateUsername;
        }
    }

    @Override
    public void setLastUpdateUsername(String lastUpdateUsername) {
        _lastUpdateUsername = lastUpdateUsername;
    }

    @JSON
    @Override
    public String getActive() {
        if (_active == null) {
            return StringPool.BLANK;
        } else {
            return _active;
        }
    }

    @Override
    public void setActive(String active) {
        _columnBitmask |= ACTIVE_COLUMN_BITMASK;

        if (_originalActive == null) {
            _originalActive = _active;
        }

        _active = active;
    }

    public String getOriginalActive() {
        return GetterUtil.getString(_originalActive);
    }

    @JSON
    @Override
    public Date getEffectiveTimestamp() {
        return _effectiveTimestamp;
    }

    @Override
    public void setEffectiveTimestamp(Date effectiveTimestamp) {
        _effectiveTimestamp = effectiveTimestamp;
    }

    @JSON
    @Override
    public String getClientIp() {
        if (_clientIp == null) {
            return StringPool.BLANK;
        } else {
            return _clientIp;
        }
    }

    @Override
    public void setClientIp(String clientIp) {
        _clientIp = clientIp;
    }

    @JSON
    @Override
    public String getServerIp() {
        if (_serverIp == null) {
            return StringPool.BLANK;
        } else {
            return _serverIp;
        }
    }

    @Override
    public void setServerIp(String serverIp) {
        _serverIp = serverIp;
    }

    @JSON
    @Override
    public String getUserAgent() {
        if (_userAgent == null) {
            return StringPool.BLANK;
        } else {
            return _userAgent;
        }
    }

    @Override
    public void setUserAgent(String userAgent) {
        _userAgent = userAgent;
    }

    @JSON
    @Override
    public String getOperation() {
        if (_operation == null) {
            return StringPool.BLANK;
        } else {
            return _operation;
        }
    }

    @Override
    public void setOperation(String operation) {
        _operation = operation;
    }

    @JSON
    @Override
    public String getCardGroupId() {
        if (_cardGroupId == null) {
            return StringPool.BLANK;
        } else {
            return _cardGroupId;
        }
    }

    @Override
    public void setCardGroupId(String cardGroupId) {
        _columnBitmask = -1L;

        if (_originalCardGroupId == null) {
            _originalCardGroupId = _cardGroupId;
        }

        _cardGroupId = cardGroupId;
    }

    public String getOriginalCardGroupId() {
        return GetterUtil.getString(_originalCardGroupId);
    }

    @JSON
    @Override
    public long getCardValue() {
        return _cardValue;
    }

    @Override
    public void setCardValue(long cardValue) {
        _columnBitmask |= CARDVALUE_COLUMN_BITMASK;

        if (!_setOriginalCardValue) {
            _setOriginalCardValue = true;

            _originalCardValue = _cardValue;
        }

        _cardValue = cardValue;
    }

    public long getOriginalCardValue() {
        return _originalCardValue;
    }

    @JSON
    @Override
    public long getPromotionValue() {
        return _promotionValue;
    }

    @Override
    public void setPromotionValue(long promotionValue) {
        _promotionValue = promotionValue;
    }

    @JSON
    @Override
    public String getInPaymentSystem() {
        if (_inPaymentSystem == null) {
            return StringPool.BLANK;
        } else {
            return _inPaymentSystem;
        }
    }

    @Override
    public void setInPaymentSystem(String inPaymentSystem) {
        _columnBitmask |= INPAYMENTSYSTEM_COLUMN_BITMASK;

        if (_originalInPaymentSystem == null) {
            _originalInPaymentSystem = _inPaymentSystem;
        }

        _inPaymentSystem = inPaymentSystem;
    }

    public String getOriginalInPaymentSystem() {
        return GetterUtil.getString(_originalInPaymentSystem);
    }

    @JSON
    @Override
    public long getServiceId() {
        return _serviceId;
    }

    @Override
    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public CardGroup toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (CardGroup) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        CardGroupImpl cardGroupImpl = new CardGroupImpl();

        cardGroupImpl.setTransId(getTransId());
        cardGroupImpl.setLastUpdateTimestamp(getLastUpdateTimestamp());
        cardGroupImpl.setLastUpdateUserid(getLastUpdateUserid());
        cardGroupImpl.setLastUpdateUsername(getLastUpdateUsername());
        cardGroupImpl.setActive(getActive());
        cardGroupImpl.setEffectiveTimestamp(getEffectiveTimestamp());
        cardGroupImpl.setClientIp(getClientIp());
        cardGroupImpl.setServerIp(getServerIp());
        cardGroupImpl.setUserAgent(getUserAgent());
        cardGroupImpl.setOperation(getOperation());
        cardGroupImpl.setCardGroupId(getCardGroupId());
        cardGroupImpl.setCardValue(getCardValue());
        cardGroupImpl.setPromotionValue(getPromotionValue());
        cardGroupImpl.setInPaymentSystem(getInPaymentSystem());
        cardGroupImpl.setServiceId(getServiceId());

        cardGroupImpl.resetOriginalValues();

        return cardGroupImpl;
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

        if (!(obj instanceof CardGroup)) {
            return false;
        }

        CardGroup cardGroup = (CardGroup) obj;

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
    public void resetOriginalValues() {
        CardGroupModelImpl cardGroupModelImpl = this;

        cardGroupModelImpl._originalActive = cardGroupModelImpl._active;

        cardGroupModelImpl._originalCardGroupId = cardGroupModelImpl._cardGroupId;

        cardGroupModelImpl._originalCardValue = cardGroupModelImpl._cardValue;

        cardGroupModelImpl._setOriginalCardValue = false;

        cardGroupModelImpl._originalInPaymentSystem = cardGroupModelImpl._inPaymentSystem;

        cardGroupModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<CardGroup> toCacheModel() {
        CardGroupCacheModel cardGroupCacheModel = new CardGroupCacheModel();

        cardGroupCacheModel.transId = getTransId();

        String transId = cardGroupCacheModel.transId;

        if ((transId != null) && (transId.length() == 0)) {
            cardGroupCacheModel.transId = null;
        }

        Date lastUpdateTimestamp = getLastUpdateTimestamp();

        if (lastUpdateTimestamp != null) {
            cardGroupCacheModel.lastUpdateTimestamp = lastUpdateTimestamp.getTime();
        } else {
            cardGroupCacheModel.lastUpdateTimestamp = Long.MIN_VALUE;
        }

        cardGroupCacheModel.lastUpdateUserid = getLastUpdateUserid();

        String lastUpdateUserid = cardGroupCacheModel.lastUpdateUserid;

        if ((lastUpdateUserid != null) && (lastUpdateUserid.length() == 0)) {
            cardGroupCacheModel.lastUpdateUserid = null;
        }

        cardGroupCacheModel.lastUpdateUsername = getLastUpdateUsername();

        String lastUpdateUsername = cardGroupCacheModel.lastUpdateUsername;

        if ((lastUpdateUsername != null) && (lastUpdateUsername.length() == 0)) {
            cardGroupCacheModel.lastUpdateUsername = null;
        }

        cardGroupCacheModel.active = getActive();

        String active = cardGroupCacheModel.active;

        if ((active != null) && (active.length() == 0)) {
            cardGroupCacheModel.active = null;
        }

        Date effectiveTimestamp = getEffectiveTimestamp();

        if (effectiveTimestamp != null) {
            cardGroupCacheModel.effectiveTimestamp = effectiveTimestamp.getTime();
        } else {
            cardGroupCacheModel.effectiveTimestamp = Long.MIN_VALUE;
        }

        cardGroupCacheModel.clientIp = getClientIp();

        String clientIp = cardGroupCacheModel.clientIp;

        if ((clientIp != null) && (clientIp.length() == 0)) {
            cardGroupCacheModel.clientIp = null;
        }

        cardGroupCacheModel.serverIp = getServerIp();

        String serverIp = cardGroupCacheModel.serverIp;

        if ((serverIp != null) && (serverIp.length() == 0)) {
            cardGroupCacheModel.serverIp = null;
        }

        cardGroupCacheModel.userAgent = getUserAgent();

        String userAgent = cardGroupCacheModel.userAgent;

        if ((userAgent != null) && (userAgent.length() == 0)) {
            cardGroupCacheModel.userAgent = null;
        }

        cardGroupCacheModel.operation = getOperation();

        String operation = cardGroupCacheModel.operation;

        if ((operation != null) && (operation.length() == 0)) {
            cardGroupCacheModel.operation = null;
        }

        cardGroupCacheModel.cardGroupId = getCardGroupId();

        String cardGroupId = cardGroupCacheModel.cardGroupId;

        if ((cardGroupId != null) && (cardGroupId.length() == 0)) {
            cardGroupCacheModel.cardGroupId = null;
        }

        cardGroupCacheModel.cardValue = getCardValue();

        cardGroupCacheModel.promotionValue = getPromotionValue();

        cardGroupCacheModel.inPaymentSystem = getInPaymentSystem();

        String inPaymentSystem = cardGroupCacheModel.inPaymentSystem;

        if ((inPaymentSystem != null) && (inPaymentSystem.length() == 0)) {
            cardGroupCacheModel.inPaymentSystem = null;
        }

        cardGroupCacheModel.serviceId = getServiceId();

        return cardGroupCacheModel;
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
