package com.scylla.api.scyllaapi.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SvResult implements Serializable {
	private String subdist_id; 
	private String slsno;  
	private String custno; 
	private String otypeId;
	private String ogrpId; 
	private String sData; 
	private Long groupId;
	private Long questionId;
	private String sAnswer; 
	private String sText;
	
	public String getSubdist_id() {
		return subdist_id;
	}
	public void setSubdist_id(String subdist_id) {
		this.subdist_id = subdist_id;
	}
	public String getSlsno() {
		return slsno;
	}
	public void setSlsno(String slsno) {
		this.slsno = slsno;
	}
	public String getCustno() {
		return custno;
	}
	public void setCustno(String custno) {
		this.custno = custno;
	}
	public String getOtypeId() {
		return otypeId;
	}
	public void setOtypeId(String otypeId) {
		this.otypeId = otypeId;
	}
	public String getOgrpId() {
		return ogrpId;
	}
	public void setOgrpId(String ogrpId) {
		this.ogrpId = ogrpId;
	}
	public String getsData() {
		return sData;
	}
	public void setsData(String sData) {
		this.sData = sData;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getsAnswer() {
		return sAnswer;
	}
	public void setsAnswer(String sAnswer) {
		this.sAnswer = sAnswer;
	}
	public String getsText() {
		return sText;
	}
	public void setsText(String sText) {
		this.sText = sText;
	}
}
