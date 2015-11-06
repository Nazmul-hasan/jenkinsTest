package com.secl.metrica.manager.impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.secl.metrica.bean.LoginBean;
import com.secl.metrica.bean.ResponseBean;
import com.secl.metrica.manager.LoginManager;
import com.secl.metrica.utils.Constant;
import com.secl.metrica.utils.Table;


public class LoginManagerImpl extends ManagerImpl implements LoginManager, Constant {
	
	private Logger _logger = Logger.getLogger(this.getClass());
	
	public ResponseBean login(HttpServletRequest request, ResponseBean responseBean, LoginBean model) {
		
		try {
			LoginBean loginBean = (LoginBean) springJdbcDao.getObject(queryManager.getLoggedinUserinfo(), new Object[]{model.getLoginid()}, LoginBean.class);
			
			if(loginBean == null)
			{
				responseBean.setMessage("Invalid login ID");
				responseBean.setSuccess(false);
				return responseBean;
			}
			if(!loginBean.getPassword().equalsIgnoreCase(model.getPassword()))
			{
				responseBean.setMessage("Invalid Password");
				responseBean.setSuccess(false);
				return responseBean;
			}
			_logger.info("Successfully logged in Metrica by : "+loginBean.getName()+" on : "+new Date());
			loginBean.setSessionId(idGenerator.getSessionId());
			responseBean.setSuccess(true);
			responseBean.setData(loginBean);
			sessionManager.setUserInSession(loginBean);
			
		} catch (Exception e) {
			_logger.error("An exception occurred while login : ", e);
		}
		
		return responseBean;
	}


	@Override
	public ResponseBean logout(HttpServletRequest request, ResponseBean resBean, LoginBean model) {
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		sessionManager.clearSession(model);
		resBean.setSuccess(true);
		_logger.info("Successfully logged out Metrica by : "+model.getName()+" on : "+new Date());
		
		return resBean;
	}


	@Override
	public ResponseBean changePassword(HttpServletRequest request,
			ResponseBean resBean, LoginBean model) {
		// TODO Auto-generated method stub
		return null;
	}

/*
	@Override
	public ResponseBean changePassword(HttpServletRequest request,ResponseBean resBean, LoginBean model)
	 {
		
		String sql = "update "+Table.LOGIN+" set password = '"+model.getNewPassword()+"' where loginid = ?";
		
		try
		{
			springJdbcDao.updateObject(sql, new Object[]{model.getLoginId()});
			model.setPassword(model.getNewPassword());
			resBean.setData(model);
			resBean.setSuccess(true);
			_logger.info("Successfully change password for : "+model.getLoginId());
			
		}
		catch(Exception e)
		{
			_logger.error("An exception occured while change password for :"+model.getLoginId(), e);
		}
		return resBean;
	 }*/
	
	

}
