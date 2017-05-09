(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('planoCadastrarController', planoCadastrarController);

  function planoCadastrarController(planoResource, $state) {

    var vm = this;

    vm.dadosPlano = {};

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      planoSalvar: planoSalvar,
    });


    function planoSalvar() {
      vm.dadosPlano.usuarioId = cookie.idPerfil;

      planoResource.inserePlano(vm.dadosPlano).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('plano.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }

    function activate() {

    }

    activate();
  }
})();
