(function () {
  'use strict';

  angular
    .module('SmallBIApp', [
      'ngAnimate',
      'ngCookies',
      'ngResource',
      'ngSanitize',
      'ngTouch',
      'ui.router',
      'ui.router.stateHelper',
      'oitozero.ngSweetAlert',
      'ui.mask',
      'selectAutocomplete',
      'ui.bootstrap'
    ]).config(routes).run(autentica);

  function autentica($rootScope, AuthService, $location, $cookieStore, $state) {
    $rootScope.$on('$stateChangeStart',function(evt,next,current, previous){
      if(next.name !== 'index'){
        AuthService.getToken(next.name).then(
          function () {
            //$state.transitionTo(next.name);
        }, function () {
            if(previous.name === "") {
              $state.transitionTo('index');
            }else {
              $state.transitionTo(previous.name);
            }
          });
      }else {
        $cookieStore.remove('cookie');
      }
    });
  }

  function routes($locationProvider, stateHelperProvider, $urlRouterProvider) {

    $locationProvider.html5Mode(true);
    $urlRouterProvider.otherwise('index');

// USUÁRIO ROUTE
    var listarUsuario = {
      name: 'listar',
      url: '/listar',
      templateUrl: 'scripts/usuario/usuario-lista.html',
      controller: 'usuarioListarController as vm',
      authorize: true
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
      name: 'listar',
      url: '/listar',
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

    // RAMO DE ATIVIDADE ROUTE
    var listarRamo = {
      name: 'listar',
      url: '/listar',
      templateUrl: 'scripts/ramoAtividade/ramo-atividade-listar.html',
      controller: 'ramoListarController',
      controllerAs: 'vm'
    };

    var editarRamo = {
      name: 'editar',
      url: '/editar/:id',
      templateUrl: 'scripts/ramoAtividade/ramo-atividade-form.html',
      controller: 'ramoEditarController',
      controllerAs: 'vm'
    };

    var cadastrarRamo = {
      name: 'cadastrar',
      url: '/cadastrar',
      templateUrl: 'scripts/ramoAtividade/ramo-atividade-form.html',
      controller: 'ramoCadastrarController',
      controllerAs: 'vm'
    };

    stateHelperProvider.setNestedState({
      name: 'ramo-atividade',
      url: '/ramo-atividade',
      templateUrl: 'views/main.html',
      children: [listarRamo, editarRamo, cadastrarRamo]
    });

    // FUNÇÃO ROUTE
    var listarFuncao = {
      name: 'listar',
      url: '/listar',
      templateUrl: 'scripts/funcao/funcao-listar.html',
      controller: 'funcaoListarController',
      controllerAs: 'vm'
    };

    var editarFuncao = {
      name: 'editar',
      url: '/editar/:id',
      templateUrl: 'scripts/funcao/funcao-form.html',
      controller: 'funcaoEditarController',
      controllerAs: 'vm'
    };

    var cadastrarFuncao = {
      name: 'cadastrar',
      url: '/cadastrar',
      templateUrl: 'scripts/funcao/funcao-form.html',
      controller: 'funcaoCadastrarController',
      controllerAs: 'vm'
    };

    stateHelperProvider.setNestedState({
      name: 'funcao',
      url: '/funcao',
      templateUrl: 'views/main.html',
      children: [listarFuncao, editarFuncao, cadastrarFuncao]
    });

    // PERFIL ROUTE
    var listarPerfil = {
      name: 'listar',
      url: '/listar',
      templateUrl: 'scripts/perfil/perfil-listar.html',
      controller: 'perfilListarController',
      controllerAs: 'vm'
    };

    var editarPerfil = {
      name: 'editar',
      url: '/editar/:id',
      templateUrl: 'scripts/perfil/perfil-form.html',
      controller: 'perfilEditarController',
      controllerAs: 'vm'
    };

    var cadastrarPerfil = {
      name: 'cadastrar',
      url: '/cadastrar',
      templateUrl: 'scripts/perfil/perfil-form.html',
      controller: 'perfilCadastrarController',
      controllerAs: 'vm'
    };

    stateHelperProvider.setNestedState({
      name: 'perfil',
      url: '/perfil',
      templateUrl: 'views/main.html',
      children: [listarPerfil, editarPerfil, cadastrarPerfil]
    });

    // ASSISTENTE ROUTE
    var assistente = {
      name: 'assistenteImportacao',
      url: '/assistenteImportacao',
      templateUrl: 'scripts/assistente/assistente.html',
      controller: 'assistenteController',
      controllerAs: 'vm'
    };

    stateHelperProvider.setNestedState({
      name: 'assistente',
      url: '/assistente',
      templateUrl: 'views/main.html',
      children: [assistente]
    });

    // SITE ROUTE
    stateHelperProvider.setNestedState({
      name: 'index',
      url: '/index',
      controller: 'indexController',
      controllerAs: 'vm',
      templateUrl: 'views/site.html'
    });

    stateHelperProvider.setNestedState({
      name: 'painel',
      url: '/painel',
      templateUrl: 'views/main.html'
    });
  }
})();
