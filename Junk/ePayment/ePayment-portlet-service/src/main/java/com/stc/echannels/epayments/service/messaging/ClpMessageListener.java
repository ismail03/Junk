package com.stc.echannels.epayments.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.stc.echannels.epayments.service.BankBranchLocalServiceUtil;
import com.stc.echannels.epayments.service.BankBranchServiceUtil;
import com.stc.echannels.epayments.service.BankLocalServiceUtil;
import com.stc.echannels.epayments.service.BankServiceUtil;
import com.stc.echannels.epayments.service.BankServicesLocalServiceUtil;
import com.stc.echannels.epayments.service.BankServicesServiceUtil;
import com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.BizRuleConfigServiceUtil;
import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;
import com.stc.echannels.epayments.service.BusinessSrvServiceUtil;
import com.stc.echannels.epayments.service.CardGroupLocalServiceUtil;
import com.stc.echannels.epayments.service.CardGroupServiceUtil;
import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.EPayAccessControlLocalServiceUtil;
import com.stc.echannels.epayments.service.EPayAccessControlServiceUtil;
import com.stc.echannels.epayments.service.InRechargeHistoryLocalServiceUtil;
import com.stc.echannels.epayments.service.InRechargeHistoryServiceUtil;
import com.stc.echannels.epayments.service.NotifConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.NotifConfigServiceUtil;
import com.stc.echannels.epayments.service.NotifParamLocalServiceUtil;
import com.stc.echannels.epayments.service.NotifParamServiceUtil;
import com.stc.echannels.epayments.service.NotifParamSrvLocalServiceUtil;
import com.stc.echannels.epayments.service.NotifParamSrvServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelSrLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelSrServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelSrvsMapLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentChannelSrvsMapServiceUtil;
import com.stc.echannels.epayments.service.PaymentMethodLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentMethodServiceUtil;
import com.stc.echannels.epayments.service.PaymentMethodSrvsMapLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentMethodSrvsMapServiceUtil;
import com.stc.echannels.epayments.service.PaymentRuleLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentRuleServiceUtil;
import com.stc.echannels.epayments.service.PaymentSystemLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentSystemServiceUtil;
import com.stc.echannels.epayments.service.PaymentTransactionDetailsLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentTransactionDetailsServiceUtil;
import com.stc.echannels.epayments.service.PaymentTransactionsLocalServiceUtil;
import com.stc.echannels.epayments.service.PaymentTransactionsServiceUtil;
import com.stc.echannels.epayments.service.ReconLogLocalServiceUtil;
import com.stc.echannels.epayments.service.ReconLogServiceUtil;
import com.stc.echannels.epayments.service.RefundLogLocalServiceUtil;
import com.stc.echannels.epayments.service.RefundLogServiceUtil;
import com.stc.echannels.epayments.service.RefundReconLogLocalServiceUtil;
import com.stc.echannels.epayments.service.RefundReconLogServiceUtil;
import com.stc.echannels.epayments.service.SrvTypeSrvsMapLocalServiceUtil;
import com.stc.echannels.epayments.service.SrvTypeSrvsMapServiceUtil;
import com.stc.echannels.epayments.service.SrvTypesLocalServiceUtil;
import com.stc.echannels.epayments.service.SrvTypesServiceUtil;
import com.stc.echannels.epayments.service.SystemConfigLocalServiceUtil;
import com.stc.echannels.epayments.service.SystemConfigServiceUtil;
import com.stc.echannels.epayments.service.TransactionStatusLocalServiceUtil;
import com.stc.echannels.epayments.service.TransactionStatusServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BankLocalServiceUtil.clearService();

            BankServiceUtil.clearService();
            BankBranchLocalServiceUtil.clearService();

            BankBranchServiceUtil.clearService();
            BankServicesLocalServiceUtil.clearService();

            BankServicesServiceUtil.clearService();
            BizRuleConfigLocalServiceUtil.clearService();

            BizRuleConfigServiceUtil.clearService();
            BusinessSrvLocalServiceUtil.clearService();

            BusinessSrvServiceUtil.clearService();
            CardGroupLocalServiceUtil.clearService();

            CardGroupServiceUtil.clearService();
            EPayAccessControlLocalServiceUtil.clearService();

            EPayAccessControlServiceUtil.clearService();
            InRechargeHistoryLocalServiceUtil.clearService();

            InRechargeHistoryServiceUtil.clearService();
            NotifConfigLocalServiceUtil.clearService();

            NotifConfigServiceUtil.clearService();
            NotifParamLocalServiceUtil.clearService();

            NotifParamServiceUtil.clearService();
            NotifParamSrvLocalServiceUtil.clearService();

            NotifParamSrvServiceUtil.clearService();
            PaymentChannelLocalServiceUtil.clearService();

            PaymentChannelServiceUtil.clearService();
            PaymentChannelSrLocalServiceUtil.clearService();

            PaymentChannelSrServiceUtil.clearService();
            PaymentChannelSrvsMapLocalServiceUtil.clearService();

            PaymentChannelSrvsMapServiceUtil.clearService();
            PaymentMethodLocalServiceUtil.clearService();

            PaymentMethodServiceUtil.clearService();
            PaymentMethodSrvsMapLocalServiceUtil.clearService();

            PaymentMethodSrvsMapServiceUtil.clearService();
            PaymentRuleLocalServiceUtil.clearService();

            PaymentRuleServiceUtil.clearService();
            PaymentSystemLocalServiceUtil.clearService();

            PaymentSystemServiceUtil.clearService();
            PaymentTransactionDetailsLocalServiceUtil.clearService();

            PaymentTransactionDetailsServiceUtil.clearService();
            PaymentTransactionsLocalServiceUtil.clearService();

            PaymentTransactionsServiceUtil.clearService();
            ReconLogLocalServiceUtil.clearService();

            ReconLogServiceUtil.clearService();
            RefundLogLocalServiceUtil.clearService();

            RefundLogServiceUtil.clearService();
            RefundReconLogLocalServiceUtil.clearService();

            RefundReconLogServiceUtil.clearService();
            SrvTypesLocalServiceUtil.clearService();

            SrvTypesServiceUtil.clearService();
            SrvTypeSrvsMapLocalServiceUtil.clearService();

            SrvTypeSrvsMapServiceUtil.clearService();
            SystemConfigLocalServiceUtil.clearService();

            SystemConfigServiceUtil.clearService();
            TransactionStatusLocalServiceUtil.clearService();

            TransactionStatusServiceUtil.clearService();
        }
    }
}
