package com.stc.echannels.epayments.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Bank service. Represents a row in the &quot;BANK_CODES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * @author ahmed_fadlus
 * @see BankModel
 * @see com.stc.echannels.epayments.model.impl.BankImpl
 * @see com.stc.echannels.epayments.model.impl.BankModelImpl
 * @generated
 */
public interface Bank extends BankModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.stc.echannels.epayments.model.impl.BankImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean isPaymentTransactionRecorded();

    public void setPaymentTransactionRecorded(
        boolean isPaymentTransactionRecorded);

    public java.lang.String getName(java.util.Locale locale);
}
