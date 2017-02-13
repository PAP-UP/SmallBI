(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('clienteListarController', clienteListarController);

  function clienteListarController(clienteResource) {

    var vm = this;

    angular.extend(vm, {
      listaClientes: listaClientes,
      // excluirUsuario: excluirUsuario
    });

    function listaClientes() {
      clienteResource.listaCliente().then(function (result) {
        vm.listaClientes = result.data;
      });
    }
    //
    // function excluirUsuario(id) {
    //   usuarioResource.deleteUser(id).then(
    //     function (result) {
    //       console.log(result);
    //     });
    // }

    function init() {
      listaClientes();

    }

    init();

  }
})();



