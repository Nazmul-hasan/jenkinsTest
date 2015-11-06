
'use strict';

define(['app'], function (app) {
    
	 var studentRegisterStep2Controller = function ($rootScope, $scope, $log, $timeout, $route, messageService, dashboardService, 
			 constantService, navigationService, localStorageService, configurationService,ngProgress, employeeService) {
		 
		 $scope.goNext= function(){
	        	navigationService.showPageWithData('registerstudent','step3');
	        };
	        
	        $scope.goPrevious= function(){
	        	navigationService.showPageWithData('registerstudent','');
	        };
		 
	 };
	 
    app.register.controller('studentRegisterStep2Controller', ['$rootScope', '$scope', '$log', '$timeout', '$route',
          'messageService', 'dashboardService', 'constantService', 'navigationService', 
          'localStorageService','configurationService','ngProgress', 'employeeService',studentRegisterStep2Controller]);
   
	
});

