package com.stc.echannels.epayments.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.stc.echannels.epayments.model.BankBranchClp;
import com.stc.echannels.epayments.model.BankClp;
import com.stc.echannels.epayments.model.BankServicesClp;
import com.stc.echannels.epayments.model.BizRuleConfigClp;
import com.stc.echannels.epayments.model.BusinessSrvClp;
import com.stc.echannels.epayments.model.CardGroupClp;
import com.stc.echannels.epayments.model.EPayAccessControlClp;
import com.stc.echannels.epayments.model.InRechargeHistoryClp;
import com.stc.echannels.epayments.model.NotifConfigClp;
import com.stc.echannels.epayments.model.NotifParamClp;
import com.stc.echannels.epayments.model.NotifParamSrvClp;
import com.stc.echannels.epayments.model.PaymentChannelClp;
import com.stc.echannels.epayments.model.PaymentChannelSrClp;
import com.stc.echannels.epayments.model.PaymentChannelSrvsMapClp;
import com.stc.echannels.epayments.model.PaymentMethodClp;
import com.stc.echannels.epayments.model.PaymentMethodSrvsMapClp;
import com.stc.echannels.epayments.model.PaymentRuleClp;
import com.stc.echannels.epayments.model.PaymentSystemClp;
import com.stc.echannels.epayments.model.PaymentTransactionDetailsClp;
import com.stc.echannels.epayments.model.PaymentTransactionsClp;
import com.stc.echannels.epayments.model.ReconLogClp;
import com.stc.echannels.epayments.model.RefundLogClp;
import com.stc.echannels.epayments.model.RefundReconLogClp;
import com.stc.echannels.epayments.model.SrvTypeSrvsMapClp;
import com.stc.echannels.epayments.model.SrvTypesClp;
import com.stc.echannels.epayments.model.SystemConfigClp;
import com.stc.echannels.epayments.model.TransactionStatusClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "ePayment-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "ePayment-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "ePayment-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(BankClp.class.getName())) {
            return translateInputBank(oldModel);
        }

        if (oldModelClassName.equals(BankBranchClp.class.getName())) {
            return translateInputBankBranch(oldModel);
        }

        if (oldModelClassName.equals(BankServicesClp.class.getName())) {
            return translateInputBankServices(oldModel);
        }

        if (oldModelClassName.equals(BizRuleConfigClp.class.getName())) {
            return translateInputBizRuleConfig(oldModel);
        }

        if (oldModelClassName.equals(BusinessSrvClp.class.getName())) {
            return translateInputBusinessSrv(oldModel);
        }

        if (oldModelClassName.equals(CardGroupClp.class.getName())) {
            return translateInputCardGroup(oldModel);
        }

        if (oldModelClassName.equals(EPayAccessControlClp.class.getName())) {
            return translateInputEPayAccessControl(oldModel);
        }

        if (oldModelClassName.equals(InRechargeHistoryClp.class.getName())) {
            return translateInputInRechargeHistory(oldModel);
        }

        if (oldModelClassName.equals(NotifConfigClp.class.getName())) {
            return translateInputNotifConfig(oldModel);
        }

        if (oldModelClassName.equals(NotifParamClp.class.getName())) {
            return translateInputNotifParam(oldModel);
        }

        if (oldModelClassName.equals(NotifParamSrvClp.class.getName())) {
            return translateInputNotifParamSrv(oldModel);
        }

        if (oldModelClassName.equals(PaymentChannelClp.class.getName())) {
            return translateInputPaymentChannel(oldModel);
        }

        if (oldModelClassName.equals(PaymentChannelSrClp.class.getName())) {
            return translateInputPaymentChannelSr(oldModel);
        }

        if (oldModelClassName.equals(PaymentChannelSrvsMapClp.class.getName())) {
            return translateInputPaymentChannelSrvsMap(oldModel);
        }

        if (oldModelClassName.equals(PaymentMethodClp.class.getName())) {
            return translateInputPaymentMethod(oldModel);
        }

        if (oldModelClassName.equals(PaymentMethodSrvsMapClp.class.getName())) {
            return translateInputPaymentMethodSrvsMap(oldModel);
        }

        if (oldModelClassName.equals(PaymentRuleClp.class.getName())) {
            return translateInputPaymentRule(oldModel);
        }

        if (oldModelClassName.equals(PaymentSystemClp.class.getName())) {
            return translateInputPaymentSystem(oldModel);
        }

        if (oldModelClassName.equals(
                    PaymentTransactionDetailsClp.class.getName())) {
            return translateInputPaymentTransactionDetails(oldModel);
        }

        if (oldModelClassName.equals(PaymentTransactionsClp.class.getName())) {
            return translateInputPaymentTransactions(oldModel);
        }

        if (oldModelClassName.equals(ReconLogClp.class.getName())) {
            return translateInputReconLog(oldModel);
        }

        if (oldModelClassName.equals(RefundLogClp.class.getName())) {
            return translateInputRefundLog(oldModel);
        }

        if (oldModelClassName.equals(RefundReconLogClp.class.getName())) {
            return translateInputRefundReconLog(oldModel);
        }

        if (oldModelClassName.equals(SrvTypesClp.class.getName())) {
            return translateInputSrvTypes(oldModel);
        }

        if (oldModelClassName.equals(SrvTypeSrvsMapClp.class.getName())) {
            return translateInputSrvTypeSrvsMap(oldModel);
        }

        if (oldModelClassName.equals(SystemConfigClp.class.getName())) {
            return translateInputSystemConfig(oldModel);
        }

        if (oldModelClassName.equals(TransactionStatusClp.class.getName())) {
            return translateInputTransactionStatus(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputBank(BaseModel<?> oldModel) {
        BankClp oldClpModel = (BankClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBankRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputBankBranch(BaseModel<?> oldModel) {
        BankBranchClp oldClpModel = (BankBranchClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBankBranchRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputBankServices(BaseModel<?> oldModel) {
        BankServicesClp oldClpModel = (BankServicesClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBankServicesRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputBizRuleConfig(BaseModel<?> oldModel) {
        BizRuleConfigClp oldClpModel = (BizRuleConfigClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBizRuleConfigRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputBusinessSrv(BaseModel<?> oldModel) {
        BusinessSrvClp oldClpModel = (BusinessSrvClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBusinessSrvRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputCardGroup(BaseModel<?> oldModel) {
        CardGroupClp oldClpModel = (CardGroupClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getCardGroupRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEPayAccessControl(BaseModel<?> oldModel) {
        EPayAccessControlClp oldClpModel = (EPayAccessControlClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEPayAccessControlRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputInRechargeHistory(BaseModel<?> oldModel) {
        InRechargeHistoryClp oldClpModel = (InRechargeHistoryClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getInRechargeHistoryRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputNotifConfig(BaseModel<?> oldModel) {
        NotifConfigClp oldClpModel = (NotifConfigClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getNotifConfigRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputNotifParam(BaseModel<?> oldModel) {
        NotifParamClp oldClpModel = (NotifParamClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getNotifParamRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputNotifParamSrv(BaseModel<?> oldModel) {
        NotifParamSrvClp oldClpModel = (NotifParamSrvClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getNotifParamSrvRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentChannel(BaseModel<?> oldModel) {
        PaymentChannelClp oldClpModel = (PaymentChannelClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentChannelRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentChannelSr(BaseModel<?> oldModel) {
        PaymentChannelSrClp oldClpModel = (PaymentChannelSrClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentChannelSrRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentChannelSrvsMap(
        BaseModel<?> oldModel) {
        PaymentChannelSrvsMapClp oldClpModel = (PaymentChannelSrvsMapClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentChannelSrvsMapRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentMethod(BaseModel<?> oldModel) {
        PaymentMethodClp oldClpModel = (PaymentMethodClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentMethodRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentMethodSrvsMap(
        BaseModel<?> oldModel) {
        PaymentMethodSrvsMapClp oldClpModel = (PaymentMethodSrvsMapClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentMethodSrvsMapRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentRule(BaseModel<?> oldModel) {
        PaymentRuleClp oldClpModel = (PaymentRuleClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentRuleRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentSystem(BaseModel<?> oldModel) {
        PaymentSystemClp oldClpModel = (PaymentSystemClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentSystemRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentTransactionDetails(
        BaseModel<?> oldModel) {
        PaymentTransactionDetailsClp oldClpModel = (PaymentTransactionDetailsClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentTransactionDetailsRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaymentTransactions(
        BaseModel<?> oldModel) {
        PaymentTransactionsClp oldClpModel = (PaymentTransactionsClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaymentTransactionsRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputReconLog(BaseModel<?> oldModel) {
        ReconLogClp oldClpModel = (ReconLogClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getReconLogRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRefundLog(BaseModel<?> oldModel) {
        RefundLogClp oldClpModel = (RefundLogClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRefundLogRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRefundReconLog(BaseModel<?> oldModel) {
        RefundReconLogClp oldClpModel = (RefundReconLogClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRefundReconLogRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSrvTypes(BaseModel<?> oldModel) {
        SrvTypesClp oldClpModel = (SrvTypesClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSrvTypesRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSrvTypeSrvsMap(BaseModel<?> oldModel) {
        SrvTypeSrvsMapClp oldClpModel = (SrvTypeSrvsMapClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSrvTypeSrvsMapRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSystemConfig(BaseModel<?> oldModel) {
        SystemConfigClp oldClpModel = (SystemConfigClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSystemConfigRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputTransactionStatus(BaseModel<?> oldModel) {
        TransactionStatusClp oldClpModel = (TransactionStatusClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getTransactionStatusRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.BankImpl")) {
            return translateOutputBank(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.BankBranchImpl")) {
            return translateOutputBankBranch(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.BankServicesImpl")) {
            return translateOutputBankServices(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.BizRuleConfigImpl")) {
            return translateOutputBizRuleConfig(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.BusinessSrvImpl")) {
            return translateOutputBusinessSrv(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.CardGroupImpl")) {
            return translateOutputCardGroup(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.EPayAccessControlImpl")) {
            return translateOutputEPayAccessControl(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.InRechargeHistoryImpl")) {
            return translateOutputInRechargeHistory(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.NotifConfigImpl")) {
            return translateOutputNotifConfig(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.NotifParamImpl")) {
            return translateOutputNotifParam(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.NotifParamSrvImpl")) {
            return translateOutputNotifParamSrv(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentChannelImpl")) {
            return translateOutputPaymentChannel(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentChannelSrImpl")) {
            return translateOutputPaymentChannelSr(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentChannelSrvsMapImpl")) {
            return translateOutputPaymentChannelSrvsMap(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentMethodImpl")) {
            return translateOutputPaymentMethod(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentMethodSrvsMapImpl")) {
            return translateOutputPaymentMethodSrvsMap(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentRuleImpl")) {
            return translateOutputPaymentRule(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentSystemImpl")) {
            return translateOutputPaymentSystem(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentTransactionDetailsImpl")) {
            return translateOutputPaymentTransactionDetails(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.PaymentTransactionsImpl")) {
            return translateOutputPaymentTransactions(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.ReconLogImpl")) {
            return translateOutputReconLog(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.RefundLogImpl")) {
            return translateOutputRefundLog(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.RefundReconLogImpl")) {
            return translateOutputRefundReconLog(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.SrvTypesImpl")) {
            return translateOutputSrvTypes(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.SrvTypeSrvsMapImpl")) {
            return translateOutputSrvTypeSrvsMap(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.SystemConfigImpl")) {
            return translateOutputSystemConfig(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.stc.echannels.epayments.model.impl.TransactionStatusImpl")) {
            return translateOutputTransactionStatus(oldModel);
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("com.stc.echannels.epayments.NoSuchBankException")) {
            return new com.stc.echannels.epayments.NoSuchBankException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchBankBranchException")) {
            return new com.stc.echannels.epayments.NoSuchBankBranchException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchBankServicesException")) {
            return new com.stc.echannels.epayments.NoSuchBankServicesException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchBizRuleConfigException")) {
            return new com.stc.echannels.epayments.NoSuchBizRuleConfigException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchBusinessSrvException")) {
            return new com.stc.echannels.epayments.NoSuchBusinessSrvException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchCardGroupException")) {
            return new com.stc.echannels.epayments.NoSuchCardGroupException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchEPayAccessControlException")) {
            return new com.stc.echannels.epayments.NoSuchEPayAccessControlException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchInRechargeHistoryException")) {
            return new com.stc.echannels.epayments.NoSuchInRechargeHistoryException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchNotifConfigException")) {
            return new com.stc.echannels.epayments.NoSuchNotifConfigException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchNotifParamException")) {
            return new com.stc.echannels.epayments.NoSuchNotifParamException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchNotifParamSrvException")) {
            return new com.stc.echannels.epayments.NoSuchNotifParamSrvException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentChannelException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentChannelException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentChannelSrException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentChannelSrException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentChannelSrvsMapException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentMethodException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentMethodException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentMethodSrvsMapException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentRuleException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentRuleException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentSystemException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentSystemException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentTransactionDetailsException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchPaymentTransactionsException")) {
            return new com.stc.echannels.epayments.NoSuchPaymentTransactionsException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchReconLogException")) {
            return new com.stc.echannels.epayments.NoSuchReconLogException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchRefundLogException")) {
            return new com.stc.echannels.epayments.NoSuchRefundLogException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchRefundReconLogException")) {
            return new com.stc.echannels.epayments.NoSuchRefundReconLogException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchSrvTypesException")) {
            return new com.stc.echannels.epayments.NoSuchSrvTypesException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException")) {
            return new com.stc.echannels.epayments.NoSuchSrvTypeSrvsMapException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchSystemConfigException")) {
            return new com.stc.echannels.epayments.NoSuchSystemConfigException();
        }

        if (className.equals(
                    "com.stc.echannels.epayments.NoSuchTransactionStatusException")) {
            return new com.stc.echannels.epayments.NoSuchTransactionStatusException();
        }

        return throwable;
    }

    public static Object translateOutputBank(BaseModel<?> oldModel) {
        BankClp newModel = new BankClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBankRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputBankBranch(BaseModel<?> oldModel) {
        BankBranchClp newModel = new BankBranchClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBankBranchRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputBankServices(BaseModel<?> oldModel) {
        BankServicesClp newModel = new BankServicesClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBankServicesRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputBizRuleConfig(BaseModel<?> oldModel) {
        BizRuleConfigClp newModel = new BizRuleConfigClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBizRuleConfigRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputBusinessSrv(BaseModel<?> oldModel) {
        BusinessSrvClp newModel = new BusinessSrvClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBusinessSrvRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputCardGroup(BaseModel<?> oldModel) {
        CardGroupClp newModel = new CardGroupClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setCardGroupRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEPayAccessControl(BaseModel<?> oldModel) {
        EPayAccessControlClp newModel = new EPayAccessControlClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEPayAccessControlRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputInRechargeHistory(BaseModel<?> oldModel) {
        InRechargeHistoryClp newModel = new InRechargeHistoryClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setInRechargeHistoryRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputNotifConfig(BaseModel<?> oldModel) {
        NotifConfigClp newModel = new NotifConfigClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setNotifConfigRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputNotifParam(BaseModel<?> oldModel) {
        NotifParamClp newModel = new NotifParamClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setNotifParamRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputNotifParamSrv(BaseModel<?> oldModel) {
        NotifParamSrvClp newModel = new NotifParamSrvClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setNotifParamSrvRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentChannel(BaseModel<?> oldModel) {
        PaymentChannelClp newModel = new PaymentChannelClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentChannelRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentChannelSr(BaseModel<?> oldModel) {
        PaymentChannelSrClp newModel = new PaymentChannelSrClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentChannelSrRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentChannelSrvsMap(
        BaseModel<?> oldModel) {
        PaymentChannelSrvsMapClp newModel = new PaymentChannelSrvsMapClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentChannelSrvsMapRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentMethod(BaseModel<?> oldModel) {
        PaymentMethodClp newModel = new PaymentMethodClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentMethodRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentMethodSrvsMap(
        BaseModel<?> oldModel) {
        PaymentMethodSrvsMapClp newModel = new PaymentMethodSrvsMapClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentMethodSrvsMapRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentRule(BaseModel<?> oldModel) {
        PaymentRuleClp newModel = new PaymentRuleClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentRuleRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentSystem(BaseModel<?> oldModel) {
        PaymentSystemClp newModel = new PaymentSystemClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentSystemRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentTransactionDetails(
        BaseModel<?> oldModel) {
        PaymentTransactionDetailsClp newModel = new PaymentTransactionDetailsClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentTransactionDetailsRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaymentTransactions(
        BaseModel<?> oldModel) {
        PaymentTransactionsClp newModel = new PaymentTransactionsClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaymentTransactionsRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputReconLog(BaseModel<?> oldModel) {
        ReconLogClp newModel = new ReconLogClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setReconLogRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRefundLog(BaseModel<?> oldModel) {
        RefundLogClp newModel = new RefundLogClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRefundLogRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRefundReconLog(BaseModel<?> oldModel) {
        RefundReconLogClp newModel = new RefundReconLogClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRefundReconLogRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSrvTypes(BaseModel<?> oldModel) {
        SrvTypesClp newModel = new SrvTypesClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSrvTypesRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSrvTypeSrvsMap(BaseModel<?> oldModel) {
        SrvTypeSrvsMapClp newModel = new SrvTypeSrvsMapClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSrvTypeSrvsMapRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSystemConfig(BaseModel<?> oldModel) {
        SystemConfigClp newModel = new SystemConfigClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSystemConfigRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputTransactionStatus(BaseModel<?> oldModel) {
        TransactionStatusClp newModel = new TransactionStatusClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setTransactionStatusRemoteModel(oldModel);

        return newModel;
    }
}
