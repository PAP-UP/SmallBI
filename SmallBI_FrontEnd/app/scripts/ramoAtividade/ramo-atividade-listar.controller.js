(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('ramoListarController', ramoListarController);

  function ramoListarController(ramoResource, $state, SweetAlert) {

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
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
          $state.reload();
        }, function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
        });
    }

    function activate() {
      listaRamos();
    }

    activate();

  }
})();
