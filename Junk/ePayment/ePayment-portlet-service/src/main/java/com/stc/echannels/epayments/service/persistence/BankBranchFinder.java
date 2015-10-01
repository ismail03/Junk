package com.stc.echannels.epayments.service.persistence;

public interface BankBranchFinder {
    public java.util.List<com.stc.echannels.epayments.model.BankBranch> findCustomBankBranchByStatus(
        java.lang.String status, int start, int end);

    public int getBankBranchCount(java.lang.String status);

    public com.liferay.portal.kernel.dao.orm.SQLQuery fetchQueryBankBranchByStatus(
        java.lang.String status);
}
