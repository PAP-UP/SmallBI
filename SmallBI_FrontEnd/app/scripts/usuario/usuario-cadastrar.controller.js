(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioCadastrarController', usuarioCadastrarController);

  function usuarioCadastrarController(usuarioResource, funcaoResource) {

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
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }

    function listarFuncao() {
      funcaoResource.listaFuncao().then(
        function (result) {
          vm.dadosFuncao = result.data;
        });
    }

    function init() {
      listarFuncao();
    }

    init();
  }
})();



