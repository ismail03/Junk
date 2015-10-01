package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentChannelSrvsMap;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PaymentChannelSrvsMap in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSrvsMap
 * @generated
 */
public class PaymentChannelSrvsMapCacheModel implements CacheModel<PaymentChannelSrvsMap>,
    Externalizable {
    public String id;
    public long serviceId;
    public long channelId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(id);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", channelId=");
        sb.append(channelId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PaymentChannelSrvsMap toEntityModel() {
        PaymentChannelSrvsMapImpl paymentChannelSrvsMapImpl = new PaymentChannelSrvsMapImpl();

        if (id == null) {
            paymentChannelSrvsMapImpl.setId(StringPool.BLANK);
        } else {
            paymentChannelSrvsMapImpl.setId(id);
        }

        paymentChannelSrvsMapImpl.setServiceId(serviceId);
        paymentChannelSrvsMapImpl.setChannelId(channelId);

        paymentChannelSrvsMapImpl.resetOriginalValues();

        return paymentChannelSrvsMapImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readUTF();
        serviceId = objectInput.readLong();
        channelId = objectInput.readLong();
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
        objectOutput.writeLong(channelId);
    }
}
