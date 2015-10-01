package stc.com.echannels.util;

import com.stc.echannels.constants.PhoneNumberConstants;
import com.stc.echannels.exceptions.CwsIllegalFormatException;

public class eChannelsUtil {
	
	
	/**
	 * Takes formatted phone number and normalizes it to standard format (without leading zero).
	 * 
	 * @param formattedPhoneNumber phone number in format "+966 512 345 678" or "+966 1 234 5678"
	 * @return string in format "512345678"
	 * 
	 * @throws CwsIllegalFormatException if input String is incorrectly formatted.
	**/
	public static String normalizePhoneNumber(String formattedPhoneNumber) 
			throws CwsIllegalFormatException {
		if (formattedPhoneNumber.matches(PhoneNumberConstants.WITHOUT_LEADING_ZERO)) {
			return formattedPhoneNumber;
		}
		else if (formattedPhoneNumber.matches(PhoneNumberConstants.FORMATTED_JAWAL_REGEX) ||
			formattedPhoneNumber.matches(PhoneNumberConstants.FORMATTED_HATIF_REGEX)) {
			return formattedPhoneNumber.replaceAll("\\s", "").replaceAll("\\+?966", "");
		}
		else if (formattedPhoneNumber.matches(PhoneNumberConstants.WITH_LEADING_ZERO)) {
			return formattedPhoneNumber.substring(1);
		}
			
		throw new CwsIllegalFormatException("Phone number " + formattedPhoneNumber + " is incorrectly formatted");

	}

}
