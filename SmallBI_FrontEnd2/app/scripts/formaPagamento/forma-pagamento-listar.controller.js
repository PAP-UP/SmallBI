(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('pagamentoListarController', pagamentoListarController);

  function pagamentoListarController(pagamentoResource, $state) {

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
          console.log(result);
          $state.reload();
        });
    }

    function activate() {
      listaPagamentos();

    }

    activate();

  }
})();



