define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloRutas', []).controller('RutasCtrl', function ($scope,$http) {
        $('.ui.dropdown').dropdown({
            on: 'click'
        });
        setTimeout(function () {
            $('#origen').val($('#or').text());
            $('#selec').text($('#origen').val());
            $('#destino').val($('#des').text())
            $('#selec2').text($('#destino').val());
            $('#datetimepicker1').val($('#fec').text());
            setTimeout(function(){
                $http.get('/rest/rutas/listar').success(function(response){

                });
            },2000)
        },2000);

        $('#datetimepicker1').datetimepicker({
            pickTime: false
        });
        //$.vegas('destroy');

        /*$.vegas('overlay', {
            src:'/overlays/02.png',
            opacity:1
        });*/
        $('.green.link').popup({
            position : 'top right',
            title    : 'Informacion del Viaje'
        });


        $scope.animacion_bus= function () {
            $('#bus')
                .transition('scale')
            ;
            $('#bus')
                .transition('fade down')
            ;
            //$.vegas('destroy');
        };
    })
});
