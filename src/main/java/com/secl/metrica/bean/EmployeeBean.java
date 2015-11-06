package com.secl.metrica.bean;

import java.util.Date;

@SuppressWarnings("serial")
public class EmployeeBean extends AbstractBean {

	private String employeeId;
	private String loginID;
	private String branchID;
	private String shiftID;
	private String departmentId;
	private String gradeID;
	private String designationID;
	private String name;
	private String fatherName;
	private String motherName;
	private String husbandName;
	private Date dob;
	private String gender;
	private String contactNo1;
	private String contactNo2;
	private String employeeCategoryId;
	private String roleId;
	private String maritalStatus;
	private String bloodGroup;
	private String email;
	private String imagePath;
	private String qualification;
	private String experienceInfo;
	private String totalExperience;
	private String nationalityId;
	private String presentAddress;
	private String permanentAddress;
	private String transportFacility;
	private String hostelFacility;
	

	private Date createdOn;
	private String createdBy;
	private Date editedOn;
	private String editedBy;
	

	

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}

	public String getShiftID() {
		return shiftID;
	}

	public void setShiftID(String shiftID) {
		this.shiftID = shiftID;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getGradeID() {
		return gradeID;
	}

	public void setGradeID(String gradeID) {
		this.gradeID = gradeID;
	}

	public String getDesignationID() {
		return designationID;
	}

	public void setDesignationID(String designationID) {
		this.designationID = designationID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo1() {
		return contactNo1;
	}

	public void setContactNo1(String contactNo1) {
		this.contactNo1 = contactNo1;
	}

	public String getContactNo2() {
		return contactNo2;
	}

	public void setContactNo2(String contactNo2) {
		this.contactNo2 = contactNo2;
	}

	public String getEmployeeCategoryId() {
		return employeeCategoryId;
	}

	public void setEmployeeCategoryId(String employeeCategoryId) {
		this.employeeCategoryId = employeeCategoryId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperienceInfo() {
		return experienceInfo;
	}

	public void setExperienceInfo(String experienceInfo) {
		this.experienceInfo = experienceInfo;
	}

	public String getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(String totalExperience) {
		this.totalExperience = totalExperience;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getTransportFacility() {
		return transportFacility;
	}

	public void setTransportFacility(String transportFacility) {
		this.transportFacility = transportFacility;
	}

	public String getHostelFacility() {
		return hostelFacility;
	}

	public void setHostelFacility(String hostelFacility) {
		this.hostelFacility = hostelFacility;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getEditedOn() {
		return editedOn;
	}

	public void setEditedOn(Date editedOn) {
		this.editedOn = editedOn;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	@Override
	public LoginBean getLoginBean() {

		return loginBean;
	}

	@Override
	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;

	}

	@Override
	public String getOperation() {
		// TODO Auto-generated method stub
		return operation;
	}

	@Override
	public void setOperation(String operation) {
		this.operation = operation;

	}

	@Override
	public String getOid() {

		return oid;
	}

	@Override
	public void setOid(String oid) {
		this.oid = oid;

	}

}
