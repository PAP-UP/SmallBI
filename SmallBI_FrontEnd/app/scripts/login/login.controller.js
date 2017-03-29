
(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('loginController', loginController);

  function loginController(AuthService, $state, SweetAlert) {
    var vm = this;
    vm.dadosLogin = {};

    angular.extend(vm, {
      login: login
    });

    function login() {
      AuthService.signin(vm.dadosLogin).then(
        function (result) {
        $state.transitionTo('painel');
          SweetAlert.swal({title: "Bem vindo", timer: 2000, type: "success", showConfirmButton: false});
      }, function () {
          SweetAlert.swal("Usuário ou senha incorretos!", "", "error");
      });
    }
  }
})();
