package com.secl.metrica.manager.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.secl.metrica.bean.BranchBean;
import com.secl.metrica.bean.EmployeeBean;
import com.secl.metrica.bean.ResponseBean;
import com.secl.metrica.converter.BeanToEntityConverter;
import com.secl.metrica.entity.Branch;
import com.secl.metrica.manager.BranchManager;
import com.secl.metrica.manager.EmployeeManager;
import com.secl.metrica.utils.Constant;

public class EmployeeManagerImpl extends ManagerImpl implements EmployeeManager, Constant{
	private Logger _logger = Logger.getLogger(this.getClass());

	@Override
	public ResponseBean SaveEmployee(HttpServletRequest request,
			ResponseBean resBean, EmployeeBean model) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResponseBean getEmployeeByID(EmployeeBean model) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResponseBean getEmployees(EmployeeBean model) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
