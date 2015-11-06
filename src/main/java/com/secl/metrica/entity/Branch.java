package com.secl.metrica.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "branch")
public class Branch extends AbstractEntity {
	
 	
	private String branchId;
	private String name;	
	private String location;
	
	private Date createdOn;	
	private String createdBy;	
	private Date editedOn;	
	private String editedBy;
	
	




	public Branch(String branchId, String name, String location, Date createdOn,
			String createdBy, Date editedOn, String editedBy) {
		super();
		this.setBranchId(branchId);
		this.setName(name);
		this.setLocation(location);
		
		
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.editedOn = editedOn;
		this.editedBy = editedBy;
	}

	public Branch() {
		// TODO Auto-generated constructor stub
	}


	@Id
	@Column(name = "branchId", nullable = false, length = 64)
	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "location", nullable = false, length = 256)
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "createdOn")
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Column(name = "createdBy", nullable = false, length = 64)
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name = "editedOn")
	public Date getEditedOn() {
		return editedOn;
	}
	public void setEditedOn(Date editedOn) {
		this.editedOn = editedOn;
	}
	
	@Column(name = "editedBy", nullable = true, length = 64)
	public String getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
	


}
