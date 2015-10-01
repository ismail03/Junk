package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.Bank;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Bank in entity cache.
 *
 * @author ahmed_fadlus
 * @see Bank
 * @generated
 */
public class BankCacheModel implements CacheModel<Bank>, Externalizable {
    public String transId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String active;
    public long effectiveTimestamp;
    public String status;
    public String clientIp;
    public String serverIp;
    public String userAgent;
    public String operation;
    public String bankId;
    public String stcCode;
    public String nameEn;
    public String nameAr;
    public String comments;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

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
        sb.append(", status=");
        sb.append(status);
        sb.append(", clientIp=");
        sb.append(clientIp);
        sb.append(", serverIp=");
        sb.append(serverIp);
        sb.append(", userAgent=");
        sb.append(userAgent);
        sb.append(", operation=");
        sb.append(operation);
        sb.append(", bankId=");
        sb.append(bankId);
        sb.append(", stcCode=");
        sb.append(stcCode);
        sb.append(", nameEn=");
        sb.append(nameEn);
        sb.append(", nameAr=");
        sb.append(nameAr);
        sb.append(", comments=");
        sb.append(comments);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Bank toEntityModel() {
        BankImpl bankImpl = new BankImpl();

        if (transId == null) {
            bankImpl.setTransId(StringPool.BLANK);
        } else {
            bankImpl.setTransId(transId);
        }

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            bankImpl.setLastUpdateTimestamp(null);
        } else {
            bankImpl.setLastUpdateTimestamp(new Date(lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            bankImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            bankImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            bankImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            bankImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (active == null) {
            bankImpl.setActive(StringPool.BLANK);
        } else {
            bankImpl.setActive(active);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            bankImpl.setEffectiveTimestamp(null);
        } else {
            bankImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        if (status == null) {
            bankImpl.setStatus(StringPool.BLANK);
        } else {
            bankImpl.setStatus(status);
        }

        if (clientIp == null) {
            bankImpl.setClientIp(StringPool.BLANK);
        } else {
            bankImpl.setClientIp(clientIp);
        }

        if (serverIp == null) {
            bankImpl.setServerIp(StringPool.BLANK);
        } else {
            bankImpl.setServerIp(serverIp);
        }

        if (userAgent == null) {
            bankImpl.setUserAgent(StringPool.BLANK);
        } else {
            bankImpl.setUserAgent(userAgent);
        }

        if (operation == null) {
            bankImpl.setOperation(StringPool.BLANK);
        } else {
            bankImpl.setOperation(operation);
        }

        if (bankId == null) {
            bankImpl.setBankId(StringPool.BLANK);
        } else {
            bankImpl.setBankId(bankId);
        }

        if (stcCode == null) {
            bankImpl.setStcCode(StringPool.BLANK);
        } else {
            bankImpl.setStcCode(stcCode);
        }

        if (nameEn == null) {
            bankImpl.setNameEn(StringPool.BLANK);
        } else {
            bankImpl.setNameEn(nameEn);
        }

        if (nameAr == null) {
            bankImpl.setNameAr(StringPool.BLANK);
        } else {
            bankImpl.setNameAr(nameAr);
        }

        if (comments == null) {
            bankImpl.setComments(StringPool.BLANK);
        } else {
            bankImpl.setComments(comments);
        }

        bankImpl.resetOriginalValues();

        return bankImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        transId = objectInput.readUTF();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        active = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        status = objectInput.readUTF();
        clientIp = objectInput.readUTF();
        serverIp = objectInput.readUTF();
        userAgent = objectInput.readUTF();
        operation = objectInput.readUTF();
        bankId = objectInput.readUTF();
        stcCode = objectInput.readUTF();
        nameEn = objectInput.readUTF();
        nameAr = objectInput.readUTF();
        comments = objectInput.readUTF();
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

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

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

        if (bankId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankId);
        }

        if (stcCode == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(stcCode);
        }

        if (nameEn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nameEn);
        }

        if (nameAr == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nameAr);
        }

        if (comments == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(comments);
        }
    }
}
