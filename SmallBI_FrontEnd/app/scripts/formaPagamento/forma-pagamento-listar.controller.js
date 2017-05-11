(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('pagamentoListarController', pagamentoListarController);

  function pagamentoListarController(pagamentoResource, $state, SweetAlert) {

    var vm = this;

    angular.extend(vm, {
      excluirPagamento: excluirPagamento
    });

    function listaPagamentos() {
      pagamentoResource.listaFormasPagamento().then(function (result) {
        vm.listaPagamentos = result.data;
      });
    }

    function excluirPagamento(id) {
      pagamentoResource.deletePagamento(id).then(
        function (result) {
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
          $state.reload();
        }, function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
        });
    }

    function activate() {
      listaPagamentos();

    }

    activate();

  }
})();



