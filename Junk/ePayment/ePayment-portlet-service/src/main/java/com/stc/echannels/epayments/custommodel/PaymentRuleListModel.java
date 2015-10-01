package com.stc.echannels.epayments.custommodel;

import java.util.Date;

public class PaymentRuleListModel {
	
	//RULE_ID,TRANS_ID, RULE_NAME, DESCRIPTION_EN, DESCRIPTION_AR, RULE_CATEGORY, VALUE
	private Long ruleId;
	private String transId;
	private String ruleName;
	private String descriptionEN;
	private String descriptionAR;
	private String ruleCategory;
	private String defaultValue;
	private String newValue;
	private Date effectiveDate;
	
	public Long getRuleId() {
		return ruleId;
	}
	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
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
	public void setDescriptionEN(String descriptionEN) {
		this.descriptionEN = descriptionEN;
	}
	public String getDescriptionAR() {
		return descriptionAR;
	}
	public void setDescriptionAR(String descriptionAR) {
		this.descriptionAR = descriptionAR;
	}
	public String getRuleCategory() {
		return ruleCategory;
	}
	public void setRuleCategory(String ruleCategory) {
		this.ruleCategory = ruleCategory;
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
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
}
