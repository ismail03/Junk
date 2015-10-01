package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the SrvTypeSrvsMap service. Represents a row in the &quot;SERVICE_TYPE_SERVICES_MAP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapImpl}.
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypeSrvsMap
 * @see com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapImpl
 * @see com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapModelImpl
 * @generated
 */
public interface SrvTypeSrvsMapModel extends BaseModel<SrvTypeSrvsMap> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a srv type srvs map model instance should use the {@link SrvTypeSrvsMap} interface instead.
     */

    /**
     * Returns the primary key of this srv type srvs map.
     *
     * @return the primary key of this srv type srvs map
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this srv type srvs map.
     *
     * @param primaryKey the primary key of this srv type srvs map
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the ID of this srv type srvs map.
     *
     * @return the ID of this srv type srvs map
     */
    @AutoEscape
    public String getId();

    /**
     * Sets the ID of this srv type srvs map.
     *
     * @param id the ID of this srv type srvs map
     */
    public void setId(String id);

    /**
     * Returns the service ID of this srv type srvs map.
     *
     * @return the service ID of this srv type srvs map
     */
    public long getServiceId();

    /**
     * Sets the service ID of this srv type srvs map.
     *
     * @param serviceId the service ID of this srv type srvs map
     */
    public void setServiceId(long serviceId);

    /**
     * Returns the service type ID of this srv type srvs map.
     *
     * @return the service type ID of this srv type srvs map
     */
    public long getServiceTypeId();

    /**
     * Sets the service type ID of this srv type srvs map.
     *
     * @param serviceTypeId the service type ID of this srv type srvs map
     */
    public void setServiceTypeId(long serviceTypeId);

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
    public int compareTo(SrvTypeSrvsMap srvTypeSrvsMap);

    @Override
    public int hashCode();

    @Override
    public CacheModel<SrvTypeSrvsMap> toCacheModel();

    @Override
    public SrvTypeSrvsMap toEscapedModel();

    @Override
    public SrvTypeSrvsMap toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}