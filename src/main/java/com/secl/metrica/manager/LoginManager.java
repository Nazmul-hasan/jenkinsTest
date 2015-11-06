package com.secl.metrica.manager;

import javax.servlet.http.HttpServletRequest;

import com.secl.metrica.bean.LoginBean;
import com.secl.metrica.bean.ResponseBean;


public interface LoginManager {
	
	public ResponseBean login(HttpServletRequest request, ResponseBean resBean, LoginBean model);
	
	public ResponseBean logout(HttpServletRequest request, ResponseBean resBean, LoginBean model);

	public ResponseBean changePassword(HttpServletRequest request,ResponseBean resBean, LoginBean model);
			
	

}








