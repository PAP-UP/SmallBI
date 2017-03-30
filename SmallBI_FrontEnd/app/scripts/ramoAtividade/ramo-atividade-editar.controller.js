(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('ramoEditarController', ramoEditarController);

  function ramoEditarController(ramoResource, $stateParams, $state) {

    var vm = this;

    vm.id = $stateParams.id;

    angular.extend(vm, {
      ramoSalvar: ramoSalvar
    });

    function getRamo() {
      ramoResource.getRamoById(vm.id).then(
        function (result) {
          vm.dadosRamo = result.data;
        }, function (resolve) {

        });
    }

    function ramoSalvar() {
      vm.dadosRamo.usuarioId = 1;

      ramoResource.alteraRamo(vm.dadosRamo).then(function (result) {
        $state.transitionTo('ramo-atividade.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }


    function activate() {
      getRamo();
    }

    activate();
  }
})();
