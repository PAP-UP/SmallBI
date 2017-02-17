(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('planoCadastrarController', planoCadastrarController);

  function planoCadastrarController(planoResource, $state) {

    var vm = this;

    vm.dadosPlano = {};

    angular.extend(vm, {
      planoSalvar: planoSalvar,
    });


    function planoSalvar() {
      vm.dadosPlano.usuarioId = 1;

      planoResource.inserePlano(vm.dadosPlano).then(function (result) {
        $state.transitionTo('plano.listar');
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
