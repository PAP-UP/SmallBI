(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('perfilEditarController', perfilEditarController);

  function perfilEditarController(perfilResource, $stateParams, $state, $cookieStore, SweetAlert) {

    var vm = this;

    vm.id = $stateParams.id;

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      perfilSalvar: perfilSalvar
    });

    function getPerfil() {
      perfilResource.getPerfilById(vm.id).then(
        function (result) {
          vm.dadosPerfil = result.data;
        }, function (resolve) {

        });
    }

    function perfilSalvar() {
      vm.dadosPerfil.usuarioId = cookie.idPerfil;
      perfilResource.alteraPerfil(vm.dadosPerfil).then(
        function (result) {
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('perfil.listar');
      },function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }


    function activate() {
      getPerfil();
    }

    activate();
  }
})();
