package com.liferay.practical.controller;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.asset.model.BaseAssetRenderer;
import com.liferay.practical.model.Orders;

public class OrdersAssetRenderer extends BaseAssetRenderer{

	private Orders orders;
	
	public OrdersAssetRenderer(Orders o) {
		// TODO Auto-generated constructor stub
		orders=o;
	}
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getClassPK() {
		// TODO Auto-generated method stub
		return orders.getOrderid();
	}

	@Override
	public long getGroupId() {
		// TODO Auto-generated method stub
		return orders.getGroupId();
	}

	@Override
	public String getSummary(Locale arg0) {
		// TODO Auto-generated method stub
		return orders.getProductname();
	}

	@Override
	public String getTitle(Locale arg0) {
		// TODO Auto-generated method stub
		return orders.getProductname();
	}

	@Override
	public long getUserId() {
		// TODO Auto-generated method stub
		return orders.getUserId();
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		String userName=null;
        try {
        	
        	userName= UserLocalServiceUtil.getUser(orders.getUserId()).getFullName();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return userName;
		}
        return userName;
	}

	@Override
	public String getUuid() {
		// TODO Auto-generated method stub
		try {
			return orders.getUserUuid();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String render(RenderRequest request, RenderResponse response, String template)
			throws Exception {
		// TODO Auto-generated method stub
		 if (template.equals(TEMPLATE_FULL_CONTENT)) {
	        	System.out.println("=====temaple full content====");
	        	request.setAttribute("ordersObject",orders);
	            return "/html/ordermanagementaction/view_order.jsp";
	        }
	        else
	        {
	            return null;
	        }
	}

}
