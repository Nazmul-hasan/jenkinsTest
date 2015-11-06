
'use strict';

define(['app'], function (app) {
    
	 var studentRegisterController = function ($rootScope, $scope, $log, $timeout, $route, messageService, dashboardService, 
			 constantService, navigationService, localStorageService, configurationService,ngProgress, employeeService) {
		 
		 $scope.goNext= function(){
	        	navigationService.showPageWithData('registerstudent','step2');
	        };
		 
	 };
	 
    app.register.controller('studentRegisterController', ['$rootScope', '$scope', '$log', '$timeout', '$route',
          'messageService', 'dashboardService', 'constantService', 'navigationService', 
          'localStorageService','configurationService','ngProgress', 'employeeService',studentRegisterController]);
   
	
});

