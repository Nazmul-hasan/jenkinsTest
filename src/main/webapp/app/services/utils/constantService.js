
'use strict';

define(['app'], function (app) {

    var constantService = function ($rootScope, $cookieStore) {
    	
        this.getAppLayout = function () {
            var layout = {
                header: { location: 'app/views/layout/app/Header.html', isVisible: true },
                leftPanel: { location: 'app/views/layout/app/LeftPanel.html', isVisible: true},
            };
            return layout;
        };

        this.getWebLayout = function () {
            var layout = {
                header: { location: 'app/views/layout/web/Header.html', isVisible: false },
                leftPanel: { location: 'app/views/layout/web/LeftPanel.html', isVisible: false },
            };
            return layout;
        };
        this.userInfoCookieStoreKey = 'user.info.cookie.store.key';
        this.systemInfoCookieStoreKey = 'system.info.cookie.store.key';
        this.AlertMessage = 'AlertMessage';
        
        this.userlogin = 'Login';
        this.userlogout = 'Logout';
        this.passwordchange = 'changepassword';
        
        this.Active = 'A';
        this.Inactive = 'I';
        
        this.GetAll = 'GetAll';
        this.GetCalendarData='GetCalendarData';
        this.GetCalendarDataByEmpl='GetCalendarDataByEmpl';
        this.GetTimeSheetLog='GetTimeSheetLog';
        this.GetByID = 'GetByID';
        this.GetByOId = 'GetByOId';
        this.GetTeamwiseEmplyee = 'GetTeamwiseEmplyee';
        this.AddBalance = 'AddBalance';
        this.ChangeStatus = 'ChangeStatus';
        this.GetAllUnitForEmployee = 'GetAllUnitsForEmployee';
        this.GetAllTeamForEmployee = 'GetAllTeamForEmployee';
        this.GetAllGradeForEmployee = 'GetAllGradeForEmployee';
        this.GetAllDesignationForEmployee ='GetAllDesignationForEmployee';
        this.GetCurrentArtifact ="GetCurrentArtifact";
        this.GetEmployeewithID ='GetEmployeewithID';
        this.GetFileredItem ='getFileredItem';
        this.GetAllUnitsForUnitListView = "GetAllUnitsForUnitListView";
        this.Danger = 'danger';
        this.Success = 'success';
        this.Info = 'info';
        this.Warning = 'warning';
        this.Save = 'Save';
        this.Update="Update";
        
        this.bloodGroups = [ {
				oid : 'A+',
				text : 'A+'
			}, {
				oid : 'A-',
				text : 'A-'
			}, {
				oid : 'A',
				text : 'A'
			}, {
				oid : 'B+',
				text : 'B+'
			}, {
				oid : 'B',
				text : 'B'
			}, {
				oid : 'B-',
				text : 'B-'
			}, {
				oid : 'O+',
				text : 'O+'
			}, {
				oid : 'O-',
				text : 'O-'
			}, {
				oid : 'AB+',
				text : 'AB+'
			}, {
				oid : 'AB-',
				text : 'AB-'
			}
		];
        
        this.getPageItemText = function(pageDataBegin, pageDataEnd, pageDataTotal, recordTypeText){
        	var pageItemText = "";
			
				pageItemText = "Showing "+pageDataBegin+
								" to "+pageDataEnd+
								" of "+pageDataTotal+
								" total "+recordTypeText+".";
			return pageItemText;       	
        };
        
        
        
    };
    
    app.service('constantService', ['$rootScope', '$cookieStore',  constantService]);

});
