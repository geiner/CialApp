define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloPrincipal', []).controller('HelloCtrl', function ($scope,$http) {

        $('.ui.dropdown').dropdown({
            on: 'click'
        });

        $('#datetimepicker1').datetimepicker({
            pickTime: false
        });

        /*$("#immersive_slider").immersive_slider({
            container: ".main"
        });*/
        /*$.vegas('slideshow', {
            opacity:0.1,
            valign:'50%',
            delay:4000,
            backgrounds:[
                { src:'/img/img1.jpg', fade:3000 },
                { src:'/img/img2.jpg', fade:3000 },
                { src:'/img/img3.jpg', fade:3000 }
            ]
        })('overlay');*/
        /*$.vegas('overlay', {
            src:'/overlays/02.png',
            opacity:1
        });*/

        $scope.animacion_bus= function () {
            $('#bus')
                .transition('scale')
            ;
            $('#bus')
                .transition('fade down')
            ;
            //$.vegas('/destroy');
        };
        $scope.login=function(){
            $('.demo.sidebar')
                .sidebar('toggle')
            ;
        };

        $scope.capturar=function(buss){
            var busAsignado={};
            busAsignado=buss;
            busAsignado.origen=$('#origen').val();
            busAsignado.destino=$('#destino').val();
            busAsignado.datetimepicker1=$('#datetimepicker1').val();
            $http.get('/rest/buss/hello', {
                    params: {
                        idS: busAsignado.origen,
                        idL:  busAsignado.destino,
                        fecha: busAsignado.datetimepicker1
                    }
                }).success(function(data, status, headers, config) {
                    console.dir("busquedad exitosa");
                }).
                error(function(data, status, headers, config) {

                });
        }


    })
});