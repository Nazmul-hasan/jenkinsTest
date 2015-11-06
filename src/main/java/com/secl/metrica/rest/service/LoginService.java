package com.secl.metrica.rest.service;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.secl.metrica.bean.LoginBean;
import com.secl.metrica.bean.ResponseBean;
import com.secl.metrica.manager.LoginManager;
import com.secl.metrica.manager.SessionManager;
import com.secl.metrica.utils.Constant;

@Path("/security")
public class LoginService implements Constant {
	
	
	@Context ServletContext servletContext;
	@Context HttpServletRequest request;
	private LoginManager loginManager;
	private SessionManager sessionManager;
	
	@POST
	@Path("/useraccess")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public ResponseBean postLogin(LoginBean model) {
		ResponseBean resBean = new ResponseBean();
		
		if(model.getOperation().equalsIgnoreCase(USER_LOGIN))
		{
			resBean =  loginManager.login(request, resBean, model);
		}
		else if(model.getOperation().equalsIgnoreCase(USER_LOGOUT))
		{
			resBean =  loginManager.logout(request, resBean, model);
		}
		else if(model.getOperation().equalsIgnoreCase(USER_PASSWORD_CHANGE))
		{
			resBean =  loginManager.changePassword(request, resBean, model);
		}
		return resBean;
	}

    
	public void setLoginManager(LoginManager loginManager) {
		this.loginManager = loginManager;
	}


	public void setSessionManager(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

	

	
}


