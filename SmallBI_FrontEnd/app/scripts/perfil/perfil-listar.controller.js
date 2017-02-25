(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('perfilListarController', perfilListarController);

  function perfilListarController(perfilResource, $state) {

    var vm = this;

    angular.extend(vm, {
      excluirPerfil: excluirPerfil
    });

    function listaPerfil() {
      perfilResource.listaPerfil().then(function (result) {
        vm.listaPerfil = result.data;
      });
    }

    function excluirPerfil(id) {
      perfilResource.deletePerfil(id).then(
        function (result) {
          console.log(result);
          $state.reload();
        });
    }

    function activate() {
      listaPerfil();

    }

    activate();

  }
})();
