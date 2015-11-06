
'use strict';

define(['app'], function (app) {
    
	 var languageController = function ($rootScope, $scope,languageService) {
		 
		   $rootScope.selectLanguage = function () {

	            if ($rootScope.selectedLanguage == constantService.English) {	            	
	                localize.setLanguage('bn-BD');
	                $rootScope.selectedLanguage = constantService.Bangla;
	                $rootScope.showLanguage = constantService.English;
	            }
	            else {	               
	                localize.setLanguage('en-US');	               
	                $rootScope.selectedLanguage = constantService.English;
	                $rootScope.showLanguage = constantService.Bangla;
	            }	           
	            languageService.languageChange();
	        };       
		 
 	};

 	
    app.register.controller('languageController', ['$rootScope', '$scope', 'languageService',languageController]);
   
	
});














