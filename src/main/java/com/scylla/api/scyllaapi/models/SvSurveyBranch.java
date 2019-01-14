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
@Table(name = "sv_surveybranch")
public class SvSurveyBranch implements Serializable {

	/**
	 * 
	 */

	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_SURVEYBRANCH_SEQ")
	@SequenceGenerator(sequenceName = "SV_SURVEYBRANCH_SEQ", allocationSize = 1, name = "SV_SURVEYBRANCH_SEQ")
	private Long id;
	
	@Column(name = "SVSURVEYID", nullable = false, length = 10)
	private Long svSurveyId;
	
	@Column(name = "BRANCH_ID")
	private String branchId;

	@Column(name = "IDRKP", nullable = false, length = 10)
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

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public Long getIdRkp() {
		return idRkp;
	}

	public void setIdRkp(Long idRkp) {
		this.idRkp = idRkp;
	}

	

}
