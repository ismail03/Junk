package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CardGroup}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see CardGroup
 * @generated
 */
public class CardGroupWrapper implements CardGroup, ModelWrapper<CardGroup> {
    private CardGroup _cardGroup;

    public CardGroupWrapper(CardGroup cardGroup) {
        _cardGroup = cardGroup;
    }

    @Override
    public Class<?> getModelClass() {
        return CardGroup.class;
    }

    @Override
    public String getModelClassName() {
        return CardGroup.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("active", getActive());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("cardGroupId", getCardGroupId());
        attributes.put("cardValue", getCardValue());
        attributes.put("promotionValue", getPromotionValue());
        attributes.put("inPaymentSystem", getInPaymentSystem());
        attributes.put("serviceId", getServiceId());

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

        String active = (String) attributes.get("active");

        if (active != null) {
            setActive(active);
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

        String cardGroupId = (String) attributes.get("cardGroupId");

        if (cardGroupId != null) {
            setCardGroupId(cardGroupId);
        }

        Long cardValue = (Long) attributes.get("cardValue");

        if (cardValue != null) {
            setCardValue(cardValue);
        }

        Long promotionValue = (Long) attributes.get("promotionValue");

        if (promotionValue != null) {
            setPromotionValue(promotionValue);
        }

        String inPaymentSystem = (String) attributes.get("inPaymentSystem");

        if (inPaymentSystem != null) {
            setInPaymentSystem(inPaymentSystem);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
        }
    }

    /**
    * Returns the primary key of this card group.
    *
    * @return the primary key of this card group
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _cardGroup.getPrimaryKey();
    }

    /**
    * Sets the primary key of this card group.
    *
    * @param primaryKey the primary key of this card group
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _cardGroup.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the trans ID of this card group.
    *
    * @return the trans ID of this card group
    */
    @Override
    public java.lang.String getTransId() {
        return _cardGroup.getTransId();
    }

    /**
    * Sets the trans ID of this card group.
    *
    * @param transId the trans ID of this card group
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _cardGroup.setTransId(transId);
    }

    /**
    * Returns the last update timestamp of this card group.
    *
    * @return the last update timestamp of this card group
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _cardGroup.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this card group.
    *
    * @param lastUpdateTimestamp the last update timestamp of this card group
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _cardGroup.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this card group.
    *
    * @return the last update userid of this card group
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _cardGroup.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this card group.
    *
    * @param lastUpdateUserid the last update userid of this card group
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _cardGroup.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this card group.
    *
    * @return the last update username of this card group
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _cardGroup.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this card group.
    *
    * @param lastUpdateUsername the last update username of this card group
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _cardGroup.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the active of this card group.
    *
    * @return the active of this card group
    */
    @Override
    public java.lang.String getActive() {
        return _cardGroup.getActive();
    }

    /**
    * Sets the active of this card group.
    *
    * @param active the active of this card group
    */
    @Override
    public void setActive(java.lang.String active) {
        _cardGroup.setActive(active);
    }

    /**
    * Returns the effective timestamp of this card group.
    *
    * @return the effective timestamp of this card group
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _cardGroup.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this card group.
    *
    * @param effectiveTimestamp the effective timestamp of this card group
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _cardGroup.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the client ip of this card group.
    *
    * @return the client ip of this card group
    */
    @Override
    public java.lang.String getClientIp() {
        return _cardGroup.getClientIp();
    }

    /**
    * Sets the client ip of this card group.
    *
    * @param clientIp the client ip of this card group
    */
    @Override
    public void setClientIp(java.lang.String clientIp) {
        _cardGroup.setClientIp(clientIp);
    }

    /**
    * Returns the server ip of this card group.
    *
    * @return the server ip of this card group
    */
    @Override
    public java.lang.String getServerIp() {
        return _cardGroup.getServerIp();
    }

    /**
    * Sets the server ip of this card group.
    *
    * @param serverIp the server ip of this card group
    */
    @Override
    public void setServerIp(java.lang.String serverIp) {
        _cardGroup.setServerIp(serverIp);
    }

    /**
    * Returns the user agent of this card group.
    *
    * @return the user agent of this card group
    */
    @Override
    public java.lang.String getUserAgent() {
        return _cardGroup.getUserAgent();
    }

    /**
    * Sets the user agent of this card group.
    *
    * @param userAgent the user agent of this card group
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _cardGroup.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this card group.
    *
    * @return the operation of this card group
    */
    @Override
    public java.lang.String getOperation() {
        return _cardGroup.getOperation();
    }

    /**
    * Sets the operation of this card group.
    *
    * @param operation the operation of this card group
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _cardGroup.setOperation(operation);
    }

    /**
    * Returns the card group ID of this card group.
    *
    * @return the card group ID of this card group
    */
    @Override
    public java.lang.String getCardGroupId() {
        return _cardGroup.getCardGroupId();
    }

    /**
    * Sets the card group ID of this card group.
    *
    * @param cardGroupId the card group ID of this card group
    */
    @Override
    public void setCardGroupId(java.lang.String cardGroupId) {
        _cardGroup.setCardGroupId(cardGroupId);
    }

    /**
    * Returns the card value of this card group.
    *
    * @return the card value of this card group
    */
    @Override
    public long getCardValue() {
        return _cardGroup.getCardValue();
    }

    /**
    * Sets the card value of this card group.
    *
    * @param cardValue the card value of this card group
    */
    @Override
    public void setCardValue(long cardValue) {
        _cardGroup.setCardValue(cardValue);
    }

    /**
    * Returns the promotion value of this card group.
    *
    * @return the promotion value of this card group
    */
    @Override
    public long getPromotionValue() {
        return _cardGroup.getPromotionValue();
    }

    /**
    * Sets the promotion value of this card group.
    *
    * @param promotionValue the promotion value of this card group
    */
    @Override
    public void setPromotionValue(long promotionValue) {
        _cardGroup.setPromotionValue(promotionValue);
    }

    /**
    * Returns the in payment system of this card group.
    *
    * @return the in payment system of this card group
    */
    @Override
    public java.lang.String getInPaymentSystem() {
        return _cardGroup.getInPaymentSystem();
    }

    /**
    * Sets the in payment system of this card group.
    *
    * @param inPaymentSystem the in payment system of this card group
    */
    @Override
    public void setInPaymentSystem(java.lang.String inPaymentSystem) {
        _cardGroup.setInPaymentSystem(inPaymentSystem);
    }

    /**
    * Returns the service ID of this card group.
    *
    * @return the service ID of this card group
    */
    @Override
    public long getServiceId() {
        return _cardGroup.getServiceId();
    }

    /**
    * Sets the service ID of this card group.
    *
    * @param serviceId the service ID of this card group
    */
    @Override
    public void setServiceId(long serviceId) {
        _cardGroup.setServiceId(serviceId);
    }

    @Override
    public boolean isNew() {
        return _cardGroup.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _cardGroup.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _cardGroup.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _cardGroup.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _cardGroup.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _cardGroup.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _cardGroup.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _cardGroup.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _cardGroup.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _cardGroup.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _cardGroup.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CardGroupWrapper((CardGroup) _cardGroup.clone());
    }

    @Override
    public int compareTo(CardGroup cardGroup) {
        return _cardGroup.compareTo(cardGroup);
    }

    @Override
    public int hashCode() {
        return _cardGroup.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<CardGroup> toCacheModel() {
        return _cardGroup.toCacheModel();
    }

    @Override
    public CardGroup toEscapedModel() {
        return new CardGroupWrapper(_cardGroup.toEscapedModel());
    }

    @Override
    public CardGroup toUnescapedModel() {
        return new CardGroupWrapper(_cardGroup.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _cardGroup.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _cardGroup.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _cardGroup.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CardGroupWrapper)) {
            return false;
        }

        CardGroupWrapper cardGroupWrapper = (CardGroupWrapper) obj;

        if (Validator.equals(_cardGroup, cardGroupWrapper._cardGroup)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public CardGroup getWrappedCardGroup() {
        return _cardGroup;
    }

    @Override
    public CardGroup getWrappedModel() {
        return _cardGroup;
    }

    @Override
    public void resetOriginalValues() {
        _cardGroup.resetOriginalValues();
    }
}
