define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloIngresar', []).controller('IngresarCtrl', function ($scope) {

        //$.vegas('destroy');
        /*$.vegas('overlay', {
            src:'/overlays/02.png',
            opacity:1
        });*/
        $('.ui.checkbox')
            .checkbox()
        ;

        $('#log')
            .form({
                user: {
                    identifier : 'user',
                    rules: [
                        {
                            type   : 'empty',
                            prompt : 'Please enter a username'
                        }
                    ]
                },
                password: {
                    identifier : 'password',
                    rules: [
                        {
                            type   : 'empty',
                            prompt : 'Please enter a password'
                        }
                    ]
                }
            })
        ;

        $scope.doLogin=function(){
            alert($scope.username);
        }
    })
});