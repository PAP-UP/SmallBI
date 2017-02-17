(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('planoEditarController', planoEditarController);

  function planoEditarController(planoResource, $stateParams, $state) {

    var vm = this;

    vm.id = $stateParams.id;

    angular.extend(vm, {
      planoSalvar: planoSalvar
    });

    function getPlano() {
      planoResource.getPlanoById(vm.id).then(
        function (result) {
          vm.dadosPlano = result.data;
        }, function (resolve) {

        });
    }

    function planoSalvar() {
      vm.dadosPlano.usuarioId = 1;

      planoResource.alteraPlano(vm.dadosPlano).then(function (result) {
        $state.transitionTo('plano.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }


    function activate() {
      getPlano();
    }

    activate();
  }
})();



