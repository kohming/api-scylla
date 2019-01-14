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
@Table(name = "sv_surveytypeout")
public class SvSurveyTypeOut implements Serializable {
	
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_SURVEYTYPEOUT_SEQ")
	@SequenceGenerator(sequenceName = "SV_SURVEYTYPEOUT_SEQ", allocationSize = 1, name = "SV_SURVEYTYPEOUT_SEQ")
	private Long id;
	
	
	@Column(name = "SVSURVEYID")
	private Long svSurveyId;
	
	@Column(name = "OTYPE_ID")
	private String oTypeId;
	
	@Column(name = "IDRKP", nullable = false, length = 10)
	private Long idrkp;
	
	@Column(name = "KODE_TYPE_OUT")
	private String kodeTypeOut;

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

	public String getoTypeId() {
		return oTypeId;
	}

	public void setoTypeId(String oTypeId) {
		this.oTypeId = oTypeId;
	}

	public Long getIdrkp() {
		return idrkp;
	}

	public void setIdrkp(Long idrkp) {
		this.idrkp = idrkp;
	}

	public String getKodeTypeOut() {
		return kodeTypeOut;
	}

	public void setKodeTypeOut(String kodeTypeOut) {
		this.kodeTypeOut = kodeTypeOut;
	}

	
}
