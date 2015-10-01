package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.model.BankBranch;
import com.stc.echannels.epayments.model.BankBranchModel;
import com.stc.echannels.epayments.model.BankBranchSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the BankBranch service. Represents a row in the &quot;BRANCH_CODES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.BankBranchModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BankBranchImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankBranchImpl
 * @see com.stc.echannels.epayments.model.BankBranch
 * @see com.stc.echannels.epayments.model.BankBranchModel
 * @generated
 */
@JSON(strict = true)
public class BankBranchModelImpl extends BaseModelImpl<BankBranch>
    implements BankBranchModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a bank branch model instance should use the {@link com.stc.echannels.epayments.model.BankBranch} interface instead.
     */
    public static final String TABLE_NAME = "BRANCH_CODES_MAP";
    public static final Object[][] TABLE_COLUMNS = {
            { "TRANS_ID", Types.VARCHAR },
            { "STC_BRANCH_CODE", Types.VARCHAR },
            { "BANK_ID", Types.VARCHAR },
            { "PAYMENT_CHANNEL_ID", Types.BIGINT },
            { "last_update_timestamp", Types.TIMESTAMP },
            { "last_update_userid", Types.VARCHAR },
            { "last_update_username", Types.VARCHAR },
            { "active", Types.VARCHAR },
            { "status", Types.VARCHAR },
            { "effective_timestamp", Types.TIMESTAMP },
            { "CLIENT_IP", Types.VARCHAR },
            { "SERVER_IP", Types.VARCHAR },
            { "USER_AGENT", Types.VARCHAR },
            { "OPERATION", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table BRANCH_CODES_MAP (TRANS_ID VARCHAR(75) not null primary key,STC_BRANCH_CODE VARCHAR(75) null,BANK_ID VARCHAR(75) null,PAYMENT_CHANNEL_ID LONG,last_update_timestamp DATE null,last_update_userid VARCHAR(75) null,last_update_username VARCHAR(75) null,active VARCHAR(75) null,status VARCHAR(75) null,effective_timestamp DATE null,CLIENT_IP VARCHAR(75) null,SERVER_IP VARCHAR(75) null,USER_AGENT VARCHAR(200) null,OPERATION VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table BRANCH_CODES_MAP";
    public static final String ORDER_BY_JPQL = " ORDER BY bankBranch.bankId ASC, bankBranch.channelId ASC, bankBranch.stcBranchCode ASC";
    public static final String ORDER_BY_SQL = " ORDER BY BRANCH_CODES_MAP.BANK_ID ASC, BRANCH_CODES_MAP.PAYMENT_CHANNEL_ID ASC, BRANCH_CODES_MAP.STC_BRANCH_CODE ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.BankBranch"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.BankBranch"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.stc.echannels.epayments.model.BankBranch"),
            true);
    public static long ACTIVE_COLUMN_BITMASK = 1L;
    public static long BANKID_COLUMN_BITMASK = 2L;
    public static long CHANNELID_COLUMN_BITMASK = 4L;
    public static long STATUS_COLUMN_BITMASK = 8L;
    public static long STCBRANCHCODE_COLUMN_BITMASK = 16L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.BankBranch"));
    private static ClassLoader _classLoader = BankBranch.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            BankBranch.class
        };
    private String _transId;
    private String _stcBranchCode;
    private String _originalStcBranchCode;
    private String _bankId;
    private String _originalBankId;
    private long _channelId;
    private long _originalChannelId;
    private boolean _setOriginalChannelId;
    private Date _lastUpdateTimestamp;
    private String _lastUpdateUserid;
    private String _lastUpdateUsername;
    private String _active;
    private String _originalActive;
    private String _status;
    private String _originalStatus;
    private Date _effectiveTimestamp;
    private String _clientIp;
    private String _serverIp;
    private String _userAgent;
    private String _operation;
    private long _columnBitmask;
    private BankBranch _escapedModel;

    public BankBranchModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static BankBranch toModel(BankBranchSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        BankBranch model = new BankBranchImpl();

        model.setTransId(soapModel.getTransId());
        model.setStcBranchCode(soapModel.getStcBranchCode());
        model.setBankId(soapModel.getBankId());
        model.setChannelId(soapModel.getChannelId());
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

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<BankBranch> toModels(BankBranchSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<BankBranch> models = new ArrayList<BankBranch>(soapModels.length);

        for (BankBranchSoap soapModel : soapModels) {
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
        return BankBranch.class;
    }

    @Override
    public String getModelClassName() {
        return BankBranch.class.getName();
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
    public String getStcBranchCode() {
        if (_stcBranchCode == null) {
            return StringPool.BLANK;
        } else {
            return _stcBranchCode;
        }
    }

    @Override
    public void setStcBranchCode(String stcBranchCode) {
        _columnBitmask = -1L;

        if (_originalStcBranchCode == null) {
            _originalStcBranchCode = _stcBranchCode;
        }

        _stcBranchCode = stcBranchCode;
    }

    public String getOriginalStcBranchCode() {
        return GetterUtil.getString(_originalStcBranchCode);
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
    public long getChannelId() {
        return _channelId;
    }

    @Override
    public void setChannelId(long channelId) {
        _columnBitmask = -1L;

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

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public BankBranch toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (BankBranch) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        BankBranchImpl bankBranchImpl = new BankBranchImpl();

        bankBranchImpl.setTransId(getTransId());
        bankBranchImpl.setStcBranchCode(getStcBranchCode());
        bankBranchImpl.setBankId(getBankId());
        bankBranchImpl.setChannelId(getChannelId());
        bankBranchImpl.setLastUpdateTimestamp(getLastUpdateTimestamp());
        bankBranchImpl.setLastUpdateUserid(getLastUpdateUserid());
        bankBranchImpl.setLastUpdateUsername(getLastUpdateUsername());
        bankBranchImpl.setActive(getActive());
        bankBranchImpl.setStatus(getStatus());
        bankBranchImpl.setEffectiveTimestamp(getEffectiveTimestamp());
        bankBranchImpl.setClientIp(getClientIp());
        bankBranchImpl.setServerIp(getServerIp());
        bankBranchImpl.setUserAgent(getUserAgent());
        bankBranchImpl.setOperation(getOperation());

        bankBranchImpl.resetOriginalValues();

        return bankBranchImpl;
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

        if (!(obj instanceof BankBranch)) {
            return false;
        }

        BankBranch bankBranch = (BankBranch) obj;

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
    public void resetOriginalValues() {
        BankBranchModelImpl bankBranchModelImpl = this;

        bankBranchModelImpl._originalStcBranchCode = bankBranchModelImpl._stcBranchCode;

        bankBranchModelImpl._originalBankId = bankBranchModelImpl._bankId;

        bankBranchModelImpl._originalChannelId = bankBranchModelImpl._channelId;

        bankBranchModelImpl._setOriginalChannelId = false;

        bankBranchModelImpl._originalActive = bankBranchModelImpl._active;

        bankBranchModelImpl._originalStatus = bankBranchModelImpl._status;

        bankBranchModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<BankBranch> toCacheModel() {
        BankBranchCacheModel bankBranchCacheModel = new BankBranchCacheModel();

        bankBranchCacheModel.transId = getTransId();

        String transId = bankBranchCacheModel.transId;

        if ((transId != null) && (transId.length() == 0)) {
            bankBranchCacheModel.transId = null;
        }

        bankBranchCacheModel.stcBranchCode = getStcBranchCode();

        String stcBranchCode = bankBranchCacheModel.stcBranchCode;

        if ((stcBranchCode != null) && (stcBranchCode.length() == 0)) {
            bankBranchCacheModel.stcBranchCode = null;
        }

        bankBranchCacheModel.bankId = getBankId();

        String bankId = bankBranchCacheModel.bankId;

        if ((bankId != null) && (bankId.length() == 0)) {
            bankBranchCacheModel.bankId = null;
        }

        bankBranchCacheModel.channelId = getChannelId();

        Date lastUpdateTimestamp = getLastUpdateTimestamp();

        if (lastUpdateTimestamp != null) {
            bankBranchCacheModel.lastUpdateTimestamp = lastUpdateTimestamp.getTime();
        } else {
            bankBranchCacheModel.lastUpdateTimestamp = Long.MIN_VALUE;
        }

        bankBranchCacheModel.lastUpdateUserid = getLastUpdateUserid();

        String lastUpdateUserid = bankBranchCacheModel.lastUpdateUserid;

        if ((lastUpdateUserid != null) && (lastUpdateUserid.length() == 0)) {
            bankBranchCacheModel.lastUpdateUserid = null;
        }

        bankBranchCacheModel.lastUpdateUsername = getLastUpdateUsername();

        String lastUpdateUsername = bankBranchCacheModel.lastUpdateUsername;

        if ((lastUpdateUsername != null) && (lastUpdateUsername.length() == 0)) {
            bankBranchCacheModel.lastUpdateUsername = null;
        }

        bankBranchCacheModel.active = getActive();

        String active = bankBranchCacheModel.active;

        if ((active != null) && (active.length() == 0)) {
            bankBranchCacheModel.active = null;
        }

        bankBranchCacheModel.status = getStatus();

        String status = bankBranchCacheModel.status;

        if ((status != null) && (status.length() == 0)) {
            bankBranchCacheModel.status = null;
        }

        Date effectiveTimestamp = getEffectiveTimestamp();

        if (effectiveTimestamp != null) {
            bankBranchCacheModel.effectiveTimestamp = effectiveTimestamp.getTime();
        } else {
            bankBranchCacheModel.effectiveTimestamp = Long.MIN_VALUE;
        }

        bankBranchCacheModel.clientIp = getClientIp();

        String clientIp = bankBranchCacheModel.clientIp;

        if ((clientIp != null) && (clientIp.length() == 0)) {
            bankBranchCacheModel.clientIp = null;
        }

        bankBranchCacheModel.serverIp = getServerIp();

        String serverIp = bankBranchCacheModel.serverIp;

        if ((serverIp != null) && (serverIp.length() == 0)) {
            bankBranchCacheModel.serverIp = null;
        }

        bankBranchCacheModel.userAgent = getUserAgent();

        String userAgent = bankBranchCacheModel.userAgent;

        if ((userAgent != null) && (userAgent.length() == 0)) {
            bankBranchCacheModel.userAgent = null;
        }

        bankBranchCacheModel.operation = getOperation();

        String operation = bankBranchCacheModel.operation;

        if ((operation != null) && (operation.length() == 0)) {
            bankBranchCacheModel.operation = null;
        }

        return bankBranchCacheModel;
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
