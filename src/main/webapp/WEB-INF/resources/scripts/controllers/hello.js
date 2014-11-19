define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloPrincipal', []).controller('HelloCtrl', function ($scope) {

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

        $scope.capturar=function(){
            var origen=$('#origen').val();
            var destino=$('#destino').val();
            var fecha=$('#datetimepicker1').val();
            $('#or').text(origen);
            $('#des').text(destino);
            $('#fec').text(fecha);
        }


    })
});