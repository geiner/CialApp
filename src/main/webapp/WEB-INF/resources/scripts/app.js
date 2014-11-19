define(['angular','controllers/hello','controllers/registrarse','controllers/ingresar','controllers/rutas',
        'controllers/regAciento','controllers/reserva_asiento','controllers/agencias','controllers/terminos_condiciones',
        'controllers/compra_pasajes','controllers/ayuda','controllers/historia','controllers/mision','controllers/vision'],
    function(angular,HelloCtrl,RegistrarseCtrl,IngresarCtrl,RutasCtrl,RegAcientoCtrl,ReservaAsientoCtrl,AgenciasCtrl,TerminosCondicionesCtrl,
             CompraPasajesCtrl,AyudaCtrl,HistoriaCtrl,MisionCtrl,VisionCtrl){
    'use strict';

    angular.module('cialApp',['ModuloPrincipal','ModuloRegistrarse','ModuloIngresar','ModuloRutas','ModuloAciento','ModuloReservaAsiento',
        'ModuloAgencias','ModuloTerminosCondiciones','ModuloCompraPasajes','ModuloAyuda','ModuloHistoria','ModuloVision','ModuloMision',
        'ngCookies','ngResource','ngSanitize','ngRoute','ngAnimate','ngTouch'])
        .config(function ($routeProvider) {
            $routeProvider
                .when('/hello', {
                    templateUrl: 'resources/views/hello.html',
                    controller: 'HelloCtrl'
                })
                .when('/registrarse', {
                    templateUrl: 'resources/views/registrarse.html',
                    controller: 'RegistrarseCtrl'
                })
                .when('/ingresar', {
                    templateUrl: 'resources/views/ingresar.html',
                    controller: 'IngresarCtrl'
                })
                .when('/rutas', {
                    templateUrl: 'resources/views/rutas.html',
                    controller: 'RutasCtrl'
                })
                .when('/regAciento', {
                    templateUrl: 'resources/views/regAciento.html',
                    controller: 'RegAcientoCtrl'
                })
                .when('/reserva_asiento', {
                    templateUrl: 'resources/views/reserva_asiento.html',
                    controller: 'ReservaAsientoCtrl'
                })

                .when('/agencias', {
                    templateUrl: 'resources/views/agencias.html',
                    controller: 'AgenciasCtrl'
                })

                .when('/terminos_condiciones', {
                    templateUrl: 'resources/views/terminos_condiciones.html',
                    controller: 'TerminosCondicionesCtrl'
                })

                .when('/compra_pasajes', {
                    templateUrl: 'resources/views/compra_pasajes.html',
                    controller: 'CompraPasajesCtrl'
                })

                .when('/ayuda', {
                    templateUrl: 'resources/views/ayuda.html',
                    controller: 'AyudaCtrl'
                })

                .when('/historia', {
                    templateUrl: 'resources/views/historia.html',
                    controller: 'HistoriaCtrl'
                })

                .when('/mision', {
                    templateUrl: 'resources/views/mision.html',
                    controller: 'MisionCtrl'
                })

                .when('/vision', {
                    templateUrl: 'resources/views/vision.html',
                    controller: 'VisionCtrl'
                })

                .otherwise({
                    redirectTo: '/hello'
                });
        });
});