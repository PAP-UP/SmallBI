
(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('loginController', loginController);

  function loginController(AuthService, $state, SweetAlert) {
    var vm = this;
    vm.dadosLogin = {};

    angular.extend(vm, {
      login: login,
      logout: logout
    });

    function login() {
      AuthService.signin(vm.dadosLogin).then(
        function (result) {
          vm.nomeUsuarioLogado = result.data.nome;
            $state.transitionTo('painel');
            SweetAlert.swal({title: "Bem vindo", timer: 2000, type: "success", showConfirmButton: false});
      }, function () {
          SweetAlert.swal("Usuário ou senha incorretos!", "", "error");
        });
    }

    function logout() {
      $state.transitionTo('index');
    }
  }
})();
