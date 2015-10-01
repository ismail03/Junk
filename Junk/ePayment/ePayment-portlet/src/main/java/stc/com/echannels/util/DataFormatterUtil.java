/**
 * 
 */

package stc.com.echannels.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class DataFormatterUtil {

	public static Date getEffectiveDate() {

		final Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		return calendar.getTime();
	}

	public static String getFormattedString(String string) {

		if (string == null || string.isEmpty()) {
			return "null";
		}
		else {
			return "'" + string + "'";
		}
	}

	public static Timestamp getTimeStamp(Date date) {

		if (date == null) {
			return null;
		}
		else {
			return new Timestamp(date.getTime());
		}
	}

}
