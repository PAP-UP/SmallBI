(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioListarController', usuarioListarController);

  function usuarioListarController(usuarioResource, $state) {

    var vm = this;

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      listaUsuarios: listaUsuarios,
      excluirUsuario: excluirUsuario
    });

    function listaUsuarios() {
      usuarioResource.listaUsuario(cookie.idCliente).then(function (result) {
        vm.listaUsuarios = result.data;
      });
    }

    function excluirUsuario(id) {
      usuarioResource.deleteUser(id).then(
        function (result) {
        console.log(result);
        $state.reload();
      });
    }

    function init() {
      listaUsuarios();

    }

    init();

  }
})();



