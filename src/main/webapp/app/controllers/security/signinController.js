
'use strict';

define(['app'], function (app) {
    
	 var signinController = function ($rootScope, $scope, _, $log, $timeout, $http, $cookieStore,$location, signInService, 
		 navigationService, localStorageService, configurationService, constantService, authorizationService, 
		 messageService) {
		 
		 var promis;
		$scope.user = { loginid : 'monjur', password : '1234' };
       
		 $scope.signIn = function (login) {
			 
			 if(!checkLoginForm(login))
				 {
				 	return;
				 }
			 login.operation = constantService.userlogin;
			 promis = signInService.doSignIn(login);
			 promis.then(function (data) {
				 var test=data.data;
				 console.log(test);
				 if (!data.success) {
					 if(data.message == 'Invalid login ID')
						 {
						 	$("#validationinvalidloginid").show();
						 	return;
						 }
					 if(data.message == 'Invalid Password')
						 {
						 	$("#validationinvalidpassword").show();
						 	return;
						 }
					 return;
					 
				 }
				 localStorageService.setValue(constantService.userInfoCookieStoreKey, data.data);
				 navigationService.menuNavigation("dashboard");
			 });
		 };

		 $scope.signOut = function(){
	        	var userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
	        	userInfo.operation = constantService.userlogout;
	        	promis = signInService.doSignOut(login);
	            promis.then(function (data) {
	                localStorageService.setValue(constantService.userInfoCookieStoreKey, null);
	                $location.path('/');
	            });
	        };
		 
		 $scope.signOut = function () {
		 	authorizationService.signOut();
		 };
        

		 $scope.checkloginid = function(loginid)
			{
				if (loginid == '' || loginid == undefined) {
					$("#validationloginid").show();
					$("#validationinvalidloginid").hide();
					
				} else {
					$("#validationloginid").hide();
				}
			};
		 
 		$scope.checkloginpwd = function(loginpwd)
			{
				if (loginpwd == '' || loginpwd == undefined) {
					$("#validationloginpwd").show();
					$("#validationinvalidpassword").hide();
					
				} else {
					$("#validationloginpwd").hide();
				}
			};
	 
		};
		
		var checkLoginForm=function(login) {

			var b = new Boolean(true);
        	
        	if(login == null || login == undefined){
        		$("#validationloginid").show();
        		$("#validationloginpwd").show();
				 return;
			 }
        	
        	if (login.loginid === '' || login.loginid === undefined || login.loginid === null) {
        		
        		$("#validationloginid").show();
        		b = false;
        		
        	} else {
        		$("#validationloginid").hide();
        	}
        	
        	if (login.password === '' || login.password === undefined || login.password === null ) {
        		
        		$("#validationloginpwd").show();
        		b = false;
        	} else {
        		$("#validationloginpwd").hide();
        	}
        	
        	
        	return b;
        } 

 	
    app.register.controller('signinController', ['$rootScope', '$scope', '_','$log', '$timeout', '$http', '$cookieStore','$location', 
        'signInService', 'navigationService', 'localStorageService', 'configurationService','constantService', 
        'authorizationService', 'messageService', signinController]);
   
	
});














