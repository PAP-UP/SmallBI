(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('planoListarController', planoListarController);

  function planoListarController(planoResource, $state) {

    var vm = this;

    angular.extend(vm, {
      excluirPlano: excluirPlano
    });

    function listaPlanos() {
      planoResource.listaPlanos().then(function (result) {
        vm.listaPlanos = result.data;
      });
    }

    function excluirPlano(id) {
      planoResource.deletePlano(id).then(
        function (result) {
          console.log(result);
          $state.reload();
        });
    }

    function activate() {
      listaPlanos();

    }

    activate();

  }
})();



