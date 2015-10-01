package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CardGroup service. Represents a row in the &quot;IN_CARD_GROUPS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.CardGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.CardGroupImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see CardGroup
 * @see com.stc.echannels.epayments.model.impl.CardGroupImpl
 * @see com.stc.echannels.epayments.model.impl.CardGroupModelImpl
 * @generated
 */
public interface CardGroupModel extends BaseModel<CardGroup> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a card group model instance should use the {@link CardGroup} interface instead.
     */

    /**
     * Returns the primary key of this card group.
     *
     * @return the primary key of this card group
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this card group.
     *
     * @param primaryKey the primary key of this card group
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the trans ID of this card group.
     *
     * @return the trans ID of this card group
     */
    @AutoEscape
    public String getTransId();

    /**
     * Sets the trans ID of this card group.
     *
     * @param transId the trans ID of this card group
     */
    public void setTransId(String transId);

    /**
     * Returns the last update timestamp of this card group.
     *
     * @return the last update timestamp of this card group
     */
    public Date getLastUpdateTimestamp();

    /**
     * Sets the last update timestamp of this card group.
     *
     * @param lastUpdateTimestamp the last update timestamp of this card group
     */
    public void setLastUpdateTimestamp(Date lastUpdateTimestamp);

    /**
     * Returns the last update userid of this card group.
     *
     * @return the last update userid of this card group
     */
    @AutoEscape
    public String getLastUpdateUserid();

    /**
     * Sets the last update userid of this card group.
     *
     * @param lastUpdateUserid the last update userid of this card group
     */
    public void setLastUpdateUserid(String lastUpdateUserid);

    /**
     * Returns the last update username of this card group.
     *
     * @return the last update username of this card group
     */
    @AutoEscape
    public String getLastUpdateUsername();

    /**
     * Sets the last update username of this card group.
     *
     * @param lastUpdateUsername the last update username of this card group
     */
    public void setLastUpdateUsername(String lastUpdateUsername);

    /**
     * Returns the active of this card group.
     *
     * @return the active of this card group
     */
    @AutoEscape
    public String getActive();

    /**
     * Sets the active of this card group.
     *
     * @param active the active of this card group
     */
    public void setActive(String active);

    /**
     * Returns the effective timestamp of this card group.
     *
     * @return the effective timestamp of this card group
     */
    public Date getEffectiveTimestamp();

    /**
     * Sets the effective timestamp of this card group.
     *
     * @param effectiveTimestamp the effective timestamp of this card group
     */
    public void setEffectiveTimestamp(Date effectiveTimestamp);

    /**
     * Returns the client ip of this card group.
     *
     * @return the client ip of this card group
     */
    @AutoEscape
    public String getClientIp();

    /**
     * Sets the client ip of this card group.
     *
     * @param clientIp the client ip of this card group
     */
    public void setClientIp(String clientIp);

    /**
     * Returns the server ip of this card group.
     *
     * @return the server ip of this card group
     */
    @AutoEscape
    public String getServerIp();

    /**
     * Sets the server ip of this card group.
     *
     * @param serverIp the server ip of this card group
     */
    public void setServerIp(String serverIp);

    /**
     * Returns the user agent of this card group.
     *
     * @return the user agent of this card group
     */
    @AutoEscape
    public String getUserAgent();

    /**
     * Sets the user agent of this card group.
     *
     * @param userAgent the user agent of this card group
     */
    public void setUserAgent(String userAgent);

    /**
     * Returns the operation of this card group.
     *
     * @return the operation of this card group
     */
    @AutoEscape
    public String getOperation();

    /**
     * Sets the operation of this card group.
     *
     * @param operation the operation of this card group
     */
    public void setOperation(String operation);

    /**
     * Returns the card group ID of this card group.
     *
     * @return the card group ID of this card group
     */
    @AutoEscape
    public String getCardGroupId();

    /**
     * Sets the card group ID of this card group.
     *
     * @param cardGroupId the card group ID of this card group
     */
    public void setCardGroupId(String cardGroupId);

    /**
     * Returns the card value of this card group.
     *
     * @return the card value of this card group
     */
    public long getCardValue();

    /**
     * Sets the card value of this card group.
     *
     * @param cardValue the card value of this card group
     */
    public void setCardValue(long cardValue);

    /**
     * Returns the promotion value of this card group.
     *
     * @return the promotion value of this card group
     */
    public long getPromotionValue();

    /**
     * Sets the promotion value of this card group.
     *
     * @param promotionValue the promotion value of this card group
     */
    public void setPromotionValue(long promotionValue);

    /**
     * Returns the in payment system of this card group.
     *
     * @return the in payment system of this card group
     */
    @AutoEscape
    public String getInPaymentSystem();

    /**
     * Sets the in payment system of this card group.
     *
     * @param inPaymentSystem the in payment system of this card group
     */
    public void setInPaymentSystem(String inPaymentSystem);

    /**
     * Returns the service ID of this card group.
     *
     * @return the service ID of this card group
     */
    public long getServiceId();

    /**
     * Sets the service ID of this card group.
     *
     * @param serviceId the service ID of this card group
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
    public int compareTo(CardGroup cardGroup);

    @Override
    public int hashCode();

    @Override
    public CacheModel<CardGroup> toCacheModel();

    @Override
    public CardGroup toEscapedModel();

    @Override
    public CardGroup toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
