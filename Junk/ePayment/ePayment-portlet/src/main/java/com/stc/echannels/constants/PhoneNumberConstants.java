package com.stc.echannels.constants;

/**
 * Class to hold constants related to telephone numbers.
 *
 * @author hwhitmore
 */


public class PhoneNumberConstants {

	/* Telephone number formatting */
	public final static String FORMATTED_JAWAL_REGEX = "^\\+?966\\s?(5\\d{2})\\s?(\\d{3})\\s?(\\d{3})$";
	public final static String FORMATTED_HATIF_REGEX = "^\\+?966\\s?1([1234567])\\s?(\\d{3})\\s?(\\d{4})$";

	public final static String NORMALIZED_JAWAL_REGEX = "^(0?)5\\d{8}$";
	public final static String NORMALIZED_HATIF_REGEX = "^(0?)1[1234567]\\d{8}$";
	
	public final static String WITH_LEADING_ZERO = "^0\\d{8,9}$";
	public final static String WITHOUT_LEADING_ZERO = "^[123456789]\\d{8,9}$";
}
