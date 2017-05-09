(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('funcaoCadastrarController', funcaoCadastrarController);

  function funcaoCadastrarController(funcaoResource, $state) {

    var vm = this;

    vm.dadosFuncao = {};

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      funcaoSalvar: funcaoSalvar,
    });


    function funcaoSalvar() {
      vm.dadosFuncao.usuarioId = cookie.idPerfil;

      funcaoResource.insereFuncao(vm.dadosFuncao).then(function (result) {
        $state.transitionTo('funcao.listar');
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }

    function activate() {

    }

    activate();
  }
})();
