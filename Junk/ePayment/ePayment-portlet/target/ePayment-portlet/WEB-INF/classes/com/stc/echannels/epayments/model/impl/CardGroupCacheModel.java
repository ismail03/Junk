package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.CardGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CardGroup in entity cache.
 *
 * @author ahmed_fadlus
 * @see CardGroup
 * @generated
 */
public class CardGroupCacheModel implements CacheModel<CardGroup>,
    Externalizable {
    public String transId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String active;
    public long effectiveTimestamp;
    public String clientIp;
    public String serverIp;
    public String userAgent;
    public String operation;
    public String cardGroupId;
    public long cardValue;
    public long promotionValue;
    public String inPaymentSystem;
    public long serviceId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{transId=");
        sb.append(transId);
        sb.append(", lastUpdateTimestamp=");
        sb.append(lastUpdateTimestamp);
        sb.append(", lastUpdateUserid=");
        sb.append(lastUpdateUserid);
        sb.append(", lastUpdateUsername=");
        sb.append(lastUpdateUsername);
        sb.append(", active=");
        sb.append(active);
        sb.append(", effectiveTimestamp=");
        sb.append(effectiveTimestamp);
        sb.append(", clientIp=");
        sb.append(clientIp);
        sb.append(", serverIp=");
        sb.append(serverIp);
        sb.append(", userAgent=");
        sb.append(userAgent);
        sb.append(", operation=");
        sb.append(operation);
        sb.append(", cardGroupId=");
        sb.append(cardGroupId);
        sb.append(", cardValue=");
        sb.append(cardValue);
        sb.append(", promotionValue=");
        sb.append(promotionValue);
        sb.append(", inPaymentSystem=");
        sb.append(inPaymentSystem);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public CardGroup toEntityModel() {
        CardGroupImpl cardGroupImpl = new CardGroupImpl();

        if (transId == null) {
            cardGroupImpl.setTransId(StringPool.BLANK);
        } else {
            cardGroupImpl.setTransId(transId);
        }

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            cardGroupImpl.setLastUpdateTimestamp(null);
        } else {
            cardGroupImpl.setLastUpdateTimestamp(new Date(lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            cardGroupImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            cardGroupImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            cardGroupImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            cardGroupImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (active == null) {
            cardGroupImpl.setActive(StringPool.BLANK);
        } else {
            cardGroupImpl.setActive(active);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            cardGroupImpl.setEffectiveTimestamp(null);
        } else {
            cardGroupImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        if (clientIp == null) {
            cardGroupImpl.setClientIp(StringPool.BLANK);
        } else {
            cardGroupImpl.setClientIp(clientIp);
        }

        if (serverIp == null) {
            cardGroupImpl.setServerIp(StringPool.BLANK);
        } else {
            cardGroupImpl.setServerIp(serverIp);
        }

        if (userAgent == null) {
            cardGroupImpl.setUserAgent(StringPool.BLANK);
        } else {
            cardGroupImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            cardGroupImpl.setOperation(StringPool.BLANK);
        } else {
            cardGroupImpl.setOperation(operation);
        }

        if (cardGroupId == null) {
            cardGroupImpl.setCardGroupId(StringPool.BLANK);
        } else {
            cardGroupImpl.setCardGroupId(cardGroupId);
        }

        cardGroupImpl.setCardValue(cardValue);
        cardGroupImpl.setPromotionValue(promotionValue);

        if (inPaymentSystem == null) {
            cardGroupImpl.setInPaymentSystem(StringPool.BLANK);
        } else {
            cardGroupImpl.setInPaymentSystem(inPaymentSystem);
        }

        cardGroupImpl.setServiceId(serviceId);

        cardGroupImpl.resetOriginalValues();

        return cardGroupImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        transId = objectInput.readUTF();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        active = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        clientIp = objectInput.readUTF();
        serverIp = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
        cardGroupId = objectInput.readUTF();
        cardValue = objectInput.readLong();
        promotionValue = objectInput.readLong();
        inPaymentSystem = objectInput.readUTF();
        serviceId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (transId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(transId);
        }

        objectOutput.writeLong(lastUpdateTimestamp);

        if (lastUpdateUserid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastUpdateUsername);
        }

        if (active == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(active);
        }

        objectOutput.writeLong(effectiveTimestamp);

        if (clientIp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(clientIp);
        }

        if (serverIp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serverIp);
        }

        if (userAgent == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userAgent);
        }

        if (operation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(operation);
        }

        if (cardGroupId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cardGroupId);
        }

        objectOutput.writeLong(cardValue);
        objectOutput.writeLong(promotionValue);

        if (inPaymentSystem == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inPaymentSystem);
        }

        objectOutput.writeLong(serviceId);
    }
}
