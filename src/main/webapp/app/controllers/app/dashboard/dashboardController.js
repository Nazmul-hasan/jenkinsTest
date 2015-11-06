
'use strict';

define(['app'], function (app) {
    
	 var dashboardController = function ($rootScope, $scope, $log, $timeout, $route, messageService, dashboardService, 
			 constantService, navigationService, localStorageService, configurationService,ngProgress, employeeService) {
		 
	var promis,userInfo;
		 ngProgress.start();
	     ngProgress.complete();
		var categories=[];
		var chartdata=[];
		
	     $scope.highchartsNG = {
	    	        options: {
		    	            chart: {
			    	                type: 'column'
		    	            	   },
		    	            xAxis: {
		    	                    categories: categories
		    	                    	//["Java","DotNet","Oralce","PHP","WPSI"]
		    	                   },
		    	           yAxis: {
		    	                    min: 0,
		    	                    title: {
		    	                        text: 'Number of Employees',
			    	                        style: {
			    	                            fontSize: '14px',
			    	                            //color: '#000000',
			    	                            fontWeight: 'normal'
	    	                       				},
		    	                    		},
    	                    labels: {
		    	                    formatter: function() {
		    	                        return this.value;
		    	                    		}
    	                    		}
		    	                },
	    	                plotOptions: {
	    	                    line: {
	    	                        dataLabels: {
	    	                            enabled: false
	    	                        },
	    	                        enableMouseTracking: false
	    	                    }
	    	                },
	    	                tooltip: {
	    	                    enabled: true,
	    	                    formatter: function () {
	    	                        return '<b>' +
	    	                            this.x + ': ' + this.y;
	    	                    }
	    	                },
		    	                
	    	                legend: {
	    	                	 enabled: false
	    	                }

	    	        },
	    	        series: [{
	    	            data: chartdata
	    	            	//[30, 32, 12, 8, 7]
	    	        }],
	    	        title: {
	    	            text: 'Teamwise employees chart'
	    	        },
	    	        credits: {
	                    enabled: false
	                },
	                
	    	        loading: false
	    	    }
	     /**/
	     var getTeamewiseEmployee = function() {
				var employeeObj = {
					operation : constantService.GetTeamwiseEmplyee,
					loginBean : userInfo
				};
				
				promis = employeeService.getAllEmployees(employeeObj);
				promis.then(function(data) {
					
					if (!data.success) {
						messageService.showMessage(constantService.Danger, 'Unable to load Employee');
						return;
					}
					  angular.forEach(data.data, function(obj) {						 
						  categories.push(obj.name);
						  chartdata.push(obj.numberOfEmployee);
					    });
				});
			};
						
				
	     
	 	var load = function () {
	 		userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
	 		getTeamewiseEmployee();
	 		
	 	};

	    load();
	 };
	 
    app.register.controller('dashboardController', ['$rootScope', '$scope', '$log', '$timeout', '$route',
          'messageService', 'dashboardService', 'constantService', 'navigationService', 
          'localStorageService','configurationService','ngProgress', 'employeeService',dashboardController]);
   
	
});

