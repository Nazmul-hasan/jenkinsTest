package com.secl.metrica.bean;

import java.util.Date;


@SuppressWarnings("serial")
public class StudentBean extends AbstractBean {
	
	private String StudentId;						
	private String stringloginID;							
	private String  BranchID;						
	private String stringBatchId;							
	private String  shiftID	;						
	private String  sectionID;						
	private String  BatchGroupId;					
	private String  ParentId;						
	private String  AdmissionNo	;					
	private String  ClassRollNo	;					
	private String  Name;						
	private Date DOB;                          
	private Date AdmissionDate;					
	private String Gender;							
	private String BloodGroup;						
	private String NationalityId;						
	private String CategoryId;						
	private String Religion	;					
	private String Address;							
	private String Email;							
	private String ContactNo1;						
	private String ImagePath;						
	private String EmergencyContact1Name;			
	private String EmergencyContact1Address;		
	private String EmergencyContact1ContactNo;		
	private String EnableSmsFeature;				
	private String TransportFacility;						
	private String HostelFacility;
	
	private Date createdOn;					
	private String createdBy;						
	private Date editedOn;						
	private String  editedBy;
	
	
	
	
	
	
	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public String getStringloginID() {
		return stringloginID;
	}

	public void setStringloginID(String stringloginID) {
		this.stringloginID = stringloginID;
	}

	public String getBranchID() {
		return BranchID;
	}

	public void setBranchID(String branchID) {
		BranchID = branchID;
	}

	public String getStringBatchId() {
		return stringBatchId;
	}

	public void setStringBatchId(String stringBatchId) {
		this.stringBatchId = stringBatchId;
	}

	public String getShiftID() {
		return shiftID;
	}

	public void setShiftID(String shiftID) {
		this.shiftID = shiftID;
	}

	public String getSectionID() {
		return sectionID;
	}

	public void setSectionID(String sectionID) {
		this.sectionID = sectionID;
	}

	public String getBatchGroupId() {
		return BatchGroupId;
	}

	public void setBatchGroupId(String batchGroupId) {
		BatchGroupId = batchGroupId;
	}

	public String getParentId() {
		return ParentId;
	}

	public void setParentId(String parentId) {
		ParentId = parentId;
	}

	public String getAdmissionNo() {
		return AdmissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		AdmissionNo = admissionNo;
	}

	public String getClassRollNo() {
		return ClassRollNo;
	}

	public void setClassRollNo(String classRollNo) {
		ClassRollNo = classRollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Date getAdmissionDate() {
		return AdmissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		AdmissionDate = admissionDate;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	public String getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(String categoryId) {
		CategoryId = categoryId;
	}

	public String getReligion() {
		return Religion;
	}

	public void setReligion(String religion) {
		Religion = religion;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContactNo1() {
		return ContactNo1;
	}

	public void setContactNo1(String contactNo1) {
		ContactNo1 = contactNo1;
	}

	public String getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}

	public String getEmergencyContact1Name() {
		return EmergencyContact1Name;
	}

	public void setEmergencyContact1Name(String emergencyContact1Name) {
		EmergencyContact1Name = emergencyContact1Name;
	}

	public String getEmergencyContact1Address() {
		return EmergencyContact1Address;
	}

	public void setEmergencyContact1Address(String emergencyContact1Address) {
		EmergencyContact1Address = emergencyContact1Address;
	}

	public String getEmergencyContact1ContactNo() {
		return EmergencyContact1ContactNo;
	}

	public void setEmergencyContact1ContactNo(String emergencyContact1ContactNo) {
		EmergencyContact1ContactNo = emergencyContact1ContactNo;
	}

	public String getEnableSmsFeature() {
		return EnableSmsFeature;
	}

	public void setEnableSmsFeature(String enableSmsFeature) {
		EnableSmsFeature = enableSmsFeature;
	}

	public String getTransportFacility() {
		return TransportFacility;
	}

	public void setTransportFacility(String transportFacility) {
		TransportFacility = transportFacility;
	}

	public String getHostelFacility() {
		return HostelFacility;
	}

	public void setHostelFacility(String hostelFacility) {
		HostelFacility = hostelFacility;
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



