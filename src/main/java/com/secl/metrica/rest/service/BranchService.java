package com.secl.metrica.rest.service;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.secl.metrica.bean.BranchBean;
import com.secl.metrica.bean.ResponseBean;
import com.secl.metrica.manager.BranchManager;
import com.secl.metrica.manager.SessionManager;
import com.secl.metrica.utils.Constant;

@Path("/json/branch")
public class BranchService implements Constant {
	
	
	@Context ServletContext servletContext;
	@Context HttpServletRequest request;
	private BranchManager branchManager;
	private SessionManager sessionManager;
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public ResponseBean postLogin(BranchBean model) {
		
		ResponseBean resBean = new ResponseBean();
		if(!sessionManager.isValid(model.getLoginBean())){
			return resBean;
		}
		else if(model.getOperation().equalsIgnoreCase(GET_ALL))
		{
			resBean = branchManager.getAllBranches(model);
		}
		else if(model.getOperation().equalsIgnoreCase(SAVE))
		{
			resBean = branchManager.SaveBranch(request, resBean, model);
		}
		else if(model.getOperation().equalsIgnoreCase(GET_BY_ID))
		{
			resBean = branchManager.getBranchByID(model);
		}
		return resBean;
	}


	public void setBranchManager(BranchManager branchManager) {
		this.branchManager = branchManager;
	}
	
	public void setSessionManager(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}
}


