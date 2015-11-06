
'use strict';

define(['app'], function (app) {
    
    var changePasswordController = function ($scope, $location, $filter, $log, $modal,$routeParams, constantService, 
		localStorageService, confirmationService, messageService,navigationService,signInService,ngProgress) {
    	
    	ngProgress.start();
        ngProgress.complete();

    	var userInfo, promis;
    	$scope.passwordChangeObj = { };
    	
    	//$scope.userName = $routeParams.loginId;
    	$scope.PageTitle= 'Change Password Form';
    	$scope.buttonText = ' Change Password';
    	
    	$scope.changePassword = function (passwordChangeObj) {
    		
    		userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
    		if (!signInService.isBlank()) {
         		return; 
         	}
    	   else if (!signInService.isNotSame()) {
         		return; 
         	}
    		else if(!signInService.isSameValue()){
    			return;
    		}
    		else if(!signInService.checkOldPwd()){
    			return;
    		}
    	   passwordChangeObj.operation = constantService.passwordchange;
    	   passwordChangeObj.loginId = userInfo.loginId;
    	   
        	promis = signInService.doChangePassword(passwordChangeObj);
            promis.then(function (data) {
            	if (!data.success) {
                    messageService.showMessage(constantService.Danger, 'Unable to change password');
                    return;
                }
            
                messageService.showMessage(constantService.Success, 'Successfully change password');
                console.log(data.data);
                userInfo.password = data.data.password;
   		     	$scope.passwordChangeObj = { };
   		     	localStorageService.setValue(constantService.userInfoCookieStoreKey, userInfo);
   		     	
            });            
		     
		};
		
		 $scope.checkOldPassword = function(oldPassword)
			{
				if (oldPassword == '' || oldPassword == undefined) {
					$("#validaTionOldPassword").show();
					$("#validationInvalidOldPassword").hide();
					
				} else {
					$("#validaTionOldPassword").hide();
				}
			};
		 
		 $scope.checkNewPassword = function(newPassword)
			{
				if (newPassword == '' || newPassword == undefined) {
					$("#validaTionNewPassword").show();
					$("#validaTionNewPasswordLength").hide();
					
				} else {
					$("#validaTionNewPassword").hide();
				}
			
			};
			
			$scope.checkPasswordLength = function(newPassword){
				 if(newPassword.length<6){
						$("#validaTionNewPasswordLength").show();
						$("#validaTionNewPassword").hide();
					}else {
						$("#validaTionNewPasswordLength").hide();
					}
			};
			$scope.checkOldPwd = function(oldPassword){
				userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
				if(userInfo.password!==oldPassword){
					$("#validationInvalidOldPassword").show();
					$("#validaTionOldPassword").hide();
				}else {
					$("#validationInvalidOldPassword").hide();
				}
				
			};
			
			$scope.checkConfirmPassword = function(confirmPassword)
			{
				if (confirmPassword == '' || confirmPassword == undefined) {
					$("#validationConfirmPassword").show();
					$("#validationNewPwdAndConfirmPwd").hide();
				} else {
					$("#validationConfirmPassword").hide();
				}
			};
			
		
          var init = function () {
        	 
	    	};    
	    	
        init();
        
    };  
    app.register.controller('changePasswordController', ['$scope', '$location', '$filter', '$log', '$modal','$routeParams',
           'constantService', 'localStorageService', 'confirmationService', 'messageService','navigationService','signInService','ngProgress',
           changePasswordController]);

});


