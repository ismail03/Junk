package com.stc.echannels.epayments.cp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import stc.com.echannels.util.BanksUtil;
import stc.com.echannels.util.PaymentTransactionUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.BankBranch;
import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.model.BusinessSrv;
import com.stc.echannels.epayments.service.BankBranchLocalServiceUtil;
import com.stc.echannels.epayments.service.BankLocalServiceUtil;
import com.stc.echannels.epayments.service.BankServiceUtil;
import com.stc.echannels.epayments.service.BankServicesLocalServiceUtil;
import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;
import com.stc.echannels.epayments.service.impl.AuditUtil;
import com.stc.echannels.epayments.service.impl.BankServicesLocalServiceImpl;
import com.stc.echannels.epayments.service.persistence.BankBranchPK;
import com.stc.echannels.exceptions.IntegrityViolationException;
import com.liferay.util.portlet.PortletProps;

/**
 * Portlet implementation class Banks
 */
public class Banks extends MVCPortlet {


	private static Logger  _log = LoggerFactory.getLogger(Banks.class);
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					Bank.class.getName(), renderRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}

		super.doView(renderRequest, renderResponse);
	}

	public void addBank(ActionRequest request, ActionResponse response)
			throws IOException, PortletException {

		String bankId = ParamUtil.getString(request, "bankId");
		String stcCode = ParamUtil.getString(request, "stcCode");
		String nameAr = ParamUtil.getString(request, "nameAr");
		String nameEn = ParamUtil.getString(request, "nameEn");
		String businessServices[]=request.getParameterValues("businessSrvcheck");

		String comments = ParamUtil.getString(request, "comments");


		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					Bank.class.getName(), request);

			BankLocalServiceUtil.addBank(bankId+"", stcCode, nameAr, nameEn,
					comments, serviceContext);
			_log.info("Bank added into DB"+bankId);
			BanksUtil.addIntoBankServiceMap(bankId, BanksUtil.getBusinessService(businessServices));

			SessionMessages.add(request, "sucess-bank");

		} catch (PortalException portalException) {
			_log.info("Error occured while adding bank "+bankId);
		} catch (SystemException systemException) {
			_log.info("Error occured while adding bank "+bankId);
		} catch (IntegrityViolationException ive) {
			SessionErrors.add(request, ive.getMessage());
			response.setRenderParameter("jspPage", "/html/banks/edit_bank.jsp");
		}

	}


	public void updateBank(ActionRequest request, ActionResponse response)
	{
		String transId = ParamUtil.getString(request, "transId");
		try{

			_updateBank(request);
			SessionMessages.add(request, "sucess-bank");
		} catch (PortalException portalException) {
			_log.info("Error occured while Updating bank ");
		} catch (SystemException systemException) {
			_log.info("Error occured while Updating bank ");
		} catch (IntegrityViolationException ive) {
			response.setRenderParameter("transId", transId);
			SessionErrors.add(request, ive.getMessage());
			response.setRenderParameter("jspPage", "/html/banks/edit_bank.jsp");
		}


	}

	private Bank _updateBank(ActionRequest request) throws PortalException,
	SystemException {
		String transId = ParamUtil.getString(request, "transId");
		String bankId = ParamUtil.getString(request, "bankId");
		String stcCode = ParamUtil.getString(request, "stcCode");
		String nameAr = ParamUtil.getString(request, "nameAr");
		String nameEn = ParamUtil.getString(request, "nameEn");
		String comments = ParamUtil.getString(request, "comments");
		//// redesign
		String businessServices[]=request.getParameterValues("businessSrvcheck");


		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Bank.class.getName(), request);

		Bank bank = null;

		if (transId == null || transId.isEmpty()) {
			BankLocalServiceUtil.addBank(bankId, stcCode, nameAr, nameEn,
					comments, serviceContext);
			_log.info("bank details added into db "+bankId);
			BanksUtil.addIntoBankServiceMap(bankId, BanksUtil.getBusinessService(businessServices));
			_log.info("services addeded association table into db ");
		} else {

			bank = BankLocalServiceUtil.updateBank(transId, bankId, stcCode,
					nameAr, nameEn, comments, serviceContext);
			_log.info("bank details updated into db "+bankId);
			BanksUtil. _updateBankServices(BanksUtil.getBusinessService(businessServices),bankId);
			_log.info("services updated association table into db ");
		}

		return bank;
	}

	public void deleteBank(ActionRequest request, ActionResponse response)
			throws Exception {


		String transId = ParamUtil.getString(request, "transId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Bank.class.getName(), request);
		Bank b=	BankLocalServiceUtil.deleteBank(transId, serviceContext);
		if(Validator.isNotNull(b)){
			List<BankServices> bs =	BankServicesLocalServiceUtil.getBanksIDsAssociatedWithBankServices(b.getBankId());
			if(bs.size()>0)
			{
				String[] toBeDeletedServices = new String[bs.size()];
				int i=0;
				for(BankServices s:bs){
					toBeDeletedServices[i]=s.getServiceid()+"";
					i++;
				}
				BanksUtil.deleteFromBusinessServiceMap(b.getBankId()+"", toBeDeletedServices);
				_log.info("Bank deleted Successfully"+b.getBankId());
				SessionMessages.add(request, "sucess-bank");
			}else{

				_log.info("there is no service associated with Bank id"+b.getBankId());
			}
		}


	}

	public void serveResource(ResourceRequest request, ResourceResponse response) {
		//	System.out.println("in serve resourse");
		String	typevalidation =		ParamUtil.getString(request, "formtype");

		String bankid =	ParamUtil.getString(request, "bankid");

		String getBranches = ParamUtil.getString(request, "getBranches");

		String businessserviceid =	ParamUtil.getString(request, "bsrid");
		PortletRequestDispatcher dispatcher = null;


		try{
			if(Validator.isNotNull(typevalidation)){

				if(typevalidation.equals("bank")){

					//	System.out.println(typevalidation);
					boolean isexists = isfieldVaildBank(request);
					String res = StringPool.BLANK;
					if(isexists)
						res = "yes";
					else
						res = "no";
					JSONObject json = JSONFactoryUtil.createJSONObject();
					json.put("res", res);
					PrintWriter out=response.getWriter();
					// System.out.println(json.toString());
					out.println(json.toString());
				}else if(typevalidation.equals("bankBranch")){


					boolean isexists = isfieldVaildBank(request);
					String res = StringPool.BLANK;
					if(isexists)
						res = "yes";
					else
						res = "no";
					JSONObject json = JSONFactoryUtil.createJSONObject();
					json.put("res", res);
					PrintWriter out=response.getWriter();
					//	System.out.println(json.toString());
					out.println(json.toString());

				}




			}



			else	if(Validator.isNotNull(bankid) && !bankid.trim().equals("") && !bankid.equals("empty")){


				List<Bank> bank = new ArrayList<Bank>();


				for(Bank b:	BankLocalServiceUtil.getBanks()){

					if(b.getBankId().equalsIgnoreCase(bankid)){
						bank.add(b);
					}

				}
				List<BankBranch> filteredbranches = new ArrayList<BankBranch>();
				if(bank.size()>0){
					bank  =BanksUtil.getBankCheckedAgainstTrancation(bank);
					Bank bnk= bank.get(0);

					if(Validator.isNotNull(getBranches) && !getBranches.trim().equals("")&& getBranches.equals("yes") ){
						List<BankBranch>  branches = BankBranchLocalServiceUtil.getActiveBankBranchesByStatus(-1, -1);

						filteredbranches = BanksUtil.getBranchesOfBank(branches, bnk.getStcCode());
						filteredbranches = BanksUtil.getBankBranchCheckedAgainstTrancation(filteredbranches);

						request.setAttribute("branches", filteredbranches);

					}
				}



				//	String defaultBuisnessService= GetterUtil.getString(PortletProps.get("banks-business-service-not-available-msg"));
				String defaultBuisnessService="Not Available";
				request.setAttribute("buisnessService",   BanksUtil.getRegisteredBusinessSrv(bankid,defaultBuisnessService));
				dispatcher=getPortletContext().getRequestDispatcher("/html/banks/bank_branch.jsp");
				request.setAttribute("banklist", bank);
				dispatcher.include(request, response);
			}


			else	if(Validator.isNotNull(businessserviceid)&& !businessserviceid.trim().equals("") && !businessserviceid.equals("bsempty")){



				List<Bank> filteredBanks = getBanksByBusinessSrv(businessserviceid);

				filteredBanks = BanksUtil.getBankCheckedAgainstTrancation(filteredBanks);


				if(Validator.isNotNull(getBranches) && !getBranches.trim().equals("")&& getBranches.equals("yes")){

					String srv_bankid =	ParamUtil.getString(request, "srvbankid");
					List<Bank> bank = new ArrayList<Bank>();
					for(Bank b:	filteredBanks){

						if(b.getBankId().equalsIgnoreCase(srv_bankid)){
							bank.add(b);
						}

					}

					Bank bnk= bank.get(0);
					List<BankBranch> filteredbranches = new ArrayList<BankBranch>();

					List<BankBranch>  branches = BankBranchLocalServiceUtil.getActiveBankBranchesByStatus(-1, -1);

					filteredbranches = BanksUtil.getBranchesOfBank(branches, bnk.getStcCode());
					filteredbranches = BanksUtil.getBankBranchCheckedAgainstTrancation(filteredbranches);

					request.setAttribute("branches", filteredbranches);




				}

				dispatcher = getPortletContext().getRequestDispatcher("/html/banks/service_bank.jsp");
				request.setAttribute("banklist", filteredBanks);
				request.setAttribute("bsrid", businessserviceid);
				dispatcher.include(request, response);
			}



		}

		catch(SystemException e){}
		catch(PortletException e){}
		catch(IOException e){}

	}





	public void addBankBranch(ActionRequest request, ActionResponse response)
			throws IOException, PortletException {

		String bankId = ParamUtil.getString(request, "bankId");
		String transId = ParamUtil.getString(request,"transId");
		String stcBranchCode = ParamUtil.getString(request, "stcBranchCode");
		long channelId = ParamUtil.getLong(request, "channelId");

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					BankBranch.class.getName(), request);

			BankBranchLocalServiceUtil.addBankBranch(bankId, stcBranchCode,
					channelId, serviceContext);
			SessionMessages.add(request, "sucess-bank");

		} catch (PortalException portalException) {

		} catch (SystemException systemException) {

		} catch (IntegrityViolationException ive) {
			SessionErrors.add(request, ive.getMessage());
			response.setRenderParameter("transId", transId);
			response.setRenderParameter("bankId", bankId);
			response.setRenderParameter("jspPage",
					"/html/banks/add_branch.jsp");

		}

	}
	public void deleteBankBranch(ActionRequest request, ActionResponse response)throws Exception {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(BankBranch.class.getName(), request);
		String transId = ParamUtil.getString(request, "transId");
		String stcBranchCode = ParamUtil.getString(request, "stcBranchCode");
		BankBranchPK branchPK = new BankBranchPK();
		branchPK.setStcBranchCode(stcBranchCode);
		BankBranchLocalServiceUtil.deleteBankBranch(transId,serviceContext);
		SessionMessages.add(request, "sucess-bank");

	}

	private List<Bank> getBanksByBusinessSrv(String bsvrid) throws SystemException{
		List<Bank> banks = BankLocalServiceUtil.getBanks(AuditUtil.STATUS_ACTIVE, -1, -1);

		List<Bank> filteredBanks = new ArrayList<Bank>();
		List<BankServices> banksservices =BankServicesLocalServiceUtil.getBanksAssociatedWithBankServices(bsvrid);

		if(banksservices != null && banksservices.size()>0){



			List<String> bankId = new ArrayList<String>();
			for(BankServices b:banksservices){
				bankId.add(b.getBankid());

			}

			for(String ids:bankId){
				label1:
					for(Bank b :banks){
						if(b.getBankId().equalsIgnoreCase(ids))
						{
							filteredBanks.add(b);
							break label1;
						}
					}
			}
		}

		return	filteredBanks;
	}

	private boolean isfieldVaildBank(ResourceRequest req) throws SystemException{
		String fieldName= ParamUtil.getString(req, "fieldName");
		String fieldvalue= ParamUtil.getString(req, "fieldvalue");
		if(Validator.isNotNull(fieldName) &&  !fieldName.equals("fempty") && Validator.isNotNull(fieldvalue) && !fieldvalue.equals("fvempty")){
			//	System.out.println("fieldName"+fieldName);
			//	System.out.println("fieldvalue"+fieldvalue);
			if(fieldName.equals("samabankcode")){
				return	BankLocalServiceUtil.isSamaBankCodeExists(fieldvalue);

			}else if(fieldName.equals("stcbankcode")){
				return	BankLocalServiceUtil.isStcBankCodeExists(fieldvalue);
			}else if(fieldName.equals("nameAr")){
				String transId=	ParamUtil.getString(req, "transid");
				return BankLocalServiceUtil.isArnameExists(fieldvalue, transId);

			}else if(fieldName.equals("nameEn")){
				String transId=	ParamUtil.getString(req, "transid");
				return BankLocalServiceUtil.isEnnameExists(fieldvalue, transId);
			}else if(fieldName.equals("stcbranchcode")){
				System.out.println("VALUE"+fieldvalue);
				return BankBranchLocalServiceUtil.isStcBranchCodeExists(fieldvalue);
			}else if(fieldName.equals("pmtchnlid")){

				String bankId =	ParamUtil.getString(req, "bnkid");

				return	BankBranchLocalServiceUtil.isBankandPaymentChannelExists(bankId,GetterUtil.getLong(fieldvalue));
			}



		}

		return false;
	}
}