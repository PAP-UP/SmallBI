(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('clienteEditarController', clienteEditarController);

  function clienteEditarController(clienteResource, planoResource, pagamentoResource, ramoResource, $state, $cookieStore, SweetAlert) {

    var vm = this;

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      clienteSalvar: clienteSalvar
    });

    function getCliente() {
      clienteResource.getClienteById(cookie.idCliente).then(
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
      vm.dadosCliente.usuarioId = cookie.idPerfil;
      clienteResource.alteraCliente(vm.dadosCliente).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('cliente.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
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



