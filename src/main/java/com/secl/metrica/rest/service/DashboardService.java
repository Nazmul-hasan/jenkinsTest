
package com.secl.metrica.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.secl.metrica.bean.ReportParamBean;
import com.secl.metrica.bean.ResponseBean;
import com.secl.metrica.manager.DashboardManager;
import com.secl.metrica.utils.Constant;


@Service
@Path("/dashboard")
public class DashboardService implements Constant {

	private DashboardManager dashboardManager;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseBean post(ReportParamBean reportParamBean){
		ResponseBean responseBean = new ResponseBean();
		responseBean.setData(dashboardManager.getData());
		responseBean.setSuccess(true);
		return responseBean;
	}

	

	
	
	
	
	
	public void setDashboardManager(DashboardManager dashboardManager) {
		this.dashboardManager = dashboardManager;
	}

	
}





