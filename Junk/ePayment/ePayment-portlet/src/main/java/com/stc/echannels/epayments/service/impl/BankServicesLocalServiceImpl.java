package com.stc.echannels.epayments.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.stc.echannels.epayments.model.Bank;
import com.stc.echannels.epayments.model.BankServices;
import com.stc.echannels.epayments.service.BankLocalServiceUtil;

import com.stc.echannels.epayments.service.base.BankServicesLocalServiceBaseImpl;

/**
 * The implementation of the bank services local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.service.BankServicesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ahmed_fadlus
 * @see com.stc.echannels.epayments.service.base.BankServicesLocalServiceBaseImpl
 * @see com.stc.echannels.epayments.service.BankServicesLocalServiceUtil
 */
public class BankServicesLocalServiceImpl
    extends BankServicesLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.stc.echannels.epayments.service.BankServicesLocalServiceUtil} to access the bank services local service.
     */
	
	public List<BankServices> getBanksAssociatedWithBankServices(String servceid) throws SystemException
	{
		
		return bankServicesPersistence.findByserviceid(GetterUtil.getLong(servceid));
	}
	
	public List<BankServices> getBanksIDsAssociatedWithBankServices(String bankid) throws SystemException
	{
		
		return bankServicesPersistence.findBybankid(bankid);
	}
	/*public List<Bank> getActiveBanksandAssociatedWithService(String serviceid) throws SystemException{
		List<Bank> banks;
		List<Bank>  filteredBanks = new ArrayList<Bank>();
	
			banks = BankLocalServiceUtil.getBanks("ACTIVE", -1, -1);
			
			List<BankServices> banksservices =getBanksAssociatedWithBankServices(serviceid);
			if(banksservices != null && banksservices.size()>0){
						


								List<String> bankid= new ArrayList<String>();
									for(BankServices b:banksservices){
												bankid.add(b.getBankid());

											}
									
									for(String ids:bankid){
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


			
		
		return filteredBanks ;
		
	}
*/}
