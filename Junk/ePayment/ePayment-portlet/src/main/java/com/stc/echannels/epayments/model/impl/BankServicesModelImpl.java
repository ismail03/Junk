package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.model.BankServicesModel;
import com.stc.echannels.epayments.model.BankServicesSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the BankServices service. Represents a row in the &quot;BANK_SERVICES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.BankServicesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BankServicesImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankServicesImpl
 * @see com.stc.echannels.epayments.model.BankServices
 * @see com.stc.echannels.epayments.model.BankServicesModel
 * @generated
 */
@JSON(strict = true)
public class BankServicesModelImpl extends BaseModelImpl<BankServices>
    implements BankServicesModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a bank services model instance should use the {@link com.stc.echannels.epayments.model.BankServices} interface instead.
     */
    public static final String TABLE_NAME = "BANK_SERVICES_MAP";
    public static final Object[][] TABLE_COLUMNS = {
            { "BANK_ID", Types.VARCHAR },
            { "SERVICE_ID", Types.BIGINT },
            { "ID", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table BANK_SERVICES_MAP (BANK_ID VARCHAR(75) null,SERVICE_ID LONG,ID VARCHAR(75) not null primary key)";
    public static final String TABLE_SQL_DROP = "drop table BANK_SERVICES_MAP";
    public static final String ORDER_BY_JPQL = " ORDER BY bankServices.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY BANK_SERVICES_MAP.ID ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.BankServices"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.BankServices"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.stc.echannels.epayments.model.BankServices"),
            true);
    public static long BANKID_COLUMN_BITMASK = 1L;
    public static long SERVICEID_COLUMN_BITMASK = 2L;
    public static long ID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.BankServices"));
    private static ClassLoader _classLoader = BankServices.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            BankServices.class
        };
    private String _bankid;
    private String _originalBankid;
    private long _serviceid;
    private long _originalServiceid;
    private boolean _setOriginalServiceid;
    private String _id;
    private long _columnBitmask;
    private BankServices _escapedModel;

    public BankServicesModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static BankServices toModel(BankServicesSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        BankServices model = new BankServicesImpl();

        model.setBankid(soapModel.getBankid());
        model.setServiceid(soapModel.getServiceid());
        model.setId(soapModel.getId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<BankServices> toModels(BankServicesSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<BankServices> models = new ArrayList<BankServices>(soapModels.length);

        for (BankServicesSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public String getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return BankServices.class;
    }

    @Override
    public String getModelClassName() {
        return BankServices.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bankid", getBankid());
        attributes.put("serviceid", getServiceid());
        attributes.put("id", getId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String bankid = (String) attributes.get("bankid");

        if (bankid != null) {
            setBankid(bankid);
        }

        Long serviceid = (Long) attributes.get("serviceid");

        if (serviceid != null) {
            setServiceid(serviceid);
        }

        String id = (String) attributes.get("id");

        if (id != null) {
            setId(id);
        }
    }

    @JSON
    @Override
    public String getBankid() {
        if (_bankid == null) {
            return StringPool.BLANK;
        } else {
            return _bankid;
        }
    }

    @Override
    public void setBankid(String bankid) {
        _columnBitmask |= BANKID_COLUMN_BITMASK;

        if (_originalBankid == null) {
            _originalBankid = _bankid;
        }

        _bankid = bankid;
    }

    public String getOriginalBankid() {
        return GetterUtil.getString(_originalBankid);
    }

    @JSON
    @Override
    public long getServiceid() {
        return _serviceid;
    }

    @Override
    public void setServiceid(long serviceid) {
        _columnBitmask |= SERVICEID_COLUMN_BITMASK;

        if (!_setOriginalServiceid) {
            _setOriginalServiceid = true;

            _originalServiceid = _serviceid;
        }

        _serviceid = serviceid;
    }

    public long getOriginalServiceid() {
        return _originalServiceid;
    }

    @JSON
    @Override
    public String getId() {
        if (_id == null) {
            return StringPool.BLANK;
        } else {
            return _id;
        }
    }

    @Override
    public void setId(String id) {
        _id = id;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public BankServices toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (BankServices) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        BankServicesImpl bankServicesImpl = new BankServicesImpl();

        bankServicesImpl.setBankid(getBankid());
        bankServicesImpl.setServiceid(getServiceid());
        bankServicesImpl.setId(getId());

        bankServicesImpl.resetOriginalValues();

        return bankServicesImpl;
    }

    @Override
    public int compareTo(BankServices bankServices) {
        String primaryKey = bankServices.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankServices)) {
            return false;
        }

        BankServices bankServices = (BankServices) obj;

        String primaryKey = bankServices.getPrimaryKey();

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
        BankServicesModelImpl bankServicesModelImpl = this;

        bankServicesModelImpl._originalBankid = bankServicesModelImpl._bankid;

        bankServicesModelImpl._originalServiceid = bankServicesModelImpl._serviceid;

        bankServicesModelImpl._setOriginalServiceid = false;

        bankServicesModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<BankServices> toCacheModel() {
        BankServicesCacheModel bankServicesCacheModel = new BankServicesCacheModel();

        bankServicesCacheModel.bankid = getBankid();

        String bankid = bankServicesCacheModel.bankid;

        if ((bankid != null) && (bankid.length() == 0)) {
            bankServicesCacheModel.bankid = null;
        }

        bankServicesCacheModel.serviceid = getServiceid();

        bankServicesCacheModel.id = getId();

        String id = bankServicesCacheModel.id;

        if ((id != null) && (id.length() == 0)) {
            bankServicesCacheModel.id = null;
        }

        return bankServicesCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{bankid=");
        sb.append(getBankid());
        sb.append(", serviceid=");
        sb.append(getServiceid());
        sb.append(", id=");
        sb.append(getId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.BankServices");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bankid</column-name><column-value><![CDATA[");
        sb.append(getBankid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceid</column-name><column-value><![CDATA[");
        sb.append(getServiceid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
