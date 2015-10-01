package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentChannel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentChannel in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentChannel
 * @generated
 */
public class PaymentChannelCacheModel implements CacheModel<PaymentChannel>,
    Externalizable {
    public String transId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String active;
    public String status;
    public long effectiveTimestamp;
    public String clientIp;
    public String serverIp;
    public String userAgent;
    public String operation;
    public long channelId;
    public String channelType;
    public String descriptiveNameEn;
    public String descriptiveNameAr;

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
        sb.append(", status=");
        sb.append(status);
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
        sb.append(", channelId=");
        sb.append(channelId);
        sb.append(", channelType=");
        sb.append(channelType);
        sb.append(", descriptiveNameEn=");
        sb.append(descriptiveNameEn);
        sb.append(", descriptiveNameAr=");
        sb.append(descriptiveNameAr);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PaymentChannel toEntityModel() {
        PaymentChannelImpl paymentChannelImpl = new PaymentChannelImpl();

        if (transId == null) {
            paymentChannelImpl.setTransId(StringPool.BLANK);
        } else {
            paymentChannelImpl.setTransId(transId);
        }

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            paymentChannelImpl.setLastUpdateTimestamp(null);
        } else {
            paymentChannelImpl.setLastUpdateTimestamp(new Date(
                    lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            paymentChannelImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            paymentChannelImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            paymentChannelImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            paymentChannelImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (active == null) {
            paymentChannelImpl.setActive(StringPool.BLANK);
        } else {
            paymentChannelImpl.setActive(active);
        }

        if (status == null) {
            paymentChannelImpl.setStatus(StringPool.BLANK);
        } else {
            paymentChannelImpl.setStatus(status);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            paymentChannelImpl.setEffectiveTimestamp(null);
        } else {
            paymentChannelImpl.setEffectiveTimestamp(new Date(
                    effectiveTimestamp));
        }

        if (clientIp == null) {
            paymentChannelImpl.setClientIp(StringPool.BLANK);
        } else {
            paymentChannelImpl.setClientIp(clientIp);
        }

        if (serverIp == null) {
            paymentChannelImpl.setServerIp(StringPool.BLANK);
        } else {
            paymentChannelImpl.setServerIp(serverIp);
        }

        if (userAgent == null) {
            paymentChannelImpl.setUserAgent(StringPool.BLANK);
        } else {
            paymentChannelImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            paymentChannelImpl.setOperation(StringPool.BLANK);
        } else {
            paymentChannelImpl.setOperation(operation);
        }

        paymentChannelImpl.setChannelId(channelId);

        if (channelType == null) {
            paymentChannelImpl.setChannelType(StringPool.BLANK);
        } else {
            paymentChannelImpl.setChannelType(channelType);
        }

        if (descriptiveNameEn == null) {
            paymentChannelImpl.setDescriptiveNameEn(StringPool.BLANK);
        } else {
            paymentChannelImpl.setDescriptiveNameEn(descriptiveNameEn);
        }

        if (descriptiveNameAr == null) {
            paymentChannelImpl.setDescriptiveNameAr(StringPool.BLANK);
        } else {
            paymentChannelImpl.setDescriptiveNameAr(descriptiveNameAr);
        }

        paymentChannelImpl.resetOriginalValues();

        return paymentChannelImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        transId = objectInput.readUTF();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        active = objectInput.readUTF();
        status = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        clientIp = objectInput.readUTF();
        serverIp = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
        channelId = objectInput.readLong();
        channelType = objectInput.readUTF();
        descriptiveNameEn = objectInput.readUTF();
        descriptiveNameAr = objectInput.readUTF();
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

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
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

        objectOutput.writeLong(channelId);

        if (channelType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(channelType);
        }

        if (descriptiveNameEn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptiveNameEn);
        }

        if (descriptiveNameAr == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descriptiveNameAr);
        }
    }
}
