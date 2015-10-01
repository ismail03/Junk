package com.stc.echannels.epayments.service.base;

import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;

import java.util.Arrays;

/**
 * @author ahmed_fadlus
 * @generated
 */
public class BusinessSrvLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName204;
    private String[] _methodParameterTypes204;
    private String _methodName205;
    private String[] _methodParameterTypes205;
    private String _methodName210;
    private String[] _methodParameterTypes210;
    private String _methodName211;
    private String[] _methodParameterTypes211;
    private String _methodName212;
    private String[] _methodParameterTypes212;

    public BusinessSrvLocalServiceClpInvoker() {
        _methodName0 = "addBusinessSrv";

        _methodParameterTypes0 = new String[] {
                "com.stc.echannels.epayments.model.BusinessSrv"
            };

        _methodName1 = "createBusinessSrv";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteBusinessSrv";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteBusinessSrv";

        _methodParameterTypes3 = new String[] {
                "com.stc.echannels.epayments.model.BusinessSrv"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchBusinessSrv";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getBusinessSrv";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getBusinessSrvs";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getBusinessSrvsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateBusinessSrv";

        _methodParameterTypes15 = new String[] {
                "com.stc.echannels.epayments.model.BusinessSrv"
            };

        _methodName204 = "getBeanIdentifier";

        _methodParameterTypes204 = new String[] {  };

        _methodName205 = "setBeanIdentifier";

        _methodParameterTypes205 = new String[] { "java.lang.String" };

        _methodName210 = "addBusinessSrv";

        _methodParameterTypes210 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "long", "java.util.Date",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName211 = "getBusinessServices";

        _methodParameterTypes211 = new String[] {  };

        _methodName212 = "findBusinessServiceExcludingSADAD";

        _methodParameterTypes212 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.addBusinessSrv((com.stc.echannels.epayments.model.BusinessSrv) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.createBusinessSrv(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.deleteBusinessSrv(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.deleteBusinessSrv((com.stc.echannels.epayments.model.BusinessSrv) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.fetchBusinessSrv(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.getBusinessSrv(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.getBusinessSrvs(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.getBusinessSrvsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.updateBusinessSrv((com.stc.echannels.epayments.model.BusinessSrv) arguments[0]);
        }

        if (_methodName204.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName205.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
            BusinessSrvLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName210.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.addBusinessSrv((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                ((Long) arguments[3]).longValue(),
                (java.util.Date) arguments[4],
                (com.liferay.portal.service.ServiceContext) arguments[5]);
        }

        if (_methodName211.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.getBusinessServices();
        }

        if (_methodName212.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
            return BusinessSrvLocalServiceUtil.findBusinessServiceExcludingSADAD();
        }

        throw new UnsupportedOperationException();
    }
}
