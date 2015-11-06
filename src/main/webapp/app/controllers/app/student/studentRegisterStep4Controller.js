
'use strict';

define(['app'], function (app) {
    
	 var studentRegisterStep4Controller = function ($rootScope, $scope, $log, $timeout, $route, messageService, dashboardService, 
			 constantService, navigationService, localStorageService, configurationService,ngProgress, employeeService) {
		 
		 
		 $scope.goPrevious= function(){
	        	navigationService.showPageWithData('registerstudent','step3');
	        };
	 };
	 
    app.register.controller('studentRegisterStep4Controller', ['$rootScope', '$scope', '$log', '$timeout', '$route',
          'messageService', 'dashboardService', 'constantService', 'navigationService', 
          'localStorageService','configurationService','ngProgress', 'employeeService',studentRegisterStep4Controller]);
   
	
});

