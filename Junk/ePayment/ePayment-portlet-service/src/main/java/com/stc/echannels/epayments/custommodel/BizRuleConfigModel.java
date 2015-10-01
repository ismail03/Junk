package com.stc.echannels.epayments.custommodel;

import java.util.Date;

public class BizRuleConfigModel {

	private Long ruleId;
	private String ruleName;
	private String descriptionEN;
	private String descriptionAR;
	private String value;
	private Date effectiveTime;
	private String ruleCategory;
	private String status;
	private String serviceNameEN;
	private String serviceNameAR;

	private String customValue;
	private String channelType;
	private String paymentChannelNameAR;
	private String paymentChannelNameEN;
	private String paymentModuleNameEN;
	private String paymentModuleNameAR;
	
	
	public Long getRuleId() {
		return ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getDescriptionEN() {
		return descriptionEN;
	}

	public void setDescriptionEN(String ruleDescriptionEN) {
		this.descriptionEN = ruleDescriptionEN;
	}

	public String getDescriptionAR() {
		return descriptionAR;
	}

	public void setDescriptionAR(String ruleDescriptionAr) {
		this.descriptionAR = ruleDescriptionAr;
	}

	public Date getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getRuleCategory() {
		return ruleCategory;
	}

	public void setRuleCategory(String ruleCategory) {
		this.ruleCategory = ruleCategory;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCustomValue() {
		return customValue;
	}

	public void setCustomValue(String customValue) {
		this.customValue = customValue;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getPaymentChannelNameAR() {
		return paymentChannelNameAR;
	}

	public void setPaymentChannelNameAR(String paymentChannelNameAR) {
		this.paymentChannelNameAR = paymentChannelNameAR;
	}

	public String getPaymentChannelNameEN() {
		return paymentChannelNameEN;
	}

	public void setPaymentChannelNameEN(String paymentChannelNameEN) {
		this.paymentChannelNameEN = paymentChannelNameEN;
	}

	public String getPaymentModuleNameEN() {
		return paymentModuleNameEN;
	}

	public void setPaymentModuleNameEN(String paymentModuleNameEN) {
		this.paymentModuleNameEN = paymentModuleNameEN;
	}

	public String getPaymentModuleNameAR() {
		return paymentModuleNameAR;
	}

	public void setPaymentModuleNameAR(String paymentModuleNameAR) {
		this.paymentModuleNameAR = paymentModuleNameAR;
	}

}
