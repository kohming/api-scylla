package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class AuditMasters implements Serializable {

	public List<SvCombo> combos = new ArrayList<SvCombo>();
	public List<SvSurveyTypeAns> surveyTypeAnswers = new ArrayList<SvSurveyTypeAns>();
	public List<SvMbl> surveyMobiles = new ArrayList<SvMbl>();
	public List<SvMblTypeOut> typeOutlets = new ArrayList<SvMblTypeOut>();
	public List<SvMblGroupOut> groupOutlets = new ArrayList<SvMblGroupOut>();
	public List<SvCombo> getCombos() {
		return combos;
	}
	public void setCombos(List<SvCombo> combos) {
		this.combos = combos;
	}
	public List<SvSurveyTypeAns> getSurveyTypeAnswers() {
		return surveyTypeAnswers;
	}
	public void setSurveyTypeAnswers(List<SvSurveyTypeAns> surveyTypeAnswers) {
		this.surveyTypeAnswers = surveyTypeAnswers;
	}
	public List<SvMbl> getSurveyMobiles() {
		return surveyMobiles;
	}
	public void setSurveyMobiles(List<SvMbl> surveyMobiles) {
		this.surveyMobiles = surveyMobiles;
	}
	public List<SvMblTypeOut> getTypeOutlets() {
		return typeOutlets;
	}
	public void setTypeOutlets(List<SvMblTypeOut> typeOutlets) {
		this.typeOutlets = typeOutlets;
	}
	public List<SvMblGroupOut> getGroupOutlets() {
		return groupOutlets;
	}
	public void setGroupOutlets(List<SvMblGroupOut> groupOutlets) {
		this.groupOutlets = groupOutlets;
	}
	
	
	
	
	
}
