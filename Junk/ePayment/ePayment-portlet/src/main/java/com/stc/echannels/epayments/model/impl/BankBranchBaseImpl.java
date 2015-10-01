package com.stc.echannels.epayments.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.stc.echannels.epayments.model.BankBranch;
import com.stc.echannels.epayments.service.BankBranchLocalServiceUtil;

/**
 * The extended model base implementation for the BankBranch service. Represents a row in the &quot;BRANCH_CODES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BankBranchImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankBranchImpl
 * @see com.stc.echannels.epayments.model.BankBranch
 * @generated
 */
public abstract class BankBranchBaseImpl extends BankBranchModelImpl
    implements BankBranch {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a bank branch model instance should use the {@link BankBranch} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BankBranchLocalServiceUtil.addBankBranch(this);
        } else {
            BankBranchLocalServiceUtil.updateBankBranch(this);
        }
    }
}
