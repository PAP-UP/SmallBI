(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('clienteCadastrarController', clienteCadastrarController);

  function clienteCadastrarController(clienteResource, planoResource, pagamentoResource, ramoResource) {

    var vm = this;

    vm.dadosCliente = {};

    angular.extend(vm, {
      clienteSalvar: clienteSalvar,
      listaPlanos: listaPlanos,
      listaFormasPagamento: listaFormasPagamento
    });


    function clienteSalvar() {
      vm.dadosCliente.usuarioId = 1;
      clienteResource.insereCliente(vm.dadosCliente).then(function (result) {
        $state.transitionTo('cliente.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
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

    function init() {
      listaPlanos();
      listaFormasPagamento();
      listaRamoAtividade();
    }

    init();
  }
})();
