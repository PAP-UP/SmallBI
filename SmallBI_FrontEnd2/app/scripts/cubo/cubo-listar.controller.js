(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('cuboListarController', cuboListarController);

  function cuboListarController(cuboResource) {

    var vm = this;

    function init() {
      cuboResource.listaCubo().then(function (result) {
        vm.listaCubos = result.data;
      });
    }

    init();

  }
})();



