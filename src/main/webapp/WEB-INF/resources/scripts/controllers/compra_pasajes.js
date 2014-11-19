/**
 * Created by esantiago on 07/11/2014.
 */

define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloCompraPasajes', []).controller('CompraPasajesCtrl', function ($scope) {
        $('.ui.dropdown').dropdown({
            on: 'click'
        });

        $('#datetimepicker1').datetimepicker({
            pickTime: false
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
