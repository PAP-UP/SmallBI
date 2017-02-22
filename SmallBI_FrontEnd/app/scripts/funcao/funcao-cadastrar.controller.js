(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('funcaoCadastrarController', funcaoCadastrarController);

  function funcaoCadastrarController(ramoResource, $state) {

    var vm = this;

    vm.dadosFuncao = {};

    angular.extend(vm, {
      funcaoSalvar: funcaoSalvar,
    });


    function funcaoSalvar() {
      vm.dadosFuncao.usuarioId = 1;

      funcaoResource.insereFuncao(vm.dadosFuncao).then(function (result) {
        $state.transitionTo('funcao.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }

    function activate() {

    }

    activate();
  }
})();