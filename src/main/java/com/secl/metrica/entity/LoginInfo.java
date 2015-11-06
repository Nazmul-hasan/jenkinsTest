package com.secl.metrica.entity;


@SuppressWarnings("serial")
public class LoginInfo extends AbstractEntity {
	
	private String loginid;
	private String password;
	

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
