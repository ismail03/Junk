package com.stc.echannels.epayments.service.base;

import com.stc.echannels.epayments.service.NotifConfigServiceUtil;

import java.util.Arrays;

/**
 * @author ahmed_fadlus
 * @generated
 */
public class NotifConfigServiceClpInvoker {
    private String _methodName188;
    private String[] _methodParameterTypes188;
    private String _methodName189;
    private String[] _methodParameterTypes189;

    public NotifConfigServiceClpInvoker() {
        _methodName188 = "getBeanIdentifier";

        _methodParameterTypes188 = new String[] {  };

        _methodName189 = "setBeanIdentifier";

        _methodParameterTypes189 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName188.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
            return NotifConfigServiceUtil.getBeanIdentifier();
        }

        if (_methodName189.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
            NotifConfigServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}