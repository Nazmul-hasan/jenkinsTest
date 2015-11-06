
'use strict';

define(['services/utils/routeResolver'], function () {

	var app = angular.module('metricaApp', ['localization', 'ngRoute', 'ngAnimate', 'ngResource', 
              'ngCookies', 'ui.bootstrap', 'ui', 'highcharts-ng', 'routeResolverServices', 'underscore',
              'wc.Directives', 'wc.Animations','ngTable','ngProgress']);

	app.run(['$rootScope', '$route', '$http', '$location', '$cookieStore', 'localStorageService','constantService', 'localize',
	         function ($rootScope, $route, $http, $location, $cookieStore, localStorageService, constantService, localize) {	
		
		var userInfo;
		//localize.setLanguage('bn-BD');
		localize.setLanguage('en-US');	               
        //$rootScope.selectedLanguage = constantService.English;
        //$rootScope.showLanguage = constantService.Bangla;
		$rootScope.isMobile = false;
		$rootScope.messagePageLocation = 'app/partials/message.html';
		
		$rootScope.$on("$routeChangeStart", function (oldPath, newPath) {
			$rootScope.pageTitle = newPath.$$route.title;
	        if (newPath.$$route == undefined || newPath.$$route.isWeb) {
	            $rootScope.layout = constantService.getWebLayout();
	            return;
	        }
	       
	        userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
	        if(userInfo === undefined || userInfo === null){
	            $rootScope.layout = constantService.getWebLayout();
	            $location.path('/');
	            return;
	        }
	        $rootScope.layout = constantService.getAppLayout();
	    });
    
	}]); 

	app.config(['$routeProvider','routeResolverProvider','$controllerProvider', '$compileProvider', 
	            '$filterProvider', '$provide', '$locationProvider', '$httpProvider',  
	         function ($routeProvider,routeResolverProvider, $controllerProvider, $compileProvider, 
	        	$filterProvider, $provide, $locationProvider, $httpProvider) {
		 
				
		app.register =
	    {
	        controller: $controllerProvider.register,
	        //directive: $compileProvider.directive,
	        filter: $filterProvider.register,
	        //factory: $provide.factory,
	        //service: $provide.service
	    };
		
		// Provider-based service.
        app.service = function( name, constructor ) {
            $provide.service( name, constructor );
            return( this );
        };
        
        // Provider-based factory.
        app.factory = function( name, factory ) {
            $provide.factory( name, factory );
            return( this );
        };
        
        // Provider-based directive.
        app.directive = function( name, factory ) {
            $compileProvider.directive( name, factory );
            return( this );
        };
     
		var route = routeResolverProvider.route;
		$routeProvider
		
		//routing											page and controller name prefix, 			dirpath,				title, 					isWeb
        .when('/', 											route.resolve('signin', 					'security/',			'Signin', 				true))
        .when('/dashboard', 								route.resolve('dashboard', 					'app/dashboard/', 		'Dashboard', 			false))
        .when('/registerstudent', 							route.resolve('studentRegister', 			'app/student/', 		'Student Register',     false))
        .when('/registerstudent/step2', 					route.resolve('studentRegisterStep2', 	    'app/student/', 		'Student Register',     false))
        .when('/registerstudent/step3', 					route.resolve('studentRegisterStep3', 	    'app/student/', 		'Student Register',     false))
        .when('/registerstudent/step4', 					route.resolve('studentRegisterStep4', 	    'app/student/', 		'Student Register',     false))
        .when('/viewstudent', 							    route.resolve('studentDetail', 			    'app/student/', 		'Student Detail',       false))
        .when('/studentreport', 							route.resolve('studentReport', 			    'app/student/', 		'Student Report',       false))
        .when('/attendanceregister', 						route.resolve('attendanceRegister', 		'app/student/', 		'Attendance Register',  false))
        .when('/attendancereport', 						    route.resolve('attendanceReport', 		    'app/student/', 		'Attendance Report',    false))
        .when('/leave', 						            route.resolve('leave', 		                'app/student/', 		'Leave',                false))
        .when('/parents', 						            route.resolve('parents', 		            'app/student/', 		'Parents',              false))
        .when('/studentrecordhistory', 						route.resolve('studentRecordHistory', 		'app/student/', 		'Student Record History',false))
        .when('/addemployee', 			                    route.resolve('addemployee', 		        'app/employees/', 		'Add Employee',         false))
        .when('/employees', 			                    route.resolve('employees', 		            'app/employees/', 		'Employees',            false))
        .when('/employeereport', 			                route.resolve('employeeReport', 		    'app/employees/', 		'Employees Report',     false))
        .when('/employeeattendance', 			            route.resolve('employeeAttendance', 		'app/employees/', 		'Employee Attendance',  false))
        .when('/manageleave', 			                    route.resolve('manageLeave', 		        'app/employees/', 		'Manage Leave',         false))
        .when('/classmanagement', 			                route.resolve('classManagment', 		    'app/config/', 		    'Class Management',     false))
        .when('/subjectmanagment', 			                route.resolve('subjectManagment', 		    'app/config/', 		    'Subject Management',   false))
        .when('/accesscontrol', 			                route.resolve('accessControl', 		        'app/config/', 		    'Access Control',       false))
        .when('/branches', 			                		route.resolve('branches', 		            'app/config/', 		    'Branch list',          false))
        .when('/branch', 			                		route.resolve('branch', 		            'app/config/', 		    'Branch ',              false))
        .when('/branch/:branchID', 			                route.resolve('branch', 		            'app/config/', 		    'Branch Edit',          false))
        .when('/gloabalsetting', 			                route.resolve('globalSetting', 		        'app/config/', 		    'Global Setting',       false))
        .when('/studentcatagory', 			                route.resolve('studentCategory', 		    'app/config/', 		    'Student Category',     false))
        .when('/classtransfer', 			                route.resolve('studentCategory', 		    'app/config/', 		    'Student Category',     false))
        .when('/menuiteams', 			                    route.resolve('menuIteams', 		        'app/config/', 		    'Menu Iteams',          false))
        .when('/manageemail', 			                    route.resolve('manageEmail', 		        'app/config/', 		    'Manage Email',         false))
        .when('/mergemultipleaccount', 			            route.resolve('mergeMultipleAccount', 		'app/config/', 		    'Merge Multiple Account',false))
        .when('/additionaladmissionfield', 			        route.resolve('additionalAddmissionfiled', 	'app/config/', 		    'Additional Addmission filed',false))
        .when('/studentinteraction', 			            route.resolve('studentInteraction', 	    'app/config/', 		    'Student Interaction',  false))
        
        .otherwise({ redirectTo: '/' }); 
		
	}]);


	return app;

});



    
    
    
    
    