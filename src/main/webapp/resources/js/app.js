/*
 * Aplicación: Rropero
 * Fecha desarrollo: 19/Septiembre/2016
 * Elaborado por: Pilar Hdez.
 */

// Aplicación
var rroperoApp = angular.module('rroperoApp', ['ngRoute']);
var rroperoLogin = angular.module('rroperoLogin',[]);

// Rutas para la aplicacion
rroperoApp.config(['$routeProvider', function($routeProvider){
    $routeProvider
    .when('/',{templateUrl: "inventario/template/inventario/main"})
    .when('/ver',{templateUrl: "inventario/template/inventario/ver"})
    .when('/registrar',{templateUrl: "inventario/template/inventario/registrar"})
    .when('/actualizar',{templateUrl: "inventario/template/inventario/actualizar"});
}]);