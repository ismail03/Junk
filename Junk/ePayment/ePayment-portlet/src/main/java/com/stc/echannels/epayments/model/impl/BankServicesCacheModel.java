package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.stc.echannels.epayments.model.BankServices;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BankServices in entity cache.
 *
 * @author ahmed_fadlus
 * @see BankServices
 * @generated
 */
public class BankServicesCacheModel implements CacheModel<BankServices>,
    Externalizable {
    public String bankid;
    public long serviceid;
    public String id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{bankid=");
        sb.append(bankid);
        sb.append(", serviceid=");
        sb.append(serviceid);
        sb.append(", id=");
        sb.append(id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BankServices toEntityModel() {
        BankServicesImpl bankServicesImpl = new BankServicesImpl();

        if (bankid == null) {
            bankServicesImpl.setBankid(StringPool.BLANK);
        } else {
            bankServicesImpl.setBankid(bankid);
        }

        bankServicesImpl.setServiceid(serviceid);

        if (id == null) {
            bankServicesImpl.setId(StringPool.BLANK);
        } else {
            bankServicesImpl.setId(id);
        }

        bankServicesImpl.resetOriginalValues();

        return bankServicesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bankid = objectInput.readUTF();
        serviceid = objectInput.readLong();
        id = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (bankid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankid);
        }

        objectOutput.writeLong(serviceid);

        if (id == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(id);
        }
    }
}
