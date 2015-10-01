package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.model.SystemConfig;
import com.stc.echannels.epayments.model.SystemConfigModel;
import com.stc.echannels.epayments.model.SystemConfigSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SystemConfig service. Represents a row in the &quot;SYSTEM_CONFIG_MGR&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.SystemConfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SystemConfigImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see SystemConfigImpl
 * @see com.stc.echannels.epayments.model.SystemConfig
 * @see com.stc.echannels.epayments.model.SystemConfigModel
 * @generated
 */
@JSON(strict = true)
public class SystemConfigModelImpl extends BaseModelImpl<SystemConfig>
    implements SystemConfigModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a system config model instance should use the {@link com.stc.echannels.epayments.model.SystemConfig} interface instead.
     */
    public static final String TABLE_NAME = "SYSTEM_CONFIG_MGR";
    public static final Object[][] TABLE_COLUMNS = {
            { "TRANS_ID", Types.VARCHAR },
            { "last_update_timestamp", Types.TIMESTAMP },
            { "last_update_userid", Types.VARCHAR },
            { "last_update_username", Types.VARCHAR },
            { "status", Types.VARCHAR },
            { "effective_timestamp", Types.TIMESTAMP },
            { "CLIENT_IP", Types.VARCHAR },
            { "SERVER_IP", Types.VARCHAR },
            { "USER_AGENT", Types.VARCHAR },
            { "OPERATION", Types.VARCHAR },
            { "service_Id", Types.BIGINT },
            { "bank_Id", Types.VARCHAR },
            { "config_code", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table SYSTEM_CONFIG_MGR (TRANS_ID VARCHAR(75) not null primary key,last_update_timestamp DATE null,last_update_userid VARCHAR(75) null,last_update_username VARCHAR(75) null,status VARCHAR(75) null,effective_timestamp DATE null,CLIENT_IP VARCHAR(75) null,SERVER_IP VARCHAR(75) null,USER_AGENT VARCHAR(200) null,OPERATION VARCHAR(75) null,service_Id LONG,bank_Id VARCHAR(75) null,config_code VARCHAR(200) null)";
    public static final String TABLE_SQL_DROP = "drop table SYSTEM_CONFIG_MGR";
    public static final String ORDER_BY_JPQL = " ORDER BY systemConfig.serviceId ASC, systemConfig.bankId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY SYSTEM_CONFIG_MGR.service_Id ASC, SYSTEM_CONFIG_MGR.bank_Id ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.SystemConfig"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.SystemConfig"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.stc.echannels.epayments.model.SystemConfig"),
            true);
    public static long BANKID_COLUMN_BITMASK = 1L;
    public static long SERVICEID_COLUMN_BITMASK = 2L;
    public static long STATUS_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.SystemConfig"));
    private static ClassLoader _classLoader = SystemConfig.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            SystemConfig.class
        };
    private String _transId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _status;
    private String _originalStatus;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private long _serviceId;
    private long _originalServiceId;
    private boolean _setOriginalServiceId;
    private String _bankId;
    private String _originalBankId;
    private String _config;
    private long _columnBitmask;
    private SystemConfig _escapedModel;

    public SystemConfigModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static SystemConfig toModel(SystemConfigSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        SystemConfig model = new SystemConfigImpl();

        model.setTransId(soapModel.getTransId());
        model.setLastUpdateTimestamp(soapModel.getLastUpdateTimestamp());
        model.setLastUpdateUserid(soapModel.getLastUpdateUserid());
        model.setLastUpdateUsername(soapModel.getLastUpdateUsername());
        model.setStatus(soapModel.getStatus());
        model.setEffectiveTimestamp(soapModel.getEffectiveTimestamp());
        model.setClientIp(soapModel.getClientIp());
        model.setServerIp(soapModel.getServerIp());
        model.setUserAgent(soapModel.getUserAgent());
        model.setOperation(soapModel.getOperation());
        model.setServiceId(soapModel.getServiceId());
        model.setBankId(soapModel.getBankId());
        model.setConfig(soapModel.getConfig());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<SystemConfig> toModels(SystemConfigSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<SystemConfig> models = new ArrayList<SystemConfig>(soapModels.length);

        for (SystemConfigSoap soapModel : soapModels) {
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
        return SystemConfig.class;
    }

    @Override
    public String getModelClassName() {
        return SystemConfig.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("serviceId", getServiceId());
        attributes.put("bankId", getBankId());
        attributes.put("config", getConfig());

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

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }

        String bankId = (String) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        String config = (String) attributes.get("config");

        if (config != null) {
            setConfig(config);
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
    public long getServiceId() {
        return _serviceId;
    }

    @Override
    public void setServiceId(long serviceId) {
        _columnBitmask = -1L;

        if (!_setOriginalServiceId) {
            _setOriginalServiceId = true;

            _originalServiceId = _serviceId;
        }

        _serviceId = serviceId;
    }

    public long getOriginalServiceId() {
        return _originalServiceId;
    }

    @JSON
    @Override
    public String getBankId() {
        if (_bankId == null) {
            return StringPool.BLANK;
        } else {
            return _bankId;
        }
    }

    @Override
    public void setBankId(String bankId) {
        _columnBitmask = -1L;

        if (_originalBankId == null) {
            _originalBankId = _bankId;
        }

        _bankId = bankId;
    }

    public String getOriginalBankId() {
        return GetterUtil.getString(_originalBankId);
    }

    @JSON
    @Override
    public String getConfig() {
        if (_config == null) {
            return StringPool.BLANK;
        } else {
            return _config;
        }
    }

    @Override
    public void setConfig(String config) {
        _config = config;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public SystemConfig toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (SystemConfig) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        SystemConfigImpl systemConfigImpl = new SystemConfigImpl();

        systemConfigImpl.setTransId(getTransId());
        systemConfigImpl.setLastUpdateTimestamp(getLastUpdateTimestamp());
        systemConfigImpl.setLastUpdateUserid(getLastUpdateUserid());
        systemConfigImpl.setLastUpdateUsername(getLastUpdateUsername());
        systemConfigImpl.setStatus(getStatus());
        systemConfigImpl.setEffectiveTimestamp(getEffectiveTimestamp());
        systemConfigImpl.setClientIp(getClientIp());
        systemConfigImpl.setServerIp(getServerIp());
        systemConfigImpl.setUserAgent(getUserAgent());
        systemConfigImpl.setOperation(getOperation());
        systemConfigImpl.setServiceId(getServiceId());
        systemConfigImpl.setBankId(getBankId());
        systemConfigImpl.setConfig(getConfig());

        systemConfigImpl.resetOriginalValues();

        return systemConfigImpl;
    }

    @Override
    public int compareTo(SystemConfig systemConfig) {
        int value = 0;

        if (getServiceId() < systemConfig.getServiceId()) {
            value = -1;
        } else if (getServiceId() > systemConfig.getServiceId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = getBankId().compareTo(systemConfig.getBankId());

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

        if (!(obj instanceof SystemConfig)) {
            return false;
        }

        SystemConfig systemConfig = (SystemConfig) obj;

        String primaryKey = systemConfig.getPrimaryKey();

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
        SystemConfigModelImpl systemConfigModelImpl = this;

        systemConfigModelImpl._originalStatus = systemConfigModelImpl._status;

        systemConfigModelImpl._originalServiceId = systemConfigModelImpl._serviceId;

        systemConfigModelImpl._setOriginalServiceId = false;

        systemConfigModelImpl._originalBankId = systemConfigModelImpl._bankId;

        systemConfigModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<SystemConfig> toCacheModel() {
        SystemConfigCacheModel systemConfigCacheModel = new SystemConfigCacheModel();

        systemConfigCacheModel.transId = getTransId();

        String transId = systemConfigCacheModel.transId;

        if ((transId != null) && (transId.length() == 0)) {
            systemConfigCacheModel.transId = null;
        }

        Date lastUpdateTimestamp = getLastUpdateTimestamp();

        if (lastUpdateTimestamp != null) {
            systemConfigCacheModel.lastUpdateTimestamp = lastUpdateTimestamp.getTime();
        } else {
            systemConfigCacheModel.lastUpdateTimestamp = Long.MIN_VALUE;
        }

        systemConfigCacheModel.lastUpdateUserid = getLastUpdateUserid();

        String lastUpdateUserid = systemConfigCacheModel.lastUpdateUserid;

        if ((lastUpdateUserid != null) && (lastUpdateUserid.length() == 0)) {
            systemConfigCacheModel.lastUpdateUserid = null;
        }

        systemConfigCacheModel.lastUpdateUsername = getLastUpdateUsername();

        String lastUpdateUsername = systemConfigCacheModel.lastUpdateUsername;

        if ((lastUpdateUsername != null) && (lastUpdateUsername.length() == 0)) {
            systemConfigCacheModel.lastUpdateUsername = null;
        }

        systemConfigCacheModel.status = getStatus();

        String status = systemConfigCacheModel.status;

        if ((status != null) && (status.length() == 0)) {
            systemConfigCacheModel.status = null;
        }

        Date effectiveTimestamp = getEffectiveTimestamp();

        if (effectiveTimestamp != null) {
            systemConfigCacheModel.effectiveTimestamp = effectiveTimestamp.getTime();
        } else {
            systemConfigCacheModel.effectiveTimestamp = Long.MIN_VALUE;
        }

        systemConfigCacheModel.clientIp = getClientIp();

        String clientIp = systemConfigCacheModel.clientIp;

        if ((clientIp != null) && (clientIp.length() == 0)) {
            systemConfigCacheModel.clientIp = null;
        }

        systemConfigCacheModel.serverIp = getServerIp();

        String serverIp = systemConfigCacheModel.serverIp;

        if ((serverIp != null) && (serverIp.length() == 0)) {
            systemConfigCacheModel.serverIp = null;
        }

        systemConfigCacheModel.userAgent = getUserAgent();

        String userAgent = systemConfigCacheModel.userAgent;

        if ((userAgent != null) && (userAgent.length() == 0)) {
            systemConfigCacheModel.userAgent = null;
        }

        systemConfigCacheModel.operation = getOperation();

        String operation = systemConfigCacheModel.operation;

        if ((operation != null) && (operation.length() == 0)) {
            systemConfigCacheModel.operation = null;
        }

        systemConfigCacheModel.serviceId = getServiceId();

        systemConfigCacheModel.bankId = getBankId();

        String bankId = systemConfigCacheModel.bankId;

        if ((bankId != null) && (bankId.length() == 0)) {
            systemConfigCacheModel.bankId = null;
        }

        systemConfigCacheModel.config = getConfig();

        String config = systemConfigCacheModel.config;

        if ((config != null) && (config.length() == 0)) {
            systemConfigCacheModel.config = null;
        }

        return systemConfigCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{transId=");
        sb.append(getTransId());
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
        sb.append(", clientIp=");
        sb.append(getClientIp());
        sb.append(", serverIp=");
        sb.append(getServerIp());
        sb.append(", userAgent=");
        sb.append(getUserAgent());
        sb.append(", operation=");
        sb.append(getOperation());
        sb.append(", serviceId=");
        sb.append(getServiceId());
        sb.append(", bankId=");
        sb.append(getBankId());
        sb.append(", config=");
        sb.append(getConfig());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.SystemConfig");
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
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankId</column-name><column-value><![CDATA[");
        sb.append(getBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>config</column-name><column-value><![CDATA[");
        sb.append(getConfig());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
