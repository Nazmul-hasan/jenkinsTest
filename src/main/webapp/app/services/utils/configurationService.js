
'use strict';

define(['app'], function (app) {

    var configurationService = function ($rootScope) {
    	
    	this.server = '192.168.0.231';
        this.port = ':8080';
        
        // Local Host
        this.app = '/Charisma/rest/';
        
        // Cloud Foundry
    	//this.app = '/rest/';
        
        this.baseUrl = 'http://' + this.server + this.port + this.app;
    	this.wsBaseUrl = 'ws://' + this.server + this.port +'/Charisma/';
    	this.loginMetaData = 'loginMetaData';
		this.dashboard = this.app + 'dashboard';
		this.login = this.app + 'security/useraccess';
		
		this.employeeRestUrl = this.app + 'json/employee/post';		
		this.allEmployeesRestUrl = this.app + 'json/allEmployees/post';
		this.profileRestUrl = this.app + 'json/profile/post';
		this.wsDashboard = this.wsBaseUrl + 'websocketservice';
		this.branchRestUrl = this.app + 'json/branch/post';
		
		

    };
    
    
    
    app.service('configurationService', ['$rootScope', configurationService]);

});


