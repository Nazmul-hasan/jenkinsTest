
'use strict';

define(['app'], function (app) {
    
	 var leaveController = function ($rootScope, $scope, $log, $timeout, $route, messageService, dashboardService, 
			 constantService, navigationService, localStorageService, configurationService,ngProgress, employeeService) {
		 
		 
		 
	 };
	 
    app.register.controller('leaveController', ['$rootScope', '$scope', '$log', '$timeout', '$route',
          'messageService', 'dashboardService', 'constantService', 'navigationService', 
          'localStorageService','configurationService','ngProgress', 'employeeService',leaveController]);
   
	
});

