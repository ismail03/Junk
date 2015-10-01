package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.SrvTypeSrvsMap;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SrvTypeSrvsMap in entity cache.
 *
 * @author ahmed_fadlus
 * @see SrvTypeSrvsMap
 * @generated
 */
public class SrvTypeSrvsMapCacheModel implements CacheModel<SrvTypeSrvsMap>,
    Externalizable {
    public String id;
    public long serviceId;
    public long serviceTypeId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(id);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", serviceTypeId=");
        sb.append(serviceTypeId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public SrvTypeSrvsMap toEntityModel() {
        SrvTypeSrvsMapImpl srvTypeSrvsMapImpl = new SrvTypeSrvsMapImpl();

        if (id == null) {
            srvTypeSrvsMapImpl.setId(StringPool.BLANK);
        } else {
            srvTypeSrvsMapImpl.setId(id);
        }

        srvTypeSrvsMapImpl.setServiceId(serviceId);
        srvTypeSrvsMapImpl.setServiceTypeId(serviceTypeId);

        srvTypeSrvsMapImpl.resetOriginalValues();

        return srvTypeSrvsMapImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readUTF();
        serviceId = objectInput.readLong();
        serviceTypeId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (id == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(id);
        }

        objectOutput.writeLong(serviceId);
        objectOutput.writeLong(serviceTypeId);
    }
}
