package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.stc.echannels.epayments.model.BizRuleConfig;
import com.stc.echannels.epayments.model.BizRuleConfigModel;
import com.stc.echannels.epayments.model.BizRuleConfigSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the BizRuleConfig service. Represents a row in the &quot;BIZ_RULE_CONFIG&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.BizRuleConfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BizRuleConfigImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BizRuleConfigImpl
 * @see com.stc.echannels.epayments.model.BizRuleConfig
 * @see com.stc.echannels.epayments.model.BizRuleConfigModel
 * @generated
 */
@JSON(strict = true)
public class BizRuleConfigModelImpl extends BaseModelImpl<BizRuleConfig>
    implements BizRuleConfigModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a biz rule config model instance should use the {@link com.stc.echannels.epayments.model.BizRuleConfig} interface instead.
     */
    public static final String TABLE_NAME = "BIZ_RULE_CONFIG";
    public static final Object[][] TABLE_COLUMNS = {
            { "BIZ_RULE_ID", Types.BIGINT },
            { "SERVICE_ID", Types.BIGINT },
            { "CHANNEL_ID", Types.BIGINT },
            { "PMT_METHOD_ID", Types.BIGINT },
            { "CUSTOM_VALUE", Types.VARCHAR },
            { "RULE_ID", Types.BIGINT },
            { "TRANS_ID", Types.VARCHAR },
            { "CLIENT_IP", Types.VARCHAR },
            { "SERVER_IP", Types.VARCHAR },
            { "USER_AGENT", Types.VARCHAR },
            { "OPERATION", Types.VARCHAR },
            { "last_update_timestamp", Types.TIMESTAMP },
            { "last_update_userid", Types.VARCHAR },
            { "last_update_username", Types.VARCHAR },
            { "status", Types.VARCHAR },
            { "effective_timestamp", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table BIZ_RULE_CONFIG (BIZ_RULE_ID LONG not null primary key,SERVICE_ID LONG,CHANNEL_ID LONG,PMT_METHOD_ID LONG,CUSTOM_VALUE VARCHAR(75) null,RULE_ID LONG,TRANS_ID VARCHAR(75) null,CLIENT_IP VARCHAR(75) null,SERVER_IP VARCHAR(75) null,USER_AGENT VARCHAR(75) null,OPERATION VARCHAR(75) null,last_update_timestamp DATE null,last_update_userid VARCHAR(75) null,last_update_username VARCHAR(75) null,status VARCHAR(75) null,effective_timestamp DATE null)";
    public static final String TABLE_SQL_DROP = "drop table BIZ_RULE_CONFIG";
    public static final String ORDER_BY_JPQL = " ORDER BY bizRuleConfig.bizRuleId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY BIZ_RULE_CONFIG.BIZ_RULE_ID ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.BizRuleConfig"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.BizRuleConfig"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.BizRuleConfig"));
    private static ClassLoader _classLoader = BizRuleConfig.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            BizRuleConfig.class
        };
    private long _bizRuleId;
    private long _serviceId;
    private long _channelId;
    private long _pmtMethodId;
    private String _customValue;
    private long _ruleId;
    private String _transId;
    private String _clientIP;
    private String _serverIP;
    private String _userAgent;
    private String _operation;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private Date _effectiveTimestamp;
    private BizRuleConfig _escapedModel;

    public BizRuleConfigModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static BizRuleConfig toModel(BizRuleConfigSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        BizRuleConfig model = new BizRuleConfigImpl();

        model.setBizRuleId(soapModel.getBizRuleId());
        model.setServiceId(soapModel.getServiceId());
        model.setChannelId(soapModel.getChannelId());
        model.setPmtMethodId(soapModel.getPmtMethodId());
        model.setCustomValue(soapModel.getCustomValue());
        model.setRuleId(soapModel.getRuleId());
        model.setTransId(soapModel.getTransId());
        model.setClientIP(soapModel.getClientIP());
        model.setServerIP(soapModel.getServerIP());
        model.setUserAgent(soapModel.getUserAgent());
        model.setOperation(soapModel.getOperation());
        model.setLastUpdateTimestamp(soapModel.getLastUpdateTimestamp());
        model.setLastUpdateUserid(soapModel.getLastUpdateUserid());
        model.setLastUpdateUsername(soapModel.getLastUpdateUsername());
        model.setStatus(soapModel.getStatus());
        model.setEffectiveTimestamp(soapModel.getEffectiveTimestamp());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<BizRuleConfig> toModels(BizRuleConfigSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<BizRuleConfig> models = new ArrayList<BizRuleConfig>(soapModels.length);

        for (BizRuleConfigSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _bizRuleId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBizRuleId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bizRuleId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return BizRuleConfig.class;
    }

    @Override
    public String getModelClassName() {
        return BizRuleConfig.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bizRuleId", getBizRuleId());
        attributes.put("serviceId", getServiceId());
        attributes.put("channelId", getChannelId());
        attributes.put("pmtMethodId", getPmtMethodId());
        attributes.put("customValue", getCustomValue());
        attributes.put("ruleId", getRuleId());
        attributes.put("transId", getTransId());
        attributes.put("clientIP", getClientIP());
        attributes.put("serverIP", getServerIP());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bizRuleId = (Long) attributes.get("bizRuleId");

        if (bizRuleId != null) {
            setBizRuleId(bizRuleId);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        Long pmtMethodId = (Long) attributes.get("pmtMethodId");

        if (pmtMethodId != null) {
            setPmtMethodId(pmtMethodId);
        }

        String customValue = (String) attributes.get("customValue");

        if (customValue != null) {
            setCustomValue(customValue);
        }

        Long ruleId = (Long) attributes.get("ruleId");

        if (ruleId != null) {
            setRuleId(ruleId);
        }

        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
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

    @JSON
    @Override
    public long getBizRuleId() {
        return _bizRuleId;
    }

    @Override
    public void setBizRuleId(long bizRuleId) {
        _bizRuleId = bizRuleId;
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

    @JSON
    @Override
    public long getChannelId() {
        return _channelId;
    }

    @Override
    public void setChannelId(long channelId) {
        _channelId = channelId;
    }

    @JSON
    @Override
    public long getPmtMethodId() {
        return _pmtMethodId;
    }

    @Override
    public void setPmtMethodId(long pmtMethodId) {
        _pmtMethodId = pmtMethodId;
    }

    @JSON
    @Override
    public String getCustomValue() {
        if (_customValue == null) {
            return StringPool.BLANK;
        } else {
            return _customValue;
        }
    }

    @Override
    public void setCustomValue(String customValue) {
        _customValue = customValue;
    }

    @JSON
    @Override
    public long getRuleId() {
        return _ruleId;
    }

    @Override
    public void setRuleId(long ruleId) {
        _ruleId = ruleId;
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
    public String getClientIP() {
        if (_clientIP == null) {
            return StringPool.BLANK;
        } else {
            return _clientIP;
        }
    }

    @Override
    public void setClientIP(String clientIP) {
        _clientIP = clientIP;
    }

    @JSON
    @Override
    public String getServerIP() {
        if (_serverIP == null) {
            return StringPool.BLANK;
        } else {
            return _serverIP;
        }
    }

    @Override
    public void setServerIP(String serverIP) {
        _serverIP = serverIP;
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
    public String getStatus() {
        if (_status == null) {
            return StringPool.BLANK;
        } else {
            return _status;
        }
    }

    @Override
    public void setStatus(String status) {
        _status = status;
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

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            BizRuleConfig.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public BizRuleConfig toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (BizRuleConfig) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        BizRuleConfigImpl bizRuleConfigImpl = new BizRuleConfigImpl();

        bizRuleConfigImpl.setBizRuleId(getBizRuleId());
        bizRuleConfigImpl.setServiceId(getServiceId());
        bizRuleConfigImpl.setChannelId(getChannelId());
        bizRuleConfigImpl.setPmtMethodId(getPmtMethodId());
        bizRuleConfigImpl.setCustomValue(getCustomValue());
        bizRuleConfigImpl.setRuleId(getRuleId());
        bizRuleConfigImpl.setTransId(getTransId());
        bizRuleConfigImpl.setClientIP(getClientIP());
        bizRuleConfigImpl.setServerIP(getServerIP());
        bizRuleConfigImpl.setUserAgent(getUserAgent());
        bizRuleConfigImpl.setOperation(getOperation());
        bizRuleConfigImpl.setLastUpdateTimestamp(getLastUpdateTimestamp());
        bizRuleConfigImpl.setLastUpdateUserid(getLastUpdateUserid());
        bizRuleConfigImpl.setLastUpdateUsername(getLastUpdateUsername());
        bizRuleConfigImpl.setStatus(getStatus());
        bizRuleConfigImpl.setEffectiveTimestamp(getEffectiveTimestamp());

        bizRuleConfigImpl.resetOriginalValues();

        return bizRuleConfigImpl;
    }

    @Override
    public int compareTo(BizRuleConfig bizRuleConfig) {
        long primaryKey = bizRuleConfig.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BizRuleConfig)) {
            return false;
        }

        BizRuleConfig bizRuleConfig = (BizRuleConfig) obj;

        long primaryKey = bizRuleConfig.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<BizRuleConfig> toCacheModel() {
        BizRuleConfigCacheModel bizRuleConfigCacheModel = new BizRuleConfigCacheModel();

        bizRuleConfigCacheModel.bizRuleId = getBizRuleId();

        bizRuleConfigCacheModel.serviceId = getServiceId();

        bizRuleConfigCacheModel.channelId = getChannelId();

        bizRuleConfigCacheModel.pmtMethodId = getPmtMethodId();

        bizRuleConfigCacheModel.customValue = getCustomValue();

        String customValue = bizRuleConfigCacheModel.customValue;

        if ((customValue != null) && (customValue.length() == 0)) {
            bizRuleConfigCacheModel.customValue = null;
        }

        bizRuleConfigCacheModel.ruleId = getRuleId();

        bizRuleConfigCacheModel.transId = getTransId();

        String transId = bizRuleConfigCacheModel.transId;

        if ((transId != null) && (transId.length() == 0)) {
            bizRuleConfigCacheModel.transId = null;
        }

        bizRuleConfigCacheModel.clientIP = getClientIP();

        String clientIP = bizRuleConfigCacheModel.clientIP;

        if ((clientIP != null) && (clientIP.length() == 0)) {
            bizRuleConfigCacheModel.clientIP = null;
        }

        bizRuleConfigCacheModel.serverIP = getServerIP();

        String serverIP = bizRuleConfigCacheModel.serverIP;

        if ((serverIP != null) && (serverIP.length() == 0)) {
            bizRuleConfigCacheModel.serverIP = null;
        }

        bizRuleConfigCacheModel.userAgent = getUserAgent();

        String userAgent = bizRuleConfigCacheModel.userAgent;

        if ((userAgent != null) && (userAgent.length() == 0)) {
            bizRuleConfigCacheModel.userAgent = null;
        }

        bizRuleConfigCacheModel.operation = getOperation();

        String operation = bizRuleConfigCacheModel.operation;

        if ((operation != null) && (operation.length() == 0)) {
            bizRuleConfigCacheModel.operation = null;
        }

        Date lastUpdateTimestamp = getLastUpdateTimestamp();

        if (lastUpdateTimestamp != null) {
            bizRuleConfigCacheModel.lastUpdateTimestamp = lastUpdateTimestamp.getTime();
        } else {
            bizRuleConfigCacheModel.lastUpdateTimestamp = Long.MIN_VALUE;
        }

        bizRuleConfigCacheModel.lastUpdateUserid = getLastUpdateUserid();

        String lastUpdateUserid = bizRuleConfigCacheModel.lastUpdateUserid;

        if ((lastUpdateUserid != null) && (lastUpdateUserid.length() == 0)) {
            bizRuleConfigCacheModel.lastUpdateUserid = null;
        }

        bizRuleConfigCacheModel.lastUpdateUsername = getLastUpdateUsername();

        String lastUpdateUsername = bizRuleConfigCacheModel.lastUpdateUsername;

        if ((lastUpdateUsername != null) && (lastUpdateUsername.length() == 0)) {
            bizRuleConfigCacheModel.lastUpdateUsername = null;
        }

        bizRuleConfigCacheModel.status = getStatus();

        String status = bizRuleConfigCacheModel.status;

        if ((status != null) && (status.length() == 0)) {
            bizRuleConfigCacheModel.status = null;
        }

        Date effectiveTimestamp = getEffectiveTimestamp();

        if (effectiveTimestamp != null) {
            bizRuleConfigCacheModel.effectiveTimestamp = effectiveTimestamp.getTime();
        } else {
            bizRuleConfigCacheModel.effectiveTimestamp = Long.MIN_VALUE;
        }

        return bizRuleConfigCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{bizRuleId=");
        sb.append(getBizRuleId());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", channelId=");
        sb.append(getChannelId());
        sb.append(", pmtMethodId=");
        sb.append(getPmtMethodId());
        sb.append(", customValue=");
        sb.append(getCustomValue());
        sb.append(", ruleId=");
        sb.append(getRuleId());
        sb.append(", transId=");
        sb.append(getTransId());
        sb.append(", clientIP=");
        sb.append(getClientIP());
        sb.append(", serverIP=");
        sb.append(getServerIP());
        sb.append(", userAgent=");
        sb.append(getUserAgent());
        sb.append(", operation=");
        sb.append(getOperation());
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
        StringBundler sb = new StringBundler(52);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.BizRuleConfig");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bizRuleId</column-name><column-value><![CDATA[");
        sb.append(getBizRuleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>channelId</column-name><column-value><![CDATA[");
        sb.append(getChannelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pmtMethodId</column-name><column-value><![CDATA[");
        sb.append(getPmtMethodId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>customValue</column-name><column-value><![CDATA[");
        sb.append(getCustomValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ruleId</column-name><column-value><![CDATA[");
        sb.append(getRuleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transId</column-name><column-value><![CDATA[");
        sb.append(getTransId());
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
