package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BankBranch}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankBranch
 * @generated
 */
public class BankBranchWrapper implements BankBranch, ModelWrapper<BankBranch> {
    private BankBranch _bankBranch;

    public BankBranchWrapper(BankBranch bankBranch) {
        _bankBranch = bankBranch;
    }

    @Override
    public Class<?> getModelClass() {
        return BankBranch.class;
    }

    @Override
    public String getModelClassName() {
        return BankBranch.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
        attributes.put("stcBranchCode", getStcBranchCode());
        attributes.put("bankId", getBankId());
        attributes.put("channelId", getChannelId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("active", getActive());
        attributes.put("status", getStatus());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
        }

        String stcBranchCode = (String) attributes.get("stcBranchCode");

        if (stcBranchCode != null) {
            setStcBranchCode(stcBranchCode);
        }

        String bankId = (String) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        Long channelId = (Long) attributes.get("channelId");

        if (channelId != null) {
            setChannelId(channelId);
        }

        Date lastUpdateTimestamp = (Date) attributes.get("lastUpdateTimestamp");

        if (lastUpdateTimestamp != null) {
            setLastUpdateTimestamp(lastUpdateTimestamp);
        }

        String lastUpdateUserid = (String) attributes.get("lastUpdateUserid");

        if (lastUpdateUserid != null) {
            setLastUpdateUserid(lastUpdateUserid);
        }

        String lastUpdateUsername = (String) attributes.get(
                "lastUpdateUsername");

        if (lastUpdateUsername != null) {
            setLastUpdateUsername(lastUpdateUsername);
        }

        String active = (String) attributes.get("active");

        if (active != null) {
            setActive(active);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
        }

        String clientIp = (String) attributes.get("clientIp");

        if (clientIp != null) {
            setClientIp(clientIp);
        }

        String serverIp = (String) attributes.get("serverIp");

        if (serverIp != null) {
            setServerIp(serverIp);
        }

        String userAgent = (String) attributes.get("userAgent");

        if (userAgent != null) {
            setUserAgent(userAgent);
        }

        String operation = (String) attributes.get("operation");

        if (operation != null) {
            setOperation(operation);
        }
    }

    /**
    * Returns the primary key of this bank branch.
    *
    * @return the primary key of this bank branch
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _bankBranch.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bank branch.
    *
    * @param primaryKey the primary key of this bank branch
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _bankBranch.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the trans ID of this bank branch.
    *
    * @return the trans ID of this bank branch
    */
    @Override
    public java.lang.String getTransId() {
        return _bankBranch.getTransId();
    }

    /**
    * Sets the trans ID of this bank branch.
    *
    * @param transId the trans ID of this bank branch
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _bankBranch.setTransId(transId);
    }

    /**
    * Returns the stc branch code of this bank branch.
    *
    * @return the stc branch code of this bank branch
    */
    @Override
    public java.lang.String getStcBranchCode() {
        return _bankBranch.getStcBranchCode();
    }

    /**
    * Sets the stc branch code of this bank branch.
    *
    * @param stcBranchCode the stc branch code of this bank branch
    */
    @Override
    public void setStcBranchCode(java.lang.String stcBranchCode) {
        _bankBranch.setStcBranchCode(stcBranchCode);
    }

    /**
    * Returns the bank ID of this bank branch.
    *
    * @return the bank ID of this bank branch
    */
    @Override
    public java.lang.String getBankId() {
        return _bankBranch.getBankId();
    }

    /**
    * Sets the bank ID of this bank branch.
    *
    * @param bankId the bank ID of this bank branch
    */
    @Override
    public void setBankId(java.lang.String bankId) {
        _bankBranch.setBankId(bankId);
    }

    /**
    * Returns the channel ID of this bank branch.
    *
    * @return the channel ID of this bank branch
    */
    @Override
    public long getChannelId() {
        return _bankBranch.getChannelId();
    }

    /**
    * Sets the channel ID of this bank branch.
    *
    * @param channelId the channel ID of this bank branch
    */
    @Override
    public void setChannelId(long channelId) {
        _bankBranch.setChannelId(channelId);
    }

    /**
    * Returns the last update timestamp of this bank branch.
    *
    * @return the last update timestamp of this bank branch
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _bankBranch.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this bank branch.
    *
    * @param lastUpdateTimestamp the last update timestamp of this bank branch
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _bankBranch.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this bank branch.
    *
    * @return the last update userid of this bank branch
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _bankBranch.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this bank branch.
    *
    * @param lastUpdateUserid the last update userid of this bank branch
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _bankBranch.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this bank branch.
    *
    * @return the last update username of this bank branch
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _bankBranch.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this bank branch.
    *
    * @param lastUpdateUsername the last update username of this bank branch
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _bankBranch.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the active of this bank branch.
    *
    * @return the active of this bank branch
    */
    @Override
    public java.lang.String getActive() {
        return _bankBranch.getActive();
    }

    /**
    * Sets the active of this bank branch.
    *
    * @param active the active of this bank branch
    */
    @Override
    public void setActive(java.lang.String active) {
        _bankBranch.setActive(active);
    }

    /**
    * Returns the status of this bank branch.
    *
    * @return the status of this bank branch
    */
    @Override
    public java.lang.String getStatus() {
        return _bankBranch.getStatus();
    }

