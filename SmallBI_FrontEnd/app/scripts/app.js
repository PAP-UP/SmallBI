(function () {
  'use strict';

  angular
    .module('SmallBIApp', [
      'ngAnimate',
      'ngResource',
      'ui.router'
    ]).config(routes);

  // function providers($httpProvider) {
  //   $httpProvider.defaults.headers.common = {};
  //   $httpProvider.defaults.headers.post = {};
  //   $httpProvider.defaults.headers.put = {};
  //   $httpProvider.defaults.headers.patch = {};
  // }

  function routes($stateProvider, $locationProvider) {

    var baseUrl = "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/";

    $locationProvider.html5Mode(true);


    var usuario = {
      name: 'usuario',
      url: '/usuario',
      templateUrl: 'scripts/usuario/usuario-lista.html',
      controller: 'usuarioListarController',
      controllerAs: 'vm'
      // children: [
      //   {
      //     name: 'listar',
      //     url: '/listar',
      //     templateUrl: 'scripts/usuario/usuario-lista.html',
      //     controller: 'usuarioListarController',
      //     controllerAs: 'vm'
      //   },
      //   {
      //     name: 'editar',
      //     url: '/editar',
      //     templateUrl: 'scripts/usuario/usuario-form.html',
      //     controller: 'usuarioEditarController',
      //     controllerAs: 'vm'
      //   },
      //   {
      //     name: 'cadastrar',
      //     url: '/cadastrar',
      //     templateUrl: 'scripts/usuario/usuario-form.html',
      //     controller: 'usuarioCadastrarController',
      //     controllerAs: 'vm'
      //   }
      //
      //   ],

    };

    var cubo = {
      name: 'cubo',
      url: '/cubo',
      templateUrl: 'scripts/cubo/cubo-lista.html',
      controller: 'cuboListarController',
      controllerAs: 'vm'
    };

    $stateProvider.state(usuario);
    $stateProvider.state(cubo);

  }

})();
