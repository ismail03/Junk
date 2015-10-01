package com.stc.echannels.epayments.service.base;

import com.stc.echannels.epayments.service.SrvTypeSrvsMapLocalServiceUtil;

import java.util.Arrays;

/**
 * @author ahmed_fadlus
 * @generated
 */
public class SrvTypeSrvsMapLocalServiceClpInvoker {
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

    public SrvTypeSrvsMapLocalServiceClpInvoker() {
        _methodName0 = "addSrvTypeSrvsMap";

        _methodParameterTypes0 = new String[] {
                "com.stc.echannels.epayments.model.SrvTypeSrvsMap"
            };

        _methodName1 = "createSrvTypeSrvsMap";

        _methodParameterTypes1 = new String[] { "java.lang.String" };

        _methodName2 = "deleteSrvTypeSrvsMap";

        _methodParameterTypes2 = new String[] { "java.lang.String" };

        _methodName3 = "deleteSrvTypeSrvsMap";

        _methodParameterTypes3 = new String[] {
                "com.stc.echannels.epayments.model.SrvTypeSrvsMap"
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

        _methodName10 = "fetchSrvTypeSrvsMap";

        _methodParameterTypes10 = new String[] { "java.lang.String" };

        _methodName11 = "getSrvTypeSrvsMap";

        _methodParameterTypes11 = new String[] { "java.lang.String" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getSrvTypeSrvsMaps";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getSrvTypeSrvsMapsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateSrvTypeSrvsMap";

        _methodParameterTypes15 = new String[] {
                "com.stc.echannels.epayments.model.SrvTypeSrvsMap"
            };

        _methodName204 = "getBeanIdentifier";

        _methodParameterTypes204 = new String[] {  };

        _methodName205 = "setBeanIdentifier";

        _methodParameterTypes205 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.addSrvTypeSrvsMap((com.stc.echannels.epayments.model.SrvTypeSrvsMap) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.createSrvTypeSrvsMap((java.lang.String) arguments[0]);
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.deleteSrvTypeSrvsMap((java.lang.String) arguments[0]);
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.deleteSrvTypeSrvsMap((com.stc.echannels.epayments.model.SrvTypeSrvsMap) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.fetchSrvTypeSrvsMap((java.lang.String) arguments[0]);
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.getSrvTypeSrvsMap((java.lang.String) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.getSrvTypeSrvsMaps(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.getSrvTypeSrvsMapsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.updateSrvTypeSrvsMap((com.stc.echannels.epayments.model.SrvTypeSrvsMap) arguments[0]);
        }

        if (_methodName204.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
            return SrvTypeSrvsMapLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName205.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
            SrvTypeSrvsMapLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
