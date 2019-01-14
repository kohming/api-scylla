package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "sv_surveygroupout")
public class SvSurveyGroupOut implements Serializable {
	
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_SURVEYGROUPOUT_SEQ")
	@SequenceGenerator(sequenceName = "SV_SURVEYGROUPOUT_SEQ", allocationSize = 1, name = "SV_SURVEYGROUPOUT_SEQ")
	
	private Long id;
	
	@Column(name = "SVSURVEYID", nullable = false, length = 10)
	private Long svSurveyId;
	
	@Column(name = "OGRP_ID")
	private String orgpId;
	
	@Column(name = "IDRKP")
	private Long idRkp;
	
	@Column(name = "KODE_TYPE_GROUP_OUT")
	private String kodeTypeGroupOut;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSvSurveyId() {
		return svSurveyId;
	}

	public void setSvSurveyId(Long svSurveyId) {
		this.svSurveyId = svSurveyId;
	}

	public String getOrgpId() {
		return orgpId;
	}

	public void setOrgpId(String orgpId) {
		this.orgpId = orgpId;
	}

	public Long getIdRkp() {
		return idRkp;
	}

	public void setIdRkp(Long idRkp) {
		this.idRkp = idRkp;
	}

	public String getKodeTypeGroupOut() {
		return kodeTypeGroupOut;
	}

	public void setKodeTypeGroupOut(String kodeTypeGroupOut) {
		this.kodeTypeGroupOut = kodeTypeGroupOut;
	}

	

}
