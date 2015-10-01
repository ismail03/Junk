package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentChannelSr;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PaymentChannelSr in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentChannelSr
 * @generated
 */
public class PaymentChannelSrCacheModel implements CacheModel<PaymentChannelSr>,
    Externalizable {
    public long channelid;
    public long serviceid;
    public String id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{channelid=");
        sb.append(channelid);
        sb.append(", serviceid=");
        sb.append(serviceid);
        sb.append(", id=");
        sb.append(id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PaymentChannelSr toEntityModel() {
        PaymentChannelSrImpl paymentChannelSrImpl = new PaymentChannelSrImpl();

        paymentChannelSrImpl.setChannelid(channelid);
        paymentChannelSrImpl.setServiceid(serviceid);

        if (id == null) {
            paymentChannelSrImpl.setId(StringPool.BLANK);
        } else {
            paymentChannelSrImpl.setId(id);
        }

        paymentChannelSrImpl.resetOriginalValues();

        return paymentChannelSrImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        channelid = objectInput.readLong();
        serviceid = objectInput.readLong();
        id = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(channelid);
        objectOutput.writeLong(serviceid);

        if (id == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(id);
        }
    }
}
