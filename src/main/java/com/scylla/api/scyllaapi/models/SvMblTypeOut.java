package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Subselect;

@SuppressWarnings("serial")
@Entity
@Subselect("select a.id as ID,a.svsurveyid as SVSURVEYID,A.OTYPE_ID as OTYPE_ID from SV_SURVEYTYPEOUT a, (select distinct svsurveyid from sv_mbl) b where a.svsurveyid=b.svsurveyid")
public class SvMblTypeOut implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ID")
	private Long id;

	@Column(name = "SVSURVEYID")
	private String groupId;
	
	@Column(name = "OTYPE_ID")
	private Long groupCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(Long groupCode) {
		this.groupCode = groupCode;
	}


}
