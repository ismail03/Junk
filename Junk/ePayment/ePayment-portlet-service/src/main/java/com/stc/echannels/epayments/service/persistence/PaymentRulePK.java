package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;


public class PaymentRulePK implements Comparable<PaymentRulePK>, Serializable {
    public long ruleId;
    public String transId;

    public PaymentRulePK() {
    }

    public PaymentRulePK(long ruleId, String transId) {
        this.ruleId = ruleId;
        this.transId = transId;
    }

    public long getRuleId() {
        return ruleId;
    }

    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    @Override
    public int compareTo(PaymentRulePK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (ruleId < pk.ruleId) {
            value = -1;
        } else if (ruleId > pk.ruleId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = transId.compareTo(pk.transId);

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

        if (!(obj instanceof PaymentRulePK)) {
            return false;
        }

        PaymentRulePK pk = (PaymentRulePK) obj;

        if ((ruleId == pk.ruleId) && (transId.equals(pk.transId))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(ruleId) + String.valueOf(transId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("ruleId");
        sb.append(StringPool.EQUAL);
        sb.append(ruleId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("transId");
        sb.append(StringPool.EQUAL);
        sb.append(transId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
