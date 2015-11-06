
'use strict';

define(['app'], function (app) {

	var branchService = function ($resource, $q, configurationService,messageService,constantService) {
		
		var branchResource, delay;
        
		branchResource = $resource(configurationService.branchRestUrl, {}, {
			getAllBranches :   { method: 'POST'},
			saveBranch	   :   { method: 'POST'} ,
			getBranchByoid :   { method: 'POST'}
           
        });
		
        this.getAllBranches = function (obj){
        	delay = $q.defer();
        	branchResource.getAllBranches(obj,function(data){
        		delay.resolve(data);
        		},function (){
        		delay.reject('Unable to fetch..');
        	});
        	return delay.promise;
        };
        this.saveBranch = function (obj){
        	delay = $q.defer();
        	branchResource.saveBranch(obj,function(data){
        		delay.resolve(data);
        		},function (){
        		delay.reject('Unable to fetch..');
        	});
        	return delay.promise;
        };
        this.getBranchByoid = function (obj){
        	delay = $q.defer();
        	branchResource.getBranchByoid(obj,function(data){
        		delay.resolve(data);
        		},function (){
        		delay.reject('Unable to fetch..');
        	});
        	return delay.promise;
        };
        
    };
    
    app.service('branchService', ['$resource', '$q', 'configurationService','messageService','constantService', branchService]);

});

