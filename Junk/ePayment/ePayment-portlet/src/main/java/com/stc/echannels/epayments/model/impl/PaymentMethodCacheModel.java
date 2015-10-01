package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentMethod;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentMethod in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentMethod
 * @generated
 */
public class PaymentMethodCacheModel implements CacheModel<PaymentMethod>,
    Externalizable {
    public long pmtMethodId;
    public String status;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public long effectiveTimestamp;
    public String clientIp;
    public String serverIp;
    public String userAgent;
    public String operation;
    public String descriptiveNameEn;
    public String descriptiveNameAr;
    public String pmtMethodIdType;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{pmtMethodId=");
        sb.append(pmtMethodId);
        sb.append(", status=");
        sb.append(status);
        sb.append(", lastUpdateTimestamp=");
        sb.append(lastUpdateTimestamp);
        sb.append(", lastUpdateUserid=");
        sb.append(lastUpdateUserid);
        sb.append(", lastUpdateUsername=");
        sb.append(lastUpdateUsername);
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
        sb.append(", descriptiveNameEn=");
        sb.append(descriptiveNameEn);
        sb.append(", descriptiveNameAr=");
        sb.append(descriptiveNameAr);
        sb.append(", pmtMethodIdType=");
        sb.append(pmtMethodIdType);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PaymentMethod toEntityModel() {
        PaymentMethodImpl paymentMethodImpl = new PaymentMethodImpl();

        paymentMethodImpl.setPmtMethodId(pmtMethodId);

        if (status == null) {
            paymentMethodImpl.setStatus(StringPool.BLANK);
        } else {
            paymentMethodImpl.setStatus(status);
        }

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            paymentMethodImpl.setLastUpdateTimestamp(null);
        } else {
            paymentMethodImpl.setLastUpdateTimestamp(new Date(
                    lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            paymentMethodImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            paymentMethodImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            paymentMethodImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            paymentMethodImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            paymentMethodImpl.setEffectiveTimestamp(null);
        } else {
            paymentMethodImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        if (clientIp == null) {
            paymentMethodImpl.setClientIp(StringPool.BLANK);
        } else {
            paymentMethodImpl.setClientIp(clientIp);
        }

        if (serverIp == null) {
            paymentMethodImpl.setServerIp(StringPool.BLANK);
        } else {
            paymentMethodImpl.setServerIp(serverIp);
        }

        if (userAgent == null) {
            paymentMethodImpl.setUserAgent(StringPool.BLANK);
        } else {
            paymentMethodImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            paymentMethodImpl.setOperation(StringPool.BLANK);
        } else {
            paymentMethodImpl.setOperation(operation);
        }

        if (descriptiveNameEn == null) {
            paymentMethodImpl.setDescriptiveNameEn(StringPool.BLANK);
        } else {
            paymentMethodImpl.setDescriptiveNameEn(descriptiveNameEn);
        }

        if (descriptiveNameAr == null) {
            paymentMethodImpl.setDescriptiveNameAr(StringPool.BLANK);
        } else {
            paymentMethodImpl.setDescriptiveNameAr(descriptiveNameAr);
        }

        if (pmtMethodIdType == null) {
            paymentMethodImpl.setPmtMethodIdType(StringPool.BLANK);
        } else {
            paymentMethodImpl.setPmtMethodIdType(pmtMethodIdType);
        }

        paymentMethodImpl.resetOriginalValues();

        return paymentMethodImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        pmtMethodId = objectInput.readLong();
        status = objectInput.readUTF();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        clientIp = objectInput.readUTF();
        serverIp = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
        descriptiveNameEn = objectInput.readUTF();
        descriptiveNameAr = objectInput.readUTF();
        pmtMethodIdType = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(pmtMethodId);

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
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

        if (pmtMethodIdType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pmtMethodIdType);
        }
    }
}
