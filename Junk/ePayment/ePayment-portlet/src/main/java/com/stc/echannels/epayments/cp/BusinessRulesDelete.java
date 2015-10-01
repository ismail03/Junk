package com.stc.echannels.epayments.cp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.service.BizRuleConfigLocalServiceUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class BusinessRulesDelete extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		super.doView(renderRequest, renderResponse);
	}

	public void deleteBizRules(ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException, SystemException, PortalException {

		long records[] = ParamUtil.getLongValues(actionRequest, "deleteItemIds");
		long serviceTypeId = ParamUtil.getLong(actionRequest, "serviceTypeId");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(BusinessRulesDelete.class.getName(), actionRequest);
		BizRuleConfigLocalServiceUtil.updateBizRuleConfigToInActive(records,serviceContext);
	}

}
