package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;


public class BankBranchPK implements Comparable<BankBranchPK>, Serializable {
    public String transId;
    public String stcBranchCode;

    public BankBranchPK() {
    }

    public BankBranchPK(String transId, String stcBranchCode) {
        this.transId = transId;
        this.stcBranchCode = stcBranchCode;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getStcBranchCode() {
        return stcBranchCode;
    }

    public void setStcBranchCode(String stcBranchCode) {
        this.stcBranchCode = stcBranchCode;
    }

    @Override
    public int compareTo(BankBranchPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        value = transId.compareTo(pk.transId);

        if (value != 0) {
            return value;
        }

        value = stcBranchCode.compareTo(pk.stcBranchCode);

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankBranchPK)) {
            return false;
        }

        BankBranchPK pk = (BankBranchPK) obj;

        if ((transId.equals(pk.transId)) &&
                (stcBranchCode.equals(pk.stcBranchCode))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(transId) + String.valueOf(stcBranchCode)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("transId");
        sb.append(StringPool.EQUAL);
        sb.append(transId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("stcBranchCode");
        sb.append(StringPool.EQUAL);
        sb.append(stcBranchCode);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
