(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('clienteCadastrarController', clienteCadastrarController);

  function clienteCadastrarController(clienteResource, planoResource, pagamentoResource, ramoResource, SweetAlert, funcaoResource, estadoResource) {

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
      avancarModal: avancarModal,
      listaCidadeByIdEstado: listaCidadeByIdEstado
    });


    function clienteSalvar() {
        vm.dadosCliente.usuarioId = 1;
        vm.dadosCliente.idPerfil = 2;
      vm.dadosCliente.idCidade = vm.dadosCliente.Cidade.idCidade;
      delete vm.dadosCliente.Cidade;

      
      clienteResource.insereCliente(vm.dadosCliente).then(
        function (result) {
          $('#modalCadastrar').hide();
        SweetAlert.swal({title: result.data.message, timer: 2000, type: "success", showConfirmButton: false});
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

    function listarEstado() {
      estadoResource.listaEstado().then(
        function(result){
          vm.listaEstados = result.data;
      }, function(resolve){

        })
    }

    function listaCidadeByIdEstado(id) {
      estadoResource.getCidadeByIdEstado({'idEstado': id}).then(
        function (result) {
          vm.listaCidades = result.data;
      }, function (resolve) {

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
      listarEstado();
    }

    activate();
  }
})();
