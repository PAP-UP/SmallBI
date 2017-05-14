
(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('painelController', painelController);

  function painelController($state, $cookieStore) {
    var vm = this;

    var cookie = $cookieStore.get('cookie');
    vm.nomeUsuarioLogado = cookie.nome;
    vm.permissao = cookie.idPerfil;

    angular.extend(vm, {
      logout : logout
    });

    function logout() {
      $state.transitionTo('index', {}, {reload: true, inherit: false, notify: true});
    }
  }
})();
