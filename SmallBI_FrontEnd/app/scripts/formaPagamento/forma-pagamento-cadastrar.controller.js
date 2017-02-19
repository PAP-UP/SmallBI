(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('pagamentoCadastrarController', pagamentoCadastrarController);

  function pagamentoCadastrarController(pagamentoResource, $state) {

    var vm = this;

    vm.dadosPagamento = {};

    angular.extend(vm, {
      pagamentoSalvar: pagamentoSalvar,
    });


    function pagamentoSalvar() {
      vm.dadosPagamento.usuarioId = 1;

      pagamentoResource.inserePagamento(vm.dadosPagamento).then(function (result) {
        $state.transitionTo('forma-pagamento.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }

    function activate() {

    }

    activate();
  }
})();
