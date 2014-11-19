/**
 * Created by esantiago on 06/11/2014.
 */
define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloAciento', []).controller('RegAcientoCtrl', function ($scope) {

        $('.selection.dropdown').dropdown({
            on: 'click'
        });
        /*$.vegas('overlay', {
            src:'/overlays/02.png',
            opacity:1
        });*/

        $('.ui.checkbox').checkbox({
        });

        $scope.aceptarPago=function(){
            $('.small.modal').modal('show');
            /**/
        }



    })
});
