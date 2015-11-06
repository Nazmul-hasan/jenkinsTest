
'use strict';


define(['app', 'services/utils/constantService'], function (app) {

    var languageService = function ($rootScope, constantService) {
    	
    	this.languageChange = function () {
            $rootScope.$broadcast(constantService.LanguageChange, constantService.LanguageChange);
        };
    	
    };
    
    app.factory('languageService', ['$rootScope', 'constantService', languageService]);

});


