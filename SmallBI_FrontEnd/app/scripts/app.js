(function () {
  'use strict';

  angular
    .module('SmallBIApp', [
      'ngAnimate',
      'ngResource',
      'ui.router',
      'ui.router.stateHelper'
    ]).config(routes);

  function routes($locationProvider, stateHelperProvider) {

    $locationProvider.html5Mode(true);


    // USUÁRIO ROUTE

    var listarUsuario = {
      name: 'listar',
      url: '/listar',
      templateUrl: 'scripts/usuario/usuario-lista.html',
      controller: 'usuarioListarController as vm',
    };

    var editarUsuario = {
      name: 'editar',
          url: '/editar/:id',
          templateUrl: 'scripts/usuario/usuario-form.html',
          controller: 'usuarioEditarController as vm',
    };

    var cadastrarUsuario = {
      name: 'cadastrar',
          url: '/cadastrar',
          templateUrl: 'scripts/usuario/usuario-form.html',
          controller: 'usuarioCadastrarController as vm',
    };

    stateHelperProvider.setNestedState({
      name: 'usuario',
      url: '/usuario',
      templateUrl: 'views/main.html',
      children: [listarUsuario, editarUsuario, cadastrarUsuario]
    });

    // CUBO ROUTE

    var listarCubo = {
      name: 'cubo',
      url: '/cubo',
      templateUrl: 'scripts/cubo/cubo-lista.html',
      controller: 'cuboListarController',
      controllerAs: 'vm'
    };

    stateHelperProvider.setNestedState({
      name: 'cubo',
      url: '/cubo',
      templateUrl: 'views/main.html',
      children: [listarCubo]
    });

    // CLIENTE ROUTE

    var listarCliente = {
      name: 'listar',
      url: '/listar',
      templateUrl: 'scripts/cliente/cliente-listar.html',
      controller: 'clienteListarController',
      controllerAs: 'vm'
    };

    var editarCliente = {
      name: 'editar',
      url: '/editar',
      templateUrl: 'scripts/cliente/cliente-form.html',
      controller: 'clienteEditarController',
      controllerAs: 'vm'
    };

    var cadastrarCliente = {
      name: 'cadastrar',
      url: '/cadastrar',
      templateUrl: 'scripts/cliente/cliente-form.html',
      controller: 'clienteCadastrarController',
      controllerAs: 'vm'
    };

    stateHelperProvider.setNestedState({
      name: 'cliente',
      url: '/cliente',
      templateUrl: 'views/main.html',
      children: [listarCliente, editarCliente, cadastrarCliente]
    });

  }

})();
