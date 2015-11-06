package com.secl.metrica.manager;

import javax.servlet.http.HttpServletRequest;

import com.secl.metrica.bean.BranchBean;
import com.secl.metrica.bean.EmployeeBean;
import com.secl.metrica.bean.ResponseBean;

public interface EmployeeManager {

	ResponseBean getEmployees (EmployeeBean model);

	ResponseBean SaveEmployee(HttpServletRequest request, ResponseBean resBean,
			EmployeeBean model);

	ResponseBean getEmployeeByID(EmployeeBean model);

	
}
