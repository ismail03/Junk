package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.model.PaymentChannel;
import com.stc.echannels.epayments.model.PaymentChannelModel;
import com.stc.echannels.epayments.model.PaymentChannelSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the PaymentChannel service. Represents a row in the &quot;PAYMENT_CHANNELS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.PaymentChannelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentChannelImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelImpl
 * @see com.stc.echannels.epayments.model.PaymentChannel
 * @see com.stc.echannels.epayments.model.PaymentChannelModel
 * @generated
 */
@JSON(strict = true)
public class PaymentChannelModelImpl extends BaseModelImpl<PaymentChannel>
    implements PaymentChannelModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a payment channel model instance should use the {@link com.stc.echannels.epayments.model.PaymentChannel} interface instead.
     */
    public static final String TABLE_NAME = "PAYMENT_CHANNELS";
    public static final Object[][] TABLE_COLUMNS = {
            { "TRANS_ID", Types.VARCHAR },
            { "last_update_timestamp", Types.TIMESTAMP },
            { "last_update_userid", Types.VARCHAR },
            { "last_update_username", Types.VARCHAR },
            { "active", Types.VARCHAR },
            { "status", Types.VARCHAR },
            { "effective_timestamp", Types.TIMESTAMP },
            { "CLIENT_IP", Types.VARCHAR },
            { "SERVER_IP", Types.VARCHAR },
            { "USER_AGENT", Types.VARCHAR },
            { "OPERATION", Types.VARCHAR },
            { "channel_Id", Types.BIGINT },
            { "channel_type", Types.VARCHAR },
            { "descriptive_name_en", Types.VARCHAR },
            { "descriptive_name_ar", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table PAYMENT_CHANNELS (TRANS_ID VARCHAR(75) not null primary key,last_update_timestamp DATE null,last_update_userid VARCHAR(75) null,last_update_username VARCHAR(75) null,active VARCHAR(75) null,status VARCHAR(75) null,effective_timestamp DATE null,CLIENT_IP VARCHAR(75) null,SERVER_IP VARCHAR(75) null,USER_AGENT VARCHAR(200) null,OPERATION VARCHAR(75) null,channel_Id LONG,channel_type VARCHAR(75) null,descriptive_name_en VARCHAR(75) null,descriptive_name_ar VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table PAYMENT_CHANNELS";
    public static final String ORDER_BY_JPQL = " ORDER BY paymentChannel.channelType ASC";
    public static final String ORDER_BY_SQL = " ORDER BY PAYMENT_CHANNELS.channel_type ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.PaymentChannel"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.PaymentChannel"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.stc.echannels.epayments.model.PaymentChannel"),
            true);
    public static long CHANNELID_COLUMN_BITMASK = 1L;
    public static long CHANNELTYPE_COLUMN_BITMASK = 2L;
    public static long DESCRIPTIVENAMEAR_COLUMN_BITMASK = 4L;
    public static long DESCRIPTIVENAMEEN_COLUMN_BITMASK = 8L;
    public static long STATUS_COLUMN_BITMASK = 16L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.PaymentChannel"));
    private static ClassLoader _classLoader = PaymentChannel.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            PaymentChannel.class
        };
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private String _status;
    private String _originalStatus;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private long _channelId;
    private long _originalChannelId;
    private boolean _setOriginalChannelId;
    private String _channelType;
    private String _originalChannelType;
    private String _descriptiveNameEn;
    private String _originalDescriptiveNameEn;
    private String _descriptiveNameAr;
    private String _originalDescriptiveNameAr;
    private long _columnBitmask;
    private PaymentChannel _escapedModel;

    public PaymentChannelModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static PaymentChannel toModel(PaymentChannelSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        PaymentChannel model = new PaymentChannelImpl();

        model.setTransId(soapModel.getTransId());
        model.setLastUpdateTimestamp(soapModel.getLastUpdateTimestamp());
        model.setLastUpdateUserid(soapModel.getLastUpdateUserid());
        model.setLastUpdateUsername(soapModel.getLastUpdateUsername());
        model.setActive(soapModel.getActive());
        model.setStatus(soapModel.getStatus());
        model.setEffectiveTimestamp(soapModel.getEffectiveTimestamp());
        model.setClientIp(soapModel.getClientIp());
        model.setServerIp(soapModel.getServerIp());
        model.setUserAgent(soapModel.getUserAgent());
        model.setOperation(soapModel.getOperation());
        model.setChannelId(soapModel.getChannelId());
        model.setChannelType(soapModel.getChannelType());
        model.setDescriptiveNameEn(soapModel.getDescriptiveNameEn());
        model.setDescriptiveNameAr(soapModel.getDescriptiveNameAr());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<PaymentChannel> toModels(PaymentChannelSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<PaymentChannel> models = new ArrayList<PaymentChannel>(soapModels.length);

        for (PaymentChannelSoap soapModel : soapModels) {
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
        return PaymentChannel.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentChannel.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
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
        attributes.put("channelId", getChannelId());
        attributes.put("channelType", getChannelType());
        attributes.put("descriptiveNameEn", getDescriptiveNameEn());
        attributes.put("descriptiveNameAr", getDescriptiveNameAr());

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

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        String channelType = (String) attributes.get("channelType");

        if (channelType != null) {
            setChannelType(channelType);
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
        _active = active;
    }

    @JSON
    @Override
    public String getStatus() {
        if (_status == null) {
            return StringPool.BLANK;
        } else {
            return _status;
        }
    }

    @Override
    public void setStatus(String status) {
        _columnBitmask |= STATUS_COLUMN_BITMASK;

        if (_originalStatus == null) {
            _originalStatus = _status;
        }

        _status = status;
    }

    public String getOriginalStatus() {
        return GetterUtil.getString(_originalStatus);
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
    public long getChannelId() {
        return _channelId;
    }

    @Override
    public void setChannelId(long channelId) {
        _columnBitmask |= CHANNELID_COLUMN_BITMASK;

        if (!_setOriginalChannelId) {
            _setOriginalChannelId = true;

            _originalChannelId = _channelId;
        }

        _channelId = channelId;
    }

    public long getOriginalChannelId() {
        return _originalChannelId;
    }

    @JSON
    @Override
    public String getChannelType() {
        if (_channelType == null) {
            return StringPool.BLANK;
        } else {
            return _channelType;
        }
    }

    @Override
    public void setChannelType(String channelType) {
        _columnBitmask = -1L;

        if (_originalChannelType == null) {
            _originalChannelType = _channelType;
        }

        _channelType = channelType;
    }

    public String getOriginalChannelType() {
        return GetterUtil.getString(_originalChannelType);
    }

    @JSON
    @Override
    public String getDescriptiveNameEn() {
        if (_descriptiveNameEn == null) {
            return StringPool.BLANK;
        } else {
            return _descriptiveNameEn;
        }
    }

    @Override
    public void setDescriptiveNameEn(String descriptiveNameEn) {
        _columnBitmask |= DESCRIPTIVENAMEEN_COLUMN_BITMASK;

        if (_originalDescriptiveNameEn == null) {
            _originalDescriptiveNameEn = _descriptiveNameEn;
        }

        _descriptiveNameEn = descriptiveNameEn;
    }

    public String getOriginalDescriptiveNameEn() {
        return GetterUtil.getString(_originalDescriptiveNameEn);
    }

    @JSON
    @Override
    public String getDescriptiveNameAr() {
        if (_descriptiveNameAr == null) {
            return StringPool.BLANK;
        } else {
            return _descriptiveNameAr;
        }
    }

    @Override
    public void setDescriptiveNameAr(String descriptiveNameAr) {
        _columnBitmask |= DESCRIPTIVENAMEAR_COLUMN_BITMASK;

        if (_originalDescriptiveNameAr == null) {
            _originalDescriptiveNameAr = _descriptiveNameAr;
        }

        _descriptiveNameAr = descriptiveNameAr;
    }

    public String getOriginalDescriptiveNameAr() {
        return GetterUtil.getString(_originalDescriptiveNameAr);
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public PaymentChannel toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (PaymentChannel) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PaymentChannelImpl paymentChannelImpl = new PaymentChannelImpl();

        paymentChannelImpl.setTransId(getTransId());
        paymentChannelImpl.setLastUpdateTimestamp(getLastUpdateTimestamp());
        paymentChannelImpl.setLastUpdateUserid(getLastUpdateUserid());
        paymentChannelImpl.setLastUpdateUsername(getLastUpdateUsername());
        paymentChannelImpl.setActive(getActive());
        paymentChannelImpl.setStatus(getStatus());
        paymentChannelImpl.setEffectiveTimestamp(getEffectiveTimestamp());
        paymentChannelImpl.setClientIp(getClientIp());
        paymentChannelImpl.setServerIp(getServerIp());
        paymentChannelImpl.setUserAgent(getUserAgent());
        paymentChannelImpl.setOperation(getOperation());
        paymentChannelImpl.setChannelId(getChannelId());
        paymentChannelImpl.setChannelType(getChannelType());
        paymentChannelImpl.setDescriptiveNameEn(getDescriptiveNameEn());
        paymentChannelImpl.setDescriptiveNameAr(getDescriptiveNameAr());

        paymentChannelImpl.resetOriginalValues();

        return paymentChannelImpl;
    }

    @Override
    public int compareTo(PaymentChannel paymentChannel) {
        int value = 0;

        value = getChannelType().compareTo(paymentChannel.getChannelType());

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

        if (!(obj instanceof PaymentChannel)) {
            return false;
        }

        PaymentChannel paymentChannel = (PaymentChannel) obj;

        String primaryKey = paymentChannel.getPrimaryKey();

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
        PaymentChannelModelImpl paymentChannelModelImpl = this;

        paymentChannelModelImpl._originalStatus = paymentChannelModelImpl._status;

        paymentChannelModelImpl._originalChannelId = paymentChannelModelImpl._channelId;

        paymentChannelModelImpl._setOriginalChannelId = false;

        paymentChannelModelImpl._originalChannelType = paymentChannelModelImpl._channelType;

        paymentChannelModelImpl._originalDescriptiveNameEn = paymentChannelModelImpl._descriptiveNameEn;

        paymentChannelModelImpl._originalDescriptiveNameAr = paymentChannelModelImpl._descriptiveNameAr;

        paymentChannelModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<PaymentChannel> toCacheModel() {
        PaymentChannelCacheModel paymentChannelCacheModel = new PaymentChannelCacheModel();

        paymentChannelCacheModel.transId = getTransId();

        String transId = paymentChannelCacheModel.transId;

        if ((transId != null) && (transId.length() == 0)) {
            paymentChannelCacheModel.transId = null;
        }

        Date lastUpdateTimestamp = getLastUpdateTimestamp();

        if (lastUpdateTimestamp != null) {
            paymentChannelCacheModel.lastUpdateTimestamp = lastUpdateTimestamp.getTime();
        } else {
            paymentChannelCacheModel.lastUpdateTimestamp = Long.MIN_VALUE;
        }

        paymentChannelCacheModel.lastUpdateUserid = getLastUpdateUserid();

        String lastUpdateUserid = paymentChannelCacheModel.lastUpdateUserid;

        if ((lastUpdateUserid != null) && (lastUpdateUserid.length() == 0)) {
            paymentChannelCacheModel.lastUpdateUserid = null;
        }

        paymentChannelCacheModel.lastUpdateUsername = getLastUpdateUsername();

        String lastUpdateUsername = paymentChannelCacheModel.lastUpdateUsername;

        if ((lastUpdateUsername != null) && (lastUpdateUsername.length() == 0)) {
            paymentChannelCacheModel.lastUpdateUsername = null;
        }

        paymentChannelCacheModel.active = getActive();

        String active = paymentChannelCacheModel.active;

        if ((active != null) && (active.length() == 0)) {
            paymentChannelCacheModel.active = null;
        }

        paymentChannelCacheModel.status = getStatus();

        String status = paymentChannelCacheModel.status;

        if ((status != null) && (status.length() == 0)) {
            paymentChannelCacheModel.status = null;
        }

        Date effectiveTimestamp = getEffectiveTimestamp();

        if (effectiveTimestamp != null) {
            paymentChannelCacheModel.effectiveTimestamp = effectiveTimestamp.getTime();
        } else {
            paymentChannelCacheModel.effectiveTimestamp = Long.MIN_VALUE;
        }

        paymentChannelCacheModel.clientIp = getClientIp();

        String clientIp = paymentChannelCacheModel.clientIp;

        if ((clientIp != null) && (clientIp.length() == 0)) {
            paymentChannelCacheModel.clientIp = null;
        }

        paymentChannelCacheModel.serverIp = getServerIp();

        String serverIp = paymentChannelCacheModel.serverIp;

        if ((serverIp != null) && (serverIp.length() == 0)) {
            paymentChannelCacheModel.serverIp = null;
        }

        paymentChannelCacheModel.userAgent = getUserAgent();

        String userAgent = paymentChannelCacheModel.userAgent;

        if ((userAgent != null) && (userAgent.length() == 0)) {
            paymentChannelCacheModel.userAgent = null;
        }

        paymentChannelCacheModel.operation = getOperation();

        String operation = paymentChannelCacheModel.operation;

        if ((operation != null) && (operation.length() == 0)) {
            paymentChannelCacheModel.operation = null;
        }

        paymentChannelCacheModel.channelId = getChannelId();

        paymentChannelCacheModel.channelType = getChannelType();

        String channelType = paymentChannelCacheModel.channelType;

        if ((channelType != null) && (channelType.length() == 0)) {
            paymentChannelCacheModel.channelType = null;
        }

        paymentChannelCacheModel.descriptiveNameEn = getDescriptiveNameEn();

        String descriptiveNameEn = paymentChannelCacheModel.descriptiveNameEn;

        if ((descriptiveNameEn != null) && (descriptiveNameEn.length() == 0)) {
            paymentChannelCacheModel.descriptiveNameEn = null;
        }

        paymentChannelCacheModel.descriptiveNameAr = getDescriptiveNameAr();

        String descriptiveNameAr = paymentChannelCacheModel.descriptiveNameAr;

        if ((descriptiveNameAr != null) && (descriptiveNameAr.length() == 0)) {
            paymentChannelCacheModel.descriptiveNameAr = null;
        }

        return paymentChannelCacheModel;
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
        sb.append(", channelId=");
        sb.append(getChannelId());
        sb.append(", channelType=");
        sb.append(getChannelType());
        sb.append(", descriptiveNameEn=");
        sb.append(getDescriptiveNameEn());
        sb.append(", descriptiveNameAr=");
        sb.append(getDescriptiveNameAr());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.PaymentChannel");
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
        sb.append(
            "<column><column-name>channelId</column-name><column-value><![CDATA[");
        sb.append(getChannelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>channelType</column-name><column-value><![CDATA[");
        sb.append(getChannelType());
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
