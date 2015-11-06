
'use strict';

define(['app'], function (app) {

    var employeeFilter = function () {

        return function (employess, filterValue) {
            if (!filterValue) return employess;

            var matches = [];
            filterValue = filterValue.toLowerCase();
            for (var i = 0; i < employess.length; i++) {
                var employee = employess[i];
                /*if (employee.employeeID.toLowerCase().indexOf(filterValue) > -1 ||
                    employee.employeeType.toLowerCase().indexOf(filterValue) > -1 ||
                    employee.employeeName.toLowerCase().indexOf(filterValue) > -1 ||
                    employee.paymentType.toLowerCase().indexOf(filterValue) > -1) {
                    matches.push(employee);
                }*/
                if (employee.name.toLowerCase().indexOf(filterValue) > -1) {
                    matches.push(employee);
                }
            }
            return matches;
        };
    };

    app.filter('employeeFilter', employeeFilter);

});