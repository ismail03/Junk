package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentSystem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentSystem in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentSystem
 * @generated
 */
public class PaymentSystemCacheModel implements CacheModel<PaymentSystem>,
    Externalizable {
    public long paymentSystemId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String active;
    public long effectiveTimestamp;
    public String systemName;
    public String dateFormat;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{paymentSystemId=");
        sb.append(paymentSystemId);
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
        sb.append(", systemName=");
        sb.append(systemName);
        sb.append(", dateFormat=");
        sb.append(dateFormat);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PaymentSystem toEntityModel() {
        PaymentSystemImpl paymentSystemImpl = new PaymentSystemImpl();

        paymentSystemImpl.setPaymentSystemId(paymentSystemId);

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            paymentSystemImpl.setLastUpdateTimestamp(null);
        } else {
            paymentSystemImpl.setLastUpdateTimestamp(new Date(
                    lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            paymentSystemImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            paymentSystemImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            paymentSystemImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            paymentSystemImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (active == null) {
            paymentSystemImpl.setActive(StringPool.BLANK);
        } else {
            paymentSystemImpl.setActive(active);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            paymentSystemImpl.setEffectiveTimestamp(null);
        } else {
            paymentSystemImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        if (systemName == null) {
            paymentSystemImpl.setSystemName(StringPool.BLANK);
        } else {
            paymentSystemImpl.setSystemName(systemName);
        }

        if (dateFormat == null) {
            paymentSystemImpl.setDateFormat(StringPool.BLANK);
        } else {
            paymentSystemImpl.setDateFormat(dateFormat);
        }

        paymentSystemImpl.resetOriginalValues();

        return paymentSystemImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        paymentSystemId = objectInput.readLong();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        active = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        systemName = objectInput.readUTF();
        dateFormat = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(paymentSystemId);
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

        if (systemName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(systemName);
        }

        if (dateFormat == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dateFormat);
        }
    }
}
