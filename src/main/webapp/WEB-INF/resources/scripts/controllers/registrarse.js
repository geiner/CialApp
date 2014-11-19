define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloRegistrarse', []).controller('RegistrarseCtrl', function ($scope,$http) {

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

        $scope.registrarse=function(usuario){
            var user={};
            user=usuario;
            user.sexo=$('#sexo').val();
//            usuario.sexo=$('#sexo').val();
            alert(user.sexo);
            $http.post('/rest/usuario/registrar', user).
                success(function(data, status, headers, config) {
                    alert("registro exitoso")
                }).
                error(function(data, status, headers, config) {

                });
        }

    })
});