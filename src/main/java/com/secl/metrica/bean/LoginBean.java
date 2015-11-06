package com.secl.metrica.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginBean implements Serializable {

	
	private String loginid ;
	private String roleid ;
	private String  bracnchid; 
	private String  shiftid ;
	private String  sectionid; 
	private String  usertype ;
	private String  password; 
	private String status ;
	private String  imagepath; 
	private String  name; 
	private String email ;
	private String  phoneno;
	
	private String sessionId;
	private String operation;
	
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getBracnchid() {
		return bracnchid;
	}
	public void setBracnchid(String bracnchid) {
		this.bracnchid = bracnchid;
	}
	public String getShiftid() {
		return shiftid;
	}
	public void setShiftid(String shiftid) {
		this.shiftid = shiftid;
	}
	public String getSectionid() {
		return sectionid;
	}
	public void setSectionid(String sectionid) {
		this.sectionid = sectionid;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	

	
}
