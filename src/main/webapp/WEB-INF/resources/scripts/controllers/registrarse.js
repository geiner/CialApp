define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloRegistrarse', []).controller('RegistrarseCtrl', function ($scope) {

        //$.vegas('destroy');
        $('.ui.dropdown').dropdown({
            on: 'click'
        });
        /*$.vegas('overlay', {
            src:'/overlays/02.png',
            opacity:1
        });*/
        $('.ui.radio.checkbox')
            .checkbox()
        ;
        $('.ui.checkbox')
            .checkbox()
        ;

    })
});