package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.model.RefundLog;
import com.stc.echannels.epayments.model.RefundLogModel;
import com.stc.echannels.epayments.model.RefundLogSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the RefundLog service. Represents a row in the &quot;REFUND_LOG&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.stc.echannels.epayments.model.RefundLogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RefundLogImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see RefundLogImpl
 * @see com.stc.echannels.epayments.model.RefundLog
 * @see com.stc.echannels.epayments.model.RefundLogModel
 * @generated
 */
@JSON(strict = true)
public class RefundLogModelImpl extends BaseModelImpl<RefundLog>
    implements RefundLogModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a refund log model instance should use the {@link com.stc.echannels.epayments.model.RefundLog} interface instead.
     */
    public static final String TABLE_NAME = "REFUND_LOG";
    public static final Object[][] TABLE_COLUMNS = {
            { "REFUND_ID", Types.VARCHAR },
            { "EPAY_TRANS_ID", Types.VARCHAR },
            { "AMOUNT", Types.DOUBLE },
            { "SUBMISSION_DATE", Types.TIMESTAMP },
            { "APPROVAL_DATE", Types.TIMESTAMP },
            { "STATUS", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table REFUND_LOG (REFUND_ID VARCHAR(75) null,EPAY_TRANS_ID VARCHAR(75) not null primary key,AMOUNT DOUBLE,SUBMISSION_DATE DATE null,APPROVAL_DATE DATE null,STATUS VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table REFUND_LOG";
    public static final String ORDER_BY_JPQL = " ORDER BY refundLog.submissionDate ASC";
    public static final String ORDER_BY_SQL = " ORDER BY REFUND_LOG.SUBMISSION_DATE ASC";
    public static final String DATA_SOURCE = "anotherDataSource";
    public static final String SESSION_FACTORY = "anotherSessionFactory";
    public static final String TX_MANAGER = "anotherTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.stc.echannels.epayments.model.RefundLog"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.stc.echannels.epayments.model.RefundLog"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.stc.echannels.epayments.model.RefundLog"));
    private static ClassLoader _classLoader = RefundLog.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            RefundLog.class
        };
    private String _refundId;
    private String _epayTransId;
    private double _amount;
    private Date _submissionDate;
    private Date _approvalDate;
    private String _status;
    private RefundLog _escapedModel;

    public RefundLogModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static RefundLog toModel(RefundLogSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        RefundLog model = new RefundLogImpl();

        model.setRefundId(soapModel.getRefundId());
        model.setEpayTransId(soapModel.getEpayTransId());
        model.setAmount(soapModel.getAmount());
        model.setSubmissionDate(soapModel.getSubmissionDate());
        model.setApprovalDate(soapModel.getApprovalDate());
        model.setStatus(soapModel.getStatus());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<RefundLog> toModels(RefundLogSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<RefundLog> models = new ArrayList<RefundLog>(soapModels.length);

        for (RefundLogSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public String getPrimaryKey() {
        return _epayTransId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setEpayTransId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _epayTransId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return RefundLog.class;
    }

    @Override
    public String getModelClassName() {
        return RefundLog.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("refundId", getRefundId());
        attributes.put("epayTransId", getEpayTransId());
        attributes.put("amount", getAmount());
        attributes.put("submissionDate", getSubmissionDate());
        attributes.put("approvalDate", getApprovalDate());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String refundId = (String) attributes.get("refundId");

        if (refundId != null) {
            setRefundId(refundId);
        }

        String epayTransId = (String) attributes.get("epayTransId");

        if (epayTransId != null) {
            setEpayTransId(epayTransId);
        }

        Double amount = (Double) attributes.get("amount");

        if (amount != null) {
            setAmount(amount);
        }

        Date submissionDate = (Date) attributes.get("submissionDate");

        if (submissionDate != null) {
            setSubmissionDate(submissionDate);
        }

        Date approvalDate = (Date) attributes.get("approvalDate");

        if (approvalDate != null) {
            setApprovalDate(approvalDate);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    @JSON
    @Override
    public String getRefundId() {
        if (_refundId == null) {
            return StringPool.BLANK;
        } else {
            return _refundId;
        }
    }

    @Override
    public void setRefundId(String refundId) {
        _refundId = refundId;
    }

    @JSON
    @Override
    public String getEpayTransId() {
        if (_epayTransId == null) {
            return StringPool.BLANK;
        } else {
            return _epayTransId;
        }
    }

    @Override
    public void setEpayTransId(String epayTransId) {
        _epayTransId = epayTransId;
    }

    @JSON
    @Override
    public double getAmount() {
        return _amount;
    }

    @Override
    public void setAmount(double amount) {
        _amount = amount;
    }

    @JSON
    @Override
    public Date getSubmissionDate() {
        return _submissionDate;
    }

    @Override
    public void setSubmissionDate(Date submissionDate) {
        _submissionDate = submissionDate;
    }

    @JSON
    @Override
    public Date getApprovalDate() {
        return _approvalDate;
    }

    @Override
    public void setApprovalDate(Date approvalDate) {
        _approvalDate = approvalDate;
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

    @Override
    public RefundLog toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (RefundLog) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        RefundLogImpl refundLogImpl = new RefundLogImpl();

        refundLogImpl.setRefundId(getRefundId());
        refundLogImpl.setEpayTransId(getEpayTransId());
        refundLogImpl.setAmount(getAmount());
        refundLogImpl.setSubmissionDate(getSubmissionDate());
        refundLogImpl.setApprovalDate(getApprovalDate());
        refundLogImpl.setStatus(getStatus());

        refundLogImpl.resetOriginalValues();

        return refundLogImpl;
    }

    @Override
    public int compareTo(RefundLog refundLog) {
        int value = 0;

        value = DateUtil.compareTo(getSubmissionDate(),
                refundLog.getSubmissionDate());

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

        if (!(obj instanceof RefundLog)) {
            return false;
        }

        RefundLog refundLog = (RefundLog) obj;

        String primaryKey = refundLog.getPrimaryKey();

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
    public CacheModel<RefundLog> toCacheModel() {
        RefundLogCacheModel refundLogCacheModel = new RefundLogCacheModel();

        refundLogCacheModel.refundId = getRefundId();

        String refundId = refundLogCacheModel.refundId;

        if ((refundId != null) && (refundId.length() == 0)) {
            refundLogCacheModel.refundId = null;
        }

        refundLogCacheModel.epayTransId = getEpayTransId();

        String epayTransId = refundLogCacheModel.epayTransId;

        if ((epayTransId != null) && (epayTransId.length() == 0)) {
            refundLogCacheModel.epayTransId = null;
        }

        refundLogCacheModel.amount = getAmount();

        Date submissionDate = getSubmissionDate();

        if (submissionDate != null) {
            refundLogCacheModel.submissionDate = submissionDate.getTime();
        } else {
            refundLogCacheModel.submissionDate = Long.MIN_VALUE;
        }

        Date approvalDate = getApprovalDate();

        if (approvalDate != null) {
            refundLogCacheModel.approvalDate = approvalDate.getTime();
        } else {
            refundLogCacheModel.approvalDate = Long.MIN_VALUE;
        }

        refundLogCacheModel.status = getStatus();

        String status = refundLogCacheModel.status;

        if ((status != null) && (status.length() == 0)) {
            refundLogCacheModel.status = null;
        }

        return refundLogCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{refundId=");
        sb.append(getRefundId());
        sb.append(", epayTransId=");
        sb.append(getEpayTransId());
        sb.append(", amount=");
        sb.append(getAmount());
        sb.append(", submissionDate=");
        sb.append(getSubmissionDate());
        sb.append(", approvalDate=");
        sb.append(getApprovalDate());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.RefundLog");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>refundId</column-name><column-value><![CDATA[");
        sb.append(getRefundId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>epayTransId</column-name><column-value><![CDATA[");
        sb.append(getEpayTransId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>amount</column-name><column-value><![CDATA[");
        sb.append(getAmount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>submissionDate</column-name><column-value><![CDATA[");
        sb.append(getSubmissionDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>approvalDate</column-name><column-value><![CDATA[");
        sb.append(getApprovalDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
