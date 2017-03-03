
(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('loginController', loginController);

  function loginController(AuthService) {

    var vm = this;

    vm.dadosPerfil = {};

    angular.extend(vm, {
      login: login
    });

    function login() {
      AuthService.signin().then(function () {

      }, function () {

      });
    }

    function activate() {

    }

    activate();
  }
})();
