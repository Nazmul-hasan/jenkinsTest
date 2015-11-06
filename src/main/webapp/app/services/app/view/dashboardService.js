
'use strict';

define(['app'], function (app) {

	var dashboardService = function ($rootScope, $resource, $q, $cookieStore, constantService, configurationService) {
		
		var dashboardResource, delay, getCallsCount;
	    
		dashboardResource = $resource(configurationService.dashboard, {}, {
			getCallsCount: { method: 'POST' }
		});
		
		this.getCallsCount = function (obj) {
		        delay = $q.defer();
		        dashboardResource.getCallsCount(obj, function (data) {
		            delay.resolve(data);
		        }, function () {
		            delay.reject('Unable to fetch..');
		    });
		    return delay.promise;
		};
		
	
    };
    
    app.service('dashboardService', ['$rootScope', '$resource', '$q', '$cookieStore', 'constantService', 
           'configurationService', dashboardService]);

});

