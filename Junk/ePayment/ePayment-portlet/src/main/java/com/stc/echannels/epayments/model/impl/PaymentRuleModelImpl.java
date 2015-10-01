package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.model.PaymentRule;
import com.stc.echannels.epayments.model.PaymentRuleModel;
import com.stc.echannels.epayments.model.PaymentRuleSoap;
import com.stc.echannels.epayments.service.persistence.PaymentRulePK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the PaymentRule service. Represents a row in the &quot;PAYMENT_RULES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.PaymentRuleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentRuleImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentRuleImpl
 * @see com.stc.echannels.epayments.model.PaymentRule
 * @see com.stc.echannels.epayments.model.PaymentRuleModel
 * @generated
 */
@JSON(strict = true)
public class PaymentRuleModelImpl extends BaseModelImpl<PaymentRule>
    implements PaymentRuleModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a payment rule model instance should use the {@link com.stc.echannels.epayments.model.PaymentRule} interface instead.
     */
    public static final String TABLE_NAME = "PAYMENT_RULES";
    public static final Object[][] TABLE_COLUMNS = {
            { "RULE_ID", Types.BIGINT },
            { "TRANS_ID", Types.VARCHAR },
            { "RULE_NAME", Types.VARCHAR },
            { "VALUE", Types.VARCHAR },
            { "DESCRIPTION_EN", Types.VARCHAR },
            { "DESCRIPTION_AR", Types.VARCHAR },
            { "IS_EDITABLE", Types.VARCHAR },
            { "REFUND_ON_VIOLATION", Types.VARCHAR },
            { "RULE_CATEGORY", Types.VARCHAR },
            { "CLIENT_IP", Types.VARCHAR },
            { "SERVER_IP", Types.VARCHAR },
            { "USER_AGENT", Types.VARCHAR },
            { "OPERATION", Types.VARCHAR },
            { "IS_LIST", Types.VARCHAR },
            { "SERVICE_TYPE_ID", Types.BIGINT },
            { "last_update_timestamp", Types.TIMESTAMP },
            { "last_update_userid", Types.VARCHAR },
            { "last_update_username", Types.VARCHAR },
            { "status", Types.VARCHAR },
            { "effective_timestamp", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table PAYMENT_RULES (RULE_ID LONG not null,TRANS_ID VARCHAR(75) not null,RULE_NAME VARCHAR(75) null,VALUE VARCHAR(75) null,DESCRIPTION_EN VARCHAR(75) null,DESCRIPTION_AR VARCHAR(75) null,IS_EDITABLE VARCHAR(75) null,REFUND_ON_VIOLATION VARCHAR(75) null,RULE_CATEGORY VARCHAR(75) null,CLIENT_IP VARCHAR(75) null,SERVER_IP VARCHAR(75) null,USER_AGENT VARCHAR(75) null,OPERATION VARCHAR(75) null,IS_LIST VARCHAR(75) null,SERVICE_TYPE_ID LONG,last_update_timestamp DATE null,last_update_userid VARCHAR(75) null,last_update_username VARCHAR(75) null,status VARCHAR(75) null,effective_timestamp DATE null,primary key (RULE_ID, TRANS_ID))";
    public static final String TABLE_SQL_DROP = "drop table PAYMENT_RULES";
    public static final String ORDER_BY_JPQL = " ORDER BY paymentRule.ruleName ASC";
    public static final String ORDER_BY_SQL = " ORDER BY PAYMENT_RULES.RULE_NAME ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.PaymentRule"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.PaymentRule"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.stc.echannels.epayments.model.PaymentRule"),
            true);
    public static long RULECATEGORY_COLUMN_BITMASK = 1L;
    public static long RULEID_COLUMN_BITMASK = 2L;
    public static long STATUS_COLUMN_BITMASK = 4L;
    public static long TRANSID_COLUMN_BITMASK = 8L;
    public static long RULENAME_COLUMN_BITMASK = 16L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.PaymentRule"));
    private static ClassLoader _classLoader = PaymentRule.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            PaymentRule.class
        };
    private long _ruleId;
    private long _originalRuleId;
    private boolean _setOriginalRuleId;
    private String _transId;
    private String _originalTransId;
    private String _ruleName;
    private String _value;
    private String _descriptionEN;
    private String _descriptionAR;
    private String _isEditable;
    private String _refundOnViolation;
    private String _ruleCategory;
    private String _originalRuleCategory;
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
    private String _originalStatus;
    private Date _effectiveTimestamp;
    private long _columnBitmask;
    private PaymentRule _escapedModel;

    public PaymentRuleModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static PaymentRule toModel(PaymentRuleSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        PaymentRule model = new PaymentRuleImpl();

        model.setRuleId(soapModel.getRuleId());
        model.setTransId(soapModel.getTransId());
        model.setRuleName(soapModel.getRuleName());
        model.setValue(soapModel.getValue());
        model.setDescriptionEN(soapModel.getDescriptionEN());
        model.setDescriptionAR(soapModel.getDescriptionAR());
        model.setIsEditable(soapModel.getIsEditable());
        model.setRefundOnViolation(soapModel.getRefundOnViolation());
        model.setRuleCategory(soapModel.getRuleCategory());
        model.setClientIP(soapModel.getClientIP());
        model.setServerIP(soapModel.getServerIP());
        model.setUserAgent(soapModel.getUserAgent());
        model.setOperation(soapModel.getOperation());
        model.setIsList(soapModel.getIsList());
        model.setServiceTypeId(soapModel.getServiceTypeId());
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
    public static List<PaymentRule> toModels(PaymentRuleSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<PaymentRule> models = new ArrayList<PaymentRule>(soapModels.length);

        for (PaymentRuleSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return PaymentRule.class;
    }

    @Override
    public String getModelClassName() {
        return PaymentRule.class.getName();
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

    @JSON
    @Override
    public long getRuleId() {
        return _ruleId;
    }

    @Override
    public void setRuleId(long ruleId) {
        _columnBitmask |= RULEID_COLUMN_BITMASK;

        if (!_setOriginalRuleId) {
            _setOriginalRuleId = true;

            _originalRuleId = _ruleId;
        }

        _ruleId = ruleId;
    }

    public long getOriginalRuleId() {
        return _originalRuleId;
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
        _columnBitmask |= TRANSID_COLUMN_BITMASK;

        if (_originalTransId == null) {
            _originalTransId = _transId;
        }

        _transId = transId;
    }

    public String getOriginalTransId() {
        return GetterUtil.getString(_originalTransId);
    }

    @JSON
    @Override
    public String getRuleName() {
        if (_ruleName == null) {
            return StringPool.BLANK;
        } else {
            return _ruleName;
        }
    }

    @Override
    public void setRuleName(String ruleName) {
        _columnBitmask = -1L;

        _ruleName = ruleName;
    }

    @JSON
    @Override
    public String getValue() {
        if (_value == null) {
            return StringPool.BLANK;
        } else {
            return _value;
        }
    }

    @Override
    public void setValue(String value) {
        _value = value;
    }

    @JSON
    @Override
    public String getDescriptionEN() {
        if (_descriptionEN == null) {
            return StringPool.BLANK;
        } else {
            return _descriptionEN;
        }
    }

    @Override
    public void setDescriptionEN(String descriptionEN) {
        _descriptionEN = descriptionEN;
    }

    @JSON
    @Override
    public String getDescriptionAR() {
        if (_descriptionAR == null) {
            return StringPool.BLANK;
        } else {
            return _descriptionAR;
        }
    }

    @Override
    public void setDescriptionAR(String descriptionAR) {
        _descriptionAR = descriptionAR;
    }

    @JSON
    @Override
    public String getIsEditable() {
        if (_isEditable == null) {
            return StringPool.BLANK;
        } else {
            return _isEditable;
        }
    }

    @Override
    public void setIsEditable(String isEditable) {
        _isEditable = isEditable;
    }

    @JSON
    @Override
    public String getRefundOnViolation() {
        if (_refundOnViolation == null) {
            return StringPool.BLANK;
        } else {
            return _refundOnViolation;
        }
    }

    @Override
    public void setRefundOnViolation(String refundOnViolation) {
        _refundOnViolation = refundOnViolation;
    }

    @JSON
    @Override
    public String getRuleCategory() {
        if (_ruleCategory == null) {
            return StringPool.BLANK;
        } else {
            return _ruleCategory;
        }
    }

    @Override
    public void setRuleCategory(String ruleCategory) {
        _columnBitmask |= RULECATEGORY_COLUMN_BITMASK;

        if (_originalRuleCategory == null) {
            _originalRuleCategory = _ruleCategory;
        }

        _ruleCategory = ruleCategory;
    }

    public String getOriginalRuleCategory() {
        return GetterUtil.getString(_originalRuleCategory);
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
    public String getIsList() {
        if (_isList == null) {
            return StringPool.BLANK;
        } else {
            return _isList;
        }
    }

    @Override
    public void setIsList(String isList) {
        _isList = isList;
    }

    @JSON
    @Override
    public long getServiceTypeId() {
        return _serviceTypeId;
    }

    @Override
    public void setServiceTypeId(long serviceTypeId) {
        _serviceTypeId = serviceTypeId;
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

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public PaymentRule toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (PaymentRule) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PaymentRuleImpl paymentRuleImpl = new PaymentRuleImpl();

        paymentRuleImpl.setRuleId(getRuleId());
        paymentRuleImpl.setTransId(getTransId());
        paymentRuleImpl.setRuleName(getRuleName());
        paymentRuleImpl.setValue(getValue());
        paymentRuleImpl.setDescriptionEN(getDescriptionEN());
        paymentRuleImpl.setDescriptionAR(getDescriptionAR());
        paymentRuleImpl.setIsEditable(getIsEditable());
        paymentRuleImpl.setRefundOnViolation(getRefundOnViolation());
        paymentRuleImpl.setRuleCategory(getRuleCategory());
        paymentRuleImpl.setClientIP(getClientIP());
        paymentRuleImpl.setServerIP(getServerIP());
        paymentRuleImpl.setUserAgent(getUserAgent());
        paymentRuleImpl.setOperation(getOperation());
        paymentRuleImpl.setIsList(getIsList());
        paymentRuleImpl.setServiceTypeId(getServiceTypeId());
        paymentRuleImpl.setLastUpdateTimestamp(getLastUpdateTimestamp());
        paymentRuleImpl.setLastUpdateUserid(getLastUpdateUserid());
        paymentRuleImpl.setLastUpdateUsername(getLastUpdateUsername());
        paymentRuleImpl.setStatus(getStatus());
        paymentRuleImpl.setEffectiveTimestamp(getEffectiveTimestamp());

        paymentRuleImpl.resetOriginalValues();

        return paymentRuleImpl;
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

        if (!(obj instanceof PaymentRule)) {
            return false;
        }

        PaymentRule paymentRule = (PaymentRule) obj;

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
    public void resetOriginalValues() {
        PaymentRuleModelImpl paymentRuleModelImpl = this;

        paymentRuleModelImpl._originalRuleId = paymentRuleModelImpl._ruleId;

        paymentRuleModelImpl._setOriginalRuleId = false;

        paymentRuleModelImpl._originalTransId = paymentRuleModelImpl._transId;

        paymentRuleModelImpl._originalRuleCategory = paymentRuleModelImpl._ruleCategory;

        paymentRuleModelImpl._originalStatus = paymentRuleModelImpl._status;

        paymentRuleModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<PaymentRule> toCacheModel() {
        PaymentRuleCacheModel paymentRuleCacheModel = new PaymentRuleCacheModel();

        paymentRuleCacheModel.ruleId = getRuleId();

        paymentRuleCacheModel.transId = getTransId();

        String transId = paymentRuleCacheModel.transId;

        if ((transId != null) && (transId.length() == 0)) {
            paymentRuleCacheModel.transId = null;
        }

        paymentRuleCacheModel.ruleName = getRuleName();

        String ruleName = paymentRuleCacheModel.ruleName;

        if ((ruleName != null) && (ruleName.length() == 0)) {
            paymentRuleCacheModel.ruleName = null;
        }

        paymentRuleCacheModel.value = getValue();

        String value = paymentRuleCacheModel.value;

        if ((value != null) && (value.length() == 0)) {
            paymentRuleCacheModel.value = null;
        }

        paymentRuleCacheModel.descriptionEN = getDescriptionEN();

        String descriptionEN = paymentRuleCacheModel.descriptionEN;

        if ((descriptionEN != null) && (descriptionEN.length() == 0)) {
            paymentRuleCacheModel.descriptionEN = null;
        }

        paymentRuleCacheModel.descriptionAR = getDescriptionAR();

        String descriptionAR = paymentRuleCacheModel.descriptionAR;

        if ((descriptionAR != null) && (descriptionAR.length() == 0)) {
            paymentRuleCacheModel.descriptionAR = null;
        }

        paymentRuleCacheModel.isEditable = getIsEditable();

        String isEditable = paymentRuleCacheModel.isEditable;

        if ((isEditable != null) && (isEditable.length() == 0)) {
            paymentRuleCacheModel.isEditable = null;
        }

        paymentRuleCacheModel.refundOnViolation = getRefundOnViolation();

        String refundOnViolation = paymentRuleCacheModel.refundOnViolation;

        if ((refundOnViolation != null) && (refundOnViolation.length() == 0)) {
            paymentRuleCacheModel.refundOnViolation = null;
        }

        paymentRuleCacheModel.ruleCategory = getRuleCategory();

        String ruleCategory = paymentRuleCacheModel.ruleCategory;

        if ((ruleCategory != null) && (ruleCategory.length() == 0)) {
            paymentRuleCacheModel.ruleCategory = null;
        }

        paymentRuleCacheModel.clientIP = getClientIP();

        String clientIP = paymentRuleCacheModel.clientIP;

        if ((clientIP != null) && (clientIP.length() == 0)) {
            paymentRuleCacheModel.clientIP = null;
        }

        paymentRuleCacheModel.serverIP = getServerIP();

        String serverIP = paymentRuleCacheModel.serverIP;

        if ((serverIP != null) && (serverIP.length() == 0)) {
            paymentRuleCacheModel.serverIP = null;
        }

        paymentRuleCacheModel.userAgent = getUserAgent();

        String userAgent = paymentRuleCacheModel.userAgent;

        if ((userAgent != null) && (userAgent.length() == 0)) {
            paymentRuleCacheModel.userAgent = null;
        }

        paymentRuleCacheModel.operation = getOperation();

        String operation = paymentRuleCacheModel.operation;

        if ((operation != null) && (operation.length() == 0)) {
            paymentRuleCacheModel.operation = null;
        }

        paymentRuleCacheModel.isList = getIsList();

        String isList = paymentRuleCacheModel.isList;

        if ((isList != null) && (isList.length() == 0)) {
            paymentRuleCacheModel.isList = null;
        }

        paymentRuleCacheModel.serviceTypeId = getServiceTypeId();

        Date lastUpdateTimestamp = getLastUpdateTimestamp();

        if (lastUpdateTimestamp != null) {
            paymentRuleCacheModel.lastUpdateTimestamp = lastUpdateTimestamp.getTime();
        } else {
            paymentRuleCacheModel.lastUpdateTimestamp = Long.MIN_VALUE;
        }

        paymentRuleCacheModel.lastUpdateUserid = getLastUpdateUserid();

        String lastUpdateUserid = paymentRuleCacheModel.lastUpdateUserid;

        if ((lastUpdateUserid != null) && (lastUpdateUserid.length() == 0)) {
            paymentRuleCacheModel.lastUpdateUserid = null;
        }

        paymentRuleCacheModel.lastUpdateUsername = getLastUpdateUsername();

        String lastUpdateUsername = paymentRuleCacheModel.lastUpdateUsername;

        if ((lastUpdateUsername != null) && (lastUpdateUsername.length() == 0)) {
            paymentRuleCacheModel.lastUpdateUsername = null;
        }

        paymentRuleCacheModel.status = getStatus();

        String status = paymentRuleCacheModel.status;

        if ((status != null) && (status.length() == 0)) {
            paymentRuleCacheModel.status = null;
        }

        Date effectiveTimestamp = getEffectiveTimestamp();

        if (effectiveTimestamp != null) {
            paymentRuleCacheModel.effectiveTimestamp = effectiveTimestamp.getTime();
        } else {
            paymentRuleCacheModel.effectiveTimestamp = Long.MIN_VALUE;
        }

        return paymentRuleCacheModel;
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