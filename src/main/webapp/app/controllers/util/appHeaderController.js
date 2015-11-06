
'use strict';

define(['app'], function (app) {
    
	 var appHeaderController = function ($rootScope, $scope,$location, localStorageService, constantService,navigationService,signInService) {
		 
		 var userInfo,promis;
		 
        $scope.collapseAppLeftMenu = function () {
        	$rootScope.layout.leftPanel.isVisible = !$rootScope.layout.leftPanel.isVisible;
        	$rootScope.isMobile = !$rootScope.isMobile;
        };
        
        $scope.showProfile = function(employeeID){
           	navigationService.showPageWithData('profile',$scope.loggedinUserInfo.employeeID);
        };
        
        $scope.showChangePasswordPage = function(employeeID){
        	navigationService.showPageWithData('changePassword',employeeID);
        };
        
        $scope.signOut = function(){
        	var userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
        	userInfo.operation = constantService.userlogout;
        	promis = signInService.doSignOut(userInfo);
            promis.then(function (data) {
                localStorageService.setValue(constantService.userInfoCookieStoreKey, null);
                $location.path('/');
            });
        };
        
        var init = function() {
			
        	userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
        	$scope.loggedinUserInfo = userInfo;
			
		};

		init();
		 
    };

    app.controller('appHeaderController', ['$rootScope', '$scope','$location','localStorageService','constantService','navigationService','signInService', appHeaderController]);
   
	
});














