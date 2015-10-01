package com.stc.echannels.epayments.service.base;

import com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil;

import java.util.Arrays;

/**
 * @author ahmed_fadlus
 * @generated
 */
public class EPayAccessControlLocalServiceClpInvoker {
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
    private String _methodName213;
    private String[] _methodParameterTypes213;
    private String _methodName214;
    private String[] _methodParameterTypes214;
    private String _methodName215;
    private String[] _methodParameterTypes215;
    private String _methodName216;
    private String[] _methodParameterTypes216;

    public EPayAccessControlLocalServiceClpInvoker() {
        _methodName0 = "addEPayAccessControl";

        _methodParameterTypes0 = new String[] {
                "com.stc.echannels.epayments.model.EPayAccessControl"
            };

        _methodName1 = "createEPayAccessControl";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteEPayAccessControl";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteEPayAccessControl";

        _methodParameterTypes3 = new String[] {
                "com.stc.echannels.epayments.model.EPayAccessControl"
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

        _methodName10 = "fetchEPayAccessControl";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getEPayAccessControl";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getEPayAccessControls";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getEPayAccessControlsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateEPayAccessControl";

        _methodParameterTypes15 = new String[] {
                "com.stc.echannels.epayments.model.EPayAccessControl"
            };

        _methodName204 = "getBeanIdentifier";

        _methodParameterTypes204 = new String[] {  };

        _methodName205 = "setBeanIdentifier";

        _methodParameterTypes205 = new String[] { "java.lang.String" };

        _methodName210 = "findActiveEpayAccessControlByServiceType";

        _methodParameterTypes210 = new String[] { "java.lang.Long" };

        _methodName211 = "enableEPayAcessControl";

        _methodParameterTypes211 = new String[] {
                "long[][]",
                "com.stc.echannels.epayments.model.EPayAccessControl"
            };

        _methodName212 = "addEPayAcessControl";

        _methodParameterTypes212 = new String[] { "java.util.List" };

        _methodName213 = "isBusinessServiceDisabled";

        _methodParameterTypes213 = new String[] { "long" };

        _methodName214 = "isBusinessServiceDownHierarchyDisabled";

        _methodParameterTypes214 = new String[] { "long" };

        _methodName215 = "isCombinationDisabled";

        _methodParameterTypes215 = new String[] { "long", "long", "long", "long" };

        _methodName216 = "findByServiceidAndStatus";

        _methodParameterTypes216 = new String[] { "long", "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.addEPayAccessControl((com.stc.echannels.epayments.model.EPayAccessControl) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.createEPayAccessControl(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.deleteEPayAccessControl(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.deleteEPayAccessControl((com.stc.echannels.epayments.model.EPayAccessControl) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.fetchEPayAccessControl(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.getEPayAccessControl(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.getEPayAccessControls(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.getEPayAccessControlsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.updateEPayAccessControl((com.stc.echannels.epayments.model.EPayAccessControl) arguments[0]);
        }

        if (_methodName204.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName205.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
            EPayAccessControlLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName210.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes210, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.findActiveEpayAccessControlByServiceType((java.lang.Long) arguments[0]);
        }

        if (_methodName211.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
            EPayAccessControlLocalServiceUtil.enableEPayAcessControl((long[]) arguments[0],
                (com.stc.echannels.epayments.model.EPayAccessControl) arguments[1]);

            return null;
        }

        if (_methodName212.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
            EPayAccessControlLocalServiceUtil.addEPayAcessControl((java.util.List<com.stc.echannels.epayments.model.EPayAccessControl>) arguments[0]);

            return null;
        }

        if (_methodName213.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.isBusinessServiceDisabled(((Long) arguments[0]).longValue());
        }

        if (_methodName214.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes214, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.isBusinessServiceDownHierarchyDisabled(((Long) arguments[0]).longValue());
        }

        if (_methodName215.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes215, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.isCombinationDisabled(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue());
        }

        if (_methodName216.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes216, parameterTypes)) {
            return EPayAccessControlLocalServiceUtil.findByServiceidAndStatus(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1]);
        }

        throw new UnsupportedOperationException();
    }
}
