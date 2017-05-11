(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('planoEditarController', planoEditarController);

  function planoEditarController(planoResource, $stateParams, $state, $cookieStore, SweetAlert) {

    var vm = this;

    vm.id = $stateParams.id;

    var cookie = $cookieStore.get('cookie');

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
      vm.dadosPlano.usuarioId = cookie.idPerfil;

      planoResource.alteraPlano(vm.dadosPlano).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('plano.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }


    function activate() {
      getPlano();
    }

    activate();
  }
})();



