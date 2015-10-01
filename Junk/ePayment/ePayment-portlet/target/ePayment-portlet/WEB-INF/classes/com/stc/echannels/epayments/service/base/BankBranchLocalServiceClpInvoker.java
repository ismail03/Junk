package com.stc.echannels.epayments.service.base;

import com.stc.echannels.epayments.service.BankBranchLocalServiceUtil;

import java.util.Arrays;

/**
 * @author ahmed_fadlus
 * @generated
 */
public class BankBranchLocalServiceClpInvoker {
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
    private String _methodName217;
    private String[] _methodParameterTypes217;

    public BankBranchLocalServiceClpInvoker() {
        _methodName0 = "addBankBranch";

        _methodParameterTypes0 = new String[] {
                "com.stc.echannels.epayments.model.BankBranch"
            };

        _methodName1 = "createBankBranch";

        _methodParameterTypes1 = new String[] { "java.lang.String" };

        _methodName2 = "deleteBankBranch";

        _methodParameterTypes2 = new String[] { "java.lang.String" };

        _methodName3 = "deleteBankBranch";

        _methodParameterTypes3 = new String[] {
                "com.stc.echannels.epayments.model.BankBranch"
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

        _methodName10 = "fetchBankBranch";

        _methodParameterTypes10 = new String[] { "java.lang.String" };

        _methodName11 = "getBankBranch";

        _methodParameterTypes11 = new String[] { "java.lang.String" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getBankBranchs";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getBankBranchsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateBankBranch";

        _methodParameterTypes15 = new String[] {
                "com.stc.echannels.epayments.model.BankBranch"
            };

        _methodName204 = "getBeanIdentifier";

        _methodParameterTypes204 = new String[] {  };

        _methodName205 = "setBeanIdentifier";

        _methodParameterTypes205 = new String[] { "java.lang.String" };

        _methodName211 = "addBankBranch";

        _methodParameterTypes211 = new String[] {
                "java.lang.String", "java.lang.String", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName212 = "deleteBankBranch";

        _methodParameterTypes212 = new String[] {
                "java.lang.String", "com.liferay.portal.service.ServiceContext"
            };

        _methodName213 = "getActiveBankBranchesByStatus";

        _methodParameterTypes213 = new String[] { "int", "int" };

        _methodName214 = "getActiveBankBranchesCount";

        _methodParameterTypes214 = new String[] {  };

        _methodName215 = "getBankBranchs";

        _methodParameterTypes215 = new String[] { "java.lang.String" };

        _methodName216 = "isStcBranchCodeExists";

        _methodParameterTypes216 = new String[] { "java.lang.String" };

        _methodName217 = "isBankandPaymentChannelExists";

        _methodParameterTypes217 = new String[] { "java.lang.String", "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return BankBranchLocalServiceUtil.addBankBranch((com.stc.echannels.epayments.model.BankBranch) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return BankBranchLocalServiceUtil.createBankBranch((java.lang.String) arguments[0]);
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return BankBranchLocalServiceUtil.deleteBankBranch((java.lang.String) arguments[0]);
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return BankBranchLocalServiceUtil.deleteBankBranch((com.stc.echannels.epayments.model.BankBranch) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return BankBranchLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return BankBranchLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return BankBranchLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return BankBranchLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return BankBranchLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return BankBranchLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return BankBranchLocalServiceUtil.fetchBankBranch((java.lang.String) arguments[0]);
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return BankBranchLocalServiceUtil.getBankBranch((java.lang.String) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return BankBranchLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return BankBranchLocalServiceUtil.getBankBranchs(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return BankBranchLocalServiceUtil.getBankBranchsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return BankBranchLocalServiceUtil.updateBankBranch((com.stc.echannels.epayments.model.BankBranch) arguments[0]);
        }

        if (_methodName204.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
            return BankBranchLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName205.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes205, parameterTypes)) {
            BankBranchLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName211.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes211, parameterTypes)) {
            return BankBranchLocalServiceUtil.addBankBranch((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                ((Long) arguments[2]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[3]);
        }

        if (_methodName212.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
            return BankBranchLocalServiceUtil.deleteBankBranch((java.lang.String) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName213.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
            return BankBranchLocalServiceUtil.getActiveBankBranchesByStatus(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName214.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes214, parameterTypes)) {
            return BankBranchLocalServiceUtil.getActiveBankBranchesCount();
        }

        if (_methodName215.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes215, parameterTypes)) {
            return BankBranchLocalServiceUtil.getBankBranchs((java.lang.String) arguments[0]);
        }

        if (_methodName216.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes216, parameterTypes)) {
            return BankBranchLocalServiceUtil.isStcBranchCodeExists((java.lang.String) arguments[0]);
        }

        if (_methodName217.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes217, parameterTypes)) {
            return BankBranchLocalServiceUtil.isBankandPaymentChannelExists((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
