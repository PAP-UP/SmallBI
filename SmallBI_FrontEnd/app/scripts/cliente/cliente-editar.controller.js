(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('clienteEditarController', clienteEditarController);

  function clienteEditarController(clienteResource, $stateParams, planoResource, pagamentoResource, ramoResource, $state) {

    var vm = this;

    vm.id = $stateParams.id;

    angular.extend(vm, {
      clienteSalvar: clienteSalvar
    });

    function getCliente() {
      clienteResource.getClienteById(vm.id).then(
        function (result) {
          vm.dadosCliente = result.data;
        }, function (resolve) {

        });
    }

    function listaPlanos() {
      planoResource.listaPlanos().then(function (result) {
        vm.dadosPlano = result.data;
      });
    }

    function listaFormasPagamento() {
      pagamentoResource.listaFormasPagamento().then(function (result) {
        vm.dadosFormaPagamento = result.data;
      });
    }

    function listaRamoAtividade() {
      ramoResource.listaRamos().then(function (result) {
        vm.dadosRamoAtividade = result.data;
      });
    }

    function clienteSalvar() {
      vm.dadosCliente.usuarioId = 1;
      clienteResource.alteraCliente(vm.dadosCliente).then(function (result) {
        $state.transitionTo('cliente.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }


    function activate() {
      getCliente();
      listaPlanos();
      listaFormasPagamento();
      listaRamoAtividade();
    }

    activate();
  }
})();



