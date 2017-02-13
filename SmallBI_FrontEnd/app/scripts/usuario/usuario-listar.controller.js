(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioListarController', usuarioListarController);

  function usuarioListarController(usuarioResource) {

    var vm = this;

    angular.extend(vm, {
      listaUsuarios: listaUsuarios,
      excluirUsuario: excluirUsuario
    });

    function listaUsuarios() {
      usuarioResource.listaUsuario().then(function (result) {
        vm.listaUsuarios = result.data;
      });
    }

    function excluirUsuario(id) {
      usuarioResource.deleteUser(id).then(
        function (result) {
        console.log(result);
      });
    }

    function init() {
      listaUsuarios();

    }

    init();

  }
})();



