(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioEditarController', usuarioEditarController);

  function usuarioEditarController(usuarioResource, $stateParams, funcaoResource, estadoResource) {

    var vm = this;

    vm.id = $stateParams.id;

    angular.extend(vm, {
      usuarioSalvar: usuarioSalvar
    });

    function getUser() {
      usuarioResource.getUserById(vm.id).then(
        function (result) {
            vm.dadosUsuario = result.data;
      }, function (resolve) {

      });
    }

    function listarFuncao() {
      funcaoResource.listaFuncao().then(
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


    function activate() {
      getUser();
      listarFuncao();
      //listarEstado();
    }

    activate();
  }
})();



