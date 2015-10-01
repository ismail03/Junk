package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BankServices}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankServices
 * @generated
 */
public class BankServicesWrapper implements BankServices,
    ModelWrapper<BankServices> {
    private BankServices _bankServices;

    public BankServicesWrapper(BankServices bankServices) {
        _bankServices = bankServices;
    }

    @Override
    public Class<?> getModelClass() {
        return BankServices.class;
    }

    @Override
    public String getModelClassName() {
        return BankServices.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bankid", getBankid());
        attributes.put("serviceid", getServiceid());
        attributes.put("id", getId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String bankid = (String) attributes.get("bankid");

        if (bankid != null) {
            setBankid(bankid);
        }

        Long serviceid = (Long) attributes.get("serviceid");

        if (serviceid != null) {
            setServiceid(serviceid);
        }

        String id = (String) attributes.get("id");

        if (id != null) {
            setId(id);
        }
    }

    /**
    * Returns the primary key of this bank services.
    *
    * @return the primary key of this bank services
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _bankServices.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bank services.
    *
    * @param primaryKey the primary key of this bank services
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _bankServices.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the bankid of this bank services.
    *
    * @return the bankid of this bank services
    */
    @Override
    public java.lang.String getBankid() {
        return _bankServices.getBankid();
    }

    /**
    * Sets the bankid of this bank services.
    *
    * @param bankid the bankid of this bank services
    */
    @Override
    public void setBankid(java.lang.String bankid) {
        _bankServices.setBankid(bankid);
    }

    /**
    * Returns the serviceid of this bank services.
    *
    * @return the serviceid of this bank services
    */
    @Override
    public long getServiceid() {
        return _bankServices.getServiceid();
    }

    /**
    * Sets the serviceid of this bank services.
    *
    * @param serviceid the serviceid of this bank services
    */
    @Override
    public void setServiceid(long serviceid) {
        _bankServices.setServiceid(serviceid);
    }

    /**
    * Returns the ID of this bank services.
    *
    * @return the ID of this bank services
    */
    @Override
    public java.lang.String getId() {
        return _bankServices.getId();
    }

    /**
    * Sets the ID of this bank services.
    *
    * @param id the ID of this bank services
    */
    @Override
    public void setId(java.lang.String id) {
        _bankServices.setId(id);
    }

    @Override
    public boolean isNew() {
        return _bankServices.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bankServices.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bankServices.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bankServices.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bankServices.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bankServices.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bankServices.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bankServices.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bankServices.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bankServices.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bankServices.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BankServicesWrapper((BankServices) _bankServices.clone());
    }

    @Override
    public int compareTo(BankServices bankServices) {
        return _bankServices.compareTo(bankServices);
    }

    @Override
    public int hashCode() {
        return _bankServices.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<BankServices> toCacheModel() {
        return _bankServices.toCacheModel();
    }

    @Override
    public BankServices toEscapedModel() {
        return new BankServicesWrapper(_bankServices.toEscapedModel());
    }

    @Override
    public BankServices toUnescapedModel() {
        return new BankServicesWrapper(_bankServices.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bankServices.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bankServices.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bankServices.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankServicesWrapper)) {
            return false;
        }

        BankServicesWrapper bankServicesWrapper = (BankServicesWrapper) obj;

        if (Validator.equals(_bankServices, bankServicesWrapper._bankServices)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BankServices getWrappedBankServices() {
        return _bankServices;
    }

    @Override
    public BankServices getWrappedModel() {
        return _bankServices;
    }

    @Override
    public void resetOriginalValues() {
        _bankServices.resetOriginalValues();
    }
}
