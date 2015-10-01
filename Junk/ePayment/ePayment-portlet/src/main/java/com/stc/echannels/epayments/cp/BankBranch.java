package com.stc.echannels.epayments.cp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.service.BankBranchLocalServiceUtil;
import com.stc.echannels.epayments.service.persistence.BankBranchPK;
import com.stc.echannels.exceptions.IntegrityViolationException;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class Banks
 */
public class BankBranch extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
			super.doView(renderRequest, renderResponse);
	}

	
	public void addBankBranch(ActionRequest request, ActionResponse response)
			throws IOException, PortletException {

		String bankId = ParamUtil.getString(request, "bankId");

		String stcBranchCode = ParamUtil.getString(request, "stcBranchCode");
		long channelId = ParamUtil.getLong(request, "channelId");

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					BankBranch.class.getName(), request);

			BankBranchLocalServiceUtil.addBankBranch(bankId, stcBranchCode,
					channelId, serviceContext);
		} catch (PortalException portalException) {

		} catch (SystemException systemException) {

		} catch (IntegrityViolationException ive) {
			SessionErrors.add(request, ive.getMessage());
			response.setRenderParameter("jspPage",
					"/html/bankbranch/add.jsp");

		}

	}
	
	public void deleteBankBranch(ActionRequest request, ActionResponse response)throws Exception {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(BankBranch.class.getName(), request);
		String transId = ParamUtil.getString(request, "transId");
		String stcBranchCode = ParamUtil.getString(request, "stcBranchCode");
		BankBranchPK branchPK = new BankBranchPK();
		branchPK.setStcBranchCode(stcBranchCode);
		BankBranchLocalServiceUtil.deleteBankBranch(transId,serviceContext);
		sendRedirect(request, response);
	}

}
