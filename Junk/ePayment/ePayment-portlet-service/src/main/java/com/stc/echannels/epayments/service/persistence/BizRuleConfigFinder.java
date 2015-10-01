package com.stc.echannels.epayments.service.persistence;

public interface BizRuleConfigFinder {
    public java.util.List<com.stc.echannels.epayments.custommodel.BizRuleConfigModel> findActiveBizRuleByServiceType(
        java.lang.Long serviceTypeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.Long findCountBizRuleByServiceType(
        java.lang.Long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void addBizRuleConfig(
        com.stc.echannels.epayments.model.BizRuleConfig bizRuleConfig);

    public void updateBizRuleConfigToInActive(long[] recordIds);
}
