(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('clienteListarController', clienteListarController);

  function clienteListarController(clienteResource, $state) {

    var vm = this;

    angular.extend(vm, {
      listaClientes: listaClientes,
      excluirCliente: excluirCliente
    });

    function listaClientes() {
      clienteResource.listaCliente().then(function (result) {
        vm.listaClientes = result.data;
      });
    }

    function excluirCliente(id) {
      clienteResource.deleteCliente(id).then(
        function (result) {
          console.log(result.data);
          $state.reload();
        });
    }

    function init() {
      listaClientes();

    }

    init();

  }
})();



