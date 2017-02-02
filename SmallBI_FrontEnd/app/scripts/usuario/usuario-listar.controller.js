(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioListarController', usuarioListarController);

  function usuarioListarController(usuarioResource) {

    var vm = this;

    angular.extend(vm, {
      listaUsuarios: listaUsuarios
    });

    function listaUsuarios() {
      usuarioResource.listaUsuario().then(function (result) {
        vm.listaUsuarios = result.data;
      });
    }

    function init() {
      listaUsuarios();
    }

    init();

  }
})();



