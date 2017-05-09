(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioListarController', usuarioListarController);

  function usuarioListarController(usuarioResource, $state, $cookieStore) {

    var vm = this;

    var cookie = $cookieStore.get('cookie');

    var obj = {
      'idCliente' : cookie.idCliente
    }

    angular.extend(vm, {
      listaUsuarios: listaUsuarios,
      excluirUsuario: excluirUsuario
    });

    function listaUsuarios() {
      usuarioResource.listaUsuario(obj).then(function (result) {
        vm.listaUsuarios = result.data;
      }, function (resolve) {
        console.log(resolve);
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



