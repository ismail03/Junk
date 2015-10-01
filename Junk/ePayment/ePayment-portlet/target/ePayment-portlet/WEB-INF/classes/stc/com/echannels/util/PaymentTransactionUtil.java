/**
 *
 */
package stc.com.echannels.util;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.stc.echannels.epayments.model.PaymentTransactions;
import com.stc.echannels.epayments.service.ClpSerializer;
import com.stc.echannels.epayments.service.PaymentTransactionsLocalServiceUtil;

import java.util.List;

/**
 * @author arpit
 *
 */
public class PaymentTransactionUtil {
	static Log log = LogFactoryUtil.getLog(PaymentTransactionUtil.class);

	public static String[] splitString(String baseString){
		return baseString.split(":");
	}
	public static List<Object> getTransactionsRecordedProjections( String projection)throws SystemException {
		ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(), "portletClassLoader");
		DynamicQuery dq0 = DynamicQueryFactoryUtil.forClass(PaymentTransactions.class, "paymentTransactions",classLoader);
		dq0.setProjection(ProjectionFactoryUtil.distinct(ProjectionFactoryUtil.property(projection)));
		@SuppressWarnings("unchecked")
		List<Object>  distinctProjections = PaymentTransactionsLocalServiceUtil.dynamicQuery(dq0);
		//	log.info("objects"+distinctProjections.toString());
		return distinctProjections;
	}






}
