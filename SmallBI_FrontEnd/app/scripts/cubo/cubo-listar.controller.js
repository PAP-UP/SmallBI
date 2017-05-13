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

    var obj = {
      'idCliente' : cookie.idCliente
    };


    function init() {
      cuboResource.listaCubo(obj).then(
        function (result) {
        vm.listaCubos = result.data;
      }, function (error) {

        });
    }

    function analisarCubo(id) {
      var obj = {
        'idCubo' : id
      }
        cuboResource.analisarCubo(obj).then(
          function (result) {

        }, function (resolve) {

          })
    }

    init();

  }
})();



