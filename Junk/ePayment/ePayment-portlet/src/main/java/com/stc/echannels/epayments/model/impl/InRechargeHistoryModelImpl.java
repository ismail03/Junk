package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.model.InRechargeHistory;
import com.stc.echannels.epayments.model.InRechargeHistoryModel;
import com.stc.echannels.epayments.model.InRechargeHistorySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the InRechargeHistory service. Represents a row in the &quot;IN_RECHARGES_HISTORY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.InRechargeHistoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InRechargeHistoryImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see InRechargeHistoryImpl
 * @see com.stc.echannels.epayments.model.InRechargeHistory
 * @see com.stc.echannels.epayments.model.InRechargeHistoryModel
 * @generated
 */
@JSON(strict = true)
public class InRechargeHistoryModelImpl extends BaseModelImpl<InRechargeHistory>
    implements InRechargeHistoryModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a in recharge history model instance should use the {@link com.stc.echannels.epayments.model.InRechargeHistory} interface instead.
     */
    public static final String TABLE_NAME = "IN_RECHARGES_HISTORY";
    public static final Object[][] TABLE_COLUMNS = {
            { "MSISDN", Types.VARCHAR },
            { "TRANSACTION_ID", Types.VARCHAR },
            { "CARD_GROUP", Types.VARCHAR },
            { "SERVICE_CLASS", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table IN_RECHARGES_HISTORY (MSISDN VARCHAR(75) not null primary key,TRANSACTION_ID VARCHAR(75) null,CARD_GROUP VARCHAR(75) null,SERVICE_CLASS VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table IN_RECHARGES_HISTORY";
    public static final String ORDER_BY_JPQL = " ORDER BY inRechargeHistory.serviceClass ASC";
    public static final String ORDER_BY_SQL = " ORDER BY IN_RECHARGES_HISTORY.SERVICE_CLASS ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.InRechargeHistory"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.InRechargeHistory"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.InRechargeHistory"));
    private static ClassLoader _classLoader = InRechargeHistory.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            InRechargeHistory.class
        };
    private String _msisdn;
    private String _transactionId;
    private String _cardGroup;
    private String _serviceClass;
    private InRechargeHistory _escapedModel;

    public InRechargeHistoryModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static InRechargeHistory toModel(InRechargeHistorySoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        InRechargeHistory model = new InRechargeHistoryImpl();

        model.setMsisdn(soapModel.getMsisdn());
        model.setTransactionId(soapModel.getTransactionId());
        model.setCardGroup(soapModel.getCardGroup());
        model.setServiceClass(soapModel.getServiceClass());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<InRechargeHistory> toModels(
        InRechargeHistorySoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<InRechargeHistory> models = new ArrayList<InRechargeHistory>(soapModels.length);

        for (InRechargeHistorySoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public String getPrimaryKey() {
        return _msisdn;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setMsisdn(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _msisdn;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return InRechargeHistory.class;
    }

    @Override
    public String getModelClassName() {
        return InRechargeHistory.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("msisdn", getMsisdn());
        attributes.put("transactionId", getTransactionId());
        attributes.put("cardGroup", getCardGroup());
        attributes.put("serviceClass", getServiceClass());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String msisdn = (String) attributes.get("msisdn");

        if (msisdn != null) {
            setMsisdn(msisdn);
        }

        String transactionId = (String) attributes.get("transactionId");

        if (transactionId != null) {
            setTransactionId(transactionId);
        }

        String cardGroup = (String) attributes.get("cardGroup");

        if (cardGroup != null) {
            setCardGroup(cardGroup);
        }

        String serviceClass = (String) attributes.get("serviceClass");

        if (serviceClass != null) {
            setServiceClass(serviceClass);
        }
    }

    @JSON
    @Override
    public String getMsisdn() {
        if (_msisdn == null) {
            return StringPool.BLANK;
        } else {
            return _msisdn;
        }
    }

    @Override
    public void setMsisdn(String msisdn) {
        _msisdn = msisdn;
    }

    @JSON
    @Override
    public String getTransactionId() {
        if (_transactionId == null) {
            return StringPool.BLANK;
        } else {
            return _transactionId;
        }
    }

    @Override
    public void setTransactionId(String transactionId) {
        _transactionId = transactionId;
    }

    @JSON
    @Override
    public String getCardGroup() {
        if (_cardGroup == null) {
            return StringPool.BLANK;
        } else {
            return _cardGroup;
        }
    }

    @Override
    public void setCardGroup(String cardGroup) {
        _cardGroup = cardGroup;
    }

    @JSON
    @Override
    public String getServiceClass() {
        if (_serviceClass == null) {
            return StringPool.BLANK;
        } else {
            return _serviceClass;
        }
    }

    @Override
    public void setServiceClass(String serviceClass) {
        _serviceClass = serviceClass;
    }

    @Override
    public InRechargeHistory toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (InRechargeHistory) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        InRechargeHistoryImpl inRechargeHistoryImpl = new InRechargeHistoryImpl();

        inRechargeHistoryImpl.setMsisdn(getMsisdn());
        inRechargeHistoryImpl.setTransactionId(getTransactionId());
        inRechargeHistoryImpl.setCardGroup(getCardGroup());
        inRechargeHistoryImpl.setServiceClass(getServiceClass());

        inRechargeHistoryImpl.resetOriginalValues();

        return inRechargeHistoryImpl;
    }

    @Override
    public int compareTo(InRechargeHistory inRechargeHistory) {
        int value = 0;

        value = getServiceClass().compareTo(inRechargeHistory.getServiceClass());

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

        if (!(obj instanceof InRechargeHistory)) {
            return false;
        }

        InRechargeHistory inRechargeHistory = (InRechargeHistory) obj;

        String primaryKey = inRechargeHistory.getPrimaryKey();

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
    }

    @Override
    public CacheModel<InRechargeHistory> toCacheModel() {
        InRechargeHistoryCacheModel inRechargeHistoryCacheModel = new InRechargeHistoryCacheModel();

        inRechargeHistoryCacheModel.msisdn = getMsisdn();

        String msisdn = inRechargeHistoryCacheModel.msisdn;

        if ((msisdn != null) && (msisdn.length() == 0)) {
            inRechargeHistoryCacheModel.msisdn = null;
        }

        inRechargeHistoryCacheModel.transactionId = getTransactionId();

        String transactionId = inRechargeHistoryCacheModel.transactionId;

        if ((transactionId != null) && (transactionId.length() == 0)) {
            inRechargeHistoryCacheModel.transactionId = null;
        }

        inRechargeHistoryCacheModel.cardGroup = getCardGroup();

        String cardGroup = inRechargeHistoryCacheModel.cardGroup;

        if ((cardGroup != null) && (cardGroup.length() == 0)) {
            inRechargeHistoryCacheModel.cardGroup = null;
        }

        inRechargeHistoryCacheModel.serviceClass = getServiceClass();

        String serviceClass = inRechargeHistoryCacheModel.serviceClass;

        if ((serviceClass != null) && (serviceClass.length() == 0)) {
            inRechargeHistoryCacheModel.serviceClass = null;
        }

        return inRechargeHistoryCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{msisdn=");
        sb.append(getMsisdn());
        sb.append(", transactionId=");
        sb.append(getTransactionId());
        sb.append(", cardGroup=");
        sb.append(getCardGroup());
        sb.append(", serviceClass=");
        sb.append(getServiceClass());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.InRechargeHistory");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>msisdn</column-name><column-value><![CDATA[");
        sb.append(getMsisdn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>transactionId</column-name><column-value><![CDATA[");
        sb.append(getTransactionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cardGroup</column-name><column-value><![CDATA[");
        sb.append(getCardGroup());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceClass</column-name><column-value><![CDATA[");
        sb.append(getServiceClass());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
