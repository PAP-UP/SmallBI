(function () {
  'use strict';

  angular
    .module('SmallBIApp', [
      'ngAnimate',
      'ngResource',
      'ui.router'
    ]).config(routes, providers);

  function providers($httpProvider) {
    $httpProvider.defaults.headers.common = {};
    $httpProvider.defaults.headers.post = {};
    $httpProvider.defaults.headers.put = {};
    $httpProvider.defaults.headers.patch = {};
  }

  function routes($stateProvider, $locationProvider) {

    var baseUrl = "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/";

    $locationProvider.html5Mode(true);

    $stateProvider
      .state('inicio', {
        url: '/inicio',
        template: '<h2>Área inicial em desenvolvimento</h2>'
      });


    var usuario = {
      name: 'usuario',
      url: '/usuario',
      template: '<div ui-view class="ng-scope"></div>',
      children: [
        {
          name: 'listar',
          url: '/listar',
          templateUrl: 'scripts/usuario/usuario-lista.html',
          controller: 'usuarioListarController'
        },
        {
          name: 'editar',
          url: '/editar',
          templateUrl: 'scripts/usuario/usuario-form.html',
          controller: 'usuarioEditarController'
        },
        {
          name: 'cadastrar',
          url: '/cadastrar',
          templateUrl: 'scripts/usuario/usuario-form.html',
          controller: 'usuarioCadastrarController'
        }

        ],

    };


    $stateProvider.state(usuario);

  }

})();
