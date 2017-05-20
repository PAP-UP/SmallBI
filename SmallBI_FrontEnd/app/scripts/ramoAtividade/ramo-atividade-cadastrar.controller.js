(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('ramoCadastrarController', ramoCadastrarController);

  function ramoCadastrarController(ramoResource, $state, $cookieStore, SweetAlert) {

    var vm = this;

    vm.dadosRamo = {};

    var cookie = $cookieStore.get('cookie');

    angular.extend(vm, {
      ramoSalvar: ramoSalvar,
    });


    function ramoSalvar() {
      vm.dadosRamo.usuarioId = cookie.idPerfil;
      ramoResource.insereRamo(vm.dadosRamo).then(function (result) {
        SweetAlert.swal({title: result.data, timer: 2000, type: "success", showConfirmButton: false});
        $state.transitionTo('ramo-atividade.listar');
      },function (resolve) {
        SweetAlert.swal({title: resolve.data, timer: 2000, type: "error", showConfirmButton: false});
      });
    }

    function activate() {

    }

    activate();
  }
})();
