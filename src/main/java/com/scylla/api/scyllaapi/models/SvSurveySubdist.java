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
@Table(name = "sv_surveysubdist")
public class SvSurveySubdist implements Serializable {
	
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_SURVEYSUBDIST_SEQ")
	@SequenceGenerator(sequenceName = "SV_SURVEYSUBDIST_SEQ", allocationSize = 1, name = "SV_SURVEYSUBDIST_SEQ")
	
	private Long id;
	
	@Column(name = "SVSURVEYID")
	private Long svSurveyId;
	
	@Column(name = "SUBDIST_ID")
	private String subdistId;
	
	@Column(name = "IDRKP")
	private Long idRkp;

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

	public String getSubdistId() {
		return subdistId;
	}

	public void setSubdistId(String subdistId) {
		this.subdistId = subdistId;
	}

	public Long getIdRkp() {
		return idRkp;
	}

	public void setIdRkp(Long idRkp) {
		this.idRkp = idRkp;
	}

	


}
