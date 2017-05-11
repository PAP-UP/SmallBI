(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('pagamentoEditarController', pagamentoEditarController);

  function pagamentoEditarController(pagamentoResource, $stateParams, $state, $cookieStore, SweetAlert) {

    var vm = this;

    vm.id = $stateParams.id;

    var cookie = $cookieStore.get('cookie');

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
      vm.dadosPagamento.usuarioId = cookie.idPerfil;
      pagamentoResource.alteraPagamento(vm.dadosPagamento).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('forma-pagamento.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }


    function activate() {
      getPagamento();
    }

    activate();
  }
})();



