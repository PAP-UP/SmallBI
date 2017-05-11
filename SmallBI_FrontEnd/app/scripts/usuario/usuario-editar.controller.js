(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('usuarioEditarController', usuarioEditarController);

  function usuarioEditarController(usuarioResource, $stateParams, funcaoResource, $cookieStore, SweetAlert) {

    var vm = this;

    vm.id = $stateParams.id;

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      usuarioSalvar: usuarioSalvar
    });

    function getUser() {
      usuarioResource.getUserById(vm.id).then(
        function (result) {
            vm.dadosUsuario = result.data;
      }, function (resolve) {

      });
    }

    function listarFuncao() {
      funcaoResource.listaFuncoes().then(
        function (result) {
          vm.dadosFuncao = result.data;
        });
    }

    function usuarioSalvar() {
      vm.dadosUsuario.usuarioId = cookie.idPerfil,
        vm.dadosUsuario.idCliente = 1,
        vm.dadosUsuario.idPerfil = 1

      usuarioResource.insereUsuario(vm.dadosUsuario).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('usuario.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }


    function activate() {
      getUser();
      listarFuncao();
    }

    activate();
  }
})();



