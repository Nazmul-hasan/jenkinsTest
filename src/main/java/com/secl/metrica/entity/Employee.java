package com.secl.metrica.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee")
public class Employee extends AbstractEntity {
	
 	private String oid;
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
	
	




	public Employee(String oid, String employeeId, String loginID, String branchID, String shiftID,
			String departmentId,String gradeID,String designationID,String name,
			String fatherName,String motherName,String husbandName,
			Date dob,String gender,String contactNo1,String contactNo2, 
			String employeeCategoryId,String roleId, String maritalStatus,
			String bloodGroup,String email,String imagePath,String qualification,
			String experienceInfo,String totalExperience,String nationalityId,
			String presentAddress,String permanentAddress,String transportFacility,String hostelFacility,Date createdOn,
			String createdBy, Date editedOn, String editedBy) {
		super();
		
		this.setOid(oid);
		this.setEmployeeId(employeeId);
		this.setLoginID(loginID);
		this.setBranchID(branchID);
		this.setShiftID(shiftID);
		this.setDepartmentId(departmentId);
		this.setGradeID(gradeID);
		this.setDesignationID(designationID);
		this.setName(name);
		this.setFatherName(fatherName);
		this.setMotherName(motherName);
		this.setHusbandName(husbandName);
		this.setDob(dob);
		this.setGender(gender);
		this.setContactNo1(contactNo1);
		this.setContactNo2(contactNo2);
		this.setEmployeeCategoryId(employeeCategoryId);
		this.setRoleId(roleId);
		this.setMaritalStatus(maritalStatus);
		this.setBloodGroup(bloodGroup);
		this.setEmail(email);
		this.setImagePath(imagePath);
		this.setQualification(qualification);
		this.setExperienceInfo(experienceInfo);
		this.setNationalityId(nationalityId);
		this.setPresentAddress(presentAddress);
		this.setPermanentAddress(permanentAddress);
		this.setTransportFacility(transportFacility);
		this.setHostelFacility(hostelFacility);
		
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.editedOn = editedOn;
		this.editedBy = editedBy;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
    
	@Id
	@Column(name = "oid", nullable = false, length = 32)
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	@Id
	@Column(name = "employeeId", nullable = false, length = 32)
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Id
	@Column(name = "loginID", nullable = true, length = 64)
	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	@Id
	@Column(name = "branchID", nullable = true, length = 64)
	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}
	@Id
	@Column(name = "shiftID", nullable = false, length = 64)
	public String getShiftID() {
		return shiftID;
	}

	public void setShiftID(String shiftID) {
		this.shiftID = shiftID;
	}
	@Id
	@Column(name = "departmentId", nullable = false, length = 64)
	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	@Id
	@Column(name = "gradeID", nullable = false, length = 64)
	public String getGradeID() {
		return gradeID;
	}

	public void setGradeID(String gradeID) {
		this.gradeID = gradeID;
	}
	@Id
	@Column(name = "designationID", nullable = false, length = 64)
	public String getDesignationID() {
		return designationID;
	}

	public void setDesignationID(String designationID) {
		this.designationID = designationID;
	}
	@Column(name = "fatherName", nullable = true, length = 64)
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	@Column(name = "motherName", nullable = true, length = 64)
	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Column(name = "husbandName", nullable = true, length = 64)
	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}
	@Column(name = "dob", nullable = true)
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Column(name = "gender", nullable = true, length = 10)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@Column(name = "contactNo1", nullable = false, length = 12)
	public String getContactNo1() {
		return contactNo1;
	}
	
	public void setContactNo1(String contactNo1) {
		this.contactNo1 = contactNo1;
	}
	@Column(name = "contactNo2", nullable = true, length = 12)
	public String getContactNo2() {
		return contactNo2;
	}

	public void setContactNo2(String contactNo2) {
		this.contactNo2 = contactNo2;
	}
	@Column(name = "employeeCategoryId", nullable = true, length = 12)
	public String getEmployeeCategoryId() {
		return employeeCategoryId;
	}

	public void setEmployeeCategoryId(String employeeCategoryId) {
		this.employeeCategoryId = employeeCategoryId;
	}
	@Column(name = "roleId", nullable = true, length = 12)
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	@Column(name = "maritalStatus", nullable = true, length = 64)
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	@Column(name = "bloodGroup", nullable = false, length = 64)
	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Column(name = "email", nullable = true, length = 64)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "imagePath", nullable = false, length = 64)
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Column(name = "qualification", nullable = false, length = 64)
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Column(name = "experienceInfo", nullable = false, length = 64)
	public String getExperienceInfo() {
		return experienceInfo;
	}

	public void setExperienceInfo(String experienceInfo) {
		this.experienceInfo = experienceInfo;
	}
	@Column(name = "totalExperience", nullable = false, length = 64)
	public String getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(String totalExperience) {
		this.totalExperience = totalExperience;
	}
	@Column(name = "nationalityId", nullable = false, length = 64)
	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	@Column(name = "presentAddress", nullable = true, length = 256)
	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	@Column(name = "permanentAddress", nullable = true, length = 256)
	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	@Column(name = "transportFacility", nullable = true, length = 10)
	public String getTransportFacility() {
		return transportFacility;
	}

	public void setTransportFacility(String transportFacility) {
		this.transportFacility = transportFacility;
	}
	@Column(name = "hostelFacility", nullable = true, length = 10)
	public String getHostelFacility() {
		return hostelFacility;
	}

	public void setHostelFacility(String hostelFacility) {
		this.hostelFacility = hostelFacility;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Column(name = "createdOn")
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Column(name = "createdBy", nullable = false, length = 64)
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name = "editedOn")
	public Date getEditedOn() {
		return editedOn;
	}
	public void setEditedOn(Date editedOn) {
		this.editedOn = editedOn;
	}
	
	@Column(name = "editedBy", nullable = true, length = 64)
	public String getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
	


}
