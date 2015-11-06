
'use strict';

define(['app'], function (app) {
    
	 var globalSettingController = function ($rootScope, $scope, $log, $timeout, $route, messageService, dashboardService, 
			 constantService, navigationService, localStorageService, configurationService,ngProgress, employeeService) {
		 
		 
		 
	 };
	 
    app.register.controller('globalSettingController', ['$rootScope', '$scope', '$log', '$timeout', '$route',
          'messageService', 'dashboardService', 'constantService', 'navigationService', 
          'localStorageService','configurationService','ngProgress', 'employeeService',globalSettingController]);
   
	
});

