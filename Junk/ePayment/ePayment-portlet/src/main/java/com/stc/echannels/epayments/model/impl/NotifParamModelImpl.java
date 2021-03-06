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

import com.stc.echannels.epayments.model.NotifParam;
import com.stc.echannels.epayments.model.NotifParamModel;
import com.stc.echannels.epayments.model.NotifParamSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the NotifParam service. Represents a row in the &quot;NOTIF_PARAMS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.NotifParamModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NotifParamImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifParamImpl
 * @see com.stc.echannels.epayments.model.NotifParam
 * @see com.stc.echannels.epayments.model.NotifParamModel
 * @generated
 */
@JSON(strict = true)
public class NotifParamModelImpl extends BaseModelImpl<NotifParam>
    implements NotifParamModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a notif param model instance should use the {@link com.stc.echannels.epayments.model.NotifParam} interface instead.
     */
    public static final String TABLE_NAME = "NOTIF_PARAMS";
    public static final Object[][] TABLE_COLUMNS = {
            { "NOTIF_PARAM_ID", Types.BIGINT },
            { "NOTIF_NAME_AR", Types.VARCHAR },
            { "NOTIF_NAME_EN", Types.VARCHAR },
            { "NOTIF_PARAM_NAME", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table NOTIF_PARAMS (NOTIF_PARAM_ID LONG not null primary key,NOTIF_NAME_AR VARCHAR(75) null,NOTIF_NAME_EN VARCHAR(75) null,NOTIF_PARAM_NAME VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table NOTIF_PARAMS";
    public static final String ORDER_BY_JPQL = " ORDER BY notifParam.paramName ASC";
    public static final String ORDER_BY_SQL = " ORDER BY NOTIF_PARAMS.NOTIF_PARAM_NAME ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.NotifParam"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.NotifParam"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.stc.echannels.epayments.model.NotifParam"),
            true);
    public static long NAMEAR_COLUMN_BITMASK = 1L;
    public static long NAMEEN_COLUMN_BITMASK = 2L;
    public static long NOTIFPARAMID_COLUMN_BITMASK = 4L;
    public static long PARAMNAME_COLUMN_BITMASK = 8L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.NotifParam"));
    private static ClassLoader _classLoader = NotifParam.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            NotifParam.class
        };
    private long _notifParamId;
    private long _originalNotifParamId;
    private boolean _setOriginalNotifParamId;
    private String _nameAr;
    private String _originalNameAr;
    private String _nameEn;
    private String _originalNameEn;
    private String _paramName;
    private long _columnBitmask;
    private NotifParam _escapedModel;

    public NotifParamModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static NotifParam toModel(NotifParamSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        NotifParam model = new NotifParamImpl();

        model.setNotifParamId(soapModel.getNotifParamId());
        model.setNameAr(soapModel.getNameAr());
        model.setNameEn(soapModel.getNameEn());
        model.setParamName(soapModel.getParamName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<NotifParam> toModels(NotifParamSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<NotifParam> models = new ArrayList<NotifParam>(soapModels.length);

        for (NotifParamSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _notifParamId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setNotifParamId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _notifParamId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return NotifParam.class;
    }

    @Override
    public String getModelClassName() {
        return NotifParam.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("notifParamId", getNotifParamId());
        attributes.put("nameAr", getNameAr());
        attributes.put("nameEn", getNameEn());
        attributes.put("paramName", getParamName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long notifParamId = (Long) attributes.get("notifParamId");

        if (notifParamId != null) {
            setNotifParamId(notifParamId);
        }

        String nameAr = (String) attributes.get("nameAr");

        if (nameAr != null) {
            setNameAr(nameAr);
        }

        String nameEn = (String) attributes.get("nameEn");

        if (nameEn != null) {
            setNameEn(nameEn);
        }

        String paramName = (String) attributes.get("paramName");

        if (paramName != null) {
            setParamName(paramName);
        }
    }

    @JSON
    @Override
    public long getNotifParamId() {
        return _notifParamId;
    }

    @Override
    public void setNotifParamId(long notifParamId) {
        _columnBitmask |= NOTIFPARAMID_COLUMN_BITMASK;

        if (!_setOriginalNotifParamId) {
            _setOriginalNotifParamId = true;

            _originalNotifParamId = _notifParamId;
        }

        _notifParamId = notifParamId;
    }

    public long getOriginalNotifParamId() {
        return _originalNotifParamId;
    }

    @JSON
    @Override
    public String getNameAr() {
        if (_nameAr == null) {
            return StringPool.BLANK;
        } else {
            return _nameAr;
        }
    }

    @Override
    public void setNameAr(String nameAr) {
        _columnBitmask |= NAMEAR_COLUMN_BITMASK;

        if (_originalNameAr == null) {
            _originalNameAr = _nameAr;
        }

        _nameAr = nameAr;
    }

    public String getOriginalNameAr() {
        return GetterUtil.getString(_originalNameAr);
    }

    @JSON
    @Override
    public String getNameEn() {
        if (_nameEn == null) {
            return StringPool.BLANK;
        } else {
            return _nameEn;
        }
    }

    @Override
    public void setNameEn(String nameEn) {
        _columnBitmask |= NAMEEN_COLUMN_BITMASK;

        if (_originalNameEn == null) {
            _originalNameEn = _nameEn;
        }

        _nameEn = nameEn;
    }

    public String getOriginalNameEn() {
        return GetterUtil.getString(_originalNameEn);
    }

    @JSON
    @Override
    public String getParamName() {
        if (_paramName == null) {
            return StringPool.BLANK;
        } else {
            return _paramName;
        }
    }

    @Override
    public void setParamName(String paramName) {
        _columnBitmask = -1L;

        _paramName = paramName;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            NotifParam.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public NotifParam toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (NotifParam) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        NotifParamImpl notifParamImpl = new NotifParamImpl();

        notifParamImpl.setNotifParamId(getNotifParamId());
        notifParamImpl.setNameAr(getNameAr());
        notifParamImpl.setNameEn(getNameEn());
        notifParamImpl.setParamName(getParamName());

        notifParamImpl.resetOriginalValues();

        return notifParamImpl;
    }

    @Override
    public int compareTo(NotifParam notifParam) {
        int value = 0;

        value = getParamName().compareTo(notifParam.getParamName());

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

        if (!(obj instanceof NotifParam)) {
            return false;
        }

        NotifParam notifParam = (NotifParam) obj;

        long primaryKey = notifParam.getPrimaryKey();

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
        NotifParamModelImpl notifParamModelImpl = this;

        notifParamModelImpl._originalNotifParamId = notifParamModelImpl._notifParamId;

        notifParamModelImpl._setOriginalNotifParamId = false;

        notifParamModelImpl._originalNameAr = notifParamModelImpl._nameAr;

        notifParamModelImpl._originalNameEn = notifParamModelImpl._nameEn;

        notifParamModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<NotifParam> toCacheModel() {
        NotifParamCacheModel notifParamCacheModel = new NotifParamCacheModel();

        notifParamCacheModel.notifParamId = getNotifParamId();

        notifParamCacheModel.nameAr = getNameAr();

        String nameAr = notifParamCacheModel.nameAr;

        if ((nameAr != null) && (nameAr.length() == 0)) {
            notifParamCacheModel.nameAr = null;
        }

        notifParamCacheModel.nameEn = getNameEn();

        String nameEn = notifParamCacheModel.nameEn;

        if ((nameEn != null) && (nameEn.length() == 0)) {
            notifParamCacheModel.nameEn = null;
        }

        notifParamCacheModel.paramName = getParamName();

        String paramName = notifParamCacheModel.paramName;

        if ((paramName != null) && (paramName.length() == 0)) {
            notifParamCacheModel.paramName = null;
        }

        return notifParamCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{notifParamId=");
        sb.append(getNotifParamId());
        sb.append(", nameAr=");
        sb.append(getNameAr());
        sb.append(", nameEn=");
        sb.append(getNameEn());
        sb.append(", paramName=");
        sb.append(getParamName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.NotifParam");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>notifParamId</column-name><column-value><![CDATA[");
        sb.append(getNotifParamId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nameAr</column-name><column-value><![CDATA[");
        sb.append(getNameAr());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nameEn</column-name><column-value><![CDATA[");
        sb.append(getNameEn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paramName</column-name><column-value><![CDATA[");
        sb.append(getParamName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
