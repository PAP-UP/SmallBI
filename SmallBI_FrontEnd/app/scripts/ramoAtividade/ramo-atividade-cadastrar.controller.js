(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('ramoCadastrarController', ramoCadastrarController);

  function ramoCadastrarController(ramoResource, $state) {

    var vm = this;

    vm.dadosRamo = {};

    angular.extend(vm, {
      ramoSalvar: ramoSalvar,
    });


    function ramoSalvar() {
      vm.dadosRamo.usuarioId = 1;

      ramoResource.insereRamo(vm.dadosRamo).then(function (result) {
        $state.transitionTo('ramo.listar');
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