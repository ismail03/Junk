package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the SrvTypes service. Represents a row in the &quot;SERVICE_TYPES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.SrvTypesImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypes
 * @see com.stc.echannels.epayments.model.impl.SrvTypesImpl
 * @see com.stc.echannels.epayments.model.impl.SrvTypesModelImpl
 * @generated
 */
public interface SrvTypesModel extends BaseModel<SrvTypes> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a srv types model instance should use the {@link SrvTypes} interface instead.
     */

    /**
     * Returns the primary key of this srv types.
     *
     * @return the primary key of this srv types
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this srv types.
     *
     * @param primaryKey the primary key of this srv types
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the service type ID of this srv types.
     *
     * @return the service type ID of this srv types
     */
    public long getServiceTypeId();

    /**
     * Sets the service type ID of this srv types.
     *
     * @param serviceTypeId the service type ID of this srv types
     */
    public void setServiceTypeId(long serviceTypeId);

    /**
     * Returns the service type name of this srv types.
     *
     * @return the service type name of this srv types
     */
    @AutoEscape
    public String getServiceTypeName();

    /**
     * Sets the service type name of this srv types.
     *
     * @param serviceTypeName the service type name of this srv types
     */
    public void setServiceTypeName(String serviceTypeName);

    /**
     * Returns the service name e n of this srv types.
     *
     * @return the service name e n of this srv types
     */
    @AutoEscape
    public String getServiceNameEN();

    /**
     * Sets the service name e n of this srv types.
     *
     * @param serviceNameEN the service name e n of this srv types
     */
    public void setServiceNameEN(String serviceNameEN);

    /**
     * Returns the service name a r of this srv types.
     *
     * @return the service name a r of this srv types
     */
    @AutoEscape
    public String getServiceNameAR();

    /**
     * Sets the service name a r of this srv types.
     *
     * @param serviceNameAR the service name a r of this srv types
     */
    public void setServiceNameAR(String serviceNameAR);

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
    public int compareTo(SrvTypes srvTypes);

    @Override
    public int hashCode();

    @Override
    public CacheModel<SrvTypes> toCacheModel();

    @Override
    public SrvTypes toEscapedModel();

    @Override
    public SrvTypes toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
