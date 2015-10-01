package com.stc.echannels.epayments.custommodel;

public class BizRuleCustomValueConfigModel {

	private String id;
	private String serviceNameEN;
	private String serviceNameAR;
	private String paymentChannelNameEN;
	private String paymentChannelNameAR;
	private String paymentMethodNameEN;
	private String paymentMethodNameAR;
	private String defaultValue;
	private String newValue;
	
		
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getServiceNameEN() {
		return serviceNameEN;
	}

	public void setServiceNameEN(String serviceNameEN) {
		this.serviceNameEN = serviceNameEN;
	}

	public String getServiceNameAR() {
		return serviceNameAR;
	}

	public void setServiceNameAR(String serviceNameAR) {
		this.serviceNameAR = serviceNameAR;
	}

	public String getPaymentChannelNameEN() {
		return paymentChannelNameEN;
	}

	public void setPaymentChannelNameEN(String paymentChannelNameEN) {
		this.paymentChannelNameEN = paymentChannelNameEN;
	}

	public String getPaymentChannelNameAR() {
		return paymentChannelNameAR;
	}

	public void setPaymentChannelNameAR(String paymentChannelNameAR) {
		this.paymentChannelNameAR = paymentChannelNameAR;
	}

	public String getPaymentMethodNameEN() {
		return paymentMethodNameEN;
	}

	public void setPaymentMethodNameEN(String paymentMethodNameEN) {
		this.paymentMethodNameEN = paymentMethodNameEN;
	}

	public String getPaymentMethodNameAR() {
		return paymentMethodNameAR;
	}

	public void setPaymentMethodNameAR(String paymentMethodNameAR) {
		this.paymentMethodNameAR = paymentMethodNameAR;
	}

	public String getDefaultValue() {
		return defaultValue;
	}
	
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	public String getNewValue() {
		return newValue;
	}
	
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	@Override
	public String toString() {
		return "BizRuleCustomValueConfigModel [id=" + id + ", serviceNameEN=" + serviceNameEN + ", serviceNameAR=" + serviceNameAR
				+ ", paymentChannelNameEN=" + paymentChannelNameEN + ", paymentChannelNameAR=" + paymentChannelNameAR
				+ ", paymentMethodNameEN=" + paymentMethodNameEN + ", paymentMethodNameAR=" + paymentMethodNameAR + ", defaultValue="
				+ defaultValue + ", newValue=" + newValue + "]";
	}	
	
	
}
