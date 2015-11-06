
require.config({
    baseUrl: 'app',
    urlArgs: 'v=1.0'
});

require(
    [
     	'animations/listAnimations',
        'app',
        'directives/wcUnique',
        'directives/wcOverlay',
        'directives/ngEnter',
        'directives/partnerSwitch',
        'directives/decimalMask',
        'directives/datepicker',
        'directives/chosen',
         //'directives/showErrors',
        'services/utils/modalService',
        'services/utils/routeResolver',
        'services/utils/constantService',
        'services/utils/configurationService',
        'services/utils/localStorageService',
        'services/utils/navigationService',
        'services/utils/authorizationService',
        'services/utils/languageService',
        'services/utils/menuService',
        'services/utils/confirmationService',
        'services/utils/messageService',
        'services/utils/cookiesService',
       // 'services/utils/LoadService',
        'services/app/security/signInService',
        'services/app/view/dashboardService',
        /*'services/app/view/partnerService',*/
        'services/app/view/employeesService',
        'services/app/view/branchService',
       
        'filters/branchFilter',
        'controllers/util/appHeaderController',
        'controllers/util/appLeftMenuController',
        'controllers/util/messageController'
    ],
function () {
    angular.bootstrap(document, ['metricaApp']);
});

