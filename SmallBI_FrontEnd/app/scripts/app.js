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
      url: '/editar/:id',
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

    // PLANO ROUTE

    var listarPlanos = {
      name: 'listar',
      url: '/listar',
      templateUrl: 'scripts/plano/plano-listar.html',
      controller: 'planoListarController',
      controllerAs: 'vm'
    };

    var editarPlano = {
      name: 'editar',
      url: '/editar/:id',
      templateUrl: 'scripts/plano/plano-form.html',
      controller: 'planoEditarController',
      controllerAs: 'vm'
    };

    var cadastrarPlano = {
      name: 'cadastrar',
      url: '/cadastrar',
      templateUrl: 'scripts/plano/plano-form.html',
      controller: 'planoCadastrarController',
      controllerAs: 'vm'
    };

    stateHelperProvider.setNestedState({
      name: 'plano',
      url: '/plano',
      templateUrl: 'views/main.html',
      children: [listarPlanos, editarPlano, cadastrarPlano]
    });

      // FORMA DE PAGAMENTO ROUTE

    var listarFormas = {
      name: 'listar',
      url: '/listar',
      templateUrl: 'scripts/formaPagamento/forma-pagamento-listar.html',
      controller: 'pagamentoListarController',
      controllerAs: 'vm'
    };

    var editarForma = {
      name: 'editar',
      url: '/editar/:id',
      templateUrl: 'scripts/formaPagamento/forma-pagamento-form.html',
      controller: 'pagamentoEditarController',
      controllerAs: 'vm'
    };

    var cadastrarForma = {
      name: 'cadastrar',
      url: '/cadastrar',
      templateUrl: 'scripts/formaPagamento/forma-pagamento-form.html',
      controller: 'pagamentoCadastrarController',
      controllerAs: 'vm'
    };

    stateHelperProvider.setNestedState({
      name: 'forma-pagamento',
      url: '/forma-pagamento',
      templateUrl: 'views/main.html',
      children: [listarFormas, editarForma, cadastrarForma]
    });

  }

})();
