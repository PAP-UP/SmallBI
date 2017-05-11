(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('clienteCadastrarController', clienteCadastrarController);

  function clienteCadastrarController(clienteResource, planoResource, pagamentoResource, ramoResource, SweetAlert, funcaoResource) {

    var vm = this;

    vm.dadosCliente = {};
    vm.dadosUsuario = {};
    vm.idCliente = '';
    vm.showButton = false;

    angular.extend(vm, {
      clienteSalvar: clienteSalvar,
      listaPlanos: listaPlanos,
      listaFormasPagamento: listaFormasPagamento,
      usuarioSalvar: usuarioSalvar,
      avancarModal: avancarModal
    });


    function clienteSalvar() {
      clienteResource.insereCliente(vm.dadosCliente).then(function (result) {
        vm.showButton = true;
        vm.idCliente = result.data.idCliente;
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }

    function usuarioSalvar() {
      vm.dadosUsuario.usuarioId = 1,
        vm.dadosUsuario.idCliente = vm.idCliente,
        vm.dadosUsuario.idPerfil = 2

      usuarioResource.insereUsuario(vm.dadosUsuario).then(
        function (result) {
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
          $state.transitionTo('usuario.listar');
        },function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
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

    function listarFuncao() {
      funcaoResource.listaFuncoes().then(
        function (result) {
          vm.dadosFuncao = result.data;
        });
    }

    function avancarModal() {
      $(this).hide();
      $("#tituloModalCadastrar").html("dados do usuário");
      $("#areaEmpresaModal").hide();
      $("#areaUsuarioModal").css({"display": "block"});
      $("#btnEnviar").hide();
      $("#cadastrarModal").css({"display": "block"});

    }

    function activate() {
      listaPlanos();
      listaFormasPagamento();
      listaRamoAtividade();
      listarFuncao();
    }

    activate();
  }
})();
