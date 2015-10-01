package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bank}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see Bank
 * @generated
 */
public class BankWrapper implements Bank, ModelWrapper<Bank> {
    private Bank _bank;

    public BankWrapper(Bank bank) {
        _bank = bank;
    }

    @Override
    public Class<?> getModelClass() {
        return Bank.class;
    }

    @Override
    public String getModelClassName() {
        return Bank.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("transId", getTransId());
        attributes.put("lastUpdateTimestamp", getLastUpdateTimestamp());
        attributes.put("lastUpdateUserid", getLastUpdateUserid());
        attributes.put("lastUpdateUsername", getLastUpdateUsername());
        attributes.put("active", getActive());
        attributes.put("effectiveTimestamp", getEffectiveTimestamp());
        attributes.put("status", getStatus());
        attributes.put("clientIp", getClientIp());
        attributes.put("serverIp", getServerIp());
        attributes.put("userAgent", getUserAgent());
        attributes.put("operation", getOperation());
        attributes.put("bankId", getBankId());
        attributes.put("stcCode", getStcCode());
        attributes.put("nameEn", getNameEn());
        attributes.put("nameAr", getNameAr());
        attributes.put("comments", getComments());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String transId = (String) attributes.get("transId");

        if (transId != null) {
            setTransId(transId);
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

        Date effectiveTimestamp = (Date) attributes.get("effectiveTimestamp");

        if (effectiveTimestamp != null) {
            setEffectiveTimestamp(effectiveTimestamp);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
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

        String bankId = (String) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        String stcCode = (String) attributes.get("stcCode");

        if (stcCode != null) {
            setStcCode(stcCode);
        }

        String nameEn = (String) attributes.get("nameEn");

        if (nameEn != null) {
            setNameEn(nameEn);
        }

        String nameAr = (String) attributes.get("nameAr");

        if (nameAr != null) {
            setNameAr(nameAr);
        }

        String comments = (String) attributes.get("comments");

        if (comments != null) {
            setComments(comments);
        }
    }

    /**
    * Returns the primary key of this bank.
    *
    * @return the primary key of this bank
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _bank.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bank.
    *
    * @param primaryKey the primary key of this bank
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _bank.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the trans ID of this bank.
    *
    * @return the trans ID of this bank
    */
    @Override
    public java.lang.String getTransId() {
        return _bank.getTransId();
    }

    /**
    * Sets the trans ID of this bank.
    *
    * @param transId the trans ID of this bank
    */
    @Override
    public void setTransId(java.lang.String transId) {
        _bank.setTransId(transId);
    }

    /**
    * Returns the last update timestamp of this bank.
    *
    * @return the last update timestamp of this bank
    */
    @Override
    public java.util.Date getLastUpdateTimestamp() {
        return _bank.getLastUpdateTimestamp();
    }

    /**
    * Sets the last update timestamp of this bank.
    *
    * @param lastUpdateTimestamp the last update timestamp of this bank
    */
    @Override
    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        _bank.setLastUpdateTimestamp(lastUpdateTimestamp);
    }

    /**
    * Returns the last update userid of this bank.
    *
    * @return the last update userid of this bank
    */
    @Override
    public java.lang.String getLastUpdateUserid() {
        return _bank.getLastUpdateUserid();
    }

    /**
    * Sets the last update userid of this bank.
    *
    * @param lastUpdateUserid the last update userid of this bank
    */
    @Override
    public void setLastUpdateUserid(java.lang.String lastUpdateUserid) {
        _bank.setLastUpdateUserid(lastUpdateUserid);
    }

    /**
    * Returns the last update username of this bank.
    *
    * @return the last update username of this bank
    */
    @Override
    public java.lang.String getLastUpdateUsername() {
        return _bank.getLastUpdateUsername();
    }

    /**
    * Sets the last update username of this bank.
    *
    * @param lastUpdateUsername the last update username of this bank
    */
    @Override
    public void setLastUpdateUsername(java.lang.String lastUpdateUsername) {
        _bank.setLastUpdateUsername(lastUpdateUsername);
    }

    /**
    * Returns the active of this bank.
    *
    * @return the active of this bank
    */
    @Override
    public java.lang.String getActive() {
        return _bank.getActive();
    }

    /**
    * Sets the active of this bank.
    *
    * @param active the active of this bank
    */
    @Override
    public void setActive(java.lang.String active) {
        _bank.setActive(active);
    }

    /**
    * Returns the effective timestamp of this bank.
    *
    * @return the effective timestamp of this bank
    */
    @Override
    public java.util.Date getEffectiveTimestamp() {
        return _bank.getEffectiveTimestamp();
    }

    /**
    * Sets the effective timestamp of this bank.
    *
    * @param effectiveTimestamp the effective timestamp of this bank
    */
    @Override
    public void setEffectiveTimestamp(java.util.Date effectiveTimestamp) {
        _bank.setEffectiveTimestamp(effectiveTimestamp);
    }

    /**
    * Returns the status of this bank.
    *
    * @return the status of this bank
    */
    @Override
    public java.lang.String getStatus() {
        return _bank.getStatus();
    }

    /**
    * Sets the status of this bank.
    *
    * @param status the status of this bank
    */
    @Override
    public void setStatus(java.lang.String status) {
        _bank.setStatus(status);
    }

    /**
    * Returns the client ip of this bank.
    *
    * @return the client ip of this bank
    */
    @Override
    public java.lang.String getClientIp() {
        return _bank.getClientIp();
    }

    /**
    * Sets the client ip of this bank.
    *
    * @param clientIp the client ip of this bank
    */
    @Override
    public void setClientIp(java.lang.String clientIp) {
        _bank.setClientIp(clientIp);
    }

    /**
    * Returns the server ip of this bank.
    *
    * @return the server ip of this bank
    */
    @Override
    public java.lang.String getServerIp() {
        return _bank.getServerIp();
    }

    /**
    * Sets the server ip of this bank.
    *
    * @param serverIp the server ip of this bank
    */
    @Override
    public void setServerIp(java.lang.String serverIp) {
        _bank.setServerIp(serverIp);
    }

    /**
    * Returns the user agent of this bank.
    *
    * @return the user agent of this bank
    */
    @Override
    public java.lang.String getUserAgent() {
        return _bank.getUserAgent();
    }

    /**
    * Sets the user agent of this bank.
    *
    * @param userAgent the user agent of this bank
    */
    @Override
    public void setUserAgent(java.lang.String userAgent) {
        _bank.setUserAgent(userAgent);
    }

    /**
    * Returns the operation of this bank.
    *
    * @return the operation of this bank
    */
    @Override
    public java.lang.String getOperation() {
        return _bank.getOperation();
    }

    /**
    * Sets the operation of this bank.
    *
    * @param operation the operation of this bank
    */
    @Override
    public void setOperation(java.lang.String operation) {
        _bank.setOperation(operation);
    }

    /**
    * Returns the bank ID of this bank.
    *
    * @return the bank ID of this bank
    */
    @Override
    public java.lang.String getBankId() {
        return _bank.getBankId();
    }

    /**
    * Sets the bank ID of this bank.
    *
    * @param bankId the bank ID of this bank
    */
    @Override
    public void setBankId(java.lang.String bankId) {
        _bank.setBankId(bankId);
    }

    /**
    * Returns the stc code of this bank.
    *
    * @return the stc code of this bank
    */
    @Override
    public java.lang.String getStcCode() {
        return _bank.getStcCode();
    }

    /**
    * Sets the stc code of this bank.
    *
    * @param stcCode the stc code of this bank
    */
    @Override
    public void setStcCode(java.lang.String stcCode) {
        _bank.setStcCode(stcCode);
    }

    /**
    * Returns the name en of this bank.
    *
    * @return the name en of this bank
    */
    @Override
    public java.lang.String getNameEn() {
        return _bank.getNameEn();
    }

    /**
    * Sets the name en of this bank.
    *
    * @param nameEn the name en of this bank
    */
    @Override
    public void setNameEn(java.lang.String nameEn) {
        _bank.setNameEn(nameEn);
    }

    /**
    * Returns the name ar of this bank.
    *
    * @return the name ar of this bank
    */
    @Override
    public java.lang.String getNameAr() {
        return _bank.getNameAr();
    }

    /**
    * Sets the name ar of this bank.
    *
    * @param nameAr the name ar of this bank
    */
    @Override
    public void setNameAr(java.lang.String nameAr) {
        _bank.setNameAr(nameAr);
    }

    /**
    * Returns the comments of this bank.
    *
    * @return the comments of this bank
    */
    @Override
    public java.lang.String getComments() {
        return _bank.getComments();
    }

    /**
    * Sets the comments of this bank.
    *
    * @param comments the comments of this bank
    */
    @Override
    public void setComments(java.lang.String comments) {
        _bank.setComments(comments);
    }

    @Override
    public boolean isNew() {
        return _bank.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bank.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bank.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bank.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bank.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bank.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bank.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bank.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bank.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bank.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bank.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BankWrapper((Bank) _bank.clone());
    }

    @Override
    public int compareTo(Bank bank) {
        return _bank.compareTo(bank);
    }

    @Override
    public int hashCode() {
        return _bank.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Bank> toCacheModel() {
        return _bank.toCacheModel();
    }

    @Override
    public Bank toEscapedModel() {
        return new BankWrapper(_bank.toEscapedModel());
    }

    @Override
    public Bank toUnescapedModel() {
        return new BankWrapper(_bank.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bank.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bank.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bank.persist();
    }

    @Override
    public boolean isPaymentTransactionRecorded() {
        return _bank.isPaymentTransactionRecorded();
    }

    @Override
    public void setPaymentTransactionRecorded(
        boolean isPaymentTransactionRecorded) {
        _bank.setPaymentTransactionRecorded(isPaymentTransactionRecorded);
    }

    @Override
    public java.lang.String getName(java.util.Locale locale) {
        return _bank.getName(locale);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankWrapper)) {
            return false;
        }

        BankWrapper bankWrapper = (BankWrapper) obj;

        if (Validator.equals(_bank, bankWrapper._bank)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Bank getWrappedBank() {
        return _bank;
    }

    @Override
    public Bank getWrappedModel() {
        return _bank;
    }

    @Override
    public void resetOriginalValues() {
        _bank.resetOriginalValues();
    }
}
