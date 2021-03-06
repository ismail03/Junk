package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the BankServices service. Represents a row in the &quot;BANK_SERVICES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.BankServicesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.BankServicesImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see BankServices
 * @see com.stc.echannels.epayments.model.impl.BankServicesImpl
 * @see com.stc.echannels.epayments.model.impl.BankServicesModelImpl
 * @generated
 */
public interface BankServicesModel extends BaseModel<BankServices> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a bank services model instance should use the {@link BankServices} interface instead.
     */

    /**
     * Returns the primary key of this bank services.
     *
     * @return the primary key of this bank services
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this bank services.
     *
     * @param primaryKey the primary key of this bank services
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the bankid of this bank services.
     *
     * @return the bankid of this bank services
     */
    @AutoEscape
    public String getBankid();

    /**
     * Sets the bankid of this bank services.
     *
     * @param bankid the bankid of this bank services
     */
    public void setBankid(String bankid);

    /**
     * Returns the serviceid of this bank services.
     *
     * @return the serviceid of this bank services
     */
    public long getServiceid();

    /**
     * Sets the serviceid of this bank services.
     *
     * @param serviceid the serviceid of this bank services
     */
    public void setServiceid(long serviceid);

    /**
     * Returns the ID of this bank services.
     *
     * @return the ID of this bank services
     */
    @AutoEscape
    public String getId();

    /**
     * Sets the ID of this bank services.
     *
     * @param id the ID of this bank services
     */
    public void setId(String id);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(BankServices bankServices);

    @Override
    public int hashCode();

    @Override
    public CacheModel<BankServices> toCacheModel();

    @Override
    public BankServices toEscapedModel();

    @Override
    public BankServices toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
