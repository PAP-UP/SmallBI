(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('funcaoEditarController', funcaoEditarController);

  function funcaoEditarController(funcaoResource, $stateParams, $state) {

    var vm = this;

    vm.id = $stateParams.id;

    angular.extend(vm, {
      funcaoSalvar: funcaoSalvar
    });

    function getFuncao() {
      funcaoResource.getFuncaoById(vm.id).then(
        function (result) {
          vm.dadosFuncao = result.data;
        }, function (resolve) {

        });
    }

    function funcaoSalvar() {
      vm.dadosFuncao.usuarioId = 1;

      funcaoResource.alteraFuncao(vm.dadosFuncao).then(function (result) {
        $state.transitionTo('funcao.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }


    function activate() {
      getFuncao();
    }

    activate();
  }
})();