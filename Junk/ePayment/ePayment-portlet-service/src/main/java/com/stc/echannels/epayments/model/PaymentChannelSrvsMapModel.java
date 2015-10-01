package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PaymentChannelSrvsMap service. Represents a row in the &quot;PAYMENT_CHANNEL_SERVICES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrvsMap
 * @see com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapImpl
 * @see com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapModelImpl
 * @generated
 */
public interface PaymentChannelSrvsMapModel extends BaseModel<PaymentChannelSrvsMap> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a payment channel srvs map model instance should use the {@link PaymentChannelSrvsMap} interface instead.
     */

    /**
     * Returns the primary key of this payment channel srvs map.
     *
     * @return the primary key of this payment channel srvs map
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this payment channel srvs map.
     *
     * @param primaryKey the primary key of this payment channel srvs map
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the ID of this payment channel srvs map.
     *
     * @return the ID of this payment channel srvs map
     */
    @AutoEscape
    public String getId();

    /**
     * Sets the ID of this payment channel srvs map.
     *
     * @param id the ID of this payment channel srvs map
     */
    public void setId(String id);

    /**
     * Returns the service ID of this payment channel srvs map.
     *
     * @return the service ID of this payment channel srvs map
     */
    public long getServiceId();

    /**
     * Sets the service ID of this payment channel srvs map.
     *
     * @param serviceId the service ID of this payment channel srvs map
     */
    public void setServiceId(long serviceId);

    /**
     * Returns the channel ID of this payment channel srvs map.
     *
     * @return the channel ID of this payment channel srvs map
     */
    public long getChannelId();

    /**
     * Sets the channel ID of this payment channel srvs map.
     *
     * @param channelId the channel ID of this payment channel srvs map
     */
    public void setChannelId(long channelId);

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
    public int compareTo(PaymentChannelSrvsMap paymentChannelSrvsMap);

    @Override
    public int hashCode();

    @Override
    public CacheModel<PaymentChannelSrvsMap> toCacheModel();

    @Override
    public PaymentChannelSrvsMap toEscapedModel();

    @Override
    public PaymentChannelSrvsMap toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
