package com.secl.metrica.manager.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.secl.metrica.bean.BranchBean;
import com.secl.metrica.bean.ResponseBean;
import com.secl.metrica.converter.BeanToEntityConverter;
import com.secl.metrica.entity.Branch;
import com.secl.metrica.manager.BranchManager;
import com.secl.metrica.utils.Constant;

public class BranchManagerImpl extends ManagerImpl implements BranchManager, Constant{
	private Logger _logger = Logger.getLogger(this.getClass());
	@Override
	public ResponseBean getAllBranches(BranchBean model) {
		ResponseBean resBean = new ResponseBean();
		try
		{
			@SuppressWarnings("unchecked")
			List<BranchBean> branchList = springJdbcDao.getObjectList(queryManager.getBranchList(), null, BranchBean.class);
			if(branchList == null || branchList.isEmpty()){
				return resBean;
			}
			resBean.setData(branchList);
			resBean.setSuccess(true);
			
		}
		catch(Exception e)
		{
			_logger.error("An exception occurred while get employee list : ", e);
		}
		return resBean;
	}
	@Override
	public ResponseBean SaveBranch(HttpServletRequest request,ResponseBean resBean, BranchBean model)
	{
		ResponseBean responseBean = new ResponseBean();
		try
		{
			if(model.getBranchID() == null)
			{
				model.setBranchID(idGenerator.generateId());
			}
			model.setCreatedBy(model.getLoginBean().getLoginid());
			model.setCreatedOn(new Date());
			Branch branch = BeanToEntityConverter.convertBranchBeanToEntity(model);
			
			hibernateDao.saveObject(branch);
			responseBean.setSuccess(true);
			
		}
		catch(Exception e)
		{
			_logger.error("An exception occurred while save Branch data : ", e);
			responseBean.setSuccess(false);
		}
		return responseBean;
	}
	@Override
	public ResponseBean getBranchByID(BranchBean model) {
		ResponseBean resBean = new  ResponseBean();
		try {
			BranchBean branchobj = (BranchBean) springJdbcDao.getObject(queryManager.getBranchByID(), new Object[] { model.getBranchID()}, BranchBean.class);
	
			if(branchobj == null){
				return resBean;
			}
			resBean.setData(branchobj);
			resBean.setSuccess(true);
			
		} catch (Exception e) {
			_logger.error("An exception occurred while get branch by oid   : ", e);
		}
		return resBean;
	}

}
