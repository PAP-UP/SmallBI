(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioListarController', usuarioListarController);

  function usuarioListarController(usuarioResource) {

    var vm = this;

    function init() {
      usuarioResource.listaUsuario().then(function (result) {
        vm.listaUsuarios = result.data;
      });
    }

    init();

  }
})();



