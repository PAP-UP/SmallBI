(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioCadastrarController', usuarioCadastrarController);

  function usuarioCadastrarController(usuarioResource, funcaoResource, $state, $cookieStore, SweetAlert) {

    var vm = this;

    vm.dadosUsuario = {};

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      usuarioSalvar: usuarioSalvar,
      listarFuncao: listarFuncao
    });


    function usuarioSalvar() {
      vm.dadosUsuario.usuarioId = cookie.idUsuario;
        vm.dadosUsuario.idCliente = cookie.idCliente;
        vm.dadosUsuario.idPerfil = cookie.idPerfil;

      usuarioResource.insereUsuario(vm.dadosUsuario).then(
        function (result) {
        SweetAlert.swal({title: result.data.message, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('usuario.listar');
      },function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }

    function listarFuncao() {
      funcaoResource.listaFuncoes().then(
        function (result) {
          vm.dadosFuncao = result.data;
        });
    }

    function init() {
      listarFuncao();
    }

    init();
  }
})();
