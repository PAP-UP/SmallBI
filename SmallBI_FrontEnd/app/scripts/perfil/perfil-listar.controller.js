(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('perfilListarController', perfilListarController);

  function perfilListarController(perfilResource, $state, SweetAlert) {

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
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
          $state.reload();
        }, function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
        });
    }

    function activate() {
      listaPerfil();

    }

    activate();

  }
})();
