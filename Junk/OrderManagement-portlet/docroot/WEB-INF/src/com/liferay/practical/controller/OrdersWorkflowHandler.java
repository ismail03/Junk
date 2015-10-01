package com.liferay.practical.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.practical.model.Orders;
import com.liferay.practical.service.OrdersLocalServiceUtil;


public class OrdersWorkflowHandler extends BaseWorkflowHandler {
	  public static final String CLASS_NAME = Orders.class.getName();
	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return CLASS_NAME;
	}

	@Override
	public String getType(Locale locale) {
		// TODO Auto-generated method stub
		return "Orders";
	}

	@Override
	public Object updateStatus(int status, Map<String, Serializable> workflowContext)
			throws PortalException, SystemException {
		
		long userId = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
        long resourcePrimKey = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
		// TODO Auto-generated method stub
        Orders orders = OrdersLocalServiceUtil.getOrders(resourcePrimKey);
        orders.setOrderstatus(status);
        orders.setStatusByUserId(userId);
        orders.setStatusDate(new Date());
        orders=OrdersLocalServiceUtil.updateOrders(orders);
        if (status == WorkflowConstants.STATUS_APPROVED) {
            AssetEntryLocalServiceUtil.updateVisible(Orders.class.getName(),
                    resourcePrimKey, true);
        } else {
        	AssetEntryLocalServiceUtil.updateVisible(Orders.class.getName(),
                    resourcePrimKey, false);
        }
        return orders;
	}

}
