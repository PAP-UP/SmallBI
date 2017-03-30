(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('perfilEditarController', perfilEditarController);

  function perfilEditarController(perfilResource, $stateParams, $state) {

    var vm = this;

    vm.id = $stateParams.id;

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
      vm.dadosPerfil.usuarioId = 1;

      perfilResource.alteraPerfil(vm.dadosPerfil).then(function (result) {
        $state.transitionTo('perfil.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }


    function activate() {
      getPerfil();
    }

    activate();
  }
})();
