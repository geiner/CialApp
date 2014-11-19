define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloReservaAsiento', []).controller('ReservaAsientoCtrl', function ($scope) {
        //$.vegas('destroy');
        $('.ui.checkbox')
            .checkbox()
        ;
        /*$.vegas('overlay', {
            src:'/overlays/02.png',
            opacity:1
        });*/

        $scope.EliminarAciento=function(){
            $('.small.modal').modal('show');
            /**/
        }
    })
});