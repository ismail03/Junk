package com.liferay.practicle;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.model.DLFileShortcut;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.practicle.slayer.model.tops_user;
import com.liferay.practicle.slayer.service.tops_userLocalServiceUtil;

public class CustomRegistrationAction extends BaseStrutsPortletAction {

	public void processAction(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		long repositoryId = themeDisplay.getCompanyGroupId();

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFileShortcut.class.getName(), actionRequest);
		
		

		System.out.println("in process action");
		DLAppLocalServiceUtil.addFolder(themeDisplay.getUserId(), repositoryId,
				0, ParamUtil.getString(actionRequest, "screenName"),
				"contains orders placed by this user", serviceContext);
		tops_user topuser = tops_userLocalServiceUtil
				.createtops_user(CounterLocalServiceUtil
						.increment(tops_user.class.toString()));
		topuser.setFirstname(ParamUtil.getString(actionRequest, "firstName"));
		topuser.setLastName(ParamUtil.getString(actionRequest, "lastName"));
		topuser.setUserName(ParamUtil.getString(actionRequest, "screenName"));
		topuser.setEmail(ParamUtil.getString(actionRequest, "emailAddress"));
		topuser.setPassword(ParamUtil.getString(actionRequest, "password1"));
		topuser.setPhone(ParamUtil.getString(actionRequest, "phonenumber"));
		tops_userLocalServiceUtil.addtops_user(topuser);

		originalStrutsPortletAction.processAction(originalStrutsPortletAction,
				portletConfig, actionRequest, actionResponse);
	}

	public String render(StrutsPortletAction originalStrutsPortletAction,
			PortletConfig portletConfig, RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {

		return originalStrutsPortletAction.render(originalStrutsPortletAction,
				portletConfig, renderRequest, renderResponse);

	}
}
