package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "sv_question")
@SuppressWarnings("serial")
public class SvQuestion implements Serializable {
	

	/*
	"CREATED_AT" DATE, 
	"UPDATED_AT" DATE, 
	"USERID" VARCHAR2(50 BYTE), 
	 */
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_QUESTION_SEQ")
	@SequenceGenerator(sequenceName = "SV_QUESTION_SEQ", allocationSize = 1, name = "SV_QUESTION_SEQ")
	private Long id;

	@Column(name = "GROUPID")
	private Long groupId;

	@Column(name = "QUESTIONCODE")
	private String questionCode;

	@Column(name = "QUESTIONDESC")
	private String questionDesc;

	@Column(name = "TYPEANSWERID")
	private int typeAnswerId;

	@Column(name = "CMBID")
	private Long cmbId;

	@Column(name = "QUESTEXT")
	private Long questext;

	@Column(name = "QUESIMG")
	private String quesimg;

	@Column(name = "CREATED_AT")
	private Date createdAt;

	@Column(name = "UPDATED_AT")
	private Date updatedAt;

	@Column(name = "USERID")
	private String userCode;
	

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

	public String getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

	public String getQuestionDesc() {
		return questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	public int getTypeAnswerId() {
		return typeAnswerId;
	}

	public void setTypeAnswerId(int typeAnswerId) {
		this.typeAnswerId = typeAnswerId;
	}

	public Long getCmbId() {
		return cmbId;
	}

	public void setCmbId(Long cmbId) {
		this.cmbId = cmbId;
	}

	public Long getQuestext() {
		return questext;
	}

	public void setQuestext(Long questext) {
		this.questext = questext;
	}

	public String getQuesimg() {
		return quesimg;
	}

	public void setQuesimg(String quesimg) {
		this.quesimg = quesimg;
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

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

}
