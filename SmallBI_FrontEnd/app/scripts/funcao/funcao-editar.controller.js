(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('funcaoEditarController', funcaoEditarController);

  function funcaoEditarController(funcaoResource, $stateParams, $state, $cookieStore, SweetAlert) {

    var vm = this;

    vm.id = $stateParams.id;

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      funcaoSalvar: funcaoSalvar
    });

    function getFuncao() {
      funcaoResource.getFuncaoById(vm.id).then(
        function (result) {
          vm.dadosFuncao = result.data;
        }, function (resolve) {

        });
    }

    function funcaoSalvar() {
      vm.dadosFuncao.usuarioId = cookie.idPerfil;
      funcaoResource.alteraFuncao(vm.dadosFuncao).then(
        function (result) {
          SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('funcao.listar');
      },function (resolve) {
          SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }


    function activate() {
      getFuncao();
    }

    activate();
  }
})();
