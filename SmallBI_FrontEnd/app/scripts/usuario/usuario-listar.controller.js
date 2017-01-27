(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioListarController', usuarioListarController);

  function usuarioListarController($scope, usuarioResource) {


    var service = {
      // adicionarUsuario: adicionarUsuario
    }

    return service;


    function activate() {
      listarUsuarios();
    }

    function listarUsuarios() {
      usuarioResource.listaUsuario().then(function (result) {
        $scope.data = result.data;
      });
    }

    // function adicionarUsuario() {
    //   clienteService.insereCliente(item).then(
    //     function (result) {
    //       $scope.msgSucesso = true;
    //     }, function (response) {
    //
    //     });
    // }

    activate();
  }
})();



