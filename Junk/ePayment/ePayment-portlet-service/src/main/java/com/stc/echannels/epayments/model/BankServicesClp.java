package com.stc.echannels.epayments.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.stc.echannels.epayments.service.BankServicesLocalServiceUtil;
import com.stc.echannels.epayments.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class BankServicesClp extends BaseModelImpl<BankServices>
    implements BankServices {
    private String _bankid;
    private long _serviceid;
    private String _id;
    private BaseModel<?> _bankServicesRemoteModel;

    public BankServicesClp() {
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
    public String getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
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

    @Override
    public String getBankid() {
        return _bankid;
    }

    @Override
    public void setBankid(String bankid) {
        _bankid = bankid;

        if (_bankServicesRemoteModel != null) {
            try {
                Class<?> clazz = _bankServicesRemoteModel.getClass();

                Method method = clazz.getMethod("setBankid", String.class);

                method.invoke(_bankServicesRemoteModel, bankid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getServiceid() {
        return _serviceid;
    }

    @Override
    public void setServiceid(long serviceid) {
        _serviceid = serviceid;

        if (_bankServicesRemoteModel != null) {
            try {
                Class<?> clazz = _bankServicesRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceid", long.class);

                method.invoke(_bankServicesRemoteModel, serviceid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getId() {
        return _id;
    }

    @Override
    public void setId(String id) {
        _id = id;

        if (_bankServicesRemoteModel != null) {
            try {
                Class<?> clazz = _bankServicesRemoteModel.getClass();

                Method method = clazz.getMethod("setId", String.class);

                method.invoke(_bankServicesRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBankServicesRemoteModel() {
        return _bankServicesRemoteModel;
    }

    public void setBankServicesRemoteModel(BaseModel<?> bankServicesRemoteModel) {
        _bankServicesRemoteModel = bankServicesRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _bankServicesRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_bankServicesRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BankServicesLocalServiceUtil.addBankServices(this);
        } else {
            BankServicesLocalServiceUtil.updateBankServices(this);
        }
    }

    @Override
    public BankServices toEscapedModel() {
        return (BankServices) ProxyUtil.newProxyInstance(BankServices.class.getClassLoader(),
            new Class[] { BankServices.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BankServicesClp clone = new BankServicesClp();

        clone.setBankid(getBankid());
        clone.setServiceid(getServiceid());
        clone.setId(getId());

        return clone;
    }

    @Override
    public int compareTo(BankServices bankServices) {
        String primaryKey = bankServices.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankServicesClp)) {
            return false;
        }

        BankServicesClp bankServices = (BankServicesClp) obj;

        String primaryKey = bankServices.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{bankid=");
        sb.append(getBankid());
        sb.append(", serviceid=");
        sb.append(getServiceid());
        sb.append(", id=");
        sb.append(getId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.stc.echannels.epayments.model.BankServices");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bankid</column-name><column-value><![CDATA[");
        sb.append(getBankid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceid</column-name><column-value><![CDATA[");
        sb.append(getServiceid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
