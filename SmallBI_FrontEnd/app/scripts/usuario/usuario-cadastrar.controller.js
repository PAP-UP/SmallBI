(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioCadastrarController', usuarioCadastrarController);

  function usuarioCadastrarController(usuarioResource, funcaoResource, estadoResource, $state) {

    var vm = this;

    vm.dadosUsuario = {};

    angular.extend(vm, {
      usuarioSalvar: usuarioSalvar,
      listarFuncao: listarFuncao
    });


    function usuarioSalvar() {
      vm.dadosUsuario.usuarioId = 1,
        vm.dadosUsuario.idCliente = 1,
        vm.dadosUsuario.usuarioSaiku = 'none',
        vm.dadosUsuario.idPerfil = 1

      usuarioResource.insereUsuario(vm.dadosUsuario).then(function (result) {
        $state.transitionTo('usuario.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
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
        function (result) {
          vm.dadosEstado = result.data;
        });
    }

    function init() {
      listarFuncao();
      //listarEstado();
    }

    init();
  }
})();
