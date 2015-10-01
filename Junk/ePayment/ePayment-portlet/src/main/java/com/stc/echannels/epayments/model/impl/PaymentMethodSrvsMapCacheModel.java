package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.PaymentMethodSrvsMap;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PaymentMethodSrvsMap in entity cache.
 *
 * @author ahmed_fadlus
 * @see PaymentMethodSrvsMap
 * @generated
 */
public class PaymentMethodSrvsMapCacheModel implements CacheModel<PaymentMethodSrvsMap>,
    Externalizable {
    public String id;
    public long serviceId;
    public long paymentMethodId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(id);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", paymentMethodId=");
        sb.append(paymentMethodId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PaymentMethodSrvsMap toEntityModel() {
        PaymentMethodSrvsMapImpl paymentMethodSrvsMapImpl = new PaymentMethodSrvsMapImpl();

        if (id == null) {
            paymentMethodSrvsMapImpl.setId(StringPool.BLANK);
        } else {
            paymentMethodSrvsMapImpl.setId(id);
        }

        paymentMethodSrvsMapImpl.setServiceId(serviceId);
        paymentMethodSrvsMapImpl.setPaymentMethodId(paymentMethodId);

        paymentMethodSrvsMapImpl.resetOriginalValues();

        return paymentMethodSrvsMapImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readUTF();
        serviceId = objectInput.readLong();
        paymentMethodId = objectInput.readLong();
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
        objectOutput.writeLong(paymentMethodId);
    }
}