    /**
    * Sets the status of this bank branch.
    *
    * @param status the status of this bank branch
    */
    @Override
    public void setStatus(java.lang.String status) {
        _bankBranch.setStatus(status);
    }

    /**
    * Returns the effective timestamp of this bank branch.
    *
    * @return the effective timestamp of this bank branch
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _bankBranch.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this bank branch.
    *
    * @param effectiveTimestamp the effective timestamp of this bank branch
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _bankBranch.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the client ip of this bank branch.
    *
    * @return the client ip of this bank branch
    */
    @Override
    public java.lang.String getClientIp() {
        return _bankBranch.getClientIp();
    }

    /**
    * Sets the client ip of this bank branch.
    *
    * @param clientIp the client ip of this bank branch
    */
    @Override
    public void setClientIp(java.lang.String clientIp) {
        _bankBranch.setClientIp(clientIp);
    }

    /**
    * Returns the server ip of this bank branch.
    *
    * @return the server ip of this bank branch
    */
    @Override
    public java.lang.String getServerIp() {
        return _bankBranch.getServerIp();
    }

    /**
    * Sets the server ip of this bank branch.
    *
    * @param serverIp the server ip of this bank branch
    */
    @Override
    public void setServerIp(java.lang.String serverIp) {
        _bankBranch.setServerIp(serverIp);
    }

    /**
    * Returns the user agent of this bank branch.
    *
    * @return the user agent of this bank branch
    */
    @Override
    public java.lang.String getUserAgent() {
        return _bankBranch.getUserAgent();
    }

    /**
    * Sets the user agent of this bank branch.
    *
    * @param userAgent the user agent of this bank branch
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _bankBranch.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this bank branch.
    *
    * @return the operation of this bank branch
    */
    @Override
    public java.lang.String getOperation() {
        return _bankBranch.getOperation();
    }

    /**
    * Sets the operation of this bank branch.
    *
    * @param operation the operation of this bank branch
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _bankBranch.setOperation(operation);
    }

    @Override
    public boolean isNew() {
        return _bankBranch.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bankBranch.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bankBranch.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bankBranch.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bankBranch.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bankBranch.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bankBranch.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bankBranch.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bankBranch.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bankBranch.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bankBranch.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BankBranchWrapper((BankBranch) _bankBranch.clone());
    }

    @Override
    public int compareTo(BankBranch bankBranch) {
        return _bankBranch.compareTo(bankBranch);
    }

    @Override
    public int hashCode() {
        return _bankBranch.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<BankBranch> toCacheModel() {
        return _bankBranch.toCacheModel();
    }

    @Override
    public BankBranch toEscapedModel() {
        return new BankBranchWrapper(_bankBranch.toEscapedModel());
    }

    @Override
    public BankBranch toUnescapedModel() {
        return new BankBranchWrapper(_bankBranch.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bankBranch.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bankBranch.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bankBranch.persist();
    }

    @Override
    public java.lang.String getBankNameEn() {
        return _bankBranch.getBankNameEn();
    }

    @Override
    public void setBankNameEn(java.lang.String bankNameEn) {
        _bankBranch.setBankNameEn(bankNameEn);
    }

    @Override
    public java.lang.String getBankNameAr() {
        return _bankBranch.getBankNameAr();
    }

    @Override
    public void setBankNameAr(java.lang.String bankNameAr) {
        _bankBranch.setBankNameAr(bankNameAr);
    }

    @Override
    public java.lang.String getPaymentChannelNameEn() {
        return _bankBranch.getPaymentChannelNameEn();
    }

    @Override
    public void setPaymentChannelNameEn(java.lang.String paymentChannelNameEn) {
        _bankBranch.setPaymentChannelNameEn(paymentChannelNameEn);
    }

    @Override
    public java.lang.String getPaymentChannelNameAr() {
        return _bankBranch.getPaymentChannelNameAr();
    }

    @Override
    public void setPaymentChannelNameAr(java.lang.String paymentChannelNameAr) {
        _bankBranch.setPaymentChannelNameAr(paymentChannelNameAr);
    }

    @Override
    public java.lang.String getStcBankCode() {
        return _bankBranch.getStcBankCode();
    }

    @Override
    public void setStcBankCode(java.lang.String stcBankCode) {
        _bankBranch.setStcBankCode(stcBankCode);
    }

    @Override
    public boolean isPaymentTransactionRecorded() {
        return _bankBranch.isPaymentTransactionRecorded();
    }

    @Override
    public void setPaymentTransactionRecorded(
        boolean isPaymentTransactionRecorded) {
        _bankBranch.setPaymentTransactionRecorded(isPaymentTransactionRecorded);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankBranchWrapper)) {
            return false;
        }

        BankBranchWrapper bankBranchWrapper = (BankBranchWrapper) obj;

        if (Validator.equals(_bankBranch, bankBranchWrapper._bankBranch)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BankBranch getWrappedBankBranch() {
        return _bankBranch;
    }

    @Override
    public BankBranch getWrappedModel() {
        return _bankBranch;
    }

    @Override
    public void resetOriginalValues() {
        _bankBranch.resetOriginalValues();
    }
}
