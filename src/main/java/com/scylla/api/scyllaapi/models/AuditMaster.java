package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class AuditMaster implements Serializable {

	public List<SvCombo> combos = new ArrayList<SvCombo>();
	public List<SvGroup> groups = new ArrayList<SvGroup>();
	public List<SvSurveyBranch> surveyBranchs = new ArrayList<SvSurveyBranch>();
	public List<SvSurveyGroupOut> surveyGroupOuts = new ArrayList<SvSurveyGroupOut>();
	public List<SvSurveySubdist> surveySubdist = new ArrayList<SvSurveySubdist>();
	public List<SvSurveyTypeOut> surveyTypeOut = new ArrayList<SvSurveyTypeOut>();
	public List<SvSurveyTypeAns> surveyTypeAns = new ArrayList<SvSurveyTypeAns>();
	
	public List<SvCombo> getCombos() {
		return combos;
	}
	public void setCombos(List<SvCombo> combos) {
		this.combos = combos;
	}
	public List<SvGroup> getGroups() {
		return groups;
	}
	public void setGroups(List<SvGroup> groups) {
		this.groups = groups;
	}
	public List<SvSurveyBranch> getSurveyBranchs() {
		return surveyBranchs;
	}
	public void setSurveyBranchs(List<SvSurveyBranch> surveyBranchs) {
		this.surveyBranchs = surveyBranchs;
	}
	public List<SvSurveyGroupOut> getSurveyGroupOuts() {
		return surveyGroupOuts;
	}
	public void setSurveyGroupOuts(List<SvSurveyGroupOut> surveyGroupOuts) {
		this.surveyGroupOuts = surveyGroupOuts;
	}
	public List<SvSurveySubdist> getSurveySubdist() {
		return surveySubdist;
	}
	public void setSurveySubdist(List<SvSurveySubdist> surveySubdist) {
		this.surveySubdist = surveySubdist;
	}
	public List<SvSurveyTypeOut> getSurveyTypeOut() {
		return surveyTypeOut;
	}
	public void setSurveyTypeOut(List<SvSurveyTypeOut> surveyTypeOut) {
		this.surveyTypeOut = surveyTypeOut;
	}
	public List<SvSurveyTypeAns> getSurveyTypeAns() {
		return surveyTypeAns;
	}
	public void setSurveyTypeAns(List<SvSurveyTypeAns> surveyTypeAns) {
		this.surveyTypeAns = surveyTypeAns;
	}
	
	
	
	
	
}
