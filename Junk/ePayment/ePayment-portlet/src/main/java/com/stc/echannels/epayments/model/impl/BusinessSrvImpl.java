package com.stc.echannels.epayments.model.impl;

import java.util.Locale;

/**
 * The extended model implementation for the BusinessSrv service. Represents a row in the &quot;SERVICES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.stc.echannels.epayments.model.BusinessSrv} interface.
 * </p>
 *
 * @author ahmed_fadlus
 */
public class BusinessSrvImpl extends BusinessSrvBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a business srv model instance should use the {@link com.stc.echannels.epayments.model.BusinessSrv} interface instead.
     */
	
	public String getName(Locale locale)
	{
		return locale.getLanguage().equals("ar")?this.getServiceNameAr():this.getServiceNameEn();
	}
	
	public boolean isEpayAccessControlPresent() {
		return isEpayAccessControlPresent;
	}

	public void setEpayAccessControlPresent(boolean isEpayAccessControlPresent) {
		this.isEpayAccessControlPresent = isEpayAccessControlPresent;
	}

	private boolean isEpayAccessControlPresent;

    public BusinessSrvImpl() {
    }
}
