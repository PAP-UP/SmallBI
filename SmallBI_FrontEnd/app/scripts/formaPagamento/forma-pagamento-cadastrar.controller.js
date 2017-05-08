(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('pagamentoCadastrarController', pagamentoCadastrarController);

  function pagamentoCadastrarController(pagamentoResource, $state, SweetAlert, $cookieStore) {

    var vm = this;

    vm.dadosPagamento = {};

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      pagamentoSalvar: pagamentoSalvar,
    });


    function pagamentoSalvar() {
      vm.dadosPagamento.usuarioId = cookie.idPerfil;
      pagamentoResource.inserePagamento(vm.dadosPagamento).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('forma-pagamento.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }

    function activate() {

    }

    activate();
  }
})();
