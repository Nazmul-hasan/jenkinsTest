
'use strict';

define(['app','services/utils/navigationService'], function (app) {

    var navigationService = function ($location) {
    	
		this.menuNavigation = function (navUrl) { 
			$location.path('/'+navUrl); 
		};
		
		this.showPageWithData = function (url, id) {
		    	$location.path('/'+url+'/'+id);
	    };
	    
	    this.showPageWithDataByMultiParam= function (url, id, oid) {
		    	$location.path('/'+url+'/'+id+'/'+oid);
	    };
	    
	    this.showPageWithDataByIDName= function (url, id, name) {
	    	$location.path('/'+url+'/'+id+'/'+name);
         };
	    
	   
    };
    
    app.service('navigationService', ['$location', navigationService]);

});
