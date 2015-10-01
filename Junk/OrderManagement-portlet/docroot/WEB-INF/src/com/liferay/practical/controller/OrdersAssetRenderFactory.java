package com.liferay.practical.controller;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;
import com.liferay.practical.model.Orders;
import com.liferay.practical.service.OrdersLocalServiceUtil;


public class OrdersAssetRenderFactory  extends BaseAssetRendererFactory {
	 public static final String TYPE = "Orders";
	    public static final String CLASS_NAME = Orders.class.getName();
	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub
		Orders	o = OrdersLocalServiceUtil.getOrders(classPK);
		return new OrdersAssetRenderer(o);
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return CLASS_NAME;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

}
