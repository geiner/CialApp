/**
 * Created by esantiago on 06/11/2014.
 */
define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloAciento', []).controller('RegAcientoCtrl', function ($scope) {

        /*$('.selection.dropdown').dropdown({
            on: 'click'
        });*/
        /*$.vegas('overlay', {
            src:'/overlays/02.png',
            opacity:1
        });*/
//        $scope.datos={}
//        alert($('#asientos').text());
        $scope.todos=$('#asientos').text().split("-");
        for(var i=0;i<$scope.todos.length;i++){
            console.log($scope.todos[i]);
        };
        setTimeout(function(){
            $('.selection.dropdown').dropdown({
                on: 'click'
            });
        },2000);

        $('.ui.checkbox').checkbox({
        });

        $scope.aceptarPago=function(){


            $('.small.modal').modal('show');
            /**/
        }



    })
});
