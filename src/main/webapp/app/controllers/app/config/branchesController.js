
'use strict';

define(['app'], function (app) {
    
	 var branchesController = function ($rootScope, $scope, $log, $timeout,$routeParams, $route,$filter,ngTableParams, messageService, dashboardService, 
			 constantService, navigationService, localStorageService, configurationService,branchService ,ngProgress) {
		 
		 
		 var promis, userInfo;
			
			$scope.branches = [];
	        $scope.totalRecords = 0;
	        $scope.pageSize = 10;
	        $scope.pagesNum=0;
	        $scope.itemsPerPage = 5;
	        $scope.currentPage = 1;
	        $scope.branch = { };
	        $scope.maxPageNumber=0;
	        
	              
			$scope.filteredBranches = [];
	        $scope.filteredTotalRecords = 0;
	        $scope.ngTableBranches = [];
	        $scope.ngTableTotalRecords = 0;
	        $scope.cardClients = [];
	        $scope.cardTotalRecords = 0;
	               
	        $scope.pageDataBegin = 0;
	        $scope.pageDataEnd = 0;
	        $scope.pageDataTotal = 0;
	        $scope.pageItemText = "";
	        
			
	
			
		     $scope.goHome = function(){
		    	 navigationService.menuNavigation('dashboard');
		     };
		     
		     $scope.showAddNewBranch = function(){
		    	 navigationService.menuNavigation('branch');
	         };
		     
		     $scope.editBranchData = function(obj){
		    	 navigationService.showPageWithData('branch', obj.branchID);
   		    };
		   
		     var filterBranches = function (filterText) {
					$scope.filteredBranches = $filter("branchFilter")($scope.branches, filterText);
					$scope.filteredTotalRecords =  Math.ceil($scope.filteredBranches.length);
					//$scope.cardClients = $scope.filteredClients;
					if($scope.tableParams != undefined){
						$scope.ngTableBranches = $scope.filteredBranches;
						$scope.ngTableTotalRecords =  $scope.filteredTotalRecords;
						$scope.tableParams.reload();
					}     	
				
					$scope.itemRows = constantService.Row;
					$scope.pageDataTotal = $scope.filteredTotalRecords;
					if($scope.pageDataTotal == 0){
						$scope.pageDataBegin = 0;
						$scope.pageDataEnd = 0;        		    		
					}
					else{
						$scope.pageDataBegin = (($scope.currentPage - 1) * $scope.pageSize) + 1;
						$scope.pageDataEnd = $scope.pageDataBegin + $scope.pageSize - 1;    		
					}
					
					if($scope.pageDataTotal != 0 && $scope.pageDataEnd > $scope.pageDataTotal)
					{
						$scope.pageDataEnd = $scope.pageDataTotal
					}  
					$scope.pageItemText = constantService.getPageItemText($scope.pageDataBegin, $scope.pageDataEnd, 
							$scope.pageDataTotal,"Branches");
				};
				
				var createWatches = function () {
	        	$scope.$watch("searchText", function (filterText) {
	        		filterBranches(filterText);
	            	$scope.currentPage = 1;
	            });
	            
	            $scope.$watch("pageSize", function (filterText) {
	            	
	            	if($scope.tableParams != undefined){
	                	$scope.tableParams.count($scope.pageSize);
	            		$scope.tableParams.reload();
	            	}
	            });
	            
	            $scope.$watch('currentPage + pageSize', function() {
	    	    	var begin = (($scope.currentPage - 1) * $scope.pageSize), end = begin + ($scope.pageSize - 0);
	    	    	
	    	    	//$scope.cardClients = $scope.filteredClients.slice(begin, end);
	    	    	if($scope.tableParams != undefined){
	    	        	$scope.tableParams.page($scope.currentPage);
	    	    		$scope.tableParams.reload();
	    	    	}
	    	    	$scope.pageDataTotal = $scope.filteredTotalRecords;
	    	    	if($scope.pageDataTotal == 0)
	    			{
	    	    		$scope.pageDataBegin = 0;
	    	        	$scope.pageDataEnd = 0;        		    		
	    			}
	    	    	else
	    			{
	    	    		$scope.pageDataBegin = begin + 1;
	    	        	$scope.pageDataEnd = end;
	    			}
	    	    	if($scope.pageDataTotal != 0 && $scope.pageDataEnd > $scope.pageDataTotal)
	    	    	{
	    	    		$scope.pageDataEnd = $scope.pageDataTotal
	    	    	}
	    	    	           	
	    	    		$scope.pageItemText = constantService.getPageItemText($scope.pageDataBegin, $scope.pageDataEnd, 
	    	    											$scope.pageDataTotal,"Branches");
	    	    	            	 
	    	    });
	    	 };
	    	 var getBranchList = function(){
	    		 
	 			var branchObj = {operation:constantService.GetAll,loginBean:userInfo};
	 			promis = branchService.getAllBranches(branchObj);
	 			promis.then(function(data){
	 				if(!data.success){
	 					messageService.showMessage(constantService.Danger,'There is no Branch Available ');
	 					return;
	 				}
	 				$scope.branches = data.data;
	 				console.log($scope.branches);
	 				$scope.totalRecords =  Math.ceil($scope.branches.length);
	 				filterBranches('');	
	 				$scope.ngTableBranches = $scope.branches;
	 					$scope.ngTableTotalRecords =  Math.ceil($scope.branches.length); 
	 					$scope.tableParams = new ngTableParams({
	 			        page: $scope.currentPage,            // show first page
	 			        count: $scope.pageSize,  			// count per page
	 			        
	 			    }, {
	 			        total: 1, // length of data
	 			        counts: [],
	 			        defaultSort : 'asc',
	 			        getData: function($defer, params) {			        	
	 			        	var orderedData = params.sorting() ? $filter('orderBy')($scope.ngTableBranches, params.orderBy()) : $scope.ngTableBranches;
	                         $defer.resolve(orderedData.slice((params.page() - 1) * params.count(), params.page() * params.count()));
	 			        }
	 			    },{
	 			        counts: [] // hides page sizes
	 			    });    
	 			});
	 			
	 		};
		  
			var init = function(){
				userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
					getBranchList();
				    createWatches();
	  			
			};
			
			init();
	 };
	 
    app.register.controller('branchesController', ['$rootScope', '$scope', '$log', '$timeout','$routeParams', '$route',
          '$filter','ngTableParams','messageService', 'dashboardService', 'constantService', 'navigationService', 
          'localStorageService','configurationService','branchService','ngProgress', branchesController]);
   
	
});

