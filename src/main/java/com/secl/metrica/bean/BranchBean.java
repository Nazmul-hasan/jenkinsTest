package com.secl.metrica.bean;

import java.util.Date;

@SuppressWarnings("serial")
public class BranchBean extends AbstractBean {

	private String branchID;
	private String name;
	private String location;
	

	private Date createdOn;
	private String createdBy;
	private Date editedOn;
	private String editedBy;
	

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getEditedOn() {
		return editedOn;
	}

	public void setEditedOn(Date editedOn) {
		this.editedOn = editedOn;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	@Override
	public LoginBean getLoginBean() {

		return loginBean;
	}

	@Override
	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;

	}

	@Override
	public String getOperation() {
		// TODO Auto-generated method stub
		return operation;
	}

	@Override
	public void setOperation(String operation) {
		this.operation = operation;

	}

	@Override
	public String getOid() {

		return oid;
	}

	@Override
	public void setOid(String oid) {
		this.oid = oid;

	}

}
