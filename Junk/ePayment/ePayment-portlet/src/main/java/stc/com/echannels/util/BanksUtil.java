package stc.com.echannels.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.BankBranch;
import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.model.BusinessSrv;
import com.stc.echannels.epayments.service.BankServicesLocalServiceUtil;
import com.stc.echannels.epayments.service.BusinessSrvLocalServiceUtil;

public class BanksUtil {
	private static Logger _log = Logger.getLogger("BankUtil.class");

	public static String[] getBusinessService(String[] businessServices) {
		String tempjobcategory = StringPool.BLANK;

		for (int i = 1; i < businessServices.length; i++) {
			if (businessServices[i].equalsIgnoreCase("true")) {

				tempjobcategory = tempjobcategory + 1 + "0" + (i)
						+ StringPool.COMMA;
			}
		}
		_log.info("Selected Business service-> Ids " + tempjobcategory);
		String serviceIds[] = tempjobcategory.split(StringPool.COMMA);
		return serviceIds;
	}

	public static void addIntoBankServiceMap(String bankid, String[] serviceid)
			throws PortalException, SystemException {
		String newTransId = StringPool.BLANK;
		BankServices bsr = null;
		for (String srvid : serviceid) {
			newTransId = (UUID.randomUUID()).toString();
			bsr = BankServicesLocalServiceUtil.createBankServices(newTransId);
			bsr.setBankid(bankid.toUpperCase());
			bsr.setServiceid(GetterUtil.getLong(srvid));
			BankServicesLocalServiceUtil.addBankServices(bsr);

		}

	}

	public static void _updateBankServices(String[] serviceids, String bankid)
			throws PortalException, SystemException {
		List<BankServices> banksidWithService = BankServicesLocalServiceUtil
				.getBanksIDsAssociatedWithBankServices(bankid);
		// _log.info(banksidWithService.size()+"size to existing buiseness service");

		String[] existing = new String[banksidWithService.size()];
		// get ids from bean objects
		int j = 0;
		for (BankServices s : banksidWithService) {
			existing[j] = String.valueOf(s.getServiceid());
			j++;

		}


		Set<String> a = new HashSet<String>();
		Set<String> b = new HashSet<String>();

		a.addAll(Arrays.asList(existing));
		b.addAll(Arrays.asList(serviceids));
		ArrayList<String> whicharePresentonlyinsetb = new ArrayList<String>();
		String toBeAdded = StringPool.BLANK;
		String toBeDeleted = StringPool.BLANK;
		for (String s : serviceids) {
			if (a.contains(s)) {
				// _log.info("");
			} else {
				// _log.info("unique in newly selected"+s);

				toBeAdded = toBeAdded + s + StringPool.COMMA;
			}

		}

		for (String s : existing) {
			if (b.contains(s)) {

			} else {
				toBeDeleted = toBeDeleted + s + StringPool.COMMA;


			}

		}

		String[] toAddedDispatch = toBeAdded.split(StringPool.COMMA);

		if (toAddedDispatch.length > 0) {

			if (toAddedDispatch.length == 1 && toBeAdded.trim().equals("")) {


			} else {

				addIntoBankServiceMap(bankid, toAddedDispatch);
			}
		}
		String[] toDeleteDispatch = toBeDeleted.split(StringPool.COMMA);
		if (toDeleteDispatch.length > 0) {

			if (toDeleteDispatch.length == 1 && toBeDeleted.trim().equals("")) {
				// _log.info("no selected Business Service to Delete");
			} else {
				// _log.info("dispatching to delete method"+toBeDeleted+toDeleteDispatch.length);
				deleteFromBusinessServiceMap(bankid, toDeleteDispatch);
			}
		}

	}

	public static void deleteFromBusinessServiceMap(String bankid,
			String[] serviceids) throws PortalException, SystemException {
		if (serviceids.length > 0) {
			// _log.info(serviceids.length+" size of records to be deleted");

			List<BankServices> all = BankServicesLocalServiceUtil
					.getBankServiceses(-1, -1);
			List<String> ser = new ArrayList<String>(Arrays.asList(serviceids));
			for (BankServices b : all) {
				if ((b.getBankid()).equalsIgnoreCase(bankid)
						&& (ser.contains(String.valueOf(b.getServiceid())))) {
					BankServicesLocalServiceUtil.deleteBankServices(b);
					// _log.info("deleted"+b.getBankid());
				}

			}

		} else {

			_log.info("there is no services to be deleted");
		}
	}
	public static List<Bank> getBankCheckedAgainstTrancation(List<Bank> bank) throws  SystemException{

		List<Object> transactionPmtBankIds = PaymentTransactionUtil.getTransactionsRecordedProjections("pmtBankId");
		if(transactionPmtBankIds != null){
			for(Object o : transactionPmtBankIds){
				if(o!=null){
					String transactionPmtBankId = (String)o;
					for(Bank bank1: bank){
						if(transactionPmtBankId.equals(bank1.getBankId())){
							bank1.setPaymentTransactionRecorded(true);
						}
					}
				}
			}
		}

		return bank;
	}
	public static List<BankBranch> getBankBranchCheckedAgainstTrancation(List<BankBranch> branches)throws SystemException{

		List<Object> transactionPmtBankIds1 = PaymentTransactionUtil.getTransactionsRecordedProjections("pmtBranchId");
		if(transactionPmtBankIds1 != null){
			for(Object o : transactionPmtBankIds1){
				if(o!=null){
					String transactionPmtBankId = (String)o;
					for(BankBranch bankBranch: branches){
						if(transactionPmtBankId.equals(bankBranch.getStcBranchCode())){
							bankBranch.setPaymentTransactionRecorded(true);
						}
					}
				}
			}

		}
		return branches;
	}
	public static List<BankBranch> getBranchesOfBank(List<BankBranch> branches,String bnkstccode){
		List<BankBranch> filteredbranches = new ArrayList<BankBranch>();
		for(BankBranch bb:branches ){


			if(Validator.isNotNull(bb.getStcBankCode())&& !bb.getStcBankCode().trim().equals("") && bb.getStcBankCode().equalsIgnoreCase(bnkstccode)){
				filteredbranches.add(bb);
			}
		}
		return filteredbranches;
	}
	public static String getRegisteredBusinessSrv(String bankid,String registeredBuisnessService) throws SystemException{
		List<Long> existingBrs = new ArrayList<Long>();

		List<BankServices> bsr = BankServicesLocalServiceUtil.getBanksIDsAssociatedWithBankServices(bankid);


		for(BankServices s:bsr){
			existingBrs.add(s.getServiceid());
		}


		if(existingBrs.size()>0){
			registeredBuisnessService=StringPool.BLANK;
			List<BusinessSrv> businessServices = BusinessSrvLocalServiceUtil.getBusinessServices();
			for (BusinessSrv businessService : businessServices) {

				if(existingBrs.contains(businessService.getServiceId())) {
					registeredBuisnessService=	registeredBuisnessService+	businessService.getServiceNameEn()+StringPool.COLON;

				}
			}

		}
		return registeredBuisnessService;
	}

}
