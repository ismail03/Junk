package com.stc.echannels.epayments.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the BankBranch service. Represents a row in the &quot;BRANCH_CODES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * @author ahmed_fadlus
 * @see BankBranchModel
 * @see com.stc.echannels.epayments.model.impl.BankBranchImpl
 * @see com.stc.echannels.epayments.model.impl.BankBranchModelImpl
 * @generated
 */
public interface BankBranch extends BankBranchModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.stc.echannels.epayments.model.impl.BankBranchImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getBankNameEn();

    public void setBankNameEn(java.lang.String bankNameEn);

    public java.lang.String getBankNameAr();

    public void setBankNameAr(java.lang.String bankNameAr);

    public java.lang.String getPaymentChannelNameEn();

    public void setPaymentChannelNameEn(java.lang.String paymentChannelNameEn);

    public java.lang.String getPaymentChannelNameAr();

    public void setPaymentChannelNameAr(java.lang.String paymentChannelNameAr);

    public java.lang.String getStcBankCode();

    public void setStcBankCode(java.lang.String stcBankCode);

    public boolean isPaymentTransactionRecorded();

    public void setPaymentTransactionRecorded(
        boolean isPaymentTransactionRecorded);
}
