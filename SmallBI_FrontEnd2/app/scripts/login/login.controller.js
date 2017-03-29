
(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('loginController', loginController);

  function loginController(AuthService) {
    var vm = this;
    vm.dadosLogin = {};

    angular.extend(vm, {
      login: login
    });

    function login() {
      AuthService.signin(vm.dadosLogin).then(
        function () {

      }, function () {

      });
    }

    function activate() {

    }

    activate();
  }
})();
