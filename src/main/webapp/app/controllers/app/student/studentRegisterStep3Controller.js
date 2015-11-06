
'use strict';

define(['app'], function (app) {
    
	 var studentRegisterStep3Controller = function ($rootScope, $scope, $log, $timeout, $route, messageService, dashboardService, 
			 constantService, navigationService, localStorageService, configurationService,ngProgress, employeeService) {
		 
		 $scope.goNext= function(){
	        	navigationService.showPageWithData('registerstudent','step4');
	        };
	        
        $scope.goPrevious= function(){
        	navigationService.showPageWithData('registerstudent','step2');
        };
		 
	 };
	 
    app.register.controller('studentRegisterStep3Controller', ['$rootScope', '$scope', '$log', '$timeout', '$route',
          'messageService', 'dashboardService', 'constantService', 'navigationService', 
          'localStorageService','configurationService','ngProgress', 'employeeService',studentRegisterStep3Controller]);
   
	
});

