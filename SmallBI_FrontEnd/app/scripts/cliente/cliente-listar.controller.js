(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('clienteListarController', clienteListarController);

  function clienteListarController(clienteResource, $state, SweetAlert) {

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
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
          $state.reload();
        }, function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
        });
    }

    function init() {
      listaClientes();

    }

    init();

  }
})();



