(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioCadastrarController', usuarioCadastrarController);

  function usuarioCadastrarController(usuarioResource, $scope) {

    var vm = this;

//    vm.dadosUsuario.nome = 'teste';

    var service = {
      usuarioSalvar: usuarioSalvar
    }

    return service;

     function usuarioSalvar() {
      vm.dadosUsuario = angular.copy(vm.dados);
      usuarioResource.insereUsuario(vm.dados).then(function (result) {
        console.log(result);
      },function (resolve) {
        console.log(resolve);
      });
    }
  }
})();



