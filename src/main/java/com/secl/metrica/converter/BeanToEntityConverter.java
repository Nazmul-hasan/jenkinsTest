package com.secl.metrica.converter;


import java.util.Date;

import com.secl.metrica.bean.BranchBean;
import com.secl.metrica.bean.EmployeeBean;
import com.secl.metrica.bean.LoginBean;

import com.secl.metrica.entity.Branch;
import com.secl.metrica.entity.Employee;
import com.secl.metrica.entity.LoginInfo;



public class BeanToEntityConverter {
	
	public static LoginInfo convertLoginInfoToBean(LoginBean bean) {
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setLoginid(bean.getLoginid());
		loginInfo.setPassword(bean.getPassword());
		return loginInfo;
	}

	public static Branch convertBranchBeanToEntity(BranchBean bean) {
		
		Branch entity = new Branch();
		entity.setBranchId(bean.getBranchID());
		entity.setName(bean.getName());
		entity.setLocation(bean.getLocation());
		
		entity.setCreatedBy(bean.getCreatedBy());
		entity.setCreatedOn(bean.getCreatedOn());
		entity.setEditedBy(bean.getEditedBy());
		entity.setEditedOn(bean.getEditedOn());	
		return entity;
	}
	public static Employee convertEmployeeBeanToEntity(EmployeeBean bean){
		Employee entity = new Employee();
		entity.setEmployeeId(bean.getEmployeeId());
		entity .setLoginID(bean.getLoginID());
		entity.setBranchID(bean.getBranchID());
		entity.setShiftID(bean.getShiftID());
		entity.setDepartmentId(bean.getDepartmentId());
		entity.setGradeID(bean.getGradeID());
		entity.setDesignationID(bean.getDesignationID());
		entity.setName(bean.getName());
		entity.setFatherName(bean.getFatherName());
		entity.setMotherName(bean.getMotherName());
		entity.setHusbandName(bean.getHusbandName());
		entity.setDob(bean.getDob());
		entity.setGender(bean.getGender());
		entity.setContactNo1(bean.getContactNo1());
		entity.setContactNo2(bean.getContactNo2()) ;
		entity.setEmployeeCategoryId(bean.getEmployeeCategoryId());
		entity.setRoleId(bean.getRoleId());
		entity .setMaritalStatus(bean.getMaritalStatus());
		entity .setBloodGroup(bean.getBloodGroup());
		entity .setEmail(bean.getEmail());
		entity.setImagePath(bean.getImagePath());
		entity.setQualification(bean.getQualification());
		entity.setExperienceInfo(bean.getExperienceInfo());
		entity.setTotalExperience(bean.getTotalExperience());
		entity.setNationalityId(bean.getNationalityId());
		entity.setPresentAddress(bean.getPermanentAddress());
		entity.setPermanentAddress(bean.getPermanentAddress());
		entity.setTransportFacility(bean.getTransportFacility());
		entity.setHostelFacility(bean.getHostelFacility());
		
		entity.setCreatedBy(bean.getCreatedBy());
		entity.setCreatedOn(bean.getCreatedOn());
		entity.setEditedBy(bean.getEditedBy());
		entity.setEditedOn(bean.getEditedOn());	
		return entity;
		
	}
}
