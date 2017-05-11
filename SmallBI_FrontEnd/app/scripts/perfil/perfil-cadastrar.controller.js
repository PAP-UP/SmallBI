(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('perfilCadastrarController', perfilCadastrarController);

  function perfilCadastrarController(perfilResource, $state, $cookieStore, SweetAlert) {

    var vm = this;

    vm.dadosPerfil = {};

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      perfilSalvar: perfilSalvar,
    });


    function perfilSalvar() {
      vm.dadosPerfil.usuarioId = cookie.idPerfil;
      perfilResource.inserePerfil(vm.dadosPerfil).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('perfil.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }

    function activate() {

    }

    activate();
  }
})();
