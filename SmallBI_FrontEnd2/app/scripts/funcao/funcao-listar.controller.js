(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('funcaoListarController', funcaoListarController);

  function funcaoListarController(funcaoResource, $state) {

    var vm = this;

    angular.extend(vm, {
      excluirFuncao: excluirFuncao
    });

    function listaFuncoes() {
      funcaoResource.listaFuncoes().then(function (result) {
        vm.listaFuncoes = result.data;
      });
    }

    function excluirFuncao(id) {
      funcaoResource.deleteFuncao(id).then(
        function (result) {
          console.log(result);
          $state.reload();
        });
    }

    function activate() {
      listaFuncoes();

    }

    activate();

  }
})();
