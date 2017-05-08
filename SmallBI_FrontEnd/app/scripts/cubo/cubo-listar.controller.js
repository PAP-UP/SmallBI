(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('cuboListarController', cuboListarController);

  function cuboListarController(cuboResource, $cookieStore) {

    var vm = this;

    angular.extend(vm, {
      analisarCubo: analisarCubo
    });

    var cookie = $cookieStore.get('cookie');

    function init() {
      cuboResource.listaCubo(cookie.idCliente).then(
        function (result) {
        vm.listaCubos = result.data;
      }, function (error) {
          console.log(error);
        });
    }

    function analisarCubo(id) {
        cuboResource.analisarCubo(id).then(
          function (result) {

        }, function (resolve) {

          })
    }

    init();

  }
})();



