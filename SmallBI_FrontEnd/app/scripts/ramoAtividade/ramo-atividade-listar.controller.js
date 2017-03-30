(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('ramoListarController', ramoListarController);

  function ramoListarController(ramoResource, $state) {

    var vm = this;

    angular.extend(vm, {
      excluirRamo: excluirRamo
    });

    function listaRamos() {
      ramoResource.listaRamos().then(function (result) {
        vm.listaRamos = result.data;
      });
    }

    function excluirRamo(id) {
      ramoResource.deleteRamo(id).then(
        function (result) {
          console.log(result);
          $state.reload();
        });
    }

    function activate() {
      listaRamos();

    }

    activate();

  }
})();