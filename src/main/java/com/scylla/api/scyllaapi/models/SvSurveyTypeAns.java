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
@Table(name = "sv_typeans")
public class SvSurveyTypeAns implements Serializable {
	
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_TYPEANS_SEQ")
	@SequenceGenerator(sequenceName = "SV_TYPEANS_SEQ", allocationSize = 1, name = "SV_TYPEANS_SEQ")
	private Long id;
	
	@Column(name = "TYPEANSWER")
	private String typeAnswer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeAnswer() {
		return typeAnswer;
	}

	public void setTypeAnswer(String typeAnswer) {
		this.typeAnswer = typeAnswer;
	}
	

}
