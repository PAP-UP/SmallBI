(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('pagamentoEditarController', pagamentoEditarController);

  function pagamentoEditarController(pagamentoResource, $stateParams, $state) {

    var vm = this;

    vm.id = $stateParams.id;

    angular.extend(vm, {
      pagamentoSalvar: pagamentoSalvar
    });

    function getPagamento() {
      pagamentoResource.getPagamentoById(vm.id).then(
        function (result) {
          vm.dadosPagamento = result.data;
        }, function (resolve) {

        });
    }

    function pagamentoSalvar() {
      vm.dadosPagamento.usuarioId = 1;

      pagamentoResource.alteraPagamento(vm.dadosPagamento).then(function (result) {
        $state.transitionTo('forma-pagamento.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }


    function activate() {
      getPagamento();
    }

    activate();
  }
})();



