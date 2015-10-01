package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the NotifConfig service. Represents a row in the &quot;NOTIF_CONFIG_MGR&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.NotifConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.NotifConfigImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see NotifConfig
 * @see com.stc.echannels.epayments.model.impl.NotifConfigImpl
 * @see com.stc.echannels.epayments.model.impl.NotifConfigModelImpl
 * @generated
 */
public interface NotifConfigModel extends BaseModel<NotifConfig> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a notif config model instance should use the {@link NotifConfig} interface instead.
     */

    /**
     * Returns the primary key of this notif config.
     *
     * @return the primary key of this notif config
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this notif config.
     *
     * @param primaryKey the primary key of this notif config
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the notif ID of this notif config.
     *
     * @return the notif ID of this notif config
     */
    public long getNotifId();

    /**
     * Sets the notif ID of this notif config.
     *
     * @param notifId the notif ID of this notif config
     */
    public void setNotifId(long notifId);

    /**
     * Returns the trans ID of this notif config.
     *
     * @return the trans ID of this notif config
     */
    @AutoEscape
    public String getTransId();

    /**
     * Sets the trans ID of this notif config.
     *
     * @param transId the trans ID of this notif config
     */
    public void setTransId(String transId);

    /**
     * Returns the last update timestamp of this notif config.
     *
     * @return the last update timestamp of this notif config
     */
    public Date getLastUpdateTimestamp();

    /**
     * Sets the last update timestamp of this notif config.
     *
     * @param lastUpdateTimestamp the last update timestamp of this notif config
     */
    public void setLastUpdateTimestamp(Date lastUpdateTimestamp);

    /**
     * Returns the last update userid of this notif config.
     *
     * @return the last update userid of this notif config
     */
    @AutoEscape
    public String getLastUpdateUserid();

    /**
     * Sets the last update userid of this notif config.
     *
     * @param lastUpdateUserid the last update userid of this notif config
     */
    public void setLastUpdateUserid(String lastUpdateUserid);

    /**
     * Returns the last update username of this notif config.
     *
     * @return the last update username of this notif config
     */
    @AutoEscape
    public String getLastUpdateUsername();

    /**
     * Sets the last update username of this notif config.
     *
     * @param lastUpdateUsername the last update username of this notif config
     */
    public void setLastUpdateUsername(String lastUpdateUsername);

    /**
     * Returns the status of this notif config.
     *
     * @return the status of this notif config
     */
    @AutoEscape
    public String getStatus();

    /**
     * Sets the status of this notif config.
     *
     * @param status the status of this notif config
     */
    public void setStatus(String status);

    /**
     * Returns the active of this notif config.
     *
     * @return the active of this notif config
     */
    @AutoEscape
    public String getActive();

    /**
     * Sets the active of this notif config.
     *
     * @param active the active of this notif config
     */
    public void setActive(String active);

    /**
     * Returns the effective timestamp of this notif config.
     *
     * @return the effective timestamp of this notif config
     */
    public Date getEffectiveTimestamp();

    /**
     * Sets the effective timestamp of this notif config.
     *
     * @param effectiveTimestamp the effective timestamp of this notif config
     */
    public void setEffectiveTimestamp(Date effectiveTimestamp);

    /**
     * Returns the client ip of this notif config.
     *
     * @return the client ip of this notif config
     */
    @AutoEscape
    public String getClientIp();

    /**
     * Sets the client ip of this notif config.
     *
     * @param clientIp the client ip of this notif config
     */
    public void setClientIp(String clientIp);

    /**
     * Returns the server ip of this notif config.
     *
     * @return the server ip of this notif config
     */
    @AutoEscape
    public String getServerIp();

    /**
     * Sets the server ip of this notif config.
     *
     * @param serverIp the server ip of this notif config
     */
    public void setServerIp(String serverIp);

    /**
     * Returns the user agent of this notif config.
     *
     * @return the user agent of this notif config
     */
    @AutoEscape
    public String getUserAgent();

    /**
     * Sets the user agent of this notif config.
     *
     * @param userAgent the user agent of this notif config
     */
    public void setUserAgent(String userAgent);

    /**
     * Returns the operation of this notif config.
     *
     * @return the operation of this notif config
     */
    @AutoEscape
    public String getOperation();

    /**
     * Sets the operation of this notif config.
     *
     * @param operation the operation of this notif config
     */
    public void setOperation(String operation);

    /**
     * Returns the enabled of this notif config.
     *
     * @return the enabled of this notif config
     */
    @AutoEscape
    public String getEnabled();

    /**
     * Sets the enabled of this notif config.
     *
     * @param enabled the enabled of this notif config
     */
    public void setEnabled(String enabled);

    /**
     * Returns the msg en of this notif config.
     *
     * @return the msg en of this notif config
     */
    @AutoEscape
    public String getMsgEn();

    /**
     * Sets the msg en of this notif config.
     *
     * @param msgEn the msg en of this notif config
     */
    public void setMsgEn(String msgEn);

    /**
     * Returns the msg ar of this notif config.
     *
     * @return the msg ar of this notif config
     */
    @AutoEscape
    public String getMsgAr();

    /**
     * Sets the msg ar of this notif config.
     *
     * @param msgAr the msg ar of this notif config
     */
    public void setMsgAr(String msgAr);

    /**
     * Returns the param1 of this notif config.
     *
     * @return the param1 of this notif config
     */
    @AutoEscape
    public String getParam1();

    /**
     * Sets the param1 of this notif config.
     *
     * @param param1 the param1 of this notif config
     */
    public void setParam1(String param1);

    /**
     * Returns the param2 of this notif config.
     *
     * @return the param2 of this notif config
     */
    @AutoEscape
    public String getParam2();

    /**
     * Sets the param2 of this notif config.
     *
     * @param param2 the param2 of this notif config
     */
    public void setParam2(String param2);

    /**
     * Returns the param3 of this notif config.
     *
     * @return the param3 of this notif config
     */
    @AutoEscape
    public String getParam3();

    /**
     * Sets the param3 of this notif config.
     *
     * @param param3 the param3 of this notif config
     */
    public void setParam3(String param3);

    /**
     * Returns the param4 of this notif config.
     *
     * @return the param4 of this notif config
     */
    @AutoEscape
    public String getParam4();

    /**
     * Sets the param4 of this notif config.
     *
     * @param param4 the param4 of this notif config
     */
    public void setParam4(String param4);

    /**
     * Returns the param5 of this notif config.
     *
     * @return the param5 of this notif config
     */
    @AutoEscape
    public String getParam5();

    /**
     * Sets the param5 of this notif config.
     *
     * @param param5 the param5 of this notif config
     */
    public void setParam5(String param5);

    /**
     * Returns the decriptive name en of this notif config.
     *
     * @return the decriptive name en of this notif config
     */
    @AutoEscape
    public String getDecriptiveNameEn();

    /**
     * Sets the decriptive name en of this notif config.
     *
     * @param decriptiveNameEn the decriptive name en of this notif config
     */
    public void setDecriptiveNameEn(String decriptiveNameEn);

    /**
     * Returns the decriptive name ar of this notif config.
     *
     * @return the decriptive name ar of this notif config
     */
    @AutoEscape
    public String getDecriptiveNameAr();

    /**
     * Sets the decriptive name ar of this notif config.
     *
     * @param decriptiveNameAr the decriptive name ar of this notif config
     */
    public void setDecriptiveNameAr(String decriptiveNameAr);

    /**
     * Returns the notif name of this notif config.
     *
     * @return the notif name of this notif config
     */
    @AutoEscape
    public String getNotifName();

    /**
     * Sets the notif name of this notif config.
     *
     * @param notifName the notif name of this notif config
     */
    public void setNotifName(String notifName);

    /**
     * Returns the service ID of this notif config.
     *
     * @return the service ID of this notif config
     */
    public long getServiceId();

    /**
     * Sets the service ID of this notif config.
     *
     * @param serviceId the service ID of this notif config
     */
    public void setServiceId(long serviceId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(NotifConfig notifConfig);

    @Override
    public int hashCode();

    @Override
    public CacheModel<NotifConfig> toCacheModel();

    @Override
    public NotifConfig toEscapedModel();

    @Override
    public NotifConfig toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
