(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('funcaoListarController', funcaoListarController);

  function funcaoListarController(funcaoResource, $state, SweetAlert) {

    var vm = this;

    angular.extend(vm, {
      excluirFuncao: excluirFuncao
    });

    function listaFuncoes() {
      funcaoResource.listaFuncoes().then(function (result) {
        vm.listaFuncoes = result.data;
      });
    }

    function excluirFuncao(id) {
      funcaoResource.deleteFuncao(id).then(
        function (result) {
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
          $state.reload();
        }, function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
        });
    }

    function activate() {
      listaFuncoes();

    }

    activate();

  }
})();
