package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Subselect;

@SuppressWarnings("serial")
@Entity
@Subselect("select * from SV_MBL")
public class SvMbl implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "QUESTIONID")
	private Long questionId;

	@Column(name = "GROUPID")
	private String groupId;
	
	@Column(name = "GROUPCODE")
	private String groupCode;
	
	@Column(name = "GROUPNAME")
	private String groupName;

	@Column(name = "GROUPIMG")
	private String groupImg;

	@Column(name = "TYPESURVEY")
	private String typeSurvey;
	
	@Column(name = "FLAGWAJIB")
	private String flagWajib;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "QUESTIONCODE")
	private String questionCode;
	
	
	@Column(name = "QUESTIONDESC")
	private String questionDesc;
	
	
	@Column(name = "TYPEANSWERID")
	private Long typeAnswerId;
	
	@Column(name = "CMBID")
	private Long cmbId;
	
	
	@Column(name = "QUESTEXT")
	private Long quesText;
	
	@Column(name = "QUESIMG")
	private String quesImg;
	
	@Column(name = "SVSURVEYID")
	private Long svSurveyId;
	
	@Column(name = "DATESTART")
	private Date dateStrat;
	
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

	
	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupImg() {
		return groupImg;
	}

	public void setGroupImg(String groupImg) {
		this.groupImg = groupImg;
	}

	public String getTypeSurvey() {
		return typeSurvey;
	}

	public void setTypeSurvey(String typeSurvey) {
		this.typeSurvey = typeSurvey;
	}

	public String getFlagWajib() {
		return flagWajib;
	}

	public void setFlagWajib(String flagWajib) {
		this.flagWajib = flagWajib;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Long getTypeAnswerId() {
		return typeAnswerId;
	}

	public void setTypeAnswerId(Long typeAnswerId) {
		this.typeAnswerId = typeAnswerId;
	}

	public Long getCmbId() {
		return cmbId;
	}

	public void setCmbId(Long cmbId) {
		this.cmbId = cmbId;
	}

	public Long getQuesText() {
		return quesText;
	}

	public void setQuesText(Long quesText) {
		this.quesText = quesText;
	}

	public String getQuesImg() {
		return quesImg;
	}

	public void setQuesImg(String quesImg) {
		this.quesImg = quesImg;
	}

	public Long getSvSurveyId() {
		return svSurveyId;
	}

	public void setSvSurveyId(Long svSurveyId) {
		this.svSurveyId = svSurveyId;
	}

	public Date getDateStrat() {
		return dateStrat;
	}

	public void setDateStrat(Date dateStrat) {
		this.dateStrat = dateStrat;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getFlagArea() {
		return flagArea;
	}

	public void setFlagArea(String flagArea) {
		this.flagArea = flagArea;
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
	
	


}
