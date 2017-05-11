(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioListarController', usuarioListarController);

  function usuarioListarController(usuarioResource, $state, $cookieStore, SweetAlert) {

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
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
          $state.reload();
      }, function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
        });
    }

    function init() {
      listaUsuarios();

    }

    init();

  }
})();



