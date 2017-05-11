(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('ramoEditarController', ramoEditarController);

  function ramoEditarController(ramoResource, $stateParams, $state, $cookieStore, SweetAlert) {

    var vm = this;

    vm.id = $stateParams.id;

    var cookie = $cookieStore.get('cookie');

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
      vm.dadosRamo.usuarioId = cookie.idPerfil;
      ramoResource.alteraRamo(vm.dadosRamo).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('ramo-atividade.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }


    function activate() {
      getRamo();
    }

    activate();
  }
})();
