package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "sv_group")
public class SvGroup implements Serializable{
	
	/**
	 */
	
	public SvGroup() {
		
	}
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SV_GROUP_SEQ")
	@SequenceGenerator(sequenceName = "SV_GROUP_SEQ", allocationSize = 1, name = "SV_GROUP_SEQ")
	private Long id;
	
	@Column(name = "GROUPCODE", nullable = false, length = 10)
	private String groupCode;
	
	@Column(name = "GROUPNAME", nullable = false, length = 50)
	private String groupName;
	
	@Column(name = "GROUPIMG", nullable = true, length = 50)
	private String groupImg;
	
	@Column(name = "TYPESURVEY")
	private int typeSurvey;
	
	@Column(name = "FLAGWAJIB", nullable = true, length = 1)
	private String flagWajib;
	
	@Column(name = "STATUS", nullable = true, length = 1)
	private String status;
	
	@Column(name = "CREATED_AT")
	private Date createdAt;
	
	@Column(name = "UPDATED_AT")
	private Date updatedAt;
	
	@Column(name = "USERID")
	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getTypeSurvey() {
		return typeSurvey;
	}

	public void setTypeSurvey(int typeSurvey) {
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
	
}
