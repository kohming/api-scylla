package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "sv_combo")
public class SvCombo implements Serializable {

	/**
	 */
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_COMBO_SEQ")
	@SequenceGenerator(sequenceName = "SV_COMBO_SEQ", allocationSize = 1, name = "SV_COMBO_SEQ")
	private Long id;

	@Column(name = "CMBCODE", nullable = true, length = 20)
	private String cmbCode;

	@Column(name = "CMBNAME", nullable = true, length = 20)
	private String cmbName;
	
	@Column(name = "FLAGTEXT")
	private String flagText;

	@JsonIgnore
	@Column(name = "CREATED_AT")
	private Date createdAt;

	@JsonIgnore
	@Column(name = "UPDATED_AT")
	private Date updatedAt;

	@Column(name = "USERID")
	private Long userCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCmbCode() {
		return cmbCode;
	}

	public void setCmbCode(String cmbCode) {
		this.cmbCode = cmbCode;
	}

	public String getCmbName() {
		return cmbName;
	}

	public void setCmbName(String cmbName) {
		this.cmbName = cmbName;
	}

	public String getFlagText() {
		return flagText;
	}

	public void setFlagText(String flagText) {
		this.flagText = flagText;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getUserCode() {
		return userCode;
	}

	public void setUserCode(Long userCode) {
		this.userCode = userCode;
	}


}
