package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Subselect;

@SuppressWarnings("serial")
@Entity
@Subselect("select a.id as ID,a.svsurveyid AS SVSURVEYID,A.OGRP_ID as OGRP_ID  from SV_SURVEYGROUPOUT a, (select distinct svsurveyid from sv_mbl) b where a.svsurveyid=b.svsurveyid")
public class SvMblGroupOut implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ID")
	private Long id;

	@Column(name = "SVSURVEYID")
	private String surveyId;
	
	@Column(name = "OGRP_ID")
	private String orgpId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(String surveyId) {
		this.surveyId = surveyId;
	}

	public String getOrgpId() {
		return orgpId;
	}

	public void setOrgpId(String orgpId) {
		this.orgpId = orgpId;
	}

	
	
}
