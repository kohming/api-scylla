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

@SuppressWarnings("serial")
@Entity
@Table(name = "sv_survey")
public class SvSurvey implements Serializable {

	/**
	 * "" NUMBER NOT NULL ENABLE, 
	"" DATE, 
	"" DATE, 
	"" VARCHAR2(1 BYTE), 
	"" VARCHAR2(1 BYTE), 
	"" VARCHAR2(1 BYTE), 
	"" VARCHAR2(1 BYTE), 
	"" DATE, 
	"" DATE, 
	"" NUMBER, 
	"" VARCHAR2(255 CHAR), 
	"" VARCHAR2(250 CHAR), 
	"TYPEANSWER" NUMBER(10,0), 
	"CMBID" VARCHAR2(255 CHAR), 
	"QUESTEXT" VARCHAR2(255 CHAR), 
	 */

	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_SURVEY_SEQ")
	@SequenceGenerator(sequenceName = "SV_SURVEY_SEQ", allocationSize = 1, name = "SV_SURVEY_SEQ")
	private Long id;
	
	@Column(name = "GROUPID", nullable = false, length = 10)
	private Long groupId;
	
	@Column(name = "DATESTART")
	private Date dateStart;
	
	@Column(name = "DATEEND")
	private Date dateEnd;
	
	
	@Column(name = "FLAGAREA")
	private String flagArea;
	
	
	@Column(name = "FLAGDISTRI")
	private String flagDistri;
	
	@Column(name = "FLAGTO")
	private String flagTo;
	
	@Column(name = "FLAGGO")
	private String flagGo;
	
	
	@Column(name = "CREATED_AT")
	private Date createdAt;
	
	@Column(name = "UPDATED_AT")
	private Date updatedAt;
	
	@Column(name = "USERID")
	private Long userId;
	
	@Column(name = "QUESTIONID")
	private String questionId;
	
	@Column(name = "QUESTIONDESC")
	private String questionDesc;
	
	@Column(name = "TYPEANSWER")
	private Long typeAnswer;
	
	@Column(name = "CMBID")
	private String cmbId;
	
	@Column(name = "QUESTEXT")
	private String quesText;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getFlagDistri() {
		return flagDistri;
	}

	public void setFlagDistri(String flagDistri) {
		this.flagDistri = flagDistri;
	}

	public String getFlagTo() {
		return flagTo;
	}

	public void setFlagTo(String flagTo) {
		this.flagTo = flagTo;
	}

	public String getFlagGo() {
		return flagGo;
	}

	public void setFlagGo(String flagGo) {
		this.flagGo = flagGo;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestionDesc() {
		return questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	public Long getTypeAnswer() {
		return typeAnswer;
	}

	public void setTypeAnswer(Long typeAnswer) {
		this.typeAnswer = typeAnswer;
	}

	public String getCmbId() {
		return cmbId;
	}

	public void setCmbId(String cmbId) {
		this.cmbId = cmbId;
	}

	public String getQuesText() {
		return quesText;
	}

	public void setQuesText(String quesText) {
		this.quesText = quesText;
	}
	
	

}
