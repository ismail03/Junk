package com.ismail.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import javax.xml.parsers.SAXParser;
import javax.xml.rpc.ServiceException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import NET.webserviceX.www.CountryLocator;
import NET.webserviceX.www.CountrySoap;

import com.ismail.Helloworld;
import com.ismail.HelloworldService;
import com.ismail.HelloworldServiceLocator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import org.apache.log4j.Logger;
/**
 * Portlet implementation class RestCon
 */


public class RestCon extends MVCPortlet {
	private static Logger _log = Logger.getLogger(RestCon.class);

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		_log.info("consuming restfull web service created as Userinfo");
		

		String getURL = "http://localhost:8081/Restfulweb/rest/UserInfoService/name/ismail";

		HttpClient client = new DefaultHttpClient();

		HttpGet request = new HttpGet(getURL.trim());

		HttpResponse response = client.execute(request);

		StringBuffer countriesBuffer = new StringBuffer();

		BufferedReader brd = new BufferedReader(new InputStreamReader(response
				.getEntity().getContent()));

		String lines = "";
		while ((lines = brd.readLine()) != null) {
			countriesBuffer.append(lines);
			System.out.println(lines);
		}

		try {
			Document doc = SAXReaderUtil.read(countriesBuffer.toString());
			Node n = doc.selectSingleNode("/User/Name");

			System.out.println("text is" + n.getText());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(countriesBuffer)) {

			System.out.println(countriesBuffer.length());
		}

		else {
			System.out.println("string buffer is null");

		}

		getSoapservice();
		/* invokeSoapserviceTofindCountryservice(countryname); */

		List<String> countrieslist = invokeSoapserviceTofindCountryservice(
				null, "countries");
		renderRequest.setAttribute("countrieslist", countrieslist);
		super.doView(renderRequest, renderResponse);
	}

	public void getCurrencycode(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		System.out.println("in process action");

		String countryname = ParamUtil.getString(actionRequest, "countryname");
		invokeSoapserviceTofindCountryservice(countryname, "currency");

		System.out.println(countryname);

	}

	private static void getSoapservice() {
		// / consuming soap webservice created by me as SimpleSoapproject
		HelloworldServiceLocator locator = new HelloworldServiceLocator();

		try {
			URL u = new URL(
					"http://localhost:8081/SimpleSoapproject/services/Helloworld");
			Helloworld h = locator.getHelloworld(u);
			String s = h.sayHelloWorld("ismail");

			System.out.println("hiii this is soap api call result" + s);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static List<String> invokeSoapserviceTofindCountryservice(
			String countryname, String get) {
		// consuming external soap webservice provided by webservice.net

		List<String> li = new ArrayList<String>();
		CountryLocator locator = new CountryLocator();
 
		try {
			URL u = new URL("http://www.webservicex.net/country.asmx");
			CountrySoap h = locator.getcountrySoap(u);
			if (get.equals("currency")) {
				String currencyofcountryxml = h
						.getCurrencyByCountry(countryname);
				Document doc = SAXReaderUtil.read(currencyofcountryxml);
				Node n = doc.selectSingleNode("/NewDataSet/Table/Currency");
				System.out.println("The currency of " + countryname + " is"
						+ n.getText());
			} else if (get.equals("countries")) {
				String countriesxml = h.getCountries();
				/* System.out.println(countriesxml); */
				Document doc = SAXReaderUtil.read(countriesxml);
				List<Node> listofnodes = doc
						.selectNodes("/NewDataSet/Table/Name");
				System.out.println("size of nodes" + listofnodes.size());

				for (Node n1 : listofnodes) {

					li.add(n1.getText());
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
}
