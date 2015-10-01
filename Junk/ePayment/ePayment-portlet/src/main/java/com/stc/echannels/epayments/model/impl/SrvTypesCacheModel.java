package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.SrvTypes;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SrvTypes in entity cache.
 *
 * @author ahmed_fadlus
 * @see SrvTypes
 * @generated
 */
public class SrvTypesCacheModel implements CacheModel<SrvTypes>, Externalizable {
    public long serviceTypeId;
    public String serviceTypeName;
    public String serviceNameEN;
    public String serviceNameAR;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{serviceTypeId=");
        sb.append(serviceTypeId);
        sb.append(", serviceTypeName=");
        sb.append(serviceTypeName);
        sb.append(", serviceNameEN=");
        sb.append(serviceNameEN);
        sb.append(", serviceNameAR=");
        sb.append(serviceNameAR);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SrvTypes toEntityModel() {
        SrvTypesImpl srvTypesImpl = new SrvTypesImpl();

        srvTypesImpl.setServiceTypeId(serviceTypeId);

        if (serviceTypeName == null) {
            srvTypesImpl.setServiceTypeName(StringPool.BLANK);
        } else {
            srvTypesImpl.setServiceTypeName(serviceTypeName);
        }

        if (serviceNameEN == null) {
            srvTypesImpl.setServiceNameEN(StringPool.BLANK);
        } else {
            srvTypesImpl.setServiceNameEN(serviceNameEN);
        }

        if (serviceNameAR == null) {
            srvTypesImpl.setServiceNameAR(StringPool.BLANK);
        } else {
            srvTypesImpl.setServiceNameAR(serviceNameAR);
        }

        srvTypesImpl.resetOriginalValues();

        return srvTypesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        serviceTypeId = objectInput.readLong();
        serviceTypeName = objectInput.readUTF();
        serviceNameEN = objectInput.readUTF();
        serviceNameAR = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(serviceTypeId);

        if (serviceTypeName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceTypeName);
        }

        if (serviceNameEN == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceNameEN);
        }

        if (serviceNameAR == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceNameAR);
        }
    }
}
