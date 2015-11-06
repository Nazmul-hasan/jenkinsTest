
'use strict';

define(['app'], function (app) {
    
	 var appLeftMenuController = function ($rootScope, $scope, $log, $route, navigationService, 
			 configurationService, localStorageService,constantService, localize) {
		 
		 var userInfo;
		 
		 $scope.menu = [
		            	{ "id" : "dashboard", "url" : "dashboard", "text" : "Dashboard", "class" : "fa fa-dashboard", "child" : [] },
		            	{ "id" : "students", "url" : "students", "text" : "Students", "class" : "fa fa-bar-chart-o fa-fw", "child" : 
		            		[
		            	           { "id" : "registerstudent", "url" : "registerstudent", "text" : "Register Student", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "viewstudent", "url" : "viewstudent", "text" : "Students Detail", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "studentreport", "url" : "studentreport", "text" : "Student Report", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "attendanceregister", "url" : "attendanceregister", "text" : "Attendance Register", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "attendancereport", "url" : "attendancereport", "text" : "Attendance Report", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "leave", "url" : "leave", "text" : "Leave", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "parents", "url" : "parents", "text" : "Parents", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "studentrecordhistory", "url" : "studentrecordhistory", "text" : "Student Record History", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	      	{ "id" : "employees", "url" : "employees", "text" : "Employees", "class" : "fa fa-users", "child" : 
		            		[
									{ "id" : "addemployee", "url" : "addemployee", "text" : "Add Employee", "class" : "fa fa-angle-double-right" } ,
									{ "id" : "employees", "url" : "employees", "text" : "Employees", "class" : "fa fa-angle-double-right" },
									{ "id" : "employeereport", "url" : "employeereport", "text" : "Employee Report", "class" : "fa fa-angle-double-right" },
									{ "id" : "employeeattendance", "url" : "employeeattendance", "text" : "Employee Attendance", "class" : "fa fa-angle-double-right" },
									{ "id" : "manageleave", "url" : "manageleave", "text" : "Manage Leave", "class" : "fa fa-angle-double-right" }
		            	    ] 
		            	},
		            	{ "id" : "configuration", "url" : "configuration", "text" : "Configuration", "class" : "fa fa-file-text", "child" : 
		            		[
									{ "id" : "classmanagement", "url" : "classmanagement", "text" : "Class Management", "class" : "fa fa-angle-double-right" },
									{ "id" : "subjectmanagment", "url" : "subjectmanagment", "text" : "Subject Managment", "class" : "fa fa-angle-double-right" } ,
									{ "id" : "accesscontrol", "url" : "accesscontrol", "text" : "Access Control", "class" : "fa fa-angle-double-right" },
									{ "id" : "gloabalsetting", "url" : "gloabalsetting", "text" : "Gloabal Setting", "class" : "fa fa-angle-double-right" },
									{ "id" : "studentcatagory", "url" : "studentcatagory", "text" : "Student Catagory", "class" : "fa fa-angle-double-right" },
									{ "id" : "classtransfer", "url" : "classtransfer", "text" : "Class Transfer", "class" : "fa fa-angle-double-right" },
								    { "id" : "menuiteams", "url" : "menuiteams", "text" : "Menu Iteams", "class" : "fa fa-angle-double-right" },
									{ "id" : "manageemail", "url" : "manageemail", "text" : "Manage Email", "class" : "fa fa-angle-double-right" },
									{ "id" : "mergemultipleaccount", "url" : "mergemultipleaccount", "text" : "Merge Multiple Account", "class" : "fa fa-angle-double-right" },
									{ "id" : "additionaladmissionfield", "url" : "additionaladmissionfield", "text" : "Additional Admission Field", "class" : "fa fa-angle-double-right" },
									{ "id" : "studentinteraction", "url" : "studentinteraction", "text" : "Student Interaction", "class" : "fa fa-angle-double-right" },
									{ "id" : "branches", "url" : "branches", "text" : "Branches", "class" : "fa fa-angle-double-right" }
		            	    ] 
		            	},
		            	{ "id" : "timetable", "url" : "timetable", "text" : "Time Table", "class" : "fa fa-th", "child" : 
		            		[

		            		       { "id" : "institutiontiming", "url" : "institutiontiming", "text" : "Institution Timing/Periods", "class" : "fa fa-angle-double-right" },
		            		 	   { "id" : "institutionweekday", "url" : "institutionweekday", "text" : "Institution Weekday", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "classtimetable", "url" : "classtimetable", "text" : "Class Timetable", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "institutiontimetable", "url" : "institutiontimetable", "text" : "Institution Timetable", "class" : "fa fa-angle-double-right" }
		            	                                                                                               
		            	    ] 
		            	},
		            	{ "id" : "hraddministration", "url" : "hr/addministration", "text" : "Hr/Addministration", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "setting", "url" : "setting", "text" : "Setting", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "customisedashboard", "url" : "customisedashboard", "text" : "Customise Dashboard", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "setuppage", "url" : "setuppage", "text" : "Setup Page", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "studenticard", "url" : "studenticard", "text" : "Print Student Icard", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "location", "url" : "location", "text" : "Location", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "currency", "url" : "currency", "text" : "Currency", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "ptmcircular", "url" : "ptmcircular", "text" : "PTM Circular/Activity", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "customisemenu", "url" : "customisemenu", "text" : "Customise Menu", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "branchadmin", "url" : "branchadmin", "text" : "Branch Admin", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "gatepass", "url" : "gatepass", "text" : "Gate Pass", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "libararymanagement", "url" : "libararymanagement", "text" : "Library Management", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "bookissueandreturn", "url" : "bookissueandreturn", "text" : "Book Issue & Return", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "addbook", "url" : "addbook", "text" : "Add Book", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "managebook", "url" : "managebook", "text" : "Manage Book", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "classwisesetting", "url" : "classwisesetting", "text" : "Class Wise Setting", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "addlibrary", "url" : "addlibrary", "text" : "Add Library", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "duedatebook", "url" : "duedatebook", "text" : "Due Date Book", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "finetrnsactionlist", "url" : "finetrnsactionlist", "text" : "Library Fine Trnsaction List", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "lostfinetrnsactionlist", "url" : "lostfinetrnsactionlist", "text" : "Lost Book Fine Trnsaction List", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "event", "url" : "event", "text" : "Event", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "addevent", "url" : "addevent", "text" : "Add Event", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "viewevent", "url" : "viewevent", "text" : "View Event", "class" : "fa fa-angle-double-right" }
		            	          
		            	    ] 
		            	},
		            	{ "id" : "assignment", "url" : "assignment", "text" : "Assignment", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "addupdateassignment", "url" : "addupdateassignment", "text" : "Add/Update Assignment", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "completedassignment", "url" : "completedassignment", "text" : "Completed Assignment", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "approvalassignment", "url" : "approvalassignment", "text" : "Approval Assignment", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "onlineadmission", "url" : "onlineadmission", "text" : "Online Admission", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "submittedapplication", "url" : "submittedapplication", "text" : "Submitted Application", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "additionaldetail", "url" : "additionaldetail", "text" : "Additional Detail", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "payregistrationfee", "url" : "payregistrationfee", "text" : "Pay Registration Fee", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "settingonlineaddmission", "url" : "settingonlineaddmission", "text" : "Setting", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "feetransationlist", "url" : "feetransationlist", "text" : "Fee Transation List", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "transportation", "url" : "transportation", "text" : "Transportation", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "routeandfare", "url" : "routeandfare", "text" : "Vehicle Route & Fare", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "vehicleallocation", "url" : "vehicleallocation", "text" : "Vehicle Allocation", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "transportfee", "url" : "transportfee", "text" : "Transport Fee", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "feedefaulter", "url" : "feedefaulter", "text" : "Fee Defaulter", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "transactionlist", "url" : "transactionlist", "text" : "Transaction List", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "examination", "url" : "examination", "text" : "Examination", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "createexam", "url" : "createexam", "text" : "Create/Update Exam", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "publishresult", "url" : "publishresult", "text" : "View/Publish Result", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "grade", "url" : "grade", "text" : "Grade", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "examreport", "url" : "examreport", "text" : "Exam Report", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "hostelmanagement", "url" : "hostelmanagement", "text" : "Hostel Management", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "managehostelandroom", "url" : "managehostelandroom", "text" : "Manage Hostel & Room", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "roomallocation", "url" : "roomallocation", "text" : "Room Allocation", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "hostelfee", "url" : "hostelfee", "text" : "Hostel Fee", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "feedefaulter", "url" : "feedefaulter", "text" : "Fee Defaulter", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "hostelfeetranstionlist", "url" : "hostelfeetranstionlist", "text" : "Hostel Fee Transation List", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "seatavailiabilitylist", "url" : "seatavailiabilitylist", "text" : "Seat Availiability List", "class" : "fa fa-angle-double-right" }
		            	           
		            	                                           
		            	    ] 
		            	},
		            	{ "id" : "finance", "url" : "finance", "text" : "Finance", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "feecatagoryandparticular", "url" : "feecatagoryandparticular", "text" : "Fee Catagory & Particular", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "financecategory", "url" : "financecategory", "text" : "Finance Category", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "feesubmission", "url" : "feesubmission", "text" : "Fee Submission", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "incomeandexpence", "url" : "incomeandexpence", "text" : "Income & Expence", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "payslip", "url" : "payslip", "text" : "Pay Slip", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "assestandliability", "url" : "assestandliability", "text" : "Assest & Liability", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "donation", "url" : "donation", "text" : "Donation", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "feedefaulter", "url" : "feedefaulter", "text" : "Fee Defaulter", "class" : "fa fa-angle-double-right" },
		            	           { "id" : "instantfee", "url" : "instantfee", "text" : "Instant Fee", "class" : "fa fa-angle-double-right" },
		            	         
		            	    ] 
		            	},
		            	{ "id" : "campusdrive", "url" : "campusdrive", "text" : "Campus Drive", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "syllabus", "url" : "syllabus", "text" : "Syllabus", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "mydocument", "url" : "mydocument", "text" : "My Document", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "managestudentdocs", "url" : "managestudentdocs", "text" : "Manage Student Docs", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "managestaffdocs", "url" : "managestaffdocs", "text" : "Manage Staff Docs", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "documentcategory", "url" : "documentcategory", "text" : "Document Category", "class" : "fa fa-angle-double-right" },
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "report", "url" : "report", "text" : "Reports", "class" : "fa fa-users", "child" : 
		            		[
		            	                                                                                             
		            		 { "id" : "dataexport", "url" : "dataexport", "text" : "Data Export", "class" : "fa fa-angle-double-right" }
                                                                                       
		            	   ] 
		            	},
		            	
		            	{ "id" : "inoutdetails", "url" : "underconstruction", "text" : "In-Out Details", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "housekeeping", "url" : "underconstruction", "text" : "House Keeping", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "phoneregister", "url" : "underconstruction", "text" : "Phone Register", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "infirmary", "url" : "underconstruction", "text" : "Infirmary", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "facility", "url" : "underconstruction", "text" : "Facility", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "complaientregister", "url" : "underconstruction", "text" : "Complaient Register", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "taskmanager", "url" : "underconstruction", "text" : "Task Manager", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	
		               	{ "id" : "payroll", "url" : "underconstruction", "text" : "Payroll", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		               	{ "id" : "quiationbank", "url" : "underconstruction", "text" : "Quistion Bank", "class" : "fa fa-users", "child" : 
		            		[
		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "A", "class" : "fa fa-angle-double-right" },

		            	           { "id" : "underconstruction", "url" : "underconstruction", "text" : "B", "class" : "fa fa-angle-double-right" },
		            	           
		            	           { "id" : "timesheetanalytics", "url" : "underconstruction", "text" : "C", "class" : "fa fa-angle-double-right" }
		            	                                                                                                  
		            	    ] 
		            	},
		            	{ "id" : "adminPortal", "url" : "adminPortal", "text" : "Admin Portal", "class" : "fa fa-th", "child" : [] }
		            		
			                                                                                            
		            ];
		
		 
		
		 $scope.clickTopItem = function(item){
				var isActive = $("#"+item.id).hasClass('active');
				if(item.child.length > 0)
				{
					if (isActive) 
					{
		                $("#"+item.id).removeClass('active');		               
		                $("#"+item.id).children('a').children("i.fa-angle-down").first().removeClass("fa-angle-down").addClass("fa-angle-left");
		                $("#"+item.id).children('ul.treeview-menu').slideUp("fast","swing");
		            } 
					else 
					{
		                
		                angular.forEach($scope.menu, function(itm, index) {
							if(itm.child.length > 0){
								$("#"+itm.id).removeClass('active');
								 $("#"+itm.id).children('a').children("i.fa-angle-down").first().removeClass("fa-angle-down").addClass("fa-angle-left");
					            $("#"+itm.id).children('ul.treeview-menu').slideUp("fast","swing");
							}
			            });
		                
		                $("#"+item.id).addClass('active');
		                $("#"+item.id).children('a').children("i.fa-angle-left").first().removeClass("fa-angle-left").addClass("fa-angle-down");
		                $("#"+item.id).children('ul.treeview-menu').slideDown("fast","swing");
		            }
				}
				else 
				{
					angular.forEach($scope.menu, function(itm, index) {
						if(itm.child.length > 0){
							$("#"+itm.id).removeClass('active');
							 $("#"+itm.id).children('a').children("i.fa-angle-down").first().removeClass("fa-angle-down").addClass("fa-angle-left");
				            $("#"+itm.id).children('ul.treeview-menu').slideUp("fast","swing");
						}
						/*if(itm.child.length == 0){
							$("#"+itm.id).removeClass('active');
						}*/
		            });
					$("#"+item.id).addClass('active');
					navigationService.menuNavigation(item.url);
				}
			}
		 
		 $scope.clickLeftMenu = function(menuId){
			 if (menuId==='profile') {
				 $scope.showProfile($scope.loggedinUserInfo.employeeID);
				 return;
			}
			navigationService.menuNavigation(menuId);
		}
		
		$scope.showProfile = function(employeeID){
           	navigationService.showPageWithData('profile',$scope.loggedinUserInfo.employeeID);
     };
		
		var init = function () {
			$('#side-menu').metisMenu();
			userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
        	$scope.loggedinUserInfo = userInfo;
	    }; 
	    
	    init();
		 
	 };    
	 
	 app.controller('appLeftMenuController', ['$rootScope', '$scope', '$log', '$route', 'navigationService', 
         'configurationService', 'localStorageService','constantService', 'localize', appLeftMenuController]);
	
});

