package com.stc.echannels.epayments.service.persistence;

public interface EPayAccessControlFinder {
    public java.util.List<com.stc.echannels.epayments.custommodel.AccessControlModel> findActiveEpayAccessControlByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void enableEPayAcessControl(long[] ids,
        com.stc.echannels.epayments.model.EPayAccessControl ePayAc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int findMaxRuleId();

    public void addEPayAccessControl(
        com.stc.echannels.epayments.model.EPayAccessControl accessControl);
}
