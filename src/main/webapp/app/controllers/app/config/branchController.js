
'use strict';

define([ 'app' ], function(app) {

	 var branchController = function ($scope, $location, $filter, $log, $modal,$routeParams, constantService, 
				localStorageService, confirmationService, messageService, navigationService,branchService) {
		var userInfo, promis;
		$scope.branch = {};
		$scope.PageTitle = 'Entry Form';
		$scope.buttonText = 'Submit';
		
		var getBranchByoid = function() {
			var branchObj = {
				operation : constantService.GetByID,
				loginBean : userInfo
			};
			branchObj.branchID = $routeParams.branchID;
			promis = branchService.getBranchByoid(branchObj);
			promis.then(function(data) {
				if (!data.success) {
					messageService.showMessage(constantService.Danger, 'Unable to load branch');
					return;
				}
				$scope.branch = data.data;
				$scope.PageTitle = ' Modification Form';
				$scope.buttonText = 'Update Branch';
				$log.info(data.data);
			});
			};
    
       
       $scope.goHome = function(){
    	 navigationService.menuNavigation('dashboard');
        };
        
		$scope.saveBranch = function(Obj) {
			$scope.branch = Obj;
			$scope.branch.loginBean = userInfo;
			$scope.branch.operation = constantService.Save;
			promis = branchService.saveBranch($scope.branch);
			promis.then(function(data) {
				if (!data.success) {
					messageService.showMessage(constantService.Danger, 'Unable to save Branch');
					return;
				}
				messageService.showMessage(constantService.Success, 'Successfully saved Branch');
				$scope.wing = {};
			});
		};
		
			var init = function() {
				userInfo = localStorageService.getValue(constantService.userInfoCookieStoreKey);
				if ($routeParams.branchID == undefined || $routeParams.branchID == null || $routeParams.branchID.length == 0) {
					return;
				}
				getBranchByoid();
				$scope.buttonText = 'Update Branch';
		};

		init();

	 		};

	 app.register.controller('branchController', ['$scope', '$location', '$filter', '$log', '$modal','$routeParams',
	       'constantService', 'localStorageService', 'confirmationService', 'messageService','navigationService','branchService',
	       branchController]);

	                                     });