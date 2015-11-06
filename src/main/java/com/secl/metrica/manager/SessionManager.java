package com.secl.metrica.manager;

import com.secl.metrica.bean.LoginBean;


public interface SessionManager {
	
	public void setUserInSession(LoginBean model);
	
	public LoginBean getUserInSession(LoginBean model);

	public void clearSession(LoginBean model);
	
	public boolean isValid(LoginBean model);

}
