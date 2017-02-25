(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('perfilCadastrarController', perfilCadastrarController);

  function perfilCadastrarController(perfilResource, $state) {

    var vm = this;

    vm.dadosPerfil = {};

    angular.extend(vm, {
      perfilSalvar: perfilSalvar,
    });


    function perfilSalvar() {
      vm.dadosFuncao.usuarioId = 1;

      perfilResource.inserePerfil(vm.dadosPerfil).then(function (result) {
        $state.transitionTo('perfil.listar');
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }

    function activate() {

    }

    activate();
  }
})();
