define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloReservaAsiento', []).controller('ReservaAsientoCtrl', function ($scope, $http) {
        //$.vegas('destroy');
        $('.ui.checkbox')
            .checkbox()
        ;
        /*$.vegas('overlay', {
         src:'/overlays/02.png',
         opacity:1
         });*/
        $scope.asientosseleccionados=[]
        $scope.bs1 = {
        };


        $http.get('/rest/bus/primerlist/' + $('#codi_bus').text().trim() + '/traer').success(function (response) {
            $scope.bs1 = response;
        });
        $http.get('/rest/bus/segundolist/' + $('#codi_bus').text().trim() + '/traer').success(function (response) {
            $scope.bs2 = response;
        });
        $http.get('/rest/bus/tercerolist/' + $('#codi_bus').text().trim() + '/traer').success(function (response) {
            $scope.bs3 = response;
        });
        $http.get('/rest/bus/cuartolist/' + $('#codi_bus').text().trim() + '/traer').success(function (response) {
            $scope.bs4 = response;
        });

        $scope.EliminarAciento = function () {
            $('.small.modal').modal('show');
            /**/
        };

        $scope.almacenar = function (cod_aciento,num_aciento) {
//            alert(cod_aciento);
            if($('#'+cod_aciento).hasClass("nada")){
                $('#'+cod_aciento).addClass("green")
                $('#'+cod_aciento).removeClass("nada")
                $('#seleccion').append('<tr id="tr_'+cod_aciento+'">'+
                    '<td><div class="ui green button">'+num_aciento+'</div></td>'+
                '<td>120.00</td>'+
                '<td><div class="3 fluid red ui vertical animated tiny button" ng-click="EliminarAciento()">'+
                    '<div class="hidden content">Eliminar</div>'+
                    '<div class="visible content">'+
                        '<i class="trash icon"></i>'+
                    '</div>'+
                '</div></td>'+
                '</tr>');

                $scope.asientosseleccionados.push(cod_aciento);
                for(var i=0;i<$scope.asientosseleccionados.length;i++){
                    console.log($scope.asientosseleccionados[i]);
                }
            }else{
                if($('#'+cod_aciento).hasClass("green")){
                    $('#'+cod_aciento).addClass("nada")
                    $('#'+cod_aciento).removeClass("green")
                    $('#tr_'+cod_aciento).remove();
                    $scope.asientosseleccionados.splice($scope.asientosseleccionados.indexOf(cod_aciento),1);
                    for(var i=0;i<$scope.asientosseleccionados.length;i++){
                        console.log($scope.asientosseleccionados[i]);
                    }
                }
            }
        };

        $scope.guardar_asientos=function(){
            var todos="";
            for(var i=0;i<$scope.asientosseleccionados.length;i++){
                if(i==$scope.asientosseleccionados.length-1){
                    todos=todos+$scope.asientosseleccionados[i]
                }else{
                    todos=todos+$scope.asientosseleccionados[i]+"-"
                }
            };
//            console.log(todos)
//            $('#asientos').text(todos);
        }

    })
});