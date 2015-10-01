package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.BusinessSrv;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BusinessSrv in entity cache.
 *
 * @author ahmed_fadlus
 * @see BusinessSrv
 * @generated
 */
public class BusinessSrvCacheModel implements CacheModel<BusinessSrv>,
    Externalizable {
    public long serviceId;
    public long lastUpdateTimestamp;
    public String lastUpdateUserid;
    public String lastUpdateUsername;
    public String status;
    public long effectiveTimestamp;
    public String refMask;
    public String serviceType;
    public String serviceNameEn;
    public String serviceNameAr;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{serviceId=");
        sb.append(serviceId);
        sb.append(", lastUpdateTimestamp=");
        sb.append(lastUpdateTimestamp);
        sb.append(", lastUpdateUserid=");
        sb.append(lastUpdateUserid);
        sb.append(", lastUpdateUsername=");
        sb.append(lastUpdateUsername);
        sb.append(", status=");
        sb.append(status);
        sb.append(", effectiveTimestamp=");
        sb.append(effectiveTimestamp);
        sb.append(", refMask=");
        sb.append(refMask);
        sb.append(", serviceType=");
        sb.append(serviceType);
        sb.append(", serviceNameEn=");
        sb.append(serviceNameEn);
        sb.append(", serviceNameAr=");
        sb.append(serviceNameAr);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BusinessSrv toEntityModel() {
        BusinessSrvImpl businessSrvImpl = new BusinessSrvImpl();

        businessSrvImpl.setServiceId(serviceId);

        if (lastUpdateTimestamp == Long.MIN_VALUE) {
            businessSrvImpl.setLastUpdateTimestamp(null);
        } else {
            businessSrvImpl.setLastUpdateTimestamp(new Date(lastUpdateTimestamp));
        }

        if (lastUpdateUserid == null) {
            businessSrvImpl.setLastUpdateUserid(StringPool.BLANK);
        } else {
            businessSrvImpl.setLastUpdateUserid(lastUpdateUserid);
        }

        if (lastUpdateUsername == null) {
            businessSrvImpl.setLastUpdateUsername(StringPool.BLANK);
        } else {
            businessSrvImpl.setLastUpdateUsername(lastUpdateUsername);
        }

        if (status == null) {
            businessSrvImpl.setStatus(StringPool.BLANK);
        } else {
            businessSrvImpl.setStatus(status);
        }

        if (effectiveTimestamp == Long.MIN_VALUE) {
            businessSrvImpl.setEffectiveTimestamp(null);
        } else {
            businessSrvImpl.setEffectiveTimestamp(new Date(effectiveTimestamp));
        }

        if (refMask == null) {
            businessSrvImpl.setRefMask(StringPool.BLANK);
        } else {
            businessSrvImpl.setRefMask(refMask);
        }

        if (serviceType == null) {
            businessSrvImpl.setServiceType(StringPool.BLANK);
        } else {
            businessSrvImpl.setServiceType(serviceType);
        }

        if (serviceNameEn == null) {
            businessSrvImpl.setServiceNameEn(StringPool.BLANK);
        } else {
            businessSrvImpl.setServiceNameEn(serviceNameEn);
        }

        if (serviceNameAr == null) {
            businessSrvImpl.setServiceNameAr(StringPool.BLANK);
        } else {
            businessSrvImpl.setServiceNameAr(serviceNameAr);
        }

        businessSrvImpl.resetOriginalValues();

        return businessSrvImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        serviceId = objectInput.readLong();
        lastUpdateTimestamp = objectInput.readLong();
        lastUpdateUserid = objectInput.readUTF();
        lastUpdateUsername = objectInput.readUTF();
        status = objectInput.readUTF();
        effectiveTimestamp = objectInput.readLong();
        refMask = objectInput.readUTF();
        serviceType = objectInput.readUTF();
        serviceNameEn = objectInput.readUTF();
        serviceNameAr = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(serviceId);
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

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

        objectOutput.writeLong(effectiveTimestamp);

        if (refMask == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(refMask);
        }

        if (serviceType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceType);
        }

        if (serviceNameEn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceNameEn);
        }

        if (serviceNameAr == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceNameAr);
        }
    }
}
