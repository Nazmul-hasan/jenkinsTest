
'use strict';

define(['app'], function (app) {

	var employeeService = function ($resource, $q, configurationService) {
		
		var employeeResource, delay;
        
		employeeResource = $resource(configurationService.employeeRestUrl, {}, {
            saveEmployee: 	 				{ method: 'POST'},
            getAllEmployees: 				{ method: 'POST'},
            getEmployeeByID: 				{ method: 'POST'},
            changeStatus:	 				{ method: 'POST'},
            getEmployeeWithID: 				{ method: 'POST'},
           
            
        });
        
        
        this.saveEmployee = function (obj) {
            delay = $q.defer();
            employeeResource.saveEmployee(obj, function (data) {
                delay.resolve(data);
            }, function () {
                delay.reject('Unable to fetch..');
            });
            return delay.promise;
        };
        
        
        
        this.getAllEmployees = function (obj) {
            delay = $q.defer();
            employeeResource.getAllEmployees(obj, function (data) {
                delay.resolve(data);
            }, function () {
                delay.reject('Unable to fetch..');
            });
            return delay.promise;
        };
        
        this.getEmployeeByID = function (obj) {
            delay = $q.defer();
            employeeResource.getEmployeeByID(obj, function (data) {
                delay.resolve(data);
            }, function () {
                delay.reject('Unable to fetch..');
            });
            return delay.promise;
        };
        
        this.changeStatus = function (obj) {
            delay = $q.defer();
            employeeResource.changeStatus(obj, function (data) {
                delay.resolve(data);
            }, function () {
                delay.reject('Unable to fetch..');
            });
            return delay.promise;
        };
        
        this.getEmployeeWithID = function (obj) {
            delay = $q.defer();
            employeeResource.getEmployeeWithID(obj, function (data) {
                delay.resolve(data);
            }, function () {
                delay.reject('Unable to fetch..');
            });
            return delay.promise;
        };
        
        
        
    };
    
    app.service('employeeService', ['$resource', '$q', 'configurationService', employeeService]);

});

